# complexes.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?cpx ?complex ?complexLabel WHERE {
  ?complex wdt:P7718 ?cpx ;
           wdt:P703 wd:Q82069695
  SERVICE wikibase:label { bd:serviceParam wikibase:language "pt,en". }
}
```
[run](https://query.wikidata.org/embed.html#SELECT%20%3Fcpx%20%3Fcomplex%20%3FcomplexLabel%20WHERE%20%7B%0A%20%20%3Fcomplex%20wdt%3AP7718%20%3Fcpx%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP703%20wd%3AQ82069695%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0A) or [edit](https://query.wikidata.org/#SELECT%20%3Fcpx%20%3Fcomplex%20%3FcomplexLabel%20WHERE%20%7B%0A%20%20%3Fcomplex%20wdt%3AP7718%20%3Fcpx%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20wdt%3AP703%20wd%3AQ82069695%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22pt%2Cen%22.%20%7D%0A%7D%0A)


### Output
<table>
  <tr>
    <td><b>cpx</b></td>
    <td><b>complex</b></td>
  </tr>
  <tr>
    <td><a href="https://www.ebi.ac.uk/complexportal/complex/CPX-5687">CPX-5687</a></td>
    <td><a href="https://scholia.toolforge.org/Q89792653">SARS-CoV-2 NSP9 complex</a> (<a href="http://www.wikidata.org/entity/Q89792653">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://www.ebi.ac.uk/complexportal/complex/CPX-5683">CPX-5683</a></td>
    <td><a href="https://scholia.toolforge.org/Q90012260">SARS-CoV-2 Spike - human ACE2 receptor complex</a> (<a href="http://www.wikidata.org/entity/Q90012260">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://www.ebi.ac.uk/complexportal/complex/CPX-5684">CPX-5684</a></td>
    <td><a href="https://scholia.toolforge.org/Q90012261">SARS-CoV-2 Spike - human ACE2-SLC6A19 complex</a> (<a href="http://www.wikidata.org/entity/Q90012261">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://www.ebi.ac.uk/complexportal/complex/CPX-5682">CPX-5682</a></td>
    <td><a href="https://scholia.toolforge.org/Q90012262">SARS-CoV-2 Spike protein complex</a> (<a href="http://www.wikidata.org/entity/Q90012262">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://www.ebi.ac.uk/complexportal/complex/CPX-5685">CPX-5685</a></td>
    <td><a href="https://scholia.toolforge.org/Q90012264">SARS-CoV-2 main protease complex</a> (<a href="http://www.wikidata.org/entity/Q90012264">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://www.ebi.ac.uk/complexportal/complex/CPX-5686">CPX-5686</a></td>
    <td><a href="https://scholia.toolforge.org/Q90012266">SARS-CoV-2 nucleocapsid complex</a> (<a href="http://www.wikidata.org/entity/Q90012266">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://www.ebi.ac.uk/complexportal/complex/CPX-5688">CPX-5688</a></td>
    <td><a href="https://scholia.toolforge.org/Q90012269">SARS-CoV-2 NSP10-NSP16 complex</a> (<a href="http://www.wikidata.org/entity/Q90012269">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://www.ebi.ac.uk/complexportal/complex/CPX-5689">CPX-5689</a></td>
    <td><a href="https://scholia.toolforge.org/Q90012270">SARS-CoV-2 NSP15 complex</a> (<a href="http://www.wikidata.org/entity/Q90012270">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://www.ebi.ac.uk/complexportal/complex/CPX-5690">CPX-5690</a></td>
    <td><a href="https://scholia.toolforge.org/Q90012271">SARS-CoV-2 primase complex</a> (<a href="http://www.wikidata.org/entity/Q90012271">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://www.ebi.ac.uk/complexportal/complex/CPX-5691">CPX-5691</a></td>
    <td><a href="https://scholia.toolforge.org/Q90012272">SARS-CoV-2 NSP3-NSP4-NSP6 complex</a> (<a href="http://www.wikidata.org/entity/Q90012272">edit</a>)</td>
  </tr>
  <tr>
    <td><a href="https://www.ebi.ac.uk/complexportal/complex/CPX-5692">CPX-5692</a></td>
    <td><a href="https://scholia.toolforge.org/Q90012273">SARS-CoV-2 Guanine-N7 methyltransferase complex</a> (<a href="http://www.wikidata.org/entity/Q90012273">edit</a>)</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/complexes.rq | sed 's+<lang/>+pt+' > complexes.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@complexes.rq
```
This SPARQL query is available under CCZero.
