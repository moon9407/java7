package j0129;

import java.util.Scanner;

public class StuMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck();
		loop:while(true) {
			s.screen_print();
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				s.stu_input(); //학생성적입력
				break;
			case 2:
				s.stu_output(); //학생성적출력
				break;
			case 3:
				//s.stu_update(); //학생성적수정
				break;
			case 4:
				s.stu_delete(); //학생성적삭제
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}
		}//while

	}

}
