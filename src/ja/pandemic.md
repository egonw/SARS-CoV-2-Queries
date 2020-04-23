# パンデミック

今回の<topic>パンデミック</topic>による感染者数は以下のクエリで得られます。

<sparql>earthAllCasesToday</sparql>

結果は以下の通りです。

<out>earthAllCasesToday</out>

## ウイルスの<topic>感染</topic>

ヒトからヒトへの感染が非常に簡単に生じるので、このウイルスの大流行が起きます。個々人が他の人との間隔を開けることについて意識する必要があります。なぜなら、咳をするなどして生じる小さな飛沫にはウイルスが含まれているかもしれないからです[要引用]。

しかし、SARS-CoV-2はヒトから放出されたのちに、様々なものの表面などでしばらくの間生き続けることが判明しています[要引用]。次のクエリを発行して、平らな<topic>表面</topic>でヒトコロナウイルスが生存することについて調査している論文を取得します。

<sparql>surfacesCounts</sparql>

結果は以下の通りになります。

<out>surfacesCounts</out>

物質表面上でのウイルス生存に関する論文を実際に取得するには以下のクエリを発行します。

<sparql>surfaces</sparql>

これによりヒトコロナウイルスに関するこれらの論文が得られます。

<out>surfaces</out>

## 推移

一方で、時間の経過とともにどのように感染者数が変化するかについて興味があるかもしれません。その場合は、より複雑なクエリを用いて条件を絞る必要があります。

<sparql>earthAllCases</sparql>

時間の経過とともに変化する感染者数の折れ線グラフを表示させたい場合は以下の通り少しクエリを変える必要があります。

<sparql>earthAllCasesLinePlot</sparql>

結果は以下の通りです。

<iframe>earthAllCasesLinePlot</iframe>

## 地域別の感染者数の推移

Wikipediaと同様に、Wikidataにも特定地域におけるパンデミックに関する項目があります。以下のクエリでそれをリストアップできます。

<sparql>facets</sparql>

このリストは非常に長いので、それを見るには上記のSPARQLのページを開きます。

### オランダでの感染者数の推移

これらのファセットは、<topic>オランダ</topic>など、一つの地域での<topic>推移</topic>を見るものです。

<sparql>progressionNL</sparql>

パンデミックが続いており、表は長くなるので、折れ線グラフが有益でしょう。

<sparql>progressionNLlineplot</sparql>

以下の結果が得られます。

<iframe>progressionNLlineplot</iframe>

### イタリアでの感染者数の推移

もちろん、<topic>イタリア</topic>における状況は欧州人の脳裏に強烈に焼きつきます。WikidataのQ識別子をオランダに変えてみます。

<sparql>progressionIT</sparql>

### アメリカ合衆国での推移

現在、感染者数が最大の<topic>アメリカ合衆国</topic>です。

<sparql>progressionUS</sparql>

以下の結果が得られます。

<iframe>progressionUS</iframe>

## 地域別の感染者数の推移のグラフ

### 感染例の数

<sparql>graphCases</sparql>

結果は以下の通りになります。

<iframe>graphCases</iframe>

### 死者数

<sparql>graphDeaths</sparql>