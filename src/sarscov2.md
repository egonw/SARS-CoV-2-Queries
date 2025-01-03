<section level="#" label="sars-cov-2">SARS-CoV-2</section>

## Genomes

Perhaps the first question should be, which <topic>genomes</topic> have been measured for the SARS-CoV-2 virus:

<sparql>genomes</sparql>

Which lists these genome URLs:

<out>genomes</out>

### Variants

Multiple variants of the virus genome made it into the international news. Originally thes were known as
a Danish variant, a South-African variant, and a South-England variant. But the variants were only first
discovered there, and the variant is not caused by anything related to the region. The following variants
are listed in Wikidata, and includes the [PANGO lineage code](https://github.com/cov-lineages/pangolin):

<out>sarscov2Variants</out>

These were found in Wikidata with this query:

<sparql>sarscov2Variants</sparql>

These variants are all SARS-CoV-2, but a common type of combinations or sequence variants found in them
gives them different properties. For examples, VUI–202012/01 (also known as B.1.1.7) has a combination
of 17 sequence variants, see [this write up](https://virological.org/t/preliminary-genomic-characterisation-of-an-emergent-sars-cov-2-lineage-in-the-uk-defined-by-a-novel-set-of-spike-mutations/563).
It must be noted that many of these 17 sequence variants are found in other SARS-CoV-2 variants too.

We can list all sequence variants listed in Wikidata (out of a few thousand!) with this query:

<sparql>sequenceVariants</sparql>

This gives us this list:

<out>sequenceVariants</out>

Each sequence variant is a change in the genes encoded by the viral DNA and cause a change in the protein encoded
by that gene. The following two sections lists all genes and proteins. An interestion online book
is found online under the title <i>A sequence alignment and analysis of SARS-CoV-2 spike glycoprotein</i>
[<cite>Q113367696</cite>].

## Genes

The <topic>RNA</topic> of SARS-CoV-2 has been sequenced. Therefore, the <topic>open reading frames</topic> are known and identified.
We can query for the <topic>gene</topic> information in Wikidata with thie query:

<sparql>virusGenes</sparql>

Which gives us these genes:

<out>virusGenes</out>

## Proteins

Alternatively, we may be interested in the <topic>proteins</topic> of the coronaviruses.
We can get those with this query:

<sparql>virusProteins</sparql>

Which gives us these proteins:

<out>virusProteins</out>

## Protein complexes

Thanks to work done by a team at the online
[BioHackathon in April 2020](https://github.com/virtual-biohackathons/covid-19-bh20),
macromolecular structures from the [Complex Portal](https://www.ebi.ac.uk/complexportal/) [<cite>Q57793775</cite>,<cite>Q109348309</cite>]
have been entering Wikidata:

<sparql>complexes</sparql>

Listing these complexes:

<out>complexes</out>

## PDB structures

For the proteins, we can then query for the <topic>PDB structures</topic> [<cite>Q30491855</cite>]:

<sparql>virusProteinsPDB</sparql>

The full list can be found on the linked `sparql/complexes.rq` page, which has become quite long
so we will just visualize the number of PDB entries per protein here:

<iframe>virusProteinsPDBBubbleChart</iframe>

Which was created with this query:

<sparql>virusProteinsPDBBubbleChart</sparql>

## References

<references/>

