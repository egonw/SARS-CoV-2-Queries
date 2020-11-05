# virusGenesAll.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?gene ?geneLabel ?ncbigene WHERE {
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
  OPTIONAL { ?gene wdt:P351 ?ncbigene }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
} ORDER BY ?virus ?ncbigene ?gene
```
[run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%3Fncbigene%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20OPTIONAL%20%7B%20%3Fgene%20wdt%3AP351%20%3Fncbigene%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20%3Fvirus%20%3Fncbigene%20%3Fgene%0A) or [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%3Fncbigene%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20OPTIONAL%20%7B%20%3Fgene%20wdt%3AP351%20%3Fncbigene%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20%3Fvirus%20%3Fncbigene%20%3Fgene%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>gene</b></td>
    <td><b>ncbigene</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175330">Record to support submission of GeneRIFs for a gene not in Gene (Coronavirus 229E; Human coronavirus (STRAIN 229E); Human coronavirus serogroup 229E; Human coronavirus strain 229E).</a> (<a href="http://www.wikidata.org/entity/Q88175330">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/2828637">2828637</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175310">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88175310">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/918758">918758</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175295">4a protein</a> (<a href="http://www.wikidata.org/entity/Q88175295">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/918759">918759</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175298">4b protein</a> (<a href="http://www.wikidata.org/entity/Q88175298">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/918760">918760</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175320">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88175320">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/918761">918761</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175313">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88175313">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/918762">918762</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175317">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q88175317">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/918763">918763</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175327">replicase polyprotein 1a;replicase polyprotein 1ab</a> (<a href="http://www.wikidata.org/entity/Q88175327">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/918764">918764</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88171725">nucleocapsid phosphoprotein</a> (<a href="http://www.wikidata.org/entity/Q88171725">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/3200423">3200423</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88171706">nucleocapsid phosphoprotein 2</a> (<a href="http://www.wikidata.org/entity/Q88171706">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/3200424">3200424</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88171738">hemagglutinin-esterase glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88171738">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/3200425">3200425</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88171718">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88171718">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/3200426">3200426</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88171713">non-structural protein</a> (<a href="http://www.wikidata.org/entity/Q88171713">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/3200427">3200427</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88171744">membrane glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88171744">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/3200428">3200428</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88171730">orf1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88171730">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/3200429">3200429</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88171722">small membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88171722">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/3200430">3200430</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88171735">Record to support submission of GeneRIFs for a gene not in Gene (CoV-HKU1; Human CoV/HKU1).</a> (<a href="http://www.wikidata.org/entity/Q88171735">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/3293713">3293713</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175141">Record to support submission of GeneRIFs for a gene not in Gene (Human coronavirus (strain OC43); Human coronavirus strain OC43).</a> (<a href="http://www.wikidata.org/entity/Q88175141">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/2829172">2829172</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175133">ns2</a> (<a href="http://www.wikidata.org/entity/Q88175133">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/39105215">39105215</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175161">hemagglutinin-esterase</a> (<a href="http://www.wikidata.org/entity/Q88175161">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/39105216">39105216</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175130">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88175130">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/39105217">39105217</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175148">spike surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88175148">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/39105218">39105218</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175136">ns12.9</a> (<a href="http://www.wikidata.org/entity/Q88175136">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/39105219">39105219</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175157">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88175157">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/39105220">39105220</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175144">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q88175144">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/39105221">39105221</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175152">Orf1ab</a> (<a href="http://www.wikidata.org/entity/Q88175152">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/39105222">39105222</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89210190">E2 glycoprotein precursor</a> (<a href="http://www.wikidata.org/entity/Q89210190">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/1489668">1489668</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175961">hypothetical protein sars3a</a> (<a href="http://www.wikidata.org/entity/Q88175961">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/1489669">1489669</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175978">hypothetical protein sars3b</a> (<a href="http://www.wikidata.org/entity/Q88175978">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/1489670">1489670</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175930">protein E</a> (<a href="http://www.wikidata.org/entity/Q88175930">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/1489671">1489671</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175965">matrix protein</a> (<a href="http://www.wikidata.org/entity/Q88175965">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/1489672">1489672</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175935">hypothetical protein sars6</a> (<a href="http://www.wikidata.org/entity/Q88175935">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/1489673">1489673</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175952">hypothetical protein sars7a</a> (<a href="http://www.wikidata.org/entity/Q88175952">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/1489674">1489674</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175956">hypothetical protein sars7b</a> (<a href="http://www.wikidata.org/entity/Q88175956">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/1489675">1489675</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89210186">hypothetical protein sars8a</a> (<a href="http://www.wikidata.org/entity/Q89210186">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/1489676">1489676</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89210191">hypothetical protein sars8b</a> (<a href="http://www.wikidata.org/entity/Q89210191">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/1489677">1489677</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89210195">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q89210195">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/1489678">1489678</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175943">hypothetical protein sars9b</a> (<a href="http://www.wikidata.org/entity/Q88175943">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/1489679">1489679</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175972">orf1a polyprotein (pp1a);orf1ab polyprotein (pp1ab)</a> (<a href="http://www.wikidata.org/entity/Q88175972">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/1489680">1489680</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88175947">Record to support submission of GeneRIFs for a gene not in Gene (Human coronavirus (strain SARS); SARS coronavirus; SARS virus; SARS-like coronavirus; SARS-related coronavirus; Severe acute respiratory syndrome coronavirus).</a> (<a href="http://www.wikidata.org/entity/Q88175947">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/8673700">8673700</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88173012">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88173012">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/14254594">14254594</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88173022">NS3 protein</a> (<a href="http://www.wikidata.org/entity/Q88173022">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/14254595">14254595</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q90696476">NS4A protein</a> (<a href="http://www.wikidata.org/entity/Q90696476">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/14254596">14254596</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88173027">NS4B protein</a> (<a href="http://www.wikidata.org/entity/Q88173027">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/14254597">14254597</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88173044">NS5 protein</a> (<a href="http://www.wikidata.org/entity/Q88173044">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/14254598">14254598</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88173037">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88173037">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/14254599">14254599</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88173030">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88173030">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/14254600">14254600</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88173018">nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q88173018">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/14254601">14254601</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88173033">1A polyprotein;1AB polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88173033">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/14254602">14254602</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88173015">Record to support submission of GeneRIFs for a gene not in Gene (MERS coronavirus; MERS virus; Middle East Respiratory Syndrome Coronavirus (MERS-CoV); Middle East respiratory syndrome coronavirus).</a> (<a href="http://www.wikidata.org/entity/Q88173015">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/18938949">18938949</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88173040">ORF8b protein</a> (<a href="http://www.wikidata.org/entity/Q88173040">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/19910005">19910005</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88105063">Record to support submission of GeneRIFs for a gene not in Gene (COVID-19; COVID-19 virus; COVID19; HCoV-19; Human coronavirus 2019; SARS-2; SARS-CoV2; SARS2; Wuhan coronavirus; Wuhan seafood market pneumonia virus).</a> (<a href="http://www.wikidata.org/entity/Q88105063">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/43562271">43562271</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/43740568">43740568</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88088595">ORF3a protein</a> (<a href="http://www.wikidata.org/entity/Q88088595">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/43740569">43740569</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88088888">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88088888">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/43740570">43740570</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089048">membrane glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089048">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/43740571">43740571</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089203">ORF6 protein</a> (<a href="http://www.wikidata.org/entity/Q88089203">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/43740572">43740572</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089283">ORF7a protein</a> (<a href="http://www.wikidata.org/entity/Q88089283">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/43740573">43740573</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089438">ORF7b</a> (<a href="http://www.wikidata.org/entity/Q88089438">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/43740574">43740574</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089689">nucleocapsid phosphoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089689">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/43740575">43740575</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089847">ORF10 protein</a> (<a href="http://www.wikidata.org/entity/Q88089847">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/43740576">43740576</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089552">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q88089552">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/43740577">43740577</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88088053">ORF1a polyprotein;ORF1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/43740578">43740578</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88176251">spike protein</a> (<a href="http://www.wikidata.org/entity/Q88176251">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/2943499">2943499</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88176256">protein 3</a> (<a href="http://www.wikidata.org/entity/Q88176256">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/2943500">2943500</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88176280">replicase polyprotein 1ab</a> (<a href="http://www.wikidata.org/entity/Q88176280">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/2943501">2943501</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88176260">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88176260">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/2943502">2943502</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88176272">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88176272">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/2943503">2943503</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88176265">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q88176265">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/2943504">2943504</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88176276">Record to support submission of GeneRIFs for a gene not in Gene (Coronavirus NL63; Human coronavirus NL).</a> (<a href="http://www.wikidata.org/entity/Q88176276">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/gene/3293659">3293659</a></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/virusGenesAll.rq | sed 's+<lang/>+en+' > virusGenesAll.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@virusGenesAll.rq
```
This SPARQL query is available under CCZero.
