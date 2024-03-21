import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stand extends Button {
    public void act() {
        if (Greenfoot.mouseClicked(this) && enabled) {
            Table table = (Table) getWorld();
            table.userStands(); // Call the userStands method in Table class
        }
    }
}
