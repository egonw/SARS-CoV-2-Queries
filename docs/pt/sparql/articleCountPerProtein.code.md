# articleCountPerProtein.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
#defaultView:BarChart
SELECT ?protein ?proteinLabel (COUNT(?work) AS ?count) WHERE {
  ?protein wdt:P703 wd:Q82069695 ; wdt:P31 wd:Q8054 .
  ?work wdt:P921 ?protein .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
} GROUP BY ?protein ?proteinLabel
  ORDER BY ASC(?proteinLabel)
```
[run](https://query.wikidata.org/embed.html#%23defaultView%3ABarChart%0ASELECT%20%3Fprotein%20%3FproteinLabel%20%28COUNT%28%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fprotein%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fprotein%20%3FproteinLabel%0A%20%20ORDER%20BY%20ASC%28%3FproteinLabel%29%0A) or [edit](https://query.wikidata.org/#%23defaultView%3ABarChart%0ASELECT%20%3Fprotein%20%3FproteinLabel%20%28COUNT%28%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fprotein%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fprotein%20%3FproteinLabel%0A%20%20ORDER%20BY%20ASC%28%3FproteinLabel%29%0A)


### Output
<table>
  <tr>
    <td><b>protein</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90042799">Helicase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90042799">edit</a>)</td>
    <td>41</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90038952">Host translation inhibitor nsp1 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90038952">edit</a>)</td>
    <td>53</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917572">Non-structural protein 10 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td>57</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104500452">Non-structural protein 11 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q104500452">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90042407">Non-structural protein 14 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90042407">edit</a>)</td>
    <td>45</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89006922">Non-structural protein 2 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89006922">edit</a>)</td>
    <td>14</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90038956">Non-structural protein 4 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90038956">edit</a>)</td>
    <td>9</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90038963">Non-structural protein 7 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90038963">edit</a>)</td>
    <td>26</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89686805">Non-structural protein 9 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89686805">edit</a>)</td>
    <td>17</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97926844">Non-structural protein nsp8 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q97926844">edit</a>)</td>
    <td>25</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89227548">ORF10 protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89227548">edit</a>)</td>
    <td>10</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104508186">ORF3b protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q104508186">edit</a>)</td>
    <td>8</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89226299">ORF6 protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89226299">edit</a>)</td>
    <td>22</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88659350">ORF8 protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88659350">edit</a>)</td>
    <td>31</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104520877">ORF9c protein [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q104520877">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>74</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88658500">Protein 7a [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88658500">edit</a>)</td>
    <td>19</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89597571">Protein ORF9b [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89597571">edit</a>)</td>
    <td>16</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88658861">Protein non-structural 7b [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88658861">edit</a>)</td>
    <td>8</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90042395">RNA-directed RNA polymerase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90042395">edit</a>)</td>
    <td>58</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88200603">Viroporin 3a</a> (<a href="http://www.wikidata.org/entity/Q88200603">edit</a>)</td>
    <td>30</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88655710">envelope protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88655710">edit</a>)</td>
    <td>34</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88656821">membrane protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88656821">edit</a>)</td>
    <td>25</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917579">non-structural protein 15 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td>29</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917580">non-structural protein 16 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917580">edit</a>)</td>
    <td>46</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>60</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88656943">non-structural protein 6 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88656943">edit</a>)</td>
    <td>12</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>108</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104440033">putative protein ORF3c</a> (<a href="http://www.wikidata.org/entity/Q104440033">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>416</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/articleCountPerProtein.rq | sed 's+<lang/>+pt+' > articleCountPerProtein.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@articleCountPerProtein.rq
```
This SPARQL query is available under CCZero.
