package j0127;

public class Deck extends Object {
	Card[] c = new Card[52];
	String[] shape = {"SPADE", "DIAMOND", "HEART", "CLOVER"};
	
	//기본생성자
	Deck() {
		super(); 
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(shape[i/13],(i%13)+1); //객체생성
		}
	}
	//카드섞기 메서드
	void shuffle() {
		Card temp;
		for (int i = 0; i < 1000; i++) { //1000번섞기
			int no = (int) (Math.random() * 52);//0~51랜덤수
			temp = c[0]; //첫번째카드백업
			c[0] = c[no]; //랜덤카드첫번째위치이동
			c[no] = temp; //백업카드랜덤위치이동
		}
	}
	
	//전체카드출력 메서드
	void cardAllPrint() {
		for(int i=0;i<c.length;i++) {
//			System.out.println(c[i].num[c[i].number]+","+c[i].kind);
			System.out.println(c[i]);
		}
	}
	//5장카드출력 메서드
	void card5Print() {
		for(int i=0;i<5;i++) {
			System.out.println(c[i].number+","+c[i].kind);
		}
	}
	//카드1장뽑기 메서드 , 오버로딩
	void pick() {
		int random = (int)(Math.random()*52);
		System.out.println(c[random].number+","+c[random].kind);
	}
	//인덱스카드뽑기 메서드, 오버로딩
	void pick(int index) {
		index = index%52;
		System.out.println(c[index].number+","+c[index].kind);
	}
}
