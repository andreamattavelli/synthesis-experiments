package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;
import cern.colt.map.OpenIntDoubleHashMap;

public class InitialScenario {
      @Test
      public void test0() throws Throwable {
            OpenIntDoubleHashMap openIntDoubleHashMap0 = new OpenIntDoubleHashMap(1);
            openIntDoubleHashMap0.put(234, 234234.4342);
            openIntDoubleHashMap0.put(245334, 9345.4342);
            openIntDoubleHashMap0.put(245134, 3475.4342);
            openIntDoubleHashMap0.put(253434, 234234.4342);
            openIntDoubleHashMap0.put(2232334, 234234.4342);
            IntArrayList intArrayList0 = new IntArrayList();
            openIntDoubleHashMap0.keysSortedByValue(intArrayList0);
      }
}
