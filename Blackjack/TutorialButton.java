import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialButton extends Button
{
    String labelText;
    
    TutorialButton() {
        updateLabel("Tutorial");
    }
    
    public void updateLabel(String text) {
        this.labelText = text;
        setImage(new GreenfootImage( this.labelText, 36, Color.WHITE, new Color( 0, 0, 0, 0 )));    
    }

    public void act()
    {
        if (Greenfoot.mouseClicked(this) && enabled) {
            Tutorial tutorial = new Tutorial(getWorld());
            
            Greenfoot.setWorld(tutorial);
        }
    }
}
