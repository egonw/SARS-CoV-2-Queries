# Literature

These queries list the latest 10 <topic>articles</topic> about a number of topics. It is
no replacement for [Scholia](https://tools.wmflabs.org/scholia/) [<cite>Q63433973</cite>],
which has a much richer overview of <topic>literature</topic> on the topic. Each section
includes a link to the Scholia page for that topic. The queries used here
are very basic, and only use the 'main subject' property.

## about SARS-CoV-2

[SARS-CoV-2](https://tools.wmflabs.org/scholia/topic/Q82069695) is the name of the virus.

<sparql>litSARSCoV2</sparql>

This gives these 10 papers:

<out limit="10">litSARSCoV2</out>

### about SARS-CoV-2 genes

We can also query for articles about the genes:

<sparql>litSARSCoV2Genes</sparql>

Which currently returns:

<out limit="10">litSARSCoV2Genes</out>

### about SARS-CoV-2 proteins

And about the virus proteins:

<sparql>litSARSCoV2Proteins</sparql>

Which currently returns:

<out limit="10">litSARSCoV2Proteins</out>

## about coronaviruses

As outlined in Chapter <xref>viruses</xref>, SARS-Cov-2 is one of the coronaviruses that
can infect humans.

<sparql>litCoronaviruses</sparql>

This gives these 10 papers:

<out limit="10">litCoronaviruses</out>

### about human coronaviruses

The seven human coronaviruses have more than 6000 thousand articles about
them in Wikidata. The following query therefore is a bit tuned for performance
and more complex. Also, the list is quite long, and not given on this page.
To see the output, click below in the name of the `litHumanCoronaviruses.rq` file:

<sparql>litHumanCoronaviruses</sparql>

Moreover, the number of articles for each virus varies significantly, which
can be visualized with this query:

<sparql>litHumanCoronavirusesCounts</sparql>

Which tells us:

<out>litHumanCoronavirusesCounts</out>

#### and their genes

<sparql>litHumanCoronavirusesGeneCounts</sparql>

Which shows us:

<out>litHumanCoronavirusesGeneCounts</out>

#### and their proteins

<sparql>litHumanCoronavirusesProteinCounts</sparql>

Where the counts are:

<out>litHumanCoronavirusesProteinCounts</out>

## References

<references/>
