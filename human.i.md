# The Human

## Interacting genes and proteins

Understanding the biological processes by which the CoV virion works,
requires knowing which human genes and proteins are involves. This
is towards the next section of course, but we may first want to
know what literature has to say here (annotation is still limited):

<sparql>humanInteractionCounts</sparql>

This gives us these numbers of papers:

<out>humanInteractionCounts</out>

If you want to see the specific papers (a growing list), use this query:

<sparql>humanInteractions</sparql>

## Biological processes

[WikiPathways](https://wikipathways.org/) [<cite>Q42896569</cite>]
is one of the projects involved in the international
[#covidpathways COVID-19 curation effort](https://covid.pages.uni.lu/map_curation)
and the WikiPathways contributions can be found
on [this portal](http://covid.wikipathways.org/).

[Reactome](http://reactome.org/) [<cite>Q24567743</cite>] and WikiPathways pathways are indexed in Wikidata,
and we can query for pathways that have HCoV genes and proteins in their
pathways:

<sparql>pathways</sparql>

This currently lists the following pathways, but with the active curation,
it is expected to grow quickly too:

<out>pathways</out>

## References

<references/>
