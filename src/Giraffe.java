
public class Giraffe extends Animal{
	protected String [] animalPic = {"                     .c.", "                   .d$$e$.", "                .e$P\"   ^*%", "             .e$P\"", "           z$$$\"", "        z$$$$$F", "     .d$$$$$$$F", "  .d$$$$$$$$$$F", ".3$$$$$$$$$$$$F", "  $$$$$\" \"\"$*$\"", "   P $\"    $ $", "  d d\"     $ $", "  $ *      $ $", "   ) '     $ $", "    % '    $ $", "     % \"   $ $", "      - )  * *"};


	
	public Giraffe(int i) {
		
		super.setBalance(i);
		super.setHungerValue(44);
		super.setMonetaryValue(40000);
		super.setAvgLifeSpan(26);
		super.setIncome(120);
		super.setAnimalType("Giraffe");
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
	public void stealPurse() {
		System.out.println("A giraffe once stole my mom's purse while at the zoo. Unfortunately, the giraffe stole a mean old woman's purse which in short means... GAME OVER.");
	}
	
	
}
