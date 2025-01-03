# allBetacoronaVirusesGraph.rq
**Ejemplos de código:** [curl](#curl)
### SPARQL
```sparql
#defaultView:Graph
SELECT ?parent ?parentLabel ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q16532287 .
  ?virus wdt:P171 ?parent .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "es,en". }
}
```
[ejecutar](https://query.wikidata.org/embed.html#%23defaultView%3AGraph%0ASELECT%20%3Fparent%20%3FparentLabel%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ16532287%20.%0A%20%20%3Fvirus%20wdt%3AP171%20%3Fparent%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0A) o [editar](https://query.wikidata.org/#%23defaultView%3AGraph%0ASELECT%20%3Fparent%20%3FparentLabel%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ16532287%20.%0A%20%20%3Fvirus%20wdt%3AP171%20%3Fparent%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0A)


### Resultados
<table>
  <tr>
    <td><b>parent</b></td>
    <td><b>virus</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694009">694009</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754693">Sarbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754693">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694009">694009</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/227859">227859</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754693">Sarbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754693">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/227859">227859</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1335626">1335626</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1335626">1335626</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16000326">SL-CoV-WIV1</a> (<a href="http://www.wikidata.org/entity/Q16000326">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415852">1415852</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/290028">290028</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/290028">290028</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16984813">London1_novel CoV 2012</a> (<a href="http://www.wikidata.org/entity/Q16984813">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16988144">Pipistrellus bat coronavirus HKU5</a> (<a href="http://www.wikidata.org/entity/Q16988144">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694008">694008</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16988144">Pipistrellus bat coronavirus HKU5</a> (<a href="http://www.wikidata.org/entity/Q16988144">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694008">694008</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16992344">Rousettus bat coronavirus HKU9</a> (<a href="http://www.wikidata.org/entity/Q16992344">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694006">694006</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754685">Nobecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754685">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16992344">Rousettus bat coronavirus HKU9</a> (<a href="http://www.wikidata.org/entity/Q16992344">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694006">694006</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16993274">Tylonycteris bat coronavirus HKU4</a> (<a href="http://www.wikidata.org/entity/Q16993274">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694007">694007</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16993274">Tylonycteris bat coronavirus HKU4</a> (<a href="http://www.wikidata.org/entity/Q16993274">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694007">694007</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18907882">Murine coronavirus</a> (<a href="http://www.wikidata.org/entity/Q18907882">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694005">694005</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18907882">Murine coronavirus</a> (<a href="http://www.wikidata.org/entity/Q18907882">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694005">694005</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18965332">Betacoronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q18965332">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694003">694003</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18965332">Betacoronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q18965332">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694003">694003</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808940">Hedgehog coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q24808940">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1965093">1965093</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808940">Hedgehog coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q24808940">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1965093">1965093</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509481">2509481</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754671">Hibecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754671">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509486">2509486</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509494">2509494</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754685">Nobecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754685">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509502">2509502</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754693">Sarbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754693">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509511">2509511</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754671">Hibecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754671">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57758339">Bat Hp-betacoronavirus Zhejiang2013</a> (<a href="http://www.wikidata.org/entity/Q57758339">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57773834">China Rattus coronavirus HKU24</a> (<a href="http://www.wikidata.org/entity/Q57773834">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501960">2501960</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754685">Nobecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754685">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57879935">Rousettus bat coronavirus GCCDC1</a> (<a href="http://www.wikidata.org/entity/Q57879935">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501962">2501962</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754693">Sarbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754693">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2697049">2697049</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q85438966">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q85939995">SHC014-CoV</a> (<a href="http://www.wikidata.org/entity/Q85939995">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415851">1415851</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88162038">Bat SARS coronavirus Rp1</a> (<a href="http://www.wikidata.org/entity/Q88162038">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/349342">349342</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88169973">SARS coronavirus B024</a> (<a href="http://www.wikidata.org/entity/Q88169973">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/305407">305407</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88383088">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q88383088">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/443239">443239</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89160148">Rabbit Coronavirus HKU14</a> (<a href="http://www.wikidata.org/entity/Q89160148">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1160968">1160968</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91513573">Erinaceus coronavirus</a> (<a href="http://www.wikidata.org/entity/Q91513573">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91556001">Coronavirus Neoromicia/PML-PHE1/RSA/2011</a> (<a href="http://www.wikidata.org/entity/Q91556001">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1368314">1368314</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91556362">Erinaceus hedgehog coronavirus HKU31</a> (<a href="http://www.wikidata.org/entity/Q91556362">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2664184">2664184</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91556617">Hp-BatCoV HKU25</a> (<a href="http://www.wikidata.org/entity/Q91556617">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91561236">RaTG13</a> (<a href="http://www.wikidata.org/entity/Q91561236">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2709072">2709072</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q92109519">Myodes coronavirus 2JL14</a> (<a href="http://www.wikidata.org/entity/Q92109519">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754685">Nobecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754685">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q92109575">Eidolon bat coronavirus C704</a> (<a href="http://www.wikidata.org/entity/Q92109575">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97709258">Bat SARS CoV Rf1/2004</a> (<a href="http://www.wikidata.org/entity/Q97709258">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/347537">347537</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97709416">Bat SARS CoV Rm1/2004</a> (<a href="http://www.wikidata.org/entity/Q97709416">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/347536">347536</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97709493">Bat SARS CoV Rp3/2004</a> (<a href="http://www.wikidata.org/entity/Q97709493">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/349344">349344</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104450895">variantes de SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104450895">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104857014">RmYN02</a> (<a href="http://www.wikidata.org/entity/Q104857014">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q105221659">Civet SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q105221659">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q105686530">RacCS203</a> (<a href="http://www.wikidata.org/entity/Q105686530">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q105759568">Rc-o319</a> (<a href="http://www.wikidata.org/entity/Q105759568">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q105759613">16BO133</a> (<a href="http://www.wikidata.org/entity/Q105759613">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q105759618">BtKY72</a> (<a href="http://www.wikidata.org/entity/Q105759618">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q105759623">BM48-31</a> (<a href="http://www.wikidata.org/entity/Q105759623">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q107248454">RpYN06</a> (<a href="http://www.wikidata.org/entity/Q107248454">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q107719644">RhGB01</a> (<a href="http://www.wikidata.org/entity/Q107719644">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q108616377">BANAL-52</a> (<a href="http://www.wikidata.org/entity/Q108616377">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q108616505">BANAL-103</a> (<a href="http://www.wikidata.org/entity/Q108616505">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16993274">Tylonycteris bat coronavirus HKU4</a> (<a href="http://www.wikidata.org/entity/Q16993274">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q123562955">TyRo-CoV-162275</a> (<a href="http://www.wikidata.org/entity/Q123562955">edit</a>)</td>
    <td></td>
  </tr>
</table>
## Ejemplos de código
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/allBetacoronaVirusesGraph.rq | sed 's+<lang/>+es+' > allBetacoronaVirusesGraph.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@allBetacoronaVirusesGraph.rq
```
Esta consulta SPARQL está disponible en CCZero.
