# genomes.rq
**コード例:** [curl](#curl)
### SPARQL
```sparql
SELECT ?genome WHERE {
  wd:Q82069695 wdt:P527/wdt:P6800 ?genome .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}

```
[実行](https://query.wikidata.org/embed.html#SELECT%20%3Fgenome%20WHERE%20%7B%0A%20%20wd%3AQ82069695%20wdt%3AP527%2Fwdt%3AP6800%20%3Fgenome%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A%0A) もしくは [編集](https://query.wikidata.org/#SELECT%20%3Fgenome%20WHERE%20%7B%0A%20%20wd%3AQ82069695%20wdt%3AP527%2Fwdt%3AP6800%20%3Fgenome%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A%0A)


### 結果
<table>
  <tr>
    <td><b>genome</b></td>
  </tr>
  <tr>
    <td>https://gisaid.org/CoV2020</td>
  </tr>
  <tr>
    <td>https://www.ncbi.nlm.nih.gov/assembly/GCF_009858895.2</td>
  </tr>
  <tr>
    <td>https://www.ncbi.nlm.nih.gov/genome/86693</td>
  </tr>
  <tr>
    <td>https://www.ncbi.nlm.nih.gov/nuccore/1798174254</td>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/genomes.rq | sed 's+<lang/>+ja+' > genomes.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@genomes.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
