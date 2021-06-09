# wikipediaOnMap.rq
**Ejemplos de código:** [curl](#curl)
### SPARQL
```sparql
#defaultView:Map
SELECT DISTINCT ?wpArticle ?itemLabel ?coord WHERE {
  ?wpArticle a schema:Article ;
    schema:about ?item ;
    schema:isPartOf <https://es.wikipedia.org/> .
  ?item p:P31 [ ps:P31 wd:Q3241045 ; pq:P642 wd:Q84263196 ] ;
    wdt:P625 ?coord ;
    rdfs:label ?itemLabel . FILTER(LANG(?itemLabel)="es")
}
```
[ejecutar](https://query.wikidata.org/embed.html#%23defaultView%3AMap%0ASELECT%20DISTINCT%20%3FwpArticle%20%3FitemLabel%20%3Fcoord%20WHERE%20%7B%0A%20%20%3FwpArticle%20a%20schema%3AArticle%20%3B%0A%20%20%20%20schema%3Aabout%20%3Fitem%20%3B%0A%20%20%20%20schema%3AisPartOf%20%3Chttps%3A%2F%2Fes.wikipedia.org%2F%3E%20.%0A%20%20%3Fitem%20p%3AP31%20%5B%20ps%3AP31%20wd%3AQ3241045%20%3B%20pq%3AP642%20wd%3AQ84263196%20%5D%20%3B%0A%20%20%20%20wdt%3AP625%20%3Fcoord%20%3B%0A%20%20%20%20rdfs%3Alabel%20%3FitemLabel%20.%20FILTER%28LANG%28%3FitemLabel%29%3D%22es%22%29%0A%7D%0A) o [editar](https://query.wikidata.org/#%23defaultView%3AMap%0ASELECT%20DISTINCT%20%3FwpArticle%20%3FitemLabel%20%3Fcoord%20WHERE%20%7B%0A%20%20%3FwpArticle%20a%20schema%3AArticle%20%3B%0A%20%20%20%20schema%3Aabout%20%3Fitem%20%3B%0A%20%20%20%20schema%3AisPartOf%20%3Chttps%3A%2F%2Fes.wikipedia.org%2F%3E%20.%0A%20%20%3Fitem%20p%3AP31%20%5B%20ps%3AP31%20wd%3AQ3241045%20%3B%20pq%3AP642%20wd%3AQ84263196%20%5D%20%3B%0A%20%20%20%20wdt%3AP625%20%3Fcoord%20%3B%0A%20%20%20%20rdfs%3Alabel%20%3FitemLabel%20.%20FILTER%28LANG%28%3FitemLabel%29%3D%22es%22%29%0A%7D%0A)


### Resultados
<table>
  <tr>
    <td><b>wpArticle</b></td>
    <td><b>coord</b></td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Jalisco</td>
    <td>Point(-103.676388888 20.566666666)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Suecia</td>
    <td>Point(15.0 61.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Malasia</td>
    <td>Point(108.0 3.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Vietnam</td>
    <td>Point(108.0 16.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Tailandia</td>
    <td>Point(101.0 14.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Irlanda</td>
    <td>Point(-8.0 53.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Rumania</td>
    <td>Point(25.0 46.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_L%C3%ADbano</td>
    <td>Point(35.766669444 33.833330555)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Rep%C3%BAblica_Dominicana</td>
    <td>Point(-70.2 18.8)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Ciudad_del_Vaticano</td>
    <td>Point(12.453055555 41.903888888)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Washington</td>
    <td>Point(-120.5 47.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Italia</td>
    <td>Point(12.5 42.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Singapur</td>
    <td>Point(103.8 1.3)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Emiratos_%C3%81rabes_Unidos</td>
    <td>Point(54.3 24.4)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Corea_del_Sur</td>
    <td>Point(128.0 36.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Camboya</td>
    <td>Point(105.0 12.6)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Washington_D._C.</td>
    <td>Point(-77.036666666 38.895)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Nueva_Jersey</td>
    <td>Point(-74.5 40.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Kosovo</td>
    <td>Point(20.833333333 42.55)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Honduras</td>
    <td>Point(-86.816669444 14.633330555)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Finlandia</td>
    <td>Point(27.0 65.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Bar%C3%A9in</td>
    <td>Point(50.551111111 26.0675)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Ir%C3%A1n</td>
    <td>Point(53.0 32.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Nicaragua</td>
    <td>Point(-85.0 13.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Vermont</td>
    <td>Point(-72.7 44.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Rep%C3%BAblica_Democr%C3%A1tica_del_Congo</td>
    <td>Point(23.656111111 -2.88)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Carolina_del_Norte</td>
    <td>Point(-80.0 35.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_M%C3%ADchigan</td>
    <td>Point(-85.58 44.34)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Colorado</td>
    <td>Point(-105.5 39.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Burkina_Faso</td>
    <td>Point(-2.066669444 12.266669444)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Arkansas</td>
    <td>Point(-92.2 34.8)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Carolina_del_Sur</td>
    <td>Point(-81.0 34.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Fiyi</td>
    <td>Point(178.0 -18.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Zambia</td>
    <td>Point(28.0 -14.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Montenegro</td>
    <td>Point(19.216669444 42.766669444)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Tanzania</td>
    <td>Point(34.853888888 -6.306944444)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Quintana_Roo</td>
    <td>Point(-87.916666666 19.6)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Rep%C3%BAblica_Popular_de_Lugansk</td>
    <td>Point(39.02 48.92)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Bermudas</td>
    <td>Point(-64.75 32.333330555)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Timor_Oriental</td>
    <td>Point(125.75 -8.966669444)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_El_Salvador</td>
    <td>Point(-88.866111111 13.668888888)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Uni%C3%B3n_Europea</td>
    <td>Point(9.2 50.1)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Suiza</td>
    <td>Point(8.231973055 46.798561944)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Espa%C3%B1a</td>
    <td>Point(-3.0 40.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Austria</td>
    <td>Point(14.0 48.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Laos</td>
    <td>Point(104.0 18.2)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Islas_Malvinas</td>
    <td>Point(-59.0 -51.8)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Transnistria</td>
    <td>Point(29.624444444 46.842222222)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Pap%C3%BAa_Nueva_Guinea</td>
    <td>Point(147.0 -6.3)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Israel</td>
    <td>Point(35.0 31.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_San_Bartolom%C3%A9</td>
    <td>Point(-62.834244444 17.897727777)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Indonesia</td>
    <td>Point(118.0 -2.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Bulgaria</td>
    <td>Point(25.5 42.75)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Nueva_Caledonia</td>
    <td>Point(165.3 -21.25)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Angola</td>
    <td>Point(17.35 -12.35)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Kazajist%C3%A1n</td>
    <td>Point(68.0 48.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_California</td>
    <td>Point(-120.0 37.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Rusia</td>
    <td>Point(100.0 62.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_%C3%81frica</td>
    <td>Point(17.0 1.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Dinamarca</td>
    <td>Point(10.0 56.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Am%C3%A9rica_del_Norte</td>
    <td>Point(-105.0 47.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Islandia</td>
    <td>Point(-19.0 65.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Albania</td>
    <td>Point(20.0 41.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Lituania</td>
    <td>Point(24.0 55.2)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Paraguay</td>
    <td>Point(-58.0 -23.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Noruega</td>
    <td>Point(11.0 65.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Hungr%C3%ADa</td>
    <td>Point(19.0 47.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Corea_del_Norte</td>
    <td>Point(127.0 40.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Massachusetts</td>
    <td>Point(-71.8 42.3)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Trinidad_y_Tobago</td>
    <td>Point(-61.516666666 10.666666666)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Nigeria</td>
    <td>Point(8.0 9.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Wallis_y_Futuna</td>
    <td>Point(-178.109319444 -14.301811111)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Georgia</td>
    <td>Point(43.733055555 42.016944444)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Costa_de_Marfil</td>
    <td>Point(-6.0 8.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Jap%C3%B3n</td>
    <td>Point(136.0 35.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_la_India</td>
    <td>Point(77.0 22.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Sri_Lanka</td>
    <td>Point(81.0 7.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Australia</td>
    <td>Point(137.0 -28.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Nepal</td>
    <td>Point(84.0 28.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Puerto_Rico</td>
    <td>Point(-66.5 18.25)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Oreg%C3%B3n</td>
    <td>Point(-120.575 43.935830555)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Diamond_Princess</td>
    <td>Point(139.702416666 35.463694444)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Sud%C3%A1frica</td>
    <td>Point(24.0 -29.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Ucrania</td>
    <td>Point(32.0 49.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_M%C3%A9xico</td>
    <td>Point(-102.0 23.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Cuba</td>
    <td>Point(-79.5 22.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Jordania</td>
    <td>Point(36.5 31.2)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Armenia</td>
    <td>Point(44.95 40.383330555)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Moldavia</td>
    <td>Point(28.516669444 47.25)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Macao</td>
    <td>Point(113.55 22.166666666)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Brasil</td>
    <td>Point(-53.0 -14.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Hong_Kong</td>
    <td>Point(114.166666666 22.283333333)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Canad%C3%A1</td>
    <td>Point(-109.0 56.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Guatemala</td>
    <td>Point(-90.533333333 14.616666666)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Antigua_y_Barbuda</td>
    <td>Point(-61.85 17.116666666)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Uruguay</td>
    <td>Point(-56.65 -32.733333333)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Pakist%C3%A1n</td>
    <td>Point(71.0 30.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Venezuela</td>
    <td>Point(-67.0 8.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Florida</td>
    <td>Point(-81.6 28.1)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Delaware</td>
    <td>Point(-75.5 39.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Georgia_(Estados_Unidos)</td>
    <td>Point(-83.5 33.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Barbados</td>
    <td>Point(-59.5525 13.17)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Arizona</td>
    <td>Point(-111.656938888 34.286669444)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Oklahoma</td>
    <td>Point(-98.0 35.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Nebraska</td>
    <td>Point(-100.0 41.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Sahara_Occidental</td>
    <td>Point(-13.0 25.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Tayikist%C3%A1n</td>
    <td>Point(71.366669444 38.583330555)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Ant%C3%A1rtida</td>
    <td>Point(-57.8875 -63.320833333)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Rep%C3%BAblica_Popular_de_Donetsk</td>
    <td>Point(37.804166666 48.008888888)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_San_Crist%C3%B3bal_y_Nieves</td>
    <td>Point(-62.666669444 17.33)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_T%C3%BAnez</td>
    <td>Point(10.0 34.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Panam%C3%A1</td>
    <td>Point(-80.366669444 8.616669444)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Banglad%C3%A9s</td>
    <td>Point(89.866669444 24.016669444)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Brun%C3%A9i</td>
    <td>Point(114.566669444 4.4)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Belice</td>
    <td>Point(-88.7 17.066666666)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Samoa</td>
    <td>Point(-172.0 -14.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Yemen</td>
    <td>Point(48.0 15.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Turkmenist%C3%A1n</td>
    <td>Point(60.0 39.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Dominica</td>
    <td>Point(-61.333330555 15.416669444)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Aruba</td>
    <td>Point(-69.974166666 12.511111111)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Catar</td>
    <td>Point(51.212769444 25.269538888)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Luisiana</td>
    <td>Point(-92.0 31.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Islas_Caim%C3%A1n</td>
    <td>Point(-80.5 19.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_But%C3%A1n</td>
    <td>Point(90.5 27.45)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Minesota</td>
    <td>Point(-94.0 46.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Luxemburgo</td>
    <td>Point(6.13 49.77)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Arabia_Saudita</td>
    <td>Point(44.116669444 23.716669444)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Marruecos</td>
    <td>Point(-6.0 32.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Chile</td>
    <td>Point(-71.0 -33.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Egipto</td>
    <td>Point(29.0 27.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Nuevo_Hampshire</td>
    <td>Point(-71.5 44.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Surinam</td>
    <td>Point(-56.0 4.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Guinea_Ecuatorial</td>
    <td>Point(10.0 1.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Indiana</td>
    <td>Point(-86.216666666 39.933333333)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Virginia</td>
    <td>Point(-79.0 38.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Texas</td>
    <td>Point(-100.0 31.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Connecticut</td>
    <td>Point(-72.7 41.6)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Wisconsin</td>
    <td>Point(-89.5 44.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Rhode_Island</td>
    <td>Point(-71.5 41.7)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Illinois</td>
    <td>Point(-89.0 40.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Ohio</td>
    <td>Point(-82.5 40.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Alaska</td>
    <td>Point(-150.0 64.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Afganist%C3%A1n</td>
    <td>Point(66.0 34.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Haw%C3%A1i</td>
    <td>Point(-157.796388888 21.311388888)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Bahamas</td>
    <td>Point(-76.4 23.7)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Serbia</td>
    <td>Point(20.933333333 43.95)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Bosnia_y_Herzegovina</td>
    <td>Point(18.0 44.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Bielorrusia</td>
    <td>Point(28.046666666 53.528333333)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Virginia_Occidental</td>
    <td>Point(-80.5 39.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Ben%C3%ADn</td>
    <td>Point(2.183333333 8.833333333)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Isla_de_Man</td>
    <td>Point(-4.5 54.25)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Acrotiri_y_Dhekelia</td>
    <td>Point(32.983333333 34.583333333)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Turqu%C3%ADa</td>
    <td>Point(36.0 39.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_la_ciudad_de_Nueva_York</td>
    <td>Point(-73.94 40.67)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Granada</td>
    <td>Point(-61.666669444 12.116669444)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Islas_V%C3%ADrgenes_Brit%C3%A1nicas</td>
    <td>Point(-64.5 18.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Sierra_Leona</td>
    <td>Point(-11.916669444 8.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Curazao</td>
    <td>Point(-68.966666666 12.166666666)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Mongolia</td>
    <td>Point(104.0 47.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Mauritania</td>
    <td>Point(-11.0 21.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Santa_Luc%C3%ADa</td>
    <td>Point(-61.0 13.883330555)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Rep%C3%BAblica_Turca_del_Norte_de_Chipre</td>
    <td>Point(33.363473888 35.180975)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_N%C3%ADger</td>
    <td>Point(10.0 17.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Islas_Marianas_del_Norte</td>
    <td>Point(146.0 17.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Groenlandia</td>
    <td>Point(-40.0 72.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Hait%C3%AD</td>
    <td>Point(-72.8 19.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Guam</td>
    <td>Point(144.8 13.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Mal%C3%AD</td>
    <td>Point(-4.0 17.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Filipinas</td>
    <td>Point(123.0 12.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Gab%C3%B3n</td>
    <td>Point(12.0 -1.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Jamaica</td>
    <td>Point(-77.4 18.18)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Bolivia</td>
    <td>Point(-64.991228611 -17.056869611)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Rep%C3%BAblica_Popular_China</td>
    <td>Point(103.0 35.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Alemania</td>
    <td>Point(10.0 51.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Costa_Rica</td>
    <td>Point(-84.0 10.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Guyana</td>
    <td>Point(-59.316669444 5.733330555)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Per%C3%BA</td>
    <td>Point(-76.0 -9.4)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Am%C3%A9rica</td>
    <td>Point(-100.0 20.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Nueva_York</td>
    <td>Point(-75.0 43.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Asturias</td>
    <td>Point(-6.0 43.333333333)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Estonia</td>
    <td>Point(26.0 59.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Guayana_Francesa</td>
    <td>Point(-52.999938888 3.998861111)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Argelia</td>
    <td>Point(1.0 28.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Liechtenstein</td>
    <td>Point(9.553888888 47.145)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Colombia</td>
    <td>Point(-74.0 4.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Eslovenia</td>
    <td>Point(15.0 46.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Argentina</td>
    <td>Point(-64.0 -34.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Croacia</td>
    <td>Point(15.466669444 45.25)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Kuwait</td>
    <td>Point(47.6 29.166669444)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Irak</td>
    <td>Point(43.0 33.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_San_Marino</td>
    <td>Point(12.466666666 43.933333333)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Palestina</td>
    <td>Point(35.25 32.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Letonia</td>
    <td>Point(25.0 57.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Ocean%C3%ADa</td>
    <td>Point(166.0 -21.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_el_Reino_Unido</td>
    <td>Point(-2.0 54.6)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Guayana_Esequiba</td>
    <td>Point(-59.7 6.3)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Nuevo_M%C3%A9xico</td>
    <td>Point(-106.0 34.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Cabo_Verde</td>
    <td>Point(-24.083333333 15.916666666)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Botsuana</td>
    <td>Point(23.7 -22.2)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Guinea-Bis%C3%A1u</td>
    <td>Point(-15.0 12.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Sebastopol</td>
    <td>Point(33.533333333 44.6)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Anguila</td>
    <td>Point(-63.05 18.233333333)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Seychelles</td>
    <td>Point(52.766669444 -7.1)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Rep%C3%BAblica_Centroafricana</td>
    <td>Point(20.9 6.7)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Chipre</td>
    <td>Point(33.0 35.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Islas_V%C3%ADrgenes_de_los_Estados_Unidos</td>
    <td>Point(-64.833330555 18.333330555)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Kentucky</td>
    <td>Point(-85.0 38.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Tennessee</td>
    <td>Point(-86.0 36.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Iowa</td>
    <td>Point(-93.0 42.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Kansas</td>
    <td>Point(-98.0 38.5)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Pensilvania</td>
    <td>Point(-77.5 41.0)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Chad</td>
    <td>Point(19.4 15.466669444)</td>
  </tr>
  <tr>
    <td>https://es.wikipedia.org/wiki/Pandemia_de_COVID-19_en_Maryland</td>
    <td>Point(-76.7 39.0)</td>
  </tr>
</table>
## Ejemplos de código
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/wikipediaOnMap.rq | sed 's+<lang/>+es+' > wikipediaOnMap.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@wikipediaOnMap.rq
```
Esta consulta SPARQL está disponible en CCZero.
