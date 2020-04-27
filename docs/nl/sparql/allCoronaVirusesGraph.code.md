# allCoronaVirusesGraph.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
#defaultView:Graph
SELECT ?parent ?parentLabel ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q57751738 .
  ?virus wdt:P171 ?parent .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "nl,en". }
}
```
[uitvoeren](https://query.wikidata.org/embed.html#%23defaultView%3AGraph%0ASELECT%20%3Fparent%20%3FparentLabel%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%3Fvirus%20wdt%3AP171%20%3Fparent%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0A) of [bewerken](https://query.wikidata.org/#%23defaultView%3AGraph%0ASELECT%20%3Fparent%20%3FparentLabel%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%3Fvirus%20wdt%3AP171%20%3Fparent%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0A)


### Resultaten
<table>
  <tr>
    <td><b>parent</b></td>
    <td><b>virus</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754656">Setracovirus</a> (<a href="http://www.wikidata.org/entity/Q57754656">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57773827">NL63-related bat coronavirus strain BtKYNL63-9b</a> (<a href="http://www.wikidata.org/entity/Q57773827">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501929">2501929</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57773834">China Rattus coronavirus HKU24</a> (<a href="http://www.wikidata.org/entity/Q57773834">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501960">2501960</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754685">Nobecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754685">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57879935">Rousettus bat coronavirus GCCDC1</a> (<a href="http://www.wikidata.org/entity/Q57879935">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501962">2501962</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2697049">2697049</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85939995">Bat SARS-like coronavirus RsSHC014</a> (<a href="http://www.wikidata.org/entity/Q85939995">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415851">1415851</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q34967815">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q34967815">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88162038">Bat SARS coronavirus Rp1</a> (<a href="http://www.wikidata.org/entity/Q88162038">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/349342">349342</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88383088">Human coronavirus HKU1 (isolate N1)</a> (<a href="http://www.wikidata.org/entity/Q88383088">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/443239">443239</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694009">694009</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754693">Sarbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754693">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694009">694009</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1335626">1335626</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1335626">1335626</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q290805">Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q290805">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Menselijk Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/277944">277944</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Menselijk Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/277944">277944</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754656">Setracovirus</a> (<a href="http://www.wikidata.org/entity/Q57754656">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Menselijk Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/277944">277944</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q34967815">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q34967815">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16000326">SL-CoV-WIV1</a> (<a href="http://www.wikidata.org/entity/Q16000326">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415852">1415852</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q290805">Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q290805">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16023751">Porcine epidemic diarrhea virus</a> (<a href="http://www.wikidata.org/entity/Q16023751">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/28295">28295</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16023751">Porcine epidemic diarrhea virus</a> (<a href="http://www.wikidata.org/entity/Q16023751">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/28295">28295</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754639">Pedacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754639">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16023751">Porcine epidemic diarrhea virus</a> (<a href="http://www.wikidata.org/entity/Q16023751">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/28295">28295</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57751738">Orthocoronavirinae</a> (<a href="http://www.wikidata.org/entity/Q57751738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694002">694002</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16848886">Bulbul coronavirus HKU11</a> (<a href="http://www.wikidata.org/entity/Q16848886">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/574549">574549</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754709">Buldecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754709">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16848886">Bulbul coronavirus HKU11</a> (<a href="http://www.wikidata.org/entity/Q16848886">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/574549">574549</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57751738">Orthocoronavirinae</a> (<a href="http://www.wikidata.org/entity/Q57751738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/693996">693996</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57751738">Orthocoronavirinae</a> (<a href="http://www.wikidata.org/entity/Q57751738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159901">1159901</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57751738">Orthocoronavirinae</a> (<a href="http://www.wikidata.org/entity/Q57751738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16977225">Gammacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16977225">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694013">694013</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q290805">Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q290805">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/11137">11137</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/11137">11137</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754596">Duvinacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754596">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/11137">11137</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q290805">Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q290805">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/290028">290028</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/290028">290028</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/290028">290028</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16984813">London1 novel CoV/2012</a> (<a href="http://www.wikidata.org/entity/Q16984813">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16985780">Miniopterus bat coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q16985780">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694000">694000</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754617">Minunacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754617">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16985780">Miniopterus bat coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q16985780">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694000">694000</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16985784">Miniopterus bat coronavirus HKU8</a> (<a href="http://www.wikidata.org/entity/Q16985784">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694001">694001</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754617">Minunacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754617">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16985784">Miniopterus bat coronavirus HKU8</a> (<a href="http://www.wikidata.org/entity/Q16985784">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694001">694001</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16988144">Pipistrellus bat coronavirus HKU5</a> (<a href="http://www.wikidata.org/entity/Q16988144">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694008">694008</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16988144">Pipistrellus bat coronavirus HKU5</a> (<a href="http://www.wikidata.org/entity/Q16988144">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694008">694008</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16988426">Porcine coronavirus HKU15</a> (<a href="http://www.wikidata.org/entity/Q16988426">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159905">1159905</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16989092">Rhinolophus bat coronavirus HKU2</a> (<a href="http://www.wikidata.org/entity/Q16989092">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/693998">693998</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754648">Rhinacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754648">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16989092">Rhinolophus bat coronavirus HKU2</a> (<a href="http://www.wikidata.org/entity/Q16989092">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/693998">693998</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16992344">Rousettus bat coronavirus HKU9</a> (<a href="http://www.wikidata.org/entity/Q16992344">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694006">694006</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754685">Nobecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754685">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16992344">Rousettus bat coronavirus HKU9</a> (<a href="http://www.wikidata.org/entity/Q16992344">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694006">694006</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16992475">Scotophilus bat coronavirus 512</a> (<a href="http://www.wikidata.org/entity/Q16992475">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/693999">693999</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754639">Pedacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754639">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16992475">Scotophilus bat coronavirus 512</a> (<a href="http://www.wikidata.org/entity/Q16992475">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/693999">693999</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16993274">Tylonycteris bat coronavirus HKU4</a> (<a href="http://www.wikidata.org/entity/Q16993274">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694007">694007</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16993274">Tylonycteris bat coronavirus HKU4</a> (<a href="http://www.wikidata.org/entity/Q16993274">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694007">694007</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18907882">Murine coronavirus</a> (<a href="http://www.wikidata.org/entity/Q18907882">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694005">694005</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18907882">Murine coronavirus</a> (<a href="http://www.wikidata.org/entity/Q18907882">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694005">694005</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18965331">Alphacoronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q18965331">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/693997">693997</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754662">Tegacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754662">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18965331">Alphacoronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q18965331">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/693997">693997</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18965332">Betacoronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q18965332">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694003">694003</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18965332">Betacoronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q18965332">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694003">694003</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18965333">Munia coronavirus HKU13</a> (<a href="http://www.wikidata.org/entity/Q18965333">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1297661">1297661</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754709">Buldecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754709">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18965333">Munia coronavirus HKU13</a> (<a href="http://www.wikidata.org/entity/Q18965333">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1297661">1297661</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18965334">Thrush coronavirus HKU12</a> (<a href="http://www.wikidata.org/entity/Q18965334">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1297662">1297662</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16977225">Gammacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16977225">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18965335">Avian coronavirus</a> (<a href="http://www.wikidata.org/entity/Q18965335">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694014">694014</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754734">Igacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754734">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18965335">Avian coronavirus</a> (<a href="http://www.wikidata.org/entity/Q18965335">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694014">694014</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16977225">Gammacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16977225">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18965336">Beluga whale coronavirus SW1</a> (<a href="http://www.wikidata.org/entity/Q18965336">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694015">694015</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754725">Cegacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754725">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18965336">Beluga whale coronavirus SW1</a> (<a href="http://www.wikidata.org/entity/Q18965336">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694015">694015</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808936">Bat coronavirus CDPHE15</a> (<a href="http://www.wikidata.org/entity/Q24808936">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1913643">1913643</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754582">Colacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754582">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808936">Bat coronavirus CDPHE15</a> (<a href="http://www.wikidata.org/entity/Q24808936">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1913643">1913643</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808938">Bat coronavirus HKU10</a> (<a href="http://www.wikidata.org/entity/Q24808938">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1244203">1244203</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754588">Decacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754588">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808938">Bat coronavirus HKU10</a> (<a href="http://www.wikidata.org/entity/Q24808938">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1244203">1244203</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808939">Mink coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q24808939">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1913642">1913642</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754609">Minacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754609">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808939">Mink coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q24808939">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1913642">1913642</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808940">Hedgehog coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q24808940">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1965093">1965093</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808940">Hedgehog coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q24808940">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1965093">1965093</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808943">Common moorhen coronavirus HKU21</a> (<a href="http://www.wikidata.org/entity/Q24808943">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159902">1159902</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754718">Moordecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754718">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808943">Common moorhen coronavirus HKU21</a> (<a href="http://www.wikidata.org/entity/Q24808943">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159902">1159902</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808944">Coronavirus HKU15</a> (<a href="http://www.wikidata.org/entity/Q24808944">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754709">Buldecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754709">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808944">Coronavirus HKU15</a> (<a href="http://www.wikidata.org/entity/Q24808944">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808946">Night heron coronavirus HKU19</a> (<a href="http://www.wikidata.org/entity/Q24808946">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159904">1159904</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754714">Herdecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754714">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808946">Night heron coronavirus HKU19</a> (<a href="http://www.wikidata.org/entity/Q24808946">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159904">1159904</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808947">White-eye coronavirus HKU16</a> (<a href="http://www.wikidata.org/entity/Q24808947">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159907">1159907</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754709">Buldecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754709">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808947">White-eye coronavirus HKU16</a> (<a href="http://www.wikidata.org/entity/Q24808947">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159907">1159907</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808948">Wigeon coronavirus HKU20</a> (<a href="http://www.wikidata.org/entity/Q24808948">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159908">1159908</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754699">Andecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754699">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24808948">Wigeon coronavirus HKU20</a> (<a href="http://www.wikidata.org/entity/Q24808948">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159908">1159908</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34967815">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q34967815">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/227859">227859</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754582">Colacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754582">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509477">2509477</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754588">Decacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754588">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509479">2509479</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754596">Duvinacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754596">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509480">2509480</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754603">Luchacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754603">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509492">2509492</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754609">Minacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754609">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509496">2509496</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754617">Minunacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754617">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509497">2509497</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754626">Myotacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754626">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509500">2509500</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754632">Nyctacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754632">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509503">2509503</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754639">Pedacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754639">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509505">2509505</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754648">Rhinacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754648">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509509">2509509</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754656">Setracovirus</a> (<a href="http://www.wikidata.org/entity/Q57754656">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509512">2509512</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754662">Tegacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754662">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509514">2509514</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509481">2509481</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754671">Hibecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754671">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509486">2509486</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509494">2509494</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754685">Nobecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754685">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509502">2509502</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754693">Sarbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754693">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509511">2509511</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754699">Andecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754699">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509469">2509469</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754709">Buldecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754709">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509474">2509474</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754714">Herdecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754714">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509485">2509485</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754718">Moordecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754718">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509499">2509499</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16977225">Gammacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16977225">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754725">Cegacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754725">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509476">2509476</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16977225">Gammacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16977225">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754734">Igacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754734">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509487">2509487</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754588">Decacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754588">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57758320">Rhinolophus ferrumequinum alphacoronavirus HuB-2013</a> (<a href="http://www.wikidata.org/entity/Q57758320">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501926">2501926</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754626">Myotacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754626">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57758326">Myotis ricketti alphacoronavirus Sax-2011</a> (<a href="http://www.wikidata.org/entity/Q57758326">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501927">2501927</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754632">Nyctacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754632">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57758332">Nyctalus velutinus alphacoronavirus SC-2013</a> (<a href="http://www.wikidata.org/entity/Q57758332">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501928">2501928</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754671">Hibecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754671">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57758339">Bat Hp-betacoronavirus Zhejiang2013</a> (<a href="http://www.wikidata.org/entity/Q57758339">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754603">Luchacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754603">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57773819">Lucheng Rn rat coronavirus</a> (<a href="http://www.wikidata.org/entity/Q57773819">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1508224">1508224</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q57754609">Minacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754609">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57773822">Ferret coronavirus</a> (<a href="http://www.wikidata.org/entity/Q57773822">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1264898">1264898</a></td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -o allCoronaVirusesGraph.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/allCoronaVirusesGraph.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@allCoronaVirusesGraph.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
