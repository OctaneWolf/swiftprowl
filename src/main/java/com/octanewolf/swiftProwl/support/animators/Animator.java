/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */
package com.octanewolf.swiftProwl.support.animators;

/**
 * INTERNAL USE
 * allows to implement timed animations (e.g. mouse move)
 */
public interface Animator {

  public float step();

  public boolean running();
}
