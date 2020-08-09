<section level="#" label="viruses">Viruses</section>

Coronaviruses are not new and some of them are pretty harmless. For example, 
the human coronaviruses HCoV-229E and HCoV-OC43 normally result in a common
cold [<cite>Q36641750</cite>]. However, for the
<topic>severe acute respiratory syndrome-related coronaviruses</topic> (<topic>SARSr viruses</topic>)
this is different. SARS-CoV-2, of course, is the main topic of this book [<cite>Q87000965</cite>].

## All SARSr viruses

The <topic>SARS-CoV-2</topic> <topic>virus</topic> is not the first <topic>coronavirus</topic> (CoV). In fact,
quite a few SARS-related CoVs are known, as clear from this
[NCBI Taxonomy list](https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?mode=Undef&id=694009&lvl=3&keep=1&srchmode=1&unlock)
[<cite>Q28740981</cite>,<cite>Q98169475</cite>].

We first list all the SARSr-CoV viruses in Wikidata:

<sparql>allSARSCoVViruses</sparql>

This gives us:

<out>allSARSCoVViruses</out>

If we compare this list with that in Section <xref>sevenhuman</xref> we note that
these two lists do not fully overlap.

<section level="##" label="sevenhuman">The seven coronaviruses that infect human</section>

However, for the current pandemic, the seven human corona viruses may be of particular interest [<cite>Q86729469</cite>].
We can use this query to just list these:

<sparql>humanCoronaviruses</sparql>

This gives us a good starting point to study the virus in more detail:

<out>humanCoronaviruses</out>

## All betacoronaviruses

But the SARS-related coronavirusses is just a subgroup. Another subgroup of coronaviruses is that of the betacoronaviruses:

<sparql>allBetacoronaViruses</sparql>

Because there are quite a few of them in Wikidata, we rather make a graph dependency plot:

<sparql>allBetacoronaVirusesGraph</sparql>

This gives this output:

<iframe>allBetacoronaVirusesGraph</iframe>

## All coronaviruses

The full list of coronaviruses looks like this:

<sparql>allCoronaViruses</sparql>

Again, we rather make a graph dependency plot:

<sparql>allCoronaVirusesGraph</sparql>

This gives this output:

<iframe>allCoronaVirusesGraph</iframe>

### Comparing viruses

We can also query for articles that compare a human coronavirus with another coronavirus:

<sparql>compareViruses</sparql>

## NCBI Taxonomy IDs

For the coronaviruses we can list the <topic>NCBI Taxonomy</topic> [<cite>Q28740981</cite>,<cite>Q98169475</cite>] identifiers with:

<sparql>allSARSCoVVirusesTaxonomy</sparql>

This gives us:

<out>allSARSCoVVirusesTaxonomy</out>

## References

<references/>

