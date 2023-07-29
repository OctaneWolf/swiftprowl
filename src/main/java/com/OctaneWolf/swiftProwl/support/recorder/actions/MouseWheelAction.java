/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package com.OctaneWolf.swiftProwl.support.recorder.actions;

import com.OctaneWolf.swiftProwl.script.Pattern;
import com.OctaneWolf.swiftProwl.support.recorder.generators.ICodeGenerator;

public class MouseWheelAction extends PatternAction implements IRecordedAction {
  private int direction;
  private int steps;
  private String[] modifiers;
  private long stepDelay;

  public MouseWheelAction(Pattern pattern, int direction, int steps, String[] modifiers, long stepDelay) {
    super(pattern);
    this.direction = direction;
    this.steps = steps;
    this.modifiers = modifiers;
    this.stepDelay = stepDelay;
  }

  @Override
  public String generate(ICodeGenerator generator) {
    return generator.wheel(getPattern(), direction, steps, modifiers, stepDelay);
  }
}
