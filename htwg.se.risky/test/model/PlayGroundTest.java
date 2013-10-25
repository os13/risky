package model;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayGroundTest {	
	
	@Test
	public void testPlayGround() {
		PlayGround pg1 = new PlayGround(2);
		assertEquals(2 , pg1.getAnzPlayer());
	}
}