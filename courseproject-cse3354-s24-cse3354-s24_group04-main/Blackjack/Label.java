import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    String labelText;
    
    Label(String labelText)
    {
        this.labelText = labelText;
        setLabelImage();
    }
    
    void updateLabel(String labelText)
    {
        this.labelText = labelText;
        setLabelImage();
    }
    
    void setLabelImage()
    {
        setImage(  new GreenfootImage( this.labelText, 24, Color.WHITE, new Color( 0, 0, 0, 0 ) ));
    }
    
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
