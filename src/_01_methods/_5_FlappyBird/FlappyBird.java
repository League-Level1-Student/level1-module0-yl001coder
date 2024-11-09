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
    int pipeX = 600;
    int pipeY = random.nextInt(200);
    int pipeGap = 80;
    int pipex = 600;
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
    	fill(53, 194, 25);
    	stroke(53,194,25);
    	pipex = pipex - 5;
    	rect(pipex,0,84,200);
    	rect(pipex,(600-pipeGap), 84,200);
    	if(pipex == 0) {
    	pipex = 800;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
