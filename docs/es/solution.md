[ [en](../solution.md) [ja](../ja/solution.md) **es**  ]

# Hacia una solución

Actualmente no existe una solución para el SARS-CoV-2.

Pero hay ideas sobre qué soluciones podrían ser. Una vacuna es una de ellas, pero su desarrollo lleva tiempo [<a href="#citeref1">1</a>]. Pero también se habla de anticuerpos y reutilización de drogas. Todo esto es muy exploratorio en este momento. Los ensayos clínicos son importantes (consulte la sección [Ensayos clínicos](https://egonw.github.io/SARS-CoV-2-Queries/es/covid.html#clinical-trials)).

Este capítulo muestra una serie de consultas con información en Wikidata sobre clientes potenciales que las personas han propuesto que pueden conducir a una solución.

## Anticuerpos

Los anticuerpos están ganando interés. La siguiente consulta enumera artículos sobre los coronavirus humanos y también anotados con el término '<a name="tp1">anticuerpo</a>':

**SPARQL** [sparql/antibodies.rq](sparql/antibodies.code.html) ([ejecutar](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ79460%20.%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3FworkLabel%0A), [editar](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ79460%20.%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3FworkLabel%0A))

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
  SERVICE wikibase:label { bd:serviceParam wikibase:language "es,en". }
}
ORDER BY ?virusLabel ?workLabel
```

Se debe enfatizar que los anticuerpos son específicos para cada proteína y cada coronavirus tiene proteínas diferentes, y esta lista es solo para incluir en la literatura relevante para leer, no para sacar conclusiones de:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>work</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40614291">Antibody to virus components in volunteers experimentally infected with human coronavirus 229E group viruses.</a> (<a href="http://www.wikidata.org/entity/Q40614291">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41288189">Detection of human coronavirus 229E-specific antibodies using recombinant fusion proteins.</a> (<a href="http://www.wikidata.org/entity/Q41288189">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57096902">Development of a recombinant truncated nucleocapsid protein based immunoassay for detection of antibodies against human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q57096902">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33743790">A conformation-dependent neutralizing monoclonal antibody specifically targeting receptor-binding domain in Middle East respiratory syndrome coronavirus spike protein.</a> (<a href="http://www.wikidata.org/entity/Q33743790">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30379384">A humanized neutralizing antibody against MERS-CoV targeting the receptor-binding domain of the spike protein.</a> (<a href="http://www.wikidata.org/entity/Q30379384">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37152873">A safe and convenient pseudovirus-based inhibition assay to detect neutralizing antibodies and screen for viral entry inhibitors against the novel human coronavirus MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q37152873">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35063993">A truncated receptor-binding domain of MERS-CoV spike protein potently inhibits MERS-CoV infection and induces strong neutralizing antibody responses: implication for developing therapeutics and vaccines</a> (<a href="http://www.wikidata.org/entity/Q35063993">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30362113">Exceptionally potent neutralization of Middle East respiratory syndrome coronavirus by human monoclonal antibodies.</a> (<a href="http://www.wikidata.org/entity/Q30362113">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42256279">Investigation of anti-middle East respiratory syndrome antibodies in blood donors and slaughterhouse workers in Jeddah and Makkah, Saudi Arabia, fall 2012.</a> (<a href="http://www.wikidata.org/entity/Q42256279">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42210505">Middle East respiratory syndrome coronavirus (MERS-CoV) RNA and neutralising antibodies in milk collected according to local customs from dromedary camels, Qatar, April 2014.</a> (<a href="http://www.wikidata.org/entity/Q42210505">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30358243">Middle East respiratory syndrome coronavirus antibody reactors among camels in Dubai, United Arab Emirates, in 2005.</a> (<a href="http://www.wikidata.org/entity/Q30358243">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42251659">Middle East respiratory syndrome coronavirus neutralising serum antibodies in dromedary camels: a comparative serological study.</a> (<a href="http://www.wikidata.org/entity/Q42251659">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42249511">Middle East respiratory syndrome coronavirus spike protein delivered by modified vaccinia virus Ankara efficiently induces virus-neutralizing antibodies.</a> (<a href="http://www.wikidata.org/entity/Q42249511">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37188934">Passive Transfer of A Germline-like Neutralizing Human Monoclonal Antibody Protects Transgenic Mice Against Lethal Middle East Respiratory Syndrome Coronavirus Infection.</a> (<a href="http://www.wikidata.org/entity/Q37188934">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35159147">Potent neutralization of MERS-CoV by human neutralizing monoclonal antibodies to the viral spike glycoprotein.</a> (<a href="http://www.wikidata.org/entity/Q35159147">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35865538">Pre- and postexposure efficacy of fully human antibodies against Spike protein in a novel humanized mouse model of MERS-CoV infection</a> (<a href="http://www.wikidata.org/entity/Q35865538">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51628462">Presence of Middle East respiratory syndrome coronavirus antibodies in Saudi Arabia: a nationwide, cross-sectional, serological study.</a> (<a href="http://www.wikidata.org/entity/Q51628462">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41088356">Presence of Middle East respiratory syndrome coronavirus antibodies in Saudi Arabia: a nationwide, cross-sectional, serological study.</a> (<a href="http://www.wikidata.org/entity/Q41088356">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34653419">The receptor binding domain of the new Middle East respiratory syndrome coronavirus maps to a 231-residue region in the spike protein that efficiently elicits neutralizing antibodies.</a> (<a href="http://www.wikidata.org/entity/Q34653419">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37033726">A SARS DNA vaccine induces neutralizing antibody and cellular immune responses in healthy adults in a Phase I clinical trial.</a> (<a href="http://www.wikidata.org/entity/Q37033726">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45423400">A double-inactivated whole virus candidate SARS coronavirus vaccine stimulates neutralising and protective antibody responses.</a> (<a href="http://www.wikidata.org/entity/Q45423400">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30785119">A human SARS-CoV neutralizing antibody against epitope on S2 protein.</a> (<a href="http://www.wikidata.org/entity/Q30785119">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34338054">A single immunization with a rhabdovirus-based vector expressing severe acute respiratory syndrome coronavirus (SARS-CoV) S protein results in the production of high levels of SARS-CoV-neutralizing antibodies</a> (<a href="http://www.wikidata.org/entity/Q34338054">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30230531">Amino acids 15-28 in the ectodomain of SARS coronavirus 3a protein induces neutralizing antibodies.</a> (<a href="http://www.wikidata.org/entity/Q30230531">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47957009">An efficient method to make human monoclonal antibodies from memory B cells: potent neutralization of SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47957009">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51803005">Antibodies against trimeric S glycoprotein protect hamsters against SARS-CoV challenge despite their capacity to mediate FcgammaRII-dependent entry into B cells in vitro.</a> (<a href="http://www.wikidata.org/entity/Q51803005">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35881133">Antibodies to SARS coronavirus in civets.</a> (<a href="http://www.wikidata.org/entity/Q35881133">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47734783">Antibody response and viraemia during the course of severe acute respiratory syndrome (SARS)-associated coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q47734783">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47293237">Antibody response of patients with severe acute respiratory syndrome (SARS) targets the viral nucleocapsid.</a> (<a href="http://www.wikidata.org/entity/Q47293237">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47687696">Antibody responses against SARS coronavirus are correlated with disease outcome of infected individuals.</a> (<a href="http://www.wikidata.org/entity/Q47687696">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47947942">Antibody responses against SARS-coronavirus and its nucleocaspid in SARS patients.</a> (<a href="http://www.wikidata.org/entity/Q47947942">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47801038">Antibody responses to individual proteins of SARS coronavirus and their neutralization activities.</a> (<a href="http://www.wikidata.org/entity/Q47801038">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q52596512">Antibody-mediated synergy and interference in the neutralization of SARS-CoV at an epitope cluster on the spike protein.</a> (<a href="http://www.wikidata.org/entity/Q52596512">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47796628">Characterization of monoclonal antibody against SARS coronavirus nucleocapsid antigen and development of an antigen capture ELISA.</a> (<a href="http://www.wikidata.org/entity/Q47796628">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47736945">Characterization of neutralizing monoclonal antibodies recognizing a 15-residues epitope on the spike protein HR2 region of severe acute respiratory syndrome coronavirus (SARS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q47736945">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47877806">Chronological evolution of IgM, IgA, IgG and neutralisation antibodies after infection with SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47877806">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34650448">Cross-reactive antibodies in convalescent SARS patients' sera against the emerging novel human coronavirus EMC (2012) by both immunofluorescent and neutralizing antibody tests.</a> (<a href="http://www.wikidata.org/entity/Q34650448">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q48029320">DNA vaccine of SARS-Cov S gene induces antibody response in mice.</a> (<a href="http://www.wikidata.org/entity/Q48029320">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40834199">Detection of specific antibodies to severe acute respiratory syndrome (SARS) coronavirus nucleocapsid protein for serodiagnosis of SARS coronavirus pneumonia.</a> (<a href="http://www.wikidata.org/entity/Q40834199">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47245952">Development and characterisation of neutralising monoclonal antibody to the SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47245952">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34955252">Diagnosis of severe acute respiratory syndrome (SARS) by detection of SARS coronavirus nucleocapsid antibodies in an antigen-capturing enzyme-linked immunosorbent assay</a> (<a href="http://www.wikidata.org/entity/Q34955252">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33205152">Disease-specific B Cell epitopes for serum antibodies from patients with severe acute respiratory syndrome (SARS) and serologic detection of SARS antibodies by epitope-based peptide antigens.</a> (<a href="http://www.wikidata.org/entity/Q33205152">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45410748">Evaluation of a novel vesicular stomatitis virus pseudotype-based assay for detection of neutralizing antibody responses to SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q45410748">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34491357">Human monoclonal antibodies against highly conserved HR1 and HR2 domains of the SARS-CoV spike protein are more broadly neutralizing</a> (<a href="http://www.wikidata.org/entity/Q34491357">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47283945">Human monoclonal antibody as prophylaxis for SARS coronavirus infection in ferrets.</a> (<a href="http://www.wikidata.org/entity/Q47283945">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28768526">Human monoclonal antibody combination against SARS coronavirus: synergy and coverage of escape mutants</a> (<a href="http://www.wikidata.org/entity/Q28768526">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33212372">Identification of single-chain antibody fragments specific against SARS-associated coronavirus from phage-displayed antibody library.</a> (<a href="http://www.wikidata.org/entity/Q33212372">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45141976">Inactivated SARS-CoV vaccine elicits high titers of spike protein-specific antibodies that block receptor binding and virus entry.</a> (<a href="http://www.wikidata.org/entity/Q45141976">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44961556">Inactivated SARS-CoV vaccine prepared from whole virus induces a high level of neutralizing antibodies in BALB/c mice.</a> (<a href="http://www.wikidata.org/entity/Q44961556">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45787560">Induction of neutralising antibodies and cellular immune responses against SARS coronavirus by recombinant measles viruses.</a> (<a href="http://www.wikidata.org/entity/Q45787560">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37395860">Label-free, electrical detection of the SARS virus N-protein with nanowire biosensors utilizing antibody mimics as capture probes</a> (<a href="http://www.wikidata.org/entity/Q37395860">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33267285">Long-term persistence of robust antibody and cytotoxic T cell responses in recovered patients infected with SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q33267285">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35817398">Longitudinally profiling neutralizing antibody response to SARS coronavirus with pseudotypes.</a> (<a href="http://www.wikidata.org/entity/Q35817398">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34417623">Monoclonal antibodies to SARS-associated coronavirus (SARS-CoV): identification of neutralizing and antibodies reactive to S, N, M and E viral proteins.</a> (<a href="http://www.wikidata.org/entity/Q34417623">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42041695">Neutralizing antibody and protective immunity to SARS coronavirus infection of mice induced by a soluble recombinant polypeptide containing an N-terminal segment of the spike glycoprotein.</a> (<a href="http://www.wikidata.org/entity/Q42041695">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28385241">Neutralizing antibody response and SARS severity</a> (<a href="http://www.wikidata.org/entity/Q28385241">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34332142">Potent and persistent antibody responses against the receptor-binding domain of SARS-CoV spike protein in recovered patients.</a> (<a href="http://www.wikidata.org/entity/Q34332142">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35901171">Potent cross-reactive neutralization of SARS coronavirus isolates by human monoclonal antibodies.</a> (<a href="http://www.wikidata.org/entity/Q35901171">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43764882">Prevalence of IgG antibody to SARS-associated coronavirus in animal traders--Guangdong Province, China, 2003.</a> (<a href="http://www.wikidata.org/entity/Q43764882">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51661106">Profile of specific antibodies to the SARS-associated coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q51661106">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40506063">Receptor-binding domain of SARS-CoV spike protein induces highly potent neutralizing antibodies: implication for developing subunit vaccine.</a> (<a href="http://www.wikidata.org/entity/Q40506063">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37366744">Recombinant receptor-binding domain of SARS-CoV spike protein expressed in mammalian, insect and E. coli cells elicits potent neutralizing antibody and protective immunity.</a> (<a href="http://www.wikidata.org/entity/Q37366744">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43691969">SARS corona virus peptides recognized by antibodies in the sera of convalescent cases.</a> (<a href="http://www.wikidata.org/entity/Q43691969">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47770712">SARS coronavirus spike polypeptide DNA vaccine priming with recombinant spike polypeptide from Escherichia coli as booster induces high titer of neutralizing antibody against SARS coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47770712">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45411636">SARS-CoV spike protein-expressing recombinant vaccinia virus efficiently induces neutralizing antibodies in rabbits pre-immunized with vaccinia virus.</a> (<a href="http://www.wikidata.org/entity/Q45411636">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37183982">Sequential affinity purification of peroxidase tagged bispecific anti-SARS-CoV antibodies on phenylboronic acid agarose</a> (<a href="http://www.wikidata.org/entity/Q37183982">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51807755">Template-based coiled-coil antigens elicit neutralizing antibodies to the SARS-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q51807755">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90485002">CoroNAT: Coronavirus neuraliserende antistof terapi</a> (<a href="http://www.wikidata.org/entity/Q90485002">edit</a>)</td>
  </tr>
</table>

## Reutilización de drogas

La sección ?? ya incluía una descripción general de los ensayos clínicos.
Este da una idea de los síntomas que preocupan a las personas. También proporciona información sobre qué <a name="tp2">medicamentos</a> se estudian para la <a name="tp3">reutilización</a>.
Algunos de estos han recibido mucha atención, otros menos.

La siguiente consulta enumera el número de ensayos clínicos por <a name="tp4">intervención</a>:

**SPARQL** [sparql/clinicalTrialsByIntervention.rq](sparql/clinicalTrialsByIntervention.code.html) ([ejecutar](https://query.wikidata.org/embed.html#SELECT%20%3Fintervention%20%3FinterventionLabel%20%28COUNT%28%3Ftrial%29%20AS%20%3Ftrials%29%20WHERE%20%7B%0A%20%20VALUES%20%3Ftopic%20%7B%0A%20%20%20%20wd%3AQ84263196%20wd%3AQ82069695%0A%20%20%7D%0A%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP921%20%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fintervention%20%3FinterventionLabel%0A%20%20ORDER%20BY%20DESC%28%3Ftrials%29%0A), [editar](https://query.wikidata.org/#SELECT%20%3Fintervention%20%3FinterventionLabel%20%28COUNT%28%3Ftrial%29%20AS%20%3Ftrials%29%20WHERE%20%7B%0A%20%20VALUES%20%3Ftopic%20%7B%0A%20%20%20%20wd%3AQ84263196%20wd%3AQ82069695%0A%20%20%7D%0A%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP921%20%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fintervention%20%3FinterventionLabel%0A%20%20ORDER%20BY%20DESC%28%3Ftrials%29%0A))

```sparql
SELECT ?intervention ?interventionLabel (COUNT(?trial) AS ?trials) WHERE {
  VALUES ?topic {
    wd:Q84263196 wd:Q82069695
  }
  ?trial wdt:P31 wd:Q30612 ;
         wdt:P921  ?topic ;
         wdt:P4844 ?intervention .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "es,en". }
} GROUP BY ?intervention ?interventionLabel
  ORDER BY DESC(?trials)
