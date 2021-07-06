# wikipediaOnMap.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
#defaultView:Map
SELECT DISTINCT ?wpArticle ?itemLabel ?coord WHERE {
  ?wpArticle a schema:Article ;
    schema:about ?item ;
    schema:isPartOf <https://pt.wikipedia.org/> .
  ?item p:P31 [ ps:P31 wd:Q3241045 ; pq:P642 wd:Q84263196 ] ;
    wdt:P625 ?coord ;
    rdfs:label ?itemLabel . FILTER(LANG(?itemLabel)="pt")
}
```
[run](https://query.wikidata.org/embed.html#%23defaultView%3AMap%0ASELECT%20DISTINCT%20%3FwpArticle%20%3FitemLabel%20%3Fcoord%20WHERE%20%7B%0A%20%20%3FwpArticle%20a%20schema%3AArticle%20%3B%0A%20%20%20%20schema%3Aabout%20%3Fitem%20%3B%0A%20%20%20%20schema%3AisPartOf%20%3Chttps%3A%2F%2Fpt.wikipedia.org%2F%3E%20.%0A%20%20%3Fitem%20p%3AP31%20%5B%20ps%3AP31%20wd%3AQ3241045%20%3B%20pq%3AP642%20wd%3AQ84263196%20%5D%20%3B%0A%20%20%20%20wdt%3AP625%20%3Fcoord%20%3B%0A%20%20%20%20rdfs%3Alabel%20%3FitemLabel%20.%20FILTER%28LANG%28%3FitemLabel%29%3D%22pt%22%29%0A%7D%0A) or [edit](https://query.wikidata.org/#%23defaultView%3AMap%0ASELECT%20DISTINCT%20%3FwpArticle%20%3FitemLabel%20%3Fcoord%20WHERE%20%7B%0A%20%20%3FwpArticle%20a%20schema%3AArticle%20%3B%0A%20%20%20%20schema%3Aabout%20%3Fitem%20%3B%0A%20%20%20%20schema%3AisPartOf%20%3Chttps%3A%2F%2Fpt.wikipedia.org%2F%3E%20.%0A%20%20%3Fitem%20p%3AP31%20%5B%20ps%3AP31%20wd%3AQ3241045%20%3B%20pq%3AP642%20wd%3AQ84263196%20%5D%20%3B%0A%20%20%20%20wdt%3AP625%20%3Fcoord%20%3B%0A%20%20%20%20rdfs%3Alabel%20%3FitemLabel%20.%20FILTER%28LANG%28%3FitemLabel%29%3D%22pt%22%29%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>wpArticle</b></td>
    <td><b>coord</b></td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Su%C3%A9cia</td>
    <td>Point(15.0 61.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Nicar%C3%A1gua</td>
    <td>Point(-85.0 13.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Mal%C3%A1sia</td>
    <td>Point(108.0 3.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Vietn%C3%A3</td>
    <td>Point(108.0 16.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Tail%C3%A2ndia</td>
    <td>Point(101.0 14.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Finl%C3%A2ndia</td>
    <td>Point(27.0 65.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Ir%C3%A3</td>
    <td>Point(53.0 32.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Qu%C3%AAnia</td>
    <td>Point(38.0 0.1)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Guin%C3%A9</td>
    <td>Point(-11.0 10.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Ruanda</td>
    <td>Point(29.873888888 -1.940277777)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Kosovo</td>
    <td>Point(20.833333333 42.55)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Rom%C3%A9nia</td>
    <td>Point(25.0 46.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Irlanda</td>
    <td>Point(-8.0 53.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Vaticano</td>
    <td>Point(12.453055555 41.903888888)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_nas_Fiji</td>
    <td>Point(178.0 -18.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Z%C3%A2mbia</td>
    <td>Point(28.0 -14.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Montenegro</td>
    <td>Point(19.216669444 42.766669444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Tanz%C3%A2nia</td>
    <td>Point(34.853888888 -6.306944444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Sud%C3%A3o_do_Sul</td>
    <td>Point(30.0 7.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Somalil%C3%A2ndia</td>
    <td>Point(46.2 9.8)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_L%C3%ADbia</td>
    <td>Point(17.0 27.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_nas_Ilhas_Malvinas</td>
    <td>Point(-59.0 -51.8)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Angola</td>
    <td>Point(17.35 -12.35)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_nas_Can%C3%A1rias</td>
    <td>Point(-15.748888888 28.536111111)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Papua-Nova_Guin%C3%A9</td>
    <td>Point(147.0 -6.3)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Coreia_do_Sul</td>
    <td>Point(128.0 36.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Israel</td>
    <td>Point(35.0 31.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_%C3%81ustria</td>
    <td>Point(14.0 48.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Indon%C3%A9sia</td>
    <td>Point(118.0 -2.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Col%C3%B4mbia</td>
    <td>Point(-74.0 4.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Su%C3%AD%C3%A7a</td>
    <td>Point(8.231973055 46.798561944)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Liechtenstein</td>
    <td>Point(9.553888888 47.145)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_nos_Camar%C3%B5es</td>
    <td>Point(12.0 7.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Cro%C3%A1cia</td>
    <td>Point(15.466669444 45.25)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_S%C3%A3o_Bartolomeu</td>
    <td>Point(-62.834244444 17.897727777)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Nova_Caled%C3%B4nia</td>
    <td>Point(165.3 -21.25)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Cazaquist%C3%A3o</td>
    <td>Point(68.0 48.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Guiana_Francesa</td>
    <td>Point(-52.999938888 3.998861111)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Mayotte</td>
    <td>Point(45.138333333 -12.843055555)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Arg%C3%A9lia</td>
    <td>Point(1.0 28.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Argentina</td>
    <td>Point(-64.0 -34.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Burquina_Fasso</td>
    <td>Point(-2.066669444 12.266669444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Rep%C3%BAblica_Democr%C3%A1tica_do_Congo</td>
    <td>Point(23.656111111 -2.88)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Sud%C3%A3o</td>
    <td>Point(32.0 15.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Esc%C3%B3cia</td>
    <td>Point(-5.0 57.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Eti%C3%B3pia</td>
    <td>Point(40.0 9.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_nas_Bermudas</td>
    <td>Point(-64.75 32.333330555)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Timor-Leste</td>
    <td>Point(125.75 -8.966669444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_El_Salvador</td>
    <td>Point(-88.866111111 13.668888888)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Let%C3%B4nia</td>
    <td>Point(25.0 57.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Guadalupe</td>
    <td>Point(-62.0 16.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Oceania</td>
    <td>Point(166.0 -21.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Reino_Unido</td>
    <td>Point(-2.0 54.6)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Gab%C3%A3o</td>
    <td>Point(12.0 -1.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Bol%C3%ADvia</td>
    <td>Point(-64.991228611 -17.056869611)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Turquia</td>
    <td>Point(36.0 39.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Espanha</td>
    <td>Point(-3.0 40.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_It%C3%A1lia</td>
    <td>Point(12.5 42.5)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Uganda</td>
    <td>Point(32.39 1.28)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_G%C3%A2mbia</td>
    <td>Point(-15.5 13.5)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Chade</td>
    <td>Point(19.4 15.466669444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Cura%C3%A7ao</td>
    <td>Point(-68.966666666 12.166666666)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Maurit%C3%A2nia</td>
    <td>Point(-11.0 21.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Santa_L%C3%BAcia</td>
    <td>Point(-61.0 13.883330555)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Essuat%C3%ADni</td>
    <td>Point(31.433330555 -26.483330555)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Chipre_do_Norte</td>
    <td>Point(33.363473888 35.180975)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_China_continental</td>
    <td>Point(103.0 35.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Alemanha</td>
    <td>Point(10.0 51.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Rep%C3%BAblica_Centro-Africana</td>
    <td>Point(20.9 6.7)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Jap%C3%A3o</td>
    <td>Point(136.0 35.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_%C3%8Dndia</td>
    <td>Point(77.0 22.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Reuni%C3%A3o</td>
    <td>Point(55.5325 -21.114444444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Palestina</td>
    <td>Point(35.25 32.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_San_Marino</td>
    <td>Point(12.466666666 43.933333333)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Ar%C3%A1bia_Saudita</td>
    <td>Point(44.116669444 23.716669444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Marrocos</td>
    <td>Point(-6.0 32.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Egito</td>
    <td>Point(29.0 27.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Luxemburgo</td>
    <td>Point(6.13 49.77)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Eritreia</td>
    <td>Point(38.25 15.483330555)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Botswana</td>
    <td>Point(23.7 -22.2)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Guin%C3%A9-Bissau</td>
    <td>Point(-15.0 12.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Anguila</td>
    <td>Point(-63.05 18.233333333)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Irlanda_do_Norte</td>
    <td>Point(-6.75 54.683333333)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_S%C3%A9rvia</td>
    <td>Point(20.933333333 43.95)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_B%C3%B3snia_e_Herzegovina</td>
    <td>Point(18.0 44.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Bielorr%C3%BAssia</td>
    <td>Point(28.046666666 53.528333333)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Chile</td>
    <td>Point(-71.0 -33.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Gana</td>
    <td>Point(-0.5 8.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Seicheles</td>
    <td>Point(52.766669444 -7.1)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Jersey</td>
    <td>Point(-2.11 49.19)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_S%C3%A3o_Vicente_e_Granadinas</td>
    <td>Point(-61.233333333 13.166666666)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Chipre</td>
    <td>Point(33.0 35.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Noruega</td>
    <td>Point(11.0 65.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Hungria</td>
    <td>Point(19.0 47.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Coreia_do_Norte</td>
    <td>Point(127.0 40.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Guatemala</td>
    <td>Point(-90.533333333 14.616666666)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Ant%C3%ADgua_e_Barbuda</td>
    <td>Point(-61.85 17.116666666)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_S%C3%A3o_Pedro_e_Miquel%C3%A3o</td>
    <td>Point(-56.275 46.825)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Uruguai</td>
    <td>Point(-56.65 -32.733333333)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Venezuela</td>
    <td>Point(-67.0 8.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Mo%C3%A7ambique</td>
    <td>Point(35.0 -19.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Cabo_Verde</td>
    <td>Point(-24.083333333 15.916666666)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Guam</td>
    <td>Point(144.8 13.5)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Afeganist%C3%A3o</td>
    <td>Point(66.0 34.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_nas_Bahamas</td>
    <td>Point(-76.4 23.7)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Cuba</td>
    <td>Point(-79.5 22.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Suriname</td>
    <td>Point(-56.0 4.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Arm%C3%AAnia</td>
    <td>Point(44.95 40.383330555)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Togo</td>
    <td>Point(1.183330555 8.25)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_N%C3%ADger</td>
    <td>Point(10.0 17.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Santo_Eust%C3%A1quio</td>
    <td>Point(-62.966666666 17.483333333)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Zimb%C3%A1bue</td>
    <td>Point(30.0 -19.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Ant%C3%A1rtida</td>
    <td>Point(-57.8875 -63.320833333)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Haiti</td>
    <td>Point(-72.8 19.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Nam%C3%ADbia</td>
    <td>Point(17.0 -23.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Senegal</td>
    <td>Point(-14.283330555 14.366669444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Guin%C3%A9_Equatorial</td>
    <td>Point(10.0 1.5)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Madagascar</td>
    <td>Point(47.0 -20.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Aruba</td>
    <td>Point(-69.974166666 12.511111111)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_But%C3%A3o</td>
    <td>Point(90.5 27.45)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Trindade_e_Tobago</td>
    <td>Point(-61.516666666 10.666666666)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Nig%C3%A9ria</td>
    <td>Point(8.0 9.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Martinica</td>
    <td>Point(-61.0 14.666666666)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Costa_do_Marfim</td>
    <td>Point(-6.0 8.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Eslov%C3%A1quia</td>
    <td>Point(20.0 49.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Benim</td>
    <td>Point(2.183333333 8.833333333)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_S%C3%ADria</td>
    <td>Point(38.583330555 35.216669444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Quirguist%C3%A3o</td>
    <td>Point(75.0 41.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Ilha_de_Man</td>
    <td>Point(-4.5 54.25)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Acrot%C3%ADri_e_Deceleia</td>
    <td>Point(32.983333333 34.583333333)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Austr%C3%A1lia</td>
    <td>Point(137.0 -28.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Dinamarca</td>
    <td>Point(10.0 56.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_R%C3%BAssia</td>
    <td>Point(100.0 62.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Costa_Rica</td>
    <td>Point(-84.0 10.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Peru</td>
    <td>Point(-76.0 -9.4)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Paraguai</td>
    <td>Point(-58.0 -23.5)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Om%C3%A3</td>
    <td>Point(57.0 21.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Guiana</td>
    <td>Point(-59.316669444 5.733330555)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_%C3%81frica</td>
    <td>Point(17.0 1.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Litu%C3%A2nia</td>
    <td>Point(24.0 55.2)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Alb%C3%A2nia</td>
    <td>Point(20.0 41.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Am%C3%A9rica</td>
    <td>Point(-100.0 20.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Brasil</td>
    <td>Point(-53.0 -14.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Congo</td>
    <td>Point(15.383330555 -0.75)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Catar</td>
    <td>Point(51.212769444 25.269538888)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_nas_Ilhas_Cayman</td>
    <td>Point(-80.5 19.5)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Guernsey</td>
    <td>Point(-2.583333333 49.45)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Inglaterra</td>
    <td>Point(-1.0 53.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Hava%C3%AD</td>
    <td>Point(-157.796388888 21.311388888)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_M%C3%B4naco</td>
    <td>Point(7.416666666 43.733333333)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Tun%C3%ADsia</td>
    <td>Point(10.0 34.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Panam%C3%A1</td>
    <td>Point(-80.366669444 8.616669444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Macau</td>
    <td>Point(113.55 22.166666666)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Hong_Kong</td>
    <td>Point(114.166666666 22.283333333)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Canad%C3%A1</td>
    <td>Point(-109.0 56.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_S%C3%A3o_Tom%C3%A9_e_Pr%C3%ADncipe</td>
    <td>Point(6.6 0.316669444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Goa</td>
    <td>Point(74.043330555 15.401938888)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_I%C3%AAmen</td>
    <td>Point(48.0 15.5)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Dominica</td>
    <td>Point(-61.333330555 15.416669444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Maur%C3%ADcio</td>
    <td>Point(57.5 -20.2)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Pa%C3%ADs_de_Gales</td>
    <td>Point(-3.633333333 52.35)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Som%C3%A1lia</td>
    <td>Point(47.0 6.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Barbados</td>
    <td>Point(-59.5525 13.17)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_nas_Ilhas_Marianas_do_Norte</td>
    <td>Point(146.0 17.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_S%C3%A3o_Martinho_(Pa%C3%ADses_Baixos)</td>
    <td>Point(-63.067777777 18.031944444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Groenl%C3%A2ndia</td>
    <td>Point(-40.0 72.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Londres</td>
    <td>Point(-0.1275 51.507222222)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Djibouti</td>
    <td>Point(42.433330555 11.8)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Mali</td>
    <td>Point(-4.0 17.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_navio_Diamond_Princess</td>
    <td>Point(139.702416666 35.463694444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_%C3%81frica_do_Sul</td>
    <td>Point(24.0 -29.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Ucr%C3%A2nia</td>
    <td>Point(32.0 49.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_M%C3%A9xico</td>
    <td>Point(-102.0 23.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_Saara_Ocidental</td>
    <td>Point(-13.0 25.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_nas_Ilhas_Turcos_e_Caicos</td>
    <td>Point(-71.583333333 21.75)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_na_cidade_de_Nova_York</td>
    <td>Point(-73.94 40.67)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Granada</td>
    <td>Point(-61.666669444 12.116669444)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_no_Malawi</td>
    <td>Point(34.0 -13.0)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_nas_Ilhas_Virgens_Brit%C3%A2nicas</td>
    <td>Point(-64.5 18.5)</td>
  </tr>
  <tr>
    <td>https://pt.wikipedia.org/wiki/Pandemia_de_COVID-19_em_Serra_Leoa</td>
    <td>Point(-11.916669444 8.5)</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/wikipediaOnMap.rq | sed 's+<lang/>+pt+' > wikipediaOnMap.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@wikipediaOnMap.rq
```
This SPARQL query is available under CCZero.
