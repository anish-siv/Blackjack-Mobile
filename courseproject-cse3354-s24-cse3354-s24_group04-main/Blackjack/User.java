public class User extends Player {
    int balance;
    
    User(Deck deck) {
        super(80, 300, deck);
        balance = 100; // Initialize balance for start of game
    }
    
    void setup() {
        super.setup();
        draw();
    }
    
    int getBalance() {
        return balance;
    }
    
    void updateBalance(int x) {
        balance += x;
    }
    
    /**
     * Act - do whatever the User wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here, if any
    }
}
