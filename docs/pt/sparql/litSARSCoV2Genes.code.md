# litSARSCoV2Genes.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT (MAX(?dates) as ?date) ?work ?workLabel ?doi WHERE {
  ?gene wdt:P703 wd:Q82069695 ; wdt:P31 wd:Q7187 .
  ?work wdt:P921 ?gene .
  OPTIONAL { ?work wdt:P577 ?dates . }
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
} GROUP BY ?work ?workLabel ?doi ORDER BY DESC(?date)
```
[run](https://query.wikidata.org/embed.html#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fgene%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fgene%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%0A) or [edit](https://query.wikidata.org/#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fgene%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fgene%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%0A)


### Output
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>doi</b></td>
  </tr>
  <tr>
    <td>2022-05-17</td>
    <td><a href="https://scholia.toolforge.org/Q112566256">Spectral and theoretical study of SARS-CoV-2 ORF10 protein interaction with endogenous and exogenous macroheterocyclic compounds</a> (<a href="http://www.wikidata.org/entity/Q112566256">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.SAA.2022.121403">10.1016/J.SAA.2022.121403</a></td>
  </tr>
  <tr>
    <td>2022-03-15</td>
    <td><a href="https://scholia.toolforge.org/Q120816882">The importance of accessory protein variants in the pathogenicity of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q120816882">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ABB.2022.109124">10.1016/J.ABB.2022.109124</a></td>
  </tr>
  <tr>
    <td>2021-12-02</td>
    <td><a href="https://scholia.toolforge.org/Q112712597">Emergence of unique SARS-CoV-2 ORF10 variants and their impact on protein structure and function</a> (<a href="http://www.wikidata.org/entity/Q112712597">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.IJBIOMAC.2021.11.151">10.1016/J.IJBIOMAC.2021.11.151</a></td>
  </tr>
  <tr>
    <td>2021-06-01</td>
    <td><a href="https://scholia.toolforge.org/Q106447854">Conflicting and ambiguous names of overlapping ORFs in the SARS-CoV-2 genome: A homology-based resolution</a> (<a href="http://www.wikidata.org/entity/Q106447854">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.VIROL.2021.02.013">10.1016/J.VIROL.2021.02.013</a></td>
  </tr>
  <tr>
    <td>2021-01-05</td>
    <td><a href="https://scholia.toolforge.org/Q104745911">Characterization of SARS-CoV-2 ORF6 deletion variants detected in a nosocomial cluster during routine genomic surveillance, Lyon, France</a> (<a href="http://www.wikidata.org/entity/Q104745911">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2021.1872351">10.1080/22221751.2021.1872351</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q108503531">SARS-CoV-2 Accessory Protein ORF7b Mediates Tumor Necrosis Factor-α-Induced Apoptosis in Cells</a> (<a href="http://www.wikidata.org/entity/Q108503531">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FMICB.2021.654709">10.3389/FMICB.2021.654709</a></td>
  </tr>
  <tr>
    <td>2020-10-01</td>
    <td><a href="https://scholia.toolforge.org/Q100404793">Dynamically evolving novel overlapping gene as a factor in the SARS-CoV-2 pandemic</a> (<a href="http://www.wikidata.org/entity/Q100404793">edit</a>)</td>
    <td><a href="https://doi.org/10.7554/ELIFE.59633">10.7554/ELIFE.59633</a></td>
  </tr>
  <tr>
    <td>2020-08-18</td>
    <td><a href="https://scholia.toolforge.org/Q98614780">Effects of a major deletion in the SARS-CoV-2 genome on the severity of infection and the inflammatory response: an observational cohort study</a> (<a href="http://www.wikidata.org/entity/Q98614780">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/S0140-6736(20)31757-8">10.1016/S0140-6736(20)31757-8</a></td>
  </tr>
  <tr>
    <td>2020-07-21</td>
    <td><a href="https://scholia.toolforge.org/Q97642415">Discovery and Genomic Characterization of a 382-Nucleotide Deletion in ORF7b and ORF8 during the Early Evolution of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q97642415">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/MBIO.01610-20">10.1128/MBIO.01610-20</a></td>
  </tr>
  <tr>
    <td>2020-06-22</td>
    <td><a href="https://scholia.toolforge.org/Q96639683">A neutralizing human antibody binds to the N-terminal domain of the Spike protein of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q96639683">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABC6952">10.1126/SCIENCE.ABC6952</a></td>
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
    <td>2020-04-20</td>
    <td><a href="https://scholia.toolforge.org/Q94503565">Crystal structure of SARS-CoV-2 nucleocapsid protein RNA binding domain reveals potential unique drug targeting sites</a> (<a href="http://www.wikidata.org/entity/Q94503565">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.APSB.2020.04.009">10.1016/J.APSB.2020.04.009</a></td>
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
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litSARSCoV2Genes.rq | sed 's+<lang/>+pt+' > litSARSCoV2Genes.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litSARSCoV2Genes.rq
```
This SPARQL query is available under CCZero.
