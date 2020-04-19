# virusGenesAll.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?gene ?geneLabel ?ncbi WHERE {
  VALUES ?virus {
    wd:Q82069695 # SARS-CoV-2
    wd:Q16983360 # HKU1
    wd:Q16991954 # OC43
    wd:Q8351095  # NL63 
    wd:Q16983356 # 229E
    wd:Q4902157  # MERS-CoV
    wd:Q278567   # SARS-CoV
  }
  ?gene wdt:P703 ?virus ; wdt:P31 wd:Q7187 .
  OPTIONAL { ?gene wdt:P351 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "nl,en". }
}
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20OPTIONAL%20%7B%20%3Fgene%20wdt%3AP351%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20OPTIONAL%20%7B%20%3Fgene%20wdt%3AP351%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>gene</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740568">43740568</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088053">ORF1a polyprotein;ORF1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740578">43740578</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088595">ORF3a protein</a> (<a href="http://www.wikidata.org/entity/Q88088595">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740569">43740569</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088888">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88088888">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740570">43740570</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089048">membrane glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089048">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740571">43740571</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089203">ORF6 protein</a> (<a href="http://www.wikidata.org/entity/Q88089203">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740572">43740572</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089283">ORF7a</a> (<a href="http://www.wikidata.org/entity/Q88089283">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740573">43740573</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089438">ORF7b</a> (<a href="http://www.wikidata.org/entity/Q88089438">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740574">43740574</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089552">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q88089552">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740577">43740577</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089689">nucleocapsid phosphoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089689">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740575">43740575</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089847">ORF10</a> (<a href="http://www.wikidata.org/entity/Q88089847">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740576">43740576</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88105063">Record to support submission of GeneRIFs for a gene not in Gene (COVID-19; COVID-19 virus; COVID19; Human coronavirus 2019; SARS-2; Wuhan coronavirus; Wuhan seafood market pneumonia virus).</a> (<a href="http://www.wikidata.org/entity/Q88105063">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43562271">43562271</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175157">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88175157">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/39105220">39105220</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175161">hemagglutinin-esterase</a> (<a href="http://www.wikidata.org/entity/Q88175161">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/39105216">39105216</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88171706">nucleocapsid phosphoprotein 2</a> (<a href="http://www.wikidata.org/entity/Q88171706">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/3200424">3200424</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88171713">non-structural protein</a> (<a href="http://www.wikidata.org/entity/Q88171713">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/3200427">3200427</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88171718">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88171718">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/3200426">3200426</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88171722">small membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88171722">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/3200430">3200430</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88171725">nucleocapsid phosphoprotein</a> (<a href="http://www.wikidata.org/entity/Q88171725">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/3200423">3200423</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88171730">orf1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88171730">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/3200429">3200429</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88171735">Record to support submission of GeneRIFs for a gene not in Gene (CoV-HKU1; Human CoV/HKU1).</a> (<a href="http://www.wikidata.org/entity/Q88171735">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/3293713">3293713</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88171738">hemagglutinin-esterase glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88171738">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/3200425">3200425</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88171744">membrane glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88171744">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/3200428">3200428</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88173012">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88173012">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/14254594">14254594</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88173015">Record to support submission of GeneRIFs for a gene not in Gene (MERS coronavirus; MERS virus; Middle East Respiratory Syndrome Coronavirus (MERS-CoV); Middle East respiratory syndrome coronavirus).</a> (<a href="http://www.wikidata.org/entity/Q88173015">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/18938949">18938949</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88173018">nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q88173018">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/14254601">14254601</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88173022">NS3 protein</a> (<a href="http://www.wikidata.org/entity/Q88173022">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/14254595">14254595</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88173027">NS4B protein</a> (<a href="http://www.wikidata.org/entity/Q88173027">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/14254597">14254597</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88173030">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88173030">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/14254600">14254600</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88173033">1A polyprotein;1AB polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88173033">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/14254602">14254602</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88173037">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88173037">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/14254599">14254599</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88173040">ORF8b protein</a> (<a href="http://www.wikidata.org/entity/Q88173040">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/19910005">19910005</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88173044">NS5 protein</a> (<a href="http://www.wikidata.org/entity/Q88173044">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/14254598">14254598</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175130">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88175130">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/39105217">39105217</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175133">ns2</a> (<a href="http://www.wikidata.org/entity/Q88175133">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/39105215">39105215</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175136">ns12.9</a> (<a href="http://www.wikidata.org/entity/Q88175136">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/39105219">39105219</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175141">Record to support submission of GeneRIFs for a gene not in Gene (Human coronavirus (strain OC43); Human coronavirus strain OC43).</a> (<a href="http://www.wikidata.org/entity/Q88175141">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2829172">2829172</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175144">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q88175144">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/39105221">39105221</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175148">spike surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88175148">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/39105218">39105218</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175152">Orf1ab</a> (<a href="http://www.wikidata.org/entity/Q88175152">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/39105222">39105222</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175295">4a protein</a> (<a href="http://www.wikidata.org/entity/Q88175295">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/918759">918759</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175298">4b protein</a> (<a href="http://www.wikidata.org/entity/Q88175298">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/918760">918760</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175310">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88175310">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/918758">918758</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175313">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88175313">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/918762">918762</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175317">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q88175317">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/918763">918763</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175320">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88175320">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/918761">918761</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175327">replicase polyprotein 1a;replicase polyprotein 1ab</a> (<a href="http://www.wikidata.org/entity/Q88175327">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/918764">918764</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175330">Record to support submission of GeneRIFs for a gene not in Gene (Coronavirus 229E; Human coronavirus (STRAIN 229E); Human coronavirus serogroup 229E; Human coronavirus strain 229E).</a> (<a href="http://www.wikidata.org/entity/Q88175330">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2828637">2828637</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175930">protein E</a> (<a href="http://www.wikidata.org/entity/Q88175930">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1489671">1489671</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175935">hypothetical protein sars6</a> (<a href="http://www.wikidata.org/entity/Q88175935">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1489673">1489673</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175943">hypothetical protein sars9b</a> (<a href="http://www.wikidata.org/entity/Q88175943">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1489679">1489679</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175947">Record to support submission of GeneRIFs for a gene not in Gene (Human coronavirus (strain SARS); SARS coronavirus; SARS virus; SARS-like coronavirus; SARS-related coronavirus; Severe acute respiratory syndrome coronavirus).</a> (<a href="http://www.wikidata.org/entity/Q88175947">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/8673700">8673700</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175952">hypothetical protein sars7a</a> (<a href="http://www.wikidata.org/entity/Q88175952">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1489674">1489674</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175956">hypothetical protein sars7b</a> (<a href="http://www.wikidata.org/entity/Q88175956">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1489675">1489675</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175961">hypothetical protein sars3a</a> (<a href="http://www.wikidata.org/entity/Q88175961">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1489669">1489669</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175965">matrix protein</a> (<a href="http://www.wikidata.org/entity/Q88175965">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1489672">1489672</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175972">orf1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88175972">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1489680">1489680</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88175978">hypothetical protein sars3b</a> (<a href="http://www.wikidata.org/entity/Q88175978">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1489670">1489670</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Menselijk Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88176251">spike protein</a> (<a href="http://www.wikidata.org/entity/Q88176251">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2943499">2943499</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Menselijk Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88176256">protein 3</a> (<a href="http://www.wikidata.org/entity/Q88176256">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2943500">2943500</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Menselijk Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88176260">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88176260">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2943502">2943502</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Menselijk Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88176265">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q88176265">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2943504">2943504</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Menselijk Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88176272">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88176272">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2943503">2943503</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Menselijk Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88176276">Record to support submission of GeneRIFs for a gene not in Gene (Coronavirus NL63; Human coronavirus NL).</a> (<a href="http://www.wikidata.org/entity/Q88176276">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/3293659">3293659</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Menselijk Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88176280">replicase polyprotein 1ab</a> (<a href="http://www.wikidata.org/entity/Q88176280">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2943501">2943501</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89210186">hypothetical protein sars8a</a> (<a href="http://www.wikidata.org/entity/Q89210186">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1489676">1489676</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89210190">E2 glycoprotein precursor</a> (<a href="http://www.wikidata.org/entity/Q89210190">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1489668">1489668</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89210191">hypothetical protein sars8b</a> (<a href="http://www.wikidata.org/entity/Q89210191">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1489677">1489677</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89210195">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q89210195">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1489678">1489678</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90696476">NS4A protein</a> (<a href="http://www.wikidata.org/entity/Q90696476">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/14254596">14254596</a></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o virusGenesAll.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/virusGenesAll.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@virusGenesAll.rq
```
This SPARQL query is available under CCZero.
