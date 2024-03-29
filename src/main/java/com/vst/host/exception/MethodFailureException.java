package com.vst.host.exception;

/**
* when any MethodFailure exception occure this class will be use. it is manually defined exception class.
*
* @author Nikita Chakole <nikita.chakole@vpel.in>
* @since  21/12/2022
*/

public class MethodFailureException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MethodFailureException(String message) {
		super();
	}

}
