package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class playerTest {
	@Test
	public void test() {
		Player p1 = new Player("test");
		assertEquals("test", p1.getPlayerName());

		Player p2 = new Player("hallo Welt!");
		assertEquals("hallo Welt!", p2.getPlayerName());

		Country c1 = new Country();
		c1.addUnit(30);

		Country c2 = new Country();
		c2.addUnit(15);

		p1.setAmountAvailableUnits(10);
		p2.setAmountAvailableUnits(20);

		assertEquals(10, p1.getAmountAvailableUnits());
		assertEquals(20, p2.getAmountAvailableUnits());

		p1.decAvailableUnit();
		p1.decAvailableUnit();
		p1.decAvailableUnit();
		p1.decAvailableUnit();
		p1.decAvailableUnit();

		p2.decAvailableUnit();
		p2.decAvailableUnit();

		assertEquals(5, p1.getAmountAvailableUnits());
		assertEquals(18, p2.getAmountAvailableUnits());

		p1.moveUnits(c1, c2, 5);
		
		assertEquals(25, c1.getUnits());
		assertEquals(20, c2.getUnits());
	}
}