package _01_methods._5_FlappyBird;
import java.util.Random;
import processing.core.PApplet;

public class FlappyBird extends PApplet {
	Random random = new Random();
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int yVelocity = -5;
    int y = 300;
    int x = 100;
    int upperPipeY = random.nextInt(250);
    int pipeX = 799;
    int gravity = 1;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        
    }

    @Override
    public void draw() {
    	background(52,161,235);
    	fill(235,122,52);
    	stroke(235, 122, 52);
    	ellipse(x,y, 40, 40);
    	yVelocity = yVelocity + gravity;
    	y = y - yVelocity;
    	fill(53, 194, 25);
    	rect(pipeX,upperPipeY,250,85);
    	pipeX--;
    	if(pipeX >= 0)
    	{
    		pipeX = 799;
    	}
    	if(mousePressed)
    	{
    		yVelocity = 10;
    	}
    	else
    	{
    		yVelocity = -5;
    	}
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
