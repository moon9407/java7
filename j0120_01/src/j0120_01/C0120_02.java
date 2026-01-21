package j0120_01;

import java.util.Scanner;

public class C0120_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1~100까지의 랜덤숫자를 생성해서 10번시도해서 맞추는 코드 작성.
		// while문과 for 문으로 구현.
		// 1번째 시도입니다.
		// 입력번호가 랜덤 번호보다 클 경우 "더 작은 수를 입력하세요." 작을경우 "더 큰 수를 입력하세요." 출력.
		// 정답입니다.
		// 정답: 랜덤숫자
		
		//for문
		int rnum = (int)(Math.random()*100)+1; // 1~100
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d번째 시도입니다. 번호를 입력하세요.>> ", i);
			int input = scanner.nextInt();
			if (input > rnum) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if (input < rnum) {
				System.out.println("더 큰 수를 입력하세요.");
			} else {
				System.out.printf("랜덤숫자 %d, 내가 입력한 숫자 : %d \n정답입니다.", rnum, input);
				break;
			}
			if (i == 10) {
				System.out.printf("정답은 %d입니다.\n", rnum);
			}
		}
		
		//while문
//		int rnum = (int)(Math.random()*100)+1; // 1~100
//		int i = 1;
//		while (i<=10) {
//			System.out.printf("%d번째 시도입니다. 번호를 입력하세요.>> ", i);
//			int input = scanner.nextInt();
//			i++;
//			if (input > rnum) {
//				System.out.println("더 작은 수를 입력하세요.");
//			} else if (input < rnum) {
//				System.out.println("더 큰 수를 입력하세요.");
//			} else {
//				System.out.printf("랜덤숫자 %d, 내가 입력한 숫자 : %d \n정답입니다.", rnum, input);
//				break;
//			}
//			if (i == 11) {
//				System.out.printf("정답은 %d입니다.\n", rnum);
//			}
//		}
		
		
		
		// 구구단 출력
		//3,7을 입력하면 3단부터 7단까지 출력, 7->3도 가능
//		System.out.println("시작 단을 입력하세요.>> ");
//		int input1 = scanner.nextInt();
//		System.out.println("종료 단을 입력하세요.>> ");
//		int input2 = scanner.nextInt();
//		int num1 = (input1 < input2 ? input1 : input2);
//		int num2 = (input1 > input2 ? input1 : input2);
////		int num1 = Math.min(input1, input2);
////		int num2 = Math.max(input1, input2);
//		
//		for (int i = num1; i <= num2; i++) {
//			System.out.printf("[ %d단 ]\n", i);
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d x %d = %d\n", i, j, (i * j));
//			}
//			System.out.println();
//		}
		
		
		
		
		
		// 000
		// 001
		// 002
		// ...
		// 999
//		int i = 0; //초기값
//		while (i<=9) { //조건식
//			int j = 0;
//			while (j <= 9) { // 조건식
//				int k = 0;
//				while (k <= 9) { // 조건식
//					System.out.printf("%d%d%d\n", i, j, k);
//					k++;// 증감식
//				}
//				j++;// 증감식
//			}
//			i++;//증감식
//		}

		
//		for (int i = 0; i <= 9; i++) {
//			for (int j = 0; j <= 9; j++) {
//				for (int k = 0; k <= 9; k++) {
//					System.out.printf("%d%d%d\n", i, j, k);
//				}
//			}
//		}
		
		
//		for(int i=0;i<2;i++) {
//			System.out.println("이름을 입력하세요.>> ");
//			String name = scanner.next();
//			System.out.println("국어점수를 입력하세요.>> ");
//			int kor = scanner.nextInt();
//			System.out.printf("%s\t%d\n", name, kor);
//			break;
//		}
				
		// 2명의 성적을 모두 입력받아 출력하세요.
		
		
//		 구구단 짝수단을 단별로 출력하세요
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d단 ] \t", i);
//		}
//        System.out.println();		
//		for(int i=1;i<=9;i++) {
//            for(int j=2;j<=9;j++) {
//                System.out.printf("%d x %d = %d\t", j, i, (i*j));
//            }
//            System.out.println();
//        }
//		
		// 구구단 출력하는데 짝수 단만 출력하시오
//		for(int i=2;i<=9;i++) {
//			if(i%2==0) continue;
//            System.out.printf("[ %d단 ]\n", i);
//            for(int j=1;j<=9;j++) {
//				  if(j%2==0) continue;
//                System.out.printf("%d x %d = %d\n", i, j, (i*j));
//            }
//            System.out.println();
//        }
			

		// 중첩 for문
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d단 ]\n", i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d x %d = %d\n", i, j, (i*j));
//			}
//		}

	}

}
