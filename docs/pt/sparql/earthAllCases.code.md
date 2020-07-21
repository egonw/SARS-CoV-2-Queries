# earthAllCases.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?date ?numberOfCases WHERE {
  wd:Q81068910 p:P1603 ?numberOfCasesStat .
  ?numberOfCasesStat ps:P1603 ?numberOfCases ;
                     pq:P585 ?date .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
} ORDER BY ASC(?date)
```
[run](https://query.wikidata.org/embed.html#SELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fdate%29%0A) or [edit](https://query.wikidata.org/#SELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fdate%29%0A)


### Output
<table>
  <tr>
    <td><b>date</b></td>
    <td><b>numberOfCases</b></td>
  </tr>
  <tr>
    <td>2020-01-20</td>
    <td>282</td>
  </tr>
  <tr>
    <td>2020-01-21</td>
    <td>314</td>
  </tr>
  <tr>
    <td>2020-01-23</td>
    <td>581</td>
  </tr>
  <tr>
    <td>2020-01-24</td>
    <td>846</td>
  </tr>
  <tr>
    <td>2020-01-25</td>
    <td>1320</td>
  </tr>
  <tr>
    <td>2020-01-26</td>
    <td>2014</td>
  </tr>
  <tr>
    <td>2020-01-27</td>
    <td>2798</td>
  </tr>
  <tr>
    <td>2020-01-28</td>
    <td>4596</td>
  </tr>
  <tr>
    <td>2020-01-29</td>
    <td>6065</td>
  </tr>
  <tr>
    <td>2020-01-30</td>
    <td>7818</td>
  </tr>
  <tr>
    <td>2020-01-31</td>
    <td>9826</td>
  </tr>
  <tr>
    <td>2020-02-01</td>
    <td>11953</td>
  </tr>
  <tr>
    <td>2020-02-02</td>
    <td>14557</td>
  </tr>
  <tr>
    <td>2020-02-03</td>
    <td>17391</td>
  </tr>
  <tr>
    <td>2020-02-04</td>
    <td>20630</td>
  </tr>
  <tr>
    <td>2020-02-05</td>
    <td>24554</td>
  </tr>
  <tr>
    <td>2020-02-06</td>
    <td>28276</td>
  </tr>
  <tr>
    <td>2020-02-07</td>
    <td>31481</td>
  </tr>
  <tr>
    <td>2020-02-08</td>
    <td>34886</td>
  </tr>
  <tr>
    <td>2020-02-09</td>
    <td>37558</td>
  </tr>
  <tr>
    <td>2020-02-10</td>
    <td>40554</td>
  </tr>
  <tr>
    <td>2020-02-11</td>
    <td>43103</td>
  </tr>
  <tr>
    <td>2020-02-12</td>
    <td>45171</td>
  </tr>
  <tr>
    <td>2020-02-13</td>
    <td>46997</td>
  </tr>
  <tr>
    <td>2020-02-13</td>
    <td>60329</td>
  </tr>
  <tr>
    <td>2020-02-14</td>
    <td>64437</td>
  </tr>
  <tr>
    <td>2020-02-14</td>
    <td>49053</td>
  </tr>
  <tr>
    <td>2020-02-15</td>
    <td>67102</td>
  </tr>
  <tr>
    <td>2020-02-15</td>
    <td>50580</td>
  </tr>
  <tr>
    <td>2020-02-16</td>
    <td>69267</td>
  </tr>
  <tr>
    <td>2020-02-16</td>
    <td>51857</td>
  </tr>
  <tr>
    <td>2020-02-17</td>
    <td>71429</td>
  </tr>
  <tr>
    <td>2020-02-18</td>
    <td>73332</td>
  </tr>
  <tr>
    <td>2020-02-19</td>
    <td>75204</td>
  </tr>
  <tr>
    <td>2020-02-20</td>
    <td>75748</td>
  </tr>
  <tr>
    <td>2020-02-21</td>
    <td>76769</td>
  </tr>
  <tr>
    <td>2020-02-22</td>
    <td>77794</td>
  </tr>
  <tr>
    <td>2020-02-23</td>
    <td>78811</td>
  </tr>
  <tr>
    <td>2020-02-24</td>
    <td>79331</td>
  </tr>
  <tr>
    <td>2020-02-25</td>
    <td>80239</td>
  </tr>
  <tr>
    <td>2020-02-26</td>
    <td>81109</td>
  </tr>
  <tr>
    <td>2020-02-27</td>
    <td>82294</td>
  </tr>
  <tr>
    <td>2020-02-28</td>
    <td>83652</td>
  </tr>
  <tr>
    <td>2020-02-29</td>
    <td>85403</td>
  </tr>
  <tr>
    <td>2020-03-01</td>
    <td>87137</td>
  </tr>
  <tr>
    <td>2020-03-02</td>
    <td>88948</td>
  </tr>
  <tr>
    <td>2020-03-03</td>
    <td>90869</td>
  </tr>
  <tr>
    <td>2020-03-04</td>
    <td>93090</td>
  </tr>
  <tr>
    <td>2020-03-05</td>
    <td>95333</td>
  </tr>
  <tr>
    <td>2020-03-06</td>
    <td>98192</td>
  </tr>
  <tr>
    <td>2020-03-07</td>
    <td>101927</td>
  </tr>
  <tr>
    <td>2020-03-08</td>
    <td>105586</td>
  </tr>
  <tr>
    <td>2020-03-09</td>
    <td>109578</td>
  </tr>
  <tr>
    <td>2020-03-10</td>
    <td>113702</td>
  </tr>
  <tr>
    <td>2020-03-11</td>
    <td>118326</td>
  </tr>
  <tr>
    <td>2020-03-12</td>
    <td>125048</td>
  </tr>
  <tr>
    <td>2020-03-13</td>
    <td>132758</td>
  </tr>
  <tr>
    <td>2020-03-14</td>
    <td>142539</td>
  </tr>
  <tr>
    <td>2020-03-15</td>
    <td>153517</td>
  </tr>
  <tr>
    <td>2020-03-16</td>
    <td>167511</td>
  </tr>
  <tr>
    <td>2020-03-17</td>
    <td>179112</td>
  </tr>
  <tr>
    <td>2020-03-18</td>
    <td>191127</td>
  </tr>
  <tr>
    <td>2020-03-19</td>
    <td>209839</td>
  </tr>
  <tr>
    <td>2020-03-20</td>
    <td>234073</td>
  </tr>
  <tr>
    <td>2020-03-21</td>
    <td>266073</td>
  </tr>
  <tr>
    <td>2020-03-22</td>
    <td>292142</td>
  </tr>
  <tr>
    <td>2020-03-23</td>
    <td>332930</td>
  </tr>
  <tr>
    <td>2020-03-24</td>
    <td>372757</td>
  </tr>
  <tr>
    <td>2020-03-25</td>
    <td>414179</td>
  </tr>
  <tr>
    <td>2020-03-26</td>
    <td>462684</td>
  </tr>
  <tr>
    <td>2020-03-27</td>
    <td>509164</td>
  </tr>
  <tr>
    <td>2020-03-28</td>
    <td>571678</td>
  </tr>
  <tr>
    <td>2020-03-29</td>
    <td>634835</td>
  </tr>
  <tr>
    <td>2020-03-30</td>
    <td>693224</td>
  </tr>
  <tr>
    <td>2020-03-31</td>
    <td>750890</td>
  </tr>
  <tr>
    <td>2020-04-01</td>
    <td>823626</td>
  </tr>
  <tr>
    <td>2020-04-02</td>
    <td>896450</td>
  </tr>
  <tr>
    <td>2020-04-03</td>
    <td>972303</td>
  </tr>
  <tr>
    <td>2020-04-04</td>
    <td>1051635</td>
  </tr>
  <tr>
    <td>2020-04-05</td>
    <td>1133758</td>
  </tr>
  <tr>
    <td>2020-04-06</td>
    <td>1210956</td>
  </tr>
  <tr>
    <td>2020-04-07</td>
    <td>1279722</td>
  </tr>
  <tr>
    <td>2020-04-08</td>
    <td>1353361</td>
  </tr>
  <tr>
    <td>2020-04-09</td>
    <td>1436198</td>
  </tr>
  <tr>
    <td>2020-04-10</td>
    <td>1521252</td>
  </tr>
  <tr>
    <td>2020-04-11</td>
    <td>1610909</td>
  </tr>
  <tr>
    <td>2020-04-12</td>
    <td>1696588</td>
  </tr>
  <tr>
    <td>2020-04-13</td>
    <td>1773084</td>
  </tr>
  <tr>
    <td>2020-04-14</td>
    <td>1844863</td>
  </tr>
  <tr>
    <td>2020-04-15</td>
    <td>1914916</td>
  </tr>
  <tr>
    <td>2020-04-16</td>
    <td>1991562</td>
  </tr>
  <tr>
    <td>2020-04-17</td>
    <td>2074529</td>
  </tr>
  <tr>
    <td>2020-04-18</td>
    <td>2160207</td>
  </tr>
  <tr>
    <td>2020-04-19</td>
    <td>2241778</td>
  </tr>
  <tr>
    <td>2020-04-20</td>
    <td>2314621</td>
  </tr>
  <tr>
    <td>2020-04-21</td>
    <td>2397216</td>
  </tr>
  <tr>
    <td>2020-04-22</td>
    <td>2471136</td>
  </tr>
  <tr>
    <td>2020-04-23</td>
    <td>2544792</td>
  </tr>
  <tr>
    <td>2020-04-24</td>
    <td>2626321</td>
  </tr>
  <tr>
    <td>2020-04-25</td>
    <td>2719896</td>
  </tr>
  <tr>
    <td>2020-04-26</td>
    <td>2804796</td>
  </tr>
  <tr>
    <td>2020-04-27</td>
    <td>2878196</td>
  </tr>
  <tr>
    <td>2020-04-28</td>
    <td>2954222</td>
  </tr>
  <tr>
    <td>2020-04-29</td>
    <td>3018681</td>
  </tr>
  <tr>
    <td>2020-04-30</td>
    <td>3090445</td>
  </tr>
  <tr>
    <td>2020-05-01</td>
    <td>3175207</td>
  </tr>
  <tr>
    <td>2020-05-02</td>
    <td>3267184</td>
  </tr>
  <tr>
    <td>2020-05-03</td>
    <td>3349786</td>
  </tr>
  <tr>
    <td>2020-05-04</td>
    <td>3435894</td>
  </tr>
  <tr>
    <td>2020-05-05</td>
    <td>3517345</td>
  </tr>
  <tr>
    <td>2020-05-06</td>
    <td>3588773</td>
  </tr>
  <tr>
    <td>2020-05-07</td>
    <td>3672238</td>
  </tr>
  <tr>
    <td>2020-05-08</td>
    <td>3759967</td>
  </tr>
  <tr>
    <td>2020-05-09</td>
    <td>3855788</td>
  </tr>
  <tr>
    <td>2020-05-10</td>
    <td>3917366</td>
  </tr>
  <tr>
    <td>2020-05-11</td>
    <td>4006257</td>
  </tr>
  <tr>
    <td>2020-05-12</td>
    <td>4088848</td>
  </tr>
  <tr>
    <td>2020-05-13</td>
    <td>4170424</td>
  </tr>
  <tr>
    <td>2020-05-14</td>
    <td>4248389</td>
  </tr>
  <tr>
    <td>2020-05-15</td>
    <td>4338658</td>
  </tr>
  <tr>
    <td>2020-05-16</td>
    <td>4425485</td>
  </tr>
  <tr>
    <td>2020-05-17</td>
    <td>4525497</td>
  </tr>
  <tr>
    <td>2020-05-18</td>
    <td>4618821</td>
  </tr>
  <tr>
    <td>2020-05-19</td>
    <td>4731458</td>
  </tr>
  <tr>
    <td>2020-05-20</td>
    <td>4789205</td>
  </tr>
  <tr>
    <td>2020-05-21</td>
    <td>4893186</td>
  </tr>
  <tr>
    <td>2020-05-22</td>
    <td>4993470</td>
  </tr>
  <tr>
    <td>2020-05-23</td>
    <td>5103006</td>
  </tr>
  <tr>
    <td>2020-05-24</td>
    <td>5204508</td>
  </tr>
  <tr>
    <td>2020-05-25</td>
    <td>5304772</td>
  </tr>
  <tr>
    <td>2020-05-26</td>
    <td>5404512</td>
  </tr>
  <tr>
    <td>2020-05-27</td>
    <td>5488825</td>
  </tr>
  <tr>
    <td>2020-05-28</td>
    <td>5593631</td>
  </tr>
  <tr>
    <td>2020-05-29</td>
    <td>5701337</td>
  </tr>
  <tr>
    <td>2020-05-30</td>
    <td>5817385</td>
  </tr>
  <tr>
    <td>2020-05-31</td>
    <td>5934936</td>
  </tr>
  <tr>
    <td>2020-06-01</td>
    <td>6057853</td>
  </tr>
  <tr>
    <td>2020-06-02</td>
    <td>6194533</td>
  </tr>
  <tr>
    <td>2020-06-03</td>
    <td>6287771</td>
  </tr>
  <tr>
    <td>2020-06-04</td>
    <td>6416828</td>
  </tr>
  <tr>
    <td>2020-06-05</td>
    <td>6535354</td>
  </tr>
  <tr>
    <td>2020-06-06</td>
    <td>6663304</td>
  </tr>
  <tr>
    <td>2020-06-07</td>
    <td>6799713</td>
  </tr>
  <tr>
    <td>2020-06-08</td>
    <td>6931000</td>
  </tr>
  <tr>
    <td>2020-06-09</td>
    <td>7039918</td>
  </tr>
  <tr>
    <td>2020-06-10</td>
    <td>7145539</td>
  </tr>
  <tr>
    <td>2020-06-11</td>
    <td>7273958</td>
  </tr>
  <tr>
    <td>2020-06-12</td>
    <td>7410510</td>
  </tr>
  <tr>
    <td>2020-06-13</td>
    <td>7553182</td>
  </tr>
  <tr>
    <td>2020-06-14</td>
    <td>7690708</td>
  </tr>
  <tr>
    <td>2020-06-15</td>
    <td>7823289</td>
  </tr>
  <tr>
    <td>2020-06-16</td>
    <td>7941791</td>
  </tr>
  <tr>
    <td>2020-06-17</td>
    <td>8061550</td>
  </tr>
  <tr>
    <td>2020-06-18</td>
    <td>8242999</td>
  </tr>
  <tr>
    <td>2020-06-19</td>
    <td>8385440</td>
  </tr>
  <tr>
    <td>2020-06-20</td>
    <td>8525042</td>
  </tr>
  <tr>
    <td>2020-06-21</td>
    <td>8708008</td>
  </tr>
  <tr>
    <td>2020-06-22</td>
    <td>8860331</td>
  </tr>
  <tr>
    <td>2020-06-23</td>
    <td>8993659</td>
  </tr>
  <tr>
    <td>2020-06-24</td>
    <td>9129146</td>
  </tr>
  <tr>
    <td>2020-06-25</td>
    <td>9296202</td>
  </tr>
  <tr>
    <td>2020-06-26</td>
    <td>9473214</td>
  </tr>
  <tr>
    <td>2020-06-27</td>
    <td>9653048</td>
  </tr>
  <tr>
    <td>2020-06-28</td>
    <td>9843073</td>
  </tr>
  <tr>
    <td>2020-06-29</td>
    <td>10021401</td>
  </tr>
  <tr>
    <td>2020-06-30</td>
    <td>10185374</td>
  </tr>
  <tr>
    <td>2020-07-01</td>
    <td>10357662</td>
  </tr>
  <tr>
    <td>2020-07-02</td>
    <td>10533779</td>
  </tr>
  <tr>
    <td>2020-07-03</td>
    <td>10710005</td>
  </tr>
  <tr>
    <td>2020-07-04</td>
    <td>10922324</td>
  </tr>
  <tr>
    <td>2020-07-05</td>
    <td>11125245</td>
  </tr>
  <tr>
    <td>2020-07-06</td>
    <td>11327790</td>
  </tr>
  <tr>
    <td>2020-07-07</td>
    <td>11500302</td>
  </tr>
  <tr>
    <td>2020-07-08</td>
    <td>11669259</td>
  </tr>
  <tr>
    <td>2020-07-09</td>
    <td>11874226</td>
  </tr>
  <tr>
    <td>2020-07-10</td>
    <td>12102328</td>
  </tr>
  <tr>
    <td>2020-07-11</td>
    <td>12322395</td>
  </tr>
  <tr>
    <td>2020-07-12</td>
    <td>12552765</td>
  </tr>
  <tr>
    <td>2020-07-13</td>
    <td>12768307</td>
  </tr>
  <tr>
    <td>2020-07-14</td>
    <td>12964809</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o earthAllCases.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/earthAllCases.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@earthAllCases.rq
```
This SPARQL query is available under CCZero.