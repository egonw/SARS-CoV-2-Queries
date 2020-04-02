# pathways.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?thing ?thingLabel ?pathway ?pathwayLabel WHERE {
  VALUES ?virus {
    wd:Q82069695 # SARS-CoV-2
    wd:Q16983360 # HKU1
    wd:Q16991954 # OC43
    wd:Q8351095  # NL63 
    wd:Q16983356 # 229E
    wd:Q4902157  # MERS-CoV
    wd:Q278567   # SARS-CoV
  }
  ?thing wdt:P703 ?virus .
  ?pathway wdt:P31 wd:Q4915012 ; wdt:P527 ?thing .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fthing%20%3FthingLabel%20%3Fpathway%20%3FpathwayLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fthing%20wdt%3AP703%20%3Fvirus%20.%0A%20%20%3Fpathway%20wdt%3AP31%20wd%3AQ4915012%20%3B%20wdt%3AP527%20%3Fthing%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fthing%20%3FthingLabel%20%3Fpathway%20%3FpathwayLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fthing%20wdt%3AP703%20%3Fvirus%20.%0A%20%20%3Fpathway%20wdt%3AP31%20wd%3AQ4915012%20%3B%20wdt%3AP527%20%3Fthing%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>thing</b></td>
    <td><b>pathway</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88000922">S surface glycoprotein of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088053">orf1a polyprotein;orf1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088595">ORF3a gene</a> (<a href="http://www.wikidata.org/entity/Q88088595">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088888">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88088888">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089048">membrane glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089048">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089203">ORF6 protein</a> (<a href="http://www.wikidata.org/entity/Q88089203">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089283">ORF7a protein</a> (<a href="http://www.wikidata.org/entity/Q88089283">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089552">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q88089552">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089689">nucleocapsid phosphoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089689">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88647313">ORF10</a> (<a href="http://www.wikidata.org/entity/Q88647313">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89006922">NSP2 from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q89006922">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917572">NSP10 from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917579">Uridylate-specific endoribonuclease</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917581">Papain-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">3C-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o pathways.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/pathways.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@pathways.rq
```
This SPARQL query is available under CCZero.
