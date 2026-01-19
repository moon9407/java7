package j0119_01;

import java.util.Scanner;

public class C0119_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 98 이상 A+, 94이상 A, 93이상 A-,
		// 88 이상 B+, 84이상 B, 83이상 B-,
		// 77이상 C+, 74이상 C, 73이상 C-,
		// 66이상 D+, 60미만 F
		//출력하시오.
		System.out.println("음료선택을 하세요.>> ");
		System.out.println("1.아메리카노");
		System.out.println("2.바닐라라떼");
		System.out.println("3.아이스티");
		System.out.println("원하는 번호를 선택하세요.>> ");
		int input = scanner.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("아메리카노를 생산합니다.");
			//2분
			break;
		case 2:
			System.out.println("바닐라라떼를 생산합니다.");
			//3분
			break;
		case 3:
			System.out.println("아이스티를 생산합니다.");
			//1분40초
			break;
		}
		
		
		
		
//		System.out.println("점수를 입력하시오.>> ");
//		int input = scanner.nextInt();
//		if(input>=98) {
//            System.out.println("A+");
//        } else if(input>=94) {
//			System.out.println("A");
//		} else if (input >= 93) {
//			System.out.println("A-");
//		} else if (input >= 88) {
//			System.out.println("B+");
//		} else if (input >= 84) {
//			System.out.println("B");
//		} else if (input >= 83) {
//			System.out.println("B-");
//		} else if (input >= 77) {
//			System.out.println("C+");
//		} else if (input >= 74) {
//			System.out.println("C");
//		} else if (input >= 73) {
//			System.out.println("C-");
//		} else if (input >= 66) {
//			System.out.println("D+");
//		} else if (input >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//        }
		
		
		
		
		// 5자리 숫자를 입력받아 그 중 7이 몇개인지 출력하시오. 77777->5, 12345->0, 71727->3
//		int count = 0;
//		System.out.println("5자리 숫자를 입력하시오.>> ");
//		// 문자역 -> charAt() 사용해서
//		String input = scanner.next();
//		if (input.charAt(0) == '7') count++;
//		if (input.charAt(1) == '7') count++;
//		if (input.charAt(2) == '7') count++;
//		if (input.charAt(3) == '7') count++;
//		if (input.charAt(4) == '7') count++;
//		
//		System.out.println("개수 : " + count);
		
		
//		System.out.println("숫자를 입력하시오.>> ");
//		int input = scanner.nextInt();
		
		// 수 (90점 이상),우(80~89),미(70~79),양(60~69),가(60미만) 출력
//		if (input >= 90) {
//			System.out.println("수");
//		} else if (input >= 80) {
//			System.out.println("우");
//		} else if (input >= 70) {
//			System.out.println("미");
//		} else if (input >= 60) {
//			System.out.println("양");
//		} else {
//			System.out.println("가");
//		}
		
		
		
		// 양수입력 시 0, 음수 입력시 1 출력
//		if(input>0 ) {
//			System.out.println("양수입니다.");
//		}else if(input==0) {
//			System.out.println("0입니다.");
//		} else {
//			System.out.println("음수입니다.");
//		}
		
		
		
		
		
		// if문 사용 시 한줄일 때는 {} 생략 가능
//		if (input>=60) {
//			System.out.println("합격입니다.");
//		} else {
//			System.out.println("불합격입니다.");
//		}

	}

}
