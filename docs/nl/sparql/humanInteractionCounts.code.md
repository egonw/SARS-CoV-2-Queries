# humanInteractionCounts.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?gene ?geneLabel ?count WITH {
  SELECT ?virus ?gene (COUNT(DISTINCT ?work) AS ?count) WHERE {
    ?virus wdt:P171+ wd:Q57751738 .
    ?work wdt:P921 ?virus, ?gene .
    ?gene wdt:P703 wd:Q15978631 .
    { ?gene wdt:P31 wd:Q7187 } UNION { ?gene wdt:P31 wd:Q8054 }
  } GROUP BY ?virus ?gene
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  SERVICE wikibase:label { bd:serviceParam wikibase:language "nl,en". }
}
ORDER BY DESC(?count) ?virus ?gene
```
[uitvoeren](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%3Fcount%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fgene%20%28COUNT%28DISTINCT%20%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%2C%20%3Fgene%20.%0A%20%20%20%20%3Fgene%20wdt%3AP703%20wd%3AQ15978631%20.%0A%20%20%20%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ7187%20%7D%20UNION%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ8054%20%7D%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%20%3Fgene%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fcount%29%20%3Fvirus%20%3Fgene%0A) of [bewerken](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%3Fcount%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fgene%20%28COUNT%28DISTINCT%20%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%2C%20%3Fgene%20.%0A%20%20%20%20%3Fgene%20wdt%3AP703%20wd%3AQ15978631%20.%0A%20%20%20%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ7187%20%7D%20UNION%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ8054%20%7D%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%20%3Fgene%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fcount%29%20%3Fvirus%20%3Fgene%0A)


### Resultaten
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>gene</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td>16</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21126599">Transmembraan serine protease 2</a> (<a href="http://www.wikidata.org/entity/Q21126599">edit</a>)</td>
    <td>5</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td>5</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21126599">Transmembraan serine protease 2</a> (<a href="http://www.wikidata.org/entity/Q21126599">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q412214">Dipeptidyl peptidase 4</a> (<a href="http://www.wikidata.org/entity/Q412214">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q14875321">ACE2</a> (<a href="http://www.wikidata.org/entity/Q14875321">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q581324">Furin, paired basic amino acid cleaving enzyme</a> (<a href="http://www.wikidata.org/entity/Q581324">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18032025">TMPRSS2</a> (<a href="http://www.wikidata.org/entity/Q18032025">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21126599">Transmembraan serine protease 2</a> (<a href="http://www.wikidata.org/entity/Q21126599">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21173608">Peptidylprolyl isomerase A</a> (<a href="http://www.wikidata.org/entity/Q21173608">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q2830638">Alanine aminopeptidase</a> (<a href="http://www.wikidata.org/entity/Q2830638">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q14905314">MASP2</a> (<a href="http://www.wikidata.org/entity/Q14905314">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18032037">Tumornecrosefactor α</a> (<a href="http://www.wikidata.org/entity/Q18032037">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21131531">Interferon induced transmembrane protein 3</a> (<a href="http://www.wikidata.org/entity/Q21131531">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21131532">Interferon induced transmembrane protein 2</a> (<a href="http://www.wikidata.org/entity/Q21131532">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21171764">Interferon induced transmembrane protein 1</a> (<a href="http://www.wikidata.org/entity/Q21171764">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21126599">Transmembraan serine protease 2</a> (<a href="http://www.wikidata.org/entity/Q21126599">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q14865236">IL6</a> (<a href="http://www.wikidata.org/entity/Q14865236">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q14916427">FURIN</a> (<a href="http://www.wikidata.org/entity/Q14916427">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18032025">TMPRSS2</a> (<a href="http://www.wikidata.org/entity/Q18032025">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18053181">PIKFYVE</a> (<a href="http://www.wikidata.org/entity/Q18053181">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21119219">Transmembrane serine protease 4</a> (<a href="http://www.wikidata.org/entity/Q21119219">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q22676640">Translocase of outer mitochondrial membrane 70</a> (<a href="http://www.wikidata.org/entity/Q22676640">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q412310">Von Willebrandfactor</a> (<a href="http://www.wikidata.org/entity/Q412310">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q4651006">ADAMTS13</a> (<a href="http://www.wikidata.org/entity/Q4651006">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q5631153">HMOX1</a> (<a href="http://www.wikidata.org/entity/Q5631153">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Menselijk Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q14905314">MASP2</a> (<a href="http://www.wikidata.org/entity/Q14905314">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q18032037">Tumornecrosefactor α</a> (<a href="http://www.wikidata.org/entity/Q18032037">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21100827">C-type lectin domain family 4 member G</a> (<a href="http://www.wikidata.org/entity/Q21100827">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21100841">C-type lectin domain family 4 member M</a> (<a href="http://www.wikidata.org/entity/Q21100841">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21131531">Interferon induced transmembrane protein 3</a> (<a href="http://www.wikidata.org/entity/Q21131531">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21131532">Interferon induced transmembrane protein 2</a> (<a href="http://www.wikidata.org/entity/Q21131532">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21171764">Interferon induced transmembrane protein 1</a> (<a href="http://www.wikidata.org/entity/Q21171764">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q21173156">BCL2 like 1</a> (<a href="http://www.wikidata.org/entity/Q21173156">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q408476">BCL2 associated X, apoptosis regulator</a> (<a href="http://www.wikidata.org/entity/Q408476">edit</a>)</td>
    <td>1</td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/humanInteractionCounts.rq | sed 's+<lang/>+nl+' > humanInteractionCounts.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@humanInteractionCounts.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
