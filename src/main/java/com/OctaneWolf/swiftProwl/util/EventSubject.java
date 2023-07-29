/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */
package com.OctaneWolf.swiftProwl.util;

/**
 * INTERNAL USE
 */
public interface EventSubject {

  public void addObserver(EventObserver o);

  public void notifyObserver();
}
