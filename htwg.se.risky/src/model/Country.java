package model;

public class Country implements iCountry {
	
	private String name;
	private int amountUnits;
	private Player controlledBy;	
	private Country neigbourCountry[];	
	
	
	
//Methods---------------------------------------------------------------------
	@Override
	public void setCountryName(String name) {
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
		amountUnits -= amount;
	}
	
}
