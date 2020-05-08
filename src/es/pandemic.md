# La pandemia

El número total de casos de <topic>pandemia</topic> encontrados con esta consulta:

<sparql>earthAllCasesToday</sparql>

Lo que nos da:

<out>earthAllCasesToday</out>

## <topic>Transmisión</topic> de virus 

La propagación del virus ocurre porque se transmite con demasiada facilidad de un humano a otro. Todos deben tener conocimiento de mantener una adecuada distancia, a causa de las pequeñas gotas, por ejemplo, a tos que contendrán el virus.

Pero también se encuentra que el SARS-CoV-2 sobrevive una cierta cantidad de tiempo después de ser expulsado, por ejemplo, en superficies. Podemos hacer la siguiente consulta para enumerar qué artículos vinculan los coronavirus humanos a la supervivencia en <topic>superficies planas</topic>:

<sparql>surfacesCounts</sparql>

Esto nos muestra:

<out>surfacesCounts</out>

La consulta para enumerar realmente los artículos sobre supervivencia en las superficies de los virus, utiliza la siguiente consulta:

<sparql>surfaces</sparql>

Lo que nos muestra para los coronavirus humanos estos artículos:

<out>surfaces</out>

## Progresión

Sin embargo, podemos estar más interesados en la cantidad de casos a lo largo del tiempo. Entonces necesitamos una consulta más compleja y adecuada para calificadores de declaraciones:

<sparql>earthAllCases</sparql>

Si queremos hacer un diagrama lineal de la progresión, tenemos que cambiar ligeramente la consulta:

<sparql>earthAllCasesLinePlot</sparql>

Esto nos da esta serie de tiempo:

<iframe>earthAllCasesLinePlot</iframe>

## Progresión regional

Al igual que Wikipedia, Wikidata también tiene páginas sobre la pandemia para regiones específicas. Podemos enumerarlos con esta consulta:

<sparql>facets</sparql>

La lista es muy larga y, para mostrarla, puede abrir la página SPARQL anterior.

### Progresión en los Países Bajos

Estas facetas se pueden usar para ver solo la <topic>progresión</topic> en una región, por ejemplo, solo <topic>los Países Bajos</topic>:

<sparql>progressionNL</sparql>

A medida que la pandemia continúa, la tabla se ha alargado y un diagrama lineal puede ser más útil:

<sparql>progressionNLlineplot</sparql>

Que muestra:

<iframe>progressionNLlineplot</iframe>

### Progresión en Italia

Por supuesto, para los europeos, la situación en <topic>Italia</topic> queda grabada en nuestra memoria. Simplemente cambiamos el identificador Q de los Países Bajos por el de Italia:

<sparql>progressionIT</sparql>

### Progresión en los Estados Unidos

Actualmente, el número total de personas infectadas es más alto en <topic>los Estados Unidos de América</topic>:

<sparql>progressionUS</sparql>

Que muestra:

<iframe>progressionUS</iframe>

## Progresión regional graficada

### Casos

<sparql>graphCases</sparql>

Esto nos muestra:

<iframe>graphCases</iframe>

### Fallecidos

<sparql>graphDeaths</sparql>

