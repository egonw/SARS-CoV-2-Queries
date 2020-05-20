# facets.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?facet ?facetLabel WHERE {
  ?facet wdt:P1269 wd:Q81068910 .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
}

```
[run](https://query.wikidata.org/embed.html#SELECT%20%3Ffacet%20%3FfacetLabel%20WHERE%20%7B%0A%20%20%3Ffacet%20wdt%3AP1269%20wd%3AQ81068910%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%0A%0A) or [edit](https://query.wikidata.org/#SELECT%20%3Ffacet%20%3FfacetLabel%20WHERE%20%7B%0A%20%20%3Ffacet%20wdt%3AP1269%20wd%3AQ81068910%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%0A%0A)


### Output
<table>
  <tr>
    <td><b>facet</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83493517">timeline of the COVID-19 pandemic</a> (<a href="http://www.wikidata.org/entity/Q83493517">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83741704">COVID-19 pandemic by country and territory</a> (<a href="http://www.wikidata.org/entity/Q83741704">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84056433">controversy surrounding the 2019–20 Wuhan coronavirus outbreak</a> (<a href="http://www.wikidata.org/entity/Q84056433">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84318312">xenophobia and racism related to the 2019–20 coronavirus outbreak</a> (<a href="http://www.wikidata.org/entity/Q84318312">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84897850">timeline of the 2019–20 coronavirus pandemic in November 2019 - January 2020</a> (<a href="http://www.wikidata.org/entity/Q84897850">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q85173778">misinformation related to the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q85173778">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q85173855">2019–20 coronavirus outbreak data tables</a> (<a href="http://www.wikidata.org/entity/Q85173855">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86901049">COVID-19 testing</a> (<a href="http://www.wikidata.org/entity/Q86901049">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87073833">travel restriction related to the 2019–20 coronavirus outbreak</a> (<a href="http://www.wikidata.org/entity/Q87073833">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87479384">cancelled event due to the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q87479384">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87491759">domestic responses to the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q87491759">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87625383">Impact of the 2019–20 coronavirus pandemic on aviation</a> (<a href="http://www.wikidata.org/entity/Q87625383">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87625385">Impact of the 2019–20 coronavirus pandemic on cinema</a> (<a href="http://www.wikidata.org/entity/Q87625385">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87719499">Impact of the 2019–20 coronavirus pandemic on television</a> (<a href="http://www.wikidata.org/entity/Q87719499">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87747992">Impact of the 2019–20 coronavirus pandemic on music</a> (<a href="http://www.wikidata.org/entity/Q87747992">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87760968">Impact of the 2019–20 coronavirus pandemic on education</a> (<a href="http://www.wikidata.org/entity/Q87760968">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87774378">timeline of the 2019–20 coronavirus pandemic in March 2020</a> (<a href="http://www.wikidata.org/entity/Q87774378">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87796964">Human rights issues during the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q87796964">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87865677">impact on internet functioning of the 2019-2020 coronavirus disease pandemic</a> (<a href="http://www.wikidata.org/entity/Q87865677">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87866152">quarantine for the 2019-2020 coronavirus disease pandemic</a> (<a href="http://www.wikidata.org/entity/Q87866152">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87898060">Impact of the 2019–20 coronavirus pandemic on religion</a> (<a href="http://www.wikidata.org/entity/Q87898060">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88027839">list of deaths from the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q88027839">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88221447">non-pharmaceutical countermeasure</a> (<a href="http://www.wikidata.org/entity/Q88221447">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88240100">COVID-19 intensive care treatment occurrence</a> (<a href="http://www.wikidata.org/entity/Q88240100">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88293861">Impact of the 2019–20 coronavirus pandemic on the food industry</a> (<a href="http://www.wikidata.org/entity/Q88293861">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88293962">Media coverage of the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q88293962">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88333605">Coronavirus pandemic on social media</a> (<a href="http://www.wikidata.org/entity/Q88333605">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88385577">international assistance during 2019–20 COVID-19 pandemic</a> (<a href="http://www.wikidata.org/entity/Q88385577">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88599208">coronavirus recession</a> (<a href="http://www.wikidata.org/entity/Q88599208">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88634378">impact of the 2019–20 coronavirus pandemic on the video game industry</a> (<a href="http://www.wikidata.org/entity/Q88634378">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88661507">Impact of the 2019–20 coronavirus pandemic on science and technology</a> (<a href="http://www.wikidata.org/entity/Q88661507">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88860637">Clap for our Carers</a> (<a href="http://www.wikidata.org/entity/Q88860637">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88903067">cancelled sports event due to the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q88903067">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89016387">timeline of the 2019–20 coronavirus pandemic in April 2020</a> (<a href="http://www.wikidata.org/entity/Q89016387">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89031984">cancelled music event due to the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q89031984">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89033277">postponed sports event due to the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q89033277">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89113106">Impact of the 2019–20 coronavirus pandemic on the arts and cultural heritage</a> (<a href="http://www.wikidata.org/entity/Q89113106">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89209954">NHS COVID-19 critical care hospital</a> (<a href="http://www.wikidata.org/entity/Q89209954">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89487202">responses to the 2019–20 coronavirus pandemic in March 2020</a> (<a href="http://www.wikidata.org/entity/Q89487202">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89666473">Gendered impact of 2019-20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q89666473">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89864650">Impact of the 2019–20 coronavirus pandemic on prisons</a> (<a href="http://www.wikidata.org/entity/Q89864650">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q89966200">Pandemic predictions and preparations prior to COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89966200">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90213139">Impact of the 2019–20 coronavirus pandemic on long-term care facilities</a> (<a href="http://www.wikidata.org/entity/Q90213139">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90290885">List of healthcare workers who died during COVID-19 outbreak</a> (<a href="http://www.wikidata.org/entity/Q90290885">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90416196">face masks during the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q90416196">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90456853">Impact of the 2019–20 coronavirus pandemic on the military</a> (<a href="http://www.wikidata.org/entity/Q90456853">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90630881">Impact of the 2019–20 coronavirus pandemic on public transport</a> (<a href="http://www.wikidata.org/entity/Q90630881">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90840968">Impact of the 2019–20 coronavirus pandemic on domestic violence</a> (<a href="http://www.wikidata.org/entity/Q90840968">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90840989">Impact of the 2019–20 coronavirus pandemic on tourism</a> (<a href="http://www.wikidata.org/entity/Q90840989">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q90859234">Impact of the 2019-20 coronavirus pandemic on international relations</a> (<a href="http://www.wikidata.org/entity/Q90859234">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q91104866">social distancing measures related to the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q91104866">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q91280428">Protests over responses to the 2020 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q91280428">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q91493633">Wikipedia's response to the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q91493633">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q91911563">Impact of the 2019–20 coronavirus pandemic on the performing arts</a> (<a href="http://www.wikidata.org/entity/Q91911563">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q92150479">Impact of the 2019–20 coronavirus pandemic on journalism</a> (<a href="http://www.wikidata.org/entity/Q92150479">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q92600442">timeline of the 2019–20 coronavirus pandemic in May 2020</a> (<a href="http://www.wikidata.org/entity/Q92600442">edit</a>)</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o facets.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/facets.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@facets.rq
```
This SPARQL query is available under CCZero.
