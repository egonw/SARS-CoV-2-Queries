# vaccines.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
SELECT DISTINCT ?vaccine ?vaccineLabel ?type ?typeLabel WHERE {
  VALUES ?for { wd:Q84263196 }
  ?vaccine wdt:P31 / wdt:P279? wd:Q134808 ;
           wdt:P1924 ?for .
  ?vaccine wdt:P31 ?type .
  FILTER ( ?type != wd:Q28051899 ) FILTER ( ?type != wd:Q98734151 )
  FILTER ( ?type != wd:Q87719492 ) FILTER ( ?type != wd:Q30612 )
  FILTER ( ?type != wd:Q134808 )
  SERVICE wikibase:label { bd:serviceParam wikibase:language "nl,en". }
} ORDER BY ASC(?vaccine) ASC(?type)
```
[uitvoeren](https://query.wikidata.org/embed.html#SELECT%20DISTINCT%20%3Fvaccine%20%3FvaccineLabel%20%3Ftype%20%3FtypeLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Ffor%20%7B%20wd%3AQ84263196%20%7D%0A%20%20%3Fvaccine%20wdt%3AP31%20%2F%20wdt%3AP279%3F%20wd%3AQ134808%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1924%20%3Ffor%20.%0A%20%20%3Fvaccine%20wdt%3AP31%20%3Ftype%20.%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ28051899%20%29%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ98734151%20%29%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ87719492%20%29%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ30612%20%29%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ134808%20%29%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%20ASC%28%3Ftype%29%0A) of [bewerken](https://query.wikidata.org/#SELECT%20DISTINCT%20%3Fvaccine%20%3FvaccineLabel%20%3Ftype%20%3FtypeLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Ffor%20%7B%20wd%3AQ84263196%20%7D%0A%20%20%3Fvaccine%20wdt%3AP31%20%2F%20wdt%3AP279%3F%20wd%3AQ134808%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1924%20%3Ffor%20.%0A%20%20%3Fvaccine%20wdt%3AP31%20%3Ftype%20.%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ28051899%20%29%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ98734151%20%29%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ87719492%20%29%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ30612%20%29%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ134808%20%29%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%20ASC%28%3Ftype%29%0A)


### Resultaten
<table>
  <tr>
    <td><b>vaccine</b></td>
    <td><b>type</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158012">Sanofi/GSK SARS-CoV-2 subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q100158012">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">Protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158046">UB-612</a> (<a href="http://www.wikidata.org/entity/Q100158046">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">Protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100158616">RBD SARS-CoV-2 HBsAg VLP</a> (<a href="http://www.wikidata.org/entity/Q100158616">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q58623657">virus-like particle vaccine</a> (<a href="http://www.wikidata.org/entity/Q58623657">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q100694835">BriLife</a> (<a href="http://www.wikidata.org/entity/Q100694835">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q106336308">Virale-vectorvaccin</a> (<a href="http://www.wikidata.org/entity/Q106336308">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246544">bacTRL-Spike</a> (<a href="http://www.wikidata.org/entity/Q101246544">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q578537">DNA-vaccin</a> (<a href="http://www.wikidata.org/entity/Q578537">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246625">hAd5-S-Fusion+N-ETSD</a> (<a href="http://www.wikidata.org/entity/Q101246625">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96841548">op adenovirus gebaseerd vaccin</a> (<a href="http://www.wikidata.org/entity/Q96841548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101246699">VXA-CoV2-1</a> (<a href="http://www.wikidata.org/entity/Q101246699">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96841548">op adenovirus gebaseerd vaccin</a> (<a href="http://www.wikidata.org/entity/Q96841548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q101251575">MVC-COV1901</a> (<a href="http://www.wikidata.org/entity/Q101251575">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">Protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105047585">SOBERANA 02</a> (<a href="http://www.wikidata.org/entity/Q105047585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q5161160">Geconjugeerd vaccin</a> (<a href="http://www.wikidata.org/entity/Q5161160">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105217191">COVIran Barekat</a> (<a href="http://www.wikidata.org/entity/Q105217191">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3560939">geïnactiveerd vaccin</a> (<a href="http://www.wikidata.org/entity/Q3560939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106350062">Corbevax</a> (<a href="http://www.wikidata.org/entity/Q106350062">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">Protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106514993">AG0302-COVID‑19</a> (<a href="http://www.wikidata.org/entity/Q106514993">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q578537">DNA-vaccin</a> (<a href="http://www.wikidata.org/entity/Q578537">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106522065">DelNS1-2019-nCoV-RBD-OPT</a> (<a href="http://www.wikidata.org/entity/Q106522065">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q106336308">Virale-vectorvaccin</a> (<a href="http://www.wikidata.org/entity/Q106336308">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q95042269">AZD1222</a> (<a href="http://www.wikidata.org/entity/Q95042269">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96841548">op adenovirus gebaseerd vaccin</a> (<a href="http://www.wikidata.org/entity/Q96841548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96695265">Ad5-nCoV</a> (<a href="http://www.wikidata.org/entity/Q96695265">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96841548">op adenovirus gebaseerd vaccin</a> (<a href="http://www.wikidata.org/entity/Q96841548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154230">BBIBP-CorV</a> (<a href="http://www.wikidata.org/entity/Q97154230">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3560939">geïnactiveerd vaccin</a> (<a href="http://www.wikidata.org/entity/Q3560939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154233">CoronaVac</a> (<a href="http://www.wikidata.org/entity/Q97154233">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3560939">geïnactiveerd vaccin</a> (<a href="http://www.wikidata.org/entity/Q3560939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154235">NVX-CoV2373</a> (<a href="http://www.wikidata.org/entity/Q97154235">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">Protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154236">Anhui Zhifei Longcom Biopharmaceutical COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154236">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">Protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154237">COVAX-19</a> (<a href="http://www.wikidata.org/entity/Q97154237">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">Protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154239">Zorecimeran</a> (<a href="http://www.wikidata.org/entity/Q97154239">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q169336">mengsel</a> (<a href="http://www.wikidata.org/entity/Q169336">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154239">Zorecimeran</a> (<a href="http://www.wikidata.org/entity/Q97154239">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q85795487">RNA-vaccin</a> (<a href="http://www.wikidata.org/entity/Q85795487">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154243">Medicago Inc. COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154243">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q105967696">Vaccintype</a> (<a href="http://www.wikidata.org/entity/Q105967696">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98270627">Gam-COVID-Vac</a> (<a href="http://www.wikidata.org/entity/Q98270627">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96841548">op adenovirus gebaseerd vaccin</a> (<a href="http://www.wikidata.org/entity/Q96841548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98703813">Covaxin</a> (<a href="http://www.wikidata.org/entity/Q98703813">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3560939">geïnactiveerd vaccin</a> (<a href="http://www.wikidata.org/entity/Q3560939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98947046">EpiVacCorona</a> (<a href="http://www.wikidata.org/entity/Q98947046">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">Protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q98947639">AdimrSC-2f</a> (<a href="http://www.wikidata.org/entity/Q98947639">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">Protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/vaccines.rq | sed 's+<lang/>+nl+' > vaccines.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@vaccines.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
