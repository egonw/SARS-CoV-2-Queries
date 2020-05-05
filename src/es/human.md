# El humano

## Genes y proteínas que interactúan

Comprender los procesos biológicos por los cuales funciona el virión CoV requiere conocer qué genes y proteínas humanos están involucrados. Esto es hacia la siguiente sección, por supuesto, pero es posible que primero deseemos saber qué dice la literatura aquí (la anotación aún es limitada):

<sparql>humanInteractionCounts</sparql>

Esto nos da estos números de documentos:

<out>humanInteractionCounts</out>

Si desea ver los documentos específicos (una lista creciente), use esta consulta:

<sparql>humanInteractions</sparql>

## Procesos biológicos

[WikiPathways](https://wikipathways.org/) [<cite>Q42896569</cite>]
es uno de los proyectos involucrados en el esfuerzo de curación internacionalis de [#covidpathways COVID-19](https://covid.pages.uni.lu/map_curation) y las contribuciones de WikiPathways se pueden encontrar en [este portal](http://covid.wikipathways.org/).

Vías moleculares de [Reactome](http://reactome.org/) [<cite>Q24567743</cite>] y WikiPathways están indexadas en Wikidata, y podemos consultar las vías que tienen genes y proteínas de coronavirus humanos:

<sparql>pathways</sparql>

Actualmente, esto enumera las siguientes vías, pero con la curación activa, se espera que también crezca rápidamente:

<out>pathways</out>

## Referencias

<references/>
