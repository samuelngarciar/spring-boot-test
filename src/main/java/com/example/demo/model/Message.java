package com.example.demo.model;

public class Message {

 private String input;
 private String message = "Spring boot running: ";
 private String padding = "OK";

 public Message() {}
 public Message(String input, String message, String padding) {
  this.input = input;
  this.message = message;
  this.padding = padding;
 }

public void setInput(String input) { this.input = input;}
public String getInput() { return this.input;}

public void setMessage(String message) { this.message = message;}
public String getMessage() { return this.message;}

public void setPadding(String padding) { this.padding = padding;}
public String getPadding() { return this.padding;}
}
