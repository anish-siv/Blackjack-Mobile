import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Table extends World
{
    Deck deck;
    Hand dealerHand;
    Hand playerHand;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    public Table()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage background = new GreenfootImage(600, 400);
        background.setColor(new Color(0, 120, 40));
        background.fill();
        setBackground(background);
        
        // Testing for deck
        deck = new Deck();
        Card card1 = deck.draw(true);
        Card card2 = deck.draw(false);
        dealerHand = new Hand(80, 100);
        addObject(dealerHand, 0,0);
        dealerHand.addCard(card1);
        dealerHand.addCard(card2);
        dealerHand.renderHand();
        System.out.println(dealerHand.getValue());
        
        Card card3 = deck.draw(true);
        Card card4 = deck.draw(true);
        playerHand = new Hand(80,300);
        addObject(playerHand, 0,0);
        playerHand.addCard(card3);
        playerHand.addCard(card4);
        playerHand.renderHand();
        System.out.println(playerHand.getValue());  
        
    }
}
