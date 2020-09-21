LANGS ?= en nl ja es pt

CODEFILES: \
 $(shell groovy ../findScripts.groovy ../src .en.out | sort | uniq)

.PRECIOUS: %.java %.groovy

all: allScriptsCompiled

distclean: clean
	@rm -f *.md *.out

clean:
	@rm -f *~ allScriptsCompiled

allScriptsCompiled: ${CODEFILES}
	@touch allScriptsCompiled

%.en.out: %.rq md.*.template
	@echo -n "doing $@ ... "
	@for lang in $(LANGS) ; do \
		echo -n "$$lang " ; \
		groovy preprocess $< $$lang > `echo "$@" | sed s/.en.out/.$$lang.out/` ; \
		groovy postprocess $< $$lang ; \
	done
	@groovy createGrlc.groovy $< "$(LANGS)" > ../grlc/$<
	@echo ""
