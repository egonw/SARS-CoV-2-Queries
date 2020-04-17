# Genomes, Genes, and Proteins

## Genomes

Perhaps the first question should be, which <topic>genomes</topic> have been measured for the SARS-CoV-2 virus:

<sparql>genomes</sparql>

Which lists these genome URLs:

<out>genomes</out>

## SARS-CoV-2

### Genes

The <topic>RNA</topic> of SARS-CoV-2 has been sequenced. Therefore, the <topic>open reading frames</topic> are known and identified.
We can query for the <topic>gene</topic> information in Wikidata with thie query:

<sparql>virusGenes</sparql>

Which gives us these genes:

<out>virusGenes</out>

### Proteins

Alternatively, we may be interested in the <topic>proteins</topic> of the coronaviruses.
We can get those with this query:

<sparql>virusProteins</sparql>

Which gives us these proteins:

<out>virusProteins</out>

#### PDB structures

For the proteins, we can then query for the <topic>PDB structures</topic> [<cite>Q30491855</cite>]:

<sparql>virusProteinsPDB</sparql>

Which gives us:

<out>virusProteinsPDB</out>

## All SARSr viruses

Much like that above query, we can also ask for all genes and proteins
of all SARSr viruses. This is done with the following queries.

### All SARSr genes

All genes we get with:

<sparql>virusGenesSARSr</sparql>

Which returns:

<out>virusGenesSARSr</out>

### All SARSr proteins

And all proteins we get with:

<sparql>virusProteinsSARSr</sparql>

Which returns:

<out>virusProteinsSARSr</out>

## All human coronaviruses

Much like that above query, we can also ask for all genes and proteins.
This is done with the following queries.

### All HCoV genes

All genes we get with:

<sparql>virusGenesAll</sparql>

Which returns:

<out>virusGenesAll</out>

### All HCoV proteins

And all proteins we get with:

<sparql>virusProteinsAll</sparql>

Which returns:

<out>virusProteinsAll</out>

## References

<references/>

