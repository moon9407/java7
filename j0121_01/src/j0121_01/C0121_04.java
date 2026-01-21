package j0121_01;

import java.util.Scanner;

public class C0121_04 {

	public static void main(String[] args) {
		
		// 학생성적프로그램 - 이름,국어,영어,수학,합계
		Scanner scanner = new Scanner(System.in);
		String[] name = new String[2]; // 이름 배열
		int[][] score = new int[2][4]; // 국어,영어,수학,합계 배열
		double[] avg = new double[2]; // 평균 배열
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		
		// 1. 성적입력
		int i = 0; // 학생수
		while(i<2) { 
			System.out.printf("%s 이름을 입력하세요.>> ",title[0]);
			name[i] = scanner.next();
			int total = 0;
			for(int j=0;j<3;j++) { // 과목수별 점수 입력
				System.out.printf("%s 점수를 입력하세요.>> ",title[j+1]);
				score[i][j] = scanner.nextInt();
				total += score[i][j]; // 합계 계산
			}
			score[i][3] = total; // 합계 저장
			avg[i] = total / 3.0; // 평균 계산
			i++; // 다음 학생
		}
		// 2. 성적출력
		System.out.println("             [학생성적 프로그램]");
		System.out.println("----------------------------------------------");
		// 제목출력
		for (int t = 0; t < title.length; t++) {
			System.out.print(title[t] + "\t");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		
		// 내용출력 (이름,국어,영어,수학,합계)
		for (int k = 0; k < score.length; k++) {
			//이름
			System.out.print(name[k] + "\t");
			for (int p = 0; p < score[k].length; p++) {
				//국어,영어,수학,합계
				System.out.print(score[k][p]+"\t");
			}
			//평균
			System.out.printf("%.2f \n", avg[k]);			
		}
		
		
		
//		// [2차원배열] - 방법 1은 직접 0으로 초기화, 방법 2는 1~25까지 순차적으로 입력 후 섞기
//		// 방법 2
//		// 입력부분
//		int[][] score = new int[5][5]; // 5행 5열
//		int[] a = new int[25]; // 1~25까지 순차적으로 입력 후 섞기용 배열
//		// 1차원 입력 부분 // 방법 2
//		for (int i = 0; i < a.length; i++) {
//			a[i] = i + 1; // 1~25까지 입력
//		}
//		// 배열 섞기 부분 // 방법 2
//		for (int i = 0; i < 200; i++) { // 200번 섞기
//			int no = (int) (Math.random() * 25); // 0~24까지 랜덤 번호 생성
//			int temp = a[0]; // 첫번째 값 임시저장
//			a[0] = a[no];    // 첫번째 값과 랜덤 위치 값 교환
//			a[no] = temp;   //  랜덤 위치에 임시저장 값 대입
//		}
//		
//		// 2차원 배열에 값 입력 부분
//		for(int i=0; i<score.length;i++) { // 행
//			for (int j = 0; j < score[i].length; j++) { // 열
////				score[i][j] = (i*5) + j+1; // i행 j열의 값 = (i*5)+j+1 , 랜덤배열 하기 전 값 입력용
//				score[i][j] = a[5*i+j];                     // 섞은 1차원 배열 값을 2차원 배열에 대입         
//			}
//		}
//		// 출력 부분
//		for(int i=0; i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
//		// 방법 1
//		int[][] score = { // 5행 5열, 값 0으로 지정
//				{ 0, 0, 0, 0, 0 }, 
//				{ 0, 0, 0, 0, 0 }, 
//				{ 0, 0, 0, 0, 0 }, 
//				{ 0, 0, 0, 0, 0 }, 
//				{ 0, 0, 0, 0, 0 },
//		};
//		// 출력 부분
//		for(int i=0; i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		
		// [1차원 배열] - 방법 2는 1~25까지 순차적으로 입력 후 섞기
//		// 방법 2
		// 입력부분
//		int[] a = new int[25]; // 배열 선언
//		for (int i = 0; i < a.length; i++) { // 배열에 값 입력
//			a[i] = i + 1; // 1,2,3 입력
//		}
//		// 배열 섞기 부분
//		for(int i=0; i<200; i++) {
//			int no = (int)(Math.random()*25);
//			int temp = a[0];
//			a[0] = a[no];
//			a[no] = temp;
//		}
//		// 배열 출력
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + "\t");
//		}
//		
//		//방법 1
//		int[] a2 = {1,2,3}; // 배열 선언
//		
//		for (int i = 0; i < a2.length; i++) { // 배열에 값 입력
//			System.out.print(a2[i] + "\t"); // 배열 출력
//		}
	}

}
