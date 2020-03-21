# symptoms.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?symptom ?symptomLabel WHERE {
  wd:Q84263196 wdt:P780 ?symptom .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fsymptom%20%3FsymptomLabel%20WHERE%20%7B%0A%20%20wd%3AQ84263196%20wdt%3AP780%20%3Fsymptom%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fsymptom%20%3FsymptomLabel%20WHERE%20%7B%0A%20%20wd%3AQ84263196%20wdt%3AP780%20%3Fsymptom%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>symptom</b></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86">headache</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q5445">anemia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q9690">fatigue</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q35805">cough</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q38933">fever</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q40878">diarrhea</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q114085">rhinitis</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q188008">dyspnea</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q344873">adult respiratory distress syndrome</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q474959">myalgia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q485831">lymphopenia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q647099">hemoptysis</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q767485">respiratory failure</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q1076369">cytokine storm</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q3508755">influenza like illness</a></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o symptoms.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/symptoms.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@symptoms.rq
```
This SPARQL query is available under CCZero.
