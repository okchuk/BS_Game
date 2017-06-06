package game;

public class Board {
	// Board is a Singleton
	private static volatile Board INSTANCE = null;
	
	Player[] players = new Player[2];
	Player activePlayer = players[0];
	
	int fieldCount = 32;
	Field[] fields;
	
	// TODO: List/Array of Chances
	
	/**
	 * Standard constructor, assigns fields
	 */
	private Board() {
		 fields = new Field[fieldCount];
		 // TODO: Assignment of Chance fields
		 // i.e. fields[3].chance = new ForwardChance(4, this, 5);
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
	
	public Field movePlayer(Player in_player, int in_amount) {
		Field newField = null;
		// TODO: Move logic on Board
		return newField;
	}
}
