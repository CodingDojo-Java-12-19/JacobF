public class MammalTest {
	public static void main(String[] args) {
        Mammal m = new Mammal(5);
        Gorilla g = new Gorilla(10);
        g.displayEnergy();
        g.throwSomething();
        g.eatBanana();
        g.climb();
        System.out.println(g.energyLevel);
		int energy = m.displayEnergy();
		System.out.println(energy);
	}

}
