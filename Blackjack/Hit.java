import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hit extends Button {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Table table = (Table) getWorld();
            table.userHits(); // Call the userHits method in Table class
        }
    }
}
