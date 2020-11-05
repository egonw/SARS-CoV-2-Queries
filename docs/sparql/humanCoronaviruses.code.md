# humanCoronaviruses.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?ncbi WHERE {
  VALUES ?virus {
    wd:Q82069695 # SARS-CoV-2
    wd:Q16983360 # HKU1
    wd:Q16991954 # OC43
    wd:Q8351095  # NL63 
    wd:Q16983356 # 229E
    wd:Q4902157  # MERS-CoV
    wd:Q278567   # SARS-CoV
  }
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
}
```
[run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%0A) or [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694009">694009</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/227859">227859</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1335626">1335626</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/277944">277944</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/11137">11137</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/290028">290028</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/31631">31631</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2697049">2697049</a></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/humanCoronaviruses.rq | sed 's+<lang/>+en+' > humanCoronaviruses.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@humanCoronaviruses.rq
```
This SPARQL query is available under CCZero.
