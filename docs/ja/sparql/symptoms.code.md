# symptoms.rq
**コード例:** [curl](#curl)
### SPARQL
```sparql
SELECT ?symptom ?symptomLabel WHERE {
  wd:Q84263196 wdt:P780 ?symptom .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}
```
[実行](https://query.wikidata.org/embed.html#SELECT%20%3Fsymptom%20%3FsymptomLabel%20WHERE%20%7B%0A%20%20wd%3AQ84263196%20wdt%3AP780%20%3Fsymptom%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A) もしくは [編集](https://query.wikidata.org/#SELECT%20%3Fsymptom%20%3FsymptomLabel%20WHERE%20%7B%0A%20%20wd%3AQ84263196%20wdt%3AP780%20%3Fsymptom%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A)


### 結果
<table>
  <tr>
    <td><b>symptom</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86">頭痛</a> (<a href="http://www.wikidata.org/entity/Q86">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q5445">貧血</a> (<a href="http://www.wikidata.org/entity/Q5445">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q9690">疲労</a> (<a href="http://www.wikidata.org/entity/Q9690">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q35805">咳嗽</a> (<a href="http://www.wikidata.org/entity/Q35805">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q38933">発熱</a> (<a href="http://www.wikidata.org/entity/Q38933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q40878">下痢</a> (<a href="http://www.wikidata.org/entity/Q40878">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105688">低酸素症</a> (<a href="http://www.wikidata.org/entity/Q105688">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q160796">せん妄</a> (<a href="http://www.wikidata.org/entity/Q160796">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q167844">結膜炎</a> (<a href="http://www.wikidata.org/entity/Q167844">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q170082">精神病</a> (<a href="http://www.wikidata.org/entity/Q170082">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q183425">腹痛</a> (<a href="http://www.wikidata.org/entity/Q183425">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q186889">吐き気</a> (<a href="http://www.wikidata.org/entity/Q186889">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q188008">呼吸困難</a> (<a href="http://www.wikidata.org/entity/Q188008">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q199615">脳炎</a> (<a href="http://www.wikidata.org/entity/Q199615">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q254327">食欲不振</a> (<a href="http://www.wikidata.org/entity/Q254327">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q327988">燃え尽き症候群</a> (<a href="http://www.wikidata.org/entity/Q327988">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q468433">嗅覚脱失</a> (<a href="http://www.wikidata.org/entity/Q468433">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q474959">筋肉痛</a> (<a href="http://www.wikidata.org/entity/Q474959">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q485831">リンパ球減少症</a> (<a href="http://www.wikidata.org/entity/Q485831">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q576349">脳症</a> (<a href="http://www.wikidata.org/entity/Q576349">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q599982">enanthem</a> (<a href="http://www.wikidata.org/entity/Q599982">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q606216">味覚消失</a> (<a href="http://www.wikidata.org/entity/Q606216">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q647099">喀血</a> (<a href="http://www.wikidata.org/entity/Q647099">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q720026">脳損傷</a> (<a href="http://www.wikidata.org/entity/Q720026">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q767485">呼吸不全</a> (<a href="http://www.wikidata.org/entity/Q767485">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q2260058">悪寒</a> (<a href="http://www.wikidata.org/entity/Q2260058">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q2603200">ウイルス性肺炎</a> (<a href="http://www.wikidata.org/entity/Q2603200">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q3245488">鼻詰まり</a> (<a href="http://www.wikidata.org/entity/Q3245488">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q3508755">インフルエンザ様症状</a> (<a href="http://www.wikidata.org/entity/Q3508755">edit</a>)</td>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/symptoms.rq | sed 's+<lang/>+ja+' > symptoms.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@symptoms.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
