package model;

import java.util.ArrayList;
import java.util.List;

public class Continent implements IContinent {
	private final String continentName;
	private int extraUnits;
	boolean modifiedCountryFlag;
	private List<Country> continentCountrys = new ArrayList<Country>();

	public Continent(String continentName) {

		this.continentName = continentName;
	}

	@Override
	public String getContinentName() {
		return this.continentName;
	}

	@Override
	public void setExtraUnits(int amountUnits) {
		this.extraUnits = amountUnits;

	}

	@Override
	public int getExtraUnits() {
		return this.extraUnits;
	}

	@Override
	public void setModifiedCountryFlag(boolean modifiedFlag) {
		this.modifiedCountryFlag = modifiedFlag;

	}

	@Override
	public boolean getModifiedCountryFlag() {
		return this.modifiedCountryFlag;
	}

	@Override
	public void setContinentCountrys(Country c) {
		this.continentCountrys.add(c);
	}

	@Override
	public Player checkContinentOwner() {
		Country c = this.continentCountrys.get(0);
		Player p = c.getControlPlayer();

		Country tmpCountry;
		Player tmpPlayer;

		for (int i = 0; i < this.continentCountrys.size(); i++) {
			tmpCountry = this.continentCountrys.get(i);
			tmpPlayer = tmpCountry.getControlPlayer();
			if (tmpPlayer != p) {
				return null;
			}
		}
		return p;
	}
}