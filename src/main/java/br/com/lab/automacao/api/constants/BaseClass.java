package br.com.lab.automacao.api.constants;

import br.com.lab.automacao.api.cucumber.TestContext;
import br.com.lab.automacao.api.model.MeteorologiaApi;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import lombok.Getter;
import lombok.Setter;
import org.junit.BeforeClass;

public class BaseClass {

    private static TestContext testContext =  TestContext.getInstance();

    @BeforeClass
    public static void setUp() {
        FixtureFactoryLoader.loadTemplates("src/main/java/br/com/lab/automacao/api/fixture");
        //testContext.cidadeBase("Itapira");
    }
}
