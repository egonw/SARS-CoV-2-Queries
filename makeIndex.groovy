// Copyright (c) 2019  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

// use the output of findTopics.groovy to create a Markdown index

println "# Index\n\n";

def lines = new File("topics.tsv").readLines()
prevTopic = ""
lines.each { String line ->
  data = line.split("\t")
  topic = data[0]
  where = data[1]
  ref = data[2]
  if (prevTopic == topic) {
    print " [$where](${where}.i.md#$ref)"
  } else {
    if (prevTopic != "") println "<br />"
    print "$topic [$where](${where}.i.md#$ref)"
  }
  prevTopic = topic
}

