public class Mammal {
    
	protected int energyLevel;

	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public Integer displayEnergy() {
		System.out.println("Energy level: " + this.energyLevel);
		return this.energyLevel;
	}

}
