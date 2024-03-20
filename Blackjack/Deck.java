import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck extends Actor
{
    int[] cardList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    String cardName;
    int index;
    /**
     * Act - do whatever the Deck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public Card draw(boolean visible) {
        index = Greenfoot.getRandomNumber(13) + 1;
        Card newCard = new Card(index, visible);
        return newCard;
    }
}
