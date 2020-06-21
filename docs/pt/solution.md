[ [en](../solution.md) [ja](../ja/solution.md) [pt](../human.md)  **pt**  ]

# Rumo a uma solução

Atualmente não existe uma solução para o SARS-CoV-2. 

Há, contudo, ideias sobre como as soluções poderiam ser. Uma vacina é uma possível solução, mas seu desenvolvimento leva tempo [<a href="#citeref1">1</a>]. Também se fala em uso de soros (anticorpos) e reaproveitamento de drogas conhecidas. Tudo isso é muito exploratório nesse momento. Os ensaios clínicos são importantíssimos (consulte a seção [Ensaios clínicos](https://egonw.github.io/SARS-CoV-2-Queries/es/covid.html#clinical-trials)).

Este capítulo mostra uma série de buscas de informações no Wikidata sobre agentes relacionados à busca de soluções para a COVID-19.

## Anticorpos

A busca por anticorpos eficazes tem ganhado bastante tração. A consulta a seguir enumera artigos sobre os coronavírus humanos também anotados com o termo '<a name="tp1">anticorpo</a>':

**SPARQL** [sparql/antibodies.rq](sparql/antibodies.code.html) ([executar](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ79460%20.%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3FworkLabel%0A), [editar](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fwork%20%3FworkLabel%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%3Fwork%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20%3B%0A%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20wd%3AQ79460%20.%0A%20%20%7D%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20%3FvirusLabel%20%3FworkLabel%0A))

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
          wdt:P921 wd:Q79460 .
  }
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
}
ORDER BY ?virusLabel ?workLabel
```

A lista está crescendo bastante, então vamos mostrar somente a quantidade de artigos sobre anticorpos para cada vírus:

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS coronavirus</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td>48</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>16</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARS-CoV-2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>1</td>
  </tr>
</table>

Deve-se enfatizar que os anticorpos são específicos para cada proteína e cada coronavírus tem proteínas diferentes. Essa lista, então, é apenas um agregados de artigos relevantes, mas não para se tirar conclusões imediatas.

<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>work</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q40614291">Antibody to virus components in volunteers experimentally infected with human coronavirus 229E group viruses.</a> (<a href="http://www.wikidata.org/entity/Q40614291">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">Human coronavirus 229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q41288189">Detection of human coronavirus 229E-specific antibodies using recombinant fusion proteins.</a> (<a href="http://www.wikidata.org/entity/Q41288189">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">Human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q57096902">Development of a recombinant truncated nucleocapsid protein based immunoassay for detection of antibodies against human coronavirus OC43</a> (<a href="http://www.wikidata.org/entity/Q57096902">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q33743790">A conformation-dependent neutralizing monoclonal antibody specifically targeting receptor-binding domain in Middle East respiratory syndrome coronavirus spike protein.</a> (<a href="http://www.wikidata.org/entity/Q33743790">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30379384">A humanized neutralizing antibody against MERS-CoV targeting the receptor-binding domain of the spike protein.</a> (<a href="http://www.wikidata.org/entity/Q30379384">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q37152873">A safe and convenient pseudovirus-based inhibition assay to detect neutralizing antibodies and screen for viral entry inhibitors against the novel human coronavirus MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q37152873">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q35063993">A truncated receptor-binding domain of MERS-CoV spike protein potently inhibits MERS-CoV infection and induces strong neutralizing antibody responses: implication for developing therapeutics and vaccines</a> (<a href="http://www.wikidata.org/entity/Q35063993">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30362113">Exceptionally potent neutralization of Middle East respiratory syndrome coronavirus by human monoclonal antibodies.</a> (<a href="http://www.wikidata.org/entity/Q30362113">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42256279">Investigation of anti-middle East respiratory syndrome antibodies in blood donors and slaughterhouse workers in Jeddah and Makkah, Saudi Arabia, fall 2012.</a> (<a href="http://www.wikidata.org/entity/Q42256279">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42210505">Middle East respiratory syndrome coronavirus (MERS-CoV) RNA and neutralising antibodies in milk collected according to local customs from dromedary camels, Qatar, April 2014.</a> (<a href="http://www.wikidata.org/entity/Q42210505">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q30358243">Middle East respiratory syndrome coronavirus antibody reactors among camels in Dubai, United Arab Emirates, in 2005.</a> (<a href="http://www.wikidata.org/entity/Q30358243">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42251659">Middle East respiratory syndrome coronavirus neutralising serum antibodies in dromedary camels: a comparative serological study.</a> (<a href="http://www.wikidata.org/entity/Q42251659">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERS-CoV</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td><a href="https://scholia.toolforge.org/Q42249511">Middle East respiratory syndrome coronavirus spike protein delivered by modified vaccinia virus Ankara efficiently induces virus-neutralizing antibodies.</a> (<a href="http://www.wikidata.org/entity/Q42249511">edit</a>)</td>
  </tr>
  <tr><td colspan="2">This table is truncated. See the full table at <a href="sparql/antibodies.code.html">sparql/antibodies.rq</a></td></tr>
</table>

## Reuso de medicamentos

A seção ?? inclui uma descrição geral dos ensaios clínicos. Esta aqui dá uma ideia dos sintomas que preocupam às pessoas. Também traz informações sobre quais medicamentos se estudam para <a name="tp3">reuso</a>.
Alguns destes tem recebido mais atenção, outros menos. 

<iframe
  style="width: 95%; height: 50vh; border: none;"
  src="https://query.wikidata.org/embed.html#%23defaultView%3AImageGrid%0ASELECT%20%3Fintervention%20%3FinterventionLabel%20%3Fimage%20WITH%20%7B%0A%20%20SELECT%20DISTINCT%20%3Fintervention%20%28COUNT%28DISTINCT%20%3Ftrial%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Ftopic%20%7B%20wd%3AQ84263196%20wd%3AQ82069695%20%7D%0A%20%20%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP921%20%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20%7D%20GROUP%20BY%20%3Fintervention%0A%20%20%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A%20%20%20%20LIMIT%2025%0A%7D%20AS%20%25COMPOUNDS%20WHERE%20%7B%0A%20%20INCLUDE%20%25COMPOUNDS%0A%20%20%3Fintervention%20wdt%3AP117%20%3Fimage%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22en%2Cen%22.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Fcount%29%0A%20%20LIMIT%2010%0A"

  referrerpolicy="origin"
  sandbox="allow-scripts allow-same-origin allow-popups" >
</iframe>

A busca a seguir conta o número de ensaios clínicos no Wikidata por <a name="tp4">intervenção</a>:

**SPARQL** [sparql/clinicalTrialsByIntervention.rq](sparql/clinicalTrialsByIntervention.code.html) ([executar](https://query.wikidata.org/embed.html#SELECT%20%3Fintervention%20%3FinterventionLabel%20%28COUNT%28%3Ftrial%29%20AS%20%3Ftrials%29%20WHERE%20%7B%0A%20%20VALUES%20%3Ftopic%20%7B%0A%20%20%20%20wd%3AQ84263196%20wd%3AQ82069695%0A%20%20%7D%0A%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP921%20%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fintervention%20%3FinterventionLabel%0A%20%20ORDER%20BY%20DESC%28%3Ftrials%29%0A), [editar](https://query.wikidata.org/#SELECT%20%3Fintervention%20%3FinterventionLabel%20%28COUNT%28%3Ftrial%29%20AS%20%3Ftrials%29%20WHERE%20%7B%0A%20%20VALUES%20%3Ftopic%20%7B%0A%20%20%20%20wd%3AQ84263196%20wd%3AQ82069695%0A%20%20%7D%0A%20%20%3Ftrial%20wdt%3AP31%20wd%3AQ30612%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP921%20%20%3Ftopic%20%3B%0A%20%20%20%20%20%20%20%20%20wdt%3AP4844%20%3Fintervention%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fintervention%20%3FinterventionLabel%0A%20%20ORDER%20BY%20DESC%28%3Ftrials%29%0A))

```sparql
SELECT ?intervention ?interventionLabel (COUNT(?trial) AS ?trials) WHERE {
  VALUES ?topic {
    wd:Q84263196 wd:Q82069695
  }
  ?trial wdt:P31 wd:Q30612 ;
         wdt:P921  ?topic ;
         wdt:P4844 ?intervention .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
} GROUP BY ?intervention ?interventionLabel
  ORDER BY DESC(?trials)
