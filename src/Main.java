import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static boolean isPlaying;
	public static int zooBalance;
	public static int zooLevel;
	public static Scanner userInput;
	public static Scanner stringInput;
	public static String str;
	public static String bruh;
	public static void main(String[] args) throws IOException {
		intro();
		newAnimals();
		
	}
	public static void intro() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to your own personal Sky Zoo.");
		Speaker.speak("Welcome to your own personal Sky Zoo.");
		System.out.println("It is your job to develop and build your zoo from a simple petting zoo, to a state-of-the-art animal habitat. Each time you collect items from an animal it ages.");
		Speaker.speak("It is your job to develop and build your zoo from a simple petting zoo, to a state-of-the-art animal habitat. Each time you collect items from an animal it ages.");
		System.out.println("First and foremost, I need to know how much money you are currently willing to use in order to fund the development of your zoo.");
		Speaker.speak("First and foremost, I need to know how much money you are currently willing to use in order to fund the development of your zoo.");
		System.out.println("Enter the amount you would like to deposit into your zoo bank now: ");
		Speaker.speak("Enter the amount you would like to deposit into your zoo bank now: ");
		
		zooBalance = userInput.nextInt();
		System.out.println("Thank you for your investment, I hope you won't regret it. In order to get you on your feet, you have been gifted 1 buffalo + 1 zebra.");
		Speaker.speak("Thank you for your investment, I hope you won't regret it. In order to get you on your feet, you have been gifted 1 buffalo + 1 zebra.");
		System.out.println("There are seven different species of animals that you can add to your zoo; However, your zoo is currently a level 1 zoo, meaning you are unable to acquire any animals other than buffalo and zebra.");
		Speaker.speak("There are seven different species of animals that you can add to your zoo; However, your zoo is currently a level 1 zoo, meaning you are unable to acquire any animals other than buffalo and zebra.");
		
	}
	public static void newAnimals() throws IOException {
		Animal buff = new Buffalo(zooBalance);
		Animal zeb = new Zebra(zooBalance);
		Scanner stringInput = new Scanner(System.in);
		System.out.println("The answer to how you further the development of your zoo is up to you, but first you should figure out the finances. Press enter once you've viewed the information.");
		Speaker.speak("The answer to how you further the development of your zoo is up to you, but first you should figure out the finances. Press enter once you've viewed the information.");
		System.out.println();
		System.out.println("The cost to purchase:");
		Speaker.speak("The cost to purchase:");
		System.out.println("Buffalo = $" + buff.getMonetaryValue());
		System.out.println("Zebra = $" + zeb.getMonetaryValue());
		 str = stringInput.nextLine();
		System.out.println();
		System.out.println("The cost to feed per day: ");
		Speaker.speak("The cost to feed per day: ");
		System.out.println("Buffalo = $" + ((100-buff.getHungerValue())/4));
		System.out.println("Zebra = $" + ((100-zeb.getHungerValue())/4));
		 str = stringInput.nextLine();
		System.out.println();
		System.out.println("The income each animal brings in per day: ");
		Speaker.speak("The income each animal bring in per day: ");
		System.out.println("Buffalo = $" + buff.getIncome());
		System.out.println("Zebra = $" + zeb.getIncome());
		 str = stringInput.nextLine();
		System.out.println();
		System.out.println("Keep in mind, animals have expiration dates:");
		Speaker.speak("Keep in mind, animals have expiration dates:");
		System.out.println("Buffalo = " + buff.getAvgLifeSpan() + " years");
		System.out.println("Zebra = " + zeb.getAvgLifeSpan() + " years");
		 str = stringInput.nextLine();
	
		while(!isPlaying) {
			
			if(buff.getNumberOf() == 0 && zeb.getNumberOf()== 0) {
				System.out.println("Congratulations, you are a complete failure...GAME OVER");
				Speaker.speak("Congratulations, you are a complete failure...GAME OVER");
				isPlaying = true;
			}
			else if(buff.getNumberOf() == 0) {
				System.out.println("Looks life you'll only be working with the good old zebra. Type Zebra.");
				Speaker.speak("Looks life you'll only be working with the good old zebra. Type Zebra.");
			}
			else if(zeb.getNumberOf() == 0) {
				System.out.println("Looks life you'll only be working with the good old buffalo. Type Buffalo.");
				Speaker.speak("Looks life you'll only be working with the good old buffalo. Type Buffalo.");

			}
			else if(buff.getNumberOf() != 0 && zeb.getNumberOf()!= 0) {
				System.out.println("Please select the animal you would like to work with: " + buff.getAnimalType() + " or " + zeb.getAnimalType());
				Speaker.speak("Please select the animal you would like to work with: " + buff.getAnimalType() + " or " + zeb.getAnimalType());

			}
			
			String animalInput = stringInput.nextLine();
			SpaceAdder.addSpace();

			System.out.println("After reviewing the finances you have a few options: 1) Feed your animal, 2) Sell your animal, 3) Purchase a new animal, 4) Collect your income, 5) Just plain quit the game.");
			Speaker.speak("After reviewing the finances you have a few options: 1) Feed your animal, 2) Sell your animal, 3) Purchase a new animal, 4) Collect your income, 5) Just plain quit the game.");
			System.out.println();
			System.out.println("Alternatively, you could hit the casino and try not to blow all your cash... " );
			Speaker.speak("Alternatively, you could hit the casino and try not to blow all your cash... ");
			System.out.println("Press '6' to enter the casino.");
			Speaker.speak("Press '6' to enter the casino.");
			System.out.println();
			System.out.println("Please enter 1, 2, 3, 4, 5, 6");
			Speaker.speak("Please enter 1, 2, 3, 4, 5, 6");
			Scanner choice = new Scanner(System.in);
			int actionChoice = choice.nextInt();
			SpaceAdder.addSpace();
			
			if(actionChoice == 1) {
				 bruh = "feed";
				System.out.println("You have decided to " + bruh +" " + animalInput);
				Speaker.speak("You have decided to " + bruh +" " + animalInput);

			}
			if(actionChoice == 2) {
				 bruh = "sell";
				System.out.println("You have decided to " + bruh +" " + animalInput);
				Speaker.speak("You have decided to " + bruh +" " + animalInput);
			}
			if(actionChoice == 3) {
				 bruh = "purchase";
				 System.out.println("You have decided to " + bruh +" " + animalInput);
				 Speaker.speak("You have decided to " + bruh +" " + animalInput);
			}
			if(actionChoice == 4) {
				 bruh = "collect";
				System.out.println("You have decided to " + bruh +" " + animalInput);
				Speaker.speak("You have decided to " + bruh +" " + animalInput);

			}
			if(actionChoice == 5) {
				 bruh = "quit";
				 isPlaying = true;
				System.out.println("You have decided to " + bruh +" " + animalInput);
				Speaker.speak("You have decided to " + bruh +" " + animalInput);

			}
			if(actionChoice == 6) {
				if(animalInput.equals(buff.getAnimalType())) {
					Casino.CasinoMain(buff.getBalance());
				}
				if(animalInput.equals(zeb.getAnimalType())) {
					Casino.CasinoMain(zeb.getBalance());
				}
			}
			System.out.println();
			
			
			if(actionChoice == 1) {
				 if(animalInput.equals(buff.getAnimalType())) {
						buff.feed();
						if(buff.getHungerValue() <= 30) {
							System.out.println("Come on, you need to feed the animal... GAME OVER");
							Speaker.speak("Come on, you need to feed the animal... GAME OVER");
							isPlaying = true;
						}
					}
				 if(animalInput.equals(zeb.getAnimalType())) {
					 	zeb.feed();
					 	if(zeb.getHungerValue() <= 30) {
							System.out.println("Come on, you need to feed the animal... GAME OVER");
							Speaker.speak("Come on, you need to feed the animal... GAME OVER");
							isPlaying = true;
						}
				 }
			}
			if(actionChoice == 2) {
				if(animalInput.equals(buff.getAnimalType())) {
					buff.sell();
					System.out.println("You now have: " + buff.getNumberOf() + " " + buff.getAnimalType());
					Speaker.speak("You now have: " + buff.getNumberOf() + " " + buff.getAnimalType());
				}
			 if(animalInput.equals(zeb.getAnimalType())) {
				 	zeb.sell();
					System.out.println("You now have: " + zeb.getNumberOf() + " " +zeb.getAnimalType());
					Speaker.speak("You now have: " + zeb.getNumberOf() + " " +zeb.getAnimalType());
			 }
			}
			
			if(actionChoice == 3) {
				 if(animalInput.equals(buff.getAnimalType())) {
						buff.purchase();
					}
				 if(animalInput.equals(zeb.getAnimalType())) {
					 	zeb.purchase();
					 	
				 }
			}
			if(actionChoice == 4) {
				 if(animalInput.equals(buff.getAnimalType())) {
						buff.collectItems();
						if(buff.getAge() > buff.getAvgLifeSpan()) {
							System.out.println("I'm afraid you've worked the animal a bit too hard. Nice one. Media didn't like that you killed an animal... GAME OVER");
							Speaker.speak("I'm afraid you've worked the animal a bit too hard. Nice one. Media didn't like that you killed an animal... GAME OVER");
							isPlaying = true;
						}
					}
				 if(animalInput.equals(zeb.getAnimalType())) {
					 	zeb.collectItems();
					 	if(zeb.getAge() > zeb.getAvgLifeSpan()) {
							System.out.println("I'm afraid you've worked the animal a bit too hard. Nice one. Media didn't like that you killed an animal... GAME OVER");
							Speaker.speak("I'm afraid you've worked the animal a bit too hard. Nice one. Media didn't like that you killed an animal... GAME OVER");
							isPlaying = true;
						}
					 	
				 }
			}
		}
		System.out.println("Not going to lie, you kinda sucked. Better luck next time.");
		Speaker.speak("Not going to lie, you kinda sucked. Better luck next time.");
		 
		
		
	}
	

}
