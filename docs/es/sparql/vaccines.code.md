# vaccines.rq
**Ejemplos de código:** [curl](#curl)
### SPARQL
```sparql
SELECT ?vaccine ?vaccineLabel ?for ?forLabel WHERE {
  VALUES ?for { wd:Q84263196 }
  ?vaccine wdt:P31 wd:Q134808 ;
           wdt:P1924 ?for .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
} ORDER BY ASC(?vaccine)
```
[ejecutar](https://query.wikidata.org/embed.html#SELECT%20%3Fvaccine%20%3FvaccineLabel%20%3Ffor%20%3FforLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Ffor%20%7B%20wd%3AQ84263196%20%7D%0A%20%20%3Fvaccine%20wdt%3AP31%20wd%3AQ134808%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1924%20%3Ffor%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%0A) o [editar](https://query.wikidata.org/#SELECT%20%3Fvaccine%20%3FvaccineLabel%20%3Ffor%20%3FforLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Ffor%20%7B%20wd%3AQ84263196%20%7D%0A%20%20%3Fvaccine%20wdt%3AP31%20wd%3AQ134808%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1924%20%3Ffor%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%0A)


### Resultados
<table>
  <tr>
    <td><b>vaccine</b></td>
    <td><b>for</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96695265">Ad5-nCoV</a> (<a href="http://www.wikidata.org/entity/Q96695265">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q84263196">COVID-19</a> (<a href="http://www.wikidata.org/entity/Q84263196">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96695266">INO-4800</a> (<a href="http://www.wikidata.org/entity/Q96695266">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q84263196">COVID-19</a> (<a href="http://www.wikidata.org/entity/Q84263196">edit</a>)</td>
  </tr>
</table>
## Ejemplos de código
### curl
```shell
curl -o vaccines.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/vaccines.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@vaccines.rq
```
Esta consulta SPARQL está disponible en CCZero.
