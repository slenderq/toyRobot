/*
 * 	The Class for the Toy Robot 
 * 
 *  Justin Quaintance 
 */

package simulator;

public class Robot { 
	String direction; //Direction the Robot is facing, possible values: NORTH,EAST,SOUTH,WEST
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
		
		String[] strStart = str.split("\\s+"); //splitting on space so we can just get the first part	
		
		
		if (strStart[0].equals("PLACE")) { //if the first part of the command is "PLACE"
			//this means that we are dealing with a placement of a robot
			
			//get arguments of command
			String[] strArgs = strStart[1].split(","); //grabbing the right hand side of the input and splitting it
			
			//grabbing the values
			int x =  Integer.parseInt(strArgs[0]); 
			int y =  Integer.parseInt(strArgs[1]);
			String dir = strArgs[2];
			
			
			//making sure the direction is properly formed
			if (dir.equals("NORTH") || dir.equals("WEST") || dir.equals("SOUTH") || dir.equals("EAST") ) {
				
				//checking if the x and y are on the board
				if (board.onBoard(x,y)) {
					//when we are sure it is a valid place command
					placeRobot(x ,y, dir); //place the actual robot
				}
			}
			
			
		}
		else if (isPlaced()){ //if the command is something different then only continue if the robot is place
			if (strStart[0].equals("LEFT")) { //left command
				turnLeft();
			}
			else if (strStart[0].equals("RIGHT")) { //right command
				turnRight();
			}
			else if (strStart[0].equals("MOVE")) { //move command
				move();
			}
			else if (strStart[0].equals("REPORT")) { //Report command
				System.out.println(report());
			}
			
		}
	}
	
	
	String report() { //reports the current status of the robot
			return posX + "," + posY + "," + direction;
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
