# vaccines.rq
**Ejemplos de código:** [curl](#curl)
### SPARQL
```sparql
SELECT DISTINCT ?vaccine ?vaccineLabel ?type ?typeLabel WHERE {
  VALUES ?for { wd:Q84263196 }
  ?vaccine wdt:P31 / wdt:P279? wd:Q134808 ;
           wdt:P1924 ?for .
  ?vaccine wdt:P31 ?type .
  FILTER ( ?type != wd:Q28051899 ) FILTER ( ?type != wd:Q98734151 )
  FILTER ( ?type != wd:Q87719492 ) FILTER ( ?type != wd:Q30612 )
  FILTER ( ?type != wd:Q134808 )
  SERVICE wikibase:label { bd:serviceParam wikibase:language "es,en". }
} ORDER BY ASC(?vaccine) ASC(?type)
```
[ejecutar](https://query.wikidata.org/embed.html#SELECT%20DISTINCT%20%3Fvaccine%20%3FvaccineLabel%20%3Ftype%20%3FtypeLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Ffor%20%7B%20wd%3AQ84263196%20%7D%0A%20%20%3Fvaccine%20wdt%3AP31%20%2F%20wdt%3AP279%3F%20wd%3AQ134808%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1924%20%3Ffor%20.%0A%20%20%3Fvaccine%20wdt%3AP31%20%3Ftype%20.%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ28051899%20%29%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ98734151%20%29%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ87719492%20%29%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ30612%20%29%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ134808%20%29%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%20ASC%28%3Ftype%29%0A) o [editar](https://query.wikidata.org/#SELECT%20DISTINCT%20%3Fvaccine%20%3FvaccineLabel%20%3Ftype%20%3FtypeLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Ffor%20%7B%20wd%3AQ84263196%20%7D%0A%20%20%3Fvaccine%20wdt%3AP31%20%2F%20wdt%3AP279%3F%20wd%3AQ134808%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1924%20%3Ffor%20.%0A%20%20%3Fvaccine%20wdt%3AP31%20%3Ftype%20.%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ28051899%20%29%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ98734151%20%29%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ87719492%20%29%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ30612%20%29%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ134808%20%29%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%20ASC%28%3Ftype%29%0A)


### Resultados
<table>
  <tr>
    <td><b>vaccine</b></td>
    <td><b>type</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158046">UB-612</a> (<a href="http://www.wikidata.org/entity/Q100158046">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101251575">MVC COVID-19 Vaccine</a> (<a href="http://www.wikidata.org/entity/Q101251575">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87775025">MRNA-1273</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q85795487">Vacuna de ARN</a> (<a href="http://www.wikidata.org/entity/Q85795487">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96695265">Ad5-nCoV</a> (<a href="http://www.wikidata.org/entity/Q96695265">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96841548">vacuna basada en adenovirus</a> (<a href="http://www.wikidata.org/entity/Q96841548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154230">BBIBP-CorV</a> (<a href="http://www.wikidata.org/entity/Q97154230">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3560939">vacuna inactivada</a> (<a href="http://www.wikidata.org/entity/Q3560939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154240">tozinamerán</a> (<a href="http://www.wikidata.org/entity/Q97154240">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q85795487">Vacuna de ARN</a> (<a href="http://www.wikidata.org/entity/Q85795487">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98270627">Gam-COVID-Vac</a> (<a href="http://www.wikidata.org/entity/Q98270627">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q105967696">tipo de vacuna</a> (<a href="http://www.wikidata.org/entity/Q105967696">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98703813">BBV152</a> (<a href="http://www.wikidata.org/entity/Q98703813">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3560939">vacuna inactivada</a> (<a href="http://www.wikidata.org/entity/Q3560939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98947046">EpiVacCorona</a> (<a href="http://www.wikidata.org/entity/Q98947046">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
</table>
## Ejemplos de código
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/vaccines.rq | sed 's+<lang/>+es+' > vaccines.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@vaccines.rq
```
Esta consulta SPARQL está disponible en CCZero.
