# progressionNLlineplot.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
#defaultView:LineChart
SELECT ?date ?numberOfCases WHERE {
  wd:Q86756826 p:P1603 ?numberOfCasesStat .
  ?numberOfCasesStat ps:P1603 ?numberOfCases ;
                     pq:P585 ?date .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
[Execute](https://query.wikidata.org/embed.html#%23defaultView%3ALineChart%0ASELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ86756826%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A) or [Edit](https://query.wikidata.org/#%23defaultView%3ALineChart%0ASELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ86756826%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>numberOfCases</b></td>
  </tr>
  <tr>
    <td>2020-03-14T00:00:00Z</td>
    <td>959</td>
  </tr>
  <tr>
    <td>2020-02-27T00:00:00Z</td>
    <td>1</td>
  </tr>
  <tr>
    <td>2020-03-13T00:00:00Z</td>
    <td>804</td>
  </tr>
  <tr>
    <td>2020-03-16T00:00:00Z</td>
    <td>1413</td>
  </tr>
  <tr>
    <td>2020-03-05T00:00:00Z</td>
    <td>82</td>
  </tr>
  <tr>
    <td>2020-02-28T00:00:00Z</td>
    <td>2</td>
  </tr>
  <tr>
    <td>2020-03-10T00:00:00Z</td>
    <td>382</td>
  </tr>
  <tr>
    <td>2020-03-12T00:00:00Z</td>
    <td>614</td>
  </tr>
  <tr>
    <td>2020-03-11T00:00:00Z</td>
    <td>503</td>
  </tr>
  <tr>
    <td>2020-03-09T00:00:00Z</td>
    <td>321</td>
  </tr>
  <tr>
    <td>2020-03-08T00:00:00Z</td>
    <td>265</td>
  </tr>
  <tr>
    <td>2020-03-07T00:00:00Z</td>
    <td>188</td>
  </tr>
  <tr>
    <td>2020-03-17T00:00:00Z</td>
    <td>1705</td>
  </tr>
  <tr>
    <td>2020-03-15T00:00:00Z</td>
    <td>1135</td>
  </tr>
  <tr>
    <td>2020-03-18T00:00:00Z</td>
    <td>2051</td>
  </tr>
  <tr>
    <td>2020-03-04T00:00:00Z</td>
    <td>38</td>
  </tr>
  <tr>
    <td>2020-03-02T00:00:00Z</td>
    <td>18</td>
  </tr>
  <tr>
    <td>2020-03-01T00:00:00Z</td>
    <td>10</td>
  </tr>
  <tr>
    <td>2020-02-28T00:00:00Z</td>
    <td>2</td>
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
    <td>2020-03-06T00:00:00Z</td>
    <td>128</td>
  </tr>
  <tr>
    <td>2020-03-21T00:00:00Z</td>
    <td>3631</td>
  </tr>
  <tr>
    <td>2020-03-22T00:00:00Z</td>
    <td>4204</td>
  </tr>
  <tr>
    <td>2020-03-23T00:00:00Z</td>
    <td>4749</td>
  </tr>
  <tr>
    <td>2020-03-24T00:00:00Z</td>
    <td>5560</td>
  </tr>
  <tr>
    <td>2020-03-25T00:00:00Z</td>
    <td>6412</td>
  </tr>
  <tr>
    <td>2020-03-26T00:00:00Z</td>
    <td>7431</td>
  </tr>
  <tr>
    <td>2020-03-27T00:00:00Z</td>
    <td>8603</td>
  </tr>
  <tr>
    <td>2020-03-28T00:00:00Z</td>
    <td>9762</td>
  </tr>
  <tr>
    <td>2020-03-29T00:00:00Z</td>
    <td>10866</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o progressionNLlineplot.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/progressionNLlineplot.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@progressionNLlineplot.rq
```
This SPARQL query is available under CCZero.
