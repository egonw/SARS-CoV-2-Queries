# compareViruses.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT DISTINCT ?virus ?virusLabel ?work ?workLabel WITH {
  SELECT DISTINCT ?virus ?virus2 ?work WHERE {
    VALUES ?virus {
      wd:Q82069695 # SARS-CoV-2
      wd:Q16983360 # HKU1
      wd:Q16991954 # OC43
      wd:Q8351095  # NL63 
      wd:Q16983356 # 229E 
      wd:Q4902157  # MERS-CoV
      wd:Q278567   # SARS-CoV
    }
    ?virus2 wdt:P171+ wd:Q57751738 .
    ?work wdt:P921 ?virus, ?virus2 .
    FILTER ( ?virus != ?virus2 )
  }
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
}
ORDER BY ?virusLabel ?virus ?workLabel ?work
```
[run](https://query.wikidata.org/embed.html#SELECT%20DISTINCT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20DISTINCT%20%3Fvirus%20%3Fvirus2%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fvirus2%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%2C%20%3Fvirus2%20.%0A%20%20%20%20FILTER%20%28%20%3Fvirus%20%21%3D%20%3Fvirus2%20%29%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3Fvirus%20%3FworkLabel%20%3Fwork%0A) or [edit](https://query.wikidata.org/#SELECT%20DISTINCT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20DISTINCT%20%3Fvirus%20%3Fvirus2%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fvirus2%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%2C%20%3Fvirus2%20.%0A%20%20%20%20FILTER%20%28%20%3Fvirus%20%21%3D%20%3Fvirus2%20%29%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3Fvirus%20%3FworkLabel%20%3Fwork%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>work</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Coronavírus humano 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42650437">Biochemical and immunological studies of nucleocapsid proteins of severe acute respiratory syndrome and 229E human coronaviruses.</a> (<a href="http://www.wikidata.org/entity/Q42650437">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Coronavírus humano 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39711479">Comparative host gene transcription by microarray analysis early after infection of the Huh7 cell line by SARS coronavirus and human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q39711479">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Coronavírus humano 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41650622">Detection of the human coronavirus 229E, HKU1, NL63, and OC43 between 2010 and 2013 in Yamagata, Japan.</a> (<a href="http://www.wikidata.org/entity/Q41650622">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Coronavírus humano 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97093636">Exaggerated risk of transmission of COVID-19 by fomites</a> (<a href="http://www.wikidata.org/entity/Q97093636">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Coronavírus humano 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40276002">Genetic variability of human coronavirus OC43-, 229E-, and NL63-like strains and their association with lower respiratory tract infections of hospitalized infants and immunocompromised patients.</a> (<a href="http://www.wikidata.org/entity/Q40276002">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Coronavírus humano 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42218066">Possible involvement of infection with human coronavirus 229E, but not NL63, in Kawasaki disease.</a> (<a href="http://www.wikidata.org/entity/Q42218066">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Coronavírus humano 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50502190">Replication of human coronaviruses SARS-CoV, HCoV-NL63 and HCoV-229E is inhibited by the drug FK506.</a> (<a href="http://www.wikidata.org/entity/Q50502190">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Coronavírus humano 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39551895">The ADP-ribose-1''-monophosphatase domains of severe acute respiratory syndrome coronavirus and human coronavirus 229E mediate resistance to antiviral interferon responses.</a> (<a href="http://www.wikidata.org/entity/Q39551895">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Coronavírus humano HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41650622">Detection of the human coronavirus 229E, HKU1, NL63, and OC43 between 2010 and 2013 in Yamagata, Japan.</a> (<a href="http://www.wikidata.org/entity/Q41650622">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Coronavírus humano HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35692285">Human Coronaviruses HCoV-NL63 and HCoV-HKU1 in Hospitalized Children with Acute Respiratory Infections in Beijing, China.</a> (<a href="http://www.wikidata.org/entity/Q35692285">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Coronavírus humano HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36641750">The novel human coronaviruses NL63 and HKU1.</a> (<a href="http://www.wikidata.org/entity/Q36641750">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Coronavírus humano HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44578885">[Development and comparison of real-time and conventional RT-PCR assay for detection of human coronavirus NL63 and HKU1].</a> (<a href="http://www.wikidata.org/entity/Q44578885">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavírus humano NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36622010">Attachment factor and receptor engagement of SARS coronavirus and human coronavirus NL63.</a> (<a href="http://www.wikidata.org/entity/Q36622010">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavírus humano NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41650622">Detection of the human coronavirus 229E, HKU1, NL63, and OC43 between 2010 and 2013 in Yamagata, Japan.</a> (<a href="http://www.wikidata.org/entity/Q41650622">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavírus humano NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33558501">Differential downregulation of ACE2 by the spike proteins of severe acute respiratory syndrome coronavirus and human coronavirus NL63.</a> (<a href="http://www.wikidata.org/entity/Q33558501">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavírus humano NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40276002">Genetic variability of human coronavirus OC43-, 229E-, and NL63-like strains and their association with lower respiratory tract infections of hospitalized infants and immunocompromised patients.</a> (<a href="http://www.wikidata.org/entity/Q40276002">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavírus humano NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35692285">Human Coronaviruses HCoV-NL63 and HCoV-HKU1 in Hospitalized Children with Acute Respiratory Infections in Beijing, China.</a> (<a href="http://www.wikidata.org/entity/Q35692285">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavírus humano NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41687420">Inhibition of endoplasmic reticulum-resident glucosidases impairs severe acute respiratory syndrome coronavirus and human coronavirus NL63 spike protein-mediated entry by altering the glycan processing of angiotensin I-converting enzyme 2.</a> (<a href="http://www.wikidata.org/entity/Q41687420">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavírus humano NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42218066">Possible involvement of infection with human coronavirus 229E, but not NL63, in Kawasaki disease.</a> (<a href="http://www.wikidata.org/entity/Q42218066">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavírus humano NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50502190">Replication of human coronaviruses SARS-CoV, HCoV-NL63 and HCoV-229E is inhibited by the drug FK506.</a> (<a href="http://www.wikidata.org/entity/Q50502190">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavírus humano NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40341738">SARS coronavirus, but not human coronavirus NL63, utilizes cathepsin L to infect ACE2-expressing cells.</a> (<a href="http://www.wikidata.org/entity/Q40341738">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavírus humano NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40220808">SARS-CoV, but not HCoV-NL63, utilizes cathepsins to infect cells: viral entry.</a> (<a href="http://www.wikidata.org/entity/Q40220808">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavírus humano NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36641750">The novel human coronaviruses NL63 and HKU1.</a> (<a href="http://www.wikidata.org/entity/Q36641750">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavírus humano NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44578885">[Development and comparison of real-time and conventional RT-PCR assay for detection of human coronavirus NL63 and HKU1].</a> (<a href="http://www.wikidata.org/entity/Q44578885">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Coronavírus humano OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36171303">An Outbreak of Human Coronavirus OC43 Infection and Serological Cross-reactivity with SARS Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q36171303">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Coronavírus humano OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42234785">Characterization of human coronavirus OC43 and human coronavirus NL63 infections among hospitalized children <5 years of age.</a> (<a href="http://www.wikidata.org/entity/Q42234785">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Coronavírus humano OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37336376">Chimeric exchange of coronavirus nsp5 proteases (3CLpro) identifies common and divergent regulatory determinants of protease activity</a> (<a href="http://www.wikidata.org/entity/Q37336376">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Coronavírus humano OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37247481">Clinical impact of human coronaviruses 229E and OC43 infection in diverse adult populations</a> (<a href="http://www.wikidata.org/entity/Q37247481">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Coronavírus humano OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39813726">Coronavirus isolates SK and SD from multiple sclerosis patients are serologically related to murine coronaviruses A59 and JHM and human coronavirus OC43, but not to human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q39813726">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Coronavírus humano OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41650622">Detection of the human coronavirus 229E, HKU1, NL63, and OC43 between 2010 and 2013 in Yamagata, Japan.</a> (<a href="http://www.wikidata.org/entity/Q41650622">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Coronavírus humano OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97093636">Exaggerated risk of transmission of COVID-19 by fomites</a> (<a href="http://www.wikidata.org/entity/Q97093636">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Coronavírus humano OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37702502">False-positive results in a recombinant severe acute respiratory syndrome-associated coronavirus (SARS-CoV) nucleocapsid enzyme-linked immunosorbent assay due to HCoV-OC43 and HCoV-229E rectified by Western blotting with recombinant SARS-CoV spike p</a> (<a href="http://www.wikidata.org/entity/Q37702502">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Coronavírus humano OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40276002">Genetic variability of human coronavirus OC43-, 229E-, and NL63-like strains and their association with lower respiratory tract infections of hospitalized infants and immunocompromised patients.</a> (<a href="http://www.wikidata.org/entity/Q40276002">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Coronavírus humano OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q73053612">Survival of human coronaviruses 229E and OC43 in suspension and after drying on surfaces: a possible source of hospital-acquired infections</a> (<a href="http://www.wikidata.org/entity/Q73053612">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Coronavírus humano OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q56795531">The dominance of human coronavirus OC43 and NL63 infections in infants</a> (<a href="http://www.wikidata.org/entity/Q56795531">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43720745">1H, 13C and 15N resonance assignments of SARS-CoV main protease N-terminal domain.</a> (<a href="http://www.wikidata.org/entity/Q43720745">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39472319">2,6-Bis-arylmethyloxy-5-hydroxychromones with antiviral activity against both hepatitis C virus (HCV) and SARS-associated coronavirus (SCV).</a> (<a href="http://www.wikidata.org/entity/Q39472319">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33904997">A 219-mer CHO-expressing receptor-binding domain of SARS-CoV S protein induces potent immune responses and protective immunity</a> (<a href="http://www.wikidata.org/entity/Q33904997">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44468486">A 3D model of SARS_CoV 3CL proteinase and its inhibitors design by virtual screening.</a> (<a href="http://www.wikidata.org/entity/Q44468486">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40520942">A DNA vaccine induces SARS coronavirus neutralization and protective immunity in mice.</a> (<a href="http://www.wikidata.org/entity/Q40520942">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50089835">A Novel Chemical Compound for Inhibition of SARS Coronavirus Helicase.</a> (<a href="http://www.wikidata.org/entity/Q50089835">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36702376">A SARS-like cluster of circulating bat coronaviruses shows potential for human emergence.</a> (<a href="http://www.wikidata.org/entity/Q36702376">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51964248">A chimeric multi-epitope DNA vaccine elicited specific antibody response against severe acute respiratory syndrome-associated coronavirus which attenuated the virulence of SARS-CoV in vitro.</a> (<a href="http://www.wikidata.org/entity/Q51964248">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43176879">A climatologic investigation of the SARS-CoV outbreak in Beijing, China.</a> (<a href="http://www.wikidata.org/entity/Q43176879">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50718881">A convenient cell fusion assay for the study of SARS-CoV entry and inhibition.</a> (<a href="http://www.wikidata.org/entity/Q50718881">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28260798">A crucial role of angiotensin converting enzyme 2 (ACE2) in SARS coronavirus-induced lung injury</a> (<a href="http://www.wikidata.org/entity/Q28260798">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28817689">A decade after SARS: strategies for controlling emerging coronaviruses</a> (<a href="http://www.wikidata.org/entity/Q28817689">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33278644">A dominant antigenic epitope on SARS-CoV spike protein identified by an avian single-chain variable fragment (scFv)-expressing phage.</a> (<a href="http://www.wikidata.org/entity/Q33278644">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45423400">A double-inactivated whole virus candidate SARS coronavirus vaccine stimulates neutralising and protective antibody responses.</a> (<a href="http://www.wikidata.org/entity/Q45423400">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35972651">A facile inhibitor screening of SARS coronavirus N protein using nanoparticle-based RNA oligonucleotide</a> (<a href="http://www.wikidata.org/entity/Q35972651">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45404515">A fluorogenic peptide containing the processing site of human SARS corona virus S-protein: kinetic evaluation and NMR structure elucidation.</a> (<a href="http://www.wikidata.org/entity/Q45404515">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37519569">A genome sequence of novel SARS-CoV isolates: the genotype, GD-Ins29, leads to a hypothesis of viral transmission in South China.</a> (<a href="http://www.wikidata.org/entity/Q37519569">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34135057">A hexapeptide of the receptor-binding domain of SARS corona virus spike protein blocks viral entry into host cells via the human receptor ACE2.</a> (<a href="http://www.wikidata.org/entity/Q34135057">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30785119">A human SARS-CoV neutralizing antibody against epitope on S2 protein.</a> (<a href="http://www.wikidata.org/entity/Q30785119">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24794470">A human in vitro model system for investigating genome-wide host responses to SARS coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q24794470">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47774466">A molecular docking model of SARS-CoV S1 protein in complex with its receptor, human ACE2.</a> (<a href="http://www.wikidata.org/entity/Q47774466">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47860927">A monomer-dimer nanoswitch that mimics the working principle of the SARS-CoV 3CLpro enzyme controls copper-catalysed cyclopropanation.</a> (<a href="http://www.wikidata.org/entity/Q47860927">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33269158">A mouse-adapted SARS-coronavirus causes disease and mortality in BALB/c mice.</a> (<a href="http://www.wikidata.org/entity/Q33269158">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q31126174">A network integration approach to predict conserved regulators related to pathogenicity of influenza and SARS-CoV respiratory viruses.</a> (<a href="http://www.wikidata.org/entity/Q31126174">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35154725">A new infectious disease challenge: Urbani severe acute respiratory syndrome (SARS) associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q35154725">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27490484">A new mouse-adapted strain of SARS-CoV as a lethal model for evaluating antiviral agents in vitro and in vivo</a> (<a href="http://www.wikidata.org/entity/Q27490484">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33247472">A new nucleotide-composition based fingerprint of SARS-CoV with visualization analysis.</a> (<a href="http://www.wikidata.org/entity/Q33247472">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33375590">A noncovalent class of papain-like protease/deubiquitinase inhibitors blocks SARS virus replication.</a> (<a href="http://www.wikidata.org/entity/Q33375590">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40462959">A novel cell-based binding assay system reconstituting interaction between SARS-CoV S protein and its cellular receptor.</a> (<a href="http://www.wikidata.org/entity/Q40462959">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44727152">A novel fingerprint map for detecting SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q44727152">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36229119">A novel subset of putative stem/progenitor CD34+Oct-4+ cells is the major target for SARS coronavirus in human lung.</a> (<a href="http://www.wikidata.org/entity/Q36229119">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47982971">A one step quantitative RT-PCR for detection of SARS coronavirus with an internal control for PCR inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q47982971">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34057656">A putative diacidic motif in the SARS-CoV ORF6 protein influences its subcellular localization and suppression of expression of co-transfected expression constructs.</a> (<a href="http://www.wikidata.org/entity/Q34057656">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37184045">A rapid point of care immunoswab assay for SARS-CoV detection.</a> (<a href="http://www.wikidata.org/entity/Q37184045">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51561001">A real-time PCR assay for bat SARS-like coronavirus detection and its application to Italian greater horseshoe bat faecal sample surveys.</a> (<a href="http://www.wikidata.org/entity/Q51561001">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28188869">A real-time PCR for SARS-coronavirus incorporating target gene pre-amplification</a> (<a href="http://www.wikidata.org/entity/Q28188869">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40312310">A recombinant baculovirus-expressed S glycoprotein vaccine elicits high titers of SARS-associated coronavirus (SARS-CoV) neutralizing antibodies in mice.</a> (<a href="http://www.wikidata.org/entity/Q40312310">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36798770">A review of studies on animal reservoirs of the SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q36798770">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24812803">A simple and rapid approach for screening of SARS-coronavirus genotypes: an evaluation study</a> (<a href="http://www.wikidata.org/entity/Q24812803">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40073664">A single amino acid substitution in the S1 and S2 Spike protein domains determines the neutralization escape phenotype of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q40073664">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34338054">A single immunization with a rhabdovirus-based vector expressing severe acute respiratory syndrome coronavirus (SARS-CoV) S protein results in the production of high levels of SARS-CoV-neutralizing antibodies</a> (<a href="http://www.wikidata.org/entity/Q34338054">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39517582">A strategy for searching antigenic regions in the SARS-CoV spike protein.</a> (<a href="http://www.wikidata.org/entity/Q39517582">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27650857">A structural view of the inactivation of the SARS coronavirus main proteinase by benzotriazole esters</a> (<a href="http://www.wikidata.org/entity/Q27650857">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40217209">A study on antigenicity and receptor-binding ability of fragment 450-650 of the spike protein of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40217209">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44110039">A subcutaneously injected UV-inactivated SARS coronavirus vaccine elicits systemic humoral immunity in mice.</a> (<a href="http://www.wikidata.org/entity/Q44110039">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24803069">A three-stemmed mRNA pseudoknot in the SARS coronavirus frameshift signal</a> (<a href="http://www.wikidata.org/entity/Q24803069">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28250266">A throat lozenge containing amyl meta cresol and dichlorobenzyl alcohol has a direct virucidal effect on respiratory syncytial virus, influenza A and SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q28250266">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47931254">A universal microarray for detection of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47931254">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24294404">ACE2: from vasopeptidase to SARS virus receptor</a> (<a href="http://www.wikidata.org/entity/Q24294404">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42036937">Accelerated induction of apoptosis in insect cells by baculovirus-expressed SARS-CoV membrane protein.</a> (<a href="http://www.wikidata.org/entity/Q42036937">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33256026">Accumulation of recombinant SARS-CoV spike protein in plant cytosol and chloroplasts indicate potential for development of plant-derived oral vaccines.</a> (<a href="http://www.wikidata.org/entity/Q33256026">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42181133">Acquisition of new protein domains by coronaviruses: analysis of overlapping genes coding for proteins N and 9b in SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q42181133">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33259340">Adaptive evolution of the spike gene of SARS coronavirus: changes in positively selected sites in different epidemic groups</a> (<a href="http://www.wikidata.org/entity/Q33259340">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40397313">Adenoviral expression of a truncated S1 subunit of SARS-CoV spike protein results in specific humoral immune responses against SARS-CoV in rats.</a> (<a href="http://www.wikidata.org/entity/Q40397313">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34197103">Aetiology: Koch's postulates fulfilled for SARS virus.</a> (<a href="http://www.wikidata.org/entity/Q34197103">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39191241">Alisporivir inhibits MERS- and SARS-coronavirus replication in cell culture, but not SARS-coronavirus infection in a mouse model.</a> (<a href="http://www.wikidata.org/entity/Q39191241">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33807608">Allelic Variation in the Toll-Like Receptor Adaptor Protein Ticam2 Contributes to SARS-Coronavirus Pathogenesis in Mice.</a> (<a href="http://www.wikidata.org/entity/Q33807608">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40228709">Amino acids 1 to 422 of the spike protein of SARS associated coronavirus are required for induction of cyclooxygenase-2.</a> (<a href="http://www.wikidata.org/entity/Q40228709">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30230531">Amino acids 15-28 in the ectodomain of SARS coronavirus 3a protein induces neutralizing antibodies.</a> (<a href="http://www.wikidata.org/entity/Q30230531">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44282477">Amiodarone alters late endosomes and inhibits SARS coronavirus infection at a post-endosomal level.</a> (<a href="http://www.wikidata.org/entity/Q44282477">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36171303">An Outbreak of Human Coronavirus OC43 Infection and Serological Cross-reactivity with SARS Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q36171303">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35923992">An Overview of Severe Acute Respiratory Syndrome-Coronavirus (SARS-CoV) 3CL Protease Inhibitors: Peptidomimetics and Small Molecule Chemotherapy.</a> (<a href="http://www.wikidata.org/entity/Q35923992">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40508602">An animal model of SARS produced by infection of Macaca mulatta with SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40508602">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24815952">An atypical RNA pseudoknot stimulator and an upstream attenuation signal for -1 ribosomal frameshifting of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q24815952">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50659714">An efficient RNA-cleaving DNA enzyme can specifically target the 5'-untranslated region of severe acute respiratory syndrome associated coronavirus (SARS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q50659714">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33243091">An efficient method for the synthesis of peptide aldehyde libraries employed in the discovery of reversible SARS coronavirus main protease (SARS-CoV Mpro) inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q33243091">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47957009">An efficient method to make human monoclonal antibodies from memory B cells: potent neutralization of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47957009">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34818143">An immunosuppressed Syrian golden hamster model for SARS-CoV infection.</a> (<a href="http://www.wikidata.org/entity/Q34818143">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35418761">An initial investigation of the association between the SARS outbreak and weather: with the view of the environmental temperature and its variation.</a> (<a href="http://www.wikidata.org/entity/Q35418761">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44135117">An oral mucosal DNA vaccine for SARS coronavirus infections.</a> (<a href="http://www.wikidata.org/entity/Q44135117">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36683624">An overall picture of SARS coronavirus (SARS-CoV) genome-encoded major proteins: structures, functions and drug development.</a> (<a href="http://www.wikidata.org/entity/Q36683624">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40220859">Analysis of SARS-CoV receptor activity of ACE2 orthologs.</a> (<a href="http://www.wikidata.org/entity/Q40220859">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47891806">Analysis of synonymous codon usage in SARS Coronavirus and other viruses in the Nidovirales.</a> (<a href="http://www.wikidata.org/entity/Q47891806">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44081858">Angiotensin-converting enzyme 2 (ACE2) proteins of different bat species confer variable susceptibility to SARS-CoV entry.</a> (<a href="http://www.wikidata.org/entity/Q44081858">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35953179">Angiotensin-converting enzyme 2: a functional receptor for SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q35953179">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30350298">Animal coronavirus vaccines: lessons for SARS.</a> (<a href="http://www.wikidata.org/entity/Q30350298">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43152086">Animal models and vaccines for SARS-CoV infection.</a> (<a href="http://www.wikidata.org/entity/Q43152086">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q26799857">Animal models for SARS and MERS coronaviruses</a> (<a href="http://www.wikidata.org/entity/Q26799857">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33205812">Animal origins of SARS coronavirus: possible links with the international trade in small carnivores.</a> (<a href="http://www.wikidata.org/entity/Q33205812">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43230545">Animal reservoirs for SARS-like coronavirus in southern China.</a> (<a href="http://www.wikidata.org/entity/Q43230545">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42551455">Animal-to-human SARS-associated coronavirus transmission?</a> (<a href="http://www.wikidata.org/entity/Q42551455">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40334813">Anti-HIV, anti-poxvirus, and anti-SARS activity of a nontoxic, acidic plant extract from the Trifollium species Secomet-V/anti-vac suggests that it contains a novel broad-spectrum antiviral.</a> (<a href="http://www.wikidata.org/entity/Q40334813">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46663447">Anti-SARS coronavirus 3C-like protease effects of Isatis indigotica root and plant-derived phenolic compounds.</a> (<a href="http://www.wikidata.org/entity/Q46663447">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43183431">Anti-SARS coronavirus 3C-like protease effects of Rheum palmatum L. extracts.</a> (<a href="http://www.wikidata.org/entity/Q43183431">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30352512">Anti-SARS coronavirus agents: a patent review (2008 - present).</a> (<a href="http://www.wikidata.org/entity/Q30352512">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45542407">Anti-SARS virus antibody responses against human SARS-associated coronavirus and animal SARS-associated coronavirus-like virus.</a> (<a href="http://www.wikidata.org/entity/Q45542407">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47742637">Anti-SARS-CoV IgG response in relation to disease severity of severe acute respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q47742637">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50574626">Anti-SARS-CoV activity of nucleoside analogs having 6-chloropurine as a nucleobase.</a> (<a href="http://www.wikidata.org/entity/Q50574626">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35804354">Anti-SARS-CoV immunoglobulin G in healthcare workers, Guangzhou, China</a> (<a href="http://www.wikidata.org/entity/Q35804354">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42242145">Anti-frameshifting ligand reduces the conformational plasticity of the SARS virus pseudoknot.</a> (<a href="http://www.wikidata.org/entity/Q42242145">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51803005">Antibodies against trimeric S glycoprotein protect hamsters against SARS-CoV challenge despite their capacity to mediate FcgammaRII-dependent entry into B cells in vitro.</a> (<a href="http://www.wikidata.org/entity/Q51803005">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44998852">Antibodies induced by receptor-binding domain in spike protein of SARS-CoV do not cross-neutralize the novel human coronavirus hCoV-EMC.</a> (<a href="http://www.wikidata.org/entity/Q44998852">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35881133">Antibodies to SARS coronavirus in civets.</a> (<a href="http://www.wikidata.org/entity/Q35881133">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43217731">Antibodies to SARS-like virus hint at repeated infections.</a> (<a href="http://www.wikidata.org/entity/Q43217731">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33516972">Antibody binding site mapping of SARS-CoV spike protein receptor-binding domain by a combination of yeast surface display and phage peptide library screening.</a> (<a href="http://www.wikidata.org/entity/Q33516972">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47734783">Antibody response and viraemia during the course of severe acute respiratory syndrome (SARS)-associated coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q47734783">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47293237">Antibody response of patients with severe acute respiratory syndrome (SARS) targets the viral nucleocapsid.</a> (<a href="http://www.wikidata.org/entity/Q47293237">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47687696">Antibody responses against SARS coronavirus are correlated with disease outcome of infected individuals.</a> (<a href="http://www.wikidata.org/entity/Q47687696">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47947942">Antibody responses against SARS-coronavirus and its nucleocaspid in SARS patients.</a> (<a href="http://www.wikidata.org/entity/Q47947942">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47801038">Antibody responses to individual proteins of SARS coronavirus and their neutralization activities.</a> (<a href="http://www.wikidata.org/entity/Q47801038">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40393123">Antibody to severe acute respiratory syndrome (SARS)-associated coronavirus spike protein domain 2 cross-reacts with lung epithelial cells and causes cytotoxicity.</a> (<a href="http://www.wikidata.org/entity/Q40393123">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34041594">Antibody-dependent SARS coronavirus infection is mediated by antibodies against spike proteins.</a> (<a href="http://www.wikidata.org/entity/Q34041594">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40621400">Antibody-dependent enhancement of SARS coronavirus infection and its role in the pathogenesis of SARS.</a> (<a href="http://www.wikidata.org/entity/Q40621400">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q52596512">Antibody-mediated synergy and interference in the neutralization of SARS-CoV at an epitope cluster on the spike protein.</a> (<a href="http://www.wikidata.org/entity/Q52596512">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43232696">Antigenic cross-reactivity between the nucleocapsid protein of severe acute respiratory syndrome (SARS) coronavirus and polyclonal antisera of antigenic group I animal coronaviruses: implication for SARS diagnosis.</a> (<a href="http://www.wikidata.org/entity/Q43232696">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37361159">Antigenicity and immunogenicity of SARS-CoV S protein receptor-binding domain stably expressed in CHO cells.</a> (<a href="http://www.wikidata.org/entity/Q37361159">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44714541">Antigenicity and receptor-binding ability of recombinant SARS coronavirus spike protein.</a> (<a href="http://www.wikidata.org/entity/Q44714541">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47896067">Antisense downregulation of SARS-CoV gene expression in Vero E6 cells.</a> (<a href="http://www.wikidata.org/entity/Q47896067">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45269016">Antiviral activity of glycyrrhizic acid derivatives against SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q45269016">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43058999">Antiviral agents and corticosteroids in the treatment of severe acute respiratory syndrome (SARS).</a> (<a href="http://www.wikidata.org/entity/Q43058999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30230488">Antiviral drug discovery against SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q30230488">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35593143">Antiviral treatment of SARS: can we draw any conclusions?</a> (<a href="http://www.wikidata.org/entity/Q35593143">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43747592">Apoptosis induced by the SARS-associated coronavirus in Vero cells is replication-dependent and involves caspase.</a> (<a href="http://www.wikidata.org/entity/Q43747592">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36513137">Application of bioinformatics in search for cleavable peptides of SARS-CoV M(pro) and chemical modification of octapeptides.</a> (<a href="http://www.wikidata.org/entity/Q36513137">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39038809">Application of real-time PCR for testing antiviral compounds against Lassa virus, SARS coronavirus and Ebola virus in vitro.</a> (<a href="http://www.wikidata.org/entity/Q39038809">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44048831">Applying lessons from SARS to a newly identified coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q44048831">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33215103">Assays for the assessment of neutralizing antibody activities against Severe Acute Respiratory Syndrome (SARS) associated coronavirus (SCV).</a> (<a href="http://www.wikidata.org/entity/Q33215103">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51981247">Assembling the SARS-CoV genome -- new method based on graph theoretical approach.</a> (<a href="http://www.wikidata.org/entity/Q51981247">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36021995">Asymptomatic SARS coronavirus infection among healthcare workers, Singapore.</a> (<a href="http://www.wikidata.org/entity/Q36021995">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42839983">Asymptomatic animal traders prove positive for SARS virus.</a> (<a href="http://www.wikidata.org/entity/Q42839983">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36622010">Attachment factor and receptor engagement of SARS coronavirus and human coronavirus NL63.</a> (<a href="http://www.wikidata.org/entity/Q36622010">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44653963">Attenuation of SARS coronavirus by a short hairpin RNA expression plasmid targeting RNA-dependent RNA polymerase.</a> (<a href="http://www.wikidata.org/entity/Q44653963">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45436786">Augmentation of immune responses to SARS coronavirus by a combination of DNA and whole killed virus vaccines.</a> (<a href="http://www.wikidata.org/entity/Q45436786">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40395618">Autoantibodies against human epithelial cells and endothelial cells after severe acute respiratory syndrome (SARS)-associated coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q40395618">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q25257141">Automated extraction protocol for quantification of SARS-coronavirus RNA in serum: an evaluation study.</a> (<a href="http://www.wikidata.org/entity/Q25257141">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42035067">Baculovirus surface display of SARS coronavirus (SARS-CoV) spike protein and immunogenicity of the displayed protein in mice models.</a> (<a href="http://www.wikidata.org/entity/Q42035067">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45323605">Bat cave solves mystery of deadly SARS virus - and suggests new outbreak could occur.</a> (<a href="http://www.wikidata.org/entity/Q45323605">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38553361">Bat-to-human: spike features determining 'host jump' of coronaviruses SARS-CoV, MERS-CoV, and beyond.</a> (<a href="http://www.wikidata.org/entity/Q38553361">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37508183">Bats and emerging zoonoses: henipaviruses and SARS.</a> (<a href="http://www.wikidata.org/entity/Q37508183">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28274751">Bats are natural reservoirs of SARS-like coronaviruses</a> (<a href="http://www.wikidata.org/entity/Q28274751">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42258730">Bats as animal reservoirs for the SARS coronavirus: hypothesis proved after 10 years of virus hunting.</a> (<a href="http://www.wikidata.org/entity/Q42258730">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45423935">Bcl-2 inhibits the caspase-dependent apoptosis induced by SARS-CoV without affecting virus replication kinetics.</a> (<a href="http://www.wikidata.org/entity/Q45423935">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42863782">Biflavonoids from Torreya nucifera displaying SARS-CoV 3CL(pro) inhibition.</a> (<a href="http://www.wikidata.org/entity/Q42863782">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33225199">Binding interaction of SARS coronavirus 3CL(pro) protease with vacuolar-H+ ATPase G1 subunit.</a> (<a href="http://www.wikidata.org/entity/Q33225199">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51661127">Binding mechanism of coronavirus main proteinase with ligands and its implication to drug design against SARS.</a> (<a href="http://www.wikidata.org/entity/Q51661127">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46068140">Binding of SARS coronavirus to its receptor damages islets and causes acute diabetes.</a> (<a href="http://www.wikidata.org/entity/Q46068140">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24795459">Bioinformatics analysis of SARS coronavirus genome polymorphism</a> (<a href="http://www.wikidata.org/entity/Q24795459">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36683628">Bioinformatics research on the SARS coronavirus (SARS_CoV) in China.</a> (<a href="http://www.wikidata.org/entity/Q36683628">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47839663">Bioterrorism and emerging infectious disease - antimicrobials, therapeutics and immune-modulators. SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47839663">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40103760">Bismuth complexes inhibit the SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40103760">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51932689">Boosted expression of the SARS-CoV nucleocapsid protein in tobacco and its immunogenicity in mice.</a> (<a href="http://www.wikidata.org/entity/Q51932689">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33383237">Broadening of neutralization activity to directly block a dominant antibody-driven SARS-coronavirus evolution pathway</a> (<a href="http://www.wikidata.org/entity/Q33383237">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43843631">CD8+ T cell response in HLA-A*0201 transgenic mice is elicited by epitopes from SARS-CoV S protein.</a> (<a href="http://www.wikidata.org/entity/Q43843631">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39964134">Candidate genes associated with susceptibility for SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q39964134">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36848956">Cell entry by enveloped viruses: redox considerations for HIV and SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q36848956">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35894137">Cellular entry of the SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q35894137">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33614444">Cellular immune responses to severe acute respiratory syndrome coronavirus (SARS-CoV) infection in senescent BALB/c mice: CD4+ T cells are important in control of SARS-CoV infection.</a> (<a href="http://www.wikidata.org/entity/Q33614444">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42164714">Chalcones isolated from Angelica keiskei inhibit cysteine proteases of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q42164714">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q26746184">Challenges presented by MERS corona virus, and SARS corona virus to global health</a> (<a href="http://www.wikidata.org/entity/Q26746184">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37055307">Changing virulence of the SARS virus: the epidemiological evidence.</a> (<a href="http://www.wikidata.org/entity/Q37055307">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45355714">Characterisation of animal angiotensin-converting enzyme 2 receptors and use of pseudotyped virus to correlate receptor binding with susceptibility of SARS-CoV infection.</a> (<a href="http://www.wikidata.org/entity/Q45355714">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47742629">Characterization and application of monoclonal antibodies against N protein of SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47742629">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36447438">Characterization and inhibition of SARS-coronavirus main protease.</a> (<a href="http://www.wikidata.org/entity/Q36447438">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45118974">Characterization of SARS-CoV main protease and identification of biologically active small molecule inhibitors using a continuous fluorescence-based assay.</a> (<a href="http://www.wikidata.org/entity/Q45118974">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33552505">Characterization of SARS-CoV-specific memory T cells from recovered individuals 4 years after infection</a> (<a href="http://www.wikidata.org/entity/Q33552505">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47709812">Characterization of cytotoxic T-lymphocyte epitopes and immune responses to SARS coronavirus spike DNA vaccine expressing the RGD-integrin-binding motif.</a> (<a href="http://www.wikidata.org/entity/Q47709812">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48034981">Characterization of humoral responses in mice immunized with plasmid DNAs encoding SARS-CoV spike gene fragments.</a> (<a href="http://www.wikidata.org/entity/Q48034981">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47796628">Characterization of monoclonal antibody against SARS coronavirus nucleocapsid antigen and development of an antigen capture ELISA.</a> (<a href="http://www.wikidata.org/entity/Q47796628">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47736945">Characterization of neutralizing monoclonal antibodies recognizing a 15-residues epitope on the spike protein HR2 region of severe acute respiratory syndrome coronavirus (SARS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q47736945">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40220822">Characterization of persistent SARS-CoV infection in Vero E6 cells.</a> (<a href="http://www.wikidata.org/entity/Q40220822">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47930988">Characterization of protein-protein interactions between the nucleocapsid protein and membrane protein of the SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47930988">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40317281">Characterization of the antiviral effects of interferon-alpha against a SARS-like coronoavirus infection in vitro.</a> (<a href="http://www.wikidata.org/entity/Q40317281">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47902789">Characterization of the heptad repeat regions, HR1 and HR2, and design of a fusion core structure model of the spike protein from severe acute respiratory syndrome (SARS) coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47902789">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36039882">Characterization of viral proteins encoded by the SARS-coronavirus genome.</a> (<a href="http://www.wikidata.org/entity/Q36039882">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48083392">Characterizing 56 complete SARS-CoV S-gene sequences from Hong Kong.</a> (<a href="http://www.wikidata.org/entity/Q48083392">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42742439">Chemokine up-regulation in SARS-coronavirus-infected, monocyte-derived human dendritic cells.</a> (<a href="http://www.wikidata.org/entity/Q42742439">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33291389">Chicken single-chain variable fragments against the SARS-CoV spike protein.</a> (<a href="http://www.wikidata.org/entity/Q33291389">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42833766">Children's vaccines do not induce cross reactivity against SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q42833766">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24815979">Chloroquine is a potent inhibitor of SARS coronavirus infection and spread.</a> (<a href="http://www.wikidata.org/entity/Q24815979">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47877806">Chronological evolution of IgM, IgA, IgG and neutralisation antibodies after infection with SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47877806">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36572218">Cleavage of spike protein of SARS coronavirus by protease factor Xa is associated with viral infectivity</a> (<a href="http://www.wikidata.org/entity/Q36572218">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40434683">Clinical evaluation of real-time PCR assays for rapid diagnosis of SARS coronavirus during outbreak and post-epidemic periods.</a> (<a href="http://www.wikidata.org/entity/Q40434683">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40557821">Clinical progression and viral load in a community outbreak of coronavirus-associated SARS pneumonia: a prospective study.</a> (<a href="http://www.wikidata.org/entity/Q40557821">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24804356">Cloaked similarity between HIV-1 and SARS-CoV suggests an anti-SARS strategy</a> (<a href="http://www.wikidata.org/entity/Q24804356">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54496593">Cloning, expression, and purification of the nucleocapsid protein of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q54496593">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47429170">Cloning, sequencing, expression, and purification of SARS-associated coronavirus nucleocapsid protein for serodiagnosis of SARS.</a> (<a href="http://www.wikidata.org/entity/Q47429170">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47718573">Combination of functionalized nanoparticles and polymerase chain reaction-based method for SARS-CoV gene detection.</a> (<a href="http://www.wikidata.org/entity/Q47718573">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38576366">Comparative analysis of the SARS coronavirus genome: a good start to a long journey.</a> (<a href="http://www.wikidata.org/entity/Q38576366">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44183717">Comparative analysis of the immunogenicity of SARS-CoV nucleocapsid DNA vaccine administrated with different routes in mouse model.</a> (<a href="http://www.wikidata.org/entity/Q44183717">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42600546">Comparative full-length genome sequence analysis of 14 SARS coronavirus isolates and common mutations associated with putative origins of infection.</a> (<a href="http://www.wikidata.org/entity/Q42600546">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39711479">Comparative host gene transcription by microarray analysis early after infection of the Huh7 cell line by SARS coronavirus and human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q39711479">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44681549">Comparative immunization in BALB/c mice with recombinant replication-defective adenovirus vector and DNA plasmid expressing a SARS-CoV nucleocapsid protein gene.</a> (<a href="http://www.wikidata.org/entity/Q44681549">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33886371">Comparative pathogenesis of three human and zoonotic SARS-CoV strains in cynomolgus macaques</a> (<a href="http://www.wikidata.org/entity/Q33886371">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35946920">Comparison of immunoglobulin G responses to the spike and nucleocapsid proteins of severe acute respiratory syndrome (SARS) coronavirus in patients with SARS</a> (<a href="http://www.wikidata.org/entity/Q35946920">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37519574">Complete genome sequences of the SARS-CoV: the BJ Group (Isolates BJ01-BJ04).</a> (<a href="http://www.wikidata.org/entity/Q37519574">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30350932">Comprehensive antibody epitope mapping of the nucleocapsid protein of severe acute respiratory syndrome (SARS) coronavirus: insight into the humoral immunity of SARS.</a> (<a href="http://www.wikidata.org/entity/Q30350932">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47910748">Comprehensive detection and identification of human coronaviruses, including the SARS-associated coronavirus, with a single RT-PCR assay.</a> (<a href="http://www.wikidata.org/entity/Q47910748">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40231729">Computational characterization and design of SARS coronavirus receptor recognition and antibody neutralization.</a> (<a href="http://www.wikidata.org/entity/Q40231729">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43900781">Concentration and detection of SARS coronavirus in sewage from Xiao Tang Shan Hospital and the 309th Hospital of the Chinese People's Liberation Army.</a> (<a href="http://www.wikidata.org/entity/Q43900781">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47778160">Concentration and detection of SARS coronavirus in sewage from Xiao Tang Shan Hospital and the 309th Hospital.</a> (<a href="http://www.wikidata.org/entity/Q47778160">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42111936">Conductance and amantadine binding of a pore formed by a lysine-flanked transmembrane domain of SARS coronavirus envelope protein.</a> (<a href="http://www.wikidata.org/entity/Q42111936">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43856041">Conference report - II. Investigating new vaccines: SARS. Highlights from the Viral Vaccine Meeting; October 25-28, 2003; Barcelona, Spain.</a> (<a href="http://www.wikidata.org/entity/Q43856041">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47745614">Construction of a eukaryotic expression plasmid encoding partial S gene fragments of the SARS-CoV and its potential utility as a DNA vaccine.</a> (<a href="http://www.wikidata.org/entity/Q47745614">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46488636">Construction of a non-infectious SARS coronavirus replicon for application in drug screening and analysis of viral protein function.</a> (<a href="http://www.wikidata.org/entity/Q46488636">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45427299">Coordinate induction of IFN-alpha and -gamma by SARS-CoV also in the absence of virus replication.</a> (<a href="http://www.wikidata.org/entity/Q45427299">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45095182">Copious production of SARS-CoV nucleocapsid protein employing codon optimized synthetic gene.</a> (<a href="http://www.wikidata.org/entity/Q45095182">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42552025">Coronaviridae and SARS-associated coronavirus strain HSR1.</a> (<a href="http://www.wikidata.org/entity/Q42552025">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24799193">Coronavirus 3CLpro proteinase cleavage sites: possible relevance to SARS virus pathology</a> (<a href="http://www.wikidata.org/entity/Q24799193">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35203012">Coronavirus in severe acute respiratory syndrome (SARS).</a> (<a href="http://www.wikidata.org/entity/Q35203012">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q52000742">Coronavirus outbreak in cheetahs: lessons for SARS.</a> (<a href="http://www.wikidata.org/entity/Q52000742">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35809796">Coronavirus replication and pathogenesis: Implications for the recent outbreak of severe acute respiratory syndrome (SARS), and the challenge for vaccine development.</a> (<a href="http://www.wikidata.org/entity/Q35809796">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33694361">Coronaviruses post-SARS: update on replication and pathogenesis.</a> (<a href="http://www.wikidata.org/entity/Q33694361">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46903980">Correction: Immunization with SARS Coronavirus Vaccines Leads to Pulmonary Immunopathology on Challenge with the SARS Virus.</a> (<a href="http://www.wikidata.org/entity/Q46903980">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46895756">Correction: SARS Coronavirus 3b Accessory Protein Modulates Transcriptional Activity of RUNX1b.</a> (<a href="http://www.wikidata.org/entity/Q46895756">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46028250">Correction: Vaccine Efficacy in Senescent Mice Challenged with Recombinant SARS-CoV Bearing Epidemic and Zoonotic Spike Variants.</a> (<a href="http://www.wikidata.org/entity/Q46028250">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47581399">Cross-neutralization of SARS coronavirus-specific antibodies against bat SARS-like coronaviruses.</a> (<a href="http://www.wikidata.org/entity/Q47581399">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40362033">Cross-reaction of SARS-CoV antigen with autoantibodies in autoimmune diseases.</a> (<a href="http://www.wikidata.org/entity/Q40362033">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34650448">Cross-reactive antibodies in convalescent SARS patients' sera against the emerging novel human coronavirus EMC (2012) by both immunofluorescent and neutralizing antibody tests.</a> (<a href="http://www.wikidata.org/entity/Q34650448">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33226421">Cross-reactivity of antibody against SARS-coronavirus nucleocapsid protein with IL-11.</a> (<a href="http://www.wikidata.org/entity/Q33226421">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27643459">Crystal structures reveal an induced-fit binding of a substrate-like Aza-peptide epoxide to SARS coronavirus main peptidase</a> (<a href="http://www.wikidata.org/entity/Q27643459">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34646034">Crystallization and diffraction analysis of the SARS coronavirus nsp10-nsp16 complex.</a> (<a href="http://www.wikidata.org/entity/Q34646034">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47884170">Crystallization and preliminary crystallographic analysis of the heptad-repeat complex of SARS coronavirus spike protein.</a> (<a href="http://www.wikidata.org/entity/Q47884170">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33723058">Cxcl16 interact with SARS-CoV N protein in and out cell.</a> (<a href="http://www.wikidata.org/entity/Q33723058">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40315469">Cytokine regulation in SARS coronavirus infection compared to other respiratory virus infections.</a> (<a href="http://www.wikidata.org/entity/Q40315469">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24791313">Date of origin of the SARS coronavirus strains</a> (<a href="http://www.wikidata.org/entity/Q24791313">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46971666">Deciphering the biosynthetic codes for the potent anti-SARS-CoV cyclodepsipeptide valinomycin in Streptomyces tsusimaensis ATCC 15141.</a> (<a href="http://www.wikidata.org/entity/Q46971666">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35878909">Dendritic cell targeted chitosan nanoparticles for nasal DNA immunization against SARS CoV nucleocapsid protein.</a> (<a href="http://www.wikidata.org/entity/Q35878909">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40209539">Derivation of a novel SARS-coronavirus replicon cell line and its application for anti-SARS drug screening.</a> (<a href="http://www.wikidata.org/entity/Q40209539">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47678289">Design and biological activities of novel inhibitory peptides for SARS-CoV spike protein and angiotensin-converting enzyme 2 interaction.</a> (<a href="http://www.wikidata.org/entity/Q47678289">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35924432">Design and synthesis of a series of serine derivatives as small molecule inhibitors of the SARS coronavirus 3CL protease.</a> (<a href="http://www.wikidata.org/entity/Q35924432">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46922573">Design and synthesis of dipeptidyl glutaminyl fluoromethyl ketones as potent severe acute respiratory syndrome coronovirus (SARS-CoV) inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q46922573">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47932523">Design and synthesis of new tripeptide-type SARS-CoV 3CL protease inhibitors containing an electrophilic arylketone moiety.</a> (<a href="http://www.wikidata.org/entity/Q47932523">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40444448">Design of recombinant protein-based SARS-CoV entry inhibitors targeting the heptad-repeat regions of the spike protein S2 domain.</a> (<a href="http://www.wikidata.org/entity/Q40444448">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37350479">Design, synthesis and antiviral efficacy of a series of potent chloropyridyl ester-derived SARS-CoV 3CLpro inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q37350479">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33326661">Design, synthesis and screening of antisense peptide based combinatorial peptide libraries towards an aromatic region of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q33326661">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46223071">Design, synthesis, and biological evaluation of novel dipeptide-type SARS-CoV 3CL protease inhibitors: structure-activity relationship study.</a> (<a href="http://www.wikidata.org/entity/Q46223071">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46711512">Design, synthesis, and evaluation of trifluoromethyl ketones as inhibitors of SARS-CoV 3CL protease.</a> (<a href="http://www.wikidata.org/entity/Q46711512">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45080902">Detecting specific cytotoxic T lymphocytes against SARS-coronavirus with DimerX HLA-A2:Ig fusion protein.</a> (<a href="http://www.wikidata.org/entity/Q45080902">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47961517">Detection and monitoring of SARS coronavirus in the plasma and peripheral blood lymphocytes of patients with severe acute respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q47961517">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51642376">Detection of SARS coronavirus RNA in the cerebrospinal fluid of a patient with severe acute respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q51642376">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54504477">Detection of SARS coronavirus in humans and animals by conventional and quantitative (real time) reverse transcription polymerase chain reactions.</a> (<a href="http://www.wikidata.org/entity/Q54504477">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48034330">Detection of SARS coronavirus in patients with severe acute respiratory syndrome by conventional and real-time quantitative reverse transcription-PCR assays.</a> (<a href="http://www.wikidata.org/entity/Q48034330">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24600052">Detection of SARS coronavirus in patients with suspected SARS</a> (<a href="http://www.wikidata.org/entity/Q24600052">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51638220">Detection of SARS coronavirus in plasma by real-time RT-PCR.</a> (<a href="http://www.wikidata.org/entity/Q51638220">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34152436">Detection of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q34152436">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35880900">Detection of SARS-associated coronavirus in throat wash and saliva in early diagnosis</a> (<a href="http://www.wikidata.org/entity/Q35880900">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47820521">Detection of airborne severe acute respiratory syndrome (SARS) coronavirus and environmental contamination in SARS outbreak units.</a> (<a href="http://www.wikidata.org/entity/Q47820521">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47920729">Detection of antibodies against SARS-CoV in serum from SARS-infected donors with ELISA and Western blot.</a> (<a href="http://www.wikidata.org/entity/Q47920729">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37189527">Detection of novel SARS-like and other coronaviruses in bats from Kenya.</a> (<a href="http://www.wikidata.org/entity/Q37189527">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41040035">Detection of severe acute respiratory syndrome (SARS) coronavirus nucleocapsid protein in sars patients by enzyme-linked immunosorbent assay.</a> (<a href="http://www.wikidata.org/entity/Q41040035">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40834199">Detection of specific antibodies to severe acute respiratory syndrome (SARS) coronavirus nucleocapsid protein for serodiagnosis of SARS coronavirus pneumonia.</a> (<a href="http://www.wikidata.org/entity/Q40834199">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40025968">Determination and application of immunodominant regions of SARS coronavirus spike and nucleocapsid proteins recognized by sera from different animal species.</a> (<a href="http://www.wikidata.org/entity/Q40025968">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30767947">Determination of SARS-coronavirus by a microfluidic chip system.</a> (<a href="http://www.wikidata.org/entity/Q30767947">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47245952">Development and characterisation of neutralising monoclonal antibody to the SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47245952">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40498842">Development and evaluation of an efficient 3'-noncoding region based SARS coronavirus (SARS-CoV) RT-PCR assay for detection of SARS-CoV infections.</a> (<a href="http://www.wikidata.org/entity/Q40498842">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44409383">Development and evaluation of an enzyme-linked immunosorbent assay for detection of antibodies against the spike protein of SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q44409383">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33268016">Development and validation of a high-throughput screen for inhibitors of SARS CoV and its application in screening of a 100,000-compound library.</a> (<a href="http://www.wikidata.org/entity/Q33268016">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43791900">Development of Taqman RT-nested PCR system for clinical SARS-CoV detection.</a> (<a href="http://www.wikidata.org/entity/Q43791900">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40715781">Development of a SARS Coronavirus Vaccine from Recombinant Spike Protein Plus Delta Inulin Adjuvant.</a> (<a href="http://www.wikidata.org/entity/Q40715781">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39855747">Development of a chimeric DNA-RNA hammerhead ribozyme targeting SARS virus.</a> (<a href="http://www.wikidata.org/entity/Q39855747">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44832966">Development of a dose-response model for SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q44832966">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47745679">Development of a method for concentrating and purifying SARS coronavirus RNA by a magnetic bead capture system.</a> (<a href="http://www.wikidata.org/entity/Q47745679">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44233095">Development of a molecular-beacon-based multi-allelic real-time RT-PCR assay for the detection of human coronavirus causing severe acute respiratory syndrome (SARS-CoV): a general methodology for detecting rapidly mutating viruses.</a> (<a href="http://www.wikidata.org/entity/Q44233095">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35588368">Development of a quantitative assay for SARS coronavirus and correlation of GAPDH mRNA with SARS coronavirus in clinical specimens</a> (<a href="http://www.wikidata.org/entity/Q35588368">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39043099">Development of a red-shifted fluorescence-based assay for SARS-coronavirus 3CL protease: identification of a novel class of anti-SARS agents from the tropical marine sponge Axinella corrugata.</a> (<a href="http://www.wikidata.org/entity/Q39043099">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44985460">Development of a safe neutralization assay for SARS-CoV and characterization of S-glycoprotein.</a> (<a href="http://www.wikidata.org/entity/Q44985460">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42210985">Development of a single nucleotide polymorphism DNA microarray for the detection and genotyping of the SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q42210985">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36691163">Development of animal models against emerging coronaviruses: From SARS to MERS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q36691163">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30420796">Development of chemical inhibitors of the SARS coronavirus: viral helicase as a potential target.</a> (<a href="http://www.wikidata.org/entity/Q30420796">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33362888">Development of human single-chain antibodies against SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q33362888">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35989141">Development of mouse hepatitis virus and SARS-CoV infectious cDNA constructs.</a> (<a href="http://www.wikidata.org/entity/Q35989141">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42272988">Development of potent dipeptide-type SARS-CoV 3CL protease inhibitors with novel P3 scaffolds: design, synthesis, biological evaluation, and docking studies.</a> (<a href="http://www.wikidata.org/entity/Q42272988">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45407418">Development of vaccines and passive immunotherapy against SARS corona virus using SCID-PBL/hu mouse models.</a> (<a href="http://www.wikidata.org/entity/Q45407418">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34955252">Diagnosis of severe acute respiratory syndrome (SARS) by detection of SARS coronavirus nucleocapsid antibodies in an antigen-capturing enzyme-linked immunosorbent assay</a> (<a href="http://www.wikidata.org/entity/Q34955252">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39652368">Diagnostics of severe acute respiratory syndrome-associated coronavirus (SARS-CoV) nucleocapsid antigen using chicken immunoglobulin Y.</a> (<a href="http://www.wikidata.org/entity/Q39652368">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44440454">Dieckol, a SARS-CoV 3CL(pro) inhibitor, isolated from the edible brown algae Ecklonia cava.</a> (<a href="http://www.wikidata.org/entity/Q44440454">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36483269">Difference in receptor usage between severe acute respiratory syndrome (SARS) coronavirus and SARS-like coronavirus of bat origin.</a> (<a href="http://www.wikidata.org/entity/Q36483269">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36411463">Different residues in the SARS-CoV spike protein determine cleavage and activation by the host cell protease TMPRSS2.</a> (<a href="http://www.wikidata.org/entity/Q36411463">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46113539">Differential characteristics of the early stage of lung inflammation induced by SARS-CoV Nucleocapsid protein related to age in the mouse.</a> (<a href="http://www.wikidata.org/entity/Q46113539">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33386945">Differential inhibitory activities and stabilisation of DNA aptamers against the SARS coronavirus helicase.</a> (<a href="http://www.wikidata.org/entity/Q33386945">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41828714">Differential sensitivities of severe acute respiratory syndrome (SARS) coronavirus spike polypeptide enzyme-linked immunosorbent assay (ELISA) and SARS coronavirus nucleocapsid protein ELISA for serodiagnosis of SARS coronavirus pneumonia.</a> (<a href="http://www.wikidata.org/entity/Q41828714">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33414885">Differential stepwise evolution of SARS coronavirus functional proteins in different host species</a> (<a href="http://www.wikidata.org/entity/Q33414885">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51777436">Diffuse alveolar lesion in BALB/c mice induced with human reovirus BYD1 strain and its potential relation with SARS.</a> (<a href="http://www.wikidata.org/entity/Q51777436">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47939173">Direct sequencing of SARS-coronavirus S and N genes from clinical specimens shows limited variation.</a> (<a href="http://www.wikidata.org/entity/Q47939173">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44291582">Direct template matching reveals a host subcellular membrane gyroid cubic structure that is associated with SARS virus.</a> (<a href="http://www.wikidata.org/entity/Q44291582">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27680108">Discovery of N-(benzo[1,2,3]triazol-1-yl)-N-(benzyl)acetamido)phenyl) carboxamides as severe acute respiratory syndrome coronavirus (SARS-CoV) 3CLpro inhibitors: Identification of ML300 and noncovalent nanomolar inhibitors with an induced-fit binding</a> (<a href="http://www.wikidata.org/entity/Q27680108">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46251133">Discovery of a rich gene pool of bat SARS-related coronaviruses provides new insights into the origin of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q46251133">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38720941">Discovery of unsymmetrical aromatic disulfides as novel inhibitors of SARS-CoV main protease: Chemical synthesis, biological evaluation, molecular docking and 3D-QSAR study.</a> (<a href="http://www.wikidata.org/entity/Q38720941">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27675449">Discovery, synthesis, and structure-based optimization of a series of N-(tert-butyl)-2-(N-arylamido)-2-(pyridin-3-yl) acetamides (ML188) as potent noncovalent small molecule inhibitors of the severe acute respiratory syndrome coronavirus (SARS-CoV)</a> (<a href="http://www.wikidata.org/entity/Q27675449">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47317755">Dissection of the fusion machine of SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47317755">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24337838">Distinct patterns of IFITM-mediated restriction of filoviruses, SARS coronavirus, and influenza A virus</a> (<a href="http://www.wikidata.org/entity/Q24337838">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42551435">Domestic poultry and SARS coronavirus, southern China</a> (<a href="http://www.wikidata.org/entity/Q42551435">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47736585">Double-antigen sandwich ELISA for detection of antibodies to SARS-associated coronavirus in human serum.</a> (<a href="http://www.wikidata.org/entity/Q47736585">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37411616">Drug targets in severe acute respiratory syndrome (SARS) virus and other coronavirus infections.</a> (<a href="http://www.wikidata.org/entity/Q37411616">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24805143">Dynamic changes of serum SARS-coronavirus IgG, pulmonary function and radiography in patients recovering from SARS after hospital discharge</a> (<a href="http://www.wikidata.org/entity/Q24805143">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41829385">Dynamics of SARS-coronavirus HR2 domain in the prefusion and transition states.</a> (<a href="http://www.wikidata.org/entity/Q41829385">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36577616">Dysregulated Type I Interferon and Inflammatory Monocyte-Macrophage Responses Cause Lethal Pneumonia in SARS-CoV-Infected Mice.</a> (<a href="http://www.wikidata.org/entity/Q36577616">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40598080">Early detection of antibodies against various structural proteins of the SARS-associated coronavirus in SARS patients.</a> (<a href="http://www.wikidata.org/entity/Q40598080">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51651156">Early diagnosis of SARS coronavirus infection by real time RT-PCR.</a> (<a href="http://www.wikidata.org/entity/Q51651156">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51654795">Early events of SARS coronavirus infection in vero cells.</a> (<a href="http://www.wikidata.org/entity/Q51654795">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48062031">Early gene expression events in ferrets in response to SARS coronavirus infection versus direct interferon-alpha2b stimulation.</a> (<a href="http://www.wikidata.org/entity/Q48062031">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30355171">Ecology, evolution and classification of bat coronaviruses in the aftermath of SARS.</a> (<a href="http://www.wikidata.org/entity/Q30355171">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51639488">Effects of a SARS-associated coronavirus vaccine in monkeys.</a> (<a href="http://www.wikidata.org/entity/Q51639488">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46444609">Effects of different immunization protocols and adjuvant on antibody responses to inactivated SARS-CoV vaccine.</a> (<a href="http://www.wikidata.org/entity/Q46444609">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40523218">Effects of early corticosteroid treatment on plasma SARS-associated Coronavirus RNA concentrations in adult patients.</a> (<a href="http://www.wikidata.org/entity/Q40523218">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47747443">Effects of severe acute respiratory syndrome (SARS) coronavirus infection on peripheral blood lymphocytes and their subsets.</a> (<a href="http://www.wikidata.org/entity/Q47747443">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46516230">Efficacy of various disinfectants against SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q46516230">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47737310">Efficient and quick inactivation of SARS coronavirus and other microbes exposed to the surfaces of some metal catalysts.</a> (<a href="http://www.wikidata.org/entity/Q47737310">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39272520">Efficient assembly and release of SARS coronavirus-like particles by a heterologous expression system.</a> (<a href="http://www.wikidata.org/entity/Q39272520">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39800428">Efficient induction of cytotoxic T lymphocytes specific for severe acute respiratory syndrome (SARS)-associated coronavirus by immunization with surface-linked liposomal peptides derived from a non-structural polyprotein 1a.</a> (<a href="http://www.wikidata.org/entity/Q39800428">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47810537">Elevated plasma surfactant protein D (SP-D) levels and a direct correlation with anti-severe acute respiratory syndrome coronavirus-specific IgG antibody in SARS patients.</a> (<a href="http://www.wikidata.org/entity/Q47810537">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47931801">Emergency medical services utilization during an outbreak of severe acute respiratory syndrome (SARS) and the incidence of SARS-associated coronavirus infection among emergency medical technicians.</a> (<a href="http://www.wikidata.org/entity/Q47931801">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39585199">Emodin inhibits current through SARS-associated coronavirus 3a protein.</a> (<a href="http://www.wikidata.org/entity/Q39585199">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39972263">Endocytosis of the receptor-binding domain of SARS-CoV spike protein together with virus receptor ACE2.</a> (<a href="http://www.wikidata.org/entity/Q39972263">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54576400">Enhancement of SARS-CoV infection by proteases.</a> (<a href="http://www.wikidata.org/entity/Q54576400">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50576529">Enhancement of the infectivity of SARS-CoV in BALB/c mice by IMP dehydrogenase inhibitors, including ribavirin.</a> (<a href="http://www.wikidata.org/entity/Q50576529">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39828923">Enhancing immune responses against SARS-CoV nucleocapsid DNA vaccine by co-inoculating interleukin-2 expressing vector in mice.</a> (<a href="http://www.wikidata.org/entity/Q39828923">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q26206258">Environmental and occupational health response to SARS, Taiwan, 2003</a> (<a href="http://www.wikidata.org/entity/Q26206258">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43334553">Environmental transmission of SARS at Amoy Gardens.</a> (<a href="http://www.wikidata.org/entity/Q43334553">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46327431">Erratum to: Liberation of SARS-CoV main protease from the viral polyprotein: N-terminal autocleavage does not depend on the mature dimerization mode.</a> (<a href="http://www.wikidata.org/entity/Q46327431">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43001880">Essential covalent linkage between the chymotrypsin-like domain and the extra domain of the SARS-CoV main protease.</a> (<a href="http://www.wikidata.org/entity/Q43001880">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44104853">Establishment and characterization of monoclonal antibodies against SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q44104853">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51661159">Establishment of a fluorescent polymerase chain reaction method for the detection of the SARS-associated coronavirus and its clinical application.</a> (<a href="http://www.wikidata.org/entity/Q51661159">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39642061">Establishment of the eukaryotic cell lines for inducible control of SARS-CoV nucleocapsid gene expression.</a> (<a href="http://www.wikidata.org/entity/Q39642061">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36775883">Evaluating the 3C-like protease activity of SARS-Coronavirus: recommendations for standardized assays for drug discovery.</a> (<a href="http://www.wikidata.org/entity/Q36775883">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54255607">Evaluation of Antibody-Dependent Enhancement of SARS-CoV Infection in Rhesus Macaques Immunized with an Inactivated SARS-CoV Vaccine.</a> (<a href="http://www.wikidata.org/entity/Q54255607">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45410748">Evaluation of a novel vesicular stomatitis virus pseudotype-based assay for detection of neutralizing antibody responses to SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q45410748">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47912035">Evaluation of a peptide-based enzyme immunoassay for anti-SARS coronavirus IgG antibody.</a> (<a href="http://www.wikidata.org/entity/Q47912035">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47865698">Evaluation of a real-time polymerase-chain reaction for severe acute respiratory syndrome (SARS) associated coronavirus in patients with hospitalised exacerbation of COPD.</a> (<a href="http://www.wikidata.org/entity/Q47865698">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47879096">Evaluation of a recombinant nucleocapsid protein-based assay for anti-SARS-CoV IgG detection.</a> (<a href="http://www.wikidata.org/entity/Q47879096">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42042455">Evaluation of a safe and sensitive Spike protein-based immunofluorescence assay for the detection of antibody responses to SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q42042455">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40532995">Evaluation of antibody responses against SARS coronaviral nucleocapsid or spike proteins by immunoblotting or ELISA.</a> (<a href="http://www.wikidata.org/entity/Q40532995">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44888325">Evaluation of homology modeling of the severe acute respiratory syndrome (SARS) coronavirus main protease for structure based drug design.</a> (<a href="http://www.wikidata.org/entity/Q44888325">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33206632">Evaluation of metal-conjugated compounds as inhibitors of 3CL protease of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q33206632">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45501850">Evaluation of modified vaccinia virus Ankara based recombinant SARS vaccine in ferrets.</a> (<a href="http://www.wikidata.org/entity/Q45501850">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48375720">Evaluation of the safety, immunogenicity and pharmacokinetics of equine anti-SARS-CoV F(ab')(2) in macaque.</a> (<a href="http://www.wikidata.org/entity/Q48375720">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33511964">Evasion by stealth: inefficient immune activation underlies poor T cell response and severe disease in SARS-CoV-infected mice.</a> (<a href="http://www.wikidata.org/entity/Q33511964">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41750216">Evidence for substrate binding-induced zwitterion formation in the catalytic Cys-His dyad of the SARS-CoV main protease.</a> (<a href="http://www.wikidata.org/entity/Q41750216">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48006942">Evidence from the evolutionary analysis of nucleotide sequences for a recombinant history of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q48006942">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42208832">Evidence of the recombinant origin of a bat severe acute respiratory syndrome (SARS)-like coronavirus and its implications on the direct ancestor of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q42208832">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37519366">Evolution and variation of the SARS-CoV genome.</a> (<a href="http://www.wikidata.org/entity/Q37519366">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42639782">Evolutional insights on uncharacterized SARS coronavirus genes.</a> (<a href="http://www.wikidata.org/entity/Q42639782">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35615924">Excretion and detection of SARS coronavirus and its nucleic acid from digestive system</a> (<a href="http://www.wikidata.org/entity/Q35615924">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40178073">Exosomal vaccines containing the S protein of the SARS coronavirus induce high levels of neutralizing antibodies.</a> (<a href="http://www.wikidata.org/entity/Q40178073">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36127686">Expanding the frontiers of existing antiviral drugs: possible effects of HIV-1 protease inhibitors against SARS and avian influenza.</a> (<a href="http://www.wikidata.org/entity/Q36127686">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40223572">Experiences and implications of social workers practicing in a pediatric hospital environment affected by SARS.</a> (<a href="http://www.wikidata.org/entity/Q40223572">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40536071">Exploring the binding mechanism of the main proteinase in SARS-associated coronavirus and its implication to anti-SARS drug design.</a> (<a href="http://www.wikidata.org/entity/Q40536071">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47278854">Exploring the pathogenesis of severe acute respiratory syndrome (SARS): the tissue distribution of the coronavirus (SARS-CoV) and its putative receptor, angiotensin-converting enzyme 2 (ACE2).</a> (<a href="http://www.wikidata.org/entity/Q47278854">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47925878">Expression and characterization of recombinant S2 subunit of SARS-coronavirus S fusion protein.</a> (<a href="http://www.wikidata.org/entity/Q47925878">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54503830">Expression and functional characterisation of the putative SARS coronavirus non-structural proteins X1-X5.</a> (<a href="http://www.wikidata.org/entity/Q54503830">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40386816">Expression and purification of N and E proteins from severe acute respiratory syndrome (SARS)-associated coronavirus: a comparative study.</a> (<a href="http://www.wikidata.org/entity/Q40386816">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44191434">Expression and purification of SARS coronavirus membrane protein.</a> (<a href="http://www.wikidata.org/entity/Q44191434">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44972050">Expression and purification of SARS coronavirus proteins using SUMO-fusions.</a> (<a href="http://www.wikidata.org/entity/Q44972050">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q31041420">Expression cloning of functional receptor used by SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q31041420">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45135870">Expression of SARS-coronavirus envelope protein in Escherichia coli cells alters membrane permeability.</a> (<a href="http://www.wikidata.org/entity/Q45135870">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45231040">Expression of SARS-coronavirus nucleocapsid protein in Escherichia coli and Lactococcus lactis for serodiagnosis and mucosal vaccination.</a> (<a href="http://www.wikidata.org/entity/Q45231040">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46287563">Expression of SARS-coronavirus spike glycoprotein in Pichia pastoris.</a> (<a href="http://www.wikidata.org/entity/Q46287563">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54437271">Expression of feline angiotensin converting enzyme 2 and its interaction with SARS-CoV S1 protein.</a> (<a href="http://www.wikidata.org/entity/Q54437271">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35131311">Expression, crystallization and preliminary crystallographic study of the C-terminal half of nsp2 from SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q35131311">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36419698">Expression, purification and crystallization of the SARS-CoV macro domain.</a> (<a href="http://www.wikidata.org/entity/Q36419698">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40498374">Expression, purification and sublocalization of SARS-CoV nucleocapsid protein in insect cells.</a> (<a href="http://www.wikidata.org/entity/Q40498374">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54487408">Expression, purification, and characterization of SARS coronavirus RNA polymerase.</a> (<a href="http://www.wikidata.org/entity/Q54487408">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39249878">Extraordinary GU-rich single-strand RNA identified from SARS coronavirus contributes an excessive innate immune response.</a> (<a href="http://www.wikidata.org/entity/Q39249878">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27335547">Ezrin interacts with the SARS coronavirus Spike protein and restrains infection at the entry stage</a> (<a href="http://www.wikidata.org/entity/Q27335547">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33253863">Factors associated with nosocomial SARS-CoV transmission among healthcare workers in Hanoi, Vietnam, 2003</a> (<a href="http://www.wikidata.org/entity/Q33253863">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37702502">False-positive results in a recombinant severe acute respiratory syndrome-associated coronavirus (SARS-CoV) nucleocapsid enzyme-linked immunosorbent assay due to HCoV-OC43 and HCoV-229E rectified by Western blotting with recombinant SARS-CoV spike p</a> (<a href="http://www.wikidata.org/entity/Q37702502">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34429423">False-positive results in a recombinant severe acute respiratory syndrome-associated coronavirus (SARS-CoV) nucleocapsid-based western blot assay were rectified by the use of two subunits (S1 and S2) of spike for detection of antibody to SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q34429423">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40183915">Features discriminating SARS from other severe viral respiratory tract infections.</a> (<a href="http://www.wikidata.org/entity/Q40183915">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44752080">First external quality assurance of antibody diagnostic for SARS-new coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q44752080">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44559899">Folding of the SARS coronavirus spike glycoprotein immunological fragment (SARS_S1b): thermodynamic and kinetic investigation correlating with three-dimensional structural modeling.</a> (<a href="http://www.wikidata.org/entity/Q44559899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q53022634">Formalin-treated UV-inactivated SARS coronavirus vaccine retains its immunogenicity and promotes Th2-type immune responses.</a> (<a href="http://www.wikidata.org/entity/Q53022634">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42249851">From SARS coronavirus to novel animal and human coronaviruses.</a> (<a href="http://www.wikidata.org/entity/Q42249851">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38135197">From SARS to MERS: 10 years of research on highly pathogenic human coronaviruses.</a> (<a href="http://www.wikidata.org/entity/Q38135197">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q26992345">From SARS to MERS: crystallographic studies on coronaviral proteases enable antiviral drug design</a> (<a href="http://www.wikidata.org/entity/Q26992345">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36062699">From genome to antivirals: SARS as a test tube.</a> (<a href="http://www.wikidata.org/entity/Q36062699">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45421991">From genome to drug lead: identification of a small-molecule inhibitor of the SARS virus.</a> (<a href="http://www.wikidata.org/entity/Q45421991">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44690561">Fully human monoclonal antibody directed to proteolytic cleavage site in severe acute respiratory syndrome (SARS) coronavirus S protein neutralizes the virus in a rhesus macaque SARS model.</a> (<a href="http://www.wikidata.org/entity/Q44690561">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43446777">Fusion core structure of the severe acute respiratory syndrome coronavirus (SARS-CoV): in search of potent SARS-CoV entry inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q43446777">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48018830">Future antivirals-SMi conference: latest developments in HIV, hepatitis, herpes, influenza, RSV and SARS.</a> (<a href="http://www.wikidata.org/entity/Q48018830">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24815883">G0/G1 arrest and apoptosis induced by SARS-CoV 3b protein in transfected cells</a> (<a href="http://www.wikidata.org/entity/Q24815883">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51771976">Generating stable Chinese hamster ovary cell clones to produce a truncated SARS-CoV spike protein for vaccine development.</a> (<a href="http://www.wikidata.org/entity/Q51771976">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24814395">Generation of human antibody fragments recognizing distinct epitopes of the nucleocapsid (N) SARS-CoV protein using a phage display approach</a> (<a href="http://www.wikidata.org/entity/Q24814395">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34383243">Generation of predictive pharmacophore model for SARS-coronavirus main proteinase.</a> (<a href="http://www.wikidata.org/entity/Q34383243">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35880660">Genetic variation of SARS coronavirus in Beijing Hospital.</a> (<a href="http://www.wikidata.org/entity/Q35880660">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34014447">Genetic variation of the human α-2-Heremans-Schmid glycoprotein (AHSG) gene associated with the risk of SARS-CoV infection.</a> (<a href="http://www.wikidata.org/entity/Q34014447">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35801738">Genome Wide Identification of SARS-CoV Susceptibility Loci Using the Collaborative Cross.</a> (<a href="http://www.wikidata.org/entity/Q35801738">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37519371">Genome organization of the SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q37519371">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33359207">Genomic analysis and geographic visualization of H5N1 and SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q33359207">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48116249">Genomic classification using an information-based similarity index: application to the SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q48116249">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45489659">Genosensor on gold films with enzymatic electrochemical detection of a SARS virus sequence.</a> (<a href="http://www.wikidata.org/entity/Q45489659">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51036588">Geranylated flavonoids displaying SARS-CoV papain-like protease inhibition from the fruits of Paulownia tomentosa.</a> (<a href="http://www.wikidata.org/entity/Q51036588">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45708687">Getting ready for SARS. Officials consider tough measures to contain outbreaks should deadly virus return.</a> (<a href="http://www.wikidata.org/entity/Q45708687">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36209481">Global virus alert. How SARS highlighted the risk of viral pandemics.</a> (<a href="http://www.wikidata.org/entity/Q36209481">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38340738">Glycan arrays lead to the discovery of autoimmunogenic activity of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q38340738">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44483023">Glycyrrhizin, an active component of liquorice roots, and replication of SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q44483023">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47836909">Growth kinetics of SARS-coronavirus in Vero E6 cells.</a> (<a href="http://www.wikidata.org/entity/Q47836909">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43541243">HIV protease inhibitor nelfinavir inhibits replication of SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q43541243">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38314051">HLA-A*0201 T-cell epitopes in severe acute respiratory syndrome (SARS) coronavirus nucleocapsid and spike proteins.</a> (<a href="http://www.wikidata.org/entity/Q38314051">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47883716">Heat sensitivity of a SARS-associated coronavirus introduced into plasma products.</a> (<a href="http://www.wikidata.org/entity/Q47883716">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44900602">Heterologous MVA-S prime Ad5-S boost regimen induces high and persistent levels of neutralizing antibody response against SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q44900602">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54429650">Heterologous expression of SARS-CoV ORF10 and X5 genes in E. coli and Streptomyces lividans TK24.</a> (<a href="http://www.wikidata.org/entity/Q54429650">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40164804">Heterologous viral RNA export elements improve expression of severe acute respiratory syndrome (SARS) coronavirus spike protein and protective efficacy of DNA vaccines against SARS.</a> (<a href="http://www.wikidata.org/entity/Q40164804">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34012750">High expression level of soluble SARS spike protein mediated by adenovirus in HEK293 cells</a> (<a href="http://www.wikidata.org/entity/Q34012750">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38332095">High-dose hydrocortisone reduces expression of the pro-inflammatory chemokines CXCL8 and CXCL10 in SARS coronavirus-infected intestinal cells.</a> (<a href="http://www.wikidata.org/entity/Q38332095">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33347218">High-throughput assay using a GFP-expressing replicon for SARS-CoV drug discovery.</a> (<a href="http://www.wikidata.org/entity/Q33347218">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45110672">High-throughput screening identifies inhibitors of the SARS coronavirus main proteinase.</a> (<a href="http://www.wikidata.org/entity/Q45110672">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41809716">High-yield expression of recombinant SARS coronavirus nucleocapsid protein in methylotrophic yeast Pichia pastoris.</a> (<a href="http://www.wikidata.org/entity/Q41809716">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44241795">Highly attenuated vaccinia virus DIs as a potential SARS vaccine.</a> (<a href="http://www.wikidata.org/entity/Q44241795">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40517315">Highly infectious SARS-CoV pseudotyped virus reveals the cell tropism and its correlation with receptor expression.</a> (<a href="http://www.wikidata.org/entity/Q40517315">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47665076">Homozygous L-SIGN (CLEC4M) plays a protective role in SARS coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q47665076">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45728480">Hong Kong health chief falls ill with suspected SARS virus.</a> (<a href="http://www.wikidata.org/entity/Q45728480">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35125098">How change of public transportation usage reveals fear of the SARS virus in a city</a> (<a href="http://www.wikidata.org/entity/Q35125098">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36346148">How the SARS coronavirus causes disease: host or organism?</a> (<a href="http://www.wikidata.org/entity/Q36346148">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33293891">Human CD4(+) memory T-lymphocyte responses to SARS coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q33293891">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45028378">Human SARS-coronavirus RNA-dependent RNA polymerase: activity determinants and nucleoside analogue inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q45028378">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24600523">Human coronavirus EMC does not require the SARS-coronavirus receptor and maintains broad replicative capability in mammalian cell lines</a> (<a href="http://www.wikidata.org/entity/Q24600523">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51980955">Human memory T cell responses to SARS-CoV E protein.</a> (<a href="http://www.wikidata.org/entity/Q51980955">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42117342">Human metapneumovirus-associated atypical pneumonia and SARS.</a> (<a href="http://www.wikidata.org/entity/Q42117342">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34491357">Human monoclonal antibodies against highly conserved HR1 and HR2 domains of the SARS-CoV spike protein are more broadly neutralizing</a> (<a href="http://www.wikidata.org/entity/Q34491357">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47283945">Human monoclonal antibody as prophylaxis for SARS coronavirus infection in ferrets.</a> (<a href="http://www.wikidata.org/entity/Q47283945">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28768526">Human monoclonal antibody combination against SARS coronavirus: synergy and coverage of escape mutants</a> (<a href="http://www.wikidata.org/entity/Q28768526">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47986618">Human severe acute respiratory syndrome (SARS) and feline coronaviroses.</a> (<a href="http://www.wikidata.org/entity/Q47986618">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37051054">Humoral and cellular immune responses induced by 3a DNA vaccines against severe acute respiratory syndrome (SARS) or SARS-like coronavirus in mice.</a> (<a href="http://www.wikidata.org/entity/Q37051054">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q52571074">Identification and characterization of novel neutralizing epitopes in the receptor-binding domain of SARS-CoV spike protein: revealing the critical antigenic determinants in inactivated SARS-CoV vaccine.</a> (<a href="http://www.wikidata.org/entity/Q52571074">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39593044">Identification and characterization of three novel small interference RNAs that effectively down-regulate the isolated nucleocapsid gene expression of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q39593044">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40364182">Identification of SARS-like coronaviruses in horseshoe bats (Rhinolophus hipposideros) in Slovenia.</a> (<a href="http://www.wikidata.org/entity/Q40364182">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54455802">Identification of a B-cell antigenic epitope at the N-terminus of SARS-CoV M protein and characterization of monoclonal antibody against the protein.</a> (<a href="http://www.wikidata.org/entity/Q54455802">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41341962">Identification of a Novel Small Molecule Inhibitor Against SARS Coronavirus Helicase.</a> (<a href="http://www.wikidata.org/entity/Q41341962">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33512190">Identification of a new region of SARS-CoV S protein critical for viral entry</a> (<a href="http://www.wikidata.org/entity/Q33512190">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30951751">Identification of a novel conserved HLA-A*0201-restricted epitope from the spike protein of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q30951751">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33330457">Identification of a novel transcriptional repressor (HEPIS) that interacts with nsp-10 of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q33330457">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40579430">Identification of an HLA-A*0201-restricted CD8+ T-cell epitope SSp-1 of SARS-CoV spike protein.</a> (<a href="http://www.wikidata.org/entity/Q40579430">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51663236">Identification of an epitope of SARS-coronavirus nucleocapsid protein.</a> (<a href="http://www.wikidata.org/entity/Q51663236">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42800677">Identification of effective siRNA blocking the expression of SARS viral envelope E and RDRP genes.</a> (<a href="http://www.wikidata.org/entity/Q42800677">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40220735">Identification of essential genes as a strategy to select a SARS candidate vaccine using a SARS-CoV infectious cDNA.</a> (<a href="http://www.wikidata.org/entity/Q40220735">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44893215">Identification of ferret ACE2 and its receptor function for SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q44893215">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39775777">Identification of human cell line model of persistent SARS coronavirus infection and studies of the response to cytokines and chemokines.</a> (<a href="http://www.wikidata.org/entity/Q39775777">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47930004">Identification of immunodominant sites on the spike protein of severe acute respiratory syndrome (SARS) coronavirus: implication for developing SARS diagnostics and vaccines.</a> (<a href="http://www.wikidata.org/entity/Q47930004">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39436807">Identification of immunogenic determinants of the spike protein of SARS-like coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q39436807">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40436586">Identification of murine CD8 T cell epitopes in codon-optimized SARS-associated coronavirus spike protein.</a> (<a href="http://www.wikidata.org/entity/Q40436586">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39349930">Identification of myricetin and scutellarein as novel chemical inhibitors of the SARS coronavirus helicase, nsP13.</a> (<a href="http://www.wikidata.org/entity/Q39349930">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34557512">Identification of natural compounds with antiviral activities against SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q34557512">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35065902">Identification of novel drug scaffolds for inhibition of SARS-CoV 3-Chymotrypsin-like protease using virtual and high-throughput screenings</a> (<a href="http://www.wikidata.org/entity/Q35065902">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44861300">Identification of novel inhibitors of the SARS coronavirus main protease 3CLpro.</a> (<a href="http://www.wikidata.org/entity/Q44861300">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28177310">Identification of probable genomic packaging signal sequence from SARS-CoV genome by bioinformatics analysis</a> (<a href="http://www.wikidata.org/entity/Q28177310">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34687042">Identification of pulmonary Oct-4+ stem/progenitor cells and demonstration of their susceptibility to SARS coronavirus (SARS-CoV) infection in vitro.</a> (<a href="http://www.wikidata.org/entity/Q34687042">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33212372">Identification of single-chain antibody fragments specific against SARS-associated coronavirus from phage-displayed antibody library.</a> (<a href="http://www.wikidata.org/entity/Q33212372">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36224671">Identification of the Mechanisms Causing Reversion to Virulence in an Attenuated SARS-CoV for the Design of a Genetically Stable Vaccine.</a> (<a href="http://www.wikidata.org/entity/Q36224671">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47378590">Identification of two antigenic epitopes on SARS-CoV spike protein.</a> (<a href="http://www.wikidata.org/entity/Q47378590">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40653601">Identification, synthesis and evaluation of SARS-CoV and MERS-CoV 3C-like protease inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q40653601">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45723121">Identifying a killer: SARS virus.</a> (<a href="http://www.wikidata.org/entity/Q45723121">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51646052">Identifying inhibitors of the SARS coronavirus proteinase.</a> (<a href="http://www.wikidata.org/entity/Q51646052">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40484005">Immune responses against SARS-coronavirus nucleocapsid protein induced by DNA vaccine.</a> (<a href="http://www.wikidata.org/entity/Q40484005">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47812438">Immune responses in Balb/c mice induced by a candidate SARS-CoV inactivated vaccine prepared from F69 strain.</a> (<a href="http://www.wikidata.org/entity/Q47812438">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45888131">Immune responses to T-cell epitopes of SARS CoV-N protein are enhanced by N immunization with a chimera of lysosome-associated membrane protein.</a> (<a href="http://www.wikidata.org/entity/Q45888131">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34247261">Immunization with SARS coronavirus vaccines leads to pulmonary immunopathology on challenge with the SARS virus.</a> (<a href="http://www.wikidata.org/entity/Q34247261">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51983199">Immunization with SARS-CoV S DNA vaccine generates memory CD4+ and CD8+ T cell immune responses.</a> (<a href="http://www.wikidata.org/entity/Q51983199">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40540668">Immunodominant SARS Coronavirus Epitopes in Humans Elicited both Enhancing and Neutralizing Effects on Infection in Non-human Primates.</a> (<a href="http://www.wikidata.org/entity/Q40540668">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33859071">Immunofluorescence assay for detection of the nucleocapsid antigen of the severe acute respiratory syndrome (SARS)-associated coronavirus in cells derived from throat wash samples of patients with SARS.</a> (<a href="http://www.wikidata.org/entity/Q33859071">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36760764">Immunogenicity and protection efficacy of monomeric and trimeric recombinant SARS coronavirus spike protein subunit vaccine candidates</a> (<a href="http://www.wikidata.org/entity/Q36760764">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30430552">Immunogenicity and protective efficacy in mice and hamsters of a β-propiolactone inactivated whole virus SARS-CoV vaccine</a> (<a href="http://www.wikidata.org/entity/Q30430552">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39826024">Immunogenicity difference between the SARS coronavirus and the bat SARS-like coronavirus spike (S) proteins.</a> (<a href="http://www.wikidata.org/entity/Q39826024">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38310521">Immunogenicity of a receptor-binding domain of SARS coronavirus spike protein in mice: implications for a subunit vaccine.</a> (<a href="http://www.wikidata.org/entity/Q38310521">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47812425">Immunogenicity, safety, and protective efficacy of an inactivated SARS-associated coronavirus vaccine in rhesus monkeys.</a> (<a href="http://www.wikidata.org/entity/Q47812425">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40512207">Immunohistochemical, in situ hybridization, and ultrastructural localization of SARS-associated coronavirus in lung of a fatal case of severe acute respiratory syndrome in Taiwan.</a> (<a href="http://www.wikidata.org/entity/Q40512207">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36280532">Immunological responses against SARS-coronavirus infection in humans.</a> (<a href="http://www.wikidata.org/entity/Q36280532">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47914664">Immunological, structural, and preliminary X-ray diffraction characterizations of the fusion core of the SARS-coronavirus spike protein.</a> (<a href="http://www.wikidata.org/entity/Q47914664">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34472168">Immunopathogenesis of coronavirus infections: implications for SARS.</a> (<a href="http://www.wikidata.org/entity/Q34472168">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45046873">Importance of Akt signaling pathway for apoptosis in SARS-CoV-infected Vero E6 cells.</a> (<a href="http://www.wikidata.org/entity/Q45046873">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42407404">Importance of SARS-CoV spike protein Trp-rich region in viral infectivity.</a> (<a href="http://www.wikidata.org/entity/Q42407404">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45367973">Improved prediction of MHC class I binders/non-binders peptides through artificial neural network using variable learning rate: SARS corona virus, a case study.</a> (<a href="http://www.wikidata.org/entity/Q45367973">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39963152">In Vitro Antiviral Activity of some Novel Isatin Derivatives against HCV and SARS-CoV Viruses.</a> (<a href="http://www.wikidata.org/entity/Q39963152">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51916292">In silico prediction of SARS protease inhibitors by virtual high throughput screening.</a> (<a href="http://www.wikidata.org/entity/Q51916292">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42723341">In vitro anti-hepatitis B and SARS virus activities of a titanium-substituted-heteropolytungstate.</a> (<a href="http://www.wikidata.org/entity/Q42723341">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45121729">In vitro biochemical and thermodynamic characterization of nucleocapsid protein of SARS.</a> (<a href="http://www.wikidata.org/entity/Q45121729">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40492029">In vitro susceptibility of 10 clinical isolates of SARS coronavirus to selected antiviral compounds.</a> (<a href="http://www.wikidata.org/entity/Q40492029">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45141976">Inactivated SARS-CoV vaccine elicits high titers of spike protein-specific antibodies that block receptor binding and virus entry.</a> (<a href="http://www.wikidata.org/entity/Q45141976">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44961556">Inactivated SARS-CoV vaccine prepared from whole virus induces a high level of neutralizing antibodies in BALB/c mice.</a> (<a href="http://www.wikidata.org/entity/Q44961556">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46954531">Inactivation of SARS coronavirus by means of povidone-iodine, physical conditions and chemical reagents.</a> (<a href="http://www.wikidata.org/entity/Q46954531">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45210681">Inactivation of SARS coronavirus by means of povidone-iodine, physical conditions, and chemical reagents.</a> (<a href="http://www.wikidata.org/entity/Q45210681">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45046366">Inactivation of the coronavirus that induces severe acute respiratory syndrome, SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q45046366">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42801898">Increase of SARS-CoV 3CL peptidase activity due to macromolecular crowding effects in the milieu composition.</a> (<a href="http://www.wikidata.org/entity/Q42801898">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40470842">Increased sensitivity of SARS-coronavirus to a combination of human type I and type II interferons.</a> (<a href="http://www.wikidata.org/entity/Q40470842">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28219047">Indomethacin has a potent antiviral activity against SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q28219047">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45262795">Induction of Th1 type response by DNA vaccinations with N, M, and E genes against SARS-CoV in mice.</a> (<a href="http://www.wikidata.org/entity/Q45262795">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43128659">Induction of interferon-gamma-inducible protein 10 by SARS-CoV infection, interferon alfacon 1 and interferon inducer in human bronchial epithelial Calu-3 cells and BALB/c mice.</a> (<a href="http://www.wikidata.org/entity/Q43128659">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45787560">Induction of neutralising antibodies and cellular immune responses against SARS coronavirus by recombinant measles viruses.</a> (<a href="http://www.wikidata.org/entity/Q45787560">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40282936">Induction of protective immunity against severe acute respiratory syndrome coronavirus (SARS-CoV) infection using highly attenuated recombinant vaccinia virus DIs.</a> (<a href="http://www.wikidata.org/entity/Q40282936">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28268197">Infection of human airway epithelia by SARS coronavirus is associated with ACE2 expression and localization</a> (<a href="http://www.wikidata.org/entity/Q28268197">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45637990">Infectious diseases. One year after outbreak, SARS virus yields some secrets.</a> (<a href="http://www.wikidata.org/entity/Q45637990">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45347463">Influence of HLA gene polymorphisms on susceptibility and outcome post infection with the SARS-CoV virus.</a> (<a href="http://www.wikidata.org/entity/Q45347463">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39095556">Influence of hydrophobic and electrostatic residues on SARS-coronavirus S2 protein stability: insights into mechanisms of general viral fusion and inhibitor design.</a> (<a href="http://www.wikidata.org/entity/Q39095556">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46728350">Influence of intron and exon splicing enhancers on mammalian cell expression of a truncated spike protein of SARS-CoV and its implication for subunit vaccine development.</a> (<a href="http://www.wikidata.org/entity/Q46728350">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28730201">Influenza and SARS-coronavirus activating proteases TMPRSS2 and HAT are expressed at multiple sites in human respiratory and gastrointestinal tracts</a> (<a href="http://www.wikidata.org/entity/Q28730201">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30411976">Influenza and SARS: the impact of viral pandemics on maritime health.</a> (<a href="http://www.wikidata.org/entity/Q30411976">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30342635">Influenza as a model system for studying the cross-species transfer and evolution of the SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q30342635">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46934679">Inhibition of SARS coronavirus helicase by bismuth complexes.</a> (<a href="http://www.wikidata.org/entity/Q46934679">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35880180">Inhibition of SARS coronavirus infection in vitro with clinically approved antiviral drugs.</a> (<a href="http://www.wikidata.org/entity/Q35880180">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34009523">Inhibition of SARS pseudovirus cell entry by lactoferrin binding to heparan sulfate proteoglycans.</a> (<a href="http://www.wikidata.org/entity/Q34009523">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24529101">Inhibition of SARS-CoV 3C-like Protease Activity by Theaflavin-3,3'-digallate (TF3)</a> (<a href="http://www.wikidata.org/entity/Q24529101">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40202271">Inhibition of SARS-CoV gene expression by adenovirus-delivered small hairpin RNA.</a> (<a href="http://www.wikidata.org/entity/Q40202271">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45206542">Inhibition of SARS-CoV replication by siRNA.</a> (<a href="http://www.wikidata.org/entity/Q45206542">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30230264">Inhibition of SARS-CoV replication cycle by small interference RNAs silencing specific SARS proteins, 7a/7b, 3a/3b and S.</a> (<a href="http://www.wikidata.org/entity/Q30230264">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51641137">Inhibition of SARS-associated coronavirus infection and replication by RNA interference.</a> (<a href="http://www.wikidata.org/entity/Q51641137">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44963950">Inhibition of SARS-coronavirus infection in vitro by S-nitroso-N-acetylpenicillamine, a nitric oxide donor compound.</a> (<a href="http://www.wikidata.org/entity/Q44963950">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46951164">Inhibition of cell proliferation by SARS-CoV infection in Vero E6 cells.</a> (<a href="http://www.wikidata.org/entity/Q46951164">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40298627">Inhibition of cytokine gene expression and induction of chemokine genes in non-lymphatic cells infected with SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40298627">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40283818">Inhibition of feline (FIPV) and human (SARS) coronavirus by semisynthetic derivatives of glycopeptide antibiotics.</a> (<a href="http://www.wikidata.org/entity/Q40283818">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50774425">Inhibition of genes expression of SARS coronavirus by synthetic small interfering RNAs.</a> (<a href="http://www.wikidata.org/entity/Q50774425">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34894092">Inhibition of severe acute respiratory syndrome coronavirus replication in a lethal SARS-CoV BALB/c mouse model by stinging nettle lectin, Urtica dioica agglutinin.</a> (<a href="http://www.wikidata.org/entity/Q34894092">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36972346">Inhibition of severe acute respiratory syndrome-associated coronavirus (SARS-CoV) infectivity by peptides analogous to the viral spike protein.</a> (<a href="http://www.wikidata.org/entity/Q36972346">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39935590">Inhibition of the interaction between the SARS-CoV spike protein and its cellular receptor by anti-histo-blood group antibodies.</a> (<a href="http://www.wikidata.org/entity/Q39935590">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34608049">Inhibitor design for SARS coronavirus main protease based on "distorted key theory".</a> (<a href="http://www.wikidata.org/entity/Q34608049">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36835873">Inhibitor recognition specificity of MERS-CoV papain-like protease may differ from that of SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q36835873">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37593477">Inhibitors of SARS-3CLpro: virtual screening, biological evaluation, and molecular dynamics simulation studies.</a> (<a href="http://www.wikidata.org/entity/Q37593477">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35499344">Inhibitors of SARS-CoV entry--identification using an internally-controlled dual envelope pseudovirion assay.</a> (<a href="http://www.wikidata.org/entity/Q35499344">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46505019">Inhibitory effect of mizoribine and ribavirin on the replication of severe acute respiratory syndrome (SARS)-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q46505019">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37610938">Initial viral load and the outcomes of SARS.</a> (<a href="http://www.wikidata.org/entity/Q37610938">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36622004">Insights from the association of SARS-CoV S-protein with its receptor, ACE2.</a> (<a href="http://www.wikidata.org/entity/Q36622004">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35670284">Insurance and epidemics: SARS, West Nile virus and Nipah virus.</a> (<a href="http://www.wikidata.org/entity/Q35670284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28581323">Interaction between SARS-CoV helicase and a multifunctional cellular protein (Ddx5) revealed by yeast and mammalian cell two-hybrid systems</a> (<a href="http://www.wikidata.org/entity/Q28581323">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45659807">Interaction between heptad repeat 1 and 2 regions in spike protein of SARS-associated coronavirus: implications for virus fusogenic mechanism and identification of fusion inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q45659807">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38973834">Interaction of SARS and MERS Coronaviruses with the Antiviral Interferon Response.</a> (<a href="http://www.wikidata.org/entity/Q38973834">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43520298">Interaction of a peptide corresponding to the loop domain of the S2 SARS-CoV virus protein with model membranes.</a> (<a href="http://www.wikidata.org/entity/Q43520298">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36238605">Interactions among SARS-CoV accessory proteins revealed by bimolecular fluorescence complementation assay.</a> (<a href="http://www.wikidata.org/entity/Q36238605">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40220888">Interactions between SARS coronavirus and its receptor.</a> (<a href="http://www.wikidata.org/entity/Q40220888">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36740258">Interferon alfacon 1 inhibits SARS-CoV infection in human bronchial epithelial Calu-3 cells.</a> (<a href="http://www.wikidata.org/entity/Q36740258">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45461529">Interferon alfacon1 is an inhibitor of SARS-corona virus in cell-based models.</a> (<a href="http://www.wikidata.org/entity/Q45461529">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37102729">Interferon and cytokine responses to SARS-coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q37102729">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39616996">Interferon interplay helps tissue cells to cope with SARS-coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q39616996">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34993512">Interferon priming enables cells to partially overturn the SARS coronavirus-induced block in innate immune activation</a> (<a href="http://www.wikidata.org/entity/Q34993512">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42042092">Interferon-beta 1a and SARS coronavirus replication.</a> (<a href="http://www.wikidata.org/entity/Q42042092">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40505474">Interferon-beta and interferon-gamma synergistically inhibit the replication of severe acute respiratory syndrome-associated coronavirus (SARS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q40505474">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45287872">Interferon-gamma and interleukin-4 downregulate expression of the SARS coronavirus receptor ACE2 in Vero E6 cells.</a> (<a href="http://www.wikidata.org/entity/Q45287872">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41815725">International research networks in viral structural proteomics: again, lessons from SARS.</a> (<a href="http://www.wikidata.org/entity/Q41815725">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47878348">Intranasal immunization with inactivated SARS-CoV (SARS-associated coronavirus) induced local and serum antibodies in mice.</a> (<a href="http://www.wikidata.org/entity/Q47878348">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34504137">Intranasal immunization with plasmid DNA encoding spike protein of SARS-coronavirus/polyethylenimine nanoparticles elicits antigen-specific humoral and cellular immune responses.</a> (<a href="http://www.wikidata.org/entity/Q34504137">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37015424">Intranasal vaccination of recombinant adeno-associated virus encoding receptor-binding domain of severe acute respiratory syndrome coronavirus (SARS-CoV) spike protein induces strong mucosal immune responses and provides long-term protection against</a> (<a href="http://www.wikidata.org/entity/Q37015424">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43431450">Intraspecies diversity of SARS-like coronaviruses in Rhinolophus sinicus and its implications for the origin of SARS coronaviruses in humans.</a> (<a href="http://www.wikidata.org/entity/Q43431450">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45392021">Investigation of immunogenic T-cell epitopes in SARS virus nucleocapsid protein and their role in the prevention and treatment of SARS infection.</a> (<a href="http://www.wikidata.org/entity/Q45392021">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44837147">Investigation of interaction between two neutralizing monoclonal antibodies and SARS virus using biosensor based on imaging ellipsometry.</a> (<a href="http://www.wikidata.org/entity/Q44837147">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45407503">Investigation of interactions between two monoclonal antibodies and SARS virus with a Label-free Protein Array.</a> (<a href="http://www.wikidata.org/entity/Q45407503">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45922806">Investigation of the pharmacophore space of Severe Acute Respiratory Syndrome coronavirus (SARS-CoV) NTPase/helicase by dihydroxychromone derivatives.</a> (<a href="http://www.wikidata.org/entity/Q45922806">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44563062">Is serum in childhood naturally protective against SARS-coronavirus?</a> (<a href="http://www.wikidata.org/entity/Q44563062">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36972801">Is the anti-psychotic, 10-(3-(dimethylamino)propyl)phenothiazine (promazine), a potential drug with which to treat SARS infections? Lack of efficacy of promazine on SARS-CoV replication in a mouse model</a> (<a href="http://www.wikidata.org/entity/Q36972801">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30223960">Is the discovery of the novel human betacoronavirus 2c EMC/2012 (HCoV-EMC) the beginning of another SARS-like pandemic?</a> (<a href="http://www.wikidata.org/entity/Q30223960">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30219701">Isolation and characterization of a bat SARS-like coronavirus that uses the ACE2 receptor</a> (<a href="http://www.wikidata.org/entity/Q30219701">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q29618055">Isolation and characterization of viruses related to the SARS coronavirus from animals in southern China</a> (<a href="http://www.wikidata.org/entity/Q29618055">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33286672">Isolation and identification of an scFv antibody against nucleocapsid protein of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q33286672">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33310531">Isolation of inhibitory RNA aptamers against severe acute respiratory syndrome (SARS) coronavirus NTPase/Helicase.</a> (<a href="http://www.wikidata.org/entity/Q33310531">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40441237">Isolation of virus from a SARS patient and genome-wide analysis of genetic mutations related to pathogenesis and epidemiology from 47 SARS-CoV isolates.</a> (<a href="http://www.wikidata.org/entity/Q40441237">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q53855645">JNK and PI3k/Akt signaling pathways are required for establishing persistent SARS-CoV infection in Vero E6 cells.</a> (<a href="http://www.wikidata.org/entity/Q53855645">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40330912">Kinetics and synergistic effects of siRNAs targeting structural and replicase genes of SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40330912">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41005445">Kinetics of severe acute respiratory syndrome (SARS) coronavirus-specific antibodies in 271 laboratory-confirmed cases of SARS</a> (<a href="http://www.wikidata.org/entity/Q41005445">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37395860">Label-free, electrical detection of the SARS virus N-protein with nanowire biosensors utilizing antibody mimics as capture probes</a> (<a href="http://www.wikidata.org/entity/Q37395860">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36531634">Laboratory containment of SARS virus.</a> (<a href="http://www.wikidata.org/entity/Q36531634">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21261523">Lack of association between polymorphisms of MASP2 and susceptibility to SARS coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q21261523">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27317179">Lack of innate interferon responses during SARS coronavirus infection in a vaccination and reinfection ferret model</a> (<a href="http://www.wikidata.org/entity/Q27317179">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40021323">Large-scale preparation of UV-inactivated SARS coronavirus virions for vaccine antigen.</a> (<a href="http://www.wikidata.org/entity/Q40021323">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51877925">Lessons learned from SARS outbreak prompt rapid response to new coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q51877925">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24314417">Lipid rafts are involved in SARS-CoV entry into Vero E6 cells</a> (<a href="http://www.wikidata.org/entity/Q24314417">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51981666">Long-lived effector/central memory T-cell responses to severe acute respiratory syndrome coronavirus (SARS-CoV) S antigen in recovered SARS patients.</a> (<a href="http://www.wikidata.org/entity/Q51981666">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51982621">Long-lived memory T lymphocyte responses against SARS coronavirus nucleocapsid protein in SARS-recovered patients.</a> (<a href="http://www.wikidata.org/entity/Q51982621">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35880688">Long-term SARS coronavirus excretion from patient cohort, China.</a> (<a href="http://www.wikidata.org/entity/Q35880688">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33267285">Long-term persistence of robust antibody and cytotoxic T cell responses in recovered patients infected with SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q33267285">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40393493">Long-term protection from SARS coronavirus infection conferred by a single immunization with an attenuated VSV-based vaccine.</a> (<a href="http://www.wikidata.org/entity/Q40393493">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28386996">Longitudinal analysis of Severe Acute Respiratory Syndrome (SARS) coronavirus-specific antibody in SARS patients.</a> (<a href="http://www.wikidata.org/entity/Q28386996">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47653968">Longitudinal profile of antibodies against SARS-coronavirus in SARS patients and their clinical significance.</a> (<a href="http://www.wikidata.org/entity/Q47653968">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41005366">Longitudinal profile of immunoglobulin G (IgG), IgM, and IgA antibodies against the severe acute respiratory syndrome (SARS) coronavirus nucleocapsid protein in patients with pneumonia due to the SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q41005366">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43175353">Longitudinal surveillance of SARS-like coronaviruses in bats by quantitative real-time PCR.</a> (<a href="http://www.wikidata.org/entity/Q43175353">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35817398">Longitudinally profiling neutralizing antibody response to SARS coronavirus with pseudotypes.</a> (<a href="http://www.wikidata.org/entity/Q35817398">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47738282">MERS, SARS and other coronaviruses as causes of pneumonia.</a> (<a href="http://www.wikidata.org/entity/Q47738282">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41930666">Macromolecular Antiviral Agents against Zika, Ebola, SARS, and Other Pathogenic Viruses.</a> (<a href="http://www.wikidata.org/entity/Q41930666">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33240696">Mapping a neutralizing epitope on the SARS coronavirus spike protein: computational prediction based on affinity-selected peptides.</a> (<a href="http://www.wikidata.org/entity/Q33240696">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30939828">Mass spectrometric characterization of proteins from the SARS virus: a preliminary report.</a> (<a href="http://www.wikidata.org/entity/Q30939828">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27684519">Mechanism for controlling the monomer-dimer conversion of SARS coronavirus main protease</a> (<a href="http://www.wikidata.org/entity/Q27684519">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44412125">Mechanisms of host defense following severe acute respiratory syndrome-coronavirus (SARS-CoV) pulmonary infection of mice.</a> (<a href="http://www.wikidata.org/entity/Q44412125">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35913357">Medical treatment of viral pneumonia including SARS in immunocompetent adult.</a> (<a href="http://www.wikidata.org/entity/Q35913357">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44961691">Medusa's ugly head again: from SARS to MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q44961691">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40763561">Memory T cell responses targeting the SARS coronavirus persist up to 11 years post-infection.</a> (<a href="http://www.wikidata.org/entity/Q40763561">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35880913">Mice susceptible to SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q35880913">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50873534">Mice transgenic for human angiotensin-converting enzyme 2 provide a model for SARS coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q50873534">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44178051">Microarray and real-time RT-PCR analyses of differential human gene expression patterns induced by severe acute respiratory syndrome (SARS) coronavirus infection of Vero cells.</a> (<a href="http://www.wikidata.org/entity/Q44178051">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34468689">Middle East respiratory syndrome coronavirus: another zoonotic betacoronavirus causing SARS-like disease</a> (<a href="http://www.wikidata.org/entity/Q34468689">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q26787251">Middle East respiratory syndrome: SARS redux?</a> (<a href="http://www.wikidata.org/entity/Q26787251">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30986002">Mining SARS-CoV protease cleavage data using non-orthogonal decision trees: a novel method for decisive template selection.</a> (<a href="http://www.wikidata.org/entity/Q30986002">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24800258">Moderate mutation rate in the SARS coronavirus genome and its implications</a> (<a href="http://www.wikidata.org/entity/Q24800258">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51130109">Modification of SARS-CoV S1 gene render expression in Pichia pastoris.</a> (<a href="http://www.wikidata.org/entity/Q51130109">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35998116">Molecular advances in severe acute respiratory syndrome-associated coronavirus (SARS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q35998116">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21245141">Molecular advances in the cell biology of SARS-CoV and current disease prevention strategies</a> (<a href="http://www.wikidata.org/entity/Q21245141">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43877119">Molecular characterization of a panel of murine monoclonal antibodies specific for the SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q43877119">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33214622">Molecular cloning, expression, and purification of SARS-CoV nsp13.</a> (<a href="http://www.wikidata.org/entity/Q33214622">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44765532">Molecular cloning, expression, purification, and mass spectrometric characterization of 3C-like protease of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q44765532">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46954558">Molecular docking identifies the binding of 3-chloropyridine moieties specifically to the S1 pocket of SARS-CoV Mpro.</a> (<a href="http://www.wikidata.org/entity/Q46954558">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46427243">Molecular dynamic simulations analysis of ritonavir and lopinavir as SARS-CoV 3CL(pro) inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q46427243">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35847365">Molecular epidemiology of SARS-associated coronavirus, Beijing</a> (<a href="http://www.wikidata.org/entity/Q35847365">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43549784">Molecular evolution and multilocus sequence typing of 145 strains of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q43549784">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42618656">Molecular evolution of the SARS coronavirus during the course of the SARS epidemic in China.</a> (<a href="http://www.wikidata.org/entity/Q42618656">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30336102">Molecular modelling of S1 and S2 subunits of SARS coronavirus spike glycoprotein.</a> (<a href="http://www.wikidata.org/entity/Q30336102">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24814994">Molecular signature of clinical severity in recovering patients with severe acute respiratory syndrome coronavirus (SARS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q24814994">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37183997">Molecular targets for diagnostics and therapeutics of severe acute respiratory syndrome (SARS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q37183997">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34417623">Monoclonal antibodies to SARS-associated coronavirus (SARS-CoV): identification of neutralizing and antibodies reactive to S, N, M and E viral proteins.</a> (<a href="http://www.wikidata.org/entity/Q34417623">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51668886">Morphology and morphogenesis of severe acute respiratory syndrome (SARS)-associated virus.</a> (<a href="http://www.wikidata.org/entity/Q51668886">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51788038">Mouse studies of SARS coronavirus-specific immune responses to recombinant replication-defective adenovirus expressing SARS coronavirus N protein.</a> (<a href="http://www.wikidata.org/entity/Q51788038">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45622393">Mucosal immunisation of African green monkeys (Cercopithecus aethiops) with an attenuated parainfluenza virus expressing the SARS coronavirus spike protein for the prevention of SARS.</a> (<a href="http://www.wikidata.org/entity/Q45622393">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30360575">Multi-organ lesions in suckling mice infected with SARS-associated mammalian reovirus linked with apoptosis induced by viral proteins μ1 and σ1</a> (<a href="http://www.wikidata.org/entity/Q30360575">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36057362">Multi-zone modeling of probable SARS virus transmission by airflow between flats in Block E, Amoy Gardens.</a> (<a href="http://www.wikidata.org/entity/Q36057362">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44324899">Murine hepatitis virus strain 1 as a model for severe acute respiratory distress syndrome (SARS).</a> (<a href="http://www.wikidata.org/entity/Q44324899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40220751">Mustela vison ACE2 functions as a receptor for SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40220751">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39759201">Mutagenesis of the transmembrane domain of the SARS coronavirus spike glycoprotein: refinement of the requirements for SARS coronavirus cell entry.</a> (<a href="http://www.wikidata.org/entity/Q39759201">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40569736">Mutation analysis of 20 SARS virus genome sequences: evidence for negative selection in replicase ORF1b and spike gene.</a> (<a href="http://www.wikidata.org/entity/Q40569736">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46481277">Mutational and inhibitive analysis of SARS coronavirus 3C-like protease by fluorescence resonance energy transfer-based assays.</a> (<a href="http://www.wikidata.org/entity/Q46481277">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24792415">Mutational dynamics of the SARS coronavirus in cell culture and human populations isolated in 2003</a> (<a href="http://www.wikidata.org/entity/Q24792415">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35719913">Mutational patterns correlate with genome organization in SARS and other coronaviruses.</a> (<a href="http://www.wikidata.org/entity/Q35719913">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33392688">MyD88 is required for protection from lethal infection with a mouse-adapted SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q33392688">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46166706">NMR assignment of the protein nsp3a from SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q46166706">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44046356">Neutralizing antibody against severe acute respiratory syndrome (SARS)-coronavirus spike is highly effective for the protection of mice in the murine SARS model.</a> (<a href="http://www.wikidata.org/entity/Q44046356">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42041695">Neutralizing antibody and protective immunity to SARS coronavirus infection of mice induced by a soluble recombinant polypeptide containing an N-terminal segment of the spike glycoprotein.</a> (<a href="http://www.wikidata.org/entity/Q42041695">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33688229">Neutralizing epitopes of the SARS-CoV S-protein cluster independent of repertoire, antigen structure or mAb technology</a> (<a href="http://www.wikidata.org/entity/Q33688229">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24803145">New Frameshifting Pseudoknot Found in SARS Virus</a> (<a href="http://www.wikidata.org/entity/Q24803145">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40954068">New Potent SARS-CoV 3C-Like Protease Inhibitors Derived from Thieno[2,3-d]-pyrimidine Derivatives.</a> (<a href="http://www.wikidata.org/entity/Q40954068">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36058647">New antiviral drugs, vaccines and classic public health interventions against SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q36058647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35620215">New developments for the design, synthesis and biological evaluation of potent SARS-CoV 3CL(pro) inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q35620215">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40122058">Novel Alphacoronaviruses and Paramyxoviruses Cocirculate with Type 1 and Severe Acute Respiratory System (SARS)-Related Betacoronaviruses in Synanthropic Bats of Luxembourg.</a> (<a href="http://www.wikidata.org/entity/Q40122058">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37020538">Novel SARS-like betacoronaviruses in bats, China, 2011.</a> (<a href="http://www.wikidata.org/entity/Q37020538">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47762032">Novel rapid immunochromatographic test based on an enzyme immunoassay for detecting nucleocapsid antigen in SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47762032">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34020329">Novel system for detecting SARS coronavirus nucleocapsid protein using an ssDNA aptamer.</a> (<a href="http://www.wikidata.org/entity/Q34020329">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47843916">Object-oriented biological system integration: a SARS coronavirus example.</a> (<a href="http://www.wikidata.org/entity/Q47843916">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44864186">Old drugs as lead compounds for a new disease? Binding analysis of SARS coronavirus main proteinase with HIV, psychotic and parasite drugs.</a> (<a href="http://www.wikidata.org/entity/Q44864186">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45658483">One-tube nested RT-PCR enabled by using a plastic film and its application for the rapid detection of SARS-virus.</a> (<a href="http://www.wikidata.org/entity/Q45658483">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30401512">Optimization of the Production Process and Characterization of the Yeast-Expressed SARS-CoV Recombinant Receptor-Binding Domain (RBD219-N1), a SARS Vaccine Candidate.</a> (<a href="http://www.wikidata.org/entity/Q30401512">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45640664">Organ distribution of severe acute respiratory syndrome (SARS) associated coronavirus (SARS-CoV) in SARS patients: implications for pathogenesis and virus transmission pathways.</a> (<a href="http://www.wikidata.org/entity/Q45640664">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30401566">PIKA provides an adjuvant effect to induce strong mucosal and systemic humoral immunity against SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q30401566">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33789627">Palindromes in SARS and Other Coronaviruses</a> (<a href="http://www.wikidata.org/entity/Q33789627">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34037293">Palmitoylation of SARS-CoV S protein is necessary for partitioning into detergent-resistant membranes and cell-cell fusion but not interaction with M protein.</a> (<a href="http://www.wikidata.org/entity/Q34037293">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q53585772">Palmitoylation of the cysteine-rich endodomain of the SARS-coronavirus spike glycoprotein is important for spike-mediated cell fusion.</a> (<a href="http://www.wikidata.org/entity/Q53585772">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46617455">Papain-like protease 2 (PLP2) from severe acute respiratory syndrome coronavirus (SARS-CoV): expression, purification, characterization, and inhibition.</a> (<a href="http://www.wikidata.org/entity/Q46617455">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35635422">Participation of both host and virus factors in induction of severe acute respiratory syndrome (SARS) in F344 rats infected with SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q35635422">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q53735524">Pathogenesis of SARS coronavirus infection using human lung epithelial cells: an in vitro model.</a> (<a href="http://www.wikidata.org/entity/Q53735524">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q25256715">Pathological Clues to How the SARS Virus Kills</a> (<a href="http://www.wikidata.org/entity/Q25256715">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45206602">Pathology of experimental SARS coronavirus infection in cats and ferrets.</a> (<a href="http://www.wikidata.org/entity/Q45206602">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40385095">Pathology of guinea pigs experimentally infected with a novel reovirus and coronavirus isolated from SARS patients.</a> (<a href="http://www.wikidata.org/entity/Q40385095">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48015946">Pegylated interferon-alpha protects type 1 pneumocytes against SARS coronavirus infection in macaques.</a> (<a href="http://www.wikidata.org/entity/Q48015946">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33989027">Peptide domain involved in the interaction between membrane protein and nucleocapsid protein of SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q33989027">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36478400">Peptide mimicrying between SARS coronavirus spike protein and human proteins reacts with SARS patient serum.</a> (<a href="http://www.wikidata.org/entity/Q36478400">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36138326">Peptides derived from HIV-1, HIV-2, Ebola virus, SARS coronavirus and coronavirus 229E exhibit high affinity binding to the formyl peptide receptor.</a> (<a href="http://www.wikidata.org/entity/Q36138326">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54420762">Peptides from the SARS-associated coronavirus as tags for protein expression and purification.</a> (<a href="http://www.wikidata.org/entity/Q54420762">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40534253">Persistent infection of SARS coronavirus in colonic cells in vitro.</a> (<a href="http://www.wikidata.org/entity/Q40534253">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36618106">Persistent memory CD4+ and CD8+ T-cell responses in recovered severe acute respiratory syndrome (SARS) patients to SARS coronavirus M antigen</a> (<a href="http://www.wikidata.org/entity/Q36618106">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44721861">Persistent shedding of viable SARS-CoV in urine and stool of SARS patients during the convalescent phase.</a> (<a href="http://www.wikidata.org/entity/Q44721861">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39614881">Phagocytic cells contribute to the antibody-mediated elimination of pulmonary-infected SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q39614881">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40546099">Phosphorylation of p38 MAPK and its downstream targets in SARS coronavirus-infected cells.</a> (<a href="http://www.wikidata.org/entity/Q40546099">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47841615">Phylogenetic analysis and sequence comparisons of structural and non-structural SARS coronavirus proteins in Taiwan.</a> (<a href="http://www.wikidata.org/entity/Q47841615">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47320353">Phylogenetic analysis of the full-length SARS-CoV sequences: evidence for phylogenetic discordance in three genomic regions.</a> (<a href="http://www.wikidata.org/entity/Q47320353">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37607465">Phylogenetic perspectives on the epidemiology and origins of SARS and SARS-like coronaviruses.</a> (<a href="http://www.wikidata.org/entity/Q37607465">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35731257">Phylogenomics and bioinformatics of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q35731257">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51641081">Phylogeny of the SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q51641081">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47257271">Physiological and molecular triggers for SARS-CoV membrane fusion and entry into host cells.</a> (<a href="http://www.wikidata.org/entity/Q47257271">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47262308">Piezoelectric immunosensor for SARS-associated coronavirus in sputum.</a> (<a href="http://www.wikidata.org/entity/Q47262308">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48091389">Polymorphism of SARS-CoV genomes.</a> (<a href="http://www.wikidata.org/entity/Q48091389">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45121648">Polyprotein cleavage mechanism of SARS CoV Mpro and chemical modification of the octapeptide.</a> (<a href="http://www.wikidata.org/entity/Q45121648">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q26062853">Possible SARS coronavirus transmission during cardiopulmonary resuscitation</a> (<a href="http://www.wikidata.org/entity/Q26062853">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35879760">Possible central nervous system infection by SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q35879760">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34332142">Potent and persistent antibody responses against the receptor-binding domain of SARS-CoV spike protein in recovered patients.</a> (<a href="http://www.wikidata.org/entity/Q34332142">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40497079">Potent and selective inhibition of SARS coronavirus replication by aurintricarboxylic acid.</a> (<a href="http://www.wikidata.org/entity/Q40497079">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30783772">Potent and specific inhibition of SARS-CoV antigen expression by RNA interference.</a> (<a href="http://www.wikidata.org/entity/Q30783772">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35901171">Potent cross-reactive neutralization of SARS coronavirus isolates by human monoclonal antibodies.</a> (<a href="http://www.wikidata.org/entity/Q35901171">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39971559">Potent in vitro activity of the albumin fusion type 1 interferons (albumin-interferon-alpha and albumin-interferon-beta) against RNA viral agents of bioterrorism and the severe acute respiratory syndrome (SARS) virus.</a> (<a href="http://www.wikidata.org/entity/Q39971559">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40528188">Potent inhibition of SARS-associated coronavirus (SCOV) infection and replication by type I interferons (IFN-alpha/beta) but not by type II interferon (IFN-gamma).</a> (<a href="http://www.wikidata.org/entity/Q40528188">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36602721">Potent neutralization of severe acute respiratory syndrome (SARS) coronavirus by a human mAb to S1 protein that blocks receptor association.</a> (<a href="http://www.wikidata.org/entity/Q36602721">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36441511">Potential antivirals and antiviral strategies against SARS coronavirus infections.</a> (<a href="http://www.wikidata.org/entity/Q36441511">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34415534">Potential cross-reactivity of severe acute respiratory syndrome-associated coronavirus (SARS-CoV) nucleocapsid (N)-based IgG ELISA assay for plasma samples from HIV-1 positive intravenous drug users (IDUs).</a> (<a href="http://www.wikidata.org/entity/Q34415534">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51664130">Potential for receptor-based antiviral drugs against SARS.</a> (<a href="http://www.wikidata.org/entity/Q51664130">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47328156">Potential targets for anti-SARS drugs in the structural proteins from SARS related coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47328156">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44766394">Prediction of amino acid pairs sensitive to mutations in the spike protein from SARS related coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q44766394">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46741771">Prediction of functional class of the SARS coronavirus proteins by a statistical learning method.</a> (<a href="http://www.wikidata.org/entity/Q46741771">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48223031">Prediction of proteinase cleavage sites in polyproteins of coronaviruses and its applications in analyzing SARS-CoV genomes.</a> (<a href="http://www.wikidata.org/entity/Q48223031">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47893120">Prediction of quaternary assembly of SARS coronavirus peplomer.</a> (<a href="http://www.wikidata.org/entity/Q47893120">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39518493">Preliminary study on the detection of the SARS-CoV specific target cDNA fragments by multiplex PCR.</a> (<a href="http://www.wikidata.org/entity/Q39518493">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40599319">Preparation and characterization of monoclonal antibodies against S1 domain at N-terminal residues 249 to 667 of SARS-associated coronavirus S1 protein.</a> (<a href="http://www.wikidata.org/entity/Q40599319">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40492274">Preparation and evaluation of anti-SARS coronavirus IgY from yolks of immunized SPF chickens.</a> (<a href="http://www.wikidata.org/entity/Q40492274">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43764882">Prevalence of IgG antibody to SARS-associated coronavirus in animal traders--Guangdong Province, China, 2003.</a> (<a href="http://www.wikidata.org/entity/Q43764882">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43483871">Prevalence of SARS-CoV antibody in all Hong Kong patient contacts.</a> (<a href="http://www.wikidata.org/entity/Q43483871">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45632163">Prevalence of non-pneumonic infections with SARS-correlated virus.</a> (<a href="http://www.wikidata.org/entity/Q45632163">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47407432">Prevalence of non-pneumonic infections with SARS-correlated virus.</a> (<a href="http://www.wikidata.org/entity/Q47407432">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47340700">Prevalence of subclinical infection by the SARS coronavirus among general practitioners in Hong Kong.</a> (<a href="http://www.wikidata.org/entity/Q47340700">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40566033">Primary characterization of SARS coronavirus strain Frankfurt 1.</a> (<a href="http://www.wikidata.org/entity/Q40566033">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37011150">Priming with rAAV encoding RBD of SARS-CoV S protein and boosting with RBD-specific peptides for T cell epitopes elevated humoral and cellular immune responses against SARS-CoV infection.</a> (<a href="http://www.wikidata.org/entity/Q37011150">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39926740">Prior immunization with severe acute respiratory syndrome (SARS)-associated coronavirus (SARS-CoV) nucleocapsid protein causes severe pneumonia in mice infected with SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q39926740">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q31059560">Probing the structure of the SARS coronavirus using scanning electron microscopy.</a> (<a href="http://www.wikidata.org/entity/Q31059560">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39854081">Procyanidins and butanol extract of Cinnamomi Cortex inhibit SARS-CoV infection.</a> (<a href="http://www.wikidata.org/entity/Q39854081">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40422570">Production of a monoclonal antibody against SARS-CoV spike protein with single intrasplenic immunization of plasmid DNA.</a> (<a href="http://www.wikidata.org/entity/Q40422570">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33242774">Production of an anti-severe acute respiratory syndrome (SARS) coronavirus human monoclonal antibody Fab fragment by using a combinatorial immunoglobulin gene library derived from patients who recovered from SARS.</a> (<a href="http://www.wikidata.org/entity/Q33242774">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33865858">Production of specific antibodies against SARS-coronavirus nucleocapsid protein without cross reactivity with human coronaviruses 229E and OC43.</a> (<a href="http://www.wikidata.org/entity/Q33865858">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40468494">Profile of antibodies to the nucleocapsid protein of the severe acute respiratory syndrome (SARS)-associated coronavirus in probable SARS patients.</a> (<a href="http://www.wikidata.org/entity/Q40468494">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51661106">Profile of specific antibodies to the SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q51661106">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47745602">Profiles of IgG antibodies to nucleocapsid and spike proteins of the SARS-associated coronavirus in SARS patients.</a> (<a href="http://www.wikidata.org/entity/Q47745602">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36323796">Programmed ribosomal frameshifting in HIV-1 and the SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q36323796">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28304877">Programmed ribosomal frameshifting in decoding the SARS-CoV genome</a> (<a href="http://www.wikidata.org/entity/Q28304877">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37283689">Progress in Anti-SARS Coronavirus Chemistry, Biology and Chemotherapy.</a> (<a href="http://www.wikidata.org/entity/Q37283689">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45218510">Prokaryotic expression, refolding, and purification of fragment 450-650 of the spike protein of SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q45218510">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40526248">Prolonged disturbances of in vitro cytokine production in patients with severe acute respiratory syndrome (SARS) treated with ribavirin and steroids.</a> (<a href="http://www.wikidata.org/entity/Q40526248">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40318656">Promoter activity of SARS coronavirus 5' UTR sequence in eukaryotic cells.</a> (<a href="http://www.wikidata.org/entity/Q40318656">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38320824">Properties of isonucleotide-incorporated oligodeoxynucleotides and inhibition of the expression of spike protein of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q38320824">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40534160">Prophylactic and therapeutic effects of small interfering RNA targeting SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40534160">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39107680">Prophylactic and therapeutic intranasal administration with an immunomodulator, Hiltonol® (Poly IC:LC), in a lethal SARS-CoV-infected BALB/c mouse model.</a> (<a href="http://www.wikidata.org/entity/Q39107680">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44879404">Proposal for vaccination against SARS coronavirus using avian infectious bronchitis virus strain H from The Netherlands.</a> (<a href="http://www.wikidata.org/entity/Q44879404">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43232947">Protein transfer enhances cellular immune responses to DNA vaccination against SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q43232947">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47955894">Proteomic analysis of SARS associated coronavirus using two-dimensional liquid chromatography mass spectrometry and one-dimensional sodium dodecyl sulfate-polyacrylamide gel electrophoresis followed by mass spectroemtric analysis.</a> (<a href="http://www.wikidata.org/entity/Q47955894">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39908614">Pseudotyped vesicular stomatitis virus for analysis of virus entry mediated by SARS coronavirus spike proteins.</a> (<a href="http://www.wikidata.org/entity/Q39908614">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40220842">Pseudotyped vesicular stomatitis virus for functional analysis of SARS coronavirus spike protein.</a> (<a href="http://www.wikidata.org/entity/Q40220842">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35587464">Pulmonary pathological features in coronavirus associated severe acute respiratory syndrome (SARS).</a> (<a href="http://www.wikidata.org/entity/Q35587464">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51669763">Putative hAPN receptor binding sites in SARS_CoV spike protein.</a> (<a href="http://www.wikidata.org/entity/Q51669763">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46875163">Pyridine N-oxide derivatives are inhibitory to the human SARS and feline infectious peritonitis coronavirus in cell culture.</a> (<a href="http://www.wikidata.org/entity/Q46875163">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40545430">Quantitative analysis and prognostic implication of SARS coronavirus RNA in the plasma and serum of patients with severe acute respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q40545430">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45492386">Quantitative analysis of severe acute respiratory syndrome (SARS)-associated coronavirus-infected cells using proteomic approaches: implications for cellular responses to virus infection.</a> (<a href="http://www.wikidata.org/entity/Q45492386">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39274858">Quantitative and sensitive detection of the SARS-CoV spike protein using bispecific monoclonal antibody-based enzyme-linked immunoassay.</a> (<a href="http://www.wikidata.org/entity/Q39274858">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40229048">Quantitative comparison of the efficiency of antibodies against S1 and S2 subunit of SARS coronavirus spike protein in virus neutralization and blocking of receptor binding: implications for the functional roles of S2 subunit.</a> (<a href="http://www.wikidata.org/entity/Q40229048">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40366467">Quantitative evaluation of infection control models in the prevention of nosocomial transmission of SARS virus to healthcare workers: implication to nosocomial viral infection control for healthcare workers.</a> (<a href="http://www.wikidata.org/entity/Q40366467">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50571428">Quantitative temporal-spatial distribution of severe acute respiratory syndrome-associated coronavirus (SARS-CoV) in post-mortem tissues.</a> (<a href="http://www.wikidata.org/entity/Q50571428">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51657769">Questions about comparative genomics of SARS coronavirus isolates.</a> (<a href="http://www.wikidata.org/entity/Q51657769">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38351362">RNA aptamer-based sensitive detection of SARS coronavirus nucleocapsid protein.</a> (<a href="http://www.wikidata.org/entity/Q38351362">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36619971">RNA dimerization plays a role in ribosomal frameshifting of the SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q36619971">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47739834">Rapid and sensitive detection of multiple genes from the SARS-coronavirus using quantitative RT-PCR with dual systems.</a> (<a href="http://www.wikidata.org/entity/Q47739834">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47999774">Rapid detection of the severe acute respiratory syndrome (SARS) coronavirus by a loop-mediated isothermal amplification assay.</a> (<a href="http://www.wikidata.org/entity/Q47999774">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51671857">Rapid diagnosis of a coronavirus associated with severe acute respiratory syndrome (SARS).</a> (<a href="http://www.wikidata.org/entity/Q51671857">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33239175">Rapid peptide-based screening on the substrate specificity of severe acute respiratory syndrome (SARS) coronavirus 3C-like protease by matrix-assisted laser desorption/ionization time-of-flight mass spectrometry.</a> (<a href="http://www.wikidata.org/entity/Q33239175">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28279368">Real-time NASBA detection of SARS-associated coronavirus and comparison with real-time reverse transcription-PCR</a> (<a href="http://www.wikidata.org/entity/Q28279368">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35879781">Real-time polymerase chain reaction for detecting SARS coronavirus, Beijing, 2003</a> (<a href="http://www.wikidata.org/entity/Q35879781">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34306956">Real-time reverse transcription-polymerase chain reaction assay for SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q34306956">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42844863">Receptor and viral determinants of SARS-coronavirus adaptation to human ACE2.</a> (<a href="http://www.wikidata.org/entity/Q42844863">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38133141">Receptor recognition and cross-species infections of SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q38133141">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40506063">Receptor-binding domain of SARS-CoV spike protein induces highly potent neutralizing antibodies: implication for developing subunit vaccine.</a> (<a href="http://www.wikidata.org/entity/Q40506063">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40263910">Recombinant adeno-associated virus expressing the receptor-binding domain of severe acute respiratory syndrome coronavirus S protein elicits neutralizing antibodies: Implication for developing SARS vaccines.</a> (<a href="http://www.wikidata.org/entity/Q40263910">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40685865">Recombinant protein-based enzyme-linked immunosorbent assay and immunochromatographic tests for detection of immunoglobulin G antibodies to severe acute respiratory syndrome (SARS) coronavirus in SARS patients.</a> (<a href="http://www.wikidata.org/entity/Q40685865">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37366744">Recombinant receptor-binding domain of SARS-CoV spike protein expressed in mammalian, insect and E. coli cells elicits potent neutralizing antibody and protective immunity.</a> (<a href="http://www.wikidata.org/entity/Q37366744">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35815644">Reconstitution of the receptor-binding motif of the SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q35815644">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40405178">Recurrent mutations associated with isolation and passage of SARS coronavirus in cells from non-human primates.</a> (<a href="http://www.wikidata.org/entity/Q40405178">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54540747">Reduced incorporation of SARS-CoV spike protein into viral particles due to amino acid substitutions within the receptor binding domain.</a> (<a href="http://www.wikidata.org/entity/Q54540747">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24806067">Reference gene selection for quantitative real-time PCR analysis in virus infected cells: SARS corona virus, Yellow fever virus, Human Herpesvirus-6, Camelpox virus and Cytomegalovirus infections</a> (<a href="http://www.wikidata.org/entity/Q24806067">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44374233">Regulation of p90RSK phosphorylation by SARS-CoV infection in Vero E6 cells.</a> (<a href="http://www.wikidata.org/entity/Q44374233">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24805011">Relationship of SARS-CoV to other pathogenic RNA viruses explored by tetranucleotide usage profiling</a> (<a href="http://www.wikidata.org/entity/Q24805011">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47925901">Relative rates of non-pneumonic SARS coronavirus infection and SARS coronavirus pneumonia.</a> (<a href="http://www.wikidata.org/entity/Q47925901">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50787284">Replication of SARS coronavirus administered into the respiratory tract of African Green, rhesus and cynomolgus monkeys.</a> (<a href="http://www.wikidata.org/entity/Q50787284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50502190">Replication of human coronaviruses SARS-CoV, HCoV-NL63 and HCoV-229E is inhibited by the drug FK506.</a> (<a href="http://www.wikidata.org/entity/Q50502190">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34410310">Residue analysis of a CTL epitope of SARS-CoV spike protein by IFN-gamma production and bioinformatics prediction.</a> (<a href="http://www.wikidata.org/entity/Q34410310">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44795297">Response of memory CD8+ T cells to severe acute respiratory syndrome (SARS) coronavirus in recovered SARS patients and healthy individuals.</a> (<a href="http://www.wikidata.org/entity/Q44795297">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34193444">Reverse genetics of SARS-related coronavirus using vaccinia virus-based recombination.</a> (<a href="http://www.wikidata.org/entity/Q34193444">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40479393">Ribavirin and interferon-beta synergistically inhibit SARS-associated coronavirus replication in animal and human cell lines.</a> (<a href="http://www.wikidata.org/entity/Q40479393">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44088975">Ribavirin for SARS in children.</a> (<a href="http://www.wikidata.org/entity/Q44088975">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34979709">Ribavirin in the treatment of SARS: A new trick for an old drug?</a> (<a href="http://www.wikidata.org/entity/Q34979709">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35563588">Ribavirin in the treatment of severe acute respiratory syndrome (SARS).</a> (<a href="http://www.wikidata.org/entity/Q35563588">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30203307">Risks to healthcare workers with emerging diseases: lessons from MERS-CoV, Ebola, SARS, and avian flu.</a> (<a href="http://www.wikidata.org/entity/Q30203307">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35536588">Role of lopinavir/ritonavir in the treatment of SARS: initial virological and clinical findings.</a> (<a href="http://www.wikidata.org/entity/Q35536588">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51788035">Roles of spike protein in the pathogenesis of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q51788035">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47246717">Routes of transmission of influenza A H1N1, SARS CoV, and norovirus in air cabin: Comparative analyses.</a> (<a href="http://www.wikidata.org/entity/Q47246717">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50711924">SARS CoV replication and pathogenesis in human airway epithelial cultures.</a> (<a href="http://www.wikidata.org/entity/Q50711924">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39397412">SARS CoV subunit vaccine: antibody-mediated neutralisation and enhancement.</a> (<a href="http://www.wikidata.org/entity/Q39397412">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37044451">SARS Coronavirus Fusion Peptide-Derived Sequence Suppresses Collagen-Induced Arthritis in DBA/1J Mice.</a> (<a href="http://www.wikidata.org/entity/Q37044451">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46333172">SARS Coronaviruses and Highly Pathogenic Influenza Viruses: Safety and Occupational Health for Laboratory Workers.</a> (<a href="http://www.wikidata.org/entity/Q46333172">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30249325">SARS and MERS: recent insights into emerging coronaviruses.</a> (<a href="http://www.wikidata.org/entity/Q30249325">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37866946">SARS and common viral infections.</a> (<a href="http://www.wikidata.org/entity/Q37866946">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36622031">SARS and other coronaviruses in humans and animals.</a> (<a href="http://www.wikidata.org/entity/Q36622031">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q31004830">SARS associated coronavirus has a recombinant polymerase and coronaviruses have a history of host-shifting.</a> (<a href="http://www.wikidata.org/entity/Q31004830">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43691969">SARS corona virus peptides recognized by antibodies in the sera of convalescent cases.</a> (<a href="http://www.wikidata.org/entity/Q43691969">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50536760">SARS coronavirus 8b reduces viral replication by down-regulating E via an ubiquitin-independent proteasome pathway.</a> (<a href="http://www.wikidata.org/entity/Q50536760">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44599541">SARS coronavirus and apoptosis.</a> (<a href="http://www.wikidata.org/entity/Q44599541">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36539000">SARS coronavirus and innate immunity.</a> (<a href="http://www.wikidata.org/entity/Q36539000">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37067227">SARS coronavirus anti-infectives.</a> (<a href="http://www.wikidata.org/entity/Q37067227">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42132641">SARS coronavirus detection methods.</a> (<a href="http://www.wikidata.org/entity/Q42132641">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42551343">SARS coronavirus detection.</a> (<a href="http://www.wikidata.org/entity/Q42551343">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40550615">SARS coronavirus induces apoptosis in Vero E6 cells.</a> (<a href="http://www.wikidata.org/entity/Q40550615">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40334895">SARS coronavirus nucleocapsid immunodominant T-cell epitope cluster is common to both exogenous recombinant and endogenous DNA-encoded immunogens.</a> (<a href="http://www.wikidata.org/entity/Q40334895">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43846969">SARS coronavirus nucleocapsid protein monoclonal antibodies developed using a prokaryotic expressed protein.</a> (<a href="http://www.wikidata.org/entity/Q43846969">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36897535">SARS coronavirus papain-like protease induces Egr-1-dependent up-regulation of TGF-β1 via ROS/p38 MAPK/STAT3 pathway.</a> (<a href="http://www.wikidata.org/entity/Q36897535">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40240541">SARS coronavirus papain-like protease up-regulates the collagen expression through non-Samd TGF-β1 signaling.</a> (<a href="http://www.wikidata.org/entity/Q40240541">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38008817">SARS coronavirus pathogenesis: host innate immune responses and viral antagonism of interferon.</a> (<a href="http://www.wikidata.org/entity/Q38008817">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47770712">SARS coronavirus spike polypeptide DNA vaccine priming with recombinant spike polypeptide from Escherichia coli as booster induces high titer of neutralizing antibody against SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47770712">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42208818">SARS coronavirus without reservoir originated from an unnatural evolution, experienced the reverse evolution, and finally disappeared in the world.</a> (<a href="http://www.wikidata.org/entity/Q42208818">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35143451">SARS coronavirus: a new challenge for prevention and therapy.</a> (<a href="http://www.wikidata.org/entity/Q35143451">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54431239">SARS diagnosis, monitoring and prognostication by SARS-coronavirus RNA detection.</a> (<a href="http://www.wikidata.org/entity/Q54431239">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45722705">SARS genome chip available to scientists: the NIAID hopes that widespread access to the SARS genome chip will catalyse research into effective treatments for the virus.</a> (<a href="http://www.wikidata.org/entity/Q45722705">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51245746">SARS patients-derived human recombinant antibodies to S and M proteins efficiently neutralize SARS-coronavirus infectivity.</a> (<a href="http://www.wikidata.org/entity/Q51245746">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24794472">SARS transmission pattern in Singapore reassessed by viral sequence variation analysis</a> (<a href="http://www.wikidata.org/entity/Q24794472">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45395971">SARS vaccine based on a replication-defective recombinant vesicular stomatitis virus is more potent than one based on a replication-competent vector.</a> (<a href="http://www.wikidata.org/entity/Q45395971">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45329900">SARS veterans tackle coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q45329900">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47928330">SARS viral RNA.</a> (<a href="http://www.wikidata.org/entity/Q47928330">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42782826">SARS virus identified, but the disease is still spreading.</a> (<a href="http://www.wikidata.org/entity/Q42782826">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45603880">SARS virus in tears?</a> (<a href="http://www.wikidata.org/entity/Q45603880">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43240810">SARS virus returns to China as scientists race to find effective vaccine.</a> (<a href="http://www.wikidata.org/entity/Q43240810">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35590216">SARS virus: the beginning of the unraveling of a new coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q35590216">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35701656">SARS--beginning to understand a new virus.</a> (<a href="http://www.wikidata.org/entity/Q35701656">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34099569">SARS-CoV 3CLpro inhibitory effects of quinone-methide triterpenes from Tripterygium regelii.</a> (<a href="http://www.wikidata.org/entity/Q34099569">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30355948">SARS-CoV ORF1b-encoded nonstructural proteins 12-16: replicative enzymes as antiviral targets.</a> (<a href="http://www.wikidata.org/entity/Q30355948">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40795560">SARS-CoV and IFN: Too Little, Too Late.</a> (<a href="http://www.wikidata.org/entity/Q40795560">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35612506">SARS-CoV and emergent coronaviruses: viral determinants of  interspecies transmission.</a> (<a href="http://www.wikidata.org/entity/Q35612506">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35872928">SARS-CoV antibody prevalence in all Hong Kong patient contacts</a> (<a href="http://www.wikidata.org/entity/Q35872928">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39520199">SARS-CoV genome polymorphism: a bioinformatics study</a> (<a href="http://www.wikidata.org/entity/Q39520199">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42583686">SARS-CoV heptad repeat 2 is a trimer of parallel helices.</a> (<a href="http://www.wikidata.org/entity/Q42583686">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36009490">SARS-CoV infection in a restaurant from palm civet.</a> (<a href="http://www.wikidata.org/entity/Q36009490">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47820144">SARS-CoV infection was from at least two origins in the Taiwan area.</a> (<a href="http://www.wikidata.org/entity/Q47820144">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40142115">SARS-CoV nucleocapsid protein induced apoptosis of COS-1 mediated by the mitochondrial pathway.</a> (<a href="http://www.wikidata.org/entity/Q40142115">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33553351">SARS-CoV pathogenesis is regulated by a STAT1 dependent but a type I, II and III interferon receptor independent mechanism.</a> (<a href="http://www.wikidata.org/entity/Q33553351">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33211511">SARS-CoV protease inhibitors design using virtual screening method from natural products libraries.</a> (<a href="http://www.wikidata.org/entity/Q33211511">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36144565">SARS-CoV regulates immune function-related gene expression in human monocytic cells.</a> (<a href="http://www.wikidata.org/entity/Q36144565">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54266287">SARS-CoV related Betacoronavirus and diverse Alphacoronavirus members found in western old-world.</a> (<a href="http://www.wikidata.org/entity/Q54266287">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36559927">SARS-CoV replicates in primary human alveolar type II cell cultures but not in type I-like cells.</a> (<a href="http://www.wikidata.org/entity/Q36559927">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36658291">SARS-CoV replication and pathogenesis in an in vitro model of the human conducting airway epithelium</a> (<a href="http://www.wikidata.org/entity/Q36658291">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42601535">SARS-CoV sampling from 3 portals.</a> (<a href="http://www.wikidata.org/entity/Q42601535">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45411636">SARS-CoV spike protein-expressing recombinant vaccinia virus efficiently induces neutralizing antibodies in rabbits pre-immunized with vaccinia virus.</a> (<a href="http://www.wikidata.org/entity/Q45411636">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45386628">SARS-CoV spike proteins expressed by the vaccinia virus Tiantan strain: secreted sq protein induces robust neutralization antibody in mice.</a> (<a href="http://www.wikidata.org/entity/Q45386628">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35834692">SARS-CoV virus-host interactions and comparative etiologies of acute respiratory distress syndrome as determined by transcriptional and cytokine profiling of formalin-fixed paraffin-embedded tissues.</a> (<a href="http://www.wikidata.org/entity/Q35834692">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40220808">SARS-CoV, but not HCoV-NL63, utilizes cathepsins to infect cells: viral entry.</a> (<a href="http://www.wikidata.org/entity/Q40220808">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38952916">SARS-CoV-Encoded Small RNAs Contribute to Infection-Associated Lung Pathology.</a> (<a href="http://www.wikidata.org/entity/Q38952916">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27487847">SARS-CoV: Lessons for global health</a> (<a href="http://www.wikidata.org/entity/Q27487847">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34201009">SARS-Coronavirus ancestor's foot-prints in South-East Asian bat colonies and the refuge theory.</a> (<a href="http://www.wikidata.org/entity/Q34201009">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42551843">SARS-associated coronavirus infection in teenagers.</a> (<a href="http://www.wikidata.org/entity/Q42551843">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47879765">SARS-associated coronavirus quasispecies in individual patients.</a> (<a href="http://www.wikidata.org/entity/Q47879765">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40312974">SARS-associated coronavirus replication in cell lines.</a> (<a href="http://www.wikidata.org/entity/Q40312974">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35879716">SARS-associated coronavirus transmission, United States</a> (<a href="http://www.wikidata.org/entity/Q35879716">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35817319">SARS-associated coronavirus transmitted from human to pig</a> (<a href="http://www.wikidata.org/entity/Q35817319">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51673467">SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q51673467">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34295383">SARS-associated viral hepatitis caused by a novel coronavirus: report of three cases.</a> (<a href="http://www.wikidata.org/entity/Q34295383">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47785305">SARS-coronavirus (SARS-CoV) and the safety of a solvent/detergent (S/D) treated immunoglobulin preparation.</a> (<a href="http://www.wikidata.org/entity/Q47785305">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44282005">SARS-coronavirus modulation of myocardial ACE2 expression and inflammation in patients with SARS.</a> (<a href="http://www.wikidata.org/entity/Q44282005">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51651149">SARS-coronavirus replicates in mononuclear cells of peripheral blood (PBMCs) from SARS patients.</a> (<a href="http://www.wikidata.org/entity/Q51651149">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33209364">SARS-coronavirus replication in human peripheral monocytes/macrophages.</a> (<a href="http://www.wikidata.org/entity/Q33209364">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33331393">SARS-coronavirus replication/transcription complexes are membrane-protected and need a host factor for activity in vitro</a> (<a href="http://www.wikidata.org/entity/Q33331393">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36676297">SARS-coronavirus spike S2 domain flanked by cysteine residues C822 and C833 is important for activation of membrane fusion.</a> (<a href="http://www.wikidata.org/entity/Q36676297">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42771683">SARS-like virus in the Middle East: a truly bat-related coronavirus causing human diseases</a> (<a href="http://www.wikidata.org/entity/Q42771683">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45350101">SARS-like virus reignites ownership feuds.</a> (<a href="http://www.wikidata.org/entity/Q45350101">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35879678">SARS-related virus predating SARS outbreak, Hong Kong</a> (<a href="http://www.wikidata.org/entity/Q35879678">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40173036">SARS-unique fold in the Rousettus bat coronavirus HKU9.</a> (<a href="http://www.wikidata.org/entity/Q40173036">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48020363">SARS: an amalgam of avian and mammalian viruses?</a> (<a href="http://www.wikidata.org/entity/Q48020363">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35689779">SARS: clinical virology and pathogenesis.</a> (<a href="http://www.wikidata.org/entity/Q35689779">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51661380">SARS: just another viral acronym?</a> (<a href="http://www.wikidata.org/entity/Q51661380">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35633811">SARS: lessons learned from other coronaviruses.</a> (<a href="http://www.wikidata.org/entity/Q35633811">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35835938">SARS: responding to an unknown virus.</a> (<a href="http://www.wikidata.org/entity/Q35835938">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42940871">SARS: understanding the coronavirus: accuracy of WHO criteria was similar in a "non-SARS" hospital in Singapore.</a> (<a href="http://www.wikidata.org/entity/Q42940871">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42940875">SARS: understanding the coronavirus: apoptosis may explain lymphopenia of SARS.</a> (<a href="http://www.wikidata.org/entity/Q42940875">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36321029">SARS: understanding the virus and development of rational therapy.</a> (<a href="http://www.wikidata.org/entity/Q36321029">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33223061">Screening and identification of linear B-cell epitopes and entry-blocking peptide of severe acute respiratory syndrome (SARS)-associated coronavirus using synthetic overlapping peptide library.</a> (<a href="http://www.wikidata.org/entity/Q33223061">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46540496">Screening of drugs by FRET analysis identifies inhibitors of SARS-CoV 3CL protease.</a> (<a href="http://www.wikidata.org/entity/Q46540496">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46745409">Screening of electrophilic compounds yields an aziridinyl peptide as new active-site directed SARS-CoV main protease inhibitor.</a> (<a href="http://www.wikidata.org/entity/Q46745409">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37090141">Searching immunodominant epitopes prior to epidemic: HLA class II-restricted SARS-CoV spike protein epitopes in unexposed individuals.</a> (<a href="http://www.wikidata.org/entity/Q37090141">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33261049">Selection of SARS-coronavirus-specific B cell epitopes by phage peptide library screening and evaluation of the immunological effect of epitope-based peptides on mice.</a> (<a href="http://www.wikidata.org/entity/Q33261049">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41857864">Self-assembly of a nine-residue amyloid-forming peptide fragment of SARS corona virus E-protein: mechanism of self aggregation and amyloid-inhibition of hIAPP.</a> (<a href="http://www.wikidata.org/entity/Q41857864">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33223139">Sensitive detection of SARS coronavirus RNA by a novel asymmetric multiplex nested RT-PCR amplification coupled with oligonucleotide microarray hybridization.</a> (<a href="http://www.wikidata.org/entity/Q33223139">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38229070">Sensitivity of SARS/MERS CoV to interferons and other drugs based on achievable serum concentrations in humans.</a> (<a href="http://www.wikidata.org/entity/Q38229070">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37183982">Sequential affinity purification of peroxidase tagged bispecific anti-SARS-CoV antibodies on phenylboronic acid agarose</a> (<a href="http://www.wikidata.org/entity/Q37183982">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51642382">Serial analysis of the plasma concentration of SARS coronavirus RNA in pediatric patients with severe acute respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q51642382">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39523034">Seroepidemiological Study on SARS-CoV IgG Antibodies of Different Populations from Several Areas</a> (<a href="http://www.wikidata.org/entity/Q39523034">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42551834">Serologic and molecular biologic methods for SARS-associated coronavirus infection, Taiwan.</a> (<a href="http://www.wikidata.org/entity/Q42551834">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q52676248">Serological Evidence of Bat SARS-Related Coronavirus Infection in Humans, China.</a> (<a href="http://www.wikidata.org/entity/Q52676248">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45165942">Seroprevalence of SARS Coronavirus Among Residents Near a Hospital with a Nosocomial Outbreak.</a> (<a href="http://www.wikidata.org/entity/Q45165942">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47695322">Seroprevalence of SARS coronavirus antibody in household contacts.</a> (<a href="http://www.wikidata.org/entity/Q47695322">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44299921">Seroprevalence of antibody to severe acute respiratory syndrome (SARS)-associated coronavirus among health care workers in SARS and non-SARS medical wards.</a> (<a href="http://www.wikidata.org/entity/Q44299921">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41055288">Severe Acute Respiratory Syndrome (SARS) Coronavirus ORF8 Protein Is Acquired from SARS-Related Coronavirus from Greater Horseshoe Bats through Recombination</a> (<a href="http://www.wikidata.org/entity/Q41055288">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47951837">Severe Acute Respiratory Syndrome (SARS) and the GDP. Part I : Epidemiology, virology, pathology and general health issues.</a> (<a href="http://www.wikidata.org/entity/Q47951837">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51675014">Severe acute respiratory syndrome (SARS) and coronavirus testing--United States, 2003.</a> (<a href="http://www.wikidata.org/entity/Q51675014">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37127923">Severe acute respiratory syndrome (SARS) coronavirus-induced lung epithelial cytokines exacerbate SARS pathogenesis by modulating intrinsic functions of monocyte-derived macrophages and dendritic cells</a> (<a href="http://www.wikidata.org/entity/Q37127923">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30361296">Severe acute respiratory syndrome (SARS) coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q30361296">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36414621">Severe acute respiratory syndrome (SARS) coronavirus: application of monoclonal antibodies and development of an effective vaccine.</a> (<a href="http://www.wikidata.org/entity/Q36414621">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42239828">Severe acute respiratory syndrome (SARS) coronavirus: possible re-emergence of the Asian-global novel threat.</a> (<a href="http://www.wikidata.org/entity/Q42239828">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35607877">Severe acute respiratory syndrome (SARS)--paradigm of an emerging viral infection.</a> (<a href="http://www.wikidata.org/entity/Q35607877">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35150843">Severe acute respiratory syndrome (SARS): an old virus jumping into a new host or a new creation?</a> (<a href="http://www.wikidata.org/entity/Q35150843">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33248093">Severe acute respiratory syndrome (SARS): development of diagnostics and antivirals.</a> (<a href="http://www.wikidata.org/entity/Q33248093">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34376025">Severe acute respiratory syndrome coronavirus (SARS-CoV) infection inhibition using spike protein heptad repeat-derived peptides.</a> (<a href="http://www.wikidata.org/entity/Q34376025">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q86973813">Severe acute respiratory syndrome-related coronavirus: The species and its viruses – a statement of the Coronavirus Study Group</a> (<a href="http://www.wikidata.org/entity/Q86973813">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36807258">Signal transduction in SARS-CoV-infected cells.</a> (<a href="http://www.wikidata.org/entity/Q36807258">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40585048">Silencing SARS-CoV Spike protein expression in cultured cells by RNA interference.</a> (<a href="http://www.wikidata.org/entity/Q40585048">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40500164">Silencing of SARS-CoV spike gene by small interfering RNA in HEK 293T cells.</a> (<a href="http://www.wikidata.org/entity/Q40500164">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44259089">Simultaneous detection of SARS coronavirus and influenza A viruses using real-time polymerase chain reaction.</a> (<a href="http://www.wikidata.org/entity/Q44259089">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34478750">Single-dose intranasal administration with mDEF201 (adenovirus vectored mouse interferon-alpha) confers protection from mortality in a lethal SARS-CoV BALB/c mouse model</a> (<a href="http://www.wikidata.org/entity/Q34478750">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43872848">Small interfering RNA effectively inhibits the expression of SARS coronavirus membrane gene at two novel targeting sites.</a> (<a href="http://www.wikidata.org/entity/Q43872848">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40431482">Small interfering RNA inhibits SARS-CoV nucleocapsid gene expression in cultured cells and mouse muscles.</a> (<a href="http://www.wikidata.org/entity/Q40431482">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34473027">Solution structure of the X4 protein coded by the SARS related coronavirus reveals an immunoglobulin like fold and suggests a binding activity to integrin I domains.</a> (<a href="http://www.wikidata.org/entity/Q34473027">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44434982">Stability and inactivation of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q44434982">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40614670">Stability of SARS coronavirus in human specimens and environment and its sensitivity to heating and UV irradiation.</a> (<a href="http://www.wikidata.org/entity/Q40614670">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45411196">Stem-loop 1 in the 5' UTR of the SARS coronavirus can substitute for its counterpart in mouse hepatitis virus.</a> (<a href="http://www.wikidata.org/entity/Q45411196">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43413684">Structural analysis of inhibition mechanisms of aurintricarboxylic acid on SARS-CoV polymerase and other proteins.</a> (<a href="http://www.wikidata.org/entity/Q43413684">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39444016">Structural and biochemical basis for the difference in the helicase activity of two different constructs of SARS-CoV helicase.</a> (<a href="http://www.wikidata.org/entity/Q39444016">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30851115">Structural and biochemical investigation of heptad repeat derived peptides of human SARS corona virus (hSARS-CoV) spike protein.</a> (<a href="http://www.wikidata.org/entity/Q30851115">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43808921">Structural and dynamic characterization of the interaction of the putative fusion peptide of the S2 SARS-CoV virus protein with lipid membranes.</a> (<a href="http://www.wikidata.org/entity/Q43808921">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47726856">Structural biology. Adaptation of SARS coronavirus to humans.</a> (<a href="http://www.wikidata.org/entity/Q47726856">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36303186">Structural insights into SARS coronavirus proteins.</a> (<a href="http://www.wikidata.org/entity/Q36303186">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45326251">Structural insights of a self-assembling 9-residue peptide from the C-terminal tail of the SARS corona virus E-protein in DPC and SDS micelles: A combined high and low resolution spectroscopic study.</a> (<a href="http://www.wikidata.org/entity/Q45326251">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44050468">Structural organization of the genome of SARS-associated coronavirus (Strain SoD) isolated on the territory of the Russian Federation.</a> (<a href="http://www.wikidata.org/entity/Q44050468">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30229462">Structural proteomics of the SARS coronavirus: a model response to emerging infectious diseases.</a> (<a href="http://www.wikidata.org/entity/Q30229462">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42181496">Structure based computational assessment of channel properties of assembled ORF-8a from SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q42181496">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24809628">Structure of a Conserved RNA Element in the SARS Virus Genome Determined</a> (<a href="http://www.wikidata.org/entity/Q24809628">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27650782">Structure of a SARS coronavirus-derived peptide bound to the human major histocompatibility complex class I molecule HLA-B*1501</a> (<a href="http://www.wikidata.org/entity/Q27650782">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27648126">Structure-based design, synthesis, and biological evaluation of peptidomimetic SARS-CoV 3CLpro inhibitors</a> (<a href="http://www.wikidata.org/entity/Q27648126">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47859862">Structure-based preliminary analysis of immunity and virulence of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47859862">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46700264">Structure-based virtual screening against SARS-3CL(pro) to identify novel non-peptidic hits.</a> (<a href="http://www.wikidata.org/entity/Q46700264">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45284085">Studies explore impact of new pathogens: investigators report on metapneumovirus, SARS.</a> (<a href="http://www.wikidata.org/entity/Q45284085">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37245644">Studies of SARS virus vaccines.</a> (<a href="http://www.wikidata.org/entity/Q37245644">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28257843">Study on interaction between SARS-CoV N and MAP19</a> (<a href="http://www.wikidata.org/entity/Q28257843">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36373305">Sublingual immunization with recombinant adenovirus encoding SARS-CoV spike protein induces systemic and mucosal immunity without redirection of the virus to the brain.</a> (<a href="http://www.wikidata.org/entity/Q36373305">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33897964">Substitution at aspartic acid 1128 in the SARS coronavirus spike glycoprotein mediates escape from a S2 domain-targeting neutralizing monoclonal antibody</a> (<a href="http://www.wikidata.org/entity/Q33897964">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42187771">Substrate specificity and rational design of peptidomimetic inhibitors for SARS coronavirus main protease.</a> (<a href="http://www.wikidata.org/entity/Q42187771">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27646521">Substrate specificity profiling and identification of a new class of inhibitor for the major protease of the SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q27646521">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40548165">Suppression of SARS-CoV entry by peptides corresponding to heptad regions on spike glycoprotein.</a> (<a href="http://www.wikidata.org/entity/Q40548165">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46821394">Surface ultrastructure of SARS coronavirus revealed by atomic force microscopy.</a> (<a href="http://www.wikidata.org/entity/Q46821394">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36493632">Surface vimentin is critical for the cell entry of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q36493632">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40472664">Susceptibility of different eukaryotic cell lines to SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40472664">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40403045">Susceptibility of human and rat neural cell lines to infection by SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40403045">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35879698">Susceptibility of pigs and chickens to SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q35879698">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40546105">Susceptibility to SARS coronavirus S protein-driven infection correlates with expression of angiotensin converting enzyme 2 and infection can be blocked by soluble receptor.</a> (<a href="http://www.wikidata.org/entity/Q40546105">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46175978">Symptoms of infection caused by SARS coronavirus in laboratory mice and guinea pigs.</a> (<a href="http://www.wikidata.org/entity/Q46175978">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40220756">Synergistic inhibition of SARS-coronavirus replication by type I and type II IFN.</a> (<a href="http://www.wikidata.org/entity/Q40220756">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34780031">Synergistic inhibitor binding to the papain-like protease of human SARS coronavirus: mechanistic and inhibitor design implications.</a> (<a href="http://www.wikidata.org/entity/Q34780031">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34461791">Synthesis and activity of an octapeptide inhibitor designed for SARS coronavirus main proteinase.</a> (<a href="http://www.wikidata.org/entity/Q34461791">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39402975">Synthesis and antiviral evaluation of 7-O-arylmethylquercetin derivatives against SARS-associated coronavirus (SCV) and hepatitis C virus (HCV).</a> (<a href="http://www.wikidata.org/entity/Q39402975">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50573887">Synthesis and biological evaluation of nucleoside analogues having 6-chloropurine as anti-SARS-CoV agents.</a> (<a href="http://www.wikidata.org/entity/Q50573887">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46493211">Synthesis and evaluation of isatin derivatives as effective SARS coronavirus 3CL protease inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q46493211">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40222710">Synthesis and evaluation of phenylisoserine derivatives for the SARS-CoV 3CL protease inhibitor.</a> (<a href="http://www.wikidata.org/entity/Q40222710">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42858751">Synthesis and evaluation of pyrazolone compounds as SARS-coronavirus 3C-like protease inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q42858751">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46922553">Synthesis of cyclopentenyl carbocyclic nucleosides as potential antiviral agents against orthopoxviruses and SARS.</a> (<a href="http://www.wikidata.org/entity/Q46922553">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36230308">Synthesis of novel test compounds for antiviral chemotherapy of severe acute respiratory syndrome (SARS).</a> (<a href="http://www.wikidata.org/entity/Q36230308">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44192110">Synthesis of stilbene derivatives with inhibition of SARS coronavirus replication.</a> (<a href="http://www.wikidata.org/entity/Q44192110">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40248866">Synthesis, crystal structure, structure-activity relationships, and antiviral activity of a potent SARS coronavirus 3CL protease inhibitor.</a> (<a href="http://www.wikidata.org/entity/Q40248866">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43056416">Synthesis, docking studies, and evaluation of pyrimidines as inhibitors of SARS-CoV 3CL protease.</a> (<a href="http://www.wikidata.org/entity/Q43056416">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42250412">Synthesis, modification and docking studies of 5-sulfonyl isatin derivatives as SARS-CoV 3C-like protease inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q42250412">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40522221">Synthetic peptide studies on the severe acute respiratory syndrome (SARS) coronavirus spike glycoprotein: perspective for SARS vaccine development.</a> (<a href="http://www.wikidata.org/entity/Q40522221">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39843759">Synthetic peptides coupled to the surface of liposomes effectively induce SARS coronavirus-specific cytotoxic T lymphocytes and viral clearance in HLA-A*0201 transgenic mice.</a> (<a href="http://www.wikidata.org/entity/Q39843759">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47820331">Synthetic peptides derived from SARS coronavirus S protein with diagnostic and therapeutic potential.</a> (<a href="http://www.wikidata.org/entity/Q47820331">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40416852">Synthetic peptides outside the spike protein heptad repeat regions as potent inhibitors of SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40416852">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36986417">Synthetic recombinant bat SARS-like coronavirus is infectious in cultured cells and in mice.</a> (<a href="http://www.wikidata.org/entity/Q36986417">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37195604">T cell responses to whole SARS coronavirus in humans.</a> (<a href="http://www.wikidata.org/entity/Q37195604">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46705027">T-Cell response profiling to biological threat agents including the SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q46705027">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34151667">T-cell epitopes in severe acute respiratory syndrome (SARS) coronavirus spike protein elicit a specific T-cell immune response in patients who recover from SARS.</a> (<a href="http://www.wikidata.org/entity/Q34151667">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30241347">T-cell immunity of SARS-CoV: Implications for vaccine development against MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q30241347">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39765671">TACE antagonists blocking ACE2 shedding caused by the spike protein of SARS-CoV are candidate antiviral compounds.</a> (<a href="http://www.wikidata.org/entity/Q39765671">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48027497">TNF-alpha inhibition for potential therapeutic modulation of SARS coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q48027497">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43007725">Tears and conjunctival scrapings for coronavirus in patients with SARS.</a> (<a href="http://www.wikidata.org/entity/Q43007725">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51807755">Template-based coiled-coil antigens elicit neutralizing antibodies to the SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q51807755">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37105501">Ten years after SARS: where was the virus from?</a> (<a href="http://www.wikidata.org/entity/Q37105501">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44024786">Tertiary structure prediction of SARS coronavirus helicase.</a> (<a href="http://www.wikidata.org/entity/Q44024786">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47913010">Testing the hypothesis of a recombinant origin of the SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47913010">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37519584">The C-terminal portion of the nucleocapsid protein demonstrates SARS-CoV antigenicity.</a> (<a href="http://www.wikidata.org/entity/Q37519584">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34152584">The Effects of Temperature and Relative Humidity on the Viability of the SARS Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q34152584">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42258323">The H7N9 influenza virus in China--changes since SARS.</a> (<a href="http://www.wikidata.org/entity/Q42258323">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37519394">The R protein of SARS-CoV: analyses of structure and function based on four complete genome sequences of isolates BJ01-BJ04</a> (<a href="http://www.wikidata.org/entity/Q37519394">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34313436">The SARS coronavirus E protein interacts with PALS1 and alters tight junction formation and epithelial morphogenesis.</a> (<a href="http://www.wikidata.org/entity/Q34313436">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46980977">The SARS coronavirus E protein interacts with the PALS1 and alters tight junction formation and epithelial morphogenesis.</a> (<a href="http://www.wikidata.org/entity/Q46980977">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30357836">The SARS coronavirus nucleocapsid protein--forms and functions.</a> (<a href="http://www.wikidata.org/entity/Q30357836">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44648859">The SARS coronavirus: rapid diagnostics in the limelight.</a> (<a href="http://www.wikidata.org/entity/Q44648859">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39370292">The SARS-CoV ferret model in an infection-challenge study.</a> (<a href="http://www.wikidata.org/entity/Q39370292">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44029736">The SARS-CoV heptad repeat 2 exhibits pH-induced helix formation.</a> (<a href="http://www.wikidata.org/entity/Q44029736">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37989413">The SARS-like coronaviruses: the role of bats and evolutionary relationships with SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q37989413">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45385295">The SR-rich motif in SARS-CoV nucleocapsid protein is important for virus replication.</a> (<a href="http://www.wikidata.org/entity/Q45385295">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24792382">The Severe Acute Respiratory Syndrome (SARS)-coronavirus 3a protein may function as a modulator of the trafficking properties of the spike protein</a> (<a href="http://www.wikidata.org/entity/Q24792382">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46409785">The adamantane-derived bananins are potent inhibitors of the helicase activities and replication of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q46409785">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43289583">The antiviral action of common household disinfectants and antiseptics against murine hepatitis virus, a potential surrogate for SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q43289583">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47624938">The antiviral effect of interferon-beta against SARS-coronavirus is not mediated by MxA protein.</a> (<a href="http://www.wikidata.org/entity/Q47624938">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47792543">The design and application of DNA chips for early detection of SARS-CoV from clinical samples.</a> (<a href="http://www.wikidata.org/entity/Q47792543">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45501918">The development of vaccines against SARS corona virus in mice and SCID-PBL/hu mice.</a> (<a href="http://www.wikidata.org/entity/Q45501918">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45423412">The dimer interface of the SARS coronavirus nucleocapsid protein adapts a porcine respiratory and reproductive syndrome virus-like structure.</a> (<a href="http://www.wikidata.org/entity/Q45423412">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33348829">The effect of SARS coronavirus on blood system: its clinical findings and the pathophysiologic hypothesis.</a> (<a href="http://www.wikidata.org/entity/Q33348829">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36143370">The effect of inhibition of PP1 and TNFα signaling on pathogenesis of SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q36143370">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39515561">The epitope study on the SARS-CoV nucleocapsid protein.</a> (<a href="http://www.wikidata.org/entity/Q39515561">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47910731">The expression of SARS-CoV M gene in P. Pastoris and the diagnostic utility of the expression product.</a> (<a href="http://www.wikidata.org/entity/Q47910731">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47653800">The expression of membrane protein augments the specific responses induced by SARS-CoV nucleocapsid DNA immunization.</a> (<a href="http://www.wikidata.org/entity/Q47653800">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30350087">The financial impact of controlling a respiratory virus outbreak in a teaching hospital: lessons learned from SARS.</a> (<a href="http://www.wikidata.org/entity/Q30350087">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51000400">The immune responses of HLA-A*0201 restricted SARS-CoV S peptide-specific CD8⁺ T cells are augmented in varying degrees by CpG ODN, PolyI:C and R848.</a> (<a href="http://www.wikidata.org/entity/Q51000400">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54437700">The immunity induced by recombinant spike proteins of SARS coronavirus in Balb/c mice.</a> (<a href="http://www.wikidata.org/entity/Q54437700">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33223190">The interaction of the SARS coronavirus non-structural protein 10 with the cellular oxido-reductase system causes an extensive cytopathic effect.</a> (<a href="http://www.wikidata.org/entity/Q33223190">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38436263">The large 386-nt deletion in SARS-associated coronavirus: evidence for quasispecies?</a> (<a href="http://www.wikidata.org/entity/Q38436263">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34012358">The management of coronavirus infections with particular reference to SARS.</a> (<a href="http://www.wikidata.org/entity/Q34012358">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36923117">The newly emerged SARS-like coronavirus HCoV-EMC also has an "Achilles' heel": current effective inhibitor targeting a 3C-like protease</a> (<a href="http://www.wikidata.org/entity/Q36923117">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40220937">The nsp2 proteins of mouse hepatitis virus and SARS coronavirus are dispensable for viral replication.</a> (<a href="http://www.wikidata.org/entity/Q40220937">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34010888">The nucleocapsid protein of SARS-CoV induces transcription of hfgl2 prothrombinase gene dependent on C/EBP alpha.</a> (<a href="http://www.wikidata.org/entity/Q34010888">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33977649">The nucleocapsid protein of the SARS coronavirus is capable of self-association through a C-terminal 209 amino acid interaction domain.</a> (<a href="http://www.wikidata.org/entity/Q33977649">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33389939">The phylogeny of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q33389939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37246874">The replication of a mouse adapted SARS-CoV in a mouse cell line stably expressing the murine SARS-CoV receptor mACE2 efficiently induces the expression of proinflammatory cytokines</a> (<a href="http://www.wikidata.org/entity/Q37246874">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30234893">The role of epidermal growth factor receptor (EGFR) signaling in SARS coronavirus-induced pulmonary fibrosis.</a> (<a href="http://www.wikidata.org/entity/Q30234893">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24605877">The role of severe acute respiratory syndrome (SARS)-coronavirus accessory proteins in virus pathogenesis</a> (<a href="http://www.wikidata.org/entity/Q24605877">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54435315">The route of inoculation determines the tissue tropism of modified vaccinia Tiantan expressing the spike glycoprotein of SARS-CoV in mice.</a> (<a href="http://www.wikidata.org/entity/Q54435315">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45704374">The secret life of ACE2 as a receptor for the SARS virus.</a> (<a href="http://www.wikidata.org/entity/Q45704374">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40568559">The severe acute respiratory syndrome (SARS) coronavirus NTPase/helicase belongs to a distinct class of 5' to 3' viral helicases.</a> (<a href="http://www.wikidata.org/entity/Q40568559">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87000965">The species Severe acute respiratory syndrome-related coronavirus: classifying 2019-nCoV and naming it SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87000965">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34015988">The spike protein of SARS-CoV--a target for vaccine and therapeutic development.</a> (<a href="http://www.wikidata.org/entity/Q34015988">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33207348">The spike protein of severe acute respiratory syndrome (SARS) is cleaved in virus infected Vero-E6 cells.</a> (<a href="http://www.wikidata.org/entity/Q33207348">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q31138256">The structural characterization and antigenicity of the S protein of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q31138256">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37519606">The structure analysis and antigenicity study of the N protein of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q37519606">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21092820">The structure of a rigorously conserved RNA element within the SARS virus genome</a> (<a href="http://www.wikidata.org/entity/Q21092820">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38133082">Therapeutic options for Middle East respiratory syndrome coronavirus (MERS-CoV)--possible lessons from a systematic review of SARS-CoV therapy.</a> (<a href="http://www.wikidata.org/entity/Q38133082">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37279490">Thermostability of the N-terminal RNA-binding domain of the SARS-CoV nucleocapsid protein: experiments and numerical simulations.</a> (<a href="http://www.wikidata.org/entity/Q37279490">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q25256694">Time course and cellular localization of SARS-CoV nucleoprotein and RNA in lungs from fatal cases of SARS.</a> (<a href="http://www.wikidata.org/entity/Q25256694">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33463837">Toll-like receptors, chemokine receptors and death receptor ligands responses in SARS coronavirus infected human monocyte derived dendritic cells.</a> (<a href="http://www.wikidata.org/entity/Q33463837">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47659639">Toona sinensis Roem tender leaf extract inhibits SARS coronavirus replication.</a> (<a href="http://www.wikidata.org/entity/Q47659639">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35895948">Topographic changes in SARS coronavirus-infected cells at late stages of infection</a> (<a href="http://www.wikidata.org/entity/Q35895948">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36886595">Towards our understanding of SARS-CoV, an emerging and devastating but quickly conquered virus.</a> (<a href="http://www.wikidata.org/entity/Q36886595">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42601419">Tracing SARS-coronavirus variant with large genomic deletion.</a> (<a href="http://www.wikidata.org/entity/Q42601419">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42274245">Tracing the SARS-coronavirus</a> (<a href="http://www.wikidata.org/entity/Q42274245">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40583852">Tracking the evolution of the SARS coronavirus using high-throughput, high-density resequencing arrays.</a> (<a href="http://www.wikidata.org/entity/Q40583852">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39703230">Traditional Chinese medicine herbal extracts of Cibotium barometz, Gentiana scabra, Dioscorea batatas, Cassia tora, and Taxillus chinensis inhibit SARS-CoV replication</a> (<a href="http://www.wikidata.org/entity/Q39703230">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40062163">Transcriptional profiling of Vero E6 cells over-expressing SARS-CoV S2 subunit: insights on viral regulation of apoptosis and proliferation.</a> (<a href="http://www.wikidata.org/entity/Q40062163">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34746639">Transient oligomerization of the SARS-CoV N protein--implication for virus ribonucleoprotein packaging.</a> (<a href="http://www.wikidata.org/entity/Q34746639">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30381743">Transmission of SARS and MERS coronaviruses and influenza virus in healthcare settings: the possible role of dry surface contamination.</a> (<a href="http://www.wikidata.org/entity/Q30381743">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38232337">Travel implications of emerging coronaviruses: SARS and MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q38232337">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30371617">Tryptophan-dependent membrane interaction and heteromerization with the internal fusion peptide by the membrane proximal external region of SARS-CoV spike protein.</a> (<a href="http://www.wikidata.org/entity/Q30371617">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40404194">Tumor necrosis factor-alpha convertase (ADAM17) mediates regulated ectodomain shedding of the severe-acute respiratory syndrome-coronavirus (SARS-CoV) receptor, angiotensin-converting enzyme-2 (ACE2).</a> (<a href="http://www.wikidata.org/entity/Q40404194">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46081236">Two strains of the SARS virus sequenced.</a> (<a href="http://www.wikidata.org/entity/Q46081236">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40110758">Two-amino acids change in the nsp4 of SARS coronavirus abolishes viral replication.</a> (<a href="http://www.wikidata.org/entity/Q40110758">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36315168">Two-way antigenic cross-reactivity between severe acute respiratory syndrome coronavirus (SARS-CoV) and group 1 animal CoVs is mediated through an antigenic site in the N-terminal region of the SARS-CoV nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q36315168">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42028266">Tyrosine dephosphorylation of STAT3 in SARS coronavirus-infected Vero E6 cells.</a> (<a href="http://www.wikidata.org/entity/Q42028266">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46930979">Ultrastructure of SARS-CoV, FIPV, and MHV revealed by electron cryomicroscopy.</a> (<a href="http://www.wikidata.org/entity/Q46930979">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38819802">Understanding bat SARS-like coronaviruses for the preparation of future coronavirus outbreaks - Implications for coronavirus vaccine development</a> (<a href="http://www.wikidata.org/entity/Q38819802">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36795319">Understanding the T cell immune response in SARS coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q36795319">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36701186">Unique SARS-CoV protein nsp1: bioinformatics, biochemistry and potential effects on virulence.</a> (<a href="http://www.wikidata.org/entity/Q36701186">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39932907">Unraveling the complexities of the interferon response during SARS-CoV infection</a> (<a href="http://www.wikidata.org/entity/Q39932907">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37783762">Update on SARS research and other possibly zoonotic coronaviruses.</a> (<a href="http://www.wikidata.org/entity/Q37783762">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54639922">Use of dual TaqMan probes to increase the sensitivity of 1-step quantitative reverse transcription-PCR: application to the detection of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q54639922">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42096754">Using patient-collected clinical samples and sera to detect and quantify the severe acute respiratory syndrome coronavirus (SARS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q42096754">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39362979">Using siRNA in prophylactic and therapeutic regimens against SARS coronavirus in Rhesus macaque.</a> (<a href="http://www.wikidata.org/entity/Q39362979">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35740733">Utility of the aged BALB/c mouse model to demonstrate prevention and control strategies for severe acute respiratory syndrome coronavirus (SARS-CoV)</a> (<a href="http://www.wikidata.org/entity/Q35740733">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40074291">Vaccination of mice with recombinant baculovirus expressing spike or nucleocapsid protein of SARS-like coronavirus generates humoral and cellular immune responses.</a> (<a href="http://www.wikidata.org/entity/Q40074291">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28764574">Vaccine efficacy in senescent mice challenged with recombinant SARS-CoV bearing epidemic and zoonotic spike variants</a> (<a href="http://www.wikidata.org/entity/Q28764574">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51656504">Viral aetiology of acute respiratory illnesses in patients with a suspicion of severe acute respiratory syndrome (SARS) in Switzerland.</a> (<a href="http://www.wikidata.org/entity/Q51656504">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q27477755">Viral evolution and the emergence of SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q27477755">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47650335">Viral load and outcome in SARS infection: the role of personal protective equipment in the emergency department.</a> (<a href="http://www.wikidata.org/entity/Q47650335">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36009476">Viral load distribution in SARS outbreak</a> (<a href="http://www.wikidata.org/entity/Q36009476">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47762677">Viral load quantitation of SARS-coronavirus RNA using a one-step real-time RT-PCR.</a> (<a href="http://www.wikidata.org/entity/Q47762677">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35872810">Viral loads in clinical specimens and SARS manifestations.</a> (<a href="http://www.wikidata.org/entity/Q35872810">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30352743">Viral pathogens and acute lung injury: investigations inspired by the SARS epidemic and the 2009 H1N1 influenza pandemic</a> (<a href="http://www.wikidata.org/entity/Q30352743">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43219269">Virology. Researchers tie deadly SARS virus to bats.</a> (<a href="http://www.wikidata.org/entity/Q43219269">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51671124">Virology. The SARS coronavirus: a postgenomic era.</a> (<a href="http://www.wikidata.org/entity/Q51671124">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45710579">Virology: SARS virus infection of cats and ferrets.</a> (<a href="http://www.wikidata.org/entity/Q45710579">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44904083">Virtual screening for SARS-CoV protease based on KZ7088 pharmacophore points.</a> (<a href="http://www.wikidata.org/entity/Q44904083">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51932839">Virtual screening for finding natural inhibitor against cathepsin-L for SARS therapy.</a> (<a href="http://www.wikidata.org/entity/Q51932839">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44843229">Virtual screening of novel noncovalent inhibitors for SARS-CoV 3C-like proteinase.</a> (<a href="http://www.wikidata.org/entity/Q44843229">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q39534646">Virucidal activity of a scorpion venom peptide variant mucroporin-M1 against measles, SARS-CoV and influenza H5N1 viruses.</a> (<a href="http://www.wikidata.org/entity/Q39534646">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37064804">Virus Infection and Titration of SARS-CoV in Mouse Lung.</a> (<a href="http://www.wikidata.org/entity/Q37064804">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45723410">Virus detectives seek source of SARS in China's wild animals.</a> (<a href="http://www.wikidata.org/entity/Q45723410">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40508393">Virus-associated hemophagocytic syndrome in an international traveler as a differential diagnosis of SARS.</a> (<a href="http://www.wikidata.org/entity/Q40508393">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33351949">Virus-like particles of SARS-like coronavirus formed by membrane proteins from different origins demonstrate stimulating activity in human dendritic cells.</a> (<a href="http://www.wikidata.org/entity/Q33351949">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35880751">Virus-specific RNA and antibody from convalescent-phase SARS patients discharged from hospital.</a> (<a href="http://www.wikidata.org/entity/Q35880751">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44653266">Vitamin C and SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q44653266">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30350124">When animal viruses attack: SARS and avian influenza.</a> (<a href="http://www.wikidata.org/entity/Q30350124">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46806250">Why are HIV-1 fusion inhibitors not effective against SARS-CoV? Biophysical evaluation of molecular interactions.</a> (<a href="http://www.wikidata.org/entity/Q46806250">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28478245">Yeast based small molecule screen for inhibitors of SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q28478245">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47761669">Yeast expression and characterization of SARS-CoV N protein.</a> (<a href="http://www.wikidata.org/entity/Q47761669">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30218075">Yeast-expressed recombinant protein of the receptor-binding domain in SARS-CoV spike protein with deglycosylated forms as a SARS vaccine candidate.</a> (<a href="http://www.wikidata.org/entity/Q30218075">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q52012642">ZCURVE_CoV: a new system to recognize protein coding genes in coronavirus genomes, and its applications in analyzing SARS-CoV genomes.</a> (<a href="http://www.wikidata.org/entity/Q52012642">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45235688">[A novel coronavirus---SARS virus].</a> (<a href="http://www.wikidata.org/entity/Q45235688">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40521365">[A preliminary report of SARS coronavirus specific RNA in SARS convalescents and medical person].</a> (<a href="http://www.wikidata.org/entity/Q40521365">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54480231">[A preliminary study of the structure prediction and expression of SARS-CoV spike protein].</a> (<a href="http://www.wikidata.org/entity/Q54480231">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q53640965">[A study of pulmonary inflammatory reaction induced by N-protein of SARS-CoV in rat models and effects of glucocorticoids on it].</a> (<a href="http://www.wikidata.org/entity/Q53640965">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54734143">[Amplification and cloning of the N gene of SARS-associated coronavirus].</a> (<a href="http://www.wikidata.org/entity/Q54734143">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54590849">[An epidemiological investigation of bats carrying SARS-CoV in Guangzhou and its vicinity].</a> (<a href="http://www.wikidata.org/entity/Q54590849">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40506472">[An immunofluorescence assay for the detection of SARS associated coronavirus antibody based on recombinant nucleocapsid antigen and its application].</a> (<a href="http://www.wikidata.org/entity/Q40506472">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54747465">[Analysis of false-positive associated with antibody tests for SARS-CoV in SLE patients].</a> (<a href="http://www.wikidata.org/entity/Q54747465">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33195529">[Analysis on the SARS-CoV genome of PUMC01 isolate].</a> (<a href="http://www.wikidata.org/entity/Q33195529">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54329727">[Antigenicity characterization of six different fragments of SARS-CoV N protein expressed in E. coli].</a> (<a href="http://www.wikidata.org/entity/Q54329727">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54772816">[Clinical detection of polymerase gene of SARS-associated coronavirus].</a> (<a href="http://www.wikidata.org/entity/Q54772816">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54633143">[Cloning of ACE-2 gene encoding the functional receptor for the SARS coronavirus and its expression in eukaryotic cells].</a> (<a href="http://www.wikidata.org/entity/Q54633143">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43428589">[Cloning, expression and purification of SARS coronavirus PUMC2 strain nucleocapsid protein].</a> (<a href="http://www.wikidata.org/entity/Q43428589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54475926">[Cloning, purification, and antigenic characterization of three recombinant fragments derived from SARS-CoV S1 domain].</a> (<a href="http://www.wikidata.org/entity/Q54475926">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40534318">[Comparative study of clinical characteristics and prognosis of clinically diagnosed SARS patients with positive and negative serum SARS coronavirus-specific antibodies test].</a> (<a href="http://www.wikidata.org/entity/Q40534318">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45145569">[Comparison of serum biochemical features between SARS and other viral pneumonias].</a> (<a href="http://www.wikidata.org/entity/Q45145569">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46607186">[Conditions for SARS-CoV cultivation and inactivation].</a> (<a href="http://www.wikidata.org/entity/Q46607186">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34887110">[Construction and screening of SARS-CoV S protein-specific phage displayed antigen library].</a> (<a href="http://www.wikidata.org/entity/Q34887110">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33210530">[Construction and screening of human phage antibody library against SARS virus].</a> (<a href="http://www.wikidata.org/entity/Q33210530">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33218272">[Construction of a large human scFv library against SARS virus].</a> (<a href="http://www.wikidata.org/entity/Q33218272">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q31112148">[Construction of phage antibody library for Fab fragment from a convalescent patient infected with SARS coronavirus].</a> (<a href="http://www.wikidata.org/entity/Q31112148">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40536744">[Detection for severe acute respiratory syndrome (SARS) coronavirus RNA in stool of SARS patients].</a> (<a href="http://www.wikidata.org/entity/Q40536744">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54622419">[Detection of SARS coronavirus RNA].</a> (<a href="http://www.wikidata.org/entity/Q54622419">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54761540">[Detection of SARS-CoV RNA in stool samples of SARS patients by nest RT-PCR and its clinical value].</a> (<a href="http://www.wikidata.org/entity/Q54761540">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43683524">[Detection of SARS-associated coronavirus N protein by time-resolved fluoroimmunoassay].</a> (<a href="http://www.wikidata.org/entity/Q43683524">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54635891">[Detection of SARS-coronavirus in both human and animals by RT-PCR].</a> (<a href="http://www.wikidata.org/entity/Q54635891">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44387754">[Detection of the anti-SARS-coronavirus specific antibody levels in 156 SARS patients].</a> (<a href="http://www.wikidata.org/entity/Q44387754">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54540918">[Detection of the mRNA expression of human angiotensin-converting enzyme 2 as a SARS coronavirus functional receptor in human femoral head].</a> (<a href="http://www.wikidata.org/entity/Q54540918">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48129091">[Determination of SARS-CoV by simplified nested fluorescent RT-PCR].</a> (<a href="http://www.wikidata.org/entity/Q48129091">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50653310">[Development and application of a safe SARS-CoV neutralization assay based on lentiviral vectors pseudotyped with SARS-CoV spike protein].</a> (<a href="http://www.wikidata.org/entity/Q50653310">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54482446">[Development of monoclonal antibodies against SARS-CoV and identification of antigenic epitopes].</a> (<a href="http://www.wikidata.org/entity/Q54482446">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51595651">[Development of the cDNA chip for SARS virus and a primary study on the possible molecular mechanism of interferon alpha2b inhibiting the SARS virus replication].</a> (<a href="http://www.wikidata.org/entity/Q51595651">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45145564">[Effect of SARS-associated coronavirus on peripheral blood picture and liver function].</a> (<a href="http://www.wikidata.org/entity/Q45145564">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54608377">[Enhanced-real time PCR: a highly sensitive method for SARS-coronavirus detection].</a> (<a href="http://www.wikidata.org/entity/Q54608377">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33227105">[Expression and renaturation of a novel human single-chain Fv antibody against SARS-CoV].</a> (<a href="http://www.wikidata.org/entity/Q33227105">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45306763">[Expression of SARS coronavirus nucleocapsid protein and construction of its DNA vaccine].</a> (<a href="http://www.wikidata.org/entity/Q45306763">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44149060">[Expression of SARS-CoV in various types of cells in lung tissues].</a> (<a href="http://www.wikidata.org/entity/Q44149060">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43486877">[Expression of predicted B cell epitope peptide in S2 subunit of SARS coronavirus spike protein in E.coli and identification of its mimic antigenicity].</a> (<a href="http://www.wikidata.org/entity/Q43486877">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46111287">[Expression, purification and antibody preparation of recombinat SARS-CoV X5 protein].</a> (<a href="http://www.wikidata.org/entity/Q46111287">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44691812">[Expression, purification and identification of recombinant SARS coronavirus membrane protein].</a> (<a href="http://www.wikidata.org/entity/Q44691812">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54594138">[Follow up study on viruses associated with SARS among the SARS patients].</a> (<a href="http://www.wikidata.org/entity/Q54594138">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q53850890">[Gene prediction and function research of SARS-CoV(BJ01)].</a> (<a href="http://www.wikidata.org/entity/Q53850890">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54772824">[Gene sequence analysis of SARS-associated coronavirus by nested RT-PCR].</a> (<a href="http://www.wikidata.org/entity/Q54772824">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44217465">[Genetic variation analysis of SARS coronavirus].</a> (<a href="http://www.wikidata.org/entity/Q44217465">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q50635287">[High-efficiency expression of a receptor-binding domain of SARS-CoV spike protein in tobacco chloroplasts].</a> (<a href="http://www.wikidata.org/entity/Q50635287">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40521847">[Human metapneumovirus pneumonia in an adult patient hospitalized for suspected severe acute respiratory syndrome (SARS)].</a> (<a href="http://www.wikidata.org/entity/Q40521847">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37868984">[Identification and molecular cloning and sequence analysis of a novel coronavirus from patients with SARS by RT-PCR].</a> (<a href="http://www.wikidata.org/entity/Q37868984">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33260210">[Identification of mimotope peptides which bind to the SARS-CoV spike protein specific monoclonal antibody 2C5 with phage-displayed peptides library].</a> (<a href="http://www.wikidata.org/entity/Q33260210">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45142356">[Initial analysis of complete genome sequences of SARS coronavirus].</a> (<a href="http://www.wikidata.org/entity/Q45142356">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44546399">[Modeling of the SARS coronavirus main proteinase and conformational flexibility of the active site].</a> (<a href="http://www.wikidata.org/entity/Q44546399">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48116779">[Modified molecular beacon-based dual real-time PCR for detection of SARS virus and its application].</a> (<a href="http://www.wikidata.org/entity/Q48116779">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44476488">[Optimization of expression condition of SARS-CoV PUPs genes in E. coli].</a> (<a href="http://www.wikidata.org/entity/Q44476488">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44793745">[Over-expression in Escherichia coli and purification of nucleocaspid and membrane protein of SARS coronavirus].</a> (<a href="http://www.wikidata.org/entity/Q44793745">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44269944">[Preparation of specific monoclonal antibody against nucleocapsid protein of SARS coronavirus].</a> (<a href="http://www.wikidata.org/entity/Q44269944">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33420250">[Prokaryotic expression of S2 extracellular domain of SARS coronavirus spike protein and its fusion with Hela cell membrane].</a> (<a href="http://www.wikidata.org/entity/Q33420250">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43779796">[Prokaryotic expression of SARS coronavirus spike protein and construction of its DNA vaccine].</a> (<a href="http://www.wikidata.org/entity/Q43779796">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54483891">[RNase III-prepared short interfering RNAs induce degradation of SARS-coronavirus mRNAs in human cells].</a> (<a href="http://www.wikidata.org/entity/Q54483891">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40545096">[Reliability of detecting SARS-CoV antibody for diagnosis of SARS].</a> (<a href="http://www.wikidata.org/entity/Q40545096">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48705891">[SARS coronavirus].</a> (<a href="http://www.wikidata.org/entity/Q48705891">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40418099">[SARS-CoV infection and pregnancy].</a> (<a href="http://www.wikidata.org/entity/Q40418099">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40541888">[SARS-associated coronavirus gene fragments were detected from a suspected pediatric SARS patient].</a> (<a href="http://www.wikidata.org/entity/Q40541888">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44123819">[SARS: a new paramyxovirus or coronavirus?].</a> (<a href="http://www.wikidata.org/entity/Q44123819">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43748712">[Serological analysis of SARS Coronavirus in children diagnosed clinically as severe acute respiratory syndrome cases during SARS epidemic in Beijing].</a> (<a href="http://www.wikidata.org/entity/Q43748712">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q46964715">[Some medical staff positive for serum SARS coronavirus antibody IgG have only mild symptoms].</a> (<a href="http://www.wikidata.org/entity/Q46964715">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54660292">[Study on the RNA of severe acute respiratory syndrome (SARS) associated coronavirus in the blood and excretion of convalescent patients with SARS].</a> (<a href="http://www.wikidata.org/entity/Q54660292">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42777442">[Study on the changing regularity of special antibody and expression of stomach and enteric involvement on SARS-coronavirus infection in the recovery period of severe acute respiratory syndrome].</a> (<a href="http://www.wikidata.org/entity/Q42777442">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44710267">[The biological characteristics of SARS virus and its related coronaviruses].</a> (<a href="http://www.wikidata.org/entity/Q44710267">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54504630">[The cloning, expression, purification and identification of SARS virus S2 gene and study on its immunological characteristics].</a> (<a href="http://www.wikidata.org/entity/Q54504630">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44944367">[The expression and activity detection of a variant N protein of SARS-CoV].</a> (<a href="http://www.wikidata.org/entity/Q44944367">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q52971718">[The genome comparison of SARS-CoV and other coronaviruses].</a> (<a href="http://www.wikidata.org/entity/Q52971718">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54466656">[Variability analysis of S2 gene of SARS-CoV].</a> (<a href="http://www.wikidata.org/entity/Q54466656">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40557006">[Why viral (SARS, Ebola and AIDS) epidemics now?].</a> (<a href="http://www.wikidata.org/entity/Q40557006">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q54740082">[cDNAs cloning of SARS-CoV PUMC2 viral genome].</a> (<a href="http://www.wikidata.org/entity/Q54740082">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45496781">siRNA targeting the leader sequence of SARS-CoV inhibits virus replication.</a> (<a href="http://www.wikidata.org/entity/Q45496781">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40115634">siRNAs targeting terminal sequences of the SARS-associated coronavirus membrane gene inhibit M protein expression through degradation of M mRNA.</a> (<a href="http://www.wikidata.org/entity/Q40115634">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33904997">A 219-mer CHO-expressing receptor-binding domain of SARS-CoV S protein induces potent immune responses and protective immunity</a> (<a href="http://www.wikidata.org/entity/Q33904997">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38553361">Bat-to-human: spike features determining 'host jump' of coronaviruses SARS-CoV, MERS-CoV, and beyond.</a> (<a href="http://www.wikidata.org/entity/Q38553361">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30845557">Cryo-EM structures of MERS-CoV and SARS-CoV spike glycoproteins reveal the dynamic receptor binding domains</a> (<a href="http://www.wikidata.org/entity/Q30845557">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47667741">Disulfiram can inhibit MERS and SARS coronavirus papain-like proteases via different modes.</a> (<a href="http://www.wikidata.org/entity/Q47667741">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36884852">Glycopeptide Antibiotics Potently Inhibit Cathepsin L in the Late Endosome/Lysosome and Block the Entry of Ebola Virus, Middle East Respiratory Syndrome Coronavirus (MERS-CoV), and Severe Acute Respiratory Syndrome Coronavirus (SARS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q36884852">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24600523">Human coronavirus EMC does not require the SARS-coronavirus receptor and maintains broad replicative capability in mammalian cell lines</a> (<a href="http://www.wikidata.org/entity/Q24600523">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40653601">Identification, synthesis and evaluation of SARS-CoV and MERS-CoV 3C-like protease inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q40653601">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q36835873">Inhibitor recognition specificity of MERS-CoV papain-like protease may differ from that of SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q36835873">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44961691">Medusa's ugly head again: from SARS to MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q44961691">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34468689">Middle East respiratory syndrome coronavirus: another zoonotic betacoronavirus causing SARS-like disease</a> (<a href="http://www.wikidata.org/entity/Q34468689">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q26787251">Middle East respiratory syndrome: SARS redux?</a> (<a href="http://www.wikidata.org/entity/Q26787251">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87945289">Novel coronavirus 2019-nCoV: prevalence, biological and clinical characteristics comparison with SARS-CoV and MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q87945289">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47413440">Nsp3 of coronaviruses: Structures and functions of a large multi-domain protein.</a> (<a href="http://www.wikidata.org/entity/Q47413440">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88182256">Potential Rapid Diagnostics, Vaccine and Therapeutics for 2019 Novel Coronavirus (2019-nCoV): A Systematic Review</a> (<a href="http://www.wikidata.org/entity/Q88182256">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30203307">Risks to healthcare workers with emerging diseases: lessons from MERS-CoV, Ebola, SARS, and avian flu.</a> (<a href="http://www.wikidata.org/entity/Q30203307">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38229070">Sensitivity of SARS/MERS CoV to interferons and other drugs based on achievable serum concentrations in humans.</a> (<a href="http://www.wikidata.org/entity/Q38229070">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30241347">T-cell immunity of SARS-CoV: Implications for vaccine development against MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q30241347">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q84316035">TMPRSS2 Contributes to Virus Spread and Immunopathology in the Airways of Murine Models after Coronavirus Infection</a> (<a href="http://www.wikidata.org/entity/Q84316035">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38133082">Therapeutic options for Middle East respiratory syndrome coronavirus (MERS-CoV)--possible lessons from a systematic review of SARS-CoV therapy.</a> (<a href="http://www.wikidata.org/entity/Q38133082">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Síndrome respiratória por coronavírus do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q38232337">Travel implications of emerging coronaviruses: SARS and MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q38232337">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87461686">A rapid advice guideline for the diagnosis and treatment of 2019 novel coronavirus (2019-nCoV) infected pneumonia (standard version)</a> (<a href="http://www.wikidata.org/entity/Q87461686">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87943251">Aerosol and Surface Stability of SARS-CoV-2 as Compared with SARS-CoV-1</a> (<a href="http://www.wikidata.org/entity/Q87943251">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87669932">Aerosol and surface stability of HCoV-19 (SARS-CoV-2) compared to SARS-CoV-1</a> (<a href="http://www.wikidata.org/entity/Q87669932">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90539057">Autopsy in suspected COVID-19 cases</a> (<a href="http://www.wikidata.org/entity/Q90539057">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q95628083">Broad sarbecovirus neutralizing antibodies define a key site of vulnerability on the SARS-CoV-2 spike protein</a> (<a href="http://www.wikidata.org/entity/Q95628083">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89916836">COVID-19 pneumonia: what has CT taught us?</a> (<a href="http://www.wikidata.org/entity/Q89916836">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87461550">Case of the Index Patient Who Caused Tertiary Transmission of COVID-19 Infection in Korea: the Application of Lopinavir/Ritonavir for the Treatment of COVID-19 Infected Pneumonia Monitored by Quantitative RT-PCR</a> (<a href="http://www.wikidata.org/entity/Q87461550">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q95600748">Comparative dynamic aerosol efficiencies of three emergent coronaviruses and the unusual persistence of SARS-CoV-2 in aerosol suspensions</a> (<a href="http://www.wikidata.org/entity/Q95600748">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96027644">Comparing the Binding Interactions in the Receptor Binding Domains of SARS-CoV-2 and SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q96027644">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91565585">Developing antibody tests for SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q91565585">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87461649">Emerging threats from zoonotic coronaviruses-from SARS and MERS to 2019-nCoV</a> (<a href="http://www.wikidata.org/entity/Q87461649">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90404371">Estimating the asymptomatic proportion of coronavirus disease 2019 (COVID-19) cases on board the Diamond Princess cruise ship, Yokohama, Japan, 2020</a> (<a href="http://www.wikidata.org/entity/Q90404371">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q95601210">Evolutionary origins of the SARS-CoV-2 sarbecovirus lineage responsible for the COVID-19 pandemic</a> (<a href="http://www.wikidata.org/entity/Q95601210">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97093636">Exaggerated risk of transmission of COVID-19 by fomites</a> (<a href="http://www.wikidata.org/entity/Q97093636">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88198219">From SARS and MERS CoVs to SARS‐CoV‐2: Moving toward more biased codon usage in viral structural and nonstructural genes</a> (<a href="http://www.wikidata.org/entity/Q88198219">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89866691">Functional assessment of cell entry and receptor usage for SARS-CoV-2 and other lineage B betacoronaviruses</a> (<a href="http://www.wikidata.org/entity/Q89866691">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87461399">High expression of ACE2 receptor of 2019-nCoV on the epithelial cells of oral mucosa</a> (<a href="http://www.wikidata.org/entity/Q87461399">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96232960">Immune Responses to SARS-CoV, MERS-CoV and SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q96232960">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90776980">Interaction between RAAS inhibitors and ACE2 in the context of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q90776980">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90010785">Mystery deepens over animal source of coronavirus</a> (<a href="http://www.wikidata.org/entity/Q90010785">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87945289">Novel coronavirus 2019-nCoV: prevalence, biological and clinical characteristics comparison with SARS-CoV and MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q87945289">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88182256">Potential Rapid Diagnostics, Vaccine and Therapeutics for 2019 Novel Coronavirus (2019-nCoV): A Systematic Review</a> (<a href="http://www.wikidata.org/entity/Q88182256">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96348222">Preparing for emerging respiratory pathogens such as SARS-CoV, MERS-CoV, and SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q96348222">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q93037598">Receptor Recognition by the Novel Coronavirus from Wuhan: an Analysis Based on Decade-Long Structural Studies of SARS Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q93037598">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90776995">Reply to: 'Interaction between RAAS inhibitors and ACE2 in the context of COVID-19'</a> (<a href="http://www.wikidata.org/entity/Q90776995">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96642659">Sarbecovirus comparative genomics elucidates gene content of SARS-CoV-2 and functional impact of COVID-19 pandemic mutations</a> (<a href="http://www.wikidata.org/entity/Q96642659">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96766478">Serologic cross-reactivity of SARS-CoV-2 with endemic and seasonal Betacoronaviruses</a> (<a href="http://www.wikidata.org/entity/Q96766478">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q86973813">Severe acute respiratory syndrome-related coronavirus: The species and its viruses – a statement of the Coronavirus Study Group</a> (<a href="http://www.wikidata.org/entity/Q86973813">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87830056">The proximal origin of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87830056">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87000965">The species Severe acute respiratory syndrome-related coronavirus: classifying 2019-nCoV and naming it SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87000965">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96119243">[Etiology of epidemic outbreaks COVID-19 on Wuhan, Hubei province, Chinese People Republic associated with 2019-nCoV (Nidovirales, Coronaviridae, Coronavirinae, Betacoronavirus, Subgenus Sarbecovirus): lessons of SARS-CoV outbreak.]</a> (<a href="http://www.wikidata.org/entity/Q96119243">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96221693">[Source of the COVID-19 pandemic: ecology and genetics of coronaviruses (Betacoronavirus: Coronaviridae) SARS-CoV, SARS-CoV-2 (subgenus Sarbecovirus), and MERS-CoV (subgenus Merbecovirus).]</a> (<a href="http://www.wikidata.org/entity/Q96221693">edit</a>)</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/compareViruses.rq | sed 's+<lang/>+pt+' > compareViruses.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@compareViruses.rq
```
This SPARQL query is available under CCZero.
