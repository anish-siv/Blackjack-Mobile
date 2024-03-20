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
                
                switch (cardValue) {
                    case "A": 

                        numAces++; 
                        break;
                    case "J":
                        value += 10;
                        break;
                    case "Q": 
                        value += 10;
                        break;
                    case "K": 
                        value += 10;
                        break;
                    case "1": 
                        value += 1; 
                        break;
                    case "2": 
                        value += 2; 
                        break;
                    case "3": 
                        value += 3; 
                        break;
                    case "4": 
                        value += 4; 
                        break;
                    case "5": 
                        value += 5; 
                        break;
                    case "6": 
                        value += 6; 
                        break;
                    case "7": 
                        value += 7; 
                        break;
                    case "8": 
                        value += 8; 
                        break;
                    case "9": 
                        value += 9; 
                        break;
                    default: 
                        break;
                }
            }
        }
        
        
        for (int i = 0; i < numAces; i++) {
            if ((value + 11) < 21) {
                value += 11;
            } else {
                value += 1;
            }
        }
        System.out.println(value);
        return value;
    }
    
    public void addCard(Card card) {
        cards.add(card);
    }
    
    public void renderHand() {
        for (int i = 0; i < cards.size(); i++) {
            int x_coord = this.x + 110*i;
            getWorld().addObject(cards.get(i), x_coord, this.y);
        }
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
