public class Bat extends Mammal {

    public Bat() {
        super(300);
    }

    public Bat(int energyLevel) {
        super(energyLevel);
    }

    public void fly() {
		System.out.println("Flying!");
		energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("Eating humans!");
		energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("Attacking town!");
		energyLevel -= 100;
    }
    
}