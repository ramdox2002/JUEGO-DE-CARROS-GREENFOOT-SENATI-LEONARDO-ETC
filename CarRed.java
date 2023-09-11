import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardRed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarRed extends Parent
{
    /**
     * Act - do whatever the CardRed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = -5;
    
    public void act()
    {
        // Add your action code here.
        CarRed cr = new CarRed();
        Actor i = getOneIntersectingObject(CarBlue.class);
        move(speed);
        checkDouble(i);
        end();
    }
    
    public void removeCarBlue ()
    {
        if (isTouching(CarBlue.class))
        {
            removeTouching(CarBlue.class);
        }
    }
}
