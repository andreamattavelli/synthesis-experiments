/*
* File contenente lo scenario iniziale, generato manualmente
*
*/

package org.apache.commons.collections.primitives;
import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.primitives.ArrayCharList;

public class InitialScenario{

  @Test
  public void test0()  throws Throwable  {

	ArrayCharList collection0 = new ArrayCharList();
	ArrayCharList argumentCollection = new ArrayCharList();
	Character char0 = new Character('m');
	Character char1 = new Character('o');
	Character char2 = new Character('x');
	boolean add0 = argumentCollection.add(char0);
	boolean add1 = argumentCollection.add(char1);
	boolean add2 = argumentCollection.add(char2);
	boolean addAll0 = collection0.addAll(argumentCollection);
  }
}
