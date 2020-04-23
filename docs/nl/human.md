# De mens

## Gen en eiwit interacties

Om de biologische processen van het virusdeeltje te begrijpen,
is het nodig te weten welke menselijke genen en eiwitten er bij
betrokken zijn. In het volgende onderdeel gaan we verder op de
biologische processions in, maar we kunnen eerst kijken naar
de literatuur hier over te zeggen heeft (er is maar beperkte
onderwerpannotatie):

**SPARQL** [sparql/humanInteractionCounts.rq](sparql/humanInteractionCounts.code.html) ([uitvoeren](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%3Fcount%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fgene%20%28COUNT%28DISTINCT%20%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%2C%20%3Fgene%20.%0A%20%20%20%20%3Fgene%20wdt%3AP703%20wd%3AQ15978631%20.%0A%20%20%20%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ7187%20%7D%20UNION%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ8054%20%7D%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%20%3Fgene%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fcount%29%0A), [bewerken](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%3Fcount%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fgene%20%28COUNT%28DISTINCT%20%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%2C%20%3Fgene%20.%0A%20%20%20%20%3Fgene%20wdt%3AP703%20wd%3AQ15978631%20.%0A%20%20%20%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ7187%20%7D%20UNION%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ8054%20%7D%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%20%3Fgene%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fcount%29%0A))

```sparql
SELECT ?virus ?virusLabel ?gene ?geneLabel ?count WITH {
  SELECT ?virus ?gene (COUNT(DISTINCT ?work) AS ?count) WHERE {
    ?virus wdt:P171+ wd:Q57751738 .
    ?work wdt:P921 ?virus, ?gene .
    ?gene wdt:P703 wd:Q15978631 .
    { ?gene wdt:P31 wd:Q7187 } UNION { ?gene wdt:P31 wd:Q8054 }
  } GROUP BY ?virus ?gene
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  SERVICE wikibase:label { bd:serviceParam wikibase:language "nl,en". }
}
ORDER BY DESC(?count)
```

Dit geeft de volgende aantallen artikelen:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>gene</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21126599">Transmembraan serine protease 2</a> (<a href="http://www.wikidata.org/entity/Q21126599">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q412214">Dipeptidyl peptidase 4</a> (<a href="http://www.wikidata.org/entity/Q412214">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18032037">Tumornecrosefactor α</a> (<a href="http://www.wikidata.org/entity/Q18032037">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18032037">Tumornecrosefactor α</a> (<a href="http://www.wikidata.org/entity/Q18032037">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21126599">Transmembraan serine protease 2</a> (<a href="http://www.wikidata.org/entity/Q21126599">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18032025">TMPRSS2</a> (<a href="http://www.wikidata.org/entity/Q18032025">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21173608">Peptidylprolyl isomerase A</a> (<a href="http://www.wikidata.org/entity/Q21173608">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21126599">Transmembraan serine protease 2</a> (<a href="http://www.wikidata.org/entity/Q21126599">edit</a>)</td>
    <td>1</td>
  </tr>
</table>

Om te zien om welke artikelen het nu eigenlijk gaat, kunnen
we deze zoekopdracht gebruiken:

