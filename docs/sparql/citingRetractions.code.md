# citingRetractions.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql

SELECT DISTINCT
  ?retracted_work ?retracted_workLabel
  ?date
  ?citing_work ?citing_workLabel
WITH {
  # Find retracted papers indicated by instance of retracted paper, 
  # by retraction notice property or by significant event
  SELECT DISTINCT ?retracted_work WHERE {
    { ?retracted_work wdt:P31 wd:Q45182324 }
    UNION
    { ?retracted_work wdt:P5824 [] }
    UNION
    { ?retracted_work wdt:P793 wd:Q45203135 }
  }
} AS %retracted_works
WHERE {
  INCLUDE %retracted_works
  ?citing_work wdt:P2860 ?retracted_work ; wdt:P1433 wd:Q6294930 .
  OPTIONAL {
    ?retracted_work wdt:P5824 ?retraction .
    ?retraction wdt:P577 ?retraction_datetime
    FILTER ( ?citing_work != ?retraction )
  }
  MINUS { ?citing_work wdt:P31 wd:Q1348305 }
  OPTIONAL {
    ?retracted_work p:P793 [ ps:P793 wd:Q45203135 ; pq:P585 ?keyevent_datetime ]
  }
  BIND(COALESCE(xsd:date(COALESCE(?retraction_datetime, ?keyevent_datetime)), "Unknown date") AS ?date)
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
ORDER BY DESC(?date)
```
[Execute](https://query.wikidata.org/%0ASELECT+DISTINCT%0A++%3Fretracted_work+%3Fretracted_workLabel%0A++%3Fdate%0A++%3Fciting_work+%3Fciting_workLabel%0AWITH+%7B%0A++%23+Find+retracted+papers+indicated+by+instance+of+retracted+paper%2C+%0A++%23+by+retraction+notice+property+or+by+significant+event%0A++SELECT+DISTINCT+%3Fretracted_work+WHERE+%7B%0A++++%7B+%3Fretracted_work+wdt%3AP31+wd%3AQ45182324+%7D%0A++++UNION%0A++++%7B+%3Fretracted_work+wdt%3AP5824+%5B%5D+%7D%0A++++UNION%0A++++%7B+%3Fretracted_work+wdt%3AP793+wd%3AQ45203135+%7D%0A++%7D%0A%7D+AS+%25retracted_works%0AWHERE+%7B%0A++INCLUDE+%25retracted_works%0A++%3Fciting_work+wdt%3AP2860+%3Fretracted_work+%3B+wdt%3AP1433+wd%3AQ6294930+.%0A++OPTIONAL+%7B%0A++++%3Fretracted_work+wdt%3AP5824+%3Fretraction+.%0A++++%3Fretraction+wdt%3AP577+%3Fretraction_datetime%0A++++FILTER+%28+%3Fciting_work+%21%3D+%3Fretraction+%29%0A++%7D%0A++MINUS+%7B+%3Fciting_work+wdt%3AP31+wd%3AQ1348305+%7D%0A++OPTIONAL+%7B%0A++++%3Fretracted_work+p%3AP793+%5B+ps%3AP793+wd%3AQ45203135+%3B+pq%3AP585+%3Fkeyevent_datetime+%5D%0A++%7D%0A++BIND%28COALESCE%28xsd%3Adate%28COALESCE%28%3Fretraction_datetime%2C+%3Fkeyevent_datetime%29%29%2C+%22Unknown+date%22%29+AS+%3Fdate%29%0A++SERVICE+wikibase%3Alabel+%7B+bd%3AserviceParam+wikibase%3Alanguage+%22%5BAUTO_LANGUAGE%5D%2Cen%22.+%7D%0A%7D%0AORDER+BY+DESC%28%3Fdate%29%0A) or [Edit](https://query.wikidata.org/embed.html#%0ASELECT+DISTINCT%0A++%3Fretracted_work+%3Fretracted_workLabel%0A++%3Fdate%0A++%3Fciting_work+%3Fciting_workLabel%0AWITH+%7B%0A++%23+Find+retracted+papers+indicated+by+instance+of+retracted+paper%2C+%0A++%23+by+retraction+notice+property+or+by+significant+event%0A++SELECT+DISTINCT+%3Fretracted_work+WHERE+%7B%0A++++%7B+%3Fretracted_work+wdt%3AP31+wd%3AQ45182324+%7D%0A++++UNION%0A++++%7B+%3Fretracted_work+wdt%3AP5824+%5B%5D+%7D%0A++++UNION%0A++++%7B+%3Fretracted_work+wdt%3AP793+wd%3AQ45203135+%7D%0A++%7D%0A%7D+AS+%25retracted_works%0AWHERE+%7B%0A++INCLUDE+%25retracted_works%0A++%3Fciting_work+wdt%3AP2860+%3Fretracted_work+%3B+wdt%3AP1433+wd%3AQ6294930+.%0A++OPTIONAL+%7B%0A++++%3Fretracted_work+wdt%3AP5824+%3Fretraction+.%0A++++%3Fretraction+wdt%3AP577+%3Fretraction_datetime%0A++++FILTER+%28+%3Fciting_work+%21%3D+%3Fretraction+%29%0A++%7D%0A++MINUS+%7B+%3Fciting_work+wdt%3AP31+wd%3AQ1348305+%7D%0A++OPTIONAL+%7B%0A++++%3Fretracted_work+p%3AP793+%5B+ps%3AP793+wd%3AQ45203135+%3B+pq%3AP585+%3Fkeyevent_datetime+%5D%0A++%7D%0A++BIND%28COALESCE%28xsd%3Adate%28COALESCE%28%3Fretraction_datetime%2C+%3Fkeyevent_datetime%29%29%2C+%22Unknown+date%22%29+AS+%3Fdate%29%0A++SERVICE+wikibase%3Alabel+%7B+bd%3AserviceParam+wikibase%3Alanguage+%22%5BAUTO_LANGUAGE%5D%2Cen%22.+%7D%0A%7D%0AORDER+BY+DESC%28%3Fdate%29%0A)


### Output
<table>
  <tr>
    <td><b>retracted_work</b></td>
    <td><b>retracted_workLabel</b></td>
    <td><b>date</b></td>
    <td><b>citing_work</b></td>
    <td><b>citing_workLabel</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q34203691</td>
    <td>RETRACTED: Predicting new molecular targets for rhein using network pharmacology.</td>
    <td>2014-09-18</td>
    <td>http://www.wikidata.org/entity/Q37426159</td>
    <td>CVDHD: a cardiovascular disease herbal database for drug discovery and network pharmacology.</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o citingRetractions.rq https://raw.githubusercontent.com/jcheminform/useful-queries/master/sparql/citingRetractions.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@citingRetractions.rq
```
