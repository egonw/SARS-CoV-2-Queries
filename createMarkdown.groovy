// Copyright (c) 2018-2019  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

input = args[0]

bibliography = new HashMap<String,String>();
def bibLines = new File("references.dat").readLines()
bibLines.each { String line ->
  splitString = '=1. '; fields = []
  fields[0] = line.substring(0,line.indexOf(splitString))
  fields[1] = line.substring(line.indexOf(splitString)+splitString.length())
  bibliography.put(fields[0], fields[1])
}

chapterCounters = new HashMap<String,String>();
chapterCounter = 0
appendixCounter = 0
def chapterLines = new File("order.txt").readLines()
chapterLines.each { String line ->
  if (line.startsWith("app")) {
    appendixCounter++
    chapterCounters.put(line, (char)(64+appendixCounter))
  } else {
    chapterCounter++
    chapterCounters.put(line, "" + chapterCounter)
  }
}

sectionChapters = new HashMap<String,String>();
sectionNumbers = new HashMap<String,String>();
def secdataLines = new File("sections.txt").readLines()
secdataLines.each { String line ->
  data = line.split("\t")
  label = data[0]
  chapter = data[1]
  number = data[2]
  sectionChapters.put(data[0], data[1])
  sectionNumbers.put(data[0], data[2])
}

references = new HashMap<String,String>();
bibList = "";
refCounter = 0;
topicCounter = 0;

context = input.substring(0, input.indexOf("."))
currentChapterCounter = chapterCounters.get(context)

lines = new File(input).readLines()
lines.each { String line ->
  if (line.startsWith("<sparql>")) {
    def instruction = new XmlSlurper().parseText(line)
    def srcLines = new File("sparql/${instruction.text()}.verbatim.md").readLines()
    srcLines.each { String srcLine -> println srcLine }
  } else if (line.startsWith("<out>")) {
    def instruction = new XmlSlurper().parseText(line)
    def srcLines = new File("sparql/${instruction.text()}.out").readLines()
    srcLines.each { String srcLine -> println srcLine }
  } else if (line.startsWith("<iframe>")) {
    def instruction = new XmlSlurper().parseText(line)
    def srcLines = new File("sparql/${instruction.text()}.iframe.md").readLines()
    srcLines.each { String srcLine -> println srcLine }
  } else if (line.startsWith("<section")) {
    def instruction = new XmlSlurper().parseText(line)
    println "<a name=\"sec:${instruction.@label}\"></a>"
    println "${instruction.@level} ${instruction.text()}"
  } else if (line.startsWith("<toc>")) {
    def instruction = new XmlSlurper().parseText(line)
    def srcLines = new File("${instruction.text()}").readLines()
    srcLines.each { String srcLine -> println srcLine.replaceAll(".i.md", ".md") }
  } else if (line.contains("<references/>")) {
    println bibList
  } else {
    while (line.contains(".i.md")) {
      line = line.replace(".i.md", ".md")
    }
    while (line.contains("<cite>")) {
      citeStart = line.indexOf("<cite>")
      citeEnd = line.indexOf("</cite>")
      cites = line.substring(citeStart+6, citeEnd)
      if (cites.isEmpty()) cites = "?"
      replacement = ""
      if (!references.containsKey(cites)) {
        refCounter++
        references.put(cites, "" + refCounter)
        bibList += "${refCounter}. <a name=\"citeref${refCounter}\"></a>"
        if (bibliography.get(cites) != null) {
          bibList += bibliography.get(cites) + "\n"
        } else {
          bibList += "Missing\n"
        }
        replacement = "<a href=\"#citeref${refCounter}\">${refCounter}</a>"
      } else {
        existingCounter = Integer.valueOf(references.get(cites))
        replacement = "<a href=\"#citeref${existingCounter}\">${existingCounter}</a>"
      }
      line = line.substring(0, citeStart) + replacement + line.substring(citeEnd+7)
    }
    while (line.contains("<topic")) {
      topicCounter++
      topicStart = line.indexOf("<topic")
      topicEnd = line.indexOf("</topic>")
      topicsXML = line.substring(topicStart, topicEnd+8)
      def topicsInstruction = new XmlSlurper().parseText(topicsXML)
      replacement = topicsInstruction.text()
      replacement = "<a name=\"tp${topicCounter}\">" + replacement + "</a>"
      line = line.substring(0, topicStart) + replacement + line.substring(topicEnd+8)
    }
    while (line.contains("<xref")) {
      xrefStart = line.indexOf("<xref")
      xrefEnd = line.indexOf("</xref>")
      xrefXML = line.substring(xrefStart, xrefEnd+7)
      def xrefInstruction = new XmlSlurper().parseText(xrefXML)
      xrefname = xrefInstruction.text()
      if (sectionChapters.containsKey(xrefname)) {
        doc = ""
        if (sectionChapters.get(xrefname) != context) doc = sectionChapters.get(xrefname) + ".md"
        replacement = "[${sectionNumbers.get(xrefname)}](${doc}#sec:${xrefname})"
      } else {
        replacement = "??"
      }
      line = line.substring(0, xrefStart) + replacement + line.substring(xrefEnd+7)
    }
    println line
  }
}
