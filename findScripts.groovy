// Copyright (c) 2011-2019  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

// find all references to scripts
//
// it takes one optional argument, which is appended to the output

if (args.length == 0) {
  println "groovy findScripts.groovy <directory> [suffix]"
  System.exit(0)
}

def folder = args[0]

def suffix = ""
if (args.length == 2) suffix = args[1]

def basedir = new File(folder)
files = basedir.listFiles().grep(~/.*i.md$/)
files.each { file ->
  file.eachLine { line ->
    try {
      if (line.contains("<sparql>")) {
        start = line.indexOf("<sparql>")
        end = line.indexOf("</sparql>")
        text = line.substring(start + 8, end)
        println "" + text + suffix
      } else if (line.contains("<out>")) {
        start = line.indexOf("<out>")
        end = line.indexOf("</out>")
        text = line.substring(start + 5, end)
        println "" + text + suffix
      }
    } catch (Exception exception) {
      println "Error reading line: " + line
      System.exit(-1)
    }
  }
}

