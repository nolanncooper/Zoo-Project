public class ScoreHeroScreen {
	private int [][] screenValues = new int [5][15];
	private String [] [] printValuesArray = new String [5][15];

	public ScoreHeroScreen() {
		startingIntArray();
		startingStringArray();
		printScreen();
	}
	
	public void startingIntArray() {
		//fills empty spaces
		for(int row = 0; row < screenValues.length; row++) {
			for(int col = 0; col < screenValues[0].length; col++) {
				screenValues[row][col] = 0;
			}
		}
		// fills in goal
		for(int r = 2; r < screenValues.length; r++) {
			for(int c = 2; c < 13; c++) {
				screenValues[r][c] = 1;
			}
			
		}
		// fills in goalkeeper
		screenValues [2][7] = 0;
		screenValues [3][7] = 0;
		screenValues [4][7] = 0;
		screenValues [3][6] = 0;
		screenValues [3][8] = 0;
		
		
	}
	public void startingStringArray() {
		for(int i = 0; i < screenValues.length; i++) {
			for(int z = 0; z < screenValues [0].length; z++ ) {
				printValuesArray [i][z] = numberToString(screenValues[i][z]);
			}
		}
		printValuesArray [2][7] = "o";
		printValuesArray [3][6] = "(";
		printValuesArray [3][7] = "|";
		printValuesArray [3][8] = ")";
		printValuesArray [4][7] = "^";


		

	}
	public static String numberToString(int n) {
		if(n == 0) {
			return " ";
		}
		if(n ==1) {
			return " ";
		}
		return Integer.toString(n);

	}
	public void printScreen() {
		System.out.println();
		System.out.println("");
		System.out.println(" " + printValuesArray[0][0] + " " + printValuesArray[0][1] + " " + printValuesArray[0][2] + " " + printValuesArray[0][3] + " " + printValuesArray[0][4] + " " + printValuesArray[0][5] + " " + printValuesArray[0][6] + " " + printValuesArray[0][7] + " " + printValuesArray[0][8] + " " + printValuesArray[0][9] + " " + printValuesArray[0][10] + " " + printValuesArray[0][11] + " " + printValuesArray[0][12] + " " + printValuesArray[0][13] + " " + printValuesArray[0][14] + " ");
		System.out.println("");
		System.out.println(" " + printValuesArray[1][0] + " " + printValuesArray[1][1] + "|" + printValuesArray[1][2] + "_" + printValuesArray[1][3] + "_" + printValuesArray[1][4] + "_" + printValuesArray[1][5] + "_" + printValuesArray[1][6] + "_" + printValuesArray[1][7] + "_" + printValuesArray[1][8] + "_" + printValuesArray[1][9] + "_" + printValuesArray[1][10] + "_" + printValuesArray[1][11] + "_" + printValuesArray[1][12] + "|" + printValuesArray[1][13] + " " + printValuesArray[1][14] + " ");
		System.out.println("");
		System.out.println(" " + printValuesArray[2][0] + " " + printValuesArray[2][1] + "|" + printValuesArray[2][2] + " " + printValuesArray[2][3] + " " + printValuesArray[2][4] + " " + printValuesArray[2][5] + " " + printValuesArray[2][6] + " " + printValuesArray[2][7] + " " + printValuesArray[2][8] + " " + printValuesArray[2][9] + " " + printValuesArray[2][10] + " " + printValuesArray[2][11] + " " + printValuesArray[2][12] + "|" + printValuesArray[2][13] + " " + printValuesArray[2][14] + " ");
		System.out.println("");
		System.out.println(" " + printValuesArray[3][0] + " " + printValuesArray[3][1] + "|" + printValuesArray[3][2] + " " + printValuesArray[3][3] + " " + printValuesArray[3][4] + " " + printValuesArray[3][5] + " " + printValuesArray[3][6] + " " + printValuesArray[3][7] + " " + printValuesArray[3][8] + " " + printValuesArray[3][9] + " " + printValuesArray[3][10] + " " + printValuesArray[3][11] + " " + printValuesArray[3][12] + "|" + printValuesArray[3][13] + " " + printValuesArray[3][14] + " ");
		System.out.println("");
		System.out.println(" " + printValuesArray[4][0] + " " + printValuesArray[4][1] + "|" + printValuesArray[4][2] + " " + printValuesArray[4][3] + " " + printValuesArray[4][4] + " " + printValuesArray[4][5] + " " + printValuesArray[4][6] + " " + printValuesArray[4][7] + " " + printValuesArray[4][8] + " " + printValuesArray[4][9] + " " + printValuesArray[4][10] + " " + printValuesArray[4][11] + " " + printValuesArray[4][12] + "|" + printValuesArray[4][13] + " " + printValuesArray[4][14] + " ");
	}
	public void regularShotValues() {
		int randRow = (int)((Math.random()*3)+2);
		int randCol = (int)((Math.random()*5)+4);
		if(randRow == 2) {
			if(randCol > 7) {
				screenValues [randRow][randCol] = 0;
				screenValues [randRow+1][randCol] = 0;
				screenValues [randRow][randCol +1] = 0;			
			}
			if(randCol == 7) {
				screenValues [randRow][randCol] = 0;
				screenValues [randRow][randCol-1] = 0;
				screenValues [randRow][randCol+1] = 0;
			}
			if(randCol > 7) {
				screenValues [randRow][randCol] = 0;
				screenValues [randRow +1] [randCol] = 0;
				screenValues [randRow][randCol -1] = 0;
				
			}
		}
		if(randRow == 3) {
			if(randCol < 7) {
				screenValues [3][5] = 0;
				screenValues [3][6] = 0;
				screenValues [3][7] = 0;
			}
			if(randCol == 7) {
				screenValues [3][6] = 0;
				screenValues [3][7] = 0;
				screenValues [3][8] = 0;
				
			}
			if(randCol <7) {
				screenValues [3][7] = 0;
				screenValues [3][8] = 0;
				screenValues [3][9] = 0;
			}
		}
		if(randRow == 4) {
			if(randCol > 7) {
				screenValues [randRow][randCol] = 0;
				screenValues [randRow-1][randCol] = 0;
				screenValues [randRow][randCol +1] = 0;			
			}
			if(randCol == 7) {
				screenValues [randRow][randCol] = 0;
				screenValues [randRow][randCol-1] = 0;
				screenValues [randRow][randCol+1] = 0;
			}
			if(randCol > 7) {
				screenValues [randRow][randCol] = 0;
				screenValues [randRow -1] [randCol] = 0;
				screenValues [randRow][randCol -1] = 0;
				
			}
		}
		
	}
	public int get(int r, int c ) {
		return screenValues[r][c];

	}
	public void showShot(int r1, int c1) {
		printValuesArray [r1][c1] = "O";
	}
	public void powerShotValues() {
		
	}
	public void chipShotValues() {
		for(int i = 0; i > 5; i++) {
			int randomC = (int)((Math.random() * 11)+2);
			screenValues [2][randomC] = 0;
		}
	}
	public void finesseShotValues() {
		int sideSelect = (int)((Math.random()*2) +1);
		int randomR = (int)((Math.random() * 3) + 2);
		// left dive
		if(sideSelect == 0) {
			for(int i = 2; i > 4; i++) {
				screenValues[randomR][i] = 0;
			}	
		}
		if(sideSelect == 1) {
			for(int z = 11; z < 13; z++) {
				screenValues[randomR][z] = 0;
			}
		}
	}
		
		
		
		
		
	


}
