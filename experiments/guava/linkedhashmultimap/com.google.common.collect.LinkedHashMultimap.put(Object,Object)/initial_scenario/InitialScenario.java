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
    	LinkedHashMultimap<Integer, String> linkedListMultimap0 = LinkedHashMultimap.create();
		Integer integer0 = new Integer(234);
		List<String> list0 = new ArrayList();
		list0.add("pippo");
		boolean boolean0 = linkedListMultimap0.putAll(integer0, list0);
		Integer integer3 = new Integer(-1698);
		String string0 = "pluto";
		boolean boolean3 = linkedListMultimap0.put(integer3, string0);
  }
}
