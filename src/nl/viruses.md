<section level="#" label="viruses">Virussen</section>

Coronavirussen zijn niet nieuw en sommige zijn niet echt gevaarlijk.
De menselijke coronavirusen HCoV-229E en HCoV-OC42 veroorzaken namelijk
normaal alleen een verkoudheid [<cite>Q36641750</cite>]. Echter, voor
de 
<topic>severe acute respiratory syndrome-gerelateerde coronavirussen</topic> (<topic>SARSr virussen</topic>)
is dat anders. Want SARS-CoV-2 is het hoofdonderwerp van dit boek.

## Alle SARS-gerelateerde virussen

Het <topic>SARS-CoV-2</topic> <topic>virus</topic> is niet het eerste <topic>coronavirus</topic> (CoV). Er zijn
namelijk behoorlijk veel SARS-gerelateerde CoVs bekend, zoals duidelijk is in
[deze NCBI Taxonomy lijst](https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?mode=Undef&id=694009&lvl=3&keep=1&srchmode=1&unlock).

Laten we eerste alle SARSr-CoV virussen in Wikidata opzoeken:

<sparql>allSARSCoVViruses</sparql>

Dit geeft ons:

<out>allSARSCoVViruses</out>

Als we dit vergelijken met de lijst in Sectie <xref>sevenhuman</xref>, dan zien we dat
deze twee lijsten niet helemaal overlappen.

<section level="##" label="sevenhuman">De zeven coronavirusen die mensen infecteren</section>

Maar voor de huidige pandemie zijn deze zeven menselijke coronavirusen relevanter [<cite>Q86729469</cite>].
We kunnen de volgende zoekopdracht gebruiken om alleen deze te laten zien:

<sparql>humanCoronaviruses</sparql>

Dat geeft ons een goed startpunt om het virus in meer detail te bekijken:

<out>humanCoronaviruses</out>

## Alle betacoronavirusen

Maar de SARS-gerelateerde coronevirussen zijn maar een mogelijke subgroep. Een andere groep is die van de betacoronavirusen:

<sparql>allBetacoronaViruses</sparql>

Omdat Wikidata behoorlijk veel van deze virussen beschrijft, kunnen we beter een netwerkvisualisaite maken:

<sparql>allBetacoronaVirusesGraph</sparql>

Dat geeft dit:

<iframe>allBetacoronaVirusesGraph</iframe>

## Alle coronavirusen

De volledige lijst van alle coronavirusen kunnen we opvragen met deze zoekopdracht:

<sparql>allCoronaViruses</sparql>

Opnieuw, deze visualiseren we liever als een netwerk:

<sparql>allCoronaVirusesGraph</sparql>

Dat geeft deze uitkomsten:

<iframe>allCoronaVirusesGraph</iframe>

### Virussen vergelijken

We kunnen ook artikelen opvragen die menselijke coronavirussen vergelijken met andere coronavirussen:

<sparql>compareViruses</sparql>

## NCBI Taxonomie nummers

Voor de coronavirussen kunnen we ook de <topic>NCBI Taxonomie</topic> [<cite>Q28740981</cite>] nummers opvragen met:

<sparql>allSARSCoVVirusesTaxonomy</sparql>

Dat geeft:

<out>allSARSCoVVirusesTaxonomy</out>

## Bronnen

<references/>

