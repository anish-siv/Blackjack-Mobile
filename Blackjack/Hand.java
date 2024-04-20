import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // For ArrayList
/**
 * Write a description of class Hand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hand extends Actor
{
    ArrayList<Card> cards;
    int value;
    int x, y;
    
    Hand (int x,int y) {
        value=0;
        cards = new ArrayList<Card>();
        this.x = x;
        this.y = y;
    }
    
    int getValue() {
        int value = 0;
        int numAces = 0;
        for (Card card: cards) {
            String cardValue = card.getValue();
            if (card.isVisible()) { //Card must be revealed from dealer deck
                if (cardValue.equals("A")) {
                    numAces++;
                } else if (cardValue.equals("J") || cardValue.equals("Q") || cardValue.equals("K")) {
                    value += 10;
                } else {
                    value += Integer.parseInt(cardValue);
                }
            }
        }
        
        
        for (int i = 0; i < numAces; i++) {
            if ((value + 11) <= 21) {
                value += 11;
            } else {
                value += 1;
            }
        }
        return value;
    }
    
    public void clear(){
        for (Card card: cards) {
            getWorld().removeObject(card);
        }
        cards.clear();
    }
    
    public void addCard(Card card) {
        cards.add(card);
        this.renderHand();
    }
    
    public void renderHand() {
        for (int i = 0; i < cards.size(); i++) {
            int x_coord = this.x + 110*i;
            getWorld().addObject(cards.get(i), x_coord, this.y);
        }
    }
    
    public void showCard(){
        cards.get(1).showCard();
    }
    
    /**
     * Act - do whatever the Hand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
    }
}
