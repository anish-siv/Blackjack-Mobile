import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReturnButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReturnButton extends Button
{
    String labelText;
    World returnTo;
    
    ReturnButton(World returnWorld) {
        returnTo = returnWorld;
        updateLabel("Back");
    }
    
    public void updateLabel(String text) {
        this.labelText = text;
        setImage(new GreenfootImage( this.labelText, 36, Color.ORANGE, new Color( 0, 0, 0, 0 )));    
    }
    
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this) && enabled) {
            Greenfoot.setWorld(returnTo);
        }
    }
}
