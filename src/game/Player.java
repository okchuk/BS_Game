package game;

public class Player extends GameObject {
	
	Field currentField;
	
	public Player(Board in_board) {
		super(0, in_board);
		// TODO Auto-generated constructor stub
	}
	
	protected void movement(int steps) {
		currentField = board.movePlayer(this, steps);
		if(currentField.chance != null) {
			movement(currentField.chance.activatedAction());
		}
	}

}
