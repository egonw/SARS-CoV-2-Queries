# graphDeaths.rq
**Ejemplos de código:** [curl](#curl)
### SPARQL
```sparql
#defaultView:LineChart
SELECT
?date ?deaths
?country ?countryLabel
WHERE {
  ?item wdt:P31 wd:Q3241045.
  ?item wdt:P17 ?country.
  ?item p:P1120 ?deathsStatement.
  ?deathsStatement ps:P1120 ?deaths.
  FILTER(?deaths > 0)
  ?deathsStatement pq:P585 ?date .
  { ?item wdt:P1269 wd:Q81068910. } UNION
  { ?item wdt:P361 wd:Q83741704. }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "es,en". }
} ORDER BY ASC(?countryLabel) DESC(?date) DESC(?deaths)
```
[ejecutar](https://query.wikidata.org/embed.html#%23defaultView%3ALineChart%0ASELECT%0A%3Fdate%20%3Fdeaths%0A%3Fcountry%20%3FcountryLabel%0AWHERE%20%7B%0A%20%20%3Fitem%20wdt%3AP31%20wd%3AQ3241045.%0A%20%20%3Fitem%20wdt%3AP17%20%3Fcountry.%0A%20%20%3Fitem%20p%3AP1120%20%3FdeathsStatement.%0A%20%20%3FdeathsStatement%20ps%3AP1120%20%3Fdeaths.%0A%20%20FILTER%28%3Fdeaths%20%3E%200%29%0A%20%20%3FdeathsStatement%20pq%3AP585%20%3Fdate%20.%0A%20%20%7B%20%3Fitem%20wdt%3AP1269%20wd%3AQ81068910.%20%7D%20UNION%0A%20%20%7B%20%3Fitem%20wdt%3AP361%20wd%3AQ83741704.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3FcountryLabel%29%20DESC%28%3Fdate%29%20DESC%28%3Fdeaths%29%0A) o [editar](https://query.wikidata.org/#%23defaultView%3ALineChart%0ASELECT%0A%3Fdate%20%3Fdeaths%0A%3Fcountry%20%3FcountryLabel%0AWHERE%20%7B%0A%20%20%3Fitem%20wdt%3AP31%20wd%3AQ3241045.%0A%20%20%3Fitem%20wdt%3AP17%20%3Fcountry.%0A%20%20%3Fitem%20p%3AP1120%20%3FdeathsStatement.%0A%20%20%3FdeathsStatement%20ps%3AP1120%20%3Fdeaths.%0A%20%20FILTER%28%3Fdeaths%20%3E%200%29%0A%20%20%3FdeathsStatement%20pq%3AP585%20%3Fdate%20.%0A%20%20%7B%20%3Fitem%20wdt%3AP1269%20wd%3AQ81068910.%20%7D%20UNION%0A%20%20%7B%20%3Fitem%20wdt%3AP361%20wd%3AQ83741704.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3FcountryLabel%29%20DESC%28%3Fdate%29%20DESC%28%3Fdeaths%29%0A)


### Resultados
<table>
  <tr>
  </tr>
</table>
## Ejemplos de código
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/graphDeaths.rq | sed 's+<lang/>+es+' > graphDeaths.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@graphDeaths.rq
```
Esta consulta SPARQL está disponible en CCZero.
