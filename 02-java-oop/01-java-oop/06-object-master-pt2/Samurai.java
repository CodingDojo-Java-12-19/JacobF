public class Samurai extends Human {

    private static int count;

    public Samurai() {
        super(3, 3, 3, 200);
        count++;
    }

    public void deathBlow(Human human) {
        this.health = this.health / 2;
        human.health = 0;
        System.out.println("Oh dear, this human has been dealth a death blow and their HP is at 0!");
    }

    public void meditate() {
        this.health += this.health / 2;
    }

    public static int howMany() {
        System.out.println(count);
        return count;
    }
    
}