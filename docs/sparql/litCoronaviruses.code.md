# litCoronaviruses.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT (MAX(?dates) as ?date) ?work ?workLabel ?doi WHERE {
  ?work wdt:P921 wd:Q57751738 .
  OPTIONAL { ?work wdt:P577 ?dates . }
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,da,de,es,fr,jp,nl,no,ru,sv,zh". }
} GROUP BY ?work ?workLabel ?doi ORDER BY DESC(?date) LIMIT 10
```
[run](https://query.wikidata.org/embed.html#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ57751738%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%20LIMIT%2010%0A) or [edit](https://query.wikidata.org/#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ57751738%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%20LIMIT%2010%0A)


### Output
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>doi</b></td>
  </tr>
  <tr>
    <td>2020-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87675797">[Recommendations for critically ill patients with COVID-19]</a> (<a href="http://www.wikidata.org/entity/Q87675797">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S00063-020-00674-3">10.1007/S00063-020-00674-3</a></td>
  </tr>
  <tr>
    <td>2020-03-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89046119">A new threat from an old enemy: Re‑emergence of coronavirus (Review)</a> (<a href="http://www.wikidata.org/entity/Q89046119">edit</a>)</td>
    <td><a href="https://doi.org/10.3892/IJMM.2020.4555">10.3892/IJMM.2020.4555</a></td>
  </tr>
  <tr>
    <td>2020-02-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88182256">Potential Rapid Diagnostics, Vaccine and Therapeutics for 2019 Novel Coronavirus (2019-nCoV): A Systematic Review</a> (<a href="http://www.wikidata.org/entity/Q88182256">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/JCM9030623">10.3390/JCM9030623</a></td>
  </tr>
  <tr>
    <td>2020-02-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88485680">The First Disease X is Caused by a Highly Transmissible Acute Respiratory Syndrome Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q88485680">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S12250-020-00206-5">10.1007/S12250-020-00206-5</a></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o litCoronaviruses.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litCoronaviruses.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litCoronaviruses.rq
```
This SPARQL query is available under CCZero.
