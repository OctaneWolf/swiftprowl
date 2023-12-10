/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package com.octanewolf.swiftprowl.support.recorder.actions;

import com.octanewolf.swiftprowl.script.Pattern;
import com.octanewolf.swiftprowl.support.recorder.generators.ICodeGenerator;

public class MouseDownAction extends PatternAction implements IRecordedAction {
  private String[] buttons;

  public MouseDownAction(Pattern pattern, String[] buttons) {
    super(pattern);
    this.buttons = buttons;
  }

  @Override
  public String generate(ICodeGenerator generator) {
    return generator.mouseDown(getPattern(), buttons);
  }
}
