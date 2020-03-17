# Genes

Perhaps the first question should be, which <a name="tp1">genomes</a> have been measured for the SARS-CoV-2 virus:

**SPARQL** [sparql/genomes.rq](sparql/genomes.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fgenome%20WHERE%20%7B%0A%20%20wd%3AQ82069695%20wdt%3AP6800%20%3Fgenome%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fgenome%20WHERE%20%7B%0A%20%20wd%3AQ82069695%20wdt%3AP6800%20%3Fgenome%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A))

```sparql
SELECT ?genome WHERE {
  wd:Q82069695 wdt:P6800 ?genome .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

Which lists these genome URLs:

<table>
  <tr>
    <td><b>genome</b></td>
  </tr>
  <tr>
    <td>https://gisaid.org/CoV2020</td>
  </tr>
  <tr>
    <td>https://www.ncbi.nlm.nih.gov/genome/86693</td>
  </tr>
  <tr>
    <td>https://www.ncbi.nlm.nih.gov/assembly/GCF_009858895.2</td>
  </tr>
  <tr>
    <td>https://www.ncbi.nlm.nih.gov/nuccore/1798174254</td>
  </tr>
</table>
