<section level="#" label="virus">Virus</section>

Los coronavirus no son nuevos y algunos de ellos son bastante inofensivos. Por ejemplo, los coronavirus humanos HCoV-229E y HCoV-OC43 normalmente dan como resultado un resfriado común [<cite>Q36641750</cite>]. Sin embargo, para los <topic>coronavirus relacionados con el síndrome respiratorio agudo graves</topic> (<topic>coronavirus relacionado con el SARS</topic>), esto es diferente. SARS-CoV-2, por supuesto, es el tema principal de este libro.

## Todos los coronavirus relacionados con el SARS

El <topic>virus</topic> <topic>SARS-CoV-2</topic> no es el primer <topic>coronavirus</topic> (CoV). De hecho, se conocen bastantes CoV relacionados con el SARS, como se mensiona en esta [Lista de taxonomía de NCBI](https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?mode=Undef&id=694009&lvl=3&keep=1&srchmode=1&unlock).

Primero enumeramos todos los virus SARSr-CoV en Wikidata:

<sparql>allSARSCoVViruses</sparql>

Esto nos da:

<out>allSARSCoVViruses</out>

Si comparamos esta lista con la de la Sección <xref>sevenhuman</xref>, no es que estas dos listas no se superpongan completamente.

<section level="##" label="sevenhuman">Los siete coronavirus que infectan a los humanos</section>

Sin embargo, para la pandemia actual, los siete coronavirus humanos pueden ser de particular interés [<cite>Q86729469</cite>].

Podemos usar esta consulta para enumerar estos:

<sparql>humanCoronaviruses</sparql>

Esto nos da un buen punto de partida para estudiar el virus con más detalladamente:

<out>humanCoronaviruses</out>

## Todos los betacoronavirus

Pero los coronavirus relacionados con el SARS son solo un subgrupo. Otro subgrupo de coronavirus es el de los betacoronavirus:

<sparql>allBetacoronaViruses</sparql>

Debido a que hay bastantes en Wikidata, preferimos hacer un gráfico de dependencia:

<sparql>allBetacoronaVirusesGraph</sparql>

Esto da la siguiente salida:

<iframe>allBetacoronaVirusesGraph</iframe>

## Todos los coronavirus

La lista completa de coronavirus se ve así:

<sparql>allCoronaViruses</sparql>

Nuevamente, preferimos hacer un gráfico de dependencia de gráficos:

<sparql>allCoronaVirusesGraph</sparql>

Esto da la siguiente salida:

<iframe>allCoronaVirusesGraph</iframe>

### Comparación de virus

También podemos consultar artículos que comparen un coronavirus humano con otro coronavirus:

<sparql>compareViruses</sparql>

## ID de taxonomía de NCBI

Para los coronavirus podemos enumerar los identificadores <topic>NCBI Taxonomy</topic> [<cite>Q28740981</cite>] con:

<sparql>allSARSCoVVirusesTaxonomy</sparql>

Esto nos da:

<out>allSARSCoVVirusesTaxonomy</out>

## Referencias

<references/>

