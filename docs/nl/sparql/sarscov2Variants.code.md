# sarscov2Variants.rq
**Broncode voorbeelden:** [curl](#curl)
### SPARQL
```sparql
SELECT DISTINCT ?variant ?variantLabel ?pango WHERE {
  VALUES ?variantType { wd:Q15304597 wd:Q75913269 }
  { ?variant p:P31 [ ps:P31 ?variantType ; pq:P642 wd:Q82069695 ] . }
  UNION
  { ?variant wdt:P31 wd:Q104450895 }
  OPTIONAL { ?variant wdt:P9632 ?pango }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "en,en". }
}
```
[uitvoeren](https://query.wikidata.org/embed.html#SELECT%20DISTINCT%20%3Fvariant%20%3FvariantLabel%20%3Fpango%20WHERE%20%7B%0A%20%20VALUES%20%3FvariantType%20%7B%20wd%3AQ15304597%20wd%3AQ75913269%20%7D%0A%20%20%7B%20%3Fvariant%20p%3AP31%20%5B%20ps%3AP31%20%3FvariantType%20%3B%20pq%3AP642%20wd%3AQ82069695%20%5D%20.%20%7D%0A%20%20UNION%0A%20%20%7B%20%3Fvariant%20wdt%3AP31%20wd%3AQ104450895%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fvariant%20wdt%3AP9632%20%3Fpango%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%0A) of [bewerken](https://query.wikidata.org/#SELECT%20DISTINCT%20%3Fvariant%20%3FvariantLabel%20%3Fpango%20WHERE%20%7B%0A%20%20VALUES%20%3FvariantType%20%7B%20wd%3AQ15304597%20wd%3AQ75913269%20%7D%0A%20%20%7B%20%3Fvariant%20p%3AP31%20%5B%20ps%3AP31%20%3FvariantType%20%3B%20pq%3AP642%20wd%3AQ82069695%20%5D%20.%20%7D%0A%20%20UNION%0A%20%20%7B%20%3Fvariant%20wdt%3AP31%20wd%3AQ104450895%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fvariant%20wdt%3AP9632%20%3Fpango%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%0A)


### Resultaten
<table>
  <tr>
    <td><b>variant</b></td>
    <td><b>pango</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q112163086">SARS-CoV-2 Lineage BA.1.1</a> (<a href="http://www.wikidata.org/entity/Q112163086">edit</a>)</td>
    <td>BA.1.1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104412033">Cluster 5</a> (<a href="http://www.wikidata.org/entity/Q104412033">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171118">Lineage B.1.427</a> (<a href="http://www.wikidata.org/entity/Q106171118">edit</a>)</td>
    <td>B.1.427</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106332190">Lineage B.1.616</a> (<a href="http://www.wikidata.org/entity/Q106332190">edit</a>)</td>
    <td>B.1.616</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109710954">SARS-CoV-2 Lineage C.1.2</a> (<a href="http://www.wikidata.org/entity/Q109710954">edit</a>)</td>
    <td>C.1.2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107291621">SARS-CoV-2 Lambda variant</a> (<a href="http://www.wikidata.org/entity/Q107291621">edit</a>)</td>
    <td>C.37</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171157">SARS-CoV-2 Theta variant</a> (<a href="http://www.wikidata.org/entity/Q106171157">edit</a>)</td>
    <td>P.3</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104819269">SARS-CoV-2 Gamma variant</a> (<a href="http://www.wikidata.org/entity/Q104819269">edit</a>)</td>
    <td>P.1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107059496">SARS-CoV-2 Lineage B.1.617.3</a> (<a href="http://www.wikidata.org/entity/Q107059496">edit</a>)</td>
    <td>B.1.617.3</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q108004869">SARS-CoV-2 Delta plus variant</a> (<a href="http://www.wikidata.org/entity/Q108004869">edit</a>)</td>
    <td>AY.1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106581308">SARS-CoV-2 lineage B.1.617</a> (<a href="http://www.wikidata.org/entity/Q106581308">edit</a>)</td>
    <td>B.1.617</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171144">SARS-CoV-2 Lineage B.1.429</a> (<a href="http://www.wikidata.org/entity/Q106171144">edit</a>)</td>
    <td>B.1.429</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109746372">SARS-CoV-2 Lineage AZ.5</a> (<a href="http://www.wikidata.org/entity/Q109746372">edit</a>)</td>
    <td>AZ.5</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109746402">SARS-CoV-2 Lineage B.1.630</a> (<a href="http://www.wikidata.org/entity/Q109746402">edit</a>)</td>
    <td>B.1.630</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109747617">SARS-CoV-2 Lineage C.36.3</a> (<a href="http://www.wikidata.org/entity/Q109747617">edit</a>)</td>
    <td>C.36.3</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109747612">SARS-CoV-2 Lineage AV.1</a> (<a href="http://www.wikidata.org/entity/Q109747612">edit</a>)</td>
    <td>AV.1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109746403">SARS-CoV-2 lineage B.1.640</a> (<a href="http://www.wikidata.org/entity/Q109746403">edit</a>)</td>
    <td>B.1.640</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109747620">SARS-CoV-2 Lineage B.1.619</a> (<a href="http://www.wikidata.org/entity/Q109747620">edit</a>)</td>
    <td>B.1.619</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109747618">SARS-CoV-2 Lineage B.1.214.2</a> (<a href="http://www.wikidata.org/entity/Q109747618">edit</a>)</td>
    <td>B.1.214.2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109747615">SARS-CoV-2 Lineage B.1.466.2</a> (<a href="http://www.wikidata.org/entity/Q109747615">edit</a>)</td>
    <td>B.1.466.2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109747616">SARS-CoV-2 Lineage B.1.1.519</a> (<a href="http://www.wikidata.org/entity/Q109747616">edit</a>)</td>
    <td>B.1.1.519</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171203">SARS-CoV-2 Lineage B.1.1.318</a> (<a href="http://www.wikidata.org/entity/Q106171203">edit</a>)</td>
    <td>B.1.1.318</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110036883">SARS-CoV-2 lineage B.1.640.2</a> (<a href="http://www.wikidata.org/entity/Q110036883">edit</a>)</td>
    <td>B.1.640.2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107461066">SARS-CoV-2 Lineage C.36</a> (<a href="http://www.wikidata.org/entity/Q107461066">edit</a>)</td>
    <td>C.36</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104376647">SARS-CoV-2 Alpha variant</a> (<a href="http://www.wikidata.org/entity/Q104376647">edit</a>)</td>
    <td>B.1.1.7</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110101454">SARS-CoV-2 Lineage AY.4.2</a> (<a href="http://www.wikidata.org/entity/Q110101454">edit</a>)</td>
    <td>AY.4.2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109739412">SARS-CoV-2 Omicron variant</a> (<a href="http://www.wikidata.org/entity/Q109739412">edit</a>)</td>
    <td>B.1.1.529</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q111685971">SARS-CoV-2 Lineage BA.4</a> (<a href="http://www.wikidata.org/entity/Q111685971">edit</a>)</td>
    <td>BA.4</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q111685986">SARS-CoV-2 Lineage BA.5</a> (<a href="http://www.wikidata.org/entity/Q111685986">edit</a>)</td>
    <td>BA.5</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q111686845">SARS-CoV-2 Lineage BA.2.12.1</a> (<a href="http://www.wikidata.org/entity/Q111686845">edit</a>)</td>
    <td>BA.2.12.1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q111687372">SARS-CoV-2 Lineage BA.2.12</a> (<a href="http://www.wikidata.org/entity/Q111687372">edit</a>)</td>
    <td>BA.2.12</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107055182">SARS-CoV-2 Delta variant</a> (<a href="http://www.wikidata.org/entity/Q107055182">edit</a>)</td>
    <td>B.1.617.2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q111829537">SARS-CoV-2 lineage XD</a> (<a href="http://www.wikidata.org/entity/Q111829537">edit</a>)</td>
    <td>XD</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110488017">Deltacron</a> (<a href="http://www.wikidata.org/entity/Q110488017">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110487412">SARS-CoV-2 Lineage AY.20</a> (<a href="http://www.wikidata.org/entity/Q110487412">edit</a>)</td>
    <td>AY.20</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110497086">SARS-CoV-2 Lineage BA.1</a> (<a href="http://www.wikidata.org/entity/Q110497086">edit</a>)</td>
    <td>BA.1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110497087">SARS-CoV-2 Lineage BA.2</a> (<a href="http://www.wikidata.org/entity/Q110497087">edit</a>)</td>
    <td>BA.2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106592103">SARS-CoV-2 Iota variant</a> (<a href="http://www.wikidata.org/entity/Q106592103">edit</a>)</td>
    <td>B.1.526</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107055212">SARS-CoV-2 Zeta variant</a> (<a href="http://www.wikidata.org/entity/Q107055212">edit</a>)</td>
    <td>P.2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107055239">SARS-CoV-2 Kappa variant</a> (<a href="http://www.wikidata.org/entity/Q107055239">edit</a>)</td>
    <td>B.1.617.1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q110811149">SARS-CoV-2 Lineage BA.3</a> (<a href="http://www.wikidata.org/entity/Q110811149">edit</a>)</td>
    <td>BA.3</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106809407">Lineage B.1.620</a> (<a href="http://www.wikidata.org/entity/Q106809407">edit</a>)</td>
    <td>B.1.620</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q109747614">SARS-CoV-2 Lineage R.1</a> (<a href="http://www.wikidata.org/entity/Q109747614">edit</a>)</td>
    <td>R.1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171195">SARS-CoV-2 Eta variant</a> (<a href="http://www.wikidata.org/entity/Q106171195">edit</a>)</td>
    <td>B.1.525</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171244">Lineage B.1.1.7 with E484K</a> (<a href="http://www.wikidata.org/entity/Q106171244">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106628019">Lineage B.1.618</a> (<a href="http://www.wikidata.org/entity/Q106628019">edit</a>)</td>
    <td>B.1.618</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q111737567">SARS-CoV-2 lineage XE</a> (<a href="http://www.wikidata.org/entity/Q111737567">edit</a>)</td>
    <td>XE</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107985125">SARS-CoV-2 Mu variant</a> (<a href="http://www.wikidata.org/entity/Q107985125">edit</a>)</td>
    <td>B.1.621</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106171219">Lineage B.1.1.207</a> (<a href="http://www.wikidata.org/entity/Q106171219">edit</a>)</td>
    <td>B.1.1.207</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104400171">SARS-CoV-2 Beta variant</a> (<a href="http://www.wikidata.org/entity/Q104400171">edit</a>)</td>
    <td>B.1.351</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q106527526">SARS-CoV-2 20C clade</a> (<a href="http://www.wikidata.org/entity/Q106527526">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q111829536">SARS-CoV-2 lineage XF</a> (<a href="http://www.wikidata.org/entity/Q111829536">edit</a>)</td>
    <td>XF</td>
  </tr>
</table>
## Broncode voorbeelden
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/sarscov2Variants.rq | sed 's+<lang/>+nl+' > sarscov2Variants.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@sarscov2Variants.rq
```
Deze SPARQL zoekopdracht is beschikbaar als CCZero
