# Genomes, Genes, and Proteins

## Genomes

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

## Proteins

Alternatively, we may be interested in the proteins of the coronaviruses.
We can get those with this query:

**SPARQL** [sparql/virusProteins.rq](sparql/virusProteins.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP279%20wd%3AQ952587%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP279%20wd%3AQ952587%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A))

```sparql
SELECT ?virus ?virusLabel ?gene ?geneLabel  WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  ?gene wdt:P703 ?virus ; wdt:P279 wd:Q952587 .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

Which gives us these proteins:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>virusLabel</b></td>
    <td><b>gene</b></td>
    <td><b>geneLabel</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87910984</td>
    <td>SARS-CoV-2 spike (S) protein</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917572</td>
    <td>NSP10 from SARS CoV-2</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917579</td>
    <td>NSP15 Endoribonuclease from SARS CoV-2</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917580</td>
    <td>NSP16 from SARS CoV-2</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917581</td>
    <td>NSP3 from SARS CoV-2</td>
  </tr>
</table>

### PDB structures

For the proteins, we can then query for the PDB structures [<a href="#citeref1">1</a>]:

**SPARQL** [sparql/virusProteinsPDB.rq](sparql/virusProteinsPDB.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20%3Fpdb%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP279%20wd%3AQ952587%20.%0A%20%20%3Fprotein%20wdt%3AP638%20%3Fpdb%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20%3Fpdb%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP279%20wd%3AQ952587%20.%0A%20%20%3Fprotein%20wdt%3AP638%20%3Fpdb%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?virus ?virusLabel ?protein ?proteinLabel ?pdb WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  ?protein wdt:P703 ?virus ; wdt:P279 wd:Q952587 .
  ?protein wdt:P638 ?pdb .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

Which gives us:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>virusLabel</b></td>
    <td><b>protein</b></td>
    <td><b>proteinLabel</b></td>
    <td><b>pdb</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917572</td>
    <td>NSP10 from SARS CoV-2</td>
    <td>6W4H</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917579</td>
    <td>NSP15 Endoribonuclease from SARS CoV-2</td>
    <td>6VWW</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917579</td>
    <td>NSP15 Endoribonuclease from SARS CoV-2</td>
    <td>6W01</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917580</td>
    <td>NSP16 from SARS CoV-2</td>
    <td>6W4H</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917581</td>
    <td>NSP3 from SARS CoV-2</td>
    <td>6VXS</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q82069695</td>
    <td>SARS-CoV-2</td>
    <td>http://www.wikidata.org/entity/Q87917581</td>
    <td>NSP3 from SARS CoV-2</td>
    <td>6W02</td>
  </tr>
</table>

## References

1. <a name="citeref1"></a>Burley SK, Berman HM, Kleywegt G, Markley JL, Nakamura H, Velankar S. Protein Data Bank (PDB): The Single Global Macromolecular Structure Archive. Methods in Molecular Biology. 2017 Jan 1;1607:627–41.  doi:[10.1007/978-1-4939-7000-1_26](https://doi.org/10.1007/978-1-4939-7000-1_26) ([Scholia](https://tools.wmflabs.org/scholia/doi/10.1007/978-1-4939-7000-1_26))


