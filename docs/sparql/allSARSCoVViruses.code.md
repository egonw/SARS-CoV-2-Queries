# allSARSCoVViruses.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel  WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>virusLabel</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q34967815</td>
    <td>SARS coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q85438966</td>
    <td>severe acute respiratory syndrome coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q85939995</td>
    <td>SL-CoV</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16000326</td>
    <td>SL-CoV-WIV1</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o allSARSCoVViruses.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/allSARSCoVViruses.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@allSARSCoVViruses.rq
```
This SPARQL query is available under CCZero.
