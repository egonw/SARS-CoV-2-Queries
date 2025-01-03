# allCoronaVirusesGraph.rq
**Ejemplos de código:** [curl](#curl)
### SPARQL
```sparql
#defaultView:Graph
SELECT ?parent ?parentLabel ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q57751738 .
  ?virus wdt:P171 ?parent .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "es,en". }
} ORDER BY ASC(?parent) ASC(?virus)
```
[ejecutar](https://query.wikidata.org/embed.html#%23defaultView%3AGraph%0ASELECT%20%3Fparent%20%3FparentLabel%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%3Fvirus%20wdt%3AP171%20%3Fparent%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fparent%29%20ASC%28%3Fvirus%29%0A) o [editar](https://query.wikidata.org/#%23defaultView%3AGraph%0ASELECT%20%3Fparent%20%3FparentLabel%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%3Fvirus%20wdt%3AP171%20%3Fparent%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fparent%29%20ASC%28%3Fvirus%29%0A)


### Resultados
<table>
  <tr>
    <td><b>parent</b></td>
    <td><b>virus</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q116151578">Amalacovirus</a> (<a href="http://www.wikidata.org/entity/Q116151578">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q116167171">Alphacoronavirus AMALF</a> (<a href="http://www.wikidata.org/entity/Q116167171">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q116167178">Alphacoronavirus HKU33</a> (<a href="http://www.wikidata.org/entity/Q116167178">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91559255">Tylonycteris bat coronavirus HKU33</a> (<a href="http://www.wikidata.org/entity/Q91559255">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2586420">2586420</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/290028">290028</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16988144">Pipistrellus bat coronavirus HKU5</a> (<a href="http://www.wikidata.org/entity/Q16988144">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694008">694008</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16992344">Rousettus bat coronavirus HKU9</a> (<a href="http://www.wikidata.org/entity/Q16992344">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694006">694006</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16993274">Tylonycteris bat coronavirus HKU4</a> (<a href="http://www.wikidata.org/entity/Q16993274">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694007">694007</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18907882">Murine coronavirus</a> (<a href="http://www.wikidata.org/entity/Q18907882">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694005">694005</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18965332">Betacoronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q18965332">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694003">694003</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808940">Hedgehog coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q24808940">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1965093">1965093</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694009">694009</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/227859">227859</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1335626">1335626</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91513573">Erinaceus coronavirus</a> (<a href="http://www.wikidata.org/entity/Q91513573">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91556617">Hp-BatCoV HKU25</a> (<a href="http://www.wikidata.org/entity/Q91556617">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q116151578">Amalacovirus</a> (<a href="http://www.wikidata.org/entity/Q116151578">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16023751">Virus de la diarrea porcina epidémica</a> (<a href="http://www.wikidata.org/entity/Q16023751">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/28295">28295</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/11137">11137</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16985780">Miniopterus bat coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q16985780">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694000">694000</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16985784">Miniopterus bat coronavirus HKU8</a> (<a href="http://www.wikidata.org/entity/Q16985784">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694001">694001</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16989092">Rhinolophus bat coronavirus HKU2</a> (<a href="http://www.wikidata.org/entity/Q16989092">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/693998">693998</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16992475">Scotophilus bat coronavirus 512</a> (<a href="http://www.wikidata.org/entity/Q16992475">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/693999">693999</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18965331">Alphacoronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q18965331">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/693997">693997</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808936">Bat coronavirus CDPHE15</a> (<a href="http://www.wikidata.org/entity/Q24808936">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1913643">1913643</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808938">Bat coronavirus HKU10</a> (<a href="http://www.wikidata.org/entity/Q24808938">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1244203">1244203</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808939">Mink coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q24808939">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1913642">1913642</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754582">Colacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754582">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509477">2509477</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754588">Decacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754588">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509479">2509479</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754596">Duvinacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754596">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509480">2509480</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754603">Luchacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754603">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509492">2509492</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754609">Minacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754609">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509496">2509496</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754617">Minunacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754617">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509497">2509497</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754626">Myotacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754626">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509500">2509500</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754632">Nyctacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754632">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509503">2509503</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754639">Pedacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754639">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509505">2509505</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754648">Rhinacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754648">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509509">2509509</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754656">Setracovirus</a> (<a href="http://www.wikidata.org/entity/Q57754656">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509512">2509512</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754662">Tegacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754662">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509514">2509514</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavirus Humana NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/277944">277944</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q92050731">Soracovirus</a> (<a href="http://www.wikidata.org/entity/Q92050731">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2733306">2733306</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q92050762">Sunacovirus</a> (<a href="http://www.wikidata.org/entity/Q92050762">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16848886">Bulbul coronavirus HKU11</a> (<a href="http://www.wikidata.org/entity/Q16848886">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/574549">574549</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16988426">Coronavirus HKU15</a> (<a href="http://www.wikidata.org/entity/Q16988426">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159905">1159905</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18965333">Munia coronavirus HKU13</a> (<a href="http://www.wikidata.org/entity/Q18965333">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1297661">1297661</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18965334">Thrush coronavirus HKU12</a> (<a href="http://www.wikidata.org/entity/Q18965334">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1297662">1297662</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808943">Common moorhen coronavirus HKU21</a> (<a href="http://www.wikidata.org/entity/Q24808943">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159902">1159902</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808946">Night heron coronavirus HKU19</a> (<a href="http://www.wikidata.org/entity/Q24808946">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159904">1159904</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808947">White-eye coronavirus HKU16</a> (<a href="http://www.wikidata.org/entity/Q24808947">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159907">1159907</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808948">Wigeon coronavirus HKU20</a> (<a href="http://www.wikidata.org/entity/Q24808948">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159908">1159908</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754699">Andecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754699">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509469">2509469</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754709">Buldecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754709">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509474">2509474</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754714">Herdecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754714">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509485">2509485</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754718">Moordecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754718">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509499">2509499</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91554593">sparrow coronavirus HKU17</a> (<a href="http://www.wikidata.org/entity/Q91554593">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16977225">Gammacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16977225">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18965335">Avian coronavirus</a> (<a href="http://www.wikidata.org/entity/Q18965335">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694014">694014</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16977225">Gammacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16977225">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18965336">Beluga whale coronavirus SW1</a> (<a href="http://www.wikidata.org/entity/Q18965336">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694015">694015</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16977225">Gammacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16977225">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754725">Cegacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754725">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509476">2509476</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16977225">Gammacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16977225">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57754734">Igacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754734">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509487">2509487</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16977225">Gammacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16977225">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91516543">Cetacean coronavirus</a> (<a href="http://www.wikidata.org/entity/Q91516543">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16977225">Gammacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16977225">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q92050800">Brangacovirus</a> (<a href="http://www.wikidata.org/entity/Q92050800">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88383088">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q88383088">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/443239">443239</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16993274">Tylonycteris bat coronavirus HKU4</a> (<a href="http://www.wikidata.org/entity/Q16993274">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q123562955">TyRo-CoV-162275</a> (<a href="http://www.wikidata.org/entity/Q123562955">edit</a>)</td>
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
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16000326">SL-CoV-WIV1</a> (<a href="http://www.wikidata.org/entity/Q16000326">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415852">1415852</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91561236">RaTG13</a> (<a href="http://www.wikidata.org/entity/Q91561236">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2709072">2709072</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q290805">Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q290805">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16023751">Virus de la diarrea porcina epidémica</a> (<a href="http://www.wikidata.org/entity/Q16023751">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/28295">28295</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q290805">Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q290805">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/11137">11137</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q290805">Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q290805">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavirus Humana NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/277944">277944</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16984813">London1_novel CoV 2012</a> (<a href="http://www.wikidata.org/entity/Q16984813">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91556001">Coronavirus Neoromicia/PML-PHE1/RSA/2011</a> (<a href="http://www.wikidata.org/entity/Q91556001">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1368314">1368314</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57751738">Orthocoronavirinae</a> (<a href="http://www.wikidata.org/entity/Q57751738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694002">694002</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57751738">Orthocoronavirinae</a> (<a href="http://www.wikidata.org/entity/Q57751738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16908525">Alphacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16908525">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/693996">693996</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57751738">Orthocoronavirinae</a> (<a href="http://www.wikidata.org/entity/Q57751738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16955738">Deltacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16955738">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159901">1159901</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57751738">Orthocoronavirinae</a> (<a href="http://www.wikidata.org/entity/Q57751738">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16977225">Gammacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16977225">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694013">694013</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754582">Colacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754582">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808936">Bat coronavirus CDPHE15</a> (<a href="http://www.wikidata.org/entity/Q24808936">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1913643">1913643</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754588">Decacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754588">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q116167173">Alphacoronavirus CHB25</a> (<a href="http://www.wikidata.org/entity/Q116167173">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754588">Decacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754588">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q116167175">Alphacoronavirus WA3607</a> (<a href="http://www.wikidata.org/entity/Q116167175">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754588">Decacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754588">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808938">Bat coronavirus HKU10</a> (<a href="http://www.wikidata.org/entity/Q24808938">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1244203">1244203</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754588">Decacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754588">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57758320">Rhinolophus ferrumequinum alphacoronavirus HuB-2013</a> (<a href="http://www.wikidata.org/entity/Q57758320">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501926">2501926</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754588">Decacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754588">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91560228">Rhinolophus bat coronavirus HKU32</a> (<a href="http://www.wikidata.org/entity/Q91560228">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2586419">2586419</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754588">Decacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754588">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91560702">Rousettus bat coronavirus HKU10</a> (<a href="http://www.wikidata.org/entity/Q91560702">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1241933">1241933</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754596">Duvinacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754596">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/11137">11137</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754603">Luchacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754603">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57773819">Lucheng Rn rat coronavirus</a> (<a href="http://www.wikidata.org/entity/Q57773819">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1508224">1508224</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754609">Minacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754609">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808939">Mink coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q24808939">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1913642">1913642</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754609">Minacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754609">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57773822">Ferret coronavirus</a> (<a href="http://www.wikidata.org/entity/Q57773822">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1264898">1264898</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754617">Minunacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754617">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16985780">Miniopterus bat coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q16985780">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694000">694000</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754617">Minunacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754617">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16985784">Miniopterus bat coronavirus HKU8</a> (<a href="http://www.wikidata.org/entity/Q16985784">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694001">694001</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754626">Myotacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754626">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57758326">Myotis ricketti alphacoronavirus Sax-2011</a> (<a href="http://www.wikidata.org/entity/Q57758326">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501927">2501927</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754632">Nyctacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754632">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q116167178">Alphacoronavirus HKU33</a> (<a href="http://www.wikidata.org/entity/Q116167178">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754632">Nyctacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754632">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q116167181">Alphacoronavirus WA2028</a> (<a href="http://www.wikidata.org/entity/Q116167181">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754632">Nyctacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754632">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57758332">Nyctalus velutinus alphacoronavirus SC-2013</a> (<a href="http://www.wikidata.org/entity/Q57758332">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501928">2501928</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754632">Nyctacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754632">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q92109366">Pipistrellus kuhlii coronavirus 3398</a> (<a href="http://www.wikidata.org/entity/Q92109366">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754639">Pedacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754639">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q116167182">Alphacoronavirus BT020</a> (<a href="http://www.wikidata.org/entity/Q116167182">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754639">Pedacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754639">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q116167183">Alphacoronavirus WA1087</a> (<a href="http://www.wikidata.org/entity/Q116167183">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754639">Pedacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754639">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16023751">Virus de la diarrea porcina epidémica</a> (<a href="http://www.wikidata.org/entity/Q16023751">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/28295">28295</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754639">Pedacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754639">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16992475">Scotophilus bat coronavirus 512</a> (<a href="http://www.wikidata.org/entity/Q16992475">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/693999">693999</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754648">Rhinacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754648">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16989092">Rhinolophus bat coronavirus HKU2</a> (<a href="http://www.wikidata.org/entity/Q16989092">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/693998">693998</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754648">Rhinacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754648">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q55643348">Swine acute diarrhea syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q55643348">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2032731">2032731</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754656">Setracovirus</a> (<a href="http://www.wikidata.org/entity/Q57754656">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57773827">NL63-related bat coronavirus strain BtKYNL63-9b</a> (<a href="http://www.wikidata.org/entity/Q57773827">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501929">2501929</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754656">Setracovirus</a> (<a href="http://www.wikidata.org/entity/Q57754656">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavirus Humana NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/277944">277944</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754662">Tegacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754662">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q106918177">Canine coronavirus HuPn-2018</a> (<a href="http://www.wikidata.org/entity/Q106918177">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754662">Tegacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754662">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18965331">Alphacoronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q18965331">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/693997">693997</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/290028">290028</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18907882">Murine coronavirus</a> (<a href="http://www.wikidata.org/entity/Q18907882">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694005">694005</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18965332">Betacoronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q18965332">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694003">694003</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57773834">China Rattus coronavirus HKU24</a> (<a href="http://www.wikidata.org/entity/Q57773834">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501960">2501960</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q89160148">Rabbit Coronavirus HKU14</a> (<a href="http://www.wikidata.org/entity/Q89160148">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1160968">1160968</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q92109519">Myodes coronavirus 2JL14</a> (<a href="http://www.wikidata.org/entity/Q92109519">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754671">Hibecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754671">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57758339">Bat Hp-betacoronavirus Zhejiang2013</a> (<a href="http://www.wikidata.org/entity/Q57758339">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16988144">Pipistrellus bat coronavirus HKU5</a> (<a href="http://www.wikidata.org/entity/Q16988144">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694008">694008</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16993274">Tylonycteris bat coronavirus HKU4</a> (<a href="http://www.wikidata.org/entity/Q16993274">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694007">694007</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808940">Hedgehog coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q24808940">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1965093">1965093</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1335626">1335626</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91556362">Erinaceus hedgehog coronavirus HKU31</a> (<a href="http://www.wikidata.org/entity/Q91556362">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2664184">2664184</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754685">Nobecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754685">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16992344">Rousettus bat coronavirus HKU9</a> (<a href="http://www.wikidata.org/entity/Q16992344">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694006">694006</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754685">Nobecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754685">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57879935">Rousettus bat coronavirus GCCDC1</a> (<a href="http://www.wikidata.org/entity/Q57879935">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501962">2501962</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754685">Nobecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754685">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q92109575">Eidolon bat coronavirus C704</a> (<a href="http://www.wikidata.org/entity/Q92109575">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754693">Sarbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754693">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694009">694009</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754693">Sarbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754693">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/227859">227859</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754693">Sarbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754693">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2697049">2697049</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754699">Andecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754699">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808948">Wigeon coronavirus HKU20</a> (<a href="http://www.wikidata.org/entity/Q24808948">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159908">1159908</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754709">Buldecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754709">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16848886">Bulbul coronavirus HKU11</a> (<a href="http://www.wikidata.org/entity/Q16848886">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/574549">574549</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754709">Buldecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754709">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q16988426">Coronavirus HKU15</a> (<a href="http://www.wikidata.org/entity/Q16988426">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159905">1159905</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754709">Buldecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754709">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18965333">Munia coronavirus HKU13</a> (<a href="http://www.wikidata.org/entity/Q18965333">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1297661">1297661</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754709">Buldecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754709">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808943">Common moorhen coronavirus HKU21</a> (<a href="http://www.wikidata.org/entity/Q24808943">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159902">1159902</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754709">Buldecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754709">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808947">White-eye coronavirus HKU16</a> (<a href="http://www.wikidata.org/entity/Q24808947">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159907">1159907</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754709">Buldecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754709">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91554349">Quail coronavirus UAE-HKU30</a> (<a href="http://www.wikidata.org/entity/Q91554349">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2078581">2078581</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754709">Buldecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754709">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q91555774">FalCoV UAE-HKU27</a> (<a href="http://www.wikidata.org/entity/Q91555774">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2078576">2078576</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754714">Herdecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754714">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808946">Night heron coronavirus HKU19</a> (<a href="http://www.wikidata.org/entity/Q24808946">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159904">1159904</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754718">Moordecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754718">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q24808943">Common moorhen coronavirus HKU21</a> (<a href="http://www.wikidata.org/entity/Q24808943">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1159902">1159902</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754725">Cegacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754725">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18965336">Beluga whale coronavirus SW1</a> (<a href="http://www.wikidata.org/entity/Q18965336">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694015">694015</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754734">Igacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754734">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18965335">Avian coronavirus</a> (<a href="http://www.wikidata.org/entity/Q18965335">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694014">694014</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754734">Igacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754734">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q92109690">Avian coronavirus 9203</a> (<a href="http://www.wikidata.org/entity/Q92109690">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754734">Igacovirus</a> (<a href="http://www.wikidata.org/entity/Q57754734">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q92109737">Duck coronavirus 2714</a> (<a href="http://www.wikidata.org/entity/Q92109737">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104450895">variantes de SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104450895">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92050731">Soracovirus</a> (<a href="http://www.wikidata.org/entity/Q92050731">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q92109416">Sorex araneus coronavirus T14</a> (<a href="http://www.wikidata.org/entity/Q92109416">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92050762">Sunacovirus</a> (<a href="http://www.wikidata.org/entity/Q92050762">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q92109468">Suncus murinus coronavirus X74</a> (<a href="http://www.wikidata.org/entity/Q92109468">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92050800">Brangacovirus</a> (<a href="http://www.wikidata.org/entity/Q92050800">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q92109633">Goose coronavirus CB17</a> (<a href="http://www.wikidata.org/entity/Q92109633">edit</a>)</td>
    <td></td>
  </tr>
</table>
## Ejemplos de código
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/allCoronaVirusesGraph.rq | sed 's+<lang/>+es+' > allCoronaVirusesGraph.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@allCoronaVirusesGraph.rq
```
Esta consulta SPARQL está disponible en CCZero.
