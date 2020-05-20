# litHumanCoronavirusesProteinCounts.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?protein ?proteinLabel ?count WITH {
  SELECT ?virus ?protein (COUNT(DISTINCT ?work) AS ?count) WHERE {
    VALUES ?virus {
      wd:Q82069695 # SARS-CoV-2
      wd:Q16983360 # HKU1
      wd:Q16991954 # OC43
      wd:Q8351095  # NL63 
      wd:Q16983356 # 229E 
      wd:Q4902157  # MERS-CoV
      wd:Q278567   # SARS-CoV
    }
    ?protein wdt:P31 wd:Q8054 .
    { ?protein wdt:P703 ?virus }
    UNION
    { ?protein wdt:P702 | ^wdt:P688 ?gene . ?gene wdt:P703 ?virus }
    ?work wdt:P921 ?protein .
  } GROUP BY ?virus ?protein
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  SERVICE wikibase:label { bd:serviceParam wikibase:language "nl,en". }
}
ORDER BY DESC(?count)
```
[uitvoeren](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20%3Fcount%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fprotein%20%28COUNT%28DISTINCT%20%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fprotein%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%20%20%7B%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%7D%0A%20%20%20%20UNION%0A%20%20%20%20%7B%20%3Fprotein%20wdt%3AP702%20%7C%20%5Ewdt%3AP688%20%3Fgene%20.%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fprotein%20.%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%20%3Fprotein%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fcount%29%0A) of [bewerken](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20%3Fcount%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fprotein%20%28COUNT%28DISTINCT%20%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fprotein%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%20%20%7B%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%7D%0A%20%20%20%20UNION%0A%20%20%20%20%7B%20%3Fprotein%20wdt%3AP702%20%7C%20%5Ewdt%3AP688%20%3Fgene%20.%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fprotein%20.%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%20%3Fprotein%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fcount%29%0A)


### Resultaten
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>protein</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89458416">spike glycoprotein [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89458416">edit</a>)</td>
    <td>40</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89455671">3C-like proteinase [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89455671">edit</a>)</td>
    <td>25</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365896">Protein 3a [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365896">edit</a>)</td>
    <td>25</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89560425">papain-like proteinase [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89560425">edit</a>)</td>
    <td>21</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89457519">nucleoprotein [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89457519">edit</a>)</td>
    <td>20</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365848">Envelope small membrane protein [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365848">edit</a>)</td>
    <td>17</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>10</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660566">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88660566">edit</a>)</td>
    <td>10</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89652897">Guanine-N7 methyltransferase [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89652897">edit</a>)</td>
    <td>6</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89563869">non-structural protein 10 [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89563869">edit</a>)</td>
    <td>6</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89465097">non-structural protein 7 [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89465097">edit</a>)</td>
    <td>6</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365900">Membrane protein [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365900">edit</a>)</td>
    <td>6</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89455299">2'-O-methyltransferase [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89455299">edit</a>)</td>
    <td>5</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660197">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q88660197">edit</a>)</td>
    <td>5</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Menselijk Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366225">Spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88366225">edit</a>)</td>
    <td>5</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365878">Protein 7a [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365878">edit</a>)</td>
    <td>5</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917585">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>5</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89679739">non-structural protein 6 [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89679739">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89679708">non-structural protein 4 [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89679708">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89655950">RNA-directed RNA polymerase [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89655950">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89560415">non-structural protein 8 [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89560415">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89465384">uridylate-specific endoribonuclease [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89465384">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89457107">non-structural protein 9 [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89457107">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90143910">protein non-structural 8a [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q90143910">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660202">spike surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88660202">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89656966">helicase [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89656966">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89562023">host translation inhibitor nsp1 [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89562023">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917579">non-structural protein 15 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88216297">Spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88216297">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660576">nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q88660576">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90285330">protein non-structural 8b [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q90285330">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660189">ns12.9</a> (<a href="http://www.wikidata.org/entity/Q88660189">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366405">Spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88366405">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366398">Non-structural protein 4b</a> (<a href="http://www.wikidata.org/entity/Q88366398">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Menselijk Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366251">Nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q88366251">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365908">Non-structural protein 3b [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365908">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365856">Non-structural protein NS6 [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q88365856">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88317441">Replicase polyprotein 1ab</a> (<a href="http://www.wikidata.org/entity/Q88317441">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660232">hemagglutinin-esterase</a> (<a href="http://www.wikidata.org/entity/Q88660232">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89681007">non-structural protein 2 [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89681007">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89459410">spike protein S2 [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89459410">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89454460">replicase polyprotein 1ab [SARS-Cov]</a> (<a href="http://www.wikidata.org/entity/Q89454460">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS-virus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89599893">Replicase polyprotein 1a</a> (<a href="http://www.wikidata.org/entity/Q89599893">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q94648393">Non-structural protein 14 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q94648393">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q94647436">Non-structural protein 12 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q94647436">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89006922">Non-structural protein 2 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89006922">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917580">non-structural protein 16 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917580">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917572">Non-structural protein 10 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660589">NS4B protein</a> (<a href="http://www.wikidata.org/entity/Q88660589">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660182">ns2</a> (<a href="http://www.wikidata.org/entity/Q88660182">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88475361">Replicase polyprotein 1ab</a> (<a href="http://www.wikidata.org/entity/Q88475361">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366420">Nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q88366420">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Menselijk coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366392">Non-structural protein 4a</a> (<a href="http://www.wikidata.org/entity/Q88366392">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Menselijk Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88366260">Membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88366260">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88317460">Membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88317460">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Menselijk coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88317253">Spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88317253">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Menselijk coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88660220">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88660220">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>1</td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -o litHumanCoronavirusesProteinCounts.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litHumanCoronavirusesProteinCounts.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litHumanCoronavirusesProteinCounts.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
