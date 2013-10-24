package model;

import static org.junit.Assert.*;
import org.junit.Test;

public class CountryTest {

	@Test
	public void test() {
		Country c1 = new Country("c1");
		assertEquals("c1",c1.getCountryName());
		
		Player p1 = new Player("p1");
		c1.setControllPlayer(p1);
		assertEquals(p1, c1.getControllPlayer());
		
		c1.setUnits(10);
		assertEquals(10,c1.getUnits());
		
		c1.addUnit(5);
		assertEquals(15, c1.getUnits());
		
		c1.removeUnit(5);
		assertEquals(10,c1.getUnits());
		
		c1.removeUnit(20);
		assertEquals(0,c1.getUnits());
		
		Country c2 = new Country("c2");
		Country c3 = new Country("c3");
		c1.setNeighbour(c2);
		assertTrue(c1.isNeighbourOf(c2));
		assertFalse(c1.isNeighbourOf(c3));
		
	}
}
