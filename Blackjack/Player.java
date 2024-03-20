import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    Hand hand;
    int x, y;
    Deck deck;
    
    Player(int x, int y, Deck deck){
        this.x = x; this.y = y;
        hand = new Hand(x, y);
        this.deck = deck;
    }
    
    int handValue(){
        return hand.getValue();
    }
    
    void setup(){
        getWorld().addObject(hand, x, y);
        draw(true);
    }
    
    void draw(boolean visible){
        hand.addCard(deck.draw(visible));
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
