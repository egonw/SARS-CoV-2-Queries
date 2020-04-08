# COVID-19

<a name="tp1">COVID-19</a> is the disease caused by the <a name="tp2">SARS-CoV-2</a> virus.
This Chapter gives information about this disease.

## Symptoms

The below query lists symptomis, but everyone should really check the provenance and
frequency of these symptoms in the Wikidata entry of COVID-19.

However, a rough overview of symptoms can be listed with this query:

**SPARQL** [sparql/symptoms.rq](sparql/symptoms.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fsymptom%20%3FsymptomLabel%20WHERE%20%7B%0A%20%20wd%3AQ84263196%20wdt%3AP780%20%3Fsymptom%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fsymptom%20%3FsymptomLabel%20WHERE%20%7B%0A%20%20wd%3AQ84263196%20wdt%3AP780%20%3Fsymptom%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?symptom ?symptomLabel WHERE {
  wd:Q84263196 wdt:P780 ?symptom .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

Listing these symptoms:

<table>
  <tr>
    <td><b>symptom</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86">headache</a> (<a href="http://www.wikidata.org/entity/Q86">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q5445">anemia</a> (<a href="http://www.wikidata.org/entity/Q5445">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q9690">fatigue</a> (<a href="http://www.wikidata.org/entity/Q9690">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q35805">cough</a> (<a href="http://www.wikidata.org/entity/Q35805">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q38933">fever</a> (<a href="http://www.wikidata.org/entity/Q38933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q40878">diarrhea</a> (<a href="http://www.wikidata.org/entity/Q40878">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q114085">rhinitis</a> (<a href="http://www.wikidata.org/entity/Q114085">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q188008">dyspnea</a> (<a href="http://www.wikidata.org/entity/Q188008">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q344873">adult respiratory distress syndrome</a> (<a href="http://www.wikidata.org/entity/Q344873">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q474959">myalgia</a> (<a href="http://www.wikidata.org/entity/Q474959">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q485831">lymphopenia</a> (<a href="http://www.wikidata.org/entity/Q485831">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q647099">hemoptysis</a> (<a href="http://www.wikidata.org/entity/Q647099">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q767485">respiratory failure</a> (<a href="http://www.wikidata.org/entity/Q767485">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q1076369">cytokine storm</a> (<a href="http://www.wikidata.org/entity/Q1076369">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q3508755">influenza like illness</a> (<a href="http://www.wikidata.org/entity/Q3508755">edit</a>)</td>
  </tr>
</table>

## Clinical trials

While far from complete, <a name="tp3">clinical trials</a> registered in <a name="tp4">clinicaltrials.gov</a> are finding their way
into Wikidata. The following query lists a number of clinical trials with COVID-19
as main topic:

**SPARQL** [sparql/clinicalTrials.rq](sparql/clinicalTrials.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Ftrial%20%3FtrialLabel%20%3Fintervention%20%3FinterventionLabel%20%3Fphase%20%3FphaseLabel%20%3Fidentifier%20WHERE%20%7B%0A%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ84263196%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP6099%20%3Fphase%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP3098%20%3Fidentifier%20.%0A%20%20OPTIONAL%20%7B%0A%20%20%20%20%3Ftrial%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3Ftrial%20%3FtrialLabel%20%3Fintervention%20%3FinterventionLabel%20%3Fphase%20%3FphaseLabel%20%3Fidentifier%20WHERE%20%7B%0A%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ84263196%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP6099%20%3Fphase%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP3098%20%3Fidentifier%20.%0A%20%20OPTIONAL%20%7B%0A%20%20%20%20%3Ftrial%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?trial ?trialLabel ?intervention ?interventionLabel ?phase ?phaseLabel ?identifier WHERE {
  ?trial wdt:P31 wd:Q30612 ;
         wdt:P921 wd:Q84263196 ;
         wdt:P6099 ?phase ;
         wdt:P3098 ?identifier .
  OPTIONAL {
    ?trial wdt:P4844 ?intervention .
  }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

This lists these trials:

<table>
  <tr>
    <td><b>trial</b></td>
    <td><b>intervention</b></td>
    <td><b>phase</b></td>
    <td><b>identifier</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87775009">Safety and Immunogenicity Study of 2019-nCoV Vaccine (mRNA-1273) to Prevent SARS-CoV-2 Infection</a> (<a href="http://www.wikidata.org/entity/Q87775009">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87775025">mRNA-1273</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824069">phase I clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04283461</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86278951">Vitamin C Infusion for the Treatment of Severe 2019-nCoV Infected Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q86278951">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q193598">DL-ascorbic acid</a> (<a href="http://www.wikidata.org/entity/Q193598">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04264533</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87076423">Immunoregulatory Therapy for 2019-nCoV</a> (<a href="http://www.wikidata.org/entity/Q87076423">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q66559285">immunoglobulin</a> (<a href="http://www.wikidata.org/entity/Q66559285">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04268537</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87078691">The Efficacy and Safety of Huai er in the Adjuvant Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87078691">edit</a>)</td>
    <td></td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04291053</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87078691">The Efficacy and Safety of Huai er in the Adjuvant Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87078691">edit</a>)</td>
    <td></td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04291053</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89153372">COVID-19-associated ARDS Treated With Dexamethasone: Alliance Covid-19 Brasil III</a> (<a href="http://www.wikidata.org/entity/Q89153372">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q408524">cyclophosphamide</a> (<a href="http://www.wikidata.org/entity/Q408524">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04327401</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89153372">COVID-19-associated ARDS Treated With Dexamethasone: Alliance Covid-19 Brasil III</a> (<a href="http://www.wikidata.org/entity/Q89153372">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27106392">dexamethasone acetate</a> (<a href="http://www.wikidata.org/entity/Q27106392">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04327401</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89154799">Safety and Efficacy of Hydroxychloroquine Associated With Azithromycin in SARS-CoV2 Virus (Coalition Covid-19 Brasil II)</a> (<a href="http://www.wikidata.org/entity/Q89154799">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q421094">hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04321278</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89154960">Experimental Trial of rhIFNα Nasal Drops to Prevent 2019-nCOV in Medical Staff</a> (<a href="http://www.wikidata.org/entity/Q89154960">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q188269">interferon</a> (<a href="http://www.wikidata.org/entity/Q188269">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04320238</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89154960">Experimental Trial of rhIFNα Nasal Drops to Prevent 2019-nCOV in Medical Staff</a> (<a href="http://www.wikidata.org/entity/Q89154960">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q20817234">thymalfasin</a> (<a href="http://www.wikidata.org/entity/Q20817234">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04320238</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89435835">Hydroxychloroquine for COVID-19 PEP</a> (<a href="http://www.wikidata.org/entity/Q89435835">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q193598">DL-ascorbic acid</a> (<a href="http://www.wikidata.org/entity/Q193598">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824069">phase I clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04328961</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89435835">Hydroxychloroquine for COVID-19 PEP</a> (<a href="http://www.wikidata.org/entity/Q89435835">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q421094">hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824069">phase I clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04328961</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89506948">Treatment of SARS Caused by COVID-19 With Ruxolitinib</a> (<a href="http://www.wikidata.org/entity/Q89506948">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q7383611">ruxolitinib</a> (<a href="http://www.wikidata.org/entity/Q7383611">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824069">phase I clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04334044</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89506948">Treatment of SARS Caused by COVID-19 With Ruxolitinib</a> (<a href="http://www.wikidata.org/entity/Q89506948">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q7383611">ruxolitinib</a> (<a href="http://www.wikidata.org/entity/Q7383611">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04334044</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507029">Hydroxychloroquine in Outpatient Adults With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507029">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q421094">hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824069">phase I clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04333654</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507036">Chloroquine for Mild Symptomatic and Asymptomatic COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507036">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333628</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507036">Chloroquine for Mild Symptomatic and Asymptomatic COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507036">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04333628</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507036">Chloroquine for Mild Symptomatic and Asymptomatic COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507036">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333628</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507036">Chloroquine for Mild Symptomatic and Asymptomatic COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507036">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04333628</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507053">Application of Desferal to Treat COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507053">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q419618">deferoxamine</a> (<a href="http://www.wikidata.org/entity/Q419618">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824069">phase I clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04333550</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507053">Application of Desferal to Treat COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507053">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q419618">deferoxamine</a> (<a href="http://www.wikidata.org/entity/Q419618">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333550</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507084">Piclidenoson for Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507084">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27088384">piclidenoson</a> (<a href="http://www.wikidata.org/entity/Q27088384">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333472</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507135">Hydroxychloroquine in the Prevention of COVID-19 Infection in Healthcare Workers</a> (<a href="http://www.wikidata.org/entity/Q89507135">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q421094">hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333225</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507190">Outcomes Related to COVID-19 Treated With Hydroxychloroquine Among In-patients With Symptomatic Disease</a> (<a href="http://www.wikidata.org/entity/Q89507190">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q421094">hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04332991</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507563">Azithromycin for COVID-19 Treatment in Outpatients Nationwide</a> (<a href="http://www.wikidata.org/entity/Q89507563">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q165399">azithromycin</a> (<a href="http://www.wikidata.org/entity/Q165399">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04332107</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507569">Clinical Trial of Combined Use of Hydroxychloroquine, Azithromycin, and Tocilizumab for the Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507569">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q165399">azithromycin</a> (<a href="http://www.wikidata.org/entity/Q165399">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04332094</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507569">Clinical Trial of Combined Use of Hydroxychloroquine, Azithromycin, and Tocilizumab for the Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507569">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q421094">hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04332094</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507569">Clinical Trial of Combined Use of Hydroxychloroquine, Azithromycin, and Tocilizumab for the Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507569">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q425154">tocilizumab</a> (<a href="http://www.wikidata.org/entity/Q425154">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04332094</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507616">Cohort Multiple Randomized Controlled Trials Open-label of Immune Modulatory Drugs and Other Treatments in COVID-19 Patients - Tocilizumab Trial - CORIMUNO-19 - TOCI (CORIMUNO-TOCI)</a> (<a href="http://www.wikidata.org/entity/Q89507616">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q425154">tocilizumab</a> (<a href="http://www.wikidata.org/entity/Q425154">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331808</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507618">Tocilizumab to Prevent Clinical Decompensation in Hospitalized, Non-critically Ill Patients With COVID-19 Pneumonitis</a> (<a href="http://www.wikidata.org/entity/Q89507618">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q425154">tocilizumab</a> (<a href="http://www.wikidata.org/entity/Q425154">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331795</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q417097">levamisole</a> (<a href="http://www.wikidata.org/entity/Q417097">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q417097">levamisole</a> (<a href="http://www.wikidata.org/entity/Q417097">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q422212">budesonide</a> (<a href="http://www.wikidata.org/entity/Q422212">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q422212">budesonide</a> (<a href="http://www.wikidata.org/entity/Q422212">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q422585">lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q422585">lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q422618">ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q422618">ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27132391">formoterol fumarate</a> (<a href="http://www.wikidata.org/entity/Q27132391">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27132391">formoterol fumarate</a> (<a href="http://www.wikidata.org/entity/Q27132391">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89507754">Protective Role of Inhaled Steroids for Covid-19 Infection</a> (<a href="http://www.wikidata.org/entity/Q89507754">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q422212">budesonide</a> (<a href="http://www.wikidata.org/entity/Q422212">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331054</td>
  </tr>
</table>
