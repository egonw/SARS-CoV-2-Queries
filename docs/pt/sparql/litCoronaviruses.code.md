# litCoronaviruses.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT (MAX(?dates) as ?date) ?work ?workLabel ?doi WHERE {
  ?work wdt:P921 wd:Q57751738 .
  OPTIONAL { ?work wdt:P577 ?dates . }
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
} GROUP BY ?work ?workLabel ?doi ORDER BY DESC(?date)
```
[run](https://query.wikidata.org/embed.html#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ57751738%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%0A) or [edit](https://query.wikidata.org/#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ57751738%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%0A)


### Output
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>doi</b></td>
  </tr>
  <tr>
    <td>2021-04-26</td>
    <td><a href="https://scholia.toolforge.org/Q107296589">Fundamental evolution of all Orthocoronavirinae including three deadly lineages descendent from Chiroptera‐hosted coronaviruses: SARS‐CoV, MERS‐CoV and SARS‐CoV‐2</a> (<a href="http://www.wikidata.org/entity/Q107296589">edit</a>)</td>
    <td><a href="https://doi.org/10.1111/CLA.12454">10.1111/CLA.12454</a></td>
  </tr>
  <tr>
    <td>2021-03-19</td>
    <td><a href="https://scholia.toolforge.org/Q106077883">Major coronavirus variant found in pets for first time</a> (<a href="http://www.wikidata.org/entity/Q106077883">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABI6152">10.1126/SCIENCE.ABI6152</a></td>
  </tr>
  <tr>
    <td>2020-11-23</td>
    <td><a href="https://scholia.toolforge.org/Q102329953">No Evidence of Coronaviruses or Other Potentially Zoonotic Viruses in Sunda pangolins (Manis javanica) Entering the Wildlife Trade via Malaysia</a> (<a href="http://www.wikidata.org/entity/Q102329953">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S10393-020-01503-X">10.1007/S10393-020-01503-X</a></td>
  </tr>
  <tr>
    <td>2020-09-01</td>
    <td><a href="https://scholia.toolforge.org/Q95644841">A Guide to COVID-19: a global pandemic caused by the novel coronavirus SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q95644841">edit</a>)</td>
    <td><a href="https://doi.org/10.1111/FEBS.15375">10.1111/FEBS.15375</a></td>
  </tr>
  <tr>
    <td>2020-09-01</td>
    <td><a href="https://scholia.toolforge.org/Q97547322">Wild birds as reservoirs for diverse and abundant gamma- and deltacoronaviruses</a> (<a href="http://www.wikidata.org/entity/Q97547322">edit</a>)</td>
    <td><a href="https://doi.org/10.1093/FEMSRE/FUAA026">10.1093/FEMSRE/FUAA026</a></td>
  </tr>
  <tr>
    <td>2020-08-27</td>
    <td><a href="https://scholia.toolforge.org/Q98777477">Characterization of accessory genes in coronavirus genomes</a> (<a href="http://www.wikidata.org/entity/Q98777477">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/S12985-020-01402-1">10.1186/S12985-020-01402-1</a></td>
  </tr>
  <tr>
    <td>2020-06-01</td>
    <td><a href="https://scholia.toolforge.org/Q87716536">The neuroinvasive potential of SARS‐CoV2 may be at least partially responsible for the respiratory failure of COVID‐19 patients</a> (<a href="http://www.wikidata.org/entity/Q87716536">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.25728">10.1002/JMV.25728</a></td>
  </tr>
  <tr>
    <td>2020-06-01</td>
    <td><a href="https://scholia.toolforge.org/Q89046119">A new threat from an old enemy: Re‑emergence of coronavirus (Review)</a> (<a href="http://www.wikidata.org/entity/Q89046119">edit</a>)</td>
    <td><a href="https://doi.org/10.3892/IJMM.2020.4555">10.3892/IJMM.2020.4555</a></td>
  </tr>
  <tr>
    <td>2020-04-25</td>
    <td><a href="https://scholia.toolforge.org/Q91956371">The coronavirus proofreading exoribonuclease mediates extensive viral recombination</a> (<a href="http://www.wikidata.org/entity/Q91956371">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.04.23.057786">10.1101/2020.04.23.057786</a></td>
  </tr>
  <tr>
    <td>2020-04-10</td>
    <td><a href="https://scholia.toolforge.org/Q91806468">COVID-19 Autopsies, Oklahoma, USA</a> (<a href="http://www.wikidata.org/entity/Q91806468">edit</a>)</td>
    <td><a href="https://doi.org/10.1093/AJCP/AQAA062">10.1093/AJCP/AQAA062</a></td>
  </tr>
  <tr>
    <td>2020-04-06</td>
    <td><a href="https://scholia.toolforge.org/Q91610063">An orally bioavailable broad-spectrum antiviral inhibits SARS-CoV-2 in human airway epithelial cell cultures and multiple coronaviruses in mice</a> (<a href="http://www.wikidata.org/entity/Q91610063">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCITRANSLMED.ABB5883">10.1126/SCITRANSLMED.ABB5883</a></td>
  </tr>
  <tr>
    <td>2020-04-01</td>
    <td><a href="https://scholia.toolforge.org/Q87675797">[Recommendations for critically ill patients with COVID-19]</a> (<a href="http://www.wikidata.org/entity/Q87675797">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S00063-020-00674-3">10.1007/S00063-020-00674-3</a></td>
  </tr>
  <tr>
    <td>2020-03-20</td>
    <td><a href="https://scholia.toolforge.org/Q90608248">COVID-19 and smoking: A systematic review of the evidence</a> (<a href="http://www.wikidata.org/entity/Q90608248">edit</a>)</td>
    <td><a href="https://doi.org/10.18332/TID/119324">10.18332/TID/119324</a></td>
  </tr>
  <tr>
    <td>2020-03-19</td>
    <td><a href="https://scholia.toolforge.org/Q88457639">New blood tests for antibodies could show true scale of coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q88457639">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABB8028">10.1126/SCIENCE.ABB8028</a></td>
  </tr>
  <tr>
    <td>2020-03-16</td>
    <td><a href="https://scholia.toolforge.org/Q90466478">Active smoking is not associated with severity of coronavirus disease 2019 (COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q90466478">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.EJIM.2020.03.014">10.1016/J.EJIM.2020.03.014</a></td>
  </tr>
  <tr>
    <td>2020-03-14</td>
    <td><a href="https://scholia.toolforge.org/Q90341054">Coronavirus Disease 2019 (COVID-19): A Systematic Review of Imaging Findings in 919 Patients</a> (<a href="http://www.wikidata.org/entity/Q90341054">edit</a>)</td>
    <td><a href="https://doi.org/10.2214/AJR.20.23034">10.2214/AJR.20.23034</a></td>
  </tr>
  <tr>
    <td>2020-03-12</td>
    <td><a href="https://scholia.toolforge.org/Q104641454">Coronavirus i danske produktionsdyr, kæledyr og vilde dyr</a> (<a href="http://www.wikidata.org/entity/Q104641454">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-10</td>
    <td><a href="https://scholia.toolforge.org/Q90335371">A systematic review on the efficacy and safety of chloroquine for the treatment of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q90335371">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JCRC.2020.03.005">10.1016/J.JCRC.2020.03.005</a></td>
  </tr>
  <tr>
    <td>2020-03-04</td>
    <td><a href="https://scholia.toolforge.org/Q90336202">Asymptomatic carrier state, acute respiratory disease, and pneumonia due to severe acute respiratory syndrome coronavirus 2 (SARS-CoV-2): Facts and myths</a> (<a href="http://www.wikidata.org/entity/Q90336202">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JMII.2020.02.012">10.1016/J.JMII.2020.02.012</a></td>
  </tr>
  <tr>
    <td>2020-03-01</td>
    <td><a href="https://scholia.toolforge.org/Q90010785">Mystery deepens over animal source of coronavirus</a> (<a href="http://www.wikidata.org/entity/Q90010785">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/D41586-020-00548-W">10.1038/D41586-020-00548-W</a></td>
  </tr>
  <tr>
    <td>2020-02-26</td>
    <td><a href="https://scholia.toolforge.org/Q88182256">Potential Rapid Diagnostics, Vaccine and Therapeutics for 2019 Novel Coronavirus (2019-nCoV): A Systematic Review</a> (<a href="http://www.wikidata.org/entity/Q88182256">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/JCM9030623">10.3390/JCM9030623</a></td>
  </tr>
  <tr>
    <td>2020-02-14</td>
    <td><a href="https://scholia.toolforge.org/Q88485680">The First Disease X is Caused by a Highly Transmissible Acute Respiratory Syndrome Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q88485680">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S12250-020-00206-5">10.1007/S12250-020-00206-5</a></td>
  </tr>
  <tr>
    <td>2019-02-01</td>
    <td><a href="https://scholia.toolforge.org/Q84315387">Emerging and re-emerging coronaviruses in pigs</a> (<a href="http://www.wikidata.org/entity/Q84315387">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.COVIRO.2018.12.001">10.1016/J.COVIRO.2018.12.001</a></td>
  </tr>
  <tr>
    <td>2017-11-14</td>
    <td><a href="https://scholia.toolforge.org/Q41933450">Protective Humoral Immunity in the CNS Requires Peripheral CD19-Dependent Germinal Center Formation Following Coronavirus Encephalomyelitis.</a> (<a href="http://www.wikidata.org/entity/Q41933450">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.01352-17">10.1128/JVI.01352-17</a></td>
  </tr>
  <tr>
    <td>2013-09-05</td>
    <td><a href="https://scholia.toolforge.org/Q21131373">Emergence of the Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q21131373">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PPAT.1003595">10.1371/JOURNAL.PPAT.1003595</a></td>
  </tr>
  <tr>
    <td>2013-04-30</td>
    <td><a href="https://scholia.toolforge.org/Q36872701">Cell host response to infection with novel human coronavirus EMC predicts potential antivirals and important differences with SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q36872701">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/MBIO.00165-13">10.1128/MBIO.00165-13</a></td>
  </tr>
  <tr>
    <td>2012-11-07</td>
    <td><a href="https://scholia.toolforge.org/Q24605877">The role of severe acute respiratory syndrome (SARS)-coronavirus accessory proteins in virus pathogenesis</a> (<a href="http://www.wikidata.org/entity/Q24605877">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/V4112902">10.3390/V4112902</a></td>
  </tr>
  <tr>
    <td>2000-06-01</td>
    <td><a href="https://scholia.toolforge.org/Q27469592">Assembly of the coronavirus envelope: homotypic interactions between the M proteins</a> (<a href="http://www.wikidata.org/entity/Q27469592">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.74.11.4967-4978.2000">10.1128/JVI.74.11.4967-4978.2000</a></td>
  </tr>
  <tr>
    <td>1994-05-01</td>
    <td><a href="https://scholia.toolforge.org/Q64383552">[Pathogen role of coronavirus in pediatric intensive care: retrospective analysis of 19 positive samples with indirect immunofluorescence]</a> (<a href="http://www.wikidata.org/entity/Q64383552">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q110590100">PAGER-CoV</a> (<a href="http://www.wikidata.org/entity/Q110590100">edit</a>)</td>
    <td></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litCoronaviruses.rq | sed 's+<lang/>+pt+' > litCoronaviruses.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litCoronaviruses.rq
```
This SPARQL query is available under CCZero.
