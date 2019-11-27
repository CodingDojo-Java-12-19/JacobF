public class Mammal {
    
	protected int energyLevel;

	public Mammal() {
		this.energyLevel = 100;
	}

	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public Integer displayEnergy() {
		System.out.println("Energy level: " + this.energyLevel);
		return this.energyLevel;
	}

}
