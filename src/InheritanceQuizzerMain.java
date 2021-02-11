import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class InheritanceQuizzerMain {
	public static int numberCorrect = 0;
	public static int attempts = 0;
	public static String [] text = new String[36];
	public static String useri = "";
	
	public static void InheritanceQuizzerRun() throws IOException{
		
		intro();
		askQuestions();
	}
	public static void intro() {
		System.out.println("Welcome to the inheritance quizzer. Use the printout which describes a soccer player class and striker class to answer the following questions.");
	
	}
	public static void askQuestions() throws IOException {
		Scanner file = new Scanner(new File("InheritanceQuizzerAnswers"));
		for(int u = 0; u < text.length; u++) {
			text[u] = file.nextLine();
		}
		for(int i = 0; i < text.length; i+=3) {
			System.out.println();
			System.out.println("If the code runs: ");
			System.out.println("     " + text[i]);
			System.out.println("     " + text[i+1]);
			System.out.println();
			System.out.println("What will the result be?");
			System.out.println("A. Take it to the corner!!!");
			System.out.println("B. I can do a ball roll and some fake shots.");
			System.out.println("C. Knee slides for days!");
			System.out.println("D. I don't defend.");
			System.out.println("E. The code will not execute.");
			Scanner userInput = new Scanner(System.in);
			useri = userInput.nextLine();
			if(useri.toUpperCase().equals(text[i+2])) {
				System.out.println();
				System.out.println("Correct!");
				System.out.println();
				System.out.println();
				numberCorrect++;
				attempts++;
			}
			else {
				System.out.println();
				System.out.println("Incorrect");
				System.out.println();
				System.out.println();
				attempts++;
			}
			
		}
		System.out.println("You were able to correctly answer: " + numberCorrect + " out of " + attempts + ".");
		
	}

}
