# SARS-CoV-2ウイルス及びパンデミックに関するWikidataのクエリ集

© 2020 Addshore, Daniel Mietchen, Egon Willighagen

編集者[Egon L. Willighagen](https://orcid.org/0000-0001-7542-0286)

ライセンス[CC-BY-SA 4.0 International](https://creativecommons.org/licenses/by-sa/4.0/)

本文書はMarkdown形式で書かれています。このプロジェクトは[Maulik Kamdarのツイート](https://twitter.com/maulikkamdar/status/1239599404098740225)を受けて始まり、願わくは[Wikidata:WikiProject COVID-19](https://www.wikidata.org/wiki/Wikidata:WikiProject_COVID-19)に貢献したいと思っています。ご希望、ご意見、プルリクエストは[こちらのGitHubレポジトリ](https://github.com/egonw/SARS-CoV-2-Queries/)までお願いします。本取り組みを評価していただける場合は、本レポジトリにスターをつけて下さい!本文書自体はCC-BY-SAですが、書かれている全てのSPARQLクエリは[CC0、ライセンス放棄](https://creativecommons.org/share-your-work/public-domain/cc0/)です。

## 目次

1. [導入](intro.md) <br />
1.1. [トピックに新たに注釈をつける](intro.md#トピックに新たに注釈をつける) <br />
1.2. [他の注釈](intro.md#他の注釈) <br />
1.3. [参考文献](intro.md#参考文献) <br />
2. [ウイルス](viruses.md) <br />
2.1. [全てのSARSrウイルス](viruses.md#全てのsarsrウイルス) <br />
2.2. [ヒトに感染する7つのコロナウイルス](viruses.md#ヒトに感染する7つのコロナウイルス) <br />
2.3. [全てのベータコロナウイルス](viruses.md#全てのベータコロナウイルス) <br />
2.4. [全てのコロナウイルス](viruses.md#全てのコロナウイルス) <br />
2.4.1. [ウイルスを比較する](viruses.md#ウイルスを比較する) <br />
2.5. [NCBI Taxonomy IDs](viruses.md#ncbi-taxonomy-ids) <br />
2.6. [参考文献](viruses.md#参考文献) <br />
3. [COVID-19](covid.md) <br />
3.1. [症状](covid.md#症状) <br />
3.2. [臨床試験](covid.md#臨床試験) <br />
4. [パンデミック](pandemic.md) <br />
4.1. [ウイルスの<topic>感染</topic>](pandemic.md#ウイルスの<topic>感染</topic>) <br />
4.2. [推移](pandemic.md#推移) <br />
4.3. [地域別の感染者数の推移](pandemic.md#地域別の感染者数の推移) <br />
4.3.1. [オランダでの感染者数の推移](pandemic.md#オランダでの感染者数の推移) <br />
4.3.2. [イタリアでの感染者数の推移](pandemic.md#イタリアでの感染者数の推移) <br />
4.3.3. [アメリカ合衆国での推移](pandemic.md#アメリカ合衆国での推移) <br />
4.4. [地域別の感染者数の推移のグラフ](pandemic.md#地域別の感染者数の推移のグラフ) <br />
4.4.1. [感染例の数](pandemic.md#感染例の数) <br />
4.4.2. [死者数](pandemic.md#死者数) <br />
5. [ゲノム、遺伝子、タンパク質](genes.md) <br />
5.1. [ゲノム](genes.md#ゲノム) <br />
5.2. [SARS-CoV-2](genes.md#sars-cov-2) <br />
5.2.1. [遺伝子](genes.md#遺伝子) <br />
5.2.2. [タンパク質](genes.md#タンパク質) <br />
5.2.3. [タンパク質複合体](genes.md#タンパク質複合体) <br />
5.3. [全てのSARSrウイルス](genes.md#全てのsarsrウイルス) <br />
5.3.1. [全てのSARSr遺伝子](genes.md#全てのsarsr遺伝子) <br />
5.3.2. [全てのSARSrタンパク質](genes.md#全てのsarsrタンパク質) <br />
5.4. [全てのヒトコロナウイルス](genes.md#全てのヒトコロナウイルス) <br />
5.4.1. [全てのHCoV遺伝子](genes.md#全てのhcov遺伝子) <br />
5.4.2. [全てのHCoVタンパク質](genes.md#全てのhcovタンパク質) <br />
5.5. [参考文献](genes.md#参考文献) <br />
6. [ヒト](human.md) <br />
6.1. [遺伝子とタンパク質の相互作用](human.md#遺伝子とタンパク質の相互作用) <br />
6.2. [生体内の作用](human.md#生体内の作用) <br />
6.3. [参考文献](human.md#参考文献) <br />
7. [解決に向けて](solution.md) <br />
7.1. [抗体](solution.md#抗体) <br />
7.2. [既存薬再開発](solution.md#既存薬再開発) <br />
7.3. [参考文献](solution.md#参考文献) <br />
8. [文献](literature.md) <br />
8.1. [SARS-CoV-2について](literature.md#sars-cov-2について) <br />
8.1.1. [SARS-CoV-2遺伝子について](literature.md#sars-cov-2遺伝子について) <br />
8.1.2. [SARS-CoV-2タンパク質について](literature.md#sars-cov-2タンパク質について) <br />
8.2. [コロナウイルスについて](literature.md#コロナウイルスについて) <br />
8.2.1. [ヒトのコロナウイルスについて](literature.md#ヒトのコロナウイルスについて) <br />
8.3. [参考文献](literature.md#参考文献) <br />

[索引](indexList.md) <br />

## 著者と貢献者

* Addshore
* Daniel Mietchen
* Egon Willighagen

## 翻訳

* [日本語](https://egonw.github.io/SARS-CoV-2-Queries/ja/) by Yayamamo

