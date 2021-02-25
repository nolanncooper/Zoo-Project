public class Zebra extends Animal{
	protected String [] animalPic = {"       _,,", "      \"-.\\=", "         \\\\=   _.~", "        _|/||||)_","        \\        \\"};


	
	public Zebra(int i) {
		
		super.setBalance(i);
		super.setHungerValue(36);
		super.setMonetaryValue(7000);
		super.setAvgLifeSpan(25);
		super.setIncome(120);
		super.setAnimalType("Zebra");
		super.setNumberOf(1);
		super.setAge(2);

		System.out.println("You've just created a " + animalType);
		printAnimal();
		System.out.println("Your current balance is: " + i);
		
	}

	@Override
	public void collectItems() {
		super.collectItems();
		System.out.println("This " + animalType + " will produce $" + (numberOf*income) + " per opening.");
		System.out.println("Your current balance is: " + Main.zooBalance);
		
		
	}

	@Override
	public void feed() {
		super.feed();
		System.out.println("A " + animalType + " requires food every day.");
		Speaker.speak("A " + animalType + " requires food every day.");
		System.out.println();
		System.out.println("This " + animalType + " currently has a hunger level of: " + hungerValue);
		Speaker.speak("This " + animalType + " currently has a hunger level of: " + hungerValue);
		System.out.println();
		System.out.println("Your current balance is: " + Main.zooBalance);
		SpaceAdder.addSpace();
		
		
		
		
	}

	@Override
	public void sell() {
		super.sell();
		System.out.println("How will you ever live with yourself? Anyways, you're up to: $" + Main.zooBalance);
		System.out.println(Main.zooBalance);
		
	}

	@Override
	public void printAnimal() {
		for(int m = 0; m < animalPic.length; m++) {
			System.out.println(animalPic[m]);
		}		
	}
	public void attackedByLion() {
		System.out.println("Your lion decided that it needed to eat, so it attacked a zebra. Th lion is now loose and the city had to shut down your zoo... GAME OVER.");
	}
	
	
}
