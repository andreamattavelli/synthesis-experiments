package colt;

import org.junit.Test;

import cern.colt.list.IntArrayList;
import cern.colt.map.OpenIntObjectHashMap;

public class AbstractIntObjectMapTest {
	@Test
	public void test0() throws Throwable {
		OpenIntObjectHashMap openIntObjectHashMap0 = new OpenIntObjectHashMap(
				591);
		boolean boolean0 = openIntObjectHashMap0.put((-117),
				openIntObjectHashMap0);
		openIntObjectHashMap0.put(234263, "asdasf");
		IntArrayList intArrayList0 = openIntObjectHashMap0.keys();
	}
}