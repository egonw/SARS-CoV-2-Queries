# vaccines.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
SELECT DISTINCT ?vaccine ?vaccineLabel ?type ?typeLabel WHERE {
  VALUES ?for { wd:Q84263196 }
  ?vaccine wdt:P31 / wdt:P279? wd:Q134808 ;
           wdt:P1924 ?for .
  ?vaccine wdt:P31 ?type .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
} ORDER BY ASC(?vaccine) ASC(?type)
```
[uitvoeren](https://query.wikidata.org/embed.html#SELECT%20DISTINCT%20%3Fvaccine%20%3FvaccineLabel%20%3Ftype%20%3FtypeLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Ffor%20%7B%20wd%3AQ84263196%20%7D%0A%20%20%3Fvaccine%20wdt%3AP31%20%2F%20wdt%3AP279%3F%20wd%3AQ134808%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1924%20%3Ffor%20.%0A%20%20%3Fvaccine%20wdt%3AP31%20%3Ftype%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%20ASC%28%3Ftype%29%0A) of [bewerken](https://query.wikidata.org/#SELECT%20DISTINCT%20%3Fvaccine%20%3FvaccineLabel%20%3Ftype%20%3FtypeLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Ffor%20%7B%20wd%3AQ84263196%20%7D%0A%20%20%3Fvaccine%20wdt%3AP31%20%2F%20wdt%3AP279%3F%20wd%3AQ134808%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1924%20%3Ffor%20.%0A%20%20%3Fvaccine%20wdt%3AP31%20%3Ftype%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%20ASC%28%3Ftype%29%0A)


### Resultaten
<table>
  <tr>
    <td><b>vaccine</b></td>
    <td><b>type</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87775025">mRNA-1273</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87775025">mRNA-1273</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96695067">mRNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q96695067">edit</a>)</td>
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
    <td><a href="https://scholia.toolforge.org/Q96695265">Ad5-nCoV</a> (<a href="http://www.wikidata.org/entity/Q96695265">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
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
    <td><a href="https://scholia.toolforge.org/Q97154000">Zydus Cadila Healthcare Limited  COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154000">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154000">Zydus Cadila Healthcare Limited  COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154000">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q578537">DNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q578537">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154226">Osaka University COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154226">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154226">Osaka University COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154226">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q578537">DNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q578537">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154228">Genexine Consortium (GenNBio COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154228">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154228">Genexine Consortium (GenNBio COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154228">edit</a>)</td>
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
    <td><a href="https://scholia.toolforge.org/Q97154233">Sinovac COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154233">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154233">Sinovac COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154233">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q3560939">inactivated vaccine</a> (<a href="http://www.wikidata.org/entity/Q3560939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154234">Gamaleya  Research Institute COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154234">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154234">Gamaleya  Research Institute COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154234">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96841548">adenovirus-based vaccine</a> (<a href="http://www.wikidata.org/entity/Q96841548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154235">Novavax COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154235">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154235">Novavax COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154235">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">Protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154236">Anhui Zhifei Longcom Biopharmaceutical COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154236">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154236">Anhui Zhifei Longcom Biopharmaceutical COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154236">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">Protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154237">Vaxine Pty Ltd COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154237">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154237">Vaxine Pty Ltd COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154237">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">Protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154238">Clover Biopharmaceuticals Inc. COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154238">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154238">Clover Biopharmaceuticals Inc. COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154238">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153933">Protein subunit vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153933">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154239">CureVac COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154239">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154239">CureVac COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154239">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153934">RNA-based vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153934">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154240">BioNTech COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154240">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154240">BioNTech COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154240">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153934">RNA-based vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153934">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154241">Imperial College London COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154241">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154241">Imperial College London COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154241">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153934">RNA-based vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153934">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154242">People's Liberation Army (PLA) Academy of Military Sciences COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154242">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q28051899">vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q28051899">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97154242">People's Liberation Army (PLA) Academy of Military Sciences COVID-19 vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q97154242">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q97153934">RNA-based vaccine</a> (<a href="http://www.wikidata.org/entity/Q97153934">edit</a>)</td>
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
    <td><a href="https://scholia.toolforge.org/Q87719492">COVID-19 vaccine</a> (<a href="http://www.wikidata.org/entity/Q87719492">edit</a>)</td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -o vaccines.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/vaccines.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@vaccines.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