**SPARQL** [sparql/humanInteractions.rq](sparql/humanInteractions.code.html) ([uitvoeren](https://query.wikidata.org/embed.html#SELECT%20%3Fdate%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WITH%20%7B%0A%20%20SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fvirus%20%3Fgene%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%2C%20%3Fgene%20.%20%20%0A%20%20%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20%20%20%3Fgene%20wdt%3AP703%20wd%3AQ15978631%20.%20%20%20%0A%20%20%20%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ7187%20%7D%20UNION%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ8054%20%7D%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%20%3Fgene%20%3Fwork%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fdate%29%20%3Fdoi%0A), [bewerken](https://query.wikidata.org/#SELECT%20%3Fdate%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WITH%20%7B%0A%20%20SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fvirus%20%3Fgene%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%2C%20%3Fgene%20.%20%20%0A%20%20%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20%20%20%3Fgene%20wdt%3AP703%20wd%3AQ15978631%20.%20%20%20%0A%20%20%20%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ7187%20%7D%20UNION%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ8054%20%7D%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%20%3Fgene%20%3Fwork%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fdate%29%20%3Fdoi%0A))

```sparql
SELECT ?date ?virus ?virusLabel ?gene ?geneLabel ?work ?workLabel ?doi WITH {
  SELECT (MAX(?dates) as ?date) ?virus ?gene ?work WHERE {
    ?virus wdt:P171+ wd:Q57751738 .
    ?work wdt:P921 ?virus, ?gene .  
    OPTIONAL { ?work wdt:P577 ?dates . }
    ?gene wdt:P703 wd:Q15978631 .   
    { ?gene wdt:P31 wd:Q7187 } UNION { ?gene wdt:P31 wd:Q8054 }
  } GROUP BY ?virus ?gene ?work
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "nl,en". }
}
ORDER BY DESC(?date) ?doi
```

## Biologische processen

[WikiPathways](https://wikipathways.org/) [<a href="#citeref1">1</a>]
is een van de projecten dat betrokken is bij het internationale
[#covidpathways COVID-19 curatie project](https://covid.pages.uni.lu/map_curation)
en haar bijdragen kunnen gevonden worden
op [deze portal](http://covid.wikipathways.org/).

[Reactome](http://reactome.org/) [<a href="#citeref2">2</a>] en WikiPathways
reactiepaden worden geïndexeerd in Wikidata en we kunnen de reactiepaden
waar HCoV genen en eiwitten genoemd worden opzoeken:

**SPARQL** [sparql/pathways.rq](sparql/pathways.code.html) ([uitvoeren](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fthing%20%3FthingLabel%20%3Fpathway%20%3FpathwayLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fthing%20wdt%3AP703%20%3Fvirus%20.%0A%20%20%3Fpathway%20wdt%3AP31%20wd%3AQ4915012%20%3B%20wdt%3AP527%20%3Fthing%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0A), [bewerken](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fthing%20%3FthingLabel%20%3Fpathway%20%3FpathwayLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fthing%20wdt%3AP703%20%3Fvirus%20.%0A%20%20%3Fpathway%20wdt%3AP31%20wd%3AQ4915012%20%3B%20wdt%3AP527%20%3Fthing%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?virus ?virusLabel ?thing ?thingLabel ?pathway ?pathwayLabel WHERE {
  VALUES ?virus {
    wd:Q82069695 # SARS-CoV-2
    wd:Q16983360 # HKU1
    wd:Q16991954 # OC43
    wd:Q8351095  # NL63 
    wd:Q16983356 # 229E
    wd:Q4902157  # MERS-CoV
    wd:Q278567   # SARS-CoV
  }
  ?thing wdt:P703 ?virus .
  ?pathway wdt:P31 wd:Q4915012 ; wdt:P527 ?thing .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "nl,en". }
}
```

Dit laat op dit moment de volgende reactiepaden zien, maar met de actieve
curatie is het te verwachten dat dit snel toeneemt:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>thing</b></td>
    <td><b>pathway</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175930">protein E</a> (<a href="http://www.wikidata.org/entity/Q88175930">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045272">Host-pathogen interaction of human corona viruses - ER stress</a> (<a href="http://www.wikidata.org/entity/Q89045272">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175930">protein E</a> (<a href="http://www.wikidata.org/entity/Q88175930">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175935">hypothetical protein sars6</a> (<a href="http://www.wikidata.org/entity/Q88175935">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175943">hypothetical protein sars9b</a> (<a href="http://www.wikidata.org/entity/Q88175943">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175952">hypothetical protein sars7a</a> (<a href="http://www.wikidata.org/entity/Q88175952">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175961">hypothetical protein sars3a</a> (<a href="http://www.wikidata.org/entity/Q88175961">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175965">matrix eiwit</a> (<a href="http://www.wikidata.org/entity/Q88175965">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175978">hypothetical protein sars3b</a> (<a href="http://www.wikidata.org/entity/Q88175978">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89210190">E2 glycoprotein precursor</a> (<a href="http://www.wikidata.org/entity/Q89210190">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89210195">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q89210195">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175935">hypothetical protein sars6</a> (<a href="http://www.wikidata.org/entity/Q88175935">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89269875">Host-pathogen interaction of human corona viruses - MAPK signaling</a> (<a href="http://www.wikidata.org/entity/Q89269875">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175952">hypothetical protein sars7a</a> (<a href="http://www.wikidata.org/entity/Q88175952">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89269875">Host-pathogen interaction of human corona viruses - MAPK signaling</a> (<a href="http://www.wikidata.org/entity/Q89269875">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175961">hypothetical protein sars3a</a> (<a href="http://www.wikidata.org/entity/Q88175961">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89269875">Host-pathogen interaction of human corona viruses - MAPK signaling</a> (<a href="http://www.wikidata.org/entity/Q89269875">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175978">hypothetical protein sars3b</a> (<a href="http://www.wikidata.org/entity/Q88175978">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89269875">Host-pathogen interaction of human corona viruses - MAPK signaling</a> (<a href="http://www.wikidata.org/entity/Q89269875">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89210190">E2 glycoprotein precursor</a> (<a href="http://www.wikidata.org/entity/Q89210190">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89269875">Host-pathogen interaction of human corona viruses - MAPK signaling</a> (<a href="http://www.wikidata.org/entity/Q89269875">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89210195">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q89210195">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89269875">Host-pathogen interaction of human corona viruses - MAPK signaling</a> (<a href="http://www.wikidata.org/entity/Q89269875">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175930">protein E</a> (<a href="http://www.wikidata.org/entity/Q88175930">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175935">hypothetical protein sars6</a> (<a href="http://www.wikidata.org/entity/Q88175935">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175943">hypothetical protein sars9b</a> (<a href="http://www.wikidata.org/entity/Q88175943">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175952">hypothetical protein sars7a</a> (<a href="http://www.wikidata.org/entity/Q88175952">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175961">hypothetical protein sars3a</a> (<a href="http://www.wikidata.org/entity/Q88175961">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175965">matrix eiwit</a> (<a href="http://www.wikidata.org/entity/Q88175965">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175978">hypothetical protein sars3b</a> (<a href="http://www.wikidata.org/entity/Q88175978">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89210195">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q89210195">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917572">Non-structural protein 10 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917579">non-structural protein 15 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917585">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088053">ORF1a polyprotein;ORF1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088595">ORF3a protein</a> (<a href="http://www.wikidata.org/entity/Q88088595">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088888">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88088888">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089048">membrane glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089048">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089203">ORF6 protein</a> (<a href="http://www.wikidata.org/entity/Q88089203">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089283">ORF7a</a> (<a href="http://www.wikidata.org/entity/Q88089283">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089438">ORF7b</a> (<a href="http://www.wikidata.org/entity/Q88089438">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089552">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q88089552">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089689">nucleocapsid phosphoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089689">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089847">ORF10</a> (<a href="http://www.wikidata.org/entity/Q88089847">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88200603">Viroporin 3a [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88200603">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88655710">envelope eiwit [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88655710">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88656821">membraan eiwit [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88656821">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88658500">Protein 7a [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88658500">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89006922">Non-structural protein 2 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89006922">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89225654">ORF8 eiwit</a> (<a href="http://www.wikidata.org/entity/Q89225654">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89226299">ORF6 protein</a> (<a href="http://www.wikidata.org/entity/Q89226299">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89227548">ORF10 protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89227548">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89686805">Non-structural protein 9 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89686805">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89792653">SARS-CoV-2 NSP9 complex</a> (<a href="http://www.wikidata.org/entity/Q89792653">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90012260">SARS-CoV-2 Spike - human ACE2 receptor complex</a> (<a href="http://www.wikidata.org/entity/Q90012260">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90012262">SARS-CoV-2 Spike protein complex</a> (<a href="http://www.wikidata.org/entity/Q90012262">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90012269">SARS-CoV-2 NSP10-NSP16 complex</a> (<a href="http://www.wikidata.org/entity/Q90012269">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90012272">SARS-CoV-2 NSP3-NSP4-NSP6 complex</a> (<a href="http://www.wikidata.org/entity/Q90012272">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 en COVID-19 pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088595">ORF3a protein</a> (<a href="http://www.wikidata.org/entity/Q88088595">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89269854">Activation of NLRP3 Inflammasome by SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q89269854">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917572">Non-structural protein 10 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90518826">Pathogenesis of SARS-CoV-2 Mediated by nsp9/nsp10 Complex</a> (<a href="http://www.wikidata.org/entity/Q90518826">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89686805">Non-structural protein 9 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89686805">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90518826">Pathogenesis of SARS-CoV-2 Mediated by nsp9/nsp10 Complex</a> (<a href="http://www.wikidata.org/entity/Q90518826">edit</a>)</td>
  </tr>
</table>

## Bronnen

1. <a name="citeref1"></a>Slenter DN, Slenter DN, Kutmon M, Hanspers K, Hanspers K, Riutta A, et al. WikiPathways: a multifaceted pathway database bridging metabolomics to other omics research. NAR. 2018 Jan 4;46(D1):D661–D667.  doi:[10.1093/NAR/GKX1064](https://doi.org/10.1093/NAR/GKX1064) ([Scholia](https://tools.wmflabs.org/scholia/doi/10.1093/NAR/GKX1064))
2. <a name="citeref2"></a>Croft D, Mundo AF, Haw R, Milacic M, Weiser J, Wu G, et al. The Reactome pathway knowledgebase. NAR. 2014 Jan;42(Database issue):D472-7.  doi:[10.1093/NAR/GKT1102](https://doi.org/10.1093/NAR/GKT1102) ([Scholia](https://tools.wmflabs.org/scholia/doi/10.1093/NAR/GKT1102))

