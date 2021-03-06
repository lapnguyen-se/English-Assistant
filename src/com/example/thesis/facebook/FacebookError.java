package com.example.thesis.facebook;

public class FacebookError extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private int mErrorCode = 0;
	private String mErrorType;

	public FacebookError(String message) {
		super(message);
	}

	public FacebookError(String message, String type, int code) {
		super(message);
		this.mErrorType = type;
		this.mErrorCode = code;
	}

	public int getErrorCode() {
		return this.mErrorCode;
	}

	public String getErrorType() {
		return this.mErrorType;
	}
}