```

Isso nos dá:

<table>
  <tr>
    <td><b>intervention</b></td>
    <td><b>trials</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q421094">hidroxicloroquina</a> (<a href="http://www.wikidata.org/entity/Q421094">edit</a>)</td>
    <td>42</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q422585">Lopinavir</a> (<a href="http://www.wikidata.org/entity/Q422585">edit</a>)</td>
    <td>14</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q422618">Ritonavir</a> (<a href="http://www.wikidata.org/entity/Q422618">edit</a>)</td>
    <td>14</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q422438">Cloroquina</a> (<a href="http://www.wikidata.org/entity/Q422438">edit</a>)</td>
    <td>14</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q56363387">Chloroquine diphosphate bearing dextran nanoparticles augmented drug delivery and overwhelmed drug resistance in Plasmodium falciparum parasites</a> (<a href="http://www.wikidata.org/entity/Q56363387">edit</a>)</td>
    <td>12</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q84263196">COVID-19</a> (<a href="http://www.wikidata.org/entity/Q84263196">edit</a>)</td>
    <td>11</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q425154">tocilizumab</a> (<a href="http://www.wikidata.org/entity/Q425154">edit</a>)</td>
    <td>6</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q410074">Losartán</a> (<a href="http://www.wikidata.org/entity/Q410074">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q40207875">agente antiviral</a> (<a href="http://www.wikidata.org/entity/Q40207875">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q188269">interferón</a> (<a href="http://www.wikidata.org/entity/Q188269">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q207843">óxido nítrico</a> (<a href="http://www.wikidata.org/entity/Q207843">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q57055">paracetamol</a> (<a href="http://www.wikidata.org/entity/Q57055">edit</a>)</td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q417222">metilprednisolona</a> (<a href="http://www.wikidata.org/entity/Q417222">edit</a>)</td>
    <td>3</td>
  </tr>
  <tr><td colspan="2">This table is truncated. See the full table at <a href="sparql/clinicalTrialsByIntervention.code.html">sparql/clinicalTrialsByIntervention.rq</a></td></tr>
</table>

É importatne destacar que essa lista só dá uma ideia de quais intervenções tiveram mais atenção que as outras. É essencial percer que atenção NÃO é uma medida de sucesso. 

## Referências

1. <a name="citeref1"></a>Lu S, Lu S. Timely development of vaccines against SARS-CoV-2. Emerging microbes & infections. 2020 Mar 8;9(1):542–4.  doi:[10.1080/22221751.2020.1737580](https://doi.org/10.1080/22221751.2020.1737580) ([Scholia](https://scholia.toolforge.org/doi/10.1080/22221751.2020.1737580))


