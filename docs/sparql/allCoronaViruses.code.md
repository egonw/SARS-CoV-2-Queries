# allCoronaViruses.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel  WHERE {
  ?virus wdt:P171+ wd:Q57751738 .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>virusLabel</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16532287</td>
    <td>Betacoronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16908525</td>
    <td>Alphacoronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16955738</td>
    <td>Deltacoronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16977225</td>
    <td>Gammacoronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q278567</td>
    <td>severe acute respiratory syndrome-related coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q2117529</td>
    <td>Puffinosis coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q2132904</td>
    <td>Rat coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q4902157</td>
    <td>Middle East respiratory syndrome coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16983360</td>
    <td>Human coronavirus HKU1</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16988144</td>
    <td>Pipistrellus bat coronavirus HKU5</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16991954</td>
    <td>Human coronavirus OC43</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16992344</td>
    <td>Rousettus bat coronavirus HKU9</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16993274</td>
    <td>Tylonycteris bat coronavirus HKU4</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q18907882</td>
    <td>Murine coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q18965332</td>
    <td>Betacoronavirus 1</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808940</td>
    <td>Hedgehog coronavirus 1</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808941</td>
    <td>Middle East respiratory syndrome-related coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754667</td>
    <td>Embecovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754671</td>
    <td>Hibecovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754679</td>
    <td>Merbecovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754685</td>
    <td>Nobecovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754693</td>
    <td>Sarbecovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q5032409</td>
    <td>Canine coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q8351095</td>
    <td>Human Coronavirus NL63</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16023751</td>
    <td>Porcine epidemic diarrhea virus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16983356</td>
    <td>Human coronavirus 229E</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16985780</td>
    <td>Miniopterus Bat coronavirus 1</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16985784</td>
    <td>Miniopterus Bat coronavirus HKU8</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16989092</td>
    <td>Rhinolophus Bat coronavirus HKU2</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16992475</td>
    <td>Scotophilus Bat coronavirus 512</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q18965331</td>
    <td>Alphacoronavirus 1</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808936</td>
    <td>Bat coronavirus CDPHE15</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808938</td>
    <td>Bat coronavirus HKU10</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808939</td>
    <td>Mink coronavirus 1</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754582</td>
    <td>Colacovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754588</td>
    <td>Decacovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754596</td>
    <td>Duvinacovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754603</td>
    <td>Luchacovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754609</td>
    <td>Minacovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754617</td>
    <td>Minunacovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754626</td>
    <td>Myotacovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754632</td>
    <td>Nyctacovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754639</td>
    <td>Pedacovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754648</td>
    <td>Rhinacovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754656</td>
    <td>Setracovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754662</td>
    <td>Tegacovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16848886</td>
    <td>Bulbul coronavirus HKU11</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16988426</td>
    <td>Porcine coronavirus HKU15</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q18965333</td>
    <td>Munia coronavirus HKU13</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q18965334</td>
    <td>Thrush coronavirus HKU12</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808943</td>
    <td>Common moorhen coronavirus HKU21</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808944</td>
    <td>Coronavirus HKU15</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808946</td>
    <td>Night heron coronavirus HKU19</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808947</td>
    <td>White-eye coronavirus HKU16</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24808948</td>
    <td>Wigeon coronavirus HKU20</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754699</td>
    <td>Andecovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754709</td>
    <td>Buldecovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754714</td>
    <td>Herdecovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754718</td>
    <td>Moordecovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q3560916</td>
    <td>Avian infectious bronchitis virus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q18965335</td>
    <td>Avian coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q18965336</td>
    <td>Beluga whale coronavirus SW1</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754725</td>
    <td>Cegacovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57754734</td>
    <td>Igacovirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q34967815</td>
    <td>SARS coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q85438966</td>
    <td>severe acute respiratory syndrome coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q85939995</td>
    <td>SL-CoV</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q6926073</td>
    <td>Mouse hepatitis virus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q454829</td>
    <td>Feline coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q7834605</td>
    <td>Transmissible gastroenteritis coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q4950554</td>
    <td>Bovine coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q7855142</td>
    <td>Turkey coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q22103916</td>
    <td>Pigeon coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16984813</td>
    <td>London1 novel CoV/2012</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57758320</td>
    <td>Rhinolophus ferrumequinum alphacoronavirus HuB-2013</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57773819</td>
    <td>Lucheng Rn rat coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57773822</td>
    <td>Ferret coronavirus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57758326</td>
    <td>Myotis ricketti alphacoronavirus Sax-2011</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57758332</td>
    <td>Nyctalus velutinus alphacoronavirus SC-2013</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57773827</td>
    <td>NL63-related bat coronavirus strain BtKYNL63-9b</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57773834</td>
    <td>China Rattus coronavirus HKU24</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57758339</td>
    <td>Bat Hp-betacoronavirus Zhejiang2013</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57879935</td>
    <td>Rousettus bat coronavirus GCCDC1</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q16000326</td>
    <td>SL-CoV-WIV1</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o allCoronaViruses.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/allCoronaViruses.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@allCoronaViruses.rq
```
