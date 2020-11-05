# litSARSCoV2Genes.rq
**コード例:** [curl](#curl)
### SPARQL
```sparql
SELECT (MAX(?dates) as ?date) ?work ?workLabel ?doi WHERE {
  ?gene wdt:P703 wd:Q82069695 ; wdt:P31 wd:Q7187 .
  ?work wdt:P921 ?gene .
  OPTIONAL { ?work wdt:P577 ?dates . }
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
} GROUP BY ?work ?workLabel ?doi ORDER BY DESC(?date)
```
[実行](https://query.wikidata.org/embed.html#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fgene%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fgene%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%0A) もしくは [編集](https://query.wikidata.org/#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fgene%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fgene%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%0A)


### 結果
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>doi</b></td>
  </tr>
  <tr>
    <td>2020-07-21</td>
    <td><a href="https://scholia.toolforge.org/Q97642415">Discovery and Genomic Characterization of a 382-Nucleotide Deletion in ORF7b and ORF8 during the Early Evolution of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q97642415">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/MBIO.01610-20">10.1128/MBIO.01610-20</a></td>
  </tr>
  <tr>
    <td>2020-06-23</td>
    <td><a href="https://scholia.toolforge.org/Q97086727">Identification of multiple large deletions in ORF7a resulting in in-frame gene fusions in clinical SARS-CoV-2 isolates</a> (<a href="http://www.wikidata.org/entity/Q97086727">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JCV.2020.104523">10.1016/J.JCV.2020.104523</a></td>
  </tr>
  <tr>
    <td>2020-06-16</td>
    <td><a href="https://scholia.toolforge.org/Q96435377">SARS-CoV-2 genomic surveillance in Taiwan revealed novel ORF8-deletion mutant and clade possibly associated with infections in Middle East</a> (<a href="http://www.wikidata.org/entity/Q96435377">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1782271">10.1080/22221751.2020.1782271</a></td>
  </tr>
  <tr>
    <td>2020-05-25</td>
    <td><a href="https://scholia.toolforge.org/Q95602587">Genomic surveillance of SARS-CoV-2 in Thailand reveals mixed imported populations, a local lineage expansion and a virus with truncated ORF7a</a> (<a href="http://www.wikidata.org/entity/Q95602587">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.22.20108498">10.1101/2020.05.22.20108498</a></td>
  </tr>
  <tr>
    <td>2020-05-18</td>
    <td><a href="https://scholia.toolforge.org/Q95624520">Molecular conservation and Differential mutation on ORF3a gene in Indian SARS-CoV2 genomes</a> (<a href="http://www.wikidata.org/entity/Q95624520">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.14.096107">10.1101/2020.05.14.096107</a></td>
  </tr>
  <tr>
    <td>2020-04-30</td>
    <td><a href="https://scholia.toolforge.org/Q94470555">A SARS-CoV-2 protein interaction map reveals targets for drug repurposing</a> (<a href="http://www.wikidata.org/entity/Q94470555">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2286-9">10.1038/S41586-020-2286-9</a></td>
  </tr>
  <tr>
    <td>2020-04-12</td>
    <td><a href="https://scholia.toolforge.org/Q95623958">Positive selection of ORF3a and ORF8 genes drives the evolution of SARS-CoV-2 during the 2020 COVID-19 pandemic</a> (<a href="http://www.wikidata.org/entity/Q95623958">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.04.10.035964">10.1101/2020.04.10.035964</a></td>
  </tr>
  <tr>
    <td>2020-03-11</td>
    <td><a href="https://scholia.toolforge.org/Q88198219">From SARS and MERS CoVs to SARS‐CoV‐2: Moving toward more biased codon usage in viral structural and nonstructural genes</a> (<a href="http://www.wikidata.org/entity/Q88198219">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.25754">10.1002/JMV.25754</a></td>
  </tr>
  <tr>
    <td>2020-03-10</td>
    <td><a href="https://scholia.toolforge.org/Q88197712">Genetic evolution analysis of 2019 novel coronavirus and coronavirus from other species</a> (<a href="http://www.wikidata.org/entity/Q88197712">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.MEEGID.2020.104285">10.1016/J.MEEGID.2020.104285</a></td>
  </tr>
  <tr>
    <td>2020-02-18</td>
    <td><a href="https://scholia.toolforge.org/Q87461510">Virus against virus: a potential treatment for 2019-nCov (SARS-CoV-2) and other RNA viruses</a> (<a href="http://www.wikidata.org/entity/Q87461510">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41422-020-0290-0">10.1038/S41422-020-0290-0</a></td>
  </tr>
  <tr>
    <td>2007-07-20</td>
    <td><a href="https://scholia.toolforge.org/Q80654151">Expression, post-translational modification and biochemical characterization of proteins encoded by subgenomic mRNA8 of the severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q80654151">edit</a>)</td>
    <td><a href="https://doi.org/10.1111/J.1742-4658.2007.05947.X">10.1111/J.1742-4658.2007.05947.X</a></td>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litSARSCoV2Genes.rq | sed 's+<lang/>+ja+' > litSARSCoV2Genes.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litSARSCoV2Genes.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
