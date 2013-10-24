package model;

import static org.junit.Assert.*;
import org.junit.Test;

public class playGroundTest {	
	
	@Test
	public void testPG() {
		PlayGround pg1 = new PlayGround(10);
		assertEquals(10 , pg1.getAnzPlayer());
	}
}
