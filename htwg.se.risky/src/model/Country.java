package model;

import java.util.ArrayList;
import java.util.List;

public class Country implements ICountry {
	private final String name;
	private int amountUnits;
	private Player controlledBy;	
	private List<Country> neightbourCountry= new ArrayList<Country>();

	public Country (String name) {
		this.name = name;
		erstelleLand();
	}

	public void erstelleLand() {
		
	}
	
	@Override
	public String getCountryName() {
		return name;
	}

	@Override
	public void setControllPlayer(Player cp) {
		this.controlledBy = cp;
	}

	@Override
	public Player getControllPlayer() {
		return controlledBy;
	}

	@Override
	public void setUnits(int amount) {
		amountUnits = amount;
	}

	@Override
	public int getUnits() {
		return amountUnits;
	}

	@Override
	public void addUnit(int amount) {
		amountUnits += amount;		
	}

	@Override
	public void removeUnit(int amount) {
		if (amountUnits - amount <= 0) {
			amountUnits = 0;
		} else {
			amountUnits -= amount;
		}		
	}

	@Override
	public void setNeighbour(Country c) {
		if(this.neightbourCountry.size() < 8)
			this.neightbourCountry.add(c);
		else
			throw new IndexOutOfBoundsException();
	}

	@Override
	public boolean isNeighbourOf(Country c) {
		if(this.neightbourCountry.contains(c))
			return true;
		return false;
	}
}