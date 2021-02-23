import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class ScoreHeroMain {
	public static int userGoals = 0;
	public static int computerGoals = 0;
	public static int computerShotCount = 0;
	public static int shotCount = 0;
	public static String userTeam = "";
	public static String computerTeam = "";
	public static String [] playerSheetsArray = new String [139];
	public static int teamLo = 0;
	public static void ScoreHeroRun() throws IOException {
		instructions();
		teamSelect();
		play();
	}
	public static void instructions() {
		System.out.println("Welcome to Score Hero! The object of the game is simple: score more goals than the other team! Each team will be given 5 penalty shots, and if the game is still tied after 5 shots the game will be taken to sudden death. Beating the opposition goalkeeper is a difficult task, but by utilizing the power shot, chip shot, and finesse shot, you could improve your chances of scoring.");
		System.out.println("If you need a run down of the controls, type 'yes', if not, type 'no'.");
		Scanner userInput = new Scanner(System.in);
		String controlsOpt = userInput.nextLine();
		if(controlsOpt.equals("yes")) {
			System.out.println("Don't worry, the controls are pretty simple. If you have played fifa before, this game uses the same controls.");
			System.out.println("For a normal shot: enter 'b'");
			System.out.println("For a power shot: enter 'bb'");
			System.out.println("For a chip shot: enter 'lb'");
			System.out.println("For a finesse shot: enter 'rb'");
			System.out.println("Told you it was easy!");
		}
		if(controlsOpt.equals("no")){
			System.out.println("Perfect, now let's get to it!");
		}
	}
	public static void teamSelect() throws IOException {
		Scanner playerFile = new Scanner(new File("PlayerSheets"));
		for(int ps = 0; ps < playerSheetsArray.length; ps++) {
			playerSheetsArray[ps] = playerFile.nextLine();
		}
		
		System.out.println("You'll be competing with some of the greatest teams the football world has ever seen. Press enter to view the available teams.");
		Scanner blah = new Scanner(System.in);
		String bla = blah.nextLine();
		for(int i = 0; i < playerSheetsArray.length; i+=7) {
			System.out.println(playerSheetsArray[i]);
		}
		System.out.println("To select the team you would like to use, simply input its name.");
		Scanner teamInput = new Scanner(System.in);
		userTeam = teamInput.nextLine();
		SpaceAdder.addSpace();
		
		for(int z = 0; z <playerSheetsArray.length; z++) {
			if(playerSheetsArray[z].equals(userTeam)) {
				teamLo = z;
			}
		}
		System.out.println("You have selected the team: " + userTeam);
		System.out.println("This team includes the following superstars: ");
		for(int x = (teamLo+1); x < (teamLo + 6); x++) {
			System.out.print(playerSheetsArray[x] + ". ");
		}
		
		//computer team select
		int teamC = (int)(Math.random() * 20);
		String [] teams = new String [20];
		for(int iii = 0; iii < teams.length; iii++) {
				teams [iii] = playerSheetsArray[7*iii ];
		}
		computerTeam = teams[teamC];
		System.out.println("The team you'll be playing against is: " + computerTeam);
	}
	public static void play() {
		int playerCounter = 0;
		int computerCounter = 0;
		System.out.println();
		System.out.println("Time to play! Remember the highest number of penalties scored after 5 shots wins. If it's a tie, we go into sudden death.");

		ScoreHeroScreen mainScreen = new ScoreHeroScreen();
		// user shootout
		for(int i = 0; i < 5; i++) {
			System.out.println("Taking the shot is: " + playerSheetsArray[(teamLo+1)+i]);
			System.out.println("Choose the type of shot.");
			Scanner userI = new Scanner(System.in);
			String shotType = userI.nextLine();
			// regular shot 
			if(shotType.equals("b")) {
				mainScreen.regularShotValues();
				int randRegR = (int)((Math.random()*3) +2);
				int randRegC = (int)((Math.random()*11) +2);
				if(mainScreen.get(randRegR, randRegC) == 1) {
					userGoals++;
				}
				mainScreen.showShot(randRegR, randRegC);
			}
			// power shot
			if(shotType.equals("bb")) {
				mainScreen.powerShotValues();
				int randPowR = (int)((Math.random()*4)+1);
				int randPowC = (int)((Math.random()*5) + 5);
				if(mainScreen.get(randPowR, randPowC) == 1) {
					userGoals++;
				}
				mainScreen.showShot(randPowR, randPowC);
			}
			// chip shot
			if(shotType.equals("lb")) {
				mainScreen.chipShotValues();
				int randChipR = (int)((Math.random() * 2) +1);
				int randChipC = (int)((Math.random()*11) +2);
				if(mainScreen.get(randChipR,  randChipC) == 1) {
					userGoals++;
				}
				mainScreen.showShot(randChipR, randChipC);
			}
			// finesse shot
			if(shotType.equals("rb")) {
				mainScreen.finesseShotValues();
				int sideChoose = (int)(Math.random() * 2);
				if(sideChoose == 0) {
					int randFinR1 = (int)((Math.random() * 3) + 2);
					int randFinC1 = (int)((Math.random() * 3) + 1);
					if(mainScreen.get(randFinR1, randFinC1) == 1) {
						userGoals++;
					}
					mainScreen.showShot(randFinR1, randFinC1);
				}
				if(sideChoose == 1) {
					int randFinR2 = (int)((Math.random()*3) + 2);
					int randFinC2 = (int)((Math.random()*3) + 11);
					if(mainScreen.get(randFinR2, randFinC2) == 1) {
						userGoals++;
					}
					mainScreen.showShot(randFinR2, randFinC2);
				}
			}
			shotCount++;
			mainScreen.printScreen();
			System.out.println("Number of shots taken : " + shotCount);
			System.out.println("Number of Goals Scored: " + userGoals);
			SpaceAdder.addSpace();
			
		}
		
		// computer shoot-out
		
		for(int i = 0; i < 5; i++) {
			
			String shotTypeC = "";
			int shotTypeInt = (int)((Math.random()*4) + 1);
			if(shotTypeInt == 1) {
				shotTypeC = "b";
			}
			if(shotTypeInt == 2) {
				shotTypeC = "bb";
			}
			if(shotTypeInt == 3) {
				shotTypeC = "lb";
			}
			if(shotTypeInt == 4) {
				shotTypeC = "rb";
			}
			
			//regular shot
			if(shotTypeC.equals("b")) {
				mainScreen.regularShotValues();
				int randRegR1 = (int)((Math.random()*3) +2);
				int randRegC1 = (int)((Math.random()*11) +2);
				if(mainScreen.get(randRegR1, randRegC1) == 1) {
					computerGoals++;
				}
				
			}
			// power shot
			if(shotTypeC.equals("bb")) {
				mainScreen.powerShotValues();
				int randPowR1 = (int)((Math.random()*4)+1);
				int randPowC1 = (int)((Math.random()*5) + 5);
				if(mainScreen.get(randPowR1, randPowC1) == 1) {
					computerGoals++;
				}
				
			}
			// chip shot
			if(shotTypeC.equals("lb")) {
				mainScreen.chipShotValues();
				int randChipR1 = (int)((Math.random() * 2) +1);
				int randChipC1 = (int)((Math.random()*11) +2);
				if(mainScreen.get(randChipR1,  randChipC1) == 1) {
					computerGoals++;
				}
				
			}
			// finesse shot
			if(shotTypeC.equals("rb")) {
				mainScreen.finesseShotValues();
				int sideChoose = (int)(Math.random() * 2);
				if(sideChoose == 0) {
					int randFinR3 = (int)((Math.random() * 3) + 2);
					int randFinC3 = (int)((Math.random() * 3) + 1);
					if(mainScreen.get(randFinR3, randFinC3) == 1) {
						computerGoals++;
					}
					
				}
				if(sideChoose == 1) {
					int randFinR4 = (int)((Math.random()*3) + 2);
					int randFinC4 = (int)((Math.random()*3) + 11);
					if(mainScreen.get(randFinR4, randFinC4) == 1) {
						computerGoals++;
					}
				}
			}
			computerShotCount++;
			
			
		}
		System.out.println("Number of shots taken by Computer: " + computerShotCount);
		System.out.println("Number of Goals Scored by Computer: " + computerGoals);
		if(userGoals > computerGoals) {
			System.out.println();
			System.out.println("YOU'VE DONE IT!");
			System.out.println(userTeam + " ARE THE CHAMPIONS OF THE WORLD!");
		}
		if(computerGoals > userGoals) {
			System.out.println();
			System.out.println("Better luck next time. :(");
		}
		if(userGoals == computerGoals) {
			System.out.println();
			System.out.println("On to sudden Death!");
			boolean boot = false;
			int i = 0;
			while(!boot) {
				System.out.println("Taking the shot is: " + playerSheetsArray[(teamLo+1)+i]);
				System.out.println("Choose the type of shot.");
				Scanner userMe = new Scanner(System.in);
				String shotType = userMe.nextLine();
				// regular shot 
				if(shotType.equals("b")) {
					mainScreen.regularShotValues();
					int randRegR = (int)((Math.random()*3) +2);
					int randRegC = (int)((Math.random()*11) +2);
					if(mainScreen.get(randRegR, randRegC) == 1) {
						userGoals++;
					}
					mainScreen.showShot(randRegR, randRegC);
				}
				// power shot
				if(shotType.equals("bb")) {
					mainScreen.powerShotValues();
					int randPowR = (int)((Math.random()*4)+1);
					int randPowC = (int)((Math.random()*5) + 5);
					if(mainScreen.get(randPowR, randPowC) == 1) {
						userGoals++;
					}
					mainScreen.showShot(randPowR, randPowC);
				}
				// chip shot
				if(shotType.equals("lb")) {
					mainScreen.chipShotValues();
					int randChipR = (int)((Math.random() * 2) +1);
					int randChipC = (int)((Math.random()*11) +2);
					if(mainScreen.get(randChipR,  randChipC) == 1) {
						userGoals++;
					}
					mainScreen.showShot(randChipR, randChipC);
				}
				// finesse shot
				if(shotType.equals("rb")) {
					mainScreen.finesseShotValues();
					int sideChoose = (int)(Math.random() * 2);
					if(sideChoose == 0) {
						int randFinR1 = (int)((Math.random() * 3) + 2);
						int randFinC1 = (int)((Math.random() * 3) + 1);
						if(mainScreen.get(randFinR1, randFinC1) == 1) {
							userGoals++;
						}
						mainScreen.showShot(randFinR1, randFinC1);
					}
					if(sideChoose == 1) {
						int randFinR2 = (int)((Math.random()*3) + 2);
						int randFinC2 = (int)((Math.random()*3) + 11);
						if(mainScreen.get(randFinR2, randFinC2) == 1) {
							userGoals++;
						}
						mainScreen.showShot(randFinR2, randFinC2);
					}
				}
				shotCount++;
				mainScreen.printScreen();
				System.out.println("Number of shots taken : " + shotCount);
				System.out.println("Number of Goals Scored: " + userGoals);
				if(i < 5) {
					i++;
				}
				if(i == 5) {
					i = 0;
				}
				
				//computer's turn!
				
				String shotTypeC = "";
				int shotTypeInt = (int)((Math.random()*4) + 1);
				if(shotTypeInt == 1) {
					shotTypeC = "b";
				}
				if(shotTypeInt == 2) {
					shotTypeC = "bb";
				}
				if(shotTypeInt == 3) {
					shotTypeC = "lb";
				}
				if(shotTypeInt == 4) {
					shotTypeC = "rb";
				}
				//regular shot
				if(shotTypeC.equals("b")) {
					mainScreen.regularShotValues();
					int randRegR1 = (int)((Math.random()*3) +2);
					int randRegC1 = (int)((Math.random()*11) +2);
					if(mainScreen.get(randRegR1, randRegC1) == 1) {
						computerGoals++;
					}
					
				}
				// power shot
				if(shotTypeC.equals("bb")) {
					mainScreen.powerShotValues();
					int randPowR1 = (int)((Math.random()*4)+1);
					int randPowC1 = (int)((Math.random()*5) + 5);
					if(mainScreen.get(randPowR1, randPowC1) == 1) {
						computerGoals++;
					}
					
				}
				// chip shot
				if(shotTypeC.equals("lb")) {
					mainScreen.chipShotValues();
					int randChipR1 = (int)((Math.random() * 2) +1);
					int randChipC1 = (int)((Math.random()*11) +2);
					if(mainScreen.get(randChipR1,  randChipC1) == 1) {
						computerGoals++;
					}
					
				}
				// finesse shot
				if(shotTypeC.equals("rb")) {
					mainScreen.finesseShotValues();
					int sideChoose = (int)(Math.random() * 2);
					if(sideChoose == 0) {
						int randFinR3 = (int)((Math.random() * 3) + 2);
						int randFinC3 = (int)((Math.random() * 3) + 1);
						if(mainScreen.get(randFinR3, randFinC3) == 1) {
							computerGoals++;
						}
						
					}
					if(sideChoose == 1) {
						int randFinR4 = (int)((Math.random()*3) + 2);
						int randFinC4 = (int)((Math.random()*3) + 11);
						if(mainScreen.get(randFinR4, randFinC4) == 1) {
							computerGoals++;
						}
					}
				}
				computerShotCount++;
				System.out.println();
				System.out.println("Number of shots taken by Computer: " + computerShotCount);
				System.out.println("Number of Goals Scored by Computer: " + computerGoals);
				
				
				if(computerGoals > userGoals) {
					System.out.println();
					System.out.println("That's too bad. Better Luck Next Time. ");
					boot = true;
				}
				if(userGoals > computerGoals) {
					System.out.println();
					System.out.println("YOU'VE DONE IT!");
					System.out.println(userTeam + " ARE THE CHAMPIONS OF THE WORLD!");
					boot = true;
				}
			}
			
		}
	}
	
	
}
