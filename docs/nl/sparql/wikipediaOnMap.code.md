# wikipediaOnMap.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
#defaultView:Map
SELECT DISTINCT ?wpArticle ?itemLabel ?coord WHERE {
  ?wpArticle a schema:Article ;
    schema:about ?item ;
    schema:isPartOf <https://nl.wikipedia.org/> .
  ?item p:P31 [ ps:P31 wd:Q3241045 ; pq:P642 wd:Q84263196 ] ;
    wdt:P625 ?coord ;
    rdfs:label ?itemLabel . FILTER(LANG(?itemLabel)="nl")
}
```
[uitvoeren](https://query.wikidata.org/embed.html#%23defaultView%3AMap%0ASELECT%20DISTINCT%20%3FwpArticle%20%3FitemLabel%20%3Fcoord%20WHERE%20%7B%0A%20%20%3FwpArticle%20a%20schema%3AArticle%20%3B%0A%20%20%20%20schema%3Aabout%20%3Fitem%20%3B%0A%20%20%20%20schema%3AisPartOf%20%3Chttps%3A%2F%2Fnl.wikipedia.org%2F%3E%20.%0A%20%20%3Fitem%20p%3AP31%20%5B%20ps%3AP31%20wd%3AQ3241045%20%3B%20pq%3AP642%20wd%3AQ84263196%20%5D%20%3B%0A%20%20%20%20wdt%3AP625%20%3Fcoord%20%3B%0A%20%20%20%20rdfs%3Alabel%20%3FitemLabel%20.%20FILTER%28LANG%28%3FitemLabel%29%3D%22nl%22%29%0A%7D%0A) of [bewerken](https://query.wikidata.org/#%23defaultView%3AMap%0ASELECT%20DISTINCT%20%3FwpArticle%20%3FitemLabel%20%3Fcoord%20WHERE%20%7B%0A%20%20%3FwpArticle%20a%20schema%3AArticle%20%3B%0A%20%20%20%20schema%3Aabout%20%3Fitem%20%3B%0A%20%20%20%20schema%3AisPartOf%20%3Chttps%3A%2F%2Fnl.wikipedia.org%2F%3E%20.%0A%20%20%3Fitem%20p%3AP31%20%5B%20ps%3AP31%20wd%3AQ3241045%20%3B%20pq%3AP642%20wd%3AQ84263196%20%5D%20%3B%0A%20%20%20%20wdt%3AP625%20%3Fcoord%20%3B%0A%20%20%20%20rdfs%3Alabel%20%3FitemLabel%20.%20FILTER%28LANG%28%3FitemLabel%29%3D%22nl%22%29%0A%7D%0A)


### Resultaten
<table>
  <tr>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/wikipediaOnMap.rq | sed 's+<lang/>+nl+' > wikipediaOnMap.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@wikipediaOnMap.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
