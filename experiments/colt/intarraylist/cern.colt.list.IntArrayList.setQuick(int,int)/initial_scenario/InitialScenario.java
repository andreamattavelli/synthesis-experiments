package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;

public class InitialScenario {
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = new int[5];
    IntArrayList intArrayList0 = new IntArrayList(intArray0);
    intArrayList0.setQuick(4, 109237450);
  }
}
