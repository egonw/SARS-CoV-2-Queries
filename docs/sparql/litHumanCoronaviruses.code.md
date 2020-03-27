# litHumanCoronaviruses.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?date ?work ?workLabel ?virus ?virusLabel ?doi ?pubmed WITH {
  SELECT (MAX(?dates) as ?date) ?work ?doi ?virus WHERE {
    VALUES ?virus {
      wd:Q82069695 # SARS-CoV-2
      wd:Q16983360 # HKU1
      wd:Q16991954 # OC43
      wd:Q8351095  # NL63 
      wd:Q16983356 # 229E 
      wd:Q4902157  # MERS-CoV
      wd:Q85438966 # SARS-CoV
    }
    ?work wdt:P577 ?dates ;
          wdt:P921 ?virus .
  } GROUP BY ?work ?doi ?virus
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  OPTIONAL { ?work wdt:P356 ?doi . }
  OPTIONAL { ?work wdt:P698 ?pubmed . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,da,de,es,fr,jp,nl,no,ru,sv,zh". }
}
ORDER BY DESC(?date) ?doi
```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Fdate%20%3Fwork%20%3FworkLabel%20%3Fvirus%20%3FvirusLabel%20%3Fdoi%20%3Fpubmed%20WITH%20%7B%0A%20%20SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3Fdoi%20%3Fvirus%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ85438966%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP577%20%3Fdates%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20%3Fvirus%20.%0A%20%20%7D%20GROUP%20BY%20%3Fwork%20%3Fdoi%20%3Fvirus%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP698%20%3Fpubmed%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fdate%29%20%3Fdoi%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Fdate%20%3Fwork%20%3FworkLabel%20%3Fvirus%20%3FvirusLabel%20%3Fdoi%20%3Fpubmed%20WITH%20%7B%0A%20%20SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3Fdoi%20%3Fvirus%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ85438966%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP577%20%3Fdates%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20%3Fvirus%20.%0A%20%20%7D%20GROUP%20BY%20%3Fwork%20%3Fdoi%20%3Fvirus%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP698%20%3Fpubmed%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fdate%29%20%3Fdoi%0A)


### Output
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>virus</b></td>
    <td><b>doi</b></td>
    <td><b>pubmed</b></td>
  </tr>
  <tr>
    <td>2020-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461271">Timely development of vaccines against SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87461271">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1080/22221751.2020.1737580</td>
    <td>32148172</td>
  </tr>
  <tr>
    <td>2020-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461293">The novel Coronavirus (SARS-CoV-2) is a one health issue</a> (<a href="http://www.wikidata.org/entity/Q87461293">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/J.ONEHLT.2020.100123</td>
    <td>32140538</td>
  </tr>
  <tr>
    <td>2020-05-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461449">Potential Presymptomatic Transmission of SARS-CoV-2, Zhejiang Province, China, 2020</a> (<a href="http://www.wikidata.org/entity/Q87461449">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32091386</td>
  </tr>
  <tr>
    <td>2020-05-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461585">Risk for Transportation of 2019 Novel Coronavirus Disease from Wuhan to Other Cities in China</a> (<a href="http://www.wikidata.org/entity/Q87461585">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32053479</td>
  </tr>
  <tr>
    <td>2020-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461786">Full-genome evolutionary analysis of the novel corona virus (2019-nCoV) rejects the hypothesis of emergence as a result of a recent recombination event</a> (<a href="http://www.wikidata.org/entity/Q87461786">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32004758</td>
  </tr>
  <tr>
    <td>2020-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87945074">Enteric involvement of coronaviruses: is faecal–oral transmission of SARS-CoV-2 possible?</a> (<a href="http://www.wikidata.org/entity/Q87945074">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/S2468-1253(20)30048-0</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461794">CT Imaging of the 2019 Novel Coronavirus (2019-nCoV) Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q87461794">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1148/RADIOL.2020200236</td>
    <td>32003646</td>
  </tr>
  <tr>
    <td>2020-03-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88387054">Ethnografie und visuelle Anthropologie in Zeiten des Coronavirus SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q88387054">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88507120">The Toughest Triage — Allocating Ventilators in a Pandemic</a> (<a href="http://www.wikidata.org/entity/Q88507120">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1056/NEJMP2005689</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88433773">Fair Allocation of Scarce Medical Resources in the Time of Covid-19</a> (<a href="http://www.wikidata.org/entity/Q88433773">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1056/NEJMSB2005114</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88219766">Crystal structure of SARS-CoV-2 main protease provides a basis for design of improved α-ketoamide inhibitors</a> (<a href="http://www.wikidata.org/entity/Q88219766">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1126/SCIENCE.ABB3405</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88094851">Estimating clinical severity of COVID-19 from the transmission dynamics in Wuhan, China</a> (<a href="http://www.wikidata.org/entity/Q88094851">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/S41591-020-0822-7</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88457639">New blood tests for antibodies could show true scale of coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q88457639">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1126/SCIENCE.ABB8028</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88489983">SARS-CoV-2, the Virus that Causes COVID-19: Cytometry and the New Challenge for Global Health</a> (<a href="http://www.wikidata.org/entity/Q88489983">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1002/CYTO.A.24002</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88458126">A serological assay to detect SARS-CoV-2 seroconversion in humans</a> (<a href="http://www.wikidata.org/entity/Q88458126">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.03.17.20037713</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88048219">Crystal structure of SARS-CoV-2 nucleocapsid protein N-terminal RNA binding domain</a> (<a href="http://www.wikidata.org/entity/Q88048219">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2210/PDB6M3M/PDB</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87995005">1.80 Angstrom Resolution Crystal Structure of NSP16 - NSP10 Complex from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87995005">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2210/PDB6W4H/PDB</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87830056">The proximal origin of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87830056">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/S41591-020-0820-9</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87943251">Aerosol and Surface Stability of SARS-CoV-2 as Compared with SARS-CoV-1</a> (<a href="http://www.wikidata.org/entity/Q87943251">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1056/NEJMC2004973</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87943251">Aerosol and Surface Stability of SARS-CoV-2 as Compared with SARS-CoV-1</a> (<a href="http://www.wikidata.org/entity/Q87943251">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1056/NEJMC2004973</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87789617">Substantial undocumented infection facilitates the rapid dissemination of novel coronavirus (SARS-CoV2)</a> (<a href="http://www.wikidata.org/entity/Q87789617">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1126/SCIENCE.ABB3221</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87945075">SARS-CoV-2 and COVID-19: The most important research questions</a> (<a href="http://www.wikidata.org/entity/Q87945075">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1186/S13578-020-00404-4</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88486704">Teicoplanin: an alternative drug for the treatment of coronavirus COVID-19?</a> (<a href="http://www.wikidata.org/entity/Q88486704">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32179150</td>
  </tr>
  <tr>
    <td>2020-03-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83567432">Coronavirus latest: global infections surge past 30,000</a> (<a href="http://www.wikidata.org/entity/Q83567432">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/D41586-020-00154-W</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87675797">[Recommendations for critically ill patients with COVID-19]</a> (<a href="http://www.wikidata.org/entity/Q87675797">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1007/S00063-020-00674-3</td>
    <td>32166350</td>
  </tr>
  <tr>
    <td>2020-03-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87843129">A Novel Approach for a Novel Pathogen: using a home assessment team to evaluate patients for 2019 novel coronavirus (SARS-CoV-2)</a> (<a href="http://www.wikidata.org/entity/Q87843129">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1093/CID/CIAA256</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88198219">From SARS and MERS CoVs to SARS‐CoV‐2: Moving toward more biased codon usage in viral structural and nonstructural genes</a> (<a href="http://www.wikidata.org/entity/Q88198219">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1002/JMV.25754</td>
    <td>32159237</td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88198219">From SARS and MERS CoVs to SARS‐CoV‐2: Moving toward more biased codon usage in viral structural and nonstructural genes</a> (<a href="http://www.wikidata.org/entity/Q88198219">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1002/JMV.25754</td>
    <td>32159237</td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88197712">Genetic evolution analysis of 2019 novel coronavirus and coronavirus from other species</a> (<a href="http://www.wikidata.org/entity/Q88197712">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/J.MEEGID.2020.104285</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87995864">PanDDA analysis group deposition -- Crystal Structure of COVID-19 main protease in complex with Z1367324110</a> (<a href="http://www.wikidata.org/entity/Q87995864">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2210/PDB5R81/PDB</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87995869">PanDDA analysis group deposition -- Crystal Structure of COVID-19 main protease in complex with Z219104216</a> (<a href="http://www.wikidata.org/entity/Q87995869">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2210/PDB5R82/PDB</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88047504">PanDDA analysis group deposition -- Crystal Structure of COVID-19 main protease in complex with Z44592329</a> (<a href="http://www.wikidata.org/entity/Q88047504">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2210/PDB5R83/PDB</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87968356">The crystal structure of COVID-19 main protease in apo form</a> (<a href="http://www.wikidata.org/entity/Q87968356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2210/PDB6M03/PDB</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87995286">Crystal Structure of ADP ribose phosphatase of NSP3 from SARS CoV-2 in the complex with ADP ribose</a> (<a href="http://www.wikidata.org/entity/Q87995286">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2210/PDB6W02/PDB</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87995812">COVID-19 main protease with unliganded active site (2019-nCoV, coronavirus disease 2019, SARS-CoV-2)</a> (<a href="http://www.wikidata.org/entity/Q87995812">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2210/PDB6Y84/PDB</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87669932">Aerosol and surface stability of HCoV-19 (SARS-CoV-2) compared to SARS-CoV-1</a> (<a href="http://www.wikidata.org/entity/Q87669932">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1101/2020.03.09.20033217</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87669932">Aerosol and surface stability of HCoV-19 (SARS-CoV-2) compared to SARS-CoV-1</a> (<a href="http://www.wikidata.org/entity/Q87669932">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.03.09.20033217</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461273">Diagnosis and Management of First Case of COVID-19 in Canada: Lessons applied from SARS</a> (<a href="http://www.wikidata.org/entity/Q87461273">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32147731</td>
  </tr>
  <tr>
    <td>2020-03-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461590">Three Emerging Coronaviruses in Two Decades</a> (<a href="http://www.wikidata.org/entity/Q87461590">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32053148</td>
  </tr>
  <tr>
    <td>2020-03-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292103">SARS-CoV-2 Cell Entry Depends on ACE2 and TMPRSS2 and Is Blocked by a Clinically Proven Protease Inhibitor</a> (<a href="http://www.wikidata.org/entity/Q88292103">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/J.CELL.2020.02.052</td>
    <td>32142651</td>
  </tr>
  <tr>
    <td>2020-03-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87412594">Clinical course and risk factors for mortality of adult inpatients with COVID-19 in Wuhan, China: a retrospective cohort study</a> (<a href="http://www.wikidata.org/entity/Q87412594">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/S0140-6736(20)30566-3</td>
    <td>32171076</td>
  </tr>
  <tr>
    <td>2020-03-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87200944">Novel Coronavirus (2019-nCoV) Situation Report in France 0306</a> (<a href="http://www.wikidata.org/entity/Q87200944">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87745029">The effect of travel restrictions on the spread of the 2019 novel coronavirus (COVID-19) outbreak</a> (<a href="http://www.wikidata.org/entity/Q87745029">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1126/SCIENCE.ABA9757</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87133797">Novel Coronavirus (2019-nCoV) Situation Report in France 0305</a> (<a href="http://www.wikidata.org/entity/Q87133797">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461789">First Case of 2019 Novel Coronavirus in the United States</a> (<a href="http://www.wikidata.org/entity/Q87461789">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32004427</td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87072670">Novel Coronavirus (2019-nCoV) Situation Report in France</a> (<a href="http://www.wikidata.org/entity/Q87072670">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87143040">COVID-19: What Can We Learn From Stories From the Trenches?</a> (<a href="http://www.wikidata.org/entity/Q87143040">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32129672</td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461284">Insights into the Recent 2019 Novel Coronavirus (SARS-CoV-2) in Light of Past Human Coronavirus Outbreaks</a> (<a href="http://www.wikidata.org/entity/Q87461284">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32143502</td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87143042">Genomic diversity of SARS-CoV-2 in Coronavirus Disease 2019 patients</a> (<a href="http://www.wikidata.org/entity/Q87143042">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1093/CID/CIAA203</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87726414">Structural basis for the recognition of the SARS-CoV-2 by full-length human ACE2</a> (<a href="http://www.wikidata.org/entity/Q87726414">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1126/SCIENCE.ABB2762</td>
    <td>32132184</td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87995012">Crystal Structure of ADP ribose phosphatase of NSP3 from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87995012">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2210/PDB6VXS/PDB</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87995630">Crystal structure of the free enzyme of the SARS-CoV-2 (2019-nCoV) main protease</a> (<a href="http://www.wikidata.org/entity/Q87995630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2210/PDB6Y2E/PDB</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88047678">Crystal structure (monoclinic form) of the complex resulting from the reaction between SARS-CoV-2 (2019-nCoV) main protease and tert-butyl (1-((S)-1-(((S)-4-(benzylamino)-3,4-dioxo-1-((S)-2-oxopyrrolidin-3-yl)butan-2-yl)amino)-3-cyclopropyl-1-oxoprop</a> (<a href="http://www.wikidata.org/entity/Q88047678">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2210/PDB6Y2F/PDB</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88308000">Déjà Vu or Jamais Vu? How the Severe Acute Respiratory Syndrome Experience Influenced a Singapore Radiology Department's Response to the Coronavirus Disease (COVID-19) Epidemic</a> (<a href="http://www.wikidata.org/entity/Q88308000">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2214/AJR.20.22927</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461288">Li Wenliang, a face to the frontline healthcare worker. The first doctor to notify the emergence of the SARS-CoV-2, (COVID-19), outbreak</a> (<a href="http://www.wikidata.org/entity/Q87461288">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32142979</td>
  </tr>
  <tr>
    <td>2020-03-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461291">Coronavirus Disease 2019 (COVID-19): A critical care perspective beyond China</a> (<a href="http://www.wikidata.org/entity/Q87461291">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32142972</td>
  </tr>
  <tr>
    <td>2020-03-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87752873">Response to COVID-19 in Taiwan: Big Data Analytics, New Technology, and Proactive Testing</a> (<a href="http://www.wikidata.org/entity/Q87752873">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1001/JAMA.2020.3151</td>
    <td>32125371</td>
  </tr>
  <tr>
    <td>2020-03-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88291889">Angiotensin-converting enzyme 2 (ACE2) as a SARS-CoV-2 receptor: molecular mechanisms and potential therapeutic target</a> (<a href="http://www.wikidata.org/entity/Q88291889">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1007/S00134-020-05985-9</td>
    <td>32125455</td>
  </tr>
  <tr>
    <td>2020-03-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87072039">On the origin and continuing evolution of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87072039">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1093/NSR/NWAA036</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87973252">Crystal structure of Nsp15 endoribonuclease NendoU from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87973252">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1101/2020.03.02.968388</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87973252">Crystal structure of Nsp15 endoribonuclease NendoU from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87973252">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.03.02.968388</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87226248">COVID-19 and the anti-lessons of history</a> (<a href="http://www.wikidata.org/entity/Q87226248">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/S0140-6736(20)30468-2</td>
    <td>32135077</td>
  </tr>
  <tr>
    <td>2020-03-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87000965">The species Severe acute respiratory syndrome-related coronavirus: classifying 2019-nCoV and naming it SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87000965">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/S41564-020-0695-Z</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461312">Coronavirus disinfection in histopathology</a> (<a href="http://www.wikidata.org/entity/Q87461312">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32116147</td>
  </tr>
  <tr>
    <td>2020-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461314">Coronavirus disease (COVID-19) and neonate: What neonatologist need to know</a> (<a href="http://www.wikidata.org/entity/Q87461314">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32115733</td>
  </tr>
  <tr>
    <td>2020-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461317">[Pregnant Women With New Coronavirus Infection: A Clinical Characteristics and Placental Pathological Analysis of Three Cases]</a> (<a href="http://www.wikidata.org/entity/Q87461317">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32114744</td>
  </tr>
  <tr>
    <td>2020-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87973551">Structure, Function, and Antigenicity of the SARS-CoV-2 Spike Glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87973551">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/J.CELL.2020.02.058</td>
    <td>32155444</td>
  </tr>
  <tr>
    <td>2020-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q86736080">Preliminary estimation of the basic reproduction number of novel coronavirus (2019-nCoV) in China, from 2019 to 2020: A data-driven analysis in the early phase of the outbreak</a> (<a href="http://www.wikidata.org/entity/Q86736080">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/J.IJID.2020.01.050</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88324921">Are high-performing health systems resilient against the COVID-19 epidemic?</a> (<a href="http://www.wikidata.org/entity/Q88324921">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/S0140-6736(20)30551-1</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87843134">Guidelines for pregnant women with suspected SARS-CoV-2 infection</a> (<a href="http://www.wikidata.org/entity/Q87843134">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/S1473-3099(20)30157-2</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461321">[Medical Diagnosis and Treatment Strategies for Malignant Tumors of the Digestive System During the Outbreak of Novel Coronavirus Pneumonia]</a> (<a href="http://www.wikidata.org/entity/Q87461321">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32112549</td>
  </tr>
  <tr>
    <td>2020-02-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461286">Rapid random access detection of the novel SARS-coronavirus-2 (SARS-CoV-2, previously 2019-nCoV) using an open access protocol for the Panther Fusion</a> (<a href="http://www.wikidata.org/entity/Q87461286">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32143123</td>
  </tr>
  <tr>
    <td>2020-02-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461324">Management strategies of neonatal jaundice during the coronavirus disease 2019 outbreak</a> (<a href="http://www.wikidata.org/entity/Q87461324">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32112336</td>
  </tr>
  <tr>
    <td>2020-02-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461326">A Well Infant with Coronavirus Disease 2019 (COVID-19) with High Viral Load</a> (<a href="http://www.wikidata.org/entity/Q87461326">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32112082</td>
  </tr>
  <tr>
    <td>2020-02-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87281418">COVID-19 outbreak on the Diamond Princess cruise ship: estimating the epidemic potential and effectiveness of public health countermeasures</a> (<a href="http://www.wikidata.org/entity/Q87281418">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1093/JTM/TAAA030</td>
    <td>32109273</td>
  </tr>
  <tr>
    <td>2020-02-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87281222">Q&A: The novel coronavirus outbreak causing COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87281222">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1186/S12916-020-01533-W</td>
    <td>32106852</td>
  </tr>
  <tr>
    <td>2020-02-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87716536">The neuroinvasive potential of SARS‐CoV2 may be at least partially responsible for the respiratory failure of COVID‐19 patients</a> (<a href="http://www.wikidata.org/entity/Q87716536">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1002/JMV.25728</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87967188">Structure of Mpro from COVID-19 virus and discovery of its inhibitors</a> (<a href="http://www.wikidata.org/entity/Q87967188">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.02.26.964882</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87946971">Outbreak of Novel Coronavirus (SARS-Cov-2): First Evidences From International Scientific Literature and Pending Questions</a> (<a href="http://www.wikidata.org/entity/Q87946971">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.3390/HEALTHCARE8010051</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q86921788">Correlation of Chest CT and RT-PCR Testing in Coronavirus Disease 2019 (COVID-19) in China: A Report of 1014 Cases</a> (<a href="http://www.wikidata.org/entity/Q86921788">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1148/RADIOL.2020200642</td>
    <td>32101510</td>
  </tr>
  <tr>
    <td>2020-02-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461395">COVID-19, Australia: Epidemiology Report 4 (Reporting week ending 19:00 AEDT 22 February 2020)</a> (<a href="http://www.wikidata.org/entity/Q87461395">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.33321/CDI.2020.44.17</td>
    <td>32098616</td>
  </tr>
  <tr>
    <td>2020-02-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88182256">Potential Rapid Diagnostics, Vaccine and Therapeutics for 2019 Novel Coronavirus (2019-nCoV): A Systematic Review</a> (<a href="http://www.wikidata.org/entity/Q88182256">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.3390/JCM9030623</td>
    <td>32110875</td>
  </tr>
  <tr>
    <td>2020-02-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461363">Preliminary Identification of Potential Vaccine Targets for the COVID-19 Coronavirus (SARS-CoV-2) Based on SARS-CoV Immunological Studies</a> (<a href="http://www.wikidata.org/entity/Q87461363">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32106567</td>
  </tr>
  <tr>
    <td>2020-02-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461426">COVID-19: Real-time dissemination of scientific information to fight a public health emergency of international concern</a> (<a href="http://www.wikidata.org/entity/Q87461426">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32092748</td>
  </tr>
  <tr>
    <td>2020-02-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q86372902">Update: Public Health Response to the Coronavirus Disease 2019 Outbreak — United States, February 24, 2020</a> (<a href="http://www.wikidata.org/entity/Q86372902">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.15585/MMWR.MM6908E1</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461297">Comparative genetic analysis of the novel coronavirus (2019-nCoV/SARS-CoV-2) receptor ACE2 in different populations</a> (<a href="http://www.wikidata.org/entity/Q87461297">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/S41421-020-0147-1</td>
    <td>32133153</td>
  </tr>
  <tr>
    <td>2020-02-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87369504">Estimated effectiveness of symptom and risk screening to prevent the spread of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q87369504">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.7554/ELIFE.55570</td>
    <td>32091395</td>
  </tr>
  <tr>
    <td>2020-02-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461410">Characteristics of and Public Health Responses to the Coronavirus Disease 2019 Outbreak in China</a> (<a href="http://www.wikidata.org/entity/Q87461410">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32093211</td>
  </tr>
  <tr>
    <td>2020-02-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461341">2019 novel coronavirus disease (COVID-19) in Taiwan: Reports of two cases from Wuhan, China</a> (<a href="http://www.wikidata.org/entity/Q87461341">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32111449</td>
  </tr>
  <tr>
    <td>2020-02-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87456354">An interactive web-based dashboard to track COVID-19 in real time</a> (<a href="http://www.wikidata.org/entity/Q87456354">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/S1473-3099(20)30120-1</td>
    <td>32087114</td>
  </tr>
  <tr>
    <td>2020-02-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q86824600">Breakthrough: Chloroquine phosphate has shown apparent efficacy in treatment of COVID-19 associated pneumonia in clinical studies</a> (<a href="http://www.wikidata.org/entity/Q86824600">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.5582/BST.2020.01047</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461524">Evidence of SARS-CoV-2 Infection in Returning Travelers from Wuhan, China</a> (<a href="http://www.wikidata.org/entity/Q87461524">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32069388</td>
  </tr>
  <tr>
    <td>2020-02-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461510">Virus against virus: a potential treatment for 2019-nCov (SARS-CoV-2) and other RNA viruses</a> (<a href="http://www.wikidata.org/entity/Q87461510">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/S41422-020-0290-0</td>
    <td>32071427</td>
  </tr>
  <tr>
    <td>2020-02-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q86133837">The 2019-nCoV Coronavirus: Are there two routes to infection?</a> (<a href="http://www.wikidata.org/entity/Q86133837">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1287/ORMS.2020.02.01</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461481">Severe acute respiratory syndrome coronavirus 2 (SARS-CoV-2) and coronavirus disease-2019 (COVID-19): The epidemic and the challenges</a> (<a href="http://www.wikidata.org/entity/Q87461481">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32081636</td>
  </tr>
  <tr>
    <td>2020-02-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87369505">The COVID‐19 epidemic</a> (<a href="http://www.wikidata.org/entity/Q87369505">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1111/TMI.13383</td>
    <td>32052514</td>
  </tr>
  <tr>
    <td>2020-02-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461792">Novel Wuhan (2019-nCoV) Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q87461792">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32004066</td>
  </tr>
  <tr>
    <td>2020-02-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461581">Persons Evaluated for 2019 Novel Coronavirus - United States, January 2020</a> (<a href="http://www.wikidata.org/entity/Q87461581">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.15585/MMWR.MM6906E1</td>
    <td>32053579</td>
  </tr>
  <tr>
    <td>2020-02-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461558">Overlapping and discrete aspects of the pathology and pathogenesis of the emerging human pathogenic coronaviruses SARS-CoV, MERS-CoV, and 2019-nCoV</a> (<a href="http://www.wikidata.org/entity/Q87461558">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32056249</td>
  </tr>
  <tr>
    <td>2020-02-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461563">Does SARS-CoV-2 has a longer incubation period than SARS and MERS?</a> (<a href="http://www.wikidata.org/entity/Q87461563">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32056235</td>
  </tr>
  <tr>
    <td>2020-02-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q86503664">Practical recommendations for critical care and anesthesiology teams caring for novel coronavirus (2019-nCoV) patients</a> (<a href="http://www.wikidata.org/entity/Q86503664">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1007/S12630-020-01591-X</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q86973813">Severe acute respiratory syndrome-related coronavirus: The species and its viruses – a statement of the Coronavirus Study Group</a> (<a href="http://www.wikidata.org/entity/Q86973813">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.02.07.937862</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88045822">Therapeutic options for the 2019 novel coronavirus (2019-nCoV)</a> (<a href="http://www.wikidata.org/entity/Q88045822">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/D41573-020-00016-0</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84574466">Clinical Characteristics of 138 Hospitalized Patients With 2019 Novel Coronavirus–Infected Pneumonia in Wuhan, China</a> (<a href="http://www.wikidata.org/entity/Q84574466">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1001/JAMA.2020.1585</td>
    <td>32031570</td>
  </tr>
  <tr>
    <td>2020-02-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85005081">Preparedness and vulnerability of African countries against introductions of 2019-nCoV</a> (<a href="http://www.wikidata.org/entity/Q85005081">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.02.05.20020792</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87057316">Initial Public Health Response and Interim Clinical Guidance for the 2019 Novel Coronavirus Outbreak - United States, December 31, 2019-February 4, 2020</a> (<a href="http://www.wikidata.org/entity/Q87057316">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.15585/MMWR.MM6905E1</td>
    <td>32027631</td>
  </tr>
  <tr>
    <td>2020-02-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87410200">Incubation period of 2019 novel coronavirus (2019-nCoV) infections among travellers from Wuhan, China, 20-28 January 2020</a> (<a href="http://www.wikidata.org/entity/Q87410200">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2807/1560-7917.ES.2020.25.5.2000062</td>
    <td>32046819</td>
  </tr>
  <tr>
    <td>2020-02-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461623">Effectiveness of airport screening at detecting travellers infected with novel coronavirus (2019-nCoV)</a> (<a href="http://www.wikidata.org/entity/Q87461623">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2807/1560-7917.ES.2020.25.5.2000080</td>
    <td>32046816</td>
  </tr>
  <tr>
    <td>2020-02-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85005077">Assessing spread risk of Wuhan novel coronavirus within and beyond China, January-April 2020: a travel network-based modelling study</a> (<a href="http://www.wikidata.org/entity/Q85005077">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.02.04.20020479</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87967181">The crystal structure of COVID-19 main protease in complex with an inhibitor N3</a> (<a href="http://www.wikidata.org/entity/Q87967181">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2210/PDB6LU7/PDB</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461780">2019 Novel Coronavirus (2019-nCoV) Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q87461780">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32013795</td>
  </tr>
  <tr>
    <td>2020-02-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84360011">Remdesivir and chloroquine effectively inhibit the recently emerged novel coronavirus (2019-nCoV) in vitro</a> (<a href="http://www.wikidata.org/entity/Q84360011">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/S41422-020-0282-0</td>
    <td>32020029</td>
  </tr>
  <tr>
    <td>2020-02-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84369886">The incubation period of 2019-nCoV from publicly reported confirmed cases: estimation and application</a> (<a href="http://www.wikidata.org/entity/Q84369886">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.02.02.20020016</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q86477403">2019 Novel Coronavirus (2019-nCoV) Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q86477403">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1148/RADIOL.2020200257</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85060165">The Rate of Underascertainment of Novel Coronavirus (2019-nCoV) Infection: Estimation Using Japanese Passengers Data on Evacuation Flights</a> (<a href="http://www.wikidata.org/entity/Q85060165">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.3390/JCM9020419</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84956787">A new coronavirus associated with human respiratory disease in China</a> (<a href="http://www.wikidata.org/entity/Q84956787">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/S41586-020-2008-3</td>
    <td>32015508</td>
  </tr>
  <tr>
    <td>2020-02-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84367633">A pneumonia outbreak associated with a new coronavirus of probable bat origin</a> (<a href="http://www.wikidata.org/entity/Q84367633">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/S41586-020-2012-7</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84367636">Molecular Modeling Evaluation of the Binding Abilities of Ritonavir and Lopinavir to Wuhan Pneumonia Coronavirus Proteases</a> (<a href="http://www.wikidata.org/entity/Q84367636">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.01.31.929695</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84363935">Study claiming new coronavirus can be transmitted by people without symptoms was flawed</a> (<a href="http://www.wikidata.org/entity/Q84363935">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1126/SCIENCE.ABB1524</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84237200">2019-nCoV, first death outside China</a> (<a href="http://www.wikidata.org/entity/Q84237200">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84367629">Predicting commercially available antiviral drugs that may act on the novel coronavirus (2019-nCoV), Wuhan, China through a drug-target interaction deep learning model</a> (<a href="http://www.wikidata.org/entity/Q84367629">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.01.31.929547</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461269">Early Epidemiological and Clinical Characteristics of 28 Cases of Coronavirus Disease in South Korea</a> (<a href="http://www.wikidata.org/entity/Q87461269">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32149037</td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461613">Preliminary prediction of the basic reproduction number of the Wuhan novel coronavirus 2019-nCoV</a> (<a href="http://www.wikidata.org/entity/Q87461613">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>32048815</td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q86911130">Chloroquine for the 2019 novel coronavirus SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q86911130">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/J.IJANTIMICAG.2020.105923</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q86910883">Severe acute respiratory syndrome coronavirus 2 (SARS-CoV-2) and coronavirus disease-2019 (COVID-19): The epidemic and the challenges</a> (<a href="http://www.wikidata.org/entity/Q86910883">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/J.IJANTIMICAG.2020.105924</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q86910944">Emerging threats from zoonotic coronaviruses-from SARS and MERS to 2019-nCoV</a> (<a href="http://www.wikidata.org/entity/Q86910944">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/J.JMII.2020.02.001</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q86735535">Genomic characterisation and epidemiology of 2019 novel coronavirus: implications for virus origins and receptor binding</a> (<a href="http://www.wikidata.org/entity/Q86735535">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/S0140-6736(20)30251-8</td>
    <td>32007145</td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84363411">Baricitinib as potential treatment for 2019-nCoV acute respiratory disease</a> (<a href="http://www.wikidata.org/entity/Q84363411">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/S0140-6736(20)30304-4</td>
    <td>32032529</td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84649317">Clinical evidence does not support corticosteroid treatment for 2019-nCoV lung injury</a> (<a href="http://www.wikidata.org/entity/Q84649317">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/S0140-6736(20)30317-2</td>
    <td>32043983</td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87843131">Viral load of SARS-CoV-2 in clinical samples</a> (<a href="http://www.wikidata.org/entity/Q87843131">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/S1473-3099(20)30113-4</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87843133">Asymptomatic cases in a family cluster with SARS-CoV-2 infection</a> (<a href="http://www.wikidata.org/entity/Q87843133">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/S1473-3099(20)30114-6</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87191021">Feasibility of controlling COVID-19 outbreaks by isolation of cases and contacts</a> (<a href="http://www.wikidata.org/entity/Q87191021">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/S2214-109X(20)30074-7</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461535">Potent binding of 2019 novel coronavirus spike protein by a SARS coronavirus-specific human monoclonal antibody</a> (<a href="http://www.wikidata.org/entity/Q87461535">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1080/22221751.2020.1729069</td>
    <td>32065055</td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87945289">Novel coronavirus 2019-nCoV: prevalence, biological and clinical characteristics comparison with SARS-CoV and MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q87945289">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.26355/EURREV_202002_20379</td>
    <td>32141570</td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87945289">Novel coronavirus 2019-nCoV: prevalence, biological and clinical characteristics comparison with SARS-CoV and MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q87945289">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.26355/EURREV_202002_20379</td>
    <td>32141570</td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87945289">Novel coronavirus 2019-nCoV: prevalence, biological and clinical characteristics comparison with SARS-CoV and MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q87945289">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.26355/EURREV_202002_20379</td>
    <td>32141570</td>
  </tr>
  <tr>
    <td>2020-01-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84096797">Nowcasting and forecasting the potential domestic and international spread of the 2019-nCoV outbreak originating in Wuhan, China: a modelling study</a> (<a href="http://www.wikidata.org/entity/Q84096797">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/S0140-6736(20)30260-9</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84109660">First Case of 2019 Novel Coronavirus in the United States</a> (<a href="http://www.wikidata.org/entity/Q84109660">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1056/NEJMOA2001191</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84112018">Uncanny similarity of unique inserts in the 2019-nCoV spike protein to HIV-1 gp120 and Gag</a> (<a href="http://www.wikidata.org/entity/Q84112018">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.01.30.927871</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84225932">The novel coronavirus 2019 (2019-nCoV) uses the SARS-coronavirus receptor ACE2 and the cellular protease TMPRSS2 for entry into target cells</a> (<a href="http://www.wikidata.org/entity/Q84225932">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.01.31.929042</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84106604">Transmission of 2019-nCoV Infection from an Asymptomatic Contact in Germany</a> (<a href="http://www.wikidata.org/entity/Q84106604">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1056/NEJMC2001468</td>
    <td>32003551</td>
  </tr>
  <tr>
    <td>2020-01-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84634494">Pattern of early human-to-human transmission of Wuhan 2019 novel coronavirus (2019-nCoV), December 2019 to January 2020</a> (<a href="http://www.wikidata.org/entity/Q84634494">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2807/1560-7917.ES.2020.25.4.2000058</td>
    <td>32019669</td>
  </tr>
  <tr>
    <td>2020-01-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461797">The Fight against the 2019-nCoV Outbreak: an Arduous March Has Just Begun</a> (<a href="http://www.wikidata.org/entity/Q87461797">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.3346/JKMS.2020.35.E56</td>
    <td>31997618</td>
  </tr>
  <tr>
    <td>2020-01-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84108313">Early Transmission Dynamics in Wuhan, China, of Novel Coronavirus–Infected Pneumonia</a> (<a href="http://www.wikidata.org/entity/Q84108313">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1056/NEJMOA2001316</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84110118">Importation and Human-to-Human Transmission of a Novel Coronavirus in Vietnam</a> (<a href="http://www.wikidata.org/entity/Q84110118">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1056/NEJMC2001272</td>
    <td>31991079</td>
  </tr>
  <tr>
    <td>2020-01-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q86729658">Genomic characterization of the 2019 novel human-pathogenic coronavirus isolated from a patient with atypical pneumonia after visiting Wuhan</a> (<a href="http://www.wikidata.org/entity/Q86729658">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1080/22221751.2020.1719902</td>
    <td>31987001</td>
  </tr>
  <tr>
    <td>2020-01-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84110468">Medical Journals and the 2019-nCoV Outbreak</a> (<a href="http://www.wikidata.org/entity/Q84110468">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1056/NEJME2001329</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84435497">Potential for global spread of a novel coronavirus from China</a> (<a href="http://www.wikidata.org/entity/Q84435497">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1093/JTM/TAAA011</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84225926">Transmission dynamics of 2019 novel coronavirus (2019-nCoV)</a> (<a href="http://www.wikidata.org/entity/Q84225926">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.01.25.919787</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83829764">Wuhan seafood market may not be source of novel virus spreading globally</a> (<a href="http://www.wikidata.org/entity/Q83829764">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1126/SCIENCE.ABB0611</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84225935">Complete genome characterisation of a novel coronavirus associated with severe human respiratory disease in Wuhan, China</a> (<a href="http://www.wikidata.org/entity/Q84225935">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.01.24.919183</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83767469">Clinical features of patients infected with 2019 novel coronavirus in Wuhan, China</a> (<a href="http://www.wikidata.org/entity/Q83767469">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/S0140-6736(20)30183-5</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83600985">This scientist hopes to test coronavirus drugs on animals in locked-down Wuhan</a> (<a href="http://www.wikidata.org/entity/Q83600985">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/D41586-020-00190-6</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83600983">Wuhan scientists: What it’s like to be on lockdown</a> (<a href="http://www.wikidata.org/entity/Q83600983">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/D41586-020-00191-5</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83600987">What you need to know about the Wuhan coronavirus</a> (<a href="http://www.wikidata.org/entity/Q83600987">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/D41586-020-00209-Y</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84225929">Pattern of early human-to-human transmission of Wuhan 2019-nCoV</a> (<a href="http://www.wikidata.org/entity/Q84225929">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.01.23.917351</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85060426">The Extent of Transmission of Novel Coronavirus in Wuhan, China, 2020</a> (<a href="http://www.wikidata.org/entity/Q85060426">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.3390/JCM9020330</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88046426">Return of the Coronavirus: 2019-nCoV</a> (<a href="http://www.wikidata.org/entity/Q88046426">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.3390/V12020135</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83567428">Why snakes probably aren’t spreading the new China virus</a> (<a href="http://www.wikidata.org/entity/Q83567428">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/D41586-020-00180-8</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84225937">Discovery of a novel coronavirus associated with the recent pneumonia outbreak in humans and its potential bat origin</a> (<a href="http://www.wikidata.org/entity/Q84225937">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.01.22.914952</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461803">Real-time tentative assessment of the epidemiological characteristics of novel coronavirus infections in Wuhan, China, as at 22 January 2020</a> (<a href="http://www.wikidata.org/entity/Q87461803">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2807/1560-7917.ES.2020.25.3.2000044</td>
    <td>31992388</td>
  </tr>
  <tr>
    <td>2020-01-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461800">Note from the editors: novel coronavirus (2019-nCoV)</a> (<a href="http://www.wikidata.org/entity/Q87461800">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2807/1560-7917.ES.2020.25.3.2001231</td>
    <td>31992390</td>
  </tr>
  <tr>
    <td>2020-01-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83500389">Coronaviruses: genome structure, replication, and pathogenesis</a> (<a href="http://www.wikidata.org/entity/Q83500389">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>31967327</td>
  </tr>
  <tr>
    <td>2020-01-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83500392">Homologous recombination within the spike glycoprotein of the newly identified coronavirus may boost cross-species transmission from snake to human</a> (<a href="http://www.wikidata.org/entity/Q83500392">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>31967321</td>
  </tr>
  <tr>
    <td>2020-01-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83460376">Homologous recombination within the spike glycoprotein of the newly identified coronavirus may boost cross‐species transmission from snake to human</a> (<a href="http://www.wikidata.org/entity/Q83460376">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1002/JMV.25682</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83600993">Alarm over China virus, extreme Arctic warming and a volcano on alert</a> (<a href="http://www.wikidata.org/entity/Q83600993">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/D41586-020-00109-1</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83567429">New China virus: Five questions scientists are asking</a> (<a href="http://www.wikidata.org/entity/Q83567429">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/D41586-020-00166-6</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83600990">Rapid outbreak response requires trust</a> (<a href="http://www.wikidata.org/entity/Q83600990">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/S41564-020-0670-8</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84082454">Functional assessment of cell entry and receptor usage for lineage B β-coronaviruses, including 2019-nCoV</a> (<a href="http://www.wikidata.org/entity/Q84082454">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1101/2020.01.22.915660</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83600998">How quickly does the Wuhan virus spread?</a> (<a href="http://www.wikidata.org/entity/Q83600998">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/D41586-020-00146-W</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83600996">Stop the Wuhan virus</a> (<a href="http://www.wikidata.org/entity/Q83600996">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/D41586-020-00153-X</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83500593">Polymorphisms in dipeptidyl peptidase 4 reduce host cell entry of Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q83500593">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1080/22221751.2020.1713705</td>
    <td>31964246</td>
  </tr>
  <tr>
    <td>2020-01-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83547339">China coronavirus: cases surge as official admits human to human transmission</a> (<a href="http://www.wikidata.org/entity/Q83547339">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td></td>
    <td>31959587</td>
  </tr>
  <tr>
    <td>2020-01-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83601000">New virus surging in Asia rattles scientists</a> (<a href="http://www.wikidata.org/entity/Q83601000">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/D41586-020-00129-X</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83601003">New virus in China requires international control effort</a> (<a href="http://www.wikidata.org/entity/Q83601003">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/D41586-020-00135-Z</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82839925">Outbreak of Pneumonia of Unknown Etiology in Wuhan China: the Mystery and the Miracle</a> (<a href="http://www.wikidata.org/entity/Q82839925">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1002/JMV.25678</td>
    <td>31950516</td>
  </tr>
  <tr>
    <td>2020-01-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82838328">Recent advances in the detection of respiratory virus infection in humans</a> (<a href="http://www.wikidata.org/entity/Q82838328">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1002/JMV.25674</td>
    <td>31944312</td>
  </tr>
  <tr>
    <td>2020-01-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83601006">A new illness, an Earth-size exoplanet and a 12-year prison sentence</a> (<a href="http://www.wikidata.org/entity/Q83601006">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1038/D41586-020-00088-3</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83388131">The continuing 2019-nCoV epidemic threat of novel coronaviruses to global health - The latest 2019 novel coronavirus outbreak in Wuhan, China</a> (<a href="http://www.wikidata.org/entity/Q83388131">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1016/J.IJID.2020.01.009</td>
    <td>31953166</td>
  </tr>
  <tr>
    <td>2020-01-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82840590">Pneumonia of Unknown Etiology in Wuhan, China: Potential for International Spread Via Commercial Air Travel</a> (<a href="http://www.wikidata.org/entity/Q82840590">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1093/JTM/TAAA008</td>
    <td>31943059</td>
  </tr>
  <tr>
    <td>2020-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461713">RNA based mNGS approach identifies a novel human coronavirus from two individual pneumonia cases in 2019 Wuhan outbreak</a> (<a href="http://www.wikidata.org/entity/Q87461713">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.1080/22221751.2020.1725399</td>
    <td>32020836</td>
  </tr>
  <tr>
    <td>2020-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87745166">Coronaviruses - new emerging pathogens</a> (<a href="http://www.wikidata.org/entity/Q87745166">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2298/VSP2002139K</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84957779">Detection of 2019 novel coronavirus (2019-nCoV) by real-time RT-PCR</a> (<a href="http://www.wikidata.org/entity/Q84957779">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.2807/1560-7917.ES.2020.25.3.2000045</td>
    <td>31992387</td>
  </tr>
  <tr>
    <td>2020-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461501">Virus Isolation from the First Patient with SARS-CoV-2 in Korea</a> (<a href="http://www.wikidata.org/entity/Q87461501">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.3346/JKMS.2020.35.E84</td>
    <td>32080990</td>
  </tr>
  <tr>
    <td>2020-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87461498">Viral Load Kinetics of SARS-CoV-2 Infection in First Two Patients in Korea</a> (<a href="http://www.wikidata.org/entity/Q87461498">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.3346/JKMS.2020.35.E86</td>
    <td>32080991</td>
  </tr>
  <tr>
    <td>2020-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87963364">Discovering drugs to treat coronavirus disease 2019 (COVID-19)</a> (<a href="http://www.wikidata.org/entity/Q87963364">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>10.5582/ddt.2020.01012</td>
    <td>32147628</td>
  </tr>
  <tr>
    <td>2019-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84315813">Sensitive and Specific Detection of Low-Level Antibody Responses in Mild Middle East Respiratory Syndrome Coronavirus Infections</a> (<a href="http://www.wikidata.org/entity/Q84315813">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2510.190051</td>
    <td>31423970</td>
  </tr>
  <tr>
    <td>2019-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84315785">Comparison of Serologic Assays for Middle East Respiratory Syndrome Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q84315785">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2510.190497</td>
    <td>31423969</td>
  </tr>
  <tr>
    <td>2019-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84315429">Severe acute respiratory syndrome coronavirus ORF3a protein activates the NLRP3 inflammasome by promoting TRAF3-dependent ubiquitination of ASC</a> (<a href="http://www.wikidata.org/entity/Q84315429">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1096/FJ.201802418R</td>
    <td>31034780</td>
  </tr>
  <tr>
    <td>2019-07-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83547342">The risk factors associated with MERS-CoV patient fatality: A global survey</a> (<a href="http://www.wikidata.org/entity/Q83547342">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>31959375</td>
  </tr>
  <tr>
    <td>2019-07-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84315452">Delicate structural coordination of the Severe Acute Respiratory Syndrome coronavirus Nsp13 upon ATP hydrolysis</a> (<a href="http://www.wikidata.org/entity/Q84315452">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1093/NAR/GKZ409</td>
    <td>31131400</td>
  </tr>
  <tr>
    <td>2019-06-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84315460">Preventive Behavioral Responses to the 2015 Middle East Respiratory Syndrome Coronavirus Outbreak in Korea</a> (<a href="http://www.wikidata.org/entity/Q84315460">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3390/IJERPH16122161</td>
    <td>31216779</td>
  </tr>
  <tr>
    <td>2019-06-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q64993888">Sequential Emergence and Wide Spread of Neutralization Escape Middle East Respiratory Syndrome Coronavirus Mutants, South Korea, 2015.</a> (<a href="http://www.wikidata.org/entity/Q64993888">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2506.181722</td>
    <td>30900977</td>
  </tr>
  <tr>
    <td>2019-05-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q64289990">Structure of the SARS-CoV nsp12 polymerase bound to nsp7 and nsp8 co-factors</a> (<a href="http://www.wikidata.org/entity/Q64289990">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1038/S41467-019-10280-3</td>
    <td>31138817</td>
  </tr>
  <tr>
    <td>2019-04-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84315418">Canine Respiratory Coronavirus, Bovine Coronavirus, and Human Coronavirus OC43: Receptors and Attachment Factors</a> (<a href="http://www.wikidata.org/entity/Q84315418">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.3390/V11040328</td>
    <td>30959796</td>
  </tr>
  <tr>
    <td>2019-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q63246151">A pan-coronavirus fusion inhibitor targeting the HR1 domain of human coronavirus spike</a> (<a href="http://www.wikidata.org/entity/Q63246151">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1126/SCIADV.AAV4580</td>
    <td>30989115</td>
  </tr>
  <tr>
    <td>2019-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q64076210">Survey on Implementation of One Health Approach for MERS-CoV Preparedness and Control in Gulf Cooperation Council and Middle East Countries</a> (<a href="http://www.wikidata.org/entity/Q64076210">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2503.171702</td>
    <td>30789338</td>
  </tr>
  <tr>
    <td>2019-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q63246453">Evolutionary relationship analysis of Middle East respiratory syndrome coronavirus 4a and 4b protein coding sequences</a> (<a href="http://www.wikidata.org/entity/Q63246453">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4142/JVS.2019.20.E1</td>
    <td>30944524</td>
  </tr>
  <tr>
    <td>2019-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q61797962">First Complete Genome Sequence of Human Coronavirus HKU1 from a Nonill Bat Guano Miner in Thailand</a> (<a href="http://www.wikidata.org/entity/Q61797962">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td>10.1128/MRA.01457-18</td>
    <td>30746519</td>
  </tr>
  <tr>
    <td>2019-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q61803280">International Biological Reference Preparations for Epidemic Infectious Diseases</a> (<a href="http://www.wikidata.org/entity/Q61803280">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2502.180798</td>
    <td>30666925</td>
  </tr>
  <tr>
    <td>2019-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q64281467">Knowledge and practices of primary health care physicians regarding updated guidelines of MERS-CoV infection in Abha city</a> (<a href="http://www.wikidata.org/entity/Q64281467">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/JFMPC.JFMPC_336_18</td>
    <td>30984654</td>
  </tr>
  <tr>
    <td>2019-01-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q61814884">Middle East Respiratory Syndrome Vaccine Candidates: Cautious Optimism</a> (<a href="http://www.wikidata.org/entity/Q61814884">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3390/V11010074</td>
    <td>30658390</td>
  </tr>
  <tr>
    <td>2019-01-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q61800185">Development of a Whole-Virus ELISA for Serological Evaluation of Domestic Livestock as Possible Hosts of Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q61800185">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.3390/V11010043</td>
    <td>30634419</td>
  </tr>
  <tr>
    <td>2019-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84316056">Blocking transmission of Middle East respiratory syndrome coronavirus (MERS-CoV) in llamas by vaccination with a recombinant spike protein</a> (<a href="http://www.wikidata.org/entity/Q84316056">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1080/22221751.2019.1685912</td>
    <td>31711379</td>
  </tr>
  <tr>
    <td>2019-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84316146">Estimation Of Direct Medical Costs Of Middle East Respiratory Syndrome Coronavirus Infection: A Single-Center Retrospective Chart Review Study</a> (<a href="http://www.wikidata.org/entity/Q84316146">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2147/IDR.S231087</td>
    <td>31819541</td>
  </tr>
  <tr>
    <td>2019-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84315938">Epidemiological status of the Middle East respiratory syndrome coronavirus in 2019: an update from January 1 to March 31, 2019</a> (<a href="http://www.wikidata.org/entity/Q84315938">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2147/IJGM.S215396</td>
    <td>31692574</td>
  </tr>
  <tr>
    <td>2019-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q61807081">Severe Acute Respiratory Syndrome Coronavirus Viroporin 3a Activates the NLRP3 Inflammasome</a> (<a href="http://www.wikidata.org/entity/Q61807081">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.3389/FMICB.2019.00050</td>
    <td>30761102</td>
  </tr>
  <tr>
    <td>2019-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84315478">Middle East Respiratory Syndrome Coronavirus in Dromedaries in Ethiopia Is Antigenically Different From the Middle East Isolate EMC</a> (<a href="http://www.wikidata.org/entity/Q84315478">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3389/FMICB.2019.01326</td>
    <td>31275264</td>
  </tr>
  <tr>
    <td>2019-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q61804910">Absence of neutralizing activity in serum 1 year after successful treatment with antivirals and recovery from MERS in South Korea</a> (<a href="http://www.wikidata.org/entity/Q61804910">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.7774/CEVR.2019.8.1.86</td>
    <td>30775355</td>
  </tr>
  <tr>
    <td>2018-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q59334078">634. Transcriptional Stimulation of Antiviral Response Components by the Structural and Accessory Human coronavirus OC43 Proteins</a> (<a href="http://www.wikidata.org/entity/Q59334078">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1093/OFID/OFY210.641</td>
    <td></td>
  </tr>
  <tr>
    <td>2018-10-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q58094737">A novel human coronavirus OC43 genotype detected in mainland China</a> (<a href="http://www.wikidata.org/entity/Q58094737">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1038/S41426-018-0171-5</td>
    <td>30377292</td>
  </tr>
  <tr>
    <td>2018-10-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57794680">Stabilized coronavirus spikes are resistant to conformational changes induced by receptor recognition or proteolysis</a> (<a href="http://www.wikidata.org/entity/Q57794680">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1038/S41598-018-34171-7</td>
    <td>30356097</td>
  </tr>
  <tr>
    <td>2018-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57091765">Severe Respiratory Illness Outbreak Associated with Human Coronavirus NL63 in a Long-Term Care Facility</a> (<a href="http://www.wikidata.org/entity/Q57091765">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.3201/EID2410.180862</td>
    <td>30226169</td>
  </tr>
  <tr>
    <td>2018-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q58767125">Crystal structure of the post-fusion core of the Human coronavirus 229E spike protein at 1.86 Å resolution</a> (<a href="http://www.wikidata.org/entity/Q58767125">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1107/S2059798318008318</td>
    <td>30198895</td>
  </tr>
  <tr>
    <td>2018-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q58785257">Cryo-EM structure of the SARS coronavirus spike glycoprotein in complex with its host cell receptor ACE2</a> (<a href="http://www.wikidata.org/entity/Q58785257">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1371/JOURNAL.PPAT.1007236</td>
    <td>30102747</td>
  </tr>
  <tr>
    <td>2018-06-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q55385048">Human coronavirus OC43 outbreak in wild chimpanzees, Côte d´Ivoire, 2016.</a> (<a href="http://www.wikidata.org/entity/Q55385048">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1038/S41426-018-0121-2</td>
    <td>29950583</td>
  </tr>
  <tr>
    <td>2018-05-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q55164495">A Rapid and Specific Assay for the Detection of MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q55164495">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3389/FMICB.2018.01101</td>
    <td>29896174</td>
  </tr>
  <tr>
    <td>2018-05-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q55192411">Complete Genome Sequences of Four Novel Human Coronavirus OC43 Isolates Associated with Severe Acute Respiratory Infection.</a> (<a href="http://www.wikidata.org/entity/Q55192411">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1128/GENOMEA.00452-18</td>
    <td>29798929</td>
  </tr>
  <tr>
    <td>2018-05-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q55114495">Nucleocapsid protein-dependent assembly of the RNA packaging signal of Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q55114495">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12929-018-0449-X</td>
    <td>29793506</td>
  </tr>
  <tr>
    <td>2018-05-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54978341">Saracatinib Inhibits Middle East Respiratory Syndrome-Coronavirus Replication In Vitro.</a> (<a href="http://www.wikidata.org/entity/Q54978341">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3390/V10060283</td>
    <td>29795047</td>
  </tr>
  <tr>
    <td>2018-05-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54208634">Effect of interferon alpha and cyclosporine treatment separately and in combination on Middle East Respiratory Syndrome Coronavirus (MERS-CoV) replication in a human in-vitro and ex-vivo culture model.</a> (<a href="http://www.wikidata.org/entity/Q54208634">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2018.05.007</td>
    <td>29772254</td>
  </tr>
  <tr>
    <td>2018-05-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54089063">Replicative virus shedding in the respiratory tract of the patients with Middle East respiratory syndrome coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q54089063">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2018.05.003</td>
    <td>29753119</td>
  </tr>
  <tr>
    <td>2018-05-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54217711">Early events during human coronavirus OC43 entry to the cell.</a> (<a href="http://www.wikidata.org/entity/Q54217711">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1038/S41598-018-25640-0</td>
    <td>29740099</td>
  </tr>
  <tr>
    <td>2018-05-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54217812">Heterologous prime-boost vaccination with adenoviral vector and protein nanoparticles induces both Th1 and Th2 responses against Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q54217812">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VACCINE.2018.04.082</td>
    <td>29739720</td>
  </tr>
  <tr>
    <td>2018-05-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q55287084">Middle East respiratory syndrome coronavirus specific antibodies in naturally exposed Israeli llamas, alpacas and camels.</a> (<a href="http://www.wikidata.org/entity/Q55287084">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ONEHLT.2018.05.002</td>
    <td>29911167</td>
  </tr>
  <tr>
    <td>2018-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q53684382">Human Coronavirus NL63 Molecular Epidemiology and Evolutionary Patterns in Rural Coastal Kenya.</a> (<a href="http://www.wikidata.org/entity/Q53684382">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1093/INFDIS/JIY098</td>
    <td>29741740</td>
  </tr>
  <tr>
    <td>2018-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54234212">Middle East Respiratory Syndrome Coronavirus Antibodies in Dromedary Camels, Bangladesh, 2015.</a> (<a href="http://www.wikidata.org/entity/Q54234212">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2405.171192</td>
    <td>29664373</td>
  </tr>
  <tr>
    <td>2018-04-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54227404">Lectin Affinity Plasmapheresis for Middle East Respiratory Syndrome-Coronavirus and Marburg Virus Glycoprotein Elimination.</a> (<a href="http://www.wikidata.org/entity/Q54227404">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1159/000487224</td>
    <td>29698959</td>
  </tr>
  <tr>
    <td>2018-04-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q52565501">Blockade of the C5a-C5aR axis alleviates lung damage in hDPP4-transgenic mice infected with MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q52565501">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/S41426-018-0063-8</td>
    <td>29691378</td>
  </tr>
  <tr>
    <td>2018-04-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54941853">Correction: MERS-CoV spillover at the camel-human interface.</a> (<a href="http://www.wikidata.org/entity/Q54941853">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.7554/ELIFE.37324</td>
    <td>29669683</td>
  </tr>
  <tr>
    <td>2018-04-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54230978">Middle East respiratory syndrome coronavirus: risk factors and determinants of primary, household, and nosocomial transmission.</a> (<a href="http://www.wikidata.org/entity/Q54230978">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(18)30127-0</td>
    <td>29680581</td>
  </tr>
  <tr>
    <td>2018-04-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q53692267">Clinical outcomes of current medical approaches for Middle East respiratory syndrome: A systematic review and meta-analysis.</a> (<a href="http://www.wikidata.org/entity/Q53692267">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1002/RMV.1977</td>
    <td>29664167</td>
  </tr>
  <tr>
    <td>2018-04-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q52583889">Sero-prevalence of Middle East respiratory syndrome coronavirus (MERS-CoV) specific antibodies in dromedary camels in Tabuk, Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q52583889">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1002/JMV.25186</td>
    <td>29663439</td>
  </tr>
  <tr>
    <td>2018-04-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q53073764">Asymptomatic Middle East Respiratory Syndrome coronavirus infection using a serologic survey in Korea.</a> (<a href="http://www.wikidata.org/entity/Q53073764">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4178/EPIH.E2018014</td>
    <td>29656631</td>
  </tr>
  <tr>
    <td>2018-04-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54234800">Unusual presentation of Middle East respiratory syndrome coronavirus leading to a large outbreak in Riyadh during 2017.</a> (<a href="http://www.wikidata.org/entity/Q54234800">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2018.02.023</td>
    <td>29661625</td>
  </tr>
  <tr>
    <td>2018-04-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q52591658">Healthcare Workers Exposure to Middle East Respiratory Syndrome Corona Virus (MERS-CoV): Revision of Screening Strategies Urgently Needed.</a> (<a href="http://www.wikidata.org/entity/Q52591658">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2018.04.001</td>
    <td>29649550</td>
  </tr>
  <tr>
    <td>2018-04-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54240761">Middle East respiratory syndrome coronavirus in pediatrics: a report of seven cases from Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q54240761">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S11684-017-0603-Y</td>
    <td>29623560</td>
  </tr>
  <tr>
    <td>2018-04-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q59349689">PCR array profiling of antiviral genes in human embryonic kidney cells expressing human coronavirus OC43 structural and accessory proteins</a> (<a href="http://www.wikidata.org/entity/Q59349689">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1007/S00705-018-3832-8</td>
    <td>29619598</td>
  </tr>
  <tr>
    <td>2018-04-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54241763">Enhanced protection in mice induced by immunization with inactivated whole viruses compare to spike protein of middle east respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q54241763">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/S41426-018-0056-7</td>
    <td>29618723</td>
  </tr>
  <tr>
    <td>2018-03-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51782771">Psychiatric Findings in Suspected and Confirmed Middle East Respiratory Syndrome Patients Quarantined in Hospital: A Retrospective Chart Analysis.</a> (<a href="http://www.wikidata.org/entity/Q51782771">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.30773/PI.2017.10.25.1</td>
    <td>29593206</td>
  </tr>
  <tr>
    <td>2018-03-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51733912">Reduction of soluble dipeptidyl peptidase 4 levels in plasma of patients infected with Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q51733912">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VIROL.2018.03.015</td>
    <td>29587190</td>
  </tr>
  <tr>
    <td>2018-03-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q52641898">Complete Genome Sequence of Human Coronavirus NL63 CN0601/14, First Isolated in South Korea.</a> (<a href="http://www.wikidata.org/entity/Q52641898">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1128/GENOMEA.00152-18</td>
    <td>29567734</td>
  </tr>
  <tr>
    <td>2018-03-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54250885">MERS-CoV pathogenesis and antiviral efficacy of licensed drugs in human monocyte-derived antigen-presenting cells.</a> (<a href="http://www.wikidata.org/entity/Q54250885">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0194868</td>
    <td>29566060</td>
  </tr>
  <tr>
    <td>2018-03-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51146966">Mapping Potential Amplification and Transmission Hotspots for MERS-CoV, Kenya.</a> (<a href="http://www.wikidata.org/entity/Q51146966">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S10393-018-1317-6</td>
    <td>29549589</td>
  </tr>
  <tr>
    <td>2018-03-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54254214">Early identification of pneumonia patients at increased risk of Middle East respiratory syndrome coronavirus infection in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q54254214">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2018.03.005</td>
    <td>29550445</td>
  </tr>
  <tr>
    <td>2018-03-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54258520">Knowledge and attitude towards the Middle East respiratory syndrome coronavirus among healthcare personnel in the southern region of Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q54258520">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2018.02.001</td>
    <td>29525570</td>
  </tr>
  <tr>
    <td>2018-03-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51149122">Importance of neutralizing monoclonal antibodies targeting multiple antigenic sites on MERS-CoV Spike to avoid neutralization escape.</a> (<a href="http://www.wikidata.org/entity/Q51149122">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.02002-17</td>
    <td>29514901</td>
  </tr>
  <tr>
    <td>2018-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51784437">Nurses' experiences of care for patients with Middle East respiratory syndrome-coronavirus in South Korea.</a> (<a href="http://www.wikidata.org/entity/Q51784437">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2018.01.012</td>
    <td>29502886</td>
  </tr>
  <tr>
    <td>2018-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51784389">Middle East respiratory syndrome: what we learned from the 2015 outbreak in the Republic of Korea.</a> (<a href="http://www.wikidata.org/entity/Q51784389">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3904/KJIM.2018.031</td>
    <td>29506344</td>
  </tr>
  <tr>
    <td>2018-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54204928">Knowledge and Attitude of Dental Health Professionals about Middle East Respiratory Syndrome in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q54204928">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/JISPCD.JISPCD_9_18</td>
    <td>29780739</td>
  </tr>
  <tr>
    <td>2018-02-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q53701486">MERS-CoV: Understanding the Latest Human Coronavirus Threat.</a> (<a href="http://www.wikidata.org/entity/Q53701486">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3390/V10020093</td>
    <td>29495250</td>
  </tr>
  <tr>
    <td>2018-02-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q52688163">Structural model of the SARS coronavirus E channel in LMPG micelles.</a> (<a href="http://www.wikidata.org/entity/Q52688163">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.BBAMEM.2018.02.017</td>
    <td>29474890</td>
  </tr>
  <tr>
    <td>2018-02-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50015244">Discovery of Hydrocarbon-Stapled Short α-Helical Peptides as Promising Middle East Respiratory Syndrome Coronavirus (MERS-CoV) Fusion Inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q50015244">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1021/ACS.JMEDCHEM.7B01732</td>
    <td>29442512</td>
  </tr>
  <tr>
    <td>2018-02-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50289951">Pathogenicity and Viral Shedding of MERS-CoV in Immunocompromised Rhesus Macaques.</a> (<a href="http://www.wikidata.org/entity/Q50289951">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3389/FIMMU.2018.00205</td>
    <td>29483914</td>
  </tr>
  <tr>
    <td>2018-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50135622">MERS-CoV infection in humans is associated with a pro-inflammatory Th1 and Th17 cytokine profile.</a> (<a href="http://www.wikidata.org/entity/Q50135622">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.CYTO.2018.01.025</td>
    <td>29414327</td>
  </tr>
  <tr>
    <td>2018-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47642356">The calm before the storm: clinical observations of Middle East respiratory syndrome (MERS) patients.</a> (<a href="http://www.wikidata.org/entity/Q47642356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1080/1120009X.2018.1429236</td>
    <td>29385908</td>
  </tr>
  <tr>
    <td>2018-01-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47643599">Treatment of Middle East Respiratory Syndrome with a combination of lopinavir-ritonavir and interferon-β1b (MIRACLE trial): study protocol for a randomized controlled trial.</a> (<a href="http://www.wikidata.org/entity/Q47643599">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S13063-017-2427-0</td>
    <td>29382391</td>
  </tr>
  <tr>
    <td>2018-01-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q49359987">The prevalence of Middle East respiratory Syndrome coronavirus (MERS-CoV) infection in livestock and temporal relation to locations and seasons.</a> (<a href="http://www.wikidata.org/entity/Q49359987">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2018.01.004</td>
    <td>29396257</td>
  </tr>
  <tr>
    <td>2018-01-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47548908">MERS-CoV 4b protein interferes with the NF-κB-dependent innate immune response during infection.</a> (<a href="http://www.wikidata.org/entity/Q47548908">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PPAT.1006838</td>
    <td>29370303</td>
  </tr>
  <tr>
    <td>2018-01-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47398513">Entry of human coronavirus NL63 to the cell.</a> (<a href="http://www.wikidata.org/entity/Q47398513">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1128/JVI.01933-17</td>
    <td>29142129</td>
  </tr>
  <tr>
    <td>2018-01-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47552814">MERS-CoV and H5N1 influenza virus antagonize antigen presentation by altering the epigenetic landscape.</a> (<a href="http://www.wikidata.org/entity/Q47552814">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1073/PNAS.1706928115</td>
    <td>29339515</td>
  </tr>
  <tr>
    <td>2018-01-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47553058">Event based surveillance of Middle East Respiratory Syndrome Coronavirus (MERS- CoV) in Bangladesh among pilgrims and travelers from the Middle East: An update for the period 2013-2016.</a> (<a href="http://www.wikidata.org/entity/Q47553058">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0189914</td>
    <td>29337997</td>
  </tr>
  <tr>
    <td>2018-01-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47553351">MERS-CoV spillover at the camel-human interface.</a> (<a href="http://www.wikidata.org/entity/Q47553351">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.7554/ELIFE.31257</td>
    <td>29336306</td>
  </tr>
  <tr>
    <td>2018-01-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47554253">Correction to: Detection and full genome characterization of two beta CoV viruses related to Middle East respiratory syndrome from bats in Italy.</a> (<a href="http://www.wikidata.org/entity/Q47554253">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12985-018-0921-Y</td>
    <td>29329554</td>
  </tr>
  <tr>
    <td>2018-01-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47657763">Extracorporeal membrane oxygenation for severe Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47657763">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S13613-017-0350-X</td>
    <td>29330690</td>
  </tr>
  <tr>
    <td>2018-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q59356109">Effect of Human Coronavirus OC43 Structural and Accessory Proteins on the Transcriptional Activation of Antiviral Response Elements</a> (<a href="http://www.wikidata.org/entity/Q59356109">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td></td>
    <td>30041172</td>
  </tr>
  <tr>
    <td>2018-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47566663">Definitive diagnosis in suspected Middle East Respiratory Syndrome Coronavirus cases.</a> (<a href="http://www.wikidata.org/entity/Q47566663">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/JTM/TAX084</td>
    <td>29232459</td>
  </tr>
  <tr>
    <td>2018-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47318610">The Experience of Korean Nurses During the Middle East Respiratory Syndrome Outbreak.</a> (<a href="http://www.wikidata.org/entity/Q47318610">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1177/0894318417741119</td>
    <td>29235956</td>
  </tr>
  <tr>
    <td>2018-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50044919">[Molecular epidemiological study of human coronavirus OC43 in Shanghai from 2009-2016].</a> (<a href="http://www.wikidata.org/entity/Q50044919">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.3760/CMA.J.ISSN.0253-9624.2018.01.011</td>
    <td>29334709</td>
  </tr>
  <tr>
    <td>2017-12-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47556562">Effects of Timely Control Intervention on the Spread of Middle East Respiratory Syndrome Coronavirus Infection.</a> (<a href="http://www.wikidata.org/entity/Q47556562">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.24171/J.PHRP.2017.8.6.03</td>
    <td>29354394</td>
  </tr>
  <tr>
    <td>2017-12-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47667741">Disulfiram can inhibit MERS and SARS coronavirus papain-like proteases via different modes.</a> (<a href="http://www.wikidata.org/entity/Q47667741">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2017.12.015</td>
    <td>29289665</td>
  </tr>
  <tr>
    <td>2017-12-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47667741">Disulfiram can inhibit MERS and SARS coronavirus papain-like proteases via different modes.</a> (<a href="http://www.wikidata.org/entity/Q47667741">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2017.12.015</td>
    <td>29289665</td>
  </tr>
  <tr>
    <td>2017-12-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47560362">Structural and molecular basis of mismatch correction and ribavirin excision from coronavirus RNA.</a> (<a href="http://www.wikidata.org/entity/Q47560362">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1073/PNAS.1718806115</td>
    <td>29279395</td>
  </tr>
  <tr>
    <td>2017-12-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q49687966">Experience of 16 years and its associated challenges in the Field Epidemiology Training Program in Korea.</a> (<a href="http://www.wikidata.org/entity/Q49687966">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4178/EPIH.E2017058</td>
    <td>29370686</td>
  </tr>
  <tr>
    <td>2017-12-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47671400">Correction to: Simultaneous detection of severe acute respiratory syndrome, Middle East respiratory syndrome, and related bat coronaviruses by real-time reverse transcription PCR.</a> (<a href="http://www.wikidata.org/entity/Q47671400">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S00705-017-3677-6</td>
    <td>29273879</td>
  </tr>
  <tr>
    <td>2017-12-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47250328">Adaptive evolution influences the infectious dose of MERS-CoV necessary to achieve severe respiratory disease.</a> (<a href="http://www.wikidata.org/entity/Q47250328">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VIROL.2017.12.006</td>
    <td>29277291</td>
  </tr>
  <tr>
    <td>2017-12-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47260596">Estimating survival rates in MERS-CoV patients 14 and 45 days after experiencing symptoms and determining the differences in survival rates by demographic data, disease characteristics and regions: a worldwide study.</a> (<a href="http://www.wikidata.org/entity/Q47260596">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1017/S095026881700293X</td>
    <td>29271336</td>
  </tr>
  <tr>
    <td>2017-12-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47109462">Detection and full genome characterization of two beta CoV viruses related to Middle East respiratory syndrome from bats in Italy.</a> (<a href="http://www.wikidata.org/entity/Q47109462">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12985-017-0907-1</td>
    <td>29258555</td>
  </tr>
  <tr>
    <td>2017-12-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47278965">How Do the First Days Count? A Case Study of Qatar Experience in Emergency Risk Communication during the MERS-CoV Outbreak.</a> (<a href="http://www.wikidata.org/entity/Q47278965">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3390/IJERPH14121597</td>
    <td>29257053</td>
  </tr>
  <tr>
    <td>2017-12-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47312219">Inactivation of Middle East respiratory syndrome-coronavirus in human plasma using amotosalen and ultraviolet A light.</a> (<a href="http://www.wikidata.org/entity/Q47312219">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/TRF.14422</td>
    <td>29239484</td>
  </tr>
  <tr>
    <td>2017-12-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47312778">Zoonotic origin and transmission of Middle East respiratory syndrome coronavirus in the UAE.</a> (<a href="http://www.wikidata.org/entity/Q47312778">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/ZPH.12435</td>
    <td>29239118</td>
  </tr>
  <tr>
    <td>2017-12-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47288304">A recombinant VSV-vectored MERS-CoV vaccine induces neutralizing antibody and T cell responses in rhesus monkeys after single dose immunization.</a> (<a href="http://www.wikidata.org/entity/Q47288304">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2017.12.007</td>
    <td>29246504</td>
  </tr>
  <tr>
    <td>2017-12-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47567189">Systemic Corticosteroid Therapy May Delay Viral Clearance in Patients with Middle East Respiratory Syndrome Coronavirus Infection.</a> (<a href="http://www.wikidata.org/entity/Q47567189">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1164/RCCM.201712-2371ED</td>
    <td>29227752</td>
  </tr>
  <tr>
    <td>2017-12-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47685269">Host susceptibility to MERS-CoV infection, a retrospective cohort study of the 2015 Korean MERS outbreak.</a> (<a href="http://www.wikidata.org/entity/Q47685269">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIAC.2017.09.008</td>
    <td>29223614</td>
  </tr>
  <tr>
    <td>2017-12-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47132991">An Opportunistic Pathogen Afforded Ample Opportunities: Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47132991">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3390/V9120369</td>
    <td>29207494</td>
  </tr>
  <tr>
    <td>2017-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q49573836">[Construction and identification of nanobody phage display library targeting Middle East respiratory syndrome coronavirus].</a> (<a href="http://www.wikidata.org/entity/Q49573836">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>29382428</td>
  </tr>
  <tr>
    <td>2017-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43280688">Middle East Respiratory Syndrome and Severe Acute Respiratory Syndrome: Current Therapeutic Options and Potential Targets for Novel Therapies.</a> (<a href="http://www.wikidata.org/entity/Q43280688">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S40265-017-0830-1</td>
    <td>29143192</td>
  </tr>
  <tr>
    <td>2017-11-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47102460">Analysis of the codon usage pattern in Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47102460">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.18632/ONCOTARGET.22738</td>
    <td>29299151</td>
  </tr>
  <tr>
    <td>2017-11-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46033198">Expression and Cleavage of Middle East Respiratory Syndrome Coronavirus nsp3-4 Polyprotein Induce the Formation of Double-Membrane Vesicles That Mimic Those Associated with Coronaviral RNA Replication.</a> (<a href="http://www.wikidata.org/entity/Q46033198">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.01658-17</td>
    <td>29162711</td>
  </tr>
  <tr>
    <td>2017-11-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45073537">Corticosteroid Therapy for Critically Ill Patients with the Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q45073537">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1164/RCCM.201706-1172OC</td>
    <td>29161116</td>
  </tr>
  <tr>
    <td>2017-11-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44106400">The French Infectious Diseases Society's readiness and response to epidemic or biological risk-the current situation following the Middle East respiratory syndrome coronavirus and Ebola virus disease alerts.</a> (<a href="http://www.wikidata.org/entity/Q44106400">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.MEDMAL.2017.10.002</td>
    <td>29169817</td>
  </tr>
  <tr>
    <td>2017-11-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47447058">A Middle East respiratory syndrome screening clinic for health care personnel during the 2015 Middle East respiratory syndrome outbreak in South Korea: A single-center experience.</a> (<a href="http://www.wikidata.org/entity/Q47447058">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2017.09.017</td>
    <td>29153641</td>
  </tr>
  <tr>
    <td>2017-11-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43628487">Human intestinal tract serves as an alternative infection route for Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q43628487">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1126/SCIADV.AAO4966</td>
    <td>29152574</td>
  </tr>
  <tr>
    <td>2017-11-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47107616">Middle East Respiratory Syndrome Coronavirus Nonstructural Protein 16 Is Necessary for Interferon Resistance and Viral Pathogenesis.</a> (<a href="http://www.wikidata.org/entity/Q47107616">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MSPHERE.00346-17</td>
    <td>29152578</td>
  </tr>
  <tr>
    <td>2017-11-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41933440">Structurally guided removal of deISGylase biochemical activity from papain-Like protease originating from the Middle East Respiratory Syndrome Virus.</a> (<a href="http://www.wikidata.org/entity/Q41933440">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01067-17</td>
    <td>28931677</td>
  </tr>
  <tr>
    <td>2017-11-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47105367">Healthcare worker infected with Middle East Respiratory Syndrome during cardiopulmonary resuscitation in Korea, 2015.</a> (<a href="http://www.wikidata.org/entity/Q47105367">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4178/EPIH.E2017052</td>
    <td>29129042</td>
  </tr>
  <tr>
    <td>2017-11-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45349964">No MERS-CoV but positive influenza viruses in returning Hajj pilgrims, China, 2013-2015.</a> (<a href="http://www.wikidata.org/entity/Q45349964">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12879-017-2791-0</td>
    <td>29126397</td>
  </tr>
  <tr>
    <td>2017-11-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47133617">Diversity of Middle East respiratory syndrome coronaviruses in 109 dromedary camels based on full-genome sequencing, Abu Dhabi, United Arab Emirates.</a> (<a href="http://www.wikidata.org/entity/Q47133617">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/EMI.2017.89</td>
    <td>29116217</td>
  </tr>
  <tr>
    <td>2017-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43158762">Knowledge and awareness of Middle East respiratory syndrome coronavirus among Saudi and Non-Saudi Arabian pilgrims.</a> (<a href="http://www.wikidata.org/entity/Q43158762">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>29114190</td>
  </tr>
  <tr>
    <td>2017-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40070511">Performance Evaluation of the PowerChek MERS (upE & ORF1a) Real-Time PCR Kit for the Detection of Middle East Respiratory Syndrome Coronavirus RNA.</a> (<a href="http://www.wikidata.org/entity/Q40070511">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3343/ALM.2017.37.6.494</td>
    <td>28840986</td>
  </tr>
  <tr>
    <td>2017-10-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42698393">Retrospective, epidemiological cluster analysis of the Middle East respiratory syndrome coronavirus (MERS-CoV) epidemic using open source data.</a> (<a href="http://www.wikidata.org/entity/Q42698393">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1017/S0950268817002345</td>
    <td>29061208</td>
  </tr>
  <tr>
    <td>2017-10-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47603994">Re: "Assessing the Detection of Middle East Respiratory Syndrome Coronavirus IgG in Suspected and Proven Cases of Middle East Respiratory Syndrome Coronavirus Infection" by Alhetheel et al. (Viral Immunol 2017;30:649-653.).</a> (<a href="http://www.wikidata.org/entity/Q47603994">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1089/VIM.2017.0161</td>
    <td>29058554</td>
  </tr>
  <tr>
    <td>2017-10-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47607374">Development of Middle East Respiratory Syndrome Coronavirus vaccines - advances and challenges.</a> (<a href="http://www.wikidata.org/entity/Q47607374">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1080/21645515.2017.1389362</td>
    <td>29048984</td>
  </tr>
  <tr>
    <td>2017-10-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47738918">Difficulties in using personal protective equipment: Training experiences with the 2015 outbreak of Middle East respiratory syndrome in Korea.</a> (<a href="http://www.wikidata.org/entity/Q47738918">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2017.08.041</td>
    <td>29050907</td>
  </tr>
  <tr>
    <td>2017-10-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47147430">Protective efficacy of a novel simian adenovirus vaccine against lethal MERS-CoV challenge in a transgenic human DPP4 mouse model.</a> (<a href="http://www.wikidata.org/entity/Q47147430">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/S41541-017-0029-1</td>
    <td>29263883</td>
  </tr>
  <tr>
    <td>2017-10-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42701710">Occurrence of the Middle East Respiratory Syndrome Coronavirus (MERS-CoV) across the Gulf Corporation Council countries: Four years update.</a> (<a href="http://www.wikidata.org/entity/Q42701710">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0183850</td>
    <td>29028812</td>
  </tr>
  <tr>
    <td>2017-10-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47612606">Influenza is more common than Middle East Respiratory Syndrome Coronavirus (MERS-CoV) among hospitalized adult Saudi patients.</a> (<a href="http://www.wikidata.org/entity/Q47612606">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.TMAID.2017.10.004</td>
    <td>29031867</td>
  </tr>
  <tr>
    <td>2017-10-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46655638">Myeloablation-associated deletion of ORF4 in a human coronavirus 229E infection.</a> (<a href="http://www.wikidata.org/entity/Q46655638">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1038/S41525-017-0033-4</td>
    <td>29263840</td>
  </tr>
  <tr>
    <td>2017-10-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41921355">Cross-sectional study of MERS-CoV-specific RNA and antibodies in animals that have had contact with MERS patients in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q41921355">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2017.09.022</td>
    <td>28993171</td>
  </tr>
  <tr>
    <td>2017-10-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41923032">Transgene expression in the genome of Middle East respiratory syndrome coronavirus based on a novel reverse genetics system utilizing Red-mediated recombination cloning.</a> (<a href="http://www.wikidata.org/entity/Q41923032">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1099/JGV.0.000919</td>
    <td>28984231</td>
  </tr>
  <tr>
    <td>2017-10-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41921957">NMR structure and localization of a large fragment of the SARS-CoV fusion protein: Implications in viral cell fusion.</a> (<a href="http://www.wikidata.org/entity/Q41921957">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.BBAMEM.2017.10.002</td>
    <td>28988778</td>
  </tr>
  <tr>
    <td>2017-10-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47407834">Tectonic conformational changes of a coronavirus spike glycoprotein promote membrane fusion.</a> (<a href="http://www.wikidata.org/entity/Q47407834">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1073/PNAS.1708727114</td>
    <td>29073020</td>
  </tr>
  <tr>
    <td>2017-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40040562">The Impact of Middle East Respiratory Syndrome Outbreak on Trends in Emergency Department Utilization Patterns.</a> (<a href="http://www.wikidata.org/entity/Q40040562">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3346/JKMS.2017.32.10.1576</td>
    <td>28875599</td>
  </tr>
  <tr>
    <td>2017-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42355938">MERS-CoV Infection in a Pregnant Woman in Korea</a> (<a href="http://www.wikidata.org/entity/Q42355938">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3346/JKMS.2017.32.10.1717</td>
    <td>28875620</td>
  </tr>
  <tr>
    <td>2017-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47565965">Middle East respiratory syndrome virus: Is there any carcinogenicity property?</a> (<a href="http://www.wikidata.org/entity/Q47565965">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/0973-1482.183185</td>
    <td>29237984</td>
  </tr>
  <tr>
    <td>2017-09-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41928129">A study of the probable transmission routes of MERS-CoV during the first hospital outbreak in the Republic of Korea.</a> (<a href="http://www.wikidata.org/entity/Q41928129">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/INA.12430</td>
    <td>28960494</td>
  </tr>
  <tr>
    <td>2017-09-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41928509">Middle East respiratory syndrome coronavirus transmission among health care workers: Implication for infection control.</a> (<a href="http://www.wikidata.org/entity/Q41928509">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2017.08.010</td>
    <td>28958446</td>
  </tr>
  <tr>
    <td>2017-09-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41928429">High reproduction number of Middle East respiratory syndrome coronavirus in nosocomial outbreaks: Mathematical modelling in Saudi Arabia and South Korea.</a> (<a href="http://www.wikidata.org/entity/Q41928429">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JHIN.2017.09.017</td>
    <td>28958834</td>
  </tr>
  <tr>
    <td>2017-09-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41935096">Identification of sialic acid-binding function for the Middle East respiratory syndrome coronavirus spike glycoprotein.</a> (<a href="http://www.wikidata.org/entity/Q41935096">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1073/PNAS.1712592114</td>
    <td>28923942</td>
  </tr>
  <tr>
    <td>2017-09-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40041686">Inclusion of MERS-spike protein ELISA in algorithm to determine serologic evidence of MERS-CoV infection.</a> (<a href="http://www.wikidata.org/entity/Q40041686">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1002/JMV.24948</td>
    <td>28906003</td>
  </tr>
  <tr>
    <td>2017-09-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40041480">Identification of a Novel Inhibitor against Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40041480">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3390/V9090255</td>
    <td>28906430</td>
  </tr>
  <tr>
    <td>2017-09-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40050351">Impact of Comorbidity on Fatality Rate of Patients with Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q40050351">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/S41598-017-10402-1</td>
    <td>28900101</td>
  </tr>
  <tr>
    <td>2017-09-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40044568">Structural insights into the Middle East respiratory syndrome coronavirus 4a protein and its dsRNA binding mechanism.</a> (<a href="http://www.wikidata.org/entity/Q40044568">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/S41598-017-11736-6</td>
    <td>28900197</td>
  </tr>
  <tr>
    <td>2017-09-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40107025">Permissivity of Dipeptidyl Peptidase 4 Orthologs to Middle East Respiratory Syndrome Coronavirus Is Governed by Glycosylation and Other Complex Determinants.</a> (<a href="http://www.wikidata.org/entity/Q40107025">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.00534-17</td>
    <td>28747502</td>
  </tr>
  <tr>
    <td>2017-09-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40053331">The predictors of 3- and 30-day mortality in 660 MERS-CoV patients.</a> (<a href="http://www.wikidata.org/entity/Q40053331">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12879-017-2712-2</td>
    <td>28893197</td>
  </tr>
  <tr>
    <td>2017-09-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40047078">Isolation and identification of human coronavirus 229E from frequently touched environmental surfaces of a university classroom that is cleaned daily.</a> (<a href="http://www.wikidata.org/entity/Q40047078">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/J.AJIC.2017.07.014</td>
    <td>28893443</td>
  </tr>
  <tr>
    <td>2017-09-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50139878">Mental Health of Nurses Working at a Government-designated Hospital During a MERS-CoV Outbreak: A Cross-sectional Study.</a> (<a href="http://www.wikidata.org/entity/Q50139878">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.APNU.2017.09.006</td>
    <td>29413067</td>
  </tr>
  <tr>
    <td>2017-09-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40057508">Assessing the Detection of Middle East Respiratory Syndrome Coronavirus IgG in Suspected and Proven Cases of Middle East Respiratory Syndrome Coronavirus Infection.</a> (<a href="http://www.wikidata.org/entity/Q40057508">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1089/VIM.2017.0091</td>
    <td>28873020</td>
  </tr>
  <tr>
    <td>2017-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42353676">Origins and pathogenesis of Middle East respiratory syndrome-associated coronavirus: recent advances.</a> (<a href="http://www.wikidata.org/entity/Q42353676">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.12688/F1000RESEARCH.11827.1</td>
    <td>29026532</td>
  </tr>
  <tr>
    <td>2017-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40049129">Medical residents' attitudes and emotions related to Middle East respiratory syndrome in Saudi Arabia. A cross-sectional study.</a> (<a href="http://www.wikidata.org/entity/Q40049129">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.15537/SMJ.2017.9.20626</td>
    <td>28889153</td>
  </tr>
  <tr>
    <td>2017-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40078398">Conveyance Contact Investigation for Imported Middle East Respiratory Syndrome Cases, United States, May 2014.</a> (<a href="http://www.wikidata.org/entity/Q40078398">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2309.170365</td>
    <td>28820379</td>
  </tr>
  <tr>
    <td>2017-08-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40064548">A review of candidate therapies for Middle East respiratory syndrome from a molecular perspective.</a> (<a href="http://www.wikidata.org/entity/Q40064548">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1099/JMM.0.000565</td>
    <td>28855003</td>
  </tr>
  <tr>
    <td>2017-08-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47657940">Histopathology of Middle East respiratory syndrome coronovirus (MERS-CoV) infection - clinicopathological and ultrastructural study.</a> (<a href="http://www.wikidata.org/entity/Q47657940">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/HIS.13379</td>
    <td>28858401</td>
  </tr>
  <tr>
    <td>2017-08-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40061001">Current treatment options and the role of peptides as potential therapeutic components for Middle East Respiratory Syndrome (MERS): A review.</a> (<a href="http://www.wikidata.org/entity/Q40061001">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2017.08.009</td>
    <td>28864360</td>
  </tr>
  <tr>
    <td>2017-08-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40059261">A multi-faceted approach of a nursing led education in response to MERS-CoV infection.</a> (<a href="http://www.wikidata.org/entity/Q40059261">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2017.08.006</td>
    <td>28869153</td>
  </tr>
  <tr>
    <td>2017-08-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41691464">First Confirmed Case of Middle East Respiratory Syndrome Coronavirus Infection in the Kingdom of Bahrain: In a Saudi Gentleman after Cardiac Bypass Surgery.</a> (<a href="http://www.wikidata.org/entity/Q41691464">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1155/2017/1262838</td>
    <td>28948054</td>
  </tr>
  <tr>
    <td>2017-08-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38638572">MERS-CoV Accessory ORFs Play Key Role for Infection and Pathogenesis.</a> (<a href="http://www.wikidata.org/entity/Q38638572">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.00665-17</td>
    <td>28830941</td>
  </tr>
  <tr>
    <td>2017-08-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40085786">Middle East respiratory syndrome coronavirus: five years later.</a> (<a href="http://www.wikidata.org/entity/Q40085786">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1080/17476348.2017.1367288</td>
    <td>28826284</td>
  </tr>
  <tr>
    <td>2017-08-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47666922">DPP4, the Middle East Respiratory Syndrome Coronavirus Receptor, is Upregulated in Lungs of Smokers and Chronic Obstructive Pulmonary Disease Patients.</a> (<a href="http://www.wikidata.org/entity/Q47666922">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIX741</td>
    <td>29020176</td>
  </tr>
  <tr>
    <td>2017-08-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38619800">Enhanced inflammation in New Zealand white rabbits when MERS-CoV reinfection occurs in the absence of neutralizing antibody.</a> (<a href="http://www.wikidata.org/entity/Q38619800">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PPAT.1006565</td>
    <td>28817732</td>
  </tr>
  <tr>
    <td>2017-08-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47110189">A Novel Dynamic Model Describing the Spread of the MERS-CoV and the Expression of Dipeptidyl Peptidase 4.</a> (<a href="http://www.wikidata.org/entity/Q47110189">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>2017-08-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40052186">A Novel Dynamic Model Describing the Spread of the MERS-CoV and the Expression of Dipeptidyl Peptidase 4.</a> (<a href="http://www.wikidata.org/entity/Q40052186">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1155/2017/5285810</td>
    <td>28894474</td>
  </tr>
  <tr>
    <td>2017-08-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40083207">Immunogenicity and structures of a rationally designed prefusion MERS-CoV spike antigen.</a> (<a href="http://www.wikidata.org/entity/Q40083207">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1073/PNAS.1707304114</td>
    <td>28807998</td>
  </tr>
  <tr>
    <td>2017-08-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38368905">Advancing Preparedness for Highly Hazardous Contagious Diseases: Admitting 10 Simulated Patients with MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q38368905">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1089/HS.2017.0003</td>
    <td>28805464</td>
  </tr>
  <tr>
    <td>2017-08-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40083271">Evaluation and Clinical Validation of Two Field-Deployable Reverse Transcription-Insulated Isothermal PCR Assays for the Detection of the Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40083271">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JMOLDX.2017.06.007</td>
    <td>28807812</td>
  </tr>
  <tr>
    <td>2017-08-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40085297">New episode of Middle East Respiratory Syndrome Coronavirus outbreak in Saudi Arabia: an emerging public health threat.</a> (<a href="http://www.wikidata.org/entity/Q40085297">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.PUHE.2017.07.016</td>
    <td>28802180</td>
  </tr>
  <tr>
    <td>2017-08-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38644643">The history and epidemiology of Middle East respiratory syndrome corona virus.</a> (<a href="http://www.wikidata.org/entity/Q38644643">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S40248-017-0101-8</td>
    <td>28794876</td>
  </tr>
  <tr>
    <td>2017-08-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40094147">Recovery from the Middle East respiratory syndrome is associated with antibody and T-cell responses.</a> (<a href="http://www.wikidata.org/entity/Q40094147">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1126/SCIIMMUNOL.AAN5393</td>
    <td>28778905</td>
  </tr>
  <tr>
    <td>2017-08-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38634762">Critically Ill Patients With the Middle East Respiratory Syndrome: A Multicenter Retrospective Cohort Study.</a> (<a href="http://www.wikidata.org/entity/Q38634762">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1097/CCM.0000000000002621</td>
    <td>28787295</td>
  </tr>
  <tr>
    <td>2017-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40112438">Outbreak of Middle East Respiratory Syndrome-Coronavirus Causes High Fatality After Cardiac Operations.</a> (<a href="http://www.wikidata.org/entity/Q40112438">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ATHORACSUR.2017.02.072</td>
    <td>28734432</td>
  </tr>
  <tr>
    <td>2017-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40175424">Identified Transmission Dynamics of Middle East Respiratory Syndrome Coronavirus Infection During an Outbreak: Implications of an Overcrowded Emergency Department.</a> (<a href="http://www.wikidata.org/entity/Q40175424">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIX352</td>
    <td>28575307</td>
  </tr>
  <tr>
    <td>2017-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39360121">Imported case of Middle East respiratory syndrome coronavirus (MERS-CoV) infection from Oman to Thailand, June 2015.</a> (<a href="http://www.wikidata.org/entity/Q39360121">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES.2017.22.33.30598</td>
    <td>28840828</td>
  </tr>
  <tr>
    <td>2017-07-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38651569">Spatial modelling of contribution of individual level risk factors for mortality from Middle East respiratory syndrome coronavirus in the Arabian Peninsula</a> (<a href="http://www.wikidata.org/entity/Q38651569">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0181215</td>
    <td>28759623</td>
  </tr>
  <tr>
    <td>2017-07-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47817432">A proposal for the eradication of Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q47817432">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2017.06.001</td>
    <td>28757082</td>
  </tr>
  <tr>
    <td>2017-07-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40116147">Predictors of mortality in Middle East respiratory syndrome (MERS).</a> (<a href="http://www.wikidata.org/entity/Q40116147">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1136/THORAXJNL-2016-209313</td>
    <td>28724637</td>
  </tr>
  <tr>
    <td>2017-07-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40125997">Diagnostic delays in 537 symptomatic cases of Middle East respiratory syndrome coronavirus infection in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q40125997">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2017.07.008</td>
    <td>28728926</td>
  </tr>
  <tr>
    <td>2017-07-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40113711">Awareness among a Saudi Arabian university community of Middle East respiratory syndrome coronavirus following an outbreak.</a> (<a href="http://www.wikidata.org/entity/Q40113711">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>28730588</td>
  </tr>
  <tr>
    <td>2017-07-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33908067">MERS-CoV Antibody Responses 1 Year after Symptom Onset, South Korea, 2015.</a> (<a href="http://www.wikidata.org/entity/Q33908067">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2307.170310</td>
    <td>28585916</td>
  </tr>
  <tr>
    <td>2017-07-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33908564">The clinical and virological features of the first imported case causing MERS-CoV outbreak in South Korea, 2015.</a> (<a href="http://www.wikidata.org/entity/Q33908564">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12879-017-2576-5</td>
    <td>28709419</td>
  </tr>
  <tr>
    <td>2017-07-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38658221">Estimating and Modelling the Transmissibility of Middle East Respiratory Syndrome Corona Virus during the 2015 Outbreak in the Republic of Korea.</a> (<a href="http://www.wikidata.org/entity/Q38658221">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/IRV.12467</td>
    <td>28703921</td>
  </tr>
  <tr>
    <td>2017-07-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38684877">Suggested new breakpoints of anti-MERS-CoV antibody ELISA titers: performance analysis of serologic tests.</a> (<a href="http://www.wikidata.org/entity/Q38684877">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S10096-017-3043-3</td>
    <td>28695355</td>
  </tr>
  <tr>
    <td>2017-07-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40049636">Middle East Respiratory Syndrome Coronavirus and Pulmonary Tuberculosis Coinfection: Implications for Infection Control.</a> (<a href="http://www.wikidata.org/entity/Q40049636">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1159/000477908</td>
    <td>28683463</td>
  </tr>
  <tr>
    <td>2017-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38694110">"It feels like I'm the dirtiest person in the world.": Exploring the experiences of healthcare providers who survived MERS-CoV in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q38694110">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2017.06.011</td>
    <td>28676285</td>
  </tr>
  <tr>
    <td>2017-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40106479">Neurological Complications during Treatment of Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q40106479">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3988/JCN.2017.13.3.227</td>
    <td>28748673</td>
  </tr>
  <tr>
    <td>2017-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40083074">Prevalence of antibodies against the Middle East Respiratory Syndrome coronavirus, influenza A and B viruses among blood donors, Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q40083074">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/ATM.ATM_143_17</td>
    <td>28808497</td>
  </tr>
  <tr>
    <td>2017-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43191540">Follow-up chest radiographic findings in patients with MERS-CoV after recovery.</a> (<a href="http://www.wikidata.org/entity/Q43191540">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/IJRI.IJRI_469_16</td>
    <td>29089687</td>
  </tr>
  <tr>
    <td>2017-06-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33907316">Impact of Middle East respiratory syndrome outbreak on the use of emergency medical resources in febrile patients</a> (<a href="http://www.wikidata.org/entity/Q33907316">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.15441/CEEM.16.166</td>
    <td>28717779</td>
  </tr>
  <tr>
    <td>2017-06-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33853478">Middle East respiratory syndrome clinical practice guideline for hemodialysis facilities</a> (<a href="http://www.wikidata.org/entity/Q33853478">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.23876/J.KRCP.2017.36.2.111</td>
    <td>28680819</td>
  </tr>
  <tr>
    <td>2017-06-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50919965">A novel neutralizing monoclonal antibody targeting the N-terminal domain of the MERS-CoV spike protein.</a> (<a href="http://www.wikidata.org/entity/Q50919965">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/EMI.2017.50</td>
    <td>28655936</td>
  </tr>
  <tr>
    <td>2017-06-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40144229">Middle East respiratory syndrome coronavirus experimental transmission using a pig model.</a> (<a href="http://www.wikidata.org/entity/Q40144229">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/TBED.12668</td>
    <td>28653496</td>
  </tr>
  <tr>
    <td>2017-06-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33884608">Crystal structure of Middle East respiratory syndrome coronavirus helicase.</a> (<a href="http://www.wikidata.org/entity/Q33884608">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PPAT.1006474</td>
    <td>28651017</td>
  </tr>
  <tr>
    <td>2017-06-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38720345">Dynamics of scientific publications on the MERS-CoV outbreaks in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q38720345">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2017.05.005</td>
    <td>28625842</td>
  </tr>
  <tr>
    <td>2017-06-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40146924">MERS-CoV infection: Mind the public knowledge gap.</a> (<a href="http://www.wikidata.org/entity/Q40146924">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2017.05.003</td>
    <td>28647126</td>
  </tr>
  <tr>
    <td>2017-06-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40152026">Longitudinal study of Middle East Respiratory Syndrome coronavirus infection in dromedary camel herds in Saudi Arabia, 2014-2015.</a> (<a href="http://www.wikidata.org/entity/Q40152026">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/EMI.2017.44</td>
    <td>28634355</td>
  </tr>
  <tr>
    <td>2017-06-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33724639">Domestic Pig Unlikely Reservoir for MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q33724639">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2306.170096</td>
    <td>28318484</td>
  </tr>
  <tr>
    <td>2017-06-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38728233">Computational modeling of the bat HKU4 coronavirus 3CL(pro) inhibitors as a tool for the development of antivirals against the emerging Middle East respiratory syndrome (MERS) coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q38728233">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1002/JMR.2644</td>
    <td>28608547</td>
  </tr>
  <tr>
    <td>2017-06-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33796401">Estimation of basic reproduction number of the Middle East respiratory syndrome coronavirus (MERS-CoV) during the outbreak in South Korea, 2015</a> (<a href="http://www.wikidata.org/entity/Q33796401">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12938-017-0370-7</td>
    <td>28610609</td>
  </tr>
  <tr>
    <td>2017-06-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54374544">A cohort-study of patients suspected for MERS-CoV in a referral hospital in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q54374544">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JINF.2017.06.002</td>
    <td>28606432</td>
  </tr>
  <tr>
    <td>2017-06-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38739674">Comparative epidemiology of Middle East respiratory syndrome coronavirus (MERS-CoV) in Saudi Arabia and South Korea.</a> (<a href="http://www.wikidata.org/entity/Q38739674">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/EMI.2017.40</td>
    <td>28588290</td>
  </tr>
  <tr>
    <td>2017-06-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43167989">A pandemic risk assessment of middle east respiratory syndrome coronavirus (MERS-CoV) in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q43167989">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.SJBS.2017.06.001</td>
    <td>29062261</td>
  </tr>
  <tr>
    <td>2017-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40173497">ChAdOx1 and MVA based vaccine candidates against MERS-CoV elicit neutralising antibodies and cellular immune responses in mice.</a> (<a href="http://www.wikidata.org/entity/Q40173497">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VACCINE.2017.05.032</td>
    <td>28579232</td>
  </tr>
  <tr>
    <td>2017-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40215096">Human Neutralizing Monoclonal Antibody Inhibition of Middle East Respiratory Syndrome Coronavirus Replication in the Common Marmoset.</a> (<a href="http://www.wikidata.org/entity/Q40215096">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIX209</td>
    <td>28472421</td>
  </tr>
  <tr>
    <td>2017-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33724530">Hospital Outbreaks of Middle East Respiratory Syndrome, Daejeon, South Korea, 2015</a> (<a href="http://www.wikidata.org/entity/Q33724530">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2306.160120</td>
    <td>28516865</td>
  </tr>
  <tr>
    <td>2017-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38673951">No Serologic Evidence of Middle East Respiratory Syndrome Coronavirus Infection Among Camel Farmers Exposed to Highly Seropositive Camel Herds: A Household Linked Study, Kenya, 2013.</a> (<a href="http://www.wikidata.org/entity/Q38673951">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4269/AJTMH.16-0880</td>
    <td>28719257</td>
  </tr>
  <tr>
    <td>2017-05-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47875863">Evaluation of a Real-Time Reverse Transcription-PCR (RT-PCR) Assay for Detection of Middle East Respiratory Syndrome Coronavirus (MERS-CoV) in Clinical Samples from an Outbreak in South Korea in 2015.</a> (<a href="http://www.wikidata.org/entity/Q47875863">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JCM.00667-17</td>
    <td>28566313</td>
  </tr>
  <tr>
    <td>2017-05-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51795571">MERS-CoV papain-like protease (PLpro): expression, purification, and spectroscopic/thermodynamic characterization.</a> (<a href="http://www.wikidata.org/entity/Q51795571">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S13205-017-0744-3</td>
    <td>28560640</td>
  </tr>
  <tr>
    <td>2017-05-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40175964">Analysis of the genome sequence and prediction of B-cell epitopes of the envelope protein of Middle East respiratory syndrome-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40175964">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1109/TCBB.2017.2702588</td>
    <td>28574363</td>
  </tr>
  <tr>
    <td>2017-05-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30402347">A novel neutralizing monoclonal antibody targeting the N-terminal domain of the MERS-CoV spike protein</a> (<a href="http://www.wikidata.org/entity/Q30402347">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/EMI.2017.18</td>
    <td>28536429</td>
  </tr>
  <tr>
    <td>2017-05-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40184785">Atypical presentations of MERS-CoV infection in immunocompromised hosts.</a> (<a href="http://www.wikidata.org/entity/Q40184785">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIAC.2017.04.004</td>
    <td>28545936</td>
  </tr>
  <tr>
    <td>2017-05-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42349047">Correction: Serological Evidence of MERS-CoV Antibodies in Dromedary Camels (Camelus dromedaries) in Laikipia County, Kenya.</a> (<a href="http://www.wikidata.org/entity/Q42349047">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0178310</td>
    <td>28542448</td>
  </tr>
  <tr>
    <td>2017-05-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47886267">Control of Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q47886267">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2017.03.026</td>
    <td>28526304</td>
  </tr>
  <tr>
    <td>2017-05-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30234479">Molecular aspects of MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q30234479">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S11684-017-0521-Z</td>
    <td>28500431</td>
  </tr>
  <tr>
    <td>2017-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40213543">Zero Transmission of Middle East Respiratory Syndrome: Lessons Learned From Thailand.</a> (<a href="http://www.wikidata.org/entity/Q40213543">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIX074</td>
    <td>28475787</td>
  </tr>
  <tr>
    <td>2017-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37740446">Clinical and Epidemiologic Characteristics of Spreaders of Middle East Respiratory Syndrome Coronavirus during the 2015 Outbreak in Korea.</a> (<a href="http://www.wikidata.org/entity/Q37740446">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3346/JKMS.2017.32.5.744</td>
    <td>28378546</td>
  </tr>
  <tr>
    <td>2017-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33660834">To what extent are Arab pilgrims to Makkah aware of the middle east respiratory syndrome coronavirus and the precautions against it?</a> (<a href="http://www.wikidata.org/entity/Q33660834">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/2230-8229.205119</td>
    <td>28566972</td>
  </tr>
  <tr>
    <td>2017-04-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33441395">Hematologic, hepatic, and renal function changes in hospitalized patients with Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q33441395">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/IJLH.12620</td>
    <td>28444873</td>
  </tr>
  <tr>
    <td>2017-04-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38403526">Infectivity of an Asymptomatic Patient With Middle East Respiratory Syndrome Coronavirus Infection.</a> (<a href="http://www.wikidata.org/entity/Q38403526">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIX170</td>
    <td>28444154</td>
  </tr>
  <tr>
    <td>2017-04-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40229759">Structural Insights into the Interaction of Coronavirus Papain-Like Proteases and Interferon-Stimulated Gene Product 15 from Different Species.</a> (<a href="http://www.wikidata.org/entity/Q40229759">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.JMB.2017.04.011</td>
    <td>28438633</td>
  </tr>
  <tr>
    <td>2017-04-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39607762">Two deletion variants of Middle East respiratory syndrome coronavirus found in a patient with characteristic symptoms.</a> (<a href="http://www.wikidata.org/entity/Q39607762">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S00705-017-3361-X</td>
    <td>28421366</td>
  </tr>
  <tr>
    <td>2017-04-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42034568">Synonymous and Biased Codon Usage by MERS CoV Papain-Like and 3CL-Proteases.</a> (<a href="http://www.wikidata.org/entity/Q42034568">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1248/BPB.B17-00168</td>
    <td>28420819</td>
  </tr>
  <tr>
    <td>2017-04-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30234777">Middle East respiratory syndrome coronavirus vaccines: current status and novel approaches.</a> (<a href="http://www.wikidata.org/entity/Q30234777">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.COVIRO.2017.03.007</td>
    <td>28412285</td>
  </tr>
  <tr>
    <td>2017-04-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47924059">Multiplex Paper-Based Colorimetric DNA Sensor Using Pyrrolidinyl Peptide Nucleic Acid-Induced AgNPs Aggregation for Detecting MERS-CoV, MTB, and HPV Oligonucleotides.</a> (<a href="http://www.wikidata.org/entity/Q47924059">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1021/ACS.ANALCHEM.7B00255</td>
    <td>28394582</td>
  </tr>
  <tr>
    <td>2017-04-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30845557">Cryo-EM structures of MERS-CoV and SARS-CoV spike glycoproteins reveal the dynamic receptor binding domains</a> (<a href="http://www.wikidata.org/entity/Q30845557">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/NCOMMS15092</td>
    <td>28393837</td>
  </tr>
  <tr>
    <td>2017-04-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30845557">Cryo-EM structures of MERS-CoV and SARS-CoV spike glycoproteins reveal the dynamic receptor binding domains</a> (<a href="http://www.wikidata.org/entity/Q30845557">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1038/NCOMMS15092</td>
    <td>28393837</td>
  </tr>
  <tr>
    <td>2017-04-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40208243">Perception and Attitude of Emergency Room Resident Physicians toward Middle East Respiratory Syndrome Outbreak.</a> (<a href="http://www.wikidata.org/entity/Q40208243">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1155/2017/6978256</td>
    <td>28487774</td>
  </tr>
  <tr>
    <td>2017-04-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40253331">Risk Factors for Primary Middle East Respiratory Syndrome Coronavirus Infection in Camel Workers in Qatar During 2013-2014: A Case-Control Study.</a> (<a href="http://www.wikidata.org/entity/Q40253331">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIX174</td>
    <td>28387845</td>
  </tr>
  <tr>
    <td>2017-04-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40252744">Efficacy of antibody-based therapies against Middle East respiratory syndrome coronavirus (MERS-CoV) in common marmosets.</a> (<a href="http://www.wikidata.org/entity/Q40252744">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2017.03.025</td>
    <td>28389142</td>
  </tr>
  <tr>
    <td>2017-04-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30400728">Further Evidence for Bats as the Evolutionary Source of Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q30400728">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.00373-17</td>
    <td>28377531</td>
  </tr>
  <tr>
    <td>2017-04-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38733902">Middle East respiratory syndrome risk perception among students at a university in South Korea, 2015.</a> (<a href="http://www.wikidata.org/entity/Q38733902">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2017.02.013</td>
    <td>28385465</td>
  </tr>
  <tr>
    <td>2017-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33735209">Middle East respiratory syndrome in children. Dental considerations</a> (<a href="http://www.wikidata.org/entity/Q33735209">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.15537/SMJ.2017.4.15777</td>
    <td>28397938</td>
  </tr>
  <tr>
    <td>2017-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40283222">Surveillance and Testing for Middle East Respiratory Syndrome Coronavirus, Saudi Arabia, April 2015-February 2016.</a> (<a href="http://www.wikidata.org/entity/Q40283222">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2304.161793</td>
    <td>28322710</td>
  </tr>
  <tr>
    <td>2017-03-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36326841">The NF-κB-dependent and -independent transcriptome and chromatin landscapes of human coronavirus 229E-infected cells.</a> (<a href="http://www.wikidata.org/entity/Q36326841">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1371/JOURNAL.PPAT.1006286</td>
    <td>28355270</td>
  </tr>
  <tr>
    <td>2017-03-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40269703">Effects of operational decisions on the diffusion of epidemic disease: A system dynamics modeling of the MERS-CoV outbreak in South Korea.</a> (<a href="http://www.wikidata.org/entity/Q40269703">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JTBI.2017.03.020</td>
    <td>28351702</td>
  </tr>
  <tr>
    <td>2017-03-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37717377">Immunogenicity of Candidate MERS-CoV DNA Vaccines Based on the Spike Protein.</a> (<a href="http://www.wikidata.org/entity/Q37717377">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/SREP44875</td>
    <td>28332568</td>
  </tr>
  <tr>
    <td>2017-03-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38741331">Structural Characterization of Human Coronavirus NL63 N Protein.</a> (<a href="http://www.wikidata.org/entity/Q38741331">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1128/JVI.02503-16</td>
    <td>28331093</td>
  </tr>
  <tr>
    <td>2017-03-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30400066">DNA vaccine encoding Middle East respiratory syndrome coronavirus S1 protein induces protective immune responses in mice.</a> (<a href="http://www.wikidata.org/entity/Q30400066">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VACCINE.2017.02.063</td>
    <td>28314561</td>
  </tr>
  <tr>
    <td>2017-03-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33753550">Dromedary camels in northern Mali have high seropositivity to MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q33753550">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ONEHLT.2017.03.003</td>
    <td>28616502</td>
  </tr>
  <tr>
    <td>2017-03-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30399700">Receptor-binding domain of MERS-CoV with optimal immunogen dosage and immunization interval protects human transgenic mice from MERS-CoV infection.</a> (<a href="http://www.wikidata.org/entity/Q30399700">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1080/21645515.2017.1296994</td>
    <td>28277821</td>
  </tr>
  <tr>
    <td>2017-03-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30399626">Worry experienced during the 2015 Middle East Respiratory Syndrome (MERS) pandemic in Korea.</a> (<a href="http://www.wikidata.org/entity/Q30399626">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0173234</td>
    <td>28273131</td>
  </tr>
  <tr>
    <td>2017-03-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39239181">A25 Phylogenetic analysis of the nucleocapsid and RNA-dependent RNA polymerase fragments of the first imported case of middle east respiratory syndrome coronavirus (MERS-CoV) infection in the Philippines from Saudi Arabia, February 2015.</a> (<a href="http://www.wikidata.org/entity/Q39239181">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/VE/VEW036.024</td>
    <td>28845258</td>
  </tr>
  <tr>
    <td>2017-03-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40068752">A46 MERS-CoV in Arabian camels in Africa and Central Asia.</a> (<a href="http://www.wikidata.org/entity/Q40068752">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/VE/VEW036.045</td>
    <td>28845242</td>
  </tr>
  <tr>
    <td>2017-03-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40068453">A47 Origin and possible genetic recombination of the middle east respiratory syndrome coronavirus from the first imported case in china: phylogenetics and coalescence analysis.</a> (<a href="http://www.wikidata.org/entity/Q40068453">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/VE/VEW036.046</td>
    <td>28845291</td>
  </tr>
  <tr>
    <td>2017-03-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28873816">Searching for animal models and potential target species for emerging pathogens: Experience gained from Middle East respiratory syndrome (MERS) coronavirus</a> (<a href="http://www.wikidata.org/entity/Q28873816">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ONEHLT.2017.03.001</td>
    <td>28616501</td>
  </tr>
  <tr>
    <td>2017-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37708530">Cross-sectional surveillance of Middle East respiratory syndrome coronavirus (MERS-CoV) in dromedary camels and other mammals in Egypt, August 2015 to January 2016</a> (<a href="http://www.wikidata.org/entity/Q37708530">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES.2017.22.11.30487</td>
    <td>28333616</td>
  </tr>
  <tr>
    <td>2017-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37739645">Serologic Evidence for MERS-CoV Infection in Dromedary Camels, Punjab, Pakistan, 2012-2015</a> (<a href="http://www.wikidata.org/entity/Q37739645">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2303.161285</td>
    <td>28221127</td>
  </tr>
  <tr>
    <td>2017-02-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30235533">The role of laboratory diagnostics in emerging viral infections: the example of the Middle East respiratory syndrome epidemic.</a> (<a href="http://www.wikidata.org/entity/Q30235533">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S12275-017-7026-Y</td>
    <td>28243939</td>
  </tr>
  <tr>
    <td>2017-02-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36289647">Comparative pathology of rhesus macaque and common marmoset animal models with Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q36289647">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0172093</td>
    <td>28234937</td>
  </tr>
  <tr>
    <td>2017-02-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40317741">MERS-CoV spike nanoparticles protect mice from MERS-CoV infection.</a> (<a href="http://www.wikidata.org/entity/Q40317741">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VACCINE.2017.02.012</td>
    <td>28237499</td>
  </tr>
  <tr>
    <td>2017-02-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40324605">Simultaneous detection of severe acute respiratory syndrome, Middle East respiratory syndrome, and related bat coronaviruses by real-time reverse transcription PCR.</a> (<a href="http://www.wikidata.org/entity/Q40324605">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S00705-017-3281-9</td>
    <td>28220326</td>
  </tr>
  <tr>
    <td>2017-02-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40068309">Identification and evaluation of potent Middle East respiratory syndrome coronavirus (MERS-CoV) 3CLPro inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q40068309">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2017.02.007</td>
    <td>28216367</td>
  </tr>
  <tr>
    <td>2017-02-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38755543">"Your Health Essential for Your Hajj": Muslim pilgrims' knowledge, attitudes and practices regarding Middle East respiratory syndrome coronavirus (MERS-CoV) during Hajj season.</a> (<a href="http://www.wikidata.org/entity/Q38755543">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIAC.2017.01.006</td>
    <td>28216182</td>
  </tr>
  <tr>
    <td>2017-02-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38373063">Questionnaire-based analysis of infection prevention and control in healthcare facilities in Saudi Arabia in regards to Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q38373063">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2016.11.008</td>
    <td>28215912</td>
  </tr>
  <tr>
    <td>2017-02-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40430220">Livestock Susceptibility to Infection with Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40430220">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2302.161239</td>
    <td>27901465</td>
  </tr>
  <tr>
    <td>2017-02-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36279084">Effective inhibition of MERS-CoV infection by resveratrol</a> (<a href="http://www.wikidata.org/entity/Q36279084">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12879-017-2253-8</td>
    <td>28193191</td>
  </tr>
  <tr>
    <td>2017-02-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45330501">The impact of co-infection of influenza A virus on the severity of Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q45330501">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JINF.2017.02.001</td>
    <td>28189714</td>
  </tr>
  <tr>
    <td>2017-02-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40336178">Outcome of strict implementation of infection prevention control measures during an outbreak of Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q40336178">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2016.12.020</td>
    <td>28189413</td>
  </tr>
  <tr>
    <td>2017-02-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47882532">Middle East respiratory syndrome (MERS) coronavirus: Putting one health principles into practice?</a> (<a href="http://www.wikidata.org/entity/Q47882532">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.TVJL.2017.02.002</td>
    <td>28216233</td>
  </tr>
  <tr>
    <td>2017-02-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33452693">Public response to MERS-CoV in the Middle East: iPhone survey in six countries.</a> (<a href="http://www.wikidata.org/entity/Q33452693">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2016.11.015</td>
    <td>28185821</td>
  </tr>
  <tr>
    <td>2017-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38972555">Psychobehavioural responses to the 2014 Middle East respiratory syndrome-novel corona virus (MERS CoV) among adults in two shopping malls in Jeddah, western Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q38972555">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>28177112</td>
  </tr>
  <tr>
    <td>2017-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30274816">Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q30274816">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1056/NEJMSR1408795</td>
    <td>28177862</td>
  </tr>
  <tr>
    <td>2017-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40374678">The First Infant Death Associated With Human Coronavirus NL63 Infection.</a> (<a href="http://www.wikidata.org/entity/Q40374678">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1097/INF.0000000000001390</td>
    <td>28081049</td>
  </tr>
  <tr>
    <td>2017-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37670743">Spontaneous intracranial hemorrhage in a patient with Middle East respiratory syndrome corona virus.</a> (<a href="http://www.wikidata.org/entity/Q37670743">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.15537/SMJ.2017.2.16255</td>
    <td>28133694</td>
  </tr>
  <tr>
    <td>2017-01-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39102732">Progress of Middle East respiratory syndrome coronavirus vaccines: a patent review.</a> (<a href="http://www.wikidata.org/entity/Q39102732">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1080/13543776.2017.1281248</td>
    <td>28121202</td>
  </tr>
  <tr>
    <td>2017-01-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40072211">Print media coverage of Ebola Virus Disease, Middle East Respiratory Syndrome and pertussis.</a> (<a href="http://www.wikidata.org/entity/Q40072211">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/1753-6405.12637</td>
    <td>28110493</td>
  </tr>
  <tr>
    <td>2017-01-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40359845">Middle east respiratory syndrome corona virus spike glycoprotein suppresses macrophage responses via DPP4-mediated induction of IRAK-M and PPARγ.</a> (<a href="http://www.wikidata.org/entity/Q40359845">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.18632/ONCOTARGET.14754</td>
    <td>28118607</td>
  </tr>
  <tr>
    <td>2017-01-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37598315">Case characteristics among Middle East respiratory syndrome coronavirus outbreak and non-outbreak cases in Saudi Arabia from 2012 to 2015.</a> (<a href="http://www.wikidata.org/entity/Q37598315">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1136/BMJOPEN-2016-011865</td>
    <td>28082362</td>
  </tr>
  <tr>
    <td>2017-01-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40365152">Clinical validation of 3 commercial real-time reverse transcriptase polymerase chain reaction assays for the detection of Middle East respiratory syndrome coronavirus from upper respiratory tract specimens.</a> (<a href="http://www.wikidata.org/entity/Q40365152">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.DIAGMICROBIO.2017.01.003</td>
    <td>28104327</td>
  </tr>
  <tr>
    <td>2017-01-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39132312">Middle East respiratory syndrome (MERS) coronavirus and dromedaries.</a> (<a href="http://www.wikidata.org/entity/Q39132312">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.TVJL.2016.12.020</td>
    <td>28190501</td>
  </tr>
  <tr>
    <td>2017-01-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28364965">Outbreak of Middle East respiratory syndrome coronavirus in Saudi Arabia: a retrospective study</a> (<a href="http://www.wikidata.org/entity/Q28364965">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12879-016-2137-3</td>
    <td>28056850</td>
  </tr>
  <tr>
    <td>2017-01-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37617630">Systematic, active surveillance for Middle East respiratory syndrome coronavirus in camels in Egypt.</a> (<a href="http://www.wikidata.org/entity/Q37617630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/EMI.2016.130</td>
    <td>28050021</td>
  </tr>
  <tr>
    <td>2017-01-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37617633">Identification and evolutionary dynamics of two novel human coronavirus OC43 genotypes associated with acute respiratory infections: phylogenetic, spatiotemporal and transmission network analyses.</a> (<a href="http://www.wikidata.org/entity/Q37617633">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1038/EMI.2016.132</td>
    <td>28050020</td>
  </tr>
  <tr>
    <td>2017-01-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q31152614">Social Big Data Analysis of Information Spread and Perceived Infection Risk During the 2015 Middle East Respiratory Syndrome Outbreak in South Korea.</a> (<a href="http://www.wikidata.org/entity/Q31152614">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1089/CYBER.2016.0126</td>
    <td>28051336</td>
  </tr>
  <tr>
    <td>2017-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39437431">Middle East Respiratory Syndrome Corona Virus Alert Verification In Mirpur, Azad Kashmir.</a> (<a href="http://www.wikidata.org/entity/Q39437431">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>28712204</td>
  </tr>
  <tr>
    <td>2017-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40312138">Molecular Dynamic Studies of Interferon and Innate Immunity Resistance in MERS CoV Non-Structural Protein 3.</a> (<a href="http://www.wikidata.org/entity/Q40312138">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1248/BPB.B16-00870</td>
    <td>28250277</td>
  </tr>
  <tr>
    <td>2017-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38647914">Comparative Genomic Analysis MERS CoV Isolated from Humans and Camels with Special Reference to Virus Encoded Helicase.</a> (<a href="http://www.wikidata.org/entity/Q38647914">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1248/BPB.B17-00241</td>
    <td>28769010</td>
  </tr>
  <tr>
    <td>2017-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30239107">Middle East respiratory syndrome coronavirus (MERS-CoV) infection.</a> (<a href="http://www.wikidata.org/entity/Q30239107">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.12968/HMED.2017.78.1.23</td>
    <td>28067571</td>
  </tr>
  <tr>
    <td>2017-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42369242">Importance of Specimen Type and Quality in Diagnosing Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q42369242">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3343/ALM.2017.37.1.81</td>
    <td>27834073</td>
  </tr>
  <tr>
    <td>2017-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39134263">Differential Cell Count and CRP Level in Blood as Predictors for Middle East Respiratory Syndrome Coronavirus Infection in Acute Febrile Patients during Nosocomial Outbreak.</a> (<a href="http://www.wikidata.org/entity/Q39134263">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3346/JKMS.2017.32.1.151</td>
    <td>27914145</td>
  </tr>
  <tr>
    <td>2016-12-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30396959">Novel chimeric virus-like particles vaccine displaying MERS-CoV receptor-binding domain induce specific humoral and cellular immune response in mice.</a> (<a href="http://www.wikidata.org/entity/Q30396959">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2016.12.019</td>
    <td>28040513</td>
  </tr>
  <tr>
    <td>2016-12-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40403939">Binding of the Methyl Donor S-Adenosyl-l-Methionine to Middle East Respiratory Syndrome Coronavirus 2'-O-Methyltransferase nsp16 Promotes Recruitment of the Allosteric Activator nsp10.</a> (<a href="http://www.wikidata.org/entity/Q40403939">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.02217-16</td>
    <td>28031370</td>
  </tr>
  <tr>
    <td>2016-12-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40397876">Cryo-electron microscopy structures of the SARS-CoV spike glycoprotein reveal a prerequisite conformational state for receptor binding.</a> (<a href="http://www.wikidata.org/entity/Q40397876">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1038/CR.2016.152</td>
    <td>28008928</td>
  </tr>
  <tr>
    <td>2016-12-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28354158">A camel-derived MERS-CoV with a variant spike protein cleavage site and distinct fusion activation properties</a> (<a href="http://www.wikidata.org/entity/Q28354158">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/EMI.2016.125</td>
    <td>27999426</td>
  </tr>
  <tr>
    <td>2016-12-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39107833">Resource impact of managing suspected Middle East respiratory syndrome patients in a UK teaching hospital.</a> (<a href="http://www.wikidata.org/entity/Q39107833">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JHIN.2016.12.010</td>
    <td>28131646</td>
  </tr>
  <tr>
    <td>2016-12-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30238587">Epidemic and Emerging Coronaviruses (Severe Acute Respiratory Syndrome and Middle East Respiratory Syndrome).</a> (<a href="http://www.wikidata.org/entity/Q30238587">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.CCM.2016.11.007</td>
    <td>28159163</td>
  </tr>
  <tr>
    <td>2016-12-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37535800">Time Course of MERS-CoV Infection and Immunity in Dromedary Camels.</a> (<a href="http://www.wikidata.org/entity/Q37535800">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2212.160382</td>
    <td>27224315</td>
  </tr>
  <tr>
    <td>2016-12-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40410851">The Middle East Respiratory Syndrome Coronavirus - A Continuing Risk to Global Health Security.</a> (<a href="http://www.wikidata.org/entity/Q40410851">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/5584_2016_133</td>
    <td>27966107</td>
  </tr>
  <tr>
    <td>2016-12-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q48017910">Delayed management of Staphyloccocus aureus infective endocarditis in a Middle East respiratory syndrome coronavirus possible case hospitalized in 2015 in Paris, France.</a> (<a href="http://www.wikidata.org/entity/Q48017910">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.CMI.2016.11.021</td>
    <td>27986520</td>
  </tr>
  <tr>
    <td>2016-12-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30240139">MERS-CoV spike protein: a key target for antivirals.</a> (<a href="http://www.wikidata.org/entity/Q30240139">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1080/14728222.2017.1271415</td>
    <td>27936982</td>
  </tr>
  <tr>
    <td>2016-12-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39034541">Update on therapeutic options for Middle East Respiratory Syndrome Coronavirus (MERS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q39034541">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1080/14787210.2017.1271712</td>
    <td>27937060</td>
  </tr>
  <tr>
    <td>2016-12-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40414298">Risk factors for transmission of Middle East respiratory syndrome coronavirus infection during the 2015 outbreak in South Korea.</a> (<a href="http://www.wikidata.org/entity/Q40414298">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIW768</td>
    <td>27940937</td>
  </tr>
  <tr>
    <td>2016-12-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39118174">Influenza not MERS CoV among returning Hajj and Umrah pilgrims with respiratory illness, Kashmir, north India, 2014-15.</a> (<a href="http://www.wikidata.org/entity/Q39118174">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.TMAID.2016.12.002</td>
    <td>27932291</td>
  </tr>
  <tr>
    <td>2016-12-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37525905">Psychological trauma of Middle East Respiratory Syndrome victims and bereaved families.</a> (<a href="http://www.wikidata.org/entity/Q37525905">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4178/EPIH.E2016054</td>
    <td>27919121</td>
  </tr>
  <tr>
    <td>2016-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38613990">Elucidating Transmission Patterns From Internet Reports: Ebola and Middle East Respiratory Syndrome as Case Studies.</a> (<a href="http://www.wikidata.org/entity/Q38613990">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIW356</td>
    <td>28830110</td>
  </tr>
  <tr>
    <td>2016-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30151547">Developing a Simulation-Based Training Program for the Prehospital Professionals and Students on the Management of Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q30151547">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1097/SIH.0000000000000198</td>
    <td>27922570</td>
  </tr>
  <tr>
    <td>2016-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37466455">The impact of epidemics on labor market: identifying victims of the Middle East Respiratory Syndrome in the Korean labor market.</a> (<a href="http://www.wikidata.org/entity/Q37466455">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12939-016-0483-9</td>
    <td>27905938</td>
  </tr>
  <tr>
    <td>2016-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41010248">The sample of choice for detecting Middle East respiratory syndrome coronavirus in asymptomatic dromedary camels using real-time reversetranscription polymerase chain reaction.</a> (<a href="http://www.wikidata.org/entity/Q41010248">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.20506/RST.35.3.2578</td>
    <td>28332641</td>
  </tr>
  <tr>
    <td>2016-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42330835">An effective DNA vaccine platform for Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q42330835">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.21037/ATM.2016.11.40</td>
    <td>28149861</td>
  </tr>
  <tr>
    <td>2016-11-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40428932">Protective T Cell Responses Featured by Concordant Recognition of Middle East Respiratory Syndrome Coronavirus-Derived CD8+ T Cell Epitopes and Host MHC.</a> (<a href="http://www.wikidata.org/entity/Q40428932">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4049/JIMMUNOL.1601542</td>
    <td>27903740</td>
  </tr>
  <tr>
    <td>2016-11-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36207135">Clinical determinants of the severity of Middle East respiratory syndrome (MERS): a systematic review and meta-analysis.</a> (<a href="http://www.wikidata.org/entity/Q36207135">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12889-016-3881-4</td>
    <td>27899100</td>
  </tr>
  <tr>
    <td>2016-11-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37525887">The interdependent complexity of disaster and Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q37525887">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4178/EPIH.E2016053</td>
    <td>27899024</td>
  </tr>
  <tr>
    <td>2016-11-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39144823">The recombinant N-terminal domain of spike proteins is a potential vaccine against Middle East respiratory syndrome coronavirus (MERS-CoV) infection.</a> (<a href="http://www.wikidata.org/entity/Q39144823">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VACCINE.2016.11.064</td>
    <td>27899228</td>
  </tr>
  <tr>
    <td>2016-11-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39150633">Passive immunotherapy for Middle East Respiratory Syndrome coronavirus infection with equine immunoglobulin or immunoglobulin fragments in a mouse model.</a> (<a href="http://www.wikidata.org/entity/Q39150633">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2016.11.016</td>
    <td>27890674</td>
  </tr>
  <tr>
    <td>2016-11-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30151591">Middle East Respiratory Syndrome Coronavirus and Children.</a> (<a href="http://www.wikidata.org/entity/Q30151591">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1177/0009922816678820</td>
    <td>27872356</td>
  </tr>
  <tr>
    <td>2016-11-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37642501">Preventive behaviors by the level of perceived infection sensitivity during the Korea outbreak of Middle East Respiratory Syndrome in 2015.</a> (<a href="http://www.wikidata.org/entity/Q37642501">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4178/EPIH.E2016051</td>
    <td>28092927</td>
  </tr>
  <tr>
    <td>2016-11-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39094283">Severe pneumonia due to infection with Candida krusei in a case of suspected Middle East respiratory syndrome: A case report and literature review.</a> (<a href="http://www.wikidata.org/entity/Q39094283">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3892/ETM.2016.3892</td>
    <td>28101187</td>
  </tr>
  <tr>
    <td>2016-11-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30241347">T-cell immunity of SARS-CoV: Implications for vaccine development against MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q30241347">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2016.11.006</td>
    <td>27840203</td>
  </tr>
  <tr>
    <td>2016-11-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37408505">Complete Genome Sequence of Human Coronavirus OC43 Isolated from Mexico.</a> (<a href="http://www.wikidata.org/entity/Q37408505">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1128/GENOMEA.01256-16</td>
    <td>27834708</td>
  </tr>
  <tr>
    <td>2016-11-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39037663">Factors Influencing Emergency Nurses' Burnout During an Outbreak of Middle East Respiratory Syndrome Coronavirus in Korea.</a> (<a href="http://www.wikidata.org/entity/Q39037663">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ANR.2016.10.002</td>
    <td>28057317</td>
  </tr>
  <tr>
    <td>2016-11-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37489898">Characterization of anti-MERS-CoV antibodies against various recombinant structural antigens of MERS-CoV in an imported case in China.</a> (<a href="http://www.wikidata.org/entity/Q37489898">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/EMI.2016.114</td>
    <td>27826140</td>
  </tr>
  <tr>
    <td>2016-11-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37399674">Middle East respiratory syndrome coronavirus disease is rare in children: An update from Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q37399674">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5409/WJCP.V5.I4.391</td>
    <td>27872828</td>
  </tr>
  <tr>
    <td>2016-11-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37525912">Mental health status of people isolated due to Middle East Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q37525912">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4178/EPIH.E2016048</td>
    <td>28196409</td>
  </tr>
  <tr>
    <td>2016-11-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40470113">Inactivation of Middle East respiratory syndrome coronavirus (MERS-CoV) in plasma products using a riboflavin-based and ultraviolet light-based photochemical treatment.</a> (<a href="http://www.wikidata.org/entity/Q40470113">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/TRF.13860</td>
    <td>27805261</td>
  </tr>
  <tr>
    <td>2016-11-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37560824">One-Health: a Safe, Efficient, Dual-Use Vaccine for Humans and Animals against Middle East Respiratory Syndrome Coronavirus and Rabies Virus.</a> (<a href="http://www.wikidata.org/entity/Q37560824">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.02040-16</td>
    <td>27807241</td>
  </tr>
  <tr>
    <td>2016-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37416692">Analysis of intrapatient heterogeneity uncovers the microevolution of Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q37416692">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1101/MCS.A001214</td>
    <td>27900364</td>
  </tr>
  <tr>
    <td>2016-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28112092">Risk Factors for Middle East Respiratory Syndrome Coronavirus Infection among Healthcare Personnel</a> (<a href="http://www.wikidata.org/entity/Q28112092">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2211.160920</td>
    <td>27767011</td>
  </tr>
  <tr>
    <td>2016-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37323397">Clinical Progression and Cytokine Profiles of Middle East Respiratory Syndrome Coronavirus Infection.</a> (<a href="http://www.wikidata.org/entity/Q37323397">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3346/JKMS.2016.31.11.1717</td>
    <td>27709848</td>
  </tr>
  <tr>
    <td>2016-10-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37469524">SARS-CoV 3CL protease cleaves its C-terminal autoprocessing site by novel subsite cooperativity.</a> (<a href="http://www.wikidata.org/entity/Q37469524">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1073/PNAS.1601327113</td>
    <td>27799534</td>
  </tr>
  <tr>
    <td>2016-10-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38992327">Vaccines against Middle East respiratory syndrome coronavirus for humans and camels.</a> (<a href="http://www.wikidata.org/entity/Q38992327">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1002/RMV.1917</td>
    <td>27786402</td>
  </tr>
  <tr>
    <td>2016-10-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38990599">Risk assessment and laboratory investigation of respiratory illness in travellers returning to Singapore 2012-2015: experience from the MERS-CoV Surveillance Programme.</a> (<a href="http://www.wikidata.org/entity/Q38990599">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1017/S0950268816002326</td>
    <td>27780489</td>
  </tr>
  <tr>
    <td>2016-10-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37512816">CD8+ T Cells and Macrophages Regulate Pathogenesis in a Mouse Model of Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q37512816">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01825-16</td>
    <td>27795435</td>
  </tr>
  <tr>
    <td>2016-10-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37360113">Comparison of incubation period distribution of human infections with MERS-CoV in South Korea and Saudi Arabia</a> (<a href="http://www.wikidata.org/entity/Q37360113">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/SREP35839</td>
    <td>27775012</td>
  </tr>
  <tr>
    <td>2016-10-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37362996">The critical care response to a hospital outbreak of Middle East respiratory syndrome coronavirus (MERS-CoV) infection: an observational study</a> (<a href="http://www.wikidata.org/entity/Q37362996">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S13613-016-0203-Z</td>
    <td>27778310</td>
  </tr>
  <tr>
    <td>2016-10-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37358618">Identification of Nafamostat as a Potent Inhibitor of Middle East Respiratory Syndrome Coronavirus S Protein-Mediated Membrane Fusion Using the Split-Protein-Based Cell-Cell Fusion Assay.</a> (<a href="http://www.wikidata.org/entity/Q37358618">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/AAC.01043-16</td>
    <td>27550352</td>
  </tr>
  <tr>
    <td>2016-10-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37512915">Recombinant Receptor-Binding Domains of Multiple Middle East Respiratory Syndrome Coronaviruses (MERS-CoVs) Induce Cross-Neutralizing Antibodies against Divergent Human and Camel MERS-CoVs and Antibody Escape Mutants.</a> (<a href="http://www.wikidata.org/entity/Q37512915">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01651-16</td>
    <td>27795425</td>
  </tr>
  <tr>
    <td>2016-10-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37288095">Viral RNA in Blood as Indicator of Severe Outcome in Middle East Respiratory Syndrome Coronavirus Infection.</a> (<a href="http://www.wikidata.org/entity/Q37288095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2210.160218</td>
    <td>27479636</td>
  </tr>
  <tr>
    <td>2016-10-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40688031">Persistence of Antibodies against Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40688031">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2210.160706</td>
    <td>27332149</td>
  </tr>
  <tr>
    <td>2016-10-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38406135">Middle East respiratory syndrome coronavirus (MERS-CoV) outbreak in South Korea, 2015: epidemiology, characteristics and public health implications.</a> (<a href="http://www.wikidata.org/entity/Q38406135">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JHIN.2016.10.008</td>
    <td>28153558</td>
  </tr>
  <tr>
    <td>2016-10-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40503787">A recombinant receptor-binding domain of MERS-CoV in trimeric form protects human dipeptidyl peptidase 4 (hDPP4) transgenic mice from MERS-CoV infection.</a> (<a href="http://www.wikidata.org/entity/Q40503787">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VIROL.2016.10.005</td>
    <td>27750111</td>
  </tr>
  <tr>
    <td>2016-10-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37512759">Clinical Isolates of Human Coronavirus 229E Bypass the Endosome for Cell Entry.</a> (<a href="http://www.wikidata.org/entity/Q37512759">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1128/JVI.01387-16</td>
    <td>27733646</td>
  </tr>
  <tr>
    <td>2016-10-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51442965">Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q51442965">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1136/BMJ.I5281</td>
    <td>27733408</td>
  </tr>
  <tr>
    <td>2016-10-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37379647">Proteolytic processing of Middle East respiratory syndrome coronavirus spikes expands virus tropism</a> (<a href="http://www.wikidata.org/entity/Q37379647">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1073/PNAS.1608147113</td>
    <td>27791014</td>
  </tr>
  <tr>
    <td>2016-10-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39269092">MERS-CoV at the Animal-Human Interface: Inputs on Exposure Pathways from an Expert-Opinion Elicitation.</a> (<a href="http://www.wikidata.org/entity/Q39269092">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3389/FVETS.2016.00088</td>
    <td>27761437</td>
  </tr>
  <tr>
    <td>2016-10-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40518794">Seroprevalence of Middle East Respiratory Syndrome Coronavirus Among Healthcare Personnel Caring for Patients With Middle East Respiratory Syndrome in South Korea.</a> (<a href="http://www.wikidata.org/entity/Q40518794">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1017/ICE.2016.221</td>
    <td>27697081</td>
  </tr>
  <tr>
    <td>2016-10-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40514210">An outbreak of Middle East Respiratory Syndrome (MERS) due to coronavirus in Al-Ahssa Region, Saudi Arabia, 2015.</a> (<a href="http://www.wikidata.org/entity/Q40514210">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>27714741</td>
  </tr>
  <tr>
    <td>2016-10-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38813876">Middle East respiratory syndrome coronavirus: current knowledge and future considerations.</a> (<a href="http://www.wikidata.org/entity/Q38813876">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>27714748</td>
  </tr>
  <tr>
    <td>2016-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37411166">Successful treatment of suspected organizing pneumonia in a patient with Middle East respiratory syndrome coronavirus infection: a case report.</a> (<a href="http://www.wikidata.org/entity/Q37411166">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.21037/JTD.2016.09.26</td>
    <td>27867585</td>
  </tr>
  <tr>
    <td>2016-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39371415">Estimation of Severe Middle East Respiratory Syndrome Cases in the Middle East, 2012-2016</a> (<a href="http://www.wikidata.org/entity/Q39371415">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2210.151121</td>
    <td>27648640</td>
  </tr>
  <tr>
    <td>2016-09-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51450453">The global spread of Middle East respiratory syndrome: an analysis fusing traditional epidemiological tracing and molecular phylodynamics.</a> (<a href="http://www.wikidata.org/entity/Q51450453">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S41256-016-0014-7</td>
    <td>29202063</td>
  </tr>
  <tr>
    <td>2016-09-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40528960">Fatality risks for nosocomial outbreaks of Middle East respiratory syndrome coronavirus in the Middle East and South Korea.</a> (<a href="http://www.wikidata.org/entity/Q40528960">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S00705-016-3062-X</td>
    <td>27664026</td>
  </tr>
  <tr>
    <td>2016-09-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40491246">Predictors of MERS-CoV infection: A large case control study of patients presenting with ILI at a MERS-CoV referral hospital in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q40491246">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.TMAID.2016.09.008</td>
    <td>27671972</td>
  </tr>
  <tr>
    <td>2016-09-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q31131533">Building predictive models for MERS-CoV infections using data mining techniques.</a> (<a href="http://www.wikidata.org/entity/Q31131533">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2016.09.007</td>
    <td>27641481</td>
  </tr>
  <tr>
    <td>2016-09-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30489823">Risks of Death and Severe Disease in Patients With Middle East Respiratory Syndrome Coronavirus, 2012-2015.</a> (<a href="http://www.wikidata.org/entity/Q30489823">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/AJE/KWW013</td>
    <td>27608662</td>
  </tr>
  <tr>
    <td>2016-09-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37502671">Cross-sectional survey and surveillance for influenza viruses and MERS-CoV among Egyptian pilgrims returning from Hajj during 2012-2015.</a> (<a href="http://www.wikidata.org/entity/Q37502671">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/IRV.12429</td>
    <td>27603034</td>
  </tr>
  <tr>
    <td>2016-09-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40580677">Biochemical Characterization of Middle East Respiratory Syndrome Coronavirus Helicase.</a> (<a href="http://www.wikidata.org/entity/Q40580677">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MSPHERE.00235-16</td>
    <td>27631026</td>
  </tr>
  <tr>
    <td>2016-09-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37232968">High correlation of Middle East respiratory syndrome spread with Google search and Twitter trends in Korea.</a> (<a href="http://www.wikidata.org/entity/Q37232968">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/SREP32920</td>
    <td>27595921</td>
  </tr>
  <tr>
    <td>2016-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30248209">A review of treatment modalities for Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q30248209">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/JAC/DKW338</td>
    <td>27585965</td>
  </tr>
  <tr>
    <td>2016-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30356651">Feasibility of Using Convalescent Plasma Immunotherapy for MERS-CoV Infection, Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q30356651">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2209.151164</td>
    <td>27532807</td>
  </tr>
  <tr>
    <td>2016-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40572703">Contact Tracing for Imported Case of Middle East Respiratory Syndrome, China, 2015.</a> (<a href="http://www.wikidata.org/entity/Q40572703">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2209.152116</td>
    <td>27532887</td>
  </tr>
  <tr>
    <td>2016-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37084139">Analytical and Clinical Validation of Six Commercial Middle East Respiratory Syndrome Coronavirus RNA Detection Kits Based on Real-Time Reverse-Transcription PCR.</a> (<a href="http://www.wikidata.org/entity/Q37084139">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3343/ALM.2016.36.5.450</td>
    <td>27374710</td>
  </tr>
  <tr>
    <td>2016-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37084143">Comparative Evaluation of Three Homogenization Methods for Isolating Middle East Respiratory Syndrome Coronavirus Nucleic Acids From Sputum Samples for Real-Time Reverse Transcription PCR</a> (<a href="http://www.wikidata.org/entity/Q37084143">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3343/ALM.2016.36.5.457</td>
    <td>27374711</td>
  </tr>
  <tr>
    <td>2016-08-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40556554">Middle East respiratory syndrome coronavirus (MERS-CoV) outbreak perceptions of risk and stress evaluation in nurses.</a> (<a href="http://www.wikidata.org/entity/Q40556554">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3855/JIDC.6925</td>
    <td>27580330</td>
  </tr>
  <tr>
    <td>2016-08-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38411181">Middle East Respiratory Syndrome Coronavirus Transmission in Dialysis Unit and Infection Control Interventions in Korea.</a> (<a href="http://www.wikidata.org/entity/Q38411181">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1017/ICE.2016.201</td>
    <td>27573486</td>
  </tr>
  <tr>
    <td>2016-08-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40558082">Middle East Respiratory Syndrome: Emergence of a Pathogenic Human Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40558082">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1146/ANNUREV-MED-051215-031152</td>
    <td>27576010</td>
  </tr>
  <tr>
    <td>2016-08-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37188934">Passive Transfer of A Germline-like Neutralizing Human Monoclonal Antibody Protects Transgenic Mice Against Lethal Middle East Respiratory Syndrome Coronavirus Infection.</a> (<a href="http://www.wikidata.org/entity/Q37188934">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/SREP31629</td>
    <td>27538452</td>
  </tr>
  <tr>
    <td>2016-08-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39467024">Inoculation of Goats, Sheep, and Horses with MERS-CoV Does Not Result in Productive Viral Shedding.</a> (<a href="http://www.wikidata.org/entity/Q39467024">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3390/V8080230</td>
    <td>27548203</td>
  </tr>
  <tr>
    <td>2016-08-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37169795">Middle East Respiratory Syndrome Coronavirus Transmission in Extended Family, Saudi Arabia, 2014.</a> (<a href="http://www.wikidata.org/entity/Q37169795">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2208.152015</td>
    <td>27191038</td>
  </tr>
  <tr>
    <td>2016-08-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40577193">A dynamic compartmental model for the Middle East respiratory syndrome outbreak in the Republic of Korea: A retrospective analysis on control interventions and superspreading events.</a> (<a href="http://www.wikidata.org/entity/Q40577193">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JTBI.2016.08.009</td>
    <td>27521523</td>
  </tr>
  <tr>
    <td>2016-08-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33434536">Predictive factors for pneumonia development and progression to respiratory failure in MERS-CoV infected patients.</a> (<a href="http://www.wikidata.org/entity/Q33434536">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JINF.2016.08.005</td>
    <td>27519621</td>
  </tr>
  <tr>
    <td>2016-08-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39511062">Are Saudi medical students aware of middle east respiratory syndrome coronavirus during an outbreak?</a> (<a href="http://www.wikidata.org/entity/Q39511062">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2016.06.013</td>
    <td>27502524</td>
  </tr>
  <tr>
    <td>2016-08-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40590052">Middle East Respiratory Syndrome Virus Pathogenesis.</a> (<a href="http://www.wikidata.org/entity/Q40590052">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1055/S-0036-1584796</td>
    <td>27486737</td>
  </tr>
  <tr>
    <td>2016-08-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37305545">Increase in Middle East Respiratory Syndrome-Coronavirus Cases in Saudi Arabia Linked to Hospital Outbreak With Continued Circulation of Recombinant Virus, July 1-August 31, 2015.</a> (<a href="http://www.wikidata.org/entity/Q37305545">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/OFID/OFW165</td>
    <td>27704019</td>
  </tr>
  <tr>
    <td>2016-08-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38753926">Carcinoembryonic Antigen-Related Cell Adhesion Molecule 5 Is an Important Surface Attachment Factor That Facilitates Entry of Middle East Respiratory Syndrome Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q38753926">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01133-16</td>
    <td>27489282</td>
  </tr>
  <tr>
    <td>2016-08-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40590095">Spike gene deletion quasispecies in serum of patient with acute MERS-CoV infection.</a> (<a href="http://www.wikidata.org/entity/Q40590095">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1002/JMV.24652</td>
    <td>27486688</td>
  </tr>
  <tr>
    <td>2016-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40561017">Middle East Respiratory Syndrome Coronavirus in Children.</a> (<a href="http://www.wikidata.org/entity/Q40561017">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>27567662</td>
  </tr>
  <tr>
    <td>2016-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27707324">Structural and mutational analysis of the interaction between the Middle-East respiratory syndrome coronavirus (MERS-CoV) papain-like protease and human ubiquitin</a> (<a href="http://www.wikidata.org/entity/Q27707324">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S12250-016-3742-4</td>
    <td>27245450</td>
  </tr>
  <tr>
    <td>2016-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50775542">Human Coronavirus OC43 Associated with Fatal Encephalitis.</a> (<a href="http://www.wikidata.org/entity/Q50775542">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1056/NEJMC1509458</td>
    <td>27518687</td>
  </tr>
  <tr>
    <td>2016-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37169882">Toward Developing a Preventive MERS-CoV Vaccine-Report from a Workshop Organized by the Saudi Arabia Ministry of Health and the International Vaccine Institute, Riyadh, Saudi Arabia, November 14-15, 2015.</a> (<a href="http://www.wikidata.org/entity/Q37169882">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2208.160229</td>
    <td>27439020</td>
  </tr>
  <tr>
    <td>2016-07-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39541934">Surveillance of the Middle East respiratory syndrome (MERS) coronavirus (CoV) infection in healthcare workers after contact with confirmed MERS patients: incidence and risk factors of MERS-CoV seropositivity.</a> (<a href="http://www.wikidata.org/entity/Q39541934">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.CMI.2016.07.017</td>
    <td>27475739</td>
  </tr>
  <tr>
    <td>2016-07-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30276258">Abelson Kinase Inhibitors Are Potent Inhibitors of Severe Acute Respiratory Syndrome Coronavirus and Middle East Respiratory Syndrome Coronavirus Fusion.</a> (<a href="http://www.wikidata.org/entity/Q30276258">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01429-16</td>
    <td>27466418</td>
  </tr>
  <tr>
    <td>2016-07-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30248743">MERS-CoV spike protein: Targets for vaccines and therapeutics.</a> (<a href="http://www.wikidata.org/entity/Q30248743">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2016.07.015</td>
    <td>27468951</td>
  </tr>
  <tr>
    <td>2016-07-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37181886">Unraveling the drivers of MERS-CoV transmission</a> (<a href="http://www.wikidata.org/entity/Q37181886">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1073/PNAS.1519235113</td>
    <td>27457935</td>
  </tr>
  <tr>
    <td>2016-07-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38837695">Rapid one-step construction of a Middle East Respiratory Syndrome (MERS-CoV) infectious clone system by homologous recombination.</a> (<a href="http://www.wikidata.org/entity/Q38837695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JVIROMET.2016.07.022</td>
    <td>27459876</td>
  </tr>
  <tr>
    <td>2016-07-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40610612">Description of a Hospital Outbreak of Middle East Respiratory Syndrome in a Large Tertiary Care Hospital in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q40610612">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1017/ICE.2016.132</td>
    <td>27426423</td>
  </tr>
  <tr>
    <td>2016-07-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46234512">Interpreting Results From Environmental Contamination Studies of Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q46234512">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIW478</td>
    <td>27432840</td>
  </tr>
  <tr>
    <td>2016-07-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51487617">Transmissibility of Middle East Respiratory Syndrome by the Airborne Route.</a> (<a href="http://www.wikidata.org/entity/Q51487617">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIW479</td>
    <td>27432839</td>
  </tr>
  <tr>
    <td>2016-07-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40610948">Middle East respiratory syndrome coronavirus infection is inhibited by griffithsin.</a> (<a href="http://www.wikidata.org/entity/Q40610948">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2016.07.011</td>
    <td>27424494</td>
  </tr>
  <tr>
    <td>2016-07-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40649191">Standard and AEGIS nicking molecular beacons detect amplicons from the Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40649191">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JVIROMET.2016.07.008</td>
    <td>27421627</td>
  </tr>
  <tr>
    <td>2016-07-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36074163">Feasibility of a randomized controlled trial to assess treatment of Middle East Respiratory Syndrome Coronavirus (MERS-CoV) infection in Saudi Arabia: a survey of physicians.</a> (<a href="http://www.wikidata.org/entity/Q36074163">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12871-016-0198-X</td>
    <td>27405596</td>
  </tr>
  <tr>
    <td>2016-07-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39611910">MERS-CoV outbreak following a single patient exposure in an emergency room in South Korea: an epidemiological outbreak study.</a> (<a href="http://www.wikidata.org/entity/Q39611910">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S0140-6736(16)30623-7</td>
    <td>27402381</td>
  </tr>
  <tr>
    <td>2016-07-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40617644">Super-spreading events of MERS-CoV infection.</a> (<a href="http://www.wikidata.org/entity/Q40617644">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S0140-6736(16)30828-5</td>
    <td>27402382</td>
  </tr>
  <tr>
    <td>2016-07-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37203880">Safe and Sensitive Antiviral Screening Platform Based on Recombinant Human Coronavirus OC43 Expressing the Luciferase Reporter Gene.</a> (<a href="http://www.wikidata.org/entity/Q37203880">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1128/AAC.00814-16</td>
    <td>27381385</td>
  </tr>
  <tr>
    <td>2016-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50793231">A roadmap for MERS-CoV research and product development: report from a World Health Organization consultation.</a> (<a href="http://www.wikidata.org/entity/Q50793231">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/NM.4131</td>
    <td>27387881</td>
  </tr>
  <tr>
    <td>2016-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37075717">Tracing Airline Travelers for a Public Health Investigation: Middle East Respiratory Syndrome Coronavirus (MERS-CoV) Infection in the United States, 2014.</a> (<a href="http://www.wikidata.org/entity/Q37075717">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1177/0033354916662213</td>
    <td>27453599</td>
  </tr>
  <tr>
    <td>2016-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26700054">Development of Medical Countermeasures to Middle East Respiratory Syndrome Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q26700054">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2207.160022</td>
    <td>27191188</td>
  </tr>
  <tr>
    <td>2016-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37031480">Response to Emergence of Middle East Respiratory Syndrome Coronavirus, Abu Dhabi, United Arab Emirates, 2013-2014.</a> (<a href="http://www.wikidata.org/entity/Q37031480">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2207.160040</td>
    <td>27314227</td>
  </tr>
  <tr>
    <td>2016-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36864377">Possible Transfusion-Related Acute Lung Injury Following Convalescent Plasma Transfusion in a Patient With Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q36864377">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3343/ALM.2016.36.4.393</td>
    <td>27139619</td>
  </tr>
  <tr>
    <td>2016-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37137718">Association of human leukocyte antigen class II alleles with severe Middle East respiratory syndrome-coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q37137718">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/1817-1737.185756</td>
    <td>27512511</td>
  </tr>
  <tr>
    <td>2016-06-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38840181">Epidemiologic Parameters of the Middle East Respiratory Syndrome Outbreak in Korea, 2015.</a> (<a href="http://www.wikidata.org/entity/Q38840181">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3947/IC.2016.48.2.108</td>
    <td>27433381</td>
  </tr>
  <tr>
    <td>2016-06-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33434003">Clinical Presentation and Outcomes of Middle East Respiratory Syndrome in the Republic of Korea.</a> (<a href="http://www.wikidata.org/entity/Q33434003">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3947/IC.2016.48.2.118</td>
    <td>27433382</td>
  </tr>
  <tr>
    <td>2016-06-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37096203">The Korean Middle East Respiratory Syndrome Coronavirus Outbreak and Our Responsibility to the Global Scientific Community.</a> (<a href="http://www.wikidata.org/entity/Q37096203">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3947/IC.2016.48.2.145</td>
    <td>27433388</td>
  </tr>
  <tr>
    <td>2016-06-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40643974">Understanding and Modeling the Super-spreading Events of the Middle East Respiratory Syndrome Outbreak in Korea.</a> (<a href="http://www.wikidata.org/entity/Q40643974">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3947/IC.2016.48.2.147</td>
    <td>27433389</td>
  </tr>
  <tr>
    <td>2016-06-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28076233">Institutional Preparedness to Prevent Future Middle East Respiratory Syndrome Coronavirus-Like Outbreaks in Republic of Korea</a> (<a href="http://www.wikidata.org/entity/Q28076233">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3947/IC.2016.48.2.75</td>
    <td>27433377</td>
  </tr>
  <tr>
    <td>2016-06-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27302650">Outbreaks of Middle East Respiratory Syndrome in Two Hospitals Initiated by a Single Patient in Daejeon, South Korea.</a> (<a href="http://www.wikidata.org/entity/Q27302650">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3947/IC.2016.48.2.99</td>
    <td>27433380</td>
  </tr>
  <tr>
    <td>2016-06-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40674745">HeLa-ACE2-TMPRSS2 Cells Are Useful for the Isolation of Human Coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q40674745">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.7883/YOKEN.JJID.2016.106</td>
    <td>27357992</td>
  </tr>
  <tr>
    <td>2016-06-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39644632">Epidemiological investigation of Middle East respiratory syndrome coronavirus in dromedary camel farms linked with human infection in Abu Dhabi Emirate, United Arab Emirates.</a> (<a href="http://www.wikidata.org/entity/Q39644632">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S11262-016-1367-1</td>
    <td>27357298</td>
  </tr>
  <tr>
    <td>2016-06-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40631027">Middle East Respiratory Syndrome Coronavirus Infection During Pregnancy: A Report of 5 Cases From Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q40631027">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIW412</td>
    <td>27358348</td>
  </tr>
  <tr>
    <td>2016-06-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40687880">A Highly Sensitive Molecular Detection Platform for Robust and Facile Diagnosis of Middle East Respiratory Syndrome (MERS) Corona Virus.</a> (<a href="http://www.wikidata.org/entity/Q40687880">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1002/ADHM.201600334</td>
    <td>27332622</td>
  </tr>
  <tr>
    <td>2016-06-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30249264">Prevalence of comorbidities in the Middle East respiratory syndrome coronavirus (MERS-CoV): a systematic review and meta-analysis.</a> (<a href="http://www.wikidata.org/entity/Q30249264">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2016.06.015</td>
    <td>27352628</td>
  </tr>
  <tr>
    <td>2016-06-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37624850">Development of Dual TaqMan Based One-Step rRT-PCR Assay Panel for Rapid and Accurate Diagnostic Test of MERS-CoV: A Novel Human Coronavirus, Ahead of Hajj Pilgrimage.</a> (<a href="http://www.wikidata.org/entity/Q37624850">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5812/IRCMJ.23874</td>
    <td>28191331</td>
  </tr>
  <tr>
    <td>2016-06-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40467409">Middle East respiratory syndrome coronavirus on inanimate surfaces: A risk for health care transmission.</a> (<a href="http://www.wikidata.org/entity/Q40467409">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2016.05.006</td>
    <td>27339792</td>
  </tr>
  <tr>
    <td>2016-06-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42762388">MERS-CoV Infection of Alpaca in a Region Where MERS-CoV is Endemic.</a> (<a href="http://www.wikidata.org/entity/Q42762388">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2206.152113</td>
    <td>27070501</td>
  </tr>
  <tr>
    <td>2016-06-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36935333">Experimental Infection and Response to Rechallenge of Alpacas with Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q36935333">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2206.160007</td>
    <td>27070733</td>
  </tr>
  <tr>
    <td>2016-06-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36935271">MERS-CoV Antibodies in Humans, Africa, 2013-2014.</a> (<a href="http://www.wikidata.org/entity/Q36935271">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2206.160064</td>
    <td>27071076</td>
  </tr>
  <tr>
    <td>2016-06-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36935230">Infection, Replication, and Transmission of Middle East Respiratory Syndrome Coronavirus in Alpacas</a> (<a href="http://www.wikidata.org/entity/Q36935230">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2206.160192</td>
    <td>27070385</td>
  </tr>
  <tr>
    <td>2016-06-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39683327">Epidemiology of a Novel Recombinant Middle East Respiratory Syndrome Coronavirus in Humans in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q39683327">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIW236</td>
    <td>27302191</td>
  </tr>
  <tr>
    <td>2016-06-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39677274">Single-dose treatment with a humanized neutralizing antibody affords full protection of a human transgenic mouse model from lethal Middle East respiratory syndrome (MERS)-coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q39677274">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2016.06.003</td>
    <td>27312105</td>
  </tr>
  <tr>
    <td>2016-06-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30389301">A Bibliometric Analysis of PubMed Literature on Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q30389301">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3390/IJERPH13060583</td>
    <td>27304963</td>
  </tr>
  <tr>
    <td>2016-06-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q31108162">Middle East respiratory syndrome coronavirus in Al-Madinah City, Saudi Arabia: Demographic, clinical and survival data.</a> (<a href="http://www.wikidata.org/entity/Q31108162">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JEGH.2016.05.002</td>
    <td>27302882</td>
  </tr>
  <tr>
    <td>2016-06-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37264927">Immunization with inactivated Middle East Respiratory Syndrome coronavirus vaccine leads to lung immunopathology on challenge with live virus.</a> (<a href="http://www.wikidata.org/entity/Q37264927">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1080/21645515.2016.1177688</td>
    <td>27269431</td>
  </tr>
  <tr>
    <td>2016-06-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40641542">Middle East respiratory syndrome-related knowledge, preventive behaviours and risk perception among nursing students during outbreak.</a> (<a href="http://www.wikidata.org/entity/Q40641542">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/JOCN.13295</td>
    <td>27273475</td>
  </tr>
  <tr>
    <td>2016-06-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40641880">Control of an Outbreak of Middle East Respiratory Syndrome in a Tertiary Hospital in Korea.</a> (<a href="http://www.wikidata.org/entity/Q40641880">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.7326/M15-2495</td>
    <td>27272273</td>
  </tr>
  <tr>
    <td>2016-06-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26743813">Middle East Respiratory Syndrome Coronavirus (MERS-CoV) origin and animal reservoir</a> (<a href="http://www.wikidata.org/entity/Q26743813">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12985-016-0544-0</td>
    <td>27255185</td>
  </tr>
  <tr>
    <td>2016-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50792844">Modulation of cell signalling by human coronavirus HKU1 S and M proteins.</a> (<a href="http://www.wikidata.org/entity/Q50792844">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td></td>
    <td>27390006</td>
  </tr>
  <tr>
    <td>2016-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24635959">Taking forward a ‘ONE HEALTH’ approach for turning the tide against The Middle East Respiratory Syndrome Coronavirus and other zoonotic pathogens with epidemic potential</a> (<a href="http://www.wikidata.org/entity/Q24635959">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2016.06.012</td>
    <td>27321961</td>
  </tr>
  <tr>
    <td>2016-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39416141">Risk of global spread of Middle East respiratory syndrome coronavirus (MERS-CoV) via the air transport network.</a> (<a href="http://www.wikidata.org/entity/Q39416141">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/JTM/TAW063</td>
    <td>27601536</td>
  </tr>
  <tr>
    <td>2016-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38874573">Middle East Respiratory Syndrome (MERS).</a> (<a href="http://www.wikidata.org/entity/Q38874573">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MICROBIOLSPEC.EI10-0020-2016</td>
    <td>27337460</td>
  </tr>
  <tr>
    <td>2016-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26738953">Collaborative Intervention of Middle East Respiratory Syndrome: Rapid Response Team</a> (<a href="http://www.wikidata.org/entity/Q26738953">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3947/IC.2016.48.2.71</td>
    <td>27433376</td>
  </tr>
  <tr>
    <td>2016-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28395870">Emergency cesarean section in an epidemic of the middle east respiratory syndrome: a case report</a> (<a href="http://www.wikidata.org/entity/Q28395870">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4097/KJAE.2016.69.3.287</td>
    <td>27274377</td>
  </tr>
  <tr>
    <td>2016-05-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37111017">Avoiding student infection during a Middle East respiratory syndrome (MERS) outbreak: a single medical school experience.</a> (<a href="http://www.wikidata.org/entity/Q37111017">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3946/KJME.2016.30</td>
    <td>27240893</td>
  </tr>
  <tr>
    <td>2016-05-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40663578">Detection of Severe Acute Respiratory Syndrome-Like, Middle East Respiratory Syndrome-Like Bat Coronaviruses and Group H Rotavirus in Faeces of Korean Bats.</a> (<a href="http://www.wikidata.org/entity/Q40663578">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/TBED.12515</td>
    <td>27213718</td>
  </tr>
  <tr>
    <td>2016-05-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38842498">Factors influencing emergency nurses' ethical problems during the outbreak of MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q38842498">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1177/0969733016648205</td>
    <td>27216828</td>
  </tr>
  <tr>
    <td>2016-05-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36929549">Lack of transmission among healthcare workers in contact with a case of Middle East respiratory syndrome coronavirus infection in Thailand.</a> (<a href="http://www.wikidata.org/entity/Q36929549">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S13756-016-0120-9</td>
    <td>27222710</td>
  </tr>
  <tr>
    <td>2016-05-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40663017">Middle East Respiratory Syndrome Interpreted: Human Herpesvirus 6B Pneumonia.</a> (<a href="http://www.wikidata.org/entity/Q40663017">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AMJMED.2016.04.030</td>
    <td>27215907</td>
  </tr>
  <tr>
    <td>2016-05-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40653601">Identification, synthesis and evaluation of SARS-CoV and MERS-CoV 3C-like protease inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q40653601">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.BMC.2016.05.013</td>
    <td>27240464</td>
  </tr>
  <tr>
    <td>2016-05-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40106382">Epidemiological and Clinical Characteristics of Patients with Middle East Respiratory Syndrome Coronavirus in Iran in 2014.</a> (<a href="http://www.wikidata.org/entity/Q40106382">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.7883/YOKEN.JJID.2015.536</td>
    <td>27169943</td>
  </tr>
  <tr>
    <td>2016-05-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39355964">Estimates of the risk of large or long-lasting outbreaks of Middle East respiratory syndrome after importations outside the Arabian Peninsula.</a> (<a href="http://www.wikidata.org/entity/Q39355964">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.EPIDEM.2016.04.002</td>
    <td>27663788</td>
  </tr>
  <tr>
    <td>2016-05-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36879745">Presentation and outcome of Middle East respiratory syndrome in Saudi intensive care unit patients</a> (<a href="http://www.wikidata.org/entity/Q36879745">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S13054-016-1303-8</td>
    <td>27153800</td>
  </tr>
  <tr>
    <td>2016-05-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38825872">Middle East respiratory syndrome coronavirus: current situation and travel-associated concerns.</a> (<a href="http://www.wikidata.org/entity/Q38825872">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S11684-016-0446-Y</td>
    <td>27146399</td>
  </tr>
  <tr>
    <td>2016-05-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36865015">Evolutionary Dynamics of MERS-CoV: Potential Recombination, Positive Selection and Transmission.</a> (<a href="http://www.wikidata.org/entity/Q36865015">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/SREP25049</td>
    <td>27142087</td>
  </tr>
  <tr>
    <td>2016-05-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51799184">Middle East respiratory syndrome coronavirus: review of the current situation in the world.</a> (<a href="http://www.wikidata.org/entity/Q51799184">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S40696-016-0019-2</td>
    <td>28265443</td>
  </tr>
  <tr>
    <td>2016-05-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46551580">Preventing healthcare-associated transmission of the Middle East Respiratory Syndrome (MERS): Our Achilles heel.</a> (<a href="http://www.wikidata.org/entity/Q46551580">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2016.04.006</td>
    <td>27158023</td>
  </tr>
  <tr>
    <td>2016-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40107887">Emerging infectious diseases: Focus on infection control issues for novel coronaviruses (Severe Acute Respiratory Syndrome-CoV and Middle East Respiratory Syndrome-CoV), hemorrhagic fever viruses (Lassa and Ebola), and highly pathogenic avian influe</a> (<a href="http://www.wikidata.org/entity/Q40107887">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2015.11.018</td>
    <td>27131142</td>
  </tr>
  <tr>
    <td>2016-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36923194">Recognition of Lys48-Linked Di-ubiquitin and Deubiquitinating Activities of the SARS Coronavirus Papain-like Protease.</a> (<a href="http://www.wikidata.org/entity/Q36923194">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.MOLCEL.2016.04.016</td>
    <td>27203180</td>
  </tr>
  <tr>
    <td>2016-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40608264">Association between Australian Hajj Pilgrims' awareness of MERS-CoV, and their compliance with preventive measures and exposure to camels.</a> (<a href="http://www.wikidata.org/entity/Q40608264">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/JTM/TAW046</td>
    <td>27432904</td>
  </tr>
  <tr>
    <td>2016-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36884958">Outbreak of Middle East Respiratory Syndrome at Tertiary Care Hospital, Jeddah, Saudi Arabia, 2014</a> (<a href="http://www.wikidata.org/entity/Q36884958">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2205.151797</td>
    <td>27089550</td>
  </tr>
  <tr>
    <td>2016-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26766326">Korean Society for Laboratory Medicine Practice Guidelines for the Molecular Diagnosis of Middle East Respiratory Syndrome During an Outbreak in Korea in 2015</a> (<a href="http://www.wikidata.org/entity/Q26766326">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3343/ALM.2016.36.3.203</td>
    <td>26915607</td>
  </tr>
  <tr>
    <td>2016-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36636694">External Quality Assessment of MERS-CoV Molecular Diagnostics During the 2015 Korean Outbreak.</a> (<a href="http://www.wikidata.org/entity/Q36636694">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3343/ALM.2016.36.3.230</td>
    <td>26915611</td>
  </tr>
  <tr>
    <td>2016-04-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42110230">Clinical spectrum of the Middle East respiratory syndrome coronavirus (MERS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q42110230">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2016.04.008</td>
    <td>27140697</td>
  </tr>
  <tr>
    <td>2016-04-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36851367">Complete Genome Sequence of Middle East Respiratory Syndrome Coronavirus Isolated from a Dromedary Camel in Egypt.</a> (<a href="http://www.wikidata.org/entity/Q36851367">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/GENOMEA.00309-16</td>
    <td>27125484</td>
  </tr>
  <tr>
    <td>2016-04-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33432598">Neurological Complications of Middle East Respiratory Syndrome Coronavirus: A Report of Two Cases and Review of the Literature.</a> (<a href="http://www.wikidata.org/entity/Q33432598">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1155/2016/3502683</td>
    <td>27239356</td>
  </tr>
  <tr>
    <td>2016-04-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40493331">Middle East respiratory syndrome in South Korea during 2015: Risk-related perceptions and quarantine attitudes.</a> (<a href="http://www.wikidata.org/entity/Q40493331">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2016.03.014</td>
    <td>27130900</td>
  </tr>
  <tr>
    <td>2016-04-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42860516">Correction: Middle East Respiratory Syndrome Coronavirus Intra-Host Populations Are Characterized by Numerous High Frequency Variants</a> (<a href="http://www.wikidata.org/entity/Q42860516">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0154424</td>
    <td>27111439</td>
  </tr>
  <tr>
    <td>2016-04-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40698128">Active screening and surveillance in the United Kingdom for Middle East respiratory syndrome coronavirus in returning travellers and pilgrims from the Middle East: a prospective descriptive study for the period 2013-2015.</a> (<a href="http://www.wikidata.org/entity/Q40698128">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2016.04.016</td>
    <td>27117200</td>
  </tr>
  <tr>
    <td>2016-04-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33431629">Treatment outcomes for patients with Middle Eastern Respiratory Syndrome Coronavirus (MERS CoV) infection at a coronavirus referral center in the Kingdom of Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q33431629">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12879-016-1492-4</td>
    <td>27097824</td>
  </tr>
  <tr>
    <td>2016-04-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40707626">Middle East respiratory syndrome coronavirus M protein suppresses type I interferon expression through the inhibition of TBK1-dependent phosphorylation of IRF3.</a> (<a href="http://www.wikidata.org/entity/Q40707626">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/EMI.2016.33</td>
    <td>27094905</td>
  </tr>
  <tr>
    <td>2016-04-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36814211">Development of Monoclonal Antibody and Diagnostic Test for Middle East Respiratory Syndrome Coronavirus Using Cell-Free Synthesized Nucleocapsid Antigen.</a> (<a href="http://www.wikidata.org/entity/Q36814211">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3389/FMICB.2016.00509</td>
    <td>27148198</td>
  </tr>
  <tr>
    <td>2016-04-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38815393">MERS-CoV diagnosis: An update.</a> (<a href="http://www.wikidata.org/entity/Q38815393">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2016.04.005</td>
    <td>27106390</td>
  </tr>
  <tr>
    <td>2016-04-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38776321">Rapid generation of a human monoclonal antibody to combat Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q38776321">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2016.04.003</td>
    <td>27102927</td>
  </tr>
  <tr>
    <td>2016-04-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39841769">Extensive Viable Middle East Respiratory Syndrome (MERS) Coronavirus Contamination in Air and Surrounding Environment in MERS Isolation Wards.</a> (<a href="http://www.wikidata.org/entity/Q39841769">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIW239</td>
    <td>27090992</td>
  </tr>
  <tr>
    <td>2016-04-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40664673">MERS-CoV in a healthcare worker in Jeddah, Saudi Arabia: an index case investigation.</a> (<a href="http://www.wikidata.org/entity/Q40664673">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JHIN.2016.04.002</td>
    <td>27210272</td>
  </tr>
  <tr>
    <td>2016-04-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38812463">Nitazoxanide, a new drug candidate for the treatment of Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q38812463">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2016.04.001</td>
    <td>27095301</td>
  </tr>
  <tr>
    <td>2016-04-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38809401">MERS-CoV vaccine candidates in development: The current landscape.</a> (<a href="http://www.wikidata.org/entity/Q38809401">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VACCINE.2016.03.104</td>
    <td>27083424</td>
  </tr>
  <tr>
    <td>2016-04-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42848359">Corrigendum to "Middle East Respiratory Syndrome Coronavirus Outbreak in the Republic of Korea, 2015" [Volume 6, Issue 4, August 2015, 269-278].</a> (<a href="http://www.wikidata.org/entity/Q42848359">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.PHRP.2016.03.002</td>
    <td>27218017</td>
  </tr>
  <tr>
    <td>2016-04-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37143501">Middle East respiratory syndrome vaccines.</a> (<a href="http://www.wikidata.org/entity/Q37143501">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2016.04.008</td>
    <td>27062985</td>
  </tr>
  <tr>
    <td>2016-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38842691">Genomics and zoonotic infections: Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q38842691">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.20506/RST.35.1.2427</td>
    <td>27217178</td>
  </tr>
  <tr>
    <td>2016-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36726684">Exportations of Symptomatic Cases of MERS-CoV Infection to Countries outside the Middle East.</a> (<a href="http://www.wikidata.org/entity/Q36726684">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2204.150976</td>
    <td>27358972</td>
  </tr>
  <tr>
    <td>2016-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36726714">Transmission of Middle East Respiratory Syndrome Coronavirus Infections in Healthcare Settings, Abu Dhabi</a> (<a href="http://www.wikidata.org/entity/Q36726714">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2204.151615</td>
    <td>26981708</td>
  </tr>
  <tr>
    <td>2016-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36726636">Deletion Variants of Middle East Respiratory Syndrome Coronavirus from Humans, Jordan, 2015.</a> (<a href="http://www.wikidata.org/entity/Q36726636">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2204.152065</td>
    <td>26981770</td>
  </tr>
  <tr>
    <td>2016-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50870005">Combating the spread of Middle East respiratory syndrome coronavirus: Indian perspective.</a> (<a href="http://www.wikidata.org/entity/Q50870005">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/0255-0857.176851</td>
    <td>27080761</td>
  </tr>
  <tr>
    <td>2016-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36861459">PubMed-cited research articles on the Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q36861459">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/1817-1737.180024</td>
    <td>27168858</td>
  </tr>
  <tr>
    <td>2016-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38868439">Patient characteristics infected with Middle East respiratory syndrome coronavirus infection in a tertiary hospital.</a> (<a href="http://www.wikidata.org/entity/Q38868439">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/1817-1737.180027</td>
    <td>27168861</td>
  </tr>
  <tr>
    <td>2016-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37118762">Assessment of the risk posed to Singapore by the 2015 Middle East respiratory syndrome outbreak in the Republic of Korea</a> (<a href="http://www.wikidata.org/entity/Q37118762">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5365/WPSAR.2015.6.4.008</td>
    <td>27508087</td>
  </tr>
  <tr>
    <td>2016-03-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45030988">The search for therapeutic options for Middle East Respiratory Syndrome (MERS).</a> (<a href="http://www.wikidata.org/entity/Q45030988">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2016.03.004</td>
    <td>27050470</td>
  </tr>
  <tr>
    <td>2016-03-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37069816">Mapping the Specific Amino Acid Residues That Make Hamster DPP4 Functional as a Receptor for Middle East Respiratory Syndrome Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q37069816">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.03267-15</td>
    <td>27030263</td>
  </tr>
  <tr>
    <td>2016-03-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37706472">MERS-CoV virus-like particles produced in insect cells induce specific humoural and cellular imminity in rhesus macaques.</a> (<a href="http://www.wikidata.org/entity/Q37706472">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.18632/ONCOTARGET.8475</td>
    <td>27050368</td>
  </tr>
  <tr>
    <td>2016-03-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50875722">Proceedings of the Middle East Respiratory Syndrome (MERS) Coronavirus research initiative workshop, September 9-10 2015 in Riyadh, KSA.</a> (<a href="http://www.wikidata.org/entity/Q50875722">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2016.03.005</td>
    <td>27036308</td>
  </tr>
  <tr>
    <td>2016-03-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36755302">Middle East Respiratory Syndrome Coronavirus NS4b Protein Inhibits Host RNase L Activation.</a> (<a href="http://www.wikidata.org/entity/Q36755302">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.00258-16</td>
    <td>27025250</td>
  </tr>
  <tr>
    <td>2016-03-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51537025">Taming the beast: Hospital management of a nosocomial middle east respiratory syndrome outbreak.</a> (<a href="http://www.wikidata.org/entity/Q51537025">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2016.03.002</td>
    <td>27017406</td>
  </tr>
  <tr>
    <td>2016-03-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51538357">Modeling Emergent Diseases: Lessons From Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q51538357">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1177/0300985816634811</td>
    <td>27000399</td>
  </tr>
  <tr>
    <td>2016-03-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38783084">Middle East Respiratory Syndrome Coronavirus: What Does a Radiologist Need to Know?</a> (<a href="http://www.wikidata.org/entity/Q38783084">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2214/AJR.15.15363</td>
    <td>26998804</td>
  </tr>
  <tr>
    <td>2016-03-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40844510">NMR assignments of the macro domain from Middle East respiratory syndrome coronavirus (MERS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q40844510">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S12104-016-9676-9</td>
    <td>26993639</td>
  </tr>
  <tr>
    <td>2016-03-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42577846">Erratum: Li, M., et al. Middle East Respiratory Syndrome and Medical Students: Letter from China. Int. J. Environ. Res. Public Health 2015, 12, 13289-13294.</a> (<a href="http://www.wikidata.org/entity/Q42577846">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3390/IJERPH13030335</td>
    <td>26999182</td>
  </tr>
  <tr>
    <td>2016-03-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38784382">Non Susceptibility of Neonatal and Adult Rats against the Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q38784382">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.7883/YOKEN.JJID.2015.589</td>
    <td>27000459</td>
  </tr>
  <tr>
    <td>2016-03-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38778044">Vaccines for the prevention against the threat of MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q38778044">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1586/14760584.2016.1167603</td>
    <td>26985862</td>
  </tr>
  <tr>
    <td>2016-03-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26764948">Critically ill patients with Middle East respiratory syndrome coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q26764948">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S13054-016-1234-4</td>
    <td>26984370</td>
  </tr>
  <tr>
    <td>2016-03-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39813282">Factors influencing preventive behavior against Middle East Respiratory Syndrome-Coronavirus among nursing students in South Korea.</a> (<a href="http://www.wikidata.org/entity/Q39813282">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.NEDT.2016.03.006</td>
    <td>27125168</td>
  </tr>
  <tr>
    <td>2016-03-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36735886">A Case Report of a Middle East Respiratory Syndrome Survivor with Kidney Biopsy Results.</a> (<a href="http://www.wikidata.org/entity/Q36735886">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3346/JKMS.2016.31.4.635</td>
    <td>27051251</td>
  </tr>
  <tr>
    <td>2016-03-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39927237">Comparative molecular epidemiology of two closely related coronaviruses, bovine coronavirus (BCoV) and human coronavirus OC43 (HCoV-OC43), reveals a different evolutionary pattern.</a> (<a href="http://www.wikidata.org/entity/Q39927237">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1016/J.MEEGID.2016.03.006</td>
    <td>26969241</td>
  </tr>
  <tr>
    <td>2016-03-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38871506">Conserved antigenic sites between MERS-CoV and Bat-coronavirus are revealed through sequence analysis.</a> (<a href="http://www.wikidata.org/entity/Q38871506">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S13029-016-0049-7</td>
    <td>26962326</td>
  </tr>
  <tr>
    <td>2016-03-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36657519">Structure of Main Protease from Human Coronavirus NL63: Insights for Wide Spectrum Anti-Coronavirus Drug Design.</a> (<a href="http://www.wikidata.org/entity/Q36657519">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1038/SREP22677</td>
    <td>26948040</td>
  </tr>
  <tr>
    <td>2016-03-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36884852">Glycopeptide Antibiotics Potently Inhibit Cathepsin L in the Late Endosome/Lysosome and Block the Entry of Ebola Virus, Middle East Respiratory Syndrome Coronavirus (MERS-CoV), and Severe Acute Respiratory Syndrome Coronavirus (SARS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q36884852">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1074/JBC.M116.716100</td>
    <td>26953343</td>
  </tr>
  <tr>
    <td>2016-03-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36816625">Prophylaxis With a Middle East Respiratory Syndrome Coronavirus (MERS-CoV)-Specific Human Monoclonal Antibody Protects Rabbits From MERS-CoV Infection.</a> (<a href="http://www.wikidata.org/entity/Q36816625">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIW080</td>
    <td>26941283</td>
  </tr>
  <tr>
    <td>2016-03-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35943788">Impact of Middle East Respiratory Syndrome coronavirus (MERS-CoV) on pregnancy and perinatal outcome.</a> (<a href="http://www.wikidata.org/entity/Q35943788">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12879-016-1437-Y</td>
    <td>26936356</td>
  </tr>
  <tr>
    <td>2016-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36736237">Spread of Mutant Middle East Respiratory Syndrome Coronavirus with Reduced Affinity to Human CD26 during the South Korean Outbreak.</a> (<a href="http://www.wikidata.org/entity/Q36736237">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.00019-16</td>
    <td>26933050</td>
  </tr>
  <tr>
    <td>2016-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35940751">Comparative Epidemiology of Human Infections with Middle East Respiratory Syndrome and Severe Acute Respiratory Syndrome Coronaviruses among Healthcare Personnel</a> (<a href="http://www.wikidata.org/entity/Q35940751">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0149988</td>
    <td>26930074</td>
  </tr>
  <tr>
    <td>2016-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30389533">[The cutting-edge of Medicine; Will Middle East respiratory syndrome (MERS) become pandemic?].</a> (<a href="http://www.wikidata.org/entity/Q30389533">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2169/NAIKA.105.547</td>
    <td>27319208</td>
  </tr>
  <tr>
    <td>2016-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36617031">Middle East Respiratory Syndrome Coronavirus during Pregnancy, Abu Dhabi, United Arab Emirates, 2013.</a> (<a href="http://www.wikidata.org/entity/Q36617031">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2203.151049</td>
    <td>26890613</td>
  </tr>
  <tr>
    <td>2016-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42591039">Absence of Middle East Respiratory Syndrome Coronavirus in Camelids, Kazakhstan, 2015.</a> (<a href="http://www.wikidata.org/entity/Q42591039">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2203.151284</td>
    <td>26889787</td>
  </tr>
  <tr>
    <td>2016-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36617013">Association between Severity of MERS-CoV Infection and Incubation Period.</a> (<a href="http://www.wikidata.org/entity/Q36617013">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2203.151437</td>
    <td>26890291</td>
  </tr>
  <tr>
    <td>2016-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30197178">Survey of Clinical Laboratory Practices for 2015 Middle East Respiratory Syndrome Coronavirus Outbreak in the Republic of Korea.</a> (<a href="http://www.wikidata.org/entity/Q30197178">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3343/ALM.2016.36.2.154</td>
    <td>26709263</td>
  </tr>
  <tr>
    <td>2016-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26751032">Guidelines for the Laboratory Diagnosis of Middle East Respiratory Syndrome Coronavirus in Korea</a> (<a href="http://www.wikidata.org/entity/Q26751032">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3947/IC.2016.48.1.61</td>
    <td>27104019</td>
  </tr>
  <tr>
    <td>2016-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40701388">Serological Study of An Imported Case of Middle East Respiratory Syndrome and His Close Contacts in China, 2015.</a> (<a href="http://www.wikidata.org/entity/Q40701388">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3967/BES2016.027</td>
    <td>27109133</td>
  </tr>
  <tr>
    <td>2016-02-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40774751">Infection control and prevention practices implemented to reduce transmission risk of Middle East respiratory syndrome-coronavirus in a tertiary care institution in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q40774751">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2016.01.004</td>
    <td>26922892</td>
  </tr>
  <tr>
    <td>2016-02-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28603737">Molecular epidemiology and evolutionary histories of human coronavirus OC43 and HKU1 among patients with upper respiratory tract infections in Kuala Lumpur, Malaysia</a> (<a href="http://www.wikidata.org/entity/Q28603737">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1186/S12985-016-0488-4</td>
    <td>26916286</td>
  </tr>
  <tr>
    <td>2016-02-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36625323">Identifying determinants of heterogeneous transmission dynamics of the Middle East respiratory syndrome (MERS) outbreak in the Republic of Korea, 2015: a retrospective epidemiological analysis</a> (<a href="http://www.wikidata.org/entity/Q36625323">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1136/BMJOPEN-2015-009936</td>
    <td>26908522</td>
  </tr>
  <tr>
    <td>2016-02-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36602236">Replication and shedding of MERS-CoV in Jamaican fruit bats (Artibeus jamaicensis)</a> (<a href="http://www.wikidata.org/entity/Q36602236">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/SREP21878</td>
    <td>26899616</td>
  </tr>
  <tr>
    <td>2016-02-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40786131">Notes from the Field: Nosocomial Outbreak of Middle East Respiratory Syndrome in a Large Tertiary Care Hospital--Riyadh, Saudi Arabia, 2015.</a> (<a href="http://www.wikidata.org/entity/Q40786131">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.15585/MMWR.MM6506A5</td>
    <td>26890816</td>
  </tr>
  <tr>
    <td>2016-02-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40336588">Differential Expression of the Middle East Respiratory Syndrome Coronavirus Receptor in the Upper Respiratory Tracts of Humans and Dromedary Camels.</a> (<a href="http://www.wikidata.org/entity/Q40336588">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.02994-15</td>
    <td>26889022</td>
  </tr>
  <tr>
    <td>2016-02-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38730484">A Comparative Review of Animal Models of Middle East Respiratory Syndrome Coronavirus Infection.</a> (<a href="http://www.wikidata.org/entity/Q38730484">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1177/0300985815620845</td>
    <td>26869154</td>
  </tr>
  <tr>
    <td>2016-02-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38732808">The epidemiology of Middle East respiratory syndrome coronavirus in the Kingdom of Saudi Arabia, 2012-2015.</a> (<a href="http://www.wikidata.org/entity/Q38732808">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2016.02.004</td>
    <td>26875601</td>
  </tr>
  <tr>
    <td>2016-02-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40119217">Fatal outcome of human coronavirus NL63 infection despite successful viral elimination by IFN-alpha in a patient with newly diagnosed ALL.</a> (<a href="http://www.wikidata.org/entity/Q40119217">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1111/EJH.12744</td>
    <td>26854965</td>
  </tr>
  <tr>
    <td>2016-02-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38723913">Drivers of MERS-CoV transmission: what do we know?</a> (<a href="http://www.wikidata.org/entity/Q38723913">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1586/17476348.2016.1150784</td>
    <td>26848513</td>
  </tr>
  <tr>
    <td>2016-02-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38725989">Middle East respiratory syndrome and severe acute respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q38725989">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.COVIRO.2016.01.011</td>
    <td>26855039</td>
  </tr>
  <tr>
    <td>2016-02-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36710116">Estimating the Severity and Subclinical Burden of Middle East Respiratory Syndrome Coronavirus Infection in the Kingdom of Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q36710116">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/AJE/KWV452</td>
    <td>26851269</td>
  </tr>
  <tr>
    <td>2016-02-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36852790">Healthcare Workers Emotions, Perceived Stressors and Coping Strategies During a MERS-CoV Outbreak.</a> (<a href="http://www.wikidata.org/entity/Q36852790">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3121/CMR.2016.1303</td>
    <td>26847480</td>
  </tr>
  <tr>
    <td>2016-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40794799">Knowledge gaps in therapeutic and non-therapeutic research on the Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q40794799">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S2213-2600(16)00007-2</td>
    <td>26868624</td>
  </tr>
  <tr>
    <td>2016-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27704051">Structural characterization of the N-terminal part of the MERS-CoV nucleocapsid by X-ray diffraction and small-angle X-ray scattering</a> (<a href="http://www.wikidata.org/entity/Q27704051">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1107/S2059798315024328</td>
    <td>26894667</td>
  </tr>
  <tr>
    <td>2016-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40787125">Human polyclonal immunoglobulin G from transchromosomic bovines inhibits MERS-CoV in vivo.</a> (<a href="http://www.wikidata.org/entity/Q40787125">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1126/SCITRANSLMED.AAF1061</td>
    <td>26888429</td>
  </tr>
  <tr>
    <td>2016-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36525303">Microevolution of Outbreak-Associated Middle East Respiratory Syndrome Coronavirus, South Korea, 2015</a> (<a href="http://www.wikidata.org/entity/Q36525303">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2202.151700</td>
    <td>26814649</td>
  </tr>
  <tr>
    <td>2016-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40776786">[Bioinformatics analysis on molecular mechanism of ribavirin and interferon-α in treating MERS-CoV].</a> (<a href="http://www.wikidata.org/entity/Q40776786">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3760/CMA.J.ISSN.0254-6450.2016.02.028</td>
    <td>26917533</td>
  </tr>
  <tr>
    <td>2016-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30386067">Middle East respiratory syndrome: A new global threat.</a> (<a href="http://www.wikidata.org/entity/Q30386067">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/0019-5049.176286</td>
    <td>27013745</td>
  </tr>
  <tr>
    <td>2016-01-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36626864">3B11-N, a monoclonal antibody against MERS-CoV, reduces lung pathology in rhesus monkeys following intratracheal inoculation of MERS-CoV Jordan-n3/2012</a> (<a href="http://www.wikidata.org/entity/Q36626864">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VIROL.2016.01.004</td>
    <td>26828465</td>
  </tr>
  <tr>
    <td>2016-01-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40815326">Efficacy of an Automated Multiple Emitter Whole-Room Ultraviolet-C Disinfection System Against Coronaviruses MHV and MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q40815326">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1017/ICE.2015.348</td>
    <td>26818469</td>
  </tr>
  <tr>
    <td>2016-01-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45906708">Risk factors for severity and mortality in patients with MERS-CoV: Analysis of publicly available data from Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q45906708">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S12250-015-3679-Z</td>
    <td>26826080</td>
  </tr>
  <tr>
    <td>2016-01-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q55101055">Knowledge, attitude and practice of secondary schools and university students toward Middle East Respiratory Syndrome epidemic in Saudi Arabia: A cross-sectional study.</a> (<a href="http://www.wikidata.org/entity/Q55101055">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.SJBS.2016.01.032</td>
    <td>29686521</td>
  </tr>
  <tr>
    <td>2016-01-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40799687">Clinicopathologic, Immunohistochemical, and Ultrastructural Findings of a Fatal Case of Middle East Respiratory Syndrome Coronavirus Infection in the United Arab Emirates, April 2014.</a> (<a href="http://www.wikidata.org/entity/Q40799687">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJPATH.2015.10.024</td>
    <td>26857507</td>
  </tr>
  <tr>
    <td>2016-01-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38704830">Middle East respiratory syndrome coronavirus: a comprehensive review.</a> (<a href="http://www.wikidata.org/entity/Q38704830">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S11684-016-0430-6</td>
    <td>26791756</td>
  </tr>
  <tr>
    <td>2016-01-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37186725">MERS-CoV recombination: implications about the reservoir and potential for adaptation.</a> (<a href="http://www.wikidata.org/entity/Q37186725">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/VE/VEV023</td>
    <td>27774293</td>
  </tr>
  <tr>
    <td>2016-01-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30383672">Middle East Respiratory Syndrome Coronavirus Intra-Host Populations Are Characterized by Numerous High Frequency Variants.</a> (<a href="http://www.wikidata.org/entity/Q30383672">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0146251</td>
    <td>26790002</td>
  </tr>
  <tr>
    <td>2016-01-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43175804">Camel exposure and knowledge about MERS-CoV among Australian Hajj pilgrims in 2014.</a> (<a href="http://www.wikidata.org/entity/Q43175804">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S12250-015-3669-1</td>
    <td>26810660</td>
  </tr>
  <tr>
    <td>2016-01-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36510031">Isolation of Middle East Respiratory Syndrome Coronavirus from a Patient of the 2015 Korean Outbreak.</a> (<a href="http://www.wikidata.org/entity/Q36510031">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3346/JKMS.2016.31.2.315</td>
    <td>26839489</td>
  </tr>
  <tr>
    <td>2016-01-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30196559">Sharing experiences from a reference laboratory in the public health response for Ebola viral disease, MERS-CoV and H7N9 influenza virus investigations.</a> (<a href="http://www.wikidata.org/entity/Q30196559">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.APJTM.2016.01.016</td>
    <td>26919957</td>
  </tr>
  <tr>
    <td>2016-01-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40123706">Clinical Implications of 5 Cases of Middle East Respiratory Syndrome Coronavirus Infection in a South Korean Outbreak.</a> (<a href="http://www.wikidata.org/entity/Q40123706">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.7883/YOKEN.JJID.2015.445</td>
    <td>26743151</td>
  </tr>
  <tr>
    <td>2016-01-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40830622">Deciphering MERS-CoV Evolution in Dromedary Camels.</a> (<a href="http://www.wikidata.org/entity/Q40830622">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.TIM.2015.12.013</td>
    <td>26775034</td>
  </tr>
  <tr>
    <td>2016-01-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36432509">The recent ancestry of Middle East respiratory syndrome coronavirus in Korea has been shaped by recombination</a> (<a href="http://www.wikidata.org/entity/Q36432509">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/SREP18825</td>
    <td>26732651</td>
  </tr>
  <tr>
    <td>2016-01-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40121567">Middle East Respiratory Syndrome-Coronavirus Infection: A Case Report of Serial Computed Tomographic Findings in a Young Male Patient.</a> (<a href="http://www.wikidata.org/entity/Q40121567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3348/KJR.2016.17.1.166</td>
    <td>26798230</td>
  </tr>
  <tr>
    <td>2016-01-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36650254">Macro Domain from Middle East Respiratory Syndrome Coronavirus (MERS-CoV) Is an Efficient ADP-ribose Binding Module: CRYSTAL STRUCTURE AND BIOCHEMICAL STUDIES.</a> (<a href="http://www.wikidata.org/entity/Q36650254">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1074/JBC.M115.700542</td>
    <td>26740631</td>
  </tr>
  <tr>
    <td>2016-01-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43343113">Middle East respiratory syndrome coronavirus infection: a short note on cases with renal failure problem.</a> (<a href="http://www.wikidata.org/entity/Q43343113">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3109/0886022X.2015.1128772</td>
    <td>26726780</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40704062">[Bioinformatics-based Design of Peptide Vaccine Candidates Targeting Spike Protein of MERS-CoV and Immunity analysis in Mice].</a> (<a href="http://www.wikidata.org/entity/Q40704062">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>27295887</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36555622">Treatment strategies for Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q36555622">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>26866060</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q31111053">Using HealthMap to Analyse Middle East Respiratory Syndrome (MERS) Data.</a> (<a href="http://www.wikidata.org/entity/Q31111053">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>27350507</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40704085">[Visual Detection of Human Coronavirus NL63 by Reverse Transcription Loop-Mediated Isothermal Amplification].</a> (<a href="http://www.wikidata.org/entity/Q40704085">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td></td>
    <td>27295884</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40843009">Camels, MERS-CoV, and other emerging infections in east Africa.</a> (<a href="http://www.wikidata.org/entity/Q40843009">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(15)00471-5</td>
    <td>26738820</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39342944">Correlation Between UpToDate Searches and Reported Cases of Middle East Respiratory Syndrome During Outbreaks in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q39342944">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/OFID/OFW043</td>
    <td>27011953</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24672466">Global research trends of Middle East respiratory syndrome coronavirus: a bibliometric analysis</a> (<a href="http://www.wikidata.org/entity/Q24672466">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12879-016-1600-5</td>
    <td>27267256</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26700024">Predicting the international spread of Middle East respiratory syndrome (MERS)</a> (<a href="http://www.wikidata.org/entity/Q26700024">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12879-016-1675-Z</td>
    <td>27449387</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26970798">Infectious diseases epidemic threats and mass gatherings: refocusing global attention on the continuing spread of the Middle East Respiratory syndrome coronavirus (MERS-CoV)</a> (<a href="http://www.wikidata.org/entity/Q26970798">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12916-016-0686-3</td>
    <td>27604081</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43342821">Chest Radiographs of the Acute Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q43342821">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2214/AJR.15.15274</td>
    <td>26700365</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50920524">Reply to "Chest Radiographs of the Acute Middle East Respiratory Syndrome Coronavirus".</a> (<a href="http://www.wikidata.org/entity/Q50920524">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2214/AJR.15.15361</td>
    <td>26700366</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36418155">Variations in Spike Glycoprotein Gene of MERS-CoV, South Korea, 2015</a> (<a href="http://www.wikidata.org/entity/Q36418155">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2201.151055</td>
    <td>26691200</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36418201">Risk Factors for Primary Middle East Respiratory Syndrome Coronavirus Illness in Humans, Saudi Arabia, 2014.</a> (<a href="http://www.wikidata.org/entity/Q36418201">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2201.151340</td>
    <td>26692185</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36418205">Multifacility Outbreak of Middle East Respiratory Syndrome in Taif, Saudi Arabia</a> (<a href="http://www.wikidata.org/entity/Q36418205">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2201.151370</td>
    <td>26692003</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37570518">One-Pot Reverse Transcriptional Loop-Mediated Isothermal Amplification (RT-LAMP) for Detecting MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q37570518">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3389/FMICB.2016.02166</td>
    <td>28119682</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36571365">Ethical Perspectives on the Middle East Respiratory Syndrome Coronavirus Epidemic in Korea</a> (<a href="http://www.wikidata.org/entity/Q36571365">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3961/JPMPH.16.013</td>
    <td>26841881</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40774921">Acute myocarditis associated with novel Middle east respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40774921">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5144/0256-4947.2016.78</td>
    <td>26922692</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40499086">Communicating about the Middle East respiratory syndrome outbreak to the international community and in-country foreigners, Republic of Korea, 2015.</a> (<a href="http://www.wikidata.org/entity/Q40499086">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5365/WPSAR.2015.6.4.002</td>
    <td>27757252</td>
  </tr>
  <tr>
    <td>2016-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37315662">Engaging the international community during the 2015 Middle East respiratory syndrome outbreak in the Republic of Korea.</a> (<a href="http://www.wikidata.org/entity/Q37315662">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5365/WPSAR.2015.6.4.003</td>
    <td>27757250</td>
  </tr>
  <tr>
    <td>2015-12-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36472372">The Same Middle East Respiratory Syndrome-Coronavirus (MERS-CoV) yet Different Outbreak Patterns and Public Health Impacts on the Far East Expert Opinion from the Rapid Response Team of the Republic of Korea.</a> (<a href="http://www.wikidata.org/entity/Q36472372">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3947/IC.2015.47.4.247</td>
    <td>26788408</td>
  </tr>
  <tr>
    <td>2015-12-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40825692">Viral Shedding and Environmental Cleaning in Middle East Respiratory Syndrome Coronavirus Infection.</a> (<a href="http://www.wikidata.org/entity/Q40825692">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3947/IC.2015.47.4.252</td>
    <td>26788409</td>
  </tr>
  <tr>
    <td>2015-12-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36753749">An Acute Immune Response to Middle East Respiratory Syndrome Coronavirus Replication Contributes to Viral Pathogenicity.</a> (<a href="http://www.wikidata.org/entity/Q36753749">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJPATH.2015.10.025</td>
    <td>26724387</td>
  </tr>
  <tr>
    <td>2015-12-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40847893">Value of Autopsy Emphasized in the Case Report of a Single Patient with Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q40847893">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJPATH.2015.11.001</td>
    <td>26724388</td>
  </tr>
  <tr>
    <td>2015-12-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35877765">Multi-Organ Damage in Human Dipeptidyl Peptidase 4 Transgenic Mice Infected with Middle East Respiratory Syndrome-Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q35877765">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0145561</td>
    <td>26701103</td>
  </tr>
  <tr>
    <td>2015-12-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40125600">Acute Management and Long-Term Survival Among Subjects With Severe Middle East Respiratory Syndrome Coronavirus Pneumonia and ARDS.</a> (<a href="http://www.wikidata.org/entity/Q40125600">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4187/RESPCARE.04325</td>
    <td>26701365</td>
  </tr>
  <tr>
    <td>2015-12-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36393296">Middle East respiratory syndrome coronavirus infection: virus-host cell interactions and implications on pathogenesis</a> (<a href="http://www.wikidata.org/entity/Q36393296">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12985-015-0446-6</td>
    <td>26690369</td>
  </tr>
  <tr>
    <td>2015-12-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50917565">MERS CoV: A trigger for healthcare transformation.</a> (<a href="http://www.wikidata.org/entity/Q50917565">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2015.11.001</td>
    <td>26719167</td>
  </tr>
  <tr>
    <td>2015-12-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35873079">MERS-CoV geography and ecology in the Middle East: analyses of reported camel exposures and a preliminary risk map.</a> (<a href="http://www.wikidata.org/entity/Q35873079">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S13104-015-1789-1</td>
    <td>26683322</td>
  </tr>
  <tr>
    <td>2015-12-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40716813">Quantifying spatiotemporal heterogeneity of MERS-CoV transmission in the Middle East region: A combined modelling approach.</a> (<a href="http://www.wikidata.org/entity/Q40716813">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.EPIDEM.2015.12.001</td>
    <td>27266844</td>
  </tr>
  <tr>
    <td>2015-12-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40867001">Environmental Contamination and Viral Shedding in MERS Patients During MERS-CoV Outbreak in South Korea.</a> (<a href="http://www.wikidata.org/entity/Q40867001">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIV1020</td>
    <td>26679623</td>
  </tr>
  <tr>
    <td>2015-12-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40867301">An orthopoxvirus-based vaccine reduces virus excretion after MERS-CoV infection in dromedary camels.</a> (<a href="http://www.wikidata.org/entity/Q40867301">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1126/SCIENCE.AAD1283</td>
    <td>26678878</td>
  </tr>
  <tr>
    <td>2015-12-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40853383">2015 Middle East Respiratory Syndrome Coronavirus (MERS-CoV) nosocomial outbreak in South Korea: insights from modeling.</a> (<a href="http://www.wikidata.org/entity/Q40853383">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.7717/PEERJ.1505</td>
    <td>26713252</td>
  </tr>
  <tr>
    <td>2015-12-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44101130">Why We Should Care About Ebola in West Africa and Middle East Respiratory Syndrome in South Korea: Global Health Ethics and the Moral Insignificance of Proximity.</a> (<a href="http://www.wikidata.org/entity/Q44101130">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S11673-015-9677-X</td>
    <td>26659864</td>
  </tr>
  <tr>
    <td>2015-12-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36681549">Epidemiological investigation of the 119th confirmed Middle East Respiratory Syndrome coronavirus case with an indefinite mode of transmission during the Pyeongtaek outbreak in Korea</a> (<a href="http://www.wikidata.org/entity/Q36681549">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4178/EPIH/E2015054</td>
    <td>26971695</td>
  </tr>
  <tr>
    <td>2015-12-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40172483">External quality assessment for the molecular detection of MERS-CoV in China.</a> (<a href="http://www.wikidata.org/entity/Q40172483">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JCV.2015.12.001</td>
    <td>26702992</td>
  </tr>
  <tr>
    <td>2015-12-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37097873">Persistent Environmental Contamination and Prolonged Viral Shedding in MERS Patients During MERS-CoV Outbreak in South Korea.</a> (<a href="http://www.wikidata.org/entity/Q37097873">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/OFID/OFV130.11</td>
    <td>27437430</td>
  </tr>
  <tr>
    <td>2015-12-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30382230">Epitope-Based Vaccine Target Screening against Highly Pathogenic MERS-CoV: An In Silico Approach Applied to Emerging Infectious Diseases.</a> (<a href="http://www.wikidata.org/entity/Q30382230">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0144475</td>
    <td>26641892</td>
  </tr>
  <tr>
    <td>2015-12-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36343316">Middle East respiratory syndrome coronavirus ORF4b protein inhibits type I interferon production through both cytoplasmic and nuclear targets.</a> (<a href="http://www.wikidata.org/entity/Q36343316">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/SREP17554</td>
    <td>26631542</td>
  </tr>
  <tr>
    <td>2015-12-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43085641">Absence of Middle East respiratory syndrome coronavirus in Bactrian camels in the West Inner Mongolia Autonomous Region of China: surveillance study results from July 2015.</a> (<a href="http://www.wikidata.org/entity/Q43085641">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/EMI.2015.73</td>
    <td>26632875</td>
  </tr>
  <tr>
    <td>2015-12-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36468664">A phylogenetically distinct Middle East respiratory syndrome coronavirus detected in a dromedary calf from a closed dairy herd in Dubai with rising seroprevalence with age.</a> (<a href="http://www.wikidata.org/entity/Q36468664">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/EMI.2015.74</td>
    <td>26632876</td>
  </tr>
  <tr>
    <td>2015-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40678708">[Small molecular agents against MERS-CoV infection].</a> (<a href="http://www.wikidata.org/entity/Q40678708">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>27169271</td>
  </tr>
  <tr>
    <td>2015-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40678716">[Development of peptidic MERS-CoV entry inhibitors].</a> (<a href="http://www.wikidata.org/entity/Q40678716">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>27169270</td>
  </tr>
  <tr>
    <td>2015-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36353893">Asymptomatic MERS-CoV Infection in Humans Possibly Linked to Infected Dromedaries Imported from Oman to United Arab Emirates, May 2015.</a> (<a href="http://www.wikidata.org/entity/Q36353893">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2112.151132</td>
    <td>26584223</td>
  </tr>
  <tr>
    <td>2015-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43140339">Characteristics of Traveler with Middle East Respiratory Syndrome, China, 2015.</a> (<a href="http://www.wikidata.org/entity/Q43140339">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2112.151232</td>
    <td>26583433</td>
  </tr>
  <tr>
    <td>2015-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26770759">Middle East Respiratory Syndrome Infection Control and Prevention Guideline for Healthcare Facilities</a> (<a href="http://www.wikidata.org/entity/Q26770759">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3947/IC.2015.47.4.278</td>
    <td>26788414</td>
  </tr>
  <tr>
    <td>2015-11-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36400547">Renal Complications and Their Prognosis in Korean Patients with Middle East Respiratory Syndrome-Coronavirus from the Central MERS-CoV Designated Hospital.</a> (<a href="http://www.wikidata.org/entity/Q36400547">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3346/JKMS.2015.30.12.1807</td>
    <td>26713056</td>
  </tr>
  <tr>
    <td>2015-11-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30201957">Structural Factors of the Middle East Respiratory Syndrome Coronavirus Outbreak as a Public Health Crisis in Korea and Future Response Strategies.</a> (<a href="http://www.wikidata.org/entity/Q30201957">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3961/JPMPH.15.066</td>
    <td>26639738</td>
  </tr>
  <tr>
    <td>2015-11-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36365558">A New Measure for Assessing the Public Health Response to a Middle East Respiratory Syndrome Coronavirus Outbreak.</a> (<a href="http://www.wikidata.org/entity/Q36365558">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3961/JPMPH.15.069</td>
    <td>26639741</td>
  </tr>
  <tr>
    <td>2015-11-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36942481">Identification of information types and sources by the public for promoting awareness of Middle East respiratory syndrome coronavirus in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q36942481">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/HER/CYV061</td>
    <td>26612051</td>
  </tr>
  <tr>
    <td>2015-11-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36365579">Costly Lessons From the 2015 Middle East Respiratory Syndrome Coronavirus Outbreak in Korea.</a> (<a href="http://www.wikidata.org/entity/Q36365579">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3961/JPMPH.15.064</td>
    <td>26639740</td>
  </tr>
  <tr>
    <td>2015-11-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36720695">Middle East respiratory syndrome coronavirus shows poor replication but significant induction of antiviral responses in human monocyte-derived macrophages and dendritic cells.</a> (<a href="http://www.wikidata.org/entity/Q36720695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1099/JGV.0.000351</td>
    <td>26602089</td>
  </tr>
  <tr>
    <td>2015-11-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36365547">Implementation of Quaternary Prevention in the Korean Healthcare System: Lessons From the 2015 Middle East Respiratory Syndrome Coronavirus Outbreak in the Republic of Korea</a> (<a href="http://www.wikidata.org/entity/Q36365547">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3961/JPMPH.15.059</td>
    <td>26639739</td>
  </tr>
  <tr>
    <td>2015-11-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40123540">Epidemiology of human coronavirus NL63 infection among hospitalized patients with pneumonia in Taiwan.</a> (<a href="http://www.wikidata.org/entity/Q40123540">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1016/J.JMII.2015.10.008</td>
    <td>26746130</td>
  </tr>
  <tr>
    <td>2015-11-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30277992">Feasibility, safety, clinical, and laboratory effects of convalescent plasma therapy for patients with Middle East respiratory syndrome coronavirus infection: a study protocol</a> (<a href="http://www.wikidata.org/entity/Q30277992">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S40064-015-1490-9</td>
    <td>26618098</td>
  </tr>
  <tr>
    <td>2015-11-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36468760">Dipeptidyl Peptidase 4 Distribution in the Human Respiratory Tract: Implications for the Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q36468760">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJPATH.2015.09.014</td>
    <td>26597880</td>
  </tr>
  <tr>
    <td>2015-11-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36488813">Lessons learned from new emerging infectious disease, Middle East Respiratory Syndrome coronavirus outbreak in Korea</a> (<a href="http://www.wikidata.org/entity/Q36488813">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4178/EPIH/E2015051</td>
    <td>26725227</td>
  </tr>
  <tr>
    <td>2015-11-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27321197">Modeling [(18)F]-FDG lymphoid tissue kinetics to characterize nonhuman primate immune response to Middle East respiratory syndrome-coronavirus aerosol challenge.</a> (<a href="http://www.wikidata.org/entity/Q27321197">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S13550-015-0143-X</td>
    <td>26573211</td>
  </tr>
  <tr>
    <td>2015-11-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40901770">Is the Saudi public aware of Middle East respiratory syndrome?</a> (<a href="http://www.wikidata.org/entity/Q40901770">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2015.10.003</td>
    <td>26589657</td>
  </tr>
  <tr>
    <td>2015-11-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50239080">Isolation in real life: lessons from MERS-CoV in Thailand.</a> (<a href="http://www.wikidata.org/entity/Q50239080">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JHIN.2015.11.004</td>
    <td>26792687</td>
  </tr>
  <tr>
    <td>2015-11-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44244115">[The Middle East respiratory syndrome coronavirus].</a> (<a href="http://www.wikidata.org/entity/Q44244115">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.MEDCLI.2015.09.014</td>
    <td>26589736</td>
  </tr>
  <tr>
    <td>2015-11-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36488796">The first case of the 2015 Korean Middle East Respiratory Syndrome outbreak.</a> (<a href="http://www.wikidata.org/entity/Q36488796">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4178/EPIH/E2015049</td>
    <td>26725226</td>
  </tr>
  <tr>
    <td>2015-11-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38634571">Evidence for zoonotic origins of Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q38634571">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1099/JGV.0.000342</td>
    <td>26572912</td>
  </tr>
  <tr>
    <td>2015-11-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40911125">Viral Shedding and Antibody Response in 37 Patients With Middle East Respiratory Syndrome Coronavirus Infection.</a> (<a href="http://www.wikidata.org/entity/Q40911125">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIV951</td>
    <td>26565003</td>
  </tr>
  <tr>
    <td>2015-11-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50940252">Clinical implications of and lessons learnt from external assessment of Mers-CoV diagnostics.</a> (<a href="http://www.wikidata.org/entity/Q50940252">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1586/14737159.2016.1116943</td>
    <td>26559930</td>
  </tr>
  <tr>
    <td>2015-11-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36318974">Human Coronavirus 229E Remains Infectious on Common Touch Surface Materials.</a> (<a href="http://www.wikidata.org/entity/Q36318974">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1128/MBIO.01697-15</td>
    <td>26556276</td>
  </tr>
  <tr>
    <td>2015-11-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33718283">Absence of MERS-CoV antibodies in feral camels in Australia: Implications for the pathogen's origin and spread</a> (<a href="http://www.wikidata.org/entity/Q33718283">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ONEHLT.2015.10.003</td>
    <td>28616468</td>
  </tr>
  <tr>
    <td>2015-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40764728">[Clinical and Biological Character in Mouse Models for Middle East Respiratory Syndrome Generated by Transduction with Different Doses of DPP4 Molecule].</a> (<a href="http://www.wikidata.org/entity/Q40764728">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>26951002</td>
  </tr>
  <tr>
    <td>2015-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40930389">Middle East Respiratory Syndrome: A Concern.</a> (<a href="http://www.wikidata.org/entity/Q40930389">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1164/RCCM.201507-1357LE</td>
    <td>26517421</td>
  </tr>
  <tr>
    <td>2015-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40930382">Reply: Middle East Respiratory Syndrome: A Concern.</a> (<a href="http://www.wikidata.org/entity/Q40930382">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1164/RCCM.201507-1485LE</td>
    <td>26517422</td>
  </tr>
  <tr>
    <td>2015-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51583216">Middle East Respiratory Syndrome in Korea.</a> (<a href="http://www.wikidata.org/entity/Q51583216">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1177/1010539515610036</td>
    <td>26471187</td>
  </tr>
  <tr>
    <td>2015-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36212118">Association of Higher MERS-CoV Virus Load with Severe Disease and Death, Saudi Arabia, 2014.</a> (<a href="http://www.wikidata.org/entity/Q36212118">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2111.150764</td>
    <td>26488195</td>
  </tr>
  <tr>
    <td>2015-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36212147">Molecular Epidemiology of Hospital Outbreak of Middle East Respiratory Syndrome, Riyadh, Saudi Arabia, 2014.</a> (<a href="http://www.wikidata.org/entity/Q36212147">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2111.150944</td>
    <td>26484549</td>
  </tr>
  <tr>
    <td>2015-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36212156">Middle East Respiratory Syndrome in 3 Persons, South Korea, 2015</a> (<a href="http://www.wikidata.org/entity/Q36212156">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2111.151016</td>
    <td>26488745</td>
  </tr>
  <tr>
    <td>2015-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36212164">Mortality Risk Factors for Middle East Respiratory Syndrome Outbreak, South Korea, 2015.</a> (<a href="http://www.wikidata.org/entity/Q36212164">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2111.151231</td>
    <td>26488869</td>
  </tr>
  <tr>
    <td>2015-10-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36227885">Middle East Respiratory Syndrome and Medical Students: Letter from China.</a> (<a href="http://www.wikidata.org/entity/Q36227885">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3390/IJERPH121013289</td>
    <td>26512679</td>
  </tr>
  <tr>
    <td>2015-10-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40940972">Combination therapy with lopinavir/ritonavir, ribavirin and interferon-α for Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q40940972">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3851/IMP3002</td>
    <td>26492219</td>
  </tr>
  <tr>
    <td>2015-10-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47932716">Low public health risk of MERS-CoV in people returning from the Hajj.</a> (<a href="http://www.wikidata.org/entity/Q47932716">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1136/BMJ.H5543</td>
    <td>26489957</td>
  </tr>
  <tr>
    <td>2015-10-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36562859">Middle East Respiratory Syndrome Coronavirus Causes Multiple Organ Damage and Lethal Disease in Mice Transgenic for Human Dipeptidyl Peptidase 4.</a> (<a href="http://www.wikidata.org/entity/Q36562859">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIV499</td>
    <td>26486634</td>
  </tr>
  <tr>
    <td>2015-10-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35810274">Serological Evidence of MERS-CoV Antibodies in Dromedary Camels (Camelus dromedaries) in Laikipia County, Kenya</a> (<a href="http://www.wikidata.org/entity/Q35810274">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0140125</td>
    <td>26473733</td>
  </tr>
  <tr>
    <td>2015-10-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36241778">Middle East Respiratory Syndrome Coronavirus Superspreading Event Involving 81 Persons, Korea 2015.</a> (<a href="http://www.wikidata.org/entity/Q36241778">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3346/JKMS.2015.30.11.1701</td>
    <td>26539018</td>
  </tr>
  <tr>
    <td>2015-10-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41110675">An optimised method for the production of MERS-CoV spike expressing viral pseudotypes.</a> (<a href="http://www.wikidata.org/entity/Q41110675">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.MEX.2015.09.003</td>
    <td>26587388</td>
  </tr>
  <tr>
    <td>2015-10-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36433987">Characterization and Demonstration of the Value of a Lethal Mouse Model of Middle East Respiratory Syndrome Coronavirus Infection and Disease</a> (<a href="http://www.wikidata.org/entity/Q36433987">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.02009-15</td>
    <td>26446606</td>
  </tr>
  <tr>
    <td>2015-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40107806">[The therapeutic effect of high flow nasal cannula oxygen therapy for the first imported case of Middle East respiratory syndrome to China].</a> (<a href="http://www.wikidata.org/entity/Q40107806">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>27132449</td>
  </tr>
  <tr>
    <td>2015-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q53793851">Training on the care of patients with respiratory syndrome of middle east-coronavirus and ebola virus based on clinical simulation.</a> (<a href="http://www.wikidata.org/entity/Q53793851">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>2015-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28086778">Animal models of Middle East respiratory syndrome coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q28086778">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2015.07.005</td>
    <td>26192750</td>
  </tr>
  <tr>
    <td>2015-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54706187">[MERS-CoV, transmission and the role of new host species].</a> (<a href="http://www.wikidata.org/entity/Q54706187">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.RAM.2015.11.001</td>
    <td>26652263</td>
  </tr>
  <tr>
    <td>2015-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40972145">Infectious diseases: Vaccine for Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q40972145">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/NRD4746</td>
    <td>26424355</td>
  </tr>
  <tr>
    <td>2015-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38512849">Effectiveness of the Middle East respiratory syndrome-coronavirus protocol in enhancing the function of an Emergency Department in Qatar.</a> (<a href="http://www.wikidata.org/entity/Q38512849">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1097/MEJ.0000000000000285</td>
    <td>26035278</td>
  </tr>
  <tr>
    <td>2015-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51602138">Outbreaks, Middle East respiratory syndrome and sepsis in emergency care.</a> (<a href="http://www.wikidata.org/entity/Q51602138">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1097/MEJ.0000000000000329</td>
    <td>26295920</td>
  </tr>
  <tr>
    <td>2015-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40922287">Comparison of serological assays in human Middle East respiratory syndrome (MERS)-coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q40922287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES.2015.20.41.30042</td>
    <td>26538277</td>
  </tr>
  <tr>
    <td>2015-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42544109">Lucky China: Efficient Prevention from Middle East Respiratory Syndrome and its Beyond.</a> (<a href="http://www.wikidata.org/entity/Q42544109">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/0366-6999.167292</td>
    <td>26481732</td>
  </tr>
  <tr>
    <td>2015-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43089026">Elements of successful management of an imported Middle East respiratory syndrome case in Guangdong, China.</a> (<a href="http://www.wikidata.org/entity/Q43089026">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5365/WPSAR.2015.6.4.001</td>
    <td>26798560</td>
  </tr>
  <tr>
    <td>2015-09-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47951681">Middle East respiratory syndrome coronavirus (MERS-CoV) in pilgrims returning from the Hajj.</a> (<a href="http://www.wikidata.org/entity/Q47951681">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1136/BMJ.H5185</td>
    <td>26423090</td>
  </tr>
  <tr>
    <td>2015-09-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35792856">Real-time characterization of risks of death associated with the Middle East respiratory syndrome (MERS) in the Republic of Korea, 2015</a> (<a href="http://www.wikidata.org/entity/Q35792856">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12916-015-0468-3</td>
    <td>26420593</td>
  </tr>
  <tr>
    <td>2015-09-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40968126">Conservation of nucleotide sequences for molecular diagnosis of Middle East respiratory syndrome coronavirus, 2015.</a> (<a href="http://www.wikidata.org/entity/Q40968126">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2015.09.018</td>
    <td>26432410</td>
  </tr>
  <tr>
    <td>2015-09-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36363248">Rapid and Effective Virucidal Activity of Povidone-Iodine Products Against Middle East Respiratory Syndrome Coronavirus (MERS-CoV) and Modified Vaccinia Virus Ankara (MVA).</a> (<a href="http://www.wikidata.org/entity/Q36363248">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S40121-015-0091-9</td>
    <td>26416214</td>
  </tr>
  <tr>
    <td>2015-09-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38959242">Middle East respiratory syndrome: current status and future prospects for vaccine development.</a> (<a href="http://www.wikidata.org/entity/Q38959242">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1517/14712598.2015.1092518</td>
    <td>26414077</td>
  </tr>
  <tr>
    <td>2015-09-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36338609">Differences in the seasonality of Middle East respiratory syndrome coronavirus and influenza in the Middle East.</a> (<a href="http://www.wikidata.org/entity/Q36338609">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2015.09.012</td>
    <td>26417877</td>
  </tr>
  <tr>
    <td>2015-09-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40504427">The heptad repeat region is a major selection target in MERS-CoV and related coronaviruses.</a> (<a href="http://www.wikidata.org/entity/Q40504427">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/SREP14480</td>
    <td>26404138</td>
  </tr>
  <tr>
    <td>2015-09-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40981272">Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40981272">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1177/2165079915607497</td>
    <td>26407596</td>
  </tr>
  <tr>
    <td>2015-09-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30379384">A humanized neutralizing antibody against MERS-CoV targeting the receptor-binding domain of the spike protein.</a> (<a href="http://www.wikidata.org/entity/Q30379384">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/CR.2015.113</td>
    <td>26391698</td>
  </tr>
  <tr>
    <td>2015-09-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38953340">Evidence for an Ancestral Association of Human Coronavirus 229E with Bats.</a> (<a href="http://www.wikidata.org/entity/Q38953340">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1128/JVI.01755-15</td>
    <td>26378164</td>
  </tr>
  <tr>
    <td>2015-09-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36192384">Strengthening epidemiologic investigation of infectious diseases in Korea: lessons from the Middle East Respiratory Syndrome outbreak.</a> (<a href="http://www.wikidata.org/entity/Q36192384">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4178/EPIH/E2015040</td>
    <td>26493654</td>
  </tr>
  <tr>
    <td>2015-09-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50961454">Transmission among healthcare worker contacts with a Middle East respiratory syndrome patient in a single Korean centre.</a> (<a href="http://www.wikidata.org/entity/Q50961454">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.CMI.2015.09.007</td>
    <td>26384679</td>
  </tr>
  <tr>
    <td>2015-09-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36063562">Junctional and allele-specific residues are critical for MERS-CoV neutralization by an exceptionally potent germline-like antibody.</a> (<a href="http://www.wikidata.org/entity/Q36063562">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/NCOMMS9223</td>
    <td>26370782</td>
  </tr>
  <tr>
    <td>2015-09-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41002794">Real-time reverse transcriptase polymerase chain reaction assays for Middle East Respiratory Syndrome.</a> (<a href="http://www.wikidata.org/entity/Q41002794">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.MCP.2015.09.001</td>
    <td>26365228</td>
  </tr>
  <tr>
    <td>2015-09-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43177311">Host-directed therapies for improving poor treatment outcomes associated with the middle east respiratory syndrome coronavirus infections.</a> (<a href="http://www.wikidata.org/entity/Q43177311">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2015.09.005</td>
    <td>26365771</td>
  </tr>
  <tr>
    <td>2015-09-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30378994">A Highly Immunogenic and Protective Middle East Respiratory Syndrome Coronavirus Vaccine Based on a Recombinant Measles Virus Vaccine Platform.</a> (<a href="http://www.wikidata.org/entity/Q30378994">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01815-15</td>
    <td>26355094</td>
  </tr>
  <tr>
    <td>2015-09-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36143613">Origin and Possible Genetic Recombination of the Middle East Respiratory Syndrome Coronavirus from the First Imported Case in China: Phylogenetics and Coalescence Analysis.</a> (<a href="http://www.wikidata.org/entity/Q36143613">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.01280-15</td>
    <td>26350969</td>
  </tr>
  <tr>
    <td>2015-09-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36143636">Middle East Respiratory Syndrome Coronavirus Recombination and the Evolution of Science and Public Health in China.</a> (<a href="http://www.wikidata.org/entity/Q36143636">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.01381-15</td>
    <td>26350973</td>
  </tr>
  <tr>
    <td>2015-09-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37211511">Intratracheal exposure of common marmosets to MERS-CoV Jordan-n3/2012 or MERS-CoV EMC/2012 isolates does not result in lethal disease</a> (<a href="http://www.wikidata.org/entity/Q37211511">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VIROL.2015.07.013</td>
    <td>26342468</td>
  </tr>
  <tr>
    <td>2015-09-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36281808">The ns12.9 Accessory Protein of Human Coronavirus OC43 Is a Viroporin Involved in Virion Morphogenesis and Pathogenesis.</a> (<a href="http://www.wikidata.org/entity/Q36281808">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1128/JVI.01986-15</td>
    <td>26339053</td>
  </tr>
  <tr>
    <td>2015-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27701581">Targeting zoonotic viruses: Structure-based inhibition of the 3C-like protease from bat coronavirus HKU4--The likely reservoir host to the human coronavirus that causes Middle East Respiratory Syndrome (MERS)</a> (<a href="http://www.wikidata.org/entity/Q27701581">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.BMC.2015.06.039</td>
    <td>26190463</td>
  </tr>
  <tr>
    <td>2015-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45340973">The Middle East respiratory syndrome puzzle: A familiar virus, a familiar disease, but some assembly still required.</a> (<a href="http://www.wikidata.org/entity/Q45340973">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2015.07.001</td>
    <td>26278813</td>
  </tr>
  <tr>
    <td>2015-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44119320">Middle East respiratory syndrome (MERS) in Asia: lessons gleaned from the South Korean outbreak.</a> (<a href="http://www.wikidata.org/entity/Q44119320">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/TRSTMH/TRV064</td>
    <td>26286944</td>
  </tr>
  <tr>
    <td>2015-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40923435">Knowledge, attitudes and practices concerning Middle East respiratory syndrome among Umrah and Hajj pilgrims in Samsun, Turkey, 2015.</a> (<a href="http://www.wikidata.org/entity/Q40923435">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES.2015.20.38.30023</td>
    <td>26535787</td>
  </tr>
  <tr>
    <td>2015-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35997553">Acute Respiratory Infections in Travelers Returning from MERS-CoV-Affected Areas.</a> (<a href="http://www.wikidata.org/entity/Q35997553">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2109.150472</td>
    <td>26291541</td>
  </tr>
  <tr>
    <td>2015-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35997546">Laboratory Testing for Middle East Respiratory Syndrome Coronavirus, California, USA, 2013-2014.</a> (<a href="http://www.wikidata.org/entity/Q35997546">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2109.150476</td>
    <td>26291839</td>
  </tr>
  <tr>
    <td>2015-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35997496">Follow-up of Contacts of Middle East Respiratory Syndrome Coronavirus-Infected Returning Travelers, the Netherlands, 2014</a> (<a href="http://www.wikidata.org/entity/Q35997496">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2109.150560</td>
    <td>26291986</td>
  </tr>
  <tr>
    <td>2015-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42636632">An Outbreak of Middle East Respiratory Syndrome Coronavirus Infection in South Korea, 2015.</a> (<a href="http://www.wikidata.org/entity/Q42636632">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3349/YMJ.2015.56.5.1174</td>
    <td>26256957</td>
  </tr>
  <tr>
    <td>2015-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26781374">Antiviral Treatment Guidelines for Middle East Respiratory Syndrome</a> (<a href="http://www.wikidata.org/entity/Q26781374">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3947/IC.2015.47.3.212</td>
    <td>26483999</td>
  </tr>
  <tr>
    <td>2015-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26787251">Middle East respiratory syndrome: SARS redux?</a> (<a href="http://www.wikidata.org/entity/Q26787251">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3949/CCJM.82A.15097</td>
    <td>26366955</td>
  </tr>
  <tr>
    <td>2015-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40969073">Critical care medicine for emerging Middle East respiratory syndrome: Which point to be considered?</a> (<a href="http://www.wikidata.org/entity/Q40969073">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/0972-5229.164802</td>
    <td>26430339</td>
  </tr>
  <tr>
    <td>2015-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36277426">Identify-Isolate-Inform: A Modified Tool for Initial Detection and Management of Middle East Respiratory Syndrome Patients in the Emergency Department</a> (<a href="http://www.wikidata.org/entity/Q36277426">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5811/WESTJEM.2015.7.27915</td>
    <td>26587081</td>
  </tr>
  <tr>
    <td>2015-08-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36106399">Outbreak of Middle East Respiratory Syndrome in Korea?</a> (<a href="http://www.wikidata.org/entity/Q36106399">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.PHRP.2015.08.005</td>
    <td>26473088</td>
  </tr>
  <tr>
    <td>2015-08-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26796501">Middle East respiratory syndrome coronavirus: transmission, virology and therapeutic targeting to aid in outbreak control</a> (<a href="http://www.wikidata.org/entity/Q26796501">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/EMM.2015.76</td>
    <td>26315600</td>
  </tr>
  <tr>
    <td>2015-08-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43244867">No evidence for a superior platform to develop therapeutic antibodies rapidly in response to MERS-CoV and other emerging viruses.</a> (<a href="http://www.wikidata.org/entity/Q43244867">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1073/PNAS.1513441112</td>
    <td>26318165</td>
  </tr>
  <tr>
    <td>2015-08-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36033443">Considerations Left behind Middle East Respiratory Syndrome Coronavirus (MERS-CoV) Outbreaks in Republic of Korea.</a> (<a href="http://www.wikidata.org/entity/Q36033443">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.6118/JMM.2015.21.2.63</td>
    <td>26356871</td>
  </tr>
  <tr>
    <td>2015-08-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38576023">Genetic deficiency and polymorphisms of cyclophilin A reveal its essential role for Human Coronavirus 229E replication.</a> (<a href="http://www.wikidata.org/entity/Q38576023">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/J.COVIRO.2015.08.004</td>
    <td>26318518</td>
  </tr>
  <tr>
    <td>2015-08-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36208133">Middle East Respiratory Syndrome Coronavirus nsp1 Inhibits Host Gene Expression by Selectively Targeting mRNAs Transcribed in the Nucleus while Sparing mRNAs of Cytoplasmic Origin</a> (<a href="http://www.wikidata.org/entity/Q36208133">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01352-15</td>
    <td>26311885</td>
  </tr>
  <tr>
    <td>2015-08-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40590310">Crystallization and preliminary X-ray crystallographic analysis of a nonstructural protein 15 mutant from Human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q40590310">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1107/S2053230X15007359</td>
    <td>26323302</td>
  </tr>
  <tr>
    <td>2015-08-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38603253">Middle East respiratory syndrome coronavirus (MERS-CoV): what lessons can we learn?</a> (<a href="http://www.wikidata.org/entity/Q38603253">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JHIN.2015.08.002</td>
    <td>26452615</td>
  </tr>
  <tr>
    <td>2015-08-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36252666">Recombinant Receptor Binding Domain Protein Induces Partial Protective Immunity in Rhesus Macaques Against Middle East Respiratory Syndrome Coronavirus Challenge.</a> (<a href="http://www.wikidata.org/entity/Q36252666">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.EBIOM.2015.08.031</td>
    <td>26629538</td>
  </tr>
  <tr>
    <td>2015-08-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35964208">Structural basis for the neutralization of MERS-CoV by a human monoclonal antibody MERS-27</a> (<a href="http://www.wikidata.org/entity/Q35964208">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/SREP13133</td>
    <td>26281793</td>
  </tr>
  <tr>
    <td>2015-08-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35953970">Complete Genome Sequence of Middle East Respiratory Syndrome Coronavirus KOR/KNIH/002_05_2015, Isolated in South Korea.</a> (<a href="http://www.wikidata.org/entity/Q35953970">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/GENOMEA.00787-15</td>
    <td>26272558</td>
  </tr>
  <tr>
    <td>2015-08-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35953981">Complete Genome Sequence of Middle East Respiratory Syndrome Coronavirus (MERS-CoV) from the First Imported MERS-CoV Case in China</a> (<a href="http://www.wikidata.org/entity/Q35953981">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/GENOMEA.00818-15</td>
    <td>26272560</td>
  </tr>
  <tr>
    <td>2015-08-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41051124">Estimating the risk of Middle East respiratory syndrome (MERS) death during the course of the outbreak in the Republic of Korea, 2015.</a> (<a href="http://www.wikidata.org/entity/Q41051124">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2015.08.005</td>
    <td>26275845</td>
  </tr>
  <tr>
    <td>2015-08-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42671754">Statins May Decrease the Fatality Rate of Middle East Respiratory Syndrome Infection.</a> (<a href="http://www.wikidata.org/entity/Q42671754">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.01120-15</td>
    <td>26265720</td>
  </tr>
  <tr>
    <td>2015-08-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30252107">Dromedary Camels and the Transmission of Middle East Respiratory Syndrome Coronavirus (MERS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q30252107">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/TBED.12401</td>
    <td>26256102</td>
  </tr>
  <tr>
    <td>2015-08-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38766689">Coronavirus Host Range Expansion and Middle East Respiratory Syndrome Coronavirus Emergence: Biochemical Mechanisms and Evolutionary Perspectives.</a> (<a href="http://www.wikidata.org/entity/Q38766689">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1146/ANNUREV-VIROLOGY-100114-055029</td>
    <td>26958908</td>
  </tr>
  <tr>
    <td>2015-08-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35989044">Surveillance operation for the 141st confirmed case of Middle East Respiratory Syndrome coronavirus in response to the patient's prior travel to Jeju Island.</a> (<a href="http://www.wikidata.org/entity/Q35989044">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4178/EPIH/E2015035</td>
    <td>26300437</td>
  </tr>
  <tr>
    <td>2015-08-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50983472">Middle East Respiratory Syndrome Coronavirus Patients in the ICU.</a> (<a href="http://www.wikidata.org/entity/Q50983472">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1177/0885066615598720</td>
    <td>26251335</td>
  </tr>
  <tr>
    <td>2015-08-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43568269">Author's Response to Letter to Editor on "Characteristics and Outcomes of Middle East Respiratory Syndrome Coronavirus Patients Admitted to an Intensive Care Unit in Jeddah, Saudi Arabia".</a> (<a href="http://www.wikidata.org/entity/Q43568269">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1177/0885066615598721</td>
    <td>26251337</td>
  </tr>
  <tr>
    <td>2015-08-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50985317">Controlling Middle East respiratory syndrome: lessons learned from severe acute respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q50985317">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIV648</td>
    <td>26240205</td>
  </tr>
  <tr>
    <td>2015-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51820996">[Middle East Respiratory Syndrome outbreak in Korea: The Heel of Achilles].</a> (<a href="http://www.wikidata.org/entity/Q51820996">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>26714525</td>
  </tr>
  <tr>
    <td>2015-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40852886">[Epidemiological characteristics of Middle East Respiratory Syndrome outbreak in the Republic of Korea, 2015].</a> (<a href="http://www.wikidata.org/entity/Q40852886">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>26714539</td>
  </tr>
  <tr>
    <td>2015-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30202400">Middle East Respiratory Syndrome Coronavirus Outbreak in the Republic of Korea, 2015.</a> (<a href="http://www.wikidata.org/entity/Q30202400">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.PHRP.2015.08.006</td>
    <td>26473095</td>
  </tr>
  <tr>
    <td>2015-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38557226">Managing MERS-CoV in the healthcare setting.</a> (<a href="http://www.wikidata.org/entity/Q38557226">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1080/21548331.2015.1074029</td>
    <td>26224424</td>
  </tr>
  <tr>
    <td>2015-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38535528">Middle East respiratory syndrome coronavirus in healthcare settings.</a> (<a href="http://www.wikidata.org/entity/Q38535528">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1097/QCO.0000000000000178</td>
    <td>26103552</td>
  </tr>
  <tr>
    <td>2015-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30203307">Risks to healthcare workers with emerging diseases: lessons from MERS-CoV, Ebola, SARS, and avian flu.</a> (<a href="http://www.wikidata.org/entity/Q30203307">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1097/QCO.0000000000000183</td>
    <td>26098498</td>
  </tr>
  <tr>
    <td>2015-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36069589">A synthetic consensus anti-spike protein DNA vaccine induces protective immunity against Middle East respiratory syndrome coronavirus in nonhuman primates.</a> (<a href="http://www.wikidata.org/entity/Q36069589">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1126/SCITRANSLMED.AAC7462</td>
    <td>26290414</td>
  </tr>
  <tr>
    <td>2015-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35897083">Occupational Exposure to Dromedaries and Risk for MERS-CoV Infection, Qatar, 2013-2014.</a> (<a href="http://www.wikidata.org/entity/Q35897083">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2108.150481</td>
    <td>26196891</td>
  </tr>
  <tr>
    <td>2015-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35905178">An Appropriate Lower Respiratory Tract Specimen Is Essential for Diagnosis of Middle East Respiratory Syndrome (MERS).</a> (<a href="http://www.wikidata.org/entity/Q35905178">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3346/JKMS.2015.30.8.1207</td>
    <td>26240502</td>
  </tr>
  <tr>
    <td>2015-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40144018">[Clinical analysis of the first patient with imported Middle East respiratory syndrome in China].</a> (<a href="http://www.wikidata.org/entity/Q40144018">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3760/CMA.J.ISSN.2095-4352.2015.08.002</td>
    <td>26255008</td>
  </tr>
  <tr>
    <td>2015-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41048989">Middle-East respiratory syndrome coronavirus: Is it worth a world panic?</a> (<a href="http://www.wikidata.org/entity/Q41048989">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5501/WJV.V4.I3.185</td>
    <td>26279980</td>
  </tr>
  <tr>
    <td>2015-07-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40145395">Design of Potential RNAi (miRNA and siRNA) Molecules for Middle East Respiratory Syndrome Coronavirus (MERS-CoV) Gene Silencing by Computational Method.</a> (<a href="http://www.wikidata.org/entity/Q40145395">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S12539-015-0266-9</td>
    <td>26223545</td>
  </tr>
  <tr>
    <td>2015-07-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35917397">Evaluation of candidate vaccine approaches for MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q35917397">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/NCOMMS8712</td>
    <td>26218507</td>
  </tr>
  <tr>
    <td>2015-07-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40652009">Crystallographic analysis of the N-terminal domain of Middle East respiratory syndrome coronavirus nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q40652009">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1107/S2053230X15010146</td>
    <td>26249685</td>
  </tr>
  <tr>
    <td>2015-07-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40689328">Probable transmission chains of Middle East respiratory syndrome coronavirus and the multiple generations of secondary infection in South Korea.</a> (<a href="http://www.wikidata.org/entity/Q40689328">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2015.07.014</td>
    <td>26216766</td>
  </tr>
  <tr>
    <td>2015-07-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41094209">Middle East Respiratory Syndrome Coronavirus Efficiently Infects Human Primary T Lymphocytes and Activates the Extrinsic and Intrinsic Apoptosis Pathways.</a> (<a href="http://www.wikidata.org/entity/Q41094209">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIV380</td>
    <td>26203058</td>
  </tr>
  <tr>
    <td>2015-07-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42581261">Discovery of T-Cell Infection and Apoptosis by Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q42581261">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIV381</td>
    <td>26203059</td>
  </tr>
  <tr>
    <td>2015-07-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28606494">Sex matters - a preliminary analysis of Middle East respiratory syndrome in the Republic of Korea, 2015</a> (<a href="http://www.wikidata.org/entity/Q28606494">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5365/WPSAR.2015.6.3.002</td>
    <td>26668769</td>
  </tr>
  <tr>
    <td>2015-07-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47919052">Genomic sequencing and analysis of the first imported Middle East Respiratory Syndrome Coronavirus (MERS CoV) in China.</a> (<a href="http://www.wikidata.org/entity/Q47919052">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S11427-015-4903-7</td>
    <td>26199186</td>
  </tr>
  <tr>
    <td>2015-07-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38553361">Bat-to-human: spike features determining 'host jump' of coronaviruses SARS-CoV, MERS-CoV, and beyond.</a> (<a href="http://www.wikidata.org/entity/Q38553361">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.TIM.2015.06.003</td>
    <td>26206723</td>
  </tr>
  <tr>
    <td>2015-07-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41096904">Treatment With Lopinavir/Ritonavir or Interferon-β1b Improves Outcome of MERS-CoV Infection in a Nonhuman Primate Model of Common Marmoset.</a> (<a href="http://www.wikidata.org/entity/Q41096904">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIV392</td>
    <td>26198719</td>
  </tr>
  <tr>
    <td>2015-07-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36012570">Inactivation and safety testing of Middle East Respiratory Syndrome Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q36012570">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JVIROMET.2015.07.002</td>
    <td>26190637</td>
  </tr>
  <tr>
    <td>2015-07-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40695757">Middle East respiratory syndrome coronavirus (MERS-CoV): A cluster analysis with implications for global management of suspected cases.</a> (<a href="http://www.wikidata.org/entity/Q40695757">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.TMAID.2015.06.012</td>
    <td>26211569</td>
  </tr>
  <tr>
    <td>2015-07-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35860307">High proportion of MERS-CoV shedding dromedaries at slaughterhouse with a potential epidemiological link to human cases, Qatar 2014</a> (<a href="http://www.wikidata.org/entity/Q35860307">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3402/IEE.V5.28305</td>
    <td>26183160</td>
  </tr>
  <tr>
    <td>2015-07-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40695196">Assessing the risk of observing multiple generations of Middle East respiratory syndrome (MERS) cases given an imported case.</a> (<a href="http://www.wikidata.org/entity/Q40695196">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>26212063</td>
  </tr>
  <tr>
    <td>2015-07-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35910211">Structural basis and functional analysis of the SARS coronavirus nsp14-nsp10 complex</a> (<a href="http://www.wikidata.org/entity/Q35910211">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1073/PNAS.1508686112</td>
    <td>26159422</td>
  </tr>
  <tr>
    <td>2015-07-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35968746">Infectious Middle East Respiratory Syndrome Coronavirus Excretion and Serotype Variability Based on Live Virus Isolates from Patients in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q35968746">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JCM.01368-15</td>
    <td>26157150</td>
  </tr>
  <tr>
    <td>2015-07-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41126185">Inability of rat DPP4 to allow MERS-CoV infection revealed by using a VSV pseudotype bearing truncated MERS-CoV spike protein.</a> (<a href="http://www.wikidata.org/entity/Q41126185">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S00705-015-2506-Z</td>
    <td>26138557</td>
  </tr>
  <tr>
    <td>2015-07-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51615744">Middle East Respiratory Syndrome--need for increased vigilance and watchful surveillance for MERS-CoV in sub-Saharan Africa.</a> (<a href="http://www.wikidata.org/entity/Q51615744">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2015.06.020</td>
    <td>26141416</td>
  </tr>
  <tr>
    <td>2015-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40911190">[A review on the epidemiology of Middle East Respiratory Syndrome].</a> (<a href="http://www.wikidata.org/entity/Q40911190">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>26564711</td>
  </tr>
  <tr>
    <td>2015-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40915273">[Epidemiology, diagnosis and treatment of Middle East respiratory syndrome].</a> (<a href="http://www.wikidata.org/entity/Q40915273">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>26555424</td>
  </tr>
  <tr>
    <td>2015-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40927040">[Sequencing and Phylogenetic Analyses of Structural and Accessory Proteins of Middle East Respiratory Syndrome Coronavirus from the First Imported Case in China, 2015].</a> (<a href="http://www.wikidata.org/entity/Q40927040">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>26524904</td>
  </tr>
  <tr>
    <td>2015-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41142093">Understanding Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q41142093">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1097/01.JAA.0000466591.41090.5E</td>
    <td>26107798</td>
  </tr>
  <tr>
    <td>2015-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35990857">CDC's Early Response to a Novel Viral Disease, Middle East Respiratory Syndrome Coronavirus (MERS-CoV), September 2012-May 2014.</a> (<a href="http://www.wikidata.org/entity/Q35990857">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1177/003335491513000407</td>
    <td>26345122</td>
  </tr>
  <tr>
    <td>2015-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27013314">Middle East respiratory syndrome: obstacles and prospects for vaccine development</a> (<a href="http://www.wikidata.org/entity/Q27013314">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1586/14760584.2015.1036033</td>
    <td>25864502</td>
  </tr>
  <tr>
    <td>2015-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41158179">Evaluation of Patients under Investigation for MERS-CoV Infection, United States, January 2013-October 2014</a> (<a href="http://www.wikidata.org/entity/Q41158179">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2107.141888</td>
    <td>26079433</td>
  </tr>
  <tr>
    <td>2015-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35780280">Lack of Transmission among Close Contacts of Patient with Case of Middle East Respiratory Syndrome Imported into the United States, 2014.</a> (<a href="http://www.wikidata.org/entity/Q35780280">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2107.150054</td>
    <td>26079176</td>
  </tr>
  <tr>
    <td>2015-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35780285">MERS-CoV in Upper Respiratory Tract and Lungs of Dromedary Camels, Saudi Arabia, 2013-2014</a> (<a href="http://www.wikidata.org/entity/Q35780285">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2107.150070</td>
    <td>26079346</td>
  </tr>
  <tr>
    <td>2015-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42677875">Urgent Call for Research on Middle East Respiratory Syndrome (MERS) in Korea.</a> (<a href="http://www.wikidata.org/entity/Q42677875">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3961/JPMPH.15.047</td>
    <td>26265662</td>
  </tr>
  <tr>
    <td>2015-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41823643">Re-emerging Middle East respiratory syndrome coronavirus: The hibernating bat hypothesis</a> (<a href="http://www.wikidata.org/entity/Q41823643">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/1817-1737.160847</td>
    <td>26229568</td>
  </tr>
  <tr>
    <td>2015-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40870740">Middle East respiratory syndrome in the Republic of Korea: transparency and communication are key.</a> (<a href="http://www.wikidata.org/entity/Q40870740">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5365/WPSAR.2015.6.2.011</td>
    <td>26668758</td>
  </tr>
  <tr>
    <td>2015-06-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41116806">An Unexpected Outbreak of Middle East Respiratory Syndrome Coronavirus Infection in the Republic of Korea, 2015.</a> (<a href="http://www.wikidata.org/entity/Q41116806">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3947/IC.2015.47.2.120</td>
    <td>26157591</td>
  </tr>
  <tr>
    <td>2015-06-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35865538">Pre- and postexposure efficacy of fully human antibodies against Spike protein in a novel humanized mouse model of MERS-CoV infection</a> (<a href="http://www.wikidata.org/entity/Q35865538">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1073/PNAS.1510830112</td>
    <td>26124093</td>
  </tr>
  <tr>
    <td>2015-06-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36362079">Contact tracing the first Middle East respiratory syndrome case in the Philippines, February 2015</a> (<a href="http://www.wikidata.org/entity/Q36362079">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5365/WPSAR.2015.6.2.012</td>
    <td>26668760</td>
  </tr>
  <tr>
    <td>2015-06-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35951658">Preliminary epidemiological assessment of MERS-CoV outbreak in South Korea, May to June 2015</a> (<a href="http://www.wikidata.org/entity/Q35951658">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>26132767</td>
  </tr>
  <tr>
    <td>2015-06-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39149979">The role of superspreading in Middle East respiratory syndrome coronavirus (MERS-CoV) transmission.</a> (<a href="http://www.wikidata.org/entity/Q39149979">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>26132768</td>
  </tr>
  <tr>
    <td>2015-06-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40777987">Epidemiological investigation of MERS-CoV spread in a single hospital in South Korea, May to June 2015.</a> (<a href="http://www.wikidata.org/entity/Q40777987">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES2015.20.25.21169</td>
    <td>26132766</td>
  </tr>
  <tr>
    <td>2015-06-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40808656">Acute Middle East Respiratory Syndrome Coronavirus: Temporal Lung Changes Observed on the Chest Radiographs of 55 Patients.</a> (<a href="http://www.wikidata.org/entity/Q40808656">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2214/AJR.15.14445</td>
    <td>26102309</td>
  </tr>
  <tr>
    <td>2015-06-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41146944">Orchestrated scientific collaboration: critical to the control of MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q41146944">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.7326/M15-1395</td>
    <td>26098095</td>
  </tr>
  <tr>
    <td>2015-06-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35766256">Genetic drift of human coronavirus OC43 spike gene during adaptive evolution.</a> (<a href="http://www.wikidata.org/entity/Q35766256">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1038/SREP11451</td>
    <td>26099036</td>
  </tr>
  <tr>
    <td>2015-06-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41140019">Imported case of MERS-CoV infection identified in China, May 2015: detection and lesson learned.</a> (<a href="http://www.wikidata.org/entity/Q41140019">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES2015.20.24.21158</td>
    <td>26111235</td>
  </tr>
  <tr>
    <td>2015-06-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41154956">Middle East Respiratory Syndrome: A Global Health Challenge.</a> (<a href="http://www.wikidata.org/entity/Q41154956">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1001/JAMA.2015.7646</td>
    <td>26084030</td>
  </tr>
  <tr>
    <td>2015-06-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42613915">Urgent development of effective therapeutic and prophylactic agents to control the emerging threat of Middle East respiratory syndrome (MERS).</a> (<a href="http://www.wikidata.org/entity/Q42613915">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/EMI.2015.37</td>
    <td>26954884</td>
  </tr>
  <tr>
    <td>2015-06-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46035972">Infection prevention and control strategies for the Middle East respiratory syndrome coronavirus and outcome in Oman.</a> (<a href="http://www.wikidata.org/entity/Q46035972">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>2015-06-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46037097">Middle East respiratory syndrome coronavirus (MERS-Cov) screening of exposed healthcare workers in a tertiary care hospital in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q46037097">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/2047-2994-4-S1-O57</td>
    <td></td>
  </tr>
  <tr>
    <td>2015-06-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51009651">China upgrades surveillance and control measures of Middle East respiratory syndrome (MERS).</a> (<a href="http://www.wikidata.org/entity/Q51009651">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5582/BST.2015.01082</td>
    <td>26063202</td>
  </tr>
  <tr>
    <td>2015-06-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43916899">Middle East Respiratory Syndrome - advancing the public health and research agenda on MERS - lessons from the South Korea outbreak.</a> (<a href="http://www.wikidata.org/entity/Q43916899">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2015.06.004</td>
    <td>26072036</td>
  </tr>
  <tr>
    <td>2015-06-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35913859">Two Mutations Were Critical for Bat-to-Human Transmission of Middle East Respiratory Syndrome Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q35913859">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01279-15</td>
    <td>26063432</td>
  </tr>
  <tr>
    <td>2015-06-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35925764">Ligand-induced Dimerization of Middle East Respiratory Syndrome (MERS) Coronavirus nsp5 Protease (3CLpro): IMPLICATIONS FOR nsp5 REGULATION AND THE DEVELOPMENT OF ANTIVIRALS.</a> (<a href="http://www.wikidata.org/entity/Q35925764">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1074/JBC.M115.651463</td>
    <td>26055715</td>
  </tr>
  <tr>
    <td>2015-06-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36306931">Protective Effect of Intranasal Regimens Containing Peptidic Middle East Respiratory Syndrome Coronavirus Fusion Inhibitor Against MERS-CoV Infection</a> (<a href="http://www.wikidata.org/entity/Q36306931">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIV325</td>
    <td>26164863</td>
  </tr>
  <tr>
    <td>2015-06-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51011540">Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q51011540">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S0140-6736(15)60454-8</td>
    <td>26049252</td>
  </tr>
  <tr>
    <td>2015-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38382699">Middle East respiratory syndrome: knowledge to date.</a> (<a href="http://www.wikidata.org/entity/Q38382699">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1097/CCM.0000000000000966</td>
    <td>25785521</td>
  </tr>
  <tr>
    <td>2015-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51019682">Middle East respiratory syndrome: the need for better evidence in severe respiratory viral infections.</a> (<a href="http://www.wikidata.org/entity/Q51019682">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1097/CCM.0000000000001008</td>
    <td>25978166</td>
  </tr>
  <tr>
    <td>2015-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35673405">Acute middle East respiratory syndrome coronavirus infection in livestock Dromedaries, Dubai, 2014.</a> (<a href="http://www.wikidata.org/entity/Q35673405">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2106.150038</td>
    <td>25989145</td>
  </tr>
  <tr>
    <td>2015-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41122965">Lessons to learn from MERS-CoV outbreak in South Korea.</a> (<a href="http://www.wikidata.org/entity/Q41122965">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3855/JIDC.7278</td>
    <td>26142661</td>
  </tr>
  <tr>
    <td>2015-05-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41189291">Prediction and biochemical analysis of putative cleavage sites of the 3C-like protease of Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q41189291">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VIRUSRES.2015.05.018</td>
    <td>26036787</td>
  </tr>
  <tr>
    <td>2015-05-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41090952">First international external quality assessment of molecular diagnostics for Mers-CoV.</a> (<a href="http://www.wikidata.org/entity/Q41090952">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JCV.2015.05.022</td>
    <td>26209385</td>
  </tr>
  <tr>
    <td>2015-05-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41199088">Protective Efficacy of Recombinant Modified Vaccinia Virus Ankara Delivering Middle East Respiratory Syndrome Coronavirus Spike Glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q41199088">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.00614-15</td>
    <td>26018172</td>
  </tr>
  <tr>
    <td>2015-05-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51628462">Presence of Middle East respiratory syndrome coronavirus antibodies in Saudi Arabia: a nationwide, cross-sectional, serological study.</a> (<a href="http://www.wikidata.org/entity/Q51628462">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(15)00029-8</td>
    <td>26008827</td>
  </tr>
  <tr>
    <td>2015-05-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46989221">Response to the letter to the editor: Barasheed et al., 'No evidence of MERS-CoV in Ghanaian Hajj pilgrims: cautious interpretation is needed'.</a> (<a href="http://www.wikidata.org/entity/Q46989221">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/TMI.12526</td>
    <td>25908298</td>
  </tr>
  <tr>
    <td>2015-05-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41217211">Public health response to two incidents of confirmed MERS-CoV cases travelling on flights through London Heathrow Airport in 2014 – lessons learnt.</a> (<a href="http://www.wikidata.org/entity/Q41217211">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES2015.20.18.21114</td>
    <td>25990234</td>
  </tr>
  <tr>
    <td>2015-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50991394">MERS-CoV: Where Are We Now?</a> (<a href="http://www.wikidata.org/entity/Q50991394">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>26198320</td>
  </tr>
  <tr>
    <td>2015-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41226431">Middle East respiratory syndrome coronavirus (MERS-CoV): current situation 3 years after the virus was first identified.</a> (<a href="http://www.wikidata.org/entity/Q41226431">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>25980038</td>
  </tr>
  <tr>
    <td>2015-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40950869">[Detection of Middle East Respiratory Syndrome Coronavirus by Reverse-transcription Loop-Mediated Isothermal Amplification].</a> (<a href="http://www.wikidata.org/entity/Q40950869">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>26470533</td>
  </tr>
  <tr>
    <td>2015-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41013076">Growth and Quantification of MERS-CoV Infection.</a> (<a href="http://www.wikidata.org/entity/Q41013076">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1002/9780471729259.MC15E02S37</td>
    <td>26344219</td>
  </tr>
  <tr>
    <td>2015-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35891289">Assessment of the awareness level of dental students toward Middle East Respiratory Syndrome-coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q35891289">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4103/2231-0762.159951</td>
    <td>26236674</td>
  </tr>
  <tr>
    <td>2015-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38593546">Descriptive epidemiology and characteristics of confirmed cases of Middle East respiratory syndrome coronavirus infection in the Makkah Region of Saudi Arabia, March to June 2014.</a> (<a href="http://www.wikidata.org/entity/Q38593546">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5144/0256-4947.2015.203</td>
    <td>26409794</td>
  </tr>
  <tr>
    <td>2015-04-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35758573">Human Coronavirus HKU1 Spike Protein Uses O-Acetylated Sialic Acid as an Attachment Receptor Determinant and Employs Hemagglutinin-Esterase Protein as a Receptor-Destroying Enzyme</a> (<a href="http://www.wikidata.org/entity/Q35758573">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td>10.1128/JVI.00854-15</td>
    <td>25926653</td>
  </tr>
  <tr>
    <td>2015-04-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35544702">Human coronavirus OC43 3CL protease and the potential of ML188 as a broad-spectrum lead compound: homology modelling and molecular dynamic studies.</a> (<a href="http://www.wikidata.org/entity/Q35544702">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1186/S12900-015-0035-3</td>
    <td>25928480</td>
  </tr>
  <tr>
    <td>2015-04-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35546907">Laboratory investigation and phylogenetic analysis of an imported Middle East respiratory syndrome coronavirus case in Greece</a> (<a href="http://www.wikidata.org/entity/Q35546907">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0125809</td>
    <td>25919137</td>
  </tr>
  <tr>
    <td>2015-04-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35592656">Structures of the Middle East respiratory syndrome coronavirus 3C-like protease reveal insights into substrate specificity.</a> (<a href="http://www.wikidata.org/entity/Q35592656">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1107/S1399004715003521</td>
    <td>25945576</td>
  </tr>
  <tr>
    <td>2015-04-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43169392">An adult returned traveler from Dubai hospitalized with an influenza-like illness (ILI): Middle East Respiratory Syndrome (MERS) or influenza? Infection control implications from a near MERS case.</a> (<a href="http://www.wikidata.org/entity/Q43169392">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1017/ICE.2015.91</td>
    <td>25903456</td>
  </tr>
  <tr>
    <td>2015-04-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36073689">A sensitive and specific antigen detection assay for Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q36073689">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/EMI.2015.26</td>
    <td>26421268</td>
  </tr>
  <tr>
    <td>2015-04-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40159258">IFN-α2a or IFN-β1a in combination with ribavirin to treat Middle East respiratory syndrome coronavirus pneumonia: a retrospective study.</a> (<a href="http://www.wikidata.org/entity/Q40159258">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/JAC/DKV085</td>
    <td>25900158</td>
  </tr>
  <tr>
    <td>2015-04-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41242033">Systemic and mucosal immunity in mice elicited by a single immunization with human adenovirus type 5 or 41 vector-based vaccines carrying the spike protein of Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q41242033">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/IMM.12462</td>
    <td>25762305</td>
  </tr>
  <tr>
    <td>2015-04-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51028750">Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q51028750">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1503/CMAJ.140951</td>
    <td>25897055</td>
  </tr>
  <tr>
    <td>2015-04-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30374913">Middle East respiratory syndrome coronavirus "MERS-CoV": current knowledge gaps.</a> (<a href="http://www.wikidata.org/entity/Q30374913">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.PRRV.2015.04.002</td>
    <td>26002405</td>
  </tr>
  <tr>
    <td>2015-04-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26851979">Receptor-binding domain-based subunit vaccines against MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q26851979">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VIRUSRES.2014.11.013</td>
    <td>25445336</td>
  </tr>
  <tr>
    <td>2015-04-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51031931">MERS-CoV An Emerging Viral Zoonotic Disease: Three Years After and Counting.</a> (<a href="http://www.wikidata.org/entity/Q51031931">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>25876750</td>
  </tr>
  <tr>
    <td>2015-04-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51038242">No evidence of MERS-CoV in Ghanaian Hajj pilgrims: cautious interpretation is needed.</a> (<a href="http://www.wikidata.org/entity/Q51038242">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/TMI.12513</td>
    <td>25823826</td>
  </tr>
  <tr>
    <td>2015-04-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41089531">Characteristics and Outcomes of Middle East Respiratory Syndrome Coronavirus Patients Admitted to an Intensive Care Unit in Jeddah, Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q41089531">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1177/0885066615579858</td>
    <td>25862629</td>
  </tr>
  <tr>
    <td>2015-04-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35347932">Real-time sequence-validated loop-mediated isothermal amplification assays for detection of Middle East respiratory syndrome coronavirus (MERS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q35347932">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0123126</td>
    <td>25856093</td>
  </tr>
  <tr>
    <td>2015-04-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41088356">Presence of Middle East respiratory syndrome coronavirus antibodies in Saudi Arabia: a nationwide, cross-sectional, serological study.</a> (<a href="http://www.wikidata.org/entity/Q41088356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(15)70090-3</td>
    <td>25863564</td>
  </tr>
  <tr>
    <td>2015-04-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41343298">A more detailed picture of the epidemiology of Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q41343298">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(15)70128-3</td>
    <td>25863563</td>
  </tr>
  <tr>
    <td>2015-04-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51034320">Be vigilant: New MERS-CoV outbreaks can occur in the Kingdom of Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q51034320">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.TMAID.2015.03.013</td>
    <td>25858100</td>
  </tr>
  <tr>
    <td>2015-04-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35544383">Incorporation of spike and membrane glycoproteins into coronavirus virions.</a> (<a href="http://www.wikidata.org/entity/Q35544383">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.3390/V7041700</td>
    <td>25855243</td>
  </tr>
  <tr>
    <td>2015-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34468689">Middle East respiratory syndrome coronavirus: another zoonotic betacoronavirus causing SARS-like disease</a> (<a href="http://www.wikidata.org/entity/Q34468689">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/CMR.00102-14</td>
    <td>25810418</td>
  </tr>
  <tr>
    <td>2015-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38398169">Middle East respiratory syndrome coronavirus in children.</a> (<a href="http://www.wikidata.org/entity/Q38398169">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.15537/SMJ.2015.4.10243</td>
    <td>25828287</td>
  </tr>
  <tr>
    <td>2015-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41389826">A lesson learned from Middle East respiratory syndrome (MERS) in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q41389826">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3109/0142159X.2015.1006610</td>
    <td>25803593</td>
  </tr>
  <tr>
    <td>2015-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42673303">Influenza A and B Viruses but Not MERS-CoV in Hajj Pilgrims, Austria, 2014.</a> (<a href="http://www.wikidata.org/entity/Q42673303">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2104.141745</td>
    <td>25811672</td>
  </tr>
  <tr>
    <td>2015-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35229655">Lack of middle East respiratory syndrome coronavirus transmission from infected camels.</a> (<a href="http://www.wikidata.org/entity/Q35229655">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2104.141949</td>
    <td>25811546</td>
  </tr>
  <tr>
    <td>2015-03-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30204390">Middle East Respiratory Syndrome Corona Virus (MERS CoV): The next steps.</a> (<a href="http://www.wikidata.org/entity/Q30204390">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1057/JPHP.2015.9</td>
    <td>25811387</td>
  </tr>
  <tr>
    <td>2015-03-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35641228">Asymptomatic Middle East respiratory syndrome coronavirus infection in rabbits.</a> (<a href="http://www.wikidata.org/entity/Q35641228">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.00661-15</td>
    <td>25810539</td>
  </tr>
  <tr>
    <td>2015-03-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38384184">An update on Middle East respiratory syndrome: 2 years later.</a> (<a href="http://www.wikidata.org/entity/Q38384184">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1586/17476348.2015.1027689</td>
    <td>25790840</td>
  </tr>
  <tr>
    <td>2015-03-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35641110">Passive immunotherapy with dromedary immune serum in an experimental animal model for Middle East respiratory syndrome coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q35641110">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.00446-15</td>
    <td>25787284</td>
  </tr>
  <tr>
    <td>2015-03-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36835873">Inhibitor recognition specificity of MERS-CoV papain-like protease may differ from that of SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q36835873">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1021/CB500917M</td>
    <td>25746232</td>
  </tr>
  <tr>
    <td>2015-03-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38876300">High prevalence of common respiratory viruses and no evidence of Middle East respiratory syndrome coronavirus in Hajj pilgrims returning to Ghana, 2013.</a> (<a href="http://www.wikidata.org/entity/Q38876300">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/TMI.12482</td>
    <td>25688471</td>
  </tr>
  <tr>
    <td>2015-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41822490">Towards the prophylactic and therapeutic use of human neutralizing monoclonal antibodies for Middle East respiratory syndrome coronavirus (MERS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q41822490">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3978/J.ISSN.2305-5839.2015.01.15</td>
    <td>25815296</td>
  </tr>
  <tr>
    <td>2015-02-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42158066">MERS coronavirus envelope protein has a single transmembrane domain that forms pentameric ion channels.</a> (<a href="http://www.wikidata.org/entity/Q42158066">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VIRUSRES.2015.02.023</td>
    <td>25733052</td>
  </tr>
  <tr>
    <td>2015-02-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41463582">MERS CoV infection in two renal transplant recipients: case report.</a> (<a href="http://www.wikidata.org/entity/Q41463582">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/AJT.13085</td>
    <td>25716741</td>
  </tr>
  <tr>
    <td>2015-02-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40168537">Middle East respiratory syndrome coronavirus: update for clinicians.</a> (<a href="http://www.wikidata.org/entity/Q40168537">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIV118</td>
    <td>25701855</td>
  </tr>
  <tr>
    <td>2015-02-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28543567">The nucleocapsid protein of human coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q28543567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0117833</td>
    <td>25700263</td>
  </tr>
  <tr>
    <td>2015-02-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35117359">Pilgrims and MERS-CoV: what's the risk?</a> (<a href="http://www.wikidata.org/entity/Q35117359">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/S12982-015-0025-8</td>
    <td>25717340</td>
  </tr>
  <tr>
    <td>2015-02-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41477234">Prevalence of Middle East respiratory syndrome coronavirus (MERS-CoV) in dromedary camels in Abu Dhabi Emirate, United Arab Emirates.</a> (<a href="http://www.wikidata.org/entity/Q41477234">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S11262-015-1174-0</td>
    <td>25653016</td>
  </tr>
  <tr>
    <td>2015-02-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41012168">Glycosylation of mouse DPP4 plays a role in inhibiting Middle East respiratory syndrome coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q41012168">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.03445-14</td>
    <td>25653445</td>
  </tr>
  <tr>
    <td>2015-02-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38345759">Middle East respiratory syndrome: An emerging coronavirus infection tracked by the crowd.</a> (<a href="http://www.wikidata.org/entity/Q38345759">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VIRUSRES.2015.01.021</td>
    <td>25656066</td>
  </tr>
  <tr>
    <td>2015-02-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30371303">Identification of an ideal adjuvant for receptor-binding domain-based subunit vaccines against Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q30371303">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/CMI.2015.03</td>
    <td>25640653</td>
  </tr>
  <tr>
    <td>2015-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41351922">2014 MERS-CoV outbreak in Jeddah--a link to health care facilities.</a> (<a href="http://www.wikidata.org/entity/Q41351922">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1056/NEJMOA1408636</td>
    <td>25714162</td>
  </tr>
  <tr>
    <td>2015-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35037452">Cluster of Middle East respiratory syndrome coronavirus infections in Iran, 2014.</a> (<a href="http://www.wikidata.org/entity/Q35037452">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2102.141405</td>
    <td>25626079</td>
  </tr>
  <tr>
    <td>2015-01-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35193329">Development and validation of a rapid immunochromatographic assay for detection of Middle East respiratory syndrome coronavirus antigen in dromedary camels.</a> (<a href="http://www.wikidata.org/entity/Q35193329">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JCM.03096-14</td>
    <td>25631809</td>
  </tr>
  <tr>
    <td>2015-01-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41525194">CT correlation with outcomes in 15 patients with acute Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q41525194">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2214/AJR.14.13671</td>
    <td>25615627</td>
  </tr>
  <tr>
    <td>2015-01-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39794655">High secretion of interferons by human plasmacytoid dendritic cells upon recognition of Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q39794655">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.03607-14</td>
    <td>25609809</td>
  </tr>
  <tr>
    <td>2015-01-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35905508">Severe neurologic syndrome associated with Middle East respiratory syndrome corona virus (MERS-CoV)</a> (<a href="http://www.wikidata.org/entity/Q35905508">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S15010-015-0720-Y</td>
    <td>25600929</td>
  </tr>
  <tr>
    <td>2015-01-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35487986">Generation of a transgenic mouse model of Middle East respiratory syndrome coronavirus infection and disease.</a> (<a href="http://www.wikidata.org/entity/Q35487986">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.03427-14</td>
    <td>25589660</td>
  </tr>
  <tr>
    <td>2015-01-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39634317">Middle East respiratory syndrome in the shadow of Ebola.</a> (<a href="http://www.wikidata.org/entity/Q39634317">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S2213-2600(14)70316-9</td>
    <td>25592990</td>
  </tr>
  <tr>
    <td>2015-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41436156">[Etiological, epidemiological and clinical aspects of coronavirus infection MERS-CoV].</a> (<a href="http://www.wikidata.org/entity/Q41436156">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>25763589</td>
  </tr>
  <tr>
    <td>2015-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41515143">Update on the epidemiology of Middle East respiratory syndrome coronavirus (MERS-CoV) infection, and guidance for the public, clinicians, and public health authorities - January 2015.</a> (<a href="http://www.wikidata.org/entity/Q41515143">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>25632953</td>
  </tr>
  <tr>
    <td>2015-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40910573">Infection with Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q40910573">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>26566382</td>
  </tr>
  <tr>
    <td>2015-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36828115">Health Care Associated Middle East Respiratory Syndrome (MERS): A Case from Iran</a> (<a href="http://www.wikidata.org/entity/Q36828115">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>27114729</td>
  </tr>
  <tr>
    <td>2015-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38258027">Pathogenesis of Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q38258027">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1002/PATH.4458</td>
    <td>25294366</td>
  </tr>
  <tr>
    <td>2015-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28073640">Middle East respiratory syndrome coronavirus (MERS-CoV): animal to human interaction</a> (<a href="http://www.wikidata.org/entity/Q28073640">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1080/20477724.2015.1122852</td>
    <td>26924345</td>
  </tr>
  <tr>
    <td>2015-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35539322">International Health Regulations (2005) facilitate communication for in-flight contacts of a Middle East respiratory syndrome case, Hong Kong Special Administrative Region, 2014.</a> (<a href="http://www.wikidata.org/entity/Q35539322">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2471/WPSAR.2015.6.1.002</td>
    <td>25960925</td>
  </tr>
  <tr>
    <td>2015-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40923127">Presence of antibodies but no evidence for circulation of MERS-CoV in dromedaries on the Canary Islands, 2015.</a> (<a href="http://www.wikidata.org/entity/Q40923127">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES.2015.20.37.30019</td>
    <td>26536463</td>
  </tr>
  <tr>
    <td>2015-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40868265">Middle East respiratory syndrome coronavirus (MERS-CoV) in dromedary camels in Nigeria, 2015.</a> (<a href="http://www.wikidata.org/entity/Q40868265">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES.2015.20.49.30086</td>
    <td>26676406</td>
  </tr>
  <tr>
    <td>2015-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43092882">Serologic assessment of possibility for MERS-CoV infection in equids.</a> (<a href="http://www.wikidata.org/entity/Q43092882">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2101.141342</td>
    <td>25531820</td>
  </tr>
  <tr>
    <td>2015-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38907331">Picornavirus-like cytopathic effects on RD-18S cell lines were induced by human coronavirus 229E not picornaviruses.</a> (<a href="http://www.wikidata.org/entity/Q38907331">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.7883/YOKEN.JJID.2014.487</td>
    <td>25702793</td>
  </tr>
  <tr>
    <td>2015-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41213222">Middle East respiratory syndrome coronavirus infection not found in camels in Japan.</a> (<a href="http://www.wikidata.org/entity/Q41213222">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.7883/YOKEN.JJID.2015.094</td>
    <td>25993975</td>
  </tr>
  <tr>
    <td>2015-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40509284">An Outbreak of Human Coronavirus OC43 during the 2014-2015 Influenza Season in Yamagata, Japan.</a> (<a href="http://www.wikidata.org/entity/Q40509284">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.7883/YOKEN.JJID.2015.292</td>
    <td>26399927</td>
  </tr>
  <tr>
    <td>2014-12-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38302221">Human-Dromedary Camel Interactions and the Risk of Acquiring Zoonotic Middle East Respiratory Syndrome Coronavirus Infection.</a> (<a href="http://www.wikidata.org/entity/Q38302221">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/ZPH.12171</td>
    <td>25545147</td>
  </tr>
  <tr>
    <td>2014-12-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34455805">Thiopurine analogs and mycophenolic acid synergistically inhibit the papain-like protease of Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q34455805">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2014.12.011</td>
    <td>25542975</td>
  </tr>
  <tr>
    <td>2014-12-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34813357">A Computational Approach for Predicting Role of Human MicroRNAs in MERS-CoV Genome.</a> (<a href="http://www.wikidata.org/entity/Q34813357">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1155/2014/967946</td>
    <td>25610462</td>
  </tr>
  <tr>
    <td>2014-12-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35532814">Cytokine systems approach demonstrates differences in innate and pro-inflammatory host responses between genetically distinct MERS-CoV isolates.</a> (<a href="http://www.wikidata.org/entity/Q35532814">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/1471-2164-15-1161</td>
    <td>25534508</td>
  </tr>
  <tr>
    <td>2014-12-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27697642">Fused-ring structure of decahydroisoquinolin as a novel scaffold for SARS 3CL protease inhibitors</a> (<a href="http://www.wikidata.org/entity/Q27697642">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.BMC.2014.12.028</td>
    <td>25614110</td>
  </tr>
  <tr>
    <td>2014-12-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41588001">Genotype shift in human coronavirus OC43 and emergence of a novel genotype by natural recombination.</a> (<a href="http://www.wikidata.org/entity/Q41588001">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1016/J.JINF.2014.12.005</td>
    <td>25530469</td>
  </tr>
  <tr>
    <td>2014-12-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51075039">A case of long-term excretion and subclinical infection with Middle East respiratory syndrome coronavirus in a healthcare worker.</a> (<a href="http://www.wikidata.org/entity/Q51075039">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIU1135</td>
    <td>25516193</td>
  </tr>
  <tr>
    <td>2014-12-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34992192">Knowledge and attitude of healthcare workers about Middle East Respiratory Syndrome in multispecialty hospitals of Qassim, Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q34992192">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/1471-2458-14-1281</td>
    <td>25510239</td>
  </tr>
  <tr>
    <td>2014-12-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41457488">Reliable typing of MERS-CoV variants with a small genome fragment.</a> (<a href="http://www.wikidata.org/entity/Q41457488">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JCV.2014.12.006</td>
    <td>25728084</td>
  </tr>
  <tr>
    <td>2014-12-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34452682">Antiviral potential of ERK/MAPK and PI3K/AKT/mTOR signaling modulation for Middle East respiratory syndrome coronavirus infection as identified by temporal kinome analysis</a> (<a href="http://www.wikidata.org/entity/Q34452682">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/AAC.03659-14</td>
    <td>25487801</td>
  </tr>
  <tr>
    <td>2014-12-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35158287">Sparse evidence of MERS-CoV infection among animal workers living in Southern Saudi Arabia during 2012.</a> (<a href="http://www.wikidata.org/entity/Q35158287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/IRV.12287</td>
    <td>25470665</td>
  </tr>
  <tr>
    <td>2014-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50356948">766Clinical Features and Outcome of Patients with Middle East Respiratory Syndrome-Coronavirus (MERS-CoV) Infection.</a> (<a href="http://www.wikidata.org/entity/Q50356948">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>2014-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51068760">Update on Middle East respiratory syndrome  coronavirus (MERS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q51068760">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>25577812</td>
  </tr>
  <tr>
    <td>2014-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34652511">The amino acids 736-761 of the MERS-CoV spike protein induce neutralizing antibodies: implications for the development of vaccines and antiviral agents.</a> (<a href="http://www.wikidata.org/entity/Q34652511">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1089/VIM.2014.0080</td>
    <td>25387086</td>
  </tr>
  <tr>
    <td>2014-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26851859">Emergence of MERS-CoV in the Middle East: origins, transmission, treatment, and perspectives</a> (<a href="http://www.wikidata.org/entity/Q26851859">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PPAT.1004457</td>
    <td>25474536</td>
  </tr>
  <tr>
    <td>2014-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34641515">Replication and shedding of MERS-CoV in upper respiratory tract of inoculated dromedary camels.</a> (<a href="http://www.wikidata.org/entity/Q34641515">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2012.141280</td>
    <td>25418529</td>
  </tr>
  <tr>
    <td>2014-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51074315">Middle East respiratory syndrome and Pakistan.</a> (<a href="http://www.wikidata.org/entity/Q51074315">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>12.2014/JCPSP.957957</td>
    <td>25523740</td>
  </tr>
  <tr>
    <td>2014-11-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38301321">Successful recovery of MERS CoV pneumonia in a patient with acquired immunodeficiency syndrome: a case report.</a> (<a href="http://www.wikidata.org/entity/Q38301321">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JCV.2014.11.030</td>
    <td>25542475</td>
  </tr>
  <tr>
    <td>2014-11-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35019893">Development of human neutralizing monoclonal antibodies for prevention and therapy of MERS-CoV infections</a> (<a href="http://www.wikidata.org/entity/Q35019893">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.MICINF.2014.11.008</td>
    <td>25456101</td>
  </tr>
  <tr>
    <td>2014-11-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38281329">Middle East respiratory syndrome coronavirus: implications for health care facilities.</a> (<a href="http://www.wikidata.org/entity/Q38281329">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2014.06.019</td>
    <td>25465253</td>
  </tr>
  <tr>
    <td>2014-11-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41624309">Middle East respiratory syndrome coronavirus infection control: the missing piece?</a> (<a href="http://www.wikidata.org/entity/Q41624309">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.AJIC.2014.08.003</td>
    <td>25465252</td>
  </tr>
  <tr>
    <td>2014-11-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41650622">Detection of the human coronavirus 229E, HKU1, NL63, and OC43 between 2010 and 2013 in Yamagata, Japan.</a> (<a href="http://www.wikidata.org/entity/Q41650622">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.7883/YOKEN.JJID.2014.266</td>
    <td>25420656</td>
  </tr>
  <tr>
    <td>2014-11-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41650622">Detection of the human coronavirus 229E, HKU1, NL63, and OC43 between 2010 and 2013 in Yamagata, Japan.</a> (<a href="http://www.wikidata.org/entity/Q41650622">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td>10.7883/YOKEN.JJID.2014.266</td>
    <td>25420656</td>
  </tr>
  <tr>
    <td>2014-11-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41650622">Detection of the human coronavirus 229E, HKU1, NL63, and OC43 between 2010 and 2013 in Yamagata, Japan.</a> (<a href="http://www.wikidata.org/entity/Q41650622">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.7883/YOKEN.JJID.2014.266</td>
    <td>25420656</td>
  </tr>
  <tr>
    <td>2014-11-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41650622">Detection of the human coronavirus 229E, HKU1, NL63, and OC43 between 2010 and 2013 in Yamagata, Japan.</a> (<a href="http://www.wikidata.org/entity/Q41650622">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.7883/YOKEN.JJID.2014.266</td>
    <td>25420656</td>
  </tr>
  <tr>
    <td>2014-11-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35069335">Estimating Potential Incidence of MERS-CoV Associated with Hajj Pilgrims to Saudi Arabia, 2014</a> (<a href="http://www.wikidata.org/entity/Q35069335">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/CURRENTS.OUTBREAKS.C5C9C9ABD636164A9B6FD4DBDA974369</td>
    <td>25685624</td>
  </tr>
  <tr>
    <td>2014-11-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43431661">Imported cases of Middle East respiratory syndrome: an update.</a> (<a href="http://www.wikidata.org/entity/Q43431661">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.TMAID.2014.11.006</td>
    <td>25477148</td>
  </tr>
  <tr>
    <td>2014-11-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41623695">Emerging respiratory infections: influenza, MERS-CoV, and extensively drug-resistant tuberculosis.</a> (<a href="http://www.wikidata.org/entity/Q41623695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S2213-2600(14)70250-4</td>
    <td>25466351</td>
  </tr>
  <tr>
    <td>2014-11-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34542015">CD26/DPP4 cell-surface expression in bat cells correlates with bat cell susceptibility to Middle East respiratory syndrome coronavirus (MERS-CoV) infection and evolution of persistent infection.</a> (<a href="http://www.wikidata.org/entity/Q34542015">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0112060</td>
    <td>25409519</td>
  </tr>
  <tr>
    <td>2014-11-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30368736">Tailoring subunit vaccine immunity with adjuvant combinations and delivery routes using the Middle East respiratory coronavirus (MERS-CoV) receptor-binding domain as an antigen.</a> (<a href="http://www.wikidata.org/entity/Q30368736">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0112602</td>
    <td>25405618</td>
  </tr>
  <tr>
    <td>2014-11-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34652870">Expression, crystallization and preliminary crystallographic study of the functional mutant (N60K) of nonstructural protein 9 from Human coronavirus HKU1.</a> (<a href="http://www.wikidata.org/entity/Q34652870">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td>10.1107/S2053230X14023085</td>
    <td>25484211</td>
  </tr>
  <tr>
    <td>2014-11-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40184034">Design of potential RNAi (miRNA and siRNA) molecules for Middle East respiratory syndrome coronavirus (MERS-CoV) gene silencing by computational method.</a> (<a href="http://www.wikidata.org/entity/Q40184034">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S12539-014-0208-Y</td>
    <td>25373633</td>
  </tr>
  <tr>
    <td>2014-11-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41593747">Design of potential RNAi (miRNA and siRNA) molecules for Middle East respiratory syndrome coronavirus (MERS-CoV) gene silencing by computational method.</a> (<a href="http://www.wikidata.org/entity/Q41593747">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S12539-014-0233-X</td>
    <td>25519155</td>
  </tr>
  <tr>
    <td>2014-11-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34482795">Middle East respiratory syndrome coronavirus: epidemiology and disease control measures</a> (<a href="http://www.wikidata.org/entity/Q34482795">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2147/IDR.S51283</td>
    <td>25395865</td>
  </tr>
  <tr>
    <td>2014-10-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30205767">Overview of preparedness and response for Middle East respiratory syndrome coronavirus (MERS-CoV) in Oman.</a> (<a href="http://www.wikidata.org/entity/Q30205767">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2014.10.003</td>
    <td>25447719</td>
  </tr>
  <tr>
    <td>2014-10-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41687420">Inhibition of endoplasmic reticulum-resident glucosidases impairs severe acute respiratory syndrome coronavirus and human coronavirus NL63 spike protein-mediated entry by altering the glycan processing of angiotensin I-converting enzyme 2.</a> (<a href="http://www.wikidata.org/entity/Q41687420">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1128/AAC.03999-14</td>
    <td>25348530</td>
  </tr>
  <tr>
    <td>2014-10-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41634897">Middle East respiratory syndrome coronavirus (MERS-CoV) viral shedding in the respiratory tract: an observational analysis with infection control implications.</a> (<a href="http://www.wikidata.org/entity/Q41634897">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2014.10.002</td>
    <td>25448335</td>
  </tr>
  <tr>
    <td>2014-10-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45343989">Health-care associate transmission of Middle East Respiratory Syndrome Corona virus, MERS-CoV, in the Kingdom of Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q45343989">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2014.10.001</td>
    <td>25461234</td>
  </tr>
  <tr>
    <td>2014-10-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38933524">Identification of residues on human receptor DPP4 critical for MERS-CoV binding and entry.</a> (<a href="http://www.wikidata.org/entity/Q38933524">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VIROL.2014.10.006</td>
    <td>25461530</td>
  </tr>
  <tr>
    <td>2014-10-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42786664">Testing of Middle East respiratory syndrome coronavirus replication inhibitors for the ability to block viral entry.</a> (<a href="http://www.wikidata.org/entity/Q42786664">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/AAC.03977-14</td>
    <td>25331705</td>
  </tr>
  <tr>
    <td>2014-10-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38279903">Middle East respiratory syndrome coronavirus (MERS-CoV): prevention in travelers.</a> (<a href="http://www.wikidata.org/entity/Q38279903">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.TMAID.2014.10.006</td>
    <td>25457301</td>
  </tr>
  <tr>
    <td>2014-10-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34356848">Travel-related MERS-CoV cases: an assessment of exposures and risk factors in a group of Dutch travellers returning from the Kingdom of Saudi Arabia, May 2014.</a> (<a href="http://www.wikidata.org/entity/Q34356848">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/1742-7622-11-16</td>
    <td>25328533</td>
  </tr>
  <tr>
    <td>2014-10-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35003400">An observational, laboratory-based study of outbreaks of middle East respiratory syndrome coronavirus in Jeddah and Riyadh, kingdom of Saudi Arabia, 2014.</a> (<a href="http://www.wikidata.org/entity/Q35003400">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIU812</td>
    <td>25323704</td>
  </tr>
  <tr>
    <td>2014-10-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51690118">Critical contribution of laboratories to outbreak response support for middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q51690118">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIU815</td>
    <td>25323703</td>
  </tr>
  <tr>
    <td>2014-10-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54208433">MERS-CoV- Low risk to Canadians.</a> (<a href="http://www.wikidata.org/entity/Q54208433">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.14745/CCDR.V40I17A01</td>
    <td>29769862</td>
  </tr>
  <tr>
    <td>2014-10-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34683256">Crystal structure of the Middle East respiratory syndrome coronavirus (MERS-CoV) papain-like protease bound to ubiquitin facilitates targeted disruption of deubiquitinating activity to demonstrate its role in innate immune suppression</a> (<a href="http://www.wikidata.org/entity/Q34683256">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1074/JBC.M114.609644</td>
    <td>25320088</td>
  </tr>
  <tr>
    <td>2014-10-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38275793">Middle East respiratory syndrome coronavirus (MERS-CoV) entry inhibitors targeting spike protein.</a> (<a href="http://www.wikidata.org/entity/Q38275793">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VIRUSRES.2014.10.007</td>
    <td>25451066</td>
  </tr>
  <tr>
    <td>2014-10-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41698065">Laboratory capability and surveillance testing for Middle East respiratory syndrome coronavirus infection in the WHO European Region, June 2013.</a> (<a href="http://www.wikidata.org/entity/Q41698065">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>25323078</td>
  </tr>
  <tr>
    <td>2014-10-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30205741">Synthesizing data and models for the spread of MERS-CoV, 2013: key role of index cases and hospital transmission.</a> (<a href="http://www.wikidata.org/entity/Q30205741">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.EPIDEM.2014.09.011</td>
    <td>25480133</td>
  </tr>
  <tr>
    <td>2014-10-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40187493">Clinical aspects and outcomes of 70 patients with Middle East respiratory syndrome coronavirus infection: a single-center experience in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q40187493">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2014.09.003</td>
    <td>25303830</td>
  </tr>
  <tr>
    <td>2014-10-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34408840">Host cell entry of Middle East respiratory syndrome coronavirus after two-step, furin-mediated activation of the spike protein.</a> (<a href="http://www.wikidata.org/entity/Q34408840">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1073/PNAS.1407087111</td>
    <td>25288733</td>
  </tr>
  <tr>
    <td>2014-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51688979">Australian Hajj pilgrims' knowledge about MERS-CoV and other respiratory infections.</a> (<a href="http://www.wikidata.org/entity/Q51688979">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S12250-014-3506-Y</td>
    <td>25338843</td>
  </tr>
  <tr>
    <td>2014-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51685318">MERS-CoV update: what you need to know.</a> (<a href="http://www.wikidata.org/entity/Q51685318">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(14)70930-2</td>
    <td>25379596</td>
  </tr>
  <tr>
    <td>2014-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30364820">Coronaviruses: severe acute respiratory syndrome coronavirus and Middle East respiratory syndrome coronavirus in travelers.</a> (<a href="http://www.wikidata.org/entity/Q30364820">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1097/QCO.0000000000000089</td>
    <td>25033169</td>
  </tr>
  <tr>
    <td>2014-09-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41718118">Ribavirin and interferon alfa-2a for severe Middle East respiratory syndrome coronavirus infection: a retrospective cohort study.</a> (<a href="http://www.wikidata.org/entity/Q41718118">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(14)70920-X</td>
    <td>25278221</td>
  </tr>
  <tr>
    <td>2014-09-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41718128">Treating MERS-CoV during an outbreak.</a> (<a href="http://www.wikidata.org/entity/Q41718128">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(14)70939-9</td>
    <td>25278219</td>
  </tr>
  <tr>
    <td>2014-09-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34442119">Virological and serological analysis of a recent Middle East respiratory syndrome coronavirus infection case on a triple combination antiviral regimen.</a> (<a href="http://www.wikidata.org/entity/Q34442119">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJANTIMICAG.2014.07.026</td>
    <td>25288266</td>
  </tr>
  <tr>
    <td>2014-09-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37048322">Middle East Respiratory Syndrome and Blood Donation: Topic for Further Study and Discussion.</a> (<a href="http://www.wikidata.org/entity/Q37048322">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S12288-014-0453-6</td>
    <td>27408424</td>
  </tr>
  <tr>
    <td>2014-09-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41752133">Immunogenicity of an adenoviral-based Middle East Respiratory Syndrome coronavirus vaccine in BALB/c mice.</a> (<a href="http://www.wikidata.org/entity/Q41752133">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VACCINE.2014.08.058</td>
    <td>25192975</td>
  </tr>
  <tr>
    <td>2014-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43105647">MERS-CoV, surgical mask and N95 respirators.</a> (<a href="http://www.wikidata.org/entity/Q43105647">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>25273939</td>
  </tr>
  <tr>
    <td>2014-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41490255">[Detection of human coronavirus OC43 in children with acute respiratory infections in Mie, Japan].</a> (<a href="http://www.wikidata.org/entity/Q41490255">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td></td>
    <td>25672143</td>
  </tr>
  <tr>
    <td>2014-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27695604">Bat origins of MERS-CoV supported by bat coronavirus HKU4 usage of human receptor CD26</a> (<a href="http://www.wikidata.org/entity/Q27695604">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.CHOM.2014.08.009</td>
    <td>25211075</td>
  </tr>
  <tr>
    <td>2014-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40209279">Middle East respiratory syndrome coronavirus disease in children.</a> (<a href="http://www.wikidata.org/entity/Q40209279">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1097/INF.0000000000000325</td>
    <td>24763193</td>
  </tr>
  <tr>
    <td>2014-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28385860">Authors' Reply. MERS-CoV, surgical mask and N95 respirators</a> (<a href="http://www.wikidata.org/entity/Q28385860">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.11622/SMEDJ.2014125</td>
    <td>25273940</td>
  </tr>
  <tr>
    <td>2014-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34259956">Family cluster of Middle East respiratory syndrome coronavirus infections, Tunisia, 2013.</a> (<a href="http://www.wikidata.org/entity/Q34259956">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2009.140378</td>
    <td>25148113</td>
  </tr>
  <tr>
    <td>2014-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41848640">MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q41848640">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5001/OMJ.2014.102</td>
    <td>25337321</td>
  </tr>
  <tr>
    <td>2014-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41366475">Middle Eastern Respiratory Syndrome Corona Virus (MERS CoV): case reports from a tertiary care hospital in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q41366475">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5144/0256-4947.2014.396</td>
    <td>25827696</td>
  </tr>
  <tr>
    <td>2014-08-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34201227">Computer aided prediction and identification of potential epitopes in the receptor binding domain (RBD) of spike (S) glycoprotein of MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q34201227">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.6026/97320630010533</td>
    <td>25258490</td>
  </tr>
  <tr>
    <td>2014-08-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38245314">Middle East respiratory syndrome coronavirus: transmission and phylogenetic evolution.</a> (<a href="http://www.wikidata.org/entity/Q38245314">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.TIM.2014.08.001</td>
    <td>25178651</td>
  </tr>
  <tr>
    <td>2014-08-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38937919">Tropism and replication of Middle East respiratory syndrome coronavirus from dromedary camels in the human respiratory tract: an in-vitro and ex-vivo study.</a> (<a href="http://www.wikidata.org/entity/Q38937919">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S2213-2600(14)70158-4</td>
    <td>25174549</td>
  </tr>
  <tr>
    <td>2014-08-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41760273">Dromedary MERS-CoV replicates in human respiratory tissues.</a> (<a href="http://www.wikidata.org/entity/Q41760273">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S2213-2600(14)70184-5</td>
    <td>25174550</td>
  </tr>
  <tr>
    <td>2014-08-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34593578">Catalytic function and substrate specificity of the papain-like protease domain of nsp3 from the Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q34593578">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01294-14</td>
    <td>25142582</td>
  </tr>
  <tr>
    <td>2014-08-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34042661">Detection of Middle East respiratory syndrome coronavirus using reverse transcription loop-mediated isothermal amplification (RT-LAMP).</a> (<a href="http://www.wikidata.org/entity/Q34042661">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/1743-422X-11-139</td>
    <td>25103205</td>
  </tr>
  <tr>
    <td>2014-08-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36293993">Clinical and laboratory findings of the first imported case of Middle East respiratory syndrome coronavirus to the United States.</a> (<a href="http://www.wikidata.org/entity/Q36293993">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIU635</td>
    <td>25100864</td>
  </tr>
  <tr>
    <td>2014-08-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26991666">Middle East respiratory syndrome (MERS): a new zoonotic viral pneumonia</a> (<a href="http://www.wikidata.org/entity/Q26991666">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4161/VIRU.32077</td>
    <td>25089913</td>
  </tr>
  <tr>
    <td>2014-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51054972">Infection prevention and control guidelines for patients with Middle East Respiratory Syndrome Coronavirus (MERS-CoV) infection.</a> (<a href="http://www.wikidata.org/entity/Q51054972">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>25129197</td>
  </tr>
  <tr>
    <td>2014-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42234785">Characterization of human coronavirus OC43 and human coronavirus NL63 infections among hospitalized children <5 years of age.</a> (<a href="http://www.wikidata.org/entity/Q42234785">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1097/INF.0000000000000292</td>
    <td>24577040</td>
  </tr>
  <tr>
    <td>2014-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42234785">Characterization of human coronavirus OC43 and human coronavirus NL63 infections among hospitalized children <5 years of age.</a> (<a href="http://www.wikidata.org/entity/Q42234785">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1097/INF.0000000000000292</td>
    <td>24577040</td>
  </tr>
  <tr>
    <td>2014-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21131359">Infection with MERS-CoV causes lethal pneumonia in the common marmoset</a> (<a href="http://www.wikidata.org/entity/Q21131359">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PPAT.1004250</td>
    <td>25144235</td>
  </tr>
  <tr>
    <td>2014-07-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41833096">Heat inactivation of the Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q41833096">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/IRV.12261</td>
    <td>25074677</td>
  </tr>
  <tr>
    <td>2014-07-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33988699">Crystallization and preliminary crystallographic study of human coronavirus NL63 main protease in complex with an inhibitor.</a> (<a href="http://www.wikidata.org/entity/Q33988699">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1107/S2053230X14012953</td>
    <td>25084384</td>
  </tr>
  <tr>
    <td>2014-07-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33995355">Detection of the Middle East respiratory syndrome coronavirus genome in an air sample originating from a camel barn owned by an infected patient</a> (<a href="http://www.wikidata.org/entity/Q33995355">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.01450-14</td>
    <td>25053787</td>
  </tr>
  <tr>
    <td>2014-07-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34261861">Rooting the phylogenetic tree of middle East respiratory syndrome coronavirus by characterization of a conspecific virus from an African bat</a> (<a href="http://www.wikidata.org/entity/Q34261861">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01498-14</td>
    <td>25031349</td>
  </tr>
  <tr>
    <td>2014-07-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38230739">Middle East respiratory syndrome: what clinicians need to know.</a> (<a href="http://www.wikidata.org/entity/Q38230739">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.MAYOCP.2014.06.008</td>
    <td>25034307</td>
  </tr>
  <tr>
    <td>2014-07-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42205106">A scenario-based evaluation of the Middle East respiratory syndrome coronavirus and the Hajj.</a> (<a href="http://www.wikidata.org/entity/Q42205106">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/RISA.12253</td>
    <td>25041625</td>
  </tr>
  <tr>
    <td>2014-07-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42203086">Kinetics and pattern of viral excretion in biological specimens of two MERS-CoV cases.</a> (<a href="http://www.wikidata.org/entity/Q42203086">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JCV.2014.07.002</td>
    <td>25073585</td>
  </tr>
  <tr>
    <td>2014-07-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38232337">Travel implications of emerging coronaviruses: SARS and MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q38232337">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.TMAID.2014.06.007</td>
    <td>25047726</td>
  </tr>
  <tr>
    <td>2014-07-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42873512">Concerns about misinterpretation of recent scientific data implicating dromedary camels in epidemiology of Middle East respiratory syndrome (MERS).</a> (<a href="http://www.wikidata.org/entity/Q42873512">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.01430-14</td>
    <td>25006231</td>
  </tr>
  <tr>
    <td>2014-07-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42873507">Reply to "Concerns about misinterpretation of recent scientific data implicating dromedary camels in epidemiology of Middle East respiratory syndrome (MERS)".</a> (<a href="http://www.wikidata.org/entity/Q42873507">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.01482-14</td>
    <td>25006235</td>
  </tr>
  <tr>
    <td>2014-07-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33838029">Prevalence and genetic diversity analysis of human coronavirus OC43 among adult patients with acute respiratory infections in Beijing, 2012</a> (<a href="http://www.wikidata.org/entity/Q33838029">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0100781</td>
    <td>24987849</td>
  </tr>
  <tr>
    <td>2014-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30458445">Towards improving clinical management of Middle East respiratory syndrome coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q30458445">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(14)70793-5</td>
    <td>24964934</td>
  </tr>
  <tr>
    <td>2014-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q23914629">Middle East Respiratory Syndrome (MERS)</a> (<a href="http://www.wikidata.org/entity/Q23914629">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1177/216507991406200707</td>
    <td>25000551</td>
  </tr>
  <tr>
    <td>2014-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43319601">Magnitude to thrombocytopenia among the patients with novel Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q43319601">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3109/09537104.2014.934796</td>
    <td>24984004</td>
  </tr>
  <tr>
    <td>2014-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42712912">Stability of Middle East respiratory syndrome coronavirus in milk.</a> (<a href="http://www.wikidata.org/entity/Q42712912">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2007.140500</td>
    <td>24960335</td>
  </tr>
  <tr>
    <td>2014-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30207578">Preparedness for molecular testing of Middle East respiratory syndrome coronavirus among laboratories in the Western Pacific Region.</a> (<a href="http://www.wikidata.org/entity/Q30207578">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5365/WPSAR.2014.5.3.001</td>
    <td>25320675</td>
  </tr>
  <tr>
    <td>2014-06-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42209686">Etiology of severe community-acquired pneumonia during the 2013 Hajj-part of the MERS-CoV surveillance program.</a> (<a href="http://www.wikidata.org/entity/Q42209686">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2014.06.003</td>
    <td>24970703</td>
  </tr>
  <tr>
    <td>2014-06-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42210505">Middle East respiratory syndrome coronavirus (MERS-CoV) RNA and neutralising antibodies in milk collected according to local customs from dromedary camels, Qatar, April 2014.</a> (<a href="http://www.wikidata.org/entity/Q42210505">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>24957745</td>
  </tr>
  <tr>
    <td>2014-06-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36359194">Seroepidemiology of Middle East respiratory syndrome (MERS) coronavirus in Saudi Arabia (1993) and Australia (2014) and characterisation of assay specificity.</a> (<a href="http://www.wikidata.org/entity/Q36359194">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>24957744</td>
  </tr>
  <tr>
    <td>2014-06-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39171246">Assessment of the Middle East respiratory syndrome coronavirus (MERS-CoV) epidemic in the Middle East and risk of international spread using a novel maximum likelihood analysis approach.</a> (<a href="http://www.wikidata.org/entity/Q39171246">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>24957746</td>
  </tr>
  <tr>
    <td>2014-06-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30363509">Unanswered questions about the Middle East respiratory syndrome coronavirus (MERS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q30363509">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/1756-0500-7-358</td>
    <td>24920393</td>
  </tr>
  <tr>
    <td>2014-06-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38864793">Middle East respiratory syndrome coronavirus (MERS-CoV) infection: chest CT findings.</a> (<a href="http://www.wikidata.org/entity/Q38864793">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2214/AJR.14.13021</td>
    <td>24918624</td>
  </tr>
  <tr>
    <td>2014-06-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34059153">Host species restriction of Middle East respiratory syndrome coronavirus through its receptor, dipeptidyl peptidase 4.</a> (<a href="http://www.wikidata.org/entity/Q34059153">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.00676-14</td>
    <td>24899185</td>
  </tr>
  <tr>
    <td>2014-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43105767">Respiratory precautions for MERS-CoV: acceptable risk-benefit determination.</a> (<a href="http://www.wikidata.org/entity/Q43105767">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>25017401</td>
  </tr>
  <tr>
    <td>2014-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28385870">Debate on MERS-CoV respiratory precautions: surgical mask or N95 respirators?</a> (<a href="http://www.wikidata.org/entity/Q28385870">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.11622/SMEDJ.2014076</td>
    <td>25017402</td>
  </tr>
  <tr>
    <td>2014-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27012578">Current advancements and potential strategies in the development of MERS-CoV vaccines</a> (<a href="http://www.wikidata.org/entity/Q27012578">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1586/14760584.2014.912134</td>
    <td>24766432</td>
  </tr>
  <tr>
    <td>2014-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33678652">Unraveling the mysteries of Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q33678652">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2006.140322</td>
    <td>24983095</td>
  </tr>
  <tr>
    <td>2014-05-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42211699">Middle East respiratory syndrome coronavirus (MERS-CoV) infections in two returning travellers in the Netherlands, May 2014.</a> (<a href="http://www.wikidata.org/entity/Q42211699">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES2014.19.21.20817</td>
    <td>24906375</td>
  </tr>
  <tr>
    <td>2014-05-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q31161722">Alternative screening approaches for discovery of Middle East respiratory syndrome coronavirus inhibitors.</a> (<a href="http://www.wikidata.org/entity/Q31161722">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/AAC.03406-14</td>
    <td>24867994</td>
  </tr>
  <tr>
    <td>2014-05-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51721679">Is aerosol-based transmission of Middle East respiratory syndrome coronavirus possible?</a> (<a href="http://www.wikidata.org/entity/Q51721679">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIU301</td>
    <td>24857845</td>
  </tr>
  <tr>
    <td>2014-05-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46578051">MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q46578051">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/1471-2334-14-S2-S22</td>
    <td></td>
  </tr>
  <tr>
    <td>2014-05-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51721040">Letter to the Editor: Middle East respiratory syndrome coronavirus (MERS-CoV) in dromedary camels: are dromedary camels a reservoir for MERS-CoV?</a> (<a href="http://www.wikidata.org/entity/Q51721040">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES2014.19.20.20810</td>
    <td>24871759</td>
  </tr>
  <tr>
    <td>2014-05-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51721035">Authors reply: Middle East respiratory syndrome coronavirus (MERS-CoV) in dromedary camels: are dromedary camels a reservoir for MERS-CoV?</a> (<a href="http://www.wikidata.org/entity/Q51721035">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES2014.19.20.20811</td>
    <td>24871760</td>
  </tr>
  <tr>
    <td>2014-05-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42213958">Infection control and MERS-CoV in health-care workers.</a> (<a href="http://www.wikidata.org/entity/Q42213958">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S0140-6736(14)60852-7</td>
    <td>24857701</td>
  </tr>
  <tr>
    <td>2014-05-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34058240">Evaluation of SSYA10-001 as a replication inhibitor of severe acute respiratory syndrome, mouse hepatitis, and Middle East respiratory syndrome coronaviruses.</a> (<a href="http://www.wikidata.org/entity/Q34058240">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/AAC.02994-14</td>
    <td>24841268</td>
  </tr>
  <tr>
    <td>2014-05-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34058365">Screening of an FDA-approved compound library identifies four small-molecule inhibitors of Middle East respiratory syndrome coronavirus replication in cell culture.</a> (<a href="http://www.wikidata.org/entity/Q34058365">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/AAC.03011-14</td>
    <td>24841269</td>
  </tr>
  <tr>
    <td>2014-05-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30419612">Repurposing of clinically developed drugs for treatment of Middle East respiratory syndrome coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q30419612">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/AAC.03036-14</td>
    <td>24841273</td>
  </tr>
  <tr>
    <td>2014-05-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42214884">Respiratory tract samples, viral load, and genome fraction yield in patients with Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q42214884">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIU292</td>
    <td>24837403</td>
  </tr>
  <tr>
    <td>2014-05-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42218522">Ribavirin and interferon-α2b as primary and preventive treatment for Middle East respiratory syndrome coronavirus: a preliminary report of two cases.</a> (<a href="http://www.wikidata.org/entity/Q42218522">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3851/IMP2792</td>
    <td>24831606</td>
  </tr>
  <tr>
    <td>2014-05-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36807417">Hospital-associated outbreak of Middle East respiratory syndrome coronavirus: a serologic, epidemiologic, and clinical description.</a> (<a href="http://www.wikidata.org/entity/Q36807417">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIU359</td>
    <td>24829216</td>
  </tr>
  <tr>
    <td>2014-05-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51088174">Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q51088174">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S00134-014-3303-Y</td>
    <td>24818865</td>
  </tr>
  <tr>
    <td>2014-05-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44514667">Middle East respiratory syndrome corona virus, MERS-CoV. Conclusions from the 2nd Scientific Advisory Board Meeting of the WHO Collaborating Center for Mass Gathering Medicine, Riyadh.</a> (<a href="http://www.wikidata.org/entity/Q44514667">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2014.05.001</td>
    <td>24818990</td>
  </tr>
  <tr>
    <td>2014-05-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30210143">Laboratory-confirmed case of Middle East respiratory syndrome coronavirus (MERS-CoV) infection in Malaysia: preparedness and response, April 2014.</a> (<a href="http://www.wikidata.org/entity/Q30210143">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>24832116</td>
  </tr>
  <tr>
    <td>2014-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51721157">MERS-CoV enigma deepens as reported cases surge.</a> (<a href="http://www.wikidata.org/entity/Q51721157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S0140-6736(14)60866-7</td>
    <td>24868566</td>
  </tr>
  <tr>
    <td>2014-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38195726">Severe acute respiratory syndrome vs. the Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q38195726">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1097/MCP.0000000000000046</td>
    <td>24626235</td>
  </tr>
  <tr>
    <td>2014-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27683898">Structural Basis for the Ubiquitin-Linkage Specificity and deISGylating Activity of SARS-CoV Papain-Like Protease</a> (<a href="http://www.wikidata.org/entity/Q27683898">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1371/JOURNAL.PPAT.1004113</td>
    <td>24854014</td>
  </tr>
  <tr>
    <td>2014-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21131361">Targeting membrane-bound viral RNA synthesis reveals potent inhibition of diverse coronaviruses including the middle East respiratory syndrome virus</a> (<a href="http://www.wikidata.org/entity/Q21131361">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PPAT.1004166</td>
    <td>24874215</td>
  </tr>
  <tr>
    <td>2014-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40541985">MERS-CoV: Bridging the Knowledge Gaps.</a> (<a href="http://www.wikidata.org/entity/Q40541985">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5001/OMJ.2014.43</td>
    <td>24936264</td>
  </tr>
  <tr>
    <td>2014-04-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30362113">Exceptionally potent neutralization of Middle East respiratory syndrome coronavirus by human monoclonal antibodies.</a> (<a href="http://www.wikidata.org/entity/Q30362113">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.00912-14</td>
    <td>24789777</td>
  </tr>
  <tr>
    <td>2014-04-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46797917">Federal Interagency Interactions During Outbreaks of H7N9 Influenza and MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q46797917">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>2014-04-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33569544">Middle East respiratory syndrome coronavirus quasispecies that include homologues of human isolates revealed through whole-genome analysis and virus cultured from dromedary camels in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q33569544">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.01146-14</td>
    <td>24781747</td>
  </tr>
  <tr>
    <td>2014-04-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33627189">Identification of human neutralizing antibodies against MERS-CoV and their role in virus adaptive evolution.</a> (<a href="http://www.wikidata.org/entity/Q33627189">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1073/PNAS.1402074111</td>
    <td>24778221</td>
  </tr>
  <tr>
    <td>2014-04-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35159147">Potent neutralization of MERS-CoV by human neutralizing monoclonal antibodies to the viral spike glycoprotein.</a> (<a href="http://www.wikidata.org/entity/Q35159147">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1126/SCITRANSLMED.3008140</td>
    <td>24778414</td>
  </tr>
  <tr>
    <td>2014-04-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44024912">WHO voices concern over rising numbers of MERS-CoV cases.</a> (<a href="http://www.wikidata.org/entity/Q44024912">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1136/BMJ.G2968</td>
    <td>24778282</td>
  </tr>
  <tr>
    <td>2014-04-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40208587">A case of imported Middle East Respiratory Syndrome coronavirus infection and public health response, Greece, April 2014.</a> (<a href="http://www.wikidata.org/entity/Q40208587">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>24786258</td>
  </tr>
  <tr>
    <td>2014-04-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42218066">Possible involvement of infection with human coronavirus 229E, but not NL63, in Kawasaki disease.</a> (<a href="http://www.wikidata.org/entity/Q42218066">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1002/JMV.23950</td>
    <td>24760654</td>
  </tr>
  <tr>
    <td>2014-04-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42218066">Possible involvement of infection with human coronavirus 229E, but not NL63, in Kawasaki disease.</a> (<a href="http://www.wikidata.org/entity/Q42218066">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1002/JMV.23950</td>
    <td>24760654</td>
  </tr>
  <tr>
    <td>2014-04-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42217115">Middle East respiratory syndrome coronavirus (MERS-CoV) in dromedary camels, Oman, 2013.</a> (<a href="http://www.wikidata.org/entity/Q42217115">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES2014.19.16.20781</td>
    <td>24786259</td>
  </tr>
  <tr>
    <td>2014-04-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39483694">Middle East Respiratory Syndrome coronavirus - two years into the epidemic.</a> (<a href="http://www.wikidata.org/entity/Q39483694">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES2014.19.16.20783</td>
    <td>24786257</td>
  </tr>
  <tr>
    <td>2014-04-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42218672">Stability of infectious human coronavirus NL63.</a> (<a href="http://www.wikidata.org/entity/Q42218672">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1016/J.JVIROMET.2014.04.001</td>
    <td>24747590</td>
  </tr>
  <tr>
    <td>2014-04-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q48079205">The Hajj pilgrimage and surveillance for Middle East Respiratory syndrome coronavirus in pilgrims from African countries.</a> (<a href="http://www.wikidata.org/entity/Q48079205">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/TMI.12318</td>
    <td>24750482</td>
  </tr>
  <tr>
    <td>2014-04-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40210753">Middle East respiratory syndrome coronavirus: a case-control study of hospitalized patients.</a> (<a href="http://www.wikidata.org/entity/Q40210753">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/CID/CIU226</td>
    <td>24723278</td>
  </tr>
  <tr>
    <td>2014-04-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33934034">The emergence of the Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q33934034">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/2049-632X.12166</td>
    <td>24585737</td>
  </tr>
  <tr>
    <td>2014-04-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33743790">A conformation-dependent neutralizing monoclonal antibody specifically targeting receptor-binding domain in Middle East respiratory syndrome coronavirus spike protein.</a> (<a href="http://www.wikidata.org/entity/Q33743790">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.00433-14</td>
    <td>24719424</td>
  </tr>
  <tr>
    <td>2014-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40206218">[MERS-CoV: a new virus from Saudi Arabia].</a> (<a href="http://www.wikidata.org/entity/Q40206218">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>24855771</td>
  </tr>
  <tr>
    <td>2014-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30358243">Middle East respiratory syndrome coronavirus antibody reactors among camels in Dubai, United Arab Emirates, in 2005.</a> (<a href="http://www.wikidata.org/entity/Q30358243">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/TBED.12212</td>
    <td>24456414</td>
  </tr>
  <tr>
    <td>2014-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37664613">Contact investigation for imported case of Middle East respiratory syndrome, Germany</a> (<a href="http://www.wikidata.org/entity/Q37664613">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID2004.131375</td>
    <td>24655721</td>
  </tr>
  <tr>
    <td>2014-03-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35638512">Community case clusters of Middle East respiratory syndrome coronavirus in Hafr Al-Batin, Kingdom of Saudi Arabia: a descriptive genomic study.</a> (<a href="http://www.wikidata.org/entity/Q35638512">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2014.03.1372</td>
    <td>24699184</td>
  </tr>
  <tr>
    <td>2014-03-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42224974">Performance and clinical validation of the RealStar MERS-CoV Kit for detection of Middle East respiratory syndrome coronavirus RNA.</a> (<a href="http://www.wikidata.org/entity/Q42224974">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JCV.2014.03.012</td>
    <td>24726679</td>
  </tr>
  <tr>
    <td>2014-03-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27681891">X-ray Structural and Biological Evaluation of a Series of Potent and Highly Selective Inhibitors of Human Coronavirus Papain-like Proteases</a> (<a href="http://www.wikidata.org/entity/Q27681891">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1021/JM401712T</td>
    <td>24568342</td>
  </tr>
  <tr>
    <td>2014-03-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46351484">Middle East Respiratory Syndrome Coronavirus Infection in Dromedary Camels in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q46351484">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>2014-03-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43727378">Middle East respiratory syndrome coronavirus: epidemic potential or a storm in a teacup?</a> (<a href="http://www.wikidata.org/entity/Q43727378">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1183/09031936.00227213</td>
    <td>24627533</td>
  </tr>
  <tr>
    <td>2014-03-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40214724">Prevalence of MERS-CoV nasal carriage and compliance with the Saudi health recommendations among pilgrims attending the 2013 Hajj.</a> (<a href="http://www.wikidata.org/entity/Q40214724">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIU150</td>
    <td>24620019</td>
  </tr>
  <tr>
    <td>2014-03-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42219678">Productive replication of Middle East respiratory syndrome coronavirus in monocyte-derived dendritic cells modulates innate immune response.</a> (<a href="http://www.wikidata.org/entity/Q42219678">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VIROL.2014.02.018</td>
    <td>24725946</td>
  </tr>
  <tr>
    <td>2014-03-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30217177">Rapid generation of a mouse model for Middle East respiratory syndrome.</a> (<a href="http://www.wikidata.org/entity/Q30217177">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1073/PNAS.1323279111</td>
    <td>24599590</td>
  </tr>
  <tr>
    <td>2014-03-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45006404">What are our pharmacotherapeutic options for MERS-CoV?</a> (<a href="http://www.wikidata.org/entity/Q45006404">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1586/17512433.2014.890515</td>
    <td>24580083</td>
  </tr>
  <tr>
    <td>2014-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51705996">The MERS-CoV outbreak: challenges facing the dental profession.</a> (<a href="http://www.wikidata.org/entity/Q51705996">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>25095856</td>
  </tr>
  <tr>
    <td>2014-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33413007">Clinical course and outcomes of critically ill patients with Middle East respiratory syndrome coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q33413007">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.7326/M13-2486</td>
    <td>24474051</td>
  </tr>
  <tr>
    <td>2014-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44961691">Medusa's ugly head again: from SARS to MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q44961691">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.7326/M14-0096</td>
    <td>24474146</td>
  </tr>
  <tr>
    <td>2014-02-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38860409">Mouse dipeptidyl peptidase 4 is not a functional receptor for Middle East respiratory syndrome coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q38860409">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.03764-13</td>
    <td>24574399</td>
  </tr>
  <tr>
    <td>2014-02-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37613033">Middle East respiratory syndrome coronavirus infection in dromedary camels in Saudi Arabia.</a> (<a href="http://www.wikidata.org/entity/Q37613033">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.00884-14</td>
    <td>24570370</td>
  </tr>
  <tr>
    <td>2014-02-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30317509">Human coronavirus NL63 replication is cyclophilin A-dependent and inhibited by non-immunosuppressive cyclosporine A-derivatives including Alisporivir.</a> (<a href="http://www.wikidata.org/entity/Q30317509">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1016/J.VIRUSRES.2014.02.010</td>
    <td>24566223</td>
  </tr>
  <tr>
    <td>2014-02-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37713959">Receptor variation and susceptibility to Middle East respiratory syndrome coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q37713959">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.00161-14</td>
    <td>24554656</td>
  </tr>
  <tr>
    <td>2014-02-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30359335">Intranasal vaccination with recombinant receptor-binding domain of MERS-CoV spike protein induces much stronger local mucosal immune responses than subcutaneous immunization: Implication for designing novel mucosal MERS vaccines.</a> (<a href="http://www.wikidata.org/entity/Q30359335">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VACCINE.2014.02.004</td>
    <td>24560617</td>
  </tr>
  <tr>
    <td>2014-02-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37621643">Spread, circulation, and evolution of the Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q37621643">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.01062-13</td>
    <td>24549846</td>
  </tr>
  <tr>
    <td>2014-02-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42241378">Screening for Middle East respiratory syndrome coronavirus infection in hospital patients and their healthcare worker and family contacts: a prospective descriptive study.</a> (<a href="http://www.wikidata.org/entity/Q42241378">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/1469-0691.12562</td>
    <td>24460984</td>
  </tr>
  <tr>
    <td>2014-02-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44776912">[Middle East respiratory syndrome (MERS): bats or dromedary, which of them is responsible?].</a> (<a href="http://www.wikidata.org/entity/Q44776912">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S13149-014-0333-1</td>
    <td>24532303</td>
  </tr>
  <tr>
    <td>2014-02-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35097505">Distinct immune response in two MERS-CoV-infected patients: can we go from bench to bedside?</a> (<a href="http://www.wikidata.org/entity/Q35097505">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0088716</td>
    <td>24551142</td>
  </tr>
  <tr>
    <td>2014-02-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37713995">Middle east respiratory syndrome coronavirus 4a protein is a double-stranded RNA-binding protein that suppresses PACT-induced activation of RIG-I and MDA5 in the innate antiviral response.</a> (<a href="http://www.wikidata.org/entity/Q37713995">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.03649-13</td>
    <td>24522921</td>
  </tr>
  <tr>
    <td>2014-02-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38187028">Middle East respiratory syndrome coronavirus (MERS-CoV): evidence and speculations.</a> (<a href="http://www.wikidata.org/entity/Q38187028">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S00705-014-1995-5</td>
    <td>24515532</td>
  </tr>
  <tr>
    <td>2014-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51851819">DPP4-directed therapeutic strategies for MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q51851819">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(13)70696-0</td>
    <td>24457167</td>
  </tr>
  <tr>
    <td>2014-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51851815">Missing information in animal surveillance of MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q51851815">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(13)70699-6</td>
    <td>24457168</td>
  </tr>
  <tr>
    <td>2014-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27689096">Structural basis for catalysis and ubiquitin recognition by the severe acute respiratory syndrome coronavirus papain-like protease</a> (<a href="http://www.wikidata.org/entity/Q27689096">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1107/S1399004713031040</td>
    <td>24531491</td>
  </tr>
  <tr>
    <td>2014-01-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41684249">Lack of detection of Middle East respiratory syndrome coronavirus in mild and severe respiratory infections in Catalonia, northeastern Spain</a> (<a href="http://www.wikidata.org/entity/Q41684249">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1002/2052-2975.34</td>
    <td>25356335</td>
  </tr>
  <tr>
    <td>2014-01-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36201318">Stillbirth during infection with Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q36201318">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIU068</td>
    <td>24474813</td>
  </tr>
  <tr>
    <td>2014-01-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34399575">Blocking of exchange proteins directly activated by cAMP leads to reduced replication of Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q34399575">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.03001-13</td>
    <td>24453361</td>
  </tr>
  <tr>
    <td>2014-01-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38595331">The ORF4b-encoded accessory proteins of Middle East respiratory syndrome coronavirus and two related bat coronaviruses localize to the nucleus and inhibit innate immune signalling.</a> (<a href="http://www.wikidata.org/entity/Q38595331">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1099/VIR.0.062059-0</td>
    <td>24443473</td>
  </tr>
  <tr>
    <td>2014-01-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42250692">Has Hajj-associated Middle East Respiratory Syndrome Coronavirus transmission occurred? The case for effective post-Hajj surveillance for infection.</a> (<a href="http://www.wikidata.org/entity/Q42250692">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/1469-0691.12492</td>
    <td>24313466</td>
  </tr>
  <tr>
    <td>2014-01-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41967852">Comparative analysis of the activation of unfolded protein response by spike proteins of severe acute respiratory syndrome coronavirus and human coronavirus HKU1.</a> (<a href="http://www.wikidata.org/entity/Q41967852">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td>10.1186/2045-3701-4-3</td>
    <td>24410900</td>
  </tr>
  <tr>
    <td>2014-01-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42244203">Ribavirin and interferon therapy in patients infected with the Middle East respiratory syndrome coronavirus: an observational study.</a> (<a href="http://www.wikidata.org/entity/Q42244203">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2013.12.003</td>
    <td>24406736</td>
  </tr>
  <tr>
    <td>2014-01-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42233553">Probabilistic differential diagnosis of Middle East respiratory syndrome (MERS) using the time from immigration to illness onset among imported cases.</a> (<a href="http://www.wikidata.org/entity/Q42233553">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JTBI.2013.12.024</td>
    <td>24406808</td>
  </tr>
  <tr>
    <td>2014-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51035194">Invited Editorial: MERS-CoV An Emerging Viral Zoonotic Disease: Three Years After and Counting.</a> (<a href="http://www.wikidata.org/entity/Q51035194">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>25851253</td>
  </tr>
  <tr>
    <td>2014-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41728726">[Middle-East respiratory syndrome].</a> (<a href="http://www.wikidata.org/entity/Q41728726">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>25248740</td>
  </tr>
  <tr>
    <td>2014-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41728744">[Dromedary camels and Middle East respiratory syndrome: MERS coronavirus in the 'ship of the desert'].</a> (<a href="http://www.wikidata.org/entity/Q41728744">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>25248734</td>
  </tr>
  <tr>
    <td>2014-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28660530">Middle East respiratory syndrome coronavirus: quantification of the extent of the epidemic, surveillance biases, and transmissibility</a> (<a href="http://www.wikidata.org/entity/Q28660530">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(13)70304-9</td>
    <td>24239323</td>
  </tr>
  <tr>
    <td>2014-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27689029">Structure-based discovery of Middle East respiratory syndrome coronavirus fusion inhibitor</a> (<a href="http://www.wikidata.org/entity/Q27689029">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/NCOMMS4067</td>
    <td>24473083</td>
  </tr>
  <tr>
    <td>2014-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q28393304">The pattern of Middle East respiratory syndrome coronavirus in Saudi Arabia: a descriptive epidemiological analysis of data from the Saudi Ministry of Health</a> (<a href="http://www.wikidata.org/entity/Q28393304">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2147/IJGM.S67061</td>
    <td>25187734</td>
  </tr>
  <tr>
    <td>2014-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38229070">Sensitivity of SARS/MERS CoV to interferons and other drugs based on achievable serum concentrations in humans.</a> (<a href="http://www.wikidata.org/entity/Q38229070">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2174/1871526514666140713152858</td>
    <td>25019238</td>
  </tr>
  <tr>
    <td>2013-12-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42241307">Emerging respiratory viral infections: MERS-CoV and influenza.</a> (<a href="http://www.wikidata.org/entity/Q42241307">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S2213-2600(13)70255-8</td>
    <td>24461892</td>
  </tr>
  <tr>
    <td>2013-12-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37425357">In-vitro renal epithelial cell infection reveals a viral kidney tropism as a potential mechanism for acute renal failure during Middle East Respiratory Syndrome (MERS) Coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q37425357">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/1743-422X-10-359</td>
    <td>24364985</td>
  </tr>
  <tr>
    <td>2013-12-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38315802">MERS-CoV papain-like protease has deISGylating and deubiquitinating activities.</a> (<a href="http://www.wikidata.org/entity/Q38315802">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.VIROL.2013.11.040</td>
    <td>24503068</td>
  </tr>
  <tr>
    <td>2013-12-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35074220">Proteolytic processing, deubiquitinase and interferon antagonist activities of Middle East respiratory syndrome coronavirus papain-like protease.</a> (<a href="http://www.wikidata.org/entity/Q35074220">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1099/VIR.0.059014-0</td>
    <td>24362959</td>
  </tr>
  <tr>
    <td>2013-12-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37425571">Chinese social media reaction to the MERS-CoV and avian influenza A(H7N9) outbreaks.</a> (<a href="http://www.wikidata.org/entity/Q37425571">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/2049-9957-2-31</td>
    <td>24359669</td>
  </tr>
  <tr>
    <td>2013-12-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42236132">Middle East respiratory syndrome coronavirus in dromedary camels: an outbreak investigation.</a> (<a href="http://www.wikidata.org/entity/Q42236132">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(13)70690-X</td>
    <td>24355866</td>
  </tr>
  <tr>
    <td>2013-12-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42236130">Identification of MERS-CoV in dromedary camels.</a> (<a href="http://www.wikidata.org/entity/Q42236130">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(13)70691-1</td>
    <td>24355867</td>
  </tr>
  <tr>
    <td>2013-12-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44536479">Mass gathering-related mask use during 2009 pandemic influenza A (H1N1) and Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q44536479">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2013.12.001</td>
    <td>24355682</td>
  </tr>
  <tr>
    <td>2013-12-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38171580">The receptor binding domain of MERS-CoV: the dawn of vaccine and treatment development.</a> (<a href="http://www.wikidata.org/entity/Q38171580">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JFMA.2013.11.006</td>
    <td>24342026</td>
  </tr>
  <tr>
    <td>2013-12-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39034818">BST2/CD317 counteracts human coronavirus 229E productive infection by tethering virions at the cell surface.</a> (<a href="http://www.wikidata.org/entity/Q39034818">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/J.VIROL.2013.11.030</td>
    <td>24418563</td>
  </tr>
  <tr>
    <td>2013-12-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42248788">Middle East Respiratory Syndrome (MERS) coronavirus seroprevalence in domestic livestock in Saudi Arabia, 2010 to 2013.</a> (<a href="http://www.wikidata.org/entity/Q42248788">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>24342517</td>
  </tr>
  <tr>
    <td>2013-12-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37410980">Reverse transcription recombinase polymerase amplification assay for the detection of middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q37410980">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/CURRENTS.OUTBREAKS.62DF1C7C75FFC96CD59034531E2E8364</td>
    <td>24459611</td>
  </tr>
  <tr>
    <td>2013-12-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42248792">Middle East Respiratory Syndrome coronavirus (MERS-CoV) serology in major livestock species in an affected region in Jordan, June to September 2013.</a> (<a href="http://www.wikidata.org/entity/Q42248792">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES2013.18.50.20662</td>
    <td>24342516</td>
  </tr>
  <tr>
    <td>2013-12-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51855733">Note from the editors: MERS-CoV - the quest for the reservoir continues.</a> (<a href="http://www.wikidata.org/entity/Q51855733">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES2013.18.50.20663</td>
    <td>24342513</td>
  </tr>
  <tr>
    <td>2013-12-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37593209">Interferon-β and mycophenolic acid are potent inhibitors of Middle East respiratory syndrome coronavirus in cell-based assays.</a> (<a href="http://www.wikidata.org/entity/Q37593209">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1099/VIR.0.061911-0</td>
    <td>24323636</td>
  </tr>
  <tr>
    <td>2013-12-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36201353">Middle East respiratory syndrome coronavirus not detected in children hospitalized with acute respiratory illness in Amman, Jordan, March 2010 to September 2012</a> (<a href="http://www.wikidata.org/entity/Q36201353">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1111/1469-0691.12438</td>
    <td>24313317</td>
  </tr>
  <tr>
    <td>2013-12-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36922964">The structural and accessory proteins M, ORF 4a, ORF 4b, and ORF 5 of Middle East respiratory syndrome coronavirus (MERS-CoV) are potent interferon antagonists</a> (<a href="http://www.wikidata.org/entity/Q36922964">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S13238-013-3096-8</td>
    <td>24318862</td>
  </tr>
  <tr>
    <td>2013-12-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35063993">A truncated receptor-binding domain of MERS-CoV spike protein potently inhibits MERS-CoV infection and induces strong neutralizing antibody responses: implication for developing therapeutics and vaccines</a> (<a href="http://www.wikidata.org/entity/Q35063993">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0081587</td>
    <td>24324708</td>
  </tr>
  <tr>
    <td>2013-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27680061">Structure of the Fusion Core and Inhibition of Fusion by a Heptad Repeat Peptide Derived from the S Protein of Middle East Respiratory Syndrome Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q27680061">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.02433-13</td>
    <td>24067982</td>
  </tr>
  <tr>
    <td>2013-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42858062">Public health management of mass gatherings: the Saudi Arabian experience with MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q42858062">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2471/BLT.13.132266</td>
    <td>24347725</td>
  </tr>
  <tr>
    <td>2013-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39059431">Future treatment strategies for novel Middle East respiratory syndrome coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q39059431">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.4155/FMC.13.183</td>
    <td>24261888</td>
  </tr>
  <tr>
    <td>2013-11-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41908949">Adenosine deaminase acts as a natural antagonist for dipeptidyl peptidase 4-mediated entry of the Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q41908949">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.02935-13</td>
    <td>24257613</td>
  </tr>
  <tr>
    <td>2013-11-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42240440">The epidemiology of MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q42240440">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(13)70283-4</td>
    <td>24239325</td>
  </tr>
  <tr>
    <td>2013-11-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35051967">Prediction of Intrinsic Disorder in MERS-CoV/HCoV-EMC Supports a High Oral-Fecal Transmission.</a> (<a href="http://www.wikidata.org/entity/Q35051967">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/CURRENTS.OUTBREAKS.22254B58675CDEBC256DBE3C5AA6498B</td>
    <td>24270586</td>
  </tr>
  <tr>
    <td>2013-11-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42256279">Investigation of anti-middle East respiratory syndrome antibodies in blood donors and slaughterhouse workers in Jeddah and Makkah, Saudi Arabia, fall 2012.</a> (<a href="http://www.wikidata.org/entity/Q42256279">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIT589</td>
    <td>24218504</td>
  </tr>
  <tr>
    <td>2013-11-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51859624">Advancing priority research on the Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q51859624">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIT591</td>
    <td>24218505</td>
  </tr>
  <tr>
    <td>2013-11-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37565476">Wild-type and innate immune-deficient mice are not susceptible to the Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q37565476">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1099/VIR.0.060640-0</td>
    <td>24197535</td>
  </tr>
  <tr>
    <td>2013-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51853615">MERS-CoV--are we on the verge of a pandemic?</a> (<a href="http://www.wikidata.org/entity/Q51853615">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>24392512</td>
  </tr>
  <tr>
    <td>2013-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45235289">Middle East respiratory syndrome (MERS) coronavirus: a new challenge for veterinarians?</a> (<a href="http://www.wikidata.org/entity/Q45235289">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1177/0300985813506391</td>
    <td>24221812</td>
  </tr>
  <tr>
    <td>2013-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24596439">Middle East respiratory syndrome coronavirus in bats, Saudi Arabia</a> (<a href="http://www.wikidata.org/entity/Q24596439">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID1911.131172</td>
    <td>24206838</td>
  </tr>
  <tr>
    <td>2013-10-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37546593">Real-time reverse transcription-PCR assay panel for Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q37546593">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JCM.02533-13</td>
    <td>24153118</td>
  </tr>
  <tr>
    <td>2013-10-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41909110">Characterization of a novel betacoronavirus related to middle East respiratory syndrome coronavirus in European hedgehogs.</a> (<a href="http://www.wikidata.org/entity/Q41909110">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01600-13</td>
    <td>24131722</td>
  </tr>
  <tr>
    <td>2013-10-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42261720">Hajj pilgrims knowledge about Middle East respiratory syndrome coronavirus, August to September 2013.</a> (<a href="http://www.wikidata.org/entity/Q42261720">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>24135123</td>
  </tr>
  <tr>
    <td>2013-10-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38312038">Human coronavirus OC43 nucleocapsid protein binds microRNA 9 and potentiates NF-κB activation.</a> (<a href="http://www.wikidata.org/entity/Q38312038">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1128/JVI.02678-13</td>
    <td>24109243</td>
  </tr>
  <tr>
    <td>2013-10-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45989652">How great is the risk of Middle East respiratory syndrome coronavirus to the global population?</a> (<a href="http://www.wikidata.org/entity/Q45989652">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1586/14787210.2013.836965</td>
    <td>24093587</td>
  </tr>
  <tr>
    <td>2013-10-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35008480">Broad-spectrum antivirals for the emerging Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q35008480">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JINF.2013.09.029</td>
    <td>24096239</td>
  </tr>
  <tr>
    <td>2013-10-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35009468">Role of the spike glycoprotein of human Middle East respiratory syndrome coronavirus (MERS-CoV) in virus entry and syncytia formation.</a> (<a href="http://www.wikidata.org/entity/Q35009468">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0076469</td>
    <td>24098509</td>
  </tr>
  <tr>
    <td>2013-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44210115">Middle East respiratory syndrome coronavirus and the upcoming Hajj.</a> (<a href="http://www.wikidata.org/entity/Q44210115">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>24141864</td>
  </tr>
  <tr>
    <td>2013-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40230806">Middle East respiratory syndrome novel corona MERS-CoV infection. Epidemiology and outcome update.</a> (<a href="http://www.wikidata.org/entity/Q40230806">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>24145930</td>
  </tr>
  <tr>
    <td>2013-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54385689">[Update on the Middle East respiratory syndrome: 2013].</a> (<a href="http://www.wikidata.org/entity/Q54385689">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>24378005</td>
  </tr>
  <tr>
    <td>2013-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42266590">Preventive measures against MERS-CoV for Hajj pilgrims.</a> (<a href="http://www.wikidata.org/entity/Q42266590">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(13)70259-7</td>
    <td>24070554</td>
  </tr>
  <tr>
    <td>2013-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54675118">Hospital-associated Middle East respiratory syndrome coronavirus infections.</a> (<a href="http://www.wikidata.org/entity/Q54675118">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1056/NEJMC1311004</td>
    <td>24171524</td>
  </tr>
  <tr>
    <td>2013-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51860799">Hospital-associated Middle East respiratory syndrome coronavirus infections.</a> (<a href="http://www.wikidata.org/entity/Q51860799">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1056/NEJMC1311004#SA1</td>
    <td>24171525</td>
  </tr>
  <tr>
    <td>2013-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27679307">Crystal Structure of the Receptor-Binding Domain from Newly Emerged Middle East Respiratory Syndrome Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q27679307">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01756-13</td>
    <td>23903833</td>
  </tr>
  <tr>
    <td>2013-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43507223">Emerging human middle East respiratory syndrome coronavirus causes widespread infection and alveolar damage in human lungs.</a> (<a href="http://www.wikidata.org/entity/Q43507223">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1164/RCCM.201305-0954LE</td>
    <td>24083868</td>
  </tr>
  <tr>
    <td>2013-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42931174">Close relative of human Middle East respiratory syndrome coronavirus in bat, South Africa.</a> (<a href="http://www.wikidata.org/entity/Q42931174">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3201/EID1910.130946</td>
    <td>24050621</td>
  </tr>
  <tr>
    <td>2013-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q48156946">Acute febrile respiratory infection symptoms in Australian Hajjis at risk of exposure to Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q48156946">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5694/MJA13.10984</td>
    <td>24099191</td>
  </tr>
  <tr>
    <td>2013-09-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34656339">Delayed induction of proinflammatory cytokines and suppression of innate antiviral response by the novel Middle East respiratory syndrome coronavirus: implications for pathogenesis and treatment.</a> (<a href="http://www.wikidata.org/entity/Q34656339">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1099/VIR.0.055533-0</td>
    <td>24077366</td>
  </tr>
  <tr>
    <td>2013-09-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41920484">Inhibition of Middle East respiratory syndrome coronavirus infection by anti-CD26 monoclonal antibody.</a> (<a href="http://www.wikidata.org/entity/Q41920484">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.02448-13</td>
    <td>24067970</td>
  </tr>
  <tr>
    <td>2013-09-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42246665">Active replication of Middle East respiratory syndrome coronavirus and aberrant induction of inflammatory cytokines and chemokines in human macrophages: implications for pathogenesis.</a> (<a href="http://www.wikidata.org/entity/Q42246665">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIT504</td>
    <td>24065148</td>
  </tr>
  <tr>
    <td>2013-09-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37236553">Middle East respiratory syndrome coronavirus (MERS-CoV) causes transient lower respiratory tract infection in rhesus macaques</a> (<a href="http://www.wikidata.org/entity/Q37236553">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1073/PNAS.1310744110</td>
    <td>24062443</td>
  </tr>
  <tr>
    <td>2013-09-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50580801">Novel Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q50580801">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JFMA.2013.08.009</td>
    <td>24055338</td>
  </tr>
  <tr>
    <td>2013-09-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37504790">Transmission and evolution of the Middle East respiratory syndrome coronavirus in Saudi Arabia: a descriptive genomic study.</a> (<a href="http://www.wikidata.org/entity/Q37504790">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S0140-6736(13)61887-5</td>
    <td>24055451</td>
  </tr>
  <tr>
    <td>2013-09-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42246974">Tracking the transmission and evolution of MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q42246974">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S0140-6736(13)61955-8</td>
    <td>24055454</td>
  </tr>
  <tr>
    <td>2013-09-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42245871">Stability of Middle East respiratory syndrome coronavirus (MERS-CoV) under different environmental conditions.</a> (<a href="http://www.wikidata.org/entity/Q42245871">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES2013.18.38.20590</td>
    <td>24084338</td>
  </tr>
  <tr>
    <td>2013-09-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37218442">Reverse genetics with a full-length infectious cDNA of the Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q37218442">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1073/PNAS.1311542110</td>
    <td>24043791</td>
  </tr>
  <tr>
    <td>2013-09-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43363500">Novel Middle East respiratory syndrome and renal failure.</a> (<a href="http://www.wikidata.org/entity/Q43363500">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.3109/0886022X.2013.832316</td>
    <td>24028462</td>
  </tr>
  <tr>
    <td>2013-09-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43593203">Response to "Novel Middle East respiratory syndrome coronavirus".</a> (<a href="http://www.wikidata.org/entity/Q43593203">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JFMA.2013.08.007</td>
    <td>24035570</td>
  </tr>
  <tr>
    <td>2013-09-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43848707">Middle East Respiratory Syndrome (MERS) coronavirus. What travel health advice should be given to Hajj pilgrims?</a> (<a href="http://www.wikidata.org/entity/Q43848707">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.TMAID.2013.08.009</td>
    <td>24055442</td>
  </tr>
  <tr>
    <td>2013-09-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37254398">Middle East respiratory syndrome coronavirus accessory protein 4a is a type I interferon antagonist.</a> (<a href="http://www.wikidata.org/entity/Q37254398">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01845-13</td>
    <td>24027320</td>
  </tr>
  <tr>
    <td>2013-09-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37336487">Middle East respiratory syndrome coronavirus infection mediated by the transmembrane serine protease TMPRSS2.</a> (<a href="http://www.wikidata.org/entity/Q37336487">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01890-13</td>
    <td>24027332</td>
  </tr>
  <tr>
    <td>2013-09-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37174550">Engineering a replication-competent, propagation-defective Middle East respiratory syndrome coronavirus as a vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q37174550">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.00650-13</td>
    <td>24023385</td>
  </tr>
  <tr>
    <td>2013-09-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33887877">Treatment with interferon-α2b and ribavirin improves outcome in MERS-CoV-infected rhesus macaques</a> (<a href="http://www.wikidata.org/entity/Q33887877">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/NM.3362</td>
    <td>24013700</td>
  </tr>
  <tr>
    <td>2013-09-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21131373">Emergence of the Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q21131373">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PPAT.1003595</td>
    <td>24039577</td>
  </tr>
  <tr>
    <td>2013-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41967118">Updated information on the epidemiology of Middle East respiratory syndrome coronavirus (MERS-CoV) infection and guidance for the public, clinicians, and public health authorities, 2012-2013.</a> (<a href="http://www.wikidata.org/entity/Q41967118">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>24067584</td>
  </tr>
  <tr>
    <td>2013-08-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38133082">Therapeutic options for Middle East respiratory syndrome coronavirus (MERS-CoV)--possible lessons from a systematic review of SARS-CoV therapy.</a> (<a href="http://www.wikidata.org/entity/Q38133082">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2013.07.002</td>
    <td>23993766</td>
  </tr>
  <tr>
    <td>2013-08-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42249511">Middle East respiratory syndrome coronavirus spike protein delivered by modified vaccinia virus Ankara efficiently induces virus-neutralizing antibodies.</a> (<a href="http://www.wikidata.org/entity/Q42249511">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01672-13</td>
    <td>23986586</td>
  </tr>
  <tr>
    <td>2013-08-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37252823">Assessing activity and inhibition of Middle East respiratory syndrome coronavirus papain-like and 3C-like proteases using luciferase-based biosensors.</a> (<a href="http://www.wikidata.org/entity/Q37252823">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.02105-13</td>
    <td>23986593</td>
  </tr>
  <tr>
    <td>2013-08-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37152873">A safe and convenient pseudovirus-based inhibition assay to detect neutralizing antibodies and screen for viral entry inhibitors against the novel human coronavirus MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q37152873">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/1743-422X-10-266</td>
    <td>23978242</td>
  </tr>
  <tr>
    <td>2013-08-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42249491">Investigation of an imported case of Middle East Respiratory Syndrome Coronavirus (MERS-CoV) infection in Florence, Italy, May to June 2013.</a> (<a href="http://www.wikidata.org/entity/Q42249491">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2807/1560-7917.ES2013.18.34.20564</td>
    <td>23987829</td>
  </tr>
  <tr>
    <td>2013-08-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37105685">The Middle East respiratory syndrome--how worried should we be?</a> (<a href="http://www.wikidata.org/entity/Q37105685">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/MBIO.00531-13</td>
    <td>23963179</td>
  </tr>
  <tr>
    <td>2013-08-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42251659">Middle East respiratory syndrome coronavirus neutralising serum antibodies in dromedary camels: a comparative serological study.</a> (<a href="http://www.wikidata.org/entity/Q42251659">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(13)70164-6</td>
    <td>23933067</td>
  </tr>
  <tr>
    <td>2013-08-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36703064">MERS-CoV: the intermediate host identified?</a> (<a href="http://www.wikidata.org/entity/Q36703064">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(13)70193-2</td>
    <td>23933068</td>
  </tr>
  <tr>
    <td>2013-08-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38126808">A novel human coronavirus: Middle East respiratory syndrome human coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q38126808">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S11427-013-4519-8</td>
    <td>23917839</td>
  </tr>
  <tr>
    <td>2013-08-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45723498">Middle East respiratory syndrome coronavirus infections in health care workers.</a> (<a href="http://www.wikidata.org/entity/Q45723498">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1056/NEJMC1308698</td>
    <td>23923992</td>
  </tr>
  <tr>
    <td>2013-08-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37247481">Clinical impact of human coronaviruses 229E and OC43 infection in diverse adult populations</a> (<a href="http://www.wikidata.org/entity/Q37247481">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1093/INFDIS/JIT393</td>
    <td>23922367</td>
  </tr>
  <tr>
    <td>2013-08-06T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37247481">Clinical impact of human coronaviruses 229E and OC43 infection in diverse adult populations</a> (<a href="http://www.wikidata.org/entity/Q37247481">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1093/INFDIS/JIT393</td>
    <td>23922367</td>
  </tr>
  <tr>
    <td>2013-08-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33409531">A family cluster of Middle East Respiratory Syndrome Coronavirus infections related to a likely unrecognized asymptomatic or mild case.</a> (<a href="http://www.wikidata.org/entity/Q33409531">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.IJID.2013.07.001</td>
    <td>23916548</td>
  </tr>
  <tr>
    <td>2013-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44178348">The Middle East Respiratory Syndrome Coronavirus (MERS-CoV) and Singapore.</a> (<a href="http://www.wikidata.org/entity/Q44178348">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>24045372</td>
  </tr>
  <tr>
    <td>2013-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42257869">Middle East Respiratory Syndrome coronavirus (MERS CoV): Update 2013.</a> (<a href="http://www.wikidata.org/entity/Q42257869">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1007/S11908-013-0344-2</td>
    <td>23793899</td>
  </tr>
  <tr>
    <td>2013-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44603597">Need for global cooperation in control of MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q44603597">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(13)70205-6</td>
    <td>23886321</td>
  </tr>
  <tr>
    <td>2013-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27678981">Structure of MERS-CoV spike receptor-binding domain complexed with human receptor DPP4</a> (<a href="http://www.wikidata.org/entity/Q27678981">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/CR.2013.92</td>
    <td>23835475</td>
  </tr>
  <tr>
    <td>2013-07-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42279748">The ORF4a protein of human coronavirus 229E functions as a viroporin that regulates viral production.</a> (<a href="http://www.wikidata.org/entity/Q42279748">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/J.BBAMEM.2013.07.025</td>
    <td>23906728</td>
  </tr>
  <tr>
    <td>2013-07-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30217260">"Don't forget the migrants": exploring preparedness and response strategies to combat the potential spread of MERS-CoV virus through migrant workers in Sri Lanka</a> (<a href="http://www.wikidata.org/entity/Q30217260">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.12688/F1000RESEARCH.2-163.V1</td>
    <td>24555078</td>
  </tr>
  <tr>
    <td>2013-07-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38133709">Middle East Respiratory Syndrome-coronavirus infection: an overview.</a> (<a href="http://www.wikidata.org/entity/Q38133709">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2013.06.001</td>
    <td>23999347</td>
  </tr>
  <tr>
    <td>2013-07-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33409373">Epidemiological, demographic, and clinical characteristics of 47 cases of Middle East respiratory syndrome coronavirus disease from Saudi Arabia: a descriptive study.</a> (<a href="http://www.wikidata.org/entity/Q33409373">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(13)70204-4</td>
    <td>23891402</td>
  </tr>
  <tr>
    <td>2013-07-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34875544">Human coronavirus HKU1 infection of primary human type II alveolar epithelial cells: cytopathic effects and innate immune response.</a> (<a href="http://www.wikidata.org/entity/Q34875544">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0070129</td>
    <td>23894604</td>
  </tr>
  <tr>
    <td>2013-07-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38123917">The emerging novel Middle East respiratory syndrome coronavirus: the "knowns" and "unknowns".</a> (<a href="http://www.wikidata.org/entity/Q38123917">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JFMA.2013.05.010</td>
    <td>23883791</td>
  </tr>
  <tr>
    <td>2013-07-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51870111">Correlating cell line studies with tissue distribution of DPP4/TMPRSS2 and human biological samples may better define the viral tropism of MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q51870111">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1093/INFDIS/JIT330</td>
    <td>23878322</td>
  </tr>
  <tr>
    <td>2013-07-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30222093">Potential for the international spread of middle East respiratory syndrome in association with mass gatherings in saudi arabia.</a> (<a href="http://www.wikidata.org/entity/Q30222093">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/CURRENTS.OUTBREAKS.A7B70897AC2FA4F79B59F90D24C860B8</td>
    <td>23884087</td>
  </tr>
  <tr>
    <td>2013-07-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42152380">Molecular basis of binding between novel human coronavirus MERS-CoV and its receptor CD26.</a> (<a href="http://www.wikidata.org/entity/Q42152380">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1038/NATURE12328</td>
    <td>23831647</td>
  </tr>
  <tr>
    <td>2013-07-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30351904">Interhuman transmissibility of Middle East respiratory syndrome coronavirus: estimation of pandemic risk.</a> (<a href="http://www.wikidata.org/entity/Q30351904">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S0140-6736(13)61492-0</td>
    <td>23831141</td>
  </tr>
  <tr>
    <td>2013-07-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30351906">Assessing the pandemic potential of MERS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q30351906">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S0140-6736(13)61504-4</td>
    <td>23831143</td>
  </tr>
  <tr>
    <td>2013-07-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30432706">Identification of a receptor-binding domain in the S protein of the novel human coronavirus Middle East respiratory syndrome coronavirus as an essential target for vaccine development.</a> (<a href="http://www.wikidata.org/entity/Q30432706">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01048-13</td>
    <td>23824801</td>
  </tr>
  <tr>
    <td>2013-07-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37123548">Bilateral entry and release of Middle East respiratory syndrome coronavirus induces profound apoptosis of human bronchial epithelial cells.</a> (<a href="http://www.wikidata.org/entity/Q37123548">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01562-13</td>
    <td>23824802</td>
  </tr>
  <tr>
    <td>2013-07-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45349827">The emergence of a new corona virus--MERS-CoV: hind sight is always 20/20.</a> (<a href="http://www.wikidata.org/entity/Q45349827">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.JIPH.2013.06.002</td>
    <td>23999344</td>
  </tr>
  <tr>
    <td>2013-07-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36976427">The Middle East respiratory syndrome coronavirus (MERS-CoV) does not replicate in Syrian hamsters.</a> (<a href="http://www.wikidata.org/entity/Q36976427">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0069127</td>
    <td>23844250</td>
  </tr>
  <tr>
    <td>2013-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42255644">Update: Recommendations for Middle East respiratory syndrome coronavirus (MERS-CoV).</a> (<a href="http://www.wikidata.org/entity/Q42255644">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>23842446</td>
  </tr>
  <tr>
    <td>2013-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24604486">Middle East respiratory syndrome coronavirus (MERS-CoV): announcement of the Coronavirus Study Group</a> (<a href="http://www.wikidata.org/entity/Q24604486">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01244-13</td>
    <td>23678167</td>
  </tr>
  <tr>
    <td>2013-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42252942">The Struggle Against MERS-CoV (The Novel Coronavirus).</a> (<a href="http://www.wikidata.org/entity/Q42252942">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5001/OMJ.2013.66</td>
    <td>23904912</td>
  </tr>
  <tr>
    <td>2013-06-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39134260">Isolation and genetic characterization of human coronavirus NL63 in primary human renal proximal tubular epithelial cells obtained from a commercial supplier, and confirmation of its replication in two different types of human primary kidney cells</a> (<a href="http://www.wikidata.org/entity/Q39134260">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1186/1743-422X-10-213</td>
    <td>23805916</td>
  </tr>
  <tr>
    <td>2013-06-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30432264">Middle East respiratory syndrome coronavirus (MERS-CoV): challenges in identifying its source and controlling its spread.</a> (<a href="http://www.wikidata.org/entity/Q30432264">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.MICINF.2013.06.003</td>
    <td>23791956</td>
  </tr>
  <tr>
    <td>2013-06-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33642332">Hospital outbreak of Middle East respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q33642332">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1056/NEJMOA1306742</td>
    <td>23782161</td>
  </tr>
  <tr>
    <td>2013-06-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34653419">The receptor binding domain of the new Middle East respiratory syndrome coronavirus maps to a 231-residue region in the spike protein that efficiently elicits neutralizing antibodies.</a> (<a href="http://www.wikidata.org/entity/Q34653419">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1128/JVI.01277-13</td>
    <td>23785207</td>
  </tr>
  <tr>
    <td>2013-06-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34653376">Clinical features and virological analysis of a case of Middle East respiratory syndrome coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q34653376">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S1473-3099(13)70154-3</td>
    <td>23782859</td>
  </tr>
  <tr>
    <td>2013-06-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42258061">First cases of Middle East Respiratory Syndrome Coronavirus (MERS-CoV) infections in France, investigations and implications for the prevention of human-to-human transmission, France, May 2013.</a> (<a href="http://www.wikidata.org/entity/Q42258061">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>23787161</td>
  </tr>
  <tr>
    <td>2013-06-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34653451">Transmission scenarios for Middle East Respiratory Syndrome Coronavirus (MERS-CoV) and how to tell them apart.</a> (<a href="http://www.wikidata.org/entity/Q34653451">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>23787162</td>
  </tr>
  <tr>
    <td>2013-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q50547912">[Emergency treatment for Middle Eastern coronaviruses (MERS-CoV].</a> (<a href="http://www.wikidata.org/entity/Q50547912">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>23882919</td>
  </tr>
  <tr>
    <td>2013-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34653021">Update: Severe respiratory illness associated with Middle East Respiratory Syndrome Coronavirus (MERS-CoV)--worldwide, 2012-2013.</a> (<a href="http://www.wikidata.org/entity/Q34653021">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td></td>
    <td>23760190</td>
  </tr>
  <tr>
    <td>2013-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27676849">Crystal structure-based exploration of the important role of Arg106 in the RNA-binding domain of human coronavirus OC43 nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q27676849">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1016/J.BBAPAP.2013.03.003</td>
    <td>23501675</td>
  </tr>
  <tr>
    <td>2013-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43544267">[Novel coronavirus (NcOV)].</a> (<a href="http://www.wikidata.org/entity/Q43544267">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/J.LPM.2013.05.001</td>
    <td>23768631</td>
  </tr>
  <tr>
    <td>2013-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44605846">MERS-CoV: in search of answers.</a> (<a href="http://www.wikidata.org/entity/Q44605846">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S0140-6736(13)61228-3</td>
    <td>23776959</td>
  </tr>
  <tr>
    <td>2013-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42287345">Middle East respiratory syndrome: new disease, old lessons.</a> (<a href="http://www.wikidata.org/entity/Q42287345">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S0140-6736(13)61412-9</td>
    <td>23809548</td>
  </tr>
  <tr>
    <td>2013-05-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34347979">Clinical features and viral diagnosis of two cases of infection with Middle East Respiratory Syndrome coronavirus: a report of nosocomial transmission.</a> (<a href="http://www.wikidata.org/entity/Q34347979">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1016/S0140-6736(13)60982-4</td>
    <td>23727167</td>
  </tr>
  <tr>
    <td>2013-05-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34347450">Family cluster of Middle East respiratory syndrome coronavirus infections.</a> (<a href="http://www.wikidata.org/entity/Q34347450">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1056/NEJMOA1303729</td>
    <td>23718156</td>
  </tr>
  <tr>
    <td>2013-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40260138">Severity and outcome associated with human coronavirus OC43 infections among children.</a> (<a href="http://www.wikidata.org/entity/Q40260138">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1097/INF.0B013E3182812787</td>
    <td>23337903</td>
  </tr>
  <tr>
    <td>2013-03-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39174513">TMPRSS2 activates the human coronavirus 229E for cathepsin-independent host cell entry and is expressed in viral target cells in the respiratory epithelium.</a> (<a href="http://www.wikidata.org/entity/Q39174513">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1128/JVI.03372-12</td>
    <td>23536651</td>
  </tr>
  <tr>
    <td>2013-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45715502">[Prokaryotic expression and characterization of two recombinant receptor-binding domain(RBD) proteins of human coronavirus NL63(HcoV-NL63)].</a> (<a href="http://www.wikidata.org/entity/Q45715502">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td></td>
    <td>23757838</td>
  </tr>
  <tr>
    <td>2013-01-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36667998">The acetyl-esterase activity of the hemagglutinin-esterase protein of human coronavirus OC43 strongly enhances the production of infectious virus.</a> (<a href="http://www.wikidata.org/entity/Q36667998">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1128/JVI.02699-12</td>
    <td>23283955</td>
  </tr>
  <tr>
    <td>2013-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27683531">Design, synthesis and crystallographic analysis of nitrile-based broad-spectrum peptidomimetic inhibitors for coronavirus 3C-like proteases</a> (<a href="http://www.wikidata.org/entity/Q27683531">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.EJMECH.2012.10.053</td>
    <td>23202846</td>
  </tr>
  <tr>
    <td>2013-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21231948">Adaptive evolution of bat dipeptidyl peptidase 4 (dpp4): implications for the origin and emergence of Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q21231948">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1186/1743-422X-10-304</td>
    <td>24107353</td>
  </tr>
  <tr>
    <td>2013-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21128649">State of Knowledge and Data Gaps of Middle East Respiratory Syndrome Coronavirus (MERS-CoV) in Humans</a> (<a href="http://www.wikidata.org/entity/Q21128649">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1371/CURRENTS.OUTBREAKS.0BF719E352E7478F8AD85FA30127DDB8</td>
    <td>24270606</td>
  </tr>
  <tr>
    <td>2013-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43448034">[A novel coronavirus, MERS-CoV].</a> (<a href="http://www.wikidata.org/entity/Q43448034">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.2222/JSV.63.1</td>
    <td>24769571</td>
  </tr>
  <tr>
    <td>2013-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q26999367">Middle East Respiratory Syndrome Coronavirus (MERS-CoV): a perpetual challenge</a> (<a href="http://www.wikidata.org/entity/Q26999367">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.5144/0256-4947.2013.427</td>
    <td>24188935</td>
  </tr>
  <tr>
    <td>2012-12-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36482792">Identification and characterization of a novel alpaca respiratory coronavirus most closely related to the human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q36482792">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.3390/V4123689</td>
    <td>23235471</td>
  </tr>
  <tr>
    <td>2012-11-22T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39239315">Oligomerization of the carboxyl terminal domain of the human coronavirus 229E nucleocapsid protein.</a> (<a href="http://www.wikidata.org/entity/Q39239315">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/J.FEBSLET.2012.11.016</td>
    <td>23178926</td>
  </tr>
  <tr>
    <td>2012-11-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46715936">Immunoreactivity characterisation of the three structural regions of the human coronavirus OC43 nucleocapsid protein by Western blot: implications for the diagnosis of coronavirus infection.</a> (<a href="http://www.wikidata.org/entity/Q46715936">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1016/J.JVIROMET.2012.11.009</td>
    <td>23174159</td>
  </tr>
  <tr>
    <td>2012-11-14T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40267679">Prevalence and molecular epidemiology of human coronavirus HKU1 in patients with acute respiratory illness.</a> (<a href="http://www.wikidata.org/entity/Q40267679">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td>10.1002/JMV.23465</td>
    <td>23161446</td>
  </tr>
  <tr>
    <td>2012-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36154794">Characterization and complete genome sequence of human coronavirus NL63 isolated in China</a> (<a href="http://www.wikidata.org/entity/Q36154794">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1128/JVI.01457-12</td>
    <td>22879617</td>
  </tr>
  <tr>
    <td>2012-08-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q56795534">The first complete genome sequences of clinical isolates of human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q56795534">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1007/S11262-012-0807-9</td>
    <td>22926811</td>
  </tr>
  <tr>
    <td>2012-06-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39327732">Replication-dependent downregulation of cellular angiotensin-converting enzyme 2 protein expression by human coronavirus NL63.</a> (<a href="http://www.wikidata.org/entity/Q39327732">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1099/VIR.0.043919-0</td>
    <td>22718567</td>
  </tr>
  <tr>
    <td>2012-06-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45108495">Human coronavirus NL63 in hospitalized children with respiratory infection: a 2-year study from Chongqing, China.</a> (<a href="http://www.wikidata.org/entity/Q45108495">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1007/S13312-012-0194-1</td>
    <td>22728623</td>
  </tr>
  <tr>
    <td>2012-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54324462">Human coronavirus NL63 in children: epidemiology, disease spectrum, and genetic diversity.</a> (<a href="http://www.wikidata.org/entity/Q54324462">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td></td>
    <td>22311358</td>
  </tr>
  <tr>
    <td>2011-12-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q56795531">The dominance of human coronavirus OC43 and NL63 infections in infants</a> (<a href="http://www.wikidata.org/entity/Q56795531">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1016/J.JCV.2011.11.011</td>
    <td>22188723</td>
  </tr>
  <tr>
    <td>2011-12-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q56795531">The dominance of human coronavirus OC43 and NL63 infections in infants</a> (<a href="http://www.wikidata.org/entity/Q56795531">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1016/J.JCV.2011.11.011</td>
    <td>22188723</td>
  </tr>
  <tr>
    <td>2011-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24635003">Molecular epidemiology of human coronavirus OC43 reveals evolution of different genotypes over time and recent emergence of a novel genotype due to natural recombination</a> (<a href="http://www.wikidata.org/entity/Q24635003">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1128/JVI.05512-11</td>
    <td>21849456</td>
  </tr>
  <tr>
    <td>2011-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57096902">Development of a recombinant truncated nucleocapsid protein based immunoassay for detection of antibodies against human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q57096902">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1016/J.JVIROMET.2011.07.005</td>
    <td>21801752</td>
  </tr>
  <tr>
    <td>2011-08-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27671833">Peptide aldehyde inhibitors challenge the substrate specificity of the SARS-coronavirus main protease</a> (<a href="http://www.wikidata.org/entity/Q27671833">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2011.08.001</td>
    <td>21854807</td>
  </tr>
  <tr>
    <td>2011-07-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39499054">Characterization of the spike protein of human coronavirus NL63 in receptor binding and pseudotype virus entry.</a> (<a href="http://www.wikidata.org/entity/Q39499054">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1016/J.VIRUSRES.2011.06.029</td>
    <td>21798295</td>
  </tr>
  <tr>
    <td>2011-04-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39551895">The ADP-ribose-1''-monophosphatase domains of severe acute respiratory syndrome coronavirus and human coronavirus 229E mediate resistance to antiviral interferon responses.</a> (<a href="http://www.wikidata.org/entity/Q39551895">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1099/VIR.0.031856-0</td>
    <td>21525212</td>
  </tr>
  <tr>
    <td>2011-02-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35200140">Infection with human coronavirus NL63 enhances streptococcal adherence to epithelial cells.</a> (<a href="http://www.wikidata.org/entity/Q35200140">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1099/VIR.0.028381-0</td>
    <td>21325482</td>
  </tr>
  <tr>
    <td>2011-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39776710">Human coronavirus NL63: a clinically important virus?</a> (<a href="http://www.wikidata.org/entity/Q39776710">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.2217/FMB.10.166</td>
    <td>21366416</td>
  </tr>
  <tr>
    <td>2010-10-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27664407">The membrane protein of severe acute respiratory syndrome coronavirus acts as a dominant immunogen revealed by a clustering region of novel functionally and structurally defined cytotoxic T-lymphocyte epitopes</a> (<a href="http://www.wikidata.org/entity/Q27664407">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1086/656315</td>
    <td>20831383</td>
  </tr>
  <tr>
    <td>2010-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44276701">[Development of serological detection assays for human coronavirus HKU1 infection and its application].</a> (<a href="http://www.wikidata.org/entity/Q44276701">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td></td>
    <td>21280330</td>
  </tr>
  <tr>
    <td>2010-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27664055">NMR Structure of the SARS-CoV Nonstructural Protein 7 in Solution at pH 6.5</a> (<a href="http://www.wikidata.org/entity/Q27664055">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.JMB.2010.07.043</td>
    <td>20709084</td>
  </tr>
  <tr>
    <td>2010-09-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39653838">Antiseptic properties of two calix[4]arenes derivatives on the human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q39653838">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2010.09.009</td>
    <td>20854844</td>
  </tr>
  <tr>
    <td>2010-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40350957">Role of human coronavirus NL63 in hospitalized children with croup.</a> (<a href="http://www.wikidata.org/entity/Q40350957">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1097/INF.0B013E3181DE9C2E</td>
    <td>20720471</td>
  </tr>
  <tr>
    <td>2010-08-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34190552">Culturing the unculturable: human coronavirus HKU1 infects, replicates, and produces progeny virions in human ciliated airway epithelial cell cultures.</a> (<a href="http://www.wikidata.org/entity/Q34190552">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td>10.1128/JVI.00947-10</td>
    <td>20719951</td>
  </tr>
  <tr>
    <td>2010-07-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27661782">SARS Coronavirus Unique Domain: Three-Domain Molecular Architecture in Solution and RNA Binding</a> (<a href="http://www.wikidata.org/entity/Q27661782">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.JMB.2010.05.027</td>
    <td>20493876</td>
  </tr>
  <tr>
    <td>2010-05-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27660870">Mutation of Asn28 Disrupts the Dimerization and Enzymatic Activity of SARS 3CL pro</a> (<a href="http://www.wikidata.org/entity/Q27660870">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1021/BI1002585</td>
    <td>20420403</td>
  </tr>
  <tr>
    <td>2010-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27666447">Three-dimensional domain swapping as a mechanism to lock the active conformation in a super-active octamer of SARS-CoV main protease</a> (<a href="http://www.wikidata.org/entity/Q27666447">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1007/S13238-010-0044-8</td>
    <td>21203949</td>
  </tr>
  <tr>
    <td>2010-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33904997">A 219-mer CHO-expressing receptor-binding domain of SARS-CoV S protein induces potent immune responses and protective immunity</a> (<a href="http://www.wikidata.org/entity/Q33904997">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>10.1089/VIM.2009.0090</td>
    <td>20374001</td>
  </tr>
  <tr>
    <td>2010-01-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39751469">Human coronavirus NL63 open reading frame 3 encodes a virion-incorporated N-glycosylated membrane protein.</a> (<a href="http://www.wikidata.org/entity/Q39751469">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1186/1743-422X-7-6</td>
    <td>20078868</td>
  </tr>
  <tr>
    <td>2009-12-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33519556">The SARS Coronavirus 3a protein causes endoplasmic reticulum stress and induces ligand-independent downregulation of the type 1 interferon receptor.</a> (<a href="http://www.wikidata.org/entity/Q33519556">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1371/JOURNAL.PONE.0008342</td>
    <td>20020050</td>
  </tr>
  <tr>
    <td>2009-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39711479">Comparative host gene transcription by microarray analysis early after infection of the Huh7 cell line by SARS coronavirus and human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q39711479">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td></td>
    <td>20393221</td>
  </tr>
  <tr>
    <td>2009-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39711479">Comparative host gene transcription by microarray analysis early after infection of the Huh7 cell line by SARS coronavirus and human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q39711479">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td></td>
    <td>20393221</td>
  </tr>
  <tr>
    <td>2009-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27657787">Nuclear Magnetic Resonance Structure of the Nucleic Acid-Binding Domain of Severe Acute Respiratory Syndrome Coronavirus Nonstructural Protein 3</a> (<a href="http://www.wikidata.org/entity/Q27657787">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.01253-09</td>
    <td>19828617</td>
  </tr>
  <tr>
    <td>2009-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37457784">Elucidation of the stability and functional regions of the human coronavirus OC43 nucleocapsid protein.</a> (<a href="http://www.wikidata.org/entity/Q37457784">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1002/PRO.225</td>
    <td>19691129</td>
  </tr>
  <tr>
    <td>2009-10-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39785024">A human coronavirus OC43 variant harboring persistence-associated mutations in the S glycoprotein differentially induces the unfolded protein response in human neurons as compared to wild-type virus.</a> (<a href="http://www.wikidata.org/entity/Q39785024">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1016/J.VIROL.2009.09.026</td>
    <td>19846189</td>
  </tr>
  <tr>
    <td>2009-10-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33558501">Differential downregulation of ACE2 by the spike proteins of severe acute respiratory syndrome coronavirus and human coronavirus NL63.</a> (<a href="http://www.wikidata.org/entity/Q33558501">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1128/JVI.01248-09</td>
    <td>19864379</td>
  </tr>
  <tr>
    <td>2009-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40361476">[Characterization of human coronavirus 229E infection among patients with respiratory symptom in Beijing, Oct-Dec, 2007].</a> (<a href="http://www.wikidata.org/entity/Q40361476">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td></td>
    <td>20387489</td>
  </tr>
  <tr>
    <td>2009-09-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37410577">Epidemiology and clinical presentations of human coronavirus NL63 infections in hong kong children.</a> (<a href="http://www.wikidata.org/entity/Q37410577">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1128/JCM.00832-09</td>
    <td>19759228</td>
  </tr>
  <tr>
    <td>2009-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33644581">Distant relatives of severe acute respiratory syndrome coronavirus and close relatives of human coronavirus 229E in bats, Ghana.</a> (<a href="http://www.wikidata.org/entity/Q33644581">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.3201/EID1509.090224</td>
    <td>19788804</td>
  </tr>
  <tr>
    <td>2009-06-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39836815">Studies on membrane topology, N-glycosylation and functionality of SARS-CoV membrane protein.</a> (<a href="http://www.wikidata.org/entity/Q39836815">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1186/1743-422X-6-79</td>
    <td>19534833</td>
  </tr>
  <tr>
    <td>2009-06-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38613023">More and More Coronaviruses: Human Coronavirus HKU1.</a> (<a href="http://www.wikidata.org/entity/Q38613023">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td>10.3390/V1010057</td>
    <td>21994538</td>
  </tr>
  <tr>
    <td>2009-06-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37274730">Antiviral activity of chloroquine against human coronavirus OC43 infection in newborn mice.</a> (<a href="http://www.wikidata.org/entity/Q37274730">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1128/AAC.01509-08</td>
    <td>19506054</td>
  </tr>
  <tr>
    <td>2009-06-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27655351">Two adjacent mutations on the dimer interface of SARS coronavirus 3C-like protease cause different conformational changes in crystal structure</a> (<a href="http://www.wikidata.org/entity/Q27655351">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.VIROL.2009.03.034</td>
    <td>19409595</td>
  </tr>
  <tr>
    <td>2009-05-15T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27654446">Structural insights into immune recognition of the severe acute respiratory syndrome coronavirus S protein receptor binding domain</a> (<a href="http://www.wikidata.org/entity/Q27654446">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.JMB.2009.03.042</td>
    <td>19324051</td>
  </tr>
  <tr>
    <td>2009-05-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47931510">The ion channel activity of the SARS-coronavirus 3a protein is linked to its pro-apoptotic function.</a> (<a href="http://www.wikidata.org/entity/Q47931510">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.BIOCEL.2009.04.019</td>
    <td>19398035</td>
  </tr>
  <tr>
    <td>2009-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27655455">The SARS-Unique Domain (SUD) of SARS Coronavirus Contains Two Macrodomains That Bind G-Quadruplexes</a> (<a href="http://www.wikidata.org/entity/Q27655455">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1371/JOURNAL.PPAT.1000428</td>
    <td>19436709</td>
  </tr>
  <tr>
    <td>2009-04-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37175335">Expression, crystallization and preliminary crystallographic study of human coronavirus HKU1 nonstructural protein 9.</a> (<a href="http://www.wikidata.org/entity/Q37175335">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td>10.1107/S1744309109014055</td>
    <td>19407394</td>
  </tr>
  <tr>
    <td>2009-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27654334">C-terminal domain of sars-CoV main protease can form a 3d domain-swapped dimer</a> (<a href="http://www.wikidata.org/entity/Q27654334">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1002/PRO.76</td>
    <td>19319935</td>
  </tr>
  <tr>
    <td>2009-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27653455">Severe Acute Respiratory Syndrome Coronavirus nsp9 Dimerization Is Essential for Efficient Viral Growth</a> (<a href="http://www.wikidata.org/entity/Q27653455">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.01505-08</td>
    <td>19153232</td>
  </tr>
  <tr>
    <td>2009-03-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37138587">Activation of the SARS coronavirus spike protein via sequential proteolytic cleavage at two distinct sites</a> (<a href="http://www.wikidata.org/entity/Q37138587">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1073/PNAS.0809524106</td>
    <td>19321428</td>
  </tr>
  <tr>
    <td>2009-03-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27653428">Structural Basis of Inhibition Specificities of 3C and 3C-like Proteases by Zinc-coordinating and Peptidomimetic Compounds</a> (<a href="http://www.wikidata.org/entity/Q27653428">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1074/JBC.M807947200</td>
    <td>19144641</td>
  </tr>
  <tr>
    <td>2009-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27653024">Nuclear Magnetic Resonance Structure Shows that the Severe Acute Respiratory Syndrome Coronavirus-Unique Domain Contains a Macrodomain Fold</a> (<a href="http://www.wikidata.org/entity/Q27653024">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.01781-08</td>
    <td>19052085</td>
  </tr>
  <tr>
    <td>2008-11-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27651521">Variable oligomerization modes in coronavirus non-structural protein 9</a> (<a href="http://www.wikidata.org/entity/Q27651521">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/J.JMB.2008.07.071</td>
    <td>18694760</td>
  </tr>
  <tr>
    <td>2008-11-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41829011">Plaque assay for human coronavirus NL63 using human colon carcinoma cells.</a> (<a href="http://www.wikidata.org/entity/Q41829011">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1186/1743-422X-5-138</td>
    <td>19014487</td>
  </tr>
  <tr>
    <td>2008-10-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37033358">Protease-mediated entry via the endosome of human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q37033358">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1128/JVI.01933-08</td>
    <td>18971274</td>
  </tr>
  <tr>
    <td>2008-10-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39930184">Spike protein, S, of human coronavirus HKU1: role in viral life cycle and application in antibody detection.</a> (<a href="http://www.wikidata.org/entity/Q39930184">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td>10.3181/0806-RM-197</td>
    <td>18849544</td>
  </tr>
  <tr>
    <td>2008-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24321396">Neuroprotective effect of apolipoprotein D against human coronavirus OC43-induced encephalitis in mice</a> (<a href="http://www.wikidata.org/entity/Q24321396">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1523/JNEUROSCI.2644-08.2008</td>
    <td>18842892</td>
  </tr>
  <tr>
    <td>2008-09-25T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36974687">Systematic assembly of a full-length infectious clone of human coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q36974687">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1128/JVI.01804-08</td>
    <td>18818320</td>
  </tr>
  <tr>
    <td>2008-07-18T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27650880">Solution structure of the c-terminal dimerization domain of SARS coronavirus nucleocapsid protein solved by the SAIL-NMR method</a> (<a href="http://www.wikidata.org/entity/Q27650880">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.JMB.2007.11.093</td>
    <td>18561946</td>
  </tr>
  <tr>
    <td>2008-07-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q56790267">Phylogenetic analysis of human coronavirus NL63 circulating in Italy</a> (<a href="http://www.wikidata.org/entity/Q56790267">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1016/J.JCV.2008.04.015</td>
    <td>18602337</td>
  </tr>
  <tr>
    <td>2008-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44578885">[Development and comparison of real-time and conventional RT-PCR assay for detection of human coronavirus NL63 and HKU1].</a> (<a href="http://www.wikidata.org/entity/Q44578885">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td></td>
    <td>18780635</td>
  </tr>
  <tr>
    <td>2008-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44578885">[Development and comparison of real-time and conventional RT-PCR assay for detection of human coronavirus NL63 and HKU1].</a> (<a href="http://www.wikidata.org/entity/Q44578885">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td></td>
    <td>18780635</td>
  </tr>
  <tr>
    <td>2008-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36251493">Human coronavirus NL63 infections in infants hospitalised with acute respiratory tract infections in South Africa.</a> (<a href="http://www.wikidata.org/entity/Q36251493">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1111/J.1750-2659.2008.00049.X</td>
    <td>19453465</td>
  </tr>
  <tr>
    <td>2008-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27650493">Structural Analysis of Major Species Barriers between Humans and Palm Civets for Severe Acute Respiratory Syndrome Coronavirus Infections</a> (<a href="http://www.wikidata.org/entity/Q27650493">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.00442-08</td>
    <td>18448527</td>
  </tr>
  <tr>
    <td>2008-06-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47653810">Stability of human metapneumovirus and human coronavirus NL63 on medical instruments and in the patient environment.</a> (<a href="http://www.wikidata.org/entity/Q47653810">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1016/J.JHIN.2008.04.017</td>
    <td>18541340</td>
  </tr>
  <tr>
    <td>2008-05-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39762396">Human coronavirus NL63 and 229E seroconversion in children.</a> (<a href="http://www.wikidata.org/entity/Q39762396">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1128/JCM.00533-08</td>
    <td>18495857</td>
  </tr>
  <tr>
    <td>2008-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45409193">Role of human metapneumovirus, human coronavirus NL63 and human bocavirus in infants and young children with acute wheezing.</a> (<a href="http://www.wikidata.org/entity/Q45409193">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1002/JMV.21135</td>
    <td>18360904</td>
  </tr>
  <tr>
    <td>2008-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24311580">Identification of residues in the receptor-binding domain (RBD) of the spike protein of human coronavirus NL63 that are critical for the RBD-ACE2 receptor interaction</a> (<a href="http://www.wikidata.org/entity/Q24311580">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1099/VIR.0.83331-0</td>
    <td>18343844</td>
  </tr>
  <tr>
    <td>2008-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46758193">Glucose-6-phosphate dehydrogenase deficiency enhances human coronavirus 229E infection.</a> (<a href="http://www.wikidata.org/entity/Q46758193">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1086/528377</td>
    <td>18269318</td>
  </tr>
  <tr>
    <td>2008-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27649375">Structures of Two Coronavirus Main Proteases: Implications for Substrate Binding and Antiviral Drug Design</a> (<a href="http://www.wikidata.org/entity/Q27649375">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.02114-07</td>
    <td>18094151</td>
  </tr>
  <tr>
    <td>2008-02-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27649165">Structural and functional analyses of the severe acute respiratory syndrome coronavirus endoribonuclease Nsp15</a> (<a href="http://www.wikidata.org/entity/Q27649165">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1074/JBC.M708375200</td>
    <td>18045871</td>
  </tr>
  <tr>
    <td>2008-01-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q57588886">Human Metapneumovirus and Human Coronavirus NL63: In Reply</a> (<a href="http://www.wikidata.org/entity/Q57588886">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1542/PEDS.2007-3386</td>
    <td></td>
  </tr>
  <tr>
    <td>2008-01-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27648944">Mutation of Gly-11 on the dimer interface results in the complete crystallographic dimer dissociation of severe acute respiratory syndrome coronavirus 3C-like protease: crystal structure with molecular dynamics simulations</a> (<a href="http://www.wikidata.org/entity/Q27648944">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1074/JBC.M705240200</td>
    <td>17977841</td>
  </tr>
  <tr>
    <td>2007-11-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27648952">Structural basis of mercury- and zinc-conjugated complexes as SARS-CoV 3C-like protease inhibitors</a> (<a href="http://www.wikidata.org/entity/Q27648952">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.FEBSLET.2007.10.048</td>
    <td>17981158</td>
  </tr>
  <tr>
    <td>2007-11-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40041391">Inhibition of human coronavirus 229E infection in human epithelial lung cells (L132) by chloroquine: involvement of p38 MAPK and ERK.</a> (<a href="http://www.wikidata.org/entity/Q40041391">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/J.ANTIVIRAL.2007.10.011</td>
    <td>18055026</td>
  </tr>
  <tr>
    <td>2007-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27647633">Nuclear Magnetic Resonance Structure of the N-Terminal Domain of Nonstructural Protein 3 from the Severe Acute Respiratory Syndrome Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q27647633">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.00969-07</td>
    <td>17728234</td>
  </tr>
  <tr>
    <td>2007-09-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40439043">Community epidemiology of human metapneumovirus, human coronavirus NL63, and other respiratory viruses in healthy preschool-aged children using parent-collected specimens.</a> (<a href="http://www.wikidata.org/entity/Q40439043">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1542/PEDS.2006-3703</td>
    <td>17875651</td>
  </tr>
  <tr>
    <td>2007-08-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27646489">A mechanistic view of enzyme inhibition and peptide hydrolysis in the active site of the SARS-CoV 3C-like peptidase</a> (<a href="http://www.wikidata.org/entity/Q27646489">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.JMB.2007.06.001</td>
    <td>17599357</td>
  </tr>
  <tr>
    <td>2007-07-31T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40099471">Activation of human monocytes after infection by human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q40099471">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/J.VIRUSRES.2007.06.016</td>
    <td>17669539</td>
  </tr>
  <tr>
    <td>2007-07-12T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40106974">The S proteins of human coronavirus NL63 and severe acute respiratory syndrome coronavirus bind overlapping regions of ACE2.</a> (<a href="http://www.wikidata.org/entity/Q40106974">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1016/J.VIROL.2007.04.035</td>
    <td>17631932</td>
  </tr>
  <tr>
    <td>2007-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44181195">[Sequence analysis for genes encoding nucleoprotein and envelope protein of a new human coronavirus NL63 identified from a pediatric patient in Beijing by bioinformatics].</a> (<a href="http://www.wikidata.org/entity/Q44181195">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td></td>
    <td>17894224</td>
  </tr>
  <tr>
    <td>2007-05-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27644202">Structure of the SARS coronavirus nucleocapsid protein RNA-binding dimerization domain suggests a mechanism for helical packaging of viral RNA</a> (<a href="http://www.wikidata.org/entity/Q27644202">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.JMB.2007.02.069</td>
    <td>17379242</td>
  </tr>
  <tr>
    <td>2007-05-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51009072">The 3a accessory protein of SARS coronavirus specifically interacts with the 5'UTR of its genomic RNA, Using a unique 75 amino acid interaction domain.</a> (<a href="http://www.wikidata.org/entity/Q51009072">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1021/BI062057P</td>
    <td>17488094</td>
  </tr>
  <tr>
    <td>2007-04-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35857154">Induction of apoptosis by the severe acute respiratory syndrome coronavirus 7a protein is dependent on its interaction with the Bcl-XL protein.</a> (<a href="http://www.wikidata.org/entity/Q35857154">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.00090-07</td>
    <td>17428862</td>
  </tr>
  <tr>
    <td>2007-04-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27644358">Crystal Structure of a Monomeric Form of Severe Acute Respiratory Syndrome Coronavirus Endonuclease nsp15 Suggests a Role for Hexamerization as an Allosteric Switch</a> (<a href="http://www.wikidata.org/entity/Q27644358">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.02817-06</td>
    <td>17409150</td>
  </tr>
  <tr>
    <td>2007-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27641043">Novel β-Barrel Fold in the Nuclear Magnetic Resonance Structure of the Replicase Nonstructural Protein 1 from the Severe Acute Respiratory Syndrome Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q27641043">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.01939-06</td>
    <td>17202208</td>
  </tr>
  <tr>
    <td>2007-03-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42737885">Proteolytic processing and deubiquitinating activity of papain-like proteases of human coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q42737885">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1128/JVI.02747-06</td>
    <td>17392370</td>
  </tr>
  <tr>
    <td>2007-02-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27643422">Production of authentic SARS-CoV M(pro) with enhanced activity: application as a novel tag-cleavage endopeptidase for protein overproduction</a> (<a href="http://www.wikidata.org/entity/Q27643422">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.JMB.2006.11.073</td>
    <td>17189639</td>
  </tr>
  <tr>
    <td>2007-02-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40457898">Clinical manifestations of human coronavirus NL63 infection in children in Taiwan.</a> (<a href="http://www.wikidata.org/entity/Q40457898">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1007/S00431-007-0429-8</td>
    <td>17297612</td>
  </tr>
  <tr>
    <td>2007-01-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35785423">Human coronavirus 229E papain-like proteases have overlapping specificities but distinct functions in viral replication.</a> (<a href="http://www.wikidata.org/entity/Q35785423">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1128/JVI.02091-06</td>
    <td>17251282</td>
  </tr>
  <tr>
    <td>2006-12-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35597534">Human coronavirus 229E encodes a single ORF4 protein between the spike and the envelope genes</a> (<a href="http://www.wikidata.org/entity/Q35597534">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1186/1743-422X-3-106</td>
    <td>17194306</td>
  </tr>
  <tr>
    <td>2006-12-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27643347">Core structure of S2 from the human coronavirus NL63 spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q27643347">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1021/BI061686W</td>
    <td>17176042</td>
  </tr>
  <tr>
    <td>2006-11-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40201912">Augmentation of chemokine production by severe acute respiratory syndrome coronavirus 3a/X1 and 7a/X4 proteins through NF-kappaB activation.</a> (<a href="http://www.wikidata.org/entity/Q40201912">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.FEBSLET.2006.11.046</td>
    <td>17141229</td>
  </tr>
  <tr>
    <td>2006-11-02T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44586835">Blinded case-control study of the relationship between human coronavirus NL63 and Kawasaki syndrome.</a> (<a href="http://www.wikidata.org/entity/Q44586835">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1086/509509</td>
    <td>17109341</td>
  </tr>
  <tr>
    <td>2006-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42698516">Inter- and intra-variant genetic heterogeneity of human coronavirus OC43 strains in France.</a> (<a href="http://www.wikidata.org/entity/Q42698516">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1099/VIR.0.82065-0</td>
    <td>17030869</td>
  </tr>
  <tr>
    <td>2006-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44032470">Detection of human coronavirus NL63, human metapneumovirus and respiratory syncytial virus in children with respiratory tract infections in south-west Sweden.</a> (<a href="http://www.wikidata.org/entity/Q44032470">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1111/J.1469-0691.2006.01506.X</td>
    <td>17002608</td>
  </tr>
  <tr>
    <td>2006-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36171303">An Outbreak of Human Coronavirus OC43 Infection and Serological Cross-reactivity with SARS Coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q36171303">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1155/2006/152612</td>
    <td>18382647</td>
  </tr>
  <tr>
    <td>2006-09-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40233918">Identification of cell lines permissive for human coronavirus NL63.</a> (<a href="http://www.wikidata.org/entity/Q40233918">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1016/J.JVIROMET.2006.07.023</td>
    <td>16962670</td>
  </tr>
  <tr>
    <td>2006-09-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q30356663">Structural basis of neutralization by a human anti-severe acute respiratory syndrome spike protein antibody, 80R.</a> (<a href="http://www.wikidata.org/entity/Q30356663">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1074/JBC.M603275200</td>
    <td>16954221</td>
  </tr>
  <tr>
    <td>2006-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36566597">Human coronavirus NL63, a new respiratory virus.</a> (<a href="http://www.wikidata.org/entity/Q36566597">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1111/J.1574-6976.2006.00032.X</td>
    <td>16911043</td>
  </tr>
  <tr>
    <td>2006-08-07T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35033777">Severe acute respiratory syndrome-associated coronavirus 3a protein forms an ion channel and modulates virus release.</a> (<a href="http://www.wikidata.org/entity/Q35033777">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1073/PNAS.0605402103</td>
    <td>16894145</td>
  </tr>
  <tr>
    <td>2006-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q52572896">Structure-based drug design and structural biology study of novel nonpeptide inhibitors of severe acute respiratory syndrome coronavirus main protease.</a> (<a href="http://www.wikidata.org/entity/Q52572896">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1021/JM060207O</td>
    <td>16913704</td>
  </tr>
  <tr>
    <td>2006-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36253493">Crystal structure and mechanistic determinants of SARS coronavirus nonstructural protein 15 define an endoribonuclease family.</a> (<a href="http://www.wikidata.org/entity/Q36253493">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1073/PNAS.0601708103</td>
    <td>16882730</td>
  </tr>
  <tr>
    <td>2006-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35023937">Crystal structure of nonstructural protein 10 from the severe acute respiratory syndrome coronavirus reveals a novel fold with two zinc-binding motifs.</a> (<a href="http://www.wikidata.org/entity/Q35023937">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.00467-06</td>
    <td>16873246</td>
  </tr>
  <tr>
    <td>2006-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40276002">Genetic variability of human coronavirus OC43-, 229E-, and NL63-like strains and their association with lower respiratory tract infections of hospitalized infants and immunocompromised patients.</a> (<a href="http://www.wikidata.org/entity/Q40276002">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1002/JMV.20645</td>
    <td>16721849</td>
  </tr>
  <tr>
    <td>2006-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40264563">Antiviral effects of saikosaponins on human coronavirus 229E in vitro.</a> (<a href="http://www.wikidata.org/entity/Q40264563">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1111/J.1440-1681.2006.04415.X</td>
    <td>16789928</td>
  </tr>
  <tr>
    <td>2006-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41494242">Evolutionary history of the closely related group 2 coronaviruses: porcine hemagglutinating encephalomyelitis virus, bovine coronavirus, and human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q41494242">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1128/JVI.02675-05</td>
    <td>16809333</td>
  </tr>
  <tr>
    <td>2006-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40275624">Inhibition of human coronavirus NL63 infection at early stages of the replication cycle.</a> (<a href="http://www.wikidata.org/entity/Q40275624">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1128/AAC.01598-05</td>
    <td>16723558</td>
  </tr>
  <tr>
    <td>2006-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45416737">Structures and polymorphic interactions of two heptad-repeat regions of the SARS virus S2 protein.</a> (<a href="http://www.wikidata.org/entity/Q45416737">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.STR.2006.03.007</td>
    <td>16698550</td>
  </tr>
  <tr>
    <td>2006-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q48092879">Analysis of human coronavirus 229E spike and nucleoprotein genes demonstrates genetic drift between chronologically distinct strains.</a> (<a href="http://www.wikidata.org/entity/Q48092879">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1099/VIR.0.81662-0</td>
    <td>16603522</td>
  </tr>
  <tr>
    <td>2006-04-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33239031">Structure of severe acute respiratory syndrome coronavirus receptor-binding domain complexed with neutralizing antibody.</a> (<a href="http://www.wikidata.org/entity/Q33239031">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1074/JBC.M600697200</td>
    <td>16597622</td>
  </tr>
  <tr>
    <td>2006-04-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43220253">Molecular analysis of Brazilian strains of bovine coronavirus (BCoV) reveals a deletion within the hypervariable region of the S1 subunit of the spike glycoprotein also found in human coronavirus OC43.</a> (<a href="http://www.wikidata.org/entity/Q43220253">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1007/S00705-006-0752-9</td>
    <td>16583154</td>
  </tr>
  <tr>
    <td>2006-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34545575">Recovery of a neurovirulent human coronavirus OC43 from an infectious cDNA clone.</a> (<a href="http://www.wikidata.org/entity/Q34545575">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1128/JVI.80.7.3670-3674.2006</td>
    <td>16537637</td>
  </tr>
  <tr>
    <td>2006-03-09T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q48623426">Human coronavirus OC43 infection induces chronic encephalitis leading to disabilities in BALB/C mice.</a> (<a href="http://www.wikidata.org/entity/Q48623426">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1016/J.VIROL.2006.01.049</td>
    <td>16527322</td>
  </tr>
  <tr>
    <td>2006-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41861879">Glycosylation of the severe acute respiratory syndrome coronavirus triple-spanning membrane proteins 3a and M.</a> (<a href="http://www.wikidata.org/entity/Q41861879">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.80.5.2326-2336.2006</td>
    <td>16474139</td>
  </tr>
  <tr>
    <td>2006-02-28T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82685553">Solution structure of the severe acute respiratory syndrome-coronavirus heptad repeat 2 domain in the prefusion state</a> (<a href="http://www.wikidata.org/entity/Q82685553">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1074/JBC.M601174200</td>
    <td>16507566</td>
  </tr>
  <tr>
    <td>2006-01-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34489739">Detection of the new human coronavirus HKU1: a report of 6 cases.</a> (<a href="http://www.wikidata.org/entity/Q34489739">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td>10.1086/500136</td>
    <td>16447108</td>
  </tr>
  <tr>
    <td>2006-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44242177">Nonstructural proteins of human coronavirus NL63.</a> (<a href="http://www.wikidata.org/entity/Q44242177">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1007/978-0-387-33012-9_16</td>
    <td>17037512</td>
  </tr>
  <tr>
    <td>2006-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36622010">Attachment factor and receptor engagement of SARS coronavirus and human coronavirus NL63.</a> (<a href="http://www.wikidata.org/entity/Q36622010">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1007/978-0-387-33012-9_37</td>
    <td>17037533</td>
  </tr>
  <tr>
    <td>2006-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40220867">Human coronavirus 229E can use CD209L (L-SIGN) to enter cells.</a> (<a href="http://www.wikidata.org/entity/Q40220867">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1007/978-0-387-33012-9_44</td>
    <td>17037540</td>
  </tr>
  <tr>
    <td>2006-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q56790024">Interaction Between the Spike Protein of Human Coronavirus NL63 and its Cellular Receptor ACE2</a> (<a href="http://www.wikidata.org/entity/Q56790024">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1007/978-0-387-33012-9_47</td>
    <td>17037543</td>
  </tr>
  <tr>
    <td>2006-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q54453851">Non structural proteins 8 and 9 of human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q54453851">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1007/978-0-387-33012-9_7</td>
    <td>17037503</td>
  </tr>
  <tr>
    <td>2006-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q56790013">Human Coronavirus NL63 Infection is Associated with Croup</a> (<a href="http://www.wikidata.org/entity/Q56790013">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1007/978-0-387-33012-9_86</td>
    <td>17037582</td>
  </tr>
  <tr>
    <td>2006-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40220760">Genetic evolution of human coronavirus OC43 in neural cell culture.</a> (<a href="http://www.wikidata.org/entity/Q40220760">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1007/978-0-387-33012-9_88</td>
    <td>17037584</td>
  </tr>
  <tr>
    <td>2006-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46093563">NMR assignment of the SARS-CoV protein nsp1</a> (<a href="http://www.wikidata.org/entity/Q46093563">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1007/S10858-006-9018-9</td>
    <td>16821128</td>
  </tr>
  <tr>
    <td>2006-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34233067">Severe acute respiratory syndrome coronavirus 3a protein is released in membranous structures from 3a protein-expressing cells and infected cells.</a> (<a href="http://www.wikidata.org/entity/Q34233067">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.80.1.210-217.2006</td>
    <td>16352545</td>
  </tr>
  <tr>
    <td>2005-12-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40341738">SARS coronavirus, but not human coronavirus NL63, utilizes cathepsin L to infect ACE2-expressing cells.</a> (<a href="http://www.wikidata.org/entity/Q40341738">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1074/JBC.M508381200</td>
    <td>16339146</td>
  </tr>
  <tr>
    <td>2005-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46203046">Structural basis of severe acute respiratory syndrome coronavirus ADP-ribose-1''-phosphate dephosphorylation by a conserved domain of nsP3.</a> (<a href="http://www.wikidata.org/entity/Q46203046">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.STR.2005.07.022</td>
    <td>16271890</td>
  </tr>
  <tr>
    <td>2005-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38319878">Insights into SARS-CoV transcription and replication from the structure of the nsp7-nsp8 hexadecamer.</a> (<a href="http://www.wikidata.org/entity/Q38319878">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1038/NSMB999</td>
    <td>16228002</td>
  </tr>
  <tr>
    <td>2005-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47692423">Human coronavirus NL63 associated with lower respiratory tract symptoms in early life.</a> (<a href="http://www.wikidata.org/entity/Q47692423">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1097/01.INF.0000183773.80217.12</td>
    <td>16282944</td>
  </tr>
  <tr>
    <td>2005-10-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34463761">Evidence of human coronavirus HKU1 and human bocavirus in Australian children.</a> (<a href="http://www.wikidata.org/entity/Q34463761">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983360">Human coronavirus HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td>10.1016/J.JCV.2005.09.008</td>
    <td>16257260</td>
  </tr>
  <tr>
    <td>2005-10-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35994898">Structure of the SARS coronavirus main proteinase as an active C2 crystallographic dimer</a> (<a href="http://www.wikidata.org/entity/Q35994898">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1107/S1744309105033257</td>
    <td>16511208</td>
  </tr>
  <tr>
    <td>2005-10-17T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33924807">Human coronavirus NL63 is not detected in the respiratory tracts of children with acute Kawasaki disease</a> (<a href="http://www.wikidata.org/entity/Q33924807">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1086/497170</td>
    <td>16235175</td>
  </tr>
  <tr>
    <td>2005-10-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45423381">Mutational analysis of the SARS virus Nsp15 endoribonuclease: identification of residues affecting hexamer formation.</a> (<a href="http://www.wikidata.org/entity/Q45423381">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.JMB.2005.09.007</td>
    <td>16216269</td>
  </tr>
  <tr>
    <td>2005-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34045722">Structural genomics of the severe acute respiratory syndrome coronavirus: nuclear magnetic resonance structure of the protein nsP7</a> (<a href="http://www.wikidata.org/entity/Q34045722">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.79.20.12905-12913.2005</td>
    <td>16188992</td>
  </tr>
  <tr>
    <td>2005-09-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47713809">In vivo functional characterization of the SARS-Coronavirus 3a protein in Drosophila.</a> (<a href="http://www.wikidata.org/entity/Q47713809">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.BBRC.2005.09.098</td>
    <td>16212942</td>
  </tr>
  <tr>
    <td>2005-09-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q43919382">pH-dependent conformational flexibility of the SARS-CoV main proteinase (M(pro)) dimer: molecular dynamics simulations and multiple X-ray structure analyses.</a> (<a href="http://www.wikidata.org/entity/Q43919382">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.JMB.2005.09.012</td>
    <td>16242152</td>
  </tr>
  <tr>
    <td>2005-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34451350">Structure of SARS coronavirus spike receptor-binding domain complexed with receptor.</a> (<a href="http://www.wikidata.org/entity/Q34451350">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1126/SCIENCE.1116480</td>
    <td>16166518</td>
  </tr>
  <tr>
    <td>2005-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40397968">The severe acute respiratory syndrome coronavirus 3a protein up-regulates expression of fibrinogen in lung epithelial cells.</a> (<a href="http://www.wikidata.org/entity/Q40397968">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.79.15.10083-10087.2005</td>
    <td>16014971</td>
  </tr>
  <tr>
    <td>2005-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40501168">Human coronavirus NL63, France.</a> (<a href="http://www.wikidata.org/entity/Q40501168">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.3201/EID1108.050110</td>
    <td>16102311</td>
  </tr>
  <tr>
    <td>2005-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47779437">The 3a protein of severe acute respiratory syndrome-associated coronavirus induces apoptosis in Vero E6 cells.</a> (<a href="http://www.wikidata.org/entity/Q47779437">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1099/VIR.0.80813-0</td>
    <td>15958670</td>
  </tr>
  <tr>
    <td>2005-06-20T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24811212">Genetic lesions within the 3a gene of SARS-CoV.</a> (<a href="http://www.wikidata.org/entity/Q24811212">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1186/1743-422X-2-51</td>
    <td>15963240</td>
  </tr>
  <tr>
    <td>2005-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q56778356">Circulation of genetically distinct contemporary human coronavirus OC43 strains</a> (<a href="http://www.wikidata.org/entity/Q56778356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1016/J.VIROL.2005.04.010</td>
    <td>15914223</td>
  </tr>
  <tr>
    <td>2005-05-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33836457">Development of a transgenic mouse model susceptible to human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q33836457">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1073/PNAS.0408589102</td>
    <td>15919828</td>
  </tr>
  <tr>
    <td>2005-05-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33841118">Human coronavirus NL63 employs the severe acute respiratory syndrome coronavirus receptor for cellular entry.</a> (<a href="http://www.wikidata.org/entity/Q33841118">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1073/PNAS.0409465102</td>
    <td>15897467</td>
  </tr>
  <tr>
    <td>2005-05-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40507931">Human coronavirus NL63 infection and other coronavirus infections in children hospitalized with acute respiratory disease in Hong Kong, China.</a> (<a href="http://www.wikidata.org/entity/Q40507931">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1086/430301</td>
    <td>15909257</td>
  </tr>
  <tr>
    <td>2005-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q56762915">Central ions and lateral asparagine/glutamine zippers stabilize the post-fusion hairpin conformation of the SARS coronavirus spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q56762915">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.VIROL.2005.02.022</td>
    <td>15840526</td>
  </tr>
  <tr>
    <td>2005-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40447673">Subcellular localization and membrane association of SARS-CoV 3a protein.</a> (<a href="http://www.wikidata.org/entity/Q40447673">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.VIRUSRES.2005.01.001</td>
    <td>15763150</td>
  </tr>
  <tr>
    <td>2005-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40429766">Comparative host gene transcription by microarray analysis early after infection of the Huh7 cell line by severe acute respiratory syndrome coronavirus and human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q40429766">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1128/JVI.79.10.6180-6193.2005</td>
    <td>15858003</td>
  </tr>
  <tr>
    <td>2005-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42651336">The severe acute respiratory syndrome coronavirus 3a is a novel structural protein.</a> (<a href="http://www.wikidata.org/entity/Q42651336">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.BBRC.2005.02.153</td>
    <td>15781262</td>
  </tr>
  <tr>
    <td>2005-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47819250">Human coronavirus OC43 causes influenza-like illness in residents and staff of aged-care facilities in Melbourne, Australia.</a> (<a href="http://www.wikidata.org/entity/Q47819250">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1017/S0950268804003346</td>
    <td>15816152</td>
  </tr>
  <tr>
    <td>2005-03-23T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46402178">Mechanism of the maturation process of SARS-CoV 3CL protease.</a> (<a href="http://www.wikidata.org/entity/Q46402178">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1074/JBC.M502577200</td>
    <td>15788388</td>
  </tr>
  <tr>
    <td>2005-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47866200">Detection of human coronavirus NL63 in young children with bronchiolitis.</a> (<a href="http://www.wikidata.org/entity/Q47866200">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1002/JMV.20289</td>
    <td>15648061</td>
  </tr>
  <tr>
    <td>2005-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33717322">Complete genomic sequence of human coronavirus OC43: molecular clock analysis suggests a relatively recent zoonotic coronavirus transmission event.</a> (<a href="http://www.wikidata.org/entity/Q33717322">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1128/JVI.79.3.1595-1604.2005</td>
    <td>15650185</td>
  </tr>
  <tr>
    <td>2005-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24806641">A novel pancoronavirus RT-PCR assay: frequent detection of human coronavirus NL63 in children hospitalized with respiratory tract infections in Belgium</a> (<a href="http://www.wikidata.org/entity/Q24806641">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1186/1471-2334-5-6</td>
    <td>15686594</td>
  </tr>
  <tr>
    <td>2005-01-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40516855">Human coronavirus NL63 infection in Canada.</a> (<a href="http://www.wikidata.org/entity/Q40516855">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1086/426869</td>
    <td>15655772</td>
  </tr>
  <tr>
    <td>2005-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34383198">Structure and intracellular targeting of the SARS-coronavirus Orf7a accessory protein.</a> (<a href="http://www.wikidata.org/entity/Q34383198">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.STR.2004.10.010</td>
    <td>15642263</td>
  </tr>
  <tr>
    <td>2004-12-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33581892">Structure of a proteolytically resistant core from the severe acute respiratory syndrome coronavirus S2 fusion protein</a> (<a href="http://www.wikidata.org/entity/Q33581892">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1073/PNAS.0406128102</td>
    <td>15604146</td>
  </tr>
  <tr>
    <td>2004-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40487857">Overexpression of 7a, a protein specifically encoded by the severe acute respiratory syndrome coronavirus, induces apoptosis via a caspase-dependent pathway.</a> (<a href="http://www.wikidata.org/entity/Q40487857">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.78.24.14043-14047.2004</td>
    <td>15564512</td>
  </tr>
  <tr>
    <td>2004-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47932220">Crystal structure of severe acute respiratory syndrome coronavirus spike protein fusion core.</a> (<a href="http://www.wikidata.org/entity/Q47932220">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1074/JBC.M408782200</td>
    <td>15345712</td>
  </tr>
  <tr>
    <td>2004-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41275791">Human coronavirus 229E binds to CD13 in rafts and enters the cell through caveolae</a> (<a href="http://www.wikidata.org/entity/Q41275791">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1128/JVI.78.16.8701-8708.2004</td>
    <td>15280478</td>
  </tr>
  <tr>
    <td>2004-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33203307">The life cycle of SARS coronavirus in Vero E6 cells.</a> (<a href="http://www.wikidata.org/entity/Q33203307">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1002/JMV.20095</td>
    <td>15170625</td>
  </tr>
  <tr>
    <td>2004-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44963946">Identification of six new polymorphisms in the human coronavirus 229E receptor gene (aminopeptidase N/CD13).</a> (<a href="http://www.wikidata.org/entity/Q44963946">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/J.IJID.2004.03.004</td>
    <td>15234325</td>
  </tr>
  <tr>
    <td>2004-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47941525">Characterization of the 3a protein of SARS-associated coronavirus in infected vero E6 cells and SARS patients.</a> (<a href="http://www.wikidata.org/entity/Q47941525">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.JMB.2004.06.016</td>
    <td>15312778</td>
  </tr>
  <tr>
    <td>2004-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35123004">Characterization of a unique group-specific protein (U122) of the severe acute respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q35123004">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1128/JVI.78.14.7311-7318.2004</td>
    <td>15220404</td>
  </tr>
  <tr>
    <td>2004-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34329485">Human coronavirus 229E nonstructural protein 13: characterization of duplex-unwinding, nucleoside triphosphatase, and RNA 5'-triphosphatase activities.</a> (<a href="http://www.wikidata.org/entity/Q34329485">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1128/JVI.78.14.7833-7838.2004</td>
    <td>15220459</td>
  </tr>
  <tr>
    <td>2004-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47627622">Identification of a novel protein 3a from severe acute respiratory syndrome coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q47627622">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/J.FEBSLET.2004.03.086</td>
    <td>15135062</td>
  </tr>
  <tr>
    <td>2004-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q47595187">Structure of the N-terminal RNA-binding domain of the SARS CoV nucleocapsid protein.</a> (<a href="http://www.wikidata.org/entity/Q47595187">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1021/BI036155B</td>
    <td>15147189</td>
  </tr>
  <tr>
    <td>2004-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40572184">Detection of human Coronavirus 229E in nasal specimens in large scale studies using an RT-PCR hybridization assay.</a> (<a href="http://www.wikidata.org/entity/Q40572184">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/J.MCP.2003.09.005</td>
    <td>15051115</td>
  </tr>
  <tr>
    <td>2004-03-08T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q37094749">The severe acute respiratory syndrome-coronavirus replicative protein nsp9 is a single-stranded RNA-binding subunit unique in the RNA virus world.</a> (<a href="http://www.wikidata.org/entity/Q37094749">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1073/PNAS.0307877101</td>
    <td>15007178</td>
  </tr>
  <tr>
    <td>2004-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35879775">Ultrastructural characterization of SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q35879775">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.3201/EID1002.030913</td>
    <td>15030705</td>
  </tr>
  <tr>
    <td>2004-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24804493">Genome structure and transcriptional regulation of human coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q24804493">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q8351095">Human Coronavirus NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>10.1186/1743-422X-1-7</td>
    <td>15548333</td>
  </tr>
  <tr>
    <td>2003-11-11T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27642450">The crystal structures of severe acute respiratory syndrome virus main protease and its complex with an inhibitor</a> (<a href="http://www.wikidata.org/entity/Q27642450">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1073/PNAS.1835675100</td>
    <td>14585926</td>
  </tr>
  <tr>
    <td>2003-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q31153826">Mechanisms and enzymes involved in SARS coronavirus genome expression.</a> (<a href="http://www.wikidata.org/entity/Q31153826">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1099/VIR.0.19424-0</td>
    <td>12917450</td>
  </tr>
  <tr>
    <td>2003-08-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q29615331">Unique and conserved features of genome and proteome of SARS-coronavirus, an early split-off from the coronavirus group 2 lineage</a> (<a href="http://www.wikidata.org/entity/Q29615331">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/S0022-2836(03)00865-9</td>
    <td>12927536</td>
  </tr>
  <tr>
    <td>2003-08-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51658216">Structural genomics of the SARS coronavirus: cloning, expression, crystallization and preliminary crystallographic study of the Nsp9 protein.</a> (<a href="http://www.wikidata.org/entity/Q51658216">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1107/S0907444903016779</td>
    <td>12925794</td>
  </tr>
  <tr>
    <td>2003-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q79238779">[SARS-CoV: 1. The virus]</a> (<a href="http://www.wikidata.org/entity/Q79238779">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1051/MEDSCI/20031989885</td>
    <td>14593622</td>
  </tr>
  <tr>
    <td>2003-07-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87968860">X-Ray Crystal Structure of the SARS Coronavirus Main Protease</a> (<a href="http://www.wikidata.org/entity/Q87968860">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.2210/PDB1Q2W/PDB</td>
    <td></td>
  </tr>
  <tr>
    <td>2003-06-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27641252">Coronavirus main proteinase (3CLpro) structure: basis for design of anti-SARS drugs</a> (<a href="http://www.wikidata.org/entity/Q27641252">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1126/SCIENCE.1085658</td>
    <td>12746549</td>
  </tr>
  <tr>
    <td>2003-06-13T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27641252">Coronavirus main proteinase (3CLpro) structure: basis for design of anti-SARS drugs</a> (<a href="http://www.wikidata.org/entity/Q27641252">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1126/SCIENCE.1085658</td>
    <td>12746549</td>
  </tr>
  <tr>
    <td>2003-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q51667428">mRNA cap-1 methyltransferase in the SARS genome.</a> (<a href="http://www.wikidata.org/entity/Q51667428">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1016/S0092-8674(03)00424-0</td>
    <td>12809601</td>
  </tr>
  <tr>
    <td>2003-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q29619007">The Genome sequence of the SARS-associated coronavirus</a> (<a href="http://www.wikidata.org/entity/Q29619007">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td>10.1126/SCIENCE.1085953</td>
    <td>12730501</td>
  </tr>
  <tr>
    <td>2003-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34782082">Human coronavirus 229E: receptor binding domain and neutralization by soluble receptor at 37 degrees C.</a> (<a href="http://www.wikidata.org/entity/Q34782082">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1128/JVI.77.7.4435-4438.2003</td>
    <td>12634402</td>
  </tr>
  <tr>
    <td>2001-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40759343">Induction of apoptosis in MRC-5, diploid human fetal lung cells after infection with human coronavirus OC43.</a> (<a href="http://www.wikidata.org/entity/Q40759343">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td></td>
    <td>11774544</td>
  </tr>
  <tr>
    <td>2000-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39539912">Human coronavirus 229E infects polarized airway epithelia from the apical surface</a> (<a href="http://www.wikidata.org/entity/Q39539912">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1128/JVI.74.19.9234-9239.2000</td>
    <td>10982370</td>
  </tr>
  <tr>
    <td>2000-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40867812">Activation of glial cells by human coronavirus OC43 infection.</a> (<a href="http://www.wikidata.org/entity/Q40867812">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1016/S0165-5728(00)00266-6</td>
    <td>10900340</td>
  </tr>
  <tr>
    <td>2000-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27472951">The human coronavirus 229E superfamily 1 helicase has RNA and DNA duplex-unwinding activities with 5'-to-3' polarity</a> (<a href="http://www.wikidata.org/entity/Q27472951">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1017/S1355838200000728</td>
    <td>10917600</td>
  </tr>
  <tr>
    <td>1999-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39550106">Persistent infection of human oligodendrocytic and neuroglial cell lines by human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q39550106">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td></td>
    <td>10074187</td>
  </tr>
  <tr>
    <td>1999-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39550114">Acute and persistent infection of human neural cell lines by human coronavirus OC43.</a> (<a href="http://www.wikidata.org/entity/Q39550114">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td></td>
    <td>10074188</td>
  </tr>
  <tr>
    <td>1999-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39548636">Processing of the human coronavirus 229E replicase polyproteins by the virus-encoded 3C-like proteinase: identification of proteolytic products and cleavage sites common to pp1a and pp1ab.</a> (<a href="http://www.wikidata.org/entity/Q39548636">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td></td>
    <td>9847320</td>
  </tr>
  <tr>
    <td>1998-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40975139">Characterization of the expression and immunogenicity of the ns4b protein of human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q40975139">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1139/CJM-44-10-1012</td>
    <td>9933919</td>
  </tr>
  <tr>
    <td>1998-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33783445">Involvement of aminopeptidase N (CD13) in infection of human neural cells by human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q33783445">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td></td>
    <td>9658094</td>
  </tr>
  <tr>
    <td>1998-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39642133">Proteolytic processing at the amino terminus of human coronavirus 229E gene 1-encoded polyproteins: identification of a papain-like proteinase and its substrate.</a> (<a href="http://www.wikidata.org/entity/Q39642133">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td></td>
    <td>9444982</td>
  </tr>
  <tr>
    <td>1998-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41001336">Long distance RT-PCRs of human coronavirus 229E RNA.</a> (<a href="http://www.wikidata.org/entity/Q41001336">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td></td>
    <td>9782292</td>
  </tr>
  <tr>
    <td>1998-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41001386">Substrate specificity of the human coronavirus 229E 3C-like proteinase.</a> (<a href="http://www.wikidata.org/entity/Q41001386">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1007/978-1-4615-5331-1_15</td>
    <td>9782272</td>
  </tr>
  <tr>
    <td>1997-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41079488">Identification and subcellular localization of a 41 kDa, polyprotein 1ab processing product in human coronavirus 229E-infected cells.</a> (<a href="http://www.wikidata.org/entity/Q41079488">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1099/0022-1317-78-11-2789</td>
    <td>9367364</td>
  </tr>
  <tr>
    <td>1997-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q34065492">Identification of residues critical for the human coronavirus 229E receptor function of human aminopeptidase N.</a> (<a href="http://www.wikidata.org/entity/Q34065492">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1099/0022-1317-78-11-2795</td>
    <td>9367365</td>
  </tr>
  <tr>
    <td>1997-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q27480840">Identification of an ATPase activity associated with a 71-kilodalton polypeptide encoded in gene 1 of the human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q27480840">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td></td>
    <td>9188639</td>
  </tr>
  <tr>
    <td>1997-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39879482">Biosynthesis, purification, and characterization of the human coronavirus 229E 3C-like proteinase.</a> (<a href="http://www.wikidata.org/entity/Q39879482">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td></td>
    <td>9094676</td>
  </tr>
  <tr>
    <td>1996-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41187138">DNA probe for the human coronavirus OC43 also detects neonatal calf diarrhea coronavirus (NCDCV).</a> (<a href="http://www.wikidata.org/entity/Q41187138">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td></td>
    <td>8841041</td>
  </tr>
  <tr>
    <td>1996-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44474814">The region between the M and S genes of porcine haemagglutinating encephalomyelitis virus is highly similar to human coronavirus OC43.</a> (<a href="http://www.wikidata.org/entity/Q44474814">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1099/0022-1317-77-7-1443</td>
    <td>8757985</td>
  </tr>
  <tr>
    <td>1996-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41230526">Myelin basic protein and human coronavirus 229E cross-reactive T cells in multiple sclerosis.</a> (<a href="http://www.wikidata.org/entity/Q41230526">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1002/ANA.410390213</td>
    <td>8967755</td>
  </tr>
  <tr>
    <td>1996-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41252028">Structural and functional analysis of the S proteins of two human coronavirus OC43 strains adapted to growth in different cells.</a> (<a href="http://www.wikidata.org/entity/Q41252028">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1007/BF01718615</td>
    <td>8712929</td>
  </tr>
  <tr>
    <td>1995-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41275797">Interferon gamma potentiates human coronavirus OC43 infection of neuronal cells by modulation of HLA class I expression.</a> (<a href="http://www.wikidata.org/entity/Q41275797">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.3109/08820139509060722</td>
    <td>8575842</td>
  </tr>
  <tr>
    <td>1995-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41288189">Detection of human coronavirus 229E-specific antibodies using recombinant fusion proteins.</a> (<a href="http://www.wikidata.org/entity/Q41288189">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/0166-0934(95)00041-R</td>
    <td>8537456</td>
  </tr>
  <tr>
    <td>1995-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42689276">Sequence and expression of the ns2 protein gene of human coronavirus OC43.</a> (<a href="http://www.wikidata.org/entity/Q42689276">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1099/0022-1317-76-2-431</td>
    <td>7844564</td>
  </tr>
  <tr>
    <td>1995-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41384047">Analysis of cellular receptors for human coronavirus OC43.</a> (<a href="http://www.wikidata.org/entity/Q41384047">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1007/978-1-4615-1899-0_60</td>
    <td>8830510</td>
  </tr>
  <tr>
    <td>1995-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41399001">Genomic relationship of porcine hemagglutinating encephalomyelitis virus to bovine coronavirus and human coronavirus OC43 as studied by the use of bovine coronavirus S gene-specific probes.</a> (<a href="http://www.wikidata.org/entity/Q41399001">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1007/BF01322747</td>
    <td>7646353</td>
  </tr>
  <tr>
    <td>1994-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44330223">Human coronavirus OC43 interacts with major histocompatibility complex class I molecules at the cell surface to establish infection.</a> (<a href="http://www.wikidata.org/entity/Q44330223">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.3109/08820139409066826</td>
    <td>7959963</td>
  </tr>
  <tr>
    <td>1993-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42617263">Sequence determination of the nucleocapsid protein gene of the porcine epidemic diarrhoea virus confirms that this virus is a coronavirus related to human coronavirus 229E and porcine transmissible gastroenteritis virus.</a> (<a href="http://www.wikidata.org/entity/Q42617263">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1099/0022-1317-74-9-1795</td>
    <td>8397280</td>
  </tr>
  <tr>
    <td>1993-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42615390">Molecular characterization of the S protein gene of human coronavirus OC43.</a> (<a href="http://www.wikidata.org/entity/Q42615390">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1099/0022-1317-74-9-1981</td>
    <td>8376972</td>
  </tr>
  <tr>
    <td>1993-08-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41537021">Nucleotide sequence of the human coronavirus 229E RNA polymerase locus.</a> (<a href="http://www.wikidata.org/entity/Q41537021">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1006/VIRO.1993.1419</td>
    <td>8337838</td>
  </tr>
  <tr>
    <td>1993-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38317987">Structural and functional analysis of the surface protein of human coronavirus OC43.</a> (<a href="http://www.wikidata.org/entity/Q38317987">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1006/VIRO.1993.1360</td>
    <td>8317096</td>
  </tr>
  <tr>
    <td>1993-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41566849">HLA class I antigen serves as a receptor for human coronavirus OC43.</a> (<a href="http://www.wikidata.org/entity/Q41566849">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.3109/08820139309063393</td>
    <td>8505072</td>
  </tr>
  <tr>
    <td>1993-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42623614">Human coronavirus OC43 RNA 4 lacks two open reading frames located downstream of the S gene of bovine coronavirus.</a> (<a href="http://www.wikidata.org/entity/Q42623614">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1006/VIRO.1993.1043</td>
    <td>8517026</td>
  </tr>
  <tr>
    <td>1993-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42607660">Characterization of the human coronavirus 229E (HCV 229E) gene 1.</a> (<a href="http://www.wikidata.org/entity/Q42607660">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1007/978-1-4615-2996-5_12</td>
    <td>8209774</td>
  </tr>
  <tr>
    <td>1993-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41585380">Neurotropism of human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q41585380">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1007/978-1-4615-2996-5_52</td>
    <td>8209751</td>
  </tr>
  <tr>
    <td>1992-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42603924">Sequence analysis of the membrane protein gene of human coronavirus OC43 and evidence for O-glycosylation.</a> (<a href="http://www.wikidata.org/entity/Q42603924">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1099/0022-1317-73-10-2731</td>
    <td>1402806</td>
  </tr>
  <tr>
    <td>1992-06-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24338168">Human aminopeptidase N is a receptor for human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q24338168">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1038/357420A0</td>
    <td>1350662</td>
  </tr>
  <tr>
    <td>1992-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41642051">Sequence analysis of human coronavirus 229E mRNAs 4 and 5: evidence for polymorphism and homology with myelin basic protein.</a> (<a href="http://www.wikidata.org/entity/Q41642051">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/0168-1702(92)90039-C</td>
    <td>1373555</td>
  </tr>
  <tr>
    <td>1990-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q48265045">Characterization of a nucleic acid probe for the diagnosis of human coronavirus 229E infections.</a> (<a href="http://www.wikidata.org/entity/Q48265045">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1002/JMV.1890310216</td>
    <td>2167350</td>
  </tr>
  <tr>
    <td>1990-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42635915">Sequence analysis of the membrane protein gene of human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q42635915">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/0042-6822(90)90115-8</td>
    <td>2305554</td>
  </tr>
  <tr>
    <td>1990-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q41755353">Comparison of the replication of distinct strains of human coronavirus OC43 in organotypic human colon cells (Caco-2) and mouse intestine.</a> (<a href="http://www.wikidata.org/entity/Q41755353">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1007/978-1-4684-5823-7_69</td>
    <td>2103102</td>
  </tr>
  <tr>
    <td>1989-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42651281">Sequence analysis of the nucleocapsid protein gene of human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q42651281">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/0042-6822(89)90050-0</td>
    <td>2922924</td>
  </tr>
  <tr>
    <td>1989-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42641533">Sequence analysis of nucleocapsid gene and leader RNA of human coronavirus OC43.</a> (<a href="http://www.wikidata.org/entity/Q42641533">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1016/0168-1702(89)90048-8</td>
    <td>2541577</td>
  </tr>
  <tr>
    <td>1987-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q69818173">Regulation of persistent infections with human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q69818173">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1007/978-1-4684-1280-2_35</td>
    <td>2829539</td>
  </tr>
  <tr>
    <td>1986-12-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q69671698">Probing for the human coronavirus OC43 in multiple sclerosis</a> (<a href="http://www.wikidata.org/entity/Q69671698">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1212/WNL.36.12.1604</td>
    <td>3785676</td>
  </tr>
  <tr>
    <td>1985-07-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42540764">Experimental inoculation of cats with human coronavirus 229E and subsequent challenge with feline infectious peritonitis virus.</a> (<a href="http://www.wikidata.org/entity/Q42540764">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td></td>
    <td>2994865</td>
  </tr>
  <tr>
    <td>1985-05-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44804677">Human enteric coronaviruses: antigenic relatedness to human coronavirus OC43 and possible etiologic role in viral gastroenteritis.</a> (<a href="http://www.wikidata.org/entity/Q44804677">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1093/INFDIS/151.5.796</td>
    <td>2985710</td>
  </tr>
  <tr>
    <td>1985-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40135232">Differential susceptibility of cultured neural cells to the human coronavirus OC43.</a> (<a href="http://www.wikidata.org/entity/Q40135232">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td></td>
    <td>3973963</td>
  </tr>
  <tr>
    <td>1985-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q42227190">Inhibition of the growth of human coronavirus 229E by leupeptin.</a> (<a href="http://www.wikidata.org/entity/Q42227190">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1099/0022-1317-66-2-363</td>
    <td>3968542</td>
  </tr>
  <tr>
    <td>1984-10-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q46178189">Coronaviruses and gastroenteritis: evidence of antigenic relatedness between human enteric coronavirus strains and human coronavirus OC43.</a> (<a href="http://www.wikidata.org/entity/Q46178189">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td></td>
    <td>6083436</td>
  </tr>
  <tr>
    <td>1982-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q70255153">Reactivity of human coronavirus OC43 and neonatal calf diarrhoea coronavirus membrane-associated antigens</a> (<a href="http://www.wikidata.org/entity/Q70255153">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.1099/0022-1317-60-2-385</td>
    <td>7050300</td>
  </tr>
  <tr>
    <td>1981-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39813726">Coronavirus isolates SK and SD from multiple sclerosis patients are serologically related to murine coronaviruses A59 and JHM and human coronavirus OC43, but not to human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q39813726">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td></td>
    <td>7241654</td>
  </tr>
  <tr>
    <td>1981-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39813726">Coronavirus isolates SK and SD from multiple sclerosis patients are serologically related to murine coronaviruses A59 and JHM and human coronavirus OC43, but not to human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q39813726">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td></td>
    <td>7241654</td>
  </tr>
  <tr>
    <td>1981-03-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40614291">Antibody to virus components in volunteers experimentally infected with human coronavirus 229E group viruses.</a> (<a href="http://www.wikidata.org/entity/Q40614291">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td></td>
    <td>6262250</td>
  </tr>
  <tr>
    <td>1978-09-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40202571">Seroepidemiologic study of human coronavirus OC43 infections in Italy.</a> (<a href="http://www.wikidata.org/entity/Q40202571">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td></td>
    <td>216378</td>
  </tr>
  <tr>
    <td>1977-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40094806">Antibodies to human coronavirus OC43 measured by radial haemolysis in gel.</a> (<a href="http://www.wikidata.org/entity/Q40094806">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.3109/INF.1977.9.ISSUE-2.04</td>
    <td>197594</td>
  </tr>
  <tr>
    <td>1976-11-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q44805554">Purification and biophysical properties of human coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q44805554">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>10.1016/0042-6822(76)90014-3</td>
    <td>824815</td>
  </tr>
  <tr>
    <td>1974-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q45127761">Occurrence of antibodies to human coronavirus OC43 in Finland.</a> (<a href="http://www.wikidata.org/entity/Q45127761">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>10.3109/INF.1974.6.ISSUE-4.05</td>
    <td>4450100</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o litHumanCoronaviruses.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litHumanCoronaviruses.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litHumanCoronaviruses.rq
```
This SPARQL query is available under CCZero.
