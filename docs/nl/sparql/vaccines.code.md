# vaccines.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
SELECT DISTINCT ?vaccine ?vaccineLabel ?announcement WHERE {
  ?vaccine wdt:P279 wd:Q87719492 .
  OPTIONAL { ?vaccine wdt:P6949 ?announcement . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
} ORDER BY ASC(?vaccine) ASC(?announcement)
```
[uitvoeren](https://query.wikidata.org/embed.html#SELECT%20DISTINCT%20%3Fvaccine%20%3FvaccineLabel%20%3Fannouncement%20WHERE%20%7B%0A%20%20%3Fvaccine%20wdt%3AP279%20wd%3AQ87719492%20.%0A%20%20OPTIONAL%20%7B%20%3Fvaccine%20wdt%3AP6949%20%3Fannouncement%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%20ASC%28%3Fannouncement%29%0A) of [bewerken](https://query.wikidata.org/#SELECT%20DISTINCT%20%3Fvaccine%20%3FvaccineLabel%20%3Fannouncement%20WHERE%20%7B%0A%20%20%3Fvaccine%20wdt%3AP279%20wd%3AQ87719492%20.%0A%20%20OPTIONAL%20%7B%20%3Fvaccine%20wdt%3AP6949%20%3Fannouncement%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%20ASC%28%3Fannouncement%29%0A)


### Resultaten
<table>
  <tr>
    <td><b>vaccine</b></td>
    <td><b>announcement</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158012">Sanofi/GSK SARS-CoV-2 subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q100158012">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158046">UB-612</a> (<a href="http://www.wikidata.org/entity/Q100158046">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158616">RBD SARS-CoV-2 HBsAg VLP</a> (<a href="http://www.wikidata.org/entity/Q100158616">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100532641">Q100532641</a> (<a href="http://www.wikidata.org/entity/Q100532641">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100694835">BriLife</a> (<a href="http://www.wikidata.org/entity/Q100694835">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246544">bacTRL-Spike</a> (<a href="http://www.wikidata.org/entity/Q101246544">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246625">hAd5-S-Fusion+N-ETSD</a> (<a href="http://www.wikidata.org/entity/Q101246625">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246699">VXA-CoV2-1</a> (<a href="http://www.wikidata.org/entity/Q101246699">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101251575">MVC COVID-19 Vaccine</a> (<a href="http://www.wikidata.org/entity/Q101251575">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104902499">Valneva COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q104902499">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105047585">SOBERANA 02</a> (<a href="http://www.wikidata.org/entity/Q105047585">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105217191">COVIran Barekat</a> (<a href="http://www.wikidata.org/entity/Q105217191">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106167301">QazCovid-in</a> (<a href="http://www.wikidata.org/entity/Q106167301">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106204649">CoviVac</a> (<a href="http://www.wikidata.org/entity/Q106204649">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106247790">Versamune-CoV-2FC</a> (<a href="http://www.wikidata.org/entity/Q106247790">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106309712">BBV154</a> (<a href="http://www.wikidata.org/entity/Q106309712">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106322660">WIBP-CorV</a> (<a href="http://www.wikidata.org/entity/Q106322660">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106350062">Corbevax</a> (<a href="http://www.wikidata.org/entity/Q106350062">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106352979">NDV-HXP-S</a> (<a href="http://www.wikidata.org/entity/Q106352979">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106370223">HGC019</a> (<a href="http://www.wikidata.org/entity/Q106370223">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106390652">Abdala</a> (<a href="http://www.wikidata.org/entity/Q106390652">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106405764">VBI-2902</a> (<a href="http://www.wikidata.org/entity/Q106405764">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106488871">Walvax COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q106488871">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106514790">Chinese Academy of Medical Sciences COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q106514790">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106522065">DelNS1-2019-nCoV-RBD-OPT</a> (<a href="http://www.wikidata.org/entity/Q106522065">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106522079">Minhai COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q106522079">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106532118">TURKOVAC</a> (<a href="http://www.wikidata.org/entity/Q106532118">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106577609">Mambisa</a> (<a href="http://www.wikidata.org/entity/Q106577609">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106652103">Zhongyianke Biotech–Liaoning Maokangyuan Biotech COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q106652103">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106725976">Razi Cov Pars</a> (<a href="http://www.wikidata.org/entity/Q106725976">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106729556">Sputnik Light</a> (<a href="http://www.wikidata.org/entity/Q106729556">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107229181">COVI-VAC</a> (<a href="http://www.wikidata.org/entity/Q107229181">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107860980">ARCT-154</a> (<a href="http://www.wikidata.org/entity/Q107860980">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q108044254">SKYCovione</a> (<a href="http://www.wikidata.org/entity/Q108044254">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q108471697">ABNCoV2</a> (<a href="http://www.wikidata.org/entity/Q108471697">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q108846787">mRNA-based COVID-19 vaccines</a> (<a href="http://www.wikidata.org/entity/Q108846787">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110269395">ReCOV</a> (<a href="http://www.wikidata.org/entity/Q110269395">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110269731">S-268019</a> (<a href="http://www.wikidata.org/entity/Q110269731">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110269777">KD-414</a> (<a href="http://www.wikidata.org/entity/Q110269777">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110269779">LYB001</a> (<a href="http://www.wikidata.org/entity/Q110269779">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110269782">Vaxart COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q110269782">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110269792">INNA-051</a> (<a href="http://www.wikidata.org/entity/Q110269792">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110269793">Stemirna COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q110269793">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110269796">MigVax-101</a> (<a href="http://www.wikidata.org/entity/Q110269796">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110269798">SCTV01C</a> (<a href="http://www.wikidata.org/entity/Q110269798">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110269825">COH04S1</a> (<a href="http://www.wikidata.org/entity/Q110269825">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110291641">Sinopharm CNBG COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q110291641">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87775025">mRNA-1273 vaccine</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q95042269">AZD1222</a> (<a href="http://www.wikidata.org/entity/Q95042269">edit</a>)</td>
    <td>2020-11-01T00:00:00Z</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96695265">Ad5-nCoV</a> (<a href="http://www.wikidata.org/entity/Q96695265">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154230">BBIBP-CorV</a> (<a href="http://www.wikidata.org/entity/Q97154230">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154233">CoronaVac</a> (<a href="http://www.wikidata.org/entity/Q97154233">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154235">NVX-CoV2373</a> (<a href="http://www.wikidata.org/entity/Q97154235">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154236">Anhui Zhifei Longcom Biopharmaceutical COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154236">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154237">COVAX-19</a> (<a href="http://www.wikidata.org/entity/Q97154237">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154239">zorecimeran</a> (<a href="http://www.wikidata.org/entity/Q97154239">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154240">tozinameran</a> (<a href="http://www.wikidata.org/entity/Q97154240">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98270627">Gam-COVID-Vac</a> (<a href="http://www.wikidata.org/entity/Q98270627">edit</a>)</td>
    <td>2020-05-01T00:00:00Z</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98655215">Ad26.COV2.S</a> (<a href="http://www.wikidata.org/entity/Q98655215">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98703813">Covaxin / BBV152</a> (<a href="http://www.wikidata.org/entity/Q98703813">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98947046">EpiVacCorona</a> (<a href="http://www.wikidata.org/entity/Q98947046">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98947639">AdimrSC-2f</a> (<a href="http://www.wikidata.org/entity/Q98947639">edit</a>)</td>
    <td></td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/vaccines.rq | sed 's+<lang/>+nl+' > vaccines.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@vaccines.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
