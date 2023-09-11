import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Loading here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loading extends World
{

    /**
     * Constructor for objects of class Loading.
     * 
     */
    public Loading()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        addObject(new PlayGame(), getWidth() / 2, getHeight() / 2); // Agregar un botón de juego

    }
}
