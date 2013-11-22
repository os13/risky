package model;

import static org.junit.Assert.assertEquals;

//import org.junit.Rule;
import org.junit.Test;

public class DiceTest {

	@Test
	public void testDice() {
		Dice dc = new Dice();
		assertEquals("1", dc.roll(1, 1));
		assertEquals(null, dc.roll(5, 1));

	}

}
