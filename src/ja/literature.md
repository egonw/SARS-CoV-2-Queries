# 文献

これらのクエリはいくつかの課題に関する最新10件分の<topic>記事</topic>を取得します。これは、 [Scholia](https://tools.wmflabs.org/scholia/) [<cite>Q63433973</cite>]とは異なります。Scholiaは特定の課題について遥かに豊かな<topic>文献</topic>の概要が得られます。各節ではScholiaへのリンクを含めています。ここでのクエリはとても基本的なもので、「主題」プロパティのみを利用します。

## SARS-CoV-2について

[SARS-CoV-2](https://tools.wmflabs.org/scholia/topic/Q82069695)がこのウイルスの名前です。

<sparql>litSARSCoV2</sparql>

結果として10件の論文を得ます。

<out limit="10">litSARSCoV2</out>

### SARS-CoV-2遺伝子について

遺伝子についても文献を検索できます。

<sparql>litSARSCoV2Genes</sparql>

これにより、現在以下の結果を得ます。

<out limit="10">litSARSCoV2Genes</out>

### SARS-CoV-2タンパク質について

そしてウイルスタンパク質について

<sparql>litSARSCoV2Proteins</sparql>

結果は現在、以下の通りです。

<out limit="10">litSARSCoV2Proteins</out>

## コロナウイルスについて

<xref>viruses</xref>章で概説した通り、SARS-Cov-2はヒトに感染するコロナウイルスの一つです。

<sparql>litCoronaviruses</sparql>

次の10件を取得できます。

<out limit="10">litCoronaviruses</out>

### ヒトのコロナウイルスについて

Wikidataには、7つのヒトコロナウイルスに関する記事が6千件以上あります。次のクエリは検索速度向上のために少し複雑になっています。また、得られる記事のリストが非常に長く、このページには表示しきれません。結果を見たい場合は、 `litHumanCoronaviruses.rq`ファイルとある部分の下をクリックしてください。

<sparql>litHumanCoronaviruses</sparql>

さらに、個々のウイルスに関する記事の数は非常にまちまちであり、このクエリでそれを可視化できます。

<sparql>litHumanCoronavirusesCounts</sparql>

以下の結果が得られます。

<out>litHumanCoronavirusesCounts</out>

#### そしてそれらの遺伝子です

<sparql>litHumanCoronavirusesGeneCounts</sparql>

以下の結果が得られます。

<out>litHumanCoronavirusesGeneCounts</out>

#### それから、他のタンパク質です

<sparql>litHumanCoronavirusesProteinCounts</sparql>

そして、以下のクエリでそれらを取得します。

<out>litHumanCoronavirusesProteinCounts</out>

## 参考文献

<references/>
