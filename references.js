const fs = require('fs').promises;

const Cite = require('citation-js');

(async function () {
  const file = await fs.readFile('references.qids', 'utf8')
  const data = Array.from(await Cite.async(file))
    .map(item => item.id + '=' + Cite(item).format('bibliography', {
      template: 'vancouver',
      append: function (entry) {
        return entry.DOI
          ? ' doi:[' + entry.DOI + '](https://doi.org/' + entry.DOI + ')' +
            ' ([Scholia](https://scholia.toolforge.org/doi/' + entry.DOI + "))"
          : '';
      }
    }))
  await fs.writeFile('references.dat', data.join(''))
})().catch(console.error)
