package com.br.rbcapital.passivoFavorito.portlet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

	private String idPassivo;
	private String codigoRB;
	private String codigoCetipBbb;
	private String apelidoOperacao;
	private String dataEmissaoSerie;
	private String dataVencimentoSerie;
	private String taxaSpread;
	private String taxaSpreadCalculado;
	private String remuneracaoFlutuante;

	public String getIdPassivo() {
		return idPassivo;
	}

	public void setIdPassivo(String idPassivo) {
		this.idPassivo = idPassivo;
	}

	public String getCodigoRB() {
		return codigoRB;
	}

	public void setCodigoRB(String codigoRB) {
		this.codigoRB = codigoRB;
	}

	public String getCodigoCetipBbb() {
		return codigoCetipBbb;
	}

	public void setCodigoCetipBbb(String codigoCetipBbb) {
		this.codigoCetipBbb = codigoCetipBbb;
	}

	public String getApelidoOperacao() {
		return apelidoOperacao;
	}

	public void setApelidoOperacao(String apelidoOperacao) {
		this.apelidoOperacao = apelidoOperacao;
	}

	public String getDataEmissaoSerie() {
		return dataEmissaoSerie;
	}

	public void setDataEmissaoSerie(String dataEmissaoSerie) {
		this.dataEmissaoSerie = dataEmissaoSerie;
	}

	public String getDataVencimentoSerie() {
		return dataVencimentoSerie;
	}

	public void setDataVencimentoSerie(String dataVencimentoSerie) {
		this.dataVencimentoSerie = dataVencimentoSerie;
	}

	public String getTaxaSpread() {
		return taxaSpread;
	}

	public void setTaxaSpread(String taxaSpread) {
		this.taxaSpread = taxaSpread;
	}

	public String getTaxaSpreadCalculado() {
		return taxaSpreadCalculado;
	}

	public void setTaxaSpreadCalculado(String taxaSpreadCalculado) {
		this.taxaSpreadCalculado = taxaSpreadCalculado;
	}

	public String getRemuneracaoFlutuante() {
		return remuneracaoFlutuante;
	}

	public void setRemuneracaoFlutuante(String remuneracaoFlutuante) {
		this.remuneracaoFlutuante = remuneracaoFlutuante;
	}

}
