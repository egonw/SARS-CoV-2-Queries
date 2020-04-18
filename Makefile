L10N := nl
LANGS := en ${L10N}

SOURCES := $(shell find src -name "*.md")
TARGETS := $(shell find src -name "*.md" | sed -e 's/src/docs/' )
METAS := references.dat toc.txt indexList.i.md sections.txt

SUBDIRS := sparql

all: ${SUBDIRS} ${METAS} ${TARGETS} docs/index.md
	@cp sparql/*.code.en.md docs/sparql
	@for lang in $(L10N) ; do \
		cp sparql/*.code.$$lang.md docs/$$lang/sparql ; \
	done
	@cp indexList.en.md docs/indexList.md
	@for lang in $(L10N) ; do \
		cp indexList.$$lang.md docs/$$lang/indexList.md ; \
	done

sections.txt: order.txt ${SOURCES}
	@echo "Indexing the sections"
	@groovy findSections.groovy > sections.txt

toc.txt: makeToC.groovy order.txt ${SOURCES}
	@echo -n "Making the ToC ... "
	@for lang in $(LANGS) ; do \
		echo -n "$$lang " ; \
		groovy makeToC.groovy $$lang > toc.$$lang.txt ; \
	done
	@echo ""
	@touch toc.txt

indexList.i.md: topics.tsv makeIndex.groovy
	@echo -n "Making the index ... "
	@for lang in $(LANGS) ; do \
		echo -n "$$lang " ; \
		groovy makeIndex.groovy $$lang > indexList.$$lang.md ; \
	done
	@echo ""
	@touch indexList.i.md

topics.tsv: ${SOURCES} findTopics.groovy
	@echo -n "Extracting the topics ... "
	@for lang in $(LANGS) ; do \
		echo -n "$$lang " ; \
		groovy findTopics.groovy src $$lang | sort > topics.$$lang.tsv ; \
	done
	@echo ""
	@touch topics.tsv

references.qids: findCitations.groovy
	@echo "Finding the citations"
	@groovy findCitations.groovy src | grep "^Q" | sort | uniq > references.qids

references.dat: references.qids references.js
	@nodejs references.js

docs/%.md : src/%.md createMarkdown.groovy
	@echo "Creating $@"
	@groovy createMarkdown.groovy $< en > $@

docs/%.md : src/%.md createMarkdown.groovy
	@echo "Creating $@ ... "
	groovy createMarkdown.groovy $< > $@
