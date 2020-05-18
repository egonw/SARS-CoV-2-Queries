<section level="#" label="viruses">ウイルス</section>

コロナウイルスは新しいものではなく、その仲間には全く危険ではないものもあります。
たとえば、ヒトコロナウイルスHCoV-229EおよびHCoV-OC43は通常よくある風邪[<cite>1Q366417501</cite>]を引き起こします。しかし、<topic>重症急性呼吸器症候群に関連するコロナウイルス</topic>（<topic>SARSrウイルス</topic>）は異なります。そしてSRAS-CoV-2が本文書[<cite>Q87000965</cite>]のメイントピックです。

## 全てのSARSrウイルス

<topic>SARS-CoV-2</topic><topic>ウイルス</topic>は最初の<topic>コロナウイルス</topic>(CoV)ではありません。
実は、非常に多くのSARS関連CoVが知られています。
それは、この[NCBI Taxonomyリスト](https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?mode=Undef&id=694009&lvl=3&keep=1&srchmode=1&unlock)を見れば明らかです。

それでは最初にWikidataに収められている全てのSARSr-CoVウイルスをリストアップしてみましょう。

<sparql>allSARSCoVViruses</sparql>

結果は以下の通りになります。

<out>allSARSCoVViruses</out>

この結果を<xref>sevenhuman</xref>章の結果と比較すれば、それらが完全には一致しないことが分かります。

<section level="##" label="sevenhuman">ヒトに感染する7つのコロナウイルス</section>

しかし、現在のパンデミックにおいては、7つのヒトコロナウイルスが特に関心を集めるでしょう[<cite>Q86729469</cite>]。
以下のクエリでこれらだけを取得できます。

<sparql>humanCoronaviruses</sparql>

より詳しくこれらのウイルスについて研究を始める際にこの結果は役立つことでしょう。

<out>humanCoronaviruses</out>

## 全てのベータコロナウイルス

しかし、SARS関連のコロナウイルスは一つのサブグループに過ぎず、もう一つのコロナウイルスのサブグループとしてベータコロナウイルスがあります。

<sparql>allBetacoronaViruses</sparql>

Wikidataには非常に多くのメンバーが収められているので、グラフを用いてそれを可視化しましょう。

<sparql>allBetacoronaVirusesGraph</sparql>

結果は以下の通りです。

<iframe>allBetacoronaVirusesGraph</iframe>

## 全てのコロナウイルス

全てのコロナウイルスのリストはこのようになります。

<sparql>allCoronaViruses</sparql>

再び、グラフを用いて可視化します。

<sparql>allCoronaVirusesGraph</sparql>

結果は以下の通りです。

<iframe>allCoronaVirusesGraph</iframe>

### ウイルスを比較する

ヒトコロナウイルスと、他のコロナウイルスを比較研究している論文を取得します。

<sparql>compareViruses</sparql>

## NCBI Taxonomy IDs

コロナウイルスについて、<topic>NCBI Taxonomy</topic> [<cite>Q28740981</cite>]識別子のリストを取得します。

<sparql>allSARSCoVVirusesTaxonomy</sparql>

結果は以下の通りです。

<out>allSARSCoVVirusesTaxonomy</out>

## 参考文献

<references/>
