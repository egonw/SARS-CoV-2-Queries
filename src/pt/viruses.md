<section level="#" label="virus">Virus</section>

Os coronavírus, como grupo, não são novos, e alguns deles são um tanto quanto inofensivos. Por exemplo, os coronavírus humanos HCoV-229E e HCoV-OC43 normalmente causam apenas resultado um resfriado comum [<cite>Q36641750</cite>]. Por outro lado, para os <topic>coronavirus relacionados ao vírus da SARS</topic>  isso é diferente. Entre eles encontra-se o SARS-CoV-2, claro, que é o tema principal deste livro  [<cite>Q87000965</cite>].

## Todos os coronavírus relacionados com a SARS

O  <topic>virus</topic> <topic>SARS-CoV-2</topic> não é o primeiro <topic>coronavirus</topic> (CoV). De fato, se conhecem muitos coronavírus relacionados com o vírus da SARS, como se meciona nesta [Lista de taxonomia do NCBI](https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?mode=Undef&id=694009&lvl=3&keep=1&srchmode=1&unlock).

Primeiro enumeramos todos os virus SARSr-CoV no Wikidata:

<sparql>allSARSCoVViruses</sparql>

Isso nos dá:

<out>allSARSCoVViruses</out>

Se compararmos essa lista com a da seção  <xref>sevenhuman</xref>, elas não se sobrepõe completamente.

<section level="##" label="sevenhuman"> Os sete coronavírus que infectam humanos</section>

Para a pandemia atual, os sete coronavírus humanos podem ser de interesse particular [<cite>Q86729469</cite>].

Podemos usar essa busca para enumerá-los:

<sparql>humanCoronaviruses</sparql>

Isso nos dá um bom ponto de partida para estudá-los:


<out>humanCoronaviruses</out>

## Todos os betacoronavirus

Mas todos os coronavírus relacionados com o SARS são só um dos subgrupos. Outro subgrupo (que inclui os relacionados a SARS) são os betacoronavirus:

<sparql>allBetacoronaViruses</sparql>

Devido a abundância de dados sobre eles no Wikidata, preferimos fazer um gráfico de dependência:

<sparql>allBetacoronaVirusesGraph</sparql>

Que fornece a seguinte saída:

<iframe>allBetacoronaVirusesGraph</iframe>

## Todos os coronavírus

A lista completa de coronavírus se vê aqui:

<sparql>allCoronaViruses</sparql>

Novamente, optamos por fazer um gráfico de dependência:

<sparql>allCoronaVirusesGraph</sparql>

Isso nos dá a seguinte saída: 

<iframe>allCoronaVirusesGraph</iframe>

### Comparação de diferentes vírus
Também podemos consultar artigos que comparem um coronavírus humano com outros coronavírus.

<sparql>compareViruses</sparql>

## ID de taxonomía de NCBI

## ID de taxonomia do NCBI

Para os coronavírus, podemos enumerar os identificadores do <topic>NCBI Taxonomy</topic> [<cite>Q28740981</cite>] com:

<sparql>allSARSCoVVirusesTaxonomy</sparql>

Isso nos dá:

<out>allSARSCoVVirusesTaxonomy</out>

## Referências

<references/>

