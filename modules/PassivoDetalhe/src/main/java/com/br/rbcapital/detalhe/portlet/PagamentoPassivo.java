
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
    "idPeriodicidadeAmortizacao",
    "idPeriodicidadePagamentoJuros",
    "idPeriodicidadeCorrecaoMonetaria",
    "idIndexadorCorrecaoMonetaria",
    "taxaSpread",
    "taxaSpreadCalculado",
    "remuneracaoFlutuante",
    "defasagemRemuneracaoFlutuante",
    "percentualRemuneracaoFlutuante",
    "percentualRemuneracaoFlutuanteCalculado",
    "mesesDefasagemIndexador",
    "formaPagamentoJuros",
    "dataPrimeiroPagamentoJuros",
    "dataPrimeiraAmortizacao",
    "formaAmortizacao",
    "indexadorCorrecaoMonetaria",
    "periodicidadeAmortizacao",
    "periodicidadeCorrecaoMonetaria",
    "periodicidadePagamentoJuros",
    "curvaPagamento",
    "mesAtualizacaoPagamento"
})
public class PagamentoPassivo {

    @JsonProperty("id")
    private int id;
    @JsonProperty("idPeriodicidadeAmortizacao")
    private int idPeriodicidadeAmortizacao;
    @JsonProperty("idPeriodicidadePagamentoJuros")
    private int idPeriodicidadePagamentoJuros;
    @JsonProperty("idPeriodicidadeCorrecaoMonetaria")
    private Object idPeriodicidadeCorrecaoMonetaria;
    @JsonProperty("idIndexadorCorrecaoMonetaria")
    private Object idIndexadorCorrecaoMonetaria;
    @JsonProperty("taxaSpread")
    private float taxaSpread;
    @JsonProperty("taxaSpreadCalculado")
    private float taxaSpreadCalculado;
    @JsonProperty("remuneracaoFlutuante")
    private RemuneracaoFlutuante remuneracaoFlutuante;
    @JsonProperty("defasagemRemuneracaoFlutuante")
    private Object defasagemRemuneracaoFlutuante;
    @JsonProperty("percentualRemuneracaoFlutuante")
    private Object percentualRemuneracaoFlutuante;
    @JsonProperty("percentualRemuneracaoFlutuanteCalculado")
    private Object percentualRemuneracaoFlutuanteCalculado;
    @JsonProperty("mesesDefasagemIndexador")
    private Object mesesDefasagemIndexador;
    @JsonProperty("formaPagamentoJuros")
    private FormaPagamentoJuros formaPagamentoJuros;
    @JsonProperty("dataPrimeiroPagamentoJuros")
    private String dataPrimeiroPagamentoJuros;
    @JsonProperty("dataPrimeiraAmortizacao")
    private String dataPrimeiraAmortizacao;
    @JsonProperty("formaAmortizacao")
    private FormaAmortizacao formaAmortizacao;
    @JsonProperty("indexadorCorrecaoMonetaria")
    private Object indexadorCorrecaoMonetaria;
    @JsonProperty("periodicidadeAmortizacao")
    private PeriodicidadeAmortizacao periodicidadeAmortizacao;
    @JsonProperty("periodicidadeCorrecaoMonetaria")
    private Object periodicidadeCorrecaoMonetaria;
    @JsonProperty("periodicidadePagamentoJuros")
    private PeriodicidadePagamentoJuros periodicidadePagamentoJuros;
    @JsonProperty("curvaPagamento")
    private List<Object> curvaPagamento = null;
    @JsonProperty("mesAtualizacaoPagamento")
    private List<Object> mesAtualizacaoPagamento = null;
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

    @JsonProperty("idPeriodicidadeAmortizacao")
    public int getIdPeriodicidadeAmortizacao() {
        return idPeriodicidadeAmortizacao;
    }

    @JsonProperty("idPeriodicidadeAmortizacao")
    public void setIdPeriodicidadeAmortizacao(int idPeriodicidadeAmortizacao) {
        this.idPeriodicidadeAmortizacao = idPeriodicidadeAmortizacao;
    }

    @JsonProperty("idPeriodicidadePagamentoJuros")
    public int getIdPeriodicidadePagamentoJuros() {
        return idPeriodicidadePagamentoJuros;
    }

