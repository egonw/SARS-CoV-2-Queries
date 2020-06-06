# litSARSCoV2Proteins.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
SELECT (MAX(?dates) as ?date) ?work ?workLabel ?doi WHERE {
  ?protein wdt:P703 wd:Q82069695 ; wdt:P31 wd:Q8054 .
  ?work wdt:P921 ?protein .
  OPTIONAL { ?work wdt:P577 ?dates . }
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "nl,en". }
} GROUP BY ?work ?workLabel ?doi ORDER BY DESC(?date)
```
[uitvoeren](https://query.wikidata.org/embed.html#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fprotein%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%0A) of [bewerken](https://query.wikidata.org/#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fprotein%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22nl%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%0A)


### Resultaten
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>doi</b></td>
  </tr>
  <tr>
    <td>2020-04-10T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q91863840">Remdesivir and SARS-CoV-2: Structural requirements at both nsp12 RdRp and nsp14 Exonuclease active-sites</a> (<a href="http://www.wikidata.org/entity/Q91863840">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ANTIVIRAL.2020.104793">10.1016/J.ANTIVIRAL.2020.104793</a></td>
  </tr>
  <tr>
    <td>2020-04-10T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q91935604">SARS-CoV-2-encoded nucleocapsid protein acts as a viral suppressor of RNA interference in cells</a> (<a href="http://www.wikidata.org/entity/Q91935604">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S11427-020-1692-1">10.1007/S11427-020-1692-1</a></td>
  </tr>
  <tr>
    <td>2020-04-09T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q89975279">Structure of Mpro from COVID-19 virus and discovery of its inhibitors</a> (<a href="http://www.wikidata.org/entity/Q89975279">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2223-Y">10.1038/S41586-020-2223-Y</a></td>
  </tr>
  <tr>
    <td>2020-03-22T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q88978136">Molecular characterization of SARS-CoV-2 in the first COVID-19 cluster in France reveals an amino-acid deletion in nsp2 (Asp268Del)</a> (<a href="http://www.wikidata.org/entity/Q88978136">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.19.998179">10.1101/2020.03.19.998179</a></td>
  </tr>
  <tr>
    <td>2020-03-20T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q88219766">Crystal structure of SARS-CoV-2 main protease provides a basis for design of improved α-ketoamide inhibitors</a> (<a href="http://www.wikidata.org/entity/Q88219766">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABB3405">10.1126/SCIENCE.ABB3405</a></td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q87995005">1.80 Angstrom Resolution Crystal Structure of NSP16 - NSP10 Complex from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87995005">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6W4H/PDB">10.2210/PDB6W4H/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q88048219">Crystal structure of SARS-CoV-2 nucleocapsid protein N-terminal RNA binding domain</a> (<a href="http://www.wikidata.org/entity/Q88048219">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6M3M/PDB">10.2210/PDB6M3M/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-13T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q88977278">The inhaled corticosteroid ciclesonide blocks coronavirus RNA replication by targeting viral NSP15</a> (<a href="http://www.wikidata.org/entity/Q88977278">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.11.987016">10.1101/2020.03.11.987016</a></td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q87968356">The crystal structure of COVID-19 main protease in apo form</a> (<a href="http://www.wikidata.org/entity/Q87968356">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6M03/PDB">10.2210/PDB6M03/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q87995286">Crystal Structure of ADP ribose phosphatase of NSP3 from SARS CoV-2 in the complex with ADP ribose</a> (<a href="http://www.wikidata.org/entity/Q87995286">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6W02/PDB">10.2210/PDB6W02/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q87995812">COVID-19 main protease with unliganded active site (2019-nCoV, coronavirus disease 2019, SARS-CoV-2)</a> (<a href="http://www.wikidata.org/entity/Q87995812">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6Y84/PDB">10.2210/PDB6Y84/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q87995864">PanDDA analysis group deposition -- Crystal Structure of COVID-19 main protease in complex with Z1367324110</a> (<a href="http://www.wikidata.org/entity/Q87995864">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB5R81/PDB">10.2210/PDB5R81/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q87995869">PanDDA analysis group deposition -- Crystal Structure of COVID-19 main protease in complex with Z219104216</a> (<a href="http://www.wikidata.org/entity/Q87995869">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB5R82/PDB">10.2210/PDB5R82/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q88047504">PanDDA analysis group deposition -- Crystal Structure of COVID-19 main protease in complex with Z44592329</a> (<a href="http://www.wikidata.org/entity/Q88047504">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB5R83/PDB">10.2210/PDB5R83/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-06T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q87973551">Structure, Function, and Antigenicity of the SARS-CoV-2 Spike Glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87973551">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.02.058">10.1016/J.CELL.2020.02.058</a></td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q87726414">Structural basis for the recognition of the SARS-CoV-2 by full-length human ACE2</a> (<a href="http://www.wikidata.org/entity/Q87726414">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABB2762">10.1126/SCIENCE.ABB2762</a></td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q87995012">Crystal Structure of ADP ribose phosphatase of NSP3 from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87995012">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6VXS/PDB">10.2210/PDB6VXS/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q87995630">Crystal structure of the free enzyme of the SARS-CoV-2 (2019-nCoV) main protease</a> (<a href="http://www.wikidata.org/entity/Q87995630">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6Y2E/PDB">10.2210/PDB6Y2E/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q88047678">Crystal structure (monoclinic form) of the complex resulting from the reaction between SARS-CoV-2 (2019-nCoV) main protease and tert-butyl (1-((S)-1-(((S)-4-(benzylamino)-3,4-dioxo-1-((S)-2-oxopyrrolidin-3-yl)butan-2-yl)amino)-3-cyclopropyl-1-oxoprop</a> (<a href="http://www.wikidata.org/entity/Q88047678">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6Y2F/PDB">10.2210/PDB6Y2F/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-03T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q87973252">Crystal structure of Nsp15 endoribonuclease NendoU from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87973252">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.02.968388">10.1101/2020.03.02.968388</a></td>
  </tr>
  <tr>
    <td>2020-02-27T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q87967188">Structure of Mpro from COVID-19 virus and discovery of its inhibitors</a> (<a href="http://www.wikidata.org/entity/Q87967188">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.02.26.964882">10.1101/2020.02.26.964882</a></td>
  </tr>
  <tr>
    <td>2020-02-17T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q87461535">Potent binding of 2019 novel coronavirus spike protein by a SARS coronavirus-specific human monoclonal antibody</a> (<a href="http://www.wikidata.org/entity/Q87461535">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1729069">10.1080/22221751.2020.1729069</a></td>
  </tr>
  <tr>
    <td>2020-02-05T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q87967181">The crystal structure of COVID-19 main protease in complex with an inhibitor N3</a> (<a href="http://www.wikidata.org/entity/Q87967181">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6LU7/PDB">10.2210/PDB6LU7/PDB</a></td>
  </tr>
  <tr>
    <td>2020-01-31T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q84112018">Uncanny similarity of unique inserts in the 2019-nCoV spike protein to HIV-1 gp120 and Gag</a> (<a href="http://www.wikidata.org/entity/Q84112018">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.01.30.927871">10.1101/2020.01.30.927871</a></td>
  </tr>
  <tr>
    <td>2020-01-22T00:00:00Z</td>
    <td><a href="https://scholia.toolforge.org/Q83460376">Homologous recombination within the spike glycoprotein of the newly identified coronavirus may boost cross‐species transmission from snake to human</a> (<a href="http://www.wikidata.org/entity/Q83460376">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.25682">10.1002/JMV.25682</a></td>
  </tr>
  <tr>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q89187838">Crystal Structure of NSP15 Endoribonuclease from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q89187838">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6VWW/PDB">10.2210/PDB6VWW/PDB</a></td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -o litSARSCoV2Proteins.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litSARSCoV2Proteins.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litSARSCoV2Proteins.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
