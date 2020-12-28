# sequenceVariants.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
SELECT ?variant ?variantLabel ?sequence ?sequenceLabel ?taxon ?taxonLabel WHERE {
  ?variant wdt:P3433 ?sequence .
  ?sequence wdt:P703 / wdt:P171* wd:Q82069695 ;
            wdt:P703 ?taxon .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
[uitvoeren](https://query.wikidata.org/embed.html#SELECT%20%3Fvariant%20%3FvariantLabel%20%3Fsequence%20%3FsequenceLabel%20%3Ftaxon%20%3FtaxonLabel%20WHERE%20%7B%0A%20%20%3Fvariant%20wdt%3AP3433%20%3Fsequence%20.%0A%20%20%3Fsequence%20wdt%3AP703%20%2F%20wdt%3AP171*%20wd%3AQ82069695%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20wdt%3AP703%20%3Ftaxon%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A) of [bewerken](https://query.wikidata.org/#SELECT%20%3Fvariant%20%3FvariantLabel%20%3Fsequence%20%3FsequenceLabel%20%3Ftaxon%20%3FtaxonLabel%20WHERE%20%7B%0A%20%20%3Fvariant%20wdt%3AP3433%20%3Fsequence%20.%0A%20%20%3Fsequence%20wdt%3AP703%20%2F%20wdt%3AP171*%20wd%3AQ82069695%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20wdt%3AP703%20%3Ftaxon%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A)


### Resultaten
<table>
  <tr>
    <td><b>variant</b></td>
    <td><b>sequence</b></td>
    <td><b>taxon</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104532779">HV 69-70 deletion</a> (<a href="http://www.wikidata.org/entity/Q104532779">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104532877">Y144 deletion</a> (<a href="http://www.wikidata.org/entity/Q104532877">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104529151">A23063T</a> (<a href="http://www.wikidata.org/entity/Q104529151">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104530608">C23604A</a> (<a href="http://www.wikidata.org/entity/Q104530608">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104528694">C3267T</a> (<a href="http://www.wikidata.org/entity/Q104528694">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88088053">ORF1a polyprotein;ORF1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104530561">C5388A</a> (<a href="http://www.wikidata.org/entity/Q104530561">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88088053">ORF1a polyprotein;ORF1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104530598">C27972T</a> (<a href="http://www.wikidata.org/entity/Q104530598">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089552">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q88089552">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104532904">ORF8 ∆382</a> (<a href="http://www.wikidata.org/entity/Q104532904">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089552">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q88089552">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/sequenceVariants.rq | sed 's+<lang/>+nl+' > sequenceVariants.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@sequenceVariants.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