    @JsonProperty("idPeriodicidadePagamentoJuros")
    public void setIdPeriodicidadePagamentoJuros(int idPeriodicidadePagamentoJuros) {
        this.idPeriodicidadePagamentoJuros = idPeriodicidadePagamentoJuros;
    }

    @JsonProperty("idPeriodicidadeCorrecaoMonetaria")
    public Object getIdPeriodicidadeCorrecaoMonetaria() {
        return idPeriodicidadeCorrecaoMonetaria;
    }

    @JsonProperty("idPeriodicidadeCorrecaoMonetaria")
    public void setIdPeriodicidadeCorrecaoMonetaria(Object idPeriodicidadeCorrecaoMonetaria) {
        this.idPeriodicidadeCorrecaoMonetaria = idPeriodicidadeCorrecaoMonetaria;
    }

    @JsonProperty("idIndexadorCorrecaoMonetaria")
    public Object getIdIndexadorCorrecaoMonetaria() {
        return idIndexadorCorrecaoMonetaria;
    }

    @JsonProperty("idIndexadorCorrecaoMonetaria")
    public void setIdIndexadorCorrecaoMonetaria(Object idIndexadorCorrecaoMonetaria) {
        this.idIndexadorCorrecaoMonetaria = idIndexadorCorrecaoMonetaria;
    }

    @JsonProperty("taxaSpread")
    public float getTaxaSpread() {
        return taxaSpread;
    }

    @JsonProperty("taxaSpread")
    public void setTaxaSpread(float taxaSpread) {
        this.taxaSpread = taxaSpread;
    }

    @JsonProperty("taxaSpreadCalculado")
    public float getTaxaSpreadCalculado() {
        return taxaSpreadCalculado;
    }

    @JsonProperty("taxaSpreadCalculado")
    public void setTaxaSpreadCalculado(float taxaSpreadCalculado) {
        this.taxaSpreadCalculado = taxaSpreadCalculado;
    }

    @JsonProperty("remuneracaoFlutuante")
    public RemuneracaoFlutuante getRemuneracaoFlutuante() {
        return remuneracaoFlutuante;
    }

    @JsonProperty("remuneracaoFlutuante")
    public void setRemuneracaoFlutuante(RemuneracaoFlutuante remuneracaoFlutuante) {
        this.remuneracaoFlutuante = remuneracaoFlutuante;
    }

    @JsonProperty("defasagemRemuneracaoFlutuante")
    public Object getDefasagemRemuneracaoFlutuante() {
        return defasagemRemuneracaoFlutuante;
    }

    @JsonProperty("defasagemRemuneracaoFlutuante")
    public void setDefasagemRemuneracaoFlutuante(Object defasagemRemuneracaoFlutuante) {
        this.defasagemRemuneracaoFlutuante = defasagemRemuneracaoFlutuante;
    }

    @JsonProperty("percentualRemuneracaoFlutuante")
    public Object getPercentualRemuneracaoFlutuante() {
        return percentualRemuneracaoFlutuante;
    }

    @JsonProperty("percentualRemuneracaoFlutuante")
    public void setPercentualRemuneracaoFlutuante(Object percentualRemuneracaoFlutuante) {
        this.percentualRemuneracaoFlutuante = percentualRemuneracaoFlutuante;
    }

    @JsonProperty("percentualRemuneracaoFlutuanteCalculado")
    public Object getPercentualRemuneracaoFlutuanteCalculado() {
        return percentualRemuneracaoFlutuanteCalculado;
    }

    @JsonProperty("percentualRemuneracaoFlutuanteCalculado")
    public void setPercentualRemuneracaoFlutuanteCalculado(Object percentualRemuneracaoFlutuanteCalculado) {
        this.percentualRemuneracaoFlutuanteCalculado = percentualRemuneracaoFlutuanteCalculado;
    }

    @JsonProperty("mesesDefasagemIndexador")
    public Object getMesesDefasagemIndexador() {
        return mesesDefasagemIndexador;
    }

    @JsonProperty("mesesDefasagemIndexador")
    public void setMesesDefasagemIndexador(Object mesesDefasagemIndexador) {
        this.mesesDefasagemIndexador = mesesDefasagemIndexador;
    }

