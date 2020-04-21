# ゲノム、遺伝子、タンパク質

## ゲノム

おそらく最初の疑問は、どの<topic>ゲノム</topic>がSARS-CoV-2ウイルスに対して計測されているかでしょう。

<sparql>genomes</sparql>

このクエリで、これらのゲノムのURLが得られます。

<out>genomes</out>

## SARS-CoV-2

### 遺伝子

SARS-CoV-2の<topic>RNA</topic>は配列が得られているので、<topic>ORF</topic>が知られ、そして同定されています。Wikidataに収められている<topic>遺伝子</topic>の情報は以下のクエリで得られます。

<sparql>virusGenes</sparql>

以下の結果が得られます。

<out>virusGenes</out>

### タンパク質

あるいは、コロナウイルスの<topic>タンパク質</topic>に興味があるかもしれません。その場合は次のクエリで取得できます。

<sparql>virusProteins</sparql>

これらのタンパク質が得られます。

<out>virusProteins</out>

### タンパク質複合体

オンラインで開催された[2020年4月のBioHackathon](https://github.com/virtual-biohackathons/covid-19-bh20)に参加したチームによる作業のおかげで、[Complex Portal](https://www.ebi.ac.uk/complexportal/) [<cite>Q57793775</cite>]から得られる高分子の構造がWikidataに収められました。

<sparql>complexes</sparql>

これらの複合体をリストアップします。

<out>complexes</out>

#### PDBでの構造

タンパク質については、<topic>PDBでの構造</topic>[<cite>Q30491855</cite>]を取得できます。

<sparql>virusProteinsPDB</sparql>

以下の結果が得られます。

<out>virusProteinsPDB</out>

## 全てのSARSrウイルス

上記のクエリとよく似ていますが、全てのSARSrウイルスの全遺伝子と全タンパク質を次のクエリにより取得できます。

### 全てのSARSr遺伝子

以下のクエリで全ての遺伝子が得られます。

<sparql>virusGenesSARSr</sparql>

以下の結果が得られます。

<out>virusGenesSARSr</out>

### 全てのSARSrタンパク質

以下のクエリで全てのタンパク質が得られます。

<sparql>virusProteinsSARSr</sparql>

結果は以下の通りです。

<out>virusProteinsSARSr</out>

## 全てのヒトコロナウイルス

上記のクエリとよく似ていますが、全ての遺伝子とタンパク質を次のクエリにより取得できます。

### 全てのHCoV遺伝子

以下のクエリで全ての遺伝子が得られます。

<sparql>virusGenesAll</sparql>

結果は以下の通りです。

<out>virusGenesAll</out>

### 全てのHCoVタンパク質

以下のクエリで全てのタンパク質が得られます。

<sparql>virusProteinsAll</sparql>

結果は以下の通りです。

<out>virusProteinsAll</out>

## 参考文献

<references/>

