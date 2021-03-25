package test;

import org.junit.Test;

import maven.GoodBye;

public class GoodByeTest {

	@Test
	public void test() {
		GoodBye goodbye = new GoodBye();
		assert(goodbye.isAlive());
	}

}
