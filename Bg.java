import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bg extends World
{

    /**
     * Constructor for objects of class Bg.
     * 
     */
    public Bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        prepare();
    }
    
    private void prepare()
    {
        Ambulance ambulance = new Ambulance();
        addObject(ambulance, 307, 557);
    }
    
    public void act () 
    {
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new CarBlue(), Greenfoot.getRandomNumber(480) + 90, 0);
        }
        if (Greenfoot.getRandomNumber(500) < 1)
        {
            addObject(new CarRed(), Greenfoot.getRandomNumber(480) + 90, 600);
        }
        if (Greenfoot.getRandomNumber(10) < 2)
        {
            addObject(new Tree(), Greenfoot.getRandomNumber(50), 0);
            addObject(new Tree(), Greenfoot.getRandomNumber(50) + 550 , 0);
        }        
        if (Greenfoot.getRandomNumber(300) < 1)
        {
            addObject(new Coin(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
    }

}
