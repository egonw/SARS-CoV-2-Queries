# interventionStructures.rq
**コード例:** [curl](#curl)
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
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
} ORDER BY DESC(?count)
  LIMIT 10
```
[実行](https://query.wikidata.org/embed.html#%23defaultView%3AImageGrid%0ASELECT%20%3Fintervention%20%3FinterventionLabel%20%3Fimage%20WITH%20%7B%0A%20%20SELECT%20DISTINCT%20%3Fintervention%20%28COUNT%28DISTINCT%20%3Ftrial%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Ftopic%20%7B%20wd%3AQ84263196%20wd%3AQ82069695%20%7D%0A%20%20%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20%7D%20GROUP%20BY%20%3Fintervention%0A%20%20%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A%20%20%20%20LIMIT%2025%0A%7D%20AS%20%25COMPOUNDS%20WHERE%20%7B%0A%20%20INCLUDE%20%25COMPOUNDS%0A%20%20%3Fintervention%20wdt%3AP117%20%3Fimage%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fcount%29%0A%20%20LIMIT%2010%0A) もしくは [編集](https://query.wikidata.org/#%23defaultView%3AImageGrid%0ASELECT%20%3Fintervention%20%3FinterventionLabel%20%3Fimage%20WITH%20%7B%0A%20%20SELECT%20DISTINCT%20%3Fintervention%20%28COUNT%28DISTINCT%20%3Ftrial%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Ftopic%20%7B%20wd%3AQ84263196%20wd%3AQ82069695%20%7D%0A%20%20%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20%7D%20GROUP%20BY%20%3Fintervention%0A%20%20%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A%20%20%20%20LIMIT%2025%0A%7D%20AS%20%25COMPOUNDS%20WHERE%20%7B%0A%20%20INCLUDE%20%25COMPOUNDS%0A%20%20%3Fintervention%20wdt%3AP117%20%3Fimage%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fcount%29%0A%20%20LIMIT%2010%0A)


### 結果
<table>
  <tr>
    <td><b>intervention</b></td>
    <td><b>image</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q421094">ヒドロキシクロロキン</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Hydroxychloroquine.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q422438">クロロキン</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Chloroquine.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q422585">ロピナビル</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Lopinavir.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q422618">リトナビル</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Ritonavir.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q207843">一酸化窒素</a> (<a href="http://www.wikidata.org/entity/Q207843">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Nitric%20oxide.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57055">パラセタモール</a> (<a href="http://www.wikidata.org/entity/Q57055">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/N-Acetyl-p-aminophenol.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q417222">メチルプレドニゾロン</a> (<a href="http://www.wikidata.org/entity/Q417222">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Methylprednisolone.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q422212">ブデソニド</a> (<a href="http://www.wikidata.org/entity/Q422212">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Budesonide.png</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q11426176">プレドニゾロン</a> (<a href="http://www.wikidata.org/entity/Q11426176">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Prednisolone.svg</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q27107351">酢酸メチルプレドニゾロン</a> (<a href="http://www.wikidata.org/entity/Q27107351">edit</a>)</td>
    <td>http://commons.wikimedia.org/wiki/Special:FilePath/Methylprednisolone%20acetate.svg</td>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/interventionStructures.rq | sed 's+<lang/>+ja+' > interventionStructures.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@interventionStructures.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