```

Esto da:

<table>
  <tr>
    <td><b>intervention</b></td>
    <td><b>trials</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q421094">hidroxicloroquina</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td>42</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td>14</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td>14</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q422438">Cloroquina</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td>14</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td>12</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84263196">COVID-19</a> (<a href="http://www.wikidata.org/entity/Q84263196">edit</a>)</td>
    <td>11</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q425154">tocilizumab</a> (<a href="http://www.wikidata.org/entity/Q425154">edit</a>)</td>
    <td>6</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q410074">Losartán</a> (<a href="http://www.wikidata.org/entity/Q410074">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q40207875">agente antiviral</a> (<a href="http://www.wikidata.org/entity/Q40207875">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q188269">interferón</a> (<a href="http://www.wikidata.org/entity/Q188269">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57055">paracetamol</a> (<a href="http://www.wikidata.org/entity/Q57055">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q207843">óxido nítrico</a> (<a href="http://www.wikidata.org/entity/Q207843">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q417222">metilprednisolona</a> (<a href="http://www.wikidata.org/entity/Q417222">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q11426176">Prednisolona</a> (<a href="http://www.wikidata.org/entity/Q11426176">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q27107351">methylprednisolone acetate</a> (<a href="http://www.wikidata.org/entity/Q27107351">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q27108063">prednisolone acetate</a> (<a href="http://www.wikidata.org/entity/Q27108063">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q27262132">methylprednisolone hemisuccinate</a> (<a href="http://www.wikidata.org/entity/Q27262132">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q27266327">prednisolone 21-phosphate</a> (<a href="http://www.wikidata.org/entity/Q27266327">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q27278862">prednisolone hemisuccinate</a> (<a href="http://www.wikidata.org/entity/Q27278862">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q3960572">Siltuximab</a> (<a href="http://www.wikidata.org/entity/Q3960572">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q288280">Inhibidor de la enzima convertidora de angiotensina</a> (<a href="http://www.wikidata.org/entity/Q288280">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q193598">ácido ascórbico</a> (<a href="http://www.wikidata.org/entity/Q193598">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q7041828">Nivolumab</a> (<a href="http://www.wikidata.org/entity/Q7041828">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q165399">azitromicina</a> (<a href="http://www.wikidata.org/entity/Q165399">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q21057316">coal tar pitch volatiles</a> (<a href="http://www.wikidata.org/entity/Q21057316">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q408524">ciclofosfamida</a> (<a href="http://www.wikidata.org/entity/Q408524">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q27106392">dexamethasone acetate</a> (<a href="http://www.wikidata.org/entity/Q27106392">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q798309">Vacuna BCG</a> (<a href="http://www.wikidata.org/entity/Q798309">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q3950557">Sargramostim</a> (<a href="http://www.wikidata.org/entity/Q3950557">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q9268800">gloriosine</a> (<a href="http://www.wikidata.org/entity/Q9268800">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q17149812">Inhibidor de la quinasa Janus</a> (<a href="http://www.wikidata.org/entity/Q17149812">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q2450337">interferon beta-1a</a> (<a href="http://www.wikidata.org/entity/Q2450337">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q415411">Anakinra</a> (<a href="http://www.wikidata.org/entity/Q415411">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q155954">Tenofovir</a> (<a href="http://www.wikidata.org/entity/Q155954">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q422604">emtricitabina</a> (<a href="http://www.wikidata.org/entity/Q422604">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q7383611">ruxolitinib</a> (<a href="http://www.wikidata.org/entity/Q7383611">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q203174">talidomida</a> (<a href="http://www.wikidata.org/entity/Q203174">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q413299">Bevacizumab</a> (<a href="http://www.wikidata.org/entity/Q413299">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q28209496">remdesivir</a> (<a href="http://www.wikidata.org/entity/Q28209496">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87775025">mRNA-1273</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q422212">Budesonida</a> (<a href="http://www.wikidata.org/entity/Q422212">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q1215575">naproxeno</a> (<a href="http://www.wikidata.org/entity/Q1215575">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q249619">inmunosupresor</a> (<a href="http://www.wikidata.org/entity/Q249619">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q188724">antiinflamatorio no esteroideo</a> (<a href="http://www.wikidata.org/entity/Q188724">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q5515384">gabexate</a> (<a href="http://www.wikidata.org/entity/Q5515384">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q20817234">thymalfasin</a> (<a href="http://www.wikidata.org/entity/Q20817234">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q50840582">Angiotensin II</a> (<a href="http://www.wikidata.org/entity/Q50840582">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q5119448">Ciclesonida</a> (<a href="http://www.wikidata.org/entity/Q5119448">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q27161510">(5R)-24,25-Dihydroxyvitamin D</a> (<a href="http://www.wikidata.org/entity/Q27161510">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q49872458">Ergocalciferols</a> (<a href="http://www.wikidata.org/entity/Q49872458">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q419618">deferoxamina</a> (<a href="http://www.wikidata.org/entity/Q419618">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q27088384">piclidenoson</a> (<a href="http://www.wikidata.org/entity/Q27088384">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q239778">Bromhexina</a> (<a href="http://www.wikidata.org/entity/Q239778">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q576104">neonato</a> (<a href="http://www.wikidata.org/entity/Q576104">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q27132395">fingolimod hydrochloride</a> (<a href="http://www.wikidata.org/entity/Q27132395">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q66559285">immunoglobulin</a> (<a href="http://www.wikidata.org/entity/Q66559285">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q159683">ácido cítrico</a> (<a href="http://www.wikidata.org/entity/Q159683">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q409728">citrato de trisodio</a> (<a href="http://www.wikidata.org/entity/Q409728">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q27126379">sildenafil citrate</a> (<a href="http://www.wikidata.org/entity/Q27126379">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q211509">Oseltamivir</a> (<a href="http://www.wikidata.org/entity/Q211509">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q3765251">Darunavir</a> (<a href="http://www.wikidata.org/entity/Q3765251">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q420360">Fentolamina</a> (<a href="http://www.wikidata.org/entity/Q420360">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q3836750">Lopinavir/ritonavir</a> (<a href="http://www.wikidata.org/entity/Q3836750">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88454408">Xuebijing</a> (<a href="http://www.wikidata.org/entity/Q88454408">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q668093">Atorvastatina</a> (<a href="http://www.wikidata.org/entity/Q668093">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q417097">levamisol</a> (<a href="http://www.wikidata.org/entity/Q417097">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q27132391">formoterol fumarate</a> (<a href="http://www.wikidata.org/entity/Q27132391">edit</a>)</td>
    <td>1</td>
  </tr>
</table>

Es importante destacar que esta lista solo da una idea de qué intervención ha recibido más atención que otras. Y es esencial darse cuenta de que la atención no es una medida de éxito.

## Referencias

1. <a name="citeref1"></a>Lu S. Timely development of vaccines against SARS-CoV-2. Emerging microbes & infections. 2020 Mar 8;9(1):542–4.  doi:[10.1080/22221751.2020.1737580](https://doi.org/10.1080/22221751.2020.1737580) ([Scholia](https://tools.wmflabs.org/scholia/doi/10.1080/22221751.2020.1737580))


