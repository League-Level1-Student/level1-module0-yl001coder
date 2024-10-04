package _01_methods._1_houses;
import org.jointheleague.graphical.robot.*;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	public void drawHouses() {
		Robot rob = new Robot();
		rob.penUp();
		rob.setSpeed(5);
		rob.setPenWidth(5);
		rob.setPenColor(150,100,100);
	rob.penDown();
		rob.move(90); 
		rob.turn(45); 
		rob.move(60); 
		rob.turn(90);
		rob.move(60);
		rob.turn(45);
		rob.move(90);
		rob.turn(-90);
		rob.setPenColor(50,100,45);
		rob.move(30);
		rob.turn(-90);
		rob.setPenColor(545,28,2342);
		rob.move(150);
		rob.turn(90);
		rob.move(60);
		rob.turn(90);
		rob.move(150);
		rob.turn(-90);
		rob.setPenColor(50,100,45);
		rob.move(100);
	}
	public void run() {
		// Check the recipe to find out what code to put here
		Robot rob = new Robot();
		rob.hide();
		rob.setSpeed(5);
		rob.setPenWidth(5);
		rob.setPenColor(150,100,100);
		//150,100,100 make a purple color thing
		//600,28,88 make a reddish color
		//545,28,2342 make a neon pink
		//50,100,45 make green
	}
}
