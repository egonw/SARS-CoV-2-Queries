# sarscov2Variants.rq
**Ejemplos de código:** [curl](#curl)
### SPARQL
```sparql
SELECT DISTINCT ?variant ?variantLabel ?location ?locationLabel ?genome WHERE {
  VALUES ?variantType { wd:Q15304597 wd:Q75913269 }
  ?variant p:P31 [ ps:P31 ?variantType ; pq:P642 wd:Q82069695 ] .
  OPTIONAL { ?variant wdt:P189 ?location }
  OPTIONAL { ?variant wdt:P527/wdt:P6800 ?genome }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "es,en". }
}
```
[ejecutar](https://query.wikidata.org/embed.html#SELECT%20DISTINCT%20%3Fvariant%20%3FvariantLabel%20%3Flocation%20%3FlocationLabel%20%3Fgenome%20WHERE%20%7B%0A%20%20VALUES%20%3FvariantType%20%7B%20wd%3AQ15304597%20wd%3AQ75913269%20%7D%0A%20%20%3Fvariant%20p%3AP31%20%5B%20ps%3AP31%20%3FvariantType%20%3B%20pq%3AP642%20wd%3AQ82069695%20%5D%20.%0A%20%20OPTIONAL%20%7B%20%3Fvariant%20wdt%3AP189%20%3Flocation%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fvariant%20wdt%3AP527%2Fwdt%3AP6800%20%3Fgenome%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0A) o [editar](https://query.wikidata.org/#SELECT%20DISTINCT%20%3Fvariant%20%3FvariantLabel%20%3Flocation%20%3FlocationLabel%20%3Fgenome%20WHERE%20%7B%0A%20%20VALUES%20%3FvariantType%20%7B%20wd%3AQ15304597%20wd%3AQ75913269%20%7D%0A%20%20%3Fvariant%20p%3AP31%20%5B%20ps%3AP31%20%3FvariantType%20%3B%20pq%3AP642%20wd%3AQ82069695%20%5D%20.%0A%20%20OPTIONAL%20%7B%20%3Fvariant%20wdt%3AP189%20%3Flocation%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fvariant%20wdt%3AP527%2Fwdt%3AP6800%20%3Fgenome%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0A)


### Resultados
<table>
  <tr>
    <td><b>variant</b></td>
    <td><b>location</b></td>
    <td><b>genome</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104400171">501.V2</a> (<a href="http://www.wikidata.org/entity/Q104400171">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21">Inglaterra</a> (<a href="http://www.wikidata.org/entity/Q21">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171157">SARS-CoV-2 Theta variant</a> (<a href="http://www.wikidata.org/entity/Q106171157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q928">Filipinas</a> (<a href="http://www.wikidata.org/entity/Q928">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106332190">Lineage B.1.616</a> (<a href="http://www.wikidata.org/entity/Q106332190">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q12130">Bretaña</a> (<a href="http://www.wikidata.org/entity/Q12130">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104819269">B.1.1.248</a> (<a href="http://www.wikidata.org/entity/Q104819269">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40236">Manaos</a> (<a href="http://www.wikidata.org/entity/Q40236">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104819269">B.1.1.248</a> (<a href="http://www.wikidata.org/entity/Q104819269">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q17">Japón</a> (<a href="http://www.wikidata.org/entity/Q17">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104412033">Cluster 5</a> (<a href="http://www.wikidata.org/entity/Q104412033">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q1475142">Northern Jutland</a> (<a href="http://www.wikidata.org/entity/Q1475142">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106581308">B.1.617</a> (<a href="http://www.wikidata.org/entity/Q106581308">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q668">India</a> (<a href="http://www.wikidata.org/entity/Q668">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106581308">B.1.617</a> (<a href="http://www.wikidata.org/entity/Q106581308">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q1191">Maharashtra</a> (<a href="http://www.wikidata.org/entity/Q1191">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106592103">B.1.526</a> (<a href="http://www.wikidata.org/entity/Q106592103">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q60">Nueva York</a> (<a href="http://www.wikidata.org/entity/Q60">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171195">Lineage B.1.525</a> (<a href="http://www.wikidata.org/entity/Q106171195">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171244">Lineage B.1.1.7 with E484K</a> (<a href="http://www.wikidata.org/entity/Q106171244">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106628019">B.1.618</a> (<a href="http://www.wikidata.org/entity/Q106628019">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q1356">Bengala Occidental</a> (<a href="http://www.wikidata.org/entity/Q1356">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104376647">variante Alfa del SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q145">Reino Unido</a> (<a href="http://www.wikidata.org/entity/Q145">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171118">Lineage B.1.427</a> (<a href="http://www.wikidata.org/entity/Q106171118">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q99">California</a> (<a href="http://www.wikidata.org/entity/Q99">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171144">Lineage B.1.429</a> (<a href="http://www.wikidata.org/entity/Q106171144">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q99">California</a> (<a href="http://www.wikidata.org/entity/Q99">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171203">Lineage B.1.1.318</a> (<a href="http://www.wikidata.org/entity/Q106171203">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q145">Reino Unido</a> (<a href="http://www.wikidata.org/entity/Q145">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171219">Lineage B.1.1.207</a> (<a href="http://www.wikidata.org/entity/Q106171219">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q1033">Nigeria</a> (<a href="http://www.wikidata.org/entity/Q1033">edit</a>)</td>
    <td></td>
  </tr>
</table>
## Ejemplos de código
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/sarscov2Variants.rq | sed 's+<lang/>+es+' > sarscov2Variants.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@sarscov2Variants.rq
```
Esta consulta SPARQL está disponible en CCZero.
