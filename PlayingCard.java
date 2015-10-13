
public class PlayingCard {

	// klassvariabler

	
		
	
	// instansvariabler
	private String suit_ = "";
	private int value_;

	
	// statiska variabler
	

	//Konstruktor // ALLTID MED
	
	public PlayingCard(String suit, int value){
	//	this.suit_ = suit;
	//	this.value_ = value;
		suit_ = suit;
		value_ = value;
		
	}
	
	public PlayingCard(int value, String suit){
	//	this.suit_ = suit;
	//	this.value_ = value;
		suit_ = suit;
		value_ = value;
		
	}

	public PlayingCard(String suit, char value){
		if (value=='A')value_=1;
		else if (value == 'J')value_=11;
		else if (value == 'Q')value_=12;
		else if (value == 'K')value_=13;
		suit_ = suit;
		
	}
	
	// objektets metoder
	
	//toString = speciell metod för att representera ens objekt som en sträng.
	//exempel: namnet på objektet, ID:t på objektet, nånting beskrivande för just det objektet.
	
	public String toString(){ // ALLTID MED (mer eller mindre standard för objekt).
		String dress_ = null;
		String card_;
		if (value_== 1)dress_ = "Ace";
		else if (value_ == 11)dress_ = "Jack";
		else if (value_ == 12)dress_ = "Queen";
		else if (value_ == 13)dress_ = "King";
		if (dress_ == null)card_ = value_ + " of " + suit_;
		else card_ = dress_ + " of " + suit_;
		return card_;
	}
	
	
	public String getCardInfo(){
		
		String information = value_ + " of " + suit_;

		return information;
	}
	
	public String getSuit(){
		return suit_;
	}

	public int getValue(){
		return value_;
	}

}
