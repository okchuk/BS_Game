package game;

public class Field extends GameObject {
	
	Chance chance = null;
	
	public Field(int in_position, Board in_board) {
		super(in_position, in_board);
		// TODO: Field placement on board
	}
	
	public Field(int in_position, Board in_board, Chance in_chance) {
		super(in_position, in_board);
		// TODO: Field placement on board
		chance = in_chance;
	}
	
	// TODO: Placeholder for Field methods

}
