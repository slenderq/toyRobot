package simulator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RobotTest {
	Board board = new Board(5,5);
	Robot robot = new Robot(board);

	
	@Test
	void testBadPlace() { //testing if out of bound placements work
		robot.command("6,6,WEST"); //placing in the top left corner
		assertEquals(false,robot.isPlaced());
	}
	@Test
	void testPlaceRobot() { //testing to see if the robot is placing correctly and if the report function works
		robot.placeRobot(0, 0, "NORTH"); 
		assertEquals("NORTH",robot.direction);
		assertEquals(0,robot.posX);
		assertEquals(0,robot.posY);
	}
	

	
	@Test
	void testCommand() { //testing to see if the commands actually work
		robot.command("PLACE 0,0,NORTH");
		robot.command("MOVE");
		robot.command("LEFT");
		robot.command("RIGHT");
		assertEquals("0,1,NORTH",robot.report());
	}
	
	
	@Test
	void testNoCommandUntilPlace() { //testing to see if the robot waits until it is placed before if take commands
		robot.command("MOVE");
		robot.command("LEFT");
		robot.command("RIGHT");
		robot.command("PLACE 0,0,NORTH");
		assertEquals("0,0,NORTH",robot.report());
	}

	@Test
	void testReport() {
		robot.placeRobot(0, 0, "NORTH"); 
		assertEquals("0,0,NORTH",robot.report());
	}

	@Test
	void testMove() {
		robot.placeRobot(0, 0, "NORTH"); 
		robot.move();
		assertEquals("0,1,NORTH",robot.report());
				
		
	}
	
	
	@Test
	void testMoveEast() {
		robot.placeRobot(3, 3, "EAST"); 
		robot.move();
		assertEquals("4,3,EAST",robot.report());
				
		
	}
	
	@Test
	void testMoveSouth() {
		robot.placeRobot(3, 3, "SOUTH"); 
		robot.move();
		assertEquals("3,2,SOUTH",robot.report());
				
		
	}
	
	@Test
	void testMoveWest() {
		robot.placeRobot(3, 3, "WEST"); 
		robot.move();
		assertEquals("2,3,WEST",robot.report());
				
		
	}
	
	@Test
	void testFailedMove() { //Does the robot walk off the board?
		robot.placeRobot(0, 4, "WEST"); //placing in the top left corner
		robot.move(); //trying to move into negative coordinates
		robot.turnRight(); //face west
		robot.move(); //trying to move past 5
		assertEquals("0,4,NORTH",robot.report());
	}
	
	@Test
	void testIsPlaced() {
		assertEquals(robot.isPlaced(),false);
		robot.placeRobot(0, 4, "WEST"); //placing in the top left corner
		assertEquals(robot.isPlaced(),true);	
	}
	
	@Test
	void testDoublePlace() { //testing if you can place twice
		robot.placeRobot(4, 4, "WEST"); 
		robot.placeRobot(0, 0, "WEST"); 
		assertEquals("0,0,WEST",robot.report());
	}


	@Test
	void testTurnLeft() { 
		robot.placeRobot(0, 0, "NORTH");
		//spin the robot 360 to see if it is spinning
		
		robot.turnLeft();
		assertEquals("0,0,WEST",robot.report());
		
		robot.turnLeft();
		assertEquals("0,0,SOUTH",robot.report());
		
		robot.turnLeft();
		assertEquals("0,0,EAST",robot.report());
		
		robot.turnLeft();
		assertEquals("0,0,NORTH",robot.report());
	
	
	}

	@Test
	void testTurnRight() {
		robot.placeRobot(0, 0, "NORTH"); 
		//spin the robot 360
		
		robot.turnRight();
		assertEquals("0,0,EAST",robot.report());
		
		robot.turnRight();
		assertEquals("0,0,SOUTH",robot.report());
		
		robot.turnRight();
		assertEquals("0,0,WEST",robot.report());
		
		robot.turnRight();
		assertEquals("0,0,NORTH",robot.report());
	}

	@Test
	void testOnBoard() {
		assertEquals(board.onBoard(4, 4),true);
		assertEquals(board.onBoard(4, 10),false);
		assertEquals(board.onBoard(-4, 4),false);
		assertEquals(board.onBoard(6,6),false);
	}
}
