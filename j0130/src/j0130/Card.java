package j0130;

public class Card {
	
	Card(){}
	Card(String kind,int number){
		this.kind = kind;
		this.number = number;
	}
	
	int number;
	String kind;
	
	//@Override //어노테이션
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
