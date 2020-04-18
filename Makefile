SOURCES := $(shell find src -name "*.md")
TARGETS := $(shell find src -name "*.md" | sed -e 's/src/docs/' | sed -e 's/\.i//')
METAS := references.dat toc.txt indexList.i.md sections.txt

SUBDIRS := sparql

all: ${SUBDIRS} ${METAS} ${TARGETS} docs/index.md
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
	@groovy findTopics.groovy src | sort > topics.tsv

references.qids: findCitations.groovy
	@echo "Finding the citations"
	@groovy findCitations.groovy src | grep "^Q" | sort | uniq > references.qids

references.dat: references.qids references.js
	@nodejs references.js

docs/%.md : src/%.i.md createMarkdown.groovy
	@echo "Creating $@"
	@groovy createMarkdown.groovy $< > $@

