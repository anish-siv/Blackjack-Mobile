import greenfoot.*;

public class Table extends World {
    Deck deck;
    User user;
    Dealer dealer;
    Hit hitButton;
    Stand standButton;
    DoubleDown doubleButton;
    IncreaseBet increaseButton;
    DecreaseBet decreaseButton;
    Label userTotalLabel;
    Label dealerTotalLabel;
    Label userBalanceLabel;
    Label playAgainLabel;
    Result resultButton;
    int roundBet;

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
        doubleButton = new DoubleDown();
        
        // Creating Increase/Decrease Bet buttons
        increaseButton = new IncreaseBet();
        decreaseButton = new DecreaseBet();

        // Loading images for Hit and Stand buttons
        GreenfootImage hitImage = new GreenfootImage("hit_btn.png");
        GreenfootImage standImage = new GreenfootImage("stand_btn.png");
        GreenfootImage doubleImage = new GreenfootImage("double_btn.png");
        
        // Loading images for Increase/Decrease Bet buttons
        GreenfootImage plusImage = new GreenfootImage("plus_btn.png");
        GreenfootImage minusImage = new GreenfootImage("minus_btn.png");

        // Setting images for buttons
        hitButton.setImage(hitImage);
        standButton.setImage(standImage);
        doubleButton.setImage(doubleImage);
        increaseButton.setImage(plusImage);
        decreaseButton.setImage(minusImage);
        
        // Resizing button images
        hitImage.scale(150, 50);
        standImage.scale(150, 50);
        doubleImage.scale(150, 50);
        plusImage.scale(50, 50);
        minusImage.scale(50, 50);
    
        // Adding buttons to the world
        addObject(hitButton, 500, 150);
        addObject(standButton, 500, 200);
        addObject(doubleButton, 500, 250);
        addObject(increaseButton, 550, 300);
        addObject(decreaseButton, 550, 360);
        
        // Labels to indicate where to Increase/Decrease Bet
        addObject(new Label("Increase Bet"), 450, 300);
        addObject(new Label("Decrease Bet"), 450, 360);
                
        // Adding Result button for end of round
        resultButton = new Result();
        GreenfootImage resultImage = new GreenfootImage("", 24, Color.WHITE, new Color( 0, 0, 0, 0 ));
        addObject(resultButton, getWidth() / 2 , (getHeight() / 2) + 0);

        // Temporarily set round bet to 10
        roundBet = 10;

        // Creating deck, user, and dealer
        deck = new Deck();
        user = new User(deck);
        dealer = new Dealer(deck);
        addObject(user, 0, 0);
        addObject(dealer, 0, 0);

        // Setting up user and dealer
        user.setup();
        dealer.setup();
        
        // Ensure cards never cover up labels or buttons
        setPaintOrder(Label.class, Button.class, Card.class);
    
        
        userTotalLabel = new Label("Score: " + user.handValue());
        dealerTotalLabel = new Label("Score: " + dealer.handValue());
        userBalanceLabel = new Label("Balance: " + user.getBalance());
        addObject(new Label("Dealer"), 50, 35);
        addObject(dealerTotalLabel, 59, 60);
        addObject(new Label("Player"), 50, getHeight() - 165);
        addObject(userTotalLabel, 59, getHeight() - 140);
        addObject(userBalanceLabel, 70, getHeight() - 120);
    }

    // Method to handle when the player hits
    public void userHits() {
        user.draw();
        int uValue = user.handValue();
        userTotalLabel.updateLabel("Score: " + user.handValue());
        if(uValue == 21)
            userStands();
        if(uValue > 21){
            resultButton.updateLabel("Click to try again");
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
    }
    
    public void userDoubles() {
        roundBet *= 2;
        user.draw();
        int uValue = user.handValue();
        userTotalLabel.updateLabel("Score: " + user.handValue());
        if(uValue > 21){
            resultButton.updateLabel("Click to try again");
            lose();
        }
        else
            userStands();
    }
    
    void win(){
        disableButtons();
        resultButton.updateLabel("You Won! You earned " + roundBet + "$ \n Click to try again!");
        user.updateBalance(roundBet);
        userBalanceLabel.updateLabel("Balance: " + user.getBalance());
    }
    
    void lose(){
        disableButtons();
        user.updateBalance(-roundBet);
        int balance = user.getBalance();
        if (user.getBalance() > 0) {
            resultButton.updateLabel("You Lost! You lost " + roundBet + "$ \n Click to try again!" );
        } else {
            resultButton.updateLabel("You lost all your money! \n Reset to start a new game" );
            resultButton.disable();
        }
        
        userBalanceLabel.updateLabel("Balance: " + balance);
    }
    
    void push(){
        resultButton.updateLabel("Push!... Your balance is the same \n Click to try again!");
    }
    
    void disableButtons(){
        hitButton.disable();
        standButton.disable();
        doubleButton.disable();
    }
    void enableButtons() {
        hitButton.enable();
        standButton.enable();
        doubleButton.enable();
    }
    
    void resetRound() {
        if (user.getBalance() > 0) {
             //Need to get new bet
            enableButtons();
            user.setup();
            dealer.setup();
            dealerTotalLabel.updateLabel("Score: " + dealer.handValue());
            userTotalLabel.updateLabel("Score: " + user.handValue());
        }

    }
    
    // Method to switch the turn between the user and the dealer
    public void switchTurn() {
        // Code to switch turns between the user and the dealer
    }
}
