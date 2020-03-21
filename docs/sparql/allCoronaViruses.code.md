# allCoronaViruses.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q57751738 .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>virusLabel</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q278567</td>
    <td>severe acute respiratory syndrome-related coronavirus</td>
    <td>694009</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q454829</td>
    <td>Feline coronavirus</td>
    <td>12663</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q2117529</td>
    <td>Puffinosis coronavirus</td>
    <td>76583</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q2132904</td>
    <td>Rat coronavirus</td>
    <td>31632</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q3560916</td>
    <td>Avian infectious bronchitis virus</td>
    <td>11120</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q4902157</td>
    <td>Middle East respiratory syndrome coronavirus</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q4950554</td>
    <td>Bovine coronavirus</td>
    <td>11128</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q5032409</td>
    <td>Canine coronavirus</td>
    <td>11153</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q6926073</td>
    <td>Mouse hepatitis virus</td>
    <td>11138</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q7834605</td>
    <td>Transmissible gastroenteritis coronavirus</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q7855142</td>
    <td>Turkey coronavirus</td>
    <td>11152</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q8351095</td>
    <td>Human Coronavirus NL63</td>
    <td>277944</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16000326</td>
    <td>SL-CoV-WIV1</td>
    <td>1415852</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16023751</td>
    <td>Porcine epidemic diarrhea virus</td>
    <td>28295</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16532287</td>
    <td>Betacoronavirus</td>
    <td>694002</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16848886</td>
    <td>Bulbul coronavirus HKU11</td>
    <td>574549</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16908525</td>
    <td>Alphacoronavirus</td>
    <td>693996</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16955738</td>
    <td>Deltacoronavirus</td>
    <td>1159901</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16977225</td>
    <td>Gammacoronavirus</td>
    <td>694013</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16983356</td>
    <td>Human coronavirus 229E</td>
    <td>11137</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16983360</td>
    <td>Human coronavirus HKU1</td>
    <td>290028</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16984813</td>
    <td>London1 novel CoV/2012</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16985780</td>
    <td>Miniopterus Bat coronavirus 1</td>
    <td>694000</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16985784</td>
    <td>Miniopterus Bat coronavirus HKU8</td>
    <td>694001</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16988144</td>
    <td>Pipistrellus bat coronavirus HKU5</td>
    <td>694008</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16988426</td>
    <td>Porcine coronavirus HKU15</td>
    <td>1159905</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16989092</td>
    <td>Rhinolophus Bat coronavirus HKU2</td>
    <td>693998</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16991954</td>
    <td>Human coronavirus OC43</td>
    <td>31631</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16992344</td>
    <td>Rousettus bat coronavirus HKU9</td>
    <td>694006</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16992475</td>
    <td>Scotophilus Bat coronavirus 512</td>
    <td>693999</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16993274</td>
    <td>Tylonycteris bat coronavirus HKU4</td>
    <td>694007</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q18907882</td>
    <td>Murine coronavirus</td>
    <td>694005</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q18965331</td>
    <td>Alphacoronavirus 1</td>
    <td>693997</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q18965332</td>
    <td>Betacoronavirus 1</td>
    <td>694003</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q18965333</td>
    <td>Munia coronavirus HKU13</td>
    <td>1297661</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q18965334</td>
    <td>Thrush coronavirus HKU12</td>
    <td>1297662</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q18965335</td>
    <td>Avian coronavirus</td>
    <td>694014</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q18965336</td>
    <td>Beluga whale coronavirus SW1</td>
    <td>694015</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q22103916</td>
    <td>Pigeon coronavirus</td>
    <td>300189</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808936</td>
    <td>Bat coronavirus CDPHE15</td>
    <td>1913643</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808938</td>
    <td>Bat coronavirus HKU10</td>
    <td>1244203</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808939</td>
    <td>Mink coronavirus 1</td>
    <td>1913642</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808940</td>
    <td>Hedgehog coronavirus 1</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808941</td>
    <td>Middle East respiratory syndrome-related coronavirus</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808943</td>
    <td>Common moorhen coronavirus HKU21</td>
    <td>1159902</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808944</td>
    <td>Coronavirus HKU15</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808946</td>
    <td>Night heron coronavirus HKU19</td>
    <td>1159904</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808947</td>
    <td>White-eye coronavirus HKU16</td>
    <td>1159907</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808948</td>
    <td>Wigeon coronavirus HKU20</td>
    <td>1159908</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q34967815</td>
    <td>SARS coronavirus</td>
    <td>227859</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754582</td>
    <td>Colacovirus</td>
    <td>2509477</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754588</td>
    <td>Decacovirus</td>
    <td>2509479</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754596</td>
    <td>Duvinacovirus</td>
    <td>2509480</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754603</td>
    <td>Luchacovirus</td>
    <td>2509492</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754609</td>
    <td>Minacovirus</td>
    <td>2509496</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754617</td>
    <td>Minunacovirus</td>
    <td>2509497</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754626</td>
    <td>Myotacovirus</td>
    <td>2509500</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754632</td>
    <td>Nyctacovirus</td>
    <td>2509503</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754639</td>
    <td>Pedacovirus</td>
    <td>2509505</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754648</td>
    <td>Rhinacovirus</td>
    <td>2509509</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754656</td>
    <td>Setracovirus</td>
    <td>2509512</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754662</td>
    <td>Tegacovirus</td>
    <td>2509514</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754667</td>
    <td>Embecovirus</td>
    <td>2509481</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754671</td>
    <td>Hibecovirus</td>
    <td>2509486</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754679</td>
    <td>Merbecovirus</td>
    <td>2509494</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754685</td>
    <td>Nobecovirus</td>
    <td>2509502</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754693</td>
    <td>Sarbecovirus</td>
    <td>2509511</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754699</td>
    <td>Andecovirus</td>
    <td>2509469</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754709</td>
    <td>Buldecovirus</td>
    <td>2509474</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754714</td>
    <td>Herdecovirus</td>
    <td>2509485</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754718</td>
    <td>Moordecovirus</td>
    <td>2509499</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754725</td>
    <td>Cegacovirus</td>
    <td>2509476</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754734</td>
    <td>Igacovirus</td>
    <td>2509487</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57758320</td>
    <td>Rhinolophus ferrumequinum alphacoronavirus HuB-2013</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57758326</td>
    <td>Myotis ricketti alphacoronavirus Sax-2011</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57758332</td>
    <td>Nyctalus velutinus alphacoronavirus SC-2013</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57758339</td>
    <td>Bat Hp-betacoronavirus Zhejiang2013</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57773819</td>
    <td>Lucheng Rn rat coronavirus</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57773822</td>
    <td>Ferret coronavirus</td>
    <td>1264898</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57773827</td>
    <td>NL63-related bat coronavirus strain BtKYNL63-9b</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57773834</td>
    <td>China Rattus coronavirus HKU24</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57879935</td>
    <td>Rousettus bat coronavirus GCCDC1</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>2697049</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q85438966</td>
    <td>severe acute respiratory syndrome coronavirus</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q85939995</td>
    <td>SL-CoV</td>
    <td></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q88162038</td>
    <td>Bat SARS coronavirus Rp1</td>
    <td>349342</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o allCoronaViruses.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/allCoronaViruses.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@allCoronaViruses.rq
```
This SPARQL query is available under CCZero.
