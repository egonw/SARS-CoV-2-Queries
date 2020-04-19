<section level="#" label="viruses">Virussen</section>

Coronavirussen zijn niet nieuw en sommige zijn niet echt gevaarlijk.
De menselijke coronavirusen HCoV-229E en HCoV-OC42 veroorzaken namelijk
normaal alleen een verkoudheid [<cite>Q36641750</cite>]. Echter, voor
de 
<topic>severe acute respiratory syndrome-gerelateerde coronavirussen</topic> (<topic>SARSr virussen</topic>)
is dat anders. Want SARS-CoV-2 is het hoofdonderwerp van dit boek.

## Alle SARSr virussen

Het <topic>SARS-CoV-2</topic> <topic>virus</topic> is niet het eerste <topic>coronavirus</topic> (CoV). Er zijn
namelijk behoorlijk veel SARS-gerelateerde CoVs bekend, zoals duidelijk is in
[deze NCBI Taxonomy lijst](https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?mode=Undef&id=694009&lvl=3&keep=1&srchmode=1&unlock).

Laten we eerste alle SARSr-CoV virussen in Wikidata opzoeken:

<sparql>allSARSCoVViruses</sparql>

Dit geeft ons:

<out>allSARSCoVViruses</out>

If we compare this list with that in Section <xref>sevenhuman</xref> we not that
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

This gives this output

<iframe>allBetacoronaVirusesGraph</iframe>

## All coronaviruses

The full list of coronaviruses looks like this:

<sparql>allCoronaViruses</sparql>

Again, we rather make a graph dependency plot:

<sparql>allCoronaVirusesGraph</sparql>

This gives this output

<iframe>allCoronaVirusesGraph</iframe>

<section level="##" label="sevenhuman">The seven coronaviruses that infect human</section>

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

