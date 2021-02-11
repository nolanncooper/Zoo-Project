
public class Ostrich extends Animal{
	protected String [] animalPic = {"          _", "       -=(')", "         ;;", "        //", "       //", "      : '.---.__", "      |  --_-_)__)", "      `.____,'", "         \\  \\", "       ___\\  \\", "      (       \\", "               \\  ", "               /"};


	
	public Ostrich(int i) {
		
		super.setBalance(i);
		super.setHungerValue(28);
		super.setMonetaryValue(525);
		super.setAvgLifeSpan(60);
		super.setIncome(140);
		super.setAnimalType("Ostrich");
		super.setNumberOf(0);
		super.setAge(2);

		System.out.println("You've just created a " + animalType);
		System.out.println("Your current balance is: " + i);
		printAnimal();
		
	}

	@Override
	public void collectItems() {
		super.collectItems();
		System.out.println("This " + animalType + " will produce $" + income + " per opening.");
		System.out.println(balance);
		
		
	}

	@Override
	public void feed() {
		super.feed();
		System.out.println("A " + animalType + " requires food every day.");
		System.out.println("This " + animalType + " currently has a hunger level of: " + hungerValue);
		System.out.println(balance);
		
		
		
		
	}

	@Override
	public void sell() {
		balance += monetaryValue;
		System.out.println("How will you ever live with yourself? Anyways, you're up to: $" + balance);
		System.out.println(balance);
		
	}

	@Override
	public void printAnimal() {
		for(int m = 0; m < animalPic.length; m++) {
			System.out.println(animalPic[m]);
		}		
	}
	public void runAway() {
		System.out.println("Your ostrich got a little agitated and wanted to roam free. Many wild birds cause disease. Your zoo has been shut down by the CDC because an ostrich was on the loose... GAME OVER.");
	}
	public void peck() {
		System.out.println("Your ostrich got a little antsy and pecked a small girl right on the nose. You know what that means... GAME OVER.");
	}
	
	
	
}
