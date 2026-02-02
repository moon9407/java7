package j0127;

public class Stuscore {
	
	// 초기화블록
	{
		count++; //객체가 생성될때마다 1씩 증가
		no = count; // 객체마다 고유번호 부여 
	}
	
	//생성자 : 초기화메서드
	// 생성자 특징: 클래스명이 같다, 리턴타입이 없다., void 없음.
	Stuscore(){} //기본생성자
	// 매개변수가 있는 생성자
	Stuscore(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
	}
	//멤버변수
	static int count;
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	//총점 계산 메서드
	void calTotal(int kor, int eng, int math) {
		this.total = kor + eng + math;
	}
	//평균 계산 메서드
	void calAvg(int kor, int eng, int math) {
		this.avg = (kor+eng+math) / 3.0;
	}

}
