# litHumanCoronavirusesCounts.rq
**コード例:** [curl](#curl)
### SPARQL
```sparql
SELECT ?virus ?virusLabel ?count WITH {
  SELECT ?virus (COUNT(DISTINCT ?work) AS ?count) WHERE {
    VALUES ?virus {
      wd:Q82069695 # SARS-CoV-2
      wd:Q16983360 # HKU1
      wd:Q16991954 # OC43
      wd:Q8351095  # NL63 
      wd:Q16983356 # 229E 
      wd:Q4902157  # MERS-CoV
      wd:Q278567   # SARS-CoV
    }
    ?work wdt:P921 ?virus .
  } GROUP BY ?virus
} AS %ARTICLES WHERE {
  INCLUDE %ARTICLES
  SERVICE wikibase:label { bd:serviceParam wikibase:language "ja,en". }
}
ORDER BY DESC(?count)
```
[実行](https://query.wikidata.org/embed.html#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fcount%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%28COUNT%28DISTINCT%20%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20.%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fcount%29%0A) もしくは [編集](https://query.wikidata.org/#SELECT%20%3Fvirus%20%3FvirusLabel%20%3Fcount%20WITH%20%7B%0A%20%20SELECT%20%3Fvirus%20%28COUNT%28DISTINCT%20%3Fwork%29%20AS%20%3Fcount%29%20WHERE%20%7B%0A%20%20%20%20VALUES%20%3Fvirus%20%7B%0A%20%20%20%20%20%20wd%3AQ82069695%20%23%20SARS-CoV-2%0A%20%20%20%20%20%20wd%3AQ16983360%20%23%20HKU1%0A%20%20%20%20%20%20wd%3AQ16991954%20%23%20OC43%0A%20%20%20%20%20%20wd%3AQ8351095%20%20%23%20NL63%20%0A%20%20%20%20%20%20wd%3AQ16983356%20%23%20229E%20%0A%20%20%20%20%20%20wd%3AQ4902157%20%20%23%20MERS-CoV%0A%20%20%20%20%20%20wd%3AQ278567%20%20%20%23%20SARS-CoV%0A%20%20%20%20%7D%0A%20%20%20%20%3Fwork%20wdt%3AP921%20%3Fvirus%20.%0A%20%20%7D%20GROUP%20BY%20%3Fvirus%0A%7D%20AS%20%25ARTICLES%20WHERE%20%7B%0A%20%20INCLUDE%20%25ARTICLES%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22ja%2Cen%22.%20%7D%0A%7D%0AORDER%20BY%20DESC%28%3Fcount%29%0A)


### 結果
<table>
  <tr>
    <td><b>virus</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q82069695">SARSコロナウイルス2</a> (<a href="http://www.wikidata.org/entity/Q82069695">edit</a>)</td>
    <td>16323</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q278567">SARS関連コロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q278567">edit</a>)</td>
    <td>2479</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q4902157">MERSコロナウイルス</a> (<a href="http://www.wikidata.org/entity/Q4902157">edit</a>)</td>
    <td>1040</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16991954">ベータコロナウイルス１</a> (<a href="http://www.wikidata.org/entity/Q16991954">edit</a>)</td>
    <td>91</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983356">ヒトコロナウイルス229E</a> (<a href="http://www.wikidata.org/entity/Q16983356">edit</a>)</td>
    <td>84</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q8351095">ヒトコロナウイルスNL63</a> (<a href="http://www.wikidata.org/entity/Q8351095">edit</a>)</td>
    <td>79</td>
  </tr>
  <tr>
    <td><a href="https://scholia.toolforge.org/Q16983360">ヒトコロナウイルスHKU1</a> (<a href="http://www.wikidata.org/entity/Q16983360">edit</a>)</td>
    <td>21</td>
  </tr>
</table>
## コード例
### curl
```shell
curl -s https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/litHumanCoronavirusesCounts.rq | sed 's+<lang/>+ja+' > litHumanCoronavirusesCounts.rq

curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@litHumanCoronavirusesCounts.rq
```
本SPARQLクエリはCC0ライセンスで利用可能です。
