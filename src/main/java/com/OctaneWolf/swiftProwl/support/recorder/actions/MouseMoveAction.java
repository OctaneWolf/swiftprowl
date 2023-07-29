/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package com.OctaneWolf.swiftProwl.support.recorder.actions;

import com.OctaneWolf.swiftProwl.script.Pattern;
import com.OctaneWolf.swiftProwl.support.recorder.generators.ICodeGenerator;

public class MouseMoveAction extends PatternAction implements IRecordedAction {
  public MouseMoveAction(Pattern pattern) {
    super(pattern);
  }

  @Override
  public String generate(ICodeGenerator generator) {
    return generator.mouseMove(getPattern());
  }
}
