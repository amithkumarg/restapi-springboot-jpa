package com.oss.shop.handler;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.oss.shop.rs.dto.ApiError;

import lombok.extern.slf4j.Slf4j;

@RestController
@RestControllerAdvice
@Slf4j
public class DefaultExceptionHandler {

  @ExceptionHandler(Exception.class)
  public ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
    log.error(ex.getMessage(), ex);
    return new ResponseEntity<Object>(new ApiError(HttpStatus.INTERNAL_SERVER_ERROR.value(),
        HttpStatus.INTERNAL_SERVER_ERROR.name()), HttpStatus.INTERNAL_SERVER_ERROR);
  }
  
  @ExceptionHandler
  @ResponseBody
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public Object handle(ConstraintViolationException exception) {
      List<String> errors = new ArrayList<>();
	  for(ConstraintViolation obj : exception.getConstraintViolations()){
    	  errors.add(obj.getMessage());
      }
	  return errors;
  }
  
  @ExceptionHandler
  @ResponseBody
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public Object handle(MissingServletRequestParameterException exception) {
      return exception.getMessage();
  }
}
