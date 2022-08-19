package com.mb.assignment.exception;

public enum ErrorCode {

	INTERNAL_SERVER_ERROR(500), BAD_REQUEST(400), NOT_FOUND(404), UNAUTHORIZED(401),

	// MOVIE
	 MOVIE_NOT_FOUND(800);


	private final int code;

	private ErrorCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return this.code;
	}

}
