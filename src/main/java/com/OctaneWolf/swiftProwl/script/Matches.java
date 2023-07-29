/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package com.OctaneWolf.swiftProwl.script;

import java.util.Iterator;
import java.util.List;

public  interface Matches extends Iterator<Match> {
  @Override
  boolean hasNext();

  @Override
  Match next();

  Match asMatch();

  List<Match> asList();
}
