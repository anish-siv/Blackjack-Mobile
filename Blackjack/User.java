public class User extends Player {
    User(Deck deck) {
        super(80, 300, deck);
    }
    
    void setup() {
        super.setup();
        draw();
    }
    
    /**
     * Act - do whatever the User wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here, if any
    }
}
