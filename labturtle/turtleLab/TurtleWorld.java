import java.awt.Color;
import java.util.Random;

public class TurtleWorld
{
    public static void main(String args[])throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle.setShellColor(Color.BLUE);
        turtle2.setShellColor(Color.RED);
        turtle.turnLeft();
        turtle2.turnRight();
        turtle.penDown();
        turtle2.penDown();
        turtle.setPenColor(Color.BLACK);
        turtle2.setPenColor(Color.BLACK);
        int ctr = 1;
        int ctr2 = 1;
        int r = 180;
        int sleepv = 1;
        while (r > 0)
        {
            turtle.forward(360/r);
            turtle2.forward(360/r);
            turtle2.turn(r);
            turtle.turn(r);
            ctr = ctr + r;
            r = r-1;
            Thread.sleep(sleepv);
            sleepv = sleepv+1;   
        }
            turtle.penUp();
        turtle2.penUp();
        turtle.moveTo(320,240);
        turtle2.moveTo(320,240);
        turtle.penDown();
        turtle2.penDown();
        ctr = 1;
        ctr2 = 1;
        r = 180;
        sleepv = 1;
        while (r > 0)
        {
            turtle.forward(360/r);
            turtle2.forward(360/r);
            turtle2.turn(r);
            turtle.turn(r);
            ctr = ctr + r;
            r = r-1;
            Thread.sleep(sleepv);
            sleepv = sleepv+1;
        }
        turtle.penUp();
        turtle2.penUp();
        turtle.moveTo(320,240);
        turtle2.moveTo(320,240);
        while (r != 283284)
        {
            turtle.turn(18);
            turtle2.turn(18);
            Thread.sleep(100);
            turtle.forward(20);
            turtle2.forward(20);
        }
    }
}