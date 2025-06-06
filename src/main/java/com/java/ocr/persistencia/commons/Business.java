package com.java.ocr.persistencia.commons;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class Business.
 */
public class Business implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4821592446726327431L;

	@JsonProperty("business")
	private BusinessData businessException;

	public Business() {
		super();
	}

	public BusinessData getBusinessException() {
		return businessException;
	}

	public void setBusinessException(BusinessData businessException) {
		this.businessException = businessException;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Business [businessException=");
		builder.append(businessException);
		builder.append("]");
		return builder.toString();
	}

}
