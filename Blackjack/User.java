public class User extends Player {
    User(Deck deck) {
        super(80, 300, deck);
    }
    
    void setup() {
        super.setup();
        draw(true);
    }
    
    // Method to handle when the user hits
    public void hit() {
        if (!isTurnOver()) {
            draw(true); // Draw a card and show it
            if (isTurnOver()) {
                endTurn(); // End the user's turn if they bust or reach 21
            }
        }
    }
    
    // Method to handle when the user stands
    public void stand() {
        if (!isTurnOver()) {
            endTurn(); // End the user's turn
        }
    }
    
    /**
     * Act - do whatever the User wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here, if any
    }
}
