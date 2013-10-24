package model;

public interface ICountry {
	
	public String getCountryName();
	
	public void setControllPlayer(Player cp);
	public Player getControllPlayer ();
	
	public void setUnits(int amount);
	public int getUnits();
	
	public void addUnit (int amount);
	public void removeUnit(int amount);
	
	public void setNeighbour(Country c);
	public boolean isNeighbourOf(Country c);
}
