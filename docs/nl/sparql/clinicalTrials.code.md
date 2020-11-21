# clinicalTrials.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
SELECT ?trial ?trialLabel ?intervention ?interventionLabel ?phase ?phaseLabel ?identifier WHERE {
  VALUES ?topic {
    wd:Q84263196 wd:Q82069695
  }
  ?trial wdt:P31 wd:Q30612 ;
         wdt:P921 ?topic ;
         wdt:P6099 ?phase ;
         wdt:P3098 ?identifier .
  OPTIONAL {
    ?trial wdt:P4844 ?intervention .
  }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "nl,en". }
} ORDER BY DESC(?identifier) ASC(?intervention)
```
[uitvoeren](https://query.wikidata.org/embed.html#SELECT%20%3Ftrial%20%3FtrialLabel%20%3Fintervention%20%3FinterventionLabel%20%3Fphase%20%3FphaseLabel%20%3Fidentifier%20WHERE%20%7B%0A%20%20VALUES%20%3Ftopic%20%7B%0A%20%20%20%20wd%3AQ84263196%20wd%3AQ82069695%0A%20%20%7D%0A%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP921%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP6099%20%3Fphase%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP3098%20%3Fidentifier%20.%0A%20%20OPTIONAL%20%7B%0A%20%20%20%20%3Ftrial%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fidentifier%29%20ASC%28%3Fintervention%29%0A) of [bewerken](https://query.wikidata.org/#SELECT%20%3Ftrial%20%3FtrialLabel%20%3Fintervention%20%3FinterventionLabel%20%3Fphase%20%3FphaseLabel%20%3Fidentifier%20WHERE%20%7B%0A%20%20VALUES%20%3Ftopic%20%7B%0A%20%20%20%20wd%3AQ84263196%20wd%3AQ82069695%0A%20%20%7D%0A%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP921%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP6099%20%3Fphase%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP3098%20%3Fidentifier%20.%0A%20%20OPTIONAL%20%7B%0A%20%20%20%20%3Ftrial%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fidentifier%29%20ASC%28%3Fintervention%29%0A)


### Resultaten
<table>
  <tr>
    <td><b>trial</b></td>
    <td><b>intervention</b></td>
    <td><b>phase</b></td>
    <td><b>identifier</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98710332">Monovalent Recombinant COVID19 Vaccine</a> (<a href="http://www.wikidata.org/entity/Q98710332">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97154237">COVAX-19</a> (<a href="http://www.wikidata.org/entity/Q97154237">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04453852</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q95719961">Dose-Confirmation Study to Evaluate the Safety, Reactogenicity, and Immunogenicity of mRNA-1273 COVID-19 Vaccine in Adults Aged 18 Years and Older</a> (<a href="http://www.wikidata.org/entity/Q95719961">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87775025">mRNA-1273</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04405076</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q93704421">Study of the Efficacy and Safety of a Single Administration of Olokizumab and RPH-104 With Standard Therapy in Patients With Severe Severe Acute Respiratory Syndrome Coronavirus 2 (SARS-CoV-2) Infection (COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q93704421">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04380519</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q93704421">Study of the Efficacy and Safety of a Single Administration of Olokizumab and RPH-104 With Standard Therapy in Patients With Severe Severe Acute Respiratory Syndrome Coronavirus 2 (SARS-CoV-2) Infection (COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q93704421">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04380519</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q93328984">Study to Describe the Safety, Tolerability, Immunogenicity, and Potential Efficacy of RNA Vaccine Candidates Against COVID-19 in Healthy Adults</a> (<a href="http://www.wikidata.org/entity/Q93328984">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97154240">BNT162b2</a> (<a href="http://www.wikidata.org/entity/Q97154240">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04368728</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q93328984">Study to Describe the Safety, Tolerability, Immunogenicity, and Potential Efficacy of RNA Vaccine Candidates Against COVID-19 in Healthy Adults</a> (<a href="http://www.wikidata.org/entity/Q93328984">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97154240">BNT162b2</a> (<a href="http://www.wikidata.org/entity/Q97154240">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04368728</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q93328984">Study to Describe the Safety, Tolerability, Immunogenicity, and Potential Efficacy of RNA Vaccine Candidates Against COVID-19 in Healthy Adults</a> (<a href="http://www.wikidata.org/entity/Q93328984">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97154240">BNT162b2</a> (<a href="http://www.wikidata.org/entity/Q97154240">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04368728</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92273970">Trial Evaluating the Efficacy of Local Budesonide Therapy in the Management of Hyposmia in COVID-19 Patients Without Signs of Severity</a> (<a href="http://www.wikidata.org/entity/Q92273970">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422212">Budesonide</a> (<a href="http://www.wikidata.org/entity/Q422212">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04361474</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92392147">COVID-19: A Pilot Study of Adaptive Immunity and Anti-PD1</a> (<a href="http://www.wikidata.org/entity/Q92392147">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q7041828">nivolumab</a> (<a href="http://www.wikidata.org/entity/Q7041828">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04356508</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92392200">Interferon Beta 1a in Hospitalized COVID-19 Patients</a> (<a href="http://www.wikidata.org/entity/Q92392200">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q188269">Interferon</a> (<a href="http://www.wikidata.org/entity/Q188269">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04350671</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92392200">Interferon Beta 1a in Hospitalized COVID-19 Patients</a> (<a href="http://www.wikidata.org/entity/Q92392200">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q2450337">Interferon bèta-1a</a> (<a href="http://www.wikidata.org/entity/Q2450337">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04350671</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92392200">Interferon Beta 1a in Hospitalized COVID-19 Patients</a> (<a href="http://www.wikidata.org/entity/Q92392200">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04350671</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92392200">Interferon Beta 1a in Hospitalized COVID-19 Patients</a> (<a href="http://www.wikidata.org/entity/Q92392200">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04350671</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92392200">Interferon Beta 1a in Hospitalized COVID-19 Patients</a> (<a href="http://www.wikidata.org/entity/Q92392200">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04350671</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89506948">Treatment of SARS Caused by COVID-19 With Ruxolitinib</a> (<a href="http://www.wikidata.org/entity/Q89506948">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q7383611">ruxolitinib</a> (<a href="http://www.wikidata.org/entity/Q7383611">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04334044</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89506948">Treatment of SARS Caused by COVID-19 With Ruxolitinib</a> (<a href="http://www.wikidata.org/entity/Q89506948">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q7383611">ruxolitinib</a> (<a href="http://www.wikidata.org/entity/Q7383611">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04334044</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89506972">Prospective Study in Patients With Advanced or Metastatic Cancer and SARS-CoV-2 (COVID-19) Infection</a> (<a href="http://www.wikidata.org/entity/Q89506972">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333914</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89506972">Prospective Study in Patients With Advanced or Metastatic Cancer and SARS-CoV-2 (COVID-19) Infection</a> (<a href="http://www.wikidata.org/entity/Q89506972">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333914</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89506972">Prospective Study in Patients With Advanced or Metastatic Cancer and SARS-CoV-2 (COVID-19) Infection</a> (<a href="http://www.wikidata.org/entity/Q89506972">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333914</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89506972">Prospective Study in Patients With Advanced or Metastatic Cancer and SARS-CoV-2 (COVID-19) Infection</a> (<a href="http://www.wikidata.org/entity/Q89506972">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333914</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89506972">Prospective Study in Patients With Advanced or Metastatic Cancer and SARS-CoV-2 (COVID-19) Infection</a> (<a href="http://www.wikidata.org/entity/Q89506972">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q7041828">nivolumab</a> (<a href="http://www.wikidata.org/entity/Q7041828">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333914</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89506972">Prospective Study in Patients With Advanced or Metastatic Cancer and SARS-CoV-2 (COVID-19) Infection</a> (<a href="http://www.wikidata.org/entity/Q89506972">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q7041828">nivolumab</a> (<a href="http://www.wikidata.org/entity/Q7041828">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333914</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507014">CROWN CORONATION: Chloroquine RepurpOsing to healthWorkers for Novel CORONAvirus mitigaTION</a> (<a href="http://www.wikidata.org/entity/Q89507014">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333732</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507014">CROWN CORONATION: Chloroquine RepurpOsing to healthWorkers for Novel CORONAvirus mitigaTION</a> (<a href="http://www.wikidata.org/entity/Q89507014">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333732</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507014">CROWN CORONATION: Chloroquine RepurpOsing to healthWorkers for Novel CORONAvirus mitigaTION</a> (<a href="http://www.wikidata.org/entity/Q89507014">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333732</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507029">Hydroxychloroquine in Outpatient Adults With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507029">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04333654</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507036">Chloroquine for Mild Symptomatic and Asymptomatic COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507036">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333628</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507036">Chloroquine for Mild Symptomatic and Asymptomatic COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507036">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04333628</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507036">Chloroquine for Mild Symptomatic and Asymptomatic COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507036">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333628</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507036">Chloroquine for Mild Symptomatic and Asymptomatic COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507036">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04333628</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507053">Application of Desferal to Treat COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507053">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q419618">Deferoxamine</a> (<a href="http://www.wikidata.org/entity/Q419618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04333550</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507053">Application of Desferal to Treat COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507053">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q419618">Deferoxamine</a> (<a href="http://www.wikidata.org/entity/Q419618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333550</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507084">Piclidenoson for Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507084">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27088384">piclidenoson</a> (<a href="http://www.wikidata.org/entity/Q27088384">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333472</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507095">OPEN LABEL, RANDOMIZED PHASE II/III STUDY OF IFX-1 IN PATIENTS WITH SEVERE COVID-19 PNEUMONIA</a> (<a href="http://www.wikidata.org/entity/Q89507095">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333420</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507095">OPEN LABEL, RANDOMIZED PHASE II/III STUDY OF IFX-1 IN PATIENTS WITH SEVERE COVID-19 PNEUMONIA</a> (<a href="http://www.wikidata.org/entity/Q89507095">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04333420</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507113">Cell Therapy Using Umbilical Cord-derived Mesenchymal Stromal Cells in SARS-CoV-2-related ARDS</a> (<a href="http://www.wikidata.org/entity/Q89507113">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04333368</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507113">Cell Therapy Using Umbilical Cord-derived Mesenchymal Stromal Cells in SARS-CoV-2-related ARDS</a> (<a href="http://www.wikidata.org/entity/Q89507113">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333368</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507115">Safety in Convalescent Plasma Transfusion to COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507115">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04333355</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507131">Study Testing Convalescent Plasma vs Best Supportive Care</a> (<a href="http://www.wikidata.org/entity/Q89507131">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04333251</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507131">Study Testing Convalescent Plasma vs Best Supportive Care</a> (<a href="http://www.wikidata.org/entity/Q89507131">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04333251</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507135">Hydroxychloroquine in the Prevention of COVID-19 Infection in Healthcare Workers</a> (<a href="http://www.wikidata.org/entity/Q89507135">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04333225</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507190">Outcomes Related to COVID-19 Treated With Hydroxychloroquine Among In-patients With Symptomatic Disease</a> (<a href="http://www.wikidata.org/entity/Q89507190">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04332991</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507238">Convalescent Plasma for Patients With COVID-19: A Randomized, Open Label, Parallel, Controlled Clinical Study</a> (<a href="http://www.wikidata.org/entity/Q89507238">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04332835</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507238">Convalescent Plasma for Patients With COVID-19: A Randomized, Open Label, Parallel, Controlled Clinical Study</a> (<a href="http://www.wikidata.org/entity/Q89507238">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04332835</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507421">Angiotensin-(1,7) Treatment in COVID-19: the ATCO Trial</a> (<a href="http://www.wikidata.org/entity/Q89507421">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q288280">ACE-remmer</a> (<a href="http://www.wikidata.org/entity/Q288280">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04332666</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507421">Angiotensin-(1,7) Treatment in COVID-19: the ATCO Trial</a> (<a href="http://www.wikidata.org/entity/Q89507421">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q288280">ACE-remmer</a> (<a href="http://www.wikidata.org/entity/Q288280">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04332666</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507481">Convalescent Plasma for Patients With COVID-19: A Pilot Study</a> (<a href="http://www.wikidata.org/entity/Q89507481">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04332380</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507563">Azithromycin for COVID-19 Treatment in Outpatients Nationwide</a> (<a href="http://www.wikidata.org/entity/Q89507563">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q165399">Azithromycine</a> (<a href="http://www.wikidata.org/entity/Q165399">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04332107</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507569">Clinical Trial of Combined Use of Hydroxychloroquine, Azithromycin, and Tocilizumab for the Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507569">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q165399">Azithromycine</a> (<a href="http://www.wikidata.org/entity/Q165399">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04332094</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507569">Clinical Trial of Combined Use of Hydroxychloroquine, Azithromycin, and Tocilizumab for the Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507569">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q165399">Azithromycine</a> (<a href="http://www.wikidata.org/entity/Q165399">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04332094</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507569">Clinical Trial of Combined Use of Hydroxychloroquine, Azithromycin, and Tocilizumab for the Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507569">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04332094</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507569">Clinical Trial of Combined Use of Hydroxychloroquine, Azithromycin, and Tocilizumab for the Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507569">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04332094</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507569">Clinical Trial of Combined Use of Hydroxychloroquine, Azithromycin, and Tocilizumab for the Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507569">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q425154">Tocilizumab</a> (<a href="http://www.wikidata.org/entity/Q425154">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04332094</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507569">Clinical Trial of Combined Use of Hydroxychloroquine, Azithromycin, and Tocilizumab for the Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507569">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q425154">Tocilizumab</a> (<a href="http://www.wikidata.org/entity/Q425154">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04332094</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507601">Mild COVID-19 Peginterferon Lambda</a> (<a href="http://www.wikidata.org/entity/Q89507601">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331899</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507614">Pre-Exposure Prophylaxis With Hydroxychloroquine for High-Risk Healthcare Workers During the COVID-19 Pandemic</a> (<a href="http://www.wikidata.org/entity/Q89507614">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331834</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507616">Cohort Multiple Randomized Controlled Trials Open-label of Immune Modulatory Drugs and Other Treatments in COVID-19 Patients - Tocilizumab Trial - CORIMUNO-19 - TOCI (CORIMUNO-TOCI)</a> (<a href="http://www.wikidata.org/entity/Q89507616">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q425154">Tocilizumab</a> (<a href="http://www.wikidata.org/entity/Q425154">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331808</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507618">Tocilizumab to Prevent Clinical Decompensation in Hospitalized, Non-critically Ill Patients With COVID-19 Pneumonitis</a> (<a href="http://www.wikidata.org/entity/Q89507618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q425154">Tocilizumab</a> (<a href="http://www.wikidata.org/entity/Q425154">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331795</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507654">Safety and Efficacy of CAStem for Severe COVID-19 Associated With/Without ARDS</a> (<a href="http://www.wikidata.org/entity/Q89507654">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04331613</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507654">Safety and Efficacy of CAStem for Severe COVID-19 Associated With/Without ARDS</a> (<a href="http://www.wikidata.org/entity/Q89507654">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331613</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507655">ChloroQUine As antiviRal treAtmeNT In coroNavirus infEction 2020</a> (<a href="http://www.wikidata.org/entity/Q89507655">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04331600</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507655">ChloroQUine As antiviRal treAtmeNT In coroNavirus infEction 2020</a> (<a href="http://www.wikidata.org/entity/Q89507655">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04331600</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27132391">formoterol fumarate</a> (<a href="http://www.wikidata.org/entity/Q27132391">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27132391">formoterol fumarate</a> (<a href="http://www.wikidata.org/entity/Q27132391">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q417097">Levamisole</a> (<a href="http://www.wikidata.org/entity/Q417097">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q417097">Levamisole</a> (<a href="http://www.wikidata.org/entity/Q417097">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422212">Budesonide</a> (<a href="http://www.wikidata.org/entity/Q422212">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422212">Budesonide</a> (<a href="http://www.wikidata.org/entity/Q422212">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507668">Evaluation of Efficacy of Levamisole and Formoterol+Budesonide in Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89507668">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331470</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89507754">Protective Role of Inhaled Steroids for Covid-19 Infection</a> (<a href="http://www.wikidata.org/entity/Q89507754">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422212">Budesonide</a> (<a href="http://www.wikidata.org/entity/Q422212">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04331054</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435623">Treatments for COVID-19: Canadian Arm of the SOLIDARITY Trial</a> (<a href="http://www.wikidata.org/entity/Q89435623">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04330690</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435623">Treatments for COVID-19: Canadian Arm of the SOLIDARITY Trial</a> (<a href="http://www.wikidata.org/entity/Q89435623">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04330690</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435627">Treatment of COVID-19 Patients With Anti-interleukin Drugs</a> (<a href="http://www.wikidata.org/entity/Q89435627">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3960572">Siltuximab</a> (<a href="http://www.wikidata.org/entity/Q3960572">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04330638</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435627">Treatment of COVID-19 Patients With Anti-interleukin Drugs</a> (<a href="http://www.wikidata.org/entity/Q89435627">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q415411">Anakinra</a> (<a href="http://www.wikidata.org/entity/Q415411">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04330638</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435631">A Trial of Ciclesonide in Adults With Mild COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89435631">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04330586</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435631">A Trial of Ciclesonide in Adults With Mild COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89435631">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q5119448">Ciclesonide</a> (<a href="http://www.wikidata.org/entity/Q5119448">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04330586</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435639">Randomized, Controlled, Double-blind Clinical Trial Comparing the Efficacy and Safety of Chemoprophylaxis With Hydroxychloroquine in Patients Under Biological Treatment and / or JAK Inhibitors in the Prevention of SARS-CoV-2 Infection</a> (<a href="http://www.wikidata.org/entity/Q89435639">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q17149812">Janus kinase inhibitors</a> (<a href="http://www.wikidata.org/entity/Q17149812">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04330495</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435639">Randomized, Controlled, Double-blind Clinical Trial Comparing the Efficacy and Safety of Chemoprophylaxis With Hydroxychloroquine in Patients Under Biological Treatment and / or JAK Inhibitors in the Prevention of SARS-CoV-2 Infection</a> (<a href="http://www.wikidata.org/entity/Q89435639">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04330495</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435670">Hydroxychloroquine as Post Exposure Prophylaxis for SARS-CoV-2(HOPE Trial)</a> (<a href="http://www.wikidata.org/entity/Q89435670">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04330144</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435695">The PATCH Trial (Prevention And Treatment of COVID-19 With Hydroxychloroquine)</a> (<a href="http://www.wikidata.org/entity/Q89435695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04329923</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435708">Hydroxychloroquine vs. Azithromycin for Hospitalized Patients With Suspected or Confirmed COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89435708">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04329832</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435739">Efficacy and Safety of Siltuximab vs. Corticosteroids in Hospitalized Patients With COVID19 Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q89435739">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q11426176">prednisolon</a> (<a href="http://www.wikidata.org/entity/Q11426176">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04329650</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435739">Efficacy and Safety of Siltuximab vs. Corticosteroids in Hospitalized Patients With COVID19 Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q89435739">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27107351">methylprednisolone acetate</a> (<a href="http://www.wikidata.org/entity/Q27107351">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04329650</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435739">Efficacy and Safety of Siltuximab vs. Corticosteroids in Hospitalized Patients With COVID19 Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q89435739">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27108063">prednisolone acetate</a> (<a href="http://www.wikidata.org/entity/Q27108063">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04329650</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435739">Efficacy and Safety of Siltuximab vs. Corticosteroids in Hospitalized Patients With COVID19 Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q89435739">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27262132">methylprednisolone hemisuccinate</a> (<a href="http://www.wikidata.org/entity/Q27262132">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04329650</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435739">Efficacy and Safety of Siltuximab vs. Corticosteroids in Hospitalized Patients With COVID19 Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q89435739">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27266327">prednisolone 21-phosphate</a> (<a href="http://www.wikidata.org/entity/Q27266327">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04329650</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435739">Efficacy and Safety of Siltuximab vs. Corticosteroids in Hospitalized Patients With COVID19 Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q89435739">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27278862">prednisolone hemisuccinate</a> (<a href="http://www.wikidata.org/entity/Q27278862">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04329650</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435739">Efficacy and Safety of Siltuximab vs. Corticosteroids in Hospitalized Patients With COVID19 Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q89435739">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3960572">Siltuximab</a> (<a href="http://www.wikidata.org/entity/Q3960572">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04329650</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435739">Efficacy and Safety of Siltuximab vs. Corticosteroids in Hospitalized Patients With COVID19 Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q89435739">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q417222">Methylprednisolone</a> (<a href="http://www.wikidata.org/entity/Q417222">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04329650</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435746">Hydroxychloroquine to Prevent Covid19 Pneumonia (ALBERTA HOPE-Covid19)</a> (<a href="http://www.wikidata.org/entity/Q89435746">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04329611</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435746">Hydroxychloroquine to Prevent Covid19 Pneumonia (ALBERTA HOPE-Covid19)</a> (<a href="http://www.wikidata.org/entity/Q89435746">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04329611</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435752">Efficacy and Safety of Hydroxychloroquine and Azithromycin for the Treatment of Hospitalized Patients With Moderate to Severe COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89435752">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04329572</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435752">Efficacy and Safety of Hydroxychloroquine and Azithromycin for the Treatment of Hospitalized Patients With Moderate to Severe COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89435752">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04329572</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435732">EPICOS Clinical Trial for the Prevention of Infection in Healthcare Personnel</a> (<a href="http://www.wikidata.org/entity/Q89435732">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q155954">Tenofovir</a> (<a href="http://www.wikidata.org/entity/Q155954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04329520</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435732">EPICOS Clinical Trial for the Prevention of Infection in Healthcare Personnel</a> (<a href="http://www.wikidata.org/entity/Q89435732">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q155954">Tenofovir</a> (<a href="http://www.wikidata.org/entity/Q155954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04329520</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435732">EPICOS Clinical Trial for the Prevention of Infection in Healthcare Personnel</a> (<a href="http://www.wikidata.org/entity/Q89435732">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04329520</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435732">EPICOS Clinical Trial for the Prevention of Infection in Healthcare Personnel</a> (<a href="http://www.wikidata.org/entity/Q89435732">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04329520</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435732">EPICOS Clinical Trial for the Prevention of Infection in Healthcare Personnel</a> (<a href="http://www.wikidata.org/entity/Q89435732">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422604">Emtricitabine</a> (<a href="http://www.wikidata.org/entity/Q422604">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04329520</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435732">EPICOS Clinical Trial for the Prevention of Infection in Healthcare Personnel</a> (<a href="http://www.wikidata.org/entity/Q89435732">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422604">Emtricitabine</a> (<a href="http://www.wikidata.org/entity/Q422604">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04329520</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435801">ACE Inhibitors or ARBs Discontinuation in Context of SARS-CoV-2 Pandemia</a> (<a href="http://www.wikidata.org/entity/Q89435801">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q288280">ACE-remmer</a> (<a href="http://www.wikidata.org/entity/Q288280">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04329195</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435835">Hydroxychloroquine for COVID-19 PEP</a> (<a href="http://www.wikidata.org/entity/Q89435835">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q193598">Ascorbinezuur</a> (<a href="http://www.wikidata.org/entity/Q193598">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04328961</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435835">Hydroxychloroquine for COVID-19 PEP</a> (<a href="http://www.wikidata.org/entity/Q89435835">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q193598">Ascorbinezuur</a> (<a href="http://www.wikidata.org/entity/Q193598">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04328961</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435835">Hydroxychloroquine for COVID-19 PEP</a> (<a href="http://www.wikidata.org/entity/Q89435835">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04328961</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89435835">Hydroxychloroquine for COVID-19 PEP</a> (<a href="http://www.wikidata.org/entity/Q89435835">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04328961</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153189">The Vietnam Chloroquine Treatment on COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89153189">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04328493</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153189">The Vietnam Chloroquine Treatment on COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89153189">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04328493</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153199">REDUCING HEALTH CARE WORKERS ABSENTEEISM IN SARS-CoV-2 PANDEMIC THROUGH BACILLUS CALMETTE-GUÉRIN VACCINATION, A RANDOMIZED CONTROLLED TRIAL</a> (<a href="http://www.wikidata.org/entity/Q89153199">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q798309">BCG-vaccin</a> (<a href="http://www.wikidata.org/entity/Q798309">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328441</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153234">Chemoprophylaxis of SARS-CoV-2 Infection (COVID-19) in Exposed Healthcare Workers</a> (<a href="http://www.wikidata.org/entity/Q89153234">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328285</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153234">Chemoprophylaxis of SARS-CoV-2 Infection (COVID-19) in Exposed Healthcare Workers</a> (<a href="http://www.wikidata.org/entity/Q89153234">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328285</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153234">Chemoprophylaxis of SARS-CoV-2 Infection (COVID-19) in Exposed Healthcare Workers</a> (<a href="http://www.wikidata.org/entity/Q89153234">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328285</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153234">Chemoprophylaxis of SARS-CoV-2 Infection (COVID-19) in Exposed Healthcare Workers</a> (<a href="http://www.wikidata.org/entity/Q89153234">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328285</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153234">Chemoprophylaxis of SARS-CoV-2 Infection (COVID-19) in Exposed Healthcare Workers</a> (<a href="http://www.wikidata.org/entity/Q89153234">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328285</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153234">Chemoprophylaxis of SARS-CoV-2 Infection (COVID-19) in Exposed Healthcare Workers</a> (<a href="http://www.wikidata.org/entity/Q89153234">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328285</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153236">Effectiveness of Hydroxychloroquine in Covid-19 Patients</a> (<a href="http://www.wikidata.org/entity/Q89153236">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328272</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21057316">coal tar pitch volatiles</a> (<a href="http://www.wikidata.org/entity/Q21057316">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21057316">coal tar pitch volatiles</a> (<a href="http://www.wikidata.org/entity/Q21057316">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21057316">coal tar pitch volatiles</a> (<a href="http://www.wikidata.org/entity/Q21057316">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21057316">coal tar pitch volatiles</a> (<a href="http://www.wikidata.org/entity/Q21057316">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q410074">Losartan</a> (<a href="http://www.wikidata.org/entity/Q410074">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q410074">Losartan</a> (<a href="http://www.wikidata.org/entity/Q410074">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q410074">Losartan</a> (<a href="http://www.wikidata.org/entity/Q410074">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q410074">Losartan</a> (<a href="http://www.wikidata.org/entity/Q410074">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153273">Comparison Of Therapeutics for Hospitalized Patients Infected With SARS-CoV-2 In a Pragmatic aDaptive randoMizED Clinical Trial During the COVID-19 Pandemic (COVID MED Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153273">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04328012</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153356">Safety and Efficacy of Hyperbaric Oxygen for ARDS in Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89153356">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04327505</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153356">Safety and Efficacy of Hyperbaric Oxygen for ARDS in Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89153356">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04327505</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153372">COVID-19-associated ARDS Treated With Dexamethasone: Alliance Covid-19 Brasil III</a> (<a href="http://www.wikidata.org/entity/Q89153372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27106392">dexamethasone acetate</a> (<a href="http://www.wikidata.org/entity/Q27106392">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04327401</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153372">COVID-19-associated ARDS Treated With Dexamethasone: Alliance Covid-19 Brasil III</a> (<a href="http://www.wikidata.org/entity/Q89153372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q408524">Cyclofosfamide</a> (<a href="http://www.wikidata.org/entity/Q408524">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04327401</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153374">Sarilumab COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89153374">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04327388</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153374">Sarilumab COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89153374">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04327388</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153412">BCG Vaccination to Protect Healthcare Workers Against COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89153412">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q798309">BCG-vaccin</a> (<a href="http://www.wikidata.org/entity/Q798309">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04327206</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153456">Sargramostim in Patients With Acute Hypoxic Respiratory Failure Due to COVID-19 (SARPAC)</a> (<a href="http://www.wikidata.org/entity/Q89153456">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3950557">Sargramostim</a> (<a href="http://www.wikidata.org/entity/Q3950557">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04326920</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153477">The GReek Study in the Effects of Colchicine in Covid-19</a> (<a href="http://www.wikidata.org/entity/Q89153477">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q9268800">gloriosine</a> (<a href="http://www.wikidata.org/entity/Q9268800">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04326790</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153533">COVIDL1: A Study to Investigate the Efficacy of Tradipitant in Treating Severe or Critical COVID-19 Infection</a> (<a href="http://www.wikidata.org/entity/Q89153533">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04326426</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153636">Use of cSVF Via IV Deployment for Residual Lung Damage After Symptomatic COVID-19 Infection</a> (<a href="http://www.wikidata.org/entity/Q89153636">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04326036</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153681">Hydroxychloroquine Versus Placebo in Patients Presenting COVID-19 Infection and at Risk of Secondary Complication: a Prospective, Multicentre, Randomised, Double-blind Study</a> (<a href="http://www.wikidata.org/entity/Q89153681">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04325893</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153736">Convalescent Plasma to Limit Coronavirus Associated Complications</a> (<a href="http://www.wikidata.org/entity/Q89153736">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04325672</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153736">Convalescent Plasma to Limit Coronavirus Associated Complications</a> (<a href="http://www.wikidata.org/entity/Q89153736">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04325672</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153746">Efficacy of Addition of Naproxen in the Treatment of Critically Ill Patients Hospitalized for COVID-19 Infection</a> (<a href="http://www.wikidata.org/entity/Q89153746">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q1215575">naproxen</a> (<a href="http://www.wikidata.org/entity/Q1215575">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04325633</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153949">Efficacy of Dexamethasone Treatment for Patients With ARDS Caused by COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89153949">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27106392">dexamethasone acetate</a> (<a href="http://www.wikidata.org/entity/Q27106392">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04325061</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153949">Efficacy of Dexamethasone Treatment for Patients With ARDS Caused by COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89153949">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q408524">Cyclofosfamide</a> (<a href="http://www.wikidata.org/entity/Q408524">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04325061</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153965">A Phase I/II Study of Universal Off-the-shelf NKG2D-ACE2 CAR-NK Cells for Therapy of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89153965">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3950557">Sargramostim</a> (<a href="http://www.wikidata.org/entity/Q3950557">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04324996</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153965">A Phase I/II Study of Universal Off-the-shelf NKG2D-ACE2 CAR-NK Cells for Therapy of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89153965">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3950557">Sargramostim</a> (<a href="http://www.wikidata.org/entity/Q3950557">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04324996</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154124">A Study of a Candidate COVID-19 Vaccine (COV001)</a> (<a href="http://www.wikidata.org/entity/Q89154124">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q95042269">AZD1222</a> (<a href="http://www.wikidata.org/entity/Q95042269">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04324606</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154124">A Study of a Candidate COVID-19 Vaccine (COV001)</a> (<a href="http://www.wikidata.org/entity/Q89154124">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q95042269">AZD1222</a> (<a href="http://www.wikidata.org/entity/Q95042269">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04324606</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154154">Anti-Coronavirus Therapies to Prevent Progression of Coronavirus Disease 2019 (COVID-19) Trial</a> (<a href="http://www.wikidata.org/entity/Q89154154">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04324463</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154154">Anti-Coronavirus Therapies to Prevent Progression of Coronavirus Disease 2019 (COVID-19) Trial</a> (<a href="http://www.wikidata.org/entity/Q89154154">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04324463</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154299">Cohort Multiple Randomized Controlled Trials Open-label of Immune Modulatory Drugs and Other Treatments in COVID-19 Patients - Sarilumab Trial - CORIMUNO-19 - SARI</a> (<a href="http://www.wikidata.org/entity/Q89154299">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04324073</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154299">Cohort Multiple Randomized Controlled Trials Open-label of Immune Modulatory Drugs and Other Treatments in COVID-19 Patients - Sarilumab Trial - CORIMUNO-19 - SARI</a> (<a href="http://www.wikidata.org/entity/Q89154299">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04324073</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154305">Efficacy and Safety of Emapalumab and Anakinra in Reducing Hyperinflammation and Respiratory Distress in Patients With COVID-19 Infection.</a> (<a href="http://www.wikidata.org/entity/Q89154305">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q415411">Anakinra</a> (<a href="http://www.wikidata.org/entity/Q415411">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04324021</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154305">Efficacy and Safety of Emapalumab and Anakinra in Reducing Hyperinflammation and Respiratory Distress in Patients With COVID-19 Infection.</a> (<a href="http://www.wikidata.org/entity/Q89154305">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q415411">Anakinra</a> (<a href="http://www.wikidata.org/entity/Q415411">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04324021</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154343">Efficacy and Safety Human Coronavirus Immune Plasma (HCIP) vs. Control (SARS-CoV-2 Non-immune Plasma) Among Adults Exposed to COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89154343">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04323800</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154343">Efficacy and Safety Human Coronavirus Immune Plasma (HCIP) vs. Control (SARS-CoV-2 Non-immune Plasma) Among Adults Exposed to COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89154343">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04323800</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154366">Hydroxychloroquine for the Treatment of Patients With Mild to Moderate COVID-19 to Prevent Progression to Severe Infection or Death</a> (<a href="http://www.wikidata.org/entity/Q89154366">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04323631</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154372">Efficacy of Methylprednisolone for Patients With COVID-19 Severe Acute Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q89154372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q11426176">prednisolon</a> (<a href="http://www.wikidata.org/entity/Q11426176">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04323592</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154372">Efficacy of Methylprednisolone for Patients With COVID-19 Severe Acute Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q89154372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q11426176">prednisolon</a> (<a href="http://www.wikidata.org/entity/Q11426176">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04323592</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154372">Efficacy of Methylprednisolone for Patients With COVID-19 Severe Acute Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q89154372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27107351">methylprednisolone acetate</a> (<a href="http://www.wikidata.org/entity/Q27107351">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04323592</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154372">Efficacy of Methylprednisolone for Patients With COVID-19 Severe Acute Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q89154372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27107351">methylprednisolone acetate</a> (<a href="http://www.wikidata.org/entity/Q27107351">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04323592</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154372">Efficacy of Methylprednisolone for Patients With COVID-19 Severe Acute Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q89154372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27108063">prednisolone acetate</a> (<a href="http://www.wikidata.org/entity/Q27108063">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04323592</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154372">Efficacy of Methylprednisolone for Patients With COVID-19 Severe Acute Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q89154372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27108063">prednisolone acetate</a> (<a href="http://www.wikidata.org/entity/Q27108063">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04323592</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154372">Efficacy of Methylprednisolone for Patients With COVID-19 Severe Acute Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q89154372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27262132">methylprednisolone hemisuccinate</a> (<a href="http://www.wikidata.org/entity/Q27262132">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04323592</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154372">Efficacy of Methylprednisolone for Patients With COVID-19 Severe Acute Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q89154372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27262132">methylprednisolone hemisuccinate</a> (<a href="http://www.wikidata.org/entity/Q27262132">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04323592</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154372">Efficacy of Methylprednisolone for Patients With COVID-19 Severe Acute Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q89154372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27266327">prednisolone 21-phosphate</a> (<a href="http://www.wikidata.org/entity/Q27266327">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04323592</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154372">Efficacy of Methylprednisolone for Patients With COVID-19 Severe Acute Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q89154372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27266327">prednisolone 21-phosphate</a> (<a href="http://www.wikidata.org/entity/Q27266327">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04323592</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154372">Efficacy of Methylprednisolone for Patients With COVID-19 Severe Acute Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q89154372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27278862">prednisolone hemisuccinate</a> (<a href="http://www.wikidata.org/entity/Q27278862">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04323592</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154372">Efficacy of Methylprednisolone for Patients With COVID-19 Severe Acute Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q89154372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27278862">prednisolone hemisuccinate</a> (<a href="http://www.wikidata.org/entity/Q27278862">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04323592</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154372">Efficacy of Methylprednisolone for Patients With COVID-19 Severe Acute Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q89154372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q417222">Methylprednisolone</a> (<a href="http://www.wikidata.org/entity/Q417222">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04323592</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154372">Efficacy of Methylprednisolone for Patients With COVID-19 Severe Acute Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q89154372">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q417222">Methylprednisolone</a> (<a href="http://www.wikidata.org/entity/Q417222">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04323592</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154411">Efficacy of Natural Honey Treatment in Patients With Novel Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q89154411">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04323345</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154414">Traditional Chinese Medicine for Severe COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89154414">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04323332</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154473">Anti-inflammatory/Antioxidant Oral Nutrition Supplementation in COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89154473">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q188724">niet-steroïdale ontstekingsremmer</a> (<a href="http://www.wikidata.org/entity/Q188724">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04323228</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154556">Anti-il6 Treatment of Serious COVID-19 Disease With Threatening Respiratory Failure</a> (<a href="http://www.wikidata.org/entity/Q89154556">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04322773</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154576">Colchicine Coronavirus SARS-CoV2 Trial</a> (<a href="http://www.wikidata.org/entity/Q89154576">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q326224">Colchicine</a> (<a href="http://www.wikidata.org/entity/Q326224">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04322682</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154592">Colchicine Efficacy in COVID-19 Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q89154592">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q9268800">gloriosine</a> (<a href="http://www.wikidata.org/entity/Q9268800">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04322565</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154616">Proactive Prophylaxis With Azithromycin and Chloroquine in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89154616">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04322396</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154616">Proactive Prophylaxis With Azithromycin and Chloroquine in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89154616">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04322396</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154616">Proactive Prophylaxis With Azithromycin and Chloroquine in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89154616">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04322396</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154622">Escin in Patients With Covid-19 Infection</a> (<a href="http://www.wikidata.org/entity/Q89154622">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04322344</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154622">Escin in Patients With Covid-19 Infection</a> (<a href="http://www.wikidata.org/entity/Q89154622">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04322344</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154667">Safety and Efficacy of Hydroxychloroquine Associated With Azythromycin in SARS-Cov-2 Virus</a> (<a href="http://www.wikidata.org/entity/Q89154667">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04322123</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154688">Treatment of Moderate to Severe Coronavirus Disease (COVID-19) in Hospitalized Patients</a> (<a href="http://www.wikidata.org/entity/Q89154688">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q17149812">Janus kinase inhibitors</a> (<a href="http://www.wikidata.org/entity/Q17149812">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04321993</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154688">Treatment of Moderate to Severe Coronavirus Disease (COVID-19) in Hospitalized Patients</a> (<a href="http://www.wikidata.org/entity/Q89154688">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04321993</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154688">Treatment of Moderate to Severe Coronavirus Disease (COVID-19) in Hospitalized Patients</a> (<a href="http://www.wikidata.org/entity/Q89154688">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04321993</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154688">Treatment of Moderate to Severe Coronavirus Disease (COVID-19) in Hospitalized Patients</a> (<a href="http://www.wikidata.org/entity/Q89154688">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04321993</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154744">The Efficacy of Different Anti-viral Drugs in (Severe Acute Respiratory Syndrome-Corona Virus-2) SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q89154744">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40207875">antiviral agent</a> (<a href="http://www.wikidata.org/entity/Q40207875">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04321616</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154744">The Efficacy of Different Anti-viral Drugs in (Severe Acute Respiratory Syndrome-Corona Virus-2) SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q89154744">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40207875">antiviral agent</a> (<a href="http://www.wikidata.org/entity/Q40207875">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04321616</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154744">The Efficacy of Different Anti-viral Drugs in (Severe Acute Respiratory Syndrome-Corona Virus-2) SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q89154744">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04321616</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154744">The Efficacy of Different Anti-viral Drugs in (Severe Acute Respiratory Syndrome-Corona Virus-2) SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q89154744">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04321616</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154799">Safety and Efficacy of Hydroxychloroquine Associated With Azithromycin in SARS-CoV2 Virus (Coalition Covid-19 Brasil II)</a> (<a href="http://www.wikidata.org/entity/Q89154799">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04321278</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154816">COVID-19 Ring-based Prevention Trial With Lopinavir/Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q89154816">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04321174</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154816">COVID-19 Ring-based Prevention Trial With Lopinavir/Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q89154816">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04321174</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154825">The Impact of Camostat Mesilate on COVID-19 Infection</a> (<a href="http://www.wikidata.org/entity/Q89154825">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q5515384">gabexate</a> (<a href="http://www.wikidata.org/entity/Q5515384">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04321096</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154825">The Impact of Camostat Mesilate on COVID-19 Infection</a> (<a href="http://www.wikidata.org/entity/Q89154825">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q5515384">gabexate</a> (<a href="http://www.wikidata.org/entity/Q5515384">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04321096</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154902">A Study to Evaluate the Safety and Efficacy of Tocilizumab in Patients With Severe COVID-19 Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q89154902">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04320615</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154955">Baricitinib in Symptomatic Patients Infected by COVID-19: an Open-label, Pilot Study.</a> (<a href="http://www.wikidata.org/entity/Q89154955">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40207875">antiviral agent</a> (<a href="http://www.wikidata.org/entity/Q40207875">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04320277</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154955">Baricitinib in Symptomatic Patients Infected by COVID-19: an Open-label, Pilot Study.</a> (<a href="http://www.wikidata.org/entity/Q89154955">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04320277</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154960">Experimental Trial of rhIFNα Nasal Drops to Prevent 2019-nCOV in Medical Staff</a> (<a href="http://www.wikidata.org/entity/Q89154960">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q188269">Interferon</a> (<a href="http://www.wikidata.org/entity/Q188269">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04320238</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154960">Experimental Trial of rhIFNα Nasal Drops to Prevent 2019-nCOV in Medical Staff</a> (<a href="http://www.wikidata.org/entity/Q89154960">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q20817234">thymalfasin</a> (<a href="http://www.wikidata.org/entity/Q20817234">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04320238</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89155044">A Pilot Study of Human Amniotic Fluid for COVID19 Associated Respiratory Failure</a> (<a href="http://www.wikidata.org/entity/Q89155044">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04319731</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89155223">Hydroxychloroquine Post Exposure Prophylaxis for Coronavirus Disease (COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q89155223">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04318444</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89155223">Hydroxychloroquine Post Exposure Prophylaxis for Coronavirus Disease (COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q89155223">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04318444</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89155289">Hydroxychloroquine Chemoprophylaxis in Healthcare Personnel in Contact With COVID-19 Patients (PHYDRA Trial)</a> (<a href="http://www.wikidata.org/entity/Q89155289">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04318015</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89154108">Tocilizumab in COVID-19 Pneumonia (TOCIVID-19)</a> (<a href="http://www.wikidata.org/entity/Q89154108">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q425154">Tocilizumab</a> (<a href="http://www.wikidata.org/entity/Q425154">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04317092</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89155457">CD24Fc as a Non-antiviral Immunomodulator in COVID-19 Treatment</a> (<a href="http://www.wikidata.org/entity/Q89155457">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04317040</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153050">Norwegian Coronavirus Disease 2019 Study</a> (<a href="http://www.wikidata.org/entity/Q89153050">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04316377</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153050">Norwegian Coronavirus Disease 2019 Study</a> (<a href="http://www.wikidata.org/entity/Q89153050">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04316377</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153050">Norwegian Coronavirus Disease 2019 Study</a> (<a href="http://www.wikidata.org/entity/Q89153050">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04316377</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89155498">NestCell® Mesenchymal Stem Cell to Treat Patients With Severe COVID-19 Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q89155498">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04315987</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89155499">Trial of Treatments for COVID-19 in Hospitalized Adults</a> (<a href="http://www.wikidata.org/entity/Q89155499">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q188269">Interferon</a> (<a href="http://www.wikidata.org/entity/Q188269">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04315948</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89155499">Trial of Treatments for COVID-19 in Hospitalized Adults</a> (<a href="http://www.wikidata.org/entity/Q89155499">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q2450337">Interferon bèta-1a</a> (<a href="http://www.wikidata.org/entity/Q2450337">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04315948</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89155499">Trial of Treatments for COVID-19 in Hospitalized Adults</a> (<a href="http://www.wikidata.org/entity/Q89155499">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04315948</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89155499">Trial of Treatments for COVID-19 in Hospitalized Adults</a> (<a href="http://www.wikidata.org/entity/Q89155499">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04315948</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89155499">Trial of Treatments for COVID-19 in Hospitalized Adults</a> (<a href="http://www.wikidata.org/entity/Q89155499">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04315948</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89153106">Hydroxychloroquine Treatment for Severe COVID-19 Pulmonary Infection (HYDRA Trial)</a> (<a href="http://www.wikidata.org/entity/Q89153106">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04315896</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89155518">Evaluation of the Efficacy and Safety of Sarilumab in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89155518">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04315298</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89155518">Evaluation of the Efficacy and Safety of Sarilumab in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89155518">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04315298</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931159">Treatment of COVID-19 Patients Using Wharton's Jelly-Mesenchymal Stem Cells</a> (<a href="http://www.wikidata.org/entity/Q87931159">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04313322</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931212">The Use PUL-042 Inhalation Solution to Prevent COVID-19 in Adults Exposed to SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87931212">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57055">Paracetamol</a> (<a href="http://www.wikidata.org/entity/Q57055">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04313023</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931173">The Use of PUL-042 Inhalation Solution to Reduce the Severity of COVID-19 in Adults Positive for SARS-CoV-2 Infection</a> (<a href="http://www.wikidata.org/entity/Q87931173">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57055">Paracetamol</a> (<a href="http://www.wikidata.org/entity/Q57055">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04312997</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931173">The Use of PUL-042 Inhalation Solution to Reduce the Severity of COVID-19 in Adults Positive for SARS-CoV-2 Infection</a> (<a href="http://www.wikidata.org/entity/Q87931173">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57055">Paracetamol</a> (<a href="http://www.wikidata.org/entity/Q57055">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04312997</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931427">NO Prevention of COVID-19 for Healthcare Providers</a> (<a href="http://www.wikidata.org/entity/Q87931427">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q207843">stikstofmonoxide</a> (<a href="http://www.wikidata.org/entity/Q207843">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04312243</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931467">Randomized Controlled Trial of Losartan for Patients With COVID-19 Requiring Hospitalization</a> (<a href="http://www.wikidata.org/entity/Q87931467">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q410074">Losartan</a> (<a href="http://www.wikidata.org/entity/Q410074">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04312009</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931549">Intravenous Aviptadil for COVID-19 Associated Acute Respiratory Distress</a> (<a href="http://www.wikidata.org/entity/Q87931549">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q420360">Phentolamine</a> (<a href="http://www.wikidata.org/entity/Q420360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04311697</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931644">Randomized Controlled Trial of Losartan for Patients With COVID-19 Not Requiring Hospitalization</a> (<a href="http://www.wikidata.org/entity/Q87931644">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q410074">Losartan</a> (<a href="http://www.wikidata.org/entity/Q410074">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04311177</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931745">Yinhu Qingwen Granula for the Treatment of Severe CoVID-19</a> (<a href="http://www.wikidata.org/entity/Q87931745">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04310865</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931745">Yinhu Qingwen Granula for the Treatment of Severe CoVID-19</a> (<a href="http://www.wikidata.org/entity/Q87931745">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04310865</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87932565">Tetrandrine Tablets Used in the Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87932565">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04308317</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87932725">Comparison of Lopinavir/Ritonavir or Hydroxychloroquine in Patients With Mild Coronavirus Disease (COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q87932725">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">Hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04307693</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87932725">Comparison of Lopinavir/Ritonavir or Hydroxychloroquine in Patients With Mild Coronavirus Disease (COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q87932725">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04307693</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87932725">Comparison of Lopinavir/Ritonavir or Hydroxychloroquine in Patients With Mild Coronavirus Disease (COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q87932725">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04307693</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931003">Nitric Oxide Gas Inhalation Therapy for Mild/Moderate COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87931003">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q207843">stikstofmonoxide</a> (<a href="http://www.wikidata.org/entity/Q207843">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04305457</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931200">A Pilot Study of Sildenafil in COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87931200">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q159683">citroenzuur</a> (<a href="http://www.wikidata.org/entity/Q159683">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04304313</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931200">A Pilot Study of Sildenafil in COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87931200">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27126379">sildenafil citrate</a> (<a href="http://www.wikidata.org/entity/Q27126379">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04304313</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931200">A Pilot Study of Sildenafil in COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87931200">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q409728">Trinatriumcitraat</a> (<a href="http://www.wikidata.org/entity/Q409728">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04304313</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931271">Treatment of Mild Cases and Chemoprophylaxis of Contacts as Prevention of the COVID-19 Epidemic</a> (<a href="http://www.wikidata.org/entity/Q87931271">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40207875">antiviral agent</a> (<a href="http://www.wikidata.org/entity/Q40207875">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04304053</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931271">Treatment of Mild Cases and Chemoprophylaxis of Contacts as Prevention of the COVID-19 Epidemic</a> (<a href="http://www.wikidata.org/entity/Q87931271">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04304053</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931478">Various Combination of Protease Inhibitors, Oseltamivir, Favipiravir, and Chloroquin for Treatment of COVID19 : A Randomized Control Trial</a> (<a href="http://www.wikidata.org/entity/Q87931478">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q211509">Oseltamivir</a> (<a href="http://www.wikidata.org/entity/Q211509">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04303299</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931478">Various Combination of Protease Inhibitors, Oseltamivir, Favipiravir, and Chloroquin for Treatment of COVID19 : A Randomized Control Trial</a> (<a href="http://www.wikidata.org/entity/Q87931478">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3765251">Darunavir</a> (<a href="http://www.wikidata.org/entity/Q3765251">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04303299</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931478">Various Combination of Protease Inhibitors, Oseltamivir, Favipiravir, and Chloroquin for Treatment of COVID19 : A Randomized Control Trial</a> (<a href="http://www.wikidata.org/entity/Q87931478">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04303299</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931478">Various Combination of Protease Inhibitors, Oseltamivir, Favipiravir, and Chloroquin for Treatment of COVID19 : A Randomized Control Trial</a> (<a href="http://www.wikidata.org/entity/Q87931478">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04303299</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931478">Various Combination of Protease Inhibitors, Oseltamivir, Favipiravir, and Chloroquin for Treatment of COVID19 : A Randomized Control Trial</a> (<a href="http://www.wikidata.org/entity/Q87931478">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04303299</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87931478">Various Combination of Protease Inhibitors, Oseltamivir, Favipiravir, and Chloroquin for Treatment of COVID19 : A Randomized Control Trial</a> (<a href="http://www.wikidata.org/entity/Q87931478">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04303299</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87932554">Safety and Immunity of Covid-19 aAPC Vaccine</a> (<a href="http://www.wikidata.org/entity/Q87932554">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04299724</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87930304">Stem Cell Educator Therapy Treat the Viral Inflammation Caused by Severe Acute Respiratory Syndrome Coronavirus 2</a> (<a href="http://www.wikidata.org/entity/Q87930304">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04299152</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87078390">Study to Evaluate the Safety and Antiviral Activity of Remdesivir (GS-5734™) in Participants With Severe Coronavirus Disease (COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q87078390">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28209496">Remdesivir</a> (<a href="http://www.wikidata.org/entity/Q28209496">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04292899</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87078390">Study to Evaluate the Safety and Antiviral Activity of Remdesivir (GS-5734™) in Participants With Severe Coronavirus Disease (COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q87078390">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q84263196">COVID-19</a> (<a href="http://www.wikidata.org/entity/Q84263196">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04292899</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87078421">Study to Evaluate the Safety and Antiviral Activity of Remdesivir (GS-5734™) in Participants With Moderate Coronavirus Disease (COVID-19) Compared to Standard of Care Treatment</a> (<a href="http://www.wikidata.org/entity/Q87078421">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28209496">Remdesivir</a> (<a href="http://www.wikidata.org/entity/Q28209496">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04292730</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87078691">The Efficacy and Safety of Huai er in the Adjuvant Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87078691">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04291053</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87078691">The Efficacy and Safety of Huai er in the Adjuvant Treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87078691">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04291053</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87078716">Nitric Oxide Gas Inhalation for Severe Acute Respiratory Syndrome in COVID-19.</a> (<a href="http://www.wikidata.org/entity/Q87078716">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q207843">stikstofmonoxide</a> (<a href="http://www.wikidata.org/entity/Q207843">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04290871</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87078718">Nitric Oxide Gas Inhalation Therapy for Mild/Moderate COVID19 Infection</a> (<a href="http://www.wikidata.org/entity/Q87078718">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q207843">stikstofmonoxide</a> (<a href="http://www.wikidata.org/entity/Q207843">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04290858</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87079148">Treatment With Mesenchymal Stem Cells for Severe Corona Virus Disease 2019(COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q87079148">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q84263196">COVID-19</a> (<a href="http://www.wikidata.org/entity/Q84263196">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04288102</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87079148">Treatment With Mesenchymal Stem Cells for Severe Corona Virus Disease 2019(COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q87079148">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q84263196">COVID-19</a> (<a href="http://www.wikidata.org/entity/Q84263196">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04288102</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87932973">The Clinical Study of Carrimycin on Treatment Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87932973">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04286503</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87932973">The Clinical Study of Carrimycin on Treatment Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87932973">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04286503</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87932973">The Clinical Study of Carrimycin on Treatment Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87932973">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04286503</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87932973">The Clinical Study of Carrimycin on Treatment Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87932973">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42825046">klinische proeffase IV</a> (<a href="http://www.wikidata.org/entity/Q42825046">edit</a>)</td>
    <td>NCT04286503</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87775009">Safety and Immunogenicity Study of 2019-nCoV Vaccine (mRNA-1273) to Prevent SARS-CoV-2 Infection</a> (<a href="http://www.wikidata.org/entity/Q87775009">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87775025">mRNA-1273</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04283461</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87775009">Safety and Immunogenicity Study of 2019-nCoV Vaccine (mRNA-1273) to Prevent SARS-CoV-2 Infection</a> (<a href="http://www.wikidata.org/entity/Q87775009">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87775025">mRNA-1273</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04283461</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86276764">Adaptive COVID-19 Treatment Trial</a> (<a href="http://www.wikidata.org/entity/Q86276764">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04280705</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87076197">Fingolimod in COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87076197">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27132395">fingolimod hydrochloride</a> (<a href="http://www.wikidata.org/entity/Q27132395">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04280588</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87076197">Fingolimod in COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87076197">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q84263196">COVID-19</a> (<a href="http://www.wikidata.org/entity/Q84263196">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04280588</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86280112">Yinhu Qingwen Decoction for the Treatment of Mild / Common CoVID-19</a> (<a href="http://www.wikidata.org/entity/Q86280112">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q84263196">COVID-19</a> (<a href="http://www.wikidata.org/entity/Q84263196">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04278963</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86280112">Yinhu Qingwen Decoction for the Treatment of Mild / Common CoVID-19</a> (<a href="http://www.wikidata.org/entity/Q86280112">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q84263196">COVID-19</a> (<a href="http://www.wikidata.org/entity/Q84263196">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04278963</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86293782">Function and Safety Study of SARS-CoV-2 Synthetic Minigene Vaccines</a> (<a href="http://www.wikidata.org/entity/Q86293782">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824069">klinische proeffase I</a> (<a href="http://www.wikidata.org/entity/Q42824069">edit</a>)</td>
    <td>NCT04276896</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86293782">Function and Safety Study of SARS-CoV-2 Synthetic Minigene Vaccines</a> (<a href="http://www.wikidata.org/entity/Q86293782">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04276896</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86281659">Bevacizumab in Severe or Critical Patients With COVID-19 Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q86281659">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q413299">bevacizumab</a> (<a href="http://www.wikidata.org/entity/Q413299">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04275414</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86281659">Bevacizumab in Severe or Critical Patients With COVID-19 Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q86281659">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q413299">bevacizumab</a> (<a href="http://www.wikidata.org/entity/Q413299">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">klinische proeffase III</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04275414</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86273774">The Efficacy and Safety of Thalidomide Combined With Low-dose Hormones in the Treatment of Severe COVID-19</a> (<a href="http://www.wikidata.org/entity/Q86273774">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q203174">Thalidomide</a> (<a href="http://www.wikidata.org/entity/Q203174">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04273581</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86273774">The Efficacy and Safety of Thalidomide Combined With Low-dose Hormones in the Treatment of Severe COVID-19</a> (<a href="http://www.wikidata.org/entity/Q86273774">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q84263196">COVID-19</a> (<a href="http://www.wikidata.org/entity/Q84263196">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04273581</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86273846">The Efficacy and Safety of Thalidomide in the Adjuvant Treatment of Moderate New Coronavirus (COVID-19) Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q86273846">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q203174">Thalidomide</a> (<a href="http://www.wikidata.org/entity/Q203174">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04273529</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87076423">Immunoregulatory Therapy for 2019-nCoV</a> (<a href="http://www.wikidata.org/entity/Q87076423">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q66559285">Immunoglobuline</a> (<a href="http://www.wikidata.org/entity/Q66559285">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04268537</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q86278951">Vitamin C Infusion for the Treatment of Severe 2019-nCoV Infected Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q86278951">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q193598">Ascorbinezuur</a> (<a href="http://www.wikidata.org/entity/Q193598">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">klinische proeffase II</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04264533</td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/clinicalTrials.rq | sed 's+<lang/>+nl+' > clinicalTrials.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@clinicalTrials.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
