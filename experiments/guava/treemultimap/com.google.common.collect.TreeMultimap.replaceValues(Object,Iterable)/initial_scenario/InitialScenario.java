/*
 * This file was automatically generated by EvoSuite
 */

package com.google.common.collect;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.ArrayListMultimap;

public class InitialScenario {

  @Test
  public void test0()  throws Throwable  {
    	TreeMultimap<Integer, String> linkedListMultimap0 = TreeMultimap.create();
		boolean boolean1 = linkedListMultimap0.put(-1698, "pluto");
		boolean boolean2 = linkedListMultimap0.put(123, "asd");
		boolean boolean3 = linkedListMultimap0.put(123, "asd2");
		boolean boolean4 = linkedListMultimap0.put(18, "ginger");
		List<String> list1 = new ArrayList<String>();
		list1.add("adhs8haf8shf8");
		Set<String> list0 = linkedListMultimap0.replaceValues(123, list1);
  }
}
