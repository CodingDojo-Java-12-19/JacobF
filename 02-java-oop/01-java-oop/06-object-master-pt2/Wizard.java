public class Wizard extends Human {
    public Wizard() {
        super(3, 3, 8, 50);
    }

    public void heal(Human human) {
        human.health += this.intelligence;
    }

    public void fireball(Human human) {
        human.health -= this.intelligence * 3;
    }
    
}