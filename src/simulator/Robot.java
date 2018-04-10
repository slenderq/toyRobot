/*
 * 	The Class for the Toy Robot 
 * 
 *  Justin Quaintance 
 */

package simulator;

public class Robot { 
	String direction; //Direction the Robot is facing, possible values: west,east,north,south
	int posX; //X position of the robot on the board
	int posY; //Y position of the robot on the board
	Board board;
	
	
	public Robot(int x , int y, String direction,Board board) { //Constructor. Takes in a the direction of the robot and the coordinates 
		this.direction = direction;
		this.posX = x;
		this.posY = y;
		this.board = board;
	}
	
	public String getDirection() { //Getter
		return direction;
	}
	
	
	void move() { //Moves the Robot in the correct direction
		//TODO
	}
	
	void turnLeft() { //Turns the robot left
		//TODO
	}
	void turnRight() {//Turns the robot right
		//TODO
	}
	

	
	
}
