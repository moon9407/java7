package j0119_01;

import java.util.Scanner;

public class C0119_06 {

	public static void main(String[] args) {
		
		int count = 0;
		String num = "9789057899979971234567";
		
		// indexOf() 메소드, for 문을 사용해서 7이 몇개 사용되었는지 출력하시오.
		// 7이 있는 위치와 7이 총 몇개가 있는지 출력하시오.
		
		
		
//		System.out.println(num.indexOf("7",15));
		
		
//		if(num.indexOf("7")==-1) {
//			System.out.println("해당 문자가 없습니다.");
//		} else {
//			System.out.println("문자위치 : "+num.indexOf("7"));
//		}
//		
//		String num = "1234567";
//		// charAt(): 문자열에서 해당 위치값을 문자로 변환
//		
//		// indexOf() : 해당 문자열의 위치값을 반환하는 메소드, 없으면 -1 반환
//		System.out.println(num.indexOf("8")); 
//		
//		if(num.indexOf("7")==-1) {
//			System.out.println("해당 문자가 없습니다.");
//		} else {
//			System.out.println("문자위치 : "+num.indexOf("8"));
//		}
		
		// contain() : 해당 문자열이 있는지 확인하는 메소드
//		if(num.contains("7")) {
//			System.out.println("7이 있습니다.");
//		} else {
//			System.out.println("7이 없습니다.");
//		}
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		// 랜덤숫자 1개(0~9)를 생성해서 입력받은 숫자 7개 중 랜덤숫자랑 똑같은 숫자가 몇개인지 출력하시오.
//		int rnum = (int)(Math.random()*10);           //0~9
//		int r = (char)(rnum +'0');
//		
//		// int형 -> char형 변환
//		// (char)(1 +'0') = 1+48 = 49 : 문자(1)
//		// char숫자타입을 int형으로 변환하려면 -'0'을 해주면된다.
//		// (char)('7' -'0') = 55 - 48 = 7 : 숫자(7)
//		
//		char ch = (char)(rnum+'0');                   //char형변환
//		int count = 0;                                //같은개수
//		System.out.println("숫자 7개를 입력하세요.>> "); // 입력받을 숫자
//		String input = scanner.next();
//		
//		for (int i = 0; i < input.length(); i++) {
//			if (input.charAt(i) == ch)count++;
//		}
//		
//		System.out.println("랜덤숫자:"+rnum);
//		System.out.println("입력숫자:"+input);
//		System.out.println("같은 개수:"+count);	
		
		
		//숫자를 입력받아,charAt을 사용해 7이 몇개 입력되었는지 출력하시오.
//		int count = 0;
//		System.out.println("숫자를 입력하세요.>> ");
//		String input = scanner.next();
//		
//		for (int i = 0; i < input.length(); i++) {
//			if (input.charAt(i) == '7')count++;
//		}
//		
//		System.out.println(input.length());
//		System.out.println("입력숫자:"+input);
//		System.out.println("결과:"+count);
		
		
		//랜덤숫자 5개를 뽑아서 7이 몇개 있는지 출력하시오.
//		int count = 0;
//		String random_num ="";
//		
//		for(int i=0;i<5;i++) {
//			int rnum = (int)(Math.random()*10);
//			random_num += rnum;
//			if (rnum == 7) {
//				count++;
//			}
//			
//		}
//		
//		
//		System.out.println("랜덤숫자:"+random_num);
//		System.out.println("결과값:"+count);
		
		
//		int sum = 0;
//		int i = 0;
//		for (i=0;i<=10;i++) {
//			sum+=i;
//		}
//		System.out.println(i+","+sum);
		
		
		
		// 1~100 까지의 합을 구하시오.
//		int sum = 0;
//		
//		for (int i=1;i<=100;i++) {
//			System.out.println(i);
//			sum += i;
//			System.out.println(i+","+sum); 
//		}
		
		// 1~100 까지의 홀수의 합을 구하시오.
//		int sum = 0;
//		for (int i=1;i<=100;i++) {
//			if(i%2==1) {
//				sum += i;
//				System.out.println(i+","+sum);
//			}
//		}
		
//		 1~100 까지의 홀수의 합이 100을 넘는 시점을 구하시오.
//		int sum = 0;
//		for (int i=1;i<=100;i++) {
//			if(i%2==1) {
//				sum += i;
//				if(sum>=100) {
//					System.out.println(i+","+sum); 
//					break;
//				}
//			}
//		}
		
		
//		int sum = 0;
//		
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//			sum += i;
//			System.out.println(i+","+sum);
//		}

		// 0~9까지 랜덤숫자 5개를 출력하시오. 15467
//				int r_num = (int)(Math.random()*10);
//				int r_num2 = (int)(Math.random()*10);
//				int r_num3 = (int)(Math.random()*10);
//				int r_num4 = (int)(Math.random()*10);
//				int r_num5 = (int)(Math.random()*10);
//				System.out.println("%d%d%d%d%d\n",r_num+r_num2+r_num3+r_num4+r_num5);
				
				
				
				// 0~9
//				int r_num = (int)(Math.random()*10);
				//0~99
//				int r_num2 = (int)(Math.random()*100);
				// 0~49
//				int r_num3 = (int)(Math.random()*50);
				
				
				
				
//				int random_num = (int)(Math.random()*45)+1;
//				int random_num2 = (int)(Math.random()*100)+1;
//				System.out.println("랜덤숫자:"+random_num);
	}

}
