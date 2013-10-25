package model;

public class Country implements ICountry {
	private final String name;
	private int amountUnits;
	private Player controlledBy;	
	private Country neighbourCountry[];	
	
	public Country (String name) {
		this.name = name;
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
		neighbourCountry[neighbourCountry.length - 1] = c;		
	}
	
	@Override
	public boolean isNeighbourOf(Country c) {
		for (int i = 0; i < neighbourCountry.length; i++) {
			if (neighbourCountry[i] == c) {
				return true;
			}
		}
		return false;
	}
}