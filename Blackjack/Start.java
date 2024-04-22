import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Button
{
    
    String labelText;
    
    Start() {
        updateLabel("Start");
    }
    
    public void updateLabel(String text) {
        this.labelText = text;
        setImage(new GreenfootImage( this.labelText, 36, Color.WHITE, new Color( 0, 0, 0, 0 )));    
    }
    
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this) && enabled) {
            Table table = new Table();
            Greenfoot.setWorld(table);
        }
    }
}
