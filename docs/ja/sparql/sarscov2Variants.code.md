# sarscov2Variants.rq
**コード例:** [curl](#curl)
### SPARQL
```sparql
SELECT ?variant ?variantLabel ?genome WHERE {
  ?variant wdt:P171 wd:Q82069695 .
  OPTIONAL { ?variant wdt:P527/wdt:P6800 ?genome }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}
```
[実行](https://query.wikidata.org/embed.html#SELECT%20%3Fvariant%20%3FvariantLabel%20%3Fgenome%20WHERE%20%7B%0A%20%20%3Fvariant%20wdt%3AP171%20wd%3AQ82069695%20.%0A%20%20OPTIONAL%20%7B%20%3Fvariant%20wdt%3AP527%2Fwdt%3AP6800%20%3Fgenome%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A) もしくは [編集](https://query.wikidata.org/#SELECT%20%3Fvariant%20%3FvariantLabel%20%3Fgenome%20WHERE%20%7B%0A%20%20%3Fvariant%20wdt%3AP171%20wd%3AQ82069695%20.%0A%20%20OPTIONAL%20%7B%20%3Fvariant%20wdt%3AP527%2Fwdt%3AP6800%20%3Fgenome%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A)


### 結果
<table>
  <tr>
    <td><b>variant</b></td>
    <td><b>genome</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104376647">VUI – 202012/01</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104400171">501.V2 Variant</a> (<a href="http://www.wikidata.org/entity/Q104400171">edit</a>)</td>
    <td></td>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/sarscov2Variants.rq | sed 's+<lang/>+ja+' > sarscov2Variants.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@sarscov2Variants.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
