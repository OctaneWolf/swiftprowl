/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package com.octanewolf.swiftProwl.support.recorder.actions;

import com.octanewolf.swiftProwl.support.recorder.generators.ICodeGenerator;

public interface IRecordedAction {
  String generate(ICodeGenerator generator);
}
