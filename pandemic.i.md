# The pandemic

The total number of cases of the <topic>pandemic</topic> found with this query:

<sparql>earthAllCasesToday</sparql>

Which gives us:

<out>earthAllCasesToday</out>

## Progression

However, we may be more interested in the number of cases over time.
Then we need a more complex query suitable for statement qualifiers:

<sparql>earthAllCases</sparql>

This gives us this time series:

<out>earthAllCases</out>

## Regional progression

Like Wikipedia, Wikidata has pages about pandemic for specific regions
as well. We can list them with this query:

<sparql>facets</sparql>

It gives, sadly, a long list:

<out>facets</out>

### Progression in The Netherlands

These facets can be used to look at just the <topic>progression</topic> on one region,
for example, just <topic>The Netherlands</topic>:

<sparql>progressionNL</sparql>

This tells us the following:

<out>progressionNL</out>

### Progression in Italy

Of course, for Europeans the situation in <topic>Italy</topic> is is burned
into our memory. We just change the Q-identifier for The Netherlands into that
of Italy:

<sparql>progressionIT</sparql>

This tells us the following:

<out>progressionIT</out>

## Graphed Regional progression

### Cases

<sparql>graphCases</sparql>

### Deaths

<sparql>graphDeaths</sparql>
