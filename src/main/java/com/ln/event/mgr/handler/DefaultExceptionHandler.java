package com.ln.event.mgr.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import com.ln.event.mgr.rs.dto.ApiError;
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
}
