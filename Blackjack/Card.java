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
    String faceValue;
    boolean visible;
    
    Card(int cardNum, boolean visible) {
        visible = visible;
        value = cardNum % 13;  
        if (value == 1) {
            imgTitle = "CardAce.png";
            faceValue = "A";
        }
        else if (value == 11) {
            imgTitle = "CardJack.png";
            faceValue = "J";
        }
        else if (value == 12) {
            imgTitle = "CardQueen.png";
            faceValue = "Q";
        }
        else if (value == 0) {
            imgTitle = "CardKing.png";
            faceValue = "K";
        }
        else {
            imgTitle = "Card" + value + ".png";
            faceValue = Integer.toString(value);
        }
        if (visible) {
            this.setImage(imgTitle);
        } else {
            this.setImage("CardBack.png");
        }
    }
    
    public String getValue() {
        return faceValue;
    }
    
    public boolean isVisible() {
        return visible;
    }
    
    public void showCard() {
        visible = true;
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
