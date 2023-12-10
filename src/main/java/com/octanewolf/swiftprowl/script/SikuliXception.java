/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */
package com.octanewolf.swiftprowl.script;

/**
 * INTERNAL USE
 */
public class SikuliXception extends RuntimeException {

  public SikuliXception(String message) {
    super(message);
  }
  
  public SikuliXception(String message, Exception e) {
    super(message, e);
  }
}
