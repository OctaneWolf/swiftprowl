/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package com.octanewolf.swiftProwl.support.recorder.actions;

import com.octanewolf.swiftProwl.script.Pattern;
import com.octanewolf.swiftProwl.support.recorder.generators.ICodeGenerator;

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
