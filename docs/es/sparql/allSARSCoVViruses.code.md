# allSARSCoVViruses.rq
**Ejemplos de código:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "es,en". }
}
```
[ejecutar](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0A) o [editar](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0A)


### Resultados
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16000326">SL-CoV-WIV1</a> (<a href="http://www.wikidata.org/entity/Q16000326">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415852">1415852</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q34967815">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q34967815">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/227859">227859</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2697049">2697049</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q85939995">Bat SARS-like coronavirus RsSHC014</a> (<a href="http://www.wikidata.org/entity/Q85939995">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415851">1415851</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88162038">Bat SARS coronavirus Rp1</a> (<a href="http://www.wikidata.org/entity/Q88162038">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/349342">349342</a></td>
  </tr>
</table>
## Ejemplos de código
### curl
```shell
curl -o allSARSCoVViruses.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/allSARSCoVViruses.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@allSARSCoVViruses.rq
```
Esta consulta SPARQL está disponible en CCZero.
