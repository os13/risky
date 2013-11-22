package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//import org.junit.Rule;
import org.junit.Test;

public class DiceTest {

	@Test
	public void testDice() {
		Dice dc = new Dice();
		assertFalse(dc.setmm(5, 1));
		assertTrue(dc.setmm(1, 1));
		assertEquals("1", dc.roll());

	}

}
