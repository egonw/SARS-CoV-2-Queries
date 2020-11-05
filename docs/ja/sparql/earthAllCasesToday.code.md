# earthAllCasesToday.rq
**コード例:** [curl](#curl)
### SPARQL
```sparql
SELECT ?numberOfCases  WHERE {
  wd:Q81068910 wdt:P1603 ?numberOfCases .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
} ORDER BY DESC(?numberOfCases)
```
[実行](https://query.wikidata.org/embed.html#SELECT%20%3FnumberOfCases%20%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20wdt%3AP1603%20%3FnumberOfCases%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3FnumberOfCases%29%0A) もしくは [編集](https://query.wikidata.org/#SELECT%20%3FnumberOfCases%20%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20wdt%3AP1603%20%3FnumberOfCases%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3FnumberOfCases%29%0A)


### 結果
<table>
  <tr>
    <td><b>numberOfCases</b></td>
  </tr>
  <tr>
    <td>37109851</td>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/earthAllCasesToday.rq | sed 's+<lang/>+ja+' > earthAllCasesToday.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@earthAllCasesToday.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
