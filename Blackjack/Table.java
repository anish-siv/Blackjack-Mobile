import greenfoot.*;

public class Table extends World {
    Deck deck;
    User user;
    Dealer dealer;
    Hit hitButton;
    Stand standButton;
    Label userTotalLabel;
    Label dealerTotalLabel;
    Label playAgainLabel;

    public Table() {
        super(600, 400, 1);

        // Set background color
        GreenfootImage background = new GreenfootImage(600, 400);
        background.setColor(new Color(0, 120, 40));
        background.fill();
        setBackground(background);

        // Creating Hit and Stand buttons
        hitButton = new Hit();
        standButton = new Stand();

        // Loading images for Hit and Stand buttons
        GreenfootImage hitImage = new GreenfootImage("hit_btn.png");
        GreenfootImage standImage = new GreenfootImage("stand_btn.png");

        // Setting images for buttons
        hitButton.setImage(hitImage);
        standButton.setImage(standImage);

        // Resizing button images
        hitImage.scale(200, 50);
        standImage.scale(200, 50);

        // Adding buttons to the world
        addObject(hitButton, 500, 200);
        addObject(standButton, 500, 250);

        // Creating deck, user, and dealer
        deck = new Deck();
        user = new User(deck);
        dealer = new Dealer(deck);
        addObject(user, 0, 0);
        addObject(dealer, 0, 0);

        // Setting up user and dealer
        user.setup();
        dealer.setup();
        
        userTotalLabel = new Label("Score: " + user.handValue());
        dealerTotalLabel = new Label("Score: " + dealer.handValue());
        
        addObject(new Label("Dealer"), 50, 35);
        addObject(dealerTotalLabel, 59, 60);
        addObject(new Label("Player"), 50, getHeight() - 165);
        addObject(userTotalLabel, 59, getHeight() - 140);
    }

    // Method to handle when the player hits
    public void userHits() {
        user.draw();
        int uValue = user.handValue();
        userTotalLabel.updateLabel("Score: " + user.handValue());
        if(uValue == 21)
            userStands();
        if(uValue > 21){
            addObject(new Label("Reset to try again."), getWidth() / 2, (getHeight() / 2) + 30);
            lose();
        }
    }

    // Method to handle when the player stands
    public void userStands() {
        disableButtons();
        dealer.completeDraw();
        dealerTotalLabel.updateLabel("Score: " + dealer.handValue());

        if(dealer.handValue() < user.handValue() || dealer.handValue() > 21)
            win();
        else if(dealer.handValue() > user.handValue())
            lose();
        else
            push();
        addObject(new Label("Reset to try again."), getWidth() / 2, (getHeight() / 2) + 20);
    }
    
    void win(){
        addObject( new Label("You Won!"), getWidth() / 2, getHeight() / 2);
    }
    
    void lose(){
        disableButtons();
        addObject(new Label("You Lost..."), getWidth() / 2, getHeight() / 2);
    }
    
    void push(){
        addObject(new Label("Push!"), getWidth() / 2, getHeight() / 2);
    }
    
    void disableButtons(){
        hitButton.disable();
        standButton.disable();
    }
    
    // Method to switch the turn between the user and the dealer
    public void switchTurn() {
        // cCode to switch turns between the user and the dealer
    }
}
