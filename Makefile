SOURCES := intro.i.md index.i.md
TARGETS := intro.md indexList.md
METAS := references.dat toc.txt indexList.i.md sections.txt

SUBDIRS := sparql

all: ${SUBDIRS} ${METAS} ${TARGETS} index.md
	@mv ${TARGETS} docs/
	@cp sparql/*.code.md docs/sparql/

sections.txt: order.txt ${SOURCES}
	@echo "Indexing the sections"
	@groovy findSections.groovy > sections.txt

toc.txt: makeToC.groovy order.txt ${SOURCES}
	@echo "Making the ToC"
	@groovy makeToC.groovy > toc.txt

indexList.i.md: topics.tsv makeIndex.groovy
	@echo "Making the index"
	@groovy makeIndex.groovy > indexList.i.md

topics.tsv: ${SOURCES} findTopics.groovy
	@echo "Extracting the topics"
	@groovy findTopics.groovy . | sort > topics.tsv

references.qids: findCitations.groovy
	@echo "Finding the citations"
	@groovy findCitations.groovy . | grep "^Q" | sort | uniq > references.qids

references.dat: references.qids references.js
	@nodejs references.js

index.md: index.i.md toc.txt createMarkdown.groovy
	@echo "Creating $@"
	@groovy createMarkdown.groovy index.i.md > docs/index.md

%.md : %.i.md createMarkdown.groovy
	@echo "Creating $@"
	@groovy createMarkdown.groovy $< > $@

