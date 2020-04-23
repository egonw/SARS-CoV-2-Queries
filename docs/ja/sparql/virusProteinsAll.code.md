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
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
} ORDER BY ?virus
```
[run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20%3Frefseq%20%3Funiprot%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP637%20%3Frefseq%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP352%20%3Funiprot%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20%3Fvirus%0A) or [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20%3Frefseq%20%3Funiprot%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP637%20%3Frefseq%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP352%20%3Funiprot%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20%3Fvirus%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>protein</b></td>
    <td><b>refseq</b></td>
    <td><b>uniprot</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">ヒトコロナウイルス229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366392">Non-structural protein 4a</a> (<a href="http://www.wikidata.org/entity/Q88366392">edit</a>)</td>
    <td>NP_073552.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P19739">P19739</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">ヒトコロナウイルス229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366398">Non-structural protein 4b</a> (<a href="http://www.wikidata.org/entity/Q88366398">edit</a>)</td>
    <td>NP_073553.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P19740">P19740</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">ヒトコロナウイルス229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366405">Spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88366405">edit</a>)</td>
    <td>NP_073551.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P15423">P15423</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">ヒトコロナウイルス229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366413">Membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88366413">edit</a>)</td>
    <td>NP_073555.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P15422">P15422</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">ヒトコロナウイルス229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366420">Nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q88366420">edit</a>)</td>
    <td>NP_073556.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P15130">P15130</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">ヒトコロナウイルス229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366425">Envelope small membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88366425">edit</a>)</td>
    <td>NP_073554.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P19741">P19741</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">ヒトコロナウイルス229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88475358">Replicase polyprotein 1a</a> (<a href="http://www.wikidata.org/entity/Q88475358">edit</a>)</td>
    <td>NP_073550.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0C6U2">P0C6U2</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">ヒトコロナウイルス229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88475361">Replicase polyprotein 1ab</a> (<a href="http://www.wikidata.org/entity/Q88475361">edit</a>)</td>
    <td>NP_073549.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0C6X1">P0C6X1</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">ヒトコロナウイルスHKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88215925">Protein I</a> (<a href="http://www.wikidata.org/entity/Q88215925">edit</a>)</td>
    <td>YP_173243.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q5MQC5">Q5MQC5</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">ヒトコロナウイルスHKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88216297">Spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88216297">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/E0YJ44">E0YJ44</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">ヒトコロナウイルスHKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88317242">Non-structural protein 4</a> (<a href="http://www.wikidata.org/entity/Q88317242">edit</a>)</td>
    <td>YP_173239.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q5MQC9">Q5MQC9</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">ヒトコロナウイルスHKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88317253">Spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88317253">edit</a>)</td>
    <td>YP_173238.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q5MQD0">Q5MQD0</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">ヒトコロナウイルスHKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88317423">Envelope small membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88317423">edit</a>)</td>
    <td>YP_173240.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q5MQC8">Q5MQC8</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">ヒトコロナウイルスHKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88317431">Nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q88317431">edit</a>)</td>
    <td>YP_173242.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q5MQC6">Q5MQC6</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">ヒトコロナウイルスHKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88317441">Replicase polyprotein 1ab</a> (<a href="http://www.wikidata.org/entity/Q88317441">edit</a>)</td>
    <td>YP_173236.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0C6X2">P0C6X2</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">ヒトコロナウイルスHKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88317453">Hemagglutinin-esterase</a> (<a href="http://www.wikidata.org/entity/Q88317453">edit</a>)</td>
    <td>YP_173237.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q5MQD1">Q5MQD1</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">ヒトコロナウイルスHKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88317460">Membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88317460">edit</a>)</td>
    <td>YP_173241.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q5MQC7">Q5MQC7</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">ベータコロナウイルス１</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88657456">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88657456">edit</a>)</td>
    <td>YP_009555243.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">ベータコロナウイルス１</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660182">ns2</a> (<a href="http://www.wikidata.org/entity/Q88660182">edit</a>)</td>
    <td>YP_009555239.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">ベータコロナウイルス１</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660189">ns12.9</a> (<a href="http://www.wikidata.org/entity/Q88660189">edit</a>)</td>
    <td>YP_009555242.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">ベータコロナウイルス１</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660197">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q88660197">edit</a>)</td>
    <td>YP_009555245.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">ベータコロナウイルス１</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660202">spike surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88660202">edit</a>)</td>
    <td>YP_009555241.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">ベータコロナウイルス１</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660211">Orf1ab</a> (<a href="http://www.wikidata.org/entity/Q88660211">edit</a>)</td>
    <td>YP_009555238.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">ベータコロナウイルス１</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660220">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88660220">edit</a>)</td>
    <td>YP_009555244.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">ベータコロナウイルス１</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660232">hemagglutinin-esterase</a> (<a href="http://www.wikidata.org/entity/Q88660232">edit</a>)</td>
    <td>YP_009555240.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS関連コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365848">Envelope small membrane protein [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365848">edit</a>)</td>
    <td>NP_828854.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P59637">P59637</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS関連コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365856">Non-structural protein NS6 [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365856">edit</a>)</td>
    <td>NP_828856.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P59634">P59634</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS関連コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365865">Protein 9b [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365865">edit</a>)</td>
    <td>NP_828859.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P59636">P59636</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS関連コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365889">Protein non-structural 7b [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365889">edit</a>)</td>
    <td>NP_849175.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q7TFA1">Q7TFA1</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS関連コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365896">Protein 3a [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365896">edit</a>)</td>
    <td>NP_828852.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P59632">P59632</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS関連コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365900">Membrane protein [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365900">edit</a>)</td>
    <td>NP_828855.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P59596">P59596</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS関連コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365908">Non-structural protein 3b [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365908">edit</a>)</td>
    <td>NP_828853.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P59633">P59633</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS関連コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89458416">spike glycoprotein [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89458416">edit</a>)</td>
    <td>NP_828851.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P59594">P59594</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS関連コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89599893">Replicase polyprotein 1a</a> (<a href="http://www.wikidata.org/entity/Q89599893">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0C6U8">P0C6U8</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS関連コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90143910">protein non-structural 8a [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q90143910">edit</a>)</td>
    <td>NP_849176.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q7TFA0">Q7TFA0</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS関連コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90285330">protein non-structural 8b [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q90285330">edit</a>)</td>
    <td>NP_849177.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q80H93">Q80H93</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERSコロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660566">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88660566">edit</a>)</td>
    <td>YP_009047204.1</td>
    <td><a href="https://www.uniprot.org/uniprot/K9N5Q8">K9N5Q8</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERSコロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660576">nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q88660576">edit</a>)</td>
    <td>YP_009047211.1</td>
    <td><a href="https://www.uniprot.org/uniprot/K9N4V7">K9N4V7</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERSコロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660583">NS3 protein</a> (<a href="http://www.wikidata.org/entity/Q88660583">edit</a>)</td>
    <td>YP_009047205.1</td>
    <td><a href="https://www.uniprot.org/uniprot/K9N796">K9N796</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERSコロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660589">NS4B protein</a> (<a href="http://www.wikidata.org/entity/Q88660589">edit</a>)</td>
    <td>YP_009047207.1</td>
    <td><a href="https://www.uniprot.org/uniprot/K9N643">K9N643</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERSコロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89597756">Envelope small membrane protein</a> (<a href="http://www.wikidata.org/entity/Q89597756">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/K9N5R3">K9N5R3</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERSコロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89598281">Replicase polyprotein 1ab</a> (<a href="http://www.wikidata.org/entity/Q89598281">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/K9N7C7">K9N7C7</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERSコロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89598564">Non-structural protein ORF5</a> (<a href="http://www.wikidata.org/entity/Q89598564">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/K9N7D2">K9N7D2</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERSコロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89598573">Replicase polyprotein 1a</a> (<a href="http://www.wikidata.org/entity/Q89598573">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/K9N638">K9N638</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERSコロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89598583">Membrane protein</a> (<a href="http://www.wikidata.org/entity/Q89598583">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/K9N7A1">K9N7A1</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917572">Non-structural protein 10 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917579">non-structural protein 15 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917580">non-structural protein 16 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917580">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>YP_009725299.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917585">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>QHD43415</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88200603">Viroporin 3a [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88200603">edit</a>)</td>
    <td>YP_009724391</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC3">P0DTC3</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88200603">Viroporin 3a [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88200603">edit</a>)</td>
    <td>YP_009724391.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC3">P0DTC3</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88655710">envelope protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88655710">edit</a>)</td>
    <td>YP_009724392.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC4">P0DTC4</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88656821">membrane protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88656821">edit</a>)</td>
    <td>YP_009724393.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC5">P0DTC5</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88656943">Non-structural protein 6 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88656943">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC6">P0DTC6</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88658500">Protein 7a [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88658500">edit</a>)</td>
    <td>YP_009724395.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC7">P0DTC7</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88658861">Protein non-structural 7b [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88658861">edit</a>)</td>
    <td>YP_009725318.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD8">P0DTD8</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88659350">Non-structural protein 8 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88659350">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC8">P0DTC8</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89006922">Non-structural protein 2 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89006922">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89225654">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q89225654">edit</a>)</td>
    <td>YP_009724396.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89226299">ORF6 protein</a> (<a href="http://www.wikidata.org/entity/Q89226299">edit</a>)</td>
    <td>YP_009724394.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89227548">ORF10 protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89227548">edit</a>)</td>
    <td>YP_009725255.1</td>
    <td><a href="https://www.uniprot.org/uniprot/A0A663DJA2">A0A663DJA2</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89597571">Protein 9b</a> (<a href="http://www.wikidata.org/entity/Q89597571">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD2">P0DTD2</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89686805">Non-structural protein 9 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89686805">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">ヒトコロナウイルスNL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366225">Spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88366225">edit</a>)</td>
    <td>YP_003767.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q6Q1S2">Q6Q1S2</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">ヒトコロナウイルスNL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366232">Non-structural protein 3</a> (<a href="http://www.wikidata.org/entity/Q88366232">edit</a>)</td>
    <td>YP_003768.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q6Q1S1">Q6Q1S1</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">ヒトコロナウイルスNL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366244">Envelope small membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88366244">edit</a>)</td>
    <td>YP_003769.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q6Q1S0">Q6Q1S0</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">ヒトコロナウイルスNL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366251">Nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q88366251">edit</a>)</td>
    <td>YP_003771.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q6Q1R8">Q6Q1R8</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">ヒトコロナウイルスNL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366260">Membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88366260">edit</a>)</td>
    <td>YP_003770.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q6Q1R9">Q6Q1R9</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">ヒトコロナウイルスNL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366271">Replicase polyprotein 1ab</a> (<a href="http://www.wikidata.org/entity/Q88366271">edit</a>)</td>
    <td>YP_003766.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0C6X5">P0C6X5</a></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o virusProteinsAll.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/virusProteinsAll.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@virusProteinsAll.rq
```
This SPARQL query is available under CCZero.
