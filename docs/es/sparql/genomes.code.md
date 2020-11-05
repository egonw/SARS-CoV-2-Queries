# genomes.rq
**Ejemplos de código:** [curl](#curl)
### SPARQL
```sparql
SELECT ?genome WHERE {
  wd:Q82069695 wdt:P527/wdt:P6800 ?genome .
  SERVICE wikibase:label { bd:serviceParam wikibase:language "es,en". }
}

```
[ejecutar](https://query.wikidata.org/embed.html#SELECT%20%3Fgenome%20WHERE%20%7B%0A%20%20wd%3AQ82069695%20wdt%3AP527%2Fwdt%3AP6800%20%3Fgenome%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0A%0A) o [editar](https://query.wikidata.org/#SELECT%20%3Fgenome%20WHERE%20%7B%0A%20%20wd%3AQ82069695%20wdt%3AP527%2Fwdt%3AP6800%20%3Fgenome%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22es%2Cen%22.%20%7D%0A%7D%0A%0A)


### Resultados
<table>
  <tr>
    <td><b>genome</b></td>
  </tr>
  <tr>
    <td>https://gisaid.org/CoV2020</td>
  </tr>
  <tr>
    <td>https://www.ncbi.nlm.nih.gov/assembly/GCF_009858895.2</td>
  </tr>
  <tr>
    <td>https://www.ncbi.nlm.nih.gov/genome/86693</td>
  </tr>
  <tr>
    <td>https://www.ncbi.nlm.nih.gov/nuccore/1798174254</td>
  </tr>
</table>
## Ejemplos de código
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/genomes.rq | sed 's+<lang/>+es+' > genomes.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@genomes.rq
```
Esta consulta SPARQL está disponible en CCZero.
