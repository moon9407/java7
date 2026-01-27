package j0122_01;

public class C0122_06 {
	
	//메소드 선언
	static int add(int a, int b, int c) {
		return a + b +c;
	}
	static int sub(int a, int b, int c) {
		return a-b-c;
	}

	static int[] cal(int a, int b, int c) {
		
		int[] re = new int[2]; // 배열로 리턴값 반환
		int result = a+b+c; // 빠져나오면 사라지는 지역변수
		re[0] = a + b + c;
		re[1] = a - b - c;
		return re; // 배열 리턴
	}

//	static int multi(int a, int b, int c) {
//		return a * b * c;
//	}
//	static double divide(int a, int b, int c) {
//		return a / (double)b / c;
//	}
		

	public static void main(String[] args) {
		// 변수 선언
		int a = 10;
		int b = 3;
		int c = 2;
		int[] re;
		
		re = cal(a,b,c);
		
		System.out.println(re[0]+"," + re[1]);
		
		
		
		// 결과값을 저장할 변수 선언
//		int result = 0, result2 = 0, result3 = 0;
//		double result4 = 0;
//		
//		// add, sub, multi, divide 메소드를 만들어 결과값을 리턴받아 출력하시오.
//		result = add(a, b, c);
//		result2 = sub(a, b, c);
//		result3 = multi(a, b, c);
//        result4 = divide(a, b, c);
//        System.out.printf("더하기 : %d , 빼기 : %d , 곱하기 :  %d , 나누기 :  %.2f", result, result2, result3, result4);
//        
        
        
	}

}
