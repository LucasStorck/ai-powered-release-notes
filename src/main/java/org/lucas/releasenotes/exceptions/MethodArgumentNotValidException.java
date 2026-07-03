package org.lucas.releasenotes.exceptions;

public class MethodArgumentNotValidException extends RuntimeException {
  public MethodArgumentNotValidException(String message) {
    super(message);
  }
}
