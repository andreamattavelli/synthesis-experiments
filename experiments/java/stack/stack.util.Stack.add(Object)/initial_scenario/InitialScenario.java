/*
 * This file was automatically generated by EvoSuite
 */

package stack.util;

import static org.junit.Assert.*;
import org.junit.Test;
import stack.util.Stack;

public class InitialScenario {

  @Test
  public void test0()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      Integer integer0 = new Integer(234);
      Integer integer1 = new Integer(55);
      Integer integer2 = new Integer(2);
      Integer integer3 = stack0.push(integer0);
      Integer integer4 = stack0.push(integer1);
      Integer integer5 = stack0.push(integer2);
      Integer integer6 = new Integer(-1698);
      boolean boolean1 = stack0.add(integer6);
  }
}
