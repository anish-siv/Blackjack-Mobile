import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
    int value;
    String imgTitle;
    
    Card(int cardNum) {
        value = cardNum % 13;  
        if (value == 1) {
            imgTitle = "CardAce.png";
        }
        else if (value == 11) {
            imgTitle = "CardJack.png";
            value = 10;
        }
        else if (value == 12) {
            imgTitle = "CardQueen.png";
            value = 10;
        }
        else if (value == 0) {
            imgTitle = "CardKing.png";
            value = 10;
        }
        else {
            imgTitle = "Card" + value + ".png";
        }
        this.setImage(imgTitle);
    }
    
    /**
     * Act - do whatever the Card wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
