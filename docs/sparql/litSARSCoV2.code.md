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
    <td><b>workLabel</b></td>
    <td><b>doi</b></td>
  </tr>
  <tr>
    <td>2020-12-01T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87461271</td>
    <td>Timely development of vaccines against SARS-CoV-2</td>
    <td>10.1080/22221751.2020.1737580</td>
  </tr>
  <tr>
    <td>2020-06-01T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87461293</td>
    <td>The novel Coronavirus (SARS-CoV-2) is a one health issue</td>
    <td>10.1016/J.ONEHLT.2020.100123</td>
  </tr>
  <tr>
    <td>2020-05-17T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87461449</td>
    <td>Potential Presymptomatic Transmission of SARS-CoV-2, Zhejiang Province, China, 2020</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-05-17T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87461585</td>
    <td>Risk for Transportation of 2019 Novel Coronavirus Disease from Wuhan to Other Cities in China</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-04-01T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87461794</td>
    <td>CT Imaging of the 2019 Novel Coronavirus (2019-nCoV) Pneumonia</td>
    <td>10.1148/RADIOL.2020200236</td>
  </tr>
  <tr>
    <td>2020-04-01T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87945074</td>
    <td>Enteric involvement of coronaviruses: is faecal–oral transmission of SARS-CoV-2 possible?</td>
    <td>10.1016/S2468-1253(20)30048-0</td>
  </tr>
  <tr>
    <td>2020-03-19T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q88094851</td>
    <td>Estimating clinical severity of COVID-19 from the transmission dynamics in Wuhan, China</td>
    <td>10.1038/S41591-020-0822-7</td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87995005</td>
    <td>1.80 Angstrom Resolution Crystal Structure of NSP16 - NSP10 Complex from SARS-CoV-2</td>
    <td>10.2210/PDB6W4H/PDB</td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q88048219</td>
    <td>Crystal structure of SARS-CoV-2 nucleocapsid protein N-terminal RNA binding domain</td>
    <td>10.2210/PDB6M3M/PDB</td>
  </tr>
  <tr>
    <td>2020-03-17T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87830056</td>
    <td>The proximal origin of SARS-CoV-2</td>
    <td>10.1038/S41591-020-0820-9</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o litSARSCoV2.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litSARSCoV2.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litSARSCoV2.rq
```
This SPARQL query is available under CCZero.
