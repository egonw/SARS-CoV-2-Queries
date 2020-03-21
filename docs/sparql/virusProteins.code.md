# virusProteins.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?gene ?geneLabel  WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  ?gene wdt:P703 ?virus ; wdt:P31 wd:Q84467700 .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}

```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ84467700%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ84467700%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>gene</b></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td><a href="http://www.wikidata.org/entity/Q87917580">2'-O-methyltransferase</a></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o virusProteins.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/virusProteins.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@virusProteins.rq
```
This SPARQL query is available under CCZero.
