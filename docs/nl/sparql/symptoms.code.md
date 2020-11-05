# symptoms.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
SELECT ?symptom ?symptomLabel WHERE {
  wd:Q84263196 wdt:P780 ?symptom .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "nl,en". }
}
```
[uitvoeren](https://query.wikidata.org/embed.html#SELECT%20%3Fsymptom%20%3FsymptomLabel%20WHERE%20%7B%0A%20%20wd%3AQ84263196%20wdt%3AP780%20%3Fsymptom%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0A) of [bewerken](https://query.wikidata.org/#SELECT%20%3Fsymptom%20%3FsymptomLabel%20WHERE%20%7B%0A%20%20wd%3AQ84263196%20wdt%3AP780%20%3Fsymptom%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0A)


### Resultaten
<table>
  <tr>
    <td><b>symptom</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86">hoofdpijn</a> (<a href="http://www.wikidata.org/entity/Q86">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q5445">bloedarmoede</a> (<a href="http://www.wikidata.org/entity/Q5445">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q9690">vermoeidheid</a> (<a href="http://www.wikidata.org/entity/Q9690">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q35805">hoest</a> (<a href="http://www.wikidata.org/entity/Q35805">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q38933">koorts</a> (<a href="http://www.wikidata.org/entity/Q38933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q40878">diarree</a> (<a href="http://www.wikidata.org/entity/Q40878">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105688">hypoxie</a> (<a href="http://www.wikidata.org/entity/Q105688">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q160796">delier</a> (<a href="http://www.wikidata.org/entity/Q160796">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q167844">bindvliesontsteking</a> (<a href="http://www.wikidata.org/entity/Q167844">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q170082">psychose</a> (<a href="http://www.wikidata.org/entity/Q170082">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q183425">buikpijn</a> (<a href="http://www.wikidata.org/entity/Q183425">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q186889">misselijkheid</a> (<a href="http://www.wikidata.org/entity/Q186889">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q188008">benauwdheid</a> (<a href="http://www.wikidata.org/entity/Q188008">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q199615">hersenontsteking</a> (<a href="http://www.wikidata.org/entity/Q199615">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q254327">anorexie</a> (<a href="http://www.wikidata.org/entity/Q254327">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q327988">Burn-out</a> (<a href="http://www.wikidata.org/entity/Q327988">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q468433">anosmie</a> (<a href="http://www.wikidata.org/entity/Q468433">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q474959">spierpijn</a> (<a href="http://www.wikidata.org/entity/Q474959">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q485831">lymphopenia</a> (<a href="http://www.wikidata.org/entity/Q485831">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q576349">encefalopathie</a> (<a href="http://www.wikidata.org/entity/Q576349">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q599982">Enantheem</a> (<a href="http://www.wikidata.org/entity/Q599982">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q606216">ageusie</a> (<a href="http://www.wikidata.org/entity/Q606216">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q647099">bloedspuwing</a> (<a href="http://www.wikidata.org/entity/Q647099">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q720026">hersenbeschadiging</a> (<a href="http://www.wikidata.org/entity/Q720026">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q767485">respiratoire insufficiëntie</a> (<a href="http://www.wikidata.org/entity/Q767485">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q2260058">Koude rilling</a> (<a href="http://www.wikidata.org/entity/Q2260058">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q2603200">Virale pneumonie</a> (<a href="http://www.wikidata.org/entity/Q2603200">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q3245488">nasal congestion</a> (<a href="http://www.wikidata.org/entity/Q3245488">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q3508755">influenza like illness</a> (<a href="http://www.wikidata.org/entity/Q3508755">edit</a>)</td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/symptoms.rq | sed 's+<lang/>+nl+' > symptoms.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@symptoms.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
