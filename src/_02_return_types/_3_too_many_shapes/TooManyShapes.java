package _02_return_types._3_too_many_shapes;


import javax.swing.JFrame;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class TooManyShapes {
	static Robot rob = new Robot();
	static int e = 0;

	public static void main(String[] args) {
		JFrame frame = new JFrame("text");
		//1. Ask the user how many sides they want their shape to be
		
		//2. Ask the user how many shapes they want
		
		//3. Call canMakeShape() and save what is returned into a variable
		
		//4. If the shape CAN be drawn
		
			//5. Call and save what is returned from calculateTurnAngle()
		
			//6. Use drawPolygons() to draw your shape(s)
		
		//7. If the shape CANNOT be drawn 
			
			//8. Call notEnoughSides() and print out what is returned 
		String sides = "";
		sides = JOptionPane.showInputDialog(frame,"How many sides would you like?");
		int sides2 = Integer.parseInt(sides);
		String shapes = "";
		shapes = JOptionPane.showInputDialog(frame,"Now, how many shapes of each would you like?");
		int shapes2 = Integer.parseInt(shapes);		//canMakeShape(sides);
		if(canMakeShape(sides2) == true)
		{
			calculateTurnAngle(sides2);
			drawPolygons(sides2, shapes2, calculateTurnAngle(sides2));
		}
		else
		{
			notEnoughSides();
		}
	}
	
	static int calculateTurnAngle(int numSides) {
		int angle = 360/numSides;
		return angle;
	}
	
	static void drawPolygons(int numSides, int numShapes, int degrees) {
		rob.setSpeed(100);
		rob.penDown();
		int dist = 25;
		Random rand = new Random();
		
		for(int i = 0; i < numShapes; i++) {
			int x = rand.nextInt(600);
			int y = rand.nextInt(600);
			int angle = rand.nextInt(360);

			rob.setX(x);
			rob.setY(y);
			rob.setAngle(angle);
			rob.setRandomPenColor();
			
			for(int j = 0; j < numSides; j++) {
				rob.move(dist);
				rob.turn(degrees);
			}
	    }
		rob.hide();
	}
	static void getNumberOfSides()
	{
	}
	
	static boolean canMakeShape(int numSides) {
		if(numSides >= 3) {
			return true;
		}
		return false;
	}
	
	static String notEnoughSides() {
		return "I'm sorry we cannot make a shape with that many sides\n"
				+ "Please enter a number greater than 2";
	}
}
