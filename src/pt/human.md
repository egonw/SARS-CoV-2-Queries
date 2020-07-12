# O ser humano

## Genes e proteínas que interagem

Compreender os processos biológicos pelos quais o SARS-CoV-2 funciona requer saber quais genes e proteínas humanos estão envolvidos. Isso é para a próxima seção podemos primeiro querer saber o que a literatura diz aqui (a anotação ainda é limitada):

<sparql>humanInteractionCounts</sparql>

Isso nos dá esse número de documentos:

<out>humanInteractionCounts</out>

Se você quiser ver os documentos específicos (uma lista crescente), use esta consulta:

<sparql>humanInteractions</sparql>

## Processos biológicos

[WikiPathways](https://wikipathways.org/) [<cite>Q42896569</cite>]
é um dos projetos envolvidos no esforço internacional de curadoria dos [#covidpathways COVID-19](https://covid.pages.uni.lu/map_curation) e as contribuições de WikiPathways podem ser encontradas [neste portal](http://covid.wikipathways.org/).

As vias moleculares do [Reactome](http://reactome.org/) [<cite>Q24567743</cite>] e do WikiPathways estão indexadas no Wikidata e podemos consultar as que apresentam genes e proteínas de coronavírus humanos:

<sparql>pathways</sparql>

Atualmente, essa busca enumera as seguintes vias (mas espera-se que com a curadoria ativa, esse número cresça rapidamente):

<out>pathways</out>

## Referências

<references/>
