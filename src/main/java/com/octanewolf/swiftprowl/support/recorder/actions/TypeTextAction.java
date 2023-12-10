/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package com.octanewolf.swiftprowl.support.recorder.actions;

import com.octanewolf.swiftprowl.support.recorder.generators.ICodeGenerator;

public class TypeTextAction implements IRecordedAction {

  private String text;
  private String[] modifiers;

  public TypeTextAction(String text, String[] modifiers) {
    this.text = text;
    this.modifiers = modifiers;
  }

  @Override
  public String generate(ICodeGenerator generator) {
    return generator.typeText(text, modifiers);
  }
}
