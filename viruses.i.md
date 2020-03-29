<section level="#" label="viruses">Viruses</section>

The <topic>SARS-CoV-2</topic> <topic>virus</topic> is not the first <topic>coronavirus</topic> (CoV). In fact,
quite a few SARS-related CoVs are known, as clear from this
[NCBI Taxonomy list](https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?mode=Undef&id=694009&lvl=3&keep=1&srchmode=1&unlock).

We first list the SARS-CoV viruses in Wikidata:

<sparql>allSARSCoVViruses</sparql>

This gives us:

<out>allSARSCoVViruses</out>

But the SARS-related coronavirusses is just a subgroup. The full list of coronaviruses looks like this:

<sparql>allCoronaViruses</sparql>

Because there are quite a few of them in Wikidata, we rather make a graph dependency plot:

<sparql>allCoronaVirusesGraph</sparql>

This gives this output

<iframe>allCoronaVirusesGraph</iframe>

## The seven coronaviruses that infect human

However, for the current pandemic, the seven human corona viruses may be of particular interest [<cite>Q86729469</cite>].
We can use this query to just list these:

<sparql>humanCoronaviruses</sparql>

This gives us a good starting point to study the virus in more detail:

<out>humanCoronaviruses</out>

### Comparing viruses

We can also query for articles that compare a human coronavirus with another coronavirus:

<sparql>compareViruses</sparql>

## NCBI Taxonomy IDs

For the coronaviruses we can list the <topic>NCBI Taxonomy</topic> [<cite>Q28740981</cite>] identifiers with:

<sparql>allSARSCoVVirusesTaxonomy</sparql>

This gives us:

<out>allSARSCoVVirusesTaxonomy</out>

## References

<references/>

