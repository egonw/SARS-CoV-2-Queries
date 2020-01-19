// Copyright (c) 2019  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

// find all topics and makes a data file to be converted into an Index
//
// it takes one optional argument, which is appended to the output

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

figureCounter = 0;

chapters = "order.txt"
new File(chapters).eachLine { chapter ->
  chapterCounter++
  currentChapterCounter = chapterCounters.get(chapter)
  file = "${chapter}.i.md"
  sectionCounter = 0
  subsectionCounter = 0
  lines = new File(file).readLines()
  figureInstructionText = ""
  inFigure = false
  lines.each { String line ->
    if (line.startsWith("## ") && !line.contains("References")) {
      subsectionCounter = 0
      sectionCounter++
    } else if (line.startsWith("### ")) {
      subsectionCounter++
    } else if (line.startsWith("<section")) {
      def instruction = new XmlSlurper().parseText(line)
      if (instruction.@level == "##") {
        subsectionCounter = 0
        sectionCounter++
      } else if (instruction.@level == "###") {
        subsectionCounter++
      }
      secNumber = "${currentChapterCounter}"
      if (sectionCounter > 0) {
        secNumber += ".${sectionCounter}"
        if (subsectionCounter > 0) {
          secNumber += ".${subsectionCounter}"
        }
      }
      println "${instruction.@label}\t${chapter}\t${secNumber}"
    }
  }
}
