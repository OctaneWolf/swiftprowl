/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package com.OctaneWolf.swiftProwl.support.recorder.actions;

import com.OctaneWolf.swiftProwl.support.recorder.generators.ICodeGenerator;

public class TypeKeyAction implements IRecordedAction {

  private String key;
  private String[] modifiers;

  public TypeKeyAction(String key, String[] modifiers) {
    this.key = key;
    this.modifiers = modifiers;
  }

  @Override
  public String generate(ICodeGenerator generator) {
    return generator.typeKey(key, modifiers);
  }
}
