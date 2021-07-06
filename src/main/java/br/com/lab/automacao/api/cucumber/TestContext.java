package br.com.lab.automacao.api.cucumber;

import br.com.lab.automacao.api.model.MeteorologiaApi;
import br.com.six2six.fixturefactory.Fixture;
import io.restassured.response.ValidatableResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestContext {


    private static TestContext testContext = new TestContext();
    private ValidatableResponse jsonRetorno;
    private MeteorologiaApi requestModel;

    public void cidadeBase(String cidade){
        requestModel = Fixture.from(MeteorologiaApi.class).gimme(cidade);
    }

    public static TestContext getInstance(){
        if(testContext == null){
            testContext = new TestContext();
        }

        return testContext;
    }

}

