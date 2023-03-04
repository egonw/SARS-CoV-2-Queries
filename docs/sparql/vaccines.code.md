# vaccines.rq
**Code examples:** [curl](#curl)
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
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
} ORDER BY ASC(?vaccine) ASC(?type)
```
[run](https://query.wikidata.org/embed.html#SELECT%20DISTINCT%20%3Fvaccine%20%3FvaccineLabel%20%3Ftype%20%3FtypeLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Ffor%20%7B%20wd%3AQ84263196%20%7D%0A%20%20%3Fvaccine%20wdt%3AP31%20%2F%20wdt%3AP279%3F%20wd%3AQ134808%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1924%20%3Ffor%20.%0A%20%20%3Fvaccine%20wdt%3AP31%20%3Ftype%20.%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ28051899%20%29%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ98734151%20%29%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ87719492%20%29%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ30612%20%29%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ134808%20%29%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%20ASC%28%3Ftype%29%0A) or [edit](https://query.wikidata.org/#SELECT%20DISTINCT%20%3Fvaccine%20%3FvaccineLabel%20%3Ftype%20%3FtypeLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Ffor%20%7B%20wd%3AQ84263196%20%7D%0A%20%20%3Fvaccine%20wdt%3AP31%20%2F%20wdt%3AP279%3F%20wd%3AQ134808%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1924%20%3Ffor%20.%0A%20%20%3Fvaccine%20wdt%3AP31%20%3Ftype%20.%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ28051899%20%29%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ98734151%20%29%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ87719492%20%29%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ30612%20%29%0A%20%20FILTER%20%28%20%3Ftype%20%21%3D%20wd%3AQ134808%20%29%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvaccine%29%20ASC%28%3Ftype%29%0A)


### Output
<table>
  <tr>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/vaccines.rq | sed 's+<lang/>+en+' > vaccines.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@vaccines.rq
```
This SPARQL query is available under CCZero.
