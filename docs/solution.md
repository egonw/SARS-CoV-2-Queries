<!--- THIS FILE IS AUTOGENERATED. DO NOT EDIT IT. -->

[ **en** [ja](ja/solution.md) [es](es/solution.md) [pt](pt/solution.md)  ]

# Solutions

Since the start of the pandemic, various solutions have been developed. A vaccine is one of them, but
development of that takes time [<a href="#citeref1">1</a>]. But there are also ideas about
antibodies and repurposing of drugs. All this is very much exploratory at this
moment. Clinical trials remain important (see the [Clinical trials](https://egonw.github.io/SARS-CoV-2-Queries/covid.html#clinical-trials) section).

This Chapter shows a number of queries with information in Wikidata about
leads that people have proposed that may lead to a solution.

## Antibodies

Antibodies are getting an interest. The following query lists articles about
the human coronaviruses and also annotated with the term '<a name="tp1">antibody</a>':

**SPARQL** [sparql/antibodies.rq](sparql/antibodies.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ79460%20.%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3Fvirus%20%3FworkLabel%20%3Fwork%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ79460%20.%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3Fvirus%20%3FworkLabel%20%3Fwork%0A))

```sparql
SELECT ?virus ?virusLabel ?work ?workLabel WITH {
  SELECT ?virus ?work WHERE {
    VALUES ?virus {
      wd:Q82069695 # SARS-CoV-2
      wd:Q16983360 # HKU1
      wd:Q16991954 # OC43
      wd:Q8351095  # NL63 
      wd:Q16983356 # 229E 
      wd:Q4902157  # MERS-CoV
      wd:Q278567   # SARS-CoV
    }
    ?work wdt:P921 ?virus ;
          wdt:P921 wd:Q79460 .
  }
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
}
ORDER BY ?virusLabel ?virus ?workLabel ?work
```

The list is getting long, so let's first show the number of articles about
antibodies for each virus:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARSr-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td>48</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>16</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>15</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>1</td>
  </tr>
</table>

It must be stressed that antibodies are specific for every protein and every
coronavirus has different proteins, and this list is just to shortlist relevant
literature for reading, not to draw conclusions from:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>work</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40614291">Antibody to virus components in volunteers experimentally infected with human coronavirus 229E group viruses</a> (<a href="http://www.wikidata.org/entity/Q40614291">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41288189">Detection of human coronavirus 229E-specific antibodies using recombinant fusion proteins</a> (<a href="http://www.wikidata.org/entity/Q41288189">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57096902">Development of a recombinant truncated nucleocapsid protein based immunoassay for detection of antibodies against human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q57096902">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33743790">A conformation-dependent neutralizing monoclonal antibody specifically targeting receptor-binding domain in Middle East respiratory syndrome coronavirus spike protein.</a> (<a href="http://www.wikidata.org/entity/Q33743790">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30379384">A humanized neutralizing antibody against MERS-CoV targeting the receptor-binding domain of the spike protein.</a> (<a href="http://www.wikidata.org/entity/Q30379384">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37152873">A safe and convenient pseudovirus-based inhibition assay to detect neutralizing antibodies and screen for viral entry inhibitors against the novel human coronavirus MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q37152873">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35063993">A truncated receptor-binding domain of MERS-CoV spike protein potently inhibits MERS-CoV infection and induces strong neutralizing antibody responses: implication for developing therapeutics and vaccines</a> (<a href="http://www.wikidata.org/entity/Q35063993">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30362113">Exceptionally potent neutralization of Middle East respiratory syndrome coronavirus by human monoclonal antibodies.</a> (<a href="http://www.wikidata.org/entity/Q30362113">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42256279">Investigation of anti-middle East respiratory syndrome antibodies in blood donors and slaughterhouse workers in Jeddah and Makkah, Saudi Arabia, fall 2012.</a> (<a href="http://www.wikidata.org/entity/Q42256279">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42210505">Middle East respiratory syndrome coronavirus (MERS-CoV) RNA and neutralising antibodies in milk collected according to local customs from dromedary camels, Qatar, April 2014.</a> (<a href="http://www.wikidata.org/entity/Q42210505">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30358243">Middle East respiratory syndrome coronavirus antibody reactors among camels in Dubai, United Arab Emirates, in 2005.</a> (<a href="http://www.wikidata.org/entity/Q30358243">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42251659">Middle East respiratory syndrome coronavirus neutralising serum antibodies in dromedary camels: a comparative serological study.</a> (<a href="http://www.wikidata.org/entity/Q42251659">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42249511">Middle East respiratory syndrome coronavirus spike protein delivered by modified vaccinia virus Ankara efficiently induces virus-neutralizing antibodies</a> (<a href="http://www.wikidata.org/entity/Q42249511">edit</a>)</td>
  </tr>
  <tr><td colspan="2">This table is truncated. See the full table at <a href="sparql/antibodies.code.html">sparql/antibodies.rq</a></td></tr>
</table>

## Vaccines

Over time, several vaccines have been developed that provide us with a level of immunity
to protect us against SARS-CoV-2. Many vaccines have been developed now [<a href="#citeref2">2</a>].
We can list the vaccines given in Wikidata with this query:

**SPARQL** [sparql/vaccines.rq](sparql/vaccines.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20DISTINCT%20%3Fvaccine%20%3FvaccineLabel%20%3Fannouncement%20WHERE%20%7B%0A%20%20%3Fvaccine%20wdt%3AP279%20wd%3AQ87719492%20.%0A%20%20OPTIONAL%20%7B%20%3Fvaccine%20wdt%3AP6949%20%3Fannouncement%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%20ASC%28%3Fannouncement%29%0A), [edit](https://query.wikidata.org/#SELECT%20DISTINCT%20%3Fvaccine%20%3FvaccineLabel%20%3Fannouncement%20WHERE%20%7B%0A%20%20%3Fvaccine%20wdt%3AP279%20wd%3AQ87719492%20.%0A%20%20OPTIONAL%20%7B%20%3Fvaccine%20wdt%3AP6949%20%3Fannouncement%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%20ASC%28%3Fannouncement%29%0A))

```sparql
SELECT DISTINCT ?vaccine ?vaccineLabel ?announcement WHERE {
  ?vaccine wdt:P279 wd:Q87719492 .
  OPTIONAL { ?vaccine wdt:P6949 ?announcement . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
} ORDER BY ASC(?vaccine) ASC(?announcement)
```

It currently list not many:

<table>
  <tr>
    <td><b>vaccine</b></td>
    <td><b>announcement</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158012">Sanofi/GSK SARS-CoV-2 subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q100158012">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158046">UB-612</a> (<a href="http://www.wikidata.org/entity/Q100158046">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158616">RBD SARS-CoV-2 HBsAg VLP</a> (<a href="http://www.wikidata.org/entity/Q100158616">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100532641">Q100532641</a> (<a href="http://www.wikidata.org/entity/Q100532641">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100694835">BriLife</a> (<a href="http://www.wikidata.org/entity/Q100694835">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246544">bacTRL-Spike</a> (<a href="http://www.wikidata.org/entity/Q101246544">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246625">hAd5-S-Fusion+N-ETSD</a> (<a href="http://www.wikidata.org/entity/Q101246625">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246699">VXA-CoV2-1</a> (<a href="http://www.wikidata.org/entity/Q101246699">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101251575">MVC COVID-19 Vaccine</a> (<a href="http://www.wikidata.org/entity/Q101251575">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104902499">Valneva COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q104902499">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105047585">SOBERANA 02</a> (<a href="http://www.wikidata.org/entity/Q105047585">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105217191">COVIran Barekat</a> (<a href="http://www.wikidata.org/entity/Q105217191">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106167301">QazCovid-in</a> (<a href="http://www.wikidata.org/entity/Q106167301">edit</a>)</td>
    <td></td>
  </tr>
  <tr><td colspan="2">This table is truncated. See the full table at <a href="sparql/vaccines.code.html">sparql/vaccines.rq</a></td></tr>
</table>

<a name="sec:trials"></a>
## Clinical trials

While far from complete, <a name="tp2">clinical trials</a> registered in <a name="tp3">clinicaltrials.gov</a> are finding their way
into Wikidata. The following query lists a number of clinical trials with COVID-19
as main topic:

**SPARQL** [sparql/clinicalTrials.rq](sparql/clinicalTrials.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Ftrial%20%3FtrialLabel%20%3Fintervention%20%3FinterventionLabel%20%3Fphase%20%3FphaseLabel%20%3Fidentifier%20WITH%20%7B%0A%20%20SELECT%20DISTINCT%20%3Ftrial%20%3Fphase%20%3Fidentifier%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Ftopic%20%7B%20wd%3AQ84263196%20wd%3AQ82069695%20%7D%0A%20%20%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP6099%20%3Fphase%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP3098%20%3Fidentifier%20.%0A%20%20%7D%0A%7D%20AS%20%25TRIALS%20%7B%0A%20%20INCLUDE%20%25TRIALS%0A%20%20OPTIONAL%20%7B%0A%20%20%20%20%3Ftrial%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fidentifier%29%20ASC%28%3Fintervention%29%0A), [edit](https://query.wikidata.org/#SELECT%20%3Ftrial%20%3FtrialLabel%20%3Fintervention%20%3FinterventionLabel%20%3Fphase%20%3FphaseLabel%20%3Fidentifier%20WITH%20%7B%0A%20%20SELECT%20DISTINCT%20%3Ftrial%20%3Fphase%20%3Fidentifier%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Ftopic%20%7B%20wd%3AQ84263196%20wd%3AQ82069695%20%7D%0A%20%20%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP6099%20%3Fphase%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP3098%20%3Fidentifier%20.%0A%20%20%7D%0A%7D%20AS%20%25TRIALS%20%7B%0A%20%20INCLUDE%20%25TRIALS%0A%20%20OPTIONAL%20%7B%0A%20%20%20%20%3Ftrial%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fidentifier%29%20ASC%28%3Fintervention%29%0A))

```sparql
SELECT ?trial ?trialLabel ?intervention ?interventionLabel ?phase ?phaseLabel ?identifier WITH {
  SELECT DISTINCT ?trial ?phase ?identifier WHERE {
    VALUES ?topic { wd:Q84263196 wd:Q82069695 }
    ?trial wdt:P31 wd:Q30612 ;
           wdt:P921 ?topic ;
           wdt:P6099 ?phase ;
           wdt:P3098 ?identifier .
  }
} AS %TRIALS {
  INCLUDE %TRIALS
  OPTIONAL {
    ?trial wdt:P4844 ?intervention .
  }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
} ORDER BY DESC(?identifier) ASC(?intervention)
```

This lists has become very long, and click one of the above links
to list them all, and only 15 are given here:

<table>
  <tr>
    <td><b>trial</b></td>
    <td><b>intervention</b></td>
    <td><b>phase</b></td>
    <td><b>identifier</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98710332">A Randomised, Controlled, Phase 1 Study to Evaluate the Safety and Immunogenicity of a Candidate Adjuvanted Recombinant Protein SARS-COV-2 Vaccine in Healthy Adult Subjects</a> (<a href="http://www.wikidata.org/entity/Q98710332">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97154237">COVAX-19</a> (<a href="http://www.wikidata.org/entity/Q97154237">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q5452194">phase I clinical trial</a> (<a href="http://www.wikidata.org/entity/Q5452194">edit</a>)</td>
    <td>NCT04453852</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q421094">hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422585">lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96759429">An Adaptive Study of Favipiravir Compared to Standard of Care in Hospitalized Patients With COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96759429">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q422618">ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04434248</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q95719961">Dose-Confirmation Study to Evaluate the Safety, Reactogenicity, and Immunogenicity of mRNA-1273 COVID-19 Vaccine in Adults Aged 18 Years and Older</a> (<a href="http://www.wikidata.org/entity/Q95719961">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87775025">mRNA-1273 vaccine</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04405076</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q93704421">Study of the Efficacy and Safety of a Single Administration of Olokizumab and RPH-104 With Standard Therapy in Patients With Severe Severe Acute Respiratory Syndrome Coronavirus 2 (SARS-CoV-2) Infection (COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q93704421">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04380519</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q93704421">Study of the Efficacy and Safety of a Single Administration of Olokizumab and RPH-104 With Standard Therapy in Patients With Severe Severe Acute Respiratory Syndrome Coronavirus 2 (SARS-CoV-2) Infection (COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q93704421">edit</a>)</td>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q42824440">phase II clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824440">edit</a>)</td>
    <td>NCT04380519</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q93328984">Study to Describe the Safety, Tolerability, Immunogenicity, and Potential Efficacy of RNA Vaccine Candidates Against COVID-19 in Healthy Adults</a> (<a href="http://www.wikidata.org/entity/Q93328984">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97154240">Pfizer–BioNTech COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q97154240">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42824827">phase III clinical trial</a> (<a href="http://www.wikidata.org/entity/Q42824827">edit</a>)</td>
    <td>NCT04368728</td>
  </tr>
  <tr><td colspan="2">This table is truncated. See the full table at <a href="sparql/clinicalTrials.code.html">sparql/clinicalTrials.rq</a></td></tr>
</table>

## Drug repurposing

The Section [8.3](#sec:trials) already listed an overview of clinical trials.
It gives an idea of what symptoms people are worried about. It also gives
insight in what <a name="tp4">drugs</a> are studied for <a name="tp5">repurposing</a>.
Some of these have received a lot of attention, others less so. They look like
this:

<iframe
  style="width: 95%; height: 50vh; border: none;"
  src="https://query.wikidata.org/embed.html#%23defaultView%3AImageGrid%0ASELECT%20%3Fintervention%20%3FinterventionLabel%20%3Fimage%20WITH%20%7B%0A%20%20SELECT%20DISTINCT%20%3Fintervention%20%28COUNT%28DISTINCT%20%3Ftrial%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Ftopic%20%7B%20wd%3AQ84263196%20wd%3AQ82069695%20%7D%0A%20%20%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20%7D%20GROUP%20BY%20%3Fintervention%0A%20%20%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A%20%20%20%20LIMIT%2025%0A%7D%20AS%20%25COMPOUNDS%20WHERE%20%7B%0A%20%20INCLUDE%20%25COMPOUNDS%0A%20%20%3Fintervention%20wdt%3AP117%20%3Fimage%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fcount%29%0A%20%20LIMIT%2010%0A"

  referrerpolicy="origin"
  sandbox="allow-scripts allow-same-origin allow-popups" >
</iframe>

The following query lists the number of clinical trials by <a name="tp6">intervention</a>:

**SPARQL** [sparql/clinicalTrialsByIntervention.rq](sparql/clinicalTrialsByIntervention.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fintervention%20%3FinterventionLabel%20%28COUNT%28%3Ftrial%29%20AS%20%3Ftrials%29%20WHERE%20%7B%0A%20%20VALUES%20%3Ftopic%20%7B%0A%20%20%20%20wd%3AQ84263196%20wd%3AQ82069695%0A%20%20%7D%0A%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP921%20%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fintervention%20%3FinterventionLabel%0A%20%20ORDER%20BY%20DESC%28%3Ftrials%29%20ASC%28%3Fintervention%29%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fintervention%20%3FinterventionLabel%20%28COUNT%28%3Ftrial%29%20AS%20%3Ftrials%29%20WHERE%20%7B%0A%20%20VALUES%20%3Ftopic%20%7B%0A%20%20%20%20wd%3AQ84263196%20wd%3AQ82069695%0A%20%20%7D%0A%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP921%20%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fintervention%20%3FinterventionLabel%0A%20%20ORDER%20BY%20DESC%28%3Ftrials%29%20ASC%28%3Fintervention%29%0A))

```sparql
SELECT ?intervention ?interventionLabel (COUNT(?trial) AS ?trials) WHERE {
  VALUES ?topic {
    wd:Q84263196 wd:Q82069695
  }
  ?trial wdt:P31 wd:Q30612 ;
         wdt:P921  ?topic ;
         wdt:P4844 ?intervention .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
} GROUP BY ?intervention ?interventionLabel
  ORDER BY DESC(?trials) ASC(?intervention)
```

This gives:

<table>
  <tr>
    <td><b>intervention</b></td>
    <td><b>trials</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q421094">hydroxychloroquine</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td>43</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q422438">chloroquine</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td>15</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q422585">lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td>15</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q422618">ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td>15</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td>12</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q425154">tocilizumab</a> (<a href="http://www.wikidata.org/entity/Q425154">edit</a>)</td>
    <td>6</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q188269">interferon</a> (<a href="http://www.wikidata.org/entity/Q188269">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q207843">nitric oxide</a> (<a href="http://www.wikidata.org/entity/Q207843">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q40207875">antiviral agent</a> (<a href="http://www.wikidata.org/entity/Q40207875">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q410074">losartan</a> (<a href="http://www.wikidata.org/entity/Q410074">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57055">paracetamol</a> (<a href="http://www.wikidata.org/entity/Q57055">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q11426176">prednisolone</a> (<a href="http://www.wikidata.org/entity/Q11426176">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q165399">azithromycin</a> (<a href="http://www.wikidata.org/entity/Q165399">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr><td colspan="2">This table is truncated. See the full table at <a href="sparql/clinicalTrialsByIntervention.code.html">sparql/clinicalTrialsByIntervention.rq</a></td></tr>
</table>

Importantly, this list only gives an idea of what intervention have received more
attention than others. And it is essential to realize that attention is not a measure
of success.

## References

1. <a name="citeref1"></a>Lu S, Lu S. Timely development of vaccines against SARS-CoV-2. Emerging microbes & infections. 2020 Mar 8;9(1):542–4.  doi:[10.1080/22221751.2020.1737580](https://doi.org/10.1080/22221751.2020.1737580) ([Scholia](https://scholia.toolforge.org/doi/10.1080/22221751.2020.1737580))
2. <a name="citeref2"></a>Le TT, Andreadakis Z, Kumar A, Román RG, Tollefsen S, Saville M, et al. The COVID-19 vaccine development landscape. Nat Rev Drug Discov. 2020 Apr 9;  doi:[10.1038/D41573-020-00073-5](https://doi.org/10.1038/D41573-020-00073-5) ([Scholia](https://scholia.toolforge.org/doi/10.1038/D41573-020-00073-5))


