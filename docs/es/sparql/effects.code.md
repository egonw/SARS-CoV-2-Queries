# effects.rq
**Ejemplos de código:** [curl](#curl)
### SPARQL
```sparql
SELECT ?effect ?effectLabel WHERE {
  wd:Q84263196 wdt:P1542 ?effect .
  MINUS { ?effect wdt:P31 wd:Q12184 }
  MINUS { ?effect wdt:P31 wd:Q3241045 }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
}
```
[ejecutar](https://query.wikidata.org/embed.html#SELECT%20%3Feffect%20%3FeffectLabel%20WHERE%20%7B%0A%20%20wd%3AQ84263196%20wdt%3AP1542%20%3Feffect%20.%0A%20%20MINUS%20%7B%20%3Feffect%20wdt%3AP31%20wd%3AQ12184%20%7D%0A%20%20MINUS%20%7B%20%3Feffect%20wdt%3AP31%20wd%3AQ3241045%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%0A) o [editar](https://query.wikidata.org/#SELECT%20%3Feffect%20%3FeffectLabel%20WHERE%20%7B%0A%20%20wd%3AQ84263196%20wdt%3AP1542%20%3Feffect%20.%0A%20%20MINUS%20%7B%20%3Feffect%20wdt%3AP31%20wd%3AQ12184%20%7D%0A%20%20MINUS%20%7B%20%3Feffect%20wdt%3AP31%20wd%3AQ3241045%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%0A)


### Resultados
<table>
  <tr>
    <td><b>effect</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q179217">blood coagulation</a> (<a href="http://www.wikidata.org/entity/Q179217">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q261327">thrombosis</a> (<a href="http://www.wikidata.org/entity/Q261327">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q344873">acute respiratory distress syndrome</a> (<a href="http://www.wikidata.org/entity/Q344873">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q1076369">cytokine storm</a> (<a href="http://www.wikidata.org/entity/Q1076369">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q1128440">toxic shock syndrome</a> (<a href="http://www.wikidata.org/entity/Q1128440">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q2603200">viral pneumonia</a> (<a href="http://www.wikidata.org/entity/Q2603200">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q93629491">pediatric multisystem inflammatory syndrome</a> (<a href="http://www.wikidata.org/entity/Q93629491">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100732653">long covid</a> (<a href="http://www.wikidata.org/entity/Q100732653">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104778232">COVID-19 mortality</a> (<a href="http://www.wikidata.org/entity/Q104778232">edit</a>)</td>
  </tr>
</table>
## Ejemplos de código
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/effects.rq | sed 's+<lang/>+es+' > effects.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@effects.rq
```
Esta consulta SPARQL está disponible en CCZero.
