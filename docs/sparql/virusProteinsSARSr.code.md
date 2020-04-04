# virusProteinsSARSr.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?protein ?proteinLabel ?refseq ?uniprot WHERE {
  VALUES ?virus {
    wd:Q16000326 # SL-CoV-WIV1
    wd:Q88162038 # Bat SARS coronavirus Rp1
    wd:Q85939995 # SHC014-CoV
    wd:Q82069695 # SARS-CoV-2
    wd:Q34967815 # SARS coronavirus
    wd:Q85438966 # severe acute respiratory syndrome coronavirus
    wd:Q278567   # SARSr-CoV / SARS-CoV
  }
  ?protein wdt:P703 ?virus ; wdt:P31 wd:Q8054 .
  OPTIONAL { ?protein wdt:P637 ?refseq }
  OPTIONAL { ?protein wdt:P352 ?uniprot }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20%3Frefseq%20%3Funiprot%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ16000326%20%23%20SL-CoV-WIV1%0A%20%20%20%20wd%3AQ88162038%20%23%20Bat%20SARS%20coronavirus%20Rp1%0A%20%20%20%20wd%3AQ85939995%20%23%20SHC014-CoV%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ34967815%20%23%20SARS%20coronavirus%0A%20%20%20%20wd%3AQ85438966%20%23%20severe%20acute%20respiratory%20syndrome%20coronavirus%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARSr-CoV%20%2F%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP637%20%3Frefseq%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP352%20%3Funiprot%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20%3Frefseq%20%3Funiprot%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ16000326%20%23%20SL-CoV-WIV1%0A%20%20%20%20wd%3AQ88162038%20%23%20Bat%20SARS%20coronavirus%20Rp1%0A%20%20%20%20wd%3AQ85939995%20%23%20SHC014-CoV%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ34967815%20%23%20SARS%20coronavirus%0A%20%20%20%20wd%3AQ85438966%20%23%20severe%20acute%20respiratory%20syndrome%20coronavirus%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARSr-CoV%20%2F%20SARS-CoV%0A%20%20%7D%0A%20%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP637%20%3Frefseq%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP352%20%3Funiprot%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>protein</b></td>
    <td><b>refseq</b></td>
    <td><b>uniprot</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917572">NSP10 from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917579">Uridylate-specific endoribonuclease</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917580">2'-O-methyltransferase</a> (<a href="http://www.wikidata.org/entity/Q87917580">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917581">Papain-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>YP_009725299.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917582">3C-like proteinase</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917584">nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87917585">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88174316">orf1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>QHD43415</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88200603">Viroporin 3a</a> (<a href="http://www.wikidata.org/entity/Q88200603">edit</a>)</td>
    <td>YP_009724391</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC3">P0DTC3</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365848">Envelope small membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88365848">edit</a>)</td>
    <td>NP_828854.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P59637">P59637</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365856">Non-structural protein 6</a> (<a href="http://www.wikidata.org/entity/Q88365856">edit</a>)</td>
    <td>NP_828856.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P59634">P59634</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365865">Protein 9b</a> (<a href="http://www.wikidata.org/entity/Q88365865">edit</a>)</td>
    <td>NP_828859.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P59636">P59636</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365878">Protein 7a</a> (<a href="http://www.wikidata.org/entity/Q88365878">edit</a>)</td>
    <td>NP_828857.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P59635">P59635</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365889">Protein non-structural 7b</a> (<a href="http://www.wikidata.org/entity/Q88365889">edit</a>)</td>
    <td>NP_849175.1</td>
    <td><a href="https://www.uniprot.org/uniprot/Q7TFA1">Q7TFA1</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365896">Protein 3a</a> (<a href="http://www.wikidata.org/entity/Q88365896">edit</a>)</td>
    <td>NP_828852.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P59632">P59632</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365900">Membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88365900">edit</a>)</td>
    <td>NP_828855.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P59596">P59596</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">severe acute respiratory syndrome-related coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88365908">Non-structural protein 3b</a> (<a href="http://www.wikidata.org/entity/Q88365908">edit</a>)</td>
    <td>NP_828853.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P59633">P59633</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88655710">envelope protein</a> (<a href="http://www.wikidata.org/entity/Q88655710">edit</a>)</td>
    <td>YP_009724392.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC4">P0DTC4</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88656821">membrane protein</a> (<a href="http://www.wikidata.org/entity/Q88656821">edit</a>)</td>
    <td>YP_009724393.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC5">P0DTC5</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88656943">Non-structural protein 6</a> (<a href="http://www.wikidata.org/entity/Q88656943">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC6">P0DTC6</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88658500">ORF7a protein</a> (<a href="http://www.wikidata.org/entity/Q88658500">edit</a>)</td>
    <td>YP_009724395.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC7">P0DTC7</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88658861">Protein non-structural 7b</a> (<a href="http://www.wikidata.org/entity/Q88658861">edit</a>)</td>
    <td>YP_009725318.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD8">P0DTD8</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88659350">Non-structural protein 8</a> (<a href="http://www.wikidata.org/entity/Q88659350">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC8">P0DTC8</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89006922">NSP2 from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q89006922">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89225654">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q89225654">edit</a>)</td>
    <td>YP_009724396.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89226299">ORF6 protein</a> (<a href="http://www.wikidata.org/entity/Q89226299">edit</a>)</td>
    <td>YP_009724394.1</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89227548">ORF10 protein</a> (<a href="http://www.wikidata.org/entity/Q89227548">edit</a>)</td>
    <td>YP_009725255.1</td>
    <td><a href="https://www.uniprot.org/uniprot/A0A663DJA2">A0A663DJA2</a></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89260947">ORF3a protein</a> (<a href="http://www.wikidata.org/entity/Q89260947">edit</a>)</td>
    <td>YP_009724391.1</td>
    <td></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o virusProteinsSARSr.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/virusProteinsSARSr.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@virusProteinsSARSr.rq
```
This SPARQL query is available under CCZero.
