# allSARSCoVViruses.rq
**コード例:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}
```
[実行](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A) もしくは [編集](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A)


### 結果
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16000326">SL-CoV-WIV1</a> (<a href="http://www.wikidata.org/entity/Q16000326">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415852">1415852</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARSコロナウイルス2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2697049">2697049</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">SARSコロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85939995">SHC014-CoV</a> (<a href="http://www.wikidata.org/entity/Q85939995">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415851">1415851</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88162038">Bat SARS coronavirus Rp1</a> (<a href="http://www.wikidata.org/entity/Q88162038">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/349342">349342</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91561236">BatCoV RaTG13</a> (<a href="http://www.wikidata.org/entity/Q91561236">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2709072">2709072</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97709258">Bat SARS CoV Rf1</a> (<a href="http://www.wikidata.org/entity/Q97709258">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/347537">347537</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97709416">Bat SARS CoV Rm1</a> (<a href="http://www.wikidata.org/entity/Q97709416">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/347536">347536</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97709493">Bat SARS CoV Rp3</a> (<a href="http://www.wikidata.org/entity/Q97709493">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/349344">349344</a></td>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/allSARSCoVViruses.rq | sed 's+<lang/>+ja+' > allSARSCoVViruses.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@allSARSCoVViruses.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
