import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Result here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Result extends Button
{
    /**
     * Act - do whatever the Result wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    String labelText;
    
    Result() {
        updateLabel("");
    }
    
    public void updateLabel(String text) {
        this.labelText = text;
        setImage(new GreenfootImage( this.labelText, 24, Color.WHITE, new Color( 0, 0, 0, 0 )));    
    }
    
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this) && enabled) {
            Table table = (Table) getWorld();
            table.resetRound(); // Call the userStands method in Table class
            updateLabel("");
        }
    }
}
