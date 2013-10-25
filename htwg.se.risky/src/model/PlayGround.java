package model;

public class PlayGround {
	private Player players[];
	private int amountPlayers;

	public PlayGround(int anzPlayer) {
		this.amountPlayers = anzPlayer;
		players = new Player[this.amountPlayers];
	}

	public int getAnzPlayer() {
		return this.amountPlayers;
	}
}