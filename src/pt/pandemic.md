# A pandemia

O número total de casos na <a name="tp1">pandemia</a> pode ser encontrado com essa busca:

<sparql>earthAllCasesToday</sparql>

O que nos dá (até o momento que o documento foi gerado):

<out>earthAllCasesToday</out>

## <topic>Transmissão</topic> do vírus 

A propagação do vírus tão rápida ocorre por sua facilidade de pular de um humano a outro. Todos devem entender a importância de manter uma distância adequada para evitar, entre outras coisas, as gotículas projetadas pela tosse que podem carregar o vírus [citação necessária]. 

O SARS-CoV-2 sobrevive por algum tempo após ser expelido, por exemplo, em superfícies [citação necessária]. Podemos, com essa busca, listar artigos referentes à permanência do vírus em <topic>superficies planas</topic>:

<sparql>surfacesCounts</sparql>

Isso nos mostra:

<out>surfacesCounts</out>

A busca para enumerar os artigos sobre sobrevivência de quaisquer coronavírus em superfícies pode ser assim feita: 


<sparql>surfaces</sparql>

Para os coronavírus humanos temos esses artigos:

<out>surfaces</out>

## Progressão

Podemos estar mais interessados na quantidade de casos ao longo do tempo. Então necessitamos de uma busca mais complexa, tomando em conta os qualificadores das declarações. 

<sparql>earthAllCases</sparql>

Se quisermos fazer um gráfico linear da progressão dos casos, precisamos mudar levemente a busca:

<sparql>earthAllCasesLinePlot</sparql>

Isso nos fornece a seguinte série temporal:

<iframe>earthAllCasesLinePlot</iframe>

## Progressão regional

Assim como a Wikipédia, a Wikidata também contem páginas sobre a pandemia para regiões específicas. Podemos enumerá-las com essa consulta:

<sparql>facets</sparql>

A lista é extensa, e para mostrá-la, você pode abrir a página SPARQL anterior.

### Progressão nos Países Baixos

As facetas podem ser usadas, por exemplo, para ver a<topic>progressão</topic> em uma região, por exemplo, só nos <topic>Países Baixos</topic>:

<sparql>progressionNL</sparql>

A medida que a pandemia continua, a tabela aumentou, e um gráfico pode ser mais útil. 

<sparql>progressionNLlineplot</sparql>


Que mostra:

<iframe>progressionNLlineplot</iframe>

### Progressão na Itália

Para os europeus, em especial,  a situação da <topic>Itália</topic>  ficou marcada na nossa memória. Simplesmente podemos mudar o identificador Q dos Países Baixos por aquele da Itália:

<sparql>progressionIT</sparql>

Atualmente, o número total de casos confirmados de pessoas infectadas é mais alto nos <topic>Estados Unidos de América</topic> que em qualquer outro país do mundo. 

<sparql>progressionUS</sparql>

Que mostra:

<iframe>progressionUS</iframe>

## Progressão regional graficada

### Casos

<sparql>graphCases</sparql>

Isto nos mostra:

<iframe>graphCases</iframe>

### Falecidos

<sparql>graphDeaths</sparql>

