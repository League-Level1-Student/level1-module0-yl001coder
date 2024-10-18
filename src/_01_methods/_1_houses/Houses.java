package _01_methods._1_houses;
import org.jointheleague.graphical.robot.*;
import java.util.Random;
import java.awt.Color;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	Random rand = new Random();
	public void run() {
		Robot.setWindowColor(0,0,0);
		rob.penUp();
		rob.hide();
		rob.setSpeed(100);
		rob.setPenWidth(5);
		rob.moveTo(3, 400);
		rob.penDown();
		for(int i = 0; i<9; i++)
		{
		drawHouse(60 + (rand.nextInt(251)),new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
		}
	}
	public void drawHouse(int height, Color color) {
		// Check the recipe to find out what code to put here
		rob.setSpeed(5);
		rob.setPenWidth(5);
		rob.setPenColor(color);
		rob.move(height); 
		if(height<250)
		{
			pointyRoof();
		}
		else
		{
			flatRoof();
		}
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(50,100,45);
		rob.move(35);
		rob.turn(-90);
		//150,100,100 make a purple color thing
		//600,28,88 make a reddish color
		//545,28,2342 make a neon pink
		//50,100,45 make green
	}
	public void drawHouse(String size, Color color)
	{
		if(size.equals("small"))
		{
			drawHouse(60,color);
		}
		if(size.equals("medium"))
		{
			drawHouse(120,color);
		}
		if(size.equals("large"))
		{
			drawHouse(250,color);
		}
	}
	public void pointyRoof()
	{
		rob.turn(45); 
		rob.move(40); 
		rob.turn(90);
		rob.move(40);
		rob.turn(45);
	}
	public void flatRoof()
	{
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
	}
}
