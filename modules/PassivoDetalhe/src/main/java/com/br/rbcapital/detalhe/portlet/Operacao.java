
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
    "id",
    "idPassivoOperacao",
    "codigoRb",
    "dataInicioOperacao",
    "status",
    "dataUltimaAtualizacao"
})
public class Operacao {

    @JsonProperty("id")
    private int id;
    @JsonProperty("idPassivoOperacao")
    private int idPassivoOperacao;
    @JsonProperty("codigoRb")
    private String codigoRb;
    @JsonProperty("dataInicioOperacao")
    private String dataInicioOperacao;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("dataUltimaAtualizacao")
    private String dataUltimaAtualizacao;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("idPassivoOperacao")
    public int getIdPassivoOperacao() {
        return idPassivoOperacao;
    }

    @JsonProperty("idPassivoOperacao")
    public void setIdPassivoOperacao(int idPassivoOperacao) {
        this.idPassivoOperacao = idPassivoOperacao;
    }

    @JsonProperty("codigoRb")
    public String getCodigoRb() {
        return codigoRb;
    }

    @JsonProperty("codigoRb")
    public void setCodigoRb(String codigoRb) {
        this.codigoRb = codigoRb;
    }

    @JsonProperty("dataInicioOperacao")
    public String getDataInicioOperacao() {
        return dataInicioOperacao;
    }

    @JsonProperty("dataInicioOperacao")
    public void setDataInicioOperacao(String dataInicioOperacao) {
        this.dataInicioOperacao = dataInicioOperacao;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("dataUltimaAtualizacao")
    public String getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    @JsonProperty("dataUltimaAtualizacao")
    public void setDataUltimaAtualizacao(String dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
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
