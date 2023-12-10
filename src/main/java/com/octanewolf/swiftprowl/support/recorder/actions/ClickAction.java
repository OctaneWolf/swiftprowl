/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package com.octanewolf.swiftprowl.support.recorder.actions;

import com.octanewolf.swiftprowl.script.Pattern;
import com.octanewolf.swiftprowl.support.recorder.generators.ICodeGenerator;

public class ClickAction extends PatternAction implements IRecordedAction {
  private String[] modifiers;

  public ClickAction(Pattern pattern, String[] modifiers) {
    super(pattern);
    this.modifiers = modifiers;
  }

  @Override
  public String generate(ICodeGenerator generator) {
    return generator.click(getPattern(), modifiers);
  }

  public String[] getModifiers() {
    return modifiers;
  }

  public void setModifiers(String[] modifiers) {
    this.modifiers = modifiers;
  }
}
