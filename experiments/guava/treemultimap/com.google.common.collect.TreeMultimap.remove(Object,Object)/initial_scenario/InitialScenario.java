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

public class StackEvoSuiteTest {

  @Test
  public void test0()  throws Throwable  {
    	TreeMultimap<Integer, String> linkedListMultimap0 = TreeMultimap.create();
		boolean boolean1 = linkedListMultimap0.put(-1698, "pluto");
		boolean boolean2 = linkedListMultimap0.put(123, "asd");
		boolean boolean3 = linkedListMultimap0.put(18, "ginger");
		boolean boolean4 = linkedListMultimap0.put(18, "ginger2");
		boolean boolean5 = linkedListMultimap0.put(18, "ginger3");
		boolean boolean6 = linkedListMultimap0.remove(18, "ginger");
  }
}
