package com.hcl.ers.util.itests.util;

public class TestException extends RuntimeException {
	public TestException(String error) {
		super(error);
	}
	
	public TestException(String error, Throwable cause) {
		super(error, cause);
	}
}
