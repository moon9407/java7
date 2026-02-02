package j0127;

public class C06 {

	public static void main(String[] args) {
		// 객체선언
		CationTv c1 = new CationTv();
		System.out.println(c1.text);
		c1.caption();
		
		
		System.out.println(c1.channel);
		System.out.println(c1.power);
		c1.power();
		c1.channelUp();
		c1.channelDown();
		
		//다형성 - 부모의 참조변수로 자손의 객체를 다루는것
		Tv t1 = new Tv();
		//자손의 참조변수로 조상의 객체를 다루는것(x)
		CationTv c2 = new Tv();

	}

}
