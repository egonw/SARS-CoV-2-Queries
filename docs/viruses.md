# Viruses

The <a name="tp1">SARS-CoV-2</a> <a name="tp2">virus</a> is not the first <a name="tp3">coronavirus</a>. In fact, quite a few are known.

We first list the SARS-CoV viruses:

**SPARQL** [sparql/allSARSCoVViruses.rq](sparql/allSARSCoVViruses.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?virus ?virusLabel  WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

This gives us:

<table>
  <tr>
    <td><b>virus</b></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q34967815">SARS coronavirus</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q85438966">severe acute respiratory syndrome coronavirus</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q85939995">SL-CoV</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16000326">SL-CoV-WIV1</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88162038">Bat SARS coronavirus Rp1</a></td>
  </tr>
</table>

But the full list of coronaviruses looks like this:

**SPARQL** [sparql/allCoronaViruses.rq](sparql/allCoronaViruses.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q57751738 .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

Which gives us:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q278567">severe acute respiratory syndrome-related coronavirus</a></td>
    <td>694009</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q454829">Feline coronavirus</a></td>
    <td>12663</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q2117529">Puffinosis coronavirus</a></td>
    <td>76583</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q2132904">Rat coronavirus</a></td>
    <td>31632</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q3560916">Avian infectious bronchitis virus</a></td>
    <td>11120</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q4902157">Middle East respiratory syndrome coronavirus</a></td>
    <td>1335626</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q4950554">Bovine coronavirus</a></td>
    <td>11128</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q5032409">Canine coronavirus</a></td>
    <td>11153</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q6926073">Mouse hepatitis virus</a></td>
    <td>11138</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q7834605">Transmissible gastroenteritis coronavirus</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q7855142">Turkey coronavirus</a></td>
    <td>11152</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q8351095">Human Coronavirus NL63</a></td>
    <td>277944</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16000326">SL-CoV-WIV1</a></td>
    <td>1415852</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16023751">Porcine epidemic diarrhea virus</a></td>
    <td>28295</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16532287">Betacoronavirus</a></td>
    <td>694002</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16848886">Bulbul coronavirus HKU11</a></td>
    <td>574549</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16908525">Alphacoronavirus</a></td>
    <td>693996</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16955738">Deltacoronavirus</a></td>
    <td>1159901</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16977225">Gammacoronavirus</a></td>
    <td>694013</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16983356">Human coronavirus 229E</a></td>
    <td>11137</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16983360">Human coronavirus HKU1</a></td>
    <td>290028</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16985780">Miniopterus Bat coronavirus 1</a></td>
    <td>694000</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16985784">Miniopterus Bat coronavirus HKU8</a></td>
    <td>694001</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16988144">Pipistrellus bat coronavirus HKU5</a></td>
    <td>694008</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16988426">Porcine coronavirus HKU15</a></td>
    <td>1159905</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16989092">Rhinolophus Bat coronavirus HKU2</a></td>
    <td>693998</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16991954">Human coronavirus OC43</a></td>
    <td>31631</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16992344">Rousettus bat coronavirus HKU9</a></td>
    <td>694006</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16992475">Scotophilus Bat coronavirus 512</a></td>
    <td>693999</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16993274">Tylonycteris bat coronavirus HKU4</a></td>
    <td>694007</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q18907882">Murine coronavirus</a></td>
    <td>694005</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q18965331">Alphacoronavirus 1</a></td>
    <td>693997</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q18965332">Betacoronavirus 1</a></td>
    <td>694003</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q18965333">Munia coronavirus HKU13</a></td>
    <td>1297661</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q18965334">Thrush coronavirus HKU12</a></td>
    <td>1297662</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q18965335">Avian coronavirus</a></td>
    <td>694014</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q18965336">Beluga whale coronavirus SW1</a></td>
    <td>694015</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q22103916">Pigeon coronavirus</a></td>
    <td>300189</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q24808936">Bat coronavirus CDPHE15</a></td>
    <td>1913643</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q24808938">Bat coronavirus HKU10</a></td>
    <td>1244203</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q24808939">Mink coronavirus 1</a></td>
    <td>1913642</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q24808940">Hedgehog coronavirus 1</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q24808943">Common moorhen coronavirus HKU21</a></td>
    <td>1159902</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q24808944">Coronavirus HKU15</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q24808946">Night heron coronavirus HKU19</a></td>
    <td>1159904</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q24808947">White-eye coronavirus HKU16</a></td>
    <td>1159907</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q24808948">Wigeon coronavirus HKU20</a></td>
    <td>1159908</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q34967815">SARS coronavirus</a></td>
    <td>227859</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754582">Colacovirus</a></td>
    <td>2509477</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754588">Decacovirus</a></td>
    <td>2509479</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754596">Duvinacovirus</a></td>
    <td>2509480</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754603">Luchacovirus</a></td>
    <td>2509492</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754609">Minacovirus</a></td>
    <td>2509496</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754617">Minunacovirus</a></td>
    <td>2509497</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754626">Myotacovirus</a></td>
    <td>2509500</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754632">Nyctacovirus</a></td>
    <td>2509503</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754639">Pedacovirus</a></td>
    <td>2509505</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754648">Rhinacovirus</a></td>
    <td>2509509</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754656">Setracovirus</a></td>
    <td>2509512</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754662">Tegacovirus</a></td>
    <td>2509514</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754667">Embecovirus</a></td>
    <td>2509481</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754671">Hibecovirus</a></td>
    <td>2509486</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754679">Merbecovirus</a></td>
    <td>2509494</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754685">Nobecovirus</a></td>
    <td>2509502</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754693">Sarbecovirus</a></td>
    <td>2509511</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754699">Andecovirus</a></td>
    <td>2509469</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754709">Buldecovirus</a></td>
    <td>2509474</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754714">Herdecovirus</a></td>
    <td>2509485</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754718">Moordecovirus</a></td>
    <td>2509499</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754725">Cegacovirus</a></td>
    <td>2509476</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57754734">Igacovirus</a></td>
    <td>2509487</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57758320">Rhinolophus ferrumequinum alphacoronavirus HuB-2013</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57758326">Myotis ricketti alphacoronavirus Sax-2011</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57758332">Nyctalus velutinus alphacoronavirus SC-2013</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57758339">Bat Hp-betacoronavirus Zhejiang2013</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57773819">Lucheng Rn rat coronavirus</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57773822">Ferret coronavirus</a></td>
    <td>1264898</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57773827">NL63-related bat coronavirus strain BtKYNL63-9b</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57773834">China Rattus coronavirus HKU24</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q57879935">Rousettus bat coronavirus GCCDC1</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td>2697049</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q85438966">severe acute respiratory syndrome coronavirus</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q85939995">SL-CoV</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88162038">Bat SARS coronavirus Rp1</a></td>
    <td>349342</td>
  </tr>
</table>

## The seven coronaviruses that infect human

However, for the current pandemic, the seven human corona viruses may be of particular interest [<a href="#citeref1">1</a>].
We can use this query to just list these:

**SPARQL** [sparql/humanCoronaviruses.rq](sparql/humanCoronaviruses.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?virus ?virusLabel ?ncbi WHERE {
  VALUES ?virus {
    wd:Q82069695 # SARS-CoV-2
    wd:Q16983360 # HKU1
    wd:Q16991954 # OC43
    wd:Q8351095  # NL63 
    wd:Q16983356 # 229E
    wd:Q4902157  # MERS-CoV
    wd:Q278567   # SARS-CoV
  }
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

This gives us a good starting point to study the virus in more detail:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q278567">severe acute respiratory syndrome-related coronavirus</a></td>
    <td>694009</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q4902157">Middle East respiratory syndrome coronavirus</a></td>
    <td>1335626</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q8351095">Human Coronavirus NL63</a></td>
    <td>277944</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16983356">Human coronavirus 229E</a></td>
    <td>11137</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16983360">Human coronavirus HKU1</a></td>
    <td>290028</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16991954">Human coronavirus OC43</a></td>
    <td>31631</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td>2697049</td>
  </tr>
</table>

## NCBI Taxonomy IDs

For the coronaviruses we can list the <a name="tp4">NCBI Taxonomy</a> [<a href="#citeref2">2</a>] identifiers with:

**SPARQL** [sparql/allSARSCoVVirusesTaxonomy.rq](sparql/allSARSCoVVirusesTaxonomy.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

This gives us:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q16000326">SL-CoV-WIV1</a></td>
    <td>1415852</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q34967815">SARS coronavirus</a></td>
    <td>227859</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td>2697049</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q85438966">severe acute respiratory syndrome coronavirus</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q85939995">SL-CoV</a></td>
    <td>null</td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88162038">Bat SARS coronavirus Rp1</a></td>
    <td>349342</td>
  </tr>
</table>

## References

1. <a name="citeref1"></a>Zhu N, Zhang D, Wang W, Li X, Yang B, Song J, et al. A Novel Coronavirus from Patients with Pneumonia in China, 2019. NEJM. 2020 Feb 20;382(8):727–33.  doi:[10.1056/NEJMOA2001017](https://doi.org/10.1056/NEJMOA2001017) ([Scholia](https://tools.wmflabs.org/scholia/doi/10.1056/NEJMOA2001017))
2. <a name="citeref2"></a>Federhen S. The NCBI Taxonomy database. NAR. 2012 Jan;40(Database issue):D136-43.  doi:[10.1093/NAR/GKR1178](https://doi.org/10.1093/NAR/GKR1178) ([Scholia](https://tools.wmflabs.org/scholia/doi/10.1093/NAR/GKR1178))


