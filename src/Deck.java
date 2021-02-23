
import java.util.ArrayList;
import java.util.Collections;
public class Deck
	{
	private ArrayList<Card> Deck = new ArrayList<Card>();
	public void fillDeck()
		{
		Deck.add(new Card("ace", "hearts", 14));
		Deck.add(new Card("ace", "clubs", 14));
		Deck.add(new Card("ace", "spades", 14));
		Deck.add(new Card("ace", "diamonds", 14));
		Deck.add(new Card("king", "hearts", 13));
		Deck.add(new Card("king", "clubs", 13));
		Deck.add(new Card("king", "spades", 13));
		Deck.add(new Card("king", "diamonds", 13));
		Deck.add(new Card("queen", "hearts", 12));
		Deck.add(new Card("queen", "clubs", 12));
		Deck.add(new Card("queen", "spades", 12));
		Deck.add(new Card("queen", "diamonds", 12));
		Deck.add(new Card("jack", "hearts", 11));
		Deck.add(new Card("jack", "clubs", 11));
		Deck.add(new Card("jack", "spades", 11));
		Deck.add(new Card("jack", "diamonds", 11));
		Deck.add(new Card("ten", "hearts", 10));
		Deck.add(new Card("ten", "clubs", 10));
		Deck.add(new Card("ten", "spades", 10));
		Deck.add(new Card("ten", "diamonds", 10));
		Deck.add(new Card("nine", "hearts", 9));
		Deck.add(new Card("nine", "clubs", 9));
		Deck.add(new Card("nine", "spades", 9));
		Deck.add(new Card("nine", "diamonds", 9));
		Deck.add(new Card("eight", "hearts", 8));
		Deck.add(new Card("eight", "clubs", 8));
		Deck.add(new Card("eight", "spades", 8));
		Deck.add(new Card("eight", "diamonds", 8));
		Deck.add(new Card("seven", "hearts", 7));
		Deck.add(new Card("seven", "clubs", 7));
		Deck.add(new Card("seven", "spades", 7));
		Deck.add(new Card("seven", "diamonds", 7));
		Deck.add(new Card("six", "hearts", 6));
		Deck.add(new Card("six", "clubs", 6));
		Deck.add(new Card("six", "spades", 6));
		Deck.add(new Card("six", "diamonds", 6));
		Deck.add(new Card("five", "hearts", 5));
		Deck.add(new Card("five", "clubs", 5));
		Deck.add(new Card("five", "spades", 5));
		Deck.add(new Card("five", "diamonds", 5));
		Deck.add(new Card("four", "hearts", 4));
		Deck.add(new Card("four", "clubs", 4));
		Deck.add(new Card("four", "spades", 4));
		Deck.add(new Card("four", "diamonds", 4));
		Deck.add(new Card("three", "hearts", 3));
		Deck.add(new Card("three", "clubs", 3));
		Deck.add(new Card("three", "spades", 3));
		Deck.add(new Card("three", "diamonds", 3));
		Deck.add(new Card("two", "hearts", 2));
		Deck.add(new Card("two", "clubs", 2));
		Deck.add(new Card("two", "spades", 2));
		Deck.add(new Card("two", "diamonds", 2));
		}
	public ArrayList<Card> getDeck() {
		return Deck;
	}
	public void setDeck(ArrayList<Card> deck) {
		Deck = deck;
	}
	public void addCard(Card n) {
	Deck.add(n);
	}
	public void removeCard(int n) {
		Deck.remove(n);
		}
	public void shuffle()
		{
		Collections.shuffle(Deck);
		}
	}
