
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
    "idPagamentoPassivo",
    "idAgencia",
    "idNaturezaOperacao",
    "idClasseOperacao",
    "idTitulo",
    "idEmissor",
    "gestorOperacao",
    "analistaOperacao",
    "codigoBolsa",
    "codigoCetipBbb",
    "codigoIsin",
    "apelidoOperacao",
    "serie",
    "emissao",
    "tipoOferta",
    "regimeFiduciario",
    "formaCalculo",
    "concentracao",
    "dataEmissaoSerie",
    "dataVencimentoSerie",
    "dataPrimeiraIntegralizacao",
    "quantidadeEmitida",
    "precoUnitario",
    "valorGlobalSerie",
    "ratingEmissao",
    "perspectivaRating",
    "dataAtribuicaoRationg",
    "periodicidadeRenovacaoRating",
    "existenciaPrePagamento",
    "possibilidadePrePagamento",
    "formaPrePagamento",
    "existenciaPremioPrePagamento",
    "opcaoResgateSecuritizadora",
    "dataLockup",
    "clausulaContrato",
    "linkEstruturaOperacao",
    "descricaoEstrutura",
    "agencia",
    "classeOperacao",
    "emissor",
    "naturezaOperacao",
    "pagamentoPassivo",
    "titulo",
    "contaArrecadadora",
    "gestorFiduciario",
    "coordenadorLider",
    "agenteFiduciario",
    "assessorLegal",
    "camaraLiquidacao",
    "operacao",
    "premioPrePagamento"
})
public class Content {

    @JsonProperty("id")
    private int id;
    @JsonProperty("idPagamentoPassivo")
    private int idPagamentoPassivo;
    @JsonProperty("idAgencia")
    private int idAgencia;
    @JsonProperty("idNaturezaOperacao")
    private int idNaturezaOperacao;
    @JsonProperty("idClasseOperacao")
    private int idClasseOperacao;
    @JsonProperty("idTitulo")
    private int idTitulo;
    @JsonProperty("idEmissor")
    private int idEmissor;
    @JsonProperty("gestorOperacao")
    private String gestorOperacao;
    @JsonProperty("analistaOperacao")
    private String analistaOperacao;
    @JsonProperty("codigoBolsa")
    private String codigoBolsa;
    @JsonProperty("codigoCetipBbb")
    private String codigoCetipBbb;
    @JsonProperty("codigoIsin")
    private String codigoIsin;
    @JsonProperty("apelidoOperacao")
    private String apelidoOperacao;
    @JsonProperty("serie")
    private int serie;
    @JsonProperty("emissao")
    private String emissao;
    @JsonProperty("tipoOferta")
    private String tipoOferta;
    @JsonProperty("regimeFiduciario")
    private boolean regimeFiduciario;
    @JsonProperty("formaCalculo")
    private FormaCalculo formaCalculo;
    @JsonProperty("concentracao")
    private Concentracao concentracao;
    @JsonProperty("dataEmissaoSerie")
    private String dataEmissaoSerie;
    @JsonProperty("dataVencimentoSerie")
    private String dataVencimentoSerie;
    @JsonProperty("dataPrimeiraIntegralizacao")
    private String dataPrimeiraIntegralizacao;
    @JsonProperty("quantidadeEmitida")
    private int quantidadeEmitida;
    @JsonProperty("precoUnitario")
    private int precoUnitario;
    @JsonProperty("valorGlobalSerie")
    private int valorGlobalSerie;
    @JsonProperty("ratingEmissao")
    private String ratingEmissao;
    @JsonProperty("perspectivaRating")
    private PerspectivaRating perspectivaRating;
    @JsonProperty("dataAtribuicaoRationg")
    private String dataAtribuicaoRationg;
    @JsonProperty("periodicidadeRenovacaoRating")
    private PeriodicidadeRenovacaoRating periodicidadeRenovacaoRating;
    @JsonProperty("existenciaPrePagamento")
    private boolean existenciaPrePagamento;
    @JsonProperty("possibilidadePrePagamento")
    private PossibilidadePrePagamento possibilidadePrePagamento;
    @JsonProperty("formaPrePagamento")
    private FormaPrePagamento formaPrePagamento;
    @JsonProperty("existenciaPremioPrePagamento")
    private boolean existenciaPremioPrePagamento;
    @JsonProperty("opcaoResgateSecuritizadora")
    private boolean opcaoResgateSecuritizadora;
    @JsonProperty("dataLockup")
    private String dataLockup;
    @JsonProperty("clausulaContrato")
    private String clausulaContrato;
    @JsonProperty("linkEstruturaOperacao")
    private String linkEstruturaOperacao;
    @JsonProperty("descricaoEstrutura")
    private String descricaoEstrutura;
    @JsonProperty("agencia")
    private Agencia agencia;
    @JsonProperty("classeOperacao")
    private ClasseOperacao classeOperacao;
    @JsonProperty("emissor")
    private Emissor emissor;
    @JsonProperty("naturezaOperacao")
    private NaturezaOperacao naturezaOperacao;
    @JsonProperty("pagamentoPassivo")
    private PagamentoPassivo pagamentoPassivo;
    @JsonProperty("titulo")
    private Titulo titulo;
    @JsonProperty("contaArrecadadora")
    private List<Object> contaArrecadadora = null;
    @JsonProperty("gestorFiduciario")
    private GestorFiduciario gestorFiduciario;
    @JsonProperty("coordenadorLider")
    private CoordenadorLider coordenadorLider;
    @JsonProperty("agenteFiduciario")
    private AgenteFiduciario agenteFiduciario;
    @JsonProperty("assessorLegal")
    private Object assessorLegal;
    @JsonProperty("camaraLiquidacao")
    private CamaraLiquidacao camaraLiquidacao;
    @JsonProperty("operacao")
    private Operacao operacao;
    @JsonProperty("premioPrePagamento")
    private List<Object> premioPrePagamento = null;
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

