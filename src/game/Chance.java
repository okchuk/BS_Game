package game;

public abstract class Chance extends GameObject {
	
	int modifier;
	Field field;
	
	public Chance(int in_position, Board in_board, int in_modifier) {
		super(in_position, in_board);
		modifier = in_modifier;
	}
	
	public abstract int activatedAction();
}
