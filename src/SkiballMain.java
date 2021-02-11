import java.util.Scanner;
public class SkiballMain {
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
	public static void SkiballRun() { 
		myMatrix = new int [7][7];
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
		myMatrix[0][6] = 100;
		myMatrix[3][3] = 50;
		myMatrix[3][6] = 100;
		myMatrix[6][6] = 100;
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
		System.out.println("There are 12 different targets ranging from 25 to 50 to 100 points. The greater the amount of points available, the harder it is to hit that target.");
		System.out.println("You will be given a choice to select how many attempts you get, and with each attempt you will also have to decide how many points to go for.");
		System.out.println("And without further adieu, let the game begin!");
		System.out.println();
	}
	
	public static void playGame() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Would you like 3, 6, or 9 attempts?");
		int ballCount = userInput.nextInt();
		System.out.println(ballCount + " balls coming right up!");
		System.out.println();
		
		if(ballCount == 3) {
			for(int i = 0; i < 3; i++) {
				System.out.println();
				System.out.println("You have " + (ballCount-i) + " shots remaining.");
				System.out.println("Are you going for 100 points, 50 points or 25 points?");
				int response = userInput.nextInt();
				if(response == 100) {
					int threePointRow = (int)(Math.random() * 7 );
					int threePointCol = (int)((Math.random()*2 )+ 5);
					System.out.println(myMatrix[threePointRow][threePointCol] + " points!");
					pointCounter = pointCounter + myMatrix[threePointRow][threePointCol];
				}
				if(response == 50) {
					int twoPointRow = (int) ((Math.random() * 5) + 1);
					int twoPointCol = (int) ((Math.random() * 5) + 1);
					System.out.println(myMatrix[twoPointRow][twoPointCol] + " points!");
					pointCounter = pointCounter + myMatrix[twoPointRow][twoPointCol];
				}
				if(response == 25) {
					int onePointRow = (int) (Math.random() * 7);
					int onePointCol = (int) ((Math.random() * 3) + 2);
					System.out.println(myMatrix[onePointRow][onePointCol] + " points!");
					pointCounter = pointCounter + myMatrix[onePointRow][onePointCol];
				}
			}
		}
		if(ballCount == 6) {
			for(int i = 0; i < 6; i++) {
				System.out.println();
				System.out.println("You have " + (ballCount-i) + " shots remaining.");
				System.out.println("Are you going for 100 points, 50 points or 25 points?");
				int response = userInput.nextInt();
				if(response == 100) {
					int threePointRow = (int)(Math.random() * 7 );
					int threePointCol = (int)((Math.random()*2 )+ 5);
					System.out.println(myMatrix[threePointRow][threePointCol] + " points!");
					pointCounter = pointCounter + myMatrix[threePointRow][threePointCol];
				}
				if(response == 50) {
					int twoPointRow = (int) ((Math.random() * 5) + 1);
					int twoPointCol = (int) ((Math.random() * 5) + 1);
					System.out.println(myMatrix[twoPointRow][twoPointCol] + " points!");
					pointCounter = pointCounter + myMatrix[twoPointRow][twoPointCol];
				}
				if(response == 25) {
					int onePointRow = (int) (Math.random() * 7);
					int onePointCol = (int) ((Math.random() * 3) + 2);
					System.out.println(myMatrix[onePointRow][onePointCol] + " points!");
					pointCounter = pointCounter + myMatrix[onePointRow][onePointCol];
				}
			}
		}
		if(ballCount == 9) {
			for(int i = 0; i < 9; i++) {
				System.out.println();
				System.out.println("You have " + (ballCount-i) + " shots remaining.");
				System.out.println("Are you going for 100 points, 50 points or 25 points?");
				int response = userInput.nextInt();
				if(response == 100) {
					int threePointRow = (int)(Math.random() * 7 );
					int threePointCol = (int)((Math.random()*2 )+ 5);
					System.out.println(myMatrix[threePointRow][threePointCol] + " points!");
					pointCounter = pointCounter + myMatrix[threePointRow][threePointCol];
				}
				if(response == 50) {
					int twoPointRow = (int) ((Math.random() * 5) + 1);
					int twoPointCol = (int) ((Math.random() * 5) + 1);
					System.out.println(myMatrix[twoPointRow][twoPointCol] + " points!");
					pointCounter = pointCounter + myMatrix[twoPointRow][twoPointCol];
				}
				if(response == 25) {
					int onePointRow = (int) (Math.random() * 7);
					int onePointCol = (int) ((Math.random() * 3) + 2);
					System.out.println(myMatrix[onePointRow][onePointCol] + " points!");
					pointCounter = pointCounter + myMatrix[onePointRow][onePointCol];
				}
			}
		}
		System.out.println("______________________________________________________________________________________________________");
		System.out.println();
		System.out.println("Well done! You scored a total of " + pointCounter + " points.");
	}
}
