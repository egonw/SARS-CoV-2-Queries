# antibodies.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
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
  SERVICE wikibase:label { bd:serviceParam wikibase:language "nl,en". }
}
ORDER BY ?virusLabel ?virus ?workLabel ?work
```
[uitvoeren](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ79460%20.%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3Fvirus%20%3FworkLabel%20%3Fwork%0A) of [bewerken](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ79460%20.%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3Fvirus%20%3FworkLabel%20%3Fwork%0A)


### Resultaten
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>work</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40614291">Antibody to virus components in volunteers experimentally infected with human coronavirus 229E group viruses.</a> (<a href="http://www.wikidata.org/entity/Q40614291">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41288189">Detection of human coronavirus 229E-specific antibodies using recombinant fusion proteins.</a> (<a href="http://www.wikidata.org/entity/Q41288189">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
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
    <td><a href="https://scholia.toolforge.org/Q35063993">A truncated receptor-binding domain of MERS-CoV spike protein potently inhibits MERS-CoV infection and induces strong neutralizing antibody responses: implication for developing therapeutics and vaccines</a> (<a href="http://www.wikidata.org/entity/Q35063993">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30362113">Exceptionally potent neutralization of Middle East respiratory syndrome coronavirus by human monoclonal antibodies.</a> (<a href="http://www.wikidata.org/entity/Q30362113">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30358243">Middle East respiratory syndrome coronavirus antibody reactors among camels in Dubai, United Arab Emirates, in 2005.</a> (<a href="http://www.wikidata.org/entity/Q30358243">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35159147">Potent neutralization of MERS-CoV by human neutralizing monoclonal antibodies to the viral spike glycoprotein.</a> (<a href="http://www.wikidata.org/entity/Q35159147">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35865538">Pre- and postexposure efficacy of fully human antibodies against Spike protein in a novel humanized mouse model of MERS-CoV infection</a> (<a href="http://www.wikidata.org/entity/Q35865538">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41088356">Presence of Middle East respiratory syndrome coronavirus antibodies in Saudi Arabia: a nationwide, cross-sectional, serological study.</a> (<a href="http://www.wikidata.org/entity/Q41088356">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37152873">A safe and convenient pseudovirus-based inhibition assay to detect neutralizing antibodies and screen for viral entry inhibitors against the novel human coronavirus MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q37152873">edit</a>)</td>
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
    <td><a href="https://scholia.toolforge.org/Q42251659">Middle East respiratory syndrome coronavirus neutralising serum antibodies in dromedary camels: a comparative serological study.</a> (<a href="http://www.wikidata.org/entity/Q42251659">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42249511">Middle East respiratory syndrome coronavirus spike protein delivered by modified vaccinia virus Ankara efficiently induces virus-neutralizing antibodies.</a> (<a href="http://www.wikidata.org/entity/Q42249511">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37188934">Passive Transfer of A Germline-like Neutralizing Human Monoclonal Antibody Protects Transgenic Mice Against Lethal Middle East Respiratory Syndrome Coronavirus Infection.</a> (<a href="http://www.wikidata.org/entity/Q37188934">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51628462">Presence of Middle East respiratory syndrome coronavirus antibodies in Saudi Arabia: a nationwide, cross-sectional, serological study.</a> (<a href="http://www.wikidata.org/entity/Q51628462">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34653419">The receptor binding domain of the new Middle East respiratory syndrome coronavirus maps to a 231-residue region in the spike protein that efficiently elicits neutralizing antibodies.</a> (<a href="http://www.wikidata.org/entity/Q34653419">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90485002">CoroNAT: Coronavirus neuraliserende antistof terapi</a> (<a href="http://www.wikidata.org/entity/Q90485002">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97686370">Rapid Decay of Anti-SARS-CoV-2 Antibodies in Persons with Mild Covid-19</a> (<a href="http://www.wikidata.org/entity/Q97686370">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96585624">A SARS-CoV-2 Infection Model in Mice Demonstrates Protection by Neutralizing Antibodies</a> (<a href="http://www.wikidata.org/entity/Q96585624">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97548551">Analytical and clinical validation of an ELISA for specific SARS-CoV-2 IgG, IgA and IgM antibodies</a> (<a href="http://www.wikidata.org/entity/Q97548551">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97595739">Antibody responses to SARS-CoV-2 short-lived</a> (<a href="http://www.wikidata.org/entity/Q97595739">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97685371">Characteristics and roles of SARS-CoV-2 specific antibodies in patients with different severities of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q97685371">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q95851279">Human neutralizing antibodies elicited by SARS-CoV-2 infection</a> (<a href="http://www.wikidata.org/entity/Q95851279">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q95625536">Neutralizing antibody and soluble ACE2 inhibition of a replication-competent VSV-SARS-CoV-2 and a clinical isolate of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q95625536">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97555602">Potently neutralizing and protective human antibodies against SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q97555602">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96223435">Potently neutralizing human antibodies that block SARS-CoV-2 receptor binding and protect animals</a> (<a href="http://www.wikidata.org/entity/Q96223435">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97686378">Rapid Decay of Anti-SARS-CoV-2 Antibodies in Persons with Mild Covid-19</a> (<a href="http://www.wikidata.org/entity/Q97686378">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30785119">A human SARS-CoV neutralizing antibody against epitope on S2 protein.</a> (<a href="http://www.wikidata.org/entity/Q30785119">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30230531">Amino acids 15-28 in the ectodomain of SARS coronavirus 3a protein induces neutralizing antibodies.</a> (<a href="http://www.wikidata.org/entity/Q30230531">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35881133">Antibodies to SARS coronavirus in civets.</a> (<a href="http://www.wikidata.org/entity/Q35881133">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40834199">Detection of specific antibodies to severe acute respiratory syndrome (SARS) coronavirus nucleocapsid protein for serodiagnosis of SARS coronavirus pneumonia.</a> (<a href="http://www.wikidata.org/entity/Q40834199">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33205152">Disease-specific B Cell epitopes for serum antibodies from patients with severe acute respiratory syndrome (SARS) and serologic detection of SARS antibodies by epitope-based peptide antigens.</a> (<a href="http://www.wikidata.org/entity/Q33205152">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28768526">Human monoclonal antibody combination against SARS coronavirus: synergy and coverage of escape mutants</a> (<a href="http://www.wikidata.org/entity/Q28768526">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33212372">Identification of single-chain antibody fragments specific against SARS-associated coronavirus from phage-displayed antibody library.</a> (<a href="http://www.wikidata.org/entity/Q33212372">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35817398">Longitudinally profiling neutralizing antibody response to SARS coronavirus with pseudotypes.</a> (<a href="http://www.wikidata.org/entity/Q35817398">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35901171">Potent cross-reactive neutralization of SARS coronavirus isolates by human monoclonal antibodies.</a> (<a href="http://www.wikidata.org/entity/Q35901171">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40506063">Receptor-binding domain of SARS-CoV spike protein induces highly potent neutralizing antibodies: implication for developing subunit vaccine.</a> (<a href="http://www.wikidata.org/entity/Q40506063">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37033726">A SARS DNA vaccine induces neutralizing antibody and cellular immune responses in healthy adults in a Phase I clinical trial.</a> (<a href="http://www.wikidata.org/entity/Q37033726">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45423400">A double-inactivated whole virus candidate SARS coronavirus vaccine stimulates neutralising and protective antibody responses.</a> (<a href="http://www.wikidata.org/entity/Q45423400">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34338054">A single immunization with a rhabdovirus-based vector expressing severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q34338054">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47957009">An efficient method to make human monoclonal antibodies from memory B cells: potent neutralization of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47957009">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51803005">Antibodies against trimeric S glycoprotein protect hamsters against SARS-CoV challenge despite their capacity to mediate FcgammaRII-dependent entry into B cells in vitro.</a> (<a href="http://www.wikidata.org/entity/Q51803005">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47734783">Antibody response and viraemia during the course of severe acute respiratory syndrome</a> (<a href="http://www.wikidata.org/entity/Q47734783">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47293237">Antibody response of patients with severe acute respiratory syndrome</a> (<a href="http://www.wikidata.org/entity/Q47293237">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47687696">Antibody responses against SARS coronavirus are correlated with disease outcome of infected individuals.</a> (<a href="http://www.wikidata.org/entity/Q47687696">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47947942">Antibody responses against SARS-coronavirus and its nucleocaspid in SARS patients.</a> (<a href="http://www.wikidata.org/entity/Q47947942">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47801038">Antibody responses to individual proteins of SARS coronavirus and their neutralization activities.</a> (<a href="http://www.wikidata.org/entity/Q47801038">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q52596512">Antibody-mediated synergy and interference in the neutralization of SARS-CoV at an epitope cluster on the spike protein.</a> (<a href="http://www.wikidata.org/entity/Q52596512">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47796628">Characterization of monoclonal antibody against SARS coronavirus nucleocapsid antigen and development of an antigen capture ELISA.</a> (<a href="http://www.wikidata.org/entity/Q47796628">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47736945">Characterization of neutralizing monoclonal antibodies recognizing a 15-residues epitope on the spike protein HR2 region of severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q47736945">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47877806">Chronological evolution of IgM, IgA, IgG and neutralisation antibodies after infection with SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47877806">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34650448">Cross-reactive antibodies in convalescent SARS patients' sera against the emerging novel human coronavirus EMC</a> (<a href="http://www.wikidata.org/entity/Q34650448">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q48029320">DNA vaccine of SARS-Cov S gene induces antibody response in mice.</a> (<a href="http://www.wikidata.org/entity/Q48029320">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47245952">Development and characterisation of neutralising monoclonal antibody to the SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47245952">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34955252">Diagnosis of severe acute respiratory syndrome</a> (<a href="http://www.wikidata.org/entity/Q34955252">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45410748">Evaluation of a novel vesicular stomatitis virus pseudotype-based assay for detection of neutralizing antibody responses to SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q45410748">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34491357">Human monoclonal antibodies against highly conserved HR1 and HR2 domains of the SARS-CoV spike protein are more broadly neutralizing</a> (<a href="http://www.wikidata.org/entity/Q34491357">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47283945">Human monoclonal antibody as prophylaxis for SARS coronavirus infection in ferrets.</a> (<a href="http://www.wikidata.org/entity/Q47283945">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45141976">Inactivated SARS-CoV vaccine elicits high titers of spike protein-specific antibodies that block receptor binding and virus entry.</a> (<a href="http://www.wikidata.org/entity/Q45141976">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q44961556">Inactivated SARS-CoV vaccine prepared from whole virus induces a high level of neutralizing antibodies in BALB/c mice.</a> (<a href="http://www.wikidata.org/entity/Q44961556">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45787560">Induction of neutralising antibodies and cellular immune responses against SARS coronavirus by recombinant measles viruses.</a> (<a href="http://www.wikidata.org/entity/Q45787560">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37395860">Label-free, electrical detection of the SARS virus N-protein with nanowire biosensors utilizing antibody mimics as capture probes.</a> (<a href="http://www.wikidata.org/entity/Q37395860">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33267285">Long-term persistence of robust antibody and cytotoxic T cell responses in recovered patients infected with SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q33267285">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34417623">Monoclonal antibodies to SARS-associated coronavirus (SARS-CoV): identification of neutralizing and antibodies reactive to S, N, M and E viral proteins.</a> (<a href="http://www.wikidata.org/entity/Q34417623">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42041695">Neutralizing antibody and protective immunity to SARS coronavirus infection of mice induced by a soluble recombinant polypeptide containing an N-terminal segment of the spike glycoprotein.</a> (<a href="http://www.wikidata.org/entity/Q42041695">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28385241">Neutralizing antibody response and SARS severity</a> (<a href="http://www.wikidata.org/entity/Q28385241">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q34332142">Potent and persistent antibody responses against the receptor-binding domain of SARS-CoV spike protein in recovered patients.</a> (<a href="http://www.wikidata.org/entity/Q34332142">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43764882">Prevalence of IgG antibody to SARS-associated coronavirus in animal traders--Guangdong Province, China, 2003.</a> (<a href="http://www.wikidata.org/entity/Q43764882">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51661106">Profile of specific antibodies to the SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q51661106">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37366744">Recombinant receptor-binding domain of SARS-CoV spike protein expressed in mammalian, insect and E. coli cells elicits potent neutralizing antibody and protective immunity.</a> (<a href="http://www.wikidata.org/entity/Q37366744">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q43691969">SARS corona virus peptides recognized by antibodies in the sera of convalescent cases.</a> (<a href="http://www.wikidata.org/entity/Q43691969">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q47770712">SARS coronavirus spike polypeptide DNA vaccine priming with recombinant spike polypeptide from Escherichia coli as booster induces high titer of neutralizing antibody against SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47770712">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q45411636">SARS-CoV spike protein-expressing recombinant vaccinia virus efficiently induces neutralizing antibodies in rabbits pre-immunized with vaccinia virus.</a> (<a href="http://www.wikidata.org/entity/Q45411636">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37183982">Sequential affinity purification of peroxidase tagged bispecific anti-SARS-CoV antibodies on phenylboronic acid agarose.</a> (<a href="http://www.wikidata.org/entity/Q37183982">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q51807755">Template-based coiled-coil antigens elicit neutralizing antibodies to the SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q51807755">edit</a>)</td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/antibodies.rq | sed 's+<lang/>+nl+' > antibodies.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@antibodies.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
