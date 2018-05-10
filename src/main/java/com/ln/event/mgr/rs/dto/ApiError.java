package com.ln.event.mgr.rs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 
 * @author AmithKumar
 *
 */
@Data
@AllArgsConstructor
public class ApiError {
  private int errorCode;
  private String errorMessage;
}
