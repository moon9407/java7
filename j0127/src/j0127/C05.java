package j0127;

public class C05 extends Object {
	
	C05(){
		super(); // 부모클래스의 생성자 호출 - 없으면 에러, 없으면 자동으로 부여 (컴파일 시)
	}

	public static void main(String[] args) {
		Stuscore s1 = new Stuscore();
		s1.no=1;
		s1.name="홍길동";
		
		Stuscore s = new Stuscore("홍길동",100,100,99);
		

	}

}
