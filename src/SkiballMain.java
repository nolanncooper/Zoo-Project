import java.util.Scanner;
public class SkiballMain {
	private static Scanner userInput = new Scanner(System.in);
	private static int [][]myMatrix; 
	private static int response = 0;
	private static int threePointRow = 0;
	private static int threePointCol= 0;
	private static int twoPointRow = 0;
	private static int twoPointCol = 0;
	private static int onePointRow = 0;
	private static int onePointCol = 0; 
	private static int ballCount = 0;
	private static int pointCounter = 0;
	private static String [][]stringMatrix;
	public static void main() { 
		myMatrix = new int [7][7];
		stringMatrix = new String [7][7];
		createMatrix();
		explainGame();
		playGame();
	}

	public static void createMatrix() {
		for (int row = 0; row < myMatrix.length; row++) {
			for(int col = 0; col < myMatrix[0].length; col++) {
				myMatrix[row][col] = 0;
			}
		}
		myMatrix[0][0] = 100;
		myMatrix[0][3] = 100;
		myMatrix[0][6] = 100;
		myMatrix[3][3] = 50;
		myMatrix[2][2] = 25;
		myMatrix[2][3] = 25;
		myMatrix[2][4] = 25;
		myMatrix[3][2] = 25;
		myMatrix[3][4] = 25;
		myMatrix[4][2] = 25;
		myMatrix[4][3] = 25;
		myMatrix[4][4] = 25;

	}

	public static void explainGame() {
		System.out.println("Hello Contestant! Today you will be playing the fantastic game of ski-ball! The object of the game is simple: try to score as many points as possible.");
		Speaker.speak("Hello Contestant! Today you will be playing the fantastic game of ski-ball! The object of the game is simple: try to score as many points as possible.");

		System.out.println("There are 12 different targets ranging from 25 to 50 to 100 points. The greater the amount of points available, the harder it is to hit that target.");
		Speaker.speak("There are 12 different targets ranging from 25 to 50 to 100 points. The greater the amount of points available, the harder it is to hit that target.");

		System.out.println("You will be given a choice to select how many attempts you get, and with each attempt you will also have to decide how many points to go for.");
		Speaker.speak("You will be given a choice to select how many attempts you get, and with each attempt you will also have to decide how many points to go for.");

		System.out.println("And without further adieu, let the game begin!");
		Speaker.speak("And without further adieu, let the game begin!");

		System.out.println();
	}
	
