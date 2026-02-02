package j0130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck();
		loop:while(true) {
			s.screen();//화면출력
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				s.stu_input();
				break;
			case 2:
				s.stu_output();
				break;
			case 3:
				s.stu_update();
				break;
			case 4:
				s.stu_delete();
				break;
			case 5:	
				s.stu_search();
				break;
			case 6: //성적정렬
				choice = scan.nextInt();
				s.stu_sort(choice);
				s.stu_output();
				break;
			case 8:
				s.fileOpen();
				break;
			case 9 :
				s.fileSave();
				break;
			
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}//switch
			
		}//while
		
		
		
		
				

	}

}
