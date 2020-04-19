<section level="#" label="viruses">ウイルス</section>

コロナウイルスは新しいものではなく、その仲間には全く危険ではないものもあります。
たとえば、ヒトコロナウイルスHCoV-229EおよびHCoV-OC43は通常よくある風邪[<cite>1Q366417501</cite>]を引き起こします。しかし、
<topic>重症急性呼吸器症候群に関連するコロナウイルス</topic>（<topic>SARSrウイルス</topic>）は異なります。そしてSRAS-CoV-2が本文書のメイントピックです。

## All SARSr viruses

The <topic>SARS-CoV-2</topic> <topic>virus</topic> is not the first <topic>coronavirus</topic> (CoV). In fact,
quite a few SARS-related CoVs are known, as clear from this
[NCBI Taxonomy list](https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?mode=Undef&id=694009&lvl=3&keep=1&srchmode=1&unlock).

We first list all the SARSr-CoV viruses in Wikidata:

<sparql>allSARSCoVViruses</sparql>

This gives us:

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

## 参考文献

<a name="citeref1"></a>Vrandečić D. Wikidata:A New Platform for Collaborative Data Collection.Proceedings of the 21st International Conference on World Wide Web.2012;1063–4\. doi:[10.1145/2187980.2188242](https://doi.org/10.1145/2187980.2188242) ([Scholia](https://tools.wmflabs.org/scholia/doi/10.1145/2187980.2188242))

