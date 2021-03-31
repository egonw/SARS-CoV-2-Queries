# virusProteins.rq
**Ejemplos de código:** [curl](#curl)
### SPARQL
```sparql
SELECT ?protein ?proteinLabel ?short ?refseq ?uniprot ?guideToPharma WHERE {
  ?protein wdt:P703 wd:Q82069695 ; wdt:P31 wd:Q8054 .
  OPTIONAL { ?protein wdt:P637 ?refseq }
  OPTIONAL { ?protein wdt:P352 ?uniprot }
  OPTIONAL { ?protein wdt:P5458 ?guideToPharma }
  OPTIONAL { ?protein wdt:P1813 ?short }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
} ORDER BY ASC(?protein) ASC(?uniprot)
```
[ejecutar](https://query.wikidata.org/embed.html#SELECT%20%3Fprotein%20%3FproteinLabel%20%3Fshort%20%3Frefseq%20%3Funiprot%20%3FguideToPharma%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP637%20%3Frefseq%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP352%20%3Funiprot%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP5458%20%3FguideToPharma%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP1813%20%3Fshort%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fprotein%29%20ASC%28%3Funiprot%29%0A) o [editar](https://query.wikidata.org/#SELECT%20%3Fprotein%20%3FproteinLabel%20%3Fshort%20%3Frefseq%20%3Funiprot%20%3FguideToPharma%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP637%20%3Frefseq%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP352%20%3Funiprot%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP5458%20%3FguideToPharma%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP1813%20%3Fshort%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fprotein%29%20ASC%28%3Funiprot%29%0A)


### Resultados
<table>
  <tr>
    <td><b>protein</b></td>
    <td><b>short</b></td>
    <td><b>refseq</b></td>
    <td><b>uniprot</b></td>
    <td><b>guideToPharma</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104440033">putative protein ORF3c</a> (<a href="http://www.wikidata.org/entity/Q104440033">edit</a>)</td>
    <td></td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTG1">P0DTG1</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104500452">Non-structural protein 11 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q104500452">edit</a>)</td>
    <td>nsp11</td>
    <td>YP_009725312</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449645">P0DTC1-PRO_0000449645</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104508186">ORF3b protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q104508186">edit</a>)</td>
    <td></td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTF1">P0DTF1</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104520877">ORF9c protein [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q104520877">edit</a>)</td>
    <td></td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD3">P0DTD3</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106020256">S1 Subunit of Spike Protein</a> (<a href="http://www.wikidata.org/entity/Q106020256">edit</a>)</td>
    <td>S1</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2-PRO_0000449647">P0DTC2-PRO_0000449647</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106020384">S2 Subunit of Spike Protein</a> (<a href="http://www.wikidata.org/entity/Q106020384">edit</a>)</td>
    <td></td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2-PRO_0000449648">P0DTC2-PRO_0000449648</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106025033">S2' Subunit of Spike Protein</a> (<a href="http://www.wikidata.org/entity/Q106025033">edit</a>)</td>
    <td></td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2-PRO_0000449649">P0DTC2-PRO_0000449649</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917572">Non-structural protein 10 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td>nsp10</td>
    <td>YP_009725306</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449628">P0DTD1-PRO_0000449628</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917579">non-structural protein 15 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td>nsp15</td>
    <td>YP_009725310</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449632">P0DTD1-PRO_0000449632</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917580">non-structural protein 16 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917580">edit</a>)</td>
    <td>nsp16</td>
    <td>YP_009725311</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449633">P0DTD1-PRO_0000449633</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>nsp3</td>
    <td>YP_009725299.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449637">P0DTC1-PRO_0000449637</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>nsp3</td>
    <td>YP_009725299.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449621">P0DTD1-PRO_0000449621</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>nsp5</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3111">3111</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>nsp5</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3111">3111</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>N</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3121">3121</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>S</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3114">3114</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td></td>
    <td>YP_009724389.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3125">3125</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88200603">Viroporin 3a [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88200603">edit</a>)</td>
    <td></td>
    <td>YP_009724391.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC3">P0DTC3</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3115">3115</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88655710">envelope protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88655710">edit</a>)</td>
    <td>E</td>
    <td>YP_009724392.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC4">P0DTC4</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3116">3116</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88656821">membrane protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88656821">edit</a>)</td>
    <td>M</td>
    <td>YP_009724393.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC5">P0DTC5</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3117">3117</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88656943">non-structural protein 6 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88656943">edit</a>)</td>
    <td>nsp6</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449640">P0DTC1-PRO_0000449640</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3118">3118</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88656943">non-structural protein 6 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88656943">edit</a>)</td>
    <td>nsp6</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449624">P0DTD1-PRO_0000449624</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3118">3118</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88657499">ORF1a polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88657499">edit</a>)</td>
    <td></td>
    <td>YP_009725295.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1">P0DTC1</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3124">3124</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88658500">Protein 7a [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88658500">edit</a>)</td>
    <td></td>
    <td>YP_009724395.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC7">P0DTC7</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3119">3119</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88658861">Protein non-structural 7b [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88658861">edit</a>)</td>
    <td></td>
    <td>YP_009725318.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD8">P0DTD8</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3123">3123</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88659350">ORF8 protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88659350">edit</a>)</td>
    <td></td>
    <td>YP_009724396.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC8">P0DTC8</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3120">3120</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89006922">Non-structural protein 2 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89006922">edit</a>)</td>
    <td>nsp2</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449636">P0DTC1-PRO_0000449636</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89006922">Non-structural protein 2 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89006922">edit</a>)</td>
    <td>nsp2</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449620">P0DTD1-PRO_0000449620</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89226299">ORF6 protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89226299">edit</a>)</td>
    <td></td>
    <td>YP_009724394.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC6">P0DTC6</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89227548">ORF10 protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89227548">edit</a>)</td>
    <td></td>
    <td>YP_009725255.1</td>
    <td><a href="https://www.uniprot.org/uniprot/A0A663DJA2">A0A663DJA2</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89597571">Protein ORF9b [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89597571">edit</a>)</td>
    <td></td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD2">P0DTD2</a></td>
    <td><a href="https://www.guidetopharmacology.org/GRAC/ObjectDisplayForward?objectId=3122">3122</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89686805">Non-structural protein 9 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89686805">edit</a>)</td>
    <td>nsp9</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449643">P0DTC1-PRO_0000449643</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q89686805">Non-structural protein 9 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q89686805">edit</a>)</td>
    <td>nsp9</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449627">P0DTD1-PRO_0000449627</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90038952">Host translation inhibitor nsp1 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90038952">edit</a>)</td>
    <td>nsp1</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449635">P0DTC1-PRO_0000449635</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90038952">Host translation inhibitor nsp1 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90038952">edit</a>)</td>
    <td>nsp1</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449619">P0DTD1-PRO_0000449619</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90038956">Non-structural protein 4 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90038956">edit</a>)</td>
    <td>nsp4</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449638">P0DTC1-PRO_0000449638</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90038956">Non-structural protein 4 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90038956">edit</a>)</td>
    <td>nsp4</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449622">P0DTD1-PRO_0000449622</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90038963">Non-structural protein 7 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90038963">edit</a>)</td>
    <td>nsp7</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449641">P0DTC1-PRO_0000449641</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90038963">Non-structural protein 7 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90038963">edit</a>)</td>
    <td>nsp7</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449625">P0DTD1-PRO_0000449625</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90042395">RNA-directed RNA polymerase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90042395">edit</a>)</td>
    <td>nsp12</td>
    <td>YP_009725307</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449629">P0DTD1-PRO_0000449629</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90042407">Non-structural protein 14 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90042407">edit</a>)</td>
    <td>nsp14</td>
    <td>YP_009725309</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449631">P0DTD1-PRO_0000449631</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q90042799">Helicase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q90042799">edit</a>)</td>
    <td>nsp13</td>
    <td>YP_009725308</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449630">P0DTD1-PRO_0000449630</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q94994433">Uncharacterized protein 14</a> (<a href="http://www.wikidata.org/entity/Q94994433">edit</a>)</td>
    <td></td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD3">P0DTD3</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97926844">Non-structural protein nsp8 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q97926844">edit</a>)</td>
    <td>nsp8</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449642">P0DTC1-PRO_0000449642</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97926844">Non-structural protein nsp8 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q97926844">edit</a>)</td>
    <td>nsp8</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449626">P0DTD1-PRO_0000449626</a></td>
    <td></td>
  </tr>
</table>
## Ejemplos de código
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/virusProteins.rq | sed 's+<lang/>+es+' > virusProteins.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@virusProteins.rq
```
Esta consulta SPARQL está disponible en CCZero.
