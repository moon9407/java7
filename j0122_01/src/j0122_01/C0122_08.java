package j0122_01;

public class C0122_08 {
	
	static void cal(int kor, int eng, int math, double[] cValue) { // 실행순서4  : 합계, 평균을 구하는 함수
		int sum = kor + eng + math;  
		double avg = sum / 3.0;     
		cValue[0] = sum;  
		cValue[1] = avg;  
	}
	

	public static void main(String[] args) {
		
		double[] cValue = new double[2]; // 실행순서1  :합계, 평균을 저장할 배열
		
		int kor = 100;  // 실행순서2 : 국어, 영어, 수학 점수
		int eng = 100;
		int math = 99;
		
		// 함수 호출 후 합계, 평균을 구해서 출력하시오.
		cal(kor, eng, math, cValue);  // 실행순서3  : 함수 호출(위 값 전달 후 가져오기)
		System.out.println("합계: " + (int)cValue[0]); // 실행순서5  : 합계 출력
		System.out.printf("평균: %.2f",cValue[1]);  	  // 실행순서6  : 평균 출력
		

	}

}
