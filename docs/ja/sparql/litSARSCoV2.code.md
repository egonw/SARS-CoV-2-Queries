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
    <td><a href="https://tools.wmflabs.org/scholia/Q90625396">Clinical observation and management of COVID-19 patients</a> (<a href="http://www.wikidata.org/entity/Q90625396">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1741327">10.1080/22221751.2020.1741327</a></td>
  </tr>
  <tr>
    <td>2020-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90625688">The different clinical characteristics of corona virus disease cases between children and their families in China - the character of children with COVID-19</a> (<a href="http://www.wikidata.org/entity/Q90625688">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1744483">10.1080/22221751.2020.1744483</a></td>
  </tr>
  <tr>
    <td>2020-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90454781">COVID-19: What implications for sexual and reproductive health and rights globally?</a> (<a href="http://www.wikidata.org/entity/Q90454781">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/26410397.2020.1746065">10.1080/26410397.2020.1746065</a></td>
  </tr>
  <tr>
    <td>2020-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90502868">Hypothesis for potential pathogenesis of SARS-CoV-2 infection-a review of immune changes in patients with viral pneumonia</a> (<a href="http://www.wikidata.org/entity/Q90502868">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1746199">10.1080/22221751.2020.1746199</a></td>
  </tr>
  <tr>
    <td>2020-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90757765">Renin-angiotensin system inhibitors improve the clinical outcomes of COVID-19 patients with hypertension</a> (<a href="http://www.wikidata.org/entity/Q90757765">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1746200">10.1080/22221751.2020.1746200</a></td>
  </tr>
  <tr>
    <td>2020-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90757778">Transcriptomic characteristics of bronchoalveolar lavage fluid and peripheral blood mononuclear cells in COVID-19 patients</a> (<a href="http://www.wikidata.org/entity/Q90757778">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1747363">10.1080/22221751.2020.1747363</a></td>
  </tr>
  <tr>
    <td>2020-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90617531">Establishment and validation of a pseudovirus neutralization assay for SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q90617531">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1743767">10.1080/22221751.2020.1743767</a></td>
  </tr>
  <tr>
    <td>2020-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q94544087">Lack of cross-neutralization by SARS patient sera towards SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q94544087">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1761267">10.1080/22221751.2020.1761267</a></td>
  </tr>
  <tr>
    <td>2020-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89991818">High Contagiousness and Rapid Spread of Severe Acute Respiratory Syndrome Coronavirus 2</a> (<a href="http://www.wikidata.org/entity/Q89991818">edit</a>)</td>
    <td><a href="https://doi.org/10.3201/EID2607.200282">10.3201/EID2607.200282</a></td>
  </tr>
  <tr>
    <td>2020-06-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89969479">COVID-19 in 2 Persons with Mild Upper Respiratory Symptoms on a Cruise Ship, Japan</a> (<a href="http://www.wikidata.org/entity/Q89969479">edit</a>)</td>
    <td><a href="https://doi.org/10.3201/EID2606.200452">10.3201/EID2606.200452</a></td>
  </tr>
</table>
## コード例
### curl
```shell
curl -o litSARSCoV2.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litSARSCoV2.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litSARSCoV2.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
