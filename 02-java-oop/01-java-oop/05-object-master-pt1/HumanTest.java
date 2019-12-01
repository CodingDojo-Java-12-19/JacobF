public class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        Human h2 = new Human(5, 5, 5, 150);
        h.getStats();
        h2.getStats();
        h.attack(h2);
        h2.getStats();
    }
}