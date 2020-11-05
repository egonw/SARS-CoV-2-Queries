# symptoms.rq
**Ejemplos de código:** [curl](#curl)
### SPARQL
```sparql
SELECT ?symptom ?symptomLabel WHERE {
  wd:Q84263196 wdt:P780 ?symptom .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "es,en". }
}
```
[ejecutar](https://query.wikidata.org/embed.html#SELECT%20%3Fsymptom%20%3FsymptomLabel%20WHERE%20%7B%0A%20%20wd%3AQ84263196%20wdt%3AP780%20%3Fsymptom%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0A) o [editar](https://query.wikidata.org/#SELECT%20%3Fsymptom%20%3FsymptomLabel%20WHERE%20%7B%0A%20%20wd%3AQ84263196%20wdt%3AP780%20%3Fsymptom%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0A)


### Resultados
<table>
  <tr>
    <td><b>symptom</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86">cefalea</a> (<a href="http://www.wikidata.org/entity/Q86">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q5445">anemia</a> (<a href="http://www.wikidata.org/entity/Q5445">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q9690">cansancio</a> (<a href="http://www.wikidata.org/entity/Q9690">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q35805">tos</a> (<a href="http://www.wikidata.org/entity/Q35805">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q38933">fiebre</a> (<a href="http://www.wikidata.org/entity/Q38933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q40878">diarrea</a> (<a href="http://www.wikidata.org/entity/Q40878">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105688">hipoxia</a> (<a href="http://www.wikidata.org/entity/Q105688">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q160796">delírium</a> (<a href="http://www.wikidata.org/entity/Q160796">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q167844">conjuntivitis</a> (<a href="http://www.wikidata.org/entity/Q167844">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q170082">psicosis</a> (<a href="http://www.wikidata.org/entity/Q170082">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q183425">dolor abdominal</a> (<a href="http://www.wikidata.org/entity/Q183425">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q186889">náusea</a> (<a href="http://www.wikidata.org/entity/Q186889">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q188008">disnea</a> (<a href="http://www.wikidata.org/entity/Q188008">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q199615">encefalitis</a> (<a href="http://www.wikidata.org/entity/Q199615">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q254327">anorexia</a> (<a href="http://www.wikidata.org/entity/Q254327">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q327988">síndrome de desgaste profesional</a> (<a href="http://www.wikidata.org/entity/Q327988">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q468433">anosmia</a> (<a href="http://www.wikidata.org/entity/Q468433">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q474959">mialgia</a> (<a href="http://www.wikidata.org/entity/Q474959">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q485831">linfopenia</a> (<a href="http://www.wikidata.org/entity/Q485831">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q576349">encefalopatía</a> (<a href="http://www.wikidata.org/entity/Q576349">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q599982">enantema</a> (<a href="http://www.wikidata.org/entity/Q599982">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q606216">ageusia</a> (<a href="http://www.wikidata.org/entity/Q606216">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q647099">hemoptisis</a> (<a href="http://www.wikidata.org/entity/Q647099">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q720026">lesión cerebral</a> (<a href="http://www.wikidata.org/entity/Q720026">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q767485">insuficiencia respiratoria</a> (<a href="http://www.wikidata.org/entity/Q767485">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q2260058">escalofrío</a> (<a href="http://www.wikidata.org/entity/Q2260058">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q2603200">neumonía viral</a> (<a href="http://www.wikidata.org/entity/Q2603200">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q3245488">congestion nasal</a> (<a href="http://www.wikidata.org/entity/Q3245488">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q3508755">síndrome gripal</a> (<a href="http://www.wikidata.org/entity/Q3508755">edit</a>)</td>
  </tr>
</table>
## Ejemplos de código
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/symptoms.rq | sed 's+<lang/>+es+' > symptoms.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@symptoms.rq
```
Esta consulta SPARQL está disponible en CCZero.
