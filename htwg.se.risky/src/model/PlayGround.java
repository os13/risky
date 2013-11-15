package model;

public class PlayGround {
	private Player players[];
	private int amountPlayers;

	public PlayGround(int anzPlayer) {
		this.amountPlayers = anzPlayer;
		players = new Player[this.amountPlayers];

		for (int i = 0; i < this.amountPlayers; i++) {
			this.players[i] = new Player("Player" + (i + 1));
		}
	}

	public int getAnzPlayer() {
		return this.amountPlayers;
	}
}