import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hit extends Button {
    boolean pressed = false;
    
    public void act() {
        if ((Greenfoot.mouseClicked(this) || (Greenfoot.isKeyDown("up") && !pressed) && enabled)) {
            pressed = true;
            Table table = (Table) getWorld();
            table.userHits(); // Call the userHits method in Table class
        }
        if (!Greenfoot.isKeyDown("up")) {
            pressed = false;
        }
    }
}
