package com.vst.host.error;

/**
* throws the exception whenever any error occure or validation fails.
*
* @author Nikita Chakole <nikita.chakole@vpel.in>
* @since  21/12/2022
*/

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vst.host.exception.HostException;
import com.vst.host.exception.InValidDataException;
import com.vst.host.exception.InValidIdExcepetion;
import com.vst.host.exception.MethodFailureException;
import com.vst.host.exception.NotAcceptableException;
import com.vst.host.exception.NotFoundException;

/**
 * 
 * @param exception
 * @return error message
 */

@RestControllerAdvice
public class HostApiError {

	String message = "error ";

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(NotFoundException.class)
	public Map<String, Object> notFound(NotFoundException ex) {
		Map<String, Object> errorMap = new HashMap<>();
		HostApiResponse response = new HostApiResponse();
		response.setMessage(ex.getMessage());
		response.setStatus(HttpStatus.NOT_FOUND);
		response.setStatusCode("404");
		response.setTimeStamp(LocalDateTime.now());
		errorMap.put(message, response);
		return errorMap;
	}

	@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
	@ExceptionHandler(NotAcceptableException.class)
	public Map<String, Object> notFound(NotAcceptableException ex) {
		Map<String, Object> errorMap = new HashMap<>();
		HostApiResponse response = new HostApiResponse();

		response.setMessage(ex.getMessage());
		response.setStatus(HttpStatus.NOT_ACCEPTABLE);
		response.setStatusCode("406");
		response.setTimeStamp(LocalDateTime.now());
		errorMap.put(message, response);
		return errorMap;
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException exception) {
		Map<String, String> errorMap = new HashMap<>();
		exception.getBindingResult().getFieldErrors().forEach(error -> {
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		return errorMap;
	}

	@ExceptionHandler(MethodFailureException.class)
	@ResponseStatus(HttpStatus.METHOD_FAILURE)
	public Map<String, Object> methodFailure(MethodFailureException ex) {
		Map<String, Object> errorMap = new HashMap<>();
		HostApiResponse response = new HostApiResponse();
		response.setMessage(ex.getMessage());
		response.setStatus(HttpStatus.METHOD_FAILURE);
		response.setStatusCode("420");
		response.setTimeStamp(LocalDateTime.now());

		errorMap.put(message, response);
		return errorMap;
	}

	@ExceptionHandler(InValidDataException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, Object> inValidData(InValidDataException ex) {
		Map<String, Object> errorMap = new HashMap<>();
		HostApiResponse response = new HostApiResponse();
		response.setMessage(ex.getMessage());
		response.setStatus(HttpStatus.NOT_FOUND);
		response.setStatusCode("404");
		response.setTimeStamp(LocalDateTime.now());
		errorMap.put(message, response);
		return errorMap;
	}
	
	@ExceptionHandler(InValidIdExcepetion.class)
	@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
	public Map<String, Object> inValidId(InValidIdExcepetion ex) {
		Map<String, Object> errorMap = new HashMap<>();
		HostApiResponse response = new HostApiResponse();
		response.setMessage(ex.getMessage());
		response.setStatus(HttpStatus.NOT_ACCEPTABLE);
		response.setStatusCode("406");
		response.setTimeStamp(LocalDateTime.now());
		errorMap.put(message, response);
		return errorMap;
	}
	
	@ExceptionHandler(HostException.class)
	@ResponseStatus(HttpStatus.BAD_GATEWAY)
	public Map<String, Object> stationException(HostException ex) {
		Map<String, Object> errorMap = new HashMap<>();
		HostApiResponse response = new HostApiResponse();
		
		response.setStatus(HttpStatus.BAD_GATEWAY);
		response.setStatusCode("502");
		response.setServiceName(ex.getServiceName());
		response.setFunctionality(ex.getFunctionality());
		response.setLineNumber(ex.getLineNumber());
		response.setMessage(ex.getMessage());
		response.setMethodName(ex.getMethodName());
		response.setServiceCode(ex.getServiceCode());
		response.setClassName(ex.getClassName());
		response.setTimeStamp(LocalDateTime.now());

		errorMap.put(message, response);
		return errorMap;
	}
}
