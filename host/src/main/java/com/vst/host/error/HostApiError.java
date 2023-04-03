package com.vst.host.error;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vst.host.exception.NotAcceptableException;
import com.vst.host.exception.NotFoundException;


@RestControllerAdvice
public class HostApiError {

String message = "error message";
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(NotFoundException.class)
	public Map<String,Object> notFound(NotFoundException ex) {
		Map<String,Object> errorMap = new HashMap<>();
		HostApiResponse error = new HostApiResponse();		
		error.setCode("404");
		error.setMessage("Data not found");
		error.setDescription("Details is not available  ");
		error.setTimeStamp(LocalDateTime.now());
		error.setError(HttpStatus.NOT_FOUND);
		error.setReason("Data not available ");
		errorMap.put(message, error);
		return errorMap;
	}
	
	
	@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
	@ExceptionHandler(NotAcceptableException.class)
	public Map<String,Object> notFound(NotAcceptableException ex) {
		Map<String,Object> errorMap = new HashMap<>();
		HostApiResponse error = new HostApiResponse();		
		error.setCode("400");
		error.setMessage("Please Enter Valid Data");
		error.setDescription("NOT ACCEPTABLE ");
		error.setTimeStamp(LocalDateTime.now());
		error.setError(HttpStatus.NOT_ACCEPTABLE);
		error.setReason("Provide Valid data ");
		errorMap.put(message, error);
		return errorMap;
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex) {
        Map<String, String> errorMap = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->{
            errorMap.put(error.getField(), error.getDefaultMessage());
        });
        return errorMap;
    }
	
}