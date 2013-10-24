package model;

public interface iCountry {
	public void setCountryName(String name);
	public String getCountryName();
	
	public void setControllPlayer(Player cp);
	public Player getControllPlayer ();
	
	public void setUnits(int amount);
	public int getUnits();
	
	public void addUnit (int amount);
	public void removeUnit(int amount);
}
