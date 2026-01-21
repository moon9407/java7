package j0121_01;

import java.util.Scanner;

public class C0121_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 퀴즈 - 1조 123456. : 123456은 랜덤번호로 받기
		// 끝번호 6 맞추면 - 500원
		// 5,6 맞추면 - 1,000원
		// 4,5,6 맞추면 - 10,000원
		// 3,4,5,6 맞추면 - 100,000원
		// 2,3,4,5,6 맞추면 - 1,000,000원
		// 1,2,3,4,5,6 맞추면 - 10,000,000원
		// 코드 작성
		
		
		
		
		
		// 6자리를 랜덤으로 생성(첫번째 자리 0 불가)
		// 100000 ~ 199999 까지 생성
        int random = (int)(Math.random()*100000)+100000; 
        // 생성순서 : math.random() : 0.0 이상 ~ 1.0 미만의 double 난수 생성
        // 0.0 ~ 0.99999 * 100000 = 0.0 ~ 99999.9
        // int 변환 = 0 ~ 99999
        // + 100000 = 100000 ~ 199999
//        System.out.println("랜덤번호 : "+random);
        String lotto = String.format("%06d", random); // 6자리 맞춤, 이렇게 하면 000001 ~ 099999 까지도 가능
        System.out.println("랜덤번호 : "+lotto);
        // 1번퀴즈 입력번호(000005) 와 끝번호가 맞는지 확인해서 맞춤,틀림 출력
     	
 		System.out.println("6자리번호를 입력하세요.>>");
     	String input = scanner.next(); // 6자리 문자열 입력받기
     	
     	if (input.charAt(5) == lotto.charAt(5))
     		System.out.println("500원");
     	else
     		System.out.println("틀림");
     	
//		if (input.charAt(5) == lotto.charAt(5)) 
//			if (input.charAt(4) == lotto.charAt(4)) 
//				if (input.charAt(3) == lotto.charAt(3)) 
//					if (input.charAt(2) == lotto.charAt(2)) 
//						if (input.charAt(1) == lotto.charAt(1)) 
//							if (input.charAt(0) == lotto.charAt(0)) 
//								System.out.println("10,000,000원");
//							 else 
//								System.out.println("1,000,000원");
//							
//						 else 
//							System.out.println("100,000원");
//						
//					 else 
//						System.out.println("10,000원");
//					
//				 else 
//					System.out.println("1,000원");
//				
//			 else
//			System.out.println("500원");
//		else {
//			System.out.println("틀림");
		

		
		
//		Scanner scanner = new Scanner(System.in);
//		// 0~9까지 2진수 문자열 배열 선언
//		String[] binary = {
//				"0000", "0001", "0010", "0011", 
//				"0100", "0101", "0110", "0111",
//				"1000", "1001"
//		};
//		
//		// 숫자 1개를 입력받아 , 2진수를 출력하세요.
//		System.out.println("숫자를 입력하세요.>>");
////		int input = scanner.nextInt();
////		System.out.println(binary[input]);
//		String input = scanner.next();
//		System.out.println(binary[Integer.parseInt(input)]); // 문자열 -> int타입 변환
////		System.out.println(binary[input.charAt(0)-'0']);  // 문자 -> int타입 변환
		
		
		// 1987 -> 0001 1001 1000 0111 : 10진수 -> 2진수 변환
		// 0752 -> String타입으로 입력받아야함.
//		System.out.println("숫자를 입력하세요.>> ");
//		String input = scanner.next(); // 0752
		
//		// 입력받은 문자열의 각 문자 하나씩 추출
//		for(int i=0;i<input.length();i++) {
////			binary[input.charAt(i)-'0']; // '0'->0 , '7'->7 , '5'->5 , '2'->2
//			System.out.println(binary[input.charAt(i)-'0']); // 각 문자에 해당하는 2진수 출력
//		}
		
		
		
//		// 숫자타입 -> 문자열타입
//		System.out.println(""+7+7.7); // "77.7"
//		// 문자열 -> int타입
//		int a = Integer.parseInt("77"); // 77
//		// 문자열 -> double 타입 
//		double b = Double.parseDouble("77.7");  // 77.7
//		
//		// 문자(char)숫자타입 -> int타입
//		System.out.println('9'-'0'); // 9
//		
//		// int타입 -> 문자(char)숫자타입
//		System.out.println((char)(9+'0')); // '9'
		
		

	}

}
