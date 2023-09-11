import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Parent
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 3;
    
    public void act()
    {
        // Add your action code here.
        
        Coin c = new Coin();
        Actor i = getOneIntersectingObject(Coin.class);
        move(speed);
        checkDouble(i);
        end();
    }
}
