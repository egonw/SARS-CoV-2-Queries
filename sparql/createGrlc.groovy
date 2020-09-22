// Copyright (c) 2020  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

@Grab(group='io.github.egonw.bacting', module='managers-rdf', version='0.0.10')
@Grab(group='io.github.egonw.bacting', module='managers-ui', version='0.0.10')

bioclipse = new net.bioclipse.managers.BioclipseManager(".");

inFile = args[0];
langs  = args[1];

sparql = new File(inFile).text
if (sparql.contains("\"<lang/>,en\""))
  sparql = sparql.replace("\"<lang/>,en\"", "?_lang")

println """#+ endpoint: https://query.wikidata.org/bigdata/namespace/wdq/sparql
#+ endpoint_in_url: False
#+ enumerate:
#+   - lang:"""

for (lang in langs.split(" ")) {
  println "#+     - ${lang},en"
}

println """
PREFIX wd: <http://www.wikidata.org/entity/>
PREFIX wdt: <http://www.wikidata.org/prop/direct/>
PREFIX wikibase: <http://wikiba.se/ontology#>
PREFIX p: <http://www.wikidata.org/prop/>
PREFIX bd: <http://www.bigdata.com/rdf#>
PREFIX ps: <http://www.wikidata.org/prop/statement/>
PREFIX pq: <http://www.wikidata.org/prop/qualifier/>
"""

println sparql
