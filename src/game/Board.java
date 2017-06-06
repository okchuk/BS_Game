package game;

public class Board {
	// Board is a Singleton
	private static volatile Board INSTANCE = null;
	
	Player[] players = new Player[2];
	Player activePlayer = players[0];
	
	int fieldCount = 32;
	Field[] fields;
	
	/**
	 * Standard constructor, assigns fields
	 */
	private Board() {
		// TODO Auto-generated constructor stub
		 fields = new Field[fieldCount];
	}
	
	/*private Board(int in_fieldCount) {
		fieldCount = in_fieldCount;
		fields = new Field[fieldCount];
	}*/
	
	public static Board getInstance() {
		if (INSTANCE == null) {
			synchronized(Board.class) {
				if (INSTANCE == null) {
					INSTANCE = new Board();
				}
			}
		}
		return INSTANCE;
	}
	
	/**
	 * Rolls dice
	 * @return Result of random number generation modulo 6
	 */
	public int rollDice() {
		int result = 0;
		// TODO: Randomization here
		return result;
	}

}
