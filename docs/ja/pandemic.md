# パンデミック

今回の<a name="tp1">パンデミック</a>による感染者数は以下のクエリで得られます。

**SPARQL** [sparql/earthAllCasesToday.rq](sparql/earthAllCasesToday.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3FnumberOfCases%20%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20wdt%3AP1603%20%3FnumberOfCases%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3FnumberOfCases%20%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20wdt%3AP1603%20%3FnumberOfCases%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?numberOfCases  WHERE {
  wd:Q81068910 wdt:P1603 ?numberOfCases .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}
```

結果は以下の通りです。

<table>
  <tr>
    <td><b>numberOfCases</b></td>
  </tr>
  <tr>
    <td>2544792</td>
  </tr>
</table>

## ウイルスの<a name="tp2">感染</a>

ヒトからヒトへの感染が非常に簡単に生じるので、このウイルスの大流行が起きます。個々人が他の人との間隔を開けることについて意識する必要があります。なぜなら、咳をするなどして生じる小さな飛沫にはウイルスが含まれているかもしれないからです[要引用]。

しかし、SARS-CoV-2はヒトから放出されたのちに、様々なものの表面などでしばらくの間生き続けることが判明しています[要引用]。次のクエリを発行して、平らな<a name="tp3">表面</a>でヒトコロナウイルスが生存することについて調査している論文を取得します。

**SPARQL** [sparql/surfacesCounts.rq](sparql/surfacesCounts.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fcount%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%28COUNT%28DISTINCT%20%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ484298%20.%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fcount%29%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fcount%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%28COUNT%28DISTINCT%20%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ484298%20.%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fcount%29%0A))

```sparql
SELECT ?virus ?virusLabel ?count WITH {
  SELECT ?virus (COUNT(DISTINCT ?work) AS ?count) WHERE {
    VALUES ?virus {
      wd:Q82069695 # SARS-CoV-2
      wd:Q16983360 # HKU1
      wd:Q16991954 # OC43
      wd:Q8351095  # NL63 
      wd:Q16983356 # 229E 
      wd:Q4902157  # MERS-CoV
      wd:Q278567   # SARS-CoV
    }
    ?work wdt:P921 ?virus ;
          wdt:P921 wd:Q484298 .
  } GROUP BY ?virus
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}
ORDER BY DESC(?count)
```

結果は以下の通りになります。

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">ヒトコロナウイルス229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERSコロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>1</td>
  </tr>
</table>

物質表面上でのウイルス生存に関する論文を実際に取得するには以下のクエリを発行します。

**SPARQL** [sparql/surfaces.rq](sparql/surfaces.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ484298%20.%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3FworkLabel%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ484298%20.%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3FworkLabel%0A))

```sparql
SELECT ?virus ?virusLabel ?work ?workLabel WITH {
  SELECT ?virus ?work WHERE {
    VALUES ?virus {
      wd:Q82069695 # SARS-CoV-2
      wd:Q16983360 # HKU1
      wd:Q16991954 # OC43
      wd:Q8351095  # NL63 
      wd:Q16983356 # 229E 
      wd:Q4902157  # MERS-CoV
      wd:Q278567   # SARS-CoV
    }
    ?work wdt:P921 ?virus ;
          wdt:P921 wd:Q484298 .
  }
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}
ORDER BY ?virusLabel ?workLabel
```

これによりヒトコロナウイルスに関するこれらの論文が得られます。

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>work</b></td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87943251">Aerosol and Surface Stability of SARS-CoV-2 as Compared with SARS-CoV-1</a> (<a href="http://www.wikidata.org/entity/Q87943251">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q82069695">2019新型コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q87669932">Aerosol and surface stability of HCoV-19 (SARS-CoV-2) compared to SARS-CoV-1</a> (<a href="http://www.wikidata.org/entity/Q87669932">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q4902157">MERSコロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40467409">Middle East respiratory syndrome coronavirus on inanimate surfaces: A risk for health care transmission.</a> (<a href="http://www.wikidata.org/entity/Q40467409">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">ヒトコロナウイルス229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q36318974">Human Coronavirus 229E Remains Infectious on Common Touch Surface Materials.</a> (<a href="http://www.wikidata.org/entity/Q36318974">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://tools.wmflabs.org/scholia/Q16983356">ヒトコロナウイルス229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://tools.wmflabs.org/scholia/Q40047078">Isolation and identification of human coronavirus 229E from frequently touched environmental surfaces of a university classroom that is cleaned daily.</a> (<a href="http://www.wikidata.org/entity/Q40047078">edit</a>)</td>
  </tr>
</table>

## 推移

一方で、時間の経過とともにどのように感染者数が変化するかについて興味があるかもしれません。その場合は、より複雑なクエリを用いて条件を絞る必要があります。

**SPARQL** [sparql/earthAllCases.rq](sparql/earthAllCases.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fdate%29%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fdate%29%0A))

```sparql
SELECT ?date ?numberOfCases WHERE {
  wd:Q81068910 p:P1603 ?numberOfCasesStat .
  ?numberOfCasesStat ps:P1603 ?numberOfCases ;
                     pq:P585 ?date .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
} ORDER BY ASC(?date)
```

時間の経過とともに変化する感染者数の折れ線グラフを表示させたい場合は以下の通り少しクエリを変える必要があります。

**SPARQL** [sparql/earthAllCasesLinePlot.rq](sparql/earthAllCasesLinePlot.code.html) ([run](https://query.wikidata.org/embed.html#%23defaultView%3ALineChart%0ASELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#%23defaultView%3ALineChart%0ASELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A))

```sparql
#defaultView:LineChart
SELECT ?date ?numberOfCases WHERE {
  wd:Q81068910 p:P1603 ?numberOfCasesStat .
  ?numberOfCasesStat ps:P1603 ?numberOfCases ;
                     pq:P585 ?date .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}
```

結果は以下の通りです。

<iframe
  style="width: 95%; height: 50vh; border: none;"
  src="https://query.wikidata.org/embed.html#%23defaultView%3ALineChart%0ASELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ81068910%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A"

  referrerpolicy="origin"
  sandbox="allow-scripts allow-same-origin allow-popups" >
</iframe>

## 地域別の感染者数の推移

Wikipediaと同様に、Wikidataにも特定地域におけるパンデミックに関する項目があります。以下のクエリでそれをリストアップできます。

**SPARQL** [sparql/facets.rq](sparql/facets.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Ffacet%20%3FfacetLabel%20WHERE%20%7B%0A%20%20%3Ffacet%20wdt%3AP1269%20wd%3AQ81068910%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A%0A), [edit](https://query.wikidata.org/#SELECT%20%3Ffacet%20%3FfacetLabel%20WHERE%20%7B%0A%20%20%3Ffacet%20wdt%3AP1269%20wd%3AQ81068910%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A%0A))

```sparql
SELECT ?facet ?facetLabel WHERE {
  ?facet wdt:P1269 wd:Q81068910 .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}
```

このリストは非常に長いので、それを見るには上記のSPARQLのページを開きます。

### オランダでの感染者数の推移

これらのファセットは、<a name="tp4">オランダ</a>など、一つの地域での<a name="tp5">推移</a>を見るものです。

**SPARQL** [sparql/progressionNL.rq](sparql/progressionNL.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ86756826%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fdate%29%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ86756826%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fdate%29%0A))

```sparql
SELECT ?date ?numberOfCases WHERE {
  wd:Q86756826 p:P1603 ?numberOfCasesStat .
  ?numberOfCasesStat ps:P1603 ?numberOfCases ;
                     pq:P585 ?date .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
} ORDER BY DESC(?date)
```

パンデミックが続いており、表は長くなるので、折れ線グラフが有益でしょう。

**SPARQL** [sparql/progressionNLlineplot.rq](sparql/progressionNLlineplot.code.html) ([run](https://query.wikidata.org/embed.html#%23defaultView%3ALineChart%0ASELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ86756826%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#%23defaultView%3ALineChart%0ASELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ86756826%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A))

```sparql
#defaultView:LineChart
SELECT ?date ?numberOfCases WHERE {
  wd:Q86756826 p:P1603 ?numberOfCasesStat .
  ?numberOfCasesStat ps:P1603 ?numberOfCases ;
                     pq:P585 ?date .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}
```

以下の結果が得られます。

<iframe
  style="width: 95%; height: 50vh; border: none;"
  src="https://query.wikidata.org/embed.html#%23defaultView%3ALineChart%0ASELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ86756826%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0A"

  referrerpolicy="origin"
  sandbox="allow-scripts allow-same-origin allow-popups" >
</iframe>

### イタリアでの感染者数の推移

もちろん、<a name="tp6">イタリア</a>における状況は欧州人の脳裏に強烈に焼きつきます。WikidataのQ識別子をオランダに変えてみます。

**SPARQL** [sparql/progressionIT.rq](sparql/progressionIT.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ84104992%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fdate%29%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ84104992%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fdate%29%0A))

```sparql
SELECT ?date ?numberOfCases WHERE {
  wd:Q84104992 p:P1603 ?numberOfCasesStat .
  ?numberOfCasesStat ps:P1603 ?numberOfCases ;
                     pq:P585 ?date .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
} ORDER BY DESC(?date)
```

### アメリカ合衆国での推移

現在、感染者数が最大の<a name="tp7">アメリカ合衆国</a>です。

**SPARQL** [sparql/progressionUS.rq](sparql/progressionUS.code.html) ([run](https://query.wikidata.org/embed.html#%23defaultView%3ALineChart%0ASELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ83873577%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fdate%29%0A), [edit](https://query.wikidata.org/#%23defaultView%3ALineChart%0ASELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ83873577%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fdate%29%0A))

```sparql
#defaultView:LineChart
SELECT ?date ?numberOfCases WHERE {
  wd:Q83873577 p:P1603 ?numberOfCasesStat .
  ?numberOfCasesStat ps:P1603 ?numberOfCases ;
                     pq:P585 ?date .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
} ORDER BY DESC(?date)
```

以下の結果が得られます。

<iframe
  style="width: 95%; height: 50vh; border: none;"
  src="https://query.wikidata.org/embed.html#%23defaultView%3ALineChart%0ASELECT%20%3Fdate%20%3FnumberOfCases%20WHERE%20%7B%0A%20%20wd%3AQ83873577%20p%3AP1603%20%3FnumberOfCasesStat%20.%0A%20%20%3FnumberOfCasesStat%20ps%3AP1603%20%3FnumberOfCases%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20pq%3AP585%20%3Fdate%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fdate%29%0A"

  referrerpolicy="origin"
  sandbox="allow-scripts allow-same-origin allow-popups" >
</iframe>

## 地域別の感染者数の推移のグラフ

### 感染例の数

**SPARQL** [sparql/graphCases.rq](sparql/graphCases.code.html) ([run](https://query.wikidata.org/embed.html#%23defaultView%3ALineChart%0ASELECT%0A%3FcasesPointInTime%20%3Fcases%0A%3FcountryLabel%0AWHERE%20%7B%0A%20%20%3Fitem%20wdt%3AP31%20wd%3AQ3241045.%0A%20%20%3Fitem%20wdt%3AP17%20%3Fcountry.%0A%20%20%3Fitem%20p%3AP1603%20%3FcasesStatement.%0A%20%20%3FcasesStatement%20ps%3AP1603%20%3Fcases.%0A%20%20FILTER%28%3Fcases%20%3E%200%29%0A%20%20%3FcasesStatement%20pq%3AP585%20%3FcasesPointInTime.%0A%20%20%7B%20%3Fitem%20wdt%3AP1269%20wd%3AQ81068910.%20%7D%20UNION%0A%20%20%7B%20%3Fitem%20wdt%3AP361%20wd%3AQ83741704.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3FcountryLabel%29%0A%0A), [edit](https://query.wikidata.org/#%23defaultView%3ALineChart%0ASELECT%0A%3FcasesPointInTime%20%3Fcases%0A%3FcountryLabel%0AWHERE%20%7B%0A%20%20%3Fitem%20wdt%3AP31%20wd%3AQ3241045.%0A%20%20%3Fitem%20wdt%3AP17%20%3Fcountry.%0A%20%20%3Fitem%20p%3AP1603%20%3FcasesStatement.%0A%20%20%3FcasesStatement%20ps%3AP1603%20%3Fcases.%0A%20%20FILTER%28%3Fcases%20%3E%200%29%0A%20%20%3FcasesStatement%20pq%3AP585%20%3FcasesPointInTime.%0A%20%20%7B%20%3Fitem%20wdt%3AP1269%20wd%3AQ81068910.%20%7D%20UNION%0A%20%20%7B%20%3Fitem%20wdt%3AP361%20wd%3AQ83741704.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3FcountryLabel%29%0A%0A))

```sparql
#defaultView:LineChart
SELECT
?casesPointInTime ?cases
?countryLabel
WHERE {
  ?item wdt:P31 wd:Q3241045.
  ?item wdt:P17 ?country.
  ?item p:P1603 ?casesStatement.
  ?casesStatement ps:P1603 ?cases.
  FILTER(?cases > 0)
  ?casesStatement pq:P585 ?casesPointInTime.
  { ?item wdt:P1269 wd:Q81068910. } UNION
  { ?item wdt:P361 wd:Q83741704. }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
} ORDER BY ASC(?countryLabel)
```

結果は以下の通りになります。

<iframe
  style="width: 95%; height: 50vh; border: none;"
  src="https://query.wikidata.org/embed.html#%23defaultView%3ALineChart%0ASELECT%0A%3FcasesPointInTime%20%3Fcases%0A%3FcountryLabel%0AWHERE%20%7B%0A%20%20%3Fitem%20wdt%3AP31%20wd%3AQ3241045.%0A%20%20%3Fitem%20wdt%3AP17%20%3Fcountry.%0A%20%20%3Fitem%20p%3AP1603%20%3FcasesStatement.%0A%20%20%3FcasesStatement%20ps%3AP1603%20%3Fcases.%0A%20%20FILTER%28%3Fcases%20%3E%200%29%0A%20%20%3FcasesStatement%20pq%3AP585%20%3FcasesPointInTime.%0A%20%20%7B%20%3Fitem%20wdt%3AP1269%20wd%3AQ81068910.%20%7D%20UNION%0A%20%20%7B%20%3Fitem%20wdt%3AP361%20wd%3AQ83741704.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3FcountryLabel%29%0A%0A"

  referrerpolicy="origin"
  sandbox="allow-scripts allow-same-origin allow-popups" >
</iframe>

### 死者数

**SPARQL** [sparql/graphDeaths.rq](sparql/graphDeaths.code.html) ([run](https://query.wikidata.org/embed.html#%23defaultView%3ALineChart%0ASELECT%0A%3FdeathsPointInTime%20%3Fdeaths%0A%3FcountryLabel%0AWHERE%20%7B%0A%20%20%3Fitem%20wdt%3AP31%20wd%3AQ3241045.%0A%20%20%3Fitem%20wdt%3AP17%20%3Fcountry.%0A%20%20%3Fitem%20p%3AP1120%20%3FdeathsStatement.%0A%20%20%3FdeathsStatement%20ps%3AP1120%20%3Fdeaths.%0A%20%20FILTER%28%3Fdeaths%20%3E%200%29%0A%20%20%3FdeathsStatement%20pq%3AP585%20%3FdeathsPointInTime.%0A%20%20%7B%20%3Fitem%20wdt%3AP1269%20wd%3AQ81068910.%20%7D%20UNION%0A%20%20%7B%20%3Fitem%20wdt%3AP361%20wd%3AQ83741704.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3FcountryLabel%29%0A), [edit](https://query.wikidata.org/#%23defaultView%3ALineChart%0ASELECT%0A%3FdeathsPointInTime%20%3Fdeaths%0A%3FcountryLabel%0AWHERE%20%7B%0A%20%20%3Fitem%20wdt%3AP31%20wd%3AQ3241045.%0A%20%20%3Fitem%20wdt%3AP17%20%3Fcountry.%0A%20%20%3Fitem%20p%3AP1120%20%3FdeathsStatement.%0A%20%20%3FdeathsStatement%20ps%3AP1120%20%3Fdeaths.%0A%20%20FILTER%28%3Fdeaths%20%3E%200%29%0A%20%20%3FdeathsStatement%20pq%3AP585%20%3FdeathsPointInTime.%0A%20%20%7B%20%3Fitem%20wdt%3AP1269%20wd%3AQ81068910.%20%7D%20UNION%0A%20%20%7B%20%3Fitem%20wdt%3AP361%20wd%3AQ83741704.%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3FcountryLabel%29%0A))

```sparql
#defaultView:LineChart
SELECT
?deathsPointInTime ?deaths
?countryLabel
WHERE {
  ?item wdt:P31 wd:Q3241045.
  ?item wdt:P17 ?country.
  ?item p:P1120 ?deathsStatement.
  ?deathsStatement ps:P1120 ?deaths.
  FILTER(?deaths > 0)
  ?deathsStatement pq:P585 ?deathsPointInTime.
  { ?item wdt:P1269 wd:Q81068910. } UNION
  { ?item wdt:P361 wd:Q83741704. }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
} ORDER BY ASC(?countryLabel)
```
