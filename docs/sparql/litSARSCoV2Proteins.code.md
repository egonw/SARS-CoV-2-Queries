# litSARSCoV2Proteins.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT (MAX(?dates) as ?date) ?work ?workLabel ?doi WHERE {
  ?protein wdt:P703 wd:Q82069695 ; wdt:P31 wd:Q8054 .
  ?work wdt:P921 ?protein .
  OPTIONAL { ?work wdt:P577 ?dates . }
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,da,de,es,fr,jp,nl,no,ru,sv,zh". }
} GROUP BY ?work ?workLabel ?doi ORDER BY DESC(?date) LIMIT 10
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fprotein%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%20LIMIT%2010%0A) or [Edit](https://query.wikidata.org/#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fprotein%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%20LIMIT%2010%0A)


### Output
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>doi</b></td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88048219">Crystal structure of SARS-CoV-2 nucleocapsid protein N-terminal RNA binding domain</a> (<a href="http://www.wikidata.org/entity/Q88048219">edit</a>)</td>
    <td>10.2210/PDB6M3M/PDB</td>
  </tr>
  <tr>
    <td>2020-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87973551">Structure, Function, and Antigenicity of the SARS-CoV-2 Spike Glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87973551">edit</a>)</td>
    <td>10.1016/J.CELL.2020.02.058</td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461535">Potent binding of 2019 novel coronavirus spike protein by a SARS coronavirus-specific human monoclonal antibody</a> (<a href="http://www.wikidata.org/entity/Q87461535">edit</a>)</td>
    <td>10.1080/22221751.2020.1729069</td>
  </tr>
  <tr>
    <td>2020-01-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84112018">Uncanny similarity of unique inserts in the 2019-nCoV spike protein to HIV-1 gp120 and Gag</a> (<a href="http://www.wikidata.org/entity/Q84112018">edit</a>)</td>
    <td>10.1101/2020.01.30.927871</td>
  </tr>
  <tr>
    <td>2020-01-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83500392">Homologous recombination within the spike glycoprotein of the newly identified coronavirus may boost cross-species transmission from snake to human</a> (<a href="http://www.wikidata.org/entity/Q83500392">edit</a>)</td>
    <td></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o litSARSCoV2Proteins.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litSARSCoV2Proteins.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litSARSCoV2Proteins.rq
```
This SPARQL query is available under CCZero.
