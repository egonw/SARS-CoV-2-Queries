# ヒト

## 遺伝子とタンパク質の相互作用

CoV粒子の働きによる生体内の作用を理解するためには、どのヒト遺伝子およびタンパク質が関わっているのかを知る必要があります。これは次の節のためですが、まずはどの文献で述べられているのかここで調べましょう（アノテーションは依然として限られています）。

<sparql>humanInteractionCounts</sparql>

このクエリにより、これらの文献が得られます。

<out>humanInteractionCounts</out>

特定の論文群（増え続けるリスト）を見たい場合は、このクエリを試しましょう。

<sparql>humanInteractions</sparql>

## 生体内の作用

[WikiPathways](https://wikipathways.org/) [<cite>Q42896569</cite>]は、国際的な[#covidpathways COVID-19 curation effort](https://covid.pages.uni.lu/map_curation)に参加するプロジェクトです。当該プロジェクトに加わる人々は[このポータルサイト](http://covid.wikipathways.org/)で確認できます。

[Reactome](http://reactome.org/) [<cite>Q24567743</cite>]とWikiPathwaysのパスウェイはWikidataに索引付されており、HCoV遺伝子およびタンパク質が関わるパスウェイを取得できます。

<sparql>pathways</sparql>

現在、次のパスウェイが得られますが、活発なキュレーション活動により、次々に増えていくと期待できます。

<out>pathways</out>

## 参考文献

<references/>
