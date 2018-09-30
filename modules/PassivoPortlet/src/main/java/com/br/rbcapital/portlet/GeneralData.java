package com.br.rbcapital.portlet;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralData {

	private String _id;
	private String transactionFailed;

	@JsonProperty("content")
	private Content content;	

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getTransactionFailed() {
		return transactionFailed;
	}

	public void setTransactionFailed(String transactionFailed) {
		this.transactionFailed = transactionFailed;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}
	

}
