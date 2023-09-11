import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ambulance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambulance extends Actor
{
    /**
     * Act - do whatever the Ambulance wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    int lives = 3;
    
    public void act()
    {
        // Add your action code here.
        
        getWorld().showText("Score: " + score, 70, 30);
        getWorld().showText("Lives: " + lives, 200, 30);
        checkKey();
        end();
        addScore();
    }    
    public void checkKey ()
    {
        
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);
        }        
        if (Greenfoot.isKeyDown("left"))
        {
            if (getX() >= 90)
            {
                setLocation(getX()-2,getY());
            }
        }
        if (Greenfoot.isKeyDown("right"))
        {
            if (getX() <= 510 )
            {
                setLocation(getX()+2,getY());
            }
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 2);
        }
    }
    
    public void end()
    {
        if (isTouching(CarBlue.class))
        {
            lives--;
            removeTouching(CarBlue.class);
            if (lives <= 0)
            {
                getWorld().showText("GAME OVER \n Score: " + score, 300, 300);
                Greenfoot.stop();
            }
        }
        
        if (isTouching(CarRed.class))
        {
            lives--;
            removeTouching(CarRed.class);
            if (lives <= 0)
            {
                getWorld().showText("GAME OVER \n Score: " + score, 300, 300);
                Greenfoot.stop();
            }
        }
    }
    
    public void addScore()
    {
        if (isTouching(Coin.class))
        {
            score = score + 20;
            removeTouching(Coin.class);
        }
    }
}
