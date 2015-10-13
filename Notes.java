
public class Notes {
	/*		PlayingCard[] deckOfCards = new PlayingCard[52];

	 vad är en kortlek

	 52 st kort
	 fyra typer (suits) hjärter, klöver, spader, ruter
	 färger röd, svart
	 värde (nummer, knekt, dam, kung, ess... knekt, dam, kung ess =
	 klädda).

	 PlayingCard card = new PlayingCard("Diamonds", 'A');  A=1,2-10,
	 11=J, 12=Q, 13=K
	 card2 = new PlayingCard("Hearts", 12);  A=1,2-10, 11=J,
	 12=Q, 13=K
	 PlayingCard card3 = new PlayingCard("Spades", 'A');  A=1,2-10,
	 11=J,
	 12=Q, 13=K
	 PlayingCard card4 = new PlayingCard("Clubs", 5);  A=1,2-10, 11=J,
	 12=Q, 13=K
	 PlayingCard card5 = new PlayingCard(1, "clubbbbs");

	 System.out.println(card.getValue() + " of " + card.getSuit());
	 System.out.println(card2);
	 System.out.println(card3);
	 System.out.println(card4);
	 System.out.println("det är " + PlayingCard.getNrOfCards() + "st kort
	 kvar i leken.");

	 PlayingCard[] handOfCards = new PlayingCard[5];

	 handOfCards[0] = card2;
	 handOfCards[1] = new PlayingCard("Hearts", 2);
	 handOfCards[2] = card3;
	 handOfCards[3] = card4;
	 System.out.println("in my hand i have " + handOfCards[0]);
	 System.out.println("in my hand i have " + handOfCards[0].getValue());
	 System.out.println("in my hand i have " + handOfCards[1]);

	/*
	 * vi vill generera en hel kortlek, en array med 52 element. men vi vill
	 * inte skriva PlayingCard card 1 = new PlayingCard (x, x).
	 * 
	 * de 52 korten är 4 färger * 13 valörer = 52 kort.
	

	String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

	 loopa igenom suits
	int deckIndex = 0;
	for (String theSuit : suits) {
		 skapa 13 valörer av färgen theSuit
		for (int i = 1; i <= 13; i++) {
			PlayingCard someCard = new PlayingCard(theSuit, i);
			deckOfCards[deckIndex] = someCard;
			deckIndex++;
		}
	}
	for (int i = 0; i < deckOfCards.length; i++) {
		System.out.println(deckOfCards[i]);
	}
	
	 * for (int i = 0; i < handOfCards.length; i++) { if (handOfCards[i] ==
	 * null) { } else { System.out.println(handOfCards[i]); }
	 * 
	 * }
	 * 
	 *  kortare kod för att loopa igenom tex en array.  theCard =
	 * tillfällig variabel för varje element. for (PlayingCard theCard :
	 * handOfCards) { if (theCard == null) { } else { System.out.println(
	 * "cards: " + theCard); } }
	 */
}
