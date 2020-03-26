# virusProteins.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?protein ?proteinLabel  WHERE {
  ?protein wdt:P703 wd:Q82069695 ; wdt:P31 wd:Q8054 .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}

```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fprotein%20%3FproteinLabel%20%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fprotein%20%3FproteinLabel%20%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A)


### Output
<table>
  <tr>
    <td><b>protein</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917572">NSP10 from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917579">Uridylate-specific endoribonuclease</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917580">2'-O-methyltransferase</a> (<a href="http://www.wikidata.org/entity/Q87917580">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917581">Papain-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">3C-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917584">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917585">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88174316">orf1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88200603">Viroporin 3a</a> (<a href="http://www.wikidata.org/entity/Q88200603">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88655710">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88655710">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88656821">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88656821">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88656943">Non-structural protein 6</a> (<a href="http://www.wikidata.org/entity/Q88656943">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88658500">Protein 7a</a> (<a href="http://www.wikidata.org/entity/Q88658500">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88658861">Protein non-structural 7b</a> (<a href="http://www.wikidata.org/entity/Q88658861">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88659350">Non-structural protein 8</a> (<a href="http://www.wikidata.org/entity/Q88659350">edit</a>)</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o virusProteins.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/virusProteins.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@virusProteins.rq
```
This SPARQL query is available under CCZero.
