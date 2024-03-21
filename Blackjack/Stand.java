import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stand extends Button
{
    /**
     * Act - do whatever the Stand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        Table world = (Table) getWorld();
        
        if ( Greenfoot.mouseClicked(this) && !world.isGameOver() )
        {
            stand();
        }
    }
    
    /**
     * Stand at the current score, when the player hits the stand button.
     */
    private void stand()
    {
        Table world = (Table) getWorld();
        world.switchTurn();
    }
}
