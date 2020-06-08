const fs = require('fs');

const Cite = require('citation-js');

fs.readFile('references.qids', 'utf8', async function (err, file) {
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
  fs.writeFile('references.dat', data.join(''), function() {})
})
