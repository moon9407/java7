package j0127;

public class C04 {
	
	// 기본 생성자- 생성자가 없으면 자동으로 기본 생성자를 생성해줌.(컴파일 할 때)
	C04(){}
	
	static int aa; // 클래스 변수 - 클래스명.변수명(static이 붙어있으면 무조건 class변수) ,   객체선언 없이 클래스명.변수명으로 접근 가능, 초기화 자동으로 설정
	// 인스턴스 변수 - 객체선언 후 참조변수 명,변수명
	int b; // 멤버변수는 자동으로 0으로 초기화
	public static void main(String[] args) {
		// 지역변수는 초기화가 자동으로 되지 않기에 초기화를 해줘야함.
		int a = 0; // 값을 0으로 초기화
		System.out.println(a);
		
		C04 c = new C04(); // 객체 선언
		System.out.println(c.b); // 멤버변수 b 출력
		
		System.out.println(aa); // 클래스변수 aa 출력

	}

}
