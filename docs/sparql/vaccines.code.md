# vaccines.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT DISTINCT ?vaccine ?vaccineLabel ?type ?typeLabel WHERE {
  VALUES ?for { wd:Q84263196 }
  ?vaccine wdt:P31 / wdt:P279? wd:Q134808 ;
           wdt:P1924 ?for .
  ?vaccine wdt:P31 ?type .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
} ORDER BY ASC(?vaccine) ASC(?type)
```
[run](https://query.wikidata.org/embed.html#SELECT%20DISTINCT%20%3Fvaccine%20%3FvaccineLabel%20%3Ftype%20%3FtypeLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Ffor%20%7B%20wd%3AQ84263196%20%7D%0A%20%20%3Fvaccine%20wdt%3AP31%20%2F%20wdt%3AP279%3F%20wd%3AQ134808%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1924%20%3Ffor%20.%0A%20%20%3Fvaccine%20wdt%3AP31%20%3Ftype%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%20ASC%28%3Ftype%29%0A) or [edit](https://query.wikidata.org/#SELECT%20DISTINCT%20%3Fvaccine%20%3FvaccineLabel%20%3Ftype%20%3FtypeLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Ffor%20%7B%20wd%3AQ84263196%20%7D%0A%20%20%3Fvaccine%20wdt%3AP31%20%2F%20wdt%3AP279%3F%20wd%3AQ134808%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1924%20%3Ffor%20.%0A%20%20%3Fvaccine%20wdt%3AP31%20%3Ftype%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%20ASC%28%3Ftype%29%0A)


### Output
<table>
  <tr>
    <td><b>vaccine</b></td>
    <td><b>type</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158012">Sanofi/GSK SARS-CoV-2 subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q100158012">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158012">Sanofi/GSK SARS-CoV-2 subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q100158012">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87719492">COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q87719492">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158012">Sanofi/GSK SARS-CoV-2 subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q100158012">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158012">Sanofi/GSK SARS-CoV-2 subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q100158012">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q98734151">funded product</a> (<a href="http://www.wikidata.org/entity/Q98734151">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158046">UB-612</a> (<a href="http://www.wikidata.org/entity/Q100158046">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158046">UB-612</a> (<a href="http://www.wikidata.org/entity/Q100158046">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87719492">COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q87719492">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158046">UB-612</a> (<a href="http://www.wikidata.org/entity/Q100158046">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158046">UB-612</a> (<a href="http://www.wikidata.org/entity/Q100158046">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q98734151">funded product</a> (<a href="http://www.wikidata.org/entity/Q98734151">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158616">RBD SARS-CoV-2 HBsAg VLP</a> (<a href="http://www.wikidata.org/entity/Q100158616">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158616">RBD SARS-CoV-2 HBsAg VLP</a> (<a href="http://www.wikidata.org/entity/Q100158616">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q58623657">virus-like particle vaccine</a> (<a href="http://www.wikidata.org/entity/Q58623657">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158616">RBD SARS-CoV-2 HBsAg VLP</a> (<a href="http://www.wikidata.org/entity/Q100158616">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87719492">COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q87719492">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246544">bacTRL-Spike</a> (<a href="http://www.wikidata.org/entity/Q101246544">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246544">bacTRL-Spike</a> (<a href="http://www.wikidata.org/entity/Q101246544">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q578537">DNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q578537">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246544">bacTRL-Spike</a> (<a href="http://www.wikidata.org/entity/Q101246544">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87719492">COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q87719492">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246544">bacTRL-Spike</a> (<a href="http://www.wikidata.org/entity/Q101246544">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q98734151">funded product</a> (<a href="http://www.wikidata.org/entity/Q98734151">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246625">hAd5-S-Fusion+N-ETSD</a> (<a href="http://www.wikidata.org/entity/Q101246625">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246625">hAd5-S-Fusion+N-ETSD</a> (<a href="http://www.wikidata.org/entity/Q101246625">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87719492">COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q87719492">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246625">hAd5-S-Fusion+N-ETSD</a> (<a href="http://www.wikidata.org/entity/Q101246625">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96841548">adenovirus-based vaccine</a> (<a href="http://www.wikidata.org/entity/Q96841548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246699">VXA-CoV2-1</a> (<a href="http://www.wikidata.org/entity/Q101246699">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246699">VXA-CoV2-1</a> (<a href="http://www.wikidata.org/entity/Q101246699">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87719492">COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q87719492">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246699">VXA-CoV2-1</a> (<a href="http://www.wikidata.org/entity/Q101246699">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96841548">adenovirus-based vaccine</a> (<a href="http://www.wikidata.org/entity/Q96841548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101251575">MVC-COV1901</a> (<a href="http://www.wikidata.org/entity/Q101251575">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101251575">MVC-COV1901</a> (<a href="http://www.wikidata.org/entity/Q101251575">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87719492">COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q87719492">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101251575">MVC-COV1901</a> (<a href="http://www.wikidata.org/entity/Q101251575">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87775025">mRNA-1273</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87775025">mRNA-1273</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q85795487">RNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q85795487">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87775025">mRNA-1273</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96695067">mRNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q96695067">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87775025">mRNA-1273</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q98734151">funded product</a> (<a href="http://www.wikidata.org/entity/Q98734151">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q95042269">AZD1222</a> (<a href="http://www.wikidata.org/entity/Q95042269">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q95042269">AZD1222</a> (<a href="http://www.wikidata.org/entity/Q95042269">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96841548">adenovirus-based vaccine</a> (<a href="http://www.wikidata.org/entity/Q96841548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q95042269">AZD1222</a> (<a href="http://www.wikidata.org/entity/Q95042269">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q98734151">funded product</a> (<a href="http://www.wikidata.org/entity/Q98734151">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96695265">Ad5-nCoV</a> (<a href="http://www.wikidata.org/entity/Q96695265">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96695265">Ad5-nCoV</a> (<a href="http://www.wikidata.org/entity/Q96695265">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87719492">COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q87719492">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96695265">Ad5-nCoV</a> (<a href="http://www.wikidata.org/entity/Q96695265">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96841548">adenovirus-based vaccine</a> (<a href="http://www.wikidata.org/entity/Q96841548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96695266">INO-4800</a> (<a href="http://www.wikidata.org/entity/Q96695266">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96695266">INO-4800</a> (<a href="http://www.wikidata.org/entity/Q96695266">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q578537">DNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q578537">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96695266">INO-4800</a> (<a href="http://www.wikidata.org/entity/Q96695266">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q98734151">funded product</a> (<a href="http://www.wikidata.org/entity/Q98734151">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154000">ZyCoV-D</a> (<a href="http://www.wikidata.org/entity/Q97154000">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154000">ZyCoV-D</a> (<a href="http://www.wikidata.org/entity/Q97154000">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q578537">DNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q578537">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154228">GX-19</a> (<a href="http://www.wikidata.org/entity/Q97154228">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154228">GX-19</a> (<a href="http://www.wikidata.org/entity/Q97154228">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q578537">DNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q578537">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154229">Beijing Institute of Biological Products COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154229">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154229">Beijing Institute of Biological Products COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154229">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3560939">inactivated vaccine</a> (<a href="http://www.wikidata.org/entity/Q3560939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154230">Wuhan Institute of Biological Products COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154230">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154230">Wuhan Institute of Biological Products COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154230">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3560939">inactivated vaccine</a> (<a href="http://www.wikidata.org/entity/Q3560939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154232">Institute of Medical Biology COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154232">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154232">Institute of Medical Biology COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154232">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3560939">inactivated vaccine</a> (<a href="http://www.wikidata.org/entity/Q3560939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154233">CoronaVac</a> (<a href="http://www.wikidata.org/entity/Q97154233">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154233">CoronaVac</a> (<a href="http://www.wikidata.org/entity/Q97154233">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3560939">inactivated vaccine</a> (<a href="http://www.wikidata.org/entity/Q3560939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154233">CoronaVac</a> (<a href="http://www.wikidata.org/entity/Q97154233">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q98734151">funded product</a> (<a href="http://www.wikidata.org/entity/Q98734151">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154235">NVX-Cov2373</a> (<a href="http://www.wikidata.org/entity/Q97154235">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154235">NVX-Cov2373</a> (<a href="http://www.wikidata.org/entity/Q97154235">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154235">NVX-Cov2373</a> (<a href="http://www.wikidata.org/entity/Q97154235">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q98734151">funded product</a> (<a href="http://www.wikidata.org/entity/Q98734151">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154236">Anhui Zhifei Longcom Biopharmaceutical COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154236">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154236">Anhui Zhifei Longcom Biopharmaceutical COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154236">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154237">COVAX-19</a> (<a href="http://www.wikidata.org/entity/Q97154237">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154237">COVAX-19</a> (<a href="http://www.wikidata.org/entity/Q97154237">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154238">SCB-2019</a> (<a href="http://www.wikidata.org/entity/Q97154238">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154238">SCB-2019</a> (<a href="http://www.wikidata.org/entity/Q97154238">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154238">SCB-2019</a> (<a href="http://www.wikidata.org/entity/Q97154238">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q98734151">funded product</a> (<a href="http://www.wikidata.org/entity/Q98734151">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154239">CVnCoV</a> (<a href="http://www.wikidata.org/entity/Q97154239">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154239">CVnCoV</a> (<a href="http://www.wikidata.org/entity/Q97154239">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q85795487">RNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q85795487">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154239">CVnCoV</a> (<a href="http://www.wikidata.org/entity/Q97154239">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q98734151">funded product</a> (<a href="http://www.wikidata.org/entity/Q98734151">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154240">BNT162b2</a> (<a href="http://www.wikidata.org/entity/Q97154240">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154240">BNT162b2</a> (<a href="http://www.wikidata.org/entity/Q97154240">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q85795487">RNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q85795487">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154240">BNT162b2</a> (<a href="http://www.wikidata.org/entity/Q97154240">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87719492">COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q87719492">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154240">BNT162b2</a> (<a href="http://www.wikidata.org/entity/Q97154240">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q98734151">funded product</a> (<a href="http://www.wikidata.org/entity/Q98734151">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154241">LNP-nCoVsaRNA</a> (<a href="http://www.wikidata.org/entity/Q97154241">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154241">LNP-nCoVsaRNA</a> (<a href="http://www.wikidata.org/entity/Q97154241">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q85795487">RNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q85795487">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154241">LNP-nCoVsaRNA</a> (<a href="http://www.wikidata.org/entity/Q97154241">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q98734151">funded product</a> (<a href="http://www.wikidata.org/entity/Q98734151">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154242">Arcov</a> (<a href="http://www.wikidata.org/entity/Q97154242">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154242">Arcov</a> (<a href="http://www.wikidata.org/entity/Q97154242">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q85795487">RNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q85795487">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154243">Medicago Inc. COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154243">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154243">Medicago Inc. COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154243">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q58623657">virus-like particle vaccine</a> (<a href="http://www.wikidata.org/entity/Q58623657">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98270627">Gam-COVID-Vac</a> (<a href="http://www.wikidata.org/entity/Q98270627">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98270627">Gam-COVID-Vac</a> (<a href="http://www.wikidata.org/entity/Q98270627">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96841548">adenovirus-based vaccine</a> (<a href="http://www.wikidata.org/entity/Q96841548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98652743">AG0301-COVID19</a> (<a href="http://www.wikidata.org/entity/Q98652743">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98652743">AG0301-COVID19</a> (<a href="http://www.wikidata.org/entity/Q98652743">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q578537">DNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q578537">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98655215">Ad26.COV2.S</a> (<a href="http://www.wikidata.org/entity/Q98655215">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98655215">Ad26.COV2.S</a> (<a href="http://www.wikidata.org/entity/Q98655215">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96841548">adenovirus-based vaccine</a> (<a href="http://www.wikidata.org/entity/Q96841548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98655215">Ad26.COV2.S</a> (<a href="http://www.wikidata.org/entity/Q98655215">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q98734151">funded product</a> (<a href="http://www.wikidata.org/entity/Q98734151">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98703813">Covaxin / BBV152</a> (<a href="http://www.wikidata.org/entity/Q98703813">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98703813">Covaxin / BBV152</a> (<a href="http://www.wikidata.org/entity/Q98703813">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3560939">inactivated vaccine</a> (<a href="http://www.wikidata.org/entity/Q3560939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98709202">Finlay-FR-1</a> (<a href="http://www.wikidata.org/entity/Q98709202">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98709202">Finlay-FR-1</a> (<a href="http://www.wikidata.org/entity/Q98709202">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98710728">University of Queensland COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q98710728">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98710728">University of Queensland COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q98710728">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98713328">Lunar-COV19</a> (<a href="http://www.wikidata.org/entity/Q98713328">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98713328">Lunar-COV19</a> (<a href="http://www.wikidata.org/entity/Q98713328">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q85795487">RNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q85795487">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98945351">GRAd-COV2</a> (<a href="http://www.wikidata.org/entity/Q98945351">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98945351">GRAd-COV2</a> (<a href="http://www.wikidata.org/entity/Q98945351">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96841548">adenovirus-based vaccine</a> (<a href="http://www.wikidata.org/entity/Q96841548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98947046">EpiVacCorona</a> (<a href="http://www.wikidata.org/entity/Q98947046">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98947046">EpiVacCorona</a> (<a href="http://www.wikidata.org/entity/Q98947046">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98947639">AdimrSC-2f</a> (<a href="http://www.wikidata.org/entity/Q98947639">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98947639">AdimrSC-2f</a> (<a href="http://www.wikidata.org/entity/Q98947639">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q99518269">QazCovid-in</a> (<a href="http://www.wikidata.org/entity/Q99518269">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q99518269">QazCovid-in</a> (<a href="http://www.wikidata.org/entity/Q99518269">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3560939">inactivated vaccine</a> (<a href="http://www.wikidata.org/entity/Q3560939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q99518966">V591</a> (<a href="http://www.wikidata.org/entity/Q99518966">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q99518966">V591</a> (<a href="http://www.wikidata.org/entity/Q99518966">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q99518999">replicating viral vector vaccine</a> (<a href="http://www.wikidata.org/entity/Q99518999">edit</a>)</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/vaccines.rq | sed 's+<lang/>+en+' > vaccines.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@vaccines.rq
```
This SPARQL query is available under CCZero.
