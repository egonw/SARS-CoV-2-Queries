# virusGenes.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?protein ?proteinLabel WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  ?protein wdt:P703 ?virus ; wdt:P31 wd:Q7187 .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>virusLabel</b></td>
    <td><b>protein</b></td>
    <td><b>proteinLabel</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q88000922</td>
    <td>S surface glycoprotein of SARS-CoV-2</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q88088053</td>
    <td>orf1a polyprotein;orf1ab polyprotein</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q88088226</td>
    <td>S gene</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q88088595</td>
    <td>ORF3a protein</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q88088888</td>
    <td>envelope protein</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q88089048</td>
    <td>membrane glycoprotein</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q88089203</td>
    <td>ORF6 protein</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q88089283</td>
    <td>ORF7a protein</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q88089438</td>
    <td>ORF7b</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q88089552</td>
    <td>ORF8 protein</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q88089689</td>
    <td>nucleocapsid phosphoprotein</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q88105063</td>
    <td>Record to support submission of GeneRIFs for a gene not in Gene (COVID-19; COVID-19 virus; Human coronavirus 2019; Wuhan coronavirus; Wuhan seafood market pneumonia virus).</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o virusGenes.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/virusGenes.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@virusGenes.rq
```
This SPARQL query is available under CCZero.
