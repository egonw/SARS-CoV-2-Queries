# COVID-19

<a name="tp1">COVID-19</a> is the disease caused by the <a name="tp2">SARS-CoV-2</a> virus.
This Chapter gives information about this disease.

## Clinical trials

While far from complete, trials registered in clinicaltrials.gove are finding their way
into Wikidata. The following query lists a number of clinical trials with COVID-19
as main topic:

**SPARQL** [sparql/clinicalTrials.rq](sparql/clinicalTrials.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Ftrial%20%3FtrialLabel%20%3Fphase%20%3FphaseLabel%20%3Fidentifier%20WHERE%20%7B%0A%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ84263196%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP6099%20%3Fphase%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP3098%20%3Fidentifier%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3Ftrial%20%3FtrialLabel%20%3Fphase%20%3FphaseLabel%20%3Fidentifier%20WHERE%20%7B%0A%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ84263196%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP6099%20%3Fphase%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP3098%20%3Fidentifier%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?trial ?trialLabel ?phase ?phaseLabel ?identifier WHERE {
  ?trial wdt:P31 wd:Q30612 ;
         wdt:P921 wd:Q84263196 ;
         wdt:P6099 ?phase ;
         wdt:P3098 ?identifier .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

This lists these trials:

<table>
  <tr>
    <td><b>trial</b></td>
    <td><b>trialLabel</b></td>
    <td><b>phase</b></td>
    <td><b>phaseLabel</b></td>
    <td><b>identifier</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87775009</td>
    <td>Safety and Immunogenicity Study of 2019-nCoV Vaccine (mRNA-1273) to Prevent SARS-CoV-2 Infection</td>
    <td>http://www.wikidata.org/entity/Q42824069</td>
    <td>phase I clinical trial</td>
    <td>NCT04283461</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86278951</td>
    <td>Vitamin C Infusion for the Treatment of Severe 2019-nCoV Infected Pneumonia</td>
    <td>http://www.wikidata.org/entity/Q42824440</td>
    <td>phase II clinical trial</td>
    <td>NCT04264533</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87076423</td>
    <td>Immunoregulatory Therapy for 2019-nCoV</td>
    <td>http://www.wikidata.org/entity/Q42824440</td>
    <td>phase II clinical trial</td>
    <td>NCT04268537</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87078691</td>
    <td>The Efficacy and Safety of Huai er in the Adjuvant Treatment of COVID-19</td>
    <td>http://www.wikidata.org/entity/Q42824440</td>
    <td>phase II clinical trial</td>
    <td>NCT04291053</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87078691</td>
    <td>The Efficacy and Safety of Huai er in the Adjuvant Treatment of COVID-19</td>
    <td>http://www.wikidata.org/entity/Q42824827</td>
    <td>phase III clinical trial</td>
    <td>NCT04291053</td>
  </tr>
</table>
