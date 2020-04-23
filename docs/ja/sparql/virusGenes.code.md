# virusGenes.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?gene ?geneLabel ?ncbi WHERE {
  ?gene wdt:P703 wd:Q82069695 ; wdt:P31 wd:Q7187 .
  OPTIONAL { ?gene wdt:P351 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}
```
[run](https://query.wikidata.org/embed.html#SELECT%20%3Fgene%20%3FgeneLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fgene%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20OPTIONAL%20%7B%20%3Fgene%20wdt%3AP351%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A) or [edit](https://query.wikidata.org/#SELECT%20%3Fgene%20%3FgeneLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fgene%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20OPTIONAL%20%7B%20%3Fgene%20wdt%3AP351%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>gene</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740568">43740568</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088053">ORF1a polyprotein;ORF1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740578">43740578</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088595">ORF3a protein</a> (<a href="http://www.wikidata.org/entity/Q88088595">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740569">43740569</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88088888">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88088888">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740570">43740570</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089048">membrane glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089048">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740571">43740571</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089203">ORF6 protein</a> (<a href="http://www.wikidata.org/entity/Q88089203">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740572">43740572</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089283">ORF7a</a> (<a href="http://www.wikidata.org/entity/Q88089283">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740573">43740573</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089438">ORF7b</a> (<a href="http://www.wikidata.org/entity/Q88089438">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740574">43740574</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089552">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q88089552">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740577">43740577</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089689">nucleocapsid phosphoprotein</a> (<a href="http://www.wikidata.org/entity/Q88089689">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740575">43740575</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88089847">ORF10</a> (<a href="http://www.wikidata.org/entity/Q88089847">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43740576">43740576</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88105063">Record to support submission of GeneRIFs for a gene not in Gene (COVID-19; COVID-19 virus; COVID19; Human coronavirus 2019; SARS-2; Wuhan coronavirus; Wuhan seafood market pneumonia virus).</a> (<a href="http://www.wikidata.org/entity/Q88105063">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/43562271">43562271</a></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o virusGenes.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/virusGenes.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@virusGenes.rq
```
This SPARQL query is available under CCZero.
