# litCoronaviruses.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT (MAX(?dates) as ?date) ?work ?workLabel ?doi WHERE {
  ?work wdt:P921 wd:Q57751738 .
  OPTIONAL { ?work wdt:P577 ?dates . }
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
} GROUP BY ?work ?workLabel ?doi ORDER BY DESC(?date)
```
[run](https://query.wikidata.org/embed.html#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ57751738%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%0A) or [edit](https://query.wikidata.org/#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ57751738%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%0A)


### Output
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>doi</b></td>
  </tr>
  <tr>
    <td>2021-04-26</td>
    <td><a href="https://scholia.toolforge.org/Q107296589">Fundamental evolution of all Orthocoronavirinae including three deadly lineages descendent from Chiroptera‐hosted coronaviruses: SARS‐CoV, MERS‐CoV and SARS‐CoV‐2</a> (<a href="http://www.wikidata.org/entity/Q107296589">edit</a>)</td>
    <td><a href="https://doi.org/10.1111/CLA.12454">10.1111/CLA.12454</a></td>
  </tr>
  <tr>
    <td>2020-04-01</td>
    <td><a href="https://scholia.toolforge.org/Q87675797">[Recommendations for critically ill patients with COVID-19]</a> (<a href="http://www.wikidata.org/entity/Q87675797">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S00063-020-00674-3">10.1007/S00063-020-00674-3</a></td>
  </tr>
  <tr>
    <td>2020-03-27</td>
    <td><a href="https://scholia.toolforge.org/Q89046119">A new threat from an old enemy: Re‑emergence of coronavirus (Review)</a> (<a href="http://www.wikidata.org/entity/Q89046119">edit</a>)</td>
    <td><a href="https://doi.org/10.3892/IJMM.2020.4555">10.3892/IJMM.2020.4555</a></td>
  </tr>
  <tr>
    <td>2020-02-26</td>
    <td><a href="https://scholia.toolforge.org/Q88182256">Potential Rapid Diagnostics, Vaccine and Therapeutics for 2019 Novel Coronavirus (2019-nCoV): A Systematic Review</a> (<a href="http://www.wikidata.org/entity/Q88182256">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/JCM9030623">10.3390/JCM9030623</a></td>
  </tr>
  <tr>
    <td>2020-02-14</td>
    <td><a href="https://scholia.toolforge.org/Q88485680">The First Disease X is Caused by a Highly Transmissible Acute Respiratory Syndrome Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q88485680">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S12250-020-00206-5">10.1007/S12250-020-00206-5</a></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litCoronaviruses.rq | sed 's+<lang/>+pt+' > litCoronaviruses.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litCoronaviruses.rq
```
This SPARQL query is available under CCZero.
