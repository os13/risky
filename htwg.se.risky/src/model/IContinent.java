package model;

public interface IContinent {
	String getContinentName();

	void setExtraUnits(int amountUnits);

	int getExtraUnits();

	void setModifiedCountryFlag(boolean modifiedFlag);

	boolean getModifiedCountryFlag();

	Player checkContinentOwner();

	void setContinentCountrys(Country c);
}