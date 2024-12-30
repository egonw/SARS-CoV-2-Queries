# litSARSCoV2Variants.rq
**コード例:** [curl](#curl)
### SPARQL
```sparql
#defaultView:BarChart
SELECT ?variant ?variantLabel (COUNT(?work) AS ?count) WHERE {
  ?variant wdt:P31 wd:Q104450895 .
  ?work wdt:P921 ?variant .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
} GROUP BY ?variant ?variantLabel
  ORDER BY ASC(?variantLabel)
```
[実行](https://query.wikidata.org/embed.html#%23defaultView%3ABarChart%0ASELECT%20%3Fvariant%20%3FvariantLabel%20%28COUNT%28%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fvariant%20wdt%3AP31%20wd%3AQ104450895%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fvariant%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fvariant%20%3FvariantLabel%0A%20%20ORDER%20BY%20ASC%28%3FvariantLabel%29%0A) もしくは [編集](https://query.wikidata.org/#%23defaultView%3ABarChart%0ASELECT%20%3Fvariant%20%3FvariantLabel%20%28COUNT%28%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fvariant%20wdt%3AP31%20wd%3AQ104450895%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fvariant%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fvariant%20%3FvariantLabel%0A%20%20ORDER%20BY%20ASC%28%3FvariantLabel%29%0A)


### 結果
<table>
  <tr>
    <td><b>variant</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110488017">Deltacron</a> (<a href="http://www.wikidata.org/entity/Q110488017">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171244">Lineage B.1.1.7 with E484K</a> (<a href="http://www.wikidata.org/entity/Q106171244">edit</a>)</td>
    <td>64</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171118">Lineage B.1.427</a> (<a href="http://www.wikidata.org/entity/Q106171118">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106809407">Lineage B.1.620</a> (<a href="http://www.wikidata.org/entity/Q106809407">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
    <td>87</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104400171">SARS-CoV-2 Beta variant</a> (<a href="http://www.wikidata.org/entity/Q104400171">edit</a>)</td>
    <td>33</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q108004869">SARS-CoV-2 Delta plus variant</a> (<a href="http://www.wikidata.org/entity/Q108004869">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107055182">SARS-CoV-2 Delta variant</a> (<a href="http://www.wikidata.org/entity/Q107055182">edit</a>)</td>
    <td>18</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104819269">SARS-CoV-2 Gamma variant</a> (<a href="http://www.wikidata.org/entity/Q104819269">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106592103">SARS-CoV-2 Iota variant</a> (<a href="http://www.wikidata.org/entity/Q106592103">edit</a>)</td>
    <td>6</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107055239">SARS-CoV-2 Kappa variant</a> (<a href="http://www.wikidata.org/entity/Q107055239">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107291621">SARS-CoV-2 Lambda variant</a> (<a href="http://www.wikidata.org/entity/Q107291621">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110101454">SARS-CoV-2 Lineage AY.4.2</a> (<a href="http://www.wikidata.org/entity/Q110101454">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109747616">SARS-CoV-2 Lineage B.1.1.519</a> (<a href="http://www.wikidata.org/entity/Q109747616">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109747618">SARS-CoV-2 Lineage B.1.214.2</a> (<a href="http://www.wikidata.org/entity/Q109747618">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171144">SARS-CoV-2 Lineage B.1.429</a> (<a href="http://www.wikidata.org/entity/Q106171144">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110497086">SARS-CoV-2 Lineage BA.1</a> (<a href="http://www.wikidata.org/entity/Q110497086">edit</a>)</td>
    <td>9</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110497087">SARS-CoV-2 Lineage BA.2</a> (<a href="http://www.wikidata.org/entity/Q110497087">edit</a>)</td>
    <td>8</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q111686845">SARS-CoV-2 Lineage BA.2.12.1</a> (<a href="http://www.wikidata.org/entity/Q111686845">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110811149">SARS-CoV-2 Lineage BA.3</a> (<a href="http://www.wikidata.org/entity/Q110811149">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q111685971">SARS-CoV-2 Lineage BA.4</a> (<a href="http://www.wikidata.org/entity/Q111685971">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q111685986">SARS-CoV-2 Lineage BA.5</a> (<a href="http://www.wikidata.org/entity/Q111685986">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q115982879">SARS-CoV-2 Lineage BQ.1</a> (<a href="http://www.wikidata.org/entity/Q115982879">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109710954">SARS-CoV-2 Lineage C.1.2</a> (<a href="http://www.wikidata.org/entity/Q109710954">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109747614">SARS-CoV-2 Lineage R.1</a> (<a href="http://www.wikidata.org/entity/Q109747614">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109739412">SARS-CoV-2 Omicron variant</a> (<a href="http://www.wikidata.org/entity/Q109739412">edit</a>)</td>
    <td>58</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107055212">SARS-CoV-2 Zeta variant</a> (<a href="http://www.wikidata.org/entity/Q107055212">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106581308">SARS-CoV-2 lineage B.1.617</a> (<a href="http://www.wikidata.org/entity/Q106581308">edit</a>)</td>
    <td>12</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110036883">SARS-CoV-2 lineage B.1.640.2</a> (<a href="http://www.wikidata.org/entity/Q110036883">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q115983022">SARS-CoV-2 lineage XBB.1</a> (<a href="http://www.wikidata.org/entity/Q115983022">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q116069911">SARS-CoV-2 lineage XBB.1.5</a> (<a href="http://www.wikidata.org/entity/Q116069911">edit</a>)</td>
    <td>1</td>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litSARSCoV2Variants.rq | sed 's+<lang/>+ja+' > litSARSCoV2Variants.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litSARSCoV2Variants.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
