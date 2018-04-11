package simulator;

public class Board {
	int[][] board; // 2d array for the board


	public Board(int xSize, int ySize) {
		this.board = new int[xSize][ySize];
	}
	
	
	boolean onBoard(int x, int y) { //a helper function that checks if a position is on the board
		
		if (x < 0 || x > (board.length - 1)) { //checking if x is out of bounds
			return false;
		}else if (y < 0 || y > (board[0].length - 1)) { //checking if y is out of bounds
			return false;
		}
		
		return true; 
	}
	
}
