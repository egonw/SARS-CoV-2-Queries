# facets.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?facet ?facetLabel WHERE {
  ?facet wdt:P1269 wd:Q81068910 .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}

```
[Execute](https://query.wikidata.org/embed.html#SELECT%20%3Ffacet%20%3FfacetLabel%20WHERE%20%7B%0A%20%20%3Ffacet%20wdt%3AP1269%20wd%3AQ81068910%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A) or [Edit](https://query.wikidata.org/#SELECT%20%3Ffacet%20%3FfacetLabel%20WHERE%20%7B%0A%20%20%3Ffacet%20wdt%3AP1269%20wd%3AQ81068910%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A%0A)


### Output
<table>
  <tr>
    <td><b>facet</b></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83493517">timeline of the 2019–20 coronavirus outbreak</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83741704">2019–20 COVID-19 pandemic by country and territory</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83872271">2019–20 coronavirus pandemic in mainland China</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83872291">2019–20 coronavirus outbreak in Japan</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83872398">2019–20 COVID-19 outbreak in South Korea</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83873057">2019–20 coronavirus outbreak in Vietnam</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83873387">2019–20 coronavirus outbreak in Singapore</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83873548">2019–20 coronavirus outbreak in Australia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83873556">2019–20 coronavirus outbreak in Malaysia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83873566">2019–20 coronavirus outbreak in Thailand</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83873573">2019–20 coronavirus outbreak in Nepal</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83873577">2020 COVID-19 pandemic in the United States</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83873580">2020 coronavirus pandemic in Canada</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83873593">2020 coronavirus outbreak in France</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83888864">2019–20 coronavirus outbreak in Cambodia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83889114">2019–20 coronavirus outbreak in Sri Lanka</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q83889294">2020 coronavirus pandemic in Germany</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q84030045">2019–20 coronavirus outbreak in the United Arab Emirates</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q84055415">2019–20 coronavirus outbreak in Finland</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q84055514">2020 coronavirus pandemic in India</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q84055544">2019–20 coronavirus outbreak in the Philippines</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q84056433">controversy surrounding the 2019–20 Wuhan coronavirus outbreak</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q84081307">2019–20 coronavirus outbreak in Taiwan</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q84081576">2020 coronavirus pandemic in Sweden</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q84098939">2019–20 coronavirus outbreak in Russia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q84104992">2020 coronavirus pandemic in Italy</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q84166704">2019–20 COVID-19 outbreak in Spain</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q84167106">2020 coronavirus pandemic in the United Kingdom</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q84318312">xenophobia and racism related to the 2019–20 Wuhan coronavirus outbreak</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q84446340">2020 coronavirus pandemic in Belgium</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q84897850">Timeline of the 2019–20 Wuhan coronavirus outbreak in November 2019 – January 2020</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q85173855">2019–20 coronavirus outbreak data tables</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q85853067">list of medical professionals who died during the 2019–20 coronavirus outbreak</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q85876114">2020 coronavirus outbreak in Iran</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86597685">2020 coronavirus outbreak in Denmark</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86597695">2020 COVID-19 outbreak in Brazil</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86628344">2020 coronavirus outbreak in Mexico</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86675924">2019–20 coronavirus outbreak in North Korea</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86717788">2020 coronavirus pandemic in Switzerland</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86733728">2020 coronavirus outbreak in Iraq</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86756826">2020 coronavirus outbreak in the Netherlands</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86847911">2020 coronavirus outbreak in Austria</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86886544">2020 coronavirus pandemic in Norway</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86901049">COVID-19 testing</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86913546">2020 coronavirus outbreak in Indonesia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86919406">2020 coronavirus outbreak in the Czech Republic</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86926476">2020 coronavirus outbreak in Girona</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q86948603">2020 coronavirus pandemic in Portugal</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87058723">2020 coronavirus outbreak in Morocco</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87066621">2020 coronavirus outbreak in Latvia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87068864">2020 coronavirus pandemic in Greece</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87070975">2020 coronavirus pandemic in Israel</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87070999">2020 coronavirus outbreak in Bahrain</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87073833">Travel restrictions related to the 2019–20 coronavirus outbreak</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87116829">2020 coronavirus outbreak in Egypt</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87119811">2020 coronavirus pandemic in Hungary</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87121993">2020 coronavirus outbreak in Iceland</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87123561">2020 coronavirus outbreak in San Marino</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87186117">2020 coronavirus outbreak in Saudi Arabia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87186365">2020 coronavirus outbreak in the Republic of Ireland</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87191204">2020 coronavirus outbreak in Chile</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87193778">2020 coronavirus outbreak in Serbia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87199320">2020 coronavirus pandemic in the State of Palestine</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87200954">2020 coronavirus outbreak in Slovakia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87202921">2020 coronavirus outbreak in Algeria</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87204911">2020 coronavirus outbreak in Estonia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87222526">2020 coronavirus outbreak in Vatican City</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87235137">2020 coronavirus outbreak in Argentina</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87235177">2020 coronavirus outbreak in Ukraine</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87243915">2020 coronavirus outbreak in South Africa</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87245450">2020 coronavirus outbreak in Lebanon</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250691">2020 coronavirus outbreak in Kuwait</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250695">2020 coronavirus pandemic in Poland</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250713">2020 coronavirus outbreak in Ecuador</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250732">2020 coronavirus outbreak in Croatia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250752">2020 coronavirus pandemic in Romania</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250770">2020 coronavirus outbreak in Bosnia and Herzegovina</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250788">2020 coronavirus outbreak in Belarus</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250803">2020 coronavirus outbreak in New Zealand</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250819">2020 coronavirus pandemic in Liechtenstein</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250838">2020 coronavirus outbreak in Lithuania</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250860">2020 coronavirus outbreak in Luxembourg</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250877">2020 coronavirus outbreak in Monaco</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250897">2020 coronavirus outbreak in North Macedonia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250913">2020 coronavirus outbreak in Georgia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250930">2020 coronavirus outbreak in Cameroon</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87250948">2020 coronavirus pandemic in Slovenia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87343682">2020 coronavirus outbreak in Tunisia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87412028">2020 coronavirus outbreak in Brunei</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87450756">2020 coronavirus outbreak in Albania</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87452683">2020 coronavirus pandemic in Basque Country</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87454162">2020 coronavirus outbreak in Oman</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87468681">Q87468681</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87473205">2020 coronavirus outbreak in Turkey</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87477462">2020 coronavirus outbreak in Costa Rica</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87477841">2020 coronavirus outbreak in Panama</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87479384">cancelled event due to the 2019–20 coronavirus pandemic</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87480220">2020 coronavirus outbreak in Bolivia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87483673">2020 coronavirus pandemic in Colombia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87486535">2020 coronavirus pandemic in Bulgaria</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88177037">2020 coronavirus outbreak in Catalonia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87491759">domestic responses to the 2019–20 coronavirus pandemic</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87540454">2020 coronavirus pandemic in Bangladesh</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87563855">2020 coronavirus pandemic in the Dominican Republic</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87580938">2020 coronavirus pandemic in Cyprus</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87587760">2020 coronavirus pandemic in Malta</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87587763">2020 coronavirus pandemic in Peru</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87589123">2020 coronavirus pandemic in Paraguay</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87589148">2020 coronavirus pandemic in Jordan</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87589392">2020 coronavirus pandemic in Honduras</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87589400">Impact of the 2019–20 coronavirus pandemic on sports</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87590993">2020 coronavirus pandemic in Cuba</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87592982">2020 coronavirus pandemic in Moldova</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87610822">2020 coronavirus pandemic in Jamaica</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87625383">Impact of the 2019–20 coronavirus pandemic on aviation</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87625385">Impact of the 2019–20 coronavirus pandemic on cinema</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87648634">2020 coronavirus pandemic in Armenia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87651970">2020 coronavirus pandemic in Guinea</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87651995">2020 coronavirus pandemic in Kazakhstan</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87652000">2020 coronavirus pandemic in Pakistan</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87652010">2020 coronavirus pandemic in Venezuela</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87655119">2020 coronavirus pandemic in Kosovo</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87655120">2020 coronavirus pandemic in the Community of Madrid</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87657486">2020 coronavirus pandemic in Sudan</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87659698">2020 coronavirus pandemic in Guyana</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87660365">2020 coronavirus pandemic in Uruguay</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87662819">2020 coronavirus pandemic in Togo</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87662895">2020 coronavirus pandemic in the Maldives</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87664046">2020 coronavirus pandemic in Suriname</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87665038">2020 coronavirus pandemic in Ethiopia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87665364">2020 coronavirus pandemic in Burkina Faso</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87666042">2020 coronavirus pandemic in Gabon</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87666247">2020 coronavirus pandemic in Ghana</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87669612">2020 coronavirus pandemic in Guatemala</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87687648">2020 coronavirus pandemic in Saint Vincent and the Grenadines</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87694131">2020 coronavirus pandemic in Trinidad and Tobago</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87704267">2020 coronavirus pandemic in Ivory Coast</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87705884">2020 coronavirus pandemic in Kenya</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87706558">2020 coronavirus pandemic in the Democratic Republic of the Congo</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87707727">2020 coronavirus pandemic in Saint Lucia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87708331">2020 coronavirus pandemic in Antigua and Barbuda</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87708719">2020 coronavirus pandemic in Aruba</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87708832">2020 coronavirus pandemic in Mongolia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87709760">2020 coronavirus pandemic in Curaçao</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87709900">2020 coronavirus pandemic in Mauritania</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87709973">2020 coronavirus pandemic in Eswatini</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87714704">2020 coronavirus pandemic in Rwanda</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87715166">2020 coronavirus pandemic in Bhutan</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87715843">2020 coronavirus pandemic in Andorra</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87718451">2020 coronavirus pandemic in Nigeria</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87719499">Impact of the 2019–20 coronavirus pandemic on television</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87722485">2020 coronavirus pandemic in Azerbaijan</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87729500">2020 coronavirus pandemic in Seychelles</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87729501">2020 coronavirus pandemic in Namibia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87733671">2020 coronavirus pandemic in Qatar</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87742064">2020 coronavirus pandemic in Equatorial Guinea</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87742085">2020 coronavirus pandemic in the Central African Republic</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87742114">2020 coronavirus pandemic in the Republic of the Congo</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87743173">2020 coronavirus pandemic in Northern Cyprus</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87745903">2020 coronavirus pandemic in Senegal</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87755488">2020 coronavirus pandemic in the Bahamas</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87760968">Impact of the 2019–20 coronavirus pandemic on education</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87766242">2020 coronavirus pandemic in Liberia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87768605">2020 coronavirus pandemic in Afghanistan</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87770645">2020 coronavirus pandemic in Somalia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87770827">2020 coronavirus pandemic in Tanzania</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87774378">Timeline of the 2019–20 coronavirus pandemic in March 2020</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87781572">2020 coronavirus pandemic in Benin</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87785296">2020 coronavirus pandemic in Greenland</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87796964">Human rights issues during the 2019–20 coronavirus pandemic</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87814953">2020 coronavirus pandemic in Syria</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87887813">2020 coronavirus pandemic in Montenegro</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87897344">Impact of the 2019–20 coronavirus pandemic on politics</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87898060">Impact of the 2019–20 coronavirus pandemic on religion</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87899016">2020 coronavirus pandemic in the Gambia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87899022">2020 coronavirus pandemic in Djibouti</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87901408">2020 coronavirus pandemic in Alberta</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87902950">2020 coronavirus pandemic in Kyrgyzstan</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87975745">2020 coronavirus pandemic in Fiji</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87976489">2020 coronavirus pandemic in El Salvador</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87976629">2020 coronavirus pandemic in Zambia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87976701">2020 coronavirus pandemic in Nicaragua</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87979033">2020 coronavirus pandemic in Mauritius</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q87985395">COVID-19 pandemic/statistic</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88024576">2020 coronavirus pandemic in Quebec</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082409">2020 coronavirus pandemic in Akrotiri and Dhekelia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082534">2020 coronavirus pandemic in Angola</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082556">2020 coronavirus pandemic in Bermuda</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082587">2020 coronavirus pandemic in British Columbia</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082622">2020 coronavirus pandemic in Canary Islands</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082639">2020 coronavirus pandemic in Cape Verde</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082670">2020 coronavirus pandemic in Chad</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082693">2020 coronavirus pandemic in Haiti</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082727">2020 coronavirus pandemic in Klang Valley</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082758">2020 coronavirus pandemic in Metro Manila</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082786">2020 coronavirus pandemic in New Brunswick</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082809">2020 coronavirus pandemic in Niger</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082830">2020 coronavirus pandemic in Ontario</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082857">2020 coronavirus pandemic in Sabah</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082922">2020 coronavirus pandemic in Sint Maarten</a></td>
  </tr>
  <tr>
    <td><a href="http://www.wikidata.org/entity/Q88082994">2020 coronavirus pandemic in the Isle of Man</a></td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o facets.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/facets.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@facets.rq
```
This SPARQL query is available under CCZero.
