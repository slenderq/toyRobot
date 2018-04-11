package simulator;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		
		Board board = new Board(5,5); // creating the 5x5 board
		Robot robot = new Robot(board); //creating a robot for the problem
		
		//basic input loop for demo purposes 
		
		while(true) {

		
		String n = reader.nextLine(); // Scans the next token of the input
		
		System.out.println(n); //echo for feedback
		robot.command(n); //give the robot the command
		

		
		
		
		
		}


	}

}
