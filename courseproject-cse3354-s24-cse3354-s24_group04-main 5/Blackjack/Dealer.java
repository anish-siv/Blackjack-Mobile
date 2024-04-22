import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dealer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dealer extends Player
{
    Dealer(Deck deck){
        super(80, 100, deck);
    }
    
    void completeDraw(){
        hand.showCard();
        while(hand.getValue() < 17)
            draw();
    }
    
    void setup(){
        super.setup();
        hand.addCard(deck.draw(false));
    }
    
    /**
     * Act - do whatever the Dealer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
