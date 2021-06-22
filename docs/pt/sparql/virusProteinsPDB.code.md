# virusProteinsPDB.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?protein ?proteinLabel ?refseq ?uniprot ?pdb WHERE {
  ?protein wdt:P703 wd:Q82069695 ; wdt:P31 wd:Q8054 .
  ?protein wdt:P638 ?pdb .
  OPTIONAL { ?protein wdt:P637 ?refseq }
  OPTIONAL { ?protein wdt:P352 ?uniprot }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
}
```
[run](https://query.wikidata.org/embed.html#SELECT%20%3Fprotein%20%3FproteinLabel%20%3Frefseq%20%3Funiprot%20%3Fpdb%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fprotein%20wdt%3AP638%20%3Fpdb%20.%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP637%20%3Frefseq%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP352%20%3Funiprot%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0A) or [edit](https://query.wikidata.org/#SELECT%20%3Fprotein%20%3FproteinLabel%20%3Frefseq%20%3Funiprot%20%3Fpdb%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fprotein%20wdt%3AP638%20%3Fpdb%20.%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP637%20%3Frefseq%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP352%20%3Funiprot%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>protein</b></td>
    <td><b>refseq</b></td>
    <td><b>uniprot</b></td>
    <td><b>pdb</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZP1">6ZP1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZP2">6ZP2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZP5">6ZP5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZP7">6ZP7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZWV">6ZWV</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZXN">6ZXN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7A29">7A29</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7A4N">7A4N</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7A5R">7A5R</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7A5S">7A5S</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7A91">7A91</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7A93">7A93</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7A94">7A94</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7A95">7A95</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7A96">7A96</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7A97">7A97</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7A98">7A98</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7AD1">7AD1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7BWJ">7BWJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7BYR">7BYR</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7BZ5">7BZ5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7C01">7C01</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7C2L">7C2L</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7C8D">7C8D</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7C8V">7C8V</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7C8W">7C8W</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CAH">7CAH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CAI">7CAI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CAK">7CAK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CAN">7CAN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CH4">7CH4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CH5">7CH5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CHB">7CHB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CHC">7CHC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CHE">7CHE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CHF">7CHF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CHH">7CHH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CN9">7CN9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JJI">7JJI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JMO">7JMO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JMP">7JMP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JMW">7JMW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JV2">7JV2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JV4">7JV4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JV6">7JV6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JVA">7JVA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JVC">7JVC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JW0">7JW0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JWB">7JWB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JX3">7JX3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JZL">7JZL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JZM">7JZM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JZN">7JZN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JZU">7JZU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7K43">7K43</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7K45">7K45</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7K4N">7K4N</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7K8S">7K8S</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7K8T">7K8T</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7K8U">7K8U</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7K8V">7K8V</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7K8W">7K8W</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7K8X">7K8X</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7K8Y">7K8Y</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7K8Z">7K8Z</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7K90">7K90</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7K9Z">7K9Z</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KDG">7KDG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KDH">7KDH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KDI">7KDI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KDJ">7KDJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KDK">7KDK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KE4">7KE4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KE6">7KE6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KE7">7KE7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KE8">7KE8</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KE9">7KE9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KEB">7KEB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KEC">7KEC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JVB">7JVB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7DD2">7DD2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZLR">6ZLR</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7A25">7A25</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CAB">7CAB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CDI">7CDI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CDJ">7CDJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CJF">7CJF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CT5">7CT5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CWM">7CWM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CWN">7CWN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CWO">7CWO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CWS">7CWS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7CWU">7CWU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7DCC">7DCC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7DCX">7DCX</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7DD8">7DD8</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7DDD">7DDD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7DDN">7DDN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7DF3">7DF3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7DK3">7DK3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917572">Non-structural protein 10 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td>YP_009725306</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449644">P0DTC1-PRO_0000449644</a></td>
    <td><a href="https://www.rcsb.org/structure/6W4H">6W4H</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917572">Non-structural protein 10 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td>YP_009725306</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449628">P0DTD1-PRO_0000449628</a></td>
    <td><a href="https://www.rcsb.org/structure/6W4H">6W4H</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917579">non-structural protein 15 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td>YP_009725310</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449632">P0DTD1-PRO_0000449632</a></td>
    <td><a href="https://www.rcsb.org/structure/6VWW">6VWW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917579">non-structural protein 15 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td>YP_009725310</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449632">P0DTD1-PRO_0000449632</a></td>
    <td><a href="https://www.rcsb.org/structure/6W01">6W01</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917580">non-structural protein 16 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917580">edit</a>)</td>
    <td>YP_009725311</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449633">P0DTD1-PRO_0000449633</a></td>
    <td><a href="https://www.rcsb.org/structure/6W4H">6W4H</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>YP_009725299.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449637">P0DTC1-PRO_0000449637</a></td>
    <td><a href="https://www.rcsb.org/structure/6VXS">6VXS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>YP_009725299.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449637">P0DTC1-PRO_0000449637</a></td>
    <td><a href="https://www.rcsb.org/structure/6W02">6W02</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>YP_009725299.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449621">P0DTD1-PRO_0000449621</a></td>
    <td><a href="https://www.rcsb.org/structure/6VXS">6VXS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>YP_009725299.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449621">P0DTD1-PRO_0000449621</a></td>
    <td><a href="https://www.rcsb.org/structure/6W02">6W02</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/5R81">5R81</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/5R82">5R82</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/5R83">5R83</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/6LU7">6LU7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/6M03">6M03</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2E">6Y2E</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2F">6Y2F</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y84">6Y84</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/5R81">5R81</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/5R82">5R82</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/5R83">5R83</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/6LU7">6LU7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/6M03">6M03</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2E">6Y2E</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2F">6Y2F</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y84">6Y84</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
    <td><a href="https://www.rcsb.org/structure/6WKP">6WKP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
    <td><a href="https://www.rcsb.org/structure/6M3M">6M3M</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
    <td><a href="https://www.rcsb.org/structure/6VYO">6VYO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
    <td><a href="https://www.rcsb.org/structure/6WJI">6WJI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
    <td><a href="https://www.rcsb.org/structure/6WZO">6WZO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
    <td><a href="https://www.rcsb.org/structure/6WZQ">6WZQ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
    <td><a href="https://www.rcsb.org/structure/6YI3">6YI3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
    <td><a href="https://www.rcsb.org/structure/6YUN">6YUN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZCO">6ZCO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
    <td><a href="https://www.rcsb.org/structure/7C22">7C22</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
    <td><a href="https://www.rcsb.org/structure/7CDZ">7CDZ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
    <td><a href="https://www.rcsb.org/structure/7CE0">7CE0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7DF4">7DF4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KDL">7KDL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JWY">7JWY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7A92">7A92</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JJC">7JJC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7JJJ">7JJJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KEA">7KEA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6LVN">6LVN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6LXT">6LXT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6LZG">6LZG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6M0J">6M0J</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6M17">6M17</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6M1V">6M1V</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6VSB">6VSB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6VW1">6VW1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6VXX">6VXX</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6VYB">6VYB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6W41">6W41</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6WPS">6WPS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6WPT">6WPT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6X29">6X29</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6X2A">6X2A</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6X2B">6X2B</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6X2C">6X2C</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6X6P">6X6P</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6X79">6X79</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XC2">6XC2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XC3">6XC3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XC4">6XC4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XC7">6XC7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XCM">6XCM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XCN">6XCN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XDG">6XDG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XE1">6XE1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XEY">6XEY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XF5">6XF5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XF6">6XF6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XKL">6XKL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XKP">6XKP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XKQ">6XKQ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XLU">6XLU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XM0">6XM0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XM3">6XM3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XM4">6XM4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XM5">6XM5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XR8">6XR8</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XRA">6XRA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6XS6">6XS6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6YLA">6YLA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6YM0">6YM0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6YOR">6YOR</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6YZ5">6YZ5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6YZ7">6YZ7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6Z2M">6Z2M</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6Z43">6Z43</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6Z97">6Z97</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZB4">6ZB4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZB5">6ZB5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZBP">6ZBP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZCZ">6ZCZ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZDG">6ZDG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZDH">6ZDH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZER">6ZER</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6M2N">6M2N</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6M2Q">6M2Q</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6M71">6M71</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6VWW">6VWW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6VXS">6VXS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6W01">6W01</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6W02">6W02</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6W4B">6W4B</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6W61">6W61</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6W63">6W63</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6W6Y">6W6Y</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6W75">6W75</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6W9C">6W9C</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6W9Q">6W9Q</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WC1">6WC1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WCF">6WCF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WEN">6WEN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WEY">6WEY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WIQ">6WIQ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WJT">6WJT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WKS">6WKS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WLC">6WLC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WNP">6WNP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WOJ">6WOJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WQ3">6WQ3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WQD">6WQD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WQF">6WQF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WRH">6WRH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WRZ">6WRZ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WTC">6WTC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WTJ">6WTJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WTK">6WTK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WTM">6WTM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WTT">6WTT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WUU">6WUU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WVN">6WVN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WX4">6WX4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WXC">6WXC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WXD">6WXD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WZU">6WZU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6X1B">6X1B</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6X4I">6X4I</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XA9">6XA9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XAA">6XAA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XB0">6XB0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XB1">6XB1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XB2">6XB2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XBG">6XBG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XBH">6XBH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XBI">6XBI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XCH">6XCH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XDH">6XDH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XFN">6XFN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XG3">6XG3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XHM">6XHM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XHU">6XHU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XIP">6XIP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XKF">6XKF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XKH">6XKH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XKM">6XKM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XMK">6XMK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XOA">6XOA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XQS">6XQS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XQT">6XQT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XQU">6XQU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XR3">6XR3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2E">6Y2E</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2F">6Y2F</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2G">6Y2G</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y84">6Y84</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6YB7">6YB7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6YNQ">6YNQ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6YVA">6YVA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6YVF">6YVF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6YWK">6YWK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6YWL">6YWL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6YWM">6YWM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6YYT">6YYT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6YZ1">6YZ1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6YZ6">6YZ6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6Z2E">6Z2E</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZCT">6ZCT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZLW">6ZLW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZM7">6ZM7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZME">6ZME</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZMI">6ZMI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZMO">6ZMO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZMT">6ZMT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZN5">6ZN5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZOJ">6ZOJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZOK">6ZOK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZON">6ZON</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZP4">6ZP4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZPE">6ZPE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZRT">6ZRT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZRU">6ZRU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZSL">6ZSL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AKU">7AKU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7BQ7">7BQ7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7BQY">7BQY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7DK4">7DK4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7DK5">7DK5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7DK6">7DK6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7DK7">7DK7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7DMU">7DMU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7K8M">7K8M</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KJ2">7KJ2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KJ3">7KJ3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KJ4">7KJ4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KJ5">7KJ5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KKK">7KKK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KKL">7KKL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KL9">7KL9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KMB">7KMB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KMS">7KMS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KMZ">7KMZ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KNB">7KNB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KNE">7KNE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KNH">7KNH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7KNI">7KNI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7L02">7L02</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7L06">7L06</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/7L09">7L09</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7CMD">7CMD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JYY">7JYY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6XA4">6XA4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AK4">7AK4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AR5">7AR5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6WKQ">6WKQ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6W4H">6W4H</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5R7Y">5R7Y</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5R7Z">5R7Z</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5R80">5R80</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5R81">5R81</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5R82">5R82</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5R83">5R83</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5R84">5R84</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5R8T">5R8T</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RE4">5RE4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RE5">5RE5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RE6">5RE6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RE7">5RE7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RE8">5RE8</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RE9">5RE9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REA">5REA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REB">5REB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REC">5REC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RED">5RED</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REE">5REE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REF">5REF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REG">5REG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REH">5REH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REI">5REI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REJ">5REJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REK">5REK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REL">5REL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REM">5REM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REN">5REN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REO">5REO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REP">5REP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RER">5RER</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RES">5RES</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RET">5RET</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REU">5REU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REV">5REV</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REW">5REW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REX">5REX</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REY">5REY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5REZ">5REZ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RF0">5RF0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RF1">5RF1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RF2">5RF2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RF3">5RF3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RF4">5RF4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RF5">5RF5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RF6">5RF6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RF7">5RF7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RF8">5RF8</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RF9">5RF9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFA">5RFA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFB">5RFB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFC">5RFC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFD">5RFD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFE">5RFE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFF">5RFF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFG">5RFG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFH">5RFH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFI">5RFI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFJ">5RFJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFK">5RFK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFL">5RFL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFM">5RFM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFN">5RFN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFO">5RFO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFP">5RFP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFQ">5RFQ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFR">5RFR</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFS">5RFS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFT">5RFT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFU">5RFU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFV">5RFV</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFW">5RFW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFX">5RFX</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFY">5RFY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RFZ">5RFZ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RG0">5RG0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RG1">5RG1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RG2">5RG2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RG3">5RG3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGG">5RGG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGH">5RGH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGI">5RGI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGJ">5RGJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGK">5RGK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGL">5RGL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGM">5RGM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGN">5RGN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGO">5RGO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGP">5RGP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGQ">5RGQ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGR">5RGR</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGS">5RGS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGT">5RGT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGU">5RGU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGV">5RGV</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGW">5RGW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGX">5RGX</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGY">5RGY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RGZ">5RGZ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RH0">5RH0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RH1">5RH1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RH2">5RH2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RH3">5RH3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RH4">5RH4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RH5">5RH5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RH6">5RH6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RH7">5RH7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RH8">5RH8</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RH9">5RH9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RHA">5RHA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RHB">5RHB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RHC">5RHC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RHD">5RHD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RHE">5RHE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RHF">5RHF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RL6">5RL6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RL7">5RL7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RL8">5RL8</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RL9">5RL9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLB">5RLB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLC">5RLC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLD">5RLD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLE">5RLE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLF">5RLF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLG">5RLG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLH">5RLH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLI">5RLI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLJ">5RLJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLK">5RLK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLL">5RLL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLM">5RLM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLN">5RLN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLO">5RLO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLP">5RLP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLQ">5RLQ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLR">5RLR</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLS">5RLS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLT">5RLT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLU">5RLU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLV">5RLV</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLW">5RLW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLY">5RLY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RLZ">5RLZ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RM0">5RM0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RM1">5RM1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RM2">5RM2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RM3">5RM3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RM4">5RM4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RM5">5RM5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RM6">5RM6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RM7">5RM7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RM8">5RM8</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RM9">5RM9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RMA">5RMA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RMB">5RMB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RMC">5RMC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RMD">5RMD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RME">5RME</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RMF">5RMF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RMG">5RMG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RMH">5RMH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RMI">5RMI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RMJ">5RMJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RMK">5RMK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RML">5RML</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RMM">5RMM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6LU7">6LU7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6LZE">6LZE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6M03">6M03</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6M0K">6M0K</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RT5">5RT5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RT6">5RT6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RT7">5RT7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RT8">5RT8</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RT9">5RT9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTA">5RTA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTB">5RTB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTC">5RTC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTD">5RTD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTE">5RTE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTF">5RTF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTG">5RTG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTH">5RTH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTI">5RTI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTJ">5RTJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTK">5RTK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTL">5RTL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTM">5RTM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTN">5RTN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTO">5RTO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTP">5RTP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTQ">5RTQ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTR">5RTR</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTS">5RTS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTT">5RTT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTU">5RTU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTV">5RTV</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTW">5RTW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTX">5RTX</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTY">5RTY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RTZ">5RTZ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RU0">5RU0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RU1">5RU1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RU2">5RU2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RU3">5RU3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RU4">5RU4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RU5">5RU5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RU6">5RU6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RU7">5RU7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RU8">5RU8</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RU9">5RU9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUA">5RUA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUC">5RUC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUD">5RUD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUE">5RUE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUF">5RUF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUG">5RUG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUH">5RUH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUI">5RUI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUJ">5RUJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUK">5RUK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUL">5RUL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUM">5RUM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUN">5RUN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUO">5RUO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUP">5RUP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUQ">5RUQ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUR">5RUR</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUS">5RUS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUT">5RUT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUU">5RUU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUV">5RUV</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUW">5RUW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUX">5RUX</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUY">5RUY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RUZ">5RUZ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RV0">5RV0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RV1">5RV1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RV2">5RV2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RV3">5RV3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RV4">5RV4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RV5">5RV5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RV6">5RV6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RV7">5RV7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RV8">5RV8</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RV9">5RV9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVA">5RVA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVB">5RVB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVC">5RVC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVD">5RVD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVE">5RVE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVF">5RVF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVG">5RVG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVH">5RVH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVI">5RVI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVJ">5RVJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVK">5RVK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVL">5RVL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVM">5RVM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVN">5RVN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVO">5RVO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVP">5RVP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVQ">5RVQ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVR">5RVR</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVS">5RVS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVT">5RVT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVU">5RVU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RVV">5RVV</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S18">5S18</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S1A">5S1A</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S1C">5S1C</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S1E">5S1E</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S1G">5S1G</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S1I">5S1I</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S1K">5S1K</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S1M">5S1M</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S1O">5S1O</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S1Q">5S1Q</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S1S">5S1S</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S1U">5S1U</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S1W">5S1W</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S1Y">5S1Y</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S20">5S20</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S22">5S22</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S24">5S24</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S26">5S26</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S27">5S27</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S28">5S28</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S29">5S29</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2A">5S2A</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2B">5S2B</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2C">5S2C</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2D">5S2D</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2E">5S2E</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2F">5S2F</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2G">5S2G</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2H">5S2H</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2I">5S2I</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2J">5S2J</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2K">5S2K</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2L">5S2L</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2M">5S2M</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2N">5S2N</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2O">5S2O</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2P">5S2P</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2Q">5S2Q</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2R">5S2R</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2S">5S2S</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2T">5S2T</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2U">5S2U</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2V">5S2V</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2W">5S2W</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2X">5S2X</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2Y">5S2Y</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S2Z">5S2Z</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S30">5S30</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S31">5S31</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S32">5S32</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S33">5S33</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S34">5S34</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S35">5S35</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S36">5S36</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S37">5S37</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S38">5S38</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S39">5S39</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3A">5S3A</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3B">5S3B</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3C">5S3C</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3D">5S3D</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3E">5S3E</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3F">5S3F</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3G">5S3G</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3H">5S3H</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3I">5S3I</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3J">5S3J</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3K">5S3K</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3L">5S3L</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3M">5S3M</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3N">5S3N</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3O">5S3O</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3P">5S3P</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3Q">5S3Q</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3R">5S3R</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3S">5S3S</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3T">5S3T</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3U">5S3U</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3V">5S3V</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3W">5S3W</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3X">5S3X</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3Y">5S3Y</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S3Z">5S3Z</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S40">5S40</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S41">5S41</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S42">5S42</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S43">5S43</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S44">5S44</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S45">5S45</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S46">5S46</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S47">5S47</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S48">5S48</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S49">5S49</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S4A">5S4A</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S4B">5S4B</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S4C">5S4C</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S4D">5S4D</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S4E">5S4E</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S4F">5S4F</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S4G">5S4G</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S4H">5S4H</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S4I">5S4I</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7BRO">7BRO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7BRP">7BRP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7BTF">7BTF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7BUY">7BUY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7BV1">7BV1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7BV2">7BV2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7BZF">7BZF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7C2I">7C2I</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7C2J">7C2J</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7C2K">7C2K</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7C2Q">7C2Q</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7C2Y">7C2Y</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7C6S">7C6S</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7C6U">7C6U</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7C7P">7C7P</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7C8B">7C8B</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7C8R">7C8R</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7C8T">7C8T</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7C8U">7C8U</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7CBT">7CBT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7CJD">7CJD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7CJM">7CJM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7COM">7COM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7CWB">7CWB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7CWC">7CWC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7CX9">7CX9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7D1M">7D1M</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7D1O">7D1O</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JFQ">7JFQ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JHE">7JHE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JIB">7JIB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JKV">7JKV</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JME">7JME</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JOY">7JOY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JP1">7JP1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JPE">7JPE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JR3">7JR3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JR4">7JR4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JU7">7JU7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JUN">7JUN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JVZ">7JVZ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JYC">7JYC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JZ0">7JZ0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7K1L">7K1L</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7K1O">7K1O</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7K3N">7K3N</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7K3T">7K3T</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7K40">7K40</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7K5I">7K5I</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7K6D">7K6D</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7K6E">7K6E</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7K7P">7K7P</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7K9P">7K9P</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KAG">7KAG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KFI">7KFI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KFJ">7KFJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KG3">7KG3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KHP">7KHP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KEG">7KEG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AR6">7AR6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KEH">7KEH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RL0">5RL0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RL1">5RL1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RL2">5RL2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RL3">5RL3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RL4">5RL4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RL5">5RL5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RS7">5RS7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RS8">5RS8</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RS9">5RS9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSB">5RSB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSC">5RSC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSD">5RSD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSE">5RSE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSF">5RSF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSG">5RSG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSH">5RSH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSI">5RSI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSJ">5RSJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSK">5RSK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSL">5RSL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSM">5RSM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSN">5RSN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSO">5RSO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSP">5RSP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSQ">5RSQ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSR">5RSR</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSS">5RSS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RST">5RST</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSU">5RSU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSV">5RSV</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSW">5RSW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSX">5RSX</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSY">5RSY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RSZ">5RSZ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RT0">5RT0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RT1">5RT1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RT2">5RT2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RT3">5RT3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5RT4">5RT4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZFO">6ZFO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZGE">6ZGE</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZGG">6ZGG</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZGI">6ZGI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZH9">6ZH9</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZHD">6ZHD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZOW">6ZOW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZOX">6ZOX</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZOY">6ZOY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZOZ">6ZOZ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6ZP0">6ZP0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S4J">5S4J</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S4K">5S4K</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S6X">5S6X</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S6Y">5S6Y</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S6Z">5S6Z</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S70">5S70</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S71">5S71</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S72">5S72</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S73">5S73</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/5S74">5S74</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6Z5T">6Z5T</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6Z6I">6Z6I</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6Z72">6Z72</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7A1U">7A1U</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7ABU">7ABU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7ADW">7ADW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AF0">7AF0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AGA">7AGA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AHA">7AHA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7ALH">7ALH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7ALI">7ALI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AMJ">7AMJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7ANS">7ANS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AP6">7AP6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7APH">7APH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AQI">7AQI</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AQJ">7AQJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7ARF">7ARF</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AVD">7AVD</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AWR">7AWR</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AWS">7AWS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AWU">7AWU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AWW">7AWW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AX6">7AX6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AXM">7AXM</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AXO">7AXO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7AY7">7AY7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7B3E">7B3E</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7B83">7B83</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7BF3">7BF3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7BF4">7BF4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7BF5">7BF5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7BF6">7BF6</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JPY">7JPY</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JPZ">7JPZ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JQ0">7JQ0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JQ1">7JQ1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JQ2">7JQ2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JQ3">7JQ3</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JQ4">7JQ4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JQ5">7JQ5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JQB">7JQB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JQC">7JQC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KF4">7KF4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KOA">7KOA</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KPH">7KPH</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KQO">7KQO</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KQP">7KQP</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KQW">7KQW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KR0">7KR0</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KR1">7KR1</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KS5">7KS5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KVL">7KVL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KVR">7KVR</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KX5">7KX5</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KYU">7KYU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7L5D">7L5D</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7L6R">7L6R</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7L6T">7L6T</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/7LDX">7LDX</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88200603">Viroporin 3a [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88200603">edit</a>)</td>
    <td>YP_009724391.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC3">P0DTC3</a></td>
    <td><a href="https://www.rcsb.org/structure/6XDC">6XDC</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88655710">envelope protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88655710">edit</a>)</td>
    <td>YP_009724392.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC4">P0DTC4</a></td>
    <td><a href="https://www.rcsb.org/structure/7K3G">7K3G</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2E">6Y2E</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2F">6Y2F</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2G">6Y2G</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/6YYT">6YYT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7BV2">7BV2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/6YHU">6YHU</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7D3I">7D3I</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7D47">7D47</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7D6H">7D6H</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7D7T">7D7T</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JIR">7JIR</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JIT">7JIT</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JIV">7JIV</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JIW">7JIW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JN2">7JN2</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7JRN">7JRN</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7C33">7C33</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7CZ4">7CZ4</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KOJ">7KOJ</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KOK">7KOK</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KOL">7KOL</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.rcsb.org/structure/7KRX">7KRX</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88658500">Protein 7a [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88658500">edit</a>)</td>
    <td>YP_009724395.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC7">P0DTC7</a></td>
    <td><a href="https://www.rcsb.org/structure/6W37">6W37</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88659350">ORF8 protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88659350">edit</a>)</td>
    <td>YP_009724396.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC8">P0DTC8</a></td>
    <td><a href="https://www.rcsb.org/structure/7JTL">7JTL</a></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/virusProteinsPDB.rq | sed 's+<lang/>+pt+' > virusProteinsPDB.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@virusProteinsPDB.rq
```
This SPARQL query is available under CCZero.
