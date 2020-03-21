CODEFILES: \
 $(shell groovy ../findScripts.groovy .. .out)

.PRECIOUS: %.java %.groovy

all: allScriptsCompiled

distclean: clean
	@rm -f *.md *.out

clean:
	@rm -f *~ allScriptsCompiled

allScriptsCompiled: ${CODEFILES}
	@touch allScriptsCompiled

%.out: %.rq md.*.template preprocess postprocess
	@echo "doing $@ ..."
	@groovy preprocess $< > $@
	@groovy postprocess $<
