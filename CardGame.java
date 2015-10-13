import java.util.ArrayList;
//import java.util.Random;
import java.util.Scanner;

public class CardGame {
	static ArrayList<PlayingCard> deck;
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("välkommen till kortspelet!!!!!!");
		deck = DeckOfCards.getDeckOfCards();
		System.out.println();
		/*
		 * for (PlayingCard card : deck){ System.out.println(card); }
		 */
		Player one = new Player(setName());
		Player two = new Player(setName());

		one.addCard(DeckOfCards.drawRandomCard());
		System.out.println("Player One is " + one.getName() + ".");
		System.out.println("Player One hand is " + one.getHandOfCards());

		two.addCard(DeckOfCards.drawRandomCard());
		System.out.println("Player Two is " + two.getName() + ".");
		System.out.println("Player Two hand is " + two.getHandOfCards());
		System.out.println(deck.size());
				
		if (one.getCardValue(0) > two.getCardValue(0)){
			System.out.println(one.getName() + " is the winner");
			one.setPoint(one.getCardValue(0) + two.getCardValue(0));
		}else if (one.getCardValue(0) == two.getCardValue(0)){
			System.out.println("its a draw!");
		}else{
			System.out.println(two.getName() + " is winner");
			two.setPoint(two.getCardValue(0) + one.getCardValue(0));
		}
		System.out.println(one.getName() + " has " + one.getPoints() + " points");
		System.out.println(two.getName() + " has " + two.getPoints() + " points");
	}

	private static String setName() {
		System.out.println("Enter name: ");
		String playerName = keyboard.nextLine();
		return playerName;
	}
	


}