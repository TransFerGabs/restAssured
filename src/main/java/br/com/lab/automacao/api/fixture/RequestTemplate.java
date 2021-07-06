package br.com.lab.automacao.api.fixture;

import br.com.lab.automacao.api.model.MeteorologiaApi;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class RequestTemplate implements TemplateLoader {

    public void load() {
        Fixture.of(MeteorologiaApi.class)
                .addTemplate("Itapira",
                        beneficiarioRequest("Itapira", "SP", "BR"))
                .addTemplate("Cascavel",
                        beneficiarioRequest("Cascavel", "SC", "BR"))
        ;
    }

    public Rule beneficiarioRequest(final String cidade, final String estado, final String pais
                                    ) {
        return new Rule() {
            {
                add("cidade", cidade);
                add("estado", estado);
                add("pais", pais);
                add("idiomaRetorno", "pt_br");

            }

        };
    }
}
