# wikipediaOnMap.rq
**コード例:** [curl](#curl)
### SPARQL
```sparql
#defaultView:Map
SELECT DISTINCT ?wpArticle ?itemLabel ?coord WHERE {
  ?wpArticle a schema:Article ;
    schema:about ?item ;
    schema:isPartOf <https://ja.wikipedia.org/> .
  ?item p:P31 [ ps:P31 wd:Q3241045 ; pq:P642 wd:Q84263196 ] ;
    wdt:P625 ?coord ;
    rdfs:label ?itemLabel . FILTER(LANG(?itemLabel)="ja")
}
```
[実行](https://query.wikidata.org/embed.html#%23defaultView%3AMap%0ASELECT%20DISTINCT%20%3FwpArticle%20%3FitemLabel%20%3Fcoord%20WHERE%20%7B%0A%20%20%3FwpArticle%20a%20schema%3AArticle%20%3B%0A%20%20%20%20schema%3Aabout%20%3Fitem%20%3B%0A%20%20%20%20schema%3AisPartOf%20%3Chttps%3A%2F%2Fja.wikipedia.org%2F%3E%20.%0A%20%20%3Fitem%20p%3AP31%20%5B%20ps%3AP31%20wd%3AQ3241045%20%3B%20pq%3AP642%20wd%3AQ84263196%20%5D%20%3B%0A%20%20%20%20wdt%3AP625%20%3Fcoord%20%3B%0A%20%20%20%20rdfs%3Alabel%20%3FitemLabel%20.%20FILTER%28LANG%28%3FitemLabel%29%3D%22ja%22%29%0A%7D%0A) もしくは [編集](https://query.wikidata.org/#%23defaultView%3AMap%0ASELECT%20DISTINCT%20%3FwpArticle%20%3FitemLabel%20%3Fcoord%20WHERE%20%7B%0A%20%20%3FwpArticle%20a%20schema%3AArticle%20%3B%0A%20%20%20%20schema%3Aabout%20%3Fitem%20%3B%0A%20%20%20%20schema%3AisPartOf%20%3Chttps%3A%2F%2Fja.wikipedia.org%2F%3E%20.%0A%20%20%3Fitem%20p%3AP31%20%5B%20ps%3AP31%20wd%3AQ3241045%20%3B%20pq%3AP642%20wd%3AQ84263196%20%5D%20%3B%0A%20%20%20%20wdt%3AP625%20%3Fcoord%20%3B%0A%20%20%20%20rdfs%3Alabel%20%3FitemLabel%20.%20FILTER%28LANG%28%3FitemLabel%29%3D%22ja%22%29%0A%7D%0A)


### 結果
<table>
  <tr>
    <td><b>wpArticle</b></td>
    <td><b>coord</b></td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E3%82%A4%E3%83%A9%E3%83%B3%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(53.0 32.0)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E9%9F%93%E5%9B%BD%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(128.0 36.0)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E3%82%A4%E3%82%BF%E3%83%AA%E3%82%A2%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(12.5 42.5)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E3%82%B9%E3%83%9A%E3%82%A4%E3%83%B3%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(-3.0 40.0)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E5%8D%97%E6%A5%B5%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(-57.8875 -63.320833333)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E5%8C%97%E6%9C%9D%E9%AE%AE%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(127.0 40.0)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E3%83%99%E3%83%88%E3%83%8A%E3%83%A0%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(108.0 16.0)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E3%82%BF%E3%82%A4%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(101.0 14.0)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E3%82%B9%E3%82%A6%E3%82%A7%E3%83%BC%E3%83%87%E3%83%B3%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(15.0 61.0)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E3%82%AA%E3%83%BC%E3%82%B9%E3%83%88%E3%83%AA%E3%82%A2%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(14.0 48.0)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E3%83%89%E3%82%A4%E3%83%84%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(10.0 51.0)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E4%B8%AD%E5%9B%BD%E6%9C%AC%E5%9C%9F%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(103.0 35.0)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E3%82%AA%E3%82%BB%E3%82%A2%E3%83%8B%E3%82%A2%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(166.0 -21.0)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E3%82%A4%E3%82%AE%E3%83%AA%E3%82%B9%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(-2.0 54.6)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E3%83%9E%E3%82%AB%E3%82%AA%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(113.55 22.166666666)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E9%A6%99%E6%B8%AF%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(114.166666666 22.283333333)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E3%83%8B%E3%83%A5%E3%83%BC%E3%83%A8%E3%83%BC%E3%82%AF%E5%B8%82%E3%81%A7%E3%81%AE_COVID-19%E3%83%91%E3%83%B3%E3%83%87%E3%83%9F%E3%83%83%E3%82%AF</td>
    <td>Point(-73.94 40.67)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E3%82%A2%E3%83%95%E3%83%AA%E3%82%AB%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(17.0 1.0)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E5%8D%97%E5%8C%97%E3%82%A2%E3%83%A1%E3%83%AA%E3%82%AB%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(-100.0 20.0)</td>
  </tr>
  <tr>
    <td>https://ja.wikipedia.org/wiki/%E6%97%A5%E6%9C%AC%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B2019%E5%B9%B4%E3%82%B3%E3%83%AD%E3%83%8A%E3%82%A6%E3%82%A4%E3%83%AB%E3%82%B9%E6%84%9F%E6%9F%93%E7%97%87%E3%81%AE%E6%B5%81%E8%A1%8C%E7%8A%B6%E6%B3%81</td>
    <td>Point(136.0 35.0)</td>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/wikipediaOnMap.rq | sed 's+<lang/>+ja+' > wikipediaOnMap.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@wikipediaOnMap.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