    @JsonProperty("idPagamentoPassivo")
    public int getIdPagamentoPassivo() {
        return idPagamentoPassivo;
    }

    @JsonProperty("idPagamentoPassivo")
    public void setIdPagamentoPassivo(int idPagamentoPassivo) {
        this.idPagamentoPassivo = idPagamentoPassivo;
    }

    @JsonProperty("idAgencia")
    public int getIdAgencia() {
        return idAgencia;
    }

    @JsonProperty("idAgencia")
    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }

    @JsonProperty("idNaturezaOperacao")
    public int getIdNaturezaOperacao() {
        return idNaturezaOperacao;
    }

    @JsonProperty("idNaturezaOperacao")
    public void setIdNaturezaOperacao(int idNaturezaOperacao) {
        this.idNaturezaOperacao = idNaturezaOperacao;
    }

    @JsonProperty("idClasseOperacao")
    public int getIdClasseOperacao() {
        return idClasseOperacao;
    }

    @JsonProperty("idClasseOperacao")
    public void setIdClasseOperacao(int idClasseOperacao) {
        this.idClasseOperacao = idClasseOperacao;
    }

    @JsonProperty("idTitulo")
    public int getIdTitulo() {
        return idTitulo;
    }

    @JsonProperty("idTitulo")
    public void setIdTitulo(int idTitulo) {
        this.idTitulo = idTitulo;
    }

    @JsonProperty("idEmissor")
    public int getIdEmissor() {
        return idEmissor;
    }

    @JsonProperty("idEmissor")
    public void setIdEmissor(int idEmissor) {
        this.idEmissor = idEmissor;
    }

    @JsonProperty("gestorOperacao")
    public String getGestorOperacao() {
        return gestorOperacao;
    }

    @JsonProperty("gestorOperacao")
    public void setGestorOperacao(String gestorOperacao) {
        this.gestorOperacao = gestorOperacao;
    }

    @JsonProperty("analistaOperacao")
    public String getAnalistaOperacao() {
        return analistaOperacao;
    }

    @JsonProperty("analistaOperacao")
    public void setAnalistaOperacao(String analistaOperacao) {
        this.analistaOperacao = analistaOperacao;
    }

    @JsonProperty("codigoBolsa")
    public String getCodigoBolsa() {
        return codigoBolsa;
    }

    @JsonProperty("codigoBolsa")
    public void setCodigoBolsa(String codigoBolsa) {
        this.codigoBolsa = codigoBolsa;
    }

    @JsonProperty("codigoCetipBbb")
    public String getCodigoCetipBbb() {
        return codigoCetipBbb;
    }

    @JsonProperty("codigoCetipBbb")
    public void setCodigoCetipBbb(String codigoCetipBbb) {
        this.codigoCetipBbb = codigoCetipBbb;
    }

    @JsonProperty("codigoIsin")
    public String getCodigoIsin() {
        return codigoIsin;
    }

    @JsonProperty("codigoIsin")
    public void setCodigoIsin(String codigoIsin) {
        this.codigoIsin = codigoIsin;
    }

    @JsonProperty("apelidoOperacao")
    public String getApelidoOperacao() {
        return apelidoOperacao;
    }

    @JsonProperty("apelidoOperacao")
    public void setApelidoOperacao(String apelidoOperacao) {
        this.apelidoOperacao = apelidoOperacao;
    }

    @JsonProperty("serie")
    public int getSerie() {
        return serie;
    }

    @JsonProperty("serie")
    public void setSerie(int serie) {
        this.serie = serie;
    }

    @JsonProperty("emissao")
    public String getEmissao() {
        return emissao;
    }

    @JsonProperty("emissao")
    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    @JsonProperty("tipoOferta")
    public String getTipoOferta() {
        return tipoOferta;
    }

    @JsonProperty("tipoOferta")
    public void setTipoOferta(String tipoOferta) {
        this.tipoOferta = tipoOferta;
    }

    @JsonProperty("regimeFiduciario")
    public boolean isRegimeFiduciario() {
        return regimeFiduciario;
    }

    @JsonProperty("regimeFiduciario")
    public void setRegimeFiduciario(boolean regimeFiduciario) {
        this.regimeFiduciario = regimeFiduciario;
    }

    @JsonProperty("formaCalculo")
    public FormaCalculo getFormaCalculo() {
        return formaCalculo;
    }

    @JsonProperty("formaCalculo")
    public void setFormaCalculo(FormaCalculo formaCalculo) {
        this.formaCalculo = formaCalculo;
    }

    @JsonProperty("concentracao")
    public Concentracao getConcentracao() {
        return concentracao;
    }

    @JsonProperty("concentracao")
    public void setConcentracao(Concentracao concentracao) {
        this.concentracao = concentracao;
    }

    @JsonProperty("dataEmissaoSerie")
    public String getDataEmissaoSerie() {
        return dataEmissaoSerie;
    }

    @JsonProperty("dataEmissaoSerie")
    public void setDataEmissaoSerie(String dataEmissaoSerie) {
        this.dataEmissaoSerie = dataEmissaoSerie;
    }

    @JsonProperty("dataVencimentoSerie")
    public String getDataVencimentoSerie() {
        return dataVencimentoSerie;
    }

    @JsonProperty("dataVencimentoSerie")
    public void setDataVencimentoSerie(String dataVencimentoSerie) {
        this.dataVencimentoSerie = dataVencimentoSerie;
    }

    @JsonProperty("dataPrimeiraIntegralizacao")
    public String getDataPrimeiraIntegralizacao() {
        return dataPrimeiraIntegralizacao;
    }

    @JsonProperty("dataPrimeiraIntegralizacao")
    public void setDataPrimeiraIntegralizacao(String dataPrimeiraIntegralizacao) {
        this.dataPrimeiraIntegralizacao = dataPrimeiraIntegralizacao;
    }

    @JsonProperty("quantidadeEmitida")
    public int getQuantidadeEmitida() {
        return quantidadeEmitida;
    }

    @JsonProperty("quantidadeEmitida")
    public void setQuantidadeEmitida(int quantidadeEmitida) {
        this.quantidadeEmitida = quantidadeEmitida;
    }

    @JsonProperty("precoUnitario")
    public int getPrecoUnitario() {
        return precoUnitario;
    }

    @JsonProperty("precoUnitario")
    public void setPrecoUnitario(int precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @JsonProperty("valorGlobalSerie")
    public int getValorGlobalSerie() {
        return valorGlobalSerie;
    }

    @JsonProperty("valorGlobalSerie")
    public void setValorGlobalSerie(int valorGlobalSerie) {
        this.valorGlobalSerie = valorGlobalSerie;
    }

    @JsonProperty("ratingEmissao")
    public String getRatingEmissao() {
        return ratingEmissao;
    }

    @JsonProperty("ratingEmissao")
    public void setRatingEmissao(String ratingEmissao) {
        this.ratingEmissao = ratingEmissao;
    }

    @JsonProperty("perspectivaRating")
    public PerspectivaRating getPerspectivaRating() {
        return perspectivaRating;
    }

    @JsonProperty("perspectivaRating")
    public void setPerspectivaRating(PerspectivaRating perspectivaRating) {
        this.perspectivaRating = perspectivaRating;
    }

    @JsonProperty("dataAtribuicaoRationg")
    public String getDataAtribuicaoRationg() {
        return dataAtribuicaoRationg;
    }

    @JsonProperty("dataAtribuicaoRationg")
    public void setDataAtribuicaoRationg(String dataAtribuicaoRationg) {
        this.dataAtribuicaoRationg = dataAtribuicaoRationg;
    }

    @JsonProperty("periodicidadeRenovacaoRating")
    public PeriodicidadeRenovacaoRating getPeriodicidadeRenovacaoRating() {
        return periodicidadeRenovacaoRating;
    }

    @JsonProperty("periodicidadeRenovacaoRating")
    public void setPeriodicidadeRenovacaoRating(PeriodicidadeRenovacaoRating periodicidadeRenovacaoRating) {
        this.periodicidadeRenovacaoRating = periodicidadeRenovacaoRating;
    }

    @JsonProperty("existenciaPrePagamento")
    public boolean isExistenciaPrePagamento() {
        return existenciaPrePagamento;
    }

    @JsonProperty("existenciaPrePagamento")
    public void setExistenciaPrePagamento(boolean existenciaPrePagamento) {
        this.existenciaPrePagamento = existenciaPrePagamento;
    }

    @JsonProperty("possibilidadePrePagamento")
    public PossibilidadePrePagamento getPossibilidadePrePagamento() {
        return possibilidadePrePagamento;
    }

    @JsonProperty("possibilidadePrePagamento")
    public void setPossibilidadePrePagamento(PossibilidadePrePagamento possibilidadePrePagamento) {
        this.possibilidadePrePagamento = possibilidadePrePagamento;
    }

    @JsonProperty("formaPrePagamento")
    public FormaPrePagamento getFormaPrePagamento() {
        return formaPrePagamento;
    }

    @JsonProperty("formaPrePagamento")
    public void setFormaPrePagamento(FormaPrePagamento formaPrePagamento) {
        this.formaPrePagamento = formaPrePagamento;
    }

    @JsonProperty("existenciaPremioPrePagamento")
    public boolean isExistenciaPremioPrePagamento() {
        return existenciaPremioPrePagamento;
    }

    @JsonProperty("existenciaPremioPrePagamento")
    public void setExistenciaPremioPrePagamento(boolean existenciaPremioPrePagamento) {
        this.existenciaPremioPrePagamento = existenciaPremioPrePagamento;
    }

    @JsonProperty("opcaoResgateSecuritizadora")
    public boolean isOpcaoResgateSecuritizadora() {
        return opcaoResgateSecuritizadora;
    }

    @JsonProperty("opcaoResgateSecuritizadora")
    public void setOpcaoResgateSecuritizadora(boolean opcaoResgateSecuritizadora) {
        this.opcaoResgateSecuritizadora = opcaoResgateSecuritizadora;
    }

    @JsonProperty("dataLockup")
    public String getDataLockup() {
        return dataLockup;
    }

    @JsonProperty("dataLockup")
    public void setDataLockup(String dataLockup) {
        this.dataLockup = dataLockup;
    }

    @JsonProperty("clausulaContrato")
    public String getClausulaContrato() {
        return clausulaContrato;
    }

    @JsonProperty("clausulaContrato")
    public void setClausulaContrato(String clausulaContrato) {
        this.clausulaContrato = clausulaContrato;
    }

    @JsonProperty("linkEstruturaOperacao")
    public String getLinkEstruturaOperacao() {
        return linkEstruturaOperacao;
    }

    @JsonProperty("linkEstruturaOperacao")
    public void setLinkEstruturaOperacao(String linkEstruturaOperacao) {
        this.linkEstruturaOperacao = linkEstruturaOperacao;
    }

    @JsonProperty("descricaoEstrutura")
    public String getDescricaoEstrutura() {
        return descricaoEstrutura;
    }

    @JsonProperty("descricaoEstrutura")
    public void setDescricaoEstrutura(String descricaoEstrutura) {
        this.descricaoEstrutura = descricaoEstrutura;
    }

    @JsonProperty("agencia")
    public Agencia getAgencia() {
        return agencia;
    }

    @JsonProperty("agencia")
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @JsonProperty("classeOperacao")
    public ClasseOperacao getClasseOperacao() {
        return classeOperacao;
    }

    @JsonProperty("classeOperacao")
    public void setClasseOperacao(ClasseOperacao classeOperacao) {
        this.classeOperacao = classeOperacao;
    }

    @JsonProperty("emissor")
    public Emissor getEmissor() {
        return emissor;
    }

    @JsonProperty("emissor")
    public void setEmissor(Emissor emissor) {
        this.emissor = emissor;
    }

    @JsonProperty("naturezaOperacao")
    public NaturezaOperacao getNaturezaOperacao() {
        return naturezaOperacao;
    }

    @JsonProperty("naturezaOperacao")
    public void setNaturezaOperacao(NaturezaOperacao naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }

    @JsonProperty("pagamentoPassivo")
    public PagamentoPassivo getPagamentoPassivo() {
        return pagamentoPassivo;
    }

    @JsonProperty("pagamentoPassivo")
    public void setPagamentoPassivo(PagamentoPassivo pagamentoPassivo) {
        this.pagamentoPassivo = pagamentoPassivo;
    }

    @JsonProperty("titulo")
    public Titulo getTitulo() {
        return titulo;
    }

    @JsonProperty("titulo")
    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    @JsonProperty("contaArrecadadora")
    public List<Object> getContaArrecadadora() {
        return contaArrecadadora;
    }

    @JsonProperty("contaArrecadadora")
    public void setContaArrecadadora(List<Object> contaArrecadadora) {
        this.contaArrecadadora = contaArrecadadora;
    }

    @JsonProperty("gestorFiduciario")
    public GestorFiduciario getGestorFiduciario() {
        return gestorFiduciario;
    }

    @JsonProperty("gestorFiduciario")
    public void setGestorFiduciario(GestorFiduciario gestorFiduciario) {
        this.gestorFiduciario = gestorFiduciario;
    }

    @JsonProperty("coordenadorLider")
    public CoordenadorLider getCoordenadorLider() {
        return coordenadorLider;
    }

    @JsonProperty("coordenadorLider")
    public void setCoordenadorLider(CoordenadorLider coordenadorLider) {
        this.coordenadorLider = coordenadorLider;
    }

    @JsonProperty("agenteFiduciario")
    public AgenteFiduciario getAgenteFiduciario() {
        return agenteFiduciario;
    }

    @JsonProperty("agenteFiduciario")
    public void setAgenteFiduciario(AgenteFiduciario agenteFiduciario) {
        this.agenteFiduciario = agenteFiduciario;
    }

    @JsonProperty("assessorLegal")
    public Object getAssessorLegal() {
        return assessorLegal;
    }

    @JsonProperty("assessorLegal")
    public void setAssessorLegal(Object assessorLegal) {
        this.assessorLegal = assessorLegal;
    }

    @JsonProperty("camaraLiquidacao")
    public CamaraLiquidacao getCamaraLiquidacao() {
        return camaraLiquidacao;
    }

    @JsonProperty("camaraLiquidacao")
    public void setCamaraLiquidacao(CamaraLiquidacao camaraLiquidacao) {
        this.camaraLiquidacao = camaraLiquidacao;
    }

    @JsonProperty("operacao")
    public Operacao getOperacao() {
        return operacao;
    }

    @JsonProperty("operacao")
    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    @JsonProperty("premioPrePagamento")
    public List<Object> getPremioPrePagamento() {
        return premioPrePagamento;
    }

    @JsonProperty("premioPrePagamento")
    public void setPremioPrePagamento(List<Object> premioPrePagamento) {
        this.premioPrePagamento = premioPrePagamento;
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
