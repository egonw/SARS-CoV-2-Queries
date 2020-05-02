# litSARSCoV2.rq
**コード例:** [curl](#curl)
### SPARQL
```sparql
SELECT (MAX(?dates) as ?date) ?work ?workLabel ?doi WHERE {
  ?work wdt:P921 wd:Q82069695 .
  OPTIONAL { ?work wdt:P577 ?dates . }
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
} GROUP BY ?work ?workLabel ?doi ORDER BY DESC(?date) LIMIT 10
```
[実行](https://query.wikidata.org/embed.html#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ82069695%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%20LIMIT%2010%0A) もしくは [編集](https://query.wikidata.org/#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ82069695%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%20LIMIT%2010%0A)


### 結果
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>doi</b></td>
  </tr>
  <tr>
    <td>2020-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90502868">Hypothesis for potential pathogenesis of SARS-CoV-2 infection-a review of immune changes in patients with viral pneumonia</a> (<a href="http://www.wikidata.org/entity/Q90502868">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1746199">10.1080/22221751.2020.1746199</a></td>
  </tr>
  <tr>
    <td>2020-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90617531">Establishment and validation of a pseudovirus neutralization assay for SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q90617531">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1743767">10.1080/22221751.2020.1743767</a></td>
  </tr>
  <tr>
    <td>2020-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89991818">High Contagiousness and Rapid Spread of Severe Acute Respiratory Syndrome Coronavirus 2</a> (<a href="http://www.wikidata.org/entity/Q89991818">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461293">The novel Coronavirus (SARS-CoV-2) is a one health issue</a> (<a href="http://www.wikidata.org/entity/Q87461293">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ONEHLT.2020.100123">10.1016/J.ONEHLT.2020.100123</a></td>
  </tr>
  <tr>
    <td>2020-05-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461449">Potential Presymptomatic Transmission of SARS-CoV-2, Zhejiang Province, China, 2020</a> (<a href="http://www.wikidata.org/entity/Q87461449">edit</a>)</td>
    <td><a href="https://doi.org/10.3201/EID2605.200198">10.3201/EID2605.200198</a></td>
  </tr>
  <tr>
    <td>2020-05-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461585">Risk for Transportation of 2019 Novel Coronavirus Disease from Wuhan to Other Cities in China</a> (<a href="http://www.wikidata.org/entity/Q87461585">edit</a>)</td>
    <td><a href="https://doi.org/10.3201/EID2605.200146">10.3201/EID2605.200146</a></td>
  </tr>
  <tr>
    <td>2020-04-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q92331110">How is immunosuppressive status affecting children and adults in SARS-CoV-2 infection? A systematic review</a> (<a href="http://www.wikidata.org/entity/Q92331110">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JINF.2020.04.026">10.1016/J.JINF.2020.04.026</a></td>
  </tr>
  <tr>
    <td>2020-04-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q92081137">COVID19 during pregnancy: a systematic review of reported cases</a> (<a href="http://www.wikidata.org/entity/Q92081137">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.AJOG.2020.04.013">10.1016/J.AJOG.2020.04.013</a></td>
  </tr>
  <tr>
    <td>2020-04-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q92051692">Clinical characteristics and diagnostic challenges of pediatric COVID-19: A systematic review and meta-analysis</a> (<a href="http://www.wikidata.org/entity/Q92051692">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JFMA.2020.04.007">10.1016/J.JFMA.2020.04.007</a></td>
  </tr>
  <tr>
    <td>2020-04-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90690739">SARS-CoV-2: a storm is raging</a> (<a href="http://www.wikidata.org/entity/Q90690739">edit</a>)</td>
    <td><a href="https://doi.org/10.1172/JCI137647">10.1172/JCI137647</a></td>
  </tr>
</table>
## コード例
### curl
```shell
curl -o litSARSCoV2.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litSARSCoV2.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litSARSCoV2.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
