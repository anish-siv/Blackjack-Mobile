import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Table extends World {
    Deck deck;
    User user;
    Dealer dealer;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    public Table() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootImage background = new GreenfootImage(600, 400);
        background.setColor(new Color(0, 120, 40));
        background.fill();
        setBackground(background);

        // Testing for deck
        deck = new Deck();
        user = new User(deck);
        dealer = new Dealer(deck);
        addObject(user, 0, 0);
        addObject(dealer, 0, 0);
        user.setup();
        dealer.setup();
        
        System.out.println("User score: " + user.handValue());
        System.out.println("Dealer total: " + dealer.handValue());
        
        //dealer.completeDraw(); // flips second card and makes dealer draw till hes at or above 17
    }
}
