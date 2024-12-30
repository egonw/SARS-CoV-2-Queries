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
    <td><a href="https://scholia.toolforge.org/Q83873548">オーストラリアにおける新型コロナウイルス感染症の流行状況</a> (<a href="http://www.wikidata.org/entity/Q83873548">edit</a>)</td>
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
    <td><a href="https://scholia.toolforge.org/Q85173796">Timeline of the COVID-19 pandemic in February 2020</a> (<a href="http://www.wikidata.org/entity/Q85173796">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85173855">2019-20年コロナウイルス感染症流行のデータ表</a> (<a href="http://www.wikidata.org/entity/Q85173855">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86521237">アジアにおける新型コロナウイルス感染症の流行状況</a> (<a href="http://www.wikidata.org/entity/Q86521237">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86694873">アフリカにおける新型コロナウイルス感染症の流行状況</a> (<a href="http://www.wikidata.org/entity/Q86694873">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86847911">オーストリアにおける新型コロナウイルス感染症の流行状況</a> (<a href="http://www.wikidata.org/entity/Q86847911">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86901049">COVID-19検査</a> (<a href="http://www.wikidata.org/entity/Q86901049">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87070999">バーレーンにおける2020年コロナウイルス感染症の流行状況</a> (<a href="http://www.wikidata.org/entity/Q87070999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87151231">北京市における2019年コロナウイルス感染症の流行状況</a> (<a href="http://www.wikidata.org/entity/Q87151231">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87202921">アルジェリアにおける2020年コロナウイルス感染症の流行状況</a> (<a href="http://www.wikidata.org/entity/Q87202921">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87450756">アルバニアにおける2020年コロナウイルス感染症の流行状況</a> (<a href="http://www.wikidata.org/entity/Q87450756">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87452683">バスク地方における2020年コロナウイルス感染症の流行状況</a> (<a href="http://www.wikidata.org/entity/Q87452683">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87468681">アストゥリアス州における2020年コロナウイルス感染症の流行状況</a> (<a href="http://www.wikidata.org/entity/Q87468681">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87479384">COVID-19の流行により中止されたイベント</a> (<a href="http://www.wikidata.org/entity/Q87479384">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87540454">バングラデシュにおける2020年コロナウイルス感染症の流行状況</a> (<a href="http://www.wikidata.org/entity/Q87540454">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87625383">2019-20年コロナウイルス感染症流行の航空業界への影響</a> (<a href="http://www.wikidata.org/entity/Q87625383">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87625385">2019-20年コロナウイルス感染症流行の映画への影響</a> (<a href="http://www.wikidata.org/entity/Q87625385">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87648634">2019新型コロナウイルス感染症の流行 (アルメニア)</a> (<a href="http://www.wikidata.org/entity/Q87648634">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87655120">マドリード州における2020年コロナウイルス感染症の流行状況</a> (<a href="http://www.wikidata.org/entity/Q87655120">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87719499">2019-20年コロナウイルス感染症流行のテレビへの影響</a> (<a href="http://www.wikidata.org/entity/Q87719499">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87747992">2019-20年コロナウイルス感染症流行の音楽への影響</a> (<a href="http://www.wikidata.org/entity/Q87747992">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87768605">アフガニスタンにおける2020年コロナウイルス感染症の流行状況</a> (<a href="http://www.wikidata.org/entity/Q87768605">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87774378">2020年3月における2019-20年コロナウイルス感染症流行のタイムライン</a> (<a href="http://www.wikidata.org/entity/Q87774378">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87796964">2019-20年コロナウイルス感染症流行の間の人権問題</a> (<a href="http://www.wikidata.org/entity/Q87796964">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87816112">アメリカ領サモアにおける2020年コロナウイルス感染症の流行状況</a> (<a href="http://www.wikidata.org/entity/Q87816112">edit</a>)</td>
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
    <td><a href="https://scholia.toolforge.org/Q88177016">COVID-19 pandemic in Ahmedabad district</a> (<a href="http://www.wikidata.org/entity/Q88177016">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88208091">COVID-19 pandemic in Galicia</a> (<a href="http://www.wikidata.org/entity/Q88208091">edit</a>)</td>
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
    <td><a href="https://scholia.toolforge.org/Q88755333">COVID-19 pandemic in Anhui</a> (<a href="http://www.wikidata.org/entity/Q88755333">edit</a>)</td>
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
    <td><a href="https://scholia.toolforge.org/Q89277962">COVID-19 pandemic in Bagalakote district</a> (<a href="http://www.wikidata.org/entity/Q89277962">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89432614">COVID-19 pandemic in Aragon</a> (<a href="http://www.wikidata.org/entity/Q89432614">edit</a>)</td>
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
    <td><a href="https://scholia.toolforge.org/Q89966200">pandemic predictions and preparations prior to the COVID-19 pandemic</a> (<a href="http://www.wikidata.org/entity/Q89966200">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90137185">COVID-19 pandemic in Abkhazia</a> (<a href="http://www.wikidata.org/entity/Q90137185">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90213139">Impact of the COVID-19 pandemic on long-term care facilities</a> (<a href="http://www.wikidata.org/entity/Q90213139">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90290885">COVID-19感染症流行の間に死亡した医療従事者一覧</a> (<a href="http://www.wikidata.org/entity/Q90290885">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90416196">2019年コロナウイルス感染症の流行におけるマスク</a> (<a href="http://www.wikidata.org/entity/Q90416196">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90456853">impact of the COVID-19 pandemic on the military</a> (<a href="http://www.wikidata.org/entity/Q90456853">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90630881">impact of the 2019–20 coronavirus pandemic on public transport</a> (<a href="http://www.wikidata.org/entity/Q90630881">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90840989">新型コロナウイルスが観光に与えた影響</a> (<a href="http://www.wikidata.org/entity/Q90840989">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91104866">新型コロナウイルス感染症の世界的流行に関する社会距離拡大戦略</a> (<a href="http://www.wikidata.org/entity/Q91104866">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91280428">新型コロナウイルス感染症の世界的流行への反応に対する抗議</a> (<a href="http://www.wikidata.org/entity/Q91280428">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91493633">COVID-19に伴うウィキメディアの対応</a> (<a href="http://www.wikidata.org/entity/Q91493633">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91772177">COVID-19 pandemic in Bahraich district</a> (<a href="http://www.wikidata.org/entity/Q91772177">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91911563">impact of the COVID-19 pandemic on the performing arts</a> (<a href="http://www.wikidata.org/entity/Q91911563">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92150479">COVID-19パンデミックのジャーナリズムへの影響</a> (<a href="http://www.wikidata.org/entity/Q92150479">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92600442">Timeline of the COVID-19 pandemic in May 2020</a> (<a href="http://www.wikidata.org/entity/Q92600442">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92601059">timeline of the COVID-19 pandemic in 2019</a> (<a href="http://www.wikidata.org/entity/Q92601059">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q93593520">COVID-19パンデミックのファッション業界への影響</a> (<a href="http://www.wikidata.org/entity/Q93593520">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q93596977">Everything will be all right</a> (<a href="http://www.wikidata.org/entity/Q93596977">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q94096256">愛知県における新型コロナウイルス感染症の流行</a> (<a href="http://www.wikidata.org/entity/Q94096256">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q94141388">Responses to the COVID-19 pandemic in May 2020</a> (<a href="http://www.wikidata.org/entity/Q94141388">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q94320820">COVID-19パンデミックの影響</a> (<a href="http://www.wikidata.org/entity/Q94320820">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q94381343">Responses to the COVID-19 pandemic in February 2020</a> (<a href="http://www.wikidata.org/entity/Q94381343">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q94981621">Impact of the COVID-19 pandemic on healthcare workers</a> (<a href="http://www.wikidata.org/entity/Q94981621">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q94981718">impact of the COVID-19 pandemic on other health issues</a> (<a href="http://www.wikidata.org/entity/Q94981718">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q95982336">Global Pride</a> (<a href="http://www.wikidata.org/entity/Q95982336">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96048874">Timeline of the COVID-19 pandemic in June 2020</a> (<a href="http://www.wikidata.org/entity/Q96048874">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96058732">COVID-19パンデミックの食料への影響</a> (<a href="http://www.wikidata.org/entity/Q96058732">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96246183">COVID-19パンデミックへの対応</a> (<a href="http://www.wikidata.org/entity/Q96246183">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96336226">Q96336226</a> (<a href="http://www.wikidata.org/entity/Q96336226">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96401587">Responses to the COVID-19 pandemic in April 2020</a> (<a href="http://www.wikidata.org/entity/Q96401587">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96417973">COVID-19 pandemic in Bangsamoro</a> (<a href="http://www.wikidata.org/entity/Q96417973">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96419281">COVID-19の起源</a> (<a href="http://www.wikidata.org/entity/Q96419281">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96728989">timeline of the COVID-19 pandemic in July 2020</a> (<a href="http://www.wikidata.org/entity/Q96728989">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96731773">Responses to the COVID-19 pandemic in June 2020</a> (<a href="http://www.wikidata.org/entity/Q96731773">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96731877">Responses to the COVID-19 pandemic in July 2020</a> (<a href="http://www.wikidata.org/entity/Q96731877">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97208864">イスラエルにおけるCOVID-19パンデミックの影響</a> (<a href="http://www.wikidata.org/entity/Q97208864">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97357752">Covid Watch</a> (<a href="http://www.wikidata.org/entity/Q97357752">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97671359">2019-20年コロナウイルス感染症流行の間の国際援助</a> (<a href="http://www.wikidata.org/entity/Q97671359">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97736967">COVID-19 pandemic in Cuzco</a> (<a href="http://www.wikidata.org/entity/Q97736967">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97770079">Corona party</a> (<a href="http://www.wikidata.org/entity/Q97770079">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97861418">Responses to the COVID-19 pandemic in August 2020</a> (<a href="http://www.wikidata.org/entity/Q97861418">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97965631">timeline of the COVID-19 pandemic in August 2020</a> (<a href="http://www.wikidata.org/entity/Q97965631">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98404895">COVID-19パンデミックのカトリック教会への影響</a> (<a href="http://www.wikidata.org/entity/Q98404895">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98557220">COVID-19パンデミックの影響を受けたイベント</a> (<a href="http://www.wikidata.org/entity/Q98557220">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98704550">timeline of the COVID-19 pandemic in September 2020</a> (<a href="http://www.wikidata.org/entity/Q98704550">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q99228019">list of Indonesian health workers due to COVID-19</a> (<a href="http://www.wikidata.org/entity/Q99228019">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q99360983">COVAX</a> (<a href="http://www.wikidata.org/entity/Q99360983">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q99772823">timeline of the COVID-19 pandemic in October 2020</a> (<a href="http://www.wikidata.org/entity/Q99772823">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100152858">グレートバリントン宣言</a> (<a href="http://www.wikidata.org/entity/Q100152858">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101071358">timeline of the COVID-19 pandemic in November 2020</a> (<a href="http://www.wikidata.org/entity/Q101071358">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q103083123">timeline of the COVID-19 pandemic in December 2020</a> (<a href="http://www.wikidata.org/entity/Q103083123">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q103406861">Responses to the COVID-19 pandemic in September 2020</a> (<a href="http://www.wikidata.org/entity/Q103406861">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q103407338">Responses to the COVID-19 pandemic in October 2020</a> (<a href="http://www.wikidata.org/entity/Q103407338">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q103407878">Responses to the COVID-19 pandemic in November 2020</a> (<a href="http://www.wikidata.org/entity/Q103407878">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q103408251">Responses to the COVID-19 pandemic in December 2020</a> (<a href="http://www.wikidata.org/entity/Q103408251">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104604502">timeline of the COVID-19 pandemic in January 2021</a> (<a href="http://www.wikidata.org/entity/Q104604502">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104604512">Responses to the COVID-19 pandemic in January 2021</a> (<a href="http://www.wikidata.org/entity/Q104604512">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104676100">COVID-19ワクチンの展開</a> (<a href="http://www.wikidata.org/entity/Q104676100">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719130">COVID-19 pandemic in Baiyin</a> (<a href="http://www.wikidata.org/entity/Q104719130">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719184">COVID-19 pandemic in Baoding</a> (<a href="http://www.wikidata.org/entity/Q104719184">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719224">COVID-19 pandemic in Baicheng</a> (<a href="http://www.wikidata.org/entity/Q104719224">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719287">COVID-19 pandemic in Baoshan</a> (<a href="http://www.wikidata.org/entity/Q104719287">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719356">COVID-19 pandemic in Anshan</a> (<a href="http://www.wikidata.org/entity/Q104719356">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719373">COVID-19 pandemic in Anshun</a> (<a href="http://www.wikidata.org/entity/Q104719373">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719378">COVID-19 pandemic in Ankang</a> (<a href="http://www.wikidata.org/entity/Q104719378">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719391">COVID-19 pandemic in Baoji</a> (<a href="http://www.wikidata.org/entity/Q104719391">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719447">COVID-19 pandemic in Baoting Li and Miao Autonomous County</a> (<a href="http://www.wikidata.org/entity/Q104719447">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719468">COVID-19 pandemic in Anyang</a> (<a href="http://www.wikidata.org/entity/Q104719468">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719503">COVID-19 pandemic in Beihai</a> (<a href="http://www.wikidata.org/entity/Q104719503">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719508">COVID-19 pandemic in Baise</a> (<a href="http://www.wikidata.org/entity/Q104719508">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719550">COVID-19 pandemic in Bazhong</a> (<a href="http://www.wikidata.org/entity/Q104719550">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719578">COVID-19 pandemic in Banan District</a> (<a href="http://www.wikidata.org/entity/Q104719578">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719595">COVID-19 pandemic in Anqing</a> (<a href="http://www.wikidata.org/entity/Q104719595">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719686">COVID-19 pandemic in Baotou</a> (<a href="http://www.wikidata.org/entity/Q104719686">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719694">COVID-19 pandemic in Aksu Prefecture</a> (<a href="http://www.wikidata.org/entity/Q104719694">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719708">COVID-19 pandemic in Baodi District</a> (<a href="http://www.wikidata.org/entity/Q104719708">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719711">COVID-19 pandemic in Beichen District</a> (<a href="http://www.wikidata.org/entity/Q104719711">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719717">COVID-19 pandemic in Baoshan District</a> (<a href="http://www.wikidata.org/entity/Q104719717">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719730">COVID-19 pandemic in Alabama</a> (<a href="http://www.wikidata.org/entity/Q104719730">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719748">COVID-19 pandemic in Aleutians West Census Area</a> (<a href="http://www.wikidata.org/entity/Q104719748">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719772">COVID-19 pandemic in Abruzzo</a> (<a href="http://www.wikidata.org/entity/Q104719772">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719773">COVID-19 pandemic in Apulia</a> (<a href="http://www.wikidata.org/entity/Q104719773">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719782">COVID-19 pandemic in Basilicata</a> (<a href="http://www.wikidata.org/entity/Q104719782">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719789">COVID-19 pandemic in Aosta Valley</a> (<a href="http://www.wikidata.org/entity/Q104719789">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719910">COVID-19 pandemic in Antofagasta Region</a> (<a href="http://www.wikidata.org/entity/Q104719910">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719911">COVID-19 pandemic in Araucanía Region</a> (<a href="http://www.wikidata.org/entity/Q104719911">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719912">COVID-19 pandemic in Arica y Parinacota Region</a> (<a href="http://www.wikidata.org/entity/Q104719912">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719913">COVID-19 pandemic in Atacama Region</a> (<a href="http://www.wikidata.org/entity/Q104719913">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719914">COVID-19 pandemic in Aysén Region</a> (<a href="http://www.wikidata.org/entity/Q104719914">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719926">青森県における新型コロナウイルス感染症の流行</a> (<a href="http://www.wikidata.org/entity/Q104719926">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719929">秋田県における新型コロナウイルス感染症の流行</a> (<a href="http://www.wikidata.org/entity/Q104719929">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719969">COVID-19 pandemic in Amur Oblast</a> (<a href="http://www.wikidata.org/entity/Q104719969">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719970">COVID-19 pandemic in Astrakhan Oblast</a> (<a href="http://www.wikidata.org/entity/Q104719970">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104719979">COVID-19 pandemic in Altai Republic</a> (<a href="http://www.wikidata.org/entity/Q104719979">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720036">COVID-19 pandemic in Andhra Pradesh</a> (<a href="http://www.wikidata.org/entity/Q104720036">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720045">COVID-19 pandemic in Andaman and Nicobar Islands</a> (<a href="http://www.wikidata.org/entity/Q104720045">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720047">COVID-19 pandemic in Arunachal Pradesh</a> (<a href="http://www.wikidata.org/entity/Q104720047">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720051">COVID-19 pandemic in Baranya County</a> (<a href="http://www.wikidata.org/entity/Q104720051">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720100">COVID-19 pandemic in Aizpute Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720100">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720101">COVID-19 pandemic in Alsunga Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720101">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720120">COVID-19 pandemic in Aizkraukle Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720120">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720121">COVID-19 pandemic in Aknīste Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720121">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720122">COVID-19 pandemic in Auce Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720122">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720123">COVID-19 pandemic in Bauska Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720123">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720142">COVID-19 pandemic in Aglona Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720142">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720143">COVID-19 pandemic in Baltinava Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720143">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720144">COVID-19 pandemic in Balvi Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720144">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720163">COVID-19 pandemic in Alūksne Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720163">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720164">COVID-19 pandemic in Amata Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720164">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720165">COVID-19 pandemic in Ape Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720165">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720189">COVID-19 pandemic in Aloja Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720189">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720191">COVID-19 pandemic in Babīte Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720191">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720192">COVID-19 pandemic in Baldone Municipality</a> (<a href="http://www.wikidata.org/entity/Q104720192">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720237">COVID-19 pandemic in Artibonite</a> (<a href="http://www.wikidata.org/entity/Q104720237">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720252">COVID-19 pandemic in Alba County</a> (<a href="http://www.wikidata.org/entity/Q104720252">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720253">COVID-19 pandemic in Arad County</a> (<a href="http://www.wikidata.org/entity/Q104720253">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720254">COVID-19 pandemic in Argeș County</a> (<a href="http://www.wikidata.org/entity/Q104720254">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720255">COVID-19 pandemic in Bacău County</a> (<a href="http://www.wikidata.org/entity/Q104720255">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720289">COVID-19 pandemic in Aguascalientes</a> (<a href="http://www.wikidata.org/entity/Q104720289">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720290">COVID-19 pandemic in Baja California</a> (<a href="http://www.wikidata.org/entity/Q104720290">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720291">COVID-19 pandemic in Baja California Sur</a> (<a href="http://www.wikidata.org/entity/Q104720291">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720321">COVID-19 pandemic in Abia State</a> (<a href="http://www.wikidata.org/entity/Q104720321">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720322">COVID-19 pandemic in Adamawa State</a> (<a href="http://www.wikidata.org/entity/Q104720322">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720323">COVID-19 pandemic in Akwa Ibom State</a> (<a href="http://www.wikidata.org/entity/Q104720323">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720325">COVID-19 pandemic in Anambra State</a> (<a href="http://www.wikidata.org/entity/Q104720325">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720326">COVID-19 pandemic in Bauchi State</a> (<a href="http://www.wikidata.org/entity/Q104720326">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720327">COVID-19 pandemic in Bayelsa State</a> (<a href="http://www.wikidata.org/entity/Q104720327">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720359">COVID-19 pandemic in Azad Kashmir</a> (<a href="http://www.wikidata.org/entity/Q104720359">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720360">COVID-19 pandemic in Balochistan</a> (<a href="http://www.wikidata.org/entity/Q104720360">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720377">COVID-19 pandemic in Alta Verapaz Department</a> (<a href="http://www.wikidata.org/entity/Q104720377">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720378">COVID-19 pandemic in Baja Verapaz Department</a> (<a href="http://www.wikidata.org/entity/Q104720378">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720398">COVID-19 pandemic in Ahuachapán Department</a> (<a href="http://www.wikidata.org/entity/Q104720398">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104720413">COVID-19 pandemic in Aargau</a> (<a href="http://www.wikidata.org/entity/Q104720413">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104857913">Nasal vaccine</a> (<a href="http://www.wikidata.org/entity/Q104857913">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105116684">quarantine logbook</a> (<a href="http://www.wikidata.org/entity/Q105116684">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105186359">timeline of the COVID-19 pandemic in February 2021</a> (<a href="http://www.wikidata.org/entity/Q105186359">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105474669">Responses to the COVID-19 pandemic in February 2021</a> (<a href="http://www.wikidata.org/entity/Q105474669">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105546623">Zero Covid</a> (<a href="http://www.wikidata.org/entity/Q105546623">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105572027">COVID-19 pandemic in Austin, Texas</a> (<a href="http://www.wikidata.org/entity/Q105572027">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105724046">timeline of the COVID-19 pandemic in March 2021</a> (<a href="http://www.wikidata.org/entity/Q105724046">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105730136">Responses to the COVID-19 pandemic in March 2021</a> (<a href="http://www.wikidata.org/entity/Q105730136">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105966340">Statistics of the COVID-19 pandemic</a> (<a href="http://www.wikidata.org/entity/Q105966340">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106298799">ライブコマース</a> (<a href="http://www.wikidata.org/entity/Q106298799">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106347456">Responses to the COVID-19 pandemic in April 2021</a> (<a href="http://www.wikidata.org/entity/Q106347456">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106484890">timeline of the COVID-19 pandemic in April 2021</a> (<a href="http://www.wikidata.org/entity/Q106484890">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106892355">COVID-19 policy</a> (<a href="http://www.wikidata.org/entity/Q106892355">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106971802">2020–2023 global chip shortage</a> (<a href="http://www.wikidata.org/entity/Q106971802">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107088531">timeline of the COVID-19 pandemic in May 2021</a> (<a href="http://www.wikidata.org/entity/Q107088531">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107129120">COVID-19-related data</a> (<a href="http://www.wikidata.org/entity/Q107129120">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107143124">監視下にある変異株</a> (<a href="http://www.wikidata.org/entity/Q107143124">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107210990">COVID-19 and homelessness</a> (<a href="http://www.wikidata.org/entity/Q107210990">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107312048">COVID-19 pandemic in Entre Ríos</a> (<a href="http://www.wikidata.org/entity/Q107312048">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107312066">COVID-19 pandemic in Córdoba (Argentina)</a> (<a href="http://www.wikidata.org/entity/Q107312066">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107405004">timeline of the COVID-19 pandemic in June 2021</a> (<a href="http://www.wikidata.org/entity/Q107405004">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107863182">timeline of the COVID-19 pandemic in July 2021</a> (<a href="http://www.wikidata.org/entity/Q107863182">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q108378177">timeline of the COVID-19 pandemic in August 2021</a> (<a href="http://www.wikidata.org/entity/Q108378177">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q108495517">Q108495517</a> (<a href="http://www.wikidata.org/entity/Q108495517">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q108796241">timeline of the COVID-19 pandemic in September 2021</a> (<a href="http://www.wikidata.org/entity/Q108796241">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109236236">timeline of the COVID-19 pandemic in October 2021</a> (<a href="http://www.wikidata.org/entity/Q109236236">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109309949">timeline of the COVID-19 pandemic in November 2021</a> (<a href="http://www.wikidata.org/entity/Q109309949">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109502125">Q109502125</a> (<a href="http://www.wikidata.org/entity/Q109502125">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109569306">3G rule</a> (<a href="http://www.wikidata.org/entity/Q109569306">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109805104">Technical Advisory Group on SARS-CoV-2 Virus Evolution</a> (<a href="http://www.wikidata.org/entity/Q109805104">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109828957">2G-Regel</a> (<a href="http://www.wikidata.org/entity/Q109828957">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109973334">timeline of the COVID-19 pandemic in December 2021</a> (<a href="http://www.wikidata.org/entity/Q109973334">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109995308">Resolution 2361 (2021) Covid-19 vaccines: ethical, legal and practical considerations</a> (<a href="http://www.wikidata.org/entity/Q109995308">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110015070">Coronavirus Structural Task Force</a> (<a href="http://www.wikidata.org/entity/Q110015070">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110115947">ウィズコロナ</a> (<a href="http://www.wikidata.org/entity/Q110115947">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110271706">The Bloomberg Cubid 19 Immunity Index</a> (<a href="http://www.wikidata.org/entity/Q110271706">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110361801">timeline of the COVID-19 pandemic in January 2022</a> (<a href="http://www.wikidata.org/entity/Q110361801">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110392239">ゼロコロナ</a> (<a href="http://www.wikidata.org/entity/Q110392239">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110923270">Q110923270</a> (<a href="http://www.wikidata.org/entity/Q110923270">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110983443">Q110983443</a> (<a href="http://www.wikidata.org/entity/Q110983443">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q111181370">timeline of the COVID-19 pandemic in February 2022</a> (<a href="http://www.wikidata.org/entity/Q111181370">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q111956055">timeline of the COVID-19 pandemic in April 2022</a> (<a href="http://www.wikidata.org/entity/Q111956055">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q111956133">timeline of the COVID-19 pandemic in March 2022</a> (<a href="http://www.wikidata.org/entity/Q111956133">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q112221722">timeline of the COVID-19 pandemic in May 2022</a> (<a href="http://www.wikidata.org/entity/Q112221722">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q112396522">timeline of the COVID-19 pandemic in June 2022</a> (<a href="http://www.wikidata.org/entity/Q112396522">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q112869052">timeline of the COVID-19 pandemic in July 2022</a> (<a href="http://www.wikidata.org/entity/Q112869052">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q113379917">timeline of the COVID-19 pandemic in August 2022</a> (<a href="http://www.wikidata.org/entity/Q113379917">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q113870898">timeline of the COVID-19 pandemic in September 2022</a> (<a href="http://www.wikidata.org/entity/Q113870898">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q114345283">timeline of the COVID-19 pandemic in October 2022</a> (<a href="http://www.wikidata.org/entity/Q114345283">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q116547134">Timeline of the COVID-19 pandemic in February 2023</a> (<a href="http://www.wikidata.org/entity/Q116547134">edit</a>)</td>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/facets.rq | sed 's+<lang/>+ja+' > facets.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@facets.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
