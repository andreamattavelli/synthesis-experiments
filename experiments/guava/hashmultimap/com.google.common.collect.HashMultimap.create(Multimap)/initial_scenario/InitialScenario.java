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
		arrayListMultimap0.put(0, "pippo");
		arrayListMultimap0.put(1, "pluto");
		HashMultimap<Integer, String> linkedListMultimap0 = HashMultimap.create(arrayListMultimap0);
  }
}
