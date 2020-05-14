# humanInteractions.rq
**Ejemplos de código:** [curl](#curl)
### SPARQL
```sparql
SELECT ?date ?virus ?virusLabel ?gene ?geneLabel ?work ?workLabel ?doi WITH {
  SELECT (MAX(?dates) as ?date) ?virus ?gene ?work WHERE {
    ?virus wdt:P171+ wd:Q57751738 .
    ?work wdt:P921 ?virus, ?gene .  
    OPTIONAL { ?work wdt:P577 ?dates . }
    ?gene wdt:P703 wd:Q15978631 .   
    { ?gene wdt:P31 wd:Q7187 } UNION { ?gene wdt:P31 wd:Q8054 }
  } GROUP BY ?virus ?gene ?work
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "es,en". }
}
ORDER BY DESC(?date) ?doi
```
[ejecutar](https://query.wikidata.org/embed.html#SELECT%20%3Fdate%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WITH%20%7B%0A%20%20SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fvirus%20%3Fgene%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%2C%20%3Fgene%20.%20%20%0A%20%20%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20%20%20%3Fgene%20wdt%3AP703%20wd%3AQ15978631%20.%20%20%20%0A%20%20%20%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ7187%20%7D%20UNION%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ8054%20%7D%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%20%3Fgene%20%3Fwork%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fdate%29%20%3Fdoi%0A) o [editar](https://query.wikidata.org/#SELECT%20%3Fdate%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WITH%20%7B%0A%20%20SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fvirus%20%3Fgene%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%2C%20%3Fgene%20.%20%20%0A%20%20%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20%20%20%3Fgene%20wdt%3AP703%20wd%3AQ15978631%20.%20%20%20%0A%20%20%20%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ7187%20%7D%20UNION%20%7B%20%3Fgene%20wdt%3AP31%20wd%3AQ8054%20%7D%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%20%3Fgene%20%3Fwork%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fdate%29%20%3Fdoi%0A)


### Resultados
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>virus</b></td>
    <td><b>gene</b></td>
    <td><b>work</b></td>
    <td><b>doi</b></td>
  </tr>
  <tr>
    <td>2020-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87830056">The proximal origin of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87830056">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41591-020-0820-9">10.1038/S41591-020-0820-9</a></td>
  </tr>
  <tr>
    <td>2020-04-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87830056">The proximal origin of SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q87830056">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41591-020-0820-9">10.1038/S41591-020-0820-9</a></td>
  </tr>
  <tr>
    <td>2020-03-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88978459">ACE2 Expression is Increased in the Lungs of Patients with Comorbidities Associated with Severe COVID-19</a> (<a href="http://www.wikidata.org/entity/Q88978459">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.03.21.20040261">10.1101/2020.03.21.20040261</a></td>
  </tr>
  <tr>
    <td>2020-03-05T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q14865236">IL6</a> (<a href="http://www.wikidata.org/entity/Q14865236">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87755922">Effective Treatment of Severe COVID-19 Patients with Tocilizumab</a> (<a href="http://www.wikidata.org/entity/Q87755922">edit</a>)</td>
    <td><a href="https://doi.org/10.12074/202003.00026">10.12074/202003.00026</a></td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q90027115">Angiotensin receptor blockers as tentative SARS-CoV-2 therapeutics</a> (<a href="http://www.wikidata.org/entity/Q90027115">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/DDR.21656">10.1002/DDR.21656</a></td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21126599">Transmembrane serine protease 2</a> (<a href="http://www.wikidata.org/entity/Q21126599">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292103">SARS-CoV-2 Cell Entry Depends on ACE2 and TMPRSS2 and Is Blocked by a Clinically Proven Protease Inhibitor</a> (<a href="http://www.wikidata.org/entity/Q88292103">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.02.052">10.1016/J.CELL.2020.02.052</a></td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88292103">SARS-CoV-2 Cell Entry Depends on ACE2 and TMPRSS2 and Is Blocked by a Clinically Proven Protease Inhibitor</a> (<a href="http://www.wikidata.org/entity/Q88292103">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.CELL.2020.02.052">10.1016/J.CELL.2020.02.052</a></td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87726414">Structural basis for the recognition of the SARS-CoV-2 by full-length human ACE2</a> (<a href="http://www.wikidata.org/entity/Q87726414">edit</a>)</td>
    <td><a href="https://doi.org/10.1126/SCIENCE.ABB2762">10.1126/SCIENCE.ABB2762</a></td>
  </tr>
  <tr>
    <td>2020-03-03T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q88291889">Angiotensin-converting enzyme 2 (ACE2) as a SARS-CoV-2 receptor: molecular mechanisms and potential therapeutic target</a> (<a href="http://www.wikidata.org/entity/Q88291889">edit</a>)</td>
    <td><a href="https://doi.org/10.1007/S00134-020-05985-9">10.1007/S00134-020-05985-9</a></td>
  </tr>
  <tr>
    <td>2020-02-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89866691">Functional assessment of cell entry and receptor usage for SARS-CoV-2 and other lineage B betacoronaviruses</a> (<a href="http://www.wikidata.org/entity/Q89866691">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41564-020-0688-Y">10.1038/S41564-020-0688-Y</a></td>
  </tr>
  <tr>
    <td>2020-02-24T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16532287">Betacoronavirus</a> (<a href="http://www.wikidata.org/entity/Q16532287">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q89866691">Functional assessment of cell entry and receptor usage for SARS-CoV-2 and other lineage B betacoronaviruses</a> (<a href="http://www.wikidata.org/entity/Q89866691">edit</a>)</td>
    <td><a href="https://doi.org/10.1038/S41564-020-0688-Y">10.1038/S41564-020-0688-Y</a></td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21126599">Transmembrane serine protease 2</a> (<a href="http://www.wikidata.org/entity/Q21126599">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q84225932">The novel coronavirus 2019 (2019-nCoV) uses the SARS-coronavirus receptor ACE2 and the cellular protease TMPRSS2 for entry into target cells</a> (<a href="http://www.wikidata.org/entity/Q84225932">edit</a>)</td>
    <td><a href="https://doi.org/10.1101/2020.01.31.929042">10.1101/2020.01.31.929042</a></td>
  </tr>
  <tr>
    <td>2020-01-21T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q412214">DPP-4</a> (<a href="http://www.wikidata.org/entity/Q412214">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q83500593">Polymorphisms in dipeptidyl peptidase 4 reduce host cell entry of Middle East respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q83500593">edit</a>)</td>
    <td><a href="https://doi.org/10.1080/22221751.2020.1713705">10.1080/22221751.2020.1713705</a></td>
  </tr>
  <tr>
    <td>2017-02-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q412214">DPP-4</a> (<a href="http://www.wikidata.org/entity/Q412214">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40359845">Middle east respiratory syndrome corona virus spike glycoprotein suppresses macrophage responses via DPP4-mediated induction of IRAK-M and PPARγ.</a> (<a href="http://www.wikidata.org/entity/Q40359845">edit</a>)</td>
    <td><a href="https://doi.org/10.18632/ONCOTARGET.14754">10.18632/ONCOTARGET.14754</a></td>
  </tr>
  <tr>
    <td>2016-06-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40674745">HeLa-ACE2-TMPRSS2 Cells Are Useful for the Isolation of Human Coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q40674745">edit</a>)</td>
    <td><a href="https://doi.org/10.7883/YOKEN.JJID.2016.106">10.7883/YOKEN.JJID.2016.106</a></td>
  </tr>
  <tr>
    <td>2016-06-30T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18032025">TMPRSS2</a> (<a href="http://www.wikidata.org/entity/Q18032025">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40674745">HeLa-ACE2-TMPRSS2 Cells Are Useful for the Isolation of Human Coronavirus 229E.</a> (<a href="http://www.wikidata.org/entity/Q40674745">edit</a>)</td>
    <td><a href="https://doi.org/10.7883/YOKEN.JJID.2016.106">10.7883/YOKEN.JJID.2016.106</a></td>
  </tr>
  <tr>
    <td>2015-08-26T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21173608">Peptidylprolyl isomerase A</a> (<a href="http://www.wikidata.org/entity/Q21173608">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q38576023">Genetic deficiency and polymorphisms of cyclophilin A reveal its essential role for Human Coronavirus 229E replication.</a> (<a href="http://www.wikidata.org/entity/Q38576023">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.COVIRO.2015.08.004">10.1016/J.COVIRO.2015.08.004</a></td>
  </tr>
  <tr>
    <td>2013-03-27T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21126599">Transmembrane serine protease 2</a> (<a href="http://www.wikidata.org/entity/Q21126599">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q39174513">TMPRSS2 activates the human coronavirus 229E for cathepsin-independent host cell entry and is expressed in viral target cells in the respiratory epithelium.</a> (<a href="http://www.wikidata.org/entity/Q39174513">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.03372-12">10.1128/JVI.03372-12</a></td>
  </tr>
  <tr>
    <td>2011-02-16T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21126599">Transmembrane serine protease 2</a> (<a href="http://www.wikidata.org/entity/Q21126599">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q35076795">Evidence that TMPRSS2 activates the severe acute respiratory syndrome coronavirus spike protein for membrane fusion and reduces viral control by the humoral immune response.</a> (<a href="http://www.wikidata.org/entity/Q35076795">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.02232-10">10.1128/JVI.02232-10</a></td>
  </tr>
  <tr>
    <td>2010-11-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21126599">Transmembrane serine protease 2</a> (<a href="http://www.wikidata.org/entity/Q21126599">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24306622">A transmembrane serine protease is linked to the severe acute respiratory syndrome coronavirus receptor and activates virus entry</a> (<a href="http://www.wikidata.org/entity/Q24306622">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.02062-10">10.1128/JVI.02062-10</a></td>
  </tr>
  <tr>
    <td>2010-11-10T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24306622">A transmembrane serine protease is linked to the severe acute respiratory syndrome coronavirus receptor and activates virus entry</a> (<a href="http://www.wikidata.org/entity/Q24306622">edit</a>)</td>
    <td><a href="https://doi.org/10.1128/JVI.02062-10">10.1128/JVI.02062-10</a></td>
  </tr>
  <tr>
    <td>2009-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q14905314">MASP2</a> (<a href="http://www.wikidata.org/entity/Q14905314">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21261523">Lack of association between polymorphisms of MASP2 and susceptibility to SARS coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q21261523">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/1471-2334-9-51">10.1186/1471-2334-9-51</a></td>
  </tr>
  <tr>
    <td>2009-01-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q14905314">MASP2</a> (<a href="http://www.wikidata.org/entity/Q14905314">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q21261523">Lack of association between polymorphisms of MASP2 and susceptibility to SARS coronavirus infection</a> (<a href="http://www.wikidata.org/entity/Q21261523">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/1471-2334-9-51">10.1186/1471-2334-9-51</a></td>
  </tr>
  <tr>
    <td>2008-05-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36693984">Modulation of TNF-alpha-converting enzyme by the spike protein of SARS-CoV and ACE2 induces TNF-alpha production and facilitates viral entry</a> (<a href="http://www.wikidata.org/entity/Q36693984">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.0711241105">10.1073/PNAS.0711241105</a></td>
  </tr>
  <tr>
    <td>2008-05-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18032037">factor de necrosis tumoral</a> (<a href="http://www.wikidata.org/entity/Q18032037">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36693984">Modulation of TNF-alpha-converting enzyme by the spike protein of SARS-CoV and ACE2 induces TNF-alpha production and facilitates viral entry</a> (<a href="http://www.wikidata.org/entity/Q36693984">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.0711241105">10.1073/PNAS.0711241105</a></td>
  </tr>
  <tr>
    <td>2008-05-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36693984">Modulation of TNF-alpha-converting enzyme by the spike protein of SARS-CoV and ACE2 induces TNF-alpha production and facilitates viral entry</a> (<a href="http://www.wikidata.org/entity/Q36693984">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.0711241105">10.1073/PNAS.0711241105</a></td>
  </tr>
  <tr>
    <td>2008-05-19T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18032037">factor de necrosis tumoral</a> (<a href="http://www.wikidata.org/entity/Q18032037">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36693984">Modulation of TNF-alpha-converting enzyme by the spike protein of SARS-CoV and ACE2 induces TNF-alpha production and facilitates viral entry</a> (<a href="http://www.wikidata.org/entity/Q36693984">edit</a>)</td>
    <td><a href="https://doi.org/10.1073/PNAS.0711241105">10.1073/PNAS.0711241105</a></td>
  </tr>
  <tr>
    <td>2008-02-29T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q18032037">factor de necrosis tumoral</a> (<a href="http://www.wikidata.org/entity/Q18032037">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q33321974">Roles of TNF-alpha gene polymorphisms in the occurrence and progress of SARS-Cov infection: a case-control study.</a> (<a href="http://www.wikidata.org/entity/Q33321974">edit</a>)</td>
    <td><a href="https://doi.org/10.1186/1471-2334-8-27">10.1186/1471-2334-8-27</a></td>
  </tr>
  <tr>
    <td>2004-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40510688">Tissue distribution of ACE2 protein, the functional receptor for SARS coronavirus. A first step in understanding SARS pathogenesis.</a> (<a href="http://www.wikidata.org/entity/Q40510688">edit</a>)</td>
    <td><a href="https://doi.org/10.1002/PATH.1570">10.1002/PATH.1570</a></td>
  </tr>
  <tr>
    <td>2004-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q85438966">severe acute respiratory syndrome coronavirus</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24294404">ACE2: from vasopeptidase to SARS virus receptor</a> (<a href="http://www.wikidata.org/entity/Q24294404">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.TIPS.2004.04.001">10.1016/J.TIPS.2004.04.001</a></td>
  </tr>
  <tr>
    <td>2004-06-01T00:00:00Z</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q301630">Angiotensin I converting enzyme 2</a> (<a href="http://www.wikidata.org/entity/Q301630">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q24294404">ACE2: from vasopeptidase to SARS virus receptor</a> (<a href="http://www.wikidata.org/entity/Q24294404">edit</a>)</td>
    <td><a href="https://doi.org/10.1016/J.TIPS.2004.04.001">10.1016/J.TIPS.2004.04.001</a></td>
  </tr>
</table>
## Ejemplos de código
### curl
```shell
curl -o humanInteractions.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/humanInteractions.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@humanInteractions.rq
```
Esta consulta SPARQL está disponible en CCZero.
