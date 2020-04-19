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
  SERVICE wikibase:label { bd:serviceParam wikibase:language "nl,en". }
}
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fthing%20%3FthingLabel%20%3Fpathway%20%3FpathwayLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fthing%20wdt%3AP703%20%3Fvirus%20.%0A%20%20%3Fpathway%20wdt%3AP31%20wd%3AQ4915012%20%3B%20wdt%3AP527%20%3Fthing%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fthing%20%3FthingLabel%20%3Fpathway%20%3FpathwayLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fthing%20wdt%3AP703%20%3Fvirus%20.%0A%20%20%3Fpathway%20wdt%3AP31%20wd%3AQ4915012%20%3B%20wdt%3AP527%20%3Fthing%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>thing</b></td>
    <td><b>pathway</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917572">Non-structural protein 10 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917579">non-structural protein 15 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917585">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088053">ORF1a polyprotein;ORF1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088595">ORF3a protein</a> (<a href="http://www.wikidata.org/entity/Q88088595">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088888">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88088888">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089048">membrane glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089048">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089203">ORF6 protein</a> (<a href="http://www.wikidata.org/entity/Q88089203">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089283">ORF7a</a> (<a href="http://www.wikidata.org/entity/Q88089283">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089438">ORF7b</a> (<a href="http://www.wikidata.org/entity/Q88089438">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089552">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q88089552">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089689">nucleocapsid phosphoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089689">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089847">ORF10</a> (<a href="http://www.wikidata.org/entity/Q88089847">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88200603">Viroporin 3a</a> (<a href="http://www.wikidata.org/entity/Q88200603">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88655710">envelope protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88655710">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88656821">membrane protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88656821">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88658500">Protein 7a [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88658500">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89006922">Non-structural protein 2 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89006922">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89225654">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q89225654">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89226299">ORF6 protein</a> (<a href="http://www.wikidata.org/entity/Q89226299">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89227548">ORF10 protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89227548">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89686805">Non-structural protein 9 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89686805">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89792653">SARS-CoV-2 NSP9 complex</a> (<a href="http://www.wikidata.org/entity/Q89792653">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90012260">SARS-CoV-2 Spike - human ACE2 receptor complex</a> (<a href="http://www.wikidata.org/entity/Q90012260">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90012262">SARS-CoV-2 Spike protein complex</a> (<a href="http://www.wikidata.org/entity/Q90012262">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90012269">SARS-CoV-2 NSP10-NSP16 complex</a> (<a href="http://www.wikidata.org/entity/Q90012269">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90012272">SARS-CoV-2 NSP3-NSP4-NSP6 complex</a> (<a href="http://www.wikidata.org/entity/Q90012272">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292589">SARS-CoV-2 and COVID-19 Pathway</a> (<a href="http://www.wikidata.org/entity/Q88292589">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088595">ORF3a protein</a> (<a href="http://www.wikidata.org/entity/Q88088595">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89269854">Activation of NLRP3 Inflammasome by SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q89269854">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917572">Non-structural protein 10 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90518826">Pathogenesis of SARS-CoV-2 Mediated by nsp9/nsp10 Complex</a> (<a href="http://www.wikidata.org/entity/Q90518826">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89686805">Non-structural protein 9 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89686805">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90518826">Pathogenesis of SARS-CoV-2 Mediated by nsp9/nsp10 Complex</a> (<a href="http://www.wikidata.org/entity/Q90518826">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175930">protein E</a> (<a href="http://www.wikidata.org/entity/Q88175930">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045272">Host-pathogen interaction of human corona viruses - ER stress</a> (<a href="http://www.wikidata.org/entity/Q89045272">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175930">protein E</a> (<a href="http://www.wikidata.org/entity/Q88175930">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175935">hypothetical protein sars6</a> (<a href="http://www.wikidata.org/entity/Q88175935">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175943">hypothetical protein sars9b</a> (<a href="http://www.wikidata.org/entity/Q88175943">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175952">hypothetical protein sars7a</a> (<a href="http://www.wikidata.org/entity/Q88175952">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175961">hypothetical protein sars3a</a> (<a href="http://www.wikidata.org/entity/Q88175961">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175965">matrix protein</a> (<a href="http://www.wikidata.org/entity/Q88175965">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175978">hypothetical protein sars3b</a> (<a href="http://www.wikidata.org/entity/Q88175978">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89210190">E2 glycoprotein precursor</a> (<a href="http://www.wikidata.org/entity/Q89210190">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89210195">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q89210195">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89045284">Host-pathogen interaction of human corona viruses - apoptosis</a> (<a href="http://www.wikidata.org/entity/Q89045284">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175935">hypothetical protein sars6</a> (<a href="http://www.wikidata.org/entity/Q88175935">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89269875">Host-pathogen interaction of human corona viruses - MAPK signaling</a> (<a href="http://www.wikidata.org/entity/Q89269875">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175952">hypothetical protein sars7a</a> (<a href="http://www.wikidata.org/entity/Q88175952">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89269875">Host-pathogen interaction of human corona viruses - MAPK signaling</a> (<a href="http://www.wikidata.org/entity/Q89269875">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175961">hypothetical protein sars3a</a> (<a href="http://www.wikidata.org/entity/Q88175961">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89269875">Host-pathogen interaction of human corona viruses - MAPK signaling</a> (<a href="http://www.wikidata.org/entity/Q89269875">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175978">hypothetical protein sars3b</a> (<a href="http://www.wikidata.org/entity/Q88175978">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89269875">Host-pathogen interaction of human corona viruses - MAPK signaling</a> (<a href="http://www.wikidata.org/entity/Q89269875">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89210190">E2 glycoprotein precursor</a> (<a href="http://www.wikidata.org/entity/Q89210190">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89269875">Host-pathogen interaction of human corona viruses - MAPK signaling</a> (<a href="http://www.wikidata.org/entity/Q89269875">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89210195">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q89210195">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89269875">Host-pathogen interaction of human corona viruses - MAPK signaling</a> (<a href="http://www.wikidata.org/entity/Q89269875">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175930">protein E</a> (<a href="http://www.wikidata.org/entity/Q88175930">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175935">hypothetical protein sars6</a> (<a href="http://www.wikidata.org/entity/Q88175935">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175943">hypothetical protein sars9b</a> (<a href="http://www.wikidata.org/entity/Q88175943">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175952">hypothetical protein sars7a</a> (<a href="http://www.wikidata.org/entity/Q88175952">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175961">hypothetical protein sars3a</a> (<a href="http://www.wikidata.org/entity/Q88175961">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175965">matrix protein</a> (<a href="http://www.wikidata.org/entity/Q88175965">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175978">hypothetical protein sars3b</a> (<a href="http://www.wikidata.org/entity/Q88175978">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89210195">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q89210195">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89357999">Host-pathogen interaction of human corona viruses - Interferon induction</a> (<a href="http://www.wikidata.org/entity/Q89357999">edit</a>)</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o pathways.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/pathways.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@pathways.rq
```
This SPARQL query is available under CCZero.
