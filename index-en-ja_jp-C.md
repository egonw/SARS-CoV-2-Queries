# SARS-CoV-2ウイルス及びパンデミックに関するWikidataのクエリ集

© 2020 Addshore, Daniel Mietchen, Egon Willighagen

編集者[Egon L. Willighagen](https://orcid.org/0000-0001-7542-0286)

ライセンス[CC-BY-SA 4.0 International](https://creativecommons.org/licenses/by-sa/4.0/)

本文書は原則Markdown形式で書かれています。このプロジェクトは[Maulik Kamdarのツイート](https://twitter.com/maulikkamdar/status/1239599404098740225)を受けて始まり、願わくは[Wikidata:WikiProject COVID-19](https://www.wikidata.org/wiki/Wikidata:WikiProject_COVID-19)に貢献したいと思っています。ご希望、ご意見、プルリクエストは[こちらのGitHubレポジトリ](https://github.com/egonw/SARS-CoV-2-Queries/)までお願いします。本取り組みを評価していただける場合は、本レポジトリにスターをつけて下さい!本文書自体はCC-BY-SAですが、書かれている全てのSPARQLクエリは[CC0、ライセンス放棄](https://creativecommons.org/share-your-work/public-domain/cc0/)です。

## 目次

1. [導入](intro.md)<br />
1.1.[トピックに注釈をつける](intro.md#adding-missing-topic-annotation)<br />
1.2.[他の注釈](intro.md#other-annotation)<br />
1.3.[Wikidataのコンテンツモデルを作る](intro.md#modelling-the-content-in-wikidata)<br />
2. [ウイルス](viruses.md)<br />
2.1.[全てのSARSrウイルス](viruses.md#all-sarsr-viruses)<br />
2.2.[ヒトに感染する7つのコロナウイルス](viruses.md#the-seven-coronaviruses-that-infect-human)<br />
2.3.[全てのベータコロナウイルス](viruses.md#all-betacoronaviruses)<br />
2.4.[全てのコロナウイルス](viruses.md#all-coronaviruses)<br />
2.5.[ヒトに感染する7つのコロナウイルス](viruses.md#the-seven-coronaviruses-that-infect-human)<br />
2.5.1.[ウイルスを比較する](viruses.md#comparing-viruses)<br />
2.6.[NCBI Taxonomy IDs](viruses.md#ncbi-taxonomy-ids)<br />
3. [COVID-19](covid.md)<br />
3.1.症状<br />
3.2.[臨床試験](covid.md#clinical-trials)<br />
4. [パンデミック](pandemic.md)<br />
4.1.[ウイルスの<topic>感染</topic>](pandemic.md#virus-<topic>transmission</topic>)<br />
4.2.[進展](pandemic.md#progression)<br />
4.3.[地域レベルでの進展](pandemic.md#regional-progression)<br />
4.3.1.[オランダでの進展](pandemic.md#progression-in-the-netherlands)<br />
4.3.2.[イタリアでの進展](pandemic.md#progression-in-italy)<br />
4.3.3.[米国での進展](pandemic.md#progression-in-the-usa)<br />
4.4.[地域レベルでの進展状況グラフ](pandemic.md#graphed-regional-progression)<br />
4.4.1.[症例](pandemic.md#cases)<br />
4.4.2.[死亡](pandemic.md#deaths)<br />
5. [ゲノム、遺伝子、タンパク質](genes.md)<br />
5.1.[ゲノム](genes.md#genomes)<br />
5.2.[SARS-CoV-2](genes.md#sars-cov-2)<br />
5.2.1.[遺伝子](genes.md#genes)<br />
5.2.2.[タンパク質](genes.md#proteins)<br />
5.3.[全てのSARSrウイルス](genes.md#all-sarsr-viruses)<br />
5.3.1.[全てのSARSr遺伝子](genes.md#all-sarsr-genes)<br />
5.3.2.[全てのSARSrタンパク質](genes.md#all-sarsr-proteins)<br />
5.4.[ヒトの全てのコロナウイルス](genes.md#all-human-coronaviruses)<br />
5.4.1.[全てのHCoV遺伝子](genes.md#all-hcov-genes)<br />
5.4.2.[全てのHCoVタンパク質](genes.md#all-hcov-proteins)<br />
6. [ヒト](human.md)<br />
6.1.[遺伝子とタンパク質の相互作用](human.md#interacting-genes-and-proteins)<br />
6.2.[生物学的なプロセス](human.md#biological-processes)<br />
7. [解決に向けて](solution.md)<br />
7.1.[抗体](solution.md#antibodies)<br />
7.2.[薬の再利用](solution.md#drug-repurposing)<br />
8. 文献<br />
8.1. [SARS-CoV-2について](literature.md#about-sars-cov-2)<br />
8.1.1. [SARS-CoV-2遺伝子について](literature.md#about-sars-cov-2-genes)<br />
8.1.2. [SARS-CoV-2タンパク質について](literature.md#about-sars-cov-2-proteins)<br />
8.2. [コロナウイルスについて](literature.md#about-coronaviruses)<br />
8.2.1. [ヒトコロナウイルスについて](literature.md#about-human-coronaviruses)<br />

[索引](indexList.md)<br />

## 著者と貢献者

* Addshore
* Daniel Mietchen
* Egon Willighagen

