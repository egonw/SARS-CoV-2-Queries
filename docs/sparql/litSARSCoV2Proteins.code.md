# litSARSCoV2Proteins.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT (MAX(?dates) as ?date) ?work ?workLabel ?doi WHERE {
  ?protein wdt:P703 wd:Q82069695 ; wdt:P31 wd:Q8054 .
  ?work wdt:P921 ?protein .
  OPTIONAL { ?work wdt:P577 ?dates . }
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
} GROUP BY ?work ?workLabel ?doi ORDER BY DESC(?date)
```
[run](https://query.wikidata.org/embed.html#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fprotein%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%0A) or [edit](https://query.wikidata.org/#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fprotein%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%0A)


### Output
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>doi</b></td>
  </tr>
  <tr>
    <td>2020-12-01</td>
    <td><a href="https://scholia.toolforge.org/Q98195228">Flavonoids with inhibitory activity against SARS-CoV-2 3CLpro</a> (<a href="http://www.wikidata.org/entity/Q98195228">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/14756366.2020.1801672">10.1080/14756366.2020.1801672</a></td>
  </tr>
  <tr>
    <td>2020-09-09</td>
    <td><a href="https://scholia.toolforge.org/Q99248843">SARS-CoV-2 Nsp1 binds the ribosomal mRNA channel to inhibit translation</a> (<a href="http://www.wikidata.org/entity/Q99248843">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41594-020-0511-8">10.1038/S41594-020-0511-8</a></td>
  </tr>
  <tr>
    <td>2020-09-08</td>
    <td><a href="https://scholia.toolforge.org/Q99208789">In-silico screening of plant-derived antivirals against main protease, 3CLpro and endoribonuclease, NSP15 proteins of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q99208789">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1808077">10.1080/07391102.2020.1808077</a></td>
  </tr>
  <tr>
    <td>2020-09-07</td>
    <td><a href="https://scholia.toolforge.org/Q99406386">Potential Treatment of Chinese and Western Medicine Targeting Nsp14 of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q99406386">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JPHA.2020.08.002">10.1016/J.JPHA.2020.08.002</a></td>
  </tr>
  <tr>
    <td>2020-08-18</td>
    <td><a href="https://scholia.toolforge.org/Q98565434">Vitamin B12 may inhibit RNA-dependent-RNA polymerase activity of nsp12 from the SARS-CoV-2 virus</a> (<a href="http://www.wikidata.org/entity/Q98565434">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/IUB.2359">10.1002/IUB.2359</a></td>
  </tr>
  <tr>
    <td>2020-08-17</td>
    <td><a href="https://scholia.toolforge.org/Q98513801">ORF8 and ORF3b antibodies are accurate serological markers of early and late SARS-CoV-2 infection</a> (<a href="http://www.wikidata.org/entity/Q98513801">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41590-020-0773-7">10.1038/S41590-020-0773-7</a></td>
  </tr>
  <tr>
    <td>2020-08-17</td>
    <td><a href="https://scholia.toolforge.org/Q98510279">Structures and distributions of SARS-CoV-2 spike proteins on intact virions</a> (<a href="http://www.wikidata.org/entity/Q98510279">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2665-2">10.1038/S41586-020-2665-2</a></td>
  </tr>
  <tr>
    <td>2020-08-12</td>
    <td><a href="https://scholia.toolforge.org/Q98390275">Structural insight into the role of novel SARS-CoV-2 E protein: A potential target for vaccine development and other therapeutic strategies</a> (<a href="http://www.wikidata.org/entity/Q98390275">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PONE.0237300">10.1371/JOURNAL.PONE.0237300</a></td>
  </tr>
  <tr>
    <td>2020-08-11</td>
    <td><a href="https://scholia.toolforge.org/Q98306790">Mutational spectra of SARS-CoV-2 orf1ab polyprotein and signature mutations in the United States of America</a> (<a href="http://www.wikidata.org/entity/Q98306790">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.26417">10.1002/JMV.26417</a></td>
  </tr>
  <tr>
    <td>2020-08-11</td>
    <td><a href="https://scholia.toolforge.org/Q98504429">Cryo-EM Structures of the SARS-CoV-2 Endoribonuclease Nsp15</a> (<a href="http://www.wikidata.org/entity/Q98504429">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.11.244863">10.1101/2020.08.11.244863</a></td>
  </tr>
  <tr>
    <td>2020-08-10</td>
    <td><a href="https://scholia.toolforge.org/Q98460872">Repurposing of SARS-CoV nucleocapsid protein specific nuclease resistant RNA aptamer for therapeutics against SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q98460872">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.MEEGID.2020.104497">10.1016/J.MEEGID.2020.104497</a></td>
  </tr>
  <tr>
    <td>2020-08-09</td>
    <td><a href="https://scholia.toolforge.org/Q98392117">Mass Spectrometric detection of SARS-CoV-2 virus in scrapings of the epithelium of the nasopharynx of infected patients via Nucleocapsid N protein</a> (<a href="http://www.wikidata.org/entity/Q98392117">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.JPROTEOME.0C00412">10.1021/ACS.JPROTEOME.0C00412</a></td>
  </tr>
  <tr>
    <td>2020-08-07</td>
    <td><a href="https://scholia.toolforge.org/Q98281646">Epigallocatechin gallate and theaflavin gallate interaction in SARS-CoV-2 spike-protein central channel with reference to the hydroxychloroquine interaction: Bioinformatics and molecular docking study</a> (<a href="http://www.wikidata.org/entity/Q98281646">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/DDR.21730">10.1002/DDR.21730</a></td>
  </tr>
  <tr>
    <td>2020-08-05</td>
    <td><a href="https://scholia.toolforge.org/Q98211707">Intra- and intermolecular atomic-scale interactions in the receptor binding domain of SARS-CoV-2 spike protein: implication for ACE2 receptor binding</a> (<a href="http://www.wikidata.org/entity/Q98211707">edit</a>)</td>
    <td><a href="https://doi.org/10.1039/D0CP03145C">10.1039/D0CP03145C</a></td>
  </tr>
  <tr>
    <td>2020-08-05</td>
    <td><a href="https://scholia.toolforge.org/Q98392737">Structure of Furin Protease Binding to SARS-CoV-2 Spike Glycoprotein and Implications for Potential Targets and Virulence</a> (<a href="http://www.wikidata.org/entity/Q98392737">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.JPCLETT.0C01698">10.1021/ACS.JPCLETT.0C01698</a></td>
  </tr>
  <tr>
    <td>2020-08-04</td>
    <td><a href="https://scholia.toolforge.org/Q98195339">Deciphering the protein motion of S1 subunit in SARS-CoV-2 spike glycoprotein through integrated computational methods</a> (<a href="http://www.wikidata.org/entity/Q98195339">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1802338">10.1080/07391102.2020.1802338</a></td>
  </tr>
  <tr>
    <td>2020-08-04</td>
    <td><a href="https://scholia.toolforge.org/Q98199282">SARS-CoV-2 nucleocapsid and Nsp3 binding: an in silico study</a> (<a href="http://www.wikidata.org/entity/Q98199282">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S00203-020-01998-6">10.1007/S00203-020-01998-6</a></td>
  </tr>
  <tr>
    <td>2020-08-04</td>
    <td><a href="https://scholia.toolforge.org/Q98204182">Role of key point Mutations in Receptor Binding Domain of SARS-CoV-2 Spike Glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q98204182">edit</a>)</td>
    <td><a href="https://doi.org/10.2174/1871526520666200804161650">10.2174/1871526520666200804161650</a></td>
  </tr>
  <tr>
    <td>2020-08-04</td>
    <td><a href="https://scholia.toolforge.org/Q98312452">Enhanced Binding of SARS-CoV-2 Spike Protein to Receptor by Distal Polybasic Cleavage Sites</a> (<a href="http://www.wikidata.org/entity/Q98312452">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSNANO.0C04798">10.1021/ACSNANO.0C04798</a></td>
  </tr>
  <tr>
    <td>2020-08-03</td>
    <td><a href="https://scholia.toolforge.org/Q98196753">Structural and functional properties of SARS-CoV-2 spike protein: potential antivirus drug development for COVID-19</a> (<a href="http://www.wikidata.org/entity/Q98196753">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41401-020-0485-4">10.1038/S41401-020-0485-4</a></td>
  </tr>
  <tr>
    <td>2020-08-01</td>
    <td><a href="https://scholia.toolforge.org/Q98188230">In Silico Screening of Potential Spike Glycoprotein Inhibitors of SARS-CoV-2 with Drug Repurposing Strategy</a> (<a href="http://www.wikidata.org/entity/Q98188230">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S11655-020-3427-6">10.1007/S11655-020-3427-6</a></td>
  </tr>
  <tr>
    <td>2020-08-01</td>
    <td><a href="https://scholia.toolforge.org/Q98244444">Targeting SARS-CoV2 Spike Protein Receptor Binding Domain by Therapeutic Antibodies</a> (<a href="http://www.wikidata.org/entity/Q98244444">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BIOPHA.2020.110559">10.1016/J.BIOPHA.2020.110559</a></td>
  </tr>
  <tr>
    <td>2020-08-01</td>
    <td><a href="https://scholia.toolforge.org/Q98287547">Genomic variance of Open Reading Frames (ORFs) and Spike protein in severe acute respiratory syndrome coronavirus 2 (SARS-CoV-2)</a> (<a href="http://www.wikidata.org/entity/Q98287547">edit</a>)</td>
    <td><a href="https://doi.org/10.1097/JCMA.0000000000000387">10.1097/JCMA.0000000000000387</a></td>
  </tr>
  <tr>
    <td>2020-07-31</td>
    <td><a href="https://scholia.toolforge.org/Q98241584">Force-dependent stimulation of RNA unwinding by SARS-CoV-2 nsp13 helicase</a> (<a href="http://www.wikidata.org/entity/Q98241584">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.31.231274">10.1101/2020.07.31.231274</a></td>
  </tr>
  <tr>
    <td>2020-07-31</td>
    <td><a href="https://scholia.toolforge.org/Q98194088">Antibody response against SARS-CoV-2 spike protein and nucleoprotein evaluated by 4 automated immunoassays and 3 ELISAs</a> (<a href="http://www.wikidata.org/entity/Q98194088">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CMI.2020.07.038">10.1016/J.CMI.2020.07.038</a></td>
  </tr>
  <tr>
    <td>2020-07-31</td>
    <td><a href="https://scholia.toolforge.org/Q98241597">The SARS-CoV-2 Nucleocapsid phosphoprotein forms mutually exclusive condensates with RNA and the membrane-associated M protein</a> (<a href="http://www.wikidata.org/entity/Q98241597">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.30.228023">10.1101/2020.07.30.228023</a></td>
  </tr>
  <tr>
    <td>2020-07-29</td>
    <td><a href="https://scholia.toolforge.org/Q98164557">SARS-CoV-2 Orf9b suppresses type I interferon responses by targeting TOM70</a> (<a href="http://www.wikidata.org/entity/Q98164557">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41423-020-0514-8">10.1038/S41423-020-0514-8</a></td>
  </tr>
  <tr>
    <td>2020-07-29</td>
    <td><a href="https://scholia.toolforge.org/Q98164326">Crystal structure of SARS-CoV-2 nsp10/nsp16 2'-O-methylase and its implication on antiviral drug design</a> (<a href="http://www.wikidata.org/entity/Q98164326">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41392-020-00241-4">10.1038/S41392-020-00241-4</a></td>
  </tr>
  <tr>
    <td>2020-07-24</td>
    <td><a href="https://scholia.toolforge.org/Q97684756">Computational drug repurposing for the identification of SARS-CoV-2 main protease inhibitors</a> (<a href="http://www.wikidata.org/entity/Q97684756">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1796805">10.1080/07391102.2020.1796805</a></td>
  </tr>
  <tr>
    <td>2020-07-22</td>
    <td><a href="https://scholia.toolforge.org/Q97652986">Controlling the SARS-CoV-2 spike glycoprotein conformation</a> (<a href="http://www.wikidata.org/entity/Q97652986">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41594-020-0479-4">10.1038/S41594-020-0479-4</a></td>
  </tr>
  <tr>
    <td>2020-07-22</td>
    <td><a href="https://scholia.toolforge.org/Q97871821">Linear B-cell epitopes in the spike and nucleocapsid proteins as markers of SARS-CoV-2 exposure and disease severity</a> (<a href="http://www.wikidata.org/entity/Q97871821">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.EBIOM.2020.102911">10.1016/J.EBIOM.2020.102911</a></td>
  </tr>
  <tr>
    <td>2020-07-17</td>
    <td><a href="https://scholia.toolforge.org/Q97587089">Structural basis for translational shutdown and immune evasion by the Nsp1 protein of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q97587089">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABC8665">10.1126/SCIENCE.ABC8665</a></td>
  </tr>
  <tr>
    <td>2020-07-15</td>
    <td><a href="https://scholia.toolforge.org/Q97654059">Bivalent binding of a fully human IgG to the SARS-CoV-2 spike proteins reveals mechanisms of potent neutralization</a> (<a href="http://www.wikidata.org/entity/Q97654059">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.14.203414">10.1101/2020.07.14.203414</a></td>
  </tr>
  <tr>
    <td>2020-07-13</td>
    <td><a href="https://scholia.toolforge.org/Q97545168">Identification of potential drugs against SARS-CoV-2 non-structural protein 1 (nsp1)</a> (<a href="http://www.wikidata.org/entity/Q97545168">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1792992">10.1080/07391102.2020.1792992</a></td>
  </tr>
  <tr>
    <td>2020-07-12</td>
    <td><a href="https://scholia.toolforge.org/Q97558272">Architecture and self-assembly of the SARS-CoV-2 nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q97558272">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/PRO.3909">10.1002/PRO.3909</a></td>
  </tr>
  <tr>
    <td>2020-07-03</td>
    <td><a href="https://scholia.toolforge.org/Q96870819">Tracking changes in SARS-CoV-2 Spike: evidence that D614G increases infectivity of the COVID-19 virus</a> (<a href="http://www.wikidata.org/entity/Q96870819">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.06.043">10.1016/J.CELL.2020.06.043</a></td>
  </tr>
  <tr>
    <td>2020-06-24</td>
    <td><a href="https://scholia.toolforge.org/Q96648082">SARS-CoV-2 and SARS-CoV: Virtual Screening of Potential inhibitors targeting RNA-dependent RNA polymerase activity (NSP12)</a> (<a href="http://www.wikidata.org/entity/Q96648082">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.26222">10.1002/JMV.26222</a></td>
  </tr>
  <tr>
    <td>2020-06-24</td>
    <td><a href="https://scholia.toolforge.org/Q96647316">Molecular Basis for ADP-ribose Binding to the Mac1 Domain of SARS-CoV-2 Nsp3</a> (<a href="http://www.wikidata.org/entity/Q96647316">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.BIOCHEM.0C00309">10.1021/ACS.BIOCHEM.0C00309</a></td>
  </tr>
  <tr>
    <td>2020-06-23</td>
    <td><a href="https://scholia.toolforge.org/Q96693555">The ORF6, ORF8 and nucleocapsid proteins of SARS-CoV-2 inhibit type I interferon signaling pathway</a> (<a href="http://www.wikidata.org/entity/Q96693555">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.VIRUSRES.2020.198074">10.1016/J.VIRUSRES.2020.198074</a></td>
  </tr>
  <tr>
    <td>2020-06-22</td>
    <td><a href="https://scholia.toolforge.org/Q96613613">Structure-based virtual screening and molecular dynamics simulation of SARS-CoV-2 Guanine-N7 methyltransferase (nsp14) for identifying antiviral inhibitors against COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96613613">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1778535">10.1080/07391102.2020.1778535</a></td>
  </tr>
  <tr>
    <td>2020-06-18</td>
    <td><a href="https://scholia.toolforge.org/Q96576788">The ORF3a protein of SARS-CoV-2 induces apoptosis in cells</a> (<a href="http://www.wikidata.org/entity/Q96576788">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41423-020-0485-9">10.1038/S41423-020-0485-9</a></td>
  </tr>
  <tr>
    <td>2020-06-15</td>
    <td><a href="https://scholia.toolforge.org/Q96438128">A Putative Role of de-Mono-ADP-Ribosylation of STAT1 by the SARS-CoV-2 Nsp3 Protein in the Cytokine Storm Syndrome of COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96438128">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/V12060646">10.3390/V12060646</a></td>
  </tr>
  <tr>
    <td>2020-06-12</td>
    <td><a href="https://scholia.toolforge.org/Q96307702">SARS-CoV-2 nsp13, nsp14, nsp15 and orf6 function as potent interferon antagonists</a> (<a href="http://www.wikidata.org/entity/Q96307702">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1780953">10.1080/22221751.2020.1780953</a></td>
  </tr>
  <tr>
    <td>2020-06-10</td>
    <td><a href="https://scholia.toolforge.org/Q96231810">Identification of 22 N-glycosites on spike glycoprotein of SARS-CoV-2 and accessible surface glycopeptide motifs: implications for vaccination and antibody therapeutics</a> (<a href="http://www.wikidata.org/entity/Q96231810">edit</a>)</td>
    <td><a href="https://doi.org/10.1093/GLYCOB/CWAA052">10.1093/GLYCOB/CWAA052</a></td>
  </tr>
  <tr>
    <td>2020-06-09</td>
    <td><a href="https://scholia.toolforge.org/Q96769209">Crystal Structure of the SARS-CoV-2 Non-structural Protein 9, Nsp9</a> (<a href="http://www.wikidata.org/entity/Q96769209">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ISCI.2020.101258">10.1016/J.ISCI.2020.101258</a></td>
  </tr>
  <tr>
    <td>2020-06-08</td>
    <td><a href="https://scholia.toolforge.org/Q96230047">Antibody signature induced by SARS-CoV-2 spike protein immunogens in rabbits</a> (<a href="http://www.wikidata.org/entity/Q96230047">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCITRANSLMED.ABC3539">10.1126/SCITRANSLMED.ABC3539</a></td>
  </tr>
  <tr>
    <td>2020-06-05</td>
    <td><a href="https://scholia.toolforge.org/Q96163413">Identification of nsp1 gene as the target of SARS-CoV-2 real-time RT-PCR using nanopore whole genome sequencing</a> (<a href="http://www.wikidata.org/entity/Q96163413">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.26140">10.1002/JMV.26140</a></td>
  </tr>
  <tr>
    <td>2020-06-05</td>
    <td><a href="https://scholia.toolforge.org/Q96172081">Immune evasion via SARS-CoV-2 ORF8 protein?</a> (<a href="http://www.wikidata.org/entity/Q96172081">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41577-020-0360-Z">10.1038/S41577-020-0360-Z</a></td>
  </tr>
  <tr>
    <td>2020-06-01</td>
    <td><a href="https://scholia.toolforge.org/Q96027644">Comparing the Binding Interactions in the Receptor Binding Domains of SARS-CoV-2 and SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q96027644">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.JPCLETT.0C01064">10.1021/ACS.JPCLETT.0C01064</a></td>
  </tr>
  <tr>
    <td>2020-05-30</td>
    <td><a href="https://scholia.toolforge.org/Q96032555">Evaluation of RdRp & ORF-1b-nsp14-based real-time RT-PCR assays for confirmation of SARS-CoV-2 infection: An observational study</a> (<a href="http://www.wikidata.org/entity/Q96032555">edit</a>)</td>
    <td><a href="https://doi.org/10.4103/IJMR.IJMR_1256_20">10.4103/IJMR.IJMR_1256_20</a></td>
  </tr>
  <tr>
    <td>2020-05-30</td>
    <td><a href="https://scholia.toolforge.org/Q96342719">Structural and Biochemical Characterization of the nsp12-nsp7-nsp8 Core Polymerase Complex from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q96342719">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELREP.2020.107774">10.1016/J.CELREP.2020.107774</a></td>
  </tr>
  <tr>
    <td>2020-05-26</td>
    <td><a href="https://scholia.toolforge.org/Q95840619">SARS-CoV-2 strategically mimics proteolytic activation of human ENaC</a> (<a href="http://www.wikidata.org/entity/Q95840619">edit</a>)</td>
    <td><a href="https://doi.org/10.7554/ELIFE.58603">10.7554/ELIFE.58603</a></td>
  </tr>
  <tr>
    <td>2020-05-22</td>
    <td><a href="https://scholia.toolforge.org/Q95630795">Chemistry and Biology of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q95630795">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CHEMPR.2020.04.023">10.1016/J.CHEMPR.2020.04.023</a></td>
  </tr>
  <tr>
    <td>2020-05-21</td>
    <td><a href="https://scholia.toolforge.org/Q95301171">Structure of replicating SARS-CoV-2 polymerase</a> (<a href="http://www.wikidata.org/entity/Q95301171">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2368-8">10.1038/S41586-020-2368-8</a></td>
  </tr>
  <tr>
    <td>2020-05-19</td>
    <td><a href="https://scholia.toolforge.org/Q95603892">Structural basis for translational shutdown and immune evasion by the Nsp1 protein of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q95603892">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.18.102467">10.1101/2020.05.18.102467</a></td>
  </tr>
  <tr>
    <td>2020-05-19</td>
    <td><a href="https://scholia.toolforge.org/Q95309312">Characterization and noncovalent inhibition of the deubiquitinase and deISGylase activity of SARS-CoV-2 papain-like protease</a> (<a href="http://www.wikidata.org/entity/Q95309312">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSINFECDIS.0C00168">10.1021/ACSINFECDIS.0C00168</a></td>
  </tr>
  <tr>
    <td>2020-05-18</td>
    <td><a href="https://scholia.toolforge.org/Q95262934">Potent neutralizing antibodies against SARS-CoV-2 identified by high-throughput single-cell sequencing of convalescent patients' B cells</a> (<a href="http://www.wikidata.org/entity/Q95262934">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.05.025">10.1016/J.CELL.2020.05.025</a></td>
  </tr>
  <tr>
    <td>2020-05-14</td>
    <td><a href="https://scholia.toolforge.org/Q95305986">Highly Conserved Homotrimer Cavity Formed by the SARS-CoV-2 Spike Glycoprotein: A Novel Binding Site</a> (<a href="http://www.wikidata.org/entity/Q95305986">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/JCM9051473">10.3390/JCM9051473</a></td>
  </tr>
  <tr>
    <td>2020-05-10</td>
    <td><a href="https://scholia.toolforge.org/Q95297157">Human Intestinal Defensin 5 Inhibits SARS-CoV-2 Invasion by Cloaking ACE2</a> (<a href="http://www.wikidata.org/entity/Q95297157">edit</a>)</td>
    <td><a href="https://doi.org/10.1053/J.GASTRO.2020.05.015">10.1053/J.GASTRO.2020.05.015</a></td>
  </tr>
  <tr>
    <td>2020-05-06</td>
    <td><a href="https://scholia.toolforge.org/Q94589965">Cell entry mechanisms of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q94589965">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.2003138117">10.1073/PNAS.2003138117</a></td>
  </tr>
  <tr>
    <td>2020-05-04</td>
    <td><a href="https://scholia.toolforge.org/Q94520441">Site-specific glycan analysis of the SARS-CoV-2 spike</a> (<a href="http://www.wikidata.org/entity/Q94520441">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABB9983">10.1126/SCIENCE.ABB9983</a></td>
  </tr>
  <tr>
    <td>2020-04-30</td>
    <td><a href="https://scholia.toolforge.org/Q94470555">A SARS-CoV-2 protein interaction map reveals targets for drug repurposing</a> (<a href="http://www.wikidata.org/entity/Q94470555">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2286-9">10.1038/S41586-020-2286-9</a></td>
  </tr>
  <tr>
    <td>2020-04-29</td>
    <td><a href="https://scholia.toolforge.org/Q94450568">An in-silico evaluation of different Saikosaponins for their potency against SARS-CoV-2 using NSP15 and fusion spike glycoprotein as targets</a> (<a href="http://www.wikidata.org/entity/Q94450568">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1762741">10.1080/07391102.2020.1762741</a></td>
  </tr>
  <tr>
    <td>2020-04-28</td>
    <td><a href="https://scholia.toolforge.org/Q94500293">A Multibasic Cleavage Site in the Spike Protein of SARS-CoV-2 Is Essential for Infection of Human Lung Cells</a> (<a href="http://www.wikidata.org/entity/Q94500293">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.MOLCEL.2020.04.022">10.1016/J.MOLCEL.2020.04.022</a></td>
  </tr>
  <tr>
    <td>2020-04-27</td>
    <td><a href="https://scholia.toolforge.org/Q95601805">Structural Basis of RNA Cap Modification by SARS-CoV-2 Coronavirus</a> (<a href="http://www.wikidata.org/entity/Q95601805">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.04.26.061705">10.1101/2020.04.26.061705</a></td>
  </tr>
  <tr>
    <td>2020-04-25</td>
    <td><a href="https://scholia.toolforge.org/Q95604535">Validation of a SARS-CoV-2 spike protein ELISA for use in contact investigations and sero-surveillance</a> (<a href="http://www.wikidata.org/entity/Q95604535">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.04.24.057323">10.1101/2020.04.24.057323</a></td>
  </tr>
  <tr>
    <td>2020-04-20</td>
    <td><a href="https://scholia.toolforge.org/Q95627445">The crystal structure of nsp10-nsp16 heterodimer from SARS-CoV-2 in complex with S-adenosylmethionine</a> (<a href="http://www.wikidata.org/entity/Q95627445">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.04.17.047498">10.1101/2020.04.17.047498</a></td>
  </tr>
  <tr>
    <td>2020-04-17</td>
    <td><a href="https://scholia.toolforge.org/Q92028040">Crystal structure of Nsp15 endoribonuclease NendoU from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q92028040">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/PRO.3873">10.1002/PRO.3873</a></td>
  </tr>
  <tr>
    <td>2020-04-11</td>
    <td><a href="https://scholia.toolforge.org/Q95601327">On the interactions of the receptor-binding domain of SARS-CoV-1 and SARS-CoV-2 spike proteins with monoclonal antibodies and the receptor ACE2</a> (<a href="http://www.wikidata.org/entity/Q95601327">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.04.05.026377">10.1101/2020.04.05.026377</a></td>
  </tr>
  <tr>
    <td>2020-04-10</td>
    <td><a href="https://scholia.toolforge.org/Q91863840">Remdesivir and SARS-CoV-2: Structural requirements at both nsp12 RdRp and nsp14 Exonuclease active-sites</a> (<a href="http://www.wikidata.org/entity/Q91863840">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ANTIVIRAL.2020.104793">10.1016/J.ANTIVIRAL.2020.104793</a></td>
  </tr>
  <tr>
    <td>2020-04-10</td>
    <td><a href="https://scholia.toolforge.org/Q91864134">Evolutionary analysis of SARS-CoV-2: how mutation of Non-Structural Protein 6 (NSP6) could affect viral autophagy</a> (<a href="http://www.wikidata.org/entity/Q91864134">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JINF.2020.03.058">10.1016/J.JINF.2020.03.058</a></td>
  </tr>
  <tr>
    <td>2020-04-10</td>
    <td><a href="https://scholia.toolforge.org/Q91935604">SARS-CoV-2-encoded nucleocapsid protein acts as a viral suppressor of RNA interference in cells</a> (<a href="http://www.wikidata.org/entity/Q91935604">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S11427-020-1692-1">10.1007/S11427-020-1692-1</a></td>
  </tr>
  <tr>
    <td>2020-04-09</td>
    <td><a href="https://scholia.toolforge.org/Q89975279">Structure of Mpro from COVID-19 virus and discovery of its inhibitors</a> (<a href="http://www.wikidata.org/entity/Q89975279">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2223-Y">10.1038/S41586-020-2223-Y</a></td>
  </tr>
  <tr>
    <td>2020-04-08</td>
    <td><a href="https://scholia.toolforge.org/Q91810327">Development of a Novel, Genome Subtraction-Derived, SARS-CoV-2-Specific COVID-19-nsp2 Real-Time RT-PCR Assay and Its Evaluation Using Clinical Specimens</a> (<a href="http://www.wikidata.org/entity/Q91810327">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/IJMS21072574">10.3390/IJMS21072574</a></td>
  </tr>
  <tr>
    <td>2020-04-02</td>
    <td><a href="https://scholia.toolforge.org/Q95601008">Molecular Basis for ADP-ribose Binding to the Macro-X Domain of SARS-CoV-2 Nsp3</a> (<a href="http://www.wikidata.org/entity/Q95601008">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.31.014639">10.1101/2020.03.31.014639</a></td>
  </tr>
  <tr>
    <td>2020-03-31</td>
    <td><a href="https://scholia.toolforge.org/Q95627635">Crystal structure of the SARS-CoV-2 non-structural protein 9, Nsp9</a> (<a href="http://www.wikidata.org/entity/Q95627635">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.28.013920">10.1101/2020.03.28.013920</a></td>
  </tr>
  <tr>
    <td>2020-03-30</td>
    <td><a href="https://scholia.toolforge.org/Q90738246">Structural basis of receptor recognition by SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q90738246">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2179-Y">10.1038/S41586-020-2179-Y</a></td>
  </tr>
  <tr>
    <td>2020-03-30</td>
    <td><a href="https://scholia.toolforge.org/Q90738260">Structure of the SARS-CoV-2 spike receptor-binding domain bound to the ACE2 receptor</a> (<a href="http://www.wikidata.org/entity/Q90738260">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2180-5">10.1038/S41586-020-2180-5</a></td>
  </tr>
  <tr>
    <td>2020-03-28</td>
    <td><a href="https://scholia.toolforge.org/Q90799545">Molecular characterization of SARS-CoV-2 in the first COVID-19 cluster in France reveals an amino acid deletion in nsp2 (Asp268del)</a> (<a href="http://www.wikidata.org/entity/Q90799545">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CMI.2020.03.020">10.1016/J.CMI.2020.03.020</a></td>
  </tr>
  <tr>
    <td>2020-03-27</td>
    <td><a href="https://scholia.toolforge.org/Q90713511">Characterization of spike glycoprotein of SARS-CoV-2 on virus entry and its immune cross-reactivity with SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q90713511">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-020-15562-9">10.1038/S41467-020-15562-9</a></td>
  </tr>
  <tr>
    <td>2020-03-22</td>
    <td><a href="https://scholia.toolforge.org/Q88978136">Molecular characterization of SARS-CoV-2 in the first COVID-19 cluster in France reveals an amino-acid deletion in nsp2 (Asp268Del)</a> (<a href="http://www.wikidata.org/entity/Q88978136">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.19.998179">10.1101/2020.03.19.998179</a></td>
  </tr>
  <tr>
    <td>2020-03-20</td>
    <td><a href="https://scholia.toolforge.org/Q88219766">Crystal structure of SARS-CoV-2 main protease provides a basis for design of improved α-ketoamide inhibitors</a> (<a href="http://www.wikidata.org/entity/Q88219766">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABB3405">10.1126/SCIENCE.ABB3405</a></td>
  </tr>
  <tr>
    <td>2020-03-20</td>
    <td><a href="https://scholia.toolforge.org/Q88978164">The first-in-class peptide binder to the SARS-CoV-2 spike protein</a> (<a href="http://www.wikidata.org/entity/Q88978164">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.19.999318">10.1101/2020.03.19.999318</a></td>
  </tr>
  <tr>
    <td>2020-03-18</td>
    <td><a href="https://scholia.toolforge.org/Q87995005">1.80 Angstrom Resolution Crystal Structure of NSP16 - NSP10 Complex from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87995005">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6W4H/PDB">10.2210/PDB6W4H/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-18</td>
    <td><a href="https://scholia.toolforge.org/Q88048219">Crystal structure of SARS-CoV-2 nucleocapsid protein N-terminal RNA binding domain</a> (<a href="http://www.wikidata.org/entity/Q88048219">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6M3M/PDB">10.2210/PDB6M3M/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-13</td>
    <td><a href="https://scholia.toolforge.org/Q88977278">The inhaled corticosteroid ciclesonide blocks coronavirus RNA replication by targeting viral NSP15</a> (<a href="http://www.wikidata.org/entity/Q88977278">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.11.987016">10.1101/2020.03.11.987016</a></td>
  </tr>
  <tr>
    <td>2020-03-11</td>
    <td><a href="https://scholia.toolforge.org/Q87968356">The crystal structure of COVID-19 main protease in apo form</a> (<a href="http://www.wikidata.org/entity/Q87968356">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6M03/PDB">10.2210/PDB6M03/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-11</td>
    <td><a href="https://scholia.toolforge.org/Q87995286">Crystal Structure of ADP ribose phosphatase of NSP3 from SARS CoV-2 in the complex with ADP ribose</a> (<a href="http://www.wikidata.org/entity/Q87995286">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6W02/PDB">10.2210/PDB6W02/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-11</td>
    <td><a href="https://scholia.toolforge.org/Q87995812">COVID-19 main protease with unliganded active site (2019-nCoV, coronavirus disease 2019, SARS-CoV-2)</a> (<a href="http://www.wikidata.org/entity/Q87995812">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6Y84/PDB">10.2210/PDB6Y84/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-11</td>
    <td><a href="https://scholia.toolforge.org/Q87995864">PanDDA analysis group deposition -- Crystal Structure of COVID-19 main protease in complex with Z1367324110</a> (<a href="http://www.wikidata.org/entity/Q87995864">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB5R81/PDB">10.2210/PDB5R81/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-11</td>
    <td><a href="https://scholia.toolforge.org/Q87995869">PanDDA analysis group deposition -- Crystal Structure of COVID-19 main protease in complex with Z219104216</a> (<a href="http://www.wikidata.org/entity/Q87995869">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB5R82/PDB">10.2210/PDB5R82/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-11</td>
    <td><a href="https://scholia.toolforge.org/Q88047504">PanDDA analysis group deposition -- Crystal Structure of COVID-19 main protease in complex with Z44592329</a> (<a href="http://www.wikidata.org/entity/Q88047504">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB5R83/PDB">10.2210/PDB5R83/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-10</td>
    <td><a href="https://scholia.toolforge.org/Q89023599">Whole Genome Sequence Analysis and Homology Modelling of a 3C Like Peptidase and a Non-Structural Protein 3 of the SARS-CoV-2 Shows Protein Ligand Interaction with an Aza-Peptide and a Noncovalent Lead Inhibitor with Possible Antiviral Properties</a> (<a href="http://www.wikidata.org/entity/Q89023599">edit</a>)</td>
    <td><a href="https://doi.org/10.26434/CHEMRXIV.11846943">10.26434/CHEMRXIV.11846943</a></td>
  </tr>
  <tr>
    <td>2020-03-06</td>
    <td><a href="https://scholia.toolforge.org/Q87973551">Structure, Function, and Antigenicity of the SARS-CoV-2 Spike Glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q87973551">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.02.058">10.1016/J.CELL.2020.02.058</a></td>
  </tr>
  <tr>
    <td>2020-03-04</td>
    <td><a href="https://scholia.toolforge.org/Q87726414">Structural basis for the recognition of the SARS-CoV-2 by full-length human ACE2</a> (<a href="http://www.wikidata.org/entity/Q87726414">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABB2762">10.1126/SCIENCE.ABB2762</a></td>
  </tr>
  <tr>
    <td>2020-03-04</td>
    <td><a href="https://scholia.toolforge.org/Q87995012">Crystal Structure of ADP ribose phosphatase of NSP3 from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87995012">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6VXS/PDB">10.2210/PDB6VXS/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-04</td>
    <td><a href="https://scholia.toolforge.org/Q87995630">Crystal structure of the free enzyme of the SARS-CoV-2 (2019-nCoV) main protease</a> (<a href="http://www.wikidata.org/entity/Q87995630">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6Y2E/PDB">10.2210/PDB6Y2E/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-04</td>
    <td><a href="https://scholia.toolforge.org/Q88047678">Crystal structure (monoclinic form) of the complex resulting from the reaction between SARS-CoV-2 (2019-nCoV) main protease and tert-butyl (1-((S)-1-(((S)-4-(benzylamino)-3,4-dioxo-1-((S)-2-oxopyrrolidin-3-yl)butan-2-yl)amino)-3-cyclopropyl-1-oxoprop</a> (<a href="http://www.wikidata.org/entity/Q88047678">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6Y2F/PDB">10.2210/PDB6Y2F/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-04</td>
    <td><a href="https://scholia.toolforge.org/Q88292103">SARS-CoV-2 Cell Entry Depends on ACE2 and TMPRSS2 and Is Blocked by a Clinically Proven Protease Inhibitor</a> (<a href="http://www.wikidata.org/entity/Q88292103">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.02.052">10.1016/J.CELL.2020.02.052</a></td>
  </tr>
  <tr>
    <td>2020-03-03</td>
    <td><a href="https://scholia.toolforge.org/Q87973252">Crystal structure of Nsp15 endoribonuclease NendoU from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87973252">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.02.968388">10.1101/2020.03.02.968388</a></td>
  </tr>
  <tr>
    <td>2020-02-27</td>
    <td><a href="https://scholia.toolforge.org/Q87967188">Structure of Mpro from COVID-19 virus and discovery of its inhibitors</a> (<a href="http://www.wikidata.org/entity/Q87967188">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.02.26.964882">10.1101/2020.02.26.964882</a></td>
  </tr>
  <tr>
    <td>2020-02-20</td>
    <td><a href="https://scholia.toolforge.org/Q88974655">Structure, function and antigenicity of the SARS-CoV-2 spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88974655">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.02.19.956581">10.1101/2020.02.19.956581</a></td>
  </tr>
  <tr>
    <td>2020-02-19</td>
    <td><a href="https://scholia.toolforge.org/Q89108866">Cryo-EM structure of the 2019-nCoV spike in the prefusion conformation</a> (<a href="http://www.wikidata.org/entity/Q89108866">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABB2507">10.1126/SCIENCE.ABB2507</a></td>
  </tr>
  <tr>
    <td>2020-02-17</td>
    <td><a href="https://scholia.toolforge.org/Q87461535">Potent binding of 2019 novel coronavirus spike protein by a SARS coronavirus-specific human monoclonal antibody</a> (<a href="http://www.wikidata.org/entity/Q87461535">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1729069">10.1080/22221751.2020.1729069</a></td>
  </tr>
  <tr>
    <td>2020-02-16</td>
    <td><a href="https://scholia.toolforge.org/Q88974163">Cryo-EM Structure of the 2019-nCoV Spike in the Prefusion Conformation</a> (<a href="http://www.wikidata.org/entity/Q88974163">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.02.11.944462">10.1101/2020.02.11.944462</a></td>
  </tr>
  <tr>
    <td>2020-02-11</td>
    <td><a href="https://scholia.toolforge.org/Q89665124">Fusion mechanism of 2019-nCoV and fusion inhibitors targeting HR1 domain in spike protein</a> (<a href="http://www.wikidata.org/entity/Q89665124">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41423-020-0374-2">10.1038/S41423-020-0374-2</a></td>
  </tr>
  <tr>
    <td>2020-02-05</td>
    <td><a href="https://scholia.toolforge.org/Q87967181">The crystal structure of COVID-19 main protease in complex with an inhibitor N3</a> (<a href="http://www.wikidata.org/entity/Q87967181">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6LU7/PDB">10.2210/PDB6LU7/PDB</a></td>
  </tr>
  <tr>
    <td>2020-01-31</td>
    <td><a href="https://scholia.toolforge.org/Q84112018">Uncanny similarity of unique inserts in the 2019-nCoV spike protein to HIV-1 gp120 and Gag</a> (<a href="http://www.wikidata.org/entity/Q84112018">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.01.30.927871">10.1101/2020.01.30.927871</a></td>
  </tr>
  <tr>
    <td>2020-01-22</td>
    <td><a href="https://scholia.toolforge.org/Q83460376">Homologous recombination within the spike glycoprotein of the newly identified coronavirus may boost cross‐species transmission from snake to human</a> (<a href="http://www.wikidata.org/entity/Q83460376">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.25682">10.1002/JMV.25682</a></td>
  </tr>
  <tr>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q89187838">Crystal Structure of NSP15 Endoribonuclease from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q89187838">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6VWW/PDB">10.2210/PDB6VWW/PDB</a></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litSARSCoV2Proteins.rq | sed 's+<lang/>+en+' > litSARSCoV2Proteins.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litSARSCoV2Proteins.rq
```
This SPARQL query is available under CCZero.
