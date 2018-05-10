package com.ln.event.mgr.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ln.event.mgr.rs.dto.ApiError;

@RestController
public class CustomErrorController implements ErrorController {

  @Override
  public String getErrorPath() {
    return "/error";
  }

  @RequestMapping("/error")
  public ResponseEntity<Object> handleError(HttpServletRequest request) {
    return new ResponseEntity<Object>(new ApiError(HttpStatus.BAD_REQUEST.value(),
        HttpStatus.BAD_REQUEST.name()), HttpStatus.BAD_REQUEST);
  }

}
