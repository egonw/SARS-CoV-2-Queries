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
[run](https://query.wikidata.org/embed.html#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ82069695%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%20LIMIT%2010%0A) or [edit](https://query.wikidata.org/#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ82069695%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%20LIMIT%2010%0A)


### Output
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>doi</b></td>
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
    <td>2020-04-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q91240154">Low-dose corticosteroid therapy does not delay viral clearance in patients with COVID-19</a> (<a href="http://www.wikidata.org/entity/Q91240154">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JINF.2020.03.039">10.1016/J.JINF.2020.03.039</a></td>
  </tr>
  <tr>
    <td>2020-04-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q91131712">The COVID-19 vaccine development landscape</a> (<a href="http://www.wikidata.org/entity/Q91131712">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/D41573-020-00073-5">10.1038/D41573-020-00073-5</a></td>
  </tr>
  <tr>
    <td>2020-04-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83567432">Coronavirus latest: global infections surge past 30,000</a> (<a href="http://www.wikidata.org/entity/Q83567432">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/D41586-020-00154-W">10.1038/D41586-020-00154-W</a></td>
  </tr>
  <tr>
    <td>2020-04-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q91208180">Highly pathogenic coronavirus N protein aggravates lung injury by MASP-2-mediated complement over-activation</a> (<a href="http://www.wikidata.org/entity/Q91208180">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.29.20041962">10.1101/2020.03.29.20041962</a></td>
  </tr>
  <tr>
    <td>2020-04-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89649999">The Three Steps Needed to End the COVID-19 Pandemic: Bold Public Health Leadership, Rapid Innovations, and Courageous Political Will</a> (<a href="http://www.wikidata.org/entity/Q89649999">edit</a>)</td>
    <td><a href="https://doi.org/10.2196/19043">10.2196/19043</a></td>
  </tr>
  <tr>
    <td>2020-04-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89354634">Respiratory virus shedding in exhaled breath and efficacy of face masks</a> (<a href="http://www.wikidata.org/entity/Q89354634">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41591-020-0843-2">10.1038/S41591-020-0843-2</a></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o litSARSCoV2.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litSARSCoV2.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litSARSCoV2.rq
```
This SPARQL query is available under CCZero.
