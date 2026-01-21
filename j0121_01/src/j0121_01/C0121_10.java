package j0121_01;

import java.util.Scanner;

public class C0121_10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 1. 변수선언
		int[] no = new int[5];
		String[] name = new String[5];
		int[][] score = new int[5][4];
		double[] avg = new double[5];
		int total = 0, count = 0;
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		
		// 2. 화면출력
		loop : while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적검색");
			System.out.println("0. 종료");
			System.out.println("=========================");
			System.out.print("원하는 번호를 입력하세요.>> ");
			int choice = scanner.nextInt();
			
			switch(choice) {
			// 학생성적입력
			case 1:
				System.out.println(" [ 학생성적입력 ] ");
				System.out.printf("%d번째 학생이름을 입력하세요.>> ",count+1);
				name[count] = scanner.next(); // 이름입력 후 배열저장
				for(int i=0;i<3;i++) {
					System.out.printf("%s 점수를 입력하세요.>> ",title[i+2]);
					score[count][i] = scanner.nextInt(); // 국어, 영어, 수학 점수 입력 후 2차원배열 저장
					total += score[count][i]; // 합계 계산
				}
				
				score[count][3] = total; // 합계 저장
				avg[count] = total/3.0; // 평균 계산 후 저장
				no[count] = count +1; // 번호 저장
				count++; // 학생수 증가
				total = 0; // 합계 초기화
				System.out.println("학생성적이 입력되었습니다.");
				System.out.println();
				break;
			// 학생성적출력
			case 2:
				System.out.println("========================================================");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6]); // 제목 출력
				System.out.println("========================================================");
				for (int i = 0; i < count; i++) {// 입력된 학생수만큼 반복
					System.out.printf("%d\t", no[i]);  // 번호 출력
					System.out.printf("%s\t", name[i]); // 이름 출력
					for (int j = 0; j < score[0].length; j++) { // 점수 출력
						System.out.printf("%d\t", score[i][j]); // 국어[i][0], 영어[i][1], 수학[i][2], 합계[i][3]
					}
					System.out.printf("%.2f\n", avg[i]); // 평균 출력
					System.out.println();
				}
				break;
			// 학생성적수정
			case 3:
				System.out.println(" [ 학생성적수정 ] ");
				System.out.println("======================");
				System.out.print("수정할 학생이름을 입력하세요.>> ");
				String sName = scanner.next();
				
				break;
			// 학생성적검색
			case 4:
				System.out.println(" [ 학생성적검색 ] ");
				System.out.println("======================");
				System.out.print("검색할 학생이름을 입력하세요.>> ");
				String searchName = scanner.next();
				
				break;
			default:
				break loop;
			}
			
		}
		
		

	}

}
