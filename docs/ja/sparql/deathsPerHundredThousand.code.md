# deathsPerHundredThousand.rq
**コード例:** [curl](#curl)
### SPARQL
```sparql
#defaultView:BubbleChart
SELECT ?countryLabel ((?maxDeath*100000)/?maxPopulation AS ?numOfDeathsPer100k) WITH {
  SELECT DISTINCT ?country (MAX(?numDeaths) AS ?maxDeath) (MAX(?population) AS ?maxPopulation) WHERE {
    ?outbreak p:P31 [ ps:P31 wd:Q3241045 ; pq:P642 wd:Q84263196 ] ;
              wdt:P276 ?country ; wdt:P1120 ?numDeaths .
    ?country wdt:P31 wd:Q3624078 ; wdt:P1082 ?population .
  } GROUP BY ?country
} AS %DATA {
  INCLUDE %DATA
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}
```
[実行](https://query.wikidata.org/embed.html#%23defaultView%3ABubbleChart%0ASELECT%20%3FcountryLabel%20%28%28%3FmaxDeath*100000%29%2F%3FmaxPopulation%20AS%20%3FnumOfDeathsPer100k%29%20WITH%20%7B%0A%20%20SELECT%20DISTINCT%20%3Fcountry%20%28MAX%28%3FnumDeaths%29%20AS%20%3FmaxDeath%29%20%28MAX%28%3Fpopulation%29%20AS%20%3FmaxPopulation%29%20WHERE%20%7B%0A%20%20%20%20%3Foutbreak%20p%3AP31%20%5B%20ps%3AP31%20wd%3AQ3241045%20%3B%20pq%3AP642%20wd%3AQ84263196%20%5D%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20wdt%3AP276%20%3Fcountry%20%3B%20wdt%3AP1120%20%3FnumDeaths%20.%0A%20%20%20%20%3Fcountry%20wdt%3AP31%20wd%3AQ3624078%20%3B%20wdt%3AP1082%20%3Fpopulation%20.%0A%20%20%7D%20GROUP%20BY%20%3Fcountry%0A%7D%20AS%20%25DATA%20%7B%0A%20%20INCLUDE%20%25DATA%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A) もしくは [編集](https://query.wikidata.org/#%23defaultView%3ABubbleChart%0ASELECT%20%3FcountryLabel%20%28%28%3FmaxDeath*100000%29%2F%3FmaxPopulation%20AS%20%3FnumOfDeathsPer100k%29%20WITH%20%7B%0A%20%20SELECT%20DISTINCT%20%3Fcountry%20%28MAX%28%3FnumDeaths%29%20AS%20%3FmaxDeath%29%20%28MAX%28%3Fpopulation%29%20AS%20%3FmaxPopulation%29%20WHERE%20%7B%0A%20%20%20%20%3Foutbreak%20p%3AP31%20%5B%20ps%3AP31%20wd%3AQ3241045%20%3B%20pq%3AP642%20wd%3AQ84263196%20%5D%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20wdt%3AP276%20%3Fcountry%20%3B%20wdt%3AP1120%20%3FnumDeaths%20.%0A%20%20%20%20%3Fcountry%20wdt%3AP31%20wd%3AQ3624078%20%3B%20wdt%3AP1082%20%3Fpopulation%20.%0A%20%20%7D%20GROUP%20BY%20%3Fcountry%0A%7D%20AS%20%25DATA%20%7B%0A%20%20INCLUDE%20%25DATA%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A)


### 結果
<table>
  <tr>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/deathsPerHundredThousand.rq | sed 's+<lang/>+ja+' > deathsPerHundredThousand.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@deathsPerHundredThousand.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