	public static void playGame() {
		System.out.println("Would you like 3, 6, or 9 attempts?");
		Speaker.speak("Would you like 3, 6, or 9 attempts?");

		
		ballCount = userInput.nextInt();
		System.out.println(ballCount + " balls coming right up!");
		Speaker.speak(ballCount + " balls coming right up!");
		System.out.println();
		if(ballCount == 3) {
			for(int i = 0; i < 3; i++) {
				System.out.println();
				System.out.println("You have " + (ballCount) + " shots remaining.");
				Speaker.speak("You have " + (ballCount) + " shots remaining.");
				System.out.println("Are you going for 100 points, 50 points or 25 points?");
				response = userInput.nextInt();
				if(response == 100) {
					threePointRow = (int)(Math.random() * 2 );
					threePointCol = (int)((Math.random()*7));
					System.out.println(myMatrix[threePointRow][threePointCol] + " points!");
					pointCounter = pointCounter + myMatrix[threePointRow][threePointCol];
					fillString(threePointRow, threePointCol);
				}
				if(response == 50) {
					twoPointRow = (int) ((Math.random() * 5) + 1);
					twoPointCol = (int) ((Math.random() * 5) + 1);
					System.out.println(myMatrix[twoPointRow][twoPointCol] + " points!");
					pointCounter = pointCounter + myMatrix[twoPointRow][twoPointCol];
					fillString(twoPointRow, twoPointCol);
				}
				if(response == 25) {
					onePointRow = (int) (Math.random() * 7);
					onePointCol = (int) ((Math.random() * 3) + 2);
					System.out.println(myMatrix[onePointRow][onePointCol] + " points!");
					pointCounter = pointCounter + myMatrix[onePointRow][onePointCol];
					fillString(onePointRow, onePointCol);
				}
				displayGame();
				ballCount--;
			}
		}
		if(ballCount == 6) {
			for(int i = 0; i < 6; i++) {
				System.out.println();
				System.out.println("You have " + (ballCount) + " shots remaining.");
				Speaker.speak("You have " + (ballCount) + " shots remaining.");

				System.out.println("Are you going for 100 points, 50 points or 25 points?");
				response = userInput.nextInt();
				if(response == 100) {
					int threePointRow = (int)(Math.random() * 2 );
					int threePointCol = (int)((Math.random()*7 ));
					System.out.println(myMatrix[threePointRow][threePointCol] + " points!");
					pointCounter = pointCounter + myMatrix[threePointRow][threePointCol];
					fillString(threePointRow, threePointCol);
				}
				if(response == 50) {
					int twoPointRow = (int) ((Math.random() * 5) + 1);
					int twoPointCol = (int) ((Math.random() * 5) + 1);
					System.out.println(myMatrix[twoPointRow][twoPointCol] + " points!");
					pointCounter = pointCounter + myMatrix[twoPointRow][twoPointCol];
					fillString(twoPointRow, twoPointCol);
				}
				if(response == 25) {
					int onePointRow = (int) (Math.random() * 7);
					int onePointCol = (int) ((Math.random() * 3) + 2);
					System.out.println(myMatrix[onePointRow][onePointCol] + " points!");
					pointCounter = pointCounter + myMatrix[onePointRow][onePointCol];
					fillString(onePointRow, onePointCol);
				}
				displayGame();
				ballCount--;
			}
		}
		if(ballCount == 9) {
			for(int i = 0; i < 9; i++) {
				System.out.println();
				System.out.println("You have " + (ballCount) + " shots remaining.");
				Speaker.speak("You have " + (ballCount) + " shots remaining.");

				System.out.println("Are you going for 100 points, 50 points or 25 points?");
				response = userInput.nextInt();
				if(response == 100) {
					int threePointRow = (int)(Math.random() *2);
					int threePointCol = (int)(Math.random()*7);
					System.out.println(myMatrix[threePointRow][threePointCol] + " points!");
					pointCounter = pointCounter + myMatrix[threePointRow][threePointCol];
					fillString(threePointRow, threePointCol);
				}
				if(response == 50) {
					int twoPointRow = (int) ((Math.random() * 5) + 1);
					int twoPointCol = (int) ((Math.random() * 5) + 1);
					System.out.println(myMatrix[twoPointRow][twoPointCol] + " points!");
					pointCounter = pointCounter + myMatrix[twoPointRow][twoPointCol];
					fillString(twoPointRow, twoPointCol);
				}
				if(response == 25) {
					int onePointRow = (int) (Math.random() * 7);
					int onePointCol = (int) ((Math.random() * 3) + 2);
					System.out.println(myMatrix[onePointRow][onePointCol] + " points!");
					pointCounter = pointCounter + myMatrix[onePointRow][onePointCol];
					fillString(onePointRow, onePointCol);
				}
			
				displayGame();
				ballCount--;
			}
		}
		System.out.println("______________________________________________________________________________________________________");
		System.out.println();
		System.out.println("Well done! You scored a total of " + pointCounter + " points.");
		Speaker.speak("Well done! You scored a total of " + pointCounter + " points.");
		if(pointCounter >= 100) {
			System.out.println("Looks like you've made some money...");
			Speaker.speak("Looks like you've made some money...");
			Main.zooBalance+=500;
		}
		if(pointCounter < 100) {
			System.out.println("Say goodbye to your cash... ");
			Speaker.speak("Say goodbye to your cash... ");
			Main.zooBalance-=500;
		}
	}
	
