public class Ninja extends Human {

    public Ninja() {
        super(3, 10, 3, 100);
    }

    public void steal(Human human) {
        human.health -= this.stealth;
        this.health += this.stealth;
    }

    public void runAway() {
        this.health -= 10;
    }
    
}