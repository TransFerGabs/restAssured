package br.com.lab.automacao.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MeteorologiaApi {

    public String cidade;
    public String estado;
    public String pais;
    public String odCidade;
    public String idiomaRetorno;
}

