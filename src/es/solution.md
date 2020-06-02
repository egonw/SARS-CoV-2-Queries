# Hacia una solución

Actualmente no existe una solución para el SARS-CoV-2.

Pero hay ideas sobre qué soluciones podrían ser. Una vacuna es una de ellas, pero su desarrollo lleva tiempo [<cite>Q87461271</cite>]. Pero también se habla de anticuerpos y reutilización de drogas. Todo esto es muy exploratorio en este momento. Los ensayos clínicos son importantes (consulte la sección [Ensayos clínicos](https://egonw.github.io/SARS-CoV-2-Queries/es/covid.html#clinical-trials)).

Este capítulo muestra una serie de consultas con información en Wikidata sobre clientes potenciales que las personas han propuesto que pueden conducir a una solución.

## Anticuerpos

Los anticuerpos están ganando interés. La siguiente consulta enumera artículos sobre los coronavirus humanos y también anotados con el término '<topic>anticuerpo</topic>':

<sparql>antibodies</sparql>

Se debe enfatizar que los anticuerpos son específicos para cada proteína y cada coronavirus tiene proteínas diferentes, y esta lista es solo para incluir en la literatura relevante para leer, no para sacar conclusiones de:

<out limit="15">antibodies</out>

## Reutilización de drogas

La sección <xref>ensayos</xref> ya incluía una descripción general de los ensayos clínicos.
Este da una idea de los síntomas que preocupan a las personas. También proporciona información sobre qué <topic>medicamentos</topic> se estudian para la <topic>reutilización</topic>.
Algunos de estos han recibido mucha atención, otros menos.

La siguiente consulta enumera el número de ensayos clínicos por <topic>intervención</topic>:

<sparql>clinicalTrialsByIntervention</sparql>

Esto da:

<out limit="15">clinicalTrialsByIntervention</out>

Es importante destacar que esta lista solo da una idea de qué intervención ha recibido más atención que otras. Y es esencial darse cuenta de que la atención no es una medida de éxito.

## Referencias

<references/>

