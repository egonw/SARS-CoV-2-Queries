# virusProteinsAll.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?protein ?proteinLabel ?refseq ?uniprot WHERE {
  VALUES ?virus {
    wd:Q82069695 # SARS-CoV-2
    wd:Q16983360 # HKU1
    wd:Q16991954 # OC43
    wd:Q8351095  # NL63 
    wd:Q16983356 # 229E
    wd:Q4902157  # MERS-CoV
    wd:Q278567   # SARS-CoV
  }
  ?protein wdt:P703 ?virus ; wdt:P31 wd:Q8054 .
  OPTIONAL { ?protein wdt:P637 ?refseq }
  OPTIONAL { ?protein wdt:P352 ?uniprot }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
} ORDER BY ?virus
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20%3Frefseq%20%3Funiprot%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP637%20%3Frefseq%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP352%20%3Funiprot%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20%3Fvirus%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20%3Frefseq%20%3Funiprot%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP637%20%3Frefseq%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP352%20%3Funiprot%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20%3Fvirus%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>protein</b></td>
    <td><b>refseq</b></td>
    <td><b>uniprot</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366392">Non-structural protein 4a</a> (<a href="http://www.wikidata.org/entity/Q88366392">edit</a>)</td>
    <td>NP_073552.1</td>
    <td>P19739</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366398">Non-structural protein 4b</a> (<a href="http://www.wikidata.org/entity/Q88366398">edit</a>)</td>
    <td>NP_073553.1</td>
    <td>P19740</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366405">Spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88366405">edit</a>)</td>
    <td>NP_073551.1</td>
    <td>P15423</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366413">Membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88366413">edit</a>)</td>
    <td>NP_073555.1</td>
    <td>P15422</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366420">Nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q88366420">edit</a>)</td>
    <td>NP_073556.1</td>
    <td>P15130</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366425">Envelope small membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88366425">edit</a>)</td>
    <td>NP_073554.1</td>
    <td>P19741</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88475358">Replicase polyprotein 1a</a> (<a href="http://www.wikidata.org/entity/Q88475358">edit</a>)</td>
    <td>NP_073550.1</td>
    <td>P0C6U2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88475361">Replicase polyprotein 1ab</a> (<a href="http://www.wikidata.org/entity/Q88475361">edit</a>)</td>
    <td>NP_073549.1</td>
    <td>P0C6X1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88215925">Protein I</a> (<a href="http://www.wikidata.org/entity/Q88215925">edit</a>)</td>
    <td>YP_173243.1</td>
    <td>Q5MQC5</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88216297">Spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88216297">edit</a>)</td>
    <td></td>
    <td>E0YJ44</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88657456">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88657456">edit</a>)</td>
    <td>YP_009555243.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660182">ns2</a> (<a href="http://www.wikidata.org/entity/Q88660182">edit</a>)</td>
    <td>YP_009555239.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660189">ns12.9</a> (<a href="http://www.wikidata.org/entity/Q88660189">edit</a>)</td>
    <td>YP_009555242.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660197">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q88660197">edit</a>)</td>
    <td>YP_009555245.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660202">spike surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88660202">edit</a>)</td>
    <td>YP_009555241.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660211">Orf1ab</a> (<a href="http://www.wikidata.org/entity/Q88660211">edit</a>)</td>
    <td>YP_009555238.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660220">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88660220">edit</a>)</td>
    <td>YP_009555244.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660232">hemagglutinin-esterase</a> (<a href="http://www.wikidata.org/entity/Q88660232">edit</a>)</td>
    <td>YP_009555240.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365848">Envelope small membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88365848">edit</a>)</td>
    <td>NP_828854.1</td>
    <td>P59637</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365856">Non-structural protein 6</a> (<a href="http://www.wikidata.org/entity/Q88365856">edit</a>)</td>
    <td>NP_828856.1</td>
    <td>P59634</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365865">Protein 9b</a> (<a href="http://www.wikidata.org/entity/Q88365865">edit</a>)</td>
    <td>NP_828859.1</td>
    <td>P59636</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365878">Protein 7a</a> (<a href="http://www.wikidata.org/entity/Q88365878">edit</a>)</td>
    <td>NP_828857.1</td>
    <td>P59635</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365889">Protein non-structural 7b</a> (<a href="http://www.wikidata.org/entity/Q88365889">edit</a>)</td>
    <td>NP_849175.1</td>
    <td>Q7TFA1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365896">Protein 3a</a> (<a href="http://www.wikidata.org/entity/Q88365896">edit</a>)</td>
    <td>NP_828852.2</td>
    <td>P59632</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365900">Membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88365900">edit</a>)</td>
    <td>NP_828855.1</td>
    <td>P59596</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365908">Non-structural protein 3b</a> (<a href="http://www.wikidata.org/entity/Q88365908">edit</a>)</td>
    <td>NP_828853.1</td>
    <td>P59633</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660566">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88660566">edit</a>)</td>
    <td>YP_009047204.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660576">nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q88660576">edit</a>)</td>
    <td>YP_009047211.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660583">NS3 protein</a> (<a href="http://www.wikidata.org/entity/Q88660583">edit</a>)</td>
    <td>YP_009047205.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660589">NS4B protein</a> (<a href="http://www.wikidata.org/entity/Q88660589">edit</a>)</td>
    <td>YP_009047207.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88174316">orf1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>QHD43415</td>
    <td>P0DTD1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88200603">Viroporin 3a</a> (<a href="http://www.wikidata.org/entity/Q88200603">edit</a>)</td>
    <td>YP_009724391</td>
    <td>P0DTC3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88655710">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88655710">edit</a>)</td>
    <td></td>
    <td>P0DTC4</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88656821">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88656821">edit</a>)</td>
    <td></td>
    <td>P0DTC5</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88656943">Non-structural protein 6</a> (<a href="http://www.wikidata.org/entity/Q88656943">edit</a>)</td>
    <td></td>
    <td>P0DTC6</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td></td>
    <td>P0DTC1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88658500">Protein 7a</a> (<a href="http://www.wikidata.org/entity/Q88658500">edit</a>)</td>
    <td></td>
    <td>P0DTC7</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88658861">Protein non-structural 7b</a> (<a href="http://www.wikidata.org/entity/Q88658861">edit</a>)</td>
    <td></td>
    <td>P0DTD8</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88659350">Non-structural protein 8</a> (<a href="http://www.wikidata.org/entity/Q88659350">edit</a>)</td>
    <td></td>
    <td>P0DTC8</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89006922">NSP2 from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q89006922">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917572">NSP10 from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917579">Uridylate-specific endoribonuclease</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917580">2'-O-methyltransferase</a> (<a href="http://www.wikidata.org/entity/Q87917580">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917581">Papain-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>YP_009725299.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">3C-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917584">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td></td>
    <td>P0DTC9</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917585">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td>P0DTC2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366225">Spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88366225">edit</a>)</td>
    <td>YP_003767.1</td>
    <td>Q6Q1S2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366232">Non-structural protein 3</a> (<a href="http://www.wikidata.org/entity/Q88366232">edit</a>)</td>
    <td>YP_003768.1</td>
    <td>Q6Q1S1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366244">Envelope small membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88366244">edit</a>)</td>
    <td>YP_003769.1</td>
    <td>Q6Q1S0</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366251">Nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q88366251">edit</a>)</td>
    <td>YP_003771.1</td>
    <td>Q6Q1R8</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366260">Membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88366260">edit</a>)</td>
    <td>YP_003770.1</td>
    <td>Q6Q1R9</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366271">Replicase polyprotein 1ab</a> (<a href="http://www.wikidata.org/entity/Q88366271">edit</a>)</td>
    <td>YP_003766.2</td>
    <td>P0C6X5</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o virusProteinsAll.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/virusProteinsAll.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@virusProteinsAll.rq
```
This SPARQL query is available under CCZero.
