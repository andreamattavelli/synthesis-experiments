package colt;

import org.junit.Test;

import cern.colt.list.BooleanArrayList;

public class InitialScenario {
	@Test(timeout = 4000)
	public void test0() throws Throwable {
		boolean[] booleanArray0 = new boolean[7];
		booleanArray0[2] = true;
		booleanArray0[3] = true;
		BooleanArrayList booleanArrayList0 = new BooleanArrayList(booleanArray0);
		int int0 = booleanArrayList0.size();
	}
}
