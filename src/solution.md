# Towards a solution

There is currently no solution for SARS-CoV-2.

But there are ideas about what solutions might be. A vaccine is one of them, but
development of that takes time [<cite>Q87461271</cite>]. But there is also talk about
antibodies and repurposing of drugs. All this is very much exploratory at this
moment. Clinical trials are important (see the [Clinical trials](https://egonw.github.io/SARS-CoV-2-Queries/covid.html#clinical-trials) section).

This Chapter shows a number of queries with information in Wikidata about
leads that people have proposed that may lead to a solution.

## Antibodies

Antibodies are getting an interest. The following query lists articles about
the human coronaviruses and also annotated with the term '<topic>antibody</topic>':

<sparql>antibodies</sparql>

The list is getting long, so let's first show the number of articles about
antibodies for each virus:

<out>antibodyCounts</out>

It must be stressed that antibodies are specific for every protein and every
coronavirus has different proteins, and this list is just to shortlist relevant
literature for reading, not to draw conclusions from:

<out limit="15">antibodies</out>

## Drug repurposing

The Section <xref>trials</xref> already listed an overview of clinical trials.
It gives an idea of what symptoms people are worried about. It also gives
insight in what <topic>drugs</topic> are studied for <topic>repurposing</topic>.
Some of these have received a lot of attention, others less so. They look like
this:

<iframe>interventionStructures</iframe>

The following query lists the number of clinical trials by <topic>intervention</topic>:

<sparql>clinicalTrialsByIntervention</sparql>

This gives:

<out limit="15">clinicalTrialsByIntervention</out>

Importantly, this list only gives an idea of what intervention have received more
attention than others. And it is essential to realize that attention is not a measure
of success.

## References

<references/>

