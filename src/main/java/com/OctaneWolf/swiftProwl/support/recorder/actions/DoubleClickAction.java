/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package com.OctaneWolf.swiftProwl.support.recorder.actions;

import com.OctaneWolf.swiftProwl.script.Pattern;
import com.OctaneWolf.swiftProwl.support.recorder.generators.ICodeGenerator;

public class DoubleClickAction extends ClickAction {

  public DoubleClickAction(Pattern pattern, String[] modifiers) {
    super(pattern, modifiers);
  }

  @Override
  public String generate(ICodeGenerator generator) {
    return generator.doubleClick(getPattern(), getModifiers());
  }
}
