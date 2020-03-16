# earthAllCases.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?data ?numberOfCases  WHERE {
  wd:Q81068910 wdt:P1603 ?numberOfCases .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
[Execute](https://query.wikidata.org/embed.html#SELECT+%3Fdata+%3FnumberOfCases++WHERE+%7B%0A++wd%3AQ81068910+wdt%3AP1603+%3FnumberOfCases+.%0A++SERVICE+wikibase%3Alabel+%7B+bd%3AserviceParam+wikibase%3Alanguage+%22%5BAUTO_LANGUAGE%5D%2Cen%22.+%7D%0A%7D%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fdata%20%3FnumberOfCases%20%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20wdt%3AP1603%20%3FnumberOfCases%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>data</b></td>
    <td><b>numberOfCases</b></td>
  </tr>
  <tr>
    <td></td>
    <td>153517</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o earthAllCases.rq https://raw.githubusercontent.com/jcheminform/useful-queries/master/sparql/earthAllCases.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@earthAllCases.rq
```
