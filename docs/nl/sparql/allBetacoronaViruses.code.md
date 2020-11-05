# allBetacoronaViruses.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q16532287 .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "nl,en". }
} ORDER BY ?virusLabel
```
[uitvoeren](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ16532287%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20%3FvirusLabel%0A) of [bewerken](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ16532287%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20%3FvirusLabel%0A)


### Resultaten
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91561236">BatCoV RaTG13</a> (<a href="http://www.wikidata.org/entity/Q91561236">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2709072">2709072</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57758339">Bat Hp-betacoronavirus Zhejiang2013</a> (<a href="http://www.wikidata.org/entity/Q57758339">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97709258">Bat SARS CoV Rf1</a> (<a href="http://www.wikidata.org/entity/Q97709258">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/347537">347537</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97709416">Bat SARS CoV Rm1</a> (<a href="http://www.wikidata.org/entity/Q97709416">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/347536">347536</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97709493">Bat SARS CoV Rp3</a> (<a href="http://www.wikidata.org/entity/Q97709493">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/349344">349344</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88162038">Bat SARS coronavirus Rp1</a> (<a href="http://www.wikidata.org/entity/Q88162038">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/349342">349342</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85939995">Bat SARS-like coronavirus RsSHC014</a> (<a href="http://www.wikidata.org/entity/Q85939995">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415851">1415851</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q18965332">Betacoronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q18965332">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694003">694003</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57773834">China Rattus coronavirus HKU24</a> (<a href="http://www.wikidata.org/entity/Q57773834">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501960">2501960</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92109575">Eidolon bat coronavirus C704</a> (<a href="http://www.wikidata.org/entity/Q92109575">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754667">Embecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754667">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509481">2509481</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91556362">Erinaceus amurensis hedgehog coronavirus HKU31</a> (<a href="http://www.wikidata.org/entity/Q91556362">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q24808940">Hedgehog coronavirus 1</a> (<a href="http://www.wikidata.org/entity/Q24808940">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1965093">1965093</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754671">Hibecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754671">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509486">2509486</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91556617">Hp-BatCoV HKU25</a> (<a href="http://www.wikidata.org/entity/Q91556617">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88383088">Human coronavirus HKU1 (isolate N1)</a> (<a href="http://www.wikidata.org/entity/Q88383088">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/443239">443239</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16984813">London1_novel CoV 2012</a> (<a href="http://www.wikidata.org/entity/Q16984813">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/290028">290028</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754679">Merbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754679">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509494">2509494</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1335626">1335626</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q18907882">Murine coronavirus</a> (<a href="http://www.wikidata.org/entity/Q18907882">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694005">694005</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q92109519">Myodes coronavirus 2JL14</a> (<a href="http://www.wikidata.org/entity/Q92109519">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754685">Nobecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754685">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509502">2509502</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16988144">Pipistrellus bat coronavirus HKU5</a> (<a href="http://www.wikidata.org/entity/Q16988144">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694008">694008</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89160148">Rabbit Coronavirus HKU14</a> (<a href="http://www.wikidata.org/entity/Q89160148">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57879935">Rousettus bat coronavirus GCCDC1</a> (<a href="http://www.wikidata.org/entity/Q57879935">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2501962">2501962</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16992344">Rousettus bat coronavirus HKU9</a> (<a href="http://www.wikidata.org/entity/Q16992344">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694006">694006</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2697049">2697049</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694009">694009</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/227859">227859</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16000326">SL-CoV-WIV1</a> (<a href="http://www.wikidata.org/entity/Q16000326">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415852">1415852</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57754693">Sarbecovirus</a> (<a href="http://www.wikidata.org/entity/Q57754693">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2509511">2509511</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16993274">Tylonycteris bat coronavirus HKU4</a> (<a href="http://www.wikidata.org/entity/Q16993274">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694007">694007</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td></td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/allBetacoronaViruses.rq | sed 's+<lang/>+nl+' > allBetacoronaViruses.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@allBetacoronaViruses.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
