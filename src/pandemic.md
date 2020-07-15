# The pandemic

The total number of cases of the <topic>pandemic</topic> found with this query:

<sparql>earthAllCasesToday</sparql>

Which gives us:

<out>earthAllCasesToday</out>

## Virus <topic>transmission</topic>

The spread of the virus happens because the virus is too easily transmitted from
one human to another. Everyone should know about keeping a distance, because
small droplets due to, for example, coughing will contain the virus [citation needed].

But SARS-CoV-2 is also found to survive a certain amount of time after that,
for example, on surfaces [citation needed]. We can do the following query
to list which articles link human coronaviruses to survival on flat <topic>surfaces</topic>:

<sparql>surfacesCounts</sparql>

This shows us:

<out>surfacesCounts</out>

The query to actually list the articles about survival on surfaces of
the viruses, use the following query:

<sparql>surfaces</sparql>

Which shows us for the human coronaviruses these articles:

<out>surfaces</out>

## Progression

However, we may be more interested in the number of cases over time.
Then we need a more complex query suitable for statement qualifiers:

<sparql>earthAllCases</sparql>

If we want to make a line plot of the progression, we have to slightly
change the query:

<sparql>earthAllCasesLinePlot</sparql>

This gives us this time series:

<iframe>earthAllCasesLinePlot</iframe>

## Regional progression

Like Wikipedia, Wikidata has pages about pandemic for specific regions
as well. We can list them with this query:

<sparql>facets</sparql>

The list is very long, and to show it, you can open the above SPARQL page.

### Progression in The Netherlands

These facets can be used to look at just the <topic>progression</topic> on one region,
for example, just <topic>The Netherlands</topic>:

<sparql>progressionNL</sparql>

As the pandemic continues, the table has gotten long and a line plot may
be more useful;

<sparql>progressionNLlineplot</sparql>

Which shows:

<iframe>progressionNLlineplot</iframe>

### Progression in Italy

Of course, for Europeans the situation in <topic>Italy</topic> is burned
into our memory. We just change the Q-identifier for The Netherlands into that
of Italy:

<sparql>progressionIT</sparql>

### Progression in the U.S.A.

Currently, the total number of infected people is highest in the 
<topic>United States of America</topic>:

<sparql>progressionUS</sparql>

Which shows:

<iframe>progressionUS</iframe>

## Graphed Regional progression

### Cases

<sparql>graphCases</sparql>

This shows us:

<iframe>graphCases</iframe>

### Deaths

<sparql>graphDeaths</sparql>

