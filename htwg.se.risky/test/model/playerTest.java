package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class playerTest {

	@Test
	public void test() {
		player p1 = new player("test");
		assertEquals("test", p1.getName());
		
		player p2 = new player("hallo Welt!");
		assertEquals("hallo Welt!", p2.getName());
	}

}
