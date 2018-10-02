
package com.br.rbcapital.detalhe.portlet;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idEmpresaPrestadora",
    "idPassivoOperacao",
    "idTipoServicoPrestado",
    "empresaPrestadora"
})
public class CoordenadorLider {

    @JsonProperty("idEmpresaPrestadora")
    private int idEmpresaPrestadora;
    @JsonProperty("idPassivoOperacao")
    private int idPassivoOperacao;
    @JsonProperty("idTipoServicoPrestado")
    private int idTipoServicoPrestado;
    @JsonProperty("empresaPrestadora")
    private EmpresaPrestadora empresaPrestadora;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idEmpresaPrestadora")
    public int getIdEmpresaPrestadora() {
        return idEmpresaPrestadora;
    }

    @JsonProperty("idEmpresaPrestadora")
    public void setIdEmpresaPrestadora(int idEmpresaPrestadora) {
        this.idEmpresaPrestadora = idEmpresaPrestadora;
    }

    @JsonProperty("idPassivoOperacao")
    public int getIdPassivoOperacao() {
        return idPassivoOperacao;
    }

    @JsonProperty("idPassivoOperacao")
    public void setIdPassivoOperacao(int idPassivoOperacao) {
        this.idPassivoOperacao = idPassivoOperacao;
    }

    @JsonProperty("idTipoServicoPrestado")
    public int getIdTipoServicoPrestado() {
        return idTipoServicoPrestado;
    }

    @JsonProperty("idTipoServicoPrestado")
    public void setIdTipoServicoPrestado(int idTipoServicoPrestado) {
        this.idTipoServicoPrestado = idTipoServicoPrestado;
    }

    @JsonProperty("empresaPrestadora")
    public EmpresaPrestadora getEmpresaPrestadora() {
        return empresaPrestadora;
    }

    @JsonProperty("empresaPrestadora")
    public void setEmpresaPrestadora(EmpresaPrestadora empresaPrestadora) {
        this.empresaPrestadora = empresaPrestadora;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
