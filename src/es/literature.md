# Literatura

Estas consultas enumeran los últimos 10 <topic>artículos</topic> sobre una serie de temas. No reemplaza a [Scholia](https://tools.wmflabs.org/scholia/) [<cite>Q63433973</cite>], que tiene una visión mucho más rica de la <topic>literatura</topic> sobre el tema. Cada sección incluye un enlace a la página de Scholia para ese tema. Las consultas utilizadas aquí son muy básicas y solo utilizan la propiedad 'sujeto principal'.

## Literatura sobre SARS-CoV-2

[SARS-CoV-2](https://tools.wmflabs.org/scholia/topic/Q82069695) es el nombre del virus.

<sparql>litSARSCoV2</sparql>

Esto le da estos 10 documentos (elimine el `LIMIT 10` de la consulta para obtener todos):

<out>litSARSCoV2</out>

### Literatura sobre SARS-CoV-2 genes

También podemos consultar artículos sobre los genes:

<sparql>litSARSCoV2Genes</sparql>

Que actualmente da (elimine el `LIMIT 10` para obtener todo):

<out>litSARSCoV2Genes</out>

### Literatura sobre SARS-CoV-2 proteínas

Y sobre las proteínas del virus:

<sparql>litSARSCoV2Proteins</sparql>

Que actualmente da:

<out>litSARSCoV2Proteins</out>

## Literatura sobre los coronavirus

Como se describe en el capítulo <xref>virus</xref>, el SARS-Cov-2 es uno de los coronavirus que puede infectar a los humanos.

<sparql>litCoronaviruses</sparql>

Esto le da estos 10 documentos:

<out>litCoronaviruses</out>

### Literatura sobre los coronavirus humanos

Hay más de 6000 artículos sobre los siete coronavirus humanos en Wikidata. Por lo tanto, la siguiente consulta está un poco ajustada para el rendimiento y es más compleja. Además, la lista es bastante larga y no figura en esta página.
Para ver el resultado, haga clic a continuación en el nombre del archivo `litHumanCoronaviruses.rq`:

<sparql>litHumanCoronaviruses</sparql>

Además, el número de artículos para cada virus varía significativamente, lo que se puede visualizar con esta consulta:

<sparql>litHumanCoronavirusesCounts</sparql>

Lo que nos dice:

<out>litHumanCoronavirusesCounts</out>

#### y sus genes

<sparql>litHumanCoronavirusesGeneCounts</sparql>

Lo que nos muestra:

<out>litHumanCoronavirusesGeneCounts</out>

#### y sus proteínas

<sparql>litHumanCoronavirusesProteinCounts</sparql>

Donde están los recuentos:

<out>litHumanCoronavirusesProteinCounts</out>

## Referencias

<references/>
