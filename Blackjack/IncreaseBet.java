import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Stand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IncreaseBet extends Button {
    boolean pressed = false;
    
        public void act() {
        if (Greenfoot.mouseClicked(this) || (Greenfoot.isKeyDown("down") && !pressed) && enabled) {
            pressed = true;
            Table table = (Table) getWorld();
            table.userIncreasesBet(); // Call the userIncreasesBet() method in Table class
        }
        if (!Greenfoot.isKeyDown("down")) {
            pressed = false;
        }
    }
}
