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
    <td><b>facetLabel</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87580938</td>
    <td>2020 coronavirus pandemic in Cyprus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87587760</td>
    <td>2020 coronavirus pandemic in Malta</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87587763</td>
    <td>2020 coronavirus pandemic in Peru</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87589123</td>
    <td>2020 coronavirus pandemic in Paraguay</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87589148</td>
    <td>2020 coronavirus pandemic in Jordan</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87589392</td>
    <td>2020 coronavirus pandemic in Honduras</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87590993</td>
    <td>2020 coronavirus pandemic in Cuba</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87592982</td>
    <td>2020 coronavirus pandemic in Moldova</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87610822</td>
    <td>2020 coronavirus pandemic in Jamaica</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87625383</td>
    <td>Impact of the 2019–20 coronavirus pandemic on aviation</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87625385</td>
    <td>Impact of the 2019–20 coronavirus pandemic on cinema</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87648634</td>
    <td>2020 coronavirus pandemic in Armenia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87651970</td>
    <td>2020 coronavirus pandemic in Guinea</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87651995</td>
    <td>2020 coronavirus pandemic in Kazakhstan</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87652000</td>
    <td>2020 coronavirus pandemic in Pakistan</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87652010</td>
    <td>2020 coronavirus pandemic in Venezuela</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87655119</td>
    <td>2020 coronavirus pandemic in Kosovo</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87655120</td>
    <td>2019–20 coronavirus outbreak in the Community of Madrid</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87657486</td>
    <td>2020 coronavirus pandemic in Sudan</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87659698</td>
    <td>2020 coronavirus pandemic in Guyana</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87660365</td>
    <td>2020 coronavirus pandemic in Uruguay</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87662819</td>
    <td>2020 coronavirus pandemic in Togo</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87662895</td>
    <td>2020 coronavirus pandemic in the Maldives</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87664046</td>
    <td>2020 coronavirus pandemic in Suriname</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87665038</td>
    <td>2020 coronavirus pandemic in Ethiopia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87665364</td>
    <td>2020 coronavirus pandemic in Burkina Faso</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87666042</td>
    <td>2020 coronavirus pandemic in Gabon</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87666247</td>
    <td>2020 coronavirus pandemic in Ghana</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87669612</td>
    <td>2020 coronavirus pandemic in Guatemala</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87687648</td>
    <td>2020 coronavirus pandemic in Saint Vincent and the Grenadines</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87694131</td>
    <td>2020 coronavirus pandemic in Trinidad and Tobago</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87704267</td>
    <td>2020 coronavirus pandemic in Ivory Coast</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87705884</td>
    <td>2020 coronavirus pandemic in Kenya</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87706558</td>
    <td>2020 coronavirus pandemic in the Democratic Republic of the Congo</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87707727</td>
    <td>2020 coronavirus pandemic in Saint Lucia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87708331</td>
    <td>2020 coronavirus pandemic in Antigua and Barbuda</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87708719</td>
    <td>2020 coronavirus pandemic in Aruba</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87708832</td>
    <td>2020 coronavirus pandemic in Mongolia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87709760</td>
    <td>2020 coronavirus pandemic in Curaçao</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87709900</td>
    <td>2020 coronavirus pandemic in Mauritania</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87709973</td>
    <td>2020 coronavirus pandemic in Eswatini</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87714704</td>
    <td>2020 coronavirus pandemic in Rwanda</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87715166</td>
    <td>2020 coronavirus pandemic in Bhutan</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87715843</td>
    <td>2020 coronavirus pandemic in Andorra</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87718451</td>
    <td>2020 coronavirus pandemic in Nigeria</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87719499</td>
    <td>Impact of the 2019–20 coronavirus pandemic on television</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87722485</td>
    <td>2020 coronavirus pandemic in Azerbaijan</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87729500</td>
    <td>2020 coronavirus pandemic in Seychelles</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87729501</td>
    <td>2020 coronavirus pandemic in Namibia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87733671</td>
    <td>2020 coronavirus pandemic in Qatar</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87742064</td>
    <td>2020 coronavirus pandemic in Equatorial Guinea</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87742085</td>
    <td>2020 coronavirus pandemic in the Central African Republic</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87742114</td>
    <td>2020 coronavirus pandemic in the Republic of the Congo</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87743173</td>
    <td>2020 coronavirus pandemic in Northern Cyprus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87745903</td>
    <td>2020 coronavirus pandemic in Senegal</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87755488</td>
    <td>2020 coronavirus pandemic in the Bahamas</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87760968</td>
    <td>Impact of the 2019–20 coronavirus pandemic on education</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87768605</td>
    <td>2020 coronavirus pandemic in Afghanistan</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87770645</td>
    <td>2020 coronavirus pandemic in Somalia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83493517</td>
    <td>timeline of the 2019–20 coronavirus outbreak</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83741704</td>
    <td>2019–20 COVID-19 pandemic by country and territory</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83872271</td>
    <td>2019–20 coronavirus pandemic in mainland China</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83872291</td>
    <td>2019–20 coronavirus outbreak in Japan</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83872398</td>
    <td>2019–20 COVID-19 outbreak in South Korea</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83873057</td>
    <td>2019–20 coronavirus outbreak in Vietnam</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83873387</td>
    <td>2019–20 coronavirus outbreak in Singapore</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83873548</td>
    <td>2019–20 coronavirus outbreak in Australia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83873556</td>
    <td>2019–20 coronavirus outbreak in Malaysia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83873566</td>
    <td>2019–20 coronavirus outbreak in Thailand</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83873573</td>
    <td>2019–20 coronavirus outbreak in Nepal</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83873577</td>
    <td>2020 COVID-19 pandemic in the United States</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83873580</td>
    <td>2019–20 coronavirus outbreak in Canada</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83873593</td>
    <td>2020 coronavirus outbreak in France</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83888864</td>
    <td>2019–20 coronavirus outbreak in Cambodia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83889114</td>
    <td>2019–20 coronavirus outbreak in Sri Lanka</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q83889294</td>
    <td>2019–20 coronavirus outbreak in Germany</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q84030045</td>
    <td>2019–20 coronavirus outbreak in the United Arab Emirates</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q84055415</td>
    <td>2019–20 coronavirus outbreak in Finland</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q84055514</td>
    <td>2020 coronavirus pandemic in India</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q84055544</td>
    <td>2019–20 coronavirus outbreak in the Philippines</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q84056433</td>
    <td>controversy surrounding the 2019–20 Wuhan coronavirus outbreak</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q84081307</td>
    <td>2019–20 coronavirus outbreak in Taiwan</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q84081576</td>
    <td>2020 coronavirus pandemic in Sweden</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q84098939</td>
    <td>2019–20 coronavirus outbreak in Russia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q84104992</td>
    <td>2020 COVID-19 outbreak in Italy</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q84166704</td>
    <td>2019–20 COVID-19 outbreak in Spain</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q84167106</td>
    <td>2020 coronavirus pandemic in the United Kingdom</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q84318312</td>
    <td>xenophobia and racism related to the 2019–20 Wuhan coronavirus outbreak</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q84446340</td>
    <td>2019–20 coronavirus outbreak in Belgium</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q85853067</td>
    <td>list of medical professionals who died during the 2019–20 coronavirus outbreak</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q85876114</td>
    <td>2020 coronavirus outbreak in Iran</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86597685</td>
    <td>2020 coronavirus outbreak in Denmark</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86597695</td>
    <td>2020 COVID-19 outbreak in Brazil</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86628344</td>
    <td>2020 coronavirus outbreak in Mexico</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86675924</td>
    <td>2019–20 coronavirus outbreak in North Korea</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86717788</td>
    <td>2020 coronavirus outbreak in Switzerland</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86733728</td>
    <td>2020 coronavirus outbreak in Iraq</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86756826</td>
    <td>2020 coronavirus outbreak in the Netherlands</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86847911</td>
    <td>2020 coronavirus outbreak in Austria</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86886544</td>
    <td>2020 coronavirus pandemic in Norway</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86901049</td>
    <td>COVID-19 testing</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86913546</td>
    <td>2020 coronavirus outbreak in Indonesia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86919406</td>
    <td>2020 coronavirus outbreak in the Czech Republic</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86926476</td>
    <td>2020 coronavirus outbreak in Girona</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q86948603</td>
    <td>2020 COVID-19 outbreak in Portugal</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87058723</td>
    <td>2020 coronavirus outbreak in Morocco</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87066621</td>
    <td>2020 coronavirus outbreak in Latvia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87068864</td>
    <td>2020 coronavirus pandemic in Greece</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87070975</td>
    <td>2020 coronavirus pandemic in Israel</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87070999</td>
    <td>2020 coronavirus outbreak in Bahrain</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87073833</td>
    <td>Travel restrictions related to the 2019–20 coronavirus outbreak</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87116829</td>
    <td>2020 coronavirus outbreak in Egypt</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87119811</td>
    <td>2020 coronavirus pandemic in Hungary</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87121993</td>
    <td>2020 coronavirus outbreak in Iceland</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87123561</td>
    <td>2020 coronavirus outbreak in San Marino</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87186117</td>
    <td>2020 coronavirus outbreak in Saudi Arabia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87186365</td>
    <td>2020 coronavirus outbreak in the Republic of Ireland</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87191204</td>
    <td>2020 coronavirus outbreak in Chile</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87193778</td>
    <td>2020 coronavirus outbreak in Serbia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87199320</td>
    <td>2020 coronavirus outbreak in Palestine</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87200954</td>
    <td>2020 coronavirus outbreak in Slovakia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87202921</td>
    <td>2020 coronavirus outbreak in Algeria</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87204911</td>
    <td>2020 coronavirus outbreak in Estonia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87222526</td>
    <td>2020 coronavirus outbreak in Vatican City</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87235137</td>
    <td>2020 coronavirus outbreak in Argentina</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87235177</td>
    <td>2020 coronavirus outbreak in Ukraine</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87243915</td>
    <td>2020 coronavirus outbreak in South Africa</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87245450</td>
    <td>2020 coronavirus outbreak in Lebanon</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250691</td>
    <td>2020 coronavirus outbreak in Kuwait</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250695</td>
    <td>2020 coronavirus pandemic in Poland</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250713</td>
    <td>2020 coronavirus outbreak in Ecuador</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250732</td>
    <td>2020 coronavirus outbreak in Croatia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250752</td>
    <td>2020 coronavirus outbreak in Romania</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250770</td>
    <td>2020 coronavirus outbreak in Bosnia and Herzegovina</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250788</td>
    <td>2020 coronavirus outbreak in Belarus</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250803</td>
    <td>2020 coronavirus outbreak in New Zealand</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250819</td>
    <td>2020 coronavirus outbreak in Liechtenstein</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250838</td>
    <td>2020 coronavirus outbreak in Lithuania</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250860</td>
    <td>2020 coronavirus outbreak in Luxembourg</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250877</td>
    <td>2020 coronavirus outbreak in Monaco</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250897</td>
    <td>2020 coronavirus outbreak in North Macedonia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250913</td>
    <td>2020 coronavirus outbreak in Georgia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250930</td>
    <td>2020 coronavirus outbreak in Cameroon</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87250948</td>
    <td>2020 coronavirus pandemic in Slovenia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87343682</td>
    <td>2020 coronavirus outbreak in Tunisia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87412028</td>
    <td>2020 coronavirus outbreak in Brunei</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87450756</td>
    <td>2020 coronavirus outbreak in Albania</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87452683</td>
    <td>2020 coronavirus pandemic in Basque Country</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87454162</td>
    <td>2020 coronavirus outbreak in Oman</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87468681</td>
    <td>Q87468681</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87473205</td>
    <td>2020 coronavirus outbreak in Turkey</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87477462</td>
    <td>2020 coronavirus outbreak in Costa Rica</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87477841</td>
    <td>2020 coronavirus outbreak in Panama</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87480220</td>
    <td>2020 coronavirus outbreak in Bolivia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87483673</td>
    <td>2020 coronavirus pandemic in Colombia</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87486535</td>
    <td>2020 coronavirus pandemic in Bulgaria</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87491759</td>
    <td>domestic responses to the 2019–20 coronavirus pandemic</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87540454</td>
    <td>2020 coronavirus pandemic in Bangladesh</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q87563855</td>
    <td>2020 coronavirus pandemic in the Dominican Republic</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o facets.rq https://raw.githubusercontent.com/jcheminform/useful-queries/master/sparql/facets.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@facets.rq
```
