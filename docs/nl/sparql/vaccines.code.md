# vaccines.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
SELECT ?vaccine ?vaccineLabel ?type ?typeLabel WHERE {
  VALUES ?for { wd:Q84263196 }
  ?vaccine wdt:P31 / wdt:P279? wd:Q134808 ;
           wdt:P1924 ?for .
  ?vaccine wdt:P31 ?type .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
} ORDER BY ASC(?vaccine)
```
[uitvoeren](https://query.wikidata.org/embed.html#SELECT%20%3Fvaccine%20%3FvaccineLabel%20%3Ftype%20%3FtypeLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Ffor%20%7B%20wd%3AQ84263196%20%7D%0A%20%20%3Fvaccine%20wdt%3AP31%20%2F%20wdt%3AP279%3F%20wd%3AQ134808%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1924%20%3Ffor%20.%0A%20%20%3Fvaccine%20wdt%3AP31%20%3Ftype%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%0A) of [bewerken](https://query.wikidata.org/#SELECT%20%3Fvaccine%20%3FvaccineLabel%20%3Ftype%20%3FtypeLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Ffor%20%7B%20wd%3AQ84263196%20%7D%0A%20%20%3Fvaccine%20wdt%3AP31%20%2F%20wdt%3AP279%3F%20wd%3AQ134808%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1924%20%3Ffor%20.%0A%20%20%3Fvaccine%20wdt%3AP31%20%3Ftype%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%0A)


### Resultaten
<table>
  <tr>
    <td><b>vaccine</b></td>
    <td><b>type</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87775025">mRNA-1273</a> (<a href="http://www.wikidata.org/entity/Q87775025">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q96695067">mRNA vaccine</a> (<a href="http://www.wikidata.org/entity/Q96695067">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96695265">Ad5-nCoV</a> (<a href="http://www.wikidata.org/entity/Q96695265">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q134808">vaccine</a> (<a href="http://www.wikidata.org/entity/Q134808">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q96695266">INO-4800</a> (<a href="http://www.wikidata.org/entity/Q96695266">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q134808">vaccine</a> (<a href="http://www.wikidata.org/entity/Q134808">edit</a>)</td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -o vaccines.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/vaccines.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@vaccines.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
