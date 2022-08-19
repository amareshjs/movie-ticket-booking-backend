package com.mb.assignment.util;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mb.assignment.exception.ValidationErrorResponse;

@JsonInclude(Include.NON_DEFAULT)
public class ErrorResponse {

	private String message;
	private int code;
	private boolean error;
	private List<ValidationErrorResponse> validationErros;

	public ErrorResponse(String message, int code, boolean error) {
		super();
		this.message = message;
		this.code = code;
		this.error = error;
	}

	public ErrorResponse() {
		super();
	}

	public void setValidationErros(List<ValidationErrorResponse> validationErros) {
		this.validationErros = validationErros;
	}

	public List<ValidationErrorResponse> getValidationErros() {
		return validationErros;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

	public boolean isError() {
		return error;
	}

}