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
	
	
	public Robot(Board board) { //Constructor. Takes in a the direction of the robot and the coordinates 
		this.board = board;
	}
	
	boolean isPlaced() { //function for clarity 
		return (direction != null);
	}
	
	void placeRobot(int x , int y, String direction) { //places robot on the board 
		this.direction = direction;
		this.posX = x;
		this.posY = y;
	}
	

	
	void command(String str) { //This takes in string commands and does the action
		
	}
	
	
	String report() { //reports the current status of the robot
		return "";
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
