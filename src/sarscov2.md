# SARS-CoV-2

## Genomes

Perhaps the first question should be, which <topic>genomes</topic> have been measured for the SARS-CoV-2 virus:

<sparql>genomes</sparql>

Which lists these genome URLs:

<out>genomes</out>

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

### Protein complexes

Thanks to work done by a team at the online
[BioHackathon in April 2020](https://github.com/virtual-biohackathons/covid-19-bh20),
macromolecular structures from the [Complex Portal](https://www.ebi.ac.uk/complexportal/) [<cite>Q57793775</cite>]
have been entering Wikidata:

<sparql>complexes</sparql>

Listing these complexes:

<out>complexes</out>

#### PDB structures

For the proteins, we can then query for the <topic>PDB structures</topic> [<cite>Q30491855</cite>]:

<sparql>virusProteinsPDB</sparql>

Which gives us:

<out>virusProteinsPDB</out>

## References

<references/>

