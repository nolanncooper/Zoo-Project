
public class Buffalo extends Animal{
	protected String [] animalPic = {"             _.-````'-,_", "   _,.,_ ,-'`           `'-.,_", " /)     (\\                   '``-.", "((      ) )                      `\\", " \\)    (_/                        )\\" , "  |       /)           '    ,'    / \\", "  `\\    ^'            '     (    /  ))" , "    |      _/\\ ,     /    ,,`\\   (  \"`", "     \\Y,   |  \\  \\  | ````| / \\_ \\" , "       `)_/    \\  \\  )    ( >  ( >", "                \\( \\(     |/   |/" , "               /_(/_(    /_(  /_("};


	
	public Buffalo(int i) {
		
		super.setBalance(i);
		super.setHungerValue(24);
		super.setMonetaryValue(3456);
		super.setAvgLifeSpan(20);
		super.setIncome(110);
		super.setAnimalType("Buffalo");
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
		System.out.println("Your current balance is: " + balance);
		
		
	}

	@Override
	public void feed() {
		super.feed();
		System.out.println("A " + animalType + " requires food every day.");
		System.out.println("This " + animalType + " currently has a hunger level of: " + hungerValue);
		System.out.println("Your current balance is: " + balance);
		
		
		
		
	}

	@Override
	public void sell() {
		super.sell();
		System.out.println("How will you ever live with yourself? Anyways, you're up to: $" + balance);
		System.out.println("Your current balance is: " + balance);
	}

	@Override
	public void printAnimal() {
		for(int m = 0; m < animalPic.length; m++) {
			System.out.println(animalPic[m]);
		}		
	}
	public void stampede() {
		System.out.println("Oh no! The buffalo proceeded to stampede through the zoo, destorying everything... GAME OVER.");
	}
	
	
	
}
