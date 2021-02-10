# litSARSCoV2Proteins.rq
**コード例:** [curl](#curl)
### SPARQL
```sparql
SELECT (MAX(?dates) as ?date) ?work ?workLabel ?doi WHERE {
  ?protein wdt:P703 wd:Q82069695 ; wdt:P31 wd:Q8054 .
  ?work wdt:P921 ?protein .
  OPTIONAL { ?work wdt:P577 ?dates . }
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
} GROUP BY ?work ?workLabel ?doi ORDER BY DESC(?date)
```
[実行](https://query.wikidata.org/embed.html#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fprotein%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%0A) もしくは [編集](https://query.wikidata.org/#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fprotein%20wdt%3AP703%20wd%3AQ82069695%20%3B%20wdt%3AP31%20wd%3AQ8054%20.%0A%20%20%3Fwork%20wdt%3AP921%20%3Fprotein%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%0A)


### 結果
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>doi</b></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q104470996">Overexpression of SARS-CoV-2 protein ORF6 dislocates RAE1 and NUP98 from the nuclear pore complex</a> (<a href="http://www.wikidata.org/entity/Q104470996">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBRC.2020.11.115">10.1016/J.BBRC.2020.11.115</a></td>
  </tr>
  <tr>
    <td>2020-12-31</td>
    <td><a href="https://scholia.toolforge.org/Q104649867">A novel virtual screening procedure identifies Pralatrexate as inhibitor of SARS-CoV-2 RdRp and it reduces viral replication in vitro</a> (<a href="http://www.wikidata.org/entity/Q104649867">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PCBI.1008489">10.1371/JOURNAL.PCBI.1008489</a></td>
  </tr>
  <tr>
    <td>2020-12-16</td>
    <td><a href="https://scholia.toolforge.org/Q104503903">Force-dependent stimulation of RNA unwinding by SARS-CoV-2 nsp13 helicase</a> (<a href="http://www.wikidata.org/entity/Q104503903">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BPJ.2020.11.2276">10.1016/J.BPJ.2020.11.2276</a></td>
  </tr>
  <tr>
    <td>2020-12-11</td>
    <td><a href="https://scholia.toolforge.org/Q104285726">High-Throughput Screening and Quantum Mechanics for Identifying Potent Inhibitors against Mac1 Domain of SARS-CoV-2 Nsp3</a> (<a href="http://www.wikidata.org/entity/Q104285726">edit</a>)</td>
    <td><a href="https://doi.org/10.1109/TCBB.2020.3037136">10.1109/TCBB.2020.3037136</a></td>
  </tr>
  <tr>
    <td>2020-12-10</td>
    <td><a href="https://scholia.toolforge.org/Q104489374">SARS-CoV-2 Nsp16 activation mechanism and a cryptic pocket with pan-coronavirus antiviral potential</a> (<a href="http://www.wikidata.org/entity/Q104489374">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.12.10.420109">10.1101/2020.12.10.420109</a></td>
  </tr>
  <tr>
    <td>2020-12-09</td>
    <td><a href="https://scholia.toolforge.org/Q104289599">Ritonavir may inhibit exoribonuclease activity of nsp14 from the SARS-CoV-2 virus and potentiate the activity of chain terminating drugs</a> (<a href="http://www.wikidata.org/entity/Q104289599">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.IJBIOMAC.2020.12.038">10.1016/J.IJBIOMAC.2020.12.038</a></td>
  </tr>
  <tr>
    <td>2020-12-07</td>
    <td><a href="https://scholia.toolforge.org/Q104438055">Spike Protein of SARS-CoV-2 Activates Macrophages and Contributes to Induction of Acute Lung Inflammations in Mice</a> (<a href="http://www.wikidata.org/entity/Q104438055">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.12.07.414706">10.1101/2020.12.07.414706</a></td>
  </tr>
  <tr>
    <td>2020-12-03</td>
    <td><a href="https://scholia.toolforge.org/Q104058096">1H, 13C, and 15N backbone chemical shift assignments of the C-terminal dimerization domain of SARS-CoV-2 nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q104058096">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S12104-020-09995-Y">10.1007/S12104-020-09995-Y</a></td>
  </tr>
  <tr>
    <td>2020-12-02</td>
    <td><a href="https://scholia.toolforge.org/Q103827469">Comparative Multiplexed Interactomics of SARS-CoV-2 and Homologous Coronavirus Nonstructural Proteins Identifies Unique and Shared Host-Cell Dependencies</a> (<a href="http://www.wikidata.org/entity/Q103827469">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSINFECDIS.0C00500">10.1021/ACSINFECDIS.0C00500</a></td>
  </tr>
  <tr>
    <td>2020-12-02</td>
    <td><a href="https://scholia.toolforge.org/Q103835808">The viral protein NSP1 acts as a ribosome gatekeeper for shutting down host translation and fostering SARS-CoV-2 translation</a> (<a href="http://www.wikidata.org/entity/Q103835808">edit</a>)</td>
    <td><a href="https://doi.org/10.1261/RNA.078121.120">10.1261/RNA.078121.120</a></td>
  </tr>
  <tr>
    <td>2020-12-02</td>
    <td><a href="https://scholia.toolforge.org/Q103828986">Structural basis of RNA recognition by the SARS-CoV-2 nucleocapsid phosphoprotein</a> (<a href="http://www.wikidata.org/entity/Q103828986">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PPAT.1009100">10.1371/JOURNAL.PPAT.1009100</a></td>
  </tr>
  <tr>
    <td>2020-12-01</td>
    <td><a href="https://scholia.toolforge.org/Q98195228">Flavonoids with inhibitory activity against SARS-CoV-2 3CLpro</a> (<a href="http://www.wikidata.org/entity/Q98195228">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/14756366.2020.1801672">10.1080/14756366.2020.1801672</a></td>
  </tr>
  <tr>
    <td>2020-12-01</td>
    <td><a href="https://scholia.toolforge.org/Q104286385">Structure, Function, and Antigenicity of the SARS-CoV-2 Spike Glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q104286385">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.11.032">10.1016/J.CELL.2020.11.032</a></td>
  </tr>
  <tr>
    <td>2020-11-30</td>
    <td><a href="https://scholia.toolforge.org/Q103837489">Characterization of SARS-CoV-2 N protein reveals multiple functional consequences of the C-terminal domain</a> (<a href="http://www.wikidata.org/entity/Q103837489">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.11.30.404905">10.1101/2020.11.30.404905</a></td>
  </tr>
  <tr>
    <td>2020-11-27</td>
    <td><a href="https://scholia.toolforge.org/Q103027765">Nucleocapsid protein of SARS-CoV-2 phase separates into RNA-rich polymerase-containing condensates</a> (<a href="http://www.wikidata.org/entity/Q103027765">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-020-19843-1">10.1038/S41467-020-19843-1</a></td>
  </tr>
  <tr>
    <td>2020-11-27</td>
    <td><a href="https://scholia.toolforge.org/Q104130368">Genomic RNA Elements Drive Phase Separation of the SARS-CoV-2 Nucleocapsid</a> (<a href="http://www.wikidata.org/entity/Q104130368">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.MOLCEL.2020.11.041">10.1016/J.MOLCEL.2020.11.041</a></td>
  </tr>
  <tr>
    <td>2020-11-24</td>
    <td><a href="https://scholia.toolforge.org/Q103837502">Fragment Binding to the Nsp3 Macrodomain of SARS-CoV-2 Identified Through Crystallographic Screening and Computational Docking</a> (<a href="http://www.wikidata.org/entity/Q103837502">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.11.24.393405">10.1101/2020.11.24.393405</a></td>
  </tr>
  <tr>
    <td>2020-11-24</td>
    <td><a href="https://scholia.toolforge.org/Q102378266">Structure of nonstructural protein 1 from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q102378266">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.02019-20">10.1128/JVI.02019-20</a></td>
  </tr>
  <tr>
    <td>2020-11-23</td>
    <td><a href="https://scholia.toolforge.org/Q102328270">1H,13C and 15N chemical shift assignments of the SUD domains of SARS-CoV-2 non-structural protein 3c: "the N-terminal domain-SUD-N"</a> (<a href="http://www.wikidata.org/entity/Q102328270">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S12104-020-09987-Y">10.1007/S12104-020-09987-Y</a></td>
  </tr>
  <tr>
    <td>2020-11-23</td>
    <td><a href="https://scholia.toolforge.org/Q102335432">The SARS-CoV-2 Envelope and Membrane proteins modulate maturation and retention of the Spike protein, allowing assembly of virus-like particles</a> (<a href="http://www.wikidata.org/entity/Q102335432">edit</a>)</td>
    <td><a href="https://doi.org/10.1074/JBC.RA120.016175">10.1074/JBC.RA120.016175</a></td>
  </tr>
  <tr>
    <td>2020-11-20</td>
    <td><a href="https://scholia.toolforge.org/Q102220619">1H, 13C, and 15N backbone and side chain chemical shift assignments of the SARS-CoV-2 non-structural protein 7</a> (<a href="http://www.wikidata.org/entity/Q102220619">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S12104-020-09985-0">10.1007/S12104-020-09985-0</a></td>
  </tr>
  <tr>
    <td>2020-11-20</td>
    <td><a href="https://scholia.toolforge.org/Q103035724">Phosphoregulation of Phase Separation by the SARS-CoV-2 N Protein Suggests a Biophysical Basis for its Dual Functions</a> (<a href="http://www.wikidata.org/entity/Q103035724">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.MOLCEL.2020.11.025">10.1016/J.MOLCEL.2020.11.025</a></td>
  </tr>
  <tr>
    <td>2020-11-18</td>
    <td><a href="https://scholia.toolforge.org/Q104533846">Room Temperature Structure of SARS-CoV-2 Nsp10/16 Methyltransferase in a Complex with Cap-0 and SAM Determined by Pink-Beam Serial Crystallography</a> (<a href="http://www.wikidata.org/entity/Q104533846">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB7KOA/PDB">10.2210/PDB7KOA/PDB</a></td>
  </tr>
  <tr>
    <td>2020-11-18</td>
    <td><a href="https://scholia.toolforge.org/Q102152220">SARS-CoV-2 structure and replication characterized by in situ cryo-electron tomography</a> (<a href="http://www.wikidata.org/entity/Q102152220">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-020-19619-7">10.1038/S41467-020-19619-7</a></td>
  </tr>
  <tr>
    <td>2020-11-18</td>
    <td><a href="https://scholia.toolforge.org/Q104523291">Sequential ER stress and inflammatory responses are induced by SARS-CoV-2 ORF3 through ERphagy</a> (<a href="http://www.wikidata.org/entity/Q104523291">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.11.17.387902">10.1101/2020.11.17.387902</a></td>
  </tr>
  <tr>
    <td>2020-11-18</td>
    <td><a href="https://scholia.toolforge.org/Q102145950">Loss of orf3b in the circulating SARS-CoV-2 strains</a> (<a href="http://www.wikidata.org/entity/Q102145950">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1852892">10.1080/22221751.2020.1852892</a></td>
  </tr>
  <tr>
    <td>2020-11-17</td>
    <td><a href="https://scholia.toolforge.org/Q102131196">SARS-CoV-2 nucleocapsid protein phase-separates with RNA and with human hnRNPs</a> (<a href="http://www.wikidata.org/entity/Q102131196">edit</a>)</td>
    <td><a href="https://doi.org/10.15252/EMBJ.2020106478">10.15252/EMBJ.2020106478</a></td>
  </tr>
  <tr>
    <td>2020-11-16</td>
    <td><a href="https://scholia.toolforge.org/Q104523240">Analysis of SARS-CoV-2 spike glycosylation reveals shedding of a vaccine candidate</a> (<a href="http://www.wikidata.org/entity/Q104523240">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.11.16.384594">10.1101/2020.11.16.384594</a></td>
  </tr>
  <tr>
    <td>2020-11-14</td>
    <td><a href="https://scholia.toolforge.org/Q102374059">Cryo-EM Structure of an Extended SARS-CoV-2 Replication and Transcription Complex Reveals an Intermediate State in Cap Synthesis</a> (<a href="http://www.wikidata.org/entity/Q102374059">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.11.016">10.1016/J.CELL.2020.11.016</a></td>
  </tr>
  <tr>
    <td>2020-11-12</td>
    <td><a href="https://scholia.toolforge.org/Q104498887">Bifurcations and mutation hot-spots in SARS-CoV-2 spike protein</a> (<a href="http://www.wikidata.org/entity/Q104498887">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.11.11.378828">10.1101/2020.11.11.378828</a></td>
  </tr>
  <tr>
    <td>2020-11-12</td>
    <td><a href="https://scholia.toolforge.org/Q104499063">ORF3a mediated-incomplete autophagy facilitates SARS-CoV-2 replication</a> (<a href="http://www.wikidata.org/entity/Q104499063">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.11.12.380709">10.1101/2020.11.12.380709</a></td>
  </tr>
  <tr>
    <td>2020-11-11</td>
    <td><a href="https://scholia.toolforge.org/Q101574529">Structure and drug binding of the SARS-CoV-2 envelope protein transmembrane domain in lipid bilayers</a> (<a href="http://www.wikidata.org/entity/Q101574529">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41594-020-00536-8">10.1038/S41594-020-00536-8</a></td>
  </tr>
  <tr>
    <td>2020-11-11</td>
    <td><a href="https://scholia.toolforge.org/Q104514404">Nsp1 of SARS-CoV-2 Stimulates Host Translation Termination</a> (<a href="http://www.wikidata.org/entity/Q104514404">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.11.11.377739">10.1101/2020.11.11.377739</a></td>
  </tr>
  <tr>
    <td>2020-11-10</td>
    <td><a href="https://scholia.toolforge.org/Q104501956">SARS-CoV-2 Orf6 hijacks Nup98 to block STAT nuclear import and antagonize interferon signaling</a> (<a href="http://www.wikidata.org/entity/Q104501956">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.2016650117">10.1073/PNAS.2016650117</a></td>
  </tr>
  <tr>
    <td>2020-11-09</td>
    <td><a href="https://scholia.toolforge.org/Q104499459">Towards Targeting the Disordered SARS-CoV-2 Nsp2 C-terminal Region: Partial Structure and Dampened Mobility Revealed by NMR Spectroscopy</a> (<a href="http://www.wikidata.org/entity/Q104499459">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.11.09.374173">10.1101/2020.11.09.374173</a></td>
  </tr>
  <tr>
    <td>2020-11-08</td>
    <td><a href="https://scholia.toolforge.org/Q104530011">RNA 2'-O-methylation modification and its implication in COVID-19 immunity</a> (<a href="http://www.wikidata.org/entity/Q104530011">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41420-020-00358-Z">10.1038/S41420-020-00358-Z</a></td>
  </tr>
  <tr>
    <td>2020-11-07</td>
    <td><a href="https://scholia.toolforge.org/Q101410918">1H, 13C, and 15N backbone chemical shift assignments of coronavirus-2 non-structural protein Nsp10</a> (<a href="http://www.wikidata.org/entity/Q101410918">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S12104-020-09984-1">10.1007/S12104-020-09984-1</a></td>
  </tr>
  <tr>
    <td>2020-11-05</td>
    <td><a href="https://scholia.toolforge.org/Q101337845">Lysine 164 is critical for SARS-CoV-2 Nsp1 inhibition of host gene expression</a> (<a href="http://www.wikidata.org/entity/Q101337845">edit</a>)</td>
    <td><a href="https://doi.org/10.1099/JGV.0.001513">10.1099/JGV.0.001513</a></td>
  </tr>
  <tr>
    <td>2020-11-04</td>
    <td><a href="https://scholia.toolforge.org/Q101408752">Coevolution, Dynamics and Allostery Conspire in Shaping Cooperative Binding and Signal Transmission of the SARS-CoV-2 Spike Protein with Human Angiotensin-Converting Enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q101408752">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/IJMS21218268">10.3390/IJMS21218268</a></td>
  </tr>
  <tr>
    <td>2020-11-03</td>
    <td><a href="https://scholia.toolforge.org/Q101405588">A Computational Approach for Identifying Potential Phytochemicals Against Non-structural Protein 1 (Nsp1) of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q101405588">edit</a>)</td>
    <td><a href="https://doi.org/10.2174/1386207323999201103211106">10.2174/1386207323999201103211106</a></td>
  </tr>
  <tr>
    <td>2020-11-02</td>
    <td><a href="https://scholia.toolforge.org/Q101150795">Structure of the SARS-CoV-2 Nsp1/5'-Untranslated Region Complex and Implications for Potential Therapeutic Targets, a Vaccine, and Virulence</a> (<a href="http://www.wikidata.org/entity/Q101150795">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.JPCLETT.0C02818">10.1021/ACS.JPCLETT.0C02818</a></td>
  </tr>
  <tr>
    <td>2020-11-01</td>
    <td><a href="https://scholia.toolforge.org/Q104499709">An insight into SARS-CoV-2 Membrane protein interaction with Spike, Envelope, and Nucleocapsid proteins</a> (<a href="http://www.wikidata.org/entity/Q104499709">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.30.363002">10.1101/2020.10.30.363002</a></td>
  </tr>
  <tr>
    <td>2020-10-29</td>
    <td><a href="https://scholia.toolforge.org/Q102059631">Nonstructural Protein 1 of SARS-CoV-2 Is a Potent Pathogenicity Factor Redirecting Host Protein Synthesis Machinery toward Viral RNA</a> (<a href="http://www.wikidata.org/entity/Q102059631">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.MOLCEL.2020.10.034">10.1016/J.MOLCEL.2020.10.034</a></td>
  </tr>
  <tr>
    <td>2020-10-27</td>
    <td><a href="https://scholia.toolforge.org/Q101038989">SARS-CoV-2 membrane glycoprotein M antagonizes the MAVS-mediated innate antiviral response</a> (<a href="http://www.wikidata.org/entity/Q101038989">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41423-020-00571-X">10.1038/S41423-020-00571-X</a></td>
  </tr>
  <tr>
    <td>2020-10-27</td>
    <td><a href="https://scholia.toolforge.org/Q104533610">SARS-CoV-2 viroporin triggers the NLRP3 inflammatory pathway</a> (<a href="http://www.wikidata.org/entity/Q104533610">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.27.357731">10.1101/2020.10.27.357731</a></td>
  </tr>
  <tr>
    <td>2020-10-23</td>
    <td><a href="https://scholia.toolforge.org/Q104502003">SARS-CoV-2 Nucleocapsid protein attenuates stress granule formation and alters gene expression via direct interaction with host mRNAs</a> (<a href="http://www.wikidata.org/entity/Q104502003">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.23.342113">10.1101/2020.10.23.342113</a></td>
  </tr>
  <tr>
    <td>2020-10-22</td>
    <td><a href="https://scholia.toolforge.org/Q101235429">The SARS-CoV-2 Spike Glycoprotein as a Drug and Vaccine Target: Structural Insights into Its Complexes with ACE2 and Antibodies</a> (<a href="http://www.wikidata.org/entity/Q101235429">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/CELLS9112343">10.3390/CELLS9112343</a></td>
  </tr>
  <tr>
    <td>2020-10-20</td>
    <td><a href="https://scholia.toolforge.org/Q100750024">Neuropilin-1 facilitates SARS-CoV-2 cell entry and infectivity</a> (<a href="http://www.wikidata.org/entity/Q100750024">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABD2985">10.1126/SCIENCE.ABD2985</a></td>
  </tr>
  <tr>
    <td>2020-10-20</td>
    <td><a href="https://scholia.toolforge.org/Q100750026">Neuropilin-1 is a host factor for SARS-CoV-2 infection</a> (<a href="http://www.wikidata.org/entity/Q100750026">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABD3072">10.1126/SCIENCE.ABD3072</a></td>
  </tr>
  <tr>
    <td>2020-10-20</td>
    <td><a href="https://scholia.toolforge.org/Q104472899">Accurate Diagnosis of COVID-19 by a Novel Immunogenic Secreted SARS-CoV-2 orf8 Protein</a> (<a href="http://www.wikidata.org/entity/Q104472899">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/MBIO.02431-20">10.1128/MBIO.02431-20</a></td>
  </tr>
  <tr>
    <td>2020-10-20</td>
    <td><a href="https://scholia.toolforge.org/Q100750570">Author Correction: SARS-CoV-2 Nsp1 binds the ribosomal mRNA channel to inhibit translation</a> (<a href="http://www.wikidata.org/entity/Q100750570">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41594-020-00533-X">10.1038/S41594-020-00533-X</a></td>
  </tr>
  <tr>
    <td>2020-10-15</td>
    <td><a href="https://scholia.toolforge.org/Q104527803">A high throughput RNA displacement assay for screening SARS-CoV-2 nsp10-nsp16 complex towards developing therapeutics for COVID-19</a> (<a href="http://www.wikidata.org/entity/Q104527803">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.14.340034">10.1101/2020.10.14.340034</a></td>
  </tr>
  <tr>
    <td>2020-10-14</td>
    <td><a href="https://scholia.toolforge.org/Q100536136">Discovery of COVID-19 Inhibitors Targeting the SARS-CoV-2 Nsp13 Helicase</a> (<a href="http://www.wikidata.org/entity/Q100536136">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.JPCLETT.0C02421">10.1021/ACS.JPCLETT.0C02421</a></td>
  </tr>
  <tr>
    <td>2020-10-14</td>
    <td><a href="https://scholia.toolforge.org/Q104439879">The viral protein NSP1 acts as a ribosome gatekeeper for shutting down host translation and fostering SARS-CoV-2 translation</a> (<a href="http://www.wikidata.org/entity/Q104439879">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.14.339515">10.1101/2020.10.14.339515</a></td>
  </tr>
  <tr>
    <td>2020-10-12</td>
    <td><a href="https://scholia.toolforge.org/Q104502054">Sequences in the cytoplasmic tail of SARS-CoV-2 spike facilitate syncytia formation</a> (<a href="http://www.wikidata.org/entity/Q104502054">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.12.335562">10.1101/2020.10.12.335562</a></td>
  </tr>
  <tr>
    <td>2020-10-12</td>
    <td><a href="https://scholia.toolforge.org/Q100751848">Mutations of SARS-CoV-2 nsp14 exhibit strong association with increased genome-wide mutation load</a> (<a href="http://www.wikidata.org/entity/Q100751848">edit</a>)</td>
    <td><a href="https://doi.org/10.7717/PEERJ.10181">10.7717/PEERJ.10181</a></td>
  </tr>
  <tr>
    <td>2020-10-12</td>
    <td><a href="https://scholia.toolforge.org/Q104522379">Understanding the phase separation characteristics of nucleocapsid protein provides a new therapeutic opportunity against SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104522379">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.09.332734">10.1101/2020.10.09.332734</a></td>
  </tr>
  <tr>
    <td>2020-10-10</td>
    <td><a href="https://scholia.toolforge.org/Q100728608">Identification of novel mutations in the methyltransferase complex (Nsp10-Nsp16) of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q100728608">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBREP.2020.100833">10.1016/J.BBREP.2020.100833</a></td>
  </tr>
  <tr>
    <td>2020-10-09</td>
    <td><a href="https://scholia.toolforge.org/Q100512229">Inhibition of translation and immune responses by the virulence factor Nsp1 of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q100512229">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41392-020-00350-0">10.1038/S41392-020-00350-0</a></td>
  </tr>
  <tr>
    <td>2020-10-08</td>
    <td><a href="https://scholia.toolforge.org/Q100745322">SARS-CoV-2 Disrupts Splicing, Translation, and Protein Trafficking to Suppress Host Defenses</a> (<a href="http://www.wikidata.org/entity/Q100745322">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.10.004">10.1016/J.CELL.2020.10.004</a></td>
  </tr>
  <tr>
    <td>2020-10-07</td>
    <td><a href="https://scholia.toolforge.org/Q104527452">Mass spectrometric based detection of protein nucleotidylation in the RNA polymerase of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104527452">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.07.330324">10.1101/2020.10.07.330324</a></td>
  </tr>
  <tr>
    <td>2020-10-07</td>
    <td><a href="https://scholia.toolforge.org/Q104499876">NSP 11 of SARS-CoV-2 is an Intrinsically Disordered Protein</a> (<a href="http://www.wikidata.org/entity/Q104499876">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.07.330068">10.1101/2020.10.07.330068</a></td>
  </tr>
  <tr>
    <td>2020-10-06</td>
    <td><a href="https://scholia.toolforge.org/Q100510827">Crystal Structure of Non-Structural Protein 10 from Severe Acute Respiratory Syndrome Coronavirus-2</a> (<a href="http://www.wikidata.org/entity/Q100510827">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/IJMS21197375">10.3390/IJMS21197375</a></td>
  </tr>
  <tr>
    <td>2020-10-06</td>
    <td><a href="https://scholia.toolforge.org/Q104502092">Autoproteolytic Products of the SARS-CoV-2 Nucleocapsid Protein are Primed for Antibody Evasion and Virus Proliferation</a> (<a href="http://www.wikidata.org/entity/Q104502092">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.06.328112">10.1101/2020.10.06.328112</a></td>
  </tr>
  <tr>
    <td>2020-10-01</td>
    <td><a href="https://scholia.toolforge.org/Q100455307">Structural insight into the recognition of S-adenosyl-L-homocysteine and sinefungin in SARS-CoV-2 Nsp16/Nsp10 RNA cap 2'-O-Methyltransferase</a> (<a href="http://www.wikidata.org/entity/Q100455307">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CSBJ.2020.09.032">10.1016/J.CSBJ.2020.09.032</a></td>
  </tr>
  <tr>
    <td>2020-10-01</td>
    <td><a href="https://scholia.toolforge.org/Q100427774">SARS-CoV-2 Spike protein co-opts VEGF-A/Neuropilin-1 receptor signaling to induce analgesia</a> (<a href="http://www.wikidata.org/entity/Q100427774">edit</a>)</td>
    <td><a href="https://doi.org/10.1097/J.PAIN.0000000000002097">10.1097/J.PAIN.0000000000002097</a></td>
  </tr>
  <tr>
    <td>2020-09-29</td>
    <td><a href="https://scholia.toolforge.org/Q100385509">High-resolution structures of the SARS-CoV-2 2'-O-methyltransferase reveal strategies for structure-based inhibitor design</a> (<a href="http://www.wikidata.org/entity/Q100385509">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCISIGNAL.ABE1202">10.1126/SCISIGNAL.ABE1202</a></td>
  </tr>
  <tr>
    <td>2020-09-28</td>
    <td><a href="https://scholia.toolforge.org/Q100297228">Discovery of Drug-Like Ligands for the Mac1 Domain of SARS-CoV-2 Nsp3</a> (<a href="http://www.wikidata.org/entity/Q100297228">edit</a>)</td>
    <td><a href="https://doi.org/10.1177/2472555220960428">10.1177/2472555220960428</a></td>
  </tr>
  <tr>
    <td>2020-09-24</td>
    <td><a href="https://scholia.toolforge.org/Q100295195">Evaluation of the potency of FDA-approved drugs on wild type and mutant SARS-CoV-2 helicase (Nsp13)</a> (<a href="http://www.wikidata.org/entity/Q100295195">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.IJBIOMAC.2020.09.138">10.1016/J.IJBIOMAC.2020.09.138</a></td>
  </tr>
  <tr>
    <td>2020-09-23</td>
    <td><a href="https://scholia.toolforge.org/Q99612569">Insights into the biased activity of dextromethorphan and haloperidol towards SARS-CoV-2 NSP6: in silico binding mechanistic analysis</a> (<a href="http://www.wikidata.org/entity/Q99612569">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S00109-020-01980-1">10.1007/S00109-020-01980-1</a></td>
  </tr>
  <tr>
    <td>2020-09-23</td>
    <td><a href="https://scholia.toolforge.org/Q101210696">Beyond Shielding: The Roles of Glycans in the SARS-CoV-2 Spike Protein</a> (<a href="http://www.wikidata.org/entity/Q101210696">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSCENTSCI.0C01056">10.1021/ACSCENTSCI.0C01056</a></td>
  </tr>
  <tr>
    <td>2020-09-21</td>
    <td><a href="https://scholia.toolforge.org/Q99593526">Free fatty acid binding pocket in the locked structure of SARS-CoV-2 spike protein</a> (<a href="http://www.wikidata.org/entity/Q99593526">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABD3255">10.1126/SCIENCE.ABD3255</a></td>
  </tr>
  <tr>
    <td>2020-09-19</td>
    <td><a href="https://scholia.toolforge.org/Q99732176">Evasion of Type I Interferon by SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q99732176">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELREP.2020.108234">10.1016/J.CELREP.2020.108234</a></td>
  </tr>
  <tr>
    <td>2020-09-18</td>
    <td><a href="https://scholia.toolforge.org/Q100387950">SARS-CoV-2 Nsp1 suppresses host but not viral translation through a bipartite mechanism</a> (<a href="http://www.wikidata.org/entity/Q100387950">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.18.302901">10.1101/2020.09.18.302901</a></td>
  </tr>
  <tr>
    <td>2020-09-17</td>
    <td><a href="https://scholia.toolforge.org/Q99562461">Receptor binding and priming of the spike protein of SARS-CoV-2 for membrane fusion</a> (<a href="http://www.wikidata.org/entity/Q99562461">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2772-0">10.1038/S41586-020-2772-0</a></td>
  </tr>
  <tr>
    <td>2020-09-16</td>
    <td><a href="https://scholia.toolforge.org/Q104437967">Characterisation of protease activity during SARS-CoV-2 infection identifies novel viral cleavage sites and cellular targets for drug repurposing</a> (<a href="http://www.wikidata.org/entity/Q104437967">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.16.297945">10.1101/2020.09.16.297945</a></td>
  </tr>
  <tr>
    <td>2020-09-16</td>
    <td><a href="https://scholia.toolforge.org/Q99549852">Targeting SARS-CoV-2 Nsp12/Nsp8 interaction interface with approved and investigational drugs: an in silico structure-based approach</a> (<a href="http://www.wikidata.org/entity/Q99549852">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1819882">10.1080/07391102.2020.1819882</a></td>
  </tr>
  <tr>
    <td>2020-09-16</td>
    <td><a href="https://scholia.toolforge.org/Q99557062">The enzymatic activity of the nsp14 exoribonuclease is critical for replication of MERS-CoV and SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q99557062">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.01246-20">10.1128/JVI.01246-20</a></td>
  </tr>
  <tr>
    <td>2020-09-16</td>
    <td><a href="https://scholia.toolforge.org/Q104502252">SARS-CoV-2 protein Nsp1 alters actomyosin cytoskeleton and phenocopies arrhythmogenic cardiomyopathy-related PKP2 mutant</a> (<a href="http://www.wikidata.org/entity/Q104502252">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.14.296178">10.1101/2020.09.14.296178</a></td>
  </tr>
  <tr>
    <td>2020-09-14</td>
    <td><a href="https://scholia.toolforge.org/Q99707959">SARS-CoV-2 Infection Depends on Cellular Heparan Sulfate and ACE2</a> (<a href="http://www.wikidata.org/entity/Q99707959">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.09.033">10.1016/J.CELL.2020.09.033</a></td>
  </tr>
  <tr>
    <td>2020-09-14</td>
    <td><a href="https://scholia.toolforge.org/Q100387948">Genes with 5' terminal oligopyrimidine tracts preferentially escape global suppression of translation by the SARS-CoV-2 NSP1 protein</a> (<a href="http://www.wikidata.org/entity/Q100387948">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.13.295493">10.1101/2020.09.13.295493</a></td>
  </tr>
  <tr>
    <td>2020-09-14</td>
    <td><a href="https://scholia.toolforge.org/Q100387952">SARS CoV-2 nucleocapsid protein forms condensates with viral genomic RNA</a> (<a href="http://www.wikidata.org/entity/Q100387952">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.14.295824">10.1101/2020.09.14.295824</a></td>
  </tr>
  <tr>
    <td>2020-09-13</td>
    <td><a href="https://scholia.toolforge.org/Q99552324">Real-time conformational dynamics of SARS-CoV-2 spikes on virus particles</a> (<a href="http://www.wikidata.org/entity/Q99552324">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.10.286948">10.1101/2020.09.10.286948</a></td>
  </tr>
  <tr>
    <td>2020-09-11</td>
    <td><a href="https://scholia.toolforge.org/Q104451368">SARS-CoV-2 NSP1 C-terminal region (residues 130-180) is an intrinsically disordered region</a> (<a href="http://www.wikidata.org/entity/Q104451368">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.10.290932">10.1101/2020.09.10.290932</a></td>
  </tr>
  <tr>
    <td>2020-09-09</td>
    <td><a href="https://scholia.toolforge.org/Q99212334">SARS-CoV-2 envelope protein topology in eukaryotic membranes</a> (<a href="http://www.wikidata.org/entity/Q99212334">edit</a>)</td>
    <td><a href="https://doi.org/10.1098/RSOB.200209">10.1098/RSOB.200209</a></td>
  </tr>
  <tr>
    <td>2020-09-09</td>
    <td><a href="https://scholia.toolforge.org/Q99245666">Repurposing of FDA-Approved Toremifene to Treat COVID-19 by blocking the spike glycoprotein and NSP14 of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q99245666">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.JPROTEOME.0C00397">10.1021/ACS.JPROTEOME.0C00397</a></td>
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
    <td>2020-09-08</td>
    <td><a href="https://scholia.toolforge.org/Q99234085">Liquid-liquid phase separation by SARS-CoV-2 nucleocapsid protein and RNA</a> (<a href="http://www.wikidata.org/entity/Q99234085">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41422-020-00408-2">10.1038/S41422-020-00408-2</a></td>
  </tr>
  <tr>
    <td>2020-09-07</td>
    <td><a href="https://scholia.toolforge.org/Q99406386">Potential Treatment of Chinese and Western Medicine Targeting Nsp14 of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q99406386">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JPHA.2020.08.002">10.1016/J.JPHA.2020.08.002</a></td>
  </tr>
  <tr>
    <td>2020-09-04</td>
    <td><a href="https://scholia.toolforge.org/Q98948556">Identification of promising antiviral drug candidates against non-structural protein 15 (NSP15) from SARS-CoV-2: an in silico assisted drug-repurposing study</a> (<a href="http://www.wikidata.org/entity/Q98948556">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1814870">10.1080/07391102.2020.1814870</a></td>
  </tr>
  <tr>
    <td>2020-09-04</td>
    <td><a href="https://scholia.toolforge.org/Q98951512">SARS-CoV-2 binds platelet ACE2 to enhance thrombosis in COVID-19</a> (<a href="http://www.wikidata.org/entity/Q98951512">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/S13045-020-00954-7">10.1186/S13045-020-00954-7</a></td>
  </tr>
  <tr>
    <td>2020-09-04</td>
    <td><a href="https://scholia.toolforge.org/Q99563725">RNA-dependent RNA polymerase: Structure, mechanism, and drug discovery for COVID-19</a> (<a href="http://www.wikidata.org/entity/Q99563725">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBRC.2020.08.116">10.1016/J.BBRC.2020.08.116</a></td>
  </tr>
  <tr>
    <td>2020-09-04</td>
    <td><a href="https://scholia.toolforge.org/Q99561921">SARS-CoV-2 ORF3b Is a Potent Interferon Antagonist Whose Activity Is Increased by a Naturally Occurring Elongation Variant</a> (<a href="http://www.wikidata.org/entity/Q99561921">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELREP.2020.108185">10.1016/J.CELREP.2020.108185</a></td>
  </tr>
  <tr>
    <td>2020-09-03</td>
    <td><a href="https://scholia.toolforge.org/Q99563947">Identification of phytochemicals as potential therapeutic agents that binds to Nsp15 protein target of coronavirus (SARS-CoV-2) that are capable of inhibiting virus replication</a> (<a href="http://www.wikidata.org/entity/Q99563947">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.PHYMED.2020.153317">10.1016/J.PHYMED.2020.153317</a></td>
  </tr>
  <tr>
    <td>2020-09-01</td>
    <td><a href="https://scholia.toolforge.org/Q98879302">Why do SARS-CoV-2 NSPs rush to the ER?</a> (<a href="http://www.wikidata.org/entity/Q98879302">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S00415-020-10197-8">10.1007/S00415-020-10197-8</a></td>
  </tr>
  <tr>
    <td>2020-08-31</td>
    <td><a href="https://scholia.toolforge.org/Q99635884">Emerging of a SARS-CoV-2 viral strain with a deletion in nsp1</a> (<a href="http://www.wikidata.org/entity/Q99635884">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/S12967-020-02507-5">10.1186/S12967-020-02507-5</a></td>
  </tr>
  <tr>
    <td>2020-08-29</td>
    <td><a href="https://scholia.toolforge.org/Q104522983">The SARS-CoV-2 ORF10 is not essential in vitro or in vivo in humans</a> (<a href="http://www.wikidata.org/entity/Q104522983">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.29.257360">10.1101/2020.08.29.257360</a></td>
  </tr>
  <tr>
    <td>2020-08-28</td>
    <td><a href="https://scholia.toolforge.org/Q98895733">In silico structure modelling of SARS-CoV-2 Nsp13 helicase and Nsp14 and repurposing of FDA approved antiviral drugs as dual inhibitors</a> (<a href="http://www.wikidata.org/entity/Q98895733">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.GENREP.2020.100860">10.1016/J.GENREP.2020.100860</a></td>
  </tr>
  <tr>
    <td>2020-08-27</td>
    <td><a href="https://scholia.toolforge.org/Q104522448">SARS-CoV-2 Nucleocapsid protein is decorated with multiple N- and O-glycans</a> (<a href="http://www.wikidata.org/entity/Q104522448">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.26.269043">10.1101/2020.08.26.269043</a></td>
  </tr>
  <tr>
    <td>2020-08-26</td>
    <td><a href="https://scholia.toolforge.org/Q104533834">Room Temperature Structure of SARS-CoV-2 Nsp10/Nsp16 Methyltransferase in a Complex with m7GpppA Cap-0 and SAM Determined by Fixed-Target Serial Crystallography</a> (<a href="http://www.wikidata.org/entity/Q104533834">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB7JPE/PDB">10.2210/PDB7JPE/PDB</a></td>
  </tr>
  <tr>
    <td>2020-08-26</td>
    <td><a href="https://scholia.toolforge.org/Q104533802">Crystal Structure of SARS-CoV-2 NSP7-NSP8 complex</a> (<a href="http://www.wikidata.org/entity/Q104533802">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB7JLT/PDB">10.2210/PDB7JLT/PDB</a></td>
  </tr>
  <tr>
    <td>2020-08-24</td>
    <td><a href="https://scholia.toolforge.org/Q98720918">Virus-Receptor Interactions of Glycosylated SARS-CoV-2 Spike and Human ACE2 Receptor</a> (<a href="http://www.wikidata.org/entity/Q98720918">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CHOM.2020.08.004">10.1016/J.CHOM.2020.08.004</a></td>
  </tr>
  <tr>
    <td>2020-08-24</td>
    <td><a href="https://scholia.toolforge.org/Q104523307">The SARS-CoV-2 Envelope and Membrane proteins modulate maturation and retention of the Spike protein, allowing optimal formation of VLPs in presence of Nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q104523307">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.24.260901">10.1101/2020.08.24.260901</a></td>
  </tr>
  <tr>
    <td>2020-08-21</td>
    <td><a href="https://scholia.toolforge.org/Q104439844">Dynamic competition between SARS-CoV-2 NSP1 and mRNA on the human ribosome inhibits translation initiation</a> (<a href="http://www.wikidata.org/entity/Q104439844">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.20.259770">10.1101/2020.08.20.259770</a></td>
  </tr>
  <tr>
    <td>2020-08-20</td>
    <td><a href="https://scholia.toolforge.org/Q104530041">Structural basis for the multimerization of nonstructural protein nsp9 from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104530041">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/S43556-020-00005-0">10.1186/S43556-020-00005-0</a></td>
  </tr>
  <tr>
    <td>2020-08-19</td>
    <td><a href="https://scholia.toolforge.org/Q98665489">SARS-CoV-2 ORF9c Is a Membrane-Associated Protein that Suppresses Antiviral Responses in Cells</a> (<a href="http://www.wikidata.org/entity/Q98665489">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.18.256776">10.1101/2020.08.18.256776</a></td>
  </tr>
  <tr>
    <td>2020-08-18</td>
    <td><a href="https://scholia.toolforge.org/Q98565434">Vitamin B12 may inhibit RNA-dependent-RNA polymerase activity of nsp12 from the SARS-CoV-2 virus</a> (<a href="http://www.wikidata.org/entity/Q98565434">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/IUB.2359">10.1002/IUB.2359</a></td>
  </tr>
  <tr>
    <td>2020-08-18</td>
    <td><a href="https://scholia.toolforge.org/Q98575481">In situ structural analysis of SARS-CoV-2 spike reveals flexibility mediated by three hinges</a> (<a href="http://www.wikidata.org/entity/Q98575481">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABD5223">10.1126/SCIENCE.ABD5223</a></td>
  </tr>
  <tr>
    <td>2020-08-17</td>
    <td><a href="https://scholia.toolforge.org/Q98513801">ORF8 and ORF3b antibodies are accurate serological markers of early and late SARS-CoV-2 infection</a> (<a href="http://www.wikidata.org/entity/Q98513801">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41590-020-0773-7">10.1038/S41590-020-0773-7</a></td>
  </tr>
  <tr>
    <td>2020-08-17</td>
    <td><a href="https://scholia.toolforge.org/Q104437401">SARS-CoV-2 ORF9b Antagonizes Type I and III Interferons by Targeting Multiple Components of RIG-I/MDA-5-MAVS, TLR3-TRIF, and cGAS-STING Signaling Pathways</a> (<a href="http://www.wikidata.org/entity/Q104437401">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.16.252973">10.1101/2020.08.16.252973</a></td>
  </tr>
  <tr>
    <td>2020-08-17</td>
    <td><a href="https://scholia.toolforge.org/Q98510279">Structures and distributions of SARS-CoV-2 spike proteins on intact virions</a> (<a href="http://www.wikidata.org/entity/Q98510279">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2665-2">10.1038/S41586-020-2665-2</a></td>
  </tr>
  <tr>
    <td>2020-08-14</td>
    <td><a href="https://scholia.toolforge.org/Q104527554">Methylation of RNA Cap in SARS-CoV-2 captured by serial crystallography</a> (<a href="http://www.wikidata.org/entity/Q104527554">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.14.251421">10.1101/2020.08.14.251421</a></td>
  </tr>
  <tr>
    <td>2020-08-14</td>
    <td><a href="https://scholia.toolforge.org/Q104440003">Furin cleavage of SARS-CoV-2 Spike promotes but is not essential for infection and cell-cell fusion</a> (<a href="http://www.wikidata.org/entity/Q104440003">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.13.243303">10.1101/2020.08.13.243303</a></td>
  </tr>
  <tr>
    <td>2020-08-14</td>
    <td><a href="https://scholia.toolforge.org/Q98504962">1H, 13C, and 15N backbone chemical shift assignments of the apo and the ADP-ribose bound forms of the macrodomain of SARS-CoV-2 non-structural protein 3b</a> (<a href="http://www.wikidata.org/entity/Q98504962">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S12104-020-09973-4">10.1007/S12104-020-09973-4</a></td>
  </tr>
  <tr>
    <td>2020-08-13</td>
    <td><a href="https://scholia.toolforge.org/Q98629934">The use of knowledge management tools in viroinformatics. Example study of a highly conserved sequence motif in Nsp3 of SARS-CoV-2 as a therapeutic target</a> (<a href="http://www.wikidata.org/entity/Q98629934">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.COMPBIOMED.2020.103963">10.1016/J.COMPBIOMED.2020.103963</a></td>
  </tr>
  <tr>
    <td>2020-08-13</td>
    <td><a href="https://scholia.toolforge.org/Q104527850">Characterisation of the SARS-CoV-2 ExoN (nsp14ExoN-nsp10) complex: implications for its role in viral genome stability and inhibitor identification</a> (<a href="http://www.wikidata.org/entity/Q104527850">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.13.248211">10.1101/2020.08.13.248211</a></td>
  </tr>
  <tr>
    <td>2020-08-12</td>
    <td><a href="https://scholia.toolforge.org/Q98390275">Structural insight into the role of novel SARS-CoV-2 E protein: A potential target for vaccine development and other therapeutic strategies</a> (<a href="http://www.wikidata.org/entity/Q98390275">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PONE.0237300">10.1371/JOURNAL.PONE.0237300</a></td>
  </tr>
  <tr>
    <td>2020-08-12</td>
    <td><a href="https://scholia.toolforge.org/Q104527956">Suppression of MDA5-mediated antiviral immune responses by NSP8 of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104527956">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.12.247767">10.1101/2020.08.12.247767</a></td>
  </tr>
  <tr>
    <td>2020-08-11</td>
    <td><a href="https://scholia.toolforge.org/Q98504429">Cryo-EM Structures of the SARS-CoV-2 Endoribonuclease Nsp15</a> (<a href="http://www.wikidata.org/entity/Q98504429">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.11.244863">10.1101/2020.08.11.244863</a></td>
  </tr>
  <tr>
    <td>2020-08-11</td>
    <td><a href="https://scholia.toolforge.org/Q98306790">Mutational spectra of SARS-CoV-2 orf1ab polyprotein and signature mutations in the United States of America</a> (<a href="http://www.wikidata.org/entity/Q98306790">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.26417">10.1002/JMV.26417</a></td>
  </tr>
  <tr>
    <td>2020-08-11</td>
    <td><a href="https://scholia.toolforge.org/Q98579090">Host-membrane interacting interface of the SARS coronavirus envelope protein: Immense functional potential of C-terminal domain</a> (<a href="http://www.wikidata.org/entity/Q98579090">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BPC.2020.106452">10.1016/J.BPC.2020.106452</a></td>
  </tr>
  <tr>
    <td>2020-08-10</td>
    <td><a href="https://scholia.toolforge.org/Q98577432">Discovery of COVID-19 Inhibitors Targeting the SARS-CoV2 Nsp13 Helicase</a> (<a href="http://www.wikidata.org/entity/Q98577432">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.09.243246">10.1101/2020.08.09.243246</a></td>
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
    <td>2020-08-06</td>
    <td><a href="https://scholia.toolforge.org/Q104512144">Structure of papain-like protease from SARS-CoV-2 and its complexes with non-covalent inhibitors</a> (<a href="http://www.wikidata.org/entity/Q104512144">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.06.240192">10.1101/2020.08.06.240192</a></td>
  </tr>
  <tr>
    <td>2020-08-06</td>
    <td><a href="https://scholia.toolforge.org/Q104471999">Structural characterization of the C-terminal domain of SARS-CoV-2 nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q104471999">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/S43556-020-00001-4">10.1186/S43556-020-00001-4</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q98199282">SARS-CoV-2 nucleocapsid and Nsp3 binding: an in silico study</a> (<a href="http://www.wikidata.org/entity/Q98199282">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S00203-020-01998-6">10.1007/S00203-020-01998-6</a></td>
  </tr>
  <tr>
    <td>2020-08-04</td>
    <td><a href="https://scholia.toolforge.org/Q98195339">Deciphering the protein motion of S1 subunit in SARS-CoV-2 spike glycoprotein through integrated computational methods</a> (<a href="http://www.wikidata.org/entity/Q98195339">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1802338">10.1080/07391102.2020.1802338</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q98188880">Identification of promising drug candidates against NSP16 of SARS-CoV-2 through computational drug repurposing study</a> (<a href="http://www.wikidata.org/entity/Q98188880">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1802349">10.1080/07391102.2020.1802349</a></td>
  </tr>
  <tr>
    <td>2020-08-03</td>
    <td><a href="https://scholia.toolforge.org/Q104512424">Structure of SARS-CoV-2 2′-O-methyltransferase heterodimer with RNA Cap analog and sulfates bound reveals new strategies for structure-based inhibitor design</a> (<a href="http://www.wikidata.org/entity/Q104512424">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.03.234716">10.1101/2020.08.03.234716</a></td>
  </tr>
  <tr>
    <td>2020-08-03</td>
    <td><a href="https://scholia.toolforge.org/Q104439852">SARS-CoV-2 ORF6 disrupts nucleocytoplasmic transport through interactions with Rae1 and Nup98</a> (<a href="http://www.wikidata.org/entity/Q104439852">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.03.234559">10.1101/2020.08.03.234559</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q98241597">The SARS-CoV-2 Nucleocapsid phosphoprotein forms mutually exclusive condensates with RNA and the membrane-associated M protein</a> (<a href="http://www.wikidata.org/entity/Q98241597">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.30.228023">10.1101/2020.07.30.228023</a></td>
  </tr>
  <tr>
    <td>2020-07-31</td>
    <td><a href="https://scholia.toolforge.org/Q98241584">Force-dependent stimulation of RNA unwinding by SARS-CoV-2 nsp13 helicase</a> (<a href="http://www.wikidata.org/entity/Q98241584">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.31.231274">10.1101/2020.07.31.231274</a></td>
  </tr>
  <tr>
    <td>2020-07-31</td>
    <td><a href="https://scholia.toolforge.org/Q98184357">A thermostable, closed SARS-CoV-2 spike protein trimer</a> (<a href="http://www.wikidata.org/entity/Q98184357">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41594-020-0478-5">10.1038/S41594-020-0478-5</a></td>
  </tr>
  <tr>
    <td>2020-07-31</td>
    <td><a href="https://scholia.toolforge.org/Q98194088">Antibody response against SARS-CoV-2 spike protein and nucleoprotein evaluated by 4 automated immunoassays and 3 ELISAs</a> (<a href="http://www.wikidata.org/entity/Q98194088">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CMI.2020.07.038">10.1016/J.CMI.2020.07.038</a></td>
  </tr>
  <tr>
    <td>2020-07-30</td>
    <td><a href="https://scholia.toolforge.org/Q104502199">Substrate specificity of SARS-CoV-2 nsp10-nsp16 methyltransferase</a> (<a href="http://www.wikidata.org/entity/Q104502199">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.30.228478">10.1101/2020.07.30.228478</a></td>
  </tr>
  <tr>
    <td>2020-07-30</td>
    <td><a href="https://scholia.toolforge.org/Q104469729">A dynamic regulatory interface on SARS-CoV-2 RNA polymerase</a> (<a href="http://www.wikidata.org/entity/Q104469729">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.30.229187">10.1101/2020.07.30.229187</a></td>
  </tr>
  <tr>
    <td>2020-07-29</td>
    <td><a href="https://scholia.toolforge.org/Q98162461">Papain-like protease regulates SARS-CoV-2 viral spread and innate immunity</a> (<a href="http://www.wikidata.org/entity/Q98162461">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2601-5">10.1038/S41586-020-2601-5</a></td>
  </tr>
  <tr>
    <td>2020-07-29</td>
    <td><a href="https://scholia.toolforge.org/Q98164326">Crystal structure of SARS-CoV-2 nsp10/nsp16 2'-O-methylase and its implication on antiviral drug design</a> (<a href="http://www.wikidata.org/entity/Q98164326">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41392-020-00241-4">10.1038/S41392-020-00241-4</a></td>
  </tr>
  <tr>
    <td>2020-07-29</td>
    <td><a href="https://scholia.toolforge.org/Q98164557">SARS-CoV-2 Orf9b suppresses type I interferon responses by targeting TOM70</a> (<a href="http://www.wikidata.org/entity/Q98164557">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41423-020-0514-8">10.1038/S41423-020-0514-8</a></td>
  </tr>
  <tr>
    <td>2020-07-28</td>
    <td><a href="https://scholia.toolforge.org/Q98388186">Structural Basis for Helicase-Polymerase Coupling in the SARS-CoV-2 Replication-Transcription Complex</a> (<a href="http://www.wikidata.org/entity/Q98388186">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.07.033">10.1016/J.CELL.2020.07.033</a></td>
  </tr>
  <tr>
    <td>2020-07-28</td>
    <td><a href="https://scholia.toolforge.org/Q98157765">Characterisation of the transcriptome and proteome of SARS-CoV-2 reveals a cell passage induced in-frame deletion of the furin-like cleavage site from the spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q98157765">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/S13073-020-00763-0">10.1186/S13073-020-00763-0</a></td>
  </tr>
  <tr>
    <td>2020-07-27</td>
    <td><a href="https://scholia.toolforge.org/Q104437642">Severe Acute Respiratory Syndrome Coronavirus 2 (SARS-CoV-2) Membrane (M) Protein Inhibits Type I and III Interferon Production by Targeting RIG-I/MDA-5 Signaling</a> (<a href="http://www.wikidata.org/entity/Q104437642">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.26.222026">10.1101/2020.07.26.222026</a></td>
  </tr>
  <tr>
    <td>2020-07-24</td>
    <td><a href="https://scholia.toolforge.org/Q97692635">Structural basis of RNA cap modification by SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q97692635">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-020-17496-8">10.1038/S41467-020-17496-8</a></td>
  </tr>
  <tr>
    <td>2020-07-24</td>
    <td><a href="https://scholia.toolforge.org/Q97684756">Computational drug repurposing for the identification of SARS-CoV-2 main protease inhibitors</a> (<a href="http://www.wikidata.org/entity/Q97684756">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1796805">10.1080/07391102.2020.1796805</a></td>
  </tr>
  <tr>
    <td>2020-07-24</td>
    <td><a href="https://scholia.toolforge.org/Q104473192">SARS-CoV-2 ORF8 and SARS-CoV ORF8ab: Genomic Divergence and Functional Convergence</a> (<a href="http://www.wikidata.org/entity/Q104473192">edit</a>)</td>
    <td><a href="https://doi.org/10.20944/PREPRINTS202007.0587.V1">10.20944/PREPRINTS202007.0587.V1</a></td>
  </tr>
  <tr>
    <td>2020-07-23</td>
    <td><a href="https://scholia.toolforge.org/Q97680833">TMPRSS2 and furin are both essential for proteolytic activation of SARS-CoV-2 in human airway cells</a> (<a href="http://www.wikidata.org/entity/Q97680833">edit</a>)</td>
    <td><a href="https://doi.org/10.26508/LSA.202000786">10.26508/LSA.202000786</a></td>
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
    <td>2020-07-22</td>
    <td><a href="https://scholia.toolforge.org/Q98155448">Mechanistic insights of host cell fusion of SARS-CoV-1 and SARS-CoV-2 from atomic resolution structure and membrane dynamics</a> (<a href="http://www.wikidata.org/entity/Q98155448">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BPC.2020.106438">10.1016/J.BPC.2020.106438</a></td>
  </tr>
  <tr>
    <td>2020-07-21</td>
    <td><a href="https://scholia.toolforge.org/Q97642571">Distinct conformational states of SARS-CoV-2 spike protein</a> (<a href="http://www.wikidata.org/entity/Q97642571">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABD4251">10.1126/SCIENCE.ABD4251</a></td>
  </tr>
  <tr>
    <td>2020-07-18</td>
    <td><a href="https://scholia.toolforge.org/Q104468598">Structural basis for the inhibition of the papain-like protease of SARS-CoV-2 by small molecules</a> (<a href="http://www.wikidata.org/entity/Q104468598">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.17.208959">10.1101/2020.07.17.208959</a></td>
  </tr>
  <tr>
    <td>2020-07-17</td>
    <td><a href="https://scholia.toolforge.org/Q97587089">Structural basis for translational shutdown and immune evasion by the Nsp1 protein of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q97587089">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABC8665">10.1126/SCIENCE.ABC8665</a></td>
  </tr>
  <tr>
    <td>2020-07-17</td>
    <td><a href="https://scholia.toolforge.org/Q97587517">Cryo-EM analysis of the post-fusion structure of the SARS-CoV spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q97587517">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-020-17371-6">10.1038/S41467-020-17371-6</a></td>
  </tr>
  <tr>
    <td>2020-07-15</td>
    <td><a href="https://scholia.toolforge.org/Q97542455">A putative new SARS-CoV protein, 3c, encoded in an ORF overlapping ORF3a</a> (<a href="http://www.wikidata.org/entity/Q97542455">edit</a>)</td>
    <td><a href="https://doi.org/10.1099/JGV.0.001469">10.1099/JGV.0.001469</a></td>
  </tr>
  <tr>
    <td>2020-07-15</td>
    <td><a href="https://scholia.toolforge.org/Q97654059">Bivalent binding of a fully human IgG to the SARS-CoV-2 spike proteins reveals mechanisms of potent neutralization</a> (<a href="http://www.wikidata.org/entity/Q97654059">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.14.203414">10.1101/2020.07.14.203414</a></td>
  </tr>
  <tr>
    <td>2020-07-13</td>
    <td><a href="https://scholia.toolforge.org/Q97531111">Structural basis for helicase-polymerase coupling in the SARS-CoV-2 replication-transcription complex</a> (<a href="http://www.wikidata.org/entity/Q97531111">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.08.194084">10.1101/2020.07.08.194084</a></td>
  </tr>
  <tr>
    <td>2020-07-13</td>
    <td><a href="https://scholia.toolforge.org/Q97545168">Identification of potential drugs against SARS-CoV-2 non-structural protein 1 (nsp1)</a> (<a href="http://www.wikidata.org/entity/Q97545168">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1792992">10.1080/07391102.2020.1792992</a></td>
  </tr>
  <tr>
    <td>2020-07-13</td>
    <td><a href="https://scholia.toolforge.org/Q97654063">Cold sensitivity of the SARS-CoV-2 spike ectodomain</a> (<a href="http://www.wikidata.org/entity/Q97654063">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.12.199588">10.1101/2020.07.12.199588</a></td>
  </tr>
  <tr>
    <td>2020-07-12</td>
    <td><a href="https://scholia.toolforge.org/Q97558272">Architecture and self-assembly of the SARS-CoV-2 nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q97558272">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/PRO.3909">10.1002/PRO.3909</a></td>
  </tr>
  <tr>
    <td>2020-07-09</td>
    <td><a href="https://scholia.toolforge.org/Q104473662">Decline of humoral responses against SARS-CoV-2 Spike in convalescent individuals</a> (<a href="http://www.wikidata.org/entity/Q104473662">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.09.194639">10.1101/2020.07.09.194639</a></td>
  </tr>
  <tr>
    <td>2020-07-09</td>
    <td><a href="https://scholia.toolforge.org/Q104527170">Molecular architecture of the SARS-CoV-2 virus</a> (<a href="http://www.wikidata.org/entity/Q104527170">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.08.192104">10.1101/2020.07.08.192104</a></td>
  </tr>
  <tr>
    <td>2020-07-07</td>
    <td><a href="https://scholia.toolforge.org/Q104440764">SARS-CoV-2 Nsp1 binds ribosomal mRNA channel to inhibit translation</a> (<a href="http://www.wikidata.org/entity/Q104440764">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.07.191676">10.1101/2020.07.07.191676</a></td>
  </tr>
  <tr>
    <td>2020-07-06</td>
    <td><a href="https://scholia.toolforge.org/Q97530980">N and O glycosylation of the SARS-CoV-2 spike protein</a> (<a href="http://www.wikidata.org/entity/Q97530980">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.05.187344">10.1101/2020.07.05.187344</a></td>
  </tr>
  <tr>
    <td>2020-07-04</td>
    <td><a href="https://scholia.toolforge.org/Q97426484">A pH-dependent switch mediates conformational masking of SARS-CoV-2 spike</a> (<a href="http://www.wikidata.org/entity/Q97426484">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.04.187989">10.1101/2020.07.04.187989</a></td>
  </tr>
  <tr>
    <td>2020-07-03</td>
    <td><a href="https://scholia.toolforge.org/Q96870819">Tracking changes in SARS-CoV-2 Spike: evidence that D614G increases infectivity of the COVID-19 virus</a> (<a href="http://www.wikidata.org/entity/Q96870819">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.06.043">10.1016/J.CELL.2020.06.043</a></td>
  </tr>
  <tr>
    <td>2020-07-01</td>
    <td><a href="https://scholia.toolforge.org/Q104520935">periscope: sub-genomic RNA identification in SARS-CoV-2 Genomic Sequencing Data</a> (<a href="http://www.wikidata.org/entity/Q104520935">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.01.181867">10.1101/2020.07.01.181867</a></td>
  </tr>
  <tr>
    <td>2020-06-29</td>
    <td><a href="https://scholia.toolforge.org/Q104533718">SARS-CoV-2 envelope protein causes acute respiratory distress syndrome (ARDS)-like pathological damage and constitutes an antiviral target</a> (<a href="http://www.wikidata.org/entity/Q104533718">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.27.174953">10.1101/2020.06.27.174953</a></td>
  </tr>
  <tr>
    <td>2020-06-29</td>
    <td><a href="https://scholia.toolforge.org/Q104533901">Proteins Nsp12 and 13 of SARS-CoV-2 Have Mitochondrial Recognition Signal: A Connection with Cellular Mitochondrial Dysfunction and Disease Manifestation</a> (<a href="http://www.wikidata.org/entity/Q104533901">edit</a>)</td>
    <td><a href="https://doi.org/10.20944/PREPRINTS202006.0352.V1">10.20944/PREPRINTS202006.0352.V1</a></td>
  </tr>
  <tr>
    <td>2020-06-29</td>
    <td><a href="https://scholia.toolforge.org/Q97426434">Phosphorylation modulates liquid-liquid phase separation of the SARS-CoV-2 N protein</a> (<a href="http://www.wikidata.org/entity/Q97426434">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.28.176248">10.1101/2020.06.28.176248</a></td>
  </tr>
  <tr>
    <td>2020-06-27</td>
    <td><a href="https://scholia.toolforge.org/Q104451357">Structures, conformations and distributions of SARS-CoV-2 spike protein trimers on intact virions</a> (<a href="http://www.wikidata.org/entity/Q104451357">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.27.174979">10.1101/2020.06.27.174979</a></td>
  </tr>
  <tr>
    <td>2020-06-26</td>
    <td><a href="https://scholia.toolforge.org/Q104451347">In situ structural analysis of SARS-CoV-2 spike reveals flexibility mediated by three hinges</a> (<a href="http://www.wikidata.org/entity/Q104451347">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.26.173476">10.1101/2020.06.26.173476</a></td>
  </tr>
  <tr>
    <td>2020-06-24</td>
    <td><a href="https://scholia.toolforge.org/Q96647316">Molecular Basis for ADP-ribose Binding to the Mac1 Domain of SARS-CoV-2 Nsp3</a> (<a href="http://www.wikidata.org/entity/Q96647316">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.BIOCHEM.0C00309">10.1021/ACS.BIOCHEM.0C00309</a></td>
  </tr>
  <tr>
    <td>2020-06-24</td>
    <td><a href="https://scholia.toolforge.org/Q96683475">Structural plasticity of SARS-CoV-2 3CL Mpro active site cavity revealed by room temperature X-ray crystallography</a> (<a href="http://www.wikidata.org/entity/Q96683475">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-020-16954-7">10.1038/S41467-020-16954-7</a></td>
  </tr>
  <tr>
    <td>2020-06-24</td>
    <td><a href="https://scholia.toolforge.org/Q96648082">SARS-CoV-2 and SARS-CoV: Virtual Screening of Potential inhibitors targeting RNA-dependent RNA polymerase activity (NSP12)</a> (<a href="http://www.wikidata.org/entity/Q96648082">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.26222">10.1002/JMV.26222</a></td>
  </tr>
  <tr>
    <td>2020-06-23</td>
    <td><a href="https://scholia.toolforge.org/Q96644374">Targeting SARS-COV-2 non-structural protein 16: a virtual drug repurposing study</a> (<a href="http://www.wikidata.org/entity/Q96644374">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1779133">10.1080/07391102.2020.1779133</a></td>
  </tr>
  <tr>
    <td>2020-06-23</td>
    <td><a href="https://scholia.toolforge.org/Q96693555">The ORF6, ORF8 and nucleocapsid proteins of SARS-CoV-2 inhibit type I interferon signaling pathway</a> (<a href="http://www.wikidata.org/entity/Q96693555">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.VIRUSRES.2020.198074">10.1016/J.VIRUSRES.2020.198074</a></td>
  </tr>
  <tr>
    <td>2020-06-23</td>
    <td><a href="https://scholia.toolforge.org/Q97086727">Identification of multiple large deletions in ORF7a resulting in in-frame gene fusions in clinical SARS-CoV-2 isolates</a> (<a href="http://www.wikidata.org/entity/Q97086727">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JCV.2020.104523">10.1016/J.JCV.2020.104523</a></td>
  </tr>
  <tr>
    <td>2020-06-23</td>
    <td><a href="https://scholia.toolforge.org/Q104440562">SARS-CoV-2 structure and replication characterized by in situ cryo-electron tomography</a> (<a href="http://www.wikidata.org/entity/Q104440562">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.23.167064">10.1101/2020.06.23.167064</a></td>
  </tr>
  <tr>
    <td>2020-06-22</td>
    <td><a href="https://scholia.toolforge.org/Q96613613">Structure-based virtual screening and molecular dynamics simulation of SARS-CoV-2 Guanine-N7 methyltransferase (nsp14) for identifying antiviral inhibitors against COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96613613">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1778535">10.1080/07391102.2020.1778535</a></td>
  </tr>
  <tr>
    <td>2020-06-20</td>
    <td><a href="https://scholia.toolforge.org/Q96611981">A proposed role for the SARS-CoV-2 nucleocapsid protein in the formation and regulation of biomolecular condensates</a> (<a href="http://www.wikidata.org/entity/Q96611981">edit</a>)</td>
    <td><a href="https://doi.org/10.1096/FJ.202001351">10.1096/FJ.202001351</a></td>
  </tr>
  <tr>
    <td>2020-06-19</td>
    <td><a href="https://scholia.toolforge.org/Q104437421">Nucleocapsid protein of SARS-CoV-2 phase separates into RNA-rich polymerase-containing condensates</a> (<a href="http://www.wikidata.org/entity/Q104437421">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.18.160648">10.1101/2020.06.18.160648</a></td>
  </tr>
  <tr>
    <td>2020-06-18</td>
    <td><a href="https://scholia.toolforge.org/Q96583098">Identification of bioactive compounds from Glycyrrhiza glabra as possible inhibitor of SARS-CoV-2 spike glycoprotein and non-structural protein-15: a pharmacoinformatics study</a> (<a href="http://www.wikidata.org/entity/Q96583098">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1779132">10.1080/07391102.2020.1779132</a></td>
  </tr>
  <tr>
    <td>2020-06-18</td>
    <td><a href="https://scholia.toolforge.org/Q96576788">The ORF3a protein of SARS-CoV-2 induces apoptosis in cells</a> (<a href="http://www.wikidata.org/entity/Q96576788">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41423-020-0485-9">10.1038/S41423-020-0485-9</a></td>
  </tr>
  <tr>
    <td>2020-06-18</td>
    <td><a href="https://scholia.toolforge.org/Q96687830">Cryo-EM structure of the SARS-CoV-2 3a ion channel in lipid nanodiscs</a> (<a href="http://www.wikidata.org/entity/Q96687830">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.17.156554">10.1101/2020.06.17.156554</a></td>
  </tr>
  <tr>
    <td>2020-06-18</td>
    <td><a href="https://scholia.toolforge.org/Q104452150">Unexpected free fatty acid binding pocket in the cryo-EM structure of SARS-CoV-2 spike protein</a> (<a href="http://www.wikidata.org/entity/Q104452150">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.18.158584">10.1101/2020.06.18.158584</a></td>
  </tr>
  <tr>
    <td>2020-06-18</td>
    <td><a href="https://scholia.toolforge.org/Q96687783">The SARS-CoV-2 nucleocapsid protein is dynamic, disordered, and phase separates with RNA</a> (<a href="http://www.wikidata.org/entity/Q96687783">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.17.158121">10.1101/2020.06.17.158121</a></td>
  </tr>
  <tr>
    <td>2020-06-17</td>
    <td><a href="https://scholia.toolforge.org/Q104520668">Crystal structure of 2019-nCoV nsp16-nsp10 complex</a> (<a href="http://www.wikidata.org/entity/Q104520668">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB7BQ7/PDB">10.2210/PDB7BQ7/PDB</a></td>
  </tr>
  <tr>
    <td>2020-06-17</td>
    <td><a href="https://scholia.toolforge.org/Q104437179">X-ray Crystallographic Structure of Orf9b from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104437179">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6Z4U/PDB">10.2210/PDB6Z4U/PDB</a></td>
  </tr>
  <tr>
    <td>2020-06-17</td>
    <td><a href="https://scholia.toolforge.org/Q104452060">A thermostable, closed, SARS-CoV-2 spike protein trimer</a> (<a href="http://www.wikidata.org/entity/Q104452060">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.15.152835">10.1101/2020.06.15.152835</a></td>
  </tr>
  <tr>
    <td>2020-06-17</td>
    <td><a href="https://scholia.toolforge.org/Q96687815">Characterization of the SARS-CoV-2 S Protein: Biophysical, Biochemical, Structural, and Antigenic Analysis</a> (<a href="http://www.wikidata.org/entity/Q96687815">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.14.150607">10.1101/2020.06.14.150607</a></td>
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
    <td>2020-06-12</td>
    <td><a href="https://scholia.toolforge.org/Q96348263">The role of furin cleavage site in SARS-CoV-2 spike protein-mediated membrane fusion in the presence or absence of trypsin</a> (<a href="http://www.wikidata.org/entity/Q96348263">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41392-020-0184-0">10.1038/S41392-020-0184-0</a></td>
  </tr>
  <tr>
    <td>2020-06-12</td>
    <td><a href="https://scholia.toolforge.org/Q96687780">Specific viral RNA drives the SARS CoV-2 nucleocapsid to phase separate</a> (<a href="http://www.wikidata.org/entity/Q96687780">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.11.147199">10.1101/2020.06.11.147199</a></td>
  </tr>
  <tr>
    <td>2020-06-11</td>
    <td><a href="https://scholia.toolforge.org/Q96339445">Structural analysis of the putative SARS-CoV-2 primase complex</a> (<a href="http://www.wikidata.org/entity/Q96339445">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JSB.2020.107548">10.1016/J.JSB.2020.107548</a></td>
  </tr>
  <tr>
    <td>2020-06-10</td>
    <td><a href="https://scholia.toolforge.org/Q96642669">A Rare Deletion in SARS-CoV-2 ORF6 Dramatically Alters the Predicted Three-Dimensional Structure of the Resultant Protein</a> (<a href="http://www.wikidata.org/entity/Q96642669">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.09.134460">10.1101/2020.06.09.134460</a></td>
  </tr>
  <tr>
    <td>2020-06-10</td>
    <td><a href="https://scholia.toolforge.org/Q96231810">Identification of 22 N-glycosites on spike glycoprotein of SARS-CoV-2 and accessible surface glycopeptide motifs: implications for vaccination and antibody therapeutics</a> (<a href="http://www.wikidata.org/entity/Q96231810">edit</a>)</td>
    <td><a href="https://doi.org/10.1093/GLYCOB/CWAA052">10.1093/GLYCOB/CWAA052</a></td>
  </tr>
  <tr>
    <td>2020-06-10</td>
    <td><a href="https://scholia.toolforge.org/Q96642691">SARS-CoV-2 nucleocapsid protein undergoes liquid-liquid phase separation stimulated by RNA and partitions into phases of human ribonucleoproteins</a> (<a href="http://www.wikidata.org/entity/Q96642691">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.09.141101">10.1101/2020.06.09.141101</a></td>
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
    <td>2020-06-07</td>
    <td><a href="https://scholia.toolforge.org/Q104502034">Neuropilin-1 facilitates SARS-CoV-2 cell entry and provides a possible pathway into the central nervous system</a> (<a href="http://www.wikidata.org/entity/Q104502034">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.07.137802">10.1101/2020.06.07.137802</a></td>
  </tr>
  <tr>
    <td>2020-06-05</td>
    <td><a href="https://scholia.toolforge.org/Q104439997">SARS-CoV-2 proteases cleave IRF3 and critical modulators of inflammatory pathways (NLRP12 and TAB1): implications for disease presentation across species and the search for reservoir hosts</a> (<a href="http://www.wikidata.org/entity/Q104439997">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.05.135699">10.1101/2020.06.05.135699</a></td>
  </tr>
  <tr>
    <td>2020-06-05</td>
    <td><a href="https://scholia.toolforge.org/Q96172081">Immune evasion via SARS-CoV-2 ORF8 protein?</a> (<a href="http://www.wikidata.org/entity/Q96172081">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41577-020-0360-Z">10.1038/S41577-020-0360-Z</a></td>
  </tr>
  <tr>
    <td>2020-06-05</td>
    <td><a href="https://scholia.toolforge.org/Q104440536">Neuropilin-1 is a host factor for SARS-CoV-2 infection</a> (<a href="http://www.wikidata.org/entity/Q104440536">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.05.134114">10.1101/2020.06.05.134114</a></td>
  </tr>
  <tr>
    <td>2020-06-05</td>
    <td><a href="https://scholia.toolforge.org/Q96163413">Identification of nsp1 gene as the target of SARS-CoV-2 real-time RT-PCR using nanopore whole genome sequencing</a> (<a href="http://www.wikidata.org/entity/Q96163413">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.26140">10.1002/JMV.26140</a></td>
  </tr>
  <tr>
    <td>2020-06-04</td>
    <td><a href="https://scholia.toolforge.org/Q96158781">SARS-Coronavirus-2 Nsp13 Possesses NTPase and RNA Helicase Activities That Can Be Inhibited by Bismuth Salts</a> (<a href="http://www.wikidata.org/entity/Q96158781">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S12250-020-00242-1">10.1007/S12250-020-00242-1</a></td>
  </tr>
  <tr>
    <td>2020-06-01</td>
    <td><a href="https://scholia.toolforge.org/Q96021431">Virtual screening, ADME/T, and binding free energy analysis of anti-viral, anti-protease, and anti-infectious compounds against NSP10/NSP16 methyltransferase and main protease of SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q96021431">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/10799893.2020.1772298">10.1080/10799893.2020.1772298</a></td>
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
    <td>2020-05-29</td>
    <td><a href="https://scholia.toolforge.org/Q104473782">Optimized pseudotyping conditions for the SARS-COV2 Spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q104473782">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.28.122671">10.1101/2020.05.28.122671</a></td>
  </tr>
  <tr>
    <td>2020-05-28</td>
    <td><a href="https://scholia.toolforge.org/Q96225931">Proteolytic Cleavage of the SARS-CoV-2 Spike Protein and the Role of the Novel S1/S2 Site</a> (<a href="http://www.wikidata.org/entity/Q96225931">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ISCI.2020.101212">10.1016/J.ISCI.2020.101212</a></td>
  </tr>
  <tr>
    <td>2020-05-26</td>
    <td><a href="https://scholia.toolforge.org/Q95840619">SARS-CoV-2 strategically mimics proteolytic activation of human ENaC</a> (<a href="http://www.wikidata.org/entity/Q95840619">edit</a>)</td>
    <td><a href="https://doi.org/10.7554/ELIFE.58603">10.7554/ELIFE.58603</a></td>
  </tr>
  <tr>
    <td>2020-05-24</td>
    <td><a href="https://scholia.toolforge.org/Q104437386">The ORF8 Protein of SARS-CoV-2 Mediates Immune Evasion through Potently Downregulating MHC-I</a> (<a href="http://www.wikidata.org/entity/Q104437386">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.24.111823">10.1101/2020.05.24.111823</a></td>
  </tr>
  <tr>
    <td>2020-05-22</td>
    <td><a href="https://scholia.toolforge.org/Q95630795">Chemistry and Biology of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q95630795">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CHEMPR.2020.04.023">10.1016/J.CHEMPR.2020.04.023</a></td>
  </tr>
  <tr>
    <td>2020-05-22</td>
    <td><a href="https://scholia.toolforge.org/Q95601567">Structural basis for RNA replication by the SARS-CoV-2 polymerase</a> (<a href="http://www.wikidata.org/entity/Q95601567">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.05.034">10.1016/J.CELL.2020.05.034</a></td>
  </tr>
  <tr>
    <td>2020-05-21</td>
    <td><a href="https://scholia.toolforge.org/Q104473513">Trimeric SARS-CoV-2 Spike interacts with dimeric ACE2 with limited intra-Spike avidity</a> (<a href="http://www.wikidata.org/entity/Q104473513">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.21.109157">10.1101/2020.05.21.109157</a></td>
  </tr>
  <tr>
    <td>2020-05-21</td>
    <td><a href="https://scholia.toolforge.org/Q95301171">Structure of replicating SARS-CoV-2 polymerase</a> (<a href="http://www.wikidata.org/entity/Q95301171">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2368-8">10.1038/S41586-020-2368-8</a></td>
  </tr>
  <tr>
    <td>2020-05-20</td>
    <td><a href="https://scholia.toolforge.org/Q104533821">SARS-CoV-2 Nsp9 RNA-replicase</a> (<a href="http://www.wikidata.org/entity/Q104533821">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6WXD/PDB">10.2210/PDB6WXD/PDB</a></td>
  </tr>
  <tr>
    <td>2020-05-19</td>
    <td><a href="https://scholia.toolforge.org/Q95309312">Characterization and noncovalent inhibition of the deubiquitinase and deISGylase activity of SARS-CoV-2 papain-like protease</a> (<a href="http://www.wikidata.org/entity/Q95309312">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSINFECDIS.0C00168">10.1021/ACSINFECDIS.0C00168</a></td>
  </tr>
  <tr>
    <td>2020-05-19</td>
    <td><a href="https://scholia.toolforge.org/Q95603892">Structural basis for translational shutdown and immune evasion by the Nsp1 protein of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q95603892">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.18.102467">10.1101/2020.05.18.102467</a></td>
  </tr>
  <tr>
    <td>2020-05-19</td>
    <td><a href="https://scholia.toolforge.org/Q95627977">Controlling the SARS-CoV-2 Spike Glycoprotein Conformation</a> (<a href="http://www.wikidata.org/entity/Q95627977">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.18.102087">10.1101/2020.05.18.102087</a></td>
  </tr>
  <tr>
    <td>2020-05-18</td>
    <td><a href="https://scholia.toolforge.org/Q95262934">Potent neutralizing antibodies against SARS-CoV-2 identified by high-throughput single-cell sequencing of convalescent patients' B cells</a> (<a href="http://www.wikidata.org/entity/Q95262934">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.05.025">10.1016/J.CELL.2020.05.025</a></td>
  </tr>
  <tr>
    <td>2020-05-18</td>
    <td><a href="https://scholia.toolforge.org/Q95601106">Architecture and self-assembly of the SARS-CoV-2 nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q95601106">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.17.100685">10.1101/2020.05.17.100685</a></td>
  </tr>
  <tr>
    <td>2020-05-18</td>
    <td><a href="https://scholia.toolforge.org/Q95626911">Distinct conformational states of SARS-CoV-2 spike protein</a> (<a href="http://www.wikidata.org/entity/Q95626911">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.16.099317">10.1101/2020.05.16.099317</a></td>
  </tr>
  <tr>
    <td>2020-05-14</td>
    <td><a href="https://scholia.toolforge.org/Q95305986">Highly Conserved Homotrimer Cavity Formed by the SARS-CoV-2 Spike Glycoprotein: A Novel Binding Site</a> (<a href="http://www.wikidata.org/entity/Q95305986">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/JCM9051473">10.3390/JCM9051473</a></td>
  </tr>
  <tr>
    <td>2020-05-13</td>
    <td><a href="https://scholia.toolforge.org/Q104533865">Crystal Structure of Nsp16-Nsp10 Heterodimer from SARS-CoV-2 with 7-methyl-GpppA and S-adenosyl-L-homocysteine in the Active Site and Sulfates in the mRNA Binding Groove</a> (<a href="http://www.wikidata.org/entity/Q104533865">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6WRZ/PDB">10.2210/PDB6WRZ/PDB</a></td>
  </tr>
  <tr>
    <td>2020-05-12</td>
    <td><a href="https://scholia.toolforge.org/Q95622924">SARS-CoV-2 ORF3b is a potent interferon antagonist whose activity is further increased by a naturally occurring elongation variant</a> (<a href="http://www.wikidata.org/entity/Q95622924">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.11.088179">10.1101/2020.05.11.088179</a></td>
  </tr>
  <tr>
    <td>2020-05-10</td>
    <td><a href="https://scholia.toolforge.org/Q95297157">Human Intestinal Defensin 5 Inhibits SARS-CoV-2 Invasion by Cloaking ACE2</a> (<a href="http://www.wikidata.org/entity/Q95297157">edit</a>)</td>
    <td><a href="https://doi.org/10.1053/J.GASTRO.2020.05.015">10.1053/J.GASTRO.2020.05.015</a></td>
  </tr>
  <tr>
    <td>2020-05-06</td>
    <td><a href="https://scholia.toolforge.org/Q104533859">Structure of SARS-CoV-2 nsp16/nsp10 ternary complex</a> (<a href="http://www.wikidata.org/entity/Q104533859">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6WKS/PDB">10.2210/PDB6WKS/PDB</a></td>
  </tr>
  <tr>
    <td>2020-05-06</td>
    <td><a href="https://scholia.toolforge.org/Q94589965">Cell entry mechanisms of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q94589965">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.2003138117">10.1073/PNAS.2003138117</a></td>
  </tr>
  <tr>
    <td>2020-05-05</td>
    <td><a href="https://scholia.toolforge.org/Q97882813">Proteolytic Cleavage of the SARS-CoV-2 Spike Protein and the Role of the Novel S1/S2 Site</a> (<a href="http://www.wikidata.org/entity/Q97882813">edit</a>)</td>
    <td><a href="https://doi.org/10.2139/SSRN.3581359">10.2139/SSRN.3581359</a></td>
  </tr>
  <tr>
    <td>2020-05-04</td>
    <td><a href="https://scholia.toolforge.org/Q94503955">Deducing the N- and O- glycosylation profile of the spike protein of novel coronavirus SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q94503955">edit</a>)</td>
    <td><a href="https://doi.org/10.1093/GLYCOB/CWAA042">10.1093/GLYCOB/CWAA042</a></td>
  </tr>
  <tr>
    <td>2020-05-04</td>
    <td><a href="https://scholia.toolforge.org/Q94520441">Site-specific glycan analysis of the SARS-CoV-2 spike</a> (<a href="http://www.wikidata.org/entity/Q94520441">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABB9983">10.1126/SCIENCE.ABB9983</a></td>
  </tr>
  <tr>
    <td>2020-05-01</td>
    <td><a href="https://scholia.toolforge.org/Q94482766">Structural basis for inhibition of the RNA-dependent RNA polymerase from SARS-CoV-2 by remdesivir</a> (<a href="http://www.wikidata.org/entity/Q94482766">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABC1560">10.1126/SCIENCE.ABC1560</a></td>
  </tr>
  <tr>
    <td>2020-04-30</td>
    <td><a href="https://scholia.toolforge.org/Q94470555">A SARS-CoV-2 protein interaction map reveals targets for drug repurposing</a> (<a href="http://www.wikidata.org/entity/Q94470555">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2286-9">10.1038/S41586-020-2286-9</a></td>
  </tr>
  <tr>
    <td>2020-04-30</td>
    <td><a href="https://scholia.toolforge.org/Q94952615">Biochemical characterization of SARS-CoV-2 nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q94952615">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBRC.2020.04.136">10.1016/J.BBRC.2020.04.136</a></td>
  </tr>
  <tr>
    <td>2020-04-29</td>
    <td><a href="https://scholia.toolforge.org/Q94450568">An in-silico evaluation of different Saikosaponins for their potency against SARS-CoV-2 using NSP15 and fusion spike glycoprotein as targets</a> (<a href="http://www.wikidata.org/entity/Q94450568">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1762741">10.1080/07391102.2020.1762741</a></td>
  </tr>
  <tr>
    <td>2020-04-29</td>
    <td><a href="https://scholia.toolforge.org/Q104533690">STRUCTURE OF THE SARS-CoV-2 ORF7A ENCODED ACCESSORY PROTEIN</a> (<a href="http://www.wikidata.org/entity/Q104533690">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6W37/PDB">10.2210/PDB6W37/PDB</a></td>
  </tr>
  <tr>
    <td>2020-04-28</td>
    <td><a href="https://scholia.toolforge.org/Q94453408">Structural elucidation of SARS-CoV-2 vital proteins: Computational methods reveal potential drug candidates against main protease, Nsp12 polymerase and Nsp13 helicase</a> (<a href="http://www.wikidata.org/entity/Q94453408">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JPHA.2020.04.008">10.1016/J.JPHA.2020.04.008</a></td>
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
    <td>2020-04-22</td>
    <td><a href="https://scholia.toolforge.org/Q104533812">Crystal structure of the co-factor complex of NSP7 and the C-terminal domain of NSP8 from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104533812">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6WIQ/PDB">10.2210/PDB6WIQ/PDB</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q91864134">Evolutionary analysis of SARS-CoV-2: how mutation of Non-Structural Protein 6 (NSP6) could affect viral autophagy</a> (<a href="http://www.wikidata.org/entity/Q91864134">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JINF.2020.03.058">10.1016/J.JINF.2020.03.058</a></td>
  </tr>
  <tr>
    <td>2020-04-10</td>
    <td><a href="https://scholia.toolforge.org/Q91816382">Structure of the RNA-dependent RNA polymerase from COVID-19 virus</a> (<a href="http://www.wikidata.org/entity/Q91816382">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABB7498">10.1126/SCIENCE.ABB7498</a></td>
  </tr>
  <tr>
    <td>2020-04-10</td>
    <td><a href="https://scholia.toolforge.org/Q91863840">Remdesivir and SARS-CoV-2: Structural requirements at both nsp12 RdRp and nsp14 Exonuclease active-sites</a> (<a href="http://www.wikidata.org/entity/Q91863840">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ANTIVIRAL.2020.104793">10.1016/J.ANTIVIRAL.2020.104793</a></td>
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
    <td>2020-03-25</td>
    <td><a href="https://scholia.toolforge.org/Q104520654">Crystal Structure of the methyltransferase-stimulatory factor complex of NSP16 and NSP10 from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104520654">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6W61/PDB">10.2210/PDB6W61/PDB</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q104533828">The crystal structure of Nsp9 RNA binding protein of SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104533828">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6W4B/PDB">10.2210/PDB6W4B/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-18</td>
    <td><a href="https://scholia.toolforge.org/Q88977505">Structure of RNA-dependent RNA polymerase from 2019-nCoV, a major antiviral drug target</a> (<a href="http://www.wikidata.org/entity/Q88977505">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.16.993386">10.1101/2020.03.16.993386</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q87726414">Structural basis for the recognition of the SARS-CoV-2 by full-length human ACE2</a> (<a href="http://www.wikidata.org/entity/Q87726414">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABB2762">10.1126/SCIENCE.ABB2762</a></td>
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
    <td>2020-03-02</td>
    <td><a href="https://scholia.toolforge.org/Q97664673">Potential Inhibitors Targeting RNA-Dependent RNA Polymerase Activity (NSP12) of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q97664673">edit</a>)</td>
    <td><a href="https://doi.org/10.20944/PREPRINTS202003.0024.V1">10.20944/PREPRINTS202003.0024.V1</a></td>
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
    <td>2020-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q104439719">Whole-genome sequence analysis and homology modelling of the main protease and non-structural protein 3 of SARS-CoV-2 reveal an aza-peptide and a lead inhibitor with possible antiviral properties</a> (<a href="http://www.wikidata.org/entity/Q104439719">edit</a>)</td>
    <td><a href="https://doi.org/10.1039/D0NJ00974A">10.1039/D0NJ00974A</a></td>
  </tr>
  <tr>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q89187838">Crystal Structure of NSP15 Endoribonuclease from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q89187838">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6VWW/PDB">10.2210/PDB6VWW/PDB</a></td>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litSARSCoV2Proteins.rq | sed 's+<lang/>+ja+' > litSARSCoV2Proteins.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litSARSCoV2Proteins.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
