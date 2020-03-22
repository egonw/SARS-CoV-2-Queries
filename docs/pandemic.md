# The pandemic

The total number of cases of the <a name="tp1">pandemic</a> found with this query:

**SPARQL** [sparql/earthAllCasesToday.rq](sparql/earthAllCasesToday.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3FnumberOfCases%20%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20wdt%3AP1603%20%3FnumberOfCases%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3FnumberOfCases%20%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20wdt%3AP1603%20%3FnumberOfCases%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?numberOfCases  WHERE {
  wd:Q81068910 wdt:P1603 ?numberOfCases .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

Which gives us:

<table>
  <tr>
    <td><b>numberOfCases</b></td>
  </tr>
  <tr>
    <td>266073</td>
  </tr>
</table>

## Progression

However, we may be more interested in the number of cases over time.
Then we need a more complex query suitable for statement qualifiers:

**SPARQL** [sparql/earthAllCases.rq](sparql/earthAllCases.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fdate%29%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fdate%29%0A))

```sparql
SELECT ?date ?numberOfCases WHERE {
  wd:Q81068910 p:P1603 ?numberOfCasesStat .
  ?numberOfCasesStat ps:P1603 ?numberOfCases ;
                     pq:P585 ?date .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
} ORDER BY ASC(?date)
```

This gives us this time series:

<table>
  <tr>
    <td><b>date</b></td>
    <td><b>numberOfCases</b></td>
  </tr>
  <tr>
    <td>2020-01-20T00:00:00Z</td>
    <td>282</td>
  </tr>
  <tr>
    <td>2020-01-21T00:00:00Z</td>
    <td>314</td>
  </tr>
  <tr>
    <td>2020-01-23T00:00:00Z</td>
    <td>581</td>
  </tr>
  <tr>
    <td>2020-01-24T00:00:00Z</td>
    <td>846</td>
  </tr>
  <tr>
    <td>2020-01-25T00:00:00Z</td>
    <td>1320</td>
  </tr>
  <tr>
    <td>2020-01-26T00:00:00Z</td>
    <td>2014</td>
  </tr>
  <tr>
    <td>2020-01-27T00:00:00Z</td>
    <td>2798</td>
  </tr>
  <tr>
    <td>2020-01-28T00:00:00Z</td>
    <td>4596</td>
  </tr>
  <tr>
    <td>2020-01-29T00:00:00Z</td>
    <td>6065</td>
  </tr>
  <tr>
    <td>2020-01-30T00:00:00Z</td>
    <td>7818</td>
  </tr>
  <tr>
    <td>2020-01-31T00:00:00Z</td>
    <td>9826</td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td>11953</td>
  </tr>
  <tr>
    <td>2020-02-02T00:00:00Z</td>
    <td>14557</td>
  </tr>
  <tr>
    <td>2020-02-03T00:00:00Z</td>
    <td>17391</td>
  </tr>
  <tr>
    <td>2020-02-04T00:00:00Z</td>
    <td>20630</td>
  </tr>
  <tr>
    <td>2020-02-05T00:00:00Z</td>
    <td>24554</td>
  </tr>
  <tr>
    <td>2020-02-06T00:00:00Z</td>
    <td>28276</td>
  </tr>
  <tr>
    <td>2020-02-07T00:00:00Z</td>
    <td>31481</td>
  </tr>
  <tr>
    <td>2020-02-08T00:00:00Z</td>
    <td>34886</td>
  </tr>
  <tr>
    <td>2020-02-09T00:00:00Z</td>
    <td>37558</td>
  </tr>
  <tr>
    <td>2020-02-10T00:00:00Z</td>
    <td>40554</td>
  </tr>
  <tr>
    <td>2020-02-11T00:00:00Z</td>
    <td>43103</td>
  </tr>
  <tr>
    <td>2020-02-12T00:00:00Z</td>
    <td>45171</td>
  </tr>
  <tr>
    <td>2020-02-13T00:00:00Z</td>
    <td>46997</td>
  </tr>
  <tr>
    <td>2020-02-13T00:00:00Z</td>
    <td>60329</td>
  </tr>
  <tr>
    <td>2020-02-14T00:00:00Z</td>
    <td>49053</td>
  </tr>
  <tr>
    <td>2020-02-14T00:00:00Z</td>
    <td>64437</td>
  </tr>
  <tr>
    <td>2020-02-15T00:00:00Z</td>
    <td>50580</td>
  </tr>
  <tr>
    <td>2020-02-15T00:00:00Z</td>
    <td>67102</td>
  </tr>
  <tr>
    <td>2020-02-16T00:00:00Z</td>
    <td>69267</td>
  </tr>
  <tr>
    <td>2020-02-16T00:00:00Z</td>
    <td>51857</td>
  </tr>
  <tr>
    <td>2020-02-17T00:00:00Z</td>
    <td>71429</td>
  </tr>
  <tr>
    <td>2020-02-18T00:00:00Z</td>
    <td>73332</td>
  </tr>
  <tr>
    <td>2020-02-19T00:00:00Z</td>
    <td>75204</td>
  </tr>
  <tr>
    <td>2020-02-20T00:00:00Z</td>
    <td>75748</td>
  </tr>
  <tr>
    <td>2020-02-21T00:00:00Z</td>
    <td>76769</td>
  </tr>
  <tr>
    <td>2020-02-22T00:00:00Z</td>
    <td>77794</td>
  </tr>
  <tr>
    <td>2020-02-23T00:00:00Z</td>
    <td>78811</td>
  </tr>
  <tr>
    <td>2020-02-24T00:00:00Z</td>
    <td>79331</td>
  </tr>
  <tr>
    <td>2020-02-25T00:00:00Z</td>
    <td>80239</td>
  </tr>
  <tr>
    <td>2020-02-26T00:00:00Z</td>
    <td>81109</td>
  </tr>
  <tr>
    <td>2020-02-27T00:00:00Z</td>
    <td>82294</td>
  </tr>
  <tr>
    <td>2020-02-28T00:00:00Z</td>
    <td>83652</td>
  </tr>
  <tr>
    <td>2020-02-29T00:00:00Z</td>
    <td>85403</td>
  </tr>
  <tr>
    <td>2020-03-01T00:00:00Z</td>
    <td>87137</td>
  </tr>
  <tr>
    <td>2020-03-02T00:00:00Z</td>
    <td>88948</td>
  </tr>
  <tr>
    <td>2020-03-03T00:00:00Z</td>
    <td>90869</td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td>93090</td>
  </tr>
  <tr>
    <td>2020-03-05T00:00:00Z</td>
    <td>95333</td>
  </tr>
  <tr>
    <td>2020-03-06T00:00:00Z</td>
    <td>98192</td>
  </tr>
  <tr>
    <td>2020-03-07T00:00:00Z</td>
    <td>101927</td>
  </tr>
  <tr>
    <td>2020-03-08T00:00:00Z</td>
    <td>105586</td>
  </tr>
  <tr>
    <td>2020-03-09T00:00:00Z</td>
    <td>109578</td>
  </tr>
  <tr>
    <td>2020-03-10T00:00:00Z</td>
    <td>113702</td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td>118326</td>
  </tr>
  <tr>
    <td>2020-03-12T00:00:00Z</td>
    <td>125048</td>
  </tr>
  <tr>
    <td>2020-03-13T00:00:00Z</td>
    <td>132758</td>
  </tr>
  <tr>
    <td>2020-03-14T00:00:00Z</td>
    <td>142539</td>
  </tr>
  <tr>
    <td>2020-03-15T00:00:00Z</td>
    <td>153517</td>
  </tr>
  <tr>
    <td>2020-03-16T00:00:00Z</td>
    <td>167511</td>
  </tr>
  <tr>
    <td>2020-03-17T00:00:00Z</td>
    <td>179112</td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td>191127</td>
  </tr>
  <tr>
    <td>2020-03-19T00:00:00Z</td>
    <td>209839</td>
  </tr>
  <tr>
    <td>2020-03-20T00:00:00Z</td>
    <td>234073</td>
  </tr>
  <tr>
    <td>2020-03-21T00:00:00Z</td>
    <td>266073</td>
  </tr>
</table>

## Regional progression

Like Wikipedia, Wikidata has pages about pandemic for specific regions
as well. We can list them with this query:

**SPARQL** [sparql/facets.rq](sparql/facets.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Ffacet%20%3FfacetLabel%20WHERE%20%7B%0A%20%20%3Ffacet%20wdt%3AP1269%20wd%3AQ81068910%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A), [edit](https://query.wikidata.org/#SELECT%20%3Ffacet%20%3FfacetLabel%20WHERE%20%7B%0A%20%20%3Ffacet%20wdt%3AP1269%20wd%3AQ81068910%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A))

```sparql
SELECT ?facet ?facetLabel WHERE {
  ?facet wdt:P1269 wd:Q81068910 .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

It gives, sadly, a long list:

<table>
  <tr>
    <td><b>facet</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83493517">timeline of the 2019–20 coronavirus outbreak</a> (<a href="http://www.wikidata.org/entity/Q83493517">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83741704">2019–20 coronavirus pandemic  by country and territory</a> (<a href="http://www.wikidata.org/entity/Q83741704">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83872271">2019–20 coronavirus pandemic in mainland China</a> (<a href="http://www.wikidata.org/entity/Q83872271">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83872291">2019–20 coronavirus outbreak in Japan</a> (<a href="http://www.wikidata.org/entity/Q83872291">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83872398">2019–20 COVID-19 outbreak in South Korea</a> (<a href="http://www.wikidata.org/entity/Q83872398">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83873057">2019–20 coronavirus outbreak in Vietnam</a> (<a href="http://www.wikidata.org/entity/Q83873057">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83873387">2019–20 coronavirus outbreak in Singapore</a> (<a href="http://www.wikidata.org/entity/Q83873387">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83873548">2019–20 coronavirus outbreak in Australia</a> (<a href="http://www.wikidata.org/entity/Q83873548">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83873556">2019–20 coronavirus outbreak in Malaysia</a> (<a href="http://www.wikidata.org/entity/Q83873556">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83873566">2019–20 coronavirus outbreak in Thailand</a> (<a href="http://www.wikidata.org/entity/Q83873566">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83873573">2019–20 coronavirus outbreak in Nepal</a> (<a href="http://www.wikidata.org/entity/Q83873573">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83873577">2020 COVID-19 pandemic in the United States</a> (<a href="http://www.wikidata.org/entity/Q83873577">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83873580">2020 coronavirus pandemic in Canada</a> (<a href="http://www.wikidata.org/entity/Q83873580">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83873593">2020 coronavirus pandemic in France</a> (<a href="http://www.wikidata.org/entity/Q83873593">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83888864">2019–20 coronavirus outbreak in Cambodia</a> (<a href="http://www.wikidata.org/entity/Q83888864">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83889114">2019–20 coronavirus outbreak in Sri Lanka</a> (<a href="http://www.wikidata.org/entity/Q83889114">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q83889294">2020 coronavirus pandemic in Germany</a> (<a href="http://www.wikidata.org/entity/Q83889294">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84030045">2019–20 coronavirus outbreak in the United Arab Emirates</a> (<a href="http://www.wikidata.org/entity/Q84030045">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84055415">2019–20 coronavirus outbreak in Finland</a> (<a href="http://www.wikidata.org/entity/Q84055415">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84055514">2020 coronavirus pandemic in India</a> (<a href="http://www.wikidata.org/entity/Q84055514">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84055544">2019–20 coronavirus outbreak in the Philippines</a> (<a href="http://www.wikidata.org/entity/Q84055544">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84056433">controversy surrounding the 2019–20 Wuhan coronavirus outbreak</a> (<a href="http://www.wikidata.org/entity/Q84056433">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84081307">2019–20 coronavirus outbreak in Taiwan</a> (<a href="http://www.wikidata.org/entity/Q84081307">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84081576">2020 coronavirus pandemic in Sweden</a> (<a href="http://www.wikidata.org/entity/Q84081576">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84098939">2019–20 coronavirus outbreak in Russia</a> (<a href="http://www.wikidata.org/entity/Q84098939">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84104992">2020 coronavirus pandemic in Italy</a> (<a href="http://www.wikidata.org/entity/Q84104992">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84166704">2020 coronavirus pandemic in Spain</a> (<a href="http://www.wikidata.org/entity/Q84166704">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84167106">2020 coronavirus pandemic in the United Kingdom</a> (<a href="http://www.wikidata.org/entity/Q84167106">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84318312">xenophobia and racism related to the 2019–20 Wuhan coronavirus outbreak</a> (<a href="http://www.wikidata.org/entity/Q84318312">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84446340">2020 coronavirus pandemic in Belgium</a> (<a href="http://www.wikidata.org/entity/Q84446340">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q84897850">Timeline of the 2019–20 Wuhan coronavirus outbreak in November 2019 – January 2020</a> (<a href="http://www.wikidata.org/entity/Q84897850">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q85173855">2019–20 coronavirus outbreak data tables</a> (<a href="http://www.wikidata.org/entity/Q85173855">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q85853067">list of medical professionals who died during the 2019–20 coronavirus outbreak</a> (<a href="http://www.wikidata.org/entity/Q85853067">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q85876114">2020 coronavirus outbreak in Iran</a> (<a href="http://www.wikidata.org/entity/Q85876114">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86597685">2020 coronavirus outbreak in Denmark</a> (<a href="http://www.wikidata.org/entity/Q86597685">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86597695">2020 COVID-19 outbreak in Brazil</a> (<a href="http://www.wikidata.org/entity/Q86597695">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86628344">2020 coronavirus outbreak in Mexico</a> (<a href="http://www.wikidata.org/entity/Q86628344">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86675924">2019–20 coronavirus outbreak in North Korea</a> (<a href="http://www.wikidata.org/entity/Q86675924">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86717788">2020 coronavirus pandemic in Switzerland</a> (<a href="http://www.wikidata.org/entity/Q86717788">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86733728">2020 coronavirus outbreak in Iraq</a> (<a href="http://www.wikidata.org/entity/Q86733728">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86756826">2020 coronavirus outbreak in the Netherlands</a> (<a href="http://www.wikidata.org/entity/Q86756826">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86847911">2020 coronavirus pandemic in Austria</a> (<a href="http://www.wikidata.org/entity/Q86847911">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86886544">2020 coronavirus pandemic in Norway</a> (<a href="http://www.wikidata.org/entity/Q86886544">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86901049">COVID-19 testing</a> (<a href="http://www.wikidata.org/entity/Q86901049">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86913546">2020 coronavirus pandemic in Indonesia</a> (<a href="http://www.wikidata.org/entity/Q86913546">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86919406">2020 coronavirus outbreak in the Czech Republic</a> (<a href="http://www.wikidata.org/entity/Q86919406">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86926476">2020 coronavirus outbreak in Girona</a> (<a href="http://www.wikidata.org/entity/Q86926476">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q86948603">2020 coronavirus pandemic in Portugal</a> (<a href="http://www.wikidata.org/entity/Q86948603">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87058723">2020 coronavirus outbreak in Morocco</a> (<a href="http://www.wikidata.org/entity/Q87058723">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87066621">2020 coronavirus outbreak in Latvia</a> (<a href="http://www.wikidata.org/entity/Q87066621">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87068864">2020 coronavirus pandemic in Greece</a> (<a href="http://www.wikidata.org/entity/Q87068864">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87070975">2020 coronavirus pandemic in Israel</a> (<a href="http://www.wikidata.org/entity/Q87070975">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87070999">2020 coronavirus outbreak in Bahrain</a> (<a href="http://www.wikidata.org/entity/Q87070999">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87073833">Travel restrictions related to the 2019–20 coronavirus outbreak</a> (<a href="http://www.wikidata.org/entity/Q87073833">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87116829">2020 coronavirus outbreak in Egypt</a> (<a href="http://www.wikidata.org/entity/Q87116829">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87119811">2020 coronavirus pandemic in Hungary</a> (<a href="http://www.wikidata.org/entity/Q87119811">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87121993">2020 coronavirus outbreak in Iceland</a> (<a href="http://www.wikidata.org/entity/Q87121993">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87123561">2020 coronavirus outbreak in San Marino</a> (<a href="http://www.wikidata.org/entity/Q87123561">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87186117">2020 coronavirus outbreak in Saudi Arabia</a> (<a href="http://www.wikidata.org/entity/Q87186117">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87186365">2020 coronavirus outbreak in the Republic of Ireland</a> (<a href="http://www.wikidata.org/entity/Q87186365">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87191204">2020 coronavirus outbreak in Chile</a> (<a href="http://www.wikidata.org/entity/Q87191204">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87193778">2020 coronavirus outbreak in Serbia</a> (<a href="http://www.wikidata.org/entity/Q87193778">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87199320">2020 coronavirus pandemic in the State of Palestine</a> (<a href="http://www.wikidata.org/entity/Q87199320">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87200954">2020 coronavirus outbreak in Slovakia</a> (<a href="http://www.wikidata.org/entity/Q87200954">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87202921">2020 coronavirus outbreak in Algeria</a> (<a href="http://www.wikidata.org/entity/Q87202921">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87204911">2020 coronavirus outbreak in Estonia</a> (<a href="http://www.wikidata.org/entity/Q87204911">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87222526">2020 coronavirus outbreak in Vatican City</a> (<a href="http://www.wikidata.org/entity/Q87222526">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87235137">2020 coronavirus outbreak in Argentina</a> (<a href="http://www.wikidata.org/entity/Q87235137">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87235177">2020 coronavirus outbreak in Ukraine</a> (<a href="http://www.wikidata.org/entity/Q87235177">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87243915">2020 coronavirus outbreak in South Africa</a> (<a href="http://www.wikidata.org/entity/Q87243915">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87245450">2020 coronavirus outbreak in Lebanon</a> (<a href="http://www.wikidata.org/entity/Q87245450">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250691">2020 coronavirus outbreak in Kuwait</a> (<a href="http://www.wikidata.org/entity/Q87250691">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250695">2020 coronavirus pandemic in Poland</a> (<a href="http://www.wikidata.org/entity/Q87250695">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250713">2020 coronavirus outbreak in Ecuador</a> (<a href="http://www.wikidata.org/entity/Q87250713">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250732">2020 coronavirus outbreak in Croatia</a> (<a href="http://www.wikidata.org/entity/Q87250732">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250752">2020 coronavirus pandemic in Romania</a> (<a href="http://www.wikidata.org/entity/Q87250752">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250770">2020 coronavirus outbreak in Bosnia and Herzegovina</a> (<a href="http://www.wikidata.org/entity/Q87250770">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250788">2020 coronavirus outbreak in Belarus</a> (<a href="http://www.wikidata.org/entity/Q87250788">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250803">2020 coronavirus outbreak in New Zealand</a> (<a href="http://www.wikidata.org/entity/Q87250803">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250819">2020 coronavirus pandemic in Liechtenstein</a> (<a href="http://www.wikidata.org/entity/Q87250819">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250838">2020 coronavirus outbreak in Lithuania</a> (<a href="http://www.wikidata.org/entity/Q87250838">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250860">2020 coronavirus outbreak in Luxembourg</a> (<a href="http://www.wikidata.org/entity/Q87250860">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250877">2020 coronavirus outbreak in Monaco</a> (<a href="http://www.wikidata.org/entity/Q87250877">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250897">2020 coronavirus outbreak in North Macedonia</a> (<a href="http://www.wikidata.org/entity/Q87250897">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250913">2020 coronavirus outbreak in Georgia</a> (<a href="http://www.wikidata.org/entity/Q87250913">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250930">2020 coronavirus outbreak in Cameroon</a> (<a href="http://www.wikidata.org/entity/Q87250930">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87250948">2020 coronavirus pandemic in Slovenia</a> (<a href="http://www.wikidata.org/entity/Q87250948">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87343682">2020 coronavirus outbreak in Tunisia</a> (<a href="http://www.wikidata.org/entity/Q87343682">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87412028">2020 coronavirus outbreak in Brunei</a> (<a href="http://www.wikidata.org/entity/Q87412028">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87450756">2020 coronavirus outbreak in Albania</a> (<a href="http://www.wikidata.org/entity/Q87450756">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87452683">2020 coronavirus pandemic in Basque Country</a> (<a href="http://www.wikidata.org/entity/Q87452683">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87454162">2020 coronavirus outbreak in Oman</a> (<a href="http://www.wikidata.org/entity/Q87454162">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87468681">Q87468681</a> (<a href="http://www.wikidata.org/entity/Q87468681">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87473205">2020 coronavirus outbreak in Turkey</a> (<a href="http://www.wikidata.org/entity/Q87473205">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87477462">2020 coronavirus outbreak in Costa Rica</a> (<a href="http://www.wikidata.org/entity/Q87477462">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87477841">2020 coronavirus outbreak in Panama</a> (<a href="http://www.wikidata.org/entity/Q87477841">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87479384">cancelled event due to the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q87479384">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87480220">2020 coronavirus outbreak in Bolivia</a> (<a href="http://www.wikidata.org/entity/Q87480220">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87483673">2020 coronavirus pandemic in Colombia</a> (<a href="http://www.wikidata.org/entity/Q87483673">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87486535">2020 coronavirus pandemic in Bulgaria</a> (<a href="http://www.wikidata.org/entity/Q87486535">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88137634">2020 coronavirus pandemic in Papua New Guinea</a> (<a href="http://www.wikidata.org/entity/Q88137634">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88164033">2020 coronavirus pandemic in Zimbabwe</a> (<a href="http://www.wikidata.org/entity/Q88164033">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88177037">2020 coronavirus outbreak in Catalonia</a> (<a href="http://www.wikidata.org/entity/Q88177037">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88221447">non-pharmaceutical countermeasure</a> (<a href="http://www.wikidata.org/entity/Q88221447">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88240100">COVID-19 intensive care treatment occurrence</a> (<a href="http://www.wikidata.org/entity/Q88240100">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87491759">domestic responses to the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q87491759">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87540454">2020 coronavirus pandemic in Bangladesh</a> (<a href="http://www.wikidata.org/entity/Q87540454">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87563855">2020 coronavirus pandemic in the Dominican Republic</a> (<a href="http://www.wikidata.org/entity/Q87563855">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87580938">2020 coronavirus pandemic in Cyprus</a> (<a href="http://www.wikidata.org/entity/Q87580938">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87587760">2020 coronavirus pandemic in Malta</a> (<a href="http://www.wikidata.org/entity/Q87587760">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87587763">2020 coronavirus pandemic in Peru</a> (<a href="http://www.wikidata.org/entity/Q87587763">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87589123">2020 coronavirus pandemic in Paraguay</a> (<a href="http://www.wikidata.org/entity/Q87589123">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87589148">2020 coronavirus pandemic in Jordan</a> (<a href="http://www.wikidata.org/entity/Q87589148">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87589392">2020 coronavirus pandemic in Honduras</a> (<a href="http://www.wikidata.org/entity/Q87589392">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87589400">Impact of the 2019–20 coronavirus pandemic on sports</a> (<a href="http://www.wikidata.org/entity/Q87589400">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87590993">2020 coronavirus pandemic in Cuba</a> (<a href="http://www.wikidata.org/entity/Q87590993">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87592982">2020 coronavirus pandemic in Moldova</a> (<a href="http://www.wikidata.org/entity/Q87592982">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87610822">2020 coronavirus pandemic in Jamaica</a> (<a href="http://www.wikidata.org/entity/Q87610822">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87625383">Impact of the 2019–20 coronavirus pandemic on aviation</a> (<a href="http://www.wikidata.org/entity/Q87625383">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87625385">Impact of the 2019–20 coronavirus pandemic on cinema</a> (<a href="http://www.wikidata.org/entity/Q87625385">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87648634">2020 coronavirus pandemic in Armenia</a> (<a href="http://www.wikidata.org/entity/Q87648634">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87651970">2020 coronavirus pandemic in Guinea</a> (<a href="http://www.wikidata.org/entity/Q87651970">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87651995">2020 coronavirus pandemic in Kazakhstan</a> (<a href="http://www.wikidata.org/entity/Q87651995">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87652000">2020 coronavirus pandemic in Pakistan</a> (<a href="http://www.wikidata.org/entity/Q87652000">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87652010">2020 coronavirus pandemic in Venezuela</a> (<a href="http://www.wikidata.org/entity/Q87652010">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87655119">2020 coronavirus pandemic in Kosovo</a> (<a href="http://www.wikidata.org/entity/Q87655119">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87655120">2020 coronavirus pandemic in the Community of Madrid</a> (<a href="http://www.wikidata.org/entity/Q87655120">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87657486">2020 coronavirus pandemic in Sudan</a> (<a href="http://www.wikidata.org/entity/Q87657486">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87659698">2020 coronavirus pandemic in Guyana</a> (<a href="http://www.wikidata.org/entity/Q87659698">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87660365">2020 coronavirus pandemic in Uruguay</a> (<a href="http://www.wikidata.org/entity/Q87660365">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87662819">2020 coronavirus pandemic in Togo</a> (<a href="http://www.wikidata.org/entity/Q87662819">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87662895">2020 coronavirus pandemic in the Maldives</a> (<a href="http://www.wikidata.org/entity/Q87662895">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87664046">2020 coronavirus pandemic in Suriname</a> (<a href="http://www.wikidata.org/entity/Q87664046">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87665038">2020 coronavirus pandemic in Ethiopia</a> (<a href="http://www.wikidata.org/entity/Q87665038">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87665364">2020 coronavirus pandemic in Burkina Faso</a> (<a href="http://www.wikidata.org/entity/Q87665364">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87666042">2020 coronavirus pandemic in Gabon</a> (<a href="http://www.wikidata.org/entity/Q87666042">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87666247">2020 coronavirus pandemic in Ghana</a> (<a href="http://www.wikidata.org/entity/Q87666247">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87669612">2020 coronavirus pandemic in Guatemala</a> (<a href="http://www.wikidata.org/entity/Q87669612">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87687648">2020 coronavirus pandemic in Saint Vincent and the Grenadines</a> (<a href="http://www.wikidata.org/entity/Q87687648">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87694131">2020 coronavirus pandemic in Trinidad and Tobago</a> (<a href="http://www.wikidata.org/entity/Q87694131">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87704267">2020 coronavirus pandemic in Ivory Coast</a> (<a href="http://www.wikidata.org/entity/Q87704267">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87705884">2020 coronavirus pandemic in Kenya</a> (<a href="http://www.wikidata.org/entity/Q87705884">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87706558">2020 coronavirus pandemic in the Democratic Republic of the Congo</a> (<a href="http://www.wikidata.org/entity/Q87706558">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87707727">2020 coronavirus pandemic in Saint Lucia</a> (<a href="http://www.wikidata.org/entity/Q87707727">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87708331">2020 coronavirus pandemic in Antigua and Barbuda</a> (<a href="http://www.wikidata.org/entity/Q87708331">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87708719">2020 coronavirus pandemic in Aruba</a> (<a href="http://www.wikidata.org/entity/Q87708719">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87708832">2020 coronavirus pandemic in Mongolia</a> (<a href="http://www.wikidata.org/entity/Q87708832">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87709760">2020 coronavirus pandemic in Curaçao</a> (<a href="http://www.wikidata.org/entity/Q87709760">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87709900">2020 coronavirus pandemic in Mauritania</a> (<a href="http://www.wikidata.org/entity/Q87709900">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87709973">2020 coronavirus pandemic in Eswatini</a> (<a href="http://www.wikidata.org/entity/Q87709973">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87714704">2020 coronavirus pandemic in Rwanda</a> (<a href="http://www.wikidata.org/entity/Q87714704">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87715166">2020 coronavirus pandemic in Bhutan</a> (<a href="http://www.wikidata.org/entity/Q87715166">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87715843">2020 coronavirus pandemic in Andorra</a> (<a href="http://www.wikidata.org/entity/Q87715843">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87718451">2020 coronavirus pandemic in Nigeria</a> (<a href="http://www.wikidata.org/entity/Q87718451">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87719499">Impact of the 2019–20 coronavirus pandemic on television</a> (<a href="http://www.wikidata.org/entity/Q87719499">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87722485">2020 coronavirus pandemic in Azerbaijan</a> (<a href="http://www.wikidata.org/entity/Q87722485">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87729500">2020 coronavirus pandemic in Seychelles</a> (<a href="http://www.wikidata.org/entity/Q87729500">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87729501">2020 coronavirus pandemic in Namibia</a> (<a href="http://www.wikidata.org/entity/Q87729501">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87733671">2020 coronavirus pandemic in Qatar</a> (<a href="http://www.wikidata.org/entity/Q87733671">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87742064">2020 coronavirus pandemic in Equatorial Guinea</a> (<a href="http://www.wikidata.org/entity/Q87742064">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87742085">2020 coronavirus pandemic in the Central African Republic</a> (<a href="http://www.wikidata.org/entity/Q87742085">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87742114">2020 coronavirus pandemic in the Republic of the Congo</a> (<a href="http://www.wikidata.org/entity/Q87742114">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87743173">2020 coronavirus pandemic in Northern Cyprus</a> (<a href="http://www.wikidata.org/entity/Q87743173">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87745903">2020 coronavirus pandemic in Senegal</a> (<a href="http://www.wikidata.org/entity/Q87745903">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87755488">2020 coronavirus pandemic in the Bahamas</a> (<a href="http://www.wikidata.org/entity/Q87755488">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87760968">Impact of the 2019–20 coronavirus pandemic on education</a> (<a href="http://www.wikidata.org/entity/Q87760968">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87766242">2020 coronavirus pandemic in Liberia</a> (<a href="http://www.wikidata.org/entity/Q87766242">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87768605">2020 coronavirus pandemic in Afghanistan</a> (<a href="http://www.wikidata.org/entity/Q87768605">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87770645">2020 coronavirus pandemic in Somalia</a> (<a href="http://www.wikidata.org/entity/Q87770645">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87770827">2020 coronavirus pandemic in Tanzania</a> (<a href="http://www.wikidata.org/entity/Q87770827">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87774378">Timeline of the 2019–20 coronavirus pandemic in March 2020</a> (<a href="http://www.wikidata.org/entity/Q87774378">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87781572">2020 coronavirus pandemic in Benin</a> (<a href="http://www.wikidata.org/entity/Q87781572">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87785296">2020 coronavirus pandemic in Greenland</a> (<a href="http://www.wikidata.org/entity/Q87785296">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87796964">Human rights issues during the 2019–20 coronavirus pandemic</a> (<a href="http://www.wikidata.org/entity/Q87796964">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87814953">2020 coronavirus pandemic in Syria</a> (<a href="http://www.wikidata.org/entity/Q87814953">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87887813">2020 coronavirus pandemic in Montenegro</a> (<a href="http://www.wikidata.org/entity/Q87887813">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87897344">Impact of the 2019–20 coronavirus pandemic on politics</a> (<a href="http://www.wikidata.org/entity/Q87897344">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87898060">Impact of the 2019–20 coronavirus pandemic on religion</a> (<a href="http://www.wikidata.org/entity/Q87898060">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87899016">2020 coronavirus pandemic in the Gambia</a> (<a href="http://www.wikidata.org/entity/Q87899016">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87899022">2020 coronavirus pandemic in Djibouti</a> (<a href="http://www.wikidata.org/entity/Q87899022">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87901408">2020 coronavirus pandemic in Alberta</a> (<a href="http://www.wikidata.org/entity/Q87901408">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87902950">2020 coronavirus pandemic in Kyrgyzstan</a> (<a href="http://www.wikidata.org/entity/Q87902950">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87975745">2020 coronavirus pandemic in Fiji</a> (<a href="http://www.wikidata.org/entity/Q87975745">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87976489">2020 coronavirus pandemic in El Salvador</a> (<a href="http://www.wikidata.org/entity/Q87976489">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87976629">2020 coronavirus pandemic in Zambia</a> (<a href="http://www.wikidata.org/entity/Q87976629">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87976701">2020 coronavirus pandemic in Nicaragua</a> (<a href="http://www.wikidata.org/entity/Q87976701">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87979033">2020 coronavirus pandemic in Mauritius</a> (<a href="http://www.wikidata.org/entity/Q87979033">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q87985395">COVID-19 pandemic/statistic</a> (<a href="http://www.wikidata.org/entity/Q87985395">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88024576">2020 coronavirus pandemic in Quebec</a> (<a href="http://www.wikidata.org/entity/Q88024576">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082409">2020 coronavirus pandemic in Akrotiri and Dhekelia</a> (<a href="http://www.wikidata.org/entity/Q88082409">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082534">2020 coronavirus pandemic in Angola</a> (<a href="http://www.wikidata.org/entity/Q88082534">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082556">2020 coronavirus pandemic in Bermuda</a> (<a href="http://www.wikidata.org/entity/Q88082556">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082587">2020 coronavirus pandemic in British Columbia</a> (<a href="http://www.wikidata.org/entity/Q88082587">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082622">2020 coronavirus pandemic in Canary Islands</a> (<a href="http://www.wikidata.org/entity/Q88082622">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082639">2020 coronavirus pandemic in Cape Verde</a> (<a href="http://www.wikidata.org/entity/Q88082639">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082670">2020 coronavirus pandemic in Chad</a> (<a href="http://www.wikidata.org/entity/Q88082670">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082693">2020 coronavirus pandemic in Haiti</a> (<a href="http://www.wikidata.org/entity/Q88082693">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082727">2020 coronavirus pandemic in Klang Valley</a> (<a href="http://www.wikidata.org/entity/Q88082727">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082758">2020 coronavirus pandemic in Metro Manila</a> (<a href="http://www.wikidata.org/entity/Q88082758">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082786">2020 coronavirus pandemic in New Brunswick</a> (<a href="http://www.wikidata.org/entity/Q88082786">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082809">2020 coronavirus pandemic in Niger</a> (<a href="http://www.wikidata.org/entity/Q88082809">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082830">2020 coronavirus pandemic in Ontario</a> (<a href="http://www.wikidata.org/entity/Q88082830">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082857">2020 coronavirus pandemic in Sabah</a> (<a href="http://www.wikidata.org/entity/Q88082857">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082922">2020 coronavirus pandemic in Sint Maarten</a> (<a href="http://www.wikidata.org/entity/Q88082922">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q88082994">2020 coronavirus pandemic in the Isle of Man</a> (<a href="http://www.wikidata.org/entity/Q88082994">edit</a>)</td>
  </tr>
</table>

### Progression in The Netherlands

These facets can be used to look at just the <a name="tp2">progression</a> on one region,
for example, just <a name="tp3">The Netherlands</a>:

**SPARQL** [sparql/progressionNL.rq](sparql/progressionNL.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ86756826%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fdate%29%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ86756826%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fdate%29%0A))

```sparql
SELECT ?date ?numberOfCases WHERE {
  wd:Q86756826 p:P1603 ?numberOfCasesStat .
  ?numberOfCasesStat ps:P1603 ?numberOfCases ;
                     pq:P585 ?date .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
} ORDER BY ASC(?date)
```

This tells us the following:

<table>
  <tr>
    <td><b>date</b></td>
    <td><b>numberOfCases</b></td>
  </tr>
  <tr>
    <td>2020-02-27T00:00:00Z</td>
    <td>1</td>
  </tr>
  <tr>
    <td>2020-02-28T00:00:00Z</td>
    <td>2</td>
  </tr>
  <tr>
    <td>2020-02-28T00:00:00Z</td>
    <td>2</td>
  </tr>
  <tr>
    <td>2020-03-01T00:00:00Z</td>
    <td>10</td>
  </tr>
  <tr>
    <td>2020-03-02T00:00:00Z</td>
    <td>18</td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td>38</td>
  </tr>
  <tr>
    <td>2020-03-05T00:00:00Z</td>
    <td>82</td>
  </tr>
  <tr>
    <td>2020-03-07T00:00:00Z</td>
    <td>188</td>
  </tr>
  <tr>
    <td>2020-03-07T00:00:00Z</td>
    <td>128</td>
  </tr>
  <tr>
    <td>2020-03-08T00:00:00Z</td>
    <td>265</td>
  </tr>
  <tr>
    <td>2020-03-09T00:00:00Z</td>
    <td>321</td>
  </tr>
  <tr>
    <td>2020-03-10T00:00:00Z</td>
    <td>382</td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td>503</td>
  </tr>
  <tr>
    <td>2020-03-12T00:00:00Z</td>
    <td>614</td>
  </tr>
  <tr>
    <td>2020-03-13T00:00:00Z</td>
    <td>804</td>
  </tr>
  <tr>
    <td>2020-03-14T00:00:00Z</td>
    <td>959</td>
  </tr>
  <tr>
    <td>2020-03-15T00:00:00Z</td>
    <td>1135</td>
  </tr>
  <tr>
    <td>2020-03-16T00:00:00Z</td>
    <td>1413</td>
  </tr>
  <tr>
    <td>2020-03-16T00:00:00Z</td>
    <td>11</td>
  </tr>
  <tr>
    <td>2020-03-17T00:00:00Z</td>
    <td>1705</td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td>2051</td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td>1705</td>
  </tr>
  <tr>
    <td>2020-03-19T00:00:00Z</td>
    <td>2460</td>
  </tr>
  <tr>
    <td>2020-03-20T00:00:00Z</td>
    <td>2994</td>
  </tr>
  <tr>
    <td>2020-03-21T00:00:00Z</td>
    <td>3631</td>
  </tr>
</table>

### Progression in Italy

Of course, for Europeans the situation in <a name="tp4">Italy</a> is is burned
into our memory. We just change the Q-identifier for The Netherlands into that
of Italy:

**SPARQL** [sparql/progressionIT.rq](sparql/progressionIT.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ84104992%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fdate%29%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ84104992%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fdate%29%0A))

```sparql
SELECT ?date ?numberOfCases WHERE {
  wd:Q84104992 p:P1603 ?numberOfCasesStat .
  ?numberOfCasesStat ps:P1603 ?numberOfCases ;
                     pq:P585 ?date .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
} ORDER BY ASC(?date)
```

This tells us the following:

<table>
  <tr>
    <td><b>date</b></td>
    <td><b>numberOfCases</b></td>
  </tr>
  <tr>
    <td>2020-01-31T00:00:00Z</td>
    <td>2</td>
  </tr>
  <tr>
    <td>2020-02-01T00:00:00Z</td>
    <td>2</td>
  </tr>
  <tr>
    <td>2020-02-02T00:00:00Z</td>
    <td>2</td>
  </tr>
  <tr>
    <td>2020-02-03T00:00:00Z</td>
    <td>2</td>
  </tr>
  <tr>
    <td>2020-02-04T00:00:00Z</td>
    <td>2</td>
  </tr>
  <tr>
    <td>2020-02-05T00:00:00Z</td>
    <td>2</td>
  </tr>
  <tr>
    <td>2020-02-07T00:00:00Z</td>
    <td>3</td>
  </tr>
  <tr>
    <td>2020-02-21T00:00:00Z</td>
    <td>20</td>
  </tr>
  <tr>
    <td>2020-02-22T00:00:00Z</td>
    <td>79</td>
  </tr>
  <tr>
    <td>2020-02-23T00:00:00Z</td>
    <td>155</td>
  </tr>
  <tr>
    <td>2020-02-24T00:00:00Z</td>
    <td>229</td>
  </tr>
  <tr>
    <td>2020-02-28T00:00:00Z</td>
    <td>888</td>
  </tr>
  <tr>
    <td>2020-02-28T00:00:00Z</td>
    <td>650</td>
  </tr>
  <tr>
    <td>2020-03-06T00:00:00Z</td>
    <td>3858</td>
  </tr>
  <tr>
    <td>2020-03-07T00:00:00Z</td>
    <td>4636</td>
  </tr>
  <tr>
    <td>2020-03-08T00:00:00Z</td>
    <td>5883</td>
  </tr>
  <tr>
    <td>2020-03-09T00:00:00Z</td>
    <td>7375</td>
  </tr>
  <tr>
    <td>2020-03-10T00:00:00Z</td>
    <td>9172</td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td>10149</td>
  </tr>
  <tr>
    <td>2020-03-12T00:00:00Z</td>
    <td>12462</td>
  </tr>
  <tr>
    <td>2020-03-13T00:00:00Z</td>
    <td>15113</td>
  </tr>
  <tr>
    <td>2020-03-14T00:00:00Z</td>
    <td>17660</td>
  </tr>
  <tr>
    <td>2020-03-15T00:00:00Z</td>
    <td>21157</td>
  </tr>
  <tr>
    <td>2020-03-17T00:00:00Z</td>
    <td>27980</td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td>31506</td>
  </tr>
  <tr>
    <td>2020-03-19T00:00:00Z</td>
    <td>35713</td>
  </tr>
  <tr>
    <td>2020-03-19T00:00:00Z</td>
    <td>41035</td>
  </tr>
  <tr>
    <td>2020-03-21T00:00:00Z</td>
    <td>53578</td>
  </tr>
</table>

## Graphed Regional progression

### Cases

**SPARQL** [sparql/graphCases.rq](sparql/graphCases.code.html) ([run](https://query.wikidata.org/embed.html#%23defaultView%3ALineChart%0ASELECT%0A%3FcasesPointInTime%20%3Fcases%0A%3FcountryLabel%0AWHERE%20%7B%0A%20%20%3Fitem%20wdt%3AP31%20wd%3AQ3241045.%0A%20%20%3Fitem%20wdt%3AP17%20%3Fcountry.%0A%20%20%3Fitem%20p%3AP1603%20%3FcasesStatement.%0A%20%20%3FcasesStatement%20ps%3AP1603%20%3Fcases.%0A%20%20FILTER%28%3Fcases%20%3E%200%29%0A%20%20%3FcasesStatement%20pq%3AP585%20%3FcasesPointInTime.%0A%20%20%7B%20%3Fitem%20wdt%3AP1269%20wd%3AQ81068910.%20%7D%20UNION%0A%20%20%7B%20%3Fitem%20wdt%3AP361%20wd%3AQ83741704.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A), [edit](https://query.wikidata.org/#%23defaultView%3ALineChart%0ASELECT%0A%3FcasesPointInTime%20%3Fcases%0A%3FcountryLabel%0AWHERE%20%7B%0A%20%20%3Fitem%20wdt%3AP31%20wd%3AQ3241045.%0A%20%20%3Fitem%20wdt%3AP17%20%3Fcountry.%0A%20%20%3Fitem%20p%3AP1603%20%3FcasesStatement.%0A%20%20%3FcasesStatement%20ps%3AP1603%20%3Fcases.%0A%20%20FILTER%28%3Fcases%20%3E%200%29%0A%20%20%3FcasesStatement%20pq%3AP585%20%3FcasesPointInTime.%0A%20%20%7B%20%3Fitem%20wdt%3AP1269%20wd%3AQ81068910.%20%7D%20UNION%0A%20%20%7B%20%3Fitem%20wdt%3AP361%20wd%3AQ83741704.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A))

```sparql
#defaultView:LineChart
SELECT
?casesPointInTime ?cases
?countryLabel
WHERE {
  ?item wdt:P31 wd:Q3241045.
  ?item wdt:P17 ?country.
  ?item p:P1603 ?casesStatement.
  ?casesStatement ps:P1603 ?cases.
  FILTER(?cases > 0)
  ?casesStatement pq:P585 ?casesPointInTime.
  { ?item wdt:P1269 wd:Q81068910. } UNION
  { ?item wdt:P361 wd:Q83741704. }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```

### Deaths

**SPARQL** [sparql/graphDeaths.rq](sparql/graphDeaths.code.html) ([run](https://query.wikidata.org/embed.html#%23defaultView%3ALineChart%0ASELECT%0A%3FdeathsPointInTime%20%3Fdeaths%0A%3FcountryLabel%0AWHERE%20%7B%0A%20%20%3Fitem%20wdt%3AP31%20wd%3AQ3241045.%0A%20%20%3Fitem%20wdt%3AP17%20%3Fcountry.%0A%20%20%3Fitem%20p%3AP1120%20%3FdeathsStatement.%0A%20%20%3FdeathsStatement%20ps%3AP1120%20%3Fdeaths.%0A%20%20FILTER%28%3Fdeaths%20%3E%200%29%0A%20%20%3FdeathsStatement%20pq%3AP585%20%3FdeathsPointInTime.%0A%20%20%7B%20%3Fitem%20wdt%3AP1269%20wd%3AQ81068910.%20%7D%20UNION%0A%20%20%7B%20%3Fitem%20wdt%3AP361%20wd%3AQ83741704.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A), [edit](https://query.wikidata.org/#%23defaultView%3ALineChart%0ASELECT%0A%3FdeathsPointInTime%20%3Fdeaths%0A%3FcountryLabel%0AWHERE%20%7B%0A%20%20%3Fitem%20wdt%3AP31%20wd%3AQ3241045.%0A%20%20%3Fitem%20wdt%3AP17%20%3Fcountry.%0A%20%20%3Fitem%20p%3AP1120%20%3FdeathsStatement.%0A%20%20%3FdeathsStatement%20ps%3AP1120%20%3Fdeaths.%0A%20%20FILTER%28%3Fdeaths%20%3E%200%29%0A%20%20%3FdeathsStatement%20pq%3AP585%20%3FdeathsPointInTime.%0A%20%20%7B%20%3Fitem%20wdt%3AP1269%20wd%3AQ81068910.%20%7D%20UNION%0A%20%20%7B%20%3Fitem%20wdt%3AP361%20wd%3AQ83741704.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A))

```sparql
#defaultView:LineChart
SELECT
?deathsPointInTime ?deaths
?countryLabel
WHERE {
  ?item wdt:P31 wd:Q3241045.
  ?item wdt:P17 ?country.
  ?item p:P1120 ?deathsStatement.
  ?deathsStatement ps:P1120 ?deaths.
  FILTER(?deaths > 0)
  ?deathsStatement pq:P585 ?deathsPointInTime.
  { ?item wdt:P1269 wd:Q81068910. } UNION
  { ?item wdt:P361 wd:Q83741704. }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
