# sequenceVariants.rq
**Ejemplos de código:** [curl](#curl)
### SPARQL
```sparql
SELECT ?variant ?variantLabel ?sequence ?sequenceLabel ?taxon ?taxonLabel WHERE {
  ?variant wdt:P3433 ?sequence .
  ?sequence wdt:P703 / wdt:P171* wd:Q82069695 .
  ?variant  wdt:P703 ?taxon .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "[AUTO_LANGUAGE],en". }
}
```
[ejecutar](https://query.wikidata.org/embed.html#SELECT%20%3Fvariant%20%3FvariantLabel%20%3Fsequence%20%3FsequenceLabel%20%3Ftaxon%20%3FtaxonLabel%20WHERE%20%7B%0A%20%20%3Fvariant%20wdt%3AP3433%20%3Fsequence%20.%0A%20%20%3Fsequence%20wdt%3AP703%20%2F%20wdt%3AP171*%20wd%3AQ82069695%20.%0A%20%20%3Fvariant%20%20wdt%3AP703%20%3Ftaxon%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A) o [editar](https://query.wikidata.org/#SELECT%20%3Fvariant%20%3FvariantLabel%20%3Fsequence%20%3FsequenceLabel%20%3Ftaxon%20%3FtaxonLabel%20WHERE%20%7B%0A%20%20%3Fvariant%20wdt%3AP3433%20%3Fsequence%20.%0A%20%20%3Fsequence%20wdt%3AP703%20%2F%20wdt%3AP171*%20wd%3AQ82069695%20.%0A%20%20%3Fvariant%20%20wdt%3AP703%20%3Ftaxon%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%0A)


### Resultados
<table>
  <tr>
    <td><b>variant</b></td>
    <td><b>sequence</b></td>
    <td><b>taxon</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104528694">C3267T</a> (<a href="http://www.wikidata.org/entity/Q104528694">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88088053">ORF1a polyprotein;ORF1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104529151">N501Y mutation</a> (<a href="http://www.wikidata.org/entity/Q104529151">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104529151">N501Y mutation</a> (<a href="http://www.wikidata.org/entity/Q104529151">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104400171">SARS-CoV-2 Beta variant</a> (<a href="http://www.wikidata.org/entity/Q104400171">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104529151">N501Y mutation</a> (<a href="http://www.wikidata.org/entity/Q104529151">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104819269">SARS-CoV-2 Gamma variant</a> (<a href="http://www.wikidata.org/entity/Q104819269">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104529151">N501Y mutation</a> (<a href="http://www.wikidata.org/entity/Q104529151">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q106171157">SARS-CoV-2 Theta variant</a> (<a href="http://www.wikidata.org/entity/Q106171157">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104530561">C5388A</a> (<a href="http://www.wikidata.org/entity/Q104530561">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88088053">ORF1a polyprotein;ORF1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104530598">C27972T</a> (<a href="http://www.wikidata.org/entity/Q104530598">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089552">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q88089552">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104530608">P681H mutation</a> (<a href="http://www.wikidata.org/entity/Q104530608">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104530608">P681H mutation</a> (<a href="http://www.wikidata.org/entity/Q104530608">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q106171157">SARS-CoV-2 Theta variant</a> (<a href="http://www.wikidata.org/entity/Q106171157">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104530608">P681H mutation</a> (<a href="http://www.wikidata.org/entity/Q104530608">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q106171203">SARS-CoV-2 Lineage B.1.1.318</a> (<a href="http://www.wikidata.org/entity/Q106171203">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104530608">P681H mutation</a> (<a href="http://www.wikidata.org/entity/Q104530608">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88000922">surface glycoprotein</a> (<a href="http://www.wikidata.org/entity/Q88000922">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q106171219">Lineage B.1.1.207</a> (<a href="http://www.wikidata.org/entity/Q106171219">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104532779">HV 69-70 deletion</a> (<a href="http://www.wikidata.org/entity/Q104532779">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104532877">Y144 deletion</a> (<a href="http://www.wikidata.org/entity/Q104532877">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104532904">ORF8 ∆382</a> (<a href="http://www.wikidata.org/entity/Q104532904">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88089552">ORF8 protein</a> (<a href="http://www.wikidata.org/entity/Q88089552">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104535071">D614G mutation</a> (<a href="http://www.wikidata.org/entity/Q104535071">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104535071">D614G mutation</a> (<a href="http://www.wikidata.org/entity/Q104535071">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104535071">D614G mutation</a> (<a href="http://www.wikidata.org/entity/Q104535071">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104400171">SARS-CoV-2 Beta variant</a> (<a href="http://www.wikidata.org/entity/Q104400171">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104535071">D614G mutation</a> (<a href="http://www.wikidata.org/entity/Q104535071">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104412033">Cluster 5</a> (<a href="http://www.wikidata.org/entity/Q104412033">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104535071">D614G mutation</a> (<a href="http://www.wikidata.org/entity/Q104535071">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104819269">SARS-CoV-2 Gamma variant</a> (<a href="http://www.wikidata.org/entity/Q104819269">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104535071">D614G mutation</a> (<a href="http://www.wikidata.org/entity/Q104535071">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q106171118">Lineage B.1.427</a> (<a href="http://www.wikidata.org/entity/Q106171118">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104535071">D614G mutation</a> (<a href="http://www.wikidata.org/entity/Q104535071">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q106171144">SARS-CoV-2 Lineage B.1.429</a> (<a href="http://www.wikidata.org/entity/Q106171144">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104535071">D614G mutation</a> (<a href="http://www.wikidata.org/entity/Q104535071">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q106171195">SARS-CoV-2 Eta variant</a> (<a href="http://www.wikidata.org/entity/Q106171195">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104535071">D614G mutation</a> (<a href="http://www.wikidata.org/entity/Q104535071">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q106171203">SARS-CoV-2 Lineage B.1.1.318</a> (<a href="http://www.wikidata.org/entity/Q106171203">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104628162">T6954C</a> (<a href="http://www.wikidata.org/entity/Q104628162">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88088053">ORF1a polyprotein;ORF1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104628223">11288-11296 deletion</a> (<a href="http://www.wikidata.org/entity/Q104628223">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88088053">ORF1a polyprotein;ORF1ab polyprotein</a> (<a href="http://www.wikidata.org/entity/Q88088053">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104628256">C23271A</a> (<a href="http://www.wikidata.org/entity/Q104628256">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104628268">C23709T</a> (<a href="http://www.wikidata.org/entity/Q104628268">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104628271">T24506G</a> (<a href="http://www.wikidata.org/entity/Q104628271">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104628278">G24914C</a> (<a href="http://www.wikidata.org/entity/Q104628278">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917585">spike glycoprotein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917585">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104628287">G28048T</a> (<a href="http://www.wikidata.org/entity/Q104628287">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88659350">ORF8 protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88659350">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104628290">A28111G</a> (<a href="http://www.wikidata.org/entity/Q104628290">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q88659350">ORF8 protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q88659350">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104628296">C28977T</a> (<a href="http://www.wikidata.org/entity/Q104628296">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104628334">D3L</a> (<a href="http://www.wikidata.org/entity/Q104628334">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q87917584">nucleocapsid protein [SARS-CoV-2]</a> (<a href="http://www.wikidata.org/entity/Q87917584">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
  </tr>
</table>
## Ejemplos de código
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/sequenceVariants.rq | sed 's+<lang/>+es+' > sequenceVariants.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@sequenceVariants.rq
```
Esta consulta SPARQL está disponible en CCZero.
