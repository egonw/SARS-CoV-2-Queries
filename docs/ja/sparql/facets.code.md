# facets.rq
**コード例:** [curl](#curl)
### SPARQL
```sparql
SELECT ?facet ?facetLabel WHERE {
  ?facet wdt:P1269 wd:Q81068910 .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}

```
[実行](https://query.wikidata.org/embed.html#SELECT%20%3Ffacet%20%3FfacetLabel%20WHERE%20%7B%0A%20%20%3Ffacet%20wdt%3AP1269%20wd%3AQ81068910%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A%0A) もしくは [編集](https://query.wikidata.org/#SELECT%20%3Ffacet%20%3FfacetLabel%20WHERE%20%7B%0A%20%20%3Ffacet%20wdt%3AP1269%20wd%3AQ81068910%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A%0A)


### 結果
<table>
  <tr>
    <td><b>facet</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83493517">2019-20年コロナウイルス感染症流行のタイムライン</a> (<a href="http://www.wikidata.org/entity/Q83493517">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83741704">国・地域毎の2019年コロナウイルス感染症流行状況</a> (<a href="http://www.wikidata.org/entity/Q83741704">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84056433">2019-20年武漢コロナウイルス感染症流行を巡る論争</a> (<a href="http://www.wikidata.org/entity/Q84056433">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84318312">2019-20年武漢コロナウイルス感染症流行に関わる外国人嫌悪とレイシズム</a> (<a href="http://www.wikidata.org/entity/Q84318312">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84897850">2019年11月-2020年1月における2019-20年コロナウイルス感染症流行のタイムライン</a> (<a href="http://www.wikidata.org/entity/Q84897850">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q85173778">2019-20年コロナウイルス感染症流行に関わる偽情報</a> (<a href="http://www.wikidata.org/entity/Q85173778">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q85173855">2019-20年コロナウイルス感染症流行のデータ表</a> (<a href="http://www.wikidata.org/entity/Q85173855">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86901049">COVID-19検査</a> (<a href="http://www.wikidata.org/entity/Q86901049">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87073833">2019-20年コロナウイルス感染症流行に関わる旅行制限</a> (<a href="http://www.wikidata.org/entity/Q87073833">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87479384">2019-20年コロナウイルス感染症流行により中止されたイベント</a> (<a href="http://www.wikidata.org/entity/Q87479384">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87491759">2019-20年コロナウイルス感染症流行に対する国内の対応</a> (<a href="http://www.wikidata.org/entity/Q87491759">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87625383">2019-20年コロナウイルス感染症流行の航空業界への影響</a> (<a href="http://www.wikidata.org/entity/Q87625383">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87625385">2019-20年コロナウイルス感染症流行の映画への影響</a> (<a href="http://www.wikidata.org/entity/Q87625385">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87719499">2019-20年コロナウイルス感染症流行のテレビへの影響</a> (<a href="http://www.wikidata.org/entity/Q87719499">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87747992">2019-20年コロナウイルス感染症流行の音楽への影響</a> (<a href="http://www.wikidata.org/entity/Q87747992">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87760968">2019-20年コロナウイルス感染症流行の教育への影響</a> (<a href="http://www.wikidata.org/entity/Q87760968">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87774378">2020年3月における2019-20年コロナウイルス感染症流行のタイムライン</a> (<a href="http://www.wikidata.org/entity/Q87774378">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87796964">2019-20年コロナウイルス感染症流行の間の人権問題</a> (<a href="http://www.wikidata.org/entity/Q87796964">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87865677">2019-20年コロナウイルス感染症流行のインターネットへの影響</a> (<a href="http://www.wikidata.org/entity/Q87865677">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87866152">2019年コロナウイルス感染症流行による外出制限・封鎖</a> (<a href="http://www.wikidata.org/entity/Q87866152">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87898060">2019-20年コロナウイルス感染症流行の宗教への影響</a> (<a href="http://www.wikidata.org/entity/Q87898060">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88027839">2019-20年コロナウイルス感染症流行による死亡者一覧</a> (<a href="http://www.wikidata.org/entity/Q88027839">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88221447">医薬品外の対策</a> (<a href="http://www.wikidata.org/entity/Q88221447">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88240100">COVID-19集中治療処置数</a> (<a href="http://www.wikidata.org/entity/Q88240100">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88293861">2019-20年コロナウイルス感染症流行の食品産業への影響</a> (<a href="http://www.wikidata.org/entity/Q88293861">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88293962">2019-20年コロナウイルス感染症流行のメディア網羅状況</a> (<a href="http://www.wikidata.org/entity/Q88293962">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88333605">ソーシャルメディア上でのコロナウイルス感染症流行</a> (<a href="http://www.wikidata.org/entity/Q88333605">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88385577">2019-20年コロナウイルス感染症流行の間の国際援助</a> (<a href="http://www.wikidata.org/entity/Q88385577">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88599208">コロナウイルス不況</a> (<a href="http://www.wikidata.org/entity/Q88599208">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88634378">2019-20年コロナウイルス感染症流行のゲーム産業への影響</a> (<a href="http://www.wikidata.org/entity/Q88634378">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88661507">2019-20年コロナウイルス感染症流行の科学技術への影響</a> (<a href="http://www.wikidata.org/entity/Q88661507">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88860637">医療関係者へ拍手を</a> (<a href="http://www.wikidata.org/entity/Q88860637">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88903067">2019-20年コロナウイルス感染症流行により中止されたスポーツイベント</a> (<a href="http://www.wikidata.org/entity/Q88903067">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89016387">2020年4月における2019-20年コロナウイルス感染症流行のタイムライン</a> (<a href="http://www.wikidata.org/entity/Q89016387">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89031984">2019-20年コロナウイルス感染症流行により中止された音楽イベント</a> (<a href="http://www.wikidata.org/entity/Q89031984">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89033277">2019-20年コロナウイルス感染症流行により延期されたスポーツイベント</a> (<a href="http://www.wikidata.org/entity/Q89033277">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89113106">2019-20年コロナウイルス感染症流行の芸術・文化遺産への影響</a> (<a href="http://www.wikidata.org/entity/Q89113106">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89209954">NHS COVID-19高度救命救急病院</a> (<a href="http://www.wikidata.org/entity/Q89209954">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89487202">2020年3月における2019-20年コロナウイルス感染症流行への対応</a> (<a href="http://www.wikidata.org/entity/Q89487202">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89666473">2019-20年コロナウイルス感染症流行のジェンダーへの影響</a> (<a href="http://www.wikidata.org/entity/Q89666473">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89864650">2019-20年コロナウイルス感染症流行の刑務所への影響</a> (<a href="http://www.wikidata.org/entity/Q89864650">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89966200">Pandemic predictions and preparations prior to COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89966200">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90085156">2019-20年コロナウイルス感染症流行の環境への影響</a> (<a href="http://www.wikidata.org/entity/Q90085156">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90213139">Impact of the 2019–20 coronavirus pandemic on long-term care facilities</a> (<a href="http://www.wikidata.org/entity/Q90213139">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90290885">COVID-19感染症流行の間に死亡した医療従事者一覧</a> (<a href="http://www.wikidata.org/entity/Q90290885">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90416196">face masks during the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q90416196">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90456853">Impact of the 2019–20 coronavirus pandemic on the military</a> (<a href="http://www.wikidata.org/entity/Q90456853">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90630881">Impact of the 2019–20 coronavirus pandemic on public transport</a> (<a href="http://www.wikidata.org/entity/Q90630881">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90840968">Impact of the 2019–20 coronavirus pandemic on domestic violence</a> (<a href="http://www.wikidata.org/entity/Q90840968">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90840989">Impact of the 2019–20 coronavirus pandemic on tourism</a> (<a href="http://www.wikidata.org/entity/Q90840989">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90859234">Impact of the 2019-20 coronavirus pandemic on international relations</a> (<a href="http://www.wikidata.org/entity/Q90859234">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q91104866">Social distancing measures related to the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q91104866">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q91280428">Protests over responses to the 2020 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q91280428">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q91493633">Wikipedia's response to the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q91493633">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q91911563">Impact of the 2019–20 coronavirus pandemic on the performing arts</a> (<a href="http://www.wikidata.org/entity/Q91911563">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q92150479">Impact of the 2019–20 coronavirus pandemic on journalism</a> (<a href="http://www.wikidata.org/entity/Q92150479">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q92600442">timeline of the 2019–20 coronavirus pandemic in May 2020</a> (<a href="http://www.wikidata.org/entity/Q92600442">edit</a>)</td>
  </tr>
</table>
## コード例
### curl
```shell
curl -o facets.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/facets.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@facets.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
