/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package com.octanewolf.swiftProwl.support.recorder.actions;

import com.octanewolf.swiftProwl.script.Pattern;

public abstract class PatternAction implements IRecordedAction {
  private Pattern pattern;

  public PatternAction(Pattern pattern) {
    super();
    this.pattern = pattern;
  }

  public Pattern getPattern() {
    return pattern;
  }

  public void setPattern(Pattern pattern) {
    this.pattern = pattern;
  }
}
