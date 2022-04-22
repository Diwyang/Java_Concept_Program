package com.dj.exception.custom.checked;

public class InvalidFileNamePatternException extends Exception {

	public InvalidFileNamePatternException(String reason, Throwable t) {
		super(reason, t);
	}

}
