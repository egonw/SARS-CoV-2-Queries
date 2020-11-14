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
    <td><a href="https://scholia.toolforge.org/Q83493517">2019-20年コロナウイルス感染症流行のタイムライン</a> (<a href="http://www.wikidata.org/entity/Q83493517">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q83741704">国・地域毎の2019年コロナウイルス感染症流行状況</a> (<a href="http://www.wikidata.org/entity/Q83741704">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q84056433">2019-20年武漢コロナウイルス感染症流行を巡る論争</a> (<a href="http://www.wikidata.org/entity/Q84056433">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q84897850">2019年11月-2020年1月における2019-20年コロナウイルス感染症流行のタイムライン</a> (<a href="http://www.wikidata.org/entity/Q84897850">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85173778">2019-20年コロナウイルス感染症流行に関わる偽情報</a> (<a href="http://www.wikidata.org/entity/Q85173778">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85173855">2019-20年コロナウイルス感染症流行のデータ表</a> (<a href="http://www.wikidata.org/entity/Q85173855">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86901049">COVID-19検査</a> (<a href="http://www.wikidata.org/entity/Q86901049">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87479384">2019-20年コロナウイルス感染症流行により中止されたイベント</a> (<a href="http://www.wikidata.org/entity/Q87479384">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87625383">2019-20年コロナウイルス感染症流行の航空業界への影響</a> (<a href="http://www.wikidata.org/entity/Q87625383">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87625385">2019-20年コロナウイルス感染症流行の映画への影響</a> (<a href="http://www.wikidata.org/entity/Q87625385">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87719499">2019-20年コロナウイルス感染症流行のテレビへの影響</a> (<a href="http://www.wikidata.org/entity/Q87719499">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87747992">2019-20年コロナウイルス感染症流行の音楽への影響</a> (<a href="http://www.wikidata.org/entity/Q87747992">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87774378">2020年3月における2019-20年コロナウイルス感染症流行のタイムライン</a> (<a href="http://www.wikidata.org/entity/Q87774378">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87796964">2019-20年コロナウイルス感染症流行の間の人権問題</a> (<a href="http://www.wikidata.org/entity/Q87796964">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87865677">2019-20年コロナウイルス感染症流行のインターネットへの影響</a> (<a href="http://www.wikidata.org/entity/Q87865677">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87866152">2019年コロナウイルス感染症流行による外出制限・封鎖</a> (<a href="http://www.wikidata.org/entity/Q87866152">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88027839">2019-20年コロナウイルス感染症流行による死亡者一覧</a> (<a href="http://www.wikidata.org/entity/Q88027839">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88221447">医薬品外の対策</a> (<a href="http://www.wikidata.org/entity/Q88221447">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88240100">COVID-19集中治療処置数</a> (<a href="http://www.wikidata.org/entity/Q88240100">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88293861">2019-20年コロナウイルス感染症流行の食品産業への影響</a> (<a href="http://www.wikidata.org/entity/Q88293861">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88293962">2019-20年コロナウイルス感染症流行のメディア網羅状況</a> (<a href="http://www.wikidata.org/entity/Q88293962">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88333605">ソーシャルメディア上でのコロナウイルス感染症流行</a> (<a href="http://www.wikidata.org/entity/Q88333605">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88545234">コロナパーティー</a> (<a href="http://www.wikidata.org/entity/Q88545234">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88599208">コロナウイルス不況</a> (<a href="http://www.wikidata.org/entity/Q88599208">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88634378">2019-20年コロナウイルス感染症流行のゲーム産業への影響</a> (<a href="http://www.wikidata.org/entity/Q88634378">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88661507">2019-20年コロナウイルス感染症流行の科学技術への影響</a> (<a href="http://www.wikidata.org/entity/Q88661507">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88860637">医療関係者へ拍手を</a> (<a href="http://www.wikidata.org/entity/Q88860637">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88903067">2019-20年コロナウイルス感染症流行により中止されたスポーツイベント</a> (<a href="http://www.wikidata.org/entity/Q88903067">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89016387">2020年4月における2019-20年コロナウイルス感染症流行のタイムライン</a> (<a href="http://www.wikidata.org/entity/Q89016387">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89031984">2019-20年コロナウイルス感染症流行により中止された音楽イベント</a> (<a href="http://www.wikidata.org/entity/Q89031984">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89033277">2019-20年コロナウイルス感染症流行により延期されたスポーツイベント</a> (<a href="http://www.wikidata.org/entity/Q89033277">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89113106">2019-20年コロナウイルス感染症流行の芸術・文化遺産への影響</a> (<a href="http://www.wikidata.org/entity/Q89113106">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89209954">NHS COVID-19高度救命救急病院</a> (<a href="http://www.wikidata.org/entity/Q89209954">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89487202">2020年3月における2019-20年コロナウイルス感染症流行への対応</a> (<a href="http://www.wikidata.org/entity/Q89487202">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89666473">2019-20年コロナウイルス感染症流行のジェンダーへの影響</a> (<a href="http://www.wikidata.org/entity/Q89666473">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89864650">2019-20年コロナウイルス感染症流行の刑務所への影響</a> (<a href="http://www.wikidata.org/entity/Q89864650">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89966200">Pandemic predictions and preparations prior to COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89966200">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90213139">Impact of the 2019–20 coronavirus pandemic on long-term care facilities</a> (<a href="http://www.wikidata.org/entity/Q90213139">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90290885">COVID-19感染症流行の間に死亡した医療従事者一覧</a> (<a href="http://www.wikidata.org/entity/Q90290885">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90416196">face masks during the COVID-19 pandemic</a> (<a href="http://www.wikidata.org/entity/Q90416196">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90456853">Impact of the 2019–20 coronavirus pandemic on the military</a> (<a href="http://www.wikidata.org/entity/Q90456853">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90630881">impact of the 2019–20 coronavirus pandemic on public transport</a> (<a href="http://www.wikidata.org/entity/Q90630881">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90840989">impact of the COVID-19 pandemic on tourism</a> (<a href="http://www.wikidata.org/entity/Q90840989">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91104866">social distancing measures related to the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q91104866">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91280428">Protests over responses to the 2020 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q91280428">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91493633">Wikipedia's response to the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q91493633">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91911563">Impact of the 2019–20 coronavirus pandemic on the performing arts</a> (<a href="http://www.wikidata.org/entity/Q91911563">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92150479">Impact of the 2019–20 coronavirus pandemic on journalism</a> (<a href="http://www.wikidata.org/entity/Q92150479">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92600442">Timeline of the COVID-19 pandemic in May 2020</a> (<a href="http://www.wikidata.org/entity/Q92600442">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q93593520">Impact of the COVID-19 pandemic on the fashion industry</a> (<a href="http://www.wikidata.org/entity/Q93593520">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q93596977">everything will be all right</a> (<a href="http://www.wikidata.org/entity/Q93596977">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q94141388">Responses to the COVID-19 pandemic in May 2020</a> (<a href="http://www.wikidata.org/entity/Q94141388">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q94320820">impact of the COVID-19 pandemic</a> (<a href="http://www.wikidata.org/entity/Q94320820">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q94381343">Responses to the COVID-19 pandemic in February 2020</a> (<a href="http://www.wikidata.org/entity/Q94381343">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q94981621">Impact of the COVID-19 pandemic on healthcare workers</a> (<a href="http://www.wikidata.org/entity/Q94981621">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q94981718">Impact of the COVID-19 pandemic on other health issues</a> (<a href="http://www.wikidata.org/entity/Q94981718">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q95982336">Global Pride</a> (<a href="http://www.wikidata.org/entity/Q95982336">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96048874">Timeline of the COVID-19 pandemic in June 2020</a> (<a href="http://www.wikidata.org/entity/Q96048874">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96058732">impact of the COVID-19 pandemic on food</a> (<a href="http://www.wikidata.org/entity/Q96058732">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96336226">Q96336226</a> (<a href="http://www.wikidata.org/entity/Q96336226">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96401587">Responses to the COVID-19 pandemic in April 2020</a> (<a href="http://www.wikidata.org/entity/Q96401587">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96419281">source tracing for SARS-Cov-2</a> (<a href="http://www.wikidata.org/entity/Q96419281">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96728989">Timeline of the COVID-19 pandemic in July 2020</a> (<a href="http://www.wikidata.org/entity/Q96728989">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96731773">Responses to the COVID-19 pandemic in June 2020</a> (<a href="http://www.wikidata.org/entity/Q96731773">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96731877">Responses to the COVID-19 pandemic in July 2020</a> (<a href="http://www.wikidata.org/entity/Q96731877">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97357752">Covid Watch</a> (<a href="http://www.wikidata.org/entity/Q97357752">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97671359">2019-20年コロナウイルス感染症流行の間の国際援助</a> (<a href="http://www.wikidata.org/entity/Q97671359">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97770079">Corona party</a> (<a href="http://www.wikidata.org/entity/Q97770079">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97861418">Responses to the COVID-19 pandemic in August 2020</a> (<a href="http://www.wikidata.org/entity/Q97861418">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97965631">Timeline of the COVID-19 pandemic in August 2020</a> (<a href="http://www.wikidata.org/entity/Q97965631">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98404895">Impact of the COVID-19 pandemic on the Catholic Church</a> (<a href="http://www.wikidata.org/entity/Q98404895">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98557220">event affected by the COVID-19 pandemic</a> (<a href="http://www.wikidata.org/entity/Q98557220">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98704550">Timeline of the COVID-19 pandemic in September 2020</a> (<a href="http://www.wikidata.org/entity/Q98704550">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q99228019">list of Indonesian health workers due to COVID-19</a> (<a href="http://www.wikidata.org/entity/Q99228019">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q99360983">COVAX</a> (<a href="http://www.wikidata.org/entity/Q99360983">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q99772823">Timeline of the COVID-19 pandemic in October 2020</a> (<a href="http://www.wikidata.org/entity/Q99772823">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100152858">グレートバリントン宣言</a> (<a href="http://www.wikidata.org/entity/Q100152858">edit</a>)</td>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/facets.rq | sed 's+<lang/>+ja+' > facets.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@facets.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
