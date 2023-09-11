import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarBlue extends Parent
{
    /**
     * Act - do whatever the CardBlue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 3;
    public void act()
    {
        CarBlue cb = new CarBlue();
        Actor i = getOneIntersectingObject(CarBlue.class);
        // Add your action code here.
        move(speed);
        checkDouble(i);
        end();
    }
}
