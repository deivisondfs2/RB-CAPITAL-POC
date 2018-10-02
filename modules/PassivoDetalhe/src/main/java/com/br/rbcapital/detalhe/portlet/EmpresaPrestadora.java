
package com.br.rbcapital.detalhe.portlet;

import java.util.HashMap;
import java.util.List;
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
    "cnpj",
    "nomeSimplificado",
    "razaoSocial",
    "tiposServicoPrestadoEmpresa"
})
public class EmpresaPrestadora {

    @JsonProperty("id")
    private int id;
    @JsonProperty("cnpj")
    private String cnpj;
    @JsonProperty("nomeSimplificado")
    private String nomeSimplificado;
    @JsonProperty("razaoSocial")
    private String razaoSocial;
    @JsonProperty("tiposServicoPrestadoEmpresa")
    private List<Object> tiposServicoPrestadoEmpresa = null;
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

    @JsonProperty("cnpj")
    public String getCnpj() {
        return cnpj;
    }

    @JsonProperty("cnpj")
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @JsonProperty("nomeSimplificado")
    public String getNomeSimplificado() {
        return nomeSimplificado;
    }

    @JsonProperty("nomeSimplificado")
    public void setNomeSimplificado(String nomeSimplificado) {
        this.nomeSimplificado = nomeSimplificado;
    }

    @JsonProperty("razaoSocial")
    public String getRazaoSocial() {
        return razaoSocial;
    }

    @JsonProperty("razaoSocial")
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @JsonProperty("tiposServicoPrestadoEmpresa")
    public List<Object> getTiposServicoPrestadoEmpresa() {
        return tiposServicoPrestadoEmpresa;
    }

    @JsonProperty("tiposServicoPrestadoEmpresa")
    public void setTiposServicoPrestadoEmpresa(List<Object> tiposServicoPrestadoEmpresa) {
        this.tiposServicoPrestadoEmpresa = tiposServicoPrestadoEmpresa;
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
