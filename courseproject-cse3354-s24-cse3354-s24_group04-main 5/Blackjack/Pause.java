import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pause extends Button
{
    public Pause()
    {
        
    }
    
    // the following is optional
    // remove pop-up when clicked on
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
             Table table = (Table) getWorld(); 
             table.pauseAndResume(); 
             Greenfoot.delay(1000);
        }
        if (Greenfoot.isKeyDown("space"))
        {
             getWorld().removeObject(this);
        }
    }

}
