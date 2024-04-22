import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleDown extends Button {
    boolean pressed = false;
    
    public void act() {
        if (Greenfoot.mouseClicked(this) || (Greenfoot.isKeyDown("right") && !pressed) && enabled) {
            pressed = true;
            Table table = (Table) getWorld();
            table.userDoubles(); // Call the userDoubles method in Table class
        }
        if (!Greenfoot.isKeyDown("right")) {
            pressed = false;
        }
    }
}
