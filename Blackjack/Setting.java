import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Setting extends Button
{
    String labelText = "";
    Start startButton;
    
    Setting(Start start) {
        startButton = start;
        updateLabel();
    }
    
    public void updateLabel() {
        if (this.labelText == "Gametype:    Basic") {
            this.labelText =  "Gametype: Advanced";
        }
        else
            this.labelText = "Gametype:    Basic";
        setImage(new GreenfootImage( this.labelText, 24, Color.WHITE, new Color( 0, 0, 0, 0 )));    
    }

    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            updateLabel();
            startButton.updateDifficulty();
        }
    }
}
