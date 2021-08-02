# wikipediaOnMap.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
#defaultView:Map
SELECT DISTINCT ?wpArticle ?itemLabel ?coord WHERE {
  ?wpArticle a schema:Article ;
    schema:about ?item ;
    schema:isPartOf <https://en.wikipedia.org/> .
  ?item p:P31 [ ps:P31 wd:Q3241045 ; pq:P642 wd:Q84263196 ] ;
    wdt:P625 ?coord ;
    rdfs:label ?itemLabel . FILTER(LANG(?itemLabel)="en")
}
```
[run](https://query.wikidata.org/embed.html#%23defaultView%3AMap%0ASELECT%20DISTINCT%20%3FwpArticle%20%3FitemLabel%20%3Fcoord%20WHERE%20%7B%0A%20%20%3FwpArticle%20a%20schema%3AArticle%20%3B%0A%20%20%20%20schema%3Aabout%20%3Fitem%20%3B%0A%20%20%20%20schema%3AisPartOf%20%3Chttps%3A%2F%2Fen.wikipedia.org%2F%3E%20.%0A%20%20%3Fitem%20p%3AP31%20%5B%20ps%3AP31%20wd%3AQ3241045%20%3B%20pq%3AP642%20wd%3AQ84263196%20%5D%20%3B%0A%20%20%20%20wdt%3AP625%20%3Fcoord%20%3B%0A%20%20%20%20rdfs%3Alabel%20%3FitemLabel%20.%20FILTER%28LANG%28%3FitemLabel%29%3D%22en%22%29%0A%7D%0A) or [edit](https://query.wikidata.org/#%23defaultView%3AMap%0ASELECT%20DISTINCT%20%3FwpArticle%20%3FitemLabel%20%3Fcoord%20WHERE%20%7B%0A%20%20%3FwpArticle%20a%20schema%3AArticle%20%3B%0A%20%20%20%20schema%3Aabout%20%3Fitem%20%3B%0A%20%20%20%20schema%3AisPartOf%20%3Chttps%3A%2F%2Fen.wikipedia.org%2F%3E%20.%0A%20%20%3Fitem%20p%3AP31%20%5B%20ps%3AP31%20wd%3AQ3241045%20%3B%20pq%3AP642%20wd%3AQ84263196%20%5D%20%3B%0A%20%20%20%20wdt%3AP625%20%3Fcoord%20%3B%0A%20%20%20%20rdfs%3Alabel%20%3FitemLabel%20.%20FILTER%28LANG%28%3FitemLabel%29%3D%22en%22%29%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>wpArticle</b></td>
    <td><b>coord</b></td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Johor</td>
    <td>Point(103.781111111 1.487222222)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Shanghai</td>
    <td>Point(121.466666666 31.166666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Xinjiang</td>
    <td>Point(87.613888888 43.825277777)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Heilongjiang</td>
    <td>Point(129.0 48.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Sweden</td>
    <td>Point(15.0 61.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Malaysia</td>
    <td>Point(108.0 3.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Vietnam</td>
    <td>Point(108.0 16.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Thailand</td>
    <td>Point(101.0 14.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Italy</td>
    <td>Point(12.5 42.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Singapore</td>
    <td>Point(103.8 1.3)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_United_Arab_Emirates</td>
    <td>Point(54.3 24.4)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_South_Korea</td>
    <td>Point(128.0 36.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Cambodia</td>
    <td>Point(105.0 12.6)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Switzerland</td>
    <td>Point(8.231973055 46.798561944)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Spain</td>
    <td>Point(-3.0 40.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Israel</td>
    <td>Point(35.0 31.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Austria</td>
    <td>Point(14.0 48.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Indonesia</td>
    <td>Point(118.0 -2.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Vermont</td>
    <td>Point(-72.7 44.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_North_Carolina</td>
    <td>Point(-80.0 35.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Odisha</td>
    <td>Point(85.5 20.15)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Michigan</td>
    <td>Point(-85.58 44.34)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Scotland</td>
    <td>Point(-5.0 57.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Democratic_Republic_of_the_Congo</td>
    <td>Point(23.656111111 -2.88)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Sudan</td>
    <td>Point(32.0 15.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Colorado</td>
    <td>Point(-105.5 39.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Burkina_Faso</td>
    <td>Point(-2.066669444 12.266669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Ethiopia</td>
    <td>Point(40.0 9.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Bermuda</td>
    <td>Point(-64.75 32.333330555)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_East_Timor</td>
    <td>Point(125.75 -8.966669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Delhi</td>
    <td>Point(77.2 28.7)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_El_Salvador</td>
    <td>Point(-88.866111111 13.668888888)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_British_Columbia</td>
    <td>Point(-124.5 54.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_European_Union</td>
    <td>Point(9.2 50.1)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Romania</td>
    <td>Point(25.0 46.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Lebanon</td>
    <td>Point(35.766669444 33.833330555)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Dominican_Republic</td>
    <td>Point(-70.2 18.8)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Vatican_City</td>
    <td>Point(12.453055555 41.903888888)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Washington_(state)</td>
    <td>Point(-120.5 47.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Kenya</td>
    <td>Point(38.0 0.1)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_New_Jersey</td>
    <td>Point(-74.5 40.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Guinea</td>
    <td>Point(-11.0 10.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Kosovo</td>
    <td>Point(20.833333333 42.55)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Honduras</td>
    <td>Point(-86.816669444 14.633330555)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Rwanda</td>
    <td>Point(29.873888888 -1.940277777)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_North_Macedonia</td>
    <td>Point(21.716669444 41.65)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Bulgaria</td>
    <td>Point(25.5 42.75)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Saint_Barth%C3%A9lemy</td>
    <td>Point(-62.834244444 17.897727777)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_New_Caledonia</td>
    <td>Point(165.3 -21.25)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Kazakhstan</td>
    <td>Point(68.0 48.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_California</td>
    <td>Point(-120.0 37.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Melilla</td>
    <td>Point(-2.9475 35.2825)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Luhansk_People%27s_Republic</td>
    <td>Point(39.02 48.92)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_South_Sudan</td>
    <td>Point(30.0 7.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Martinique</td>
    <td>Point(-61.0 14.666666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Slovakia</td>
    <td>Point(20.0 49.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Norway</td>
    <td>Point(11.0 65.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Hungary</td>
    <td>Point(19.0 47.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_North_Korea</td>
    <td>Point(127.0 40.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Washington,_D.C.</td>
    <td>Point(-77.036666666 38.895)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Arkansas</td>
    <td>Point(-92.2 34.8)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_South_Carolina</td>
    <td>Point(-81.0 34.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Fiji</td>
    <td>Point(178.0 -18.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Montenegro</td>
    <td>Point(19.216669444 42.766669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Tanzania</td>
    <td>Point(34.853888888 -6.306944444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Angola</td>
    <td>Point(17.35 -12.35)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Nicaragua</td>
    <td>Point(-85.0 13.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Zambia</td>
    <td>Point(28.0 -14.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Ontario</td>
    <td>Point(-85.0 50.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Canary_Islands</td>
    <td>Point(-15.748888888 28.536111111)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Papua_New_Guinea</td>
    <td>Point(147.0 -6.3)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Finland</td>
    <td>Point(27.0 65.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_South_America</td>
    <td>Point(-59.0 -21.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Bahrain</td>
    <td>Point(50.551111111 26.0675)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Iran</td>
    <td>Point(53.0 32.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Republic_of_Ireland</td>
    <td>Point(-8.0 53.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Selangor</td>
    <td>Point(101.5 3.333333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Kuala_Lumpur</td>
    <td>Point(101.695277777 3.147777777)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Lithuania</td>
    <td>Point(24.0 55.2)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Normandy</td>
    <td>Point(-0.352777777 49.186388888)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Albania</td>
    <td>Point(20.0 41.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Paraguay</td>
    <td>Point(-58.0 -23.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Oman</td>
    <td>Point(57.0 21.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Jordan</td>
    <td>Point(36.5 31.2)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Russia</td>
    <td>Point(100.0 62.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Cuba</td>
    <td>Point(-79.5 22.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Armenia</td>
    <td>Point(44.95 40.383330555)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Pakistan</td>
    <td>Point(71.0 30.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Moldova</td>
    <td>Point(28.516669444 47.25)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Somaliland</td>
    <td>Point(46.2 9.8)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Libya</td>
    <td>Point(17.0 27.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Tibet</td>
    <td>Point(86.940280555 31.705561111)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Laos</td>
    <td>Point(104.0 18.2)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Columbus,_Ohio</td>
    <td>Point(-83.000555555 39.962222222)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Falkland_Islands</td>
    <td>Point(-59.0 -51.8)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Portland,_Oregon</td>
    <td>Point(-122.666666666 45.516666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Transnistria</td>
    <td>Point(29.624444444 46.842222222)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Saskatchewan</td>
    <td>Point(-106.0 55.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Nigeria</td>
    <td>Point(8.0 9.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Massachusetts</td>
    <td>Point(-71.8 42.3)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Trinidad_and_Tobago</td>
    <td>Point(-61.516666666 10.666666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Wallis_and_Futuna</td>
    <td>Point(-178.109319444 -14.301811111)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Kerala</td>
    <td>Point(76.971944444 8.5075)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Georgia_(country)</td>
    <td>Point(43.733055555 42.016944444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Ivory_Coast</td>
    <td>Point(-6.0 8.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Texas</td>
    <td>Point(-100.0 31.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Karnataka</td>
    <td>Point(77.560288888 12.970213888)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_North_Rhine-Westphalia</td>
    <td>Point(7.55 51.466666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Wisconsin</td>
    <td>Point(-89.5 44.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Rhode_Island</td>
    <td>Point(-71.5 41.7)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Henan</td>
    <td>Point(113.5 33.9)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Ohio</td>
    <td>Point(-82.5 40.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Alaska</td>
    <td>Point(-150.0 64.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Afghanistan</td>
    <td>Point(66.0 34.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Bahamas</td>
    <td>Point(-76.4 23.7)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Japan</td>
    <td>Point(136.0 35.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Sri_Lanka</td>
    <td>Point(81.0 7.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_India</td>
    <td>Point(77.0 22.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Uttar_Pradesh</td>
    <td>Point(81.0 27.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Guam</td>
    <td>Point(144.8 13.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Tamil_Nadu</td>
    <td>Point(80.3 13.1)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Gabon</td>
    <td>Point(12.0 -1.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Niger</td>
    <td>Point(10.0 17.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Sint_Eustatius</td>
    <td>Point(-62.966666666 17.483333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Zimbabwe</td>
    <td>Point(30.0 -19.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/2020_coronavirus_pandemic_in_Selangor,_Kuala_Lumpur_and_Putrajaya</td>
    <td>Point(101.661269444 2.681680555)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Donetsk_People%27s_Republic</td>
    <td>Point(37.804166666 48.008888888)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Haiti</td>
    <td>Point(-72.8 19.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Saint_Kitts_and_Nevis</td>
    <td>Point(-62.666669444 17.33)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Assam</td>
    <td>Point(93.0 26.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Cura%C3%A7ao</td>
    <td>Point(-68.966666666 12.166666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Mongolia</td>
    <td>Point(104.0 47.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Mauritania</td>
    <td>Point(-11.0 21.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Saint_Lucia</td>
    <td>Point(-61.0 13.883330555)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Eswatini</td>
    <td>Point(31.433330555 -26.483330555)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Tajikistan</td>
    <td>Point(71.366669444 38.583330555)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Antarctica</td>
    <td>Point(-57.8875 -63.320833333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Montreal</td>
    <td>Point(-73.561666666 45.508888888)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Guatemala</td>
    <td>Point(-90.533333333 14.616666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Aruba</td>
    <td>Point(-69.974166666 12.511111111)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Saint_Pierre_and_Miquelon</td>
    <td>Point(-56.275 46.825)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Antigua_and_Barbuda</td>
    <td>Point(-61.85 17.116666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Uruguay</td>
    <td>Point(-56.65 -32.733333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Venezuela</td>
    <td>Point(-67.0 8.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Africa</td>
    <td>Point(17.0 1.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Denmark</td>
    <td>Point(10.0 56.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_North_America</td>
    <td>Point(-105.0 47.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Iceland</td>
    <td>Point(-19.0 65.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Maldives</td>
    <td>Point(73.22 3.2)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Jamaica</td>
    <td>Point(-77.4 18.18)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Bolivia</td>
    <td>Point(-64.991228611 -17.056869611)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Turkey</td>
    <td>Point(36.0 39.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Republic_of_the_Congo</td>
    <td>Point(15.383330555 -0.75)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Qatar</td>
    <td>Point(51.212769444 25.269538888)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Cayman_Islands</td>
    <td>Point(-80.5 19.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Bhutan</td>
    <td>Point(90.5 27.45)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Guernsey</td>
    <td>Point(-2.583333333 49.45)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Northern_Mariana_Islands</td>
    <td>Point(146.0 17.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Connecticut</td>
    <td>Point(-72.7 41.6)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Louisiana</td>
    <td>Point(-92.0 31.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Greenland</td>
    <td>Point(-40.0 72.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_England</td>
    <td>Point(-1.0 53.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Minnesota</td>
    <td>Point(-94.0 46.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Illinois</td>
    <td>Point(-89.0 40.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Hawaii</td>
    <td>Point(-157.796388888 21.311388888)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Northern_Cyprus</td>
    <td>Point(33.363473888 35.180975)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Beijing</td>
    <td>Point(116.391388888 39.905)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_R%C3%A9union</td>
    <td>Point(55.5325 -21.114444444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Kuwait</td>
    <td>Point(47.6 29.166669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_State_of_Palestine</td>
    <td>Point(35.25 32.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Iraq</td>
    <td>Point(43.0 33.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_San_Marino</td>
    <td>Point(12.466666666 43.933333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Abkhazia</td>
    <td>Point(41.0 43.15)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Turkmenistan</td>
    <td>Point(60.0 39.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Western_Sahara</td>
    <td>Point(-13.0 25.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Sint_Maarten</td>
    <td>Point(-63.067777777 18.031944444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_London</td>
    <td>Point(-0.1275 51.507222222)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Turks_and_Caicos_Islands</td>
    <td>Point(-71.583333333 21.75)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Punjab,_India</td>
    <td>Point(75.466666666 30.766666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Djibouti</td>
    <td>Point(42.433330555 11.8)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Metro_Manila</td>
    <td>Point(121.0 14.583333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Mali</td>
    <td>Point(-4.0 17.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Monaco</td>
    <td>Point(7.416666666 43.733333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Australia</td>
    <td>Point(137.0 -28.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Nepal</td>
    <td>Point(84.0 28.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_on_Diamond_Princess</td>
    <td>Point(139.702416666 35.463694444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_South_Africa</td>
    <td>Point(24.0 -29.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Ukraine</td>
    <td>Point(32.0 49.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Mexico</td>
    <td>Point(-102.0 23.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Canada</td>
    <td>Point(-109.0 56.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Macau</td>
    <td>Point(113.55 22.166666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Brazil</td>
    <td>Point(-53.0 -14.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Hong_Kong</td>
    <td>Point(114.166666666 22.283333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Mauritius</td>
    <td>Point(57.5 -20.2)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Barbados</td>
    <td>Point(-59.5525 13.17)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Faroe_Islands</td>
    <td>Point(-6.844444444 61.97)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Florida</td>
    <td>Point(-81.6 28.1)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Delaware</td>
    <td>Point(-75.5 39.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_West_Bengal</td>
    <td>Point(88.0 23.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Wales</td>
    <td>Point(-3.633333333 52.35)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Somalia</td>
    <td>Point(47.0 6.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Georgia_(U.S._state)</td>
    <td>Point(-83.5 33.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Arizona</td>
    <td>Point(-111.656938888 34.286669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Oklahoma</td>
    <td>Point(-98.0 35.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Nebraska</td>
    <td>Point(-100.0 41.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Republic_of_Artsakh</td>
    <td>Point(46.716666666 39.866666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Nova_Scotia</td>
    <td>Point(-63.0 45.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Ceuta</td>
    <td>Point(-5.3 35.886669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Sarawak</td>
    <td>Point(113.781111111 3.038055555)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Mozambique</td>
    <td>Point(35.0 -19.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_New_Brunswick</td>
    <td>Point(-66.0 46.6)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_%C3%85land_Islands</td>
    <td>Point(20.0 60.25)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Gujarat</td>
    <td>Point(72.683333333 23.216666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_New_Mexico</td>
    <td>Point(-106.0 34.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Cape_Verde</td>
    <td>Point(-24.083333333 15.916666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Northern_Ireland</td>
    <td>Point(-6.75 54.683333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Prince_Edward_Island</td>
    <td>Point(-63.0 46.25)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Sichuan</td>
    <td>Point(103.0 30.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Chile</td>
    <td>Point(-71.0 -33.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Belize</td>
    <td>Point(-88.7 17.066666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_S%C3%A3o_Tom%C3%A9_and_Pr%C3%ADncipe</td>
    <td>Point(6.6 0.316669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Goa</td>
    <td>Point(74.043330555 15.401938888)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Samoa</td>
    <td>Point(-172.0 -14.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Yemen</td>
    <td>Point(48.0 15.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Dominica</td>
    <td>Point(-61.333330555 15.416669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Manitoba</td>
    <td>Point(-97.0 55.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Saudi_Arabia</td>
    <td>Point(44.116669444 23.716669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Morocco</td>
    <td>Point(-6.0 32.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_French_Saint_Martin</td>
    <td>Point(-63.06 18.075277777)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Egypt</td>
    <td>Point(29.0 27.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Puerto_Rico</td>
    <td>Point(-66.5 18.25)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Oregon</td>
    <td>Point(-120.575 43.935830555)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Malawi</td>
    <td>Point(34.0 -13.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Tunisia</td>
    <td>Point(10.0 34.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Panama</td>
    <td>Point(-80.366669444 8.616669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Bangladesh</td>
    <td>Point(89.866669444 24.016669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Brunei</td>
    <td>Point(114.566669444 4.4)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Serbia</td>
    <td>Point(20.933333333 43.95)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Bosnia_and_Herzegovina</td>
    <td>Point(18.0 44.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Luxembourg</td>
    <td>Point(6.13 49.77)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Belarus</td>
    <td>Point(28.046666666 53.528333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Namibia</td>
    <td>Point(17.0 -23.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Suriname</td>
    <td>Point(-56.0 4.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Senegal</td>
    <td>Point(-14.283330555 14.366669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Equatorial_Guinea</td>
    <td>Point(10.0 1.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Indiana</td>
    <td>Point(-86.216666666 39.933333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Virginia</td>
    <td>Point(-79.0 38.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_West_Virginia</td>
    <td>Point(-80.5 39.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Benin</td>
    <td>Point(2.183333333 8.833333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Syria</td>
    <td>Point(38.583330555 35.216669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Alberta</td>
    <td>Point(-115.0 55.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Kyrgyzstan</td>
    <td>Point(75.0 41.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Akrotiri_and_Dhekelia</td>
    <td>Point(32.983333333 34.583333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Madagascar</td>
    <td>Point(47.0 -20.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Isle_of_Man</td>
    <td>Point(-4.5 54.25)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Philippines</td>
    <td>Point(123.0 12.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Guyana</td>
    <td>Point(-59.316669444 5.733330555)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_New_Hampshire</td>
    <td>Point(-71.5 44.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Togo</td>
    <td>Point(1.183330555 8.25)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Costa_Rica</td>
    <td>Point(-84.0 10.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Peru</td>
    <td>Point(-76.0 -9.4)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_New_York_(state)</td>
    <td>Point(-75.0 43.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Hubei</td>
    <td>Point(112.3 31.2)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Asturias</td>
    <td>Point(-6.0 43.333333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Malta</td>
    <td>Point(14.5 35.883333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_mainland_China</td>
    <td>Point(103.0 35.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Germany</td>
    <td>Point(10.0 51.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Burundi</td>
    <td>Point(29.816669444 -3.666669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_New_York_City</td>
    <td>Point(-73.94 40.67)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Grenada</td>
    <td>Point(-61.666669444 12.116669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Myanmar</td>
    <td>Point(96.0 22.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_British_Virgin_Islands</td>
    <td>Point(-64.5 18.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Sierra_Leone</td>
    <td>Point(-11.916669444 8.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Central_African_Republic</td>
    <td>Point(20.9 6.7)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Liechtenstein</td>
    <td>Point(9.553888888 47.145)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Colombia</td>
    <td>Point(-74.0 4.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Cameroon</td>
    <td>Point(12.0 7.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Slovenia</td>
    <td>Point(15.0 46.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Latvia</td>
    <td>Point(25.0 57.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Guadeloupe</td>
    <td>Point(-62.0 16.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Oceania</td>
    <td>Point(166.0 -21.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_United_Kingdom</td>
    <td>Point(-2.0 54.6)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Estonia</td>
    <td>Point(26.0 59.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_French_Guiana</td>
    <td>Point(-52.999938888 3.998861111)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Mayotte</td>
    <td>Point(45.138333333 -12.843055555)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Algeria</td>
    <td>Point(1.0 28.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Argentina</td>
    <td>Point(-64.0 -34.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Sevastopol</td>
    <td>Point(33.533333333 44.6)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Croatia</td>
    <td>Point(15.466669444 45.25)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Ghana</td>
    <td>Point(-0.5 8.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Seychelles</td>
    <td>Point(52.766669444 -7.1)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Saint_Vincent_and_the_Grenadines</td>
    <td>Point(-61.233333333 13.166666666)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Jersey</td>
    <td>Point(-2.11 49.19)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Cyprus</td>
    <td>Point(33.0 35.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_United_States_Virgin_Islands</td>
    <td>Point(-64.833330555 18.333330555)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Kentucky</td>
    <td>Point(-85.0 38.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Maryland</td>
    <td>Point(-76.7 39.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Tennessee</td>
    <td>Point(-86.0 36.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Iowa</td>
    <td>Point(-93.0 42.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Kansas</td>
    <td>Point(-98.0 38.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_the_Gambia</td>
    <td>Point(-15.5 13.5)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Pennsylvania</td>
    <td>Point(-77.5 41.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Chad</td>
    <td>Point(19.4 15.466669444)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Maharashtra</td>
    <td>Point(76.42 19.56)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Uganda</td>
    <td>Point(32.39 1.28)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Eritrea</td>
    <td>Point(38.25 15.483330555)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Botswana</td>
    <td>Point(23.7 -22.2)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Guinea-Bissau</td>
    <td>Point(-15.0 12.0)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Anguilla</td>
    <td>Point(-63.05 18.233333333)</td>
  </tr>
  <tr>
    <td>https://en.wikipedia.org/wiki/COVID-19_pandemic_in_Sabah</td>
    <td>Point(117.0 5.3)</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/wikipediaOnMap.rq | sed 's+<lang/>+en+' > wikipediaOnMap.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@wikipediaOnMap.rq
```
This SPARQL query is available under CCZero.