	public static void displayGame() {
		System.out.println("-----------------------------");
		System.out.println("|"+stringMatrix[0][0]+"|"+stringMatrix[0][1]+"|"+stringMatrix[0][2]+"|"+stringMatrix[0][3]+"|"+stringMatrix[0][4]+"|"+stringMatrix[0][5]+"|"+stringMatrix[0][6]+"|");
		System.out.println("-----------------------------");
		System.out.println("|"+stringMatrix[1][0]+"|"+stringMatrix[1][1]+"|"+stringMatrix[1][2]+"|"+stringMatrix[1][3]+"|"+stringMatrix[1][4]+"|"+stringMatrix[1][5]+"|"+stringMatrix[1][6]+"|");
		System.out.println("-----------------------------");
		System.out.println("|"+stringMatrix[2][0]+"|"+stringMatrix[2][1]+"|"+stringMatrix[2][2]+"|"+stringMatrix[2][3]+"|"+stringMatrix[2][4]+"|"+stringMatrix[2][5]+"|"+stringMatrix[2][6]+"|");
		System.out.println("-----------------------------");
		System.out.println("|"+stringMatrix[3][0]+"|"+stringMatrix[3][1]+"|"+stringMatrix[3][2]+"|"+stringMatrix[3][3]+"|"+stringMatrix[3][4]+"|"+stringMatrix[3][5]+"|"+stringMatrix[3][6]+"|");
		System.out.println("-----------------------------");
		System.out.println("|"+stringMatrix[4][0]+"|"+stringMatrix[4][1]+"|"+stringMatrix[4][2]+"|"+stringMatrix[4][3]+"|"+stringMatrix[4][4]+"|"+stringMatrix[4][5]+"|"+stringMatrix[4][6]+"|");
		System.out.println("-----------------------------");
		System.out.println("|"+stringMatrix[5][0]+"|"+stringMatrix[5][1]+"|"+stringMatrix[5][2]+"|"+stringMatrix[5][3]+"|"+stringMatrix[5][4]+"|"+stringMatrix[5][5]+"|"+stringMatrix[5][6]+"|");
		System.out.println("-----------------------------");
		System.out.println("|"+stringMatrix[6][0]+"|"+stringMatrix[6][1]+"|"+stringMatrix[6][2]+"|"+stringMatrix[6][3]+"|"+stringMatrix[6][4]+"|"+stringMatrix[6][5]+"|"+stringMatrix[6][6]+"|");
		System.out.println("-----------------------------");
		if((ballCount - 1) == 0) {
			System.out.println("   |                     |");
		}
		if((ballCount - 1) == 1) {
			System.out.println("   |O                    |");
		}
		if((ballCount - 1) == 2) {
			System.out.println("   |O O                  |");
		}
		if((ballCount - 1) == 3) {
			System.out.println("   |O O O                |");
		}
		if((ballCount - 1) == 4){
			System.out.println("   |O O O O              |");
		}
		if((ballCount - 1) == 5){
			System.out.println("   |O O O O O            |");
		}
		if((ballCount - 1) == 6) {
			System.out.println("   |O O O O O O          |");
		}
		if((ballCount - 1) == 7) {
			System.out.println("   |O O O O O O O        |");
		}
		if((ballCount - 1) == 8) {
			System.out.println("   |O O O O O O O O      |");
		}
		if((ballCount - 1) == 9) {
			System.out.println("   |O O O O O O O O O    |");
		}
		System.out.println("   |_____________________|");
	} 
	public static String numberToString(int n) {
		if(n==0) {
			return "   ";
		}
		if(n<100) {
			if(n<10) {
				return "00" + Integer.toString(n);
			}
			return "0" + Integer.toString(n);
		}
		return Integer.toString(n);
	}
	public static void fillString(int row2, int col2) {
		for(int row = 0; row < stringMatrix.length; row++){
			for(int col = 0; col < stringMatrix[0].length; col++) {
				stringMatrix[row][col] = numberToString(myMatrix[row][col]);
			}
		}
		stringMatrix[row2][col2] =" x ";
		
	}
}
