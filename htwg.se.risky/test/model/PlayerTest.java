package model;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {
	@Test
	public void test() {
		Player p1 = new Player("test");
		assertEquals("test", p1.getPlayerName());
		
		Player p2 = new Player("hallo Welt!");
		assertEquals("hallo Welt!", p2.getPlayerName());
	}
}
