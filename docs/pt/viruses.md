<!--- THIS FILE IS AUTOGENERATED. DO NOT EDIT IT. -->

[ [en](../viruses.md) [ja](../ja/viruses.md) [nl](../nl/viruses.md) [es](../es/viruses.md) **pt**  ]

<a name="sec:virus"></a>
# Virus

Os coronavírus, como grupo, não são novos, e alguns deles são um tanto quanto inofensivos. Por exemplo, os coronavírus humanos HCoV-229E e HCoV-OC43 normalmente causam apenas resultado um resfriado comum [<a href="#citeref1">1</a>]. Por outro lado, para os <a name="tp1">coronavirus relacionados ao vírus da SARS</a>  isso é diferente. Entre eles encontra-se o SARS-CoV-2, claro, que é o tema principal deste livro  [<a href="#citeref2">2</a>].

## Todos os coronavírus relacionados com a SARS

O  <a name="tp2">virus</a> <a name="tp3">SARS-CoV-2</a> não é o primeiro <a name="tp4">coronavirus</a> (CoV). De fato, se conhecem muitos coronavírus relacionados com o vírus da SARS, como se meciona nesta [Lista de taxonomia do NCBI](https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?mode=Undef&id=694009&lvl=3&keep=1&srchmode=1&unlock).

Primeiro enumeramos todos os virus SARSr-CoV no Wikidata:

**SPARQL** [sparql/allSARSCoVViruses.rq](sparql/allSARSCoVViruses.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
}
```

Isso nos dá:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16000326">Bat SARS-like coronavirus WIV1</a> (<a href="http://www.wikidata.org/entity/Q16000326">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415852">1415852</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">SARS-CoV-1</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85939995">Bat SARS-like coronavirus RsSHC014</a> (<a href="http://www.wikidata.org/entity/Q85939995">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415851">1415851</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88162038">Bat SARS coronavirus Rp1</a> (<a href="http://www.wikidata.org/entity/Q88162038">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/349342">349342</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88169973">SARS coronavirus B024</a> (<a href="http://www.wikidata.org/entity/Q88169973">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/305407">305407</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91561236">Bat coronavirus RaTG13</a> (<a href="http://www.wikidata.org/entity/Q91561236">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2709072">2709072</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97709258">Bat SARS CoV Rf1/2004</a> (<a href="http://www.wikidata.org/entity/Q97709258">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/347537">347537</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97709416">Bat SARS CoV Rm1/2004</a> (<a href="http://www.wikidata.org/entity/Q97709416">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/347536">347536</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97709493">Bat SARS CoV Rp3/2004</a> (<a href="http://www.wikidata.org/entity/Q97709493">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/349344">349344</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104857014">RmYN02</a> (<a href="http://www.wikidata.org/entity/Q104857014">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105221659">Civet SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q105221659">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105686530">RacCS203</a> (<a href="http://www.wikidata.org/entity/Q105686530">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105759568">Rc-o319</a> (<a href="http://www.wikidata.org/entity/Q105759568">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105759613">16BO133</a> (<a href="http://www.wikidata.org/entity/Q105759613">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105759618">BtKY72</a> (<a href="http://www.wikidata.org/entity/Q105759618">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105759623">BM48-31</a> (<a href="http://www.wikidata.org/entity/Q105759623">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107248454">RpYN06</a> (<a href="http://www.wikidata.org/entity/Q107248454">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107719644">RhGB01</a> (<a href="http://www.wikidata.org/entity/Q107719644">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q108616377">BANAL-52</a> (<a href="http://www.wikidata.org/entity/Q108616377">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q108616505">BANAL-103</a> (<a href="http://www.wikidata.org/entity/Q108616505">edit</a>)</td>
    <td></td>
  </tr>
</table>

Se compararmos essa lista com a da seção  [2.2](#sec:sevenhuman), elas não se sobrepõe completamente.

<a name="sec:sevenhuman"></a>
##  Os sete coronavírus que infectam humanos

Para a pandemia atual, os sete coronavírus humanos podem ser de interesse particular [<a href="#citeref3">3</a>].

Podemos usar essa busca para enumerá-los:

**SPARQL** [sparql/humanCoronaviruses.rq](sparql/humanCoronaviruses.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20wd%3AQ16983356%20%23%20229E%0A%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?virus ?virusLabel ?ncbi WHERE {
  VALUES ?virus {
    wd:Q82069695 # SARS-CoV-2
    wd:Q16983360 # HKU1
    wd:Q16991954 # OC43
    wd:Q8351095  # NL63 
    wd:Q16983356 # 229E
    wd:Q4902157  # MERS-CoV
    wd:Q278567   # SARS-CoV
  }
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
}
```

