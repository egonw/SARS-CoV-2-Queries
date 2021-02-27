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
    <td><a href="https://scholia.toolforge.org/Q104400171">501.V2</a> (<a href="http://www.wikidata.org/entity/Q104400171">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21">Inglaterra</a> (<a href="http://www.wikidata.org/entity/Q21">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104376647">VUI-202012/01</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q145">Reino Unido</a> (<a href="http://www.wikidata.org/entity/Q145">edit</a>)</td>
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
