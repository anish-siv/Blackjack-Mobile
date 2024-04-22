import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    Start startButton;
    TutorialButton tutorialButton;
    
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        super(600, 400, 1);

        // Set background color
        GreenfootImage background = new GreenfootImage(600, 400);
        GreenfootImage logo = new GreenfootImage("Logo.png");
        background.setColor(new Color(0, 120, 40));
        background.fill();
        background.drawImage(logo, 8, 40);
        setBackground(background); 
        
        startButton = new Start();
        //GreenfootImage StartImage = new GreenfootImage("Start", 24, Color.WHITE, new Color( 0, 0, 0, 0 ));
        addObject(startButton, getWidth() / 4 , (getHeight() / 2) + 100);
        
        tutorialButton = new TutorialButton();
        addObject(tutorialButton, getWidth() * 3 / 4 , (getHeight() / 2) + 100);
    }
}
