import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{
    ReturnButton returnButton;
    
    public Tutorial(World returnWorld)
    {    
        super(600, 400, 1);

        // Set background
        GreenfootImage background = new GreenfootImage(600, 400);
        GreenfootImage logo = new GreenfootImage("Logo.png");
        logo.scale(300, 100);
        background.setColor(new Color(0, 120, 40));
        background.fill();
        background.drawImage(logo, 8, 10);
        background.drawImage(new GreenfootImage("Tutorial:", 42, Color.WHITE, new Color( 0, 0, 0, 0 ) ), 70, 100);
        
        // Write Controls
        background.setFont(new Font(16));
        background.setColor(Color.WHITE);
        String controlString = "CONTROLS: \nHit - 'Up' key \nStand - 'Down' key \nDouble Down - 'Right' key \nDeal Again - 'Left' key (At end of round)";
        background.drawString(controlString, 320, 40);
        
        // Write Rules
        String rulesString = "The objective of BlackJack is to get a score closer to 21 than the dealer, without \nexceeding it. After buying in, the player is dealt 2 cards.  Based on their value, \nthe player may decide to Hit(have a new card dealt to them) or Stand(end their \nturn and compare their score to the dealer's). If either party's score exceeds 21, \nthey immediately lose the round.  Players can continue to play until they have \nnothing more to bet.";
        background.drawString(rulesString, 20, 170);
        
        // Write Special Card Values
        String cardVals = "CARD SCORE VALUES: \nAce - 1 or 11      4 - 4             7 - 7             10 - 10             King - 10\n2 - 2                     5 - 5             8 - 8             Jack - 10\n3 - 3                     6 - 6             9 - 9             Queen - 10";
        background.drawString(cardVals, 20, 320);
        
        // Set Background
        setBackground(background); 
        
        // Add Return Button
        returnButton = new ReturnButton(returnWorld);
        addObject(returnButton, 550, 380);
    }
}
