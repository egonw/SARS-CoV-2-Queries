L10N := nl ja es pt
LANGS ?= en ${L10N}

SOURCES := $(shell find src -name "*.md")
TARGETS := $(shell find src -name "*.md" | sed -e 's/src/docs/' )
METAS := references.dat toc.txt indexList.i.md sections.txt

SUBDIRS := sparql

all: ${SUBDIRS} ${METAS} ${TARGETS} docs/index.md docs/urlList.txt
	@cp sparql/*.code.en.md docs/sparql
	@rename.ul 'en.md' 'md' docs/sparql/*.md
	@for lang in $(L10N) ; do \
		cp sparql/*.code.$$lang.md docs/$$lang/sparql ; \
		rename.ul "$$lang.md" 'md' docs/$$lang/sparql/*.md ; \
	done
	@cp indexList.en.md docs/indexList.md
	@for lang in $(L10N) ; do \
		cp indexList.$$lang.md docs/$$lang/indexList.md ; \
	done

docs/urlList.txt: urlList.txt
	@sort urlList.txt | uniq > docs/urlList.txt

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

docs/%.md : src/%.md createMarkdown.groovy sparql/*.out
	@echo "Creating $@ ... "
	@groovy createMarkdown.groovy $< > $@
