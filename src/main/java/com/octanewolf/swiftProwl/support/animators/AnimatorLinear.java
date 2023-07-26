/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package com.octanewolf.swiftProwl.support.animators;

public class AnimatorLinear extends AnimatorTimeBased {

  public AnimatorLinear(float beginVal, float endVal, long totalMS) {
    super(new AnimatorLinearInterpolation(beginVal, endVal, totalMS));
  }
}
