package com.meli.mutants.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class NoMutantFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8286298211722779009L;

	public NoMutantFoundException() {
        super();
    }
    public NoMutantFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public NoMutantFoundException(String message) {
        super(message);
    }
    public NoMutantFoundException(Throwable cause) {
        super(cause);
    }

}
