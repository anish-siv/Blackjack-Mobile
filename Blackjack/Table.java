import greenfoot.*;

public class Table extends World {
    Deck deck;
    User user;
    Dealer dealer;
    Hit hitButton;
    Stand standButton;

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
        GreenfootImage hitImage = new GreenfootImage("/Users/anishsivakumar/Downloads/courseproject-cse3354-s24-cse3354-s24_group04-add-GUI 2/CardImages/hit_btn.png");
        GreenfootImage standImage = new GreenfootImage("/Users/anishsivakumar/Downloads/courseproject-cse3354-s24-cse3354-s24_group04-add-GUI 2/CardImages/stand_btn.png");

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

        // Printing user and dealer scores (for testing)
        System.out.println("User score: " + user.handValue());
        System.out.println("Dealer total: " + dealer.handValue());
    }

    // Method to handle when the player hits
    public void userHits() {
        if (!user.isTurnOver()) {
            user.hit();
            if (user.isTurnOver()) {
                switchTurn();
            }
        }
    }

    // Method to handle when the player stands
    public void userStands() {
        if (!user.isTurnOver()) {
            user.stand();
            switchTurn();
        }
    }

    // Method to switch the turn between the user and the dealer
    public void switchTurn() {
        // cCode to switch turns between the user and the dealer
    }
}
