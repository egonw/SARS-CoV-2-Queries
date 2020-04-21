# COVID-19

<topic>COVID-19</topic>は<topic>SARS-CoV-2</topic>ウイルスにより引き起こされる疾患です。
本章ではこの疾患に関する情報を提供します。

## 症状

次のクエリは症状をリストアップしますが、COVID-19に関するWikidataの項目で示されている情報の出所や症状の頻度を各自が十分に確認するべきです。

とはいえ、大雑把な症状の概要は次のクエリで得られます。

<sparql>symptoms</sparql>

これらの症状をリストアップします。

<out>symptoms</out>

<section level="##" label="trials">臨床試験</section>

完全ではないにしろ、<topic>臨床試験</topic>は<topic>clinicaltrials.gov</topic>に登録されており、Wikidataに収められつつあります。
次のクエリはCOVID-19が主要な課題である臨床試験の事例数を取得します。

<sparql>clinicalTrials</sparql>

この結果は非常の大きいので、上記のリンクの一つをクリックして、その結果を取得してください。