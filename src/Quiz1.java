
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a new city called quiz
        City quiz = new City();
        // creating a new robot called bob
        RobotSE bob = new RobotSE(quiz, 4, 0, Direction.EAST);
        // creating "things" for bob to pick up
        new Thing(quiz, 4, 1);
        new Thing(quiz, 3, 2);
        new Thing(quiz, 2, 3);
        new Thing(quiz, 1, 4);
        
        // creating the staircase
        new Wall(quiz, 4, 2, Direction.WEST);
        new Wall(quiz, 4, 2, Direction.NORTH);
        new Wall(quiz, 3, 3, Direction.WEST);
        new Wall(quiz, 3, 3, Direction.NORTH);
        new Wall(quiz, 2, 4, Direction.WEST);
        new Wall(quiz, 2, 4, Direction.NORTH);
        new Wall(quiz, 2, 5, Direction.NORTH);
        new Wall(quiz, 2, 5, Direction.EAST);
        new Wall(quiz, 3, 6, Direction.NORTH);
        new Wall(quiz, 3, 6, Direction.EAST);
        new Wall(quiz, 4, 7, Direction.NORTH);
        new Wall(quiz, 4, 7, Direction.EAST);
        
        // making bob move up the staircase while picking up the "things" on the steps
        
        // bob moves onto "thing" and picks it up
        bob.move();
        bob.pickThing();
        
        // bob goes up 1 step and picks up "thing"
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.pickThing();
        
        // bob goes up 1 step and picks up "thing"
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.pickThing();
        
        // bob goes up 1 step and picks up "thing"
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.pickThing();
        
        // bob will now move down the staircase while dropping 1 "thing" on each step
        
        // bob will move forward and drop 1 "thing"
        bob.move();
        bob.putThing();
        
        // bob will go down a step and drop 1 "thing"
        bob.move();
        bob.turnRight();
        bob.move();
        bob.putThing();
        
        // bob will go down a step and drop 1 "thing"
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.putThing();
        
        // bob will go down a step and drop 1 "thing"
        bob.turnLeft();
        bob.move();
        bob.turnRight();
        bob.move();
        bob.putThing();
        
        // bob moves off final "thing" and comes to a stop
        bob.turnLeft();
        bob.move();
    }
}
