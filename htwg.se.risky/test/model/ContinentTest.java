package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContinentTest {

	@Test
	public void test() {
		Continent c1 = new Continent("c1");
		assertEquals("c1", c1.getContinentName());

		c1.setExtraUnits(50);
		assertEquals(50, c1.getExtraUnits());

		c1.setModifiedCountryFlag(true);
		assertEquals(true, c1.getModifiedCountryFlag());

		c1.setModifiedCountryFlag(false);
		assertEquals(false, c1.getModifiedCountryFlag());

		Country cy1 = new Country("c1");
		Country cy2 = new Country("c2");
		Country cy3 = new Country("c3");
		Country cy4 = new Country("c4");
		Country cy5 = new Country("c5");

		c1.setContinentCountrys(cy1);
		c1.setContinentCountrys(cy2);
		c1.setContinentCountrys(cy3);
		c1.setContinentCountrys(cy5);
		c1.setContinentCountrys(cy5);

		Player p1 = new Player("Spieler1");
		Player p2 = new Player("Spieler2");

		cy1.setControlPlayer(p1);
		cy2.setControlPlayer(p1);
		cy3.setControlPlayer(p1);
		cy4.setControlPlayer(p1);
		cy5.setControlPlayer(p1);
		assertEquals(p1, c1.checkContinentOwner());

		cy1.setControlPlayer(p2);
		assertEquals(null, c1.checkContinentOwner());
	}
}
