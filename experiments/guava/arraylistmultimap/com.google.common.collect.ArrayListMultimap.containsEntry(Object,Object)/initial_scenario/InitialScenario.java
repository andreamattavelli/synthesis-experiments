/*
 * This file was automatically generated by EvoSuite
 */

package com.google.common.collect;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.ArrayListMultimap;

public class InitialScenario {

  @Test
  public void test0()  throws Throwable  {
    ArrayListMultimap<Integer, String> arrayListMultimap0 = ArrayListMultimap.create();
    boolean boolean1 = arrayListMultimap0.put(-1698, "pluto");
    boolean boolean2 = arrayListMultimap0.put(123, "asd");
    boolean boolean3 = arrayListMultimap0.put(18, "ginger");
    boolean boolean4 = arrayListMultimap0.put(18, "ginger2");
    boolean boolean5 = arrayListMultimap0.containsEntry(18, "ginger");
  }
}
