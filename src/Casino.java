import java.io.IOException;
import java.util.Scanner;




public class Casino {
	public static void CasinoMain(int i) throws IOException {
		Scanner intInput = new Scanner(System.in);
		Scanner stringInput = new Scanner(System.in);
		int casinoZooBalance = i;
		System.out.println("I see that you have decided to spend that cash...");
		Speaker.speak("I see that you have decided to spend that cash...");
		System.out.println();
		System.out.println("You are currently sitting at: " + casinoZooBalance + " zoo dollars.");
		Speaker.speak("You are currently sitting at:   " + casinoZooBalance + " zoo dollars");
		System.out.println();
		System.out.println("Let's take a look at some of the possible games you can play.");
		Speaker.speak("Let's take a look at some of the possible games you can play.");
		System.out.println("1.) Score Hero");
		System.out.println("2.) Skiball");
		System.out.println("3.) War");
		System.out.println();
		System.out.println("Please type a number.");
		Speaker.speak("Please type a number.");
		int input = intInput.nextInt();
		SpaceAdder.addSpace();
		if(input == 1) {
			System.out.println("Score Hero it is");
			System.out.println();
			System.out.println("You have the opportunity to earn 1000 dollars or lose 1000 dollars.");
			System.out.println();
			System.out.println();
			System.out.println("Press enter to confim you would like to spend money on Score Hero...");
			String snput = stringInput.nextLine();
			ScoreHeroMain.ScoreHeroRun(casinoZooBalance);
		}
		if(input == 2) {
			System.out.println("Skiball it is");
			System.out.println();
			System.out.println();
			System.out.println("Press press enter to confim you would like to spend money on Skiball...");
			String snput = stringInput.nextLine();
			SkiballMain.main();
		}
		if(input == 3) {
			System.out.println("War it is");
			System.out.println();
			System.out.println();
			System.out.println("Press press enter to confim you would like to spend money on War...");
			String snput = stringInput.nextLine();
			WarRunner.main();
		}
		
	}
}
