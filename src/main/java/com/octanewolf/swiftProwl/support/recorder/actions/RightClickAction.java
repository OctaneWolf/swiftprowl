/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package com.octanewolf.swiftProwl.support.recorder.actions;

import com.octanewolf.swiftProwl.script.Pattern;
import com.octanewolf.swiftProwl.support.recorder.generators.ICodeGenerator;

public class RightClickAction extends ClickAction {

  public RightClickAction(Pattern pattern, String[] modifiers) {
    super(pattern, modifiers);
  }

  @Override
  public String generate(ICodeGenerator generator) {
    return generator.rightClick(getPattern(), getModifiers());
  }
}
