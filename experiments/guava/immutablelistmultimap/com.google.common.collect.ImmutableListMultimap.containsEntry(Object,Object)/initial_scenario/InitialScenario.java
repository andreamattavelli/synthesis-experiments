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
    	Integer integer0 = 1;
		Integer integer1 = -141097;
		String string0 = "asd";
		String string1 = "asfih91hrda1h,iz";
		ImmutableListMultimap<Integer, String> map = ImmutableListMultimap.of(integer0, string0, integer1, string1);
		boolean boolean0 = map.containsEntry(integer0, string0);
  }
}
