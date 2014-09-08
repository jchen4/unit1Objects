import java.awt.Color;
import java.util.Random;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle.turnLeft();
        turtle2.turnRight();
        turtle.penDown();
        turtle2.penDown();
        turtle.setPenColor(Color.RED);
        turtle2.setPenColor(Color.GREEN);
        int ctr = 1;
        int ctr2 = 1;
        int r = 180;
        while (r > 0)
        {
            turtle.forward(360/r);
            turtle2.forward(360/r);
            turtle2.turn(r);
            turtle.turn(r);
            ctr = ctr + r;
            r = r-1;
        }
        turtle.penUp();
        turtle2.penUp();
        turtle.moveTo(320,240);
        turtle2.moveTo(320,240);
        turtle.setPenColor(Color.YELLOW);
        turtle2.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle2.penDown();
        ctr = 1;
        ctr2 = 1;
        r = 180;
        while (r > 0)
        {
            turtle.forward(360/r);
            turtle2.forward(360/r);
            turtle2.turn(r);
            turtle.turn(r);
            ctr = ctr + r;
            r = r-1;
        }
    }
}
