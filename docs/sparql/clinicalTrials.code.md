# clinicalTrials.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?trial ?trialLabel ?phase ?phaseLabel ?identifier WHERE {
  ?trial wdt:P31 wd:Q30612 ;
         wdt:P921 wd:Q84263196 ;
         wdt:P6099 ?phase ;
         wdt:P3098 ?identifier .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Ftrial%20%3FtrialLabel%20%3Fphase%20%3FphaseLabel%20%3Fidentifier%20WHERE%20%7B%0A%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ84263196%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP6099%20%3Fphase%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP3098%20%3Fidentifier%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Ftrial%20%3FtrialLabel%20%3Fphase%20%3FphaseLabel%20%3Fidentifier%20WHERE%20%7B%0A%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ84263196%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP6099%20%3Fphase%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP3098%20%3Fidentifier%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>trial</b></td>
    <td><b>phase</b></td>
    <td><b>identifier</b></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87775009">Safety and Immunogenicity Study of 2019-nCoV Vaccine (mRNA-1273) to Prevent SARS-CoV-2 Infection</a></td>
    <td><a href="http://www.wikidata.org/entity/Q42824069">phase I clinical trial</a></td>
    <td>NCT04283461</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86278951">Vitamin C Infusion for the Treatment of Severe 2019-nCoV Infected Pneumonia</a></td>
    <td><a href="http://www.wikidata.org/entity/Q42824440">phase II clinical trial</a></td>
    <td>NCT04264533</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87076423">Immunoregulatory Therapy for 2019-nCoV</a></td>
    <td><a href="http://www.wikidata.org/entity/Q42824440">phase II clinical trial</a></td>
    <td>NCT04268537</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87078691">The Efficacy and Safety of Huai er in the Adjuvant Treatment of COVID-19</a></td>
    <td><a href="http://www.wikidata.org/entity/Q42824440">phase II clinical trial</a></td>
    <td>NCT04291053</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87078691">The Efficacy and Safety of Huai er in the Adjuvant Treatment of COVID-19</a></td>
    <td><a href="http://www.wikidata.org/entity/Q42824827">phase III clinical trial</a></td>
    <td>NCT04291053</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o clinicalTrials.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/clinicalTrials.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@clinicalTrials.rq
```
This SPARQL query is available under CCZero.
