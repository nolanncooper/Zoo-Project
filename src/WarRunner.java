public class WarRunner {
	private static Deck ogDeck = new Deck();
	private static Deck player1Deck = new Deck();
	private static Deck player2Deck = new Deck();
	public static void main() {
		instructions();
		setupGame();
		playGame();

	}
	public static void setupGame() {

		ogDeck.fillDeck();
		ogDeck.shuffle();		
		//deal in player 1 and player 2
		for(int i = 0; ogDeck.getDeck().size() > 0; i++) {
			if(i%2 == 0) {
				player1Deck.addCard(ogDeck.getDeck().get(0));

			}
			if(i%2 != 0) {
				player2Deck.addCard(ogDeck.getDeck().get(0));
			}
			ogDeck.removeCard(0);
		}
	}
	public static void playGame() {
		while(player1Deck.getDeck().size() != 0 && player2Deck.getDeck().size() != 0) {
			int winner = 0;
			boolean boot = false;
			int counter = 0;
			while(!boot) {
				counter++;
				// if player 1 wins
				if(player1Deck.getDeck().get(counter - 1).getValue() > player2Deck.getDeck().get(counter - 1).getValue()) {
					winner= 1;
					boot = true;
				}
				// if player 2 wins
				if(player2Deck.getDeck().get(counter - 1).getValue() > player1Deck.getDeck().get(counter - 1).getValue()) {
					winner = 2;	
					boot = true;
				}
				// in the event of a tie in the last duel, the cards are shuffled and counter resets.
				if((player1Deck.getDeck().get(counter -1 ).getValue() == player2Deck.getDeck().get(counter - 1).getValue()) && (counter == player1Deck.getDeck().size() || counter == player2Deck.getDeck().size())) {
					counter = 0;
					player1Deck.shuffle();
					player2Deck.shuffle();
				}
				// explains that there has been a tie
				if(player1Deck.getDeck().get(counter -1 ).getValue() == player2Deck.getDeck().get(counter - 1).getValue()) {
					System.out.println("There has been a tie.");
				}
				
			}

			if(winner == 1) {
				System.out.println("player 1 beat player 2's " + player2Deck.getDeck().get(counter-1).getRank() + " of " + player2Deck.getDeck().get(counter-1).getSuit() + " with a " + player1Deck.getDeck().get(counter-1).getRank() + " of " + player1Deck.getDeck().get(counter-1).getSuit() + ".");
				for(int i = 0; i < counter; i++) {
					player1Deck.addCard(player2Deck.getDeck().get(0));
					player2Deck.removeCard(0);
				}

			}
			
			if(winner == 2) {
				System.out.println("player 2 beat player 1's " + player1Deck.getDeck().get(counter-1).getRank() + " of " + player1Deck.getDeck().get(counter-1).getSuit() + " with a " + player2Deck.getDeck().get(counter-1).getRank() + " of " + player2Deck.getDeck().get(counter-1).getSuit() + ".");
				for(int i = 0; i < counter; i++) {
					player2Deck.addCard(player1Deck.getDeck().get(0));
					player1Deck.removeCard(0);
				}


			}
		
			player1Deck.shuffle();
			player2Deck.shuffle();
			System.out.println("Player 1 Deck Size: " + player1Deck.getDeck().size());
			System.out.println("Player 2 Deck Size: " + player2Deck.getDeck().size());
			System.out.println();
			if(player1Deck.getDeck().size() == 52) {
				System.out.println("PLAYER 1 HAS WON IT!!!");
			}
			if(player2Deck.getDeck().size() == 52) {
				System.out.println("PLAYER 2 HAS WON IT!!!");
			}

			}
	}
	public static void instructions() {
		System.out.println("Welcome to the game of war. A deck of 52 cards will be divided evenly between 2 players. Each player will play one card at a time and whichever");
		System.out.println("contains the highest value will take the cards. In the event of a tie, the next round of cards will determine the winner.");
		System.out.println("The game is over when one player runs out of cards. Now on with it!");
	}
}
