package j0129; //패키지-없으면에러, 없으면 자동생성

public class TryClass extends Object { // 없으면 자동생성(Object)-11개메소드자동설정
	
	//기본생성자 - 없으면 에러, 없으면 자동생성
	TryClass(){
		super(); //자동생성 - 부모생성자 호출
	}
	
	// equals(),toString(),hasCode()... 11개 메소드 존재함.
	
	void method() throws Exception { // try~catch
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(0/0);
		System.out.println(4);
		System.out.println(5);
	}

}
