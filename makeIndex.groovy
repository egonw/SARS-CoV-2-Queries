// Copyright (c) 2019-2020  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

// use the output of findTopics.groovy to create a Markdown index

lang = args[0]

println "# Index\n\n";

def lines = new File("topics.${lang}.tsv").readLines()
prevTopic = ""
lines.each { String line ->
  data = line.split("\t")
  topic = data[0]
  where = data[1]
  ref = data[2]
  if (prevTopic == topic) {
    print " [$where](${where}.md#$ref)"
  } else {
    if (prevTopic != "") println "<br />"
    print "$topic [$where](${where}.md#$ref)"
  }
  prevTopic = topic
}

