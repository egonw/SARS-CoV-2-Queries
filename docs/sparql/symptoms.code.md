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
    <td><b>symptomLabel</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86</td>
    <td>headache</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q5445</td>
    <td>anemia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q9690</td>
    <td>fatigue</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q35805</td>
    <td>cough</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q38933</td>
    <td>fever</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q40878</td>
    <td>diarrhea</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q114085</td>
    <td>rhinitis</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q188008</td>
    <td>dyspnea</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q344873</td>
    <td>adult respiratory distress syndrome</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q474959</td>
    <td>myalgia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q485831</td>
    <td>lymphopenia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q647099</td>
    <td>hemoptysis</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q767485</td>
    <td>respiratory failure</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q1076369</td>
    <td>cytokine storm</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q3508755</td>
    <td>influenza like illness</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o symptoms.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/symptoms.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@symptoms.rq
```
