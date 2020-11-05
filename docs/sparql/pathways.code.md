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
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
} ORDER BY ASC(?virus) ASC(?thing) ASC(?pathway)
```
[run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fthing%20%3FthingLabel%20%3Fpathway%20%3FpathwayLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fthing%20wdt%3AP703%20%3Fvirus%20.%0A%20%20%3Fpathway%20wdt%3AP31%20wd%3AQ4915012%20%3B%20wdt%3AP527%20%3Fthing%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvirus%29%20ASC%28%3Fthing%29%20ASC%28%3Fpathway%29%0A) or [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fthing%20%3FthingLabel%20%3Fpathway%20%3FpathwayLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fthing%20wdt%3AP703%20%3Fvirus%20.%0A%20%20%3Fpathway%20wdt%3AP31%20wd%3AQ4915012%20%3B%20wdt%3AP527%20%3Fthing%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvirus%29%20ASC%28%3Fthing%29%20ASC%28%3Fpathway%29%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>thing</b></td>
    <td><b>pathway</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88365896">Protein 3a [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365896">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88365896">Protein 3a [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365896">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89269875">Host-pathogen interaction of human corona viruses - MAPK signaling</a> (<a href="http://www.wikidata.org/entity/Q89269875">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88365896">Protein 3a [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365896">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917572">Non-structural protein 10 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917572">Non-structural protein 10 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90518826">Pathogenesis of SARS-CoV-2 Mediated by nsp9-nsp10 Complex</a> (<a href="http://www.wikidata.org/entity/Q90518826">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917579">non-structural protein 15 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917579">non-structural protein 15 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q95970330">Endoplasmic reticulum stress response in Coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q95970330">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89045266">Type I Interferon Induction and Signaling During SARS-CoV-2 Infection</a> (<a href="http://www.wikidata.org/entity/Q89045266">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88278881">Linoleic acid metabolism known to be affected by coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q88278881">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88278881">Linoleic acid metabolism known to be affected by coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q88278881">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89269930">Downregulation of ACE2 expression by SARS-CoV infection and SARS-CoV Spike protein</a> (<a href="http://www.wikidata.org/entity/Q89269930">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88088053">ORF1a polyprotein;ORF1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88088595">ORF3a protein</a> (<a href="http://www.wikidata.org/entity/Q88088595">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88088888">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88088888">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089048">membrane glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089048">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089203">ORF6 protein</a> (<a href="http://www.wikidata.org/entity/Q88089203">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089283">ORF7a protein</a> (<a href="http://www.wikidata.org/entity/Q88089283">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089438">ORF7b</a> (<a href="http://www.wikidata.org/entity/Q88089438">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089552">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q88089552">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089689">nucleocapsid phosphoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089689">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089847">ORF10 protein</a> (<a href="http://www.wikidata.org/entity/Q88089847">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88200603">Viroporin 3a [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88200603">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88655710">envelope protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88655710">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88278881">Linoleic acid metabolism known to be affected by coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q88278881">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88655710">envelope protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88655710">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88656821">membrane protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88656821">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88278881">Linoleic acid metabolism known to be affected by coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q88278881">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88656821">membrane protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88656821">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88656943">Non-structural protein 6 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88656943">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88658500">Protein 7a [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88658500">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88659350">Non-structural protein 8 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88659350">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89006922">Non-structural protein 2 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89006922">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89225654">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q89225654">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89226299">ORF6 protein</a> (<a href="http://www.wikidata.org/entity/Q89226299">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89227548">ORF10 protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89227548">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89227548">ORF10 protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89227548">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88799649">Hijack of Ubiquitination by SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q88799649">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89686805">Non-structural protein 9 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89686805">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89686805">Non-structural protein 9 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89686805">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90518826">Pathogenesis of SARS-CoV-2 Mediated by nsp9-nsp10 Complex</a> (<a href="http://www.wikidata.org/entity/Q90518826">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89792653">SARS-CoV-2 NSP9 complex</a> (<a href="http://www.wikidata.org/entity/Q89792653">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90012260">SARS-CoV-2 Spike - human ACE2 receptor complex</a> (<a href="http://www.wikidata.org/entity/Q90012260">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90012261">SARS-CoV-2 Spike - human ACE2-SLC6A19 complex</a> (<a href="http://www.wikidata.org/entity/Q90012261">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90012262">SARS-CoV-2 Spike protein complex</a> (<a href="http://www.wikidata.org/entity/Q90012262">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88278881">Linoleic acid metabolism known to be affected by coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q88278881">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90012262">SARS-CoV-2 Spike protein complex</a> (<a href="http://www.wikidata.org/entity/Q90012262">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90012264">SARS-CoV-2 main protease complex</a> (<a href="http://www.wikidata.org/entity/Q90012264">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90012269">SARS-CoV-2 NSP10-NSP16 complex</a> (<a href="http://www.wikidata.org/entity/Q90012269">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90012272">SARS-CoV-2 NSP3-NSP4-NSP6 complex</a> (<a href="http://www.wikidata.org/entity/Q90012272">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90038952">Host translation inhibitor nsp1 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90038952">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90038956">Non-structural protein 4 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90038956">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90038963">Non-structural protein 7 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90038963">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q94647436">Non-structural protein 12 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q94647436">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q94648377">Non-structural protein 13 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q94648377">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q94994433">Uncharacterized protein 14</a> (<a href="http://www.wikidata.org/entity/Q94994433">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/pathways.rq | sed 's+<lang/>+en+' > pathways.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@pathways.rq
```
This SPARQL query is available under CCZero.
