public class Human {
    
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;

    public Human() {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public Human(int strength, int stealth, int intelligence, int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    public void attack(Human human) {
        human.health -= this.strength;
        System.out.println("Someone has been attacked!");
    }

    public void getStats() {
        String returnStr = "HP: " + this.health + " Str: " + this.strength + " Int: " + this.intelligence + " Stealth: " + this.stealth;
        System.out.println(returnStr);
    }

}