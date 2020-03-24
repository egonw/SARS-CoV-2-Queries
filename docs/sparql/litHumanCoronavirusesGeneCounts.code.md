# litHumanCoronavirusesGeneCounts.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?gene ?geneLabel ?count WITH {
  SELECT ?virus ?gene (COUNT(DISTINCT ?work) AS ?count) WHERE {
    VALUES ?virus {
      wd:Q82069695 # SARS-CoV-2
      wd:Q16983360 # HKU1
      wd:Q16991954 # OC43
      wd:Q8351095  # NL63 
      wd:Q16983356 # 229E 
      wd:Q4902157  # MERS-CoV
      wd:Q85438966 # SARS-CoV
    }
    ?gene wdt:P703 ?virus ; wdt:P31 wd:Q7187 .
    ?work wdt:P921 ?gene .
  } GROUP BY ?virus ?gene
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,da,de,es,fr,jp,nl,no,ru,sv,zh". }
}
ORDER BY DESC(?count)
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%3Fcount%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fgene%20%28COUNT%28DISTINCT%20%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ85438966%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fgene%20.%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%20%3Fgene%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fcount%29%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%3Fcount%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fgene%20%28COUNT%28DISTINCT%20%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ85438966%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fgene%20.%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%20%3Fgene%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fcount%29%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>gene</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88176272">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88176272">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88176265">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q88176265">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88176260">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88176260">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88176256">protein 3</a> (<a href="http://www.wikidata.org/entity/Q88176256">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88176251">spike protein</a> (<a href="http://www.wikidata.org/entity/Q88176251">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88176280">replicase polyprotein 1ab</a> (<a href="http://www.wikidata.org/entity/Q88176280">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089689">nucleocapsid phosphoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089689">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089048">membrane glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089048">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088888">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88088888">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088053">orf1a polyprotein;orf1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88000922">S surface glycoprotein of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td>1</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o litHumanCoronavirusesGeneCounts.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litHumanCoronavirusesGeneCounts.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litHumanCoronavirusesGeneCounts.rq
```
This SPARQL query is available under CCZero.
