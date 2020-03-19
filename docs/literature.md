# Literature

These queries list the latest 10 <a name="tp1">articles</a> about a number of topics. It is
no replacement for [Scholia](https://tools.wmflabs.org/scholia/) [<a href="#citeref1">1</a>],
which has a much richer overview of <a name="tp2">literature</a> on the topic. Each section
includes a link to the Scholia page for that topic. The queries used here
are very basic, and only use the 'main subject' property.

## about SARS-CoV-2

[SARS-CoV-2](https://tools.wmflabs.org/scholia/topic/Q82069695) is the name of the virus.

**SPARQL** [sparql/litSARSCoV2.rq](sparql/litSARSCoV2.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ82069695%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%20LIMIT%2010%0A), [edit](https://query.wikidata.org/#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ82069695%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%20LIMIT%2010%0A))

```sparql
SELECT (MAX(?dates) as ?date) ?work ?workLabel ?doi WHERE {
  ?work wdt:P921 wd:Q82069695 .
  OPTIONAL { ?work wdt:P577 ?dates . }
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,da,de,es,fr,jp,nl,no,ru,sv,zh". }
} GROUP BY ?work ?workLabel ?doi ORDER BY DESC(?date) LIMIT 10
```

This gives these 10 papers:

<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>workLabel</b></td>
    <td><b>doi</b></td>
  </tr>
  <tr>
    <td>2020-05-17T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87461585</td>
    <td>Risk for Transportation of 2019 Novel Coronavirus Disease from Wuhan to Other Cities in China</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-05-17T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87461449</td>
    <td>Potential Presymptomatic Transmission of SARS-CoV-2, Zhejiang Province, China, 2020</td>
    <td></td>
  </tr>
  <tr>
    <td>2020-04-01T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87461794</td>
    <td>CT Imaging of the 2019 Novel Coronavirus (2019-nCoV) Pneumonia</td>
    <td>10.1148/RADIOL.2020200236</td>
  </tr>
  <tr>
    <td>2020-04-01T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87945074</td>
    <td>Enteric involvement of coronaviruses: is faecal–oral transmission of SARS-CoV-2 possible?</td>
    <td>10.1016/S2468-1253(20)30048-0</td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87995005</td>
    <td>1.80 Angstrom Resolution Crystal Structure of NSP16 - NSP10 Complex from SARS-CoV-2</td>
    <td>10.2210/PDB6W4H/PDB</td>
  </tr>
  <tr>
    <td>2020-03-17T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87830056</td>
    <td>The proximal origin of SARS-CoV-2</td>
    <td>10.1038/S41591-020-0820-9</td>
  </tr>
  <tr>
    <td>2020-03-17T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87943251</td>
    <td>Aerosol and Surface Stability of SARS-CoV-2 as Compared with SARS-CoV-1</td>
    <td>10.1056/NEJMC2004973</td>
  </tr>
  <tr>
    <td>2020-03-16T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87789617</td>
    <td>Substantial undocumented infection facilitates the rapid dissemination of novel coronavirus (SARS-CoV2)</td>
    <td>10.1126/SCIENCE.ABB3221</td>
  </tr>
  <tr>
    <td>2020-03-16T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87945075</td>
    <td>SARS-CoV-2 and COVID-19: The most important research questions</td>
    <td>10.1186/S13578-020-00404-4</td>
  </tr>
  <tr>
    <td>2020-03-13T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q83567432</td>
    <td>Coronavirus latest: global infections surge past 30,000</td>
    <td>10.1038/D41586-020-00154-W</td>
  </tr>
</table>

## about coronaviruses

As outlined in Chapter X, SARS-Cov-2 is one of the coronaviruses that
can infect humans.

**SPARQL** [sparql/litCoronaviruses.rq](sparql/litCoronaviruses.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ57751738%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%20LIMIT%2010%0A), [edit](https://query.wikidata.org/#SELECT%20%28MAX%28%3Fdates%29%20as%20%3Fdate%29%20%3Fwork%20%3FworkLabel%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwork%20wdt%3AP921%20wd%3AQ57751738%20.%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP577%20%3Fdates%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fwork%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cda%2Cde%2Ces%2Cfr%2Cjp%2Cnl%2Cno%2Cru%2Csv%2Czh%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fwork%20%3FworkLabel%20%3Fdoi%20ORDER%20BY%20DESC%28%3Fdate%29%20LIMIT%2010%0A))

```sparql
SELECT (MAX(?dates) as ?date) ?work ?workLabel ?doi WHERE {
  ?work wdt:P921 wd:Q57751738 .
  OPTIONAL { ?work wdt:P577 ?dates . }
  OPTIONAL { ?work wdt:P356 ?doi . }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,da,de,es,fr,jp,nl,no,ru,sv,zh". }
} GROUP BY ?work ?workLabel ?doi ORDER BY DESC(?date) LIMIT 10
```

This gives these 10 papers:

<table>
  <tr>
    <td><b>date</b></td>
    <td><b>work</b></td>
    <td><b>workLabel</b></td>
    <td><b>doi</b></td>
  </tr>
  <tr>
    <td>2020-03-12T00:00:00Z</td>
    <td>http://www.wikidata.org/entity/Q87675797</td>
    <td>[Recommendations for critically ill patients with COVID-19]</td>
    <td>10.1007/S00063-020-00674-3</td>
  </tr>
</table>

## References

1. <a name="citeref1"></a>Rasberry L, Willighagen E, Nielsen FÅ, Mietchen D. Robustifying Scholia: paving the way for knowledge discovery and research assessment through Wikidata [Internet]. Vol. 5, Research Ideas and Outcomes. 2019. 16 p. Available from: https://riojournal.com/article/35820/ doi:[10.3897/RIO.5.E35820](https://doi.org/10.3897/RIO.5.E35820) ([Scholia](https://tools.wmflabs.org/scholia/doi/10.3897/RIO.5.E35820))

