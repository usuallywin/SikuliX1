/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package org.sikuli.script.test;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Image;
import org.sikuli.script.Match;
import org.sikuli.script.support.SXTest;

import java.net.URL;
import java.util.List;
import java.util.Map;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ElementImageTest extends SXTest {

  @Before
  public void setUp() {
    setUpBase();
  }

  @Test
  public void test000_StartUp() {
    startUpBase();
  }

  @Test
  public void test100_ImageFind() {
    testIntro();
    Image shot = new Image(testBase);
    Match match = null;
    try {
      match = shot.find(testName);
    } catch (FindFailed findFailed) {
    }
    testOutro("%s in %s is %s", testName, shot, match);
  }

  @Test
  public void test110_ImageFindTrans() {
    testIntro();
    Image shot = new Image(testBase);
    Match match = null;
    try {
      match = shot.find(testNameTrans);
    } catch (FindFailed findFailed) {
    }
    testOutro("%s in %s is %s", testName, shot, match);
  }

  @Test
  public void test999() {
    testIntro();
    Map<URL, List<Object>> cache = Image.getCache();
    testOutro("%s", Image.cacheStats());
  }
}