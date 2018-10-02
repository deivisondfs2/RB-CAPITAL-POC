
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
    "errors",
    "warnings",
    "infos",
    "hasFatalError"
})
public class Messages {

    @JsonProperty("errors")
    private List<Object> errors = null;
    @JsonProperty("warnings")
    private List<Object> warnings = null;
    @JsonProperty("infos")
    private List<Object> infos = null;
    @JsonProperty("hasFatalError")
    private boolean hasFatalError;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("errors")
    public List<Object> getErrors() {
        return errors;
    }

    @JsonProperty("errors")
    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    @JsonProperty("warnings")
    public List<Object> getWarnings() {
        return warnings;
    }

    @JsonProperty("warnings")
    public void setWarnings(List<Object> warnings) {
        this.warnings = warnings;
    }

    @JsonProperty("infos")
    public List<Object> getInfos() {
        return infos;
    }

    @JsonProperty("infos")
    public void setInfos(List<Object> infos) {
        this.infos = infos;
    }

    @JsonProperty("hasFatalError")
    public boolean isHasFatalError() {
        return hasFatalError;
    }

    @JsonProperty("hasFatalError")
    public void setHasFatalError(boolean hasFatalError) {
        this.hasFatalError = hasFatalError;
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