Isso nos dá um bom ponto de partida para estudá-los:


<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/694009">694009</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/227859">227859</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">coronavírus da síndrome respiratória do Oriente Médio</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1335626">1335626</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">Coronavírus humano NL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/277944">277944</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Coronavírus humano 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/11137">11137</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">Coronavírus humano HKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/290028">290028</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Coronavírus humano OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/31631">31631</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">coronavírus da síndrome respiratória aguda grave 2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2697049">2697049</a></td>
  </tr>
</table>

## Todos os betacoronavirus

Mas todos os coronavírus relacionados com o SARS são só um dos subgrupos. Outro subgrupo (que inclui os relacionados a SARS) são os betacoronavirus:

**SPARQL** [sparql/allBetacoronaViruses.rq](sparql/allBetacoronaViruses.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ16532287%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20%3FvirusLabel%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ16532287%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20%3FvirusLabel%0A))

```sparql
SELECT ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q16532287 .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
} ORDER BY ?virusLabel
```

Devido a abundância de dados sobre eles no Wikidata, preferimos fazer um gráfico de dependência:

**SPARQL** [sparql/allBetacoronaVirusesGraph.rq](sparql/allBetacoronaVirusesGraph.code.html) ([run](https://query.wikidata.org/embed.html#%23defaultView%3AGraph%0ASELECT%20%3Fparent%20%3FparentLabel%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ16532287%20.%0A%20%20%3Fvirus%20wdt%3AP171%20%3Fparent%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#%23defaultView%3AGraph%0ASELECT%20%3Fparent%20%3FparentLabel%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ16532287%20.%0A%20%20%3Fvirus%20wdt%3AP171%20%3Fparent%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0A))

```sparql
#defaultView:Graph
SELECT ?parent ?parentLabel ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q16532287 .
  ?virus wdt:P171 ?parent .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
}
```

Que fornece a seguinte saída:

<iframe
  style="width: 95%; height: 50vh; border: none;"
  src="https://query.wikidata.org/embed.html#%23defaultView%3AGraph%0ASELECT%20%3Fparent%20%3FparentLabel%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ16532287%20.%0A%20%20%3Fvirus%20wdt%3AP171%20%3Fparent%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0A"

  referrerpolicy="origin"
  sandbox="allow-scripts allow-same-origin allow-popups" >
</iframe>

## Todos os coronavírus

A lista completa de coronavírus se vê aqui:

**SPARQL** [sparql/allCoronaViruses.rq](sparql/allCoronaViruses.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvirus%29%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fvirus%29%0A))

```sparql
SELECT ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q57751738 .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
} ORDER BY ASC(?virus)
```

Novamente, optamos por fazer um gráfico de dependência:

**SPARQL** [sparql/allCoronaVirusesGraph.rq](sparql/allCoronaVirusesGraph.code.html) ([run](https://query.wikidata.org/embed.html#%23defaultView%3AGraph%0ASELECT%20%3Fparent%20%3FparentLabel%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%3Fvirus%20wdt%3AP171%20%3Fparent%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fparent%29%20ASC%28%3Fvirus%29%0A), [edit](https://query.wikidata.org/#%23defaultView%3AGraph%0ASELECT%20%3Fparent%20%3FparentLabel%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%3Fvirus%20wdt%3AP171%20%3Fparent%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fparent%29%20ASC%28%3Fvirus%29%0A))

```sparql
#defaultView:Graph
SELECT ?parent ?parentLabel ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q57751738 .
  ?virus wdt:P171 ?parent .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
} ORDER BY ASC(?parent) ASC(?virus)
```

Isso nos dá a seguinte saída: 

<iframe
  style="width: 95%; height: 50vh; border: none;"
  src="https://query.wikidata.org/embed.html#%23defaultView%3AGraph%0ASELECT%20%3Fparent%20%3FparentLabel%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%3Fvirus%20wdt%3AP171%20%3Fparent%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20ASC%28%3Fparent%29%20ASC%28%3Fvirus%29%0A"

  referrerpolicy="origin"
  sandbox="allow-scripts allow-same-origin allow-popups" >
</iframe>

### Comparação de diferentes vírus
Também podemos consultar artigos que comparem um coronavírus humano com outros coronavírus.

**SPARQL** [sparql/compareViruses.rq](sparql/compareViruses.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20DISTINCT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20DISTINCT%20%3Fvirus%20%3Fvirus2%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fvirus2%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%2C%20%3Fvirus2%20.%0A%20%20%20%20FILTER%20%28%20%3Fvirus%20%21%3D%20%3Fvirus2%20%29%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3Fvirus%20%3FworkLabel%20%3Fwork%0A), [edit](https://query.wikidata.org/#SELECT%20DISTINCT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20DISTINCT%20%3Fvirus%20%3Fvirus2%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fvirus2%20wdt%3AP171%2B%20wd%3AQ57751738%20.%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%2C%20%3Fvirus2%20.%0A%20%20%20%20FILTER%20%28%20%3Fvirus%20%21%3D%20%3Fvirus2%20%29%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3Fvirus%20%3FworkLabel%20%3Fwork%0A))

```sparql
SELECT DISTINCT ?virus ?virusLabel ?work ?workLabel WITH {
  SELECT DISTINCT ?virus ?virus2 ?work WHERE {
    VALUES ?virus {
      wd:Q82069695 # SARS-CoV-2
      wd:Q16983360 # HKU1
      wd:Q16991954 # OC43
      wd:Q8351095  # NL63 
      wd:Q16983356 # 229E 
      wd:Q4902157  # MERS-CoV
      wd:Q278567   # SARS-CoV
    }
    ?virus2 wdt:P171+ wd:Q57751738 .
    ?work wdt:P921 ?virus, ?virus2 .
    FILTER ( ?virus != ?virus2 )
  }
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
}
ORDER BY ?virusLabel ?virus ?workLabel ?work
```

## ID de taxonomía de NCBI

## ID de taxonomia do NCBI

Para os coronavírus, podemos enumerar os identificadores do <a name="tp5">NCBI Taxonomy</a> [<a href="#citeref4">4</a>] com:

**SPARQL** [sparql/allSARSCoVVirusesTaxonomy.rq](sparql/allSARSCoVVirusesTaxonomy.code.html) ([run](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0A), [edit](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fncbi%20WHERE%20%7B%0A%20%20%3Fvirus%20wdt%3AP171%2B%20wd%3AQ278567%20.%0A%20%20OPTIONAL%20%7B%20%3Fvirus%20wdt%3AP685%20%3Fncbi%20%7D%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0A))

```sparql
SELECT ?virus ?virusLabel ?ncbi WHERE {
  ?virus wdt:P171+ wd:Q278567 .
  OPTIONAL { ?virus wdt:P685 ?ncbi }
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
}
```

Isso nos dá:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>ncbi</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16000326">Bat SARS-like coronavirus WIV1</a> (<a href="http://www.wikidata.org/entity/Q16000326">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415852">1415852</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85438966">SARS-CoV-1</a> (<a href="http://www.wikidata.org/entity/Q85438966">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q85939995">Bat SARS-like coronavirus RsSHC014</a> (<a href="http://www.wikidata.org/entity/Q85939995">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/1415851">1415851</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88162038">Bat SARS coronavirus Rp1</a> (<a href="http://www.wikidata.org/entity/Q88162038">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/349342">349342</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q88169973">SARS coronavirus B024</a> (<a href="http://www.wikidata.org/entity/Q88169973">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/305407">305407</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q91561236">Bat coronavirus RaTG13</a> (<a href="http://www.wikidata.org/entity/Q91561236">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/2709072">2709072</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97709258">Bat SARS CoV Rf1/2004</a> (<a href="http://www.wikidata.org/entity/Q97709258">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/347537">347537</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97709416">Bat SARS CoV Rm1/2004</a> (<a href="http://www.wikidata.org/entity/Q97709416">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/347536">347536</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q97709493">Bat SARS CoV Rp3/2004</a> (<a href="http://www.wikidata.org/entity/Q97709493">edit</a>)</td>
    <td><a href="https://www.ncbi.nlm.nih.gov/taxonomy/349344">349344</a></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q104857014">RmYN02</a> (<a href="http://www.wikidata.org/entity/Q104857014">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105221659">Civet SARS-CoV</a> (<a href="http://www.wikidata.org/entity/Q105221659">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105686530">RacCS203</a> (<a href="http://www.wikidata.org/entity/Q105686530">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105759568">Rc-o319</a> (<a href="http://www.wikidata.org/entity/Q105759568">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105759613">16BO133</a> (<a href="http://www.wikidata.org/entity/Q105759613">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105759618">BtKY72</a> (<a href="http://www.wikidata.org/entity/Q105759618">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q105759623">BM48-31</a> (<a href="http://www.wikidata.org/entity/Q105759623">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107248454">RpYN06</a> (<a href="http://www.wikidata.org/entity/Q107248454">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q107719644">RhGB01</a> (<a href="http://www.wikidata.org/entity/Q107719644">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q108616377">BANAL-52</a> (<a href="http://www.wikidata.org/entity/Q108616377">edit</a>)</td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q108616505">BANAL-103</a> (<a href="http://www.wikidata.org/entity/Q108616505">edit</a>)</td>
    <td></td>
  </tr>
</table>

## Referências

1. <a name="citeref1"></a>Pyrc K, Berkhout B, van der Hoek L. The novel human coronaviruses NL63 and HKU1. J Virol. 2006 Nov 1;81(7):3051–7.  doi:[10.1128/JVI.01466-06](https://doi.org/10.1128/JVI.01466-06) ([Scholia](https://scholia.toolforge.org/doi/10.1128/JVI.01466-06))
2. <a name="citeref2"></a>Gorbalenya AE, of the International Committee on Taxonomy of Viruses CSG, Baker SC, Drosten C, Haagmans BL, Neuman BW, et al. The species Severe acute respiratory syndrome-related coronavirus: classifying 2019-nCoV and naming it SARS-CoV-2. Nature Microbiology. 2020 Mar 2;5(4):536–44.  doi:[10.1038/S41564-020-0695-Z](https://doi.org/10.1038/S41564-020-0695-Z) ([Scholia](https://scholia.toolforge.org/doi/10.1038/S41564-020-0695-Z))
3. <a name="citeref3"></a>Zhu N, Zhang D, Wang W, Li X, Yang B, Song J, et al. A Novel Coronavirus from Patients with Pneumonia in China, 2019. NEJM [Internet]. 2020 Feb 20;382(8):727–33. Available from: https://www.ncbi.nlm.nih.gov/pmc/articles/PMC7092803/ doi:[10.1056/NEJMOA2001017](https://doi.org/10.1056/NEJMOA2001017) ([Scholia](https://scholia.toolforge.org/doi/10.1056/NEJMOA2001017))
4. <a name="citeref4"></a>Federhen S. The NCBI Taxonomy database. NAR. 2012 Jan;40(Database issue):D136-43.  doi:[10.1093/NAR/GKR1178](https://doi.org/10.1093/NAR/GKR1178) ([Scholia](https://scholia.toolforge.org/doi/10.1093/NAR/GKR1178))


