# virusProteinsPDB.rq
**コード例:** [curl](#curl)
### SPARQL
```sparql
SELECT ?protein ?proteinLabel ?refseq ?uniprot ?pdb WHERE {
  ?protein wdt:P703 wd:Q82069695 ; wdt:P31 wd:Q8054 .
  ?protein wdt:P638 ?pdb .
  OPTIONAL { ?protein wdt:P637 ?refseq }
  OPTIONAL { ?protein wdt:P352 ?uniprot }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}
```
[実行](https://query.wikidata.org/embed.html#SELECT%20%3Fprotein%20%3FproteinLabel%20%3Frefseq%20%3Funiprot%20%3Fpdb%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fprotein%20wdt%3AP638%20%3Fpdb%20.%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP637%20%3Frefseq%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP352%20%3Funiprot%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A) もしくは [編集](https://query.wikidata.org/#SELECT%20%3Fprotein%20%3FproteinLabel%20%3Frefseq%20%3Funiprot%20%3Fpdb%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fprotein%20wdt%3AP638%20%3Fpdb%20.%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP637%20%3Frefseq%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fprotein%20wdt%3AP352%20%3Funiprot%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A)


### 結果
<table>
  <tr>
    <td><b>protein</b></td>
    <td><b>refseq</b></td>
    <td><b>uniprot</b></td>
    <td><b>pdb</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917572">Non-structural protein 10 [SARS CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917572">edit</a>)</td>
    <td></td>
    <td></td>
    <td><a href="https://www.rcsb.org/structure/6W4H">6W4H</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917579">non-structural protein 15 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td></td>
    <td></td>
    <td><a href="https://www.rcsb.org/structure/6VWW">6VWW</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917579">non-structural protein 15 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917579">edit</a>)</td>
    <td></td>
    <td></td>
    <td><a href="https://www.rcsb.org/structure/6W01">6W01</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917580">non-structural protein 16 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917580">edit</a>)</td>
    <td></td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449633">P0DTD1-PRO_0000449633</a></td>
    <td><a href="https://www.rcsb.org/structure/6W4H">6W4H</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>YP_009725299.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449621">P0DTD1-PRO_0000449621</a></td>
    <td><a href="https://www.rcsb.org/structure/6VXS">6VXS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>YP_009725299.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449621">P0DTD1-PRO_0000449621</a></td>
    <td><a href="https://www.rcsb.org/structure/6W02">6W02</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>YP_009725299.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449637">P0DTC1-PRO_0000449637</a></td>
    <td><a href="https://www.rcsb.org/structure/6VXS">6VXS</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917581">Papain-like proteinase [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917581">edit</a>)</td>
    <td>YP_009725299.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449637">P0DTC1-PRO_0000449637</a></td>
    <td><a href="https://www.rcsb.org/structure/6W02">6W02</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/5R81">5R81</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/5R82">5R82</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/5R83">5R83</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/6M03">6M03</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2E">6Y2E</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2F">6Y2F</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y84">6Y84</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC1-PRO_0000449639">P0DTC1-PRO_0000449639</a></td>
    <td><a href="https://www.rcsb.org/structure/6LU7">6LU7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/5R81">5R81</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/5R82">5R82</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/5R83">5R83</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/6M03">6M03</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2E">6Y2E</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2F">6Y2F</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y84">6Y84</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917582">non-structural protein 5 [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917582">edit</a>)</td>
    <td>YP_009725301</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1-PRO_0000449623">P0DTD1-PRO_0000449623</a></td>
    <td><a href="https://www.rcsb.org/structure/6LU7">6LU7</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td>YP_009724397.2</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC9">P0DTC9</a></td>
    <td><a href="https://www.rcsb.org/structure/6M3M">6M3M</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6VXX">6VXX</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td>YP_009724390.1</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTC2">P0DTC2</a></td>
    <td><a href="https://www.rcsb.org/structure/6VYB">6VYB</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>QHD43415</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2E">6Y2E</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>QHD43415</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2F">6Y2F</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88174316">orf1ab polyprotein [SARS-Cov 2]</a> (<a href="http://www.wikidata.org/entity/Q88174316">edit</a>)</td>
    <td>QHD43415</td>
    <td><a href="https://www.uniprot.org/uniprot/P0DTD1">P0DTD1</a></td>
    <td><a href="https://www.rcsb.org/structure/6Y2G">6Y2G</a></td>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/virusProteinsPDB.rq | sed 's+<lang/>+ja+' > virusProteinsPDB.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@virusProteinsPDB.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
