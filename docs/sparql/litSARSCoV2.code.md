# litSARSCoV2.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT (MAX(?dates) as ?date) ?work ?workLabel ?doi WHERE {
  ?work wdt:P921 wd:Q82069695 .
  OPTIONAL { ?work wdt:P577 ?dates . }
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,da,de,es,fr,jp,nl,no,ru,sv,zh". }
} GROUP BY ?work ?workLabel ?doi ORDER BY DESC(?date) LIMIT 10
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ82069695%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%20LIMIT%2010%0A) or [Edit](https://query.wikidata.org/#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ82069695%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%20LIMIT%2010%0A)


### Output
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>doi</b></td>
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
    <td>2020-04-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89354634">Respiratory virus shedding in exhaled breath and efficacy of face masks</a> (<a href="http://www.wikidata.org/entity/Q89354634">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41591-020-0843-2">10.1038/S41591-020-0843-2</a></td>
  </tr>
  <tr>
    <td>2020-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461794">CT Imaging of the 2019 Novel Coronavirus (2019-nCoV) Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q87461794">edit</a>)</td>
    <td><a href="https://doi.org/10.1148/RADIOL.2020200236">10.1148/RADIOL.2020200236</a></td>
  </tr>
  <tr>
    <td>2020-03-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88979047">Correlation between universal BCG vaccination policy and reduced morbidity and mortality for COVID-19: an epidemiological study</a> (<a href="http://www.wikidata.org/entity/Q88979047">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.24.20042937">10.1101/2020.03.24.20042937</a></td>
  </tr>
  <tr>
    <td>2020-03-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88979098">Modeling of Severe Acute Respiratory Syndrome Coronavirus 2 (SARS-CoV-2) Proteins by Machine Learning and Physics-Based Refinement</a> (<a href="http://www.wikidata.org/entity/Q88979098">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.25.008904">10.1101/2020.03.25.008904</a></td>
  </tr>
  <tr>
    <td>2020-03-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88979226">Structure-Based Design, Synthesis and Biological Evaluation of Peptidomimetic Aldehydes as a Novel Series of Antiviral Drug Candidates Targeting the SARS-CoV-2 Main Protease</a> (<a href="http://www.wikidata.org/entity/Q88979226">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.25.996348">10.1101/2020.03.25.996348</a></td>
  </tr>
  <tr>
    <td>2020-03-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88979241">Design of potent membrane fusion inhibitors against SARS-CoV-2, an emerging coronavirus with high fusogenic activity</a> (<a href="http://www.wikidata.org/entity/Q88979241">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.26.009233">10.1101/2020.03.26.009233</a></td>
  </tr>
  <tr>
    <td>2020-03-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88979253">Re-analysis of SARS-CoV-2 infected host cell proteomics time-course data by impact pathway analysis and network analysis. A potential link with inflammatory response.</a> (<a href="http://www.wikidata.org/entity/Q88979253">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.26.009605">10.1101/2020.03.26.009605</a></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o litSARSCoV2.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litSARSCoV2.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litSARSCoV2.rq
```
This SPARQL query is available under CCZero.
