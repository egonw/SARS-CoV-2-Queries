// Copyright (c) 2019  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

// find all topics and makes a data file to be converted into an Index
//
// it takes one optional argument, which is appended to the output

if (args.length == 0) {
  println "groovy findTopics.groovy <directory>"
  System.exit(0)
}

def folder = args[0]

def topicCounter = 0

def basedir = new File(folder)
files = basedir.listFiles().grep(~/.*i.md$/)
files.each { file ->
  topicCounter = 0
  context = file.name.substring(0, file.name.indexOf("."))
  file.eachLine { line ->
    while (line.contains("<topic")) {
      topicStart = line.indexOf("<topic")
      topicEnd = line.indexOf("</topic>")
      topicsXML = line.substring(topicStart, topicEnd+8)
      def topicsInstruction = new XmlSlurper().parseText(topicsXML)
      topics = topicsInstruction.text()
      if (!topics.isEmpty()) {
        topicCounter++
        println "${topics}\t${context}\ttp${topicCounter}"
      }
      line = line.substring(0, topicStart) + line.substring(topicEnd+7)
    }
  }
}

