package j0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0121_08 {

	public static void main(String[] args) {
//		1~45까지 랜덤숫자 6개를 추출해 입력받은 6개 숫자와 몇개가 일치하는지 출력하시오.
		// 로또번호 : 
		// 입력번호 :
		// 맞은번호 :
		// 당첨개수 :
		Scanner scanner = new Scanner(System.in);
		
		// 1. 배열 선언
		int[] num = new int[45];
		int[] random = new int[6];
		int[] input = new int[6];
		int count = 0;
		int[] lotto = new int[6];
		
		
		// 2. 1~45까지 순차번호 넣기
		for(int i=0;i<45;i++) {
			num[i] = i+1;
		}
//		System.out.println("번호 : "+Arrays.toString(num)); //전체번호 확인용 출력
		
		// 2. 번호 섞기
		for(int i=0;i<300;i++) {
			int no = (int)(Math.random()*45); // 0~44까지 랜덤번호 추출
			int temp = num[0]; // num[0] 위치의 값을 temp 변수에 임시 저장
			num[0] = num[no]; // num[no] 위치의 값을 num[0] 위치로 이동
			num[no]= temp;    // 임시저장된 temp 값을 num[no] 위치로 이동
		}
		System.out.println("섞인번호 : "+Arrays.toString(num)); //섞은 번호 전체 확인용 출력
		
		// 3. 당첨번호 6개 추출
		for (int i = 0; i < random.length; i++) { // 0~5까지 반복
			random[i] = num[i]; // 섞인 num배열의 0~5 위치값을 random배열에 대입
		}
		
		
		// 4. 입력번호 6개 저장
		for(int i=0;i<6;i++) {  // 0~5까지 반복
			System.out.println("1~45까지 번호를 입력하세요.>> "); // 번호입력
			input[i] = scanner.nextInt(); // 입력번호를 input배열에 저장
		}
		
		
		// 5. 맞춘 개수, 번호 확인 및 저장
		
		for(int i=0;i<random.length;i++) { // 당첨번호(random) 0째부터 5째까지 반복
			for (int j = 0; j < input.length; j++) {     // 입력번호(input) 0째부터 5째까지 반복
				if (random[i] == input[j]) { // 당첨번호와 입력번호가 같으면
					lotto[count] = random[i];   // 맞춘번호를 lotto배열에 저장
					count++;  // 맞춘개수 증가
					break;
				}
			}
		}
		// 6. 결과출력
		System.out.println("로또번호 : "+Arrays.toString(random));
		System.out.println("입력번호 : "+Arrays.toString(input));
		System.out.println("맞은번호 : "+Arrays.toString(lotto));
		System.out.println("당첨개수 : "+count+"개");
		
		

	}

}