    @JsonProperty("formaPagamentoJuros")
    public FormaPagamentoJuros getFormaPagamentoJuros() {
        return formaPagamentoJuros;
    }

    @JsonProperty("formaPagamentoJuros")
    public void setFormaPagamentoJuros(FormaPagamentoJuros formaPagamentoJuros) {
        this.formaPagamentoJuros = formaPagamentoJuros;
    }

    @JsonProperty("dataPrimeiroPagamentoJuros")
    public String getDataPrimeiroPagamentoJuros() {
        return dataPrimeiroPagamentoJuros;
    }

    @JsonProperty("dataPrimeiroPagamentoJuros")
    public void setDataPrimeiroPagamentoJuros(String dataPrimeiroPagamentoJuros) {
        this.dataPrimeiroPagamentoJuros = dataPrimeiroPagamentoJuros;
    }

    @JsonProperty("dataPrimeiraAmortizacao")
    public String getDataPrimeiraAmortizacao() {
        return dataPrimeiraAmortizacao;
    }

    @JsonProperty("dataPrimeiraAmortizacao")
    public void setDataPrimeiraAmortizacao(String dataPrimeiraAmortizacao) {
        this.dataPrimeiraAmortizacao = dataPrimeiraAmortizacao;
    }

    @JsonProperty("formaAmortizacao")
    public FormaAmortizacao getFormaAmortizacao() {
        return formaAmortizacao;
    }

    @JsonProperty("formaAmortizacao")
    public void setFormaAmortizacao(FormaAmortizacao formaAmortizacao) {
        this.formaAmortizacao = formaAmortizacao;
    }

    @JsonProperty("indexadorCorrecaoMonetaria")
    public Object getIndexadorCorrecaoMonetaria() {
        return indexadorCorrecaoMonetaria;
    }

    @JsonProperty("indexadorCorrecaoMonetaria")
    public void setIndexadorCorrecaoMonetaria(Object indexadorCorrecaoMonetaria) {
        this.indexadorCorrecaoMonetaria = indexadorCorrecaoMonetaria;
    }

    @JsonProperty("periodicidadeAmortizacao")
    public PeriodicidadeAmortizacao getPeriodicidadeAmortizacao() {
        return periodicidadeAmortizacao;
    }

    @JsonProperty("periodicidadeAmortizacao")
    public void setPeriodicidadeAmortizacao(PeriodicidadeAmortizacao periodicidadeAmortizacao) {
        this.periodicidadeAmortizacao = periodicidadeAmortizacao;
    }

    @JsonProperty("periodicidadeCorrecaoMonetaria")
    public Object getPeriodicidadeCorrecaoMonetaria() {
        return periodicidadeCorrecaoMonetaria;
    }

    @JsonProperty("periodicidadeCorrecaoMonetaria")
    public void setPeriodicidadeCorrecaoMonetaria(Object periodicidadeCorrecaoMonetaria) {
        this.periodicidadeCorrecaoMonetaria = periodicidadeCorrecaoMonetaria;
    }

    @JsonProperty("periodicidadePagamentoJuros")
    public PeriodicidadePagamentoJuros getPeriodicidadePagamentoJuros() {
        return periodicidadePagamentoJuros;
    }

    @JsonProperty("periodicidadePagamentoJuros")
    public void setPeriodicidadePagamentoJuros(PeriodicidadePagamentoJuros periodicidadePagamentoJuros) {
        this.periodicidadePagamentoJuros = periodicidadePagamentoJuros;
    }

    @JsonProperty("curvaPagamento")
    public List<Object> getCurvaPagamento() {
        return curvaPagamento;
    }

    @JsonProperty("curvaPagamento")
    public void setCurvaPagamento(List<Object> curvaPagamento) {
        this.curvaPagamento = curvaPagamento;
    }

    @JsonProperty("mesAtualizacaoPagamento")
    public List<Object> getMesAtualizacaoPagamento() {
        return mesAtualizacaoPagamento;
    }

    @JsonProperty("mesAtualizacaoPagamento")
    public void setMesAtualizacaoPagamento(List<Object> mesAtualizacaoPagamento) {
        this.mesAtualizacaoPagamento = mesAtualizacaoPagamento;
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
