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
    	TreeMultiset<Integer> treeMultiset0 = TreeMultiset.create();
		Integer integer0 = new Integer(-18247);
		Integer integer1 = new Integer(34);
		Integer integer2 = new Integer(0);
		boolean boolean0 = treeMultiset0.add(integer0);
		boolean boolean1 = treeMultiset0.add(integer1);
		boolean boolean2 = treeMultiset0.add(integer2);
		List<Integer> arrayList0 = new ArrayList();
		arrayList0.add(34);
		boolean boolean3 = treeMultiset0.removeAll(arrayList0);
  }
}
