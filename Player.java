import java.util.ArrayList;

public class Player extends Human {
	private int points = 0;
	private ArrayList<PlayingCard> handOfCards = new ArrayList<>();

	public Player(String str) {
		super(str);
	}

	public ArrayList<PlayingCard> getHandOfCards() {
		return handOfCards;
	}

	public void addCard(PlayingCard card) {
		handOfCards.add(card);
	}

	public int getCardValue(int index) {
		PlayingCard card = handOfCards.get(index);
		int value = card.getValue();
		return value;

	}
	public void setPoint(int point){
		points += point;
	}
	public int getPoints(){
		return points;
	}
}