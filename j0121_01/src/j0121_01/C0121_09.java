package j0121_01;

import java.util.Scanner;

public class C0121_09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. 변수선언
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int[] no = new int[5];
		String[] name = new String[5];
		int[][] score = new int[5][4];
		double[] avg = new double[5];
		int total = 0, count =0;   // 같은 타입이면 같이 선언 가능
		
		loop : while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적검색");
			System.out.println("0. 종료");
			System.out.println("====================");
			System.out.print("원하는 번호를 입력하세요.>> ");
			int choice = scanner.nextInt();
			
			switch(choice) {
			// 학생성적입력
			case 1:
				System.out.println(" [ 학생성적입력 ] ");
				System.out.printf("%d 번째 학생이름을 입력하세요.>> ",count+1);
				name[count] = scanner.next(); // 이름 입력
				for(int i=0;i<3;i++) {
					System.out.printf("%s 점수를 입력하세요.>> ",title[i+2]);
					score[count][i] = scanner.nextInt(); // 국어, 영어, 수학 점수 입력
					total += score[count][i]; // 합계 계산
				}
				
				score[count][3] = total; // 합계 저장
				avg[count] = total / 3.0; // 평균 저장
				no[count] = count +1 ;// 번호 저장
				count++;
				total =0; // 합계 초기화
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
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println(" [ 프로그램 종료 ]");
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
		}
		
		
//		int[] a = {1,2,3,4,5};
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+"\t");
//		}
//		System.out.println();
//		System.out.println("개수 : "+a.length);
//		
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.print(a[i]+"\t");
//		}
		
		
		// 검색.
//		int[] a = {1,2,0,4,0,1,2,3,4,0,9,6,3,4,1,5};
//		int temp = 0;
//		int count = 0;
//		
//		for(int i=0;i<a.length;i++) {
//            if(a[i]==0) {
//            	count++;
//            	temp = 1;
//            }
//        }
//		if(temp==0) {
//			System.out.println("해당문자가 없습니다.");
//		}else {
//			System.out.println("해당문자가 있습니다.");
//            System.out.println("해당문자 개수 : "+count);
//		}

	}

}
