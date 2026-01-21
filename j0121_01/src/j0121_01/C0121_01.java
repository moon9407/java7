package j0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0121_01 {

	public static void main(String[] args) {
		// [ 1-45까지 로또 프로그램 구현 ]
		// 1. 순차번호 넣기
		// 1,2,3,...45
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[45]; // 1~45까지 저장할 배열선언
		int[] random = new int[6]; // 로또 당첨번호 6개 저장할 배열선언
		int[] input = new int[6]; // 사용자가 입력한 6개 번호 저장할 배열선언
		int[] lotto = new int[6]; // 맞춘번호(입력번호==당첨번호) 저장할 배열선언
		int count = 0; // 맞춘 개수 저장할 변수선언
		for (int i=0; i<45; i++) { // 0~44까지 반복
			num[i] = i + 1; // num[0] = 1 , num[1] = 2 , ... , num[44] = 45
		}
		
		System.out.println(Arrays.toString(num)); // 배열전체출력
		
		// 2. 번호섞기
		for(int i=0;i<300;i++) { // 300번 섞기
			int no = (int)(Math.random() * 45); // 0~44까지 랜덤번호 추출
			int temp = num[0]; // num[0] 위치의 값을 temp 변수에 백업
			num[0] = num[no]; // num[no] 위치의 값을 num[0] 위치로 이동
			num[no] = temp; // 백업된 temp 값을 num[no] 위치로 이동
		}
		
		System.out.println(Arrays.toString(num));  // 섞인 배열전체출력
		
		// 3. 6개 번호추출
		for (int i = 0; i < random.length; i++) { // 0~5까지 반복
			random[i] = num[i]; // 섞인 num배열의 0~5 위치값을 random배열에 대입
		}
		
		// 4.6개 입력번호 저장
		for(int i=0;i<6;i++) { // 0~5까지 반복
			System.out.println("1~45까지 번호를 입력하세요.>> "); // 번호입력
			input[i] = scanner.nextInt(); // 입력번호를 input배열에 저장
		}
		
		// 5. 입력번호, 당첨번호 확인
		for (int i = 0; i < random.length; i++) { // 0~5까지 반복
			for (int j = 0; j < input.length; j++) {  // 0~5까지 반복
				if (random[i] == input[j]) { // 당첨번호와 입력번호가 같으면
					lotto[count] = random[i]; // 맞춘번호를 lotto배열에 저장
					count++; // 맞춘개수 증가
					break; // 안쪽 for문 탈출
				}
			}
		}
		
		// 6. 모두 출력
		System.out.println("당첨번호 : "+Arrays.toString(random)); // 당첨번호 출력
		System.out.println("입력번호 : "+Arrays.toString(input)); // 입력번호 출력
		System.out.println("맞춘번호 : "+Arrays.toString(lotto)); // 맞춘번호 출력
		System.out.println("맞춘개수 : "+count+"개"); // 맞춘개수 출력
		

	}

}
