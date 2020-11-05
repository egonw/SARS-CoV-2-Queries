# interventionStructures.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
#defaultView:ImageGrid
SELECT ?intervention ?interventionLabel ?image WITH {
  SELECT DISTINCT ?intervention (COUNT(DISTINCT ?trial) AS ?count) WHERE {
    VALUES ?topic { wd:Q84263196 wd:Q82069695 }
    ?trial wdt:P31 wd:Q30612 ;
           wdt:P921  ?topic ;
           wdt:P4844 ?intervention .
  } GROUP BY ?intervention
    ORDER BY DESC(?count)
    LIMIT 25
} AS %COMPOUNDS WHERE {
  INCLUDE %COMPOUNDS
  ?intervention wdt:P117 ?image .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
} ORDER BY DESC(?count)
  LIMIT 10
```
[run](https://query.wikidata.org/embed.html#%23defaultView%3AImageGrid%0ASELECT%20%3Fintervention%20%3FinterventionLabel%20%3Fimage%20WITH%20%7B%0A%20%20SELECT%20DISTINCT%20%3Fintervention%20%28COUNT%28DISTINCT%20%3Ftrial%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Ftopic%20%7B%20wd%3AQ84263196%20wd%3AQ82069695%20%7D%0A%20%20%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20%7D%20GROUP%20BY%20%3Fintervention%0A%20%20%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A%20%20%20%20LIMIT%2025%0A%7D%20AS%20%25COMPOUNDS%20WHERE%20%7B%0A%20%20INCLUDE%20%25COMPOUNDS%0A%20%20%3Fintervention%20wdt%3AP117%20%3Fimage%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fcount%29%0A%20%20LIMIT%2010%0A) or [edit](https://query.wikidata.org/#%23defaultView%3AImageGrid%0ASELECT%20%3Fintervention%20%3FinterventionLabel%20%3Fimage%20WITH%20%7B%0A%20%20SELECT%20DISTINCT%20%3Fintervention%20%28COUNT%28DISTINCT%20%3Ftrial%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Ftopic%20%7B%20wd%3AQ84263196%20wd%3AQ82069695%20%7D%0A%20%20%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20%7D%20GROUP%20BY%20%3Fintervention%0A%20%20%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A%20%20%20%20LIMIT%2025%0A%7D%20AS%20%25COMPOUNDS%20WHERE%20%7B%0A%20%20INCLUDE%20%25COMPOUNDS%0A%20%20%3Fintervention%20wdt%3AP117%20%3Fimage%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fcount%29%0A%20%20LIMIT%2010%0A)


### Output
<table>
  <tr>
    <td><b>intervention</b></td>
    <td><b>image</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q421094">hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Hydroxychloroquine.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Chloroquine.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q422585">lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Lopinavir.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q422618">ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Ritonavir.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q207843">nitric oxide (radical)</a> (<a href="http://www.wikidata.org/entity/Q207843">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Nitric%20oxide.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57055">acetaminophen</a> (<a href="http://www.wikidata.org/entity/Q57055">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/N-Acetyl-p-aminophenol.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q417222">methylprednisolone</a> (<a href="http://www.wikidata.org/entity/Q417222">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Methylprednisolone.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q422212">budesonide</a> (<a href="http://www.wikidata.org/entity/Q422212">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Budesonide.png</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q11426176">prednisolone</a> (<a href="http://www.wikidata.org/entity/Q11426176">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Prednisolone.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q27107351">methylprednisolone acetate</a> (<a href="http://www.wikidata.org/entity/Q27107351">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Methylprednisolone%20acetate.svg</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/interventionStructures.rq | sed 's+<lang/>+en+' > interventionStructures.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@interventionStructures.rq
```
This SPARQL query is available under CCZero.
