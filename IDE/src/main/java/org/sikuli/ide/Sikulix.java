/*
 * Copyright (c) 2010-2018, sikuli.org, sikulix.com - MIT license
 */

package org.sikuli.ide;

import org.sikuli.script.support.RunTime;

public class Sikulix {

  public static void main(String[] args) {

    if (!RunTime.start(RunTime.Type.IDE, args)) {
      System.setProperty("sikuli.IDE_should_run", "develop");
      SikulixIDE.main(args);
    }
  }
}
