package org.graphstream.graph.implementations;

import static org.junit.Assert.*;
import org.junit.Test;
import org.graphstream.graph.implementations.AbstractNode;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.graph.implementations.MultiNode;

public class MultiNodeEvoSuiteTest {

  @Test
  public void test0()  throws Throwable  {
      MultiGraph multiGraph0 = new MultiGraph("graph", true, true);
	  MultiNode node = multiGraph0.addNode("aNode");
	  Object[] ob = new Object[]{325, "a possible value", 42000};
	  node.addAttribute("value", ob);
	  Object[] attrs = node.getAttribute("value");
  }
}
