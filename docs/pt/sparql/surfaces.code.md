# surfaces.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?work ?workLabel WITH {
  SELECT ?virus ?work WHERE {
    VALUES ?virus {
      wd:Q82069695 # SARS-CoV-2
      wd:Q16983360 # HKU1
      wd:Q16991954 # OC43
      wd:Q8351095  # NL63 
      wd:Q16983356 # 229E 
      wd:Q4902157  # MERS-CoV
      wd:Q278567   # SARS-CoV
    }
    ?work wdt:P921 ?virus ;
          wdt:P921 wd:Q484298 .
  }
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
}
ORDER BY ?virusLabel ?workLabel
```
[run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ484298%20.%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3FworkLabel%0A) or [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ484298%20.%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3FworkLabel%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>work</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Coronavírus humano 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97093636">Exaggerated risk of transmission of COVID-19 by fomites</a> (<a href="http://www.wikidata.org/entity/Q97093636">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Coronavírus humano 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36318974">Human Coronavirus 229E Remains Infectious on Common Touch Surface Materials.</a> (<a href="http://www.wikidata.org/entity/Q36318974">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Coronavírus humano 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40047078">Isolation and identification of human coronavirus 229E from frequently touched environmental surfaces of a university classroom that is cleaned daily.</a> (<a href="http://www.wikidata.org/entity/Q40047078">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Coronavírus humano 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q73053612">Survival of human coronaviruses 229E and OC43 in suspension and after drying on surfaces: a possible source of hospital-acquired infections</a> (<a href="http://www.wikidata.org/entity/Q73053612">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Coronavírus humano OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97093636">Exaggerated risk of transmission of COVID-19 by fomites</a> (<a href="http://www.wikidata.org/entity/Q97093636">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Coronavírus humano OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q73053612">Survival of human coronaviruses 229E and OC43 in suspension and after drying on surfaces: a possible source of hospital-acquired infections</a> (<a href="http://www.wikidata.org/entity/Q73053612">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40467409">Middle East respiratory syndrome coronavirus on inanimate surfaces: A risk for health care transmission.</a> (<a href="http://www.wikidata.org/entity/Q40467409">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87943251">Aerosol and Surface Stability of SARS-CoV-2 as Compared with SARS-CoV-1</a> (<a href="http://www.wikidata.org/entity/Q87943251">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87669932">Aerosol and surface stability of HCoV-19 (SARS-CoV-2) compared to SARS-CoV-1</a> (<a href="http://www.wikidata.org/entity/Q87669932">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97093636">Exaggerated risk of transmission of COVID-19 by fomites</a> (<a href="http://www.wikidata.org/entity/Q97093636">edit</a>)</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/surfaces.rq | sed 's+<lang/>+pt+' > surfaces.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@surfaces.rq
```
This SPARQL query is available under CCZero.
