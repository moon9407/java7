package j0120_01;

import java.util.Scanner;

public class C0120_01 {

	public static void main(String[] args) {
		
		// boolean,char,byte,short,int,long,float,double
		// 등가비교 ==, != 가능
//		int a = 10;
//		if(a==10) {
//			System.out.println("맞습니다.");
//		} else {
//			System.out.println("틀립니다.");
//		}
		
		// String타입은 등가비교 ==, != 가 되지 않음.
		// 객체타입은 .equals() 메서드를 사용하여 비교해야 함.
		
		String str1 = "10";
		String str2 = "100";
		String str3 = new String("10");
		String str4 = "10";
		
		
		System.out.printf("%s,%s,%s \n",str1,str2,str3);
		if(str1==str4) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		if(str1==str3) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		if(str1.equals(str3)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		
		
//		String str1 = "['게임','골프','수영','조깅','독서']";
//		String str2 = "['게임','조깅','독서']";
//		String str3 = "['게임','골프','독서']";
//		String str4 = "['게임','수영','조깅','독서']";
//		String str5 = "['게임','골프','독서']";
//		
//		// 수영이 포함되어 있는 문자열을 수영이 있습니다. 수영이 없습니다. 로 출력하세요.
//        if(str1.contains("수영")) System.out.println("수영이 있습니다.");
//        else System.out.println("수영이 없습니다.");
//        
//		if (str2.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
//		if (str3.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
//		if (str4.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
//		if (str5.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자을 입력하세요.>> ");
//		String str = scanner.next();
//		System.out.println("찾고자 하는 번호를 입력하세요.>> ");
//		String input = scanner.next();
//		// contains() : 문자열 포함여부 확인, indexOf() : 문자열 위치 확인
//		// 3의 위치를 다 출력하시오.
//		int startNo = 0;
//		int count = 0;
//		String s_print = "";
//		for(;;) {
//			int temp = str.indexOf(input, startNo);
//			if(temp == -1)	break;
//			// 3을 찾았을 경우
//			count++;
//			s_print += temp + " ";
//			startNo = temp + 1;
//		}
//		System.out.printf("%s의 위치 : %s \n" +input, s_print);
//		System.out.printf("%s포함 개수 : %d \n" ,input, count);
//		
//		//contains()
//		String str = "12345";
//		if (str.contains("3")==true) {
//			System.out.println("3이 포함되어 있습니다.");
//		} else {
//			System.out.println("3이 포함되어 있지 않습니다.");
//		}
		
		
		
		
		
//		System.out.println("숫자를 입력하세요.>> ");
//		String str = scanner.next();
//		
//		// 7이 몇번 입력되었는지 개수를 출력하시오. 입력된 숫자길이도 출력하시오.
//		int count = 0;
//		String s_print = "";
//		for (int i = 0; i < str.length(); i++) {
//			int no = str.charAt(i)-'0';
//			if (no == '7') {
//				count++;
//				if (count == 1)
//					s_print = i + "";
//				else
//					s_print += ("," + i);
//			}
//		}
//		System.out.println("입력된 숫자길이 : " + str.length());
//		System.out.println("7위치 : " + s_print);
//		System.out.println("7개수 : " + count);
		
		
		
		
//		// 1459 -> 입력받은 숫자들의 합을 구하시오.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		String str = scanner.next(); // "1459";
//
//		int sum = 0;
//		String s_print = "";
//		for (int i = 0; i < str.length(); i++) {
//			int no = str.charAt(i) - '0'; // char타입을 숫자타입으로 변경
//			sum += no;
//			if(i==0) s_print = no+"";
//			else s_print += (","+no); // 1,4,5,9,
//		}
//		System.out.println("입력된 숫자길이 : "+str.length());
//		System.out.println("출력 : "+s_print);
//		System.out.println("결과값 : "+ sum); // 19
		
//		// 34.1592 소수점 3째자리에서 반올림하여 출력하시오.
//		double num = 34.1592;
//		num = Math.round(num * 100) / 100.0; // 계산순서 : 34.1592*100=3415.92 -> Math.round(3415.92)=3416 -> 3416/100.0=34.16
//		System.out.println(num); // 34.16
		
//		// 소수점 반올림 : Math.round(실수값) 올림 : Math.ceil(실수값) 버림 : Math.floor(실수값)
//		System.out.println(Math.round(34.95)); // 35
//		System.out.println(Math.ceil(34.95));  // 35.0
//		System.out.println(Math.floor(34.95)); // 34.0
//		

//		// Math.random()  0*10=0 <= int(Math.random()*10)+1 < 1*10+1
//		
//		// 1~5까지 랜덤숫자를 중복이 없도록 입력하시오.
//		int no1 = 0;
//		int no2 = 0;
//		int no3 = 0;
//		
//		for (;;) {
//			no1 = (int) (Math.random() * 5) + 1;
//			no2 = (int) (Math.random() * 5) + 1;
//			no3 = (int) (Math.random() * 5) + 1;
//
//			if (no1 != no2 && no2 != no3 && no1 != no3) {
//				break;
//			}
//		}
//		System.out.println("no1 :" + no1);
//		System.out.println("no2 :" + no2);
//		System.out.println("no3 :" + no3);
		
//		no1 = (int)(Math.random()*3)+1;
//		no2 = (int)(Math.random()*3)+1;
//		no3 = (int)(Math.random()*3)+1;
//		
//		System.out.println("no1 :"+ no1);
//		System.out.println("no2 :"+ no2);
//		System.out.println("no3 :"+ no3);
		
		
		
//		// 형변환 방법
//		// 문자로된 숫자를 실세 숫자타입으로 변경
//		int no = '2'-'0';
//		System.out.println(no);  // int 숫자로 치환 50-48 = 2
//		
//		// 숫자를 문자로 치환
//		char ch = (char)(2 + '0');
//		System.out.println(ch);  // char 문자로 치환 2+48 = 50 -> '2'
//		
//		// String타입 -> char타입 변경
//		String str = "123";
//		char ch2 = str.charAt(0); // str에서 0번째 문자 추출
//		
//		// 숫자타입 -> String타입 변경
//		String str3 = 234 + ""; // 빈문자열과 더하게 되면 String타입으로 변경됨
//		
//		// String -> int
//		String str4 = "20";
//		int num = Integer.parseInt(str4); // String타입을 int타입으로 변경
//		String str5 = "10";
//		int num2 = Integer.parseInt(str5); // String타입을 int타입으로 변경
//		System.out.println(str4 + str5); // 2010 (문자열 연결)
//		System.out.println(num + num2); // 30 (숫자 더하기)
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("[ 학생성적프로그램 ]");
//		System.out.println("1. 학생성적입력");
//		System.out.println("2. 학생성적출력");
//		System.out.println("3. 학생성적수정");
//		int choice = scanner.nextInt();
//		// if문 : 여러개 실행 가능
//		if (choice == 1) {
//			System.out.println("[학생성적입력]");
//		} else if (choice == 2) {
//			System.out.println("[학생성적출력]");
//		} else if (choice == 3) {
//			System.out.println("[학생성적수정]");
//		} else {
//			System.out.println("잘못된 선택입니다.");
//		}
		
		// switch문 : 해당 값만 실행 후 빠져나옴 (break 필수)
//		switch (choice) {
//		case 1:
//			System.out.println("[학생성적입력]");
//			break;
//		case 2:
//			System.out.println("[학생성적출력]");
//			break;
//		case 3:
//			System.out.println("[학생성적수정]");
//			break;
//		default:
//			System.out.println("잘못된 선택입니다.");
//			break;
//		}

	}

}
