public class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        Human h2 = new Human(5, 5, 5, 150);
        h.getStats();
        h2.getStats();
        h.attack(h2);
        h2.getStats();
        Wizard w = new Wizard();
        w.getStats();
        h.getStats();
        w.fireball(h);
        h.getStats();
        Ninja n = new Ninja();
        n.getStats();
        n.steal(h2);
        h2.getStats();
        n.getStats();
        n.runAway();
        n.getStats();
        Samurai s = new Samurai();
        Samurai s2 = new Samurai();
        s.howMany();
        s.deathBlow(h);
        s.getStats();
        s.meditate();
        s.getStats();
        h2.getStats();
    }
}