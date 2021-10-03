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
    <td>2021-12-01</td>
    <td><a href="https://scholia.toolforge.org/Q108504474">Hypoxia reduces cell attachment of SARS-CoV-2 spike protein by modulating the expression of ACE2, neuropilin-1, syndecan-1 and cellular heparan sulfate</a> (<a href="http://www.wikidata.org/entity/Q108504474">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2021.1932607">10.1080/22221751.2021.1932607</a></td>
  </tr>
  <tr>
    <td>2021-09-23</td>
    <td><a href="https://scholia.toolforge.org/Q108685841">Palmitoylation of SARS‐CoV‐2 S protein is critical for S‐mediated syncytia formation and virus entry</a> (<a href="http://www.wikidata.org/entity/Q108685841">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.27339">10.1002/JMV.27339</a></td>
  </tr>
  <tr>
    <td>2021-09-22</td>
    <td><a href="https://scholia.toolforge.org/Q108684936">Direct activation of endothelial cells by SARS-CoV-2 nucleocapsid protein is blocked by Simvastatin</a> (<a href="http://www.wikidata.org/entity/Q108684936">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.01396-21">10.1128/JVI.01396-21</a></td>
  </tr>
  <tr>
    <td>2021-09-21</td>
    <td><a href="https://scholia.toolforge.org/Q108684885">Characterising proteolysis during SARS-CoV-2 infection identifies viral cleavage sites and cellular targets with therapeutic potential</a> (<a href="http://www.wikidata.org/entity/Q108684885">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-021-25796-W">10.1038/S41467-021-25796-W</a></td>
  </tr>
  <tr>
    <td>2021-09-21</td>
    <td><a href="https://scholia.toolforge.org/Q108685045">SARS-CoV-2 Nsp5 Demonstrates Two Distinct Mechanisms Targeting RIG-I and MAVS To Evade the Innate Immune Response</a> (<a href="http://www.wikidata.org/entity/Q108685045">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/MBIO.02335-21">10.1128/MBIO.02335-21</a></td>
  </tr>
  <tr>
    <td>2021-09-20</td>
    <td><a href="https://scholia.toolforge.org/Q108685317">SARS-CoV-2 S glycoprotein binding to multiple host receptors enables cell entry and infection</a> (<a href="http://www.wikidata.org/entity/Q108685317">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S10719-021-10021-Z">10.1007/S10719-021-10021-Z</a></td>
  </tr>
  <tr>
    <td>2021-09-20</td>
    <td><a href="https://scholia.toolforge.org/Q108685495">On the weak binding and spectroscopic signature of SARS‐CoV‐2 nsp14 interaction with RNA</a> (<a href="http://www.wikidata.org/entity/Q108685495">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/CBIC.202100486">10.1002/CBIC.202100486</a></td>
  </tr>
  <tr>
    <td>2021-09-17</td>
    <td><a href="https://scholia.toolforge.org/Q108685543">Prolyl isomerase Pin1 plays an essential role in SARS-CoV-2 proliferation, indicating its possibility as a novel therapeutic target</a> (<a href="http://www.wikidata.org/entity/Q108685543">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41598-021-97972-3">10.1038/S41598-021-97972-3</a></td>
  </tr>
  <tr>
    <td>2021-09-17</td>
    <td><a href="https://scholia.toolforge.org/Q108685593">A CRISPR/Cas9 genetically engineered organoid biobank reveals essential host factors for coronaviruses</a> (<a href="http://www.wikidata.org/entity/Q108685593">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-021-25729-7">10.1038/S41467-021-25729-7</a></td>
  </tr>
  <tr>
    <td>2021-09-16</td>
    <td><a href="https://scholia.toolforge.org/Q108685246">Assessment of the binding interactions of SARS-CoV-2 spike glycoprotein variants</a> (<a href="http://www.wikidata.org/entity/Q108685246">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JPHA.2021.09.006">10.1016/J.JPHA.2021.09.006</a></td>
  </tr>
  <tr>
    <td>2021-09-14</td>
    <td><a href="https://scholia.toolforge.org/Q108581644">MOV10 Helicase Interacts with Coronavirus Nucleocapsid Protein and Has Antiviral Activity</a> (<a href="http://www.wikidata.org/entity/Q108581644">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/MBIO.01316-21">10.1128/MBIO.01316-21</a></td>
  </tr>
  <tr>
    <td>2021-09-12</td>
    <td><a href="https://scholia.toolforge.org/Q108581936">Infection and transmission of SARS‐CoV‐2 depends on heparan sulfate proteoglycans</a> (<a href="http://www.wikidata.org/entity/Q108581936">edit</a>)</td>
    <td><a href="https://doi.org/10.15252/EMBJ.2020106765">10.15252/EMBJ.2020106765</a></td>
  </tr>
  <tr>
    <td>2021-09-08</td>
    <td><a href="https://scholia.toolforge.org/Q108685202">A molecular sensor determines the ubiquitin substrate specificity of SARS-CoV-2 papain-like protease</a> (<a href="http://www.wikidata.org/entity/Q108685202">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELREP.2021.109754">10.1016/J.CELREP.2021.109754</a></td>
  </tr>
  <tr>
    <td>2021-09-08</td>
    <td><a href="https://scholia.toolforge.org/Q108685710">Structure of SARS-CoV-2 spike protein</a> (<a href="http://www.wikidata.org/entity/Q108685710">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.COVIRO.2021.08.010">10.1016/J.COVIRO.2021.08.010</a></td>
  </tr>
  <tr>
    <td>2021-09-06</td>
    <td><a href="https://scholia.toolforge.org/Q108503122">Deamidation drives molecular aging of the SARS-CoV-2 spike protein receptor-binding motif</a> (<a href="http://www.wikidata.org/entity/Q108503122">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JBC.2021.101175">10.1016/J.JBC.2021.101175</a></td>
  </tr>
  <tr>
    <td>2021-09-03</td>
    <td><a href="https://scholia.toolforge.org/Q108582006">SARS-CoV-2 3C-like protease antagonizes interferon-beta production by facilitating the degradation of IRF3</a> (<a href="http://www.wikidata.org/entity/Q108582006">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CYTO.2021.155697">10.1016/J.CYTO.2021.155697</a></td>
  </tr>
  <tr>
    <td>2021-09-01</td>
    <td><a href="https://scholia.toolforge.org/Q108396912">A dual-role of SARS-CoV-2 nucleocapsid protein in regulating innate immune response</a> (<a href="http://www.wikidata.org/entity/Q108396912">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41392-021-00742-W">10.1038/S41392-021-00742-W</a></td>
  </tr>
  <tr>
    <td>2021-09-01</td>
    <td><a href="https://scholia.toolforge.org/Q108396446">Cellular host factors for SARS-CoV-2 infection</a> (<a href="http://www.wikidata.org/entity/Q108396446">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41564-021-00958-0">10.1038/S41564-021-00958-0</a></td>
  </tr>
  <tr>
    <td>2021-08-31</td>
    <td><a href="https://scholia.toolforge.org/Q108393051">Mechanical activation of spike fosters SARS-CoV-2 viral infection</a> (<a href="http://www.wikidata.org/entity/Q108393051">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41422-021-00558-X">10.1038/S41422-021-00558-X</a></td>
  </tr>
  <tr>
    <td>2021-08-31</td>
    <td><a href="https://scholia.toolforge.org/Q108443151">Impact of temperature on the affinity of SARS-CoV-2 Spike glycoprotein for host ACE2</a> (<a href="http://www.wikidata.org/entity/Q108443151">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JBC.2021.101151">10.1016/J.JBC.2021.101151</a></td>
  </tr>
  <tr>
    <td>2021-08-27</td>
    <td><a href="https://scholia.toolforge.org/Q108393212">SARS-CoV-2 spike promotes inflammation and apoptosis through autophagy by ROS-suppressed PI3K/AKT/mTOR signaling</a> (<a href="http://www.wikidata.org/entity/Q108393212">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBADIS.2021.166260">10.1016/J.BBADIS.2021.166260</a></td>
  </tr>
  <tr>
    <td>2021-08-26</td>
    <td><a href="https://scholia.toolforge.org/Q108395975">Recognition of Divergent Viral Substrates by the SARS-CoV-2 Main Protease</a> (<a href="http://www.wikidata.org/entity/Q108395975">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSINFECDIS.1C00237">10.1021/ACSINFECDIS.1C00237</a></td>
  </tr>
  <tr>
    <td>2021-08-26</td>
    <td><a href="https://scholia.toolforge.org/Q108582062">Phosphorylation of SARS-CoV-2 Orf9b Regulates Its Targeting to Two Binding Sites in TOM70 and Recruitment of Hsp90</a> (<a href="http://www.wikidata.org/entity/Q108582062">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/IJMS22179233">10.3390/IJMS22179233</a></td>
  </tr>
  <tr>
    <td>2021-08-25</td>
    <td><a href="https://scholia.toolforge.org/Q108581865">SARS-CoV-2 Membrane Glycoprotein M Triggers Apoptosis With the Assistance of Nucleocapsid Protein N in Cells</a> (<a href="http://www.wikidata.org/entity/Q108581865">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FCIMB.2021.706252">10.3389/FCIMB.2021.706252</a></td>
  </tr>
  <tr>
    <td>2021-08-23</td>
    <td><a href="https://scholia.toolforge.org/Q108393167">Multiple Roles of SARS-CoV-2 N Protein Facilitated by Proteoform-Specific Interactions with RNA, Host Proteins, and Convalescent Antibodies</a> (<a href="http://www.wikidata.org/entity/Q108393167">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/JACSAU.1C00139">10.1021/JACSAU.1C00139</a></td>
  </tr>
  <tr>
    <td>2021-08-22</td>
    <td><a href="https://scholia.toolforge.org/Q108395817">Cell-Free Hemoglobin Does Not Attenuate the Effects of SARS-CoV-2 Spike Protein S1 Subunit in Pulmonary Endothelial Cells</a> (<a href="http://www.wikidata.org/entity/Q108395817">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/IJMS22169041">10.3390/IJMS22169041</a></td>
  </tr>
  <tr>
    <td>2021-08-21</td>
    <td><a href="https://scholia.toolforge.org/Q108395680">SARS-CoV-2 Proteins Bind to Hemoglobin and Its Metabolites</a> (<a href="http://www.wikidata.org/entity/Q108395680">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/IJMS22169035">10.3390/IJMS22169035</a></td>
  </tr>
  <tr>
    <td>2021-08-20</td>
    <td><a href="https://scholia.toolforge.org/Q108396416">Genome-wide CRISPR activation screen identifies candidate receptors for SARS-CoV-2 entry</a> (<a href="http://www.wikidata.org/entity/Q108396416">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S11427-021-1990-5">10.1007/S11427-021-1990-5</a></td>
  </tr>
  <tr>
    <td>2021-08-19</td>
    <td><a href="https://scholia.toolforge.org/Q108240544">A glycan gate controls opening of the SARS-CoV-2 spike protein</a> (<a href="http://www.wikidata.org/entity/Q108240544">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41557-021-00758-3">10.1038/S41557-021-00758-3</a></td>
  </tr>
  <tr>
    <td>2021-08-17</td>
    <td><a href="https://scholia.toolforge.org/Q108146965">Regulation of the Dimerization and Activity of SARS-CoV-2 Main Protease through Reversible Glutathionylation of Cysteine 300</a> (<a href="http://www.wikidata.org/entity/Q108146965">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/MBIO.02094-21">10.1128/MBIO.02094-21</a></td>
  </tr>
  <tr>
    <td>2021-08-16</td>
    <td><a href="https://scholia.toolforge.org/Q108132162">Structure and Function of N-Terminal Zinc Finger Domain of SARS-CoV-2 NSP2</a> (<a href="http://www.wikidata.org/entity/Q108132162">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S12250-021-00431-6">10.1007/S12250-021-00431-6</a></td>
  </tr>
  <tr>
    <td>2021-08-13</td>
    <td><a href="https://scholia.toolforge.org/Q108104993">The challenge of structural heterogeneity in the native mass spectrometry studies of the SARS-CoV-2 spike protein interactions with its host cell-surface receptor</a> (<a href="http://www.wikidata.org/entity/Q108104993">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S00216-021-03601-3">10.1007/S00216-021-03601-3</a></td>
  </tr>
  <tr>
    <td>2021-08-13</td>
    <td><a href="https://scholia.toolforge.org/Q108393319">The Structure-Based Design of SARS-CoV-2 nsp14 Methyltransferase Ligands Yields Nanomolar Inhibitors</a> (<a href="http://www.wikidata.org/entity/Q108393319">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSINFECDIS.1C00131">10.1021/ACSINFECDIS.1C00131</a></td>
  </tr>
  <tr>
    <td>2021-08-11</td>
    <td><a href="https://scholia.toolforge.org/Q108084116">Structure, mechanism and crystallographic fragment screening of the SARS-CoV-2 NSP13 helicase</a> (<a href="http://www.wikidata.org/entity/Q108084116">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-021-25166-6">10.1038/S41467-021-25166-6</a></td>
  </tr>
  <tr>
    <td>2021-08-05</td>
    <td><a href="https://scholia.toolforge.org/Q107980404">Host ADP-ribosylation and the SARS-CoV-2 macrodomain</a> (<a href="http://www.wikidata.org/entity/Q107980404">edit</a>)</td>
    <td><a href="https://doi.org/10.1042/BST20201212">10.1042/BST20201212</a></td>
  </tr>
  <tr>
    <td>2021-08-05</td>
    <td><a href="https://scholia.toolforge.org/Q107981412">NMPylation and de-NMPylation of SARS-CoV-2 nsp9 by the NiRAN domain</a> (<a href="http://www.wikidata.org/entity/Q107981412">edit</a>)</td>
    <td><a href="https://doi.org/10.1093/NAR/GKAB677">10.1093/NAR/GKAB677</a></td>
  </tr>
  <tr>
    <td>2021-08-02</td>
    <td><a href="https://scholia.toolforge.org/Q107981993">SARS-CoV-2 N protein promotes NLRP3 inflammasome activation to induce hyperinflammation</a> (<a href="http://www.wikidata.org/entity/Q107981993">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-021-25015-6">10.1038/S41467-021-25015-6</a></td>
  </tr>
  <tr>
    <td>2021-08-02</td>
    <td><a href="https://scholia.toolforge.org/Q107982009">Why All the Fury over Furin?</a> (<a href="http://www.wikidata.org/entity/Q107982009">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.JMEDCHEM.1C00518">10.1021/ACS.JMEDCHEM.1C00518</a></td>
  </tr>
  <tr>
    <td>2021-08-01</td>
    <td><a href="https://scholia.toolforge.org/Q108280734">S-acylation of SARS-CoV-2 Spike Protein: Mechanistic Dissection, In Vitro Reconstitution and Role in Viral Infectivity</a> (<a href="http://www.wikidata.org/entity/Q108280734">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JBC.2021.101112">10.1016/J.JBC.2021.101112</a></td>
  </tr>
  <tr>
    <td>2021-08-01</td>
    <td><a href="https://scholia.toolforge.org/Q108582089">Predictable fold switching by the SARS-CoV-2 protein ORF9b</a> (<a href="http://www.wikidata.org/entity/Q108582089">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/PRO.4097">10.1002/PRO.4097</a></td>
  </tr>
  <tr>
    <td>2021-07-30</td>
    <td><a href="https://scholia.toolforge.org/Q107739603">Quantum simulations of SARS-CoV-2 main protease M enable high-quality scoring of diverse ligands</a> (<a href="http://www.wikidata.org/entity/Q107739603">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S10822-021-00412-7">10.1007/S10822-021-00412-7</a></td>
  </tr>
  <tr>
    <td>2021-07-30</td>
    <td><a href="https://scholia.toolforge.org/Q107736003">SARS-CoV-2 spike protein S1 induces fibrin(ogen) resistant to fibrinolysis: Implications for microclot formation in COVID-19</a> (<a href="http://www.wikidata.org/entity/Q107736003">edit</a>)</td>
    <td><a href="https://doi.org/10.1042/BSR20210611">10.1042/BSR20210611</a></td>
  </tr>
  <tr>
    <td>2021-07-30</td>
    <td><a href="https://scholia.toolforge.org/Q107750316">Correlative multi-scale cryo-imaging unveils SARS-CoV-2 assembly and egress</a> (<a href="http://www.wikidata.org/entity/Q107750316">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-021-24887-Y">10.1038/S41467-021-24887-Y</a></td>
  </tr>
  <tr>
    <td>2021-07-30</td>
    <td><a href="https://scholia.toolforge.org/Q107982584">"Bucket brigade" using lysine residues in RNA-dependent RNA polymerase of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q107982584">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BPJ.2021.07.026">10.1016/J.BPJ.2021.07.026</a></td>
  </tr>
  <tr>
    <td>2021-07-29</td>
    <td><a href="https://scholia.toolforge.org/Q108393299">Localization of SARS-CoV-2 Capping Enzymes Revealed by an Antibody against the nsp10 Subunit</a> (<a href="http://www.wikidata.org/entity/Q108393299">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/V13081487">10.3390/V13081487</a></td>
  </tr>
  <tr>
    <td>2021-07-28</td>
    <td><a href="https://scholia.toolforge.org/Q108396536">CD209L/L-SIGN and CD209/DC-SIGN Act as Receptors for SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q108396536">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSCENTSCI.0C01537">10.1021/ACSCENTSCI.0C01537</a></td>
  </tr>
  <tr>
    <td>2021-07-27</td>
    <td><a href="https://scholia.toolforge.org/Q107713706">Structural basis of mismatch recognition by a SARS-CoV-2 proofreading enzyme</a> (<a href="http://www.wikidata.org/entity/Q107713706">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABI9310">10.1126/SCIENCE.ABI9310</a></td>
  </tr>
  <tr>
    <td>2021-07-27</td>
    <td><a href="https://scholia.toolforge.org/Q107713694">SARS-CoV-2 infection triggers widespread host mRNA decay leading to an mRNA export block</a> (<a href="http://www.wikidata.org/entity/Q107713694">edit</a>)</td>
    <td><a href="https://doi.org/10.1261/RNA.078923.121">10.1261/RNA.078923.121</a></td>
  </tr>
  <tr>
    <td>2021-07-23</td>
    <td><a href="https://scholia.toolforge.org/Q108393266">SARS-CoV-2 N Protein Targets TRIM25-Mediated RIG-I Activation to Suppress Innate Immunity</a> (<a href="http://www.wikidata.org/entity/Q108393266">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/V13081439">10.3390/V13081439</a></td>
  </tr>
  <tr>
    <td>2021-07-22</td>
    <td><a href="https://scholia.toolforge.org/Q107675629">Genome-wide analysis of protein-protein interactions and involvement of viral proteins in SARS-CoV-2 replication</a> (<a href="http://www.wikidata.org/entity/Q107675629">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/S13578-021-00644-Y">10.1186/S13578-021-00644-Y</a></td>
  </tr>
  <tr>
    <td>2021-07-16</td>
    <td><a href="https://scholia.toolforge.org/Q107563258">Biochemical characterization of protease activity of Nsp3 from SARS-CoV-2 and its inhibition by nanobodies</a> (<a href="http://www.wikidata.org/entity/Q107563258">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PONE.0253364">10.1371/JOURNAL.PONE.0253364</a></td>
  </tr>
  <tr>
    <td>2021-07-13</td>
    <td><a href="https://scholia.toolforge.org/Q107563217">A head-to-head comparison of the inhibitory activities of 15 peptidomimetic SARS-CoV-2 3CLpro inhibitors</a> (<a href="http://www.wikidata.org/entity/Q107563217">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BMCL.2021.128263">10.1016/J.BMCL.2021.128263</a></td>
  </tr>
  <tr>
    <td>2021-07-13</td>
    <td><a href="https://scholia.toolforge.org/Q108396431">Systematic analysis of SARS-CoV-2 infection of an ACE2-negative human airway cell</a> (<a href="http://www.wikidata.org/entity/Q108396431">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELREP.2021.109364">10.1016/J.CELREP.2021.109364</a></td>
  </tr>
  <tr>
    <td>2021-07-08</td>
    <td><a href="https://scholia.toolforge.org/Q107476758">Targeting liquid–liquid phase separation of SARS-CoV-2 nucleocapsid protein promotes innate antiviral immunity by elevating MAVS activity</a> (<a href="http://www.wikidata.org/entity/Q107476758">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41556-021-00710-0">10.1038/S41556-021-00710-0</a></td>
  </tr>
  <tr>
    <td>2021-07-07</td>
    <td><a href="https://scholia.toolforge.org/Q107455662">SARS-CoV-2 Nsp3 unique domain SUD interacts with guanine quadruplexes and G4-ligands inhibit this interaction</a> (<a href="http://www.wikidata.org/entity/Q107455662">edit</a>)</td>
    <td><a href="https://doi.org/10.1093/NAR/GKAB571">10.1093/NAR/GKAB571</a></td>
  </tr>
  <tr>
    <td>2021-07-07</td>
    <td><a href="https://scholia.toolforge.org/Q107604555">Determination of intermediate state structures in the opening pathway of SARS-CoV-2 spike using cryo-electron microscopy</a> (<a href="http://www.wikidata.org/entity/Q107604555">edit</a>)</td>
    <td><a href="https://doi.org/10.1039/D1SC00244A">10.1039/D1SC00244A</a></td>
  </tr>
  <tr>
    <td>2021-07-06</td>
    <td><a href="https://scholia.toolforge.org/Q108396525">Kidney injury molecule-1 is a potential receptor for SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q108396525">edit</a>)</td>
    <td><a href="https://doi.org/10.1093/JMCB/MJAB003">10.1093/JMCB/MJAB003</a></td>
  </tr>
  <tr>
    <td>2021-07-05</td>
    <td><a href="https://scholia.toolforge.org/Q107466938">Recombinant SARS-CoV-2 envelope protein traffics to the trans-Golgi network following amphipol-mediated delivery into human cells</a> (<a href="http://www.wikidata.org/entity/Q107466938">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JBC.2021.100940">10.1016/J.JBC.2021.100940</a></td>
  </tr>
  <tr>
    <td>2021-07-02</td>
    <td><a href="https://scholia.toolforge.org/Q107473159">Implications of Spike-glycoprotein processing at S1/S2 by Furin, at S2’ by Furin and/or TMPRSS2 and shedding of ACE2: cell-to-cell fusion, cell entry and infectivity of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q107473159">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.07.02.450896">10.1101/2021.07.02.450896</a></td>
  </tr>
  <tr>
    <td>2021-07-01</td>
    <td><a href="https://scholia.toolforge.org/Q107138279">SARS-Cov-2 spike protein fragment 674–685 protects mitochondria from releasing cytochrome c in response to apoptogenic influence</a> (<a href="http://www.wikidata.org/entity/Q107138279">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBRC.2021.05.018">10.1016/J.BBRC.2021.05.018</a></td>
  </tr>
  <tr>
    <td>2021-07-01</td>
    <td><a href="https://scholia.toolforge.org/Q107404382">Variations in Orf3a protein of SARS-CoV-2 alter its structure and function</a> (<a href="http://www.wikidata.org/entity/Q107404382">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBREP.2021.100933">10.1016/J.BBREP.2021.100933</a></td>
  </tr>
  <tr>
    <td>2021-07-01</td>
    <td><a href="https://scholia.toolforge.org/Q107138033">Mutations in SARS-CoV-2 nsp7 and nsp8 proteins and their predicted impact on replication/transcription complex structure</a> (<a href="http://www.wikidata.org/entity/Q107138033">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.26791">10.1002/JMV.26791</a></td>
  </tr>
  <tr>
    <td>2021-06-30</td>
    <td><a href="https://scholia.toolforge.org/Q107505341">Binding of the SARS-CoV-2 spike protein to glycans</a> (<a href="http://www.wikidata.org/entity/Q107505341">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.SCIB.2021.01.010">10.1016/J.SCIB.2021.01.010</a></td>
  </tr>
  <tr>
    <td>2021-06-29</td>
    <td><a href="https://scholia.toolforge.org/Q107389357">Identification of a High-Frequency Intrahost SARS-CoV-2 Spike Variant with Enhanced Cytopathic and Fusogenic Effects</a> (<a href="http://www.wikidata.org/entity/Q107389357">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/MBIO.00788-21">10.1128/MBIO.00788-21</a></td>
  </tr>
  <tr>
    <td>2021-06-29</td>
    <td><a href="https://scholia.toolforge.org/Q107392215">Activation of NF-κB and induction of proinflammatory cytokine expressions mediated by ORF7a protein of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q107392215">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41598-021-92941-2">10.1038/S41598-021-92941-2</a></td>
  </tr>
  <tr>
    <td>2021-06-29</td>
    <td><a href="https://scholia.toolforge.org/Q107981453">Allosteric Activation of SARS-CoV-2 RNA-Dependent RNA Polymerase by Remdesivir Triphosphate and Other Phosphorylated Nucleotides</a> (<a href="http://www.wikidata.org/entity/Q107981453">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/MBIO.01423-21">10.1128/MBIO.01423-21</a></td>
  </tr>
  <tr>
    <td>2021-06-28</td>
    <td><a href="https://scholia.toolforge.org/Q107377038">The endogenous cellular protease inhibitor SPINT2 controls SARS-CoV-2 viral infection and is associated to disease severity</a> (<a href="http://www.wikidata.org/entity/Q107377038">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PPAT.1009687">10.1371/JOURNAL.PPAT.1009687</a></td>
  </tr>
  <tr>
    <td>2021-06-25</td>
    <td><a href="https://scholia.toolforge.org/Q107404564">Characterization of SARS-CoV-2 nucleocapsid protein reveals multiple functional consequences of the C-terminal domain</a> (<a href="http://www.wikidata.org/entity/Q107404564">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ISCI.2021.102681">10.1016/J.ISCI.2021.102681</a></td>
  </tr>
  <tr>
    <td>2021-06-25</td>
    <td><a href="https://scholia.toolforge.org/Q107404629">Energetic and structural features of SARS-CoV-2 N-protein co-assemblies with nucleic acids</a> (<a href="http://www.wikidata.org/entity/Q107404629">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ISCI.2021.102523">10.1016/J.ISCI.2021.102523</a></td>
  </tr>
  <tr>
    <td>2021-06-23</td>
    <td><a href="https://scholia.toolforge.org/Q107338266">TMPRSS2 expression dictates the entry route used by SARS‐CoV‐2 to infect host cells</a> (<a href="http://www.wikidata.org/entity/Q107338266">edit</a>)</td>
    <td><a href="https://doi.org/10.15252/EMBJ.2021107821">10.15252/EMBJ.2021107821</a></td>
  </tr>
  <tr>
    <td>2021-06-23</td>
    <td><a href="https://scholia.toolforge.org/Q107338533">SARS-CoV-2 spike protein induces paracrine senescence and leukocyte adhesion in endothelial cells</a> (<a href="http://www.wikidata.org/entity/Q107338533">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.00794-21">10.1128/JVI.00794-21</a></td>
  </tr>
  <tr>
    <td>2021-06-23</td>
    <td><a href="https://scholia.toolforge.org/Q107343965">Deletion of ER-retention motif on SARS-CoV-2 spike protein reduces cell hybrid during cell–cell fusion</a> (<a href="http://www.wikidata.org/entity/Q107343965">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/S13578-021-00626-0">10.1186/S13578-021-00626-0</a></td>
  </tr>
  <tr>
    <td>2021-06-23</td>
    <td><a href="https://scholia.toolforge.org/Q107466974">Heparan Sulfate Proteoglycans as Attachment Factor for SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q107466974">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSCENTSCI.1C00010">10.1021/ACSCENTSCI.1C00010</a></td>
  </tr>
  <tr>
    <td>2021-06-23</td>
    <td><a href="https://scholia.toolforge.org/Q107338476">Nsp2 has the potential to be a drug target revealed by global identification of SARS-CoV-2 Nsp2-interacting proteins</a> (<a href="http://www.wikidata.org/entity/Q107338476">edit</a>)</td>
    <td><a href="https://doi.org/10.1093/ABBS/GMAB088">10.1093/ABBS/GMAB088</a></td>
  </tr>
  <tr>
    <td>2021-06-22</td>
    <td><a href="https://scholia.toolforge.org/Q107329269">The SARS-CoV-2 Spike Protein Subunit 1 induces COVID-19-like acute lung injury in Κ18-hACE2 transgenic mice and barrier dysfunction in human endothelial cells</a> (<a href="http://www.wikidata.org/entity/Q107329269">edit</a>)</td>
    <td><a href="https://doi.org/10.1152/AJPLUNG.00223.2021">10.1152/AJPLUNG.00223.2021</a></td>
  </tr>
  <tr>
    <td>2021-06-22</td>
    <td><a href="https://scholia.toolforge.org/Q107338440">Genome‐wide association analysis of COVID‐19 mortality risk in SARS‐CoV‐2 genomes identifies mutation in the SARS‐CoV‐2 spike protein that colocalizes with P.1 of the Brazilian strain</a> (<a href="http://www.wikidata.org/entity/Q107338440">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/GEPI.22421">10.1002/GEPI.22421</a></td>
  </tr>
  <tr>
    <td>2021-06-22</td>
    <td><a href="https://scholia.toolforge.org/Q107377078">Impact of Expressing Cells on Glycosylation and Glycan of the SARS-CoV-2 Spike Glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q107377078">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSOMEGA.1C01785">10.1021/ACSOMEGA.1C01785</a></td>
  </tr>
  <tr>
    <td>2021-06-22</td>
    <td><a href="https://scholia.toolforge.org/Q107338277">Cryo-EM structure of SARS-CoV-2 ORF3a in lipid nanodiscs</a> (<a href="http://www.wikidata.org/entity/Q107338277">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41594-021-00619-0">10.1038/S41594-021-00619-0</a></td>
  </tr>
  <tr>
    <td>2021-06-21</td>
    <td><a href="https://scholia.toolforge.org/Q107329301">Simultaneous enrichment and separation of neutral and sialyl glycopeptides of SARS-CoV-2 spike protein enabled by dual-functionalized Ti-IMAC material</a> (<a href="http://www.wikidata.org/entity/Q107329301">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S00216-021-03433-1">10.1007/S00216-021-03433-1</a></td>
  </tr>
  <tr>
    <td>2021-06-16</td>
    <td><a href="https://scholia.toolforge.org/Q107324597">SARS-CoV-2 NSP12 protein is not an IFN-β antagonist</a> (<a href="http://www.wikidata.org/entity/Q107324597">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.00747-21">10.1128/JVI.00747-21</a></td>
  </tr>
  <tr>
    <td>2021-06-15</td>
    <td><a href="https://scholia.toolforge.org/Q107335536">Mn coordinates Cap-0-RNA to align substrates for efficient 2'--methyl transfer by SARS-CoV-2 nsp16</a> (<a href="http://www.wikidata.org/entity/Q107335536">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td>2021-06-14</td>
    <td><a href="https://scholia.toolforge.org/Q107272991">Molecular biology of the SARs‐CoV‐2 spike protein: A review of current knowledge</a> (<a href="http://www.wikidata.org/entity/Q107272991">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.27132">10.1002/JMV.27132</a></td>
  </tr>
  <tr>
    <td>2021-06-14</td>
    <td><a href="https://scholia.toolforge.org/Q107389277">Restriction of SARS-CoV-2 replication by targeting programmed −1 ribosomal frameshifting</a> (<a href="http://www.wikidata.org/entity/Q107389277">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.2023051118">10.1073/PNAS.2023051118</a></td>
  </tr>
  <tr>
    <td>2021-06-14</td>
    <td><a href="https://scholia.toolforge.org/Q107273150">Revealing the Structural Plasticity of SARS-CoV-2 nsp7 and nsp8 Using Structural Proteomics</a> (<a href="http://www.wikidata.org/entity/Q107273150">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/JASMS.1C00086">10.1021/JASMS.1C00086</a></td>
  </tr>
  <tr>
    <td>2021-06-11</td>
    <td><a href="https://scholia.toolforge.org/Q107213992">Structural basis of coronavirus E protein interactions with human PALS1 PDZ domain</a> (<a href="http://www.wikidata.org/entity/Q107213992">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S42003-021-02250-7">10.1038/S42003-021-02250-7</a></td>
  </tr>
  <tr>
    <td>2021-06-11</td>
    <td><a href="https://scholia.toolforge.org/Q108685875">Palmitoylation of SARS-CoV-2 S protein is essential for viral infectivity</a> (<a href="http://www.wikidata.org/entity/Q108685875">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41392-021-00651-Y">10.1038/S41392-021-00651-Y</a></td>
  </tr>
  <tr>
    <td>2021-06-10</td>
    <td><a href="https://scholia.toolforge.org/Q107202823">Conformational Dynamics in the Interaction of SARS-CoV-2 Papain-like Protease with Human Interferon-Stimulated Gene 15 Protein</a> (<a href="http://www.wikidata.org/entity/Q107202823">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.JPCLETT.1C00831">10.1021/ACS.JPCLETT.1C00831</a></td>
  </tr>
  <tr>
    <td>2021-06-10</td>
    <td><a href="https://scholia.toolforge.org/Q107210867">SARS-CoV-2 envelope protein causes acute respiratory distress syndrome (ARDS)-like pathological damages and constitutes an antiviral target</a> (<a href="http://www.wikidata.org/entity/Q107210867">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41422-021-00519-4">10.1038/S41422-021-00519-4</a></td>
  </tr>
  <tr>
    <td>2021-06-10</td>
    <td><a href="https://scholia.toolforge.org/Q107202926">Mechanism of Inhibition of the Reproduction of SARS-CoV-2 and Ebola Viruses by Remdesivir</a> (<a href="http://www.wikidata.org/entity/Q107202926">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.BIOCHEM.1C00292">10.1021/ACS.BIOCHEM.1C00292</a></td>
  </tr>
  <tr>
    <td>2021-06-10</td>
    <td><a href="https://scholia.toolforge.org/Q107377776">Conformational dynamics of 13 amino acids long NSP11 of SARS-CoV-2 under membrane mimetics and different solvent conditions</a> (<a href="http://www.wikidata.org/entity/Q107377776">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.MICPATH.2021.105041">10.1016/J.MICPATH.2021.105041</a></td>
  </tr>
  <tr>
    <td>2021-06-09</td>
    <td><a href="https://scholia.toolforge.org/Q107202129">Endothelial glycocalyx shields the interaction of SARS-CoV-2 spike protein with ACE2 receptors</a> (<a href="http://www.wikidata.org/entity/Q107202129">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41598-021-91231-1">10.1038/S41598-021-91231-1</a></td>
  </tr>
  <tr>
    <td>2021-06-09</td>
    <td><a href="https://scholia.toolforge.org/Q107181586">SARS-CoV-2 Envelope (E) protein interacts with PDZ-domain-2 of host tight junction protein ZO1</a> (<a href="http://www.wikidata.org/entity/Q107181586">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PONE.0251955">10.1371/JOURNAL.PONE.0251955</a></td>
  </tr>
  <tr>
    <td>2021-06-08</td>
    <td><a href="https://scholia.toolforge.org/Q107344282">SARS-CoV-2 exacerbates proinflammatory responses in myeloid cells through C-type lectin receptors and Tweety family member 2</a> (<a href="http://www.wikidata.org/entity/Q107344282">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.IMMUNI.2021.05.006">10.1016/J.IMMUNI.2021.05.006</a></td>
  </tr>
  <tr>
    <td>2021-06-08</td>
    <td><a href="https://scholia.toolforge.org/Q107180910">Structural basis for SARS-CoV-2 envelope protein recognition of human cell junction protein PALS1</a> (<a href="http://www.wikidata.org/entity/Q107180910">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-021-23533-X">10.1038/S41467-021-23533-X</a></td>
  </tr>
  <tr>
    <td>2021-06-07</td>
    <td><a href="https://scholia.toolforge.org/Q107392240">Cell entry by SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q107392240">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.TIBS.2021.06.001">10.1016/J.TIBS.2021.06.001</a></td>
  </tr>
  <tr>
    <td>2021-06-03</td>
    <td><a href="https://scholia.toolforge.org/Q107133507">Fe-S cofactors in the SARS-CoV-2 RNA-dependent RNA polymerase are potential antiviral targets</a> (<a href="http://www.wikidata.org/entity/Q107133507">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABI5224">10.1126/SCIENCE.ABI5224</a></td>
  </tr>
  <tr>
    <td>2021-06-02</td>
    <td><a href="https://scholia.toolforge.org/Q107101979">A metal ion orients SARS-CoV-2 mRNA to ensure accurate 2′-O methylation of its first nucleotide</a> (<a href="http://www.wikidata.org/entity/Q107101979">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-021-23594-Y">10.1038/S41467-021-23594-Y</a></td>
  </tr>
  <tr>
    <td>2021-06-02</td>
    <td><a href="https://scholia.toolforge.org/Q107113401">Epigallocatechin Gallate Inhibits the Uridylate-Specific Endoribonuclease Nsp15 and Efficiently Neutralizes the SARS-CoV-2 Strain</a> (<a href="http://www.wikidata.org/entity/Q107113401">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.JAFC.1C02050">10.1021/ACS.JAFC.1C02050</a></td>
  </tr>
  <tr>
    <td>2021-06-02</td>
    <td><a href="https://scholia.toolforge.org/Q107505959">Nanoluciferase complementation-based bioreporter reveals the importance of N-linked glycosylation of SARS-CoV-2 S for viral entry</a> (<a href="http://www.wikidata.org/entity/Q107505959">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.YMTHE.2021.02.007">10.1016/J.YMTHE.2021.02.007</a></td>
  </tr>
  <tr>
    <td>2021-06-02</td>
    <td><a href="https://scholia.toolforge.org/Q107101917">Surface Proteins of SARS-CoV-2 Drive Airway Epithelial Cells to Induce IFN-Dependent Inflammation</a> (<a href="http://www.wikidata.org/entity/Q107101917">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td>2021-06-01</td>
    <td><a href="https://scholia.toolforge.org/Q107343732">A High-Throughput RNA Displacement Assay for Screening SARS-CoV-2 nsp10-nsp16 Complex toward Developing Therapeutics for COVID-19</a> (<a href="http://www.wikidata.org/entity/Q107343732">edit</a>)</td>
    <td><a href="https://doi.org/10.1177/2472555220985040">10.1177/2472555220985040</a></td>
  </tr>
  <tr>
    <td>2021-06-01</td>
    <td><a href="https://scholia.toolforge.org/Q107377222">A Crystallographic Snapshot of SARS-CoV-2 Main Protease Maturation Process</a> (<a href="http://www.wikidata.org/entity/Q107377222">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JMB.2021.167118">10.1016/J.JMB.2021.167118</a></td>
  </tr>
  <tr>
    <td>2021-06-01</td>
    <td><a href="https://scholia.toolforge.org/Q107108576">Neuropilin-1 Assists SARS-CoV-2 Infection by Stimulating the Separation of Spike Protein Domains S1 and S2</a> (<a href="http://www.wikidata.org/entity/Q107108576">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BPJ.2021.05.026">10.1016/J.BPJ.2021.05.026</a></td>
  </tr>
  <tr>
    <td>2021-06-01</td>
    <td><a href="https://scholia.toolforge.org/Q107466954">The envelope protein of SARS-CoV-2 increases intra-Golgi pH and forms a cation channel that is regulated by pH</a> (<a href="http://www.wikidata.org/entity/Q107466954">edit</a>)</td>
    <td><a href="https://doi.org/10.1113/JP281037">10.1113/JP281037</a></td>
  </tr>
  <tr>
    <td>2021-06-01</td>
    <td><a href="https://scholia.toolforge.org/Q108396470">Drugs that inhibit TMEM16 proteins block SARS-CoV-2 spike-induced syncytia</a> (<a href="http://www.wikidata.org/entity/Q108396470">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-021-03491-6">10.1038/S41586-021-03491-6</a></td>
  </tr>
  <tr>
    <td>2021-06-01</td>
    <td><a href="https://scholia.toolforge.org/Q107389638">SARS-CoV-2 genomic surveillance identifies naturally occurring truncation of ORF7a that limits immune suppression</a> (<a href="http://www.wikidata.org/entity/Q107389638">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELREP.2021.109197">10.1016/J.CELREP.2021.109197</a></td>
  </tr>
  <tr>
    <td>2021-06-01</td>
    <td><a href="https://scholia.toolforge.org/Q107981452">Structure and function of SARS-CoV-2 polymerase</a> (<a href="http://www.wikidata.org/entity/Q107981452">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.COVIRO.2021.03.010">10.1016/J.COVIRO.2021.03.010</a></td>
  </tr>
  <tr>
    <td>2021-06-01</td>
    <td><a href="https://scholia.toolforge.org/Q107981570">Piece of the puzzle: Remdesivir disassembles the multimeric SARS-CoV-2 RNA-dependent RNA polymerase complex</a> (<a href="http://www.wikidata.org/entity/Q107981570">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S12013-021-00977-Y">10.1007/S12013-021-00977-Y</a></td>
  </tr>
  <tr>
    <td>2021-05-31</td>
    <td><a href="https://scholia.toolforge.org/Q107980419">Revealing the host antiviral protein ZAP-S as an inhibitor of SARS-CoV-2 programmed ribosomal frameshifting</a> (<a href="http://www.wikidata.org/entity/Q107980419">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.05.31.445667">10.1101/2021.05.31.445667</a></td>
  </tr>
  <tr>
    <td>2021-05-28</td>
    <td><a href="https://scholia.toolforge.org/Q106873527">ALG-097111, a potent and selective SARS-CoV-2 3-chymotrypsin-like cysteine protease inhibitor exhibits in vivo efficacy in a Syrian Hamster model</a> (<a href="http://www.wikidata.org/entity/Q106873527">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBRC.2021.03.096">10.1016/J.BBRC.2021.03.096</a></td>
  </tr>
  <tr>
    <td>2021-05-27</td>
    <td><a href="https://scholia.toolforge.org/Q107111770">Translational shutdown and evasion of the innate immune response by SARS-CoV-2 NSP14 protein</a> (<a href="http://www.wikidata.org/entity/Q107111770">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.2101161118">10.1073/PNAS.2101161118</a></td>
  </tr>
  <tr>
    <td>2021-05-27</td>
    <td><a href="https://scholia.toolforge.org/Q107098292">Identification of SARS-CoV-2 Receptor Binding Inhibitors by In Vitro Screening of Drug Libraries</a> (<a href="http://www.wikidata.org/entity/Q107098292">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/MOLECULES26113213">10.3390/MOLECULES26113213</a></td>
  </tr>
  <tr>
    <td>2021-05-27</td>
    <td><a href="https://scholia.toolforge.org/Q107111822">NPC1-regulated dynamic of clathrin-coated pits is essential for viral entry</a> (<a href="http://www.wikidata.org/entity/Q107111822">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S11427-021-1929-Y">10.1007/S11427-021-1929-Y</a></td>
  </tr>
  <tr>
    <td>2021-05-26</td>
    <td><a href="https://scholia.toolforge.org/Q107076694">Similarities and differences in the conformational stability and reversibility of ORF8, an accessory protein of SARS-CoV-2, and its L84S variant</a> (<a href="http://www.wikidata.org/entity/Q107076694">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBRC.2021.05.074">10.1016/J.BBRC.2021.05.074</a></td>
  </tr>
  <tr>
    <td>2021-05-25</td>
    <td><a href="https://scholia.toolforge.org/Q107366200">2'-O methylation of RNA cap in SARS-CoV-2 captured by serial crystallography</a> (<a href="http://www.wikidata.org/entity/Q107366200">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.2100170118">10.1073/PNAS.2100170118</a></td>
  </tr>
  <tr>
    <td>2021-05-25</td>
    <td><a href="https://scholia.toolforge.org/Q107112006">SARS-CoV-2 nucleocapsid protein impairs stress granule formation to promote viral replication</a> (<a href="http://www.wikidata.org/entity/Q107112006">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41421-021-00275-0">10.1038/S41421-021-00275-0</a></td>
  </tr>
  <tr>
    <td>2021-05-25</td>
    <td><a href="https://scholia.toolforge.org/Q107072974">Azelastine inhibits viropexis of SARS-CoV-2 spike pseudovirus by binding to SARS-CoV-2 entry receptor ACE2</a> (<a href="http://www.wikidata.org/entity/Q107072974">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td>2021-05-24</td>
    <td><a href="https://scholia.toolforge.org/Q107343665">Coupling of N7-methyltransferase and 3'-5' exoribonuclease with SARS-CoV-2 polymerase reveals mechanisms for capping and proofreading</a> (<a href="http://www.wikidata.org/entity/Q107343665">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2021.05.033">10.1016/J.CELL.2021.05.033</a></td>
  </tr>
  <tr>
    <td>2021-05-24</td>
    <td><a href="https://scholia.toolforge.org/Q107112104">SARS-CoV-2 simulations go exascale to predict dramatic spike opening and cryptic pockets across the proteome</a> (<a href="http://www.wikidata.org/entity/Q107112104">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41557-021-00707-0">10.1038/S41557-021-00707-0</a></td>
  </tr>
  <tr>
    <td>2021-05-22</td>
    <td><a href="https://scholia.toolforge.org/Q107344131">Glycosylation is a key in SARS-CoV-2 infection</a> (<a href="http://www.wikidata.org/entity/Q107344131">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S00109-021-02092-0">10.1007/S00109-021-02092-0</a></td>
  </tr>
  <tr>
    <td>2021-05-21</td>
    <td><a href="https://scholia.toolforge.org/Q107098589">Viewing SARS-CoV-2 Nucleocapsid Protein in Terms of Molecular Flexibility</a> (<a href="http://www.wikidata.org/entity/Q107098589">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td>2021-05-21</td>
    <td><a href="https://scholia.toolforge.org/Q107113087">The ORF8 protein of SARS-CoV-2 mediates immune evasion through down-regulating MHC-Ι</a> (<a href="http://www.wikidata.org/entity/Q107113087">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.2024202118">10.1073/PNAS.2024202118</a></td>
  </tr>
  <tr>
    <td>2021-05-19</td>
    <td><a href="https://scholia.toolforge.org/Q107098692">Contribution of Syndecans to the Cellular Entry of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q107098692">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/IJMS22105336">10.3390/IJMS22105336</a></td>
  </tr>
  <tr>
    <td>2021-05-18</td>
    <td><a href="https://scholia.toolforge.org/Q106996698">Hepatitis C virus drugs that inhibit SARS-CoV-2 papain-like protease synergize with remdesivir to suppress viral replication in cell culture</a> (<a href="http://www.wikidata.org/entity/Q106996698">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELREP.2021.109133">10.1016/J.CELREP.2021.109133</a></td>
  </tr>
  <tr>
    <td>2021-05-18</td>
    <td><a href="https://scholia.toolforge.org/Q107134208">ZMPSTE24 Regulates SARS-CoV-2 Spike Protein-enhanced Expression of Endothelial Plasminogen Activator Inhibitor-1</a> (<a href="http://www.wikidata.org/entity/Q107134208">edit</a>)</td>
    <td><a href="https://doi.org/10.1165/RCMB.2020-0544OC">10.1165/RCMB.2020-0544OC</a></td>
  </tr>
  <tr>
    <td>2021-05-18</td>
    <td><a href="https://scholia.toolforge.org/Q107134395">Disruption of disulfides within RBD of SARS‐CoV‐2 spike protein prevents fusion and represents a target for viral entry inhibition by registered drugs</a> (<a href="http://www.wikidata.org/entity/Q107134395">edit</a>)</td>
    <td><a href="https://doi.org/10.1096/FJ.202100560R">10.1096/FJ.202100560R</a></td>
  </tr>
  <tr>
    <td>2021-05-18</td>
    <td><a href="https://scholia.toolforge.org/Q107134284">Interactions of SARS-CoV-2 envelope protein with amilorides correlate with antiviral activity</a> (<a href="http://www.wikidata.org/entity/Q107134284">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PPAT.1009519">10.1371/JOURNAL.PPAT.1009519</a></td>
  </tr>
  <tr>
    <td>2021-05-17</td>
    <td><a href="https://scholia.toolforge.org/Q107137976">Two conserved oligomer interfaces of NSP7 and NSP8 underpin the dynamic assembly of SARS-CoV-2 RdRP</a> (<a href="http://www.wikidata.org/entity/Q107137976">edit</a>)</td>
    <td><a href="https://doi.org/10.1093/NAR/GKAB370">10.1093/NAR/GKAB370</a></td>
  </tr>
  <tr>
    <td>2021-05-15</td>
    <td><a href="https://scholia.toolforge.org/Q107980878">The human pandemic coronaviruses on the show: The spike glycoprotein as the main actor in the coronaviruses play</a> (<a href="http://www.wikidata.org/entity/Q107980878">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.IJBIOMAC.2021.02.203">10.1016/J.IJBIOMAC.2021.02.203</a></td>
  </tr>
  <tr>
    <td>2021-05-14</td>
    <td><a href="https://scholia.toolforge.org/Q107324915">SARS-CoV-2 Fusion Peptide has a Greater Membrane Perturbating Effect than SARS-CoV with Highly Specific Dependence on Ca</a> (<a href="http://www.wikidata.org/entity/Q107324915">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JMB.2021.166946">10.1016/J.JMB.2021.166946</a></td>
  </tr>
  <tr>
    <td>2021-05-14</td>
    <td><a href="https://scholia.toolforge.org/Q107138333">Crystal structure of SARS-CoV-2 Orf9b in complex with human TOM70 suggests unusual virus-host interactions</a> (<a href="http://www.wikidata.org/entity/Q107138333">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-021-23118-8">10.1038/S41467-021-23118-8</a></td>
  </tr>
  <tr>
    <td>2021-05-13</td>
    <td><a href="https://scholia.toolforge.org/Q107135161">Variable post-translational modifications of SARS-CoV-2 nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q107135161">edit</a>)</td>
    <td><a href="https://doi.org/10.1093/GLYCOB/CWAB044">10.1093/GLYCOB/CWAB044</a></td>
  </tr>
  <tr>
    <td>2021-05-11</td>
    <td><a href="https://scholia.toolforge.org/Q107343676">Structural basis for backtracking by the SARS-CoV-2 replication-transcription complex</a> (<a href="http://www.wikidata.org/entity/Q107343676">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.2102516118">10.1073/PNAS.2102516118</a></td>
  </tr>
  <tr>
    <td>2021-05-10</td>
    <td><a href="https://scholia.toolforge.org/Q107073656">Deletion of the SARS-CoV-2 Spike Cytoplasmic Tail Increases Infectivity in Pseudovirus Neutralization Assays</a> (<a href="http://www.wikidata.org/entity/Q107073656">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.00044-21">10.1128/JVI.00044-21</a></td>
  </tr>
  <tr>
    <td>2021-05-07</td>
    <td><a href="https://scholia.toolforge.org/Q108146970">X-ray screening identifies active site and allosteric inhibitors of SARS-CoV-2 main protease</a> (<a href="http://www.wikidata.org/entity/Q108146970">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABF7945">10.1126/SCIENCE.ABF7945</a></td>
  </tr>
  <tr>
    <td>2021-05-07</td>
    <td><a href="https://scholia.toolforge.org/Q107179972">TLR2 senses the SARS-CoV-2 envelope protein to produce inflammatory cytokines</a> (<a href="http://www.wikidata.org/entity/Q107179972">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41590-021-00937-X">10.1038/S41590-021-00937-X</a></td>
  </tr>
  <tr>
    <td>2021-05-04</td>
    <td><a href="https://scholia.toolforge.org/Q107378326">The SARS-CoV-2 protein ORF3a inhibits fusion of autophagosomes with lysosomes</a> (<a href="http://www.wikidata.org/entity/Q107378326">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41421-021-00268-Z">10.1038/S41421-021-00268-Z</a></td>
  </tr>
  <tr>
    <td>2021-05-01</td>
    <td><a href="https://scholia.toolforge.org/Q107076067">Arginine Methylation of SARS-Cov-2 Nucleocapsid Protein Regulates RNA Binding, its Ability to Suppress Stress Granule Formation and Viral Replication</a> (<a href="http://www.wikidata.org/entity/Q107076067">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JBC.2021.100821">10.1016/J.JBC.2021.100821</a></td>
  </tr>
  <tr>
    <td>2021-05-01</td>
    <td><a href="https://scholia.toolforge.org/Q107273003">Human SARS CoV-2 spike protein mutations</a> (<a href="http://www.wikidata.org/entity/Q107273003">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/PROT.26042">10.1002/PROT.26042</a></td>
  </tr>
  <tr>
    <td>2021-05-01</td>
    <td><a href="https://scholia.toolforge.org/Q107377319">DC/L-SIGN recognition of spike glycoprotein promotes SARS-CoV-2 trans-infection and can be inhibited by a glycomimetic antagonist</a> (<a href="http://www.wikidata.org/entity/Q107377319">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PPAT.1009576">10.1371/JOURNAL.PPAT.1009576</a></td>
  </tr>
  <tr>
    <td>2021-05-01</td>
    <td><a href="https://scholia.toolforge.org/Q108395699">SARS-CoV-2 can recruit a heme metabolite to evade antibody immunity</a> (<a href="http://www.wikidata.org/entity/Q108395699">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIADV.ABG7607">10.1126/SCIADV.ABG7607</a></td>
  </tr>
  <tr>
    <td>2021-05-01</td>
    <td><a href="https://scholia.toolforge.org/Q107980418">Interferon antagonism by SARS-CoV-2: a functional study using reverse genetics</a> (<a href="http://www.wikidata.org/entity/Q107980418">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/S2666-5247(21)00027-6">10.1016/S2666-5247(21)00027-6</a></td>
  </tr>
  <tr>
    <td>2021-04-30</td>
    <td><a href="https://scholia.toolforge.org/Q106816015">SARS-CoV-2 Spike Protein Impairs Endothelial Function via Downregulation of ACE 2</a> (<a href="http://www.wikidata.org/entity/Q106816015">edit</a>)</td>
    <td><a href="https://doi.org/10.1161/CIRCRESAHA.121.318902">10.1161/CIRCRESAHA.121.318902</a></td>
  </tr>
  <tr>
    <td>2021-04-29</td>
    <td><a href="https://scholia.toolforge.org/Q107343704">Reconstitution and functional characterization of SARS-CoV-2 proofreading complex</a> (<a href="http://www.wikidata.org/entity/Q107343704">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.PEP.2021.105894">10.1016/J.PEP.2021.105894</a></td>
  </tr>
  <tr>
    <td>2021-04-29</td>
    <td><a href="https://scholia.toolforge.org/Q107073649">SARS-CoV-2 variants B.1.351 and P.1 escape from neutralizing antibodies</a> (<a href="http://www.wikidata.org/entity/Q107073649">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2021.03.036">10.1016/J.CELL.2021.03.036</a></td>
  </tr>
  <tr>
    <td>2021-04-29</td>
    <td><a href="https://scholia.toolforge.org/Q107073689">Multiple SARS-CoV-2 variants escape neutralization by vaccine-induced humoral immunity</a> (<a href="http://www.wikidata.org/entity/Q107073689">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2021.03.013">10.1016/J.CELL.2021.03.013</a></td>
  </tr>
  <tr>
    <td>2021-04-29</td>
    <td><a href="https://scholia.toolforge.org/Q107404679">SARS-CoV-2 ORF9b antagonizes type I and III interferons by targeting multiple components of the RIG-I/MDA-5-MAVS, TLR3-TRIF, and cGAS-STING signaling pathways</a> (<a href="http://www.wikidata.org/entity/Q107404679">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.27050">10.1002/JMV.27050</a></td>
  </tr>
  <tr>
    <td>2021-04-28</td>
    <td><a href="https://scholia.toolforge.org/Q107134863">Coiled-coil heterodimers with increased stability for cellular regulation and sensing SARS-CoV-2 spike protein-mediated cell fusion</a> (<a href="http://www.wikidata.org/entity/Q107134863">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41598-021-88315-3">10.1038/S41598-021-88315-3</a></td>
  </tr>
  <tr>
    <td>2021-04-27</td>
    <td><a href="https://scholia.toolforge.org/Q107473210">The furin cleavage site in the SARS-CoV-2 spike protein is required for transmission in ferrets</a> (<a href="http://www.wikidata.org/entity/Q107473210">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41564-021-00908-W">10.1038/S41564-021-00908-W</a></td>
  </tr>
  <tr>
    <td>2021-04-24</td>
    <td><a href="https://scholia.toolforge.org/Q107476854">RNA-induced liquid phase separation of SARS-CoV-2 nucleocapsid protein facilitates NF-κB hyper-activation and inflammation</a> (<a href="http://www.wikidata.org/entity/Q107476854">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41392-021-00575-7">10.1038/S41392-021-00575-7</a></td>
  </tr>
  <tr>
    <td>2021-04-23</td>
    <td><a href="https://scholia.toolforge.org/Q107031904">SARS-CoV-2 requires cholesterol for viral entry and pathological syncytia formation</a> (<a href="http://www.wikidata.org/entity/Q107031904">edit</a>)</td>
    <td><a href="https://doi.org/10.7554/ELIFE.65962">10.7554/ELIFE.65962</a></td>
  </tr>
  <tr>
    <td>2021-04-23</td>
    <td><a href="https://scholia.toolforge.org/Q106451835">ORF8 contributes to cytokine storm during SARS-CoV-2 infection by activating IL-17 pathway</a> (<a href="http://www.wikidata.org/entity/Q106451835">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ISCI.2021.102293">10.1016/J.ISCI.2021.102293</a></td>
  </tr>
  <tr>
    <td>2021-04-20</td>
    <td><a href="https://scholia.toolforge.org/Q107455687">The SARS‐unique domain (SUD) of SARS‐CoV and SARS‐CoV‐2 interacts with human Paip1 to enhance viral RNA translation</a> (<a href="http://www.wikidata.org/entity/Q107455687">edit</a>)</td>
    <td><a href="https://doi.org/10.15252/EMBJ.2019102277">10.15252/EMBJ.2019102277</a></td>
  </tr>
  <tr>
    <td>2021-04-16</td>
    <td><a href="https://scholia.toolforge.org/Q106464763">The Mechanism of SARS-CoV-2 Nucleocapsid Protein Recognition by the Human 14-3-3 Proteins</a> (<a href="http://www.wikidata.org/entity/Q106464763">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JMB.2021.166875">10.1016/J.JMB.2021.166875</a></td>
  </tr>
  <tr>
    <td>2021-04-15</td>
    <td><a href="https://scholia.toolforge.org/Q107273004">Soluble ACE2-mediated cell entry of SARS-CoV-2 via interaction with proteins related to the renin-angiotensin system</a> (<a href="http://www.wikidata.org/entity/Q107273004">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2021.02.053">10.1016/J.CELL.2021.02.053</a></td>
  </tr>
  <tr>
    <td>2021-04-15</td>
    <td><a href="https://scholia.toolforge.org/Q106623507">A unique view of SARS-COV-2 through the lens of ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q106623507">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.COMPBIOMED.2021.104380">10.1016/J.COMPBIOMED.2021.104380</a></td>
  </tr>
  <tr>
    <td>2021-04-13</td>
    <td><a href="https://scholia.toolforge.org/Q107389594">SARS-CoV-2 ORF6 Disrupts Bidirectional Nucleocytoplasmic Transport through Interactions with Rae1 and Nup98</a> (<a href="http://www.wikidata.org/entity/Q107389594">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/MBIO.00065-21">10.1128/MBIO.00065-21</a></td>
  </tr>
  <tr>
    <td>2021-04-12</td>
    <td><a href="https://scholia.toolforge.org/Q107076476">SARS-CoV-2 and SARS-CoV Spike-Mediated Cell-Cell Fusion Differ in Their Requirements for Receptor Expression and Proteolytic Activation</a> (<a href="http://www.wikidata.org/entity/Q107076476">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.00002-21">10.1128/JVI.00002-21</a></td>
  </tr>
  <tr>
    <td>2021-04-12</td>
    <td><a href="https://scholia.toolforge.org/Q107473264">The Polybasic Cleavage Site in SARS-CoV-2 Spike Modulates Viral Sensitivity to Type I Interferon and IFITM2</a> (<a href="http://www.wikidata.org/entity/Q107473264">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.02422-20">10.1128/JVI.02422-20</a></td>
  </tr>
  <tr>
    <td>2021-04-09</td>
    <td><a href="https://scholia.toolforge.org/Q107324544">Human airway cells prevent SARS-CoV-2 multibasic cleavage site cell culture adaptation</a> (<a href="http://www.wikidata.org/entity/Q107324544">edit</a>)</td>
    <td><a href="https://doi.org/10.7554/ELIFE.66815">10.7554/ELIFE.66815</a></td>
  </tr>
  <tr>
    <td>2021-04-08</td>
    <td><a href="https://scholia.toolforge.org/Q107980422">Structural Insights into Plasticity and Discovery of Remdesivir Metabolite GS-441524 Binding in SARS-CoV-2 Macrodomain</a> (<a href="http://www.wikidata.org/entity/Q107980422">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSMEDCHEMLETT.0C00684">10.1021/ACSMEDCHEMLETT.0C00684</a></td>
  </tr>
  <tr>
    <td>2021-04-07</td>
    <td><a href="https://scholia.toolforge.org/Q107980417">The SARS-CoV-2 Nsp3 macrodomain reverses PARP9/DTX3L-dependent ADP-ribosylation induced by interferon signalling</a> (<a href="http://www.wikidata.org/entity/Q107980417">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.04.06.438552">10.1101/2021.04.06.438552</a></td>
  </tr>
  <tr>
    <td>2021-04-05</td>
    <td><a href="https://scholia.toolforge.org/Q107073208">Repositioning of histamine H receptor antagonist: Doxepin inhibits viropexis of SARS-CoV-2 Spike pseudovirus by blocking ACE2</a> (<a href="http://www.wikidata.org/entity/Q107073208">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.EJPHAR.2021.173897">10.1016/J.EJPHAR.2021.173897</a></td>
  </tr>
  <tr>
    <td>2021-04-04</td>
    <td><a href="https://scholia.toolforge.org/Q107341961">Structure and dynamics of SARS-CoV-2 proofreading exoribonuclease ExoN</a> (<a href="http://www.wikidata.org/entity/Q107341961">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.04.02.438274">10.1101/2021.04.02.438274</a></td>
  </tr>
  <tr>
    <td>2021-04-01</td>
    <td><a href="https://scholia.toolforge.org/Q107639188">ISG15-dependent activation of the sensor MDA5 is antagonized by the SARS-CoV-2 papain-like protease to evade host innate immunity</a> (<a href="http://www.wikidata.org/entity/Q107639188">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41564-021-00884-1">10.1038/S41564-021-00884-1</a></td>
  </tr>
  <tr>
    <td>2021-04-01</td>
    <td><a href="https://scholia.toolforge.org/Q107980420">Fragment binding to the Nsp3 macrodomain of SARS-CoV-2 identified through crystallographic screening and computational docking</a> (<a href="http://www.wikidata.org/entity/Q107980420">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIADV.ABF8711">10.1126/SCIADV.ABF8711</a></td>
  </tr>
  <tr>
    <td>2021-04-01</td>
    <td><a href="https://scholia.toolforge.org/Q107134961">Nucleocapsid and Spike Proteins of SARS-CoV-2 Drive Neutrophil Extracellular Trap Formation</a> (<a href="http://www.wikidata.org/entity/Q107134961">edit</a>)</td>
    <td><a href="https://doi.org/10.4110/IN.2021.21.E16">10.4110/IN.2021.21.E16</a></td>
  </tr>
  <tr>
    <td>2021-04-01</td>
    <td><a href="https://scholia.toolforge.org/Q107031958">Structural insight into SARS-CoV-2 neutralizing antibodies and modulation of syncytia</a> (<a href="http://www.wikidata.org/entity/Q107031958">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2021.04.033">10.1016/J.CELL.2021.04.033</a></td>
  </tr>
  <tr>
    <td>2021-04-01</td>
    <td><a href="https://scholia.toolforge.org/Q107073292">Testing of the inhibitory effects of loratadine and desloratadine on SARS-CoV-2 spike pseudotyped virus viropexis</a> (<a href="http://www.wikidata.org/entity/Q107073292">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CBI.2021.109420">10.1016/J.CBI.2021.109420</a></td>
  </tr>
  <tr>
    <td>2021-04-01</td>
    <td><a href="https://scholia.toolforge.org/Q107077760">The Role of the SARS-CoV-2 S-Protein Glycosylation in the Interaction of SARS-CoV-2/ACE2 and Immunological Responses</a> (<a href="http://www.wikidata.org/entity/Q107077760">edit</a>)</td>
    <td><a href="https://doi.org/10.1089/VIM.2020.0174">10.1089/VIM.2020.0174</a></td>
  </tr>
  <tr>
    <td>2021-04-01</td>
    <td><a href="https://scholia.toolforge.org/Q107349432">Analysis of glycosylation and disulfide bonding of wild-type SARS-CoV-2 spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q107349432">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.04.01.438120">10.1101/2021.04.01.438120</a></td>
  </tr>
  <tr>
    <td>2021-04-01</td>
    <td><a href="https://scholia.toolforge.org/Q107473785">The SARS-CoV-2 and other human coronavirus spike proteins are fine-tuned towards temperature and proteases of the human airways</a> (<a href="http://www.wikidata.org/entity/Q107473785">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PPAT.1009500">10.1371/JOURNAL.PPAT.1009500</a></td>
  </tr>
  <tr>
    <td>2021-04-01</td>
    <td><a href="https://scholia.toolforge.org/Q106452259">Crystallographic molecular replacement using an in silico-generated search model of SARS-CoV-2 ORF8</a> (<a href="http://www.wikidata.org/entity/Q106452259">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/PRO.4050">10.1002/PRO.4050</a></td>
  </tr>
  <tr>
    <td>2021-04-01</td>
    <td><a href="https://scholia.toolforge.org/Q106452275">The ORF8 protein of SARS-CoV-2 induced endoplasmic reticulum stress and mediated immune evasion by antagonizing production of interferon beta</a> (<a href="http://www.wikidata.org/entity/Q106452275">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.VIRUSRES.2021.198350">10.1016/J.VIRUSRES.2021.198350</a></td>
  </tr>
  <tr>
    <td>2021-03-29</td>
    <td><a href="https://scholia.toolforge.org/Q107112190">SARS-CoV-2 Nsp16 activation mechanism and a cryptic pocket with pan-coronavirus antiviral potential</a> (<a href="http://www.wikidata.org/entity/Q107112190">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BPJ.2021.03.024">10.1016/J.BPJ.2021.03.024</a></td>
  </tr>
  <tr>
    <td>2021-03-29</td>
    <td><a href="https://scholia.toolforge.org/Q106513651">Multivalent binding of the partially disordered SARS-CoV-2 nucleocapsid phosphoprotein dimer to RNA</a> (<a href="http://www.wikidata.org/entity/Q106513651">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BPJ.2021.03.023">10.1016/J.BPJ.2021.03.023</a></td>
  </tr>
  <tr>
    <td>2021-03-29</td>
    <td><a href="https://scholia.toolforge.org/Q107112189">The SARS-CoV-2 nucleocapsid protein is dynamic, disordered, and phase separates with RNA</a> (<a href="http://www.wikidata.org/entity/Q107112189">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-021-21953-3">10.1038/S41467-021-21953-3</a></td>
  </tr>
  <tr>
    <td>2021-03-27</td>
    <td><a href="https://scholia.toolforge.org/Q108502694">Cathepsin L plays a key role in SARS-CoV-2 infection in humans and humanized mice and is a promising target for new drug development</a> (<a href="http://www.wikidata.org/entity/Q108502694">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41392-021-00558-8">10.1038/S41392-021-00558-8</a></td>
  </tr>
  <tr>
    <td>2021-03-27</td>
    <td><a href="https://scholia.toolforge.org/Q107981572">The nucleotide addition cycle of the SARS-CoV-2 polymerase</a> (<a href="http://www.wikidata.org/entity/Q107981572">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.03.27.437309">10.1101/2021.03.27.437309</a></td>
  </tr>
  <tr>
    <td>2021-03-26</td>
    <td><a href="https://scholia.toolforge.org/Q106513656">Understanding the phase separation characteristics of nucleocapsid protein provides a new therapeutic opportunity against SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q106513656">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S13238-021-00832-Z">10.1007/S13238-021-00832-Z</a></td>
  </tr>
  <tr>
    <td>2021-03-26</td>
    <td><a href="https://scholia.toolforge.org/Q106873500">SARS-CoV-2 M inhibitors with antiviral activity in a transgenic mouse model</a> (<a href="http://www.wikidata.org/entity/Q106873500">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABF1611">10.1126/SCIENCE.ABF1611</a></td>
  </tr>
  <tr>
    <td>2021-03-25</td>
    <td><a href="https://scholia.toolforge.org/Q107344366">Site-Specific O-Glycosylation Analysis of SARS-CoV-2 Spike Protein Produced in Insect and Human Cells</a> (<a href="http://www.wikidata.org/entity/Q107344366">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/V13040551">10.3390/V13040551</a></td>
  </tr>
  <tr>
    <td>2021-03-25</td>
    <td><a href="https://scholia.toolforge.org/Q106453199">Characterization of SARS-CoV-2 proteins reveals Orf6 pathogenicity, subcellular localization, host interactions and attenuation by Selinexor</a> (<a href="http://www.wikidata.org/entity/Q106453199">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/S13578-021-00568-7">10.1186/S13578-021-00568-7</a></td>
  </tr>
  <tr>
    <td>2021-03-25</td>
    <td><a href="https://scholia.toolforge.org/Q106869068">Functional analysis of SARS-CoV-2 proteins in Drosophila identifies Orf6-induced pathogenic effects with Selinexor as an effective treatment</a> (<a href="http://www.wikidata.org/entity/Q106869068">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/S13578-021-00567-8">10.1186/S13578-021-00567-8</a></td>
  </tr>
  <tr>
    <td>2021-03-24</td>
    <td><a href="https://scholia.toolforge.org/Q106460582">Arginine Methylation Regulates SARS-CoV-2 Nucleocapsid Protein Function and Viral Replication</a> (<a href="http://www.wikidata.org/entity/Q106460582">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.03.24.436822">10.1101/2021.03.24.436822</a></td>
  </tr>
  <tr>
    <td>2021-03-24</td>
    <td><a href="https://scholia.toolforge.org/Q107980891">Topography, Spike Dynamics, and Nanomechanics of Individual Native SARS-CoV-2 Virions</a> (<a href="http://www.wikidata.org/entity/Q107980891">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.NANOLETT.0C04465">10.1021/ACS.NANOLETT.0C04465</a></td>
  </tr>
  <tr>
    <td>2021-03-23</td>
    <td><a href="https://scholia.toolforge.org/Q106451921">SARS-CoV-2 variants lacking ORF8 occurred in farmed mink and pangolin</a> (<a href="http://www.wikidata.org/entity/Q106451921">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.GENE.2021.145596">10.1016/J.GENE.2021.145596</a></td>
  </tr>
  <tr>
    <td>2021-03-19</td>
    <td><a href="https://scholia.toolforge.org/Q107334999">Mass spectrometric based detection of protein nucleotidylation in the RNA polymerase of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q107334999">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S42004-021-00476-4">10.1038/S42004-021-00476-4</a></td>
  </tr>
  <tr>
    <td>2021-03-18</td>
    <td><a href="https://scholia.toolforge.org/Q107272537">Sialic acid-Dependent Binding and Viral Entry of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q107272537">edit</a>)</td>
    <td><a href="https://doi.org/10.21203/RS.3.RS-318912/V1">10.21203/RS.3.RS-318912/V1</a></td>
  </tr>
  <tr>
    <td>2021-03-18</td>
    <td><a href="https://scholia.toolforge.org/Q107980425">Identification of guanylyltransferase activity in the SARS-CoV-2 RNA polymerase</a> (<a href="http://www.wikidata.org/entity/Q107980425">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.03.17.435913">10.1101/2021.03.17.435913</a></td>
  </tr>
  <tr>
    <td>2021-03-16</td>
    <td><a href="https://scholia.toolforge.org/Q107324942">Ca-dependent mechanism of membrane insertion and destabilization by the SARS-CoV-2 fusion peptide</a> (<a href="http://www.wikidata.org/entity/Q107324942">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BPJ.2021.02.023">10.1016/J.BPJ.2021.02.023</a></td>
  </tr>
  <tr>
    <td>2021-03-15</td>
    <td><a href="https://scholia.toolforge.org/Q106452637">Unique and complementary suppression of cGAS-STING and RNA sensing- triggered innate immune responses by SARS-CoV-2 proteins</a> (<a href="http://www.wikidata.org/entity/Q106452637">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41392-021-00515-5">10.1038/S41392-021-00515-5</a></td>
  </tr>
  <tr>
    <td>2021-03-15</td>
    <td><a href="https://scholia.toolforge.org/Q106452685">SARS-CoV-2 Nsp8 N-terminal domain dimerizes and harbors autonomously folded elements</a> (<a href="http://www.wikidata.org/entity/Q106452685">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.03.12.435186">10.1101/2021.03.12.435186</a></td>
  </tr>
  <tr>
    <td>2021-03-15</td>
    <td><a href="https://scholia.toolforge.org/Q106452707">Structure, Mechanism and Crystallographic fragment screening of the SARS-CoV-2 NSP13 helicase</a> (<a href="http://www.wikidata.org/entity/Q106452707">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.03.15.435326">10.1101/2021.03.15.435326</a></td>
  </tr>
  <tr>
    <td>2021-03-12</td>
    <td><a href="https://scholia.toolforge.org/Q107338321">Contribution of SARS-CoV-2 accessory proteins to viral pathogenicity in K18 hACE2 transgenic mice</a> (<a href="http://www.wikidata.org/entity/Q107338321">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.03.09.434696">10.1101/2021.03.09.434696</a></td>
  </tr>
  <tr>
    <td>2021-03-11</td>
    <td><a href="https://scholia.toolforge.org/Q107366099">New targets for drug design: importance of nsp14/nsp10 complex formation for the 3'-5' exoribonucleolytic activity on SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q107366099">edit</a>)</td>
    <td><a href="https://doi.org/10.1111/FEBS.15815">10.1111/FEBS.15815</a></td>
  </tr>
  <tr>
    <td>2021-03-11</td>
    <td><a href="https://scholia.toolforge.org/Q106452214">Immunoinformatic analysis of structural and epitope variations in the spike and Orf8 proteins of SARS-CoV-2/B.1.1.7</a> (<a href="http://www.wikidata.org/entity/Q106452214">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td>2021-03-10</td>
    <td><a href="https://scholia.toolforge.org/Q107076646">Comprehensive mapping of mutations in the SARS-CoV-2 receptor-binding domain that affect recognition by polyclonal human plasma antibodies</a> (<a href="http://www.wikidata.org/entity/Q107076646">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CHOM.2021.02.003">10.1016/J.CHOM.2021.02.003</a></td>
  </tr>
  <tr>
    <td>2021-03-10</td>
    <td><a href="https://scholia.toolforge.org/Q106624669">Genomic monitoring of SARS-CoV-2 uncovers an Nsp1 deletion variant that modulates type I interferon response</a> (<a href="http://www.wikidata.org/entity/Q106624669">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CHOM.2021.01.015">10.1016/J.CHOM.2021.01.015</a></td>
  </tr>
  <tr>
    <td>2021-03-08</td>
    <td><a href="https://scholia.toolforge.org/Q108396430">Genome-wide CRISPR screening identifies TMEM106B as a proviral host factor for SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q108396430">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41588-021-00805-2">10.1038/S41588-021-00805-2</a></td>
  </tr>
  <tr>
    <td>2021-03-05</td>
    <td><a href="https://scholia.toolforge.org/Q106513551">Inhibition of amyloid formation of the Nucleoprotein of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q106513551">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.03.05.434000">10.1101/2021.03.05.434000</a></td>
  </tr>
  <tr>
    <td>2021-03-05</td>
    <td><a href="https://scholia.toolforge.org/Q108084285">RNA-dependent RNA polymerase (RdRp) inhibitors: The current landscape and repurposing for the COVID-19 pandemic</a> (<a href="http://www.wikidata.org/entity/Q108084285">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.EJMECH.2021.113201">10.1016/J.EJMECH.2021.113201</a></td>
  </tr>
  <tr>
    <td>2021-03-03</td>
    <td><a href="https://scholia.toolforge.org/Q108105033">Heterogeneity of Glycan Processing on Trimeric SARS-CoV-2 Spike Protein Revealed by Charge Detection Mass Spectrometry</a> (<a href="http://www.wikidata.org/entity/Q108105033">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/JACS.1C00353">10.1021/JACS.1C00353</a></td>
  </tr>
  <tr>
    <td>2021-03-02</td>
    <td><a href="https://scholia.toolforge.org/Q106624228">SARS-CoV-2 Nucleocapsid Protein Targets RIG-I-Like Receptor Pathways to Inhibit the Induction of Interferon Response</a> (<a href="http://www.wikidata.org/entity/Q106624228">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/CELLS10030530">10.3390/CELLS10030530</a></td>
  </tr>
  <tr>
    <td>2021-03-01</td>
    <td><a href="https://scholia.toolforge.org/Q106873452">Dual inhibition of SARS-CoV-2 and human rhinovirus with protease inhibitors in clinical development</a> (<a href="http://www.wikidata.org/entity/Q106873452">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ANTIVIRAL.2021.105020">10.1016/J.ANTIVIRAL.2021.105020</a></td>
  </tr>
  <tr>
    <td>2021-03-01</td>
    <td><a href="https://scholia.toolforge.org/Q107348969">Structural O-Glycoform Heterogeneity of the SARS-CoV-2 Spike Protein Receptor-Binding Domain Revealed by Native Top-Down Mass Spectrometry</a> (<a href="http://www.wikidata.org/entity/Q107348969">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.02.28.433291">10.1101/2021.02.28.433291</a></td>
  </tr>
  <tr>
    <td>2021-03-01</td>
    <td><a href="https://scholia.toolforge.org/Q106453384">Ubiquitination of SARS-CoV-2 ORF7a promotes antagonism of interferon response</a> (<a href="http://www.wikidata.org/entity/Q106453384">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41423-020-00603-6">10.1038/S41423-020-00603-6</a></td>
  </tr>
  <tr>
    <td>2021-03-01</td>
    <td><a href="https://scholia.toolforge.org/Q106453400">Structural insight reveals SARS-CoV-2 ORF7a as an immunomodulating factor for human CD14+ monocytes</a> (<a href="http://www.wikidata.org/entity/Q106453400">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ISCI.2021.102187">10.1016/J.ISCI.2021.102187</a></td>
  </tr>
  <tr>
    <td>2021-03-01</td>
    <td><a href="https://scholia.toolforge.org/Q107138031">Hallmarks of Alpha- and Betacoronavirus non-structural protein 7+8 complexes</a> (<a href="http://www.wikidata.org/entity/Q107138031">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIADV.ABF1004">10.1126/SCIADV.ABF1004</a></td>
  </tr>
  <tr>
    <td>2021-02-28</td>
    <td><a href="https://scholia.toolforge.org/Q107473502">TMPRSS11D and TMPRSS13 Activate the SARS-CoV-2 Spike Protein</a> (<a href="http://www.wikidata.org/entity/Q107473502">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/V13030384">10.3390/V13030384</a></td>
  </tr>
  <tr>
    <td>2021-02-26</td>
    <td><a href="https://scholia.toolforge.org/Q106452777">SARS-CoV-2 nsp12 attenuates type I interferon production by inhibiting IRF3 nuclear translocation</a> (<a href="http://www.wikidata.org/entity/Q106452777">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41423-020-00619-Y">10.1038/S41423-020-00619-Y</a></td>
  </tr>
  <tr>
    <td>2021-02-24</td>
    <td><a href="https://scholia.toolforge.org/Q106452919">A Biochemical Perspective of the Nonstructural Proteins (NSPs) and the Spike Protein of SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q106452919">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S10930-021-09967-8">10.1007/S10930-021-09967-8</a></td>
  </tr>
  <tr>
    <td>2021-02-24</td>
    <td><a href="https://scholia.toolforge.org/Q106460514">SARS-CoV-2 genomic surveillance identifies naturally occurring truncations of ORF7a that limit immune suppression</a> (<a href="http://www.wikidata.org/entity/Q106460514">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.02.22.21252253">10.1101/2021.02.22.21252253</a></td>
  </tr>
  <tr>
    <td>2021-02-24</td>
    <td><a href="https://scholia.toolforge.org/Q106623525">SARS-CoV-2 ORF6 disturbs nucleocytoplasmic trafficking to advance the viral replication</a> (<a href="http://www.wikidata.org/entity/Q106623525">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.02.24.432656">10.1101/2021.02.24.432656</a></td>
  </tr>
  <tr>
    <td>2021-02-23</td>
    <td><a href="https://scholia.toolforge.org/Q106453350">The proximal proteome of 17 SARS-CoV-2 proteins links to disrupted antiviral signaling and host translation</a> (<a href="http://www.wikidata.org/entity/Q106453350">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.02.23.432450">10.1101/2021.02.23.432450</a></td>
  </tr>
  <tr>
    <td>2021-02-22</td>
    <td><a href="https://scholia.toolforge.org/Q106513775">Identification and functional analysis of the SARS-COV-2 nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q106513775">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/S12866-021-02107-3">10.1186/S12866-021-02107-3</a></td>
  </tr>
  <tr>
    <td>2021-02-22</td>
    <td><a href="https://scholia.toolforge.org/Q107338320">ORF3a of the COVID-19 virus SARS-CoV-2 blocks HOPS complex-mediated assembly of the SNARE complex required for autolysosome formation</a> (<a href="http://www.wikidata.org/entity/Q107338320">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.DEVCEL.2020.12.010">10.1016/J.DEVCEL.2020.12.010</a></td>
  </tr>
  <tr>
    <td>2021-02-18</td>
    <td><a href="https://scholia.toolforge.org/Q106452498">SARS-CoV-2 nucleocapsid protein dually regulates innate immune responses</a> (<a href="http://www.wikidata.org/entity/Q106452498">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.02.17.431755">10.1101/2021.02.17.431755</a></td>
  </tr>
  <tr>
    <td>2021-02-18</td>
    <td><a href="https://scholia.toolforge.org/Q108395844">Direct activation of endothelial cells by SARS-CoV-2 nucleocapsid protein is blocked by Simvastatin</a> (<a href="http://www.wikidata.org/entity/Q108395844">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.02.14.431174">10.1101/2021.02.14.431174</a></td>
  </tr>
  <tr>
    <td>2021-02-12</td>
    <td><a href="https://scholia.toolforge.org/Q107392243">Proteolytic Activation of SARS-CoV-2 Spike at the S1/S2 Boundary: Potential Role of Proteases beyond Furin</a> (<a href="http://www.wikidata.org/entity/Q107392243">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSINFECDIS.0C00701">10.1021/ACSINFECDIS.0C00701</a></td>
  </tr>
  <tr>
    <td>2021-02-11</td>
    <td><a href="https://scholia.toolforge.org/Q106936198">Identification of ebselen and its analogues as potent covalent inhibitors of papain-like protease from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q106936198">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41598-021-83229-6">10.1038/S41598-021-83229-6</a></td>
  </tr>
  <tr>
    <td>2021-02-11</td>
    <td><a href="https://scholia.toolforge.org/Q106464750">A genome-wide CRISPR screen identifies host factors that regulate SARS-CoV-2 entry</a> (<a href="http://www.wikidata.org/entity/Q106464750">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-021-21213-4">10.1038/S41467-021-21213-4</a></td>
  </tr>
  <tr>
    <td>2021-02-09</td>
    <td><a href="https://scholia.toolforge.org/Q107100897">Tipiracil binds to uridine site and inhibits Nsp15 endoribonuclease NendoU from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q107100897">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S42003-021-01735-9">10.1038/S42003-021-01735-9</a></td>
  </tr>
  <tr>
    <td>2021-02-09</td>
    <td><a href="https://scholia.toolforge.org/Q106460575">Energetic and structural features of SARS-CoV-2 N-protein co-assemblies with nucleic acids</a> (<a href="http://www.wikidata.org/entity/Q106460575">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.02.08.430344">10.1101/2021.02.08.430344</a></td>
  </tr>
  <tr>
    <td>2021-02-09</td>
    <td><a href="https://scholia.toolforge.org/Q107343678">Coronavirus replication-transcription complex: Vital and selective NMPylation of a conserved site in nsp9 by the NiRAN-RdRp subunit</a> (<a href="http://www.wikidata.org/entity/Q107343678">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.2022310118">10.1073/PNAS.2022310118</a></td>
  </tr>
  <tr>
    <td>2021-02-09</td>
    <td><a href="https://scholia.toolforge.org/Q107111791">Dynamic competition between SARS-CoV-2 NSP1 and mRNA on the human ribosome inhibits translation initiation</a> (<a href="http://www.wikidata.org/entity/Q107111791">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.2017715118">10.1073/PNAS.2017715118</a></td>
  </tr>
  <tr>
    <td>2021-02-08</td>
    <td><a href="https://scholia.toolforge.org/Q107473204">SARS-CoV-2 S protein:ACE2 interaction reveals novel allosteric targets</a> (<a href="http://www.wikidata.org/entity/Q107473204">edit</a>)</td>
    <td><a href="https://doi.org/10.7554/ELIFE.63646">10.7554/ELIFE.63646</a></td>
  </tr>
  <tr>
    <td>2021-02-07</td>
    <td><a href="https://scholia.toolforge.org/Q106452240">Targeting CTP Synthetase 1 to Restore Interferon Induction and Impede Nucleotide Synthesis in SARS-CoV-2 Infection</a> (<a href="http://www.wikidata.org/entity/Q106452240">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.02.05.429959">10.1101/2021.02.05.429959</a></td>
  </tr>
  <tr>
    <td>2021-02-05</td>
    <td><a href="https://scholia.toolforge.org/Q106599505">Protein glycosylation is essential for SARS-CoV-2 infection</a> (<a href="http://www.wikidata.org/entity/Q106599505">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.02.05.429940">10.1101/2021.02.05.429940</a></td>
  </tr>
  <tr>
    <td>2021-02-05</td>
    <td><a href="https://scholia.toolforge.org/Q106460519">SARS-CoV-2 ORF7b: is a bat virus protein homologue a major cause of COVID-19 symptoms?</a> (<a href="http://www.wikidata.org/entity/Q106460519">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.02.05.428650">10.1101/2021.02.05.428650</a></td>
  </tr>
  <tr>
    <td>2021-02-04</td>
    <td><a href="https://scholia.toolforge.org/Q106599770">Targeted in situ cross-linking mass spectrometry and integrative modeling reveal the architectures of Nsp1, Nsp2, and Nucleocapsid proteins from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q106599770">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.02.04.429751">10.1101/2021.02.04.429751</a></td>
  </tr>
  <tr>
    <td>2021-02-02</td>
    <td><a href="https://scholia.toolforge.org/Q107011723">Structure of papain-like protease from SARS-CoV-2 and its complexes with non-covalent inhibitors</a> (<a href="http://www.wikidata.org/entity/Q107011723">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-021-21060-3">10.1038/S41467-021-21060-3</a></td>
  </tr>
  <tr>
    <td>2021-02-02</td>
    <td><a href="https://scholia.toolforge.org/Q106453043">Mechanisms of Coronavirus Nsp1-Mediated Control of Host and Viral Gene Expression</a> (<a href="http://www.wikidata.org/entity/Q106453043">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/CELLS10020300">10.3390/CELLS10020300</a></td>
  </tr>
  <tr>
    <td>2021-02-01</td>
    <td><a href="https://scholia.toolforge.org/Q106453017">Mn2+ coordinates Cap-0-RNA to align substrates for efficient 2′-O-methyl transfer by SARS-CoV-2 nsp16</a> (<a href="http://www.wikidata.org/entity/Q106453017">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.01.31.429023">10.1101/2021.01.31.429023</a></td>
  </tr>
  <tr>
    <td>2021-02-01</td>
    <td><a href="https://scholia.toolforge.org/Q107179974">SARS-CoV-2 spike protein S1 subunit induces pro-inflammatory responses via toll-like receptor 4 signaling in murine and human macrophages</a> (<a href="http://www.wikidata.org/entity/Q107179974">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.HELIYON.2021.E06187">10.1016/J.HELIYON.2021.E06187</a></td>
  </tr>
  <tr>
    <td>2021-02-01</td>
    <td><a href="https://scholia.toolforge.org/Q107349084">Multimerization- and glycosylation-dependent receptor binding of SARS-CoV-2 spike proteins</a> (<a href="http://www.wikidata.org/entity/Q107349084">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PPAT.1009282">10.1371/JOURNAL.PPAT.1009282</a></td>
  </tr>
  <tr>
    <td>2021-02-01</td>
    <td><a href="https://scholia.toolforge.org/Q107367992">Cold sensitivity of the SARS-CoV-2 spike ectodomain</a> (<a href="http://www.wikidata.org/entity/Q107367992">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41594-020-00547-5">10.1038/S41594-020-00547-5</a></td>
  </tr>
  <tr>
    <td>2021-02-01</td>
    <td><a href="https://scholia.toolforge.org/Q106460748">SARS-CoV-2 ORF9b inhibits RIG-I-MAVS antiviral signaling by interrupting K63-linked ubiquitination of NEMO</a> (<a href="http://www.wikidata.org/entity/Q106460748">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELREP.2021.108761">10.1016/J.CELREP.2021.108761</a></td>
  </tr>
  <tr>
    <td>2021-02-01</td>
    <td><a href="https://scholia.toolforge.org/Q106452482">Nsp1 protein of SARS-CoV-2 disrupts the mRNA export machinery to inhibit host gene expression</a> (<a href="http://www.wikidata.org/entity/Q106452482">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIADV.ABE7386">10.1126/SCIADV.ABE7386</a></td>
  </tr>
  <tr>
    <td>2021-02-01</td>
    <td><a href="https://scholia.toolforge.org/Q107203059">Structural Basis of SARS-CoV-2 Polymerase Inhibition by Favipiravir</a> (<a href="http://www.wikidata.org/entity/Q107203059">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.XINN.2021.100080">10.1016/J.XINN.2021.100080</a></td>
  </tr>
  <tr>
    <td>2021-01-28</td>
    <td><a href="https://scholia.toolforge.org/Q106873492">A small molecule compound with an indole moiety inhibits the main protease of SARS-CoV-2 and blocks virus replication</a> (<a href="http://www.wikidata.org/entity/Q106873492">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-021-20900-6">10.1038/S41467-021-20900-6</a></td>
  </tr>
  <tr>
    <td>2021-01-27</td>
    <td><a href="https://scholia.toolforge.org/Q107113558">Cryo-EM structures of the SARS-CoV-2 endoribonuclease Nsp15 reveal insight into nuclease specificity and dynamics</a> (<a href="http://www.wikidata.org/entity/Q107113558">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-020-20608-Z">10.1038/S41467-020-20608-Z</a></td>
  </tr>
  <tr>
    <td>2021-01-25</td>
    <td><a href="https://scholia.toolforge.org/Q105098704">Loss of furin cleavage site attenuates SARS-CoV-2 pathogenesis</a> (<a href="http://www.wikidata.org/entity/Q105098704">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-021-03237-4">10.1038/S41586-021-03237-4</a></td>
  </tr>
  <tr>
    <td>2021-01-21</td>
    <td><a href="https://scholia.toolforge.org/Q106464141">SARS-CoV-2 nucleocapsid protein undergoes liquid-liquid phase separation into stress granules through its N-terminal intrinsically disordered region</a> (<a href="http://www.wikidata.org/entity/Q106464141">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41421-020-00240-3">10.1038/S41421-020-00240-3</a></td>
  </tr>
  <tr>
    <td>2021-01-21</td>
    <td><a href="https://scholia.toolforge.org/Q106464730">The SARS-CoV-2 nucleocapsid phosphoprotein forms mutually exclusive condensates with RNA and the membrane-associated M protein</a> (<a href="http://www.wikidata.org/entity/Q106464730">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-020-20768-Y">10.1038/S41467-020-20768-Y</a></td>
  </tr>
  <tr>
    <td>2021-01-20</td>
    <td><a href="https://scholia.toolforge.org/Q106996591">The complex structure of GRL0617 and SARS-CoV-2 PLpro reveals a hot spot for antiviral drug discovery</a> (<a href="http://www.wikidata.org/entity/Q106996591">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-020-20718-8">10.1038/S41467-020-20718-8</a></td>
  </tr>
  <tr>
    <td>2021-01-18</td>
    <td><a href="https://scholia.toolforge.org/Q107349299">Fluorescent Glycan Fingerprinting of SARS2 Spike Proteins</a> (<a href="http://www.wikidata.org/entity/Q107349299">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.01.16.426965">10.1101/2021.01.16.426965</a></td>
  </tr>
  <tr>
    <td>2021-01-12</td>
    <td><a href="https://scholia.toolforge.org/Q106513672">Structural Insight Into the SARS-CoV-2 Nucleocapsid Protein C-Terminal Domain Reveals a Novel Recognition Mechanism for Viral Transcriptional Regulatory Sequences</a> (<a href="http://www.wikidata.org/entity/Q106513672">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FCHEM.2020.624765">10.3389/FCHEM.2020.624765</a></td>
  </tr>
  <tr>
    <td>2021-01-12</td>
    <td><a href="https://scholia.toolforge.org/Q107073747">Snake venom phospholipases A2 possess a strong virucidal activity against SARS-CoV-2 in vitro and block the cell fusion mediated by spike glycoprotein interaction with the ACE2 receptor</a> (<a href="http://www.wikidata.org/entity/Q107073747">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.01.12.426042">10.1101/2021.01.12.426042</a></td>
  </tr>
  <tr>
    <td>2021-01-12</td>
    <td><a href="https://scholia.toolforge.org/Q107366772">Characterization of the SARS-CoV-2 S Protein: Biophysical, Biochemical, Structural, and Antigenic Analysis</a> (<a href="http://www.wikidata.org/entity/Q107366772">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSOMEGA.0C03512">10.1021/ACSOMEGA.0C03512</a></td>
  </tr>
  <tr>
    <td>2021-01-11</td>
    <td><a href="https://scholia.toolforge.org/Q107073639">No evidence for basigin/CD147 as a direct SARS-CoV-2 spike binding receptor</a> (<a href="http://www.wikidata.org/entity/Q107073639">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41598-020-80464-1">10.1038/S41598-020-80464-1</a></td>
  </tr>
  <tr>
    <td>2021-01-11</td>
    <td><a href="https://scholia.toolforge.org/Q107367864">Stabilizing the closed SARS-CoV-2 spike trimer</a> (<a href="http://www.wikidata.org/entity/Q107367864">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-020-20321-X">10.1038/S41467-020-20321-X</a></td>
  </tr>
  <tr>
    <td>2021-01-11</td>
    <td><a href="https://scholia.toolforge.org/Q106464795">Functional Analysis of SARS-CoV-2 Proteins in Drosophila Identifies Orf6-induced Pathogenicity Attenuated by Selinexor</a> (<a href="http://www.wikidata.org/entity/Q106464795">edit</a>)</td>
    <td><a href="https://doi.org/10.21203/RS.3.RS-141269/V1">10.21203/RS.3.RS-141269/V1</a></td>
  </tr>
  <tr>
    <td>2021-01-08</td>
    <td><a href="https://scholia.toolforge.org/Q107073621">AXL is a candidate receptor for SARS-CoV-2 that promotes infection of pulmonary and bronchial epithelial cells</a> (<a href="http://www.wikidata.org/entity/Q107073621">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41422-020-00460-Y">10.1038/S41422-020-00460-Y</a></td>
  </tr>
  <tr>
    <td>2021-01-07</td>
    <td><a href="https://scholia.toolforge.org/Q107075962">New targets for drug design: Importance of nsp14/nsp10 complex formation for the 3’-5’ exoribonucleolytic activity on SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q107075962">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2021.01.07.425745">10.1101/2021.01.07.425745</a></td>
  </tr>
  <tr>
    <td>2021-01-06</td>
    <td><a href="https://scholia.toolforge.org/Q104754984">N- and O-Glycosylation of the SARS-CoV-2 Spike Protein</a> (<a href="http://www.wikidata.org/entity/Q104754984">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.ANALCHEM.0C03173">10.1021/ACS.ANALCHEM.0C03173</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q108685109">SARS-CoV-2 main protease suppresses type I interferon production by preventing nuclear translocation of phosphorylated IRF3</a> (<a href="http://www.wikidata.org/entity/Q108685109">edit</a>)</td>
    <td><a href="https://doi.org/10.7150/IJBS.59943">10.7150/IJBS.59943</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q106464739">SARS-CoV-2 nucleocapsid protein phase separates with G3BPs to disassemble stress granules and facilitate viral production</a> (<a href="http://www.wikidata.org/entity/Q106464739">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.SCIB.2021.01.013">10.1016/J.SCIB.2021.01.013</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q107072776">Human Surfactant Protein D Binds Spike Protein and Acts as an Entry Inhibitor of SARS-CoV-2 Pseudotyped Viral Particles</a> (<a href="http://www.wikidata.org/entity/Q107072776">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FIMMU.2021.641360">10.3389/FIMMU.2021.641360</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q107108504">Furin cleavage of SARS-CoV-2 Spike promotes but is not essential for infection and cell-cell fusion</a> (<a href="http://www.wikidata.org/entity/Q107108504">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PPAT.1009246">10.1371/JOURNAL.PPAT.1009246</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q107108641">The Case for S2: The Potential Benefits of the S2 Subunit of the SARS-CoV-2 Spike Protein as an Immunogen in Fighting the COVID-19 Pandemic</a> (<a href="http://www.wikidata.org/entity/Q107108641">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FIMMU.2021.637651">10.3389/FIMMU.2021.637651</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q107349422">Glycans of SARS-CoV-2 Spike Protein in Virus Infection and Antibody Production</a> (<a href="http://www.wikidata.org/entity/Q107349422">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FMOLB.2021.629873">10.3389/FMOLB.2021.629873</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q107376911">Heparan Sulfate Facilitates Spike Protein-Mediated SARS-CoV-2 Host Cell Invasion and Contributes to Increased Infection of SARS-CoV-2 G614 Mutant and in Lung Cancer</a> (<a href="http://www.wikidata.org/entity/Q107376911">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FMOLB.2021.649575">10.3389/FMOLB.2021.649575</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q107377123">SARS-CoV-2 Spike Protein Induces Degradation of Junctional Proteins That Maintain Endothelial Barrier Integrity</a> (<a href="http://www.wikidata.org/entity/Q107377123">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FCVM.2021.687783">10.3389/FCVM.2021.687783</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q107473262">SARS-CoV-2 variants with mutations at the S1/S2 cleavage site are generated in vitro during propagation in TMPRSS2-deficient cells</a> (<a href="http://www.wikidata.org/entity/Q107473262">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PPAT.1009233">10.1371/JOURNAL.PPAT.1009233</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q108105083">ORF3a-Mediated Incomplete Autophagy Facilitates Severe Acute Respiratory Syndrome Coronavirus-2 Replication</a> (<a href="http://www.wikidata.org/entity/Q108105083">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FCELL.2021.716208">10.3389/FCELL.2021.716208</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q108402698">SARS-CoV-2 Membrane Protein Inhibits Type I Interferon Production Through Ubiquitin-Mediated Degradation of TBK1</a> (<a href="http://www.wikidata.org/entity/Q108402698">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FIMMU.2021.662989">10.3389/FIMMU.2021.662989</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q108503196">The Importance of Glycosylation in COVID-19 Infection</a> (<a href="http://www.wikidata.org/entity/Q108503196">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/978-3-030-70115-4_12">10.1007/978-3-030-70115-4_12</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q104470996">Overexpression of SARS-CoV-2 protein ORF6 dislocates RAE1 and NUP98 from the nuclear pore complex</a> (<a href="http://www.wikidata.org/entity/Q104470996">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBRC.2020.11.115">10.1016/J.BBRC.2020.11.115</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q106452010">The Functional Classification of ORF8 in SARS-CoV-2 Replication, Immune Evasion, and Viral Pathogenesis Inferred through Phylogenetic Profiling</a> (<a href="http://www.wikidata.org/entity/Q106452010">edit</a>)</td>
    <td><a href="https://doi.org/10.1177/11769343211003079">10.1177/11769343211003079</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q107377022">SARS-CoV-2 ORF8 Forms Intracellular Aggregates and Inhibits IFNγ-Induced Antiviral Gene Expression in Human Lung Epithelial Cells</a> (<a href="http://www.wikidata.org/entity/Q107377022">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FIMMU.2021.679482">10.3389/FIMMU.2021.679482</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q107389701">Structure of SARS-CoV-2 ORF8, a rapidly evolving immune evasion protein</a> (<a href="http://www.wikidata.org/entity/Q107389701">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.2021785118">10.1073/PNAS.2021785118</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q107547969">RIG-I-Like Receptor-Mediated Recognition of Viral Genomic RNA of Severe Acute Respiratory Syndrome Coronavirus-2 and Viral Escape From the Host Innate Immune Responses</a> (<a href="http://www.wikidata.org/entity/Q107547969">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FIMMU.2021.700926">10.3389/FIMMU.2021.700926</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q108503531">SARS-CoV-2 Accessory Protein ORF7b Mediates Tumor Necrosis Factor-α-Induced Apoptosis in Cells</a> (<a href="http://www.wikidata.org/entity/Q108503531">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FMICB.2021.654709">10.3389/FMICB.2021.654709</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q108739582">Structural Analysis of SARS-CoV-2 ORF8 Protein: Pathogenic and Therapeutic Implications</a> (<a href="http://www.wikidata.org/entity/Q108739582">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FGENE.2021.693227">10.3389/FGENE.2021.693227</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q107341671">SARS-CoV-2 NSP1 C-terminal (residues 131–180) is an intrinsically disordered region in isolation</a> (<a href="http://www.wikidata.org/entity/Q107341671">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CRVIRO.2021.100007">10.1016/J.CRVIRO.2021.100007</a></td>
  </tr>
  <tr>
    <td>2021-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q107343984">SARS-CoV-2 viral proteins NSP1 and NSP13 inhibit interferon activation through distinct mechanisms</a> (<a href="http://www.wikidata.org/entity/Q107343984">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PONE.0253089">10.1371/JOURNAL.PONE.0253089</a></td>
  </tr>
  <tr>
    <td>2020-12-31</td>
    <td><a href="https://scholia.toolforge.org/Q104649867">A novel virtual screening procedure identifies Pralatrexate as inhibitor of SARS-CoV-2 RdRp and it reduces viral replication in vitro</a> (<a href="http://www.wikidata.org/entity/Q104649867">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PCBI.1008489">10.1371/JOURNAL.PCBI.1008489</a></td>
  </tr>
  <tr>
    <td>2020-12-30</td>
    <td><a href="https://scholia.toolforge.org/Q104743310">SARS-CoV-2 Nucleocapsid Protein Interacts with RIG-I and Represses RIG-Mediated IFN-β Production</a> (<a href="http://www.wikidata.org/entity/Q104743310">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/V13010047">10.3390/V13010047</a></td>
  </tr>
  <tr>
    <td>2020-12-29</td>
    <td><a href="https://scholia.toolforge.org/Q104610691">SARS-CoV-2 proteases PLpro and 3CLpro cleave IRF3 and critical modulators of inflammatory pathways (NLRP12 and TAB1): implications for disease presentation across species</a> (<a href="http://www.wikidata.org/entity/Q104610691">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1870414">10.1080/22221751.2020.1870414</a></td>
  </tr>
  <tr>
    <td>2020-12-28</td>
    <td><a href="https://scholia.toolforge.org/Q106624678">Severe acute respiratory syndrome coronavirus 2 (SARS-CoV-2) membrane (M) protein inhibits type I and III interferon production by targeting RIG-I/MDA-5 signaling</a> (<a href="http://www.wikidata.org/entity/Q106624678">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41392-020-00438-7">10.1038/S41392-020-00438-7</a></td>
  </tr>
  <tr>
    <td>2020-12-26</td>
    <td><a href="https://scholia.toolforge.org/Q104799886">D614G Mutation Alters SARS-CoV-2 Spike Conformation and Enhances Protease Cleavage at the S1/S2 Junction</a> (<a href="http://www.wikidata.org/entity/Q104799886">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELREP.2020.108630">10.1016/J.CELREP.2020.108630</a></td>
  </tr>
  <tr>
    <td>2020-12-26</td>
    <td><a href="https://scholia.toolforge.org/Q107341977">Genomic diversity of SARS-CoV-2 can be accelerated by a mutation in the nsp14 gene</a> (<a href="http://www.wikidata.org/entity/Q107341977">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.12.23.424231">10.1101/2020.12.23.424231</a></td>
  </tr>
  <tr>
    <td>2020-12-23</td>
    <td><a href="https://scholia.toolforge.org/Q104582419">Heparin Inhibits Cellular Invasion by SARS-CoV-2: Structural Dependence of the Interaction of the Spike S1 Receptor-Binding Domain with Heparin</a> (<a href="http://www.wikidata.org/entity/Q104582419">edit</a>)</td>
    <td><a href="https://doi.org/10.1055/S-0040-1721319">10.1055/S-0040-1721319</a></td>
  </tr>
  <tr>
    <td>2020-12-23</td>
    <td><a href="https://scholia.toolforge.org/Q107272540">Host Cell Proteases Drive Early or Late SARS-CoV-2 Penetration</a> (<a href="http://www.wikidata.org/entity/Q107272540">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.12.22.423906">10.1101/2020.12.22.423906</a></td>
  </tr>
  <tr>
    <td>2020-12-20</td>
    <td><a href="https://scholia.toolforge.org/Q107982184">Implications of Spike-glycoprotein processing at S1/S2 by Furin, at S2’ by Furin and/or TMPRSS2 and shedding of ACE2: cell-to-cell fusion, cell entry and infectivity of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q107982184">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.12.18.423106">10.1101/2020.12.18.423106</a></td>
  </tr>
  <tr>
    <td>2020-12-16</td>
    <td><a href="https://scholia.toolforge.org/Q108503345">The S1 protein of SARS-CoV-2 crosses the blood–brain barrier in mice</a> (<a href="http://www.wikidata.org/entity/Q108503345">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41593-020-00771-8">10.1038/S41593-020-00771-8</a></td>
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
    <td>2020-12-11</td>
    <td><a href="https://scholia.toolforge.org/Q104457732">Spike glycoprotein and host cell determinants of SARS-CoV-2 entry and cytopathic effects</a> (<a href="http://www.wikidata.org/entity/Q104457732">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.02304-20">10.1128/JVI.02304-20</a></td>
  </tr>
  <tr>
    <td>2020-12-10</td>
    <td><a href="https://scholia.toolforge.org/Q104489374">SARS-CoV-2 Nsp16 activation mechanism and a cryptic pocket with pan-coronavirus antiviral potential</a> (<a href="http://www.wikidata.org/entity/Q104489374">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.12.10.420109">10.1101/2020.12.10.420109</a></td>
  </tr>
  <tr>
    <td>2020-12-10</td>
    <td><a href="https://scholia.toolforge.org/Q104267297">The SARS-CoV-2 ORF10 is not essential in vitro or in vivo in humans</a> (<a href="http://www.wikidata.org/entity/Q104267297">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PPAT.1008959">10.1371/JOURNAL.PPAT.1008959</a></td>
  </tr>
  <tr>
    <td>2020-12-09</td>
    <td><a href="https://scholia.toolforge.org/Q107112192">Real-Time Conformational Dynamics of SARS-CoV-2 Spikes on Virus Particles</a> (<a href="http://www.wikidata.org/entity/Q107112192">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CHOM.2020.11.001">10.1016/J.CHOM.2020.11.001</a></td>
  </tr>
  <tr>
    <td>2020-12-09</td>
    <td><a href="https://scholia.toolforge.org/Q104289599">Ritonavir may inhibit exoribonuclease activity of nsp14 from the SARS-CoV-2 virus and potentiate the activity of chain terminating drugs</a> (<a href="http://www.wikidata.org/entity/Q104289599">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.IJBIOMAC.2020.12.038">10.1016/J.IJBIOMAC.2020.12.038</a></td>
  </tr>
  <tr>
    <td>2020-12-07</td>
    <td><a href="https://scholia.toolforge.org/Q104105347">SARS-CoV-2 spike protein promotes IL-6 trans-signaling by activation of angiotensin II receptor signaling in epithelial cells</a> (<a href="http://www.wikidata.org/entity/Q104105347">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PPAT.1009128">10.1371/JOURNAL.PPAT.1009128</a></td>
  </tr>
  <tr>
    <td>2020-12-07</td>
    <td><a href="https://scholia.toolforge.org/Q104438055">Spike Protein of SARS-CoV-2 Activates Macrophages and Contributes to Induction of Acute Lung Inflammations in Mice</a> (<a href="http://www.wikidata.org/entity/Q104438055">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.12.07.414706">10.1101/2020.12.07.414706</a></td>
  </tr>
  <tr>
    <td>2020-12-07</td>
    <td><a href="https://scholia.toolforge.org/Q104105325">Infection of human Nasal Epithelial Cells with SARS-CoV-2 and a 382-nt deletion isolate lacking ORF8 reveals similar viral kinetics and host transcriptional profiles</a> (<a href="http://www.wikidata.org/entity/Q104105325">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PPAT.1009130">10.1371/JOURNAL.PPAT.1009130</a></td>
  </tr>
  <tr>
    <td>2020-12-07</td>
    <td><a href="https://scholia.toolforge.org/Q104472826">Structural characterization of Nonstructural protein 1 from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104472826">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ISCI.2020.101903">10.1016/J.ISCI.2020.101903</a></td>
  </tr>
  <tr>
    <td>2020-12-04</td>
    <td><a href="https://scholia.toolforge.org/Q104073053">Conformational dynamics of SARS-CoV-2 trimeric spike glycoprotein in complex with receptor ACE2 revealed by cryo-EM</a> (<a href="http://www.wikidata.org/entity/Q104073053">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIADV.ABE5575">10.1126/SCIADV.ABE5575</a></td>
  </tr>
  <tr>
    <td>2020-12-03</td>
    <td><a href="https://scholia.toolforge.org/Q104058096"><sup>1</sup>H, <sup>13</sup>C, and <sup>15</sup>N backbone chemical shift assignments of the C-terminal dimerization domain of SARS-CoV-2 nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q104058096">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S12104-020-09995-Y">10.1007/S12104-020-09995-Y</a></td>
  </tr>
  <tr>
    <td>2020-12-02</td>
    <td><a href="https://scholia.toolforge.org/Q103828986">Structural basis of RNA recognition by the SARS-CoV-2 nucleocapsid phosphoprotein</a> (<a href="http://www.wikidata.org/entity/Q103828986">edit</a>)</td>
    <td><a href="https://doi.org/10.1371/JOURNAL.PPAT.1009100">10.1371/JOURNAL.PPAT.1009100</a></td>
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
    <td>2020-12-01</td>
    <td><a href="https://scholia.toolforge.org/Q98195228">Flavonoids with inhibitory activity against SARS-CoV-2 3CLpro</a> (<a href="http://www.wikidata.org/entity/Q98195228">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/14756366.2020.1801672">10.1080/14756366.2020.1801672</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q103035724">Phosphoregulation of Phase Separation by the SARS-CoV-2 N Protein Suggests a Biophysical Basis for its Dual Functions</a> (<a href="http://www.wikidata.org/entity/Q103035724">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.MOLCEL.2020.11.025">10.1016/J.MOLCEL.2020.11.025</a></td>
  </tr>
  <tr>
    <td>2020-11-20</td>
    <td><a href="https://scholia.toolforge.org/Q104072377">Dual ELISA using SARS-CoV-2 nucleocapsid protein produced in E. coli and CHO cells reveals epitope masking by N-glycosylation</a> (<a href="http://www.wikidata.org/entity/Q104072377">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBRC.2020.11.060">10.1016/J.BBRC.2020.11.060</a></td>
  </tr>
  <tr>
    <td>2020-11-20</td>
    <td><a href="https://scholia.toolforge.org/Q102220619">1H, 13C, and 15N backbone and side chain chemical shift assignments of the SARS-CoV-2 non-structural protein 7</a> (<a href="http://www.wikidata.org/entity/Q102220619">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S12104-020-09985-0">10.1007/S12104-020-09985-0</a></td>
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
    <td>2020-11-18</td>
    <td><a href="https://scholia.toolforge.org/Q102152136">Architecture of a SARS-CoV-2 mini replication and transcription complex</a> (<a href="http://www.wikidata.org/entity/Q102152136">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-020-19770-1">10.1038/S41467-020-19770-1</a></td>
  </tr>
  <tr>
    <td>2020-11-17</td>
    <td><a href="https://scholia.toolforge.org/Q102131196">SARS-CoV-2 nucleocapsid protein phase-separates with RNA and with human hnRNPs</a> (<a href="http://www.wikidata.org/entity/Q102131196">edit</a>)</td>
    <td><a href="https://doi.org/10.15252/EMBJ.2020106478">10.15252/EMBJ.2020106478</a></td>
  </tr>
  <tr>
    <td>2020-11-17</td>
    <td><a href="https://scholia.toolforge.org/Q104060380">Cryo-EM Structures of SARS-CoV-2 Spike without and with ACE2 Reveal a pH-Dependent Switch to Mediate Endosomal Positioning of Receptor-Binding Domains</a> (<a href="http://www.wikidata.org/entity/Q104060380">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CHOM.2020.11.004">10.1016/J.CHOM.2020.11.004</a></td>
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
    <td>2020-11-13</td>
    <td><a href="https://scholia.toolforge.org/Q102056152">Targeting SARS-CoV-2 Proteases and Polymerase for COVID-19 Treatment: State of the Art and Future Opportunities</a> (<a href="http://www.wikidata.org/entity/Q102056152">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.JMEDCHEM.0C01140">10.1021/ACS.JMEDCHEM.0C01140</a></td>
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
    <td>2020-11-06</td>
    <td><a href="https://scholia.toolforge.org/Q101409652">The SARS-CoV-2 conserved macrodomain is a mono-ADP-ribosylhydrolase</a> (<a href="http://www.wikidata.org/entity/Q101409652">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.01969-20">10.1128/JVI.01969-20</a></td>
  </tr>
  <tr>
    <td>2020-11-05</td>
    <td><a href="https://scholia.toolforge.org/Q108396537">The N-terminal domain of spike glycoprotein mediates SARS-CoV-2 infection by associating with L-SIGN and DC-SIGN</a> (<a href="http://www.wikidata.org/entity/Q108396537">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.11.05.369264">10.1101/2020.11.05.369264</a></td>
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
    <td>2020-11-04</td>
    <td><a href="https://scholia.toolforge.org/Q106624719">Heparan sulfate assists SARS-CoV-2 in cell entry and can be targeted by approved drugs in vitro</a> (<a href="http://www.wikidata.org/entity/Q106624719">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41421-020-00222-5">10.1038/S41421-020-00222-5</a></td>
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
    <td>2020-10-28</td>
    <td><a href="https://scholia.toolforge.org/Q101051273">Identification of SARS-CoV-2 entry inhibitors among already approved drugs</a> (<a href="http://www.wikidata.org/entity/Q101051273">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41401-020-00556-6">10.1038/S41401-020-00556-6</a></td>
  </tr>
  <tr>
    <td>2020-10-28</td>
    <td><a href="https://scholia.toolforge.org/Q101041993">Binding mechanism and structural insights into the identified protein target of COVID-19 and importin-α with in-vitro effective drug ivermectin</a> (<a href="http://www.wikidata.org/entity/Q101041993">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1839564">10.1080/07391102.2020.1839564</a></td>
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
    <td>2020-10-27</td>
    <td><a href="https://scholia.toolforge.org/Q107203058">Remdesivir targets a structurally analogous region of the Ebola virus and SARS-CoV-2 polymerases</a> (<a href="http://www.wikidata.org/entity/Q107203058">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.2012294117">10.1073/PNAS.2012294117</a></td>
  </tr>
  <tr>
    <td>2020-10-26</td>
    <td><a href="https://scholia.toolforge.org/Q106460832">Characterization and structural prediction of the putative ORF10 protein in SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q106460832">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.26.355784">10.1101/2020.10.26.355784</a></td>
  </tr>
  <tr>
    <td>2020-10-23</td>
    <td><a href="https://scholia.toolforge.org/Q104502003">SARS-CoV-2 Nucleocapsid protein attenuates stress granule formation and alters gene expression via direct interaction with host mRNAs</a> (<a href="http://www.wikidata.org/entity/Q104502003">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.23.342113">10.1101/2020.10.23.342113</a></td>
  </tr>
  <tr>
    <td>2020-10-23</td>
    <td><a href="https://scholia.toolforge.org/Q108396468">Transferrin receptor is another receptor for SARS-CoV-2 entry</a> (<a href="http://www.wikidata.org/entity/Q108396468">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.23.350348">10.1101/2020.10.23.350348</a></td>
  </tr>
  <tr>
    <td>2020-10-22</td>
    <td><a href="https://scholia.toolforge.org/Q101235429">The SARS-CoV-2 Spike Glycoprotein as a Drug and Vaccine Target: Structural Insights into Its Complexes with ACE2 and Antibodies</a> (<a href="http://www.wikidata.org/entity/Q101235429">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/CELLS9112343">10.3390/CELLS9112343</a></td>
  </tr>
  <tr>
    <td>2020-10-21</td>
    <td><a href="https://scholia.toolforge.org/Q107344139">Structural Characterization of N‐Linked Glycans in the Receptor Binding Domain of the SARS‐CoV‐2 Spike Protein and their Interactions with Human Lectins</a> (<a href="http://www.wikidata.org/entity/Q107344139">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/ANGE.202011015">10.1002/ANGE.202011015</a></td>
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
    <td>2020-10-19</td>
    <td><a href="https://scholia.toolforge.org/Q100736867">Site-specific N-glycosylation Characterization of Recombinant SARS-CoV-2 Spike Proteins</a> (<a href="http://www.wikidata.org/entity/Q100736867">edit</a>)</td>
    <td><a href="https://doi.org/10.1074/MCP.RA120.002295">10.1074/MCP.RA120.002295</a></td>
  </tr>
  <tr>
    <td>2020-10-16</td>
    <td><a href="https://scholia.toolforge.org/Q100693199">Activity profiling and crystal structures of inhibitor-bound SARS-CoV-2 papain-like protease: A framework for anti-COVID-19 drug design</a> (<a href="http://www.wikidata.org/entity/Q100693199">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIADV.ABD4596">10.1126/SCIADV.ABD4596</a></td>
  </tr>
  <tr>
    <td>2020-10-16</td>
    <td><a href="https://scholia.toolforge.org/Q100675925">Comprehensive Analysis of the Glycan Complement of SARS-CoV-2 Spike Proteins Using Signature Ions-Triggered Electron-Transfer/Higher-Energy Collisional Dissociation (EThcD) Mass Spectrometry</a> (<a href="http://www.wikidata.org/entity/Q100675925">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.ANALCHEM.0C03301">10.1021/ACS.ANALCHEM.0C03301</a></td>
  </tr>
  <tr>
    <td>2020-10-16</td>
    <td><a href="https://scholia.toolforge.org/Q107367016">Decline of Humoral Responses against SARS-CoV-2 Spike in Convalescent Individuals</a> (<a href="http://www.wikidata.org/entity/Q107367016">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/MBIO.02590-20">10.1128/MBIO.02590-20</a></td>
  </tr>
  <tr>
    <td>2020-10-15</td>
    <td><a href="https://scholia.toolforge.org/Q104527803">A high throughput RNA displacement assay for screening SARS-CoV-2 nsp10-nsp16 complex towards developing therapeutics for COVID-19</a> (<a href="http://www.wikidata.org/entity/Q104527803">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.14.340034">10.1101/2020.10.14.340034</a></td>
  </tr>
  <tr>
    <td>2020-10-15</td>
    <td><a href="https://scholia.toolforge.org/Q100629811">Comparative host-coronavirus protein interaction networks reveal pan-viral disease mechanisms</a> (<a href="http://www.wikidata.org/entity/Q100629811">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABE9403">10.1126/SCIENCE.ABE9403</a></td>
  </tr>
  <tr>
    <td>2020-10-15</td>
    <td><a href="https://scholia.toolforge.org/Q107203054">The Strand-biased Transcription of SARS-CoV-2 and Unbalanced Inhibition by Remdesivir</a> (<a href="http://www.wikidata.org/entity/Q107203054">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.15.325050">10.1101/2020.10.15.325050</a></td>
  </tr>
  <tr>
    <td>2020-10-14</td>
    <td><a href="https://scholia.toolforge.org/Q100568455">The Architecture of Inactivated SARS-CoV-2 with Postfusion Spikes Revealed by Cryo-EM and Cryo-ET</a> (<a href="http://www.wikidata.org/entity/Q100568455">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.STR.2020.10.001">10.1016/J.STR.2020.10.001</a></td>
  </tr>
  <tr>
    <td>2020-10-14</td>
    <td><a href="https://scholia.toolforge.org/Q104439879">The viral protein NSP1 acts as a ribosome gatekeeper for shutting down host translation and fostering SARS-CoV-2 translation</a> (<a href="http://www.wikidata.org/entity/Q104439879">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.14.339515">10.1101/2020.10.14.339515</a></td>
  </tr>
  <tr>
    <td>2020-10-14</td>
    <td><a href="https://scholia.toolforge.org/Q100536136">Discovery of COVID-19 Inhibitors Targeting the SARS-CoV-2 Nsp13 Helicase</a> (<a href="http://www.wikidata.org/entity/Q100536136">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.JPCLETT.0C02421">10.1021/ACS.JPCLETT.0C02421</a></td>
  </tr>
  <tr>
    <td>2020-10-13</td>
    <td><a href="https://scholia.toolforge.org/Q100534347">Syncytia formation by SARS-CoV-2 infected cells</a> (<a href="http://www.wikidata.org/entity/Q100534347">edit</a>)</td>
    <td><a href="https://doi.org/10.15252/EMBJ.2020106267">10.15252/EMBJ.2020106267</a></td>
  </tr>
  <tr>
    <td>2020-10-12</td>
    <td><a href="https://scholia.toolforge.org/Q104522379">Understanding the phase separation characteristics of nucleocapsid protein provides a new therapeutic opportunity against SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104522379">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.09.332734">10.1101/2020.10.09.332734</a></td>
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
    <td>2020-10-11</td>
    <td><a href="https://scholia.toolforge.org/Q100541243">The SARS-CoV-2 spike protein alters barrier function in 2D static and 3D microfluidic in-vitro models of the human blood-brain barrier</a> (<a href="http://www.wikidata.org/entity/Q100541243">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.NBD.2020.105131">10.1016/J.NBD.2020.105131</a></td>
  </tr>
  <tr>
    <td>2020-10-10</td>
    <td><a href="https://scholia.toolforge.org/Q100728608">Identification of novel mutations in the methyltransferase complex (Nsp10-Nsp16) of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q100728608">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBREP.2020.100833">10.1016/J.BBREP.2020.100833</a></td>
  </tr>
  <tr>
    <td>2020-10-09</td>
    <td><a href="https://scholia.toolforge.org/Q100512481">An aberrant STAT pathway is central to COVID-19</a> (<a href="http://www.wikidata.org/entity/Q100512481">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41418-020-00633-7">10.1038/S41418-020-00633-7</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q100490995">Metallodrug ranitidine bismuth citrate suppresses SARS-CoV-2 replication and relieves virus-associated pneumonia in Syrian hamsters</a> (<a href="http://www.wikidata.org/entity/Q100490995">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41564-020-00802-X">10.1038/S41564-020-00802-X</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q100463964">Main protease of SARS-CoV-2 serves as a bifunctional molecule in restricting type I interferon antiviral signaling</a> (<a href="http://www.wikidata.org/entity/Q100463964">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41392-020-00332-2">10.1038/S41392-020-00332-2</a></td>
  </tr>
  <tr>
    <td>2020-10-06</td>
    <td><a href="https://scholia.toolforge.org/Q104502092">Autoproteolytic Products of the SARS-CoV-2 Nucleocapsid Protein are Primed for Antibody Evasion and Virus Proliferation</a> (<a href="http://www.wikidata.org/entity/Q104502092">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.10.06.328112">10.1101/2020.10.06.328112</a></td>
  </tr>
  <tr>
    <td>2020-10-03</td>
    <td><a href="https://scholia.toolforge.org/Q100514896">High-resolution structure and biophysical characterization of the nucleocapsid phosphoprotein dimerization domain from the Covid-19 severe acute respiratory syndrome coronavirus 2</a> (<a href="http://www.wikidata.org/entity/Q100514896">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBRC.2020.09.131">10.1016/J.BBRC.2020.09.131</a></td>
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
    <td>2020-10-01</td>
    <td><a href="https://scholia.toolforge.org/Q104502027">Lost in deletion: The enigmatic ORF8 protein of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104502027">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBRC.2020.10.045">10.1016/J.BBRC.2020.10.045</a></td>
  </tr>
  <tr>
    <td>2020-09-30</td>
    <td><a href="https://scholia.toolforge.org/Q106873636">The furin cleavage site of SARS-CoV-2 spike protein is a key determinant for transmission due to enhanced replication in airway cells</a> (<a href="http://www.wikidata.org/entity/Q106873636">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.30.318311">10.1101/2020.09.30.318311</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q106464380">Crystal Structure of NSP15 Endoribonuclease from SARS CoV-2 in the Complex with Uridine-3',5'-Diphosphate</a> (<a href="http://www.wikidata.org/entity/Q106464380">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB7K1O/PDB">10.2210/PDB7K1O/PDB</a></td>
  </tr>
  <tr>
    <td>2020-09-23</td>
    <td><a href="https://scholia.toolforge.org/Q101210696">Beyond Shielding: The Roles of Glycans in the SARS-CoV-2 Spike Protein</a> (<a href="http://www.wikidata.org/entity/Q101210696">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSCENTSCI.0C01056">10.1021/ACSCENTSCI.0C01056</a></td>
  </tr>
  <tr>
    <td>2020-09-23</td>
    <td><a href="https://scholia.toolforge.org/Q103837470">The SARS-COV-2 Spike Protein Binds Sialic Acids and Enables Rapid Detection in a Lateral Flow Point of Care Diagnostic Device</a> (<a href="http://www.wikidata.org/entity/Q103837470">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSCENTSCI.0C00855">10.1021/ACSCENTSCI.0C00855</a></td>
  </tr>
  <tr>
    <td>2020-09-23</td>
    <td><a href="https://scholia.toolforge.org/Q99612569">Insights into the biased activity of dextromethorphan and haloperidol towards SARS-CoV-2 NSP6: in silico binding mechanistic analysis</a> (<a href="http://www.wikidata.org/entity/Q99612569">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S00109-020-01980-1">10.1007/S00109-020-01980-1</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q99568416">Structural, biophysical and biochemical elucidation of the SARS-CoV-2 nonstructural protein 3 macro domain</a> (<a href="http://www.wikidata.org/entity/Q99568416">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSINFECDIS.0C00441">10.1021/ACSINFECDIS.0C00441</a></td>
  </tr>
  <tr>
    <td>2020-09-18</td>
    <td><a href="https://scholia.toolforge.org/Q99566670">Cholesterol 25-Hydroxylase inhibits SARS-CoV-2 and coronaviruses by depleting membrane cholesterol</a> (<a href="http://www.wikidata.org/entity/Q99566670">edit</a>)</td>
    <td><a href="https://doi.org/10.15252/EMBJ.2020106057">10.15252/EMBJ.2020106057</a></td>
  </tr>
  <tr>
    <td>2020-09-18</td>
    <td><a href="https://scholia.toolforge.org/Q100387986">KIM-1/TIM-1 is a Receptor for SARS-CoV-2 in Lung and Kidney</a> (<a href="http://www.wikidata.org/entity/Q100387986">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.16.20190694">10.1101/2020.09.16.20190694</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q104502252">SARS-CoV-2 protein Nsp1 alters actomyosin cytoskeleton and phenocopies arrhythmogenic cardiomyopathy-related PKP2 mutant</a> (<a href="http://www.wikidata.org/entity/Q104502252">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.14.296178">10.1101/2020.09.14.296178</a></td>
  </tr>
  <tr>
    <td>2020-09-16</td>
    <td><a href="https://scholia.toolforge.org/Q99557062">The enzymatic activity of the nsp14 exoribonuclease is critical for replication of MERS-CoV and SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q99557062">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.01246-20">10.1128/JVI.01246-20</a></td>
  </tr>
  <tr>
    <td>2020-09-15</td>
    <td><a href="https://scholia.toolforge.org/Q99580286">SARS-CoV-2 N protein antagonizes type I interferon signaling by suppressing phosphorylation and nuclear translocation of STAT1 and STAT2</a> (<a href="http://www.wikidata.org/entity/Q99580286">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41421-020-00208-3">10.1038/S41421-020-00208-3</a></td>
  </tr>
  <tr>
    <td>2020-09-14</td>
    <td><a href="https://scholia.toolforge.org/Q100387952">SARS CoV-2 nucleocapsid protein forms condensates with viral genomic RNA</a> (<a href="http://www.wikidata.org/entity/Q100387952">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.14.295824">10.1101/2020.09.14.295824</a></td>
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
    <td>2020-09-13</td>
    <td><a href="https://scholia.toolforge.org/Q99552324">Real-time conformational dynamics of SARS-CoV-2 spikes on virus particles</a> (<a href="http://www.wikidata.org/entity/Q99552324">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.10.286948">10.1101/2020.09.10.286948</a></td>
  </tr>
  <tr>
    <td>2020-09-11</td>
    <td><a href="https://scholia.toolforge.org/Q106624115">A COVID-19 antibody curbs SARS-CoV-2 nucleocapsid protein-induced complement hyper-activation</a> (<a href="http://www.wikidata.org/entity/Q106624115">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.10.292318">10.1101/2020.09.10.292318</a></td>
  </tr>
  <tr>
    <td>2020-09-11</td>
    <td><a href="https://scholia.toolforge.org/Q99354950">Structural characterization of the N-linked glycans in the receptor binding domain of the SARS-CoV-2 spike protein and their interactions with human lectins using NMR spectroscopy</a> (<a href="http://www.wikidata.org/entity/Q99354950">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/ANIE.202011015">10.1002/ANIE.202011015</a></td>
  </tr>
  <tr>
    <td>2020-09-11</td>
    <td><a href="https://scholia.toolforge.org/Q104451368">SARS-CoV-2 NSP1 C-terminal region (residues 130-180) is an intrinsically disordered region</a> (<a href="http://www.wikidata.org/entity/Q104451368">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.10.290932">10.1101/2020.09.10.290932</a></td>
  </tr>
  <tr>
    <td>2020-09-09</td>
    <td><a href="https://scholia.toolforge.org/Q99245666">Repurposing of FDA-Approved Toremifene to Treat COVID-19 by blocking the spike glycoprotein and NSP14 of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q99245666">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACS.JPROTEOME.0C00397">10.1021/ACS.JPROTEOME.0C00397</a></td>
  </tr>
  <tr>
    <td>2020-09-09</td>
    <td><a href="https://scholia.toolforge.org/Q106624457">Interaction network of SARS-CoV-2 with host receptome through spike protein</a> (<a href="http://www.wikidata.org/entity/Q106624457">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.09.287508">10.1101/2020.09.09.287508</a></td>
  </tr>
  <tr>
    <td>2020-09-09</td>
    <td><a href="https://scholia.toolforge.org/Q99212334">SARS-CoV-2 envelope protein topology in eukaryotic membranes</a> (<a href="http://www.wikidata.org/entity/Q99212334">edit</a>)</td>
    <td><a href="https://doi.org/10.1098/RSOB.200209">10.1098/RSOB.200209</a></td>
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
    <td>2020-09-06</td>
    <td><a href="https://scholia.toolforge.org/Q99732182">Molecular Architecture of the SARS-CoV-2 Virus</a> (<a href="http://www.wikidata.org/entity/Q99732182">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.09.018">10.1016/J.CELL.2020.09.018</a></td>
  </tr>
  <tr>
    <td>2020-09-04</td>
    <td><a href="https://scholia.toolforge.org/Q98948556">Identification of promising antiviral drug candidates against non-structural protein 15 (NSP15) from SARS-CoV-2: an in silico assisted drug-repurposing study</a> (<a href="http://www.wikidata.org/entity/Q98948556">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1814870">10.1080/07391102.2020.1814870</a></td>
  </tr>
  <tr>
    <td>2020-09-04</td>
    <td><a href="https://scholia.toolforge.org/Q98951985">Both Boceprevir and GC376 efficaciously inhibit SARS-CoV-2 by targeting its main protease</a> (<a href="http://www.wikidata.org/entity/Q98951985">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-020-18233-X">10.1038/S41467-020-18233-X</a></td>
  </tr>
  <tr>
    <td>2020-09-04</td>
    <td><a href="https://scholia.toolforge.org/Q99209249">Evaluation of SARS-CoV-2 3C-like protease inhibitors using self-assembled monolayer desorption ionization mass spectrometry</a> (<a href="http://www.wikidata.org/entity/Q99209249">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ANTIVIRAL.2020.104924">10.1016/J.ANTIVIRAL.2020.104924</a></td>
  </tr>
  <tr>
    <td>2020-09-04</td>
    <td><a href="https://scholia.toolforge.org/Q100661107">Identification of SARS-CoV-2 3CL Protease Inhibitors by a Quantitative High-Throughput Screening</a> (<a href="http://www.wikidata.org/entity/Q100661107">edit</a>)</td>
    <td><a href="https://doi.org/10.1021/ACSPTSCI.0C00108">10.1021/ACSPTSCI.0C00108</a></td>
  </tr>
  <tr>
    <td>2020-09-04</td>
    <td><a href="https://scholia.toolforge.org/Q98951512">SARS-CoV-2 binds platelet ACE2 to enhance thrombosis in COVID-19</a> (<a href="http://www.wikidata.org/entity/Q98951512">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/S13045-020-00954-7">10.1186/S13045-020-00954-7</a></td>
  </tr>
  <tr>
    <td>2020-09-04</td>
    <td><a href="https://scholia.toolforge.org/Q106626599">Multimerization- and glycosylation-dependent receptor binding of SARS-CoV-2 spike proteins</a> (<a href="http://www.wikidata.org/entity/Q106626599">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.09.04.282558">10.1101/2020.09.04.282558</a></td>
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
    <td>2020-09-03</td>
    <td><a href="https://scholia.toolforge.org/Q99202166">Improved binding of SARS-CoV-2 Envelope protein to tight junction-associated PALS1 could play a key role in COVID-19 pathogenesis</a> (<a href="http://www.wikidata.org/entity/Q99202166">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.MICINF.2020.08.006">10.1016/J.MICINF.2020.08.006</a></td>
  </tr>
  <tr>
    <td>2020-09-02</td>
    <td><a href="https://scholia.toolforge.org/Q99207905">Crystal structure of SARS-CoV-2 papain-like protease</a> (<a href="http://www.wikidata.org/entity/Q99207905">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.APSB.2020.08.014">10.1016/J.APSB.2020.08.014</a></td>
  </tr>
  <tr>
    <td>2020-09-02</td>
    <td><a href="https://scholia.toolforge.org/Q98902486">Direct activation of the alternative complement pathway by SARS-CoV-2 spike proteins is blocked by factor D inhibition</a> (<a href="http://www.wikidata.org/entity/Q98902486">edit</a>)</td>
    <td><a href="https://doi.org/10.1182/BLOOD.2020008248">10.1182/BLOOD.2020008248</a></td>
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
    <td>2020-08-30</td>
    <td><a href="https://scholia.toolforge.org/Q99239943">Mass Spectrometry Analysis of Newly Emerging Coronavirus HCoV-19 Spike Protein and Human ACE2 Reveals Camouflaging Glycans and Unique Post-Translational Modifications</a> (<a href="http://www.wikidata.org/entity/Q99239943">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ENG.2020.07.014">10.1016/J.ENG.2020.07.014</a></td>
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
    <td>2020-08-27</td>
    <td><a href="https://scholia.toolforge.org/Q99637401">Structure of SARS-CoV-2 ORF8, a rapidly evolving coronavirus protein implicated in immune evasion</a> (<a href="http://www.wikidata.org/entity/Q99637401">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.27.270637">10.1101/2020.08.27.270637</a></td>
  </tr>
  <tr>
    <td>2020-08-26</td>
    <td><a href="https://scholia.toolforge.org/Q104533834">Room Temperature Structure of SARS-CoV-2 Nsp10/Nsp16 Methyltransferase in a Complex with m7GpppA Cap-0 and SAM Determined by Fixed-Target Serial Crystallography</a> (<a href="http://www.wikidata.org/entity/Q104533834">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB7JPE/PDB">10.2210/PDB7JPE/PDB</a></td>
  </tr>
  <tr>
    <td>2020-08-26</td>
    <td><a href="https://scholia.toolforge.org/Q98729346">Mechanism and inhibition of the papain-like protease, PLpro, of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q98729346">edit</a>)</td>
    <td><a href="https://doi.org/10.15252/EMBJ.2020106275">10.15252/EMBJ.2020106275</a></td>
  </tr>
  <tr>
    <td>2020-08-26</td>
    <td><a href="https://scholia.toolforge.org/Q104533802">Crystal Structure of SARS-CoV-2 NSP7-NSP8 complex</a> (<a href="http://www.wikidata.org/entity/Q104533802">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB7JLT/PDB">10.2210/PDB7JLT/PDB</a></td>
  </tr>
  <tr>
    <td>2020-08-25</td>
    <td><a href="https://scholia.toolforge.org/Q106874032">The S1/S2 boundary of SARS-CoV-2 spike protein modulates cell entry pathways and transmission</a> (<a href="http://www.wikidata.org/entity/Q106874032">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.25.266775">10.1101/2020.08.25.266775</a></td>
  </tr>
  <tr>
    <td>2020-08-24</td>
    <td><a href="https://scholia.toolforge.org/Q104523307">The SARS-CoV-2 Envelope and Membrane proteins modulate maturation and retention of the Spike protein, allowing optimal formation of VLPs in presence of Nucleoprotein</a> (<a href="http://www.wikidata.org/entity/Q104523307">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.24.260901">10.1101/2020.08.24.260901</a></td>
  </tr>
  <tr>
    <td>2020-08-24</td>
    <td><a href="https://scholia.toolforge.org/Q106464129">Dynamics of the N-terminal domain of SARS-CoV-2 nucleocapsid protein drives dsRNA melting in a counterintuitive tweezer-like mechanism</a> (<a href="http://www.wikidata.org/entity/Q106464129">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.24.264465">10.1101/2020.08.24.264465</a></td>
  </tr>
  <tr>
    <td>2020-08-24</td>
    <td><a href="https://scholia.toolforge.org/Q98720918">Virus-Receptor Interactions of Glycosylated SARS-CoV-2 Spike and Human ACE2 Receptor</a> (<a href="http://www.wikidata.org/entity/Q98720918">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CHOM.2020.08.004">10.1016/J.CHOM.2020.08.004</a></td>
  </tr>
  <tr>
    <td>2020-08-24</td>
    <td><a href="https://scholia.toolforge.org/Q99637393">SARS-CoV-2 Spike protein co-opts VEGF-A/Neuropilin-1 receptor signaling to induce analgesia</a> (<a href="http://www.wikidata.org/entity/Q99637393">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.17.209288">10.1101/2020.07.17.209288</a></td>
  </tr>
  <tr>
    <td>2020-08-24</td>
    <td><a href="https://scholia.toolforge.org/Q106873999">Pathogenicity, immunogenicity, and protective ability of an attenuated SARS-CoV-2 variant with a deletion at the S1/S2 junction of the spike protein</a> (<a href="http://www.wikidata.org/entity/Q106873999">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.24.264192">10.1101/2020.08.24.264192</a></td>
  </tr>
  <tr>
    <td>2020-08-21</td>
    <td><a href="https://scholia.toolforge.org/Q104439844">Dynamic competition between SARS-CoV-2 NSP1 and mRNA on the human ribosome inhibits translation initiation</a> (<a href="http://www.wikidata.org/entity/Q104439844">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.20.259770">10.1101/2020.08.20.259770</a></td>
  </tr>
  <tr>
    <td>2020-08-20</td>
    <td><a href="https://scholia.toolforge.org/Q98619960">SARS-CoV-2 ORF8 and SARS-CoV ORF8ab: Genomic Divergence and Functional Convergence</a> (<a href="http://www.wikidata.org/entity/Q98619960">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/PATHOGENS9090677">10.3390/PATHOGENS9090677</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q98575481">In situ structural analysis of SARS-CoV-2 spike reveals flexibility mediated by three hinges</a> (<a href="http://www.wikidata.org/entity/Q98575481">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABD5223">10.1126/SCIENCE.ABD5223</a></td>
  </tr>
  <tr>
    <td>2020-08-18</td>
    <td><a href="https://scholia.toolforge.org/Q98565434">Vitamin B12 may inhibit RNA-dependent-RNA polymerase activity of nsp12 from the SARS-CoV-2 virus</a> (<a href="http://www.wikidata.org/entity/Q98565434">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/IUB.2359">10.1002/IUB.2359</a></td>
  </tr>
  <tr>
    <td>2020-08-17</td>
    <td><a href="https://scholia.toolforge.org/Q98510279">Structures and distributions of SARS-CoV-2 spike proteins on intact virions</a> (<a href="http://www.wikidata.org/entity/Q98510279">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2665-2">10.1038/S41586-020-2665-2</a></td>
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
    <td>2020-08-14</td>
    <td><a href="https://scholia.toolforge.org/Q104527554">Methylation of RNA Cap in SARS-CoV-2 captured by serial crystallography</a> (<a href="http://www.wikidata.org/entity/Q104527554">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.14.251421">10.1101/2020.08.14.251421</a></td>
  </tr>
  <tr>
    <td>2020-08-14</td>
    <td><a href="https://scholia.toolforge.org/Q98577349">SRSF protein kinases 1 and 2 are essential host factors for human coronaviruses including SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q98577349">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.14.251207">10.1101/2020.08.14.251207</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q104527850">Characterisation of the SARS-CoV-2 ExoN (nsp14ExoN-nsp10) complex: implications for its role in viral genome stability and inhibitor identification</a> (<a href="http://www.wikidata.org/entity/Q104527850">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.13.248211">10.1101/2020.08.13.248211</a></td>
  </tr>
  <tr>
    <td>2020-08-13</td>
    <td><a href="https://scholia.toolforge.org/Q98629934">The use of knowledge management tools in viroinformatics. Example study of a highly conserved sequence motif in Nsp3 of SARS-CoV-2 as a therapeutic target</a> (<a href="http://www.wikidata.org/entity/Q98629934">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.COMPBIOMED.2020.103963">10.1016/J.COMPBIOMED.2020.103963</a></td>
  </tr>
  <tr>
    <td>2020-08-13</td>
    <td><a href="https://scholia.toolforge.org/Q98577448">Maraviroc inhibits SARS-CoV-2 multiplication and s-protein mediated cell fusion in cell culture</a> (<a href="http://www.wikidata.org/entity/Q98577448">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.12.246389">10.1101/2020.08.12.246389</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q98902832">Growth Factor Receptor Signaling Inhibition Prevents SARS-CoV-2 Replication</a> (<a href="http://www.wikidata.org/entity/Q98902832">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.MOLCEL.2020.08.006">10.1016/J.MOLCEL.2020.08.006</a></td>
  </tr>
  <tr>
    <td>2020-08-11</td>
    <td><a href="https://scholia.toolforge.org/Q98306790">Mutational spectra of SARS-CoV-2 orf1ab polyprotein and signature mutations in the United States of America</a> (<a href="http://www.wikidata.org/entity/Q98306790">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.26417">10.1002/JMV.26417</a></td>
  </tr>
  <tr>
    <td>2020-08-10</td>
    <td><a href="https://scholia.toolforge.org/Q98460872">Repurposing of SARS-CoV nucleocapsid protein specific nuclease resistant RNA aptamer for therapeutics against SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q98460872">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.MEEGID.2020.104497">10.1016/J.MEEGID.2020.104497</a></td>
  </tr>
  <tr>
    <td>2020-08-10</td>
    <td><a href="https://scholia.toolforge.org/Q107074014">DC/L-SIGN recognition of spike glycoprotein promotes SARS-CoV-2 trans-infection and can be inhibited by a glycomimetic antagonist</a> (<a href="http://www.wikidata.org/entity/Q107074014">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.09.242917">10.1101/2020.08.09.242917</a></td>
  </tr>
  <tr>
    <td>2020-08-10</td>
    <td><a href="https://scholia.toolforge.org/Q98577432">Discovery of COVID-19 Inhibitors Targeting the SARS-CoV2 Nsp13 Helicase</a> (<a href="http://www.wikidata.org/entity/Q98577432">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.09.243246">10.1101/2020.08.09.243246</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q98196753">Structural and functional properties of SARS-CoV-2 spike protein: potential antivirus drug development for COVID-19</a> (<a href="http://www.wikidata.org/entity/Q98196753">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41401-020-0485-4">10.1038/S41401-020-0485-4</a></td>
  </tr>
  <tr>
    <td>2020-08-03</td>
    <td><a href="https://scholia.toolforge.org/Q104439852">SARS-CoV-2 ORF6 disrupts nucleocytoplasmic transport through interactions with Rae1 and Nup98</a> (<a href="http://www.wikidata.org/entity/Q104439852">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.08.03.234559">10.1101/2020.08.03.234559</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q98194088">Antibody response against SARS-CoV-2 spike protein and nucleoprotein evaluated by 4 automated immunoassays and 3 ELISAs</a> (<a href="http://www.wikidata.org/entity/Q98194088">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CMI.2020.07.038">10.1016/J.CMI.2020.07.038</a></td>
  </tr>
  <tr>
    <td>2020-07-31</td>
    <td><a href="https://scholia.toolforge.org/Q98241597">The SARS-CoV-2 Nucleocapsid phosphoprotein forms mutually exclusive condensates with RNA and the membrane-associated M protein</a> (<a href="http://www.wikidata.org/entity/Q98241597">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.30.228023">10.1101/2020.07.30.228023</a></td>
  </tr>
  <tr>
    <td>2020-07-31</td>
    <td><a href="https://scholia.toolforge.org/Q98184357">A thermostable, closed SARS-CoV-2 spike protein trimer</a> (<a href="http://www.wikidata.org/entity/Q98184357">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41594-020-0478-5">10.1038/S41594-020-0478-5</a></td>
  </tr>
  <tr>
    <td>2020-07-31</td>
    <td><a href="https://scholia.toolforge.org/Q98241584">Force-dependent stimulation of RNA unwinding by SARS-CoV-2 nsp13 helicase</a> (<a href="http://www.wikidata.org/entity/Q98241584">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.31.231274">10.1101/2020.07.31.231274</a></td>
  </tr>
  <tr>
    <td>2020-07-30</td>
    <td><a href="https://scholia.toolforge.org/Q104502199">Substrate specificity of SARS-CoV-2 nsp10-nsp16 methyltransferase</a> (<a href="http://www.wikidata.org/entity/Q104502199">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.30.228478">10.1101/2020.07.30.228478</a></td>
  </tr>
  <tr>
    <td>2020-07-30</td>
    <td><a href="https://scholia.toolforge.org/Q98287193">Transcriptome & viral growth analysis of SARS-CoV-2-infected Vero CCL-81 cells</a> (<a href="http://www.wikidata.org/entity/Q98287193">edit</a>)</td>
    <td><a href="https://doi.org/10.4103/IJMR.IJMR_2257_20">10.4103/IJMR.IJMR_2257_20</a></td>
  </tr>
  <tr>
    <td>2020-07-30</td>
    <td><a href="https://scholia.toolforge.org/Q104469729">A dynamic regulatory interface on SARS-CoV-2 RNA polymerase</a> (<a href="http://www.wikidata.org/entity/Q104469729">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.30.229187">10.1101/2020.07.30.229187</a></td>
  </tr>
  <tr>
    <td>2020-07-29</td>
    <td><a href="https://scholia.toolforge.org/Q98164326">Crystal structure of SARS-CoV-2 nsp10/nsp16 2'-O-methylase and its implication on antiviral drug design</a> (<a href="http://www.wikidata.org/entity/Q98164326">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41392-020-00241-4">10.1038/S41392-020-00241-4</a></td>
  </tr>
  <tr>
    <td>2020-07-29</td>
    <td><a href="https://scholia.toolforge.org/Q98162461">Papain-like protease regulates SARS-CoV-2 viral spread and innate immunity</a> (<a href="http://www.wikidata.org/entity/Q98162461">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2601-5">10.1038/S41586-020-2601-5</a></td>
  </tr>
  <tr>
    <td>2020-07-29</td>
    <td><a href="https://scholia.toolforge.org/Q98164557">SARS-CoV-2 Orf9b suppresses type I interferon responses by targeting TOM70</a> (<a href="http://www.wikidata.org/entity/Q98164557">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41423-020-0514-8">10.1038/S41423-020-0514-8</a></td>
  </tr>
  <tr>
    <td>2020-07-28</td>
    <td><a href="https://scholia.toolforge.org/Q98157765">Characterisation of the transcriptome and proteome of SARS-CoV-2 reveals a cell passage induced in-frame deletion of the furin-like cleavage site from the spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q98157765">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/S13073-020-00763-0">10.1186/S13073-020-00763-0</a></td>
  </tr>
  <tr>
    <td>2020-07-28</td>
    <td><a href="https://scholia.toolforge.org/Q98388186">Structural Basis for Helicase-Polymerase Coupling in the SARS-CoV-2 Replication-Transcription Complex</a> (<a href="http://www.wikidata.org/entity/Q98388186">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.07.033">10.1016/J.CELL.2020.07.033</a></td>
  </tr>
  <tr>
    <td>2020-07-27</td>
    <td><a href="https://scholia.toolforge.org/Q104437642">Severe Acute Respiratory Syndrome Coronavirus 2 (SARS-CoV-2) Membrane (M) Protein Inhibits Type I and III Interferon Production by Targeting RIG-I/MDA-5 Signaling</a> (<a href="http://www.wikidata.org/entity/Q104437642">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.26.222026">10.1101/2020.07.26.222026</a></td>
  </tr>
  <tr>
    <td>2020-07-26</td>
    <td><a href="https://scholia.toolforge.org/Q106873607">No evidence for basigin/CD147 as a direct SARS-CoV-2 spike binding receptor</a> (<a href="http://www.wikidata.org/entity/Q106873607">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.25.221036">10.1101/2020.07.25.221036</a></td>
  </tr>
  <tr>
    <td>2020-07-24</td>
    <td><a href="https://scholia.toolforge.org/Q97692635">Structural basis of RNA cap modification by SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q97692635">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-020-17496-8">10.1038/S41467-020-17496-8</a></td>
  </tr>
  <tr>
    <td>2020-07-24</td>
    <td><a href="https://scholia.toolforge.org/Q107341575">Identification, Mapping and Relative Quantitation of SARS-CoV-2 Spike Glycopeptides by Mass-Retention Time Fingerprinting</a> (<a href="http://www.wikidata.org/entity/Q107341575">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.24.217562">10.1101/2020.07.24.217562</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q97871821">Linear B-cell epitopes in the spike and nucleocapsid proteins as markers of SARS-CoV-2 exposure and disease severity</a> (<a href="http://www.wikidata.org/entity/Q97871821">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.EBIOM.2020.102911">10.1016/J.EBIOM.2020.102911</a></td>
  </tr>
  <tr>
    <td>2020-07-22</td>
    <td><a href="https://scholia.toolforge.org/Q97652986">Controlling the SARS-CoV-2 spike glycoprotein conformation</a> (<a href="http://www.wikidata.org/entity/Q97652986">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41594-020-0479-4">10.1038/S41594-020-0479-4</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q99557903">Crystal structures of SARS-CoV-2 ADP-ribose phosphatase: from the apo form to ligand complexes</a> (<a href="http://www.wikidata.org/entity/Q99557903">edit</a>)</td>
    <td><a href="https://doi.org/10.1107/S2052252520009653">10.1107/S2052252520009653</a></td>
  </tr>
  <tr>
    <td>2020-07-17</td>
    <td><a href="https://scholia.toolforge.org/Q97587517">Cryo-EM analysis of the post-fusion structure of the SARS-CoV spike glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q97587517">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41467-020-17371-6">10.1038/S41467-020-17371-6</a></td>
  </tr>
  <tr>
    <td>2020-07-17</td>
    <td><a href="https://scholia.toolforge.org/Q98240291">Natural Polymorphisms Are Present in the Furin Cleavage Site of the SARS-CoV-2 Spike Glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q98240291">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FGENE.2020.00783">10.3389/FGENE.2020.00783</a></td>
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
    <td>2020-07-15</td>
    <td><a href="https://scholia.toolforge.org/Q97542455">A putative new SARS-CoV protein, 3c, encoded in an ORF overlapping ORF3a</a> (<a href="http://www.wikidata.org/entity/Q97542455">edit</a>)</td>
    <td><a href="https://doi.org/10.1099/JGV.0.001469">10.1099/JGV.0.001469</a></td>
  </tr>
  <tr>
    <td>2020-07-13</td>
    <td><a href="https://scholia.toolforge.org/Q97654063">Cold sensitivity of the SARS-CoV-2 spike ectodomain</a> (<a href="http://www.wikidata.org/entity/Q97654063">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.12.199588">10.1101/2020.07.12.199588</a></td>
  </tr>
  <tr>
    <td>2020-07-13</td>
    <td><a href="https://scholia.toolforge.org/Q97545168">Identification of potential drugs against SARS-CoV-2 non-structural protein 1 (nsp1)</a> (<a href="http://www.wikidata.org/entity/Q97545168">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1792992">10.1080/07391102.2020.1792992</a></td>
  </tr>
  <tr>
    <td>2020-07-13</td>
    <td><a href="https://scholia.toolforge.org/Q97531111">Structural basis for helicase-polymerase coupling in the SARS-CoV-2 replication-transcription complex</a> (<a href="http://www.wikidata.org/entity/Q97531111">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.08.194084">10.1101/2020.07.08.194084</a></td>
  </tr>
  <tr>
    <td>2020-07-12</td>
    <td><a href="https://scholia.toolforge.org/Q97558272">Architecture and self-assembly of the SARS-CoV-2 nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q97558272">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/PRO.3909">10.1002/PRO.3909</a></td>
  </tr>
  <tr>
    <td>2020-07-10</td>
    <td><a href="https://scholia.toolforge.org/Q106626802">Stabilizing the Closed SARS-CoV-2 Spike Trimer</a> (<a href="http://www.wikidata.org/entity/Q106626802">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.10.197814">10.1101/2020.07.10.197814</a></td>
  </tr>
  <tr>
    <td>2020-07-09</td>
    <td><a href="https://scholia.toolforge.org/Q104527170">Molecular architecture of the SARS-CoV-2 virus</a> (<a href="http://www.wikidata.org/entity/Q104527170">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.08.192104">10.1101/2020.07.08.192104</a></td>
  </tr>
  <tr>
    <td>2020-07-09</td>
    <td><a href="https://scholia.toolforge.org/Q97550549">Characterization of heparin and severe acute respiratory syndrome-related coronavirus 2 (SARS-CoV-2) spike glycoprotein binding interactions</a> (<a href="http://www.wikidata.org/entity/Q97550549">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.ANTIVIRAL.2020.104873">10.1016/J.ANTIVIRAL.2020.104873</a></td>
  </tr>
  <tr>
    <td>2020-07-09</td>
    <td><a href="https://scholia.toolforge.org/Q104473662">Decline of humoral responses against SARS-CoV-2 Spike in convalescent individuals</a> (<a href="http://www.wikidata.org/entity/Q104473662">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.09.194639">10.1101/2020.07.09.194639</a></td>
  </tr>
  <tr>
    <td>2020-07-08</td>
    <td><a href="https://scholia.toolforge.org/Q107366218">Room Temperature Structure of SARS-CoV-2 NSP10/NSP16 Methyltransferase in a Complex with SAM Determined by Fixed-Target Serial Crystallography</a> (<a href="http://www.wikidata.org/entity/Q107366218">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6XKM/PDB">10.2210/PDB6XKM/PDB</a></td>
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
    <td>2020-07-02</td>
    <td><a href="https://scholia.toolforge.org/Q97426440">6-Thioguanine blocks SARS-CoV-2 replication by inhibition of PLpro protease activities</a> (<a href="http://www.wikidata.org/entity/Q97426440">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.07.01.183020">10.1101/2020.07.01.183020</a></td>
  </tr>
  <tr>
    <td>2020-06-30</td>
    <td><a href="https://scholia.toolforge.org/Q97426487">Glycans on the SARS-CoV-2 Spike Control the Receptor Binding Domain Conformation</a> (<a href="http://www.wikidata.org/entity/Q97426487">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.26.173765">10.1101/2020.06.26.173765</a></td>
  </tr>
  <tr>
    <td>2020-06-30</td>
    <td><a href="https://scholia.toolforge.org/Q106626789">Conformational dynamics of SARS-CoV-2 trimeric spike glycoprotein in complex with receptor ACE2 revealed by cryo-EM</a> (<a href="http://www.wikidata.org/entity/Q106626789">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.30.177097">10.1101/2020.06.30.177097</a></td>
  </tr>
  <tr>
    <td>2020-06-29</td>
    <td><a href="https://scholia.toolforge.org/Q97426434">Phosphorylation modulates liquid-liquid phase separation of the SARS-CoV-2 N protein</a> (<a href="http://www.wikidata.org/entity/Q97426434">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.28.176248">10.1101/2020.06.28.176248</a></td>
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
    <td>2020-06-28</td>
    <td><a href="https://scholia.toolforge.org/Q97519821">The Global Phosphorylation Landscape of SARS-CoV-2 Infection</a> (<a href="http://www.wikidata.org/entity/Q97519821">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.06.034">10.1016/J.CELL.2020.06.034</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q107466984">Synthetic Heparan Sulfate Mimetic Pixatimod (PG545) Potently Inhibits SARS-CoV-2 By Disrupting The Spike-ACE2 interaction</a> (<a href="http://www.wikidata.org/entity/Q107466984">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.24.169334">10.1101/2020.06.24.169334</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q96823951">CD209L/L-SIGN and CD209/DC-SIGN act as receptors for SARS-CoV-2 and are differentially expressed in lung and kidney epithelial and endothelial cells</a> (<a href="http://www.wikidata.org/entity/Q96823951">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.22.165803">10.1101/2020.06.22.165803</a></td>
  </tr>
  <tr>
    <td>2020-06-23</td>
    <td><a href="https://scholia.toolforge.org/Q104440562">SARS-CoV-2 structure and replication characterized by in situ cryo-electron tomography</a> (<a href="http://www.wikidata.org/entity/Q104440562">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.23.167064">10.1101/2020.06.23.167064</a></td>
  </tr>
  <tr>
    <td>2020-06-23</td>
    <td><a href="https://scholia.toolforge.org/Q107473208">Biochemical evidence of furin specificity and potential for phospho-regulation at Spike protein S1/S2 cleavage site in SARS-CoV2 but not in SARS-CoV1 or MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q107473208">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.23.166900">10.1101/2020.06.23.166900</a></td>
  </tr>
  <tr>
    <td>2020-06-23</td>
    <td><a href="https://scholia.toolforge.org/Q97086727">Identification of multiple large deletions in ORF7a resulting in in-frame gene fusions in clinical SARS-CoV-2 isolates</a> (<a href="http://www.wikidata.org/entity/Q97086727">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JCV.2020.104523">10.1016/J.JCV.2020.104523</a></td>
  </tr>
  <tr>
    <td>2020-06-22</td>
    <td><a href="https://scholia.toolforge.org/Q96613613">Structure-based virtual screening and molecular dynamics simulation of SARS-CoV-2 Guanine-N7 methyltransferase (nsp14) for identifying antiviral inhibitors against COVID-19</a> (<a href="http://www.wikidata.org/entity/Q96613613">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1778535">10.1080/07391102.2020.1778535</a></td>
  </tr>
  <tr>
    <td>2020-06-20</td>
    <td><a href="https://scholia.toolforge.org/Q98627919">SARS-CoV-2 E protein is a potential ion channel that can be inhibited by Gliclazide and Memantine</a> (<a href="http://www.wikidata.org/entity/Q98627919">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBRC.2020.05.206">10.1016/J.BBRC.2020.05.206</a></td>
  </tr>
  <tr>
    <td>2020-06-19</td>
    <td><a href="https://scholia.toolforge.org/Q107011539">Mechanism and inhibition of SARS-CoV-2 PLpro</a> (<a href="http://www.wikidata.org/entity/Q107011539">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.18.160614">10.1101/2020.06.18.160614</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q96687783">The SARS-CoV-2 nucleocapsid protein is dynamic, disordered, and phase separates with RNA</a> (<a href="http://www.wikidata.org/entity/Q96687783">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.17.158121">10.1101/2020.06.17.158121</a></td>
  </tr>
  <tr>
    <td>2020-06-18</td>
    <td><a href="https://scholia.toolforge.org/Q104452150">Unexpected free fatty acid binding pocket in the cryo-EM structure of SARS-CoV-2 spike protein</a> (<a href="http://www.wikidata.org/entity/Q104452150">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.18.158584">10.1101/2020.06.18.158584</a></td>
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
    <td>2020-06-17</td>
    <td><a href="https://scholia.toolforge.org/Q104520668">Crystal structure of 2019-nCoV nsp16-nsp10 complex</a> (<a href="http://www.wikidata.org/entity/Q104520668">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB7BQ7/PDB">10.2210/PDB7BQ7/PDB</a></td>
  </tr>
  <tr>
    <td>2020-06-17</td>
    <td><a href="https://scholia.toolforge.org/Q96687815">Characterization of the SARS-CoV-2 S Protein: Biophysical, Biochemical, Structural, and Antigenic Analysis</a> (<a href="http://www.wikidata.org/entity/Q96687815">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.14.150607">10.1101/2020.06.14.150607</a></td>
  </tr>
  <tr>
    <td>2020-06-17</td>
    <td><a href="https://scholia.toolforge.org/Q104452060">A thermostable, closed, SARS-CoV-2 spike protein trimer</a> (<a href="http://www.wikidata.org/entity/Q104452060">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.15.152835">10.1101/2020.06.15.152835</a></td>
  </tr>
  <tr>
    <td>2020-06-17</td>
    <td><a href="https://scholia.toolforge.org/Q104437179">X-ray Crystallographic Structure of Orf9b from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q104437179">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6Z4U/PDB">10.2210/PDB6Z4U/PDB</a></td>
  </tr>
  <tr>
    <td>2020-06-16</td>
    <td><a href="https://scholia.toolforge.org/Q97680260">Proteasome activator PA28γ-dependent degradation of coronavirus disease (COVID-19) nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q97680260">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.BBRC.2020.06.058">10.1016/J.BBRC.2020.06.058</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q96687780">Specific viral RNA drives the SARS CoV-2 nucleocapsid to phase separate</a> (<a href="http://www.wikidata.org/entity/Q96687780">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.11.147199">10.1101/2020.06.11.147199</a></td>
  </tr>
  <tr>
    <td>2020-06-12</td>
    <td><a href="https://scholia.toolforge.org/Q96348263">The role of furin cleavage site in SARS-CoV-2 spike protein-mediated membrane fusion in the presence or absence of trypsin</a> (<a href="http://www.wikidata.org/entity/Q96348263">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41392-020-0184-0">10.1038/S41392-020-0184-0</a></td>
  </tr>
  <tr>
    <td>2020-06-12</td>
    <td><a href="https://scholia.toolforge.org/Q96687818">The D614G mutation in the SARS-CoV-2 spike protein reduces S1 shedding and increases infectivity</a> (<a href="http://www.wikidata.org/entity/Q96687818">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.12.148726">10.1101/2020.06.12.148726</a></td>
  </tr>
  <tr>
    <td>2020-06-11</td>
    <td><a href="https://scholia.toolforge.org/Q96642671">Shielding and Beyond: The Roles of Glycans in SARS-CoV-2 Spike Protein</a> (<a href="http://www.wikidata.org/entity/Q96642671">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.11.146522">10.1101/2020.06.11.146522</a></td>
  </tr>
  <tr>
    <td>2020-06-11</td>
    <td><a href="https://scholia.toolforge.org/Q96339445">Structural analysis of the putative SARS-CoV-2 primase complex</a> (<a href="http://www.wikidata.org/entity/Q96339445">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JSB.2020.107548">10.1016/J.JSB.2020.107548</a></td>
  </tr>
  <tr>
    <td>2020-06-10</td>
    <td><a href="https://scholia.toolforge.org/Q96642691">SARS-CoV-2 nucleocapsid protein undergoes liquid-liquid phase separation stimulated by RNA and partitions into phases of human ribonucleoproteins</a> (<a href="http://www.wikidata.org/entity/Q96642691">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.09.141101">10.1101/2020.06.09.141101</a></td>
  </tr>
  <tr>
    <td>2020-06-10</td>
    <td><a href="https://scholia.toolforge.org/Q96231810">Identification of 22 N-glycosites on spike glycoprotein of SARS-CoV-2 and accessible surface glycopeptide motifs: implications for vaccination and antibody therapeutics</a> (<a href="http://www.wikidata.org/entity/Q96231810">edit</a>)</td>
    <td><a href="https://doi.org/10.1093/GLYCOB/CWAA052">10.1093/GLYCOB/CWAA052</a></td>
  </tr>
  <tr>
    <td>2020-06-10</td>
    <td><a href="https://scholia.toolforge.org/Q96345777">The Anticoagulant Nafamostat Potently Inhibits SARS-CoV-2 S Protein-Mediated Fusion in a Cell Fusion Assay System and Viral Infection In Vitro in a Cell-Type-Dependent Manner</a> (<a href="http://www.wikidata.org/entity/Q96345777">edit</a>)</td>
    <td><a href="https://doi.org/10.3390/V12060629">10.3390/V12060629</a></td>
  </tr>
  <tr>
    <td>2020-06-10</td>
    <td><a href="https://scholia.toolforge.org/Q96642669">A Rare Deletion in SARS-CoV-2 ORF6 Dramatically Alters the Predicted Three-Dimensional Structure of the Resultant Protein</a> (<a href="http://www.wikidata.org/entity/Q96642669">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.09.134460">10.1101/2020.06.09.134460</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q104440536">Neuropilin-1 is a host factor for SARS-CoV-2 infection</a> (<a href="http://www.wikidata.org/entity/Q104440536">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.06.05.134114">10.1101/2020.06.05.134114</a></td>
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
    <td>2020-05-26</td>
    <td><a href="https://scholia.toolforge.org/Q95851276">A human neutralizing antibody targets the receptor binding site of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q95851276">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41586-020-2381-Y">10.1038/S41586-020-2381-Y</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q95627977">Controlling the SARS-CoV-2 Spike Glycoprotein Conformation</a> (<a href="http://www.wikidata.org/entity/Q95627977">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.18.102087">10.1101/2020.05.18.102087</a></td>
  </tr>
  <tr>
    <td>2020-05-19</td>
    <td><a href="https://scholia.toolforge.org/Q95603892">Structural basis for translational shutdown and immune evasion by the Nsp1 protein of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q95603892">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.18.102467">10.1101/2020.05.18.102467</a></td>
  </tr>
  <tr>
    <td>2020-05-18</td>
    <td><a href="https://scholia.toolforge.org/Q95604288">Ebselen as a highly active inhibitor of PLProCoV2</a> (<a href="http://www.wikidata.org/entity/Q95604288">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.17.100768">10.1101/2020.05.17.100768</a></td>
  </tr>
  <tr>
    <td>2020-05-18</td>
    <td><a href="https://scholia.toolforge.org/Q95601106">Architecture and self-assembly of the SARS-CoV-2 nucleocapsid protein</a> (<a href="http://www.wikidata.org/entity/Q95601106">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.17.100685">10.1101/2020.05.17.100685</a></td>
  </tr>
  <tr>
    <td>2020-05-18</td>
    <td><a href="https://scholia.toolforge.org/Q95262934">Potent neutralizing antibodies against SARS-CoV-2 identified by high-throughput single-cell sequencing of convalescent patients' B cells</a> (<a href="http://www.wikidata.org/entity/Q95262934">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.05.025">10.1016/J.CELL.2020.05.025</a></td>
  </tr>
  <tr>
    <td>2020-05-18</td>
    <td><a href="https://scholia.toolforge.org/Q95626911">Distinct conformational states of SARS-CoV-2 spike protein</a> (<a href="http://www.wikidata.org/entity/Q95626911">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.16.099317">10.1101/2020.05.16.099317</a></td>
  </tr>
  <tr>
    <td>2020-05-15</td>
    <td><a href="https://scholia.toolforge.org/Q95626667">Crystal structures of SARS-CoV-2 ADP-ribose phosphatase (ADRP): from the apo form to ligand complexes</a> (<a href="http://www.wikidata.org/entity/Q95626667">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.14.096081">10.1101/2020.05.14.096081</a></td>
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
    <td>2020-05-11</td>
    <td><a href="https://scholia.toolforge.org/Q95601484">SARS-CoV-2 spike protein binds heparan sulfate in a length- and sequence-dependent manner</a> (<a href="http://www.wikidata.org/entity/Q95601484">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.05.10.087288">10.1101/2020.05.10.087288</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q94568802">The anti-HIV Drug Nelfinavir Mesylate (Viracept) is a Potent Inhibitor of Cell Fusion Caused by the SARS-CoV-2 Spike (S) Glycoprotein Warranting further Evaluation as an Antiviral against COVID-19 infections</a> (<a href="http://www.wikidata.org/entity/Q94568802">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.25985">10.1002/JMV.25985</a></td>
  </tr>
  <tr>
    <td>2020-05-06</td>
    <td><a href="https://scholia.toolforge.org/Q94589965">Cell entry mechanisms of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q94589965">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.2003138117">10.1073/PNAS.2003138117</a></td>
  </tr>
  <tr>
    <td>2020-05-06</td>
    <td><a href="https://scholia.toolforge.org/Q107273431">The 1.95 A Crystal Structure of the Co-factor Complex of NSP7 and the C-terminal Domain of NSP8 from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q107273431">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6WQD/PDB">10.2210/PDB6WQD/PDB</a></td>
  </tr>
  <tr>
    <td>2020-05-05</td>
    <td><a href="https://scholia.toolforge.org/Q97882813">Proteolytic Cleavage of the SARS-CoV-2 Spike Protein and the Role of the Novel S1/S2 Site</a> (<a href="http://www.wikidata.org/entity/Q97882813">edit</a>)</td>
    <td><a href="https://doi.org/10.2139/SSRN.3581359">10.2139/SSRN.3581359</a></td>
  </tr>
  <tr>
    <td>2020-05-05</td>
    <td><a href="https://scholia.toolforge.org/Q94551458">SARS-CoV-2 and ORF3a: Nonsynonymous Mutations, Functional Domains, and Viral Pathogenesis</a> (<a href="http://www.wikidata.org/entity/Q94551458">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/MSYSTEMS.00266-20">10.1128/MSYSTEMS.00266-20</a></td>
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
    <td>2020-04-30</td>
    <td><a href="https://scholia.toolforge.org/Q95601752">SARS-CoV-2 Spike S1 Receptor Binding Domain undergoes Conformational Change upon Interaction with Low Molecular Weight Heparins</a> (<a href="http://www.wikidata.org/entity/Q95601752">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.04.29.068486">10.1101/2020.04.29.068486</a></td>
  </tr>
  <tr>
    <td>2020-04-30</td>
    <td><a href="https://scholia.toolforge.org/Q95605311">Glycosaminoglycans induce conformational change in the SARS-CoV-2 Spike S1 Receptor Binding Domain</a> (<a href="http://www.wikidata.org/entity/Q95605311">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.04.29.068767">10.1101/2020.04.29.068767</a></td>
  </tr>
  <tr>
    <td>2020-04-29</td>
    <td><a href="https://scholia.toolforge.org/Q94450568">An in-silico evaluation of different Saikosaponins for their potency against SARS-CoV-2 using NSP15 and fusion spike glycoprotein as targets</a> (<a href="http://www.wikidata.org/entity/Q94450568">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/07391102.2020.1762741">10.1080/07391102.2020.1762741</a></td>
  </tr>
  <tr>
    <td>2020-04-29</td>
    <td><a href="https://scholia.toolforge.org/Q107329120">High-resolution structure of the SARS-CoV-2 NSP3 Macro X domain</a> (<a href="http://www.wikidata.org/entity/Q107329120">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6WEY/PDB">10.2210/PDB6WEY/PDB</a></td>
  </tr>
  <tr>
    <td>2020-04-29</td>
    <td><a href="https://scholia.toolforge.org/Q104533690">STRUCTURE OF THE SARS-CoV-2 ORF7A ENCODED ACCESSORY PROTEIN</a> (<a href="http://www.wikidata.org/entity/Q104533690">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6W37/PDB">10.2210/PDB6W37/PDB</a></td>
  </tr>
  <tr>
    <td>2020-04-28</td>
    <td><a href="https://scholia.toolforge.org/Q94500293">A Multibasic Cleavage Site in the Spike Protein of SARS-CoV-2 Is Essential for Infection of Human Lung Cells</a> (<a href="http://www.wikidata.org/entity/Q94500293">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.MOLCEL.2020.04.022">10.1016/J.MOLCEL.2020.04.022</a></td>
  </tr>
  <tr>
    <td>2020-04-28</td>
    <td><a href="https://scholia.toolforge.org/Q94453408">Structural elucidation of SARS-CoV-2 vital proteins: Computational methods reveal potential drug candidates against main protease, Nsp12 polymerase and Nsp13 helicase</a> (<a href="http://www.wikidata.org/entity/Q94453408">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JPHA.2020.04.008">10.1016/J.JPHA.2020.04.008</a></td>
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
    <td>2020-04-20</td>
    <td><a href="https://scholia.toolforge.org/Q93237239">The pivotal link between ACE2 deficiency and SARS-CoV-2 infection</a> (<a href="http://www.wikidata.org/entity/Q93237239">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.EJIM.2020.04.037">10.1016/J.EJIM.2020.04.037</a></td>
  </tr>
  <tr>
    <td>2020-04-17</td>
    <td><a href="https://scholia.toolforge.org/Q92028040">Crystal structure of Nsp15 endoribonuclease NendoU from SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q92028040">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/PRO.3873">10.1002/PRO.3873</a></td>
  </tr>
  <tr>
    <td>2020-04-15</td>
    <td><a href="https://scholia.toolforge.org/Q95601719">Discovery of baicalin and baicalein as novel, natural product inhibitors of SARS-CoV-2 3CL protease in vitro</a> (<a href="http://www.wikidata.org/entity/Q95601719">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.04.13.038687">10.1101/2020.04.13.038687</a></td>
  </tr>
  <tr>
    <td>2020-04-11</td>
    <td><a href="https://scholia.toolforge.org/Q95601327">On the interactions of the receptor-binding domain of SARS-CoV-1 and SARS-CoV-2 spike proteins with monoclonal antibodies and the receptor ACE2</a> (<a href="http://www.wikidata.org/entity/Q95601327">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.04.05.026377">10.1101/2020.04.05.026377</a></td>
  </tr>
  <tr>
    <td>2020-04-10</td>
    <td><a href="https://scholia.toolforge.org/Q91935604">SARS-CoV-2-encoded nucleocapsid protein acts as a viral suppressor of RNA interference in cells</a> (<a href="http://www.wikidata.org/entity/Q91935604">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S11427-020-1692-1">10.1007/S11427-020-1692-1</a></td>
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
    <td>2020-04-06</td>
    <td><a href="https://scholia.toolforge.org/Q95604705">Structural basis of RNA recognition by the SARS-CoV-2 nucleocapsid phosphoprotein</a> (<a href="http://www.wikidata.org/entity/Q95604705">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.04.02.022194">10.1101/2020.04.02.022194</a></td>
  </tr>
  <tr>
    <td>2020-04-02</td>
    <td><a href="https://scholia.toolforge.org/Q95601008">Molecular Basis for ADP-ribose Binding to the Macro-X Domain of SARS-CoV-2 Nsp3</a> (<a href="http://www.wikidata.org/entity/Q95601008">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.31.014639">10.1101/2020.03.31.014639</a></td>
  </tr>
  <tr>
    <td>2020-04-01</td>
    <td><a href="https://scholia.toolforge.org/Q106989387">The crystal structure of papain-like protease of SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q106989387">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6W9C/PDB">10.2210/PDB6W9C/PDB</a></td>
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
    <td>2020-03-30</td>
    <td><a href="https://scholia.toolforge.org/Q90777166">Inhibition of SARS-CoV-2 (previously 2019-nCoV) infection by a highly potent pan-coronavirus fusion inhibitor targeting its spike protein that harbors a high capacity to mediate membrane fusion</a> (<a href="http://www.wikidata.org/entity/Q90777166">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41422-020-0305-X">10.1038/S41422-020-0305-X</a></td>
  </tr>
  <tr>
    <td>2020-03-30</td>
    <td><a href="https://scholia.toolforge.org/Q95603898">Site-specific N-glycosylation Characterization of Recombinant SARS-CoV-2 Spike Proteins</a> (<a href="http://www.wikidata.org/entity/Q95603898">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.28.013276">10.1101/2020.03.28.013276</a></td>
  </tr>
  <tr>
    <td>2020-03-29</td>
    <td><a href="https://scholia.toolforge.org/Q88979288">The Nucleocapsid Protein of SARS-CoV-2 Abolished Pluripotency in Human Induced Pluripotent Stem Cells</a> (<a href="http://www.wikidata.org/entity/Q88979288">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.26.010694">10.1101/2020.03.26.010694</a></td>
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
    <td><a href="https://scholia.toolforge.org/Q88048219">Crystal structure of SARS-CoV-2 nucleocapsid protein N-terminal RNA binding domain</a> (<a href="http://www.wikidata.org/entity/Q88048219">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6M3M/PDB">10.2210/PDB6M3M/PDB</a></td>
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
    <td>2020-03-15</td>
    <td><a href="https://scholia.toolforge.org/Q88977435">SARS-CoV-2 invades host cells via a novel route: CD147-spike protein</a> (<a href="http://www.wikidata.org/entity/Q88977435">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.14.988345">10.1101/2020.03.14.988345</a></td>
  </tr>
  <tr>
    <td>2020-03-13</td>
    <td><a href="https://scholia.toolforge.org/Q88977278">The inhaled corticosteroid ciclesonide blocks coronavirus RNA replication by targeting viral NSP15</a> (<a href="http://www.wikidata.org/entity/Q88977278">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.11.987016">10.1101/2020.03.11.987016</a></td>
  </tr>
  <tr>
    <td>2020-03-11</td>
    <td><a href="https://scholia.toolforge.org/Q87995286">Crystal Structure of ADP ribose phosphatase of NSP3 from SARS CoV-2 in the complex with ADP ribose</a> (<a href="http://www.wikidata.org/entity/Q87995286">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6W02/PDB">10.2210/PDB6W02/PDB</a></td>
  </tr>
  <tr>
    <td>2020-03-11</td>
    <td><a href="https://scholia.toolforge.org/Q87968356">The crystal structure of COVID-19 main protease in apo form</a> (<a href="http://www.wikidata.org/entity/Q87968356">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6M03/PDB">10.2210/PDB6M03/PDB</a></td>
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
    <td>2020-03-09</td>
    <td><a href="https://scholia.toolforge.org/Q88976382">Substrate specificity profiling of SARS-CoV-2 Mpro protease provides basis for anti-COVID-19 drug design</a> (<a href="http://www.wikidata.org/entity/Q88976382">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.07.981928">10.1101/2020.03.07.981928</a></td>
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
    <td>2020-02-28</td>
    <td><a href="https://scholia.toolforge.org/Q89973070">Anti-HCV, nucleotide inhibitors, repurposing against COVID-19</a> (<a href="http://www.wikidata.org/entity/Q89973070">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.LFS.2020.117477">10.1016/J.LFS.2020.117477</a></td>
  </tr>
  <tr>
    <td>2020-02-27</td>
    <td><a href="https://scholia.toolforge.org/Q87967188">Structure of Mpro from COVID-19 virus and discovery of its inhibitors</a> (<a href="http://www.wikidata.org/entity/Q87967188">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.02.26.964882">10.1101/2020.02.26.964882</a></td>
  </tr>
  <tr>
    <td>2020-02-21</td>
    <td><a href="https://scholia.toolforge.org/Q89825166">COVID-2019: The role of the nsp2 and nsp3 in its pathogenesis</a> (<a href="http://www.wikidata.org/entity/Q89825166">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/JMV.25719">10.1002/JMV.25719</a></td>
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
    <td>2020-02-12</td>
    <td><a href="https://scholia.toolforge.org/Q88973823">The insert sequence in SARS-CoV-2 enhances spike protein cleavage by TMPRSS</a> (<a href="http://www.wikidata.org/entity/Q88973823">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.02.08.926006">10.1101/2020.02.08.926006</a></td>
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
    <td>2020-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q106514278">The Nucleocapsid Protein of SARS-CoV-2 Abolished Pluripotency in Human Induced Pluripotent Stem Cells</a> (<a href="http://www.wikidata.org/entity/Q106514278">edit</a>)</td>
    <td><a href="https://doi.org/10.2139/SSRN.3561932">10.2139/SSRN.3561932</a></td>
  </tr>
  <tr>
    <td>2020-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q107032002">3-Hydroxyphthalic Anhydride-Modified Chicken Ovalbumin as a Potential Candidate Inhibits SARS-CoV-2 Infection by Disrupting the Interaction of Spike Protein With Host ACE2 Receptor</a> (<a href="http://www.wikidata.org/entity/Q107032002">edit</a>)</td>
    <td><a href="https://doi.org/10.3389/FPHAR.2020.603830">10.3389/FPHAR.2020.603830</a></td>
  </tr>
  <tr>
    <td>2020-01-01</td>
    <td><a href="https://scholia.toolforge.org/Q106464338">Structural Insight  Reveals SARS-CoV-2 Orf7a as an Immunomodulating Factor for Human CD14+ Monocytes</a> (<a href="http://www.wikidata.org/entity/Q106464338">edit</a>)</td>
    <td><a href="https://doi.org/10.2139/SSRN.3699795">10.2139/SSRN.3699795</a></td>
  </tr>
  <tr>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q89187838">Crystal Structure of NSP15 Endoribonuclease from SARS CoV-2</a> (<a href="http://www.wikidata.org/entity/Q89187838">edit</a>)</td>
    <td><a href="https://doi.org/10.2210/PDB6VWW/PDB">10.2210/PDB6VWW/PDB</a></td>
  </tr>
  <tr>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q107473200">SARS-CoV-2 infects cells after viral entry via clathrin-mediated endocytosis</a> (<a href="http://www.wikidata.org/entity/Q107473200">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JBC.2021.100306">10.1016/J.JBC.2021.100306</a></td>
  </tr>
  <tr>
    <td></td>
    <td><a href="https://scholia.toolforge.org/Q108084037">The chaperone GRP78 is a host auxiliary factor for SARS-CoV-2 and GRP78 depleting antibody blocks viral entry and infection</a> (<a href="http://www.wikidata.org/entity/Q108084037">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.JBC.2021.100759">10.1016/J.JBC.2021.100759</a></td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litSARSCoV2Proteins.rq | sed 's+<lang/>+nl+' > litSARSCoV2Proteins.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litSARSCoV2Proteins.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
