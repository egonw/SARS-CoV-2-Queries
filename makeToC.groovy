// Copyright (c) 2019-2020  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

// find all topics and makes a data file to be converted into an Index
//
// it takes one optional argument, which is appended to the output

def chapterCounter = 0

lang = args[0]

langFolder = ""
if (lang != "en") langFolder = "${lang}/"

refSectionLabels = [
  "en": "References",
  "es": "Referencias",
  "nl": "Bronnen",
  "ja": "References",
  "pt": "Referências"
]

chapters = "order.txt"
new File(chapters).eachLine { chapter ->
  if (chapter.startsWith("app")) return;
  chapterCounter++
  file = "src/${langFolder}/${chapter}.md"
  if (!new File(file).exists()) return;
  sectionCounter = 0
  subsectionCounter = 0
  new File(file).eachLine { line ->
    if (line.startsWith("# ")) {
      chapterTitle = line.substring(2).trim()
      println "${chapterCounter}. [${chapterTitle}](${chapter}.md) <br />"
    } else if (line.startsWith("## ") && !line.contains(refSectionLabels[lang])) {
      subsectionCounter = 0
      sectionTitle = line.substring(3).trim()
      sectionCounter++
      sectionHref = sectionTitle.toLowerCase().replaceAll(" ", "-").replaceAll("\\.", "")
      println "${chapterCounter}.${sectionCounter}. [${sectionTitle}](${chapter}.i.md#${sectionHref}) <br />"
    } else if (line.startsWith("### ")) {
      subsectionCounter++
      sectionTitle = line.substring(4).trim()
      sectionHref = sectionTitle.toLowerCase().replaceAll(" ", "-").replaceAll("\\.", "")
      println "${chapterCounter}.${sectionCounter}.${subsectionCounter}. [${sectionTitle}](${chapter}.i.md#${sectionHref}) <br />"
    } else if (line.startsWith("<section")) {
      def instruction = new XmlSlurper().parseText(line)
      if (instruction.@level == "##") {
        subsectionCounter = 0
        sectionTitle = instruction.text()
        sectionCounter++
        sectionHref = sectionTitle.toLowerCase().replaceAll(" ", "-").replaceAll("\\.", "")
        println "${chapterCounter}.${sectionCounter}. [${sectionTitle}](${chapter}.i.md#${sectionHref}) <br />"
      } else if (instruction.@level == "###") {
        subsectionCounter++
        sectionTitle = instruction.text()
        sectionHref = sectionTitle.toLowerCase().replaceAll(" ", "-").replaceAll("\\.", "")
        println "${chapterCounter}.${sectionCounter}.${subsectionCounter}. [${sectionTitle}](${chapter}.i.md#${sectionHref}) <br />"
      } else if (instruction.@level == "#") {
        sectionTitle = instruction.text()
        sectionHref = sectionTitle.toLowerCase().replaceAll(" ", "-").replaceAll("\\.", "")
        println "${chapterCounter}. [${sectionTitle}](${chapter}.md) <br />"
      }
    }
  }  
}

