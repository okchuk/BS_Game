package game;

/**
 * <p>Base abstract class for objects within the game except for the board</p>
 * <p><b>Member variables: </b></p>
 * <p><b>board:</b> Reference to Board where the GameObject is located.
 * <p><b>position:</b> Variable for the position on the board (Integer)</p>
 */
public abstract class GameObject {
	
	Board board;
	int position;
	
	public GameObject(int in_position, Board in_board) {
		position = in_position;
		board = in_board;
	}

}
