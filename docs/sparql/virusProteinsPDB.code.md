# virusProteinsPDB.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?protein ?proteinLabel ?refseq ?uniprot ?pdb WHERE {
  ?protein wdt:P703 wd:Q82069695 ; wdt:P31 wd:Q8054 .
  ?protein wdt:P638 ?pdb .
  OPTIONAL { ?protein wdt:P637 ?refseq }
  OPTIONAL { ?protein wdt:P352 ?uniprot }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fprotein%20%3FproteinLabel%20%3Frefseq%20%3Funiprot%20%3Fpdb%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fprotein%20wdt%3AP638%20%3Fpdb%20.%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP637%20%3Frefseq%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP352%20%3Funiprot%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fprotein%20%3FproteinLabel%20%3Frefseq%20%3Funiprot%20%3Fpdb%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fprotein%20wdt%3AP638%20%3Fpdb%20.%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP637%20%3Frefseq%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP352%20%3Funiprot%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>protein</b></td>
    <td><b>refseq</b></td>
    <td><b>uniprot</b></td>
    <td><b>pdb</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917572">NSP10 from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td></td>
    <td></td>
    <td>6W4H</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917579">Uridylate-specific endoribonuclease</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td></td>
    <td></td>
    <td>6VWW</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917579">Uridylate-specific endoribonuclease</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td></td>
    <td></td>
    <td>6W01</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917580">2'-O-methyltransferase</a> (<a href="http://www.wikidata.org/entity/Q87917580">edit</a>)</td>
    <td></td>
    <td></td>
    <td>6W4H</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917581">Papain-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>YP_009725299.1</td>
    <td></td>
    <td>6VXS</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917581">Papain-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>YP_009725299.1</td>
    <td></td>
    <td>6W02</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">3C-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td></td>
    <td></td>
    <td>5R81</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">3C-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td></td>
    <td></td>
    <td>5R82</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">3C-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td></td>
    <td></td>
    <td>5R83</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">3C-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td></td>
    <td></td>
    <td>6M03</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">3C-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td></td>
    <td></td>
    <td>6Y2E</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">3C-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td></td>
    <td></td>
    <td>6Y2F</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">3C-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td></td>
    <td></td>
    <td>6Y84</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917584">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td></td>
    <td>P0DTC9</td>
    <td>6M3M</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917585">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td>P0DTC2</td>
    <td>6VXX</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917585">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td>P0DTC2</td>
    <td>6VYB</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88174316">orf1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>QHD43415</td>
    <td>P0DTD1</td>
    <td>6Y2E</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88174316">orf1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>QHD43415</td>
    <td>P0DTD1</td>
    <td>6Y2F</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88174316">orf1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>QHD43415</td>
    <td>P0DTD1</td>
    <td>6Y2G</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o virusProteinsPDB.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/virusProteinsPDB.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@virusProteinsPDB.rq
```
This SPARQL query is available under CCZero.
