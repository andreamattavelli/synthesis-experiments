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
    	HashMultiset<Integer> hashMultiset0 = HashMultiset.create();
		Integer integer0 = new Integer(-18247);
		Integer integer1 = new Integer(34);
		Integer integer2 = new Integer(0);
		int boolean0 = hashMultiset0.add(integer0, 12);
		int boolean1 = hashMultiset0.add(integer1, 77);
		int boolean2 = hashMultiset0.add(integer2, 90);
		boolean boolean3 = hashMultiset0.remove(integer1);
  }
}
