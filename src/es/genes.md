# Genomas, Genes y Proteínas

## Genomas

Quizás la primera pregunta debería ser, qué <topic>genomas</topic> se han medido para el virus SARS-CoV-2:

<sparql>genomes</sparql>

Que enumera estas URL del genoma:

<out>genomes</out>

## SARS-CoV-2

### Genes

El <topic>ARN</topic> del SARS-CoV-2 ha sido secuenciado. Por lo tanto, los <topic>marcos abiertos de lectura</topic> son conocidos e identificados.
Podemos consultar la información del <topic>gen</topic> en Wikidata con esta consulta:

<sparql>virusGenes</sparql>

Lo que nos da estos genes:

<out>virusGenes</out>

### Proteínas

Alternativamente, podemos estar interesados en las <topic>proteínas</topic> de los coronavirus.
Podemos obtener aquellos con esta consulta:

<sparql>virusProteins</sparql>

Lo que nos da estas proteínas:

<out>virusProteins</out>

### Complejos proteicos

Gracias al trabajo realizado por un equipo en el 
[BioHackathon en línea en April 2020](https://github.com/virtual-biohackathons/covid-19-bh20),
estructuras macromoleculares del [Complex Portal](https://www.ebi.ac.uk/complexportal/) [<cite>Q57793775</cite>]
han estado entrando en Wikidata:

<sparql>complexes</sparql>

Listado de estos complejos:

<out>complexes</out>

#### Estructuras PDB

Para las proteínas, podemos consultar las <topic>estructuras PDB</topic> [<cite>Q30491855</cite>]:

<sparql>virusProteinsPDB</sparql>

Lo que nos da:

<out>virusProteinsPDB</out>

## Todos los virus relacionados con el SARS

Al igual que en la consulta anterior, también podemos solicitar todos los genes y proteínas de todos los virus relacionados con el SARS. Esto se hace con las siguientes consultas.

### Todos los genes relacionados con el SARS

Todos los genes que obtenemos con:

<sparql>virusGenesSARSr</sparql>

Que devuelve:

<out>virusGenesSARSr</out>

### Todos los proteínas relacionados con el SARS

Y todas las proteínas que obtenemos con:

<sparql>virusProteinsSARSr</sparql>

Que devuelve:

<out>virusProteinsSARSr</out>

## Todos los coronavirus humanos

Al igual que en la consulta anterior, también podemos pedir todos los genes y proteínas. Esto se hace con las siguientes consultas.

### Todos los genes del coronavirus humano

Todos los genes que obtenemos con:

<sparql>virusGenesAll</sparql>

Que devuelve:

<out>virusGenesAll</out>

### Todos los proteínas del coronavirus humano

Y todas las proteínas que obtenemos con:

<sparql>virusProteinsAll</sparql>

Que devuelve:

<out>virusProteinsAll</out>

## References

<references/>

