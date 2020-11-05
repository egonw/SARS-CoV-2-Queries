# articleCountPerGene.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
#defaultView:BarChart
SELECT ?gene ?geneLabel (COUNT(?work) AS ?count) WHERE {
  ?gene wdt:P703 wd:Q82069695 ; wdt:P31 wd:Q7187 .
  ?work wdt:P921 ?gene .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
} GROUP BY ?gene ?geneLabel
  ORDER BY ASC(?geneLabel)
```
[uitvoeren](https://query.wikidata.org/embed.html#%23defaultView%3ABarChart%0ASELECT%20%3Fgene%20%3FgeneLabel%20%28COUNT%28%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fgene%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fgene%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fgene%20%3FgeneLabel%0A%20%20ORDER%20BY%20ASC%28%3FgeneLabel%29%0A) of [bewerken](https://query.wikidata.org/#%23defaultView%3ABarChart%0ASELECT%20%3Fgene%20%3FgeneLabel%20%28COUNT%28%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fgene%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fgene%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fgene%20%3FgeneLabel%0A%20%20ORDER%20BY%20ASC%28%3FgeneLabel%29%0A)


### Resultaten
<table>
  <tr>
    <td><b>gene</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88088053">ORF1a polyprotein;ORF1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88088595">ORF3a protein</a> (<a href="http://www.wikidata.org/entity/Q88088595">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88089283">ORF7a protein</a> (<a href="http://www.wikidata.org/entity/Q88089283">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88089438">ORF7b</a> (<a href="http://www.wikidata.org/entity/Q88089438">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88089552">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q88089552">edit</a>)</td>
    <td>5</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88088888">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88088888">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88089048">membrane glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089048">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88089689">nucleocapsid phosphoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089689">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td>1</td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/articleCountPerGene.rq | sed 's+<lang/>+nl+' > articleCountPerGene.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@articleCountPerGene.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
