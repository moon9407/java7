package j0127;

public class Card extends Object {
	static final int KIND_NUM = 4;
	String kind;
	private int number;
	String[] num = {"0","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	//기본생성자
	Card(){
		super(); //Object클래스의 생성자호출
	}
	
	//매개변수가 있는 생성자
	Card(String kind, int number) {
		super();
		this.kind = kind;//this는 멤버변수 구분용
		this.number = number;
	}
	
	@Override //Object클래스에 있는 11개 메소드 중에 1개
	public String toString() {
		return String.format("[%s,%s]",kind,num[number]);
	}
}
