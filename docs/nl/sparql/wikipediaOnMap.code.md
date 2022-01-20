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
    <td><b>wpArticle</b></td>
    <td><b>coord</b></td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_op_de_Falklandeilanden</td>
    <td>Point(-59.0 -51.8)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Zuid-Amerika</td>
    <td>Point(-59.0 -21.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Iran</td>
    <td>Point(53.0 32.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Zuid-Korea</td>
    <td>Point(128.0 36.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Singapore</td>
    <td>Point(103.8 1.3)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Oostenrijk</td>
    <td>Point(14.0 48.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Zwitserland</td>
    <td>Point(8.231973055 46.798561944)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Itali%C3%AB</td>
    <td>Point(12.5 42.5)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Spanje</td>
    <td>Point(-3.0 40.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Duitsland</td>
    <td>Point(10.0 51.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_China</td>
    <td>Point(103.0 35.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Oceani%C3%AB</td>
    <td>Point(166.0 -21.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_het_Verenigd_Koninkrijk</td>
    <td>Point(-2.0 54.6)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Zweden</td>
    <td>Point(15.0 61.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Noord-Korea</td>
    <td>Point(127.0 40.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Australi%C3%AB</td>
    <td>Point(137.0 -28.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Nepal</td>
    <td>Point(84.0 28.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_India</td>
    <td>Point(77.0 22.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Japan</td>
    <td>Point(136.0 35.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Afrika</td>
    <td>Point(17.0 1.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Denemarken</td>
    <td>Point(10.0 56.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Noord-Amerika</td>
    <td>Point(-105.0 47.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Sint_Maarten</td>
    <td>Point(-63.067777777 18.031944444)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Aruba</td>
    <td>Point(-69.974166666 12.511111111)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Suriname</td>
    <td>Point(-56.0 4.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Turkije</td>
    <td>Point(36.0 39.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Macau</td>
    <td>Point(113.55 22.166666666)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Hongkong</td>
    <td>Point(114.166666666 22.283333333)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Brazili%C3%AB</td>
    <td>Point(-53.0 -14.0)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_Cura%C3%A7ao</td>
    <td>Point(-68.966666666 12.166666666)</td>
  </tr>
  <tr>
    <td>https://nl.wikipedia.org/wiki/Coronacrisis_in_%C3%85land</td>
    <td>Point(20.0 60.25)</td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/wikipediaOnMap.rq | sed 's+<lang/>+nl+' > wikipediaOnMap.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@wikipediaOnMap.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
