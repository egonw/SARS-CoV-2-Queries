# Genomes, Genes, and Proteins

## Genomes

Perhaps the first question should be, which <a name="tp1">genomes</a> have been measured for the SARS-CoV-2 virus:

**SPARQL** [sparql/genomes.rq](sparql/genomes.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fgenome%20WHERE%20%7B%0A%20%20wd%3AQ82069695%20wdt%3AP527%2Fwdt%3AP6800%20%3Fgenome%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fgenome%20WHERE%20%7B%0A%20%20wd%3AQ82069695%20wdt%3AP527%2Fwdt%3AP6800%20%3Fgenome%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A))

```sparql
SELECT ?genome WHERE {
  wd:Q82069695 wdt:P527/wdt:P6800 ?genome .
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

## Genes

The <a name="tp2">RNA</a> of SARS-CoV-2 has been sequenced. Therefore, the <a name="tp3">open reading frames</a> are known and identified.
We can query for the <a name="tp4">gene</a> information in Wikidata with thie query:

**SPARQL** [sparql/virusGenes.rq](sparql/virusGenes.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ7187%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?virus ?virusLabel ?gene ?geneLabel WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  ?gene wdt:P703 ?virus ; wdt:P31 wd:Q7187 .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

Which gives us these genes:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>gene</b></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td><a href="http://www.wikidata.org/entity/Q88000922">S surface glycoprotein of SARS-CoV-2</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td><a href="http://www.wikidata.org/entity/Q88088053">orf1a polyprotein;orf1ab polyprotein</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td><a href="http://www.wikidata.org/entity/Q88088595">ORF3a protein</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td><a href="http://www.wikidata.org/entity/Q88088888">envelope protein</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td><a href="http://www.wikidata.org/entity/Q88089048">membrane glycoprotein</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td><a href="http://www.wikidata.org/entity/Q88089203">ORF6 protein</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td><a href="http://www.wikidata.org/entity/Q88089283">ORF7a protein</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td><a href="http://www.wikidata.org/entity/Q88089438">ORF7b</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td><a href="http://www.wikidata.org/entity/Q88089552">ORF8 protein</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td><a href="http://www.wikidata.org/entity/Q88089689">nucleocapsid phosphoprotein</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td><a href="http://www.wikidata.org/entity/Q88105063">Record to support submission of GeneRIFs for a gene not in Gene (COVID-19; COVID-19 virus; Human coronavirus 2019; Wuhan coronavirus; Wuhan seafood market pneumonia virus).</a></td>
  </tr>
</table>

## Proteins

Alternatively, we may be interested in the <a name="tp5">proteins</a> of the coronaviruses.
We can get those with this query:

**SPARQL** [sparql/virusProteins.rq](sparql/virusProteins.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ84467700%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fgene%20%3FgeneLabel%20%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fgene%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ84467700%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A))

```sparql
SELECT ?virus ?virusLabel ?gene ?geneLabel  WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  ?gene wdt:P703 ?virus ; wdt:P31 wd:Q84467700 .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

Which gives us these proteins:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>gene</b></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td><a href="http://www.wikidata.org/entity/Q87917580">2'-O-methyltransferase</a></td>
  </tr>
</table>

### PDB structures

For the proteins, we can then query for the <a name="tp6">PDB structures</a> [<a href="#citeref1">1</a>]:

**SPARQL** [sparql/virusProteinsPDB.rq](sparql/virusProteinsPDB.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20%3Fpdb%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ84467700%20.%0A%20%20%3Fprotein%20wdt%3AP638%20%3Fpdb%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fprotein%20%3FproteinLabel%20%3Fpdb%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20%3Fprotein%20wdt%3AP703%20%3Fvirus%20%3B%20wdt%3AP31%20wd%3AQ84467700%20.%0A%20%20%3Fprotein%20wdt%3AP638%20%3Fpdb%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?virus ?virusLabel ?protein ?proteinLabel ?pdb WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  ?protein wdt:P703 ?virus ; wdt:P31 wd:Q84467700 .
  ?protein wdt:P638 ?pdb .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

Which gives us:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>protein</b></td>
    <td><b>pdb</b></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q82069695">SARS-CoV-2</a></td>
    <td><a href="http://www.wikidata.org/entity/Q87917580">2'-O-methyltransferase</a></td>
    <td>6W4H</td>
  </tr>
</table>

## References

1. <a name="citeref1"></a>Burley SK, Berman HM, Kleywegt G, Markley JL, Nakamura H, Velankar S. Protein Data Bank (PDB): The Single Global Macromolecular Structure Archive. Methods in Molecular Biology. 2017 Jan 1;1607:627–41.  doi:[10.1007/978-1-4939-7000-1_26](https://doi.org/10.1007/978-1-4939-7000-1_26) ([Scholia](https://tools.wmflabs.org/scholia/doi/10.1007/978-1-4939-7000-1_26))


