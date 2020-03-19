# virusProteinsPDB.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?protein ?proteinLabel ?pdb WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  ?protein wdt:P703 ?virus ; wdt:P279 wd:Q952587 .
  ?protein wdt:P638 ?pdb .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20%3Fpdb%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP279%20wd%3AQ952587%20.%0A%20%20%3Fprotein%20wdt%3AP638%20%3Fpdb%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20%3Fpdb%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP279%20wd%3AQ952587%20.%0A%20%20%3Fprotein%20wdt%3AP638%20%3Fpdb%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>virusLabel</b></td>
    <td><b>protein</b></td>
    <td><b>proteinLabel</b></td>
    <td><b>pdb</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917572</td>
    <td>NSP10 from SARS CoV-2</td>
    <td>6W4H</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917579</td>
    <td>NSP15 Endoribonuclease from SARS CoV-2</td>
    <td>6VWW</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917579</td>
    <td>NSP15 Endoribonuclease from SARS CoV-2</td>
    <td>6W01</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917580</td>
    <td>NSP16 from SARS CoV-2</td>
    <td>6W4H</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917581</td>
    <td>NSP3 from SARS CoV-2</td>
    <td>6VXS</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917581</td>
    <td>NSP3 from SARS CoV-2</td>
    <td>6W02</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o virusProteinsPDB.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/virusProteinsPDB.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@virusProteinsPDB.rq
```
