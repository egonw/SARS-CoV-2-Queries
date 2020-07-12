# Genomas, Genes e Proteínas

## Genomas

Talvez a primeira pergunta sobre esse tema possa ser: quais <topic>genomas</topic> foram já analisados para o SARS-CoV-2:

<sparql>genomes</sparql>

Que lista as URLs de genoma:

<out>genomes</out>

## SARS-CoV-2

### Genes

O <topic>RNA</topic> do SARS-CoV-2 já foi sequenciado. Dessa forma, os <topic>quadros abertos de leitura</topic>  (ORFs) são conhecidos e identificados.
Podemos consultar a informação sobre <topic>genes</topic> na Wikidata com essa busca:

<sparql>virusGenes</sparql>

O que nos dá esses genes:

<out>virusGenes</out>

### Proteínas

Alternativamente, podemos estar interessados nas  <topic>proteínas</topic> dos coronavirus.
Podemos obtê-las com essa busca:

<sparql>virusProteins</sparql>

O que nos dá essas proteínas:

<out>virusProteins</out>

### Complejos proteicos

Graças ao trabalho realizado por uma equipe no  [BioHackathon online em April 2020](https://github.com/virtual-biohackathons/covid-19-bh20),
as estruturas macromoleculares do [Complex Portal](https://www.ebi.ac.uk/complexportal/)  [<cite>Q57793775</cite>]
foram inseridas no Wikidata:

<sparql>complexes</sparql>

Lista destes complexos:

<out>complexes</out>

#### Estruturas do PDB

Para as proteínas, podemos consultar as  <topic>estruturas do PDB</topic> [<cite>Q30491855</cite>]:

<sparql>virusProteinsPDB</sparql>

O que nos dá:

<out>virusProteinsPDB</out>

## Todos os virus relacionados com o SARS

Assim comoa a consulta anterior, também podemos buscar todos os genes e proteínas de todos os vírus relacionados com o SARS. Isso se faz com as seguintes consultas: 


### Todos os genes relacionados com o SARS

Todos os genes que obtemos com:

<sparql>virusGenesSARSr</sparql>

Que devolve:

<out>virusGenesSARSr</out>

### Todas as proteínas relacionadas com o SARS

E todas as proteínas que obtemos com:

<sparql>virusProteinsSARSr</sparql>

Que devolve:

<out>virusProteinsSARSr</out>

## Todos os coronavirus humanos

Como na busca anterior, também podemos pedir por todos os genes e proteínas. Isso se faz com as seguintes buscas:

### Todos os genes de coronavirus humano

Todos os genes que obtemos são:

<sparql>virusGenesAll</sparql>

Que devolve:

<out>virusGenesAll</out>

## Todas as proteínas de coronavirus humanos

E todas as proteínas que obtemos com:

<sparql>virusProteinsAll</sparql>

Que retorna:

<out>virusProteinsAll</out>

## Referências
<references/>

