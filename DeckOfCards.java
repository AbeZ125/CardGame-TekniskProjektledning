import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {

	private static String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

	public static ArrayList<PlayingCard> getDeckOfCards() {

		ArrayList<PlayingCard> myDeckOfCards = new ArrayList<PlayingCard>();
		// loopa igenom suits
		for (String theSuit : suits) {
			// skapa 13 valörer av färgen theSuit
			for (int i = 1; i <= 13; i++) {
				PlayingCard someCard = new PlayingCard(theSuit, i);
				myDeckOfCards.add(someCard);
			}
		}
		return myDeckOfCards;
	}
	public static PlayingCard drawRandomCard() {
		Random rand = new Random();
		int randomCard = rand.nextInt((CardGame.deck.size()) + 1);
		PlayingCard card = CardGame.deck.get(randomCard);
		CardGame.deck.remove(randomCard);
		return card;
	}

}
