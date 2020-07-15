# Rumo a uma solução

Atualmente não existe uma solução para o SARS-CoV-2. 

Há, contudo, ideias sobre como as soluções poderiam ser. Uma vacina é uma possível solução, mas seu desenvolvimento leva tempo  [<cite>Q87461271</cite>]. Também se fala em uso de soros (anticorpos) e reaproveitamento de drogas conhecidas. Tudo isso é muito exploratório nesse momento. Os ensaios clínicos são importantíssimos (consulte a seção [Ensaios clínicos](https://egonw.github.io/SARS-CoV-2-Queries/pt/covid.html#clinical-trials)).

Este capítulo mostra uma série de buscas de informações no Wikidata sobre agentes relacionados à busca de soluções para a COVID-19.

## Anticorpos

A busca por anticorpos eficazes tem ganhado bastante tração. A consulta a seguir enumera artigos sobre os coronavírus humanos também anotados com o termo '<topic>anticorpo</topic>':

<sparql>antibodies</sparql>

A lista está crescendo bastante, então vamos mostrar somente a quantidade de artigos sobre anticorpos para cada vírus:

<out>antibodyCounts</out>

Deve-se enfatizar que os anticorpos são específicos para cada proteína e cada coronavírus tem proteínas diferentes. Essa lista, então, é apenas um agregados de artigos relevantes, mas não para se tirar conclusões imediatas.

<out limit="15">antibodies</out>

## Reuso de medicamentos

A seção <xref>trials</xref>  inclui uma descrição geral dos ensaios clínicos. Esta aqui dá uma ideia dos sintomas que preocupam às pessoas. Também traz informações sobre quais medicamentos se estudam para <topic>reuso</topic>.
Alguns destes tem recebido mais atenção, outros menos. 


<iframe>interventionStructures</iframe>

A busca a seguir conta o número de ensaios clínicos no Wikidata por <topic>intervenção de pesquisa</topic>:

<sparql>clinicalTrialsByIntervention</sparql>

Isso nos dá:

<out limit="15">clinicalTrialsByIntervention</out>

É importante destacar que essa lista só dá uma ideia de quais intervenções tiveram mais atenção que as outras. É essencial perceber que atenção NÃO é uma medida de sucesso. 

## Referências

<references/>

