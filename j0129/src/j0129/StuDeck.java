package j0129;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StuDeck {
	
	StuDeck(){
		list.add(new Stuscore("홍길동",100,100,99));
		list.add(new Stuscore("유관순",90,90,95));
		list.add(new Stuscore("이순신",80,80,81));
	}
	
	//객체컬렉션 - 객체담을수 있는 배열
	// add,get,remove,size(),isEmpty()
	ArrayList<Stuscore> list = new ArrayList();
	Scanner scan = new Scanner(System.in);
	String name,search;
	int no,kor,eng,math,total,temp,choice;
	double avg;
	String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	
	//4. 성적삭제
	void stu_delete() {
		System.out.println("삭제할 학생이름을 입력하세요.>> ");
		search = scan.next();
		temp = 0;
		for(int i=0;i<list.size();i++) {
			Stuscore s = list.get(i);
			if(s.getName().equals(search)) {
				temp = 1;
				//삭제할 학생을 찾은 경우
				System.out.println(search+" 학생을 찾았습니다. 삭제하시겠습니까?(1.삭제,0.취소) ");
				choice = scan.nextInt();
				if(choice==1) {
					list.remove(i);
					System.out.println("삭제가 되었습니다.!");
					break;
				}else {
					System.out.println("삭제가 취소되었습니다.!");
					break;
				}
			}
		}//for
		
		if(temp==0) {
			System.out.println("찾고자 하는 학생이 없습니다. 다시 입력하세요.");
		}

	}
	
	
	//2.성적출력
	void stu_output() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],
				title[4],title[5],title[6]);
		System.out.println("-----------------------------------------------------");
		
		//Iterator 사용출력
		Iterator<Stuscore> it = list.iterator();
		while(it.hasNext()) {
			Stuscore s = it.next();
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg());
		}
		
		
//		for(int i=0;i<list.size();i++) {
//			Stuscore s = list.get(i);
////			System.out.println(list.get(i));
//			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
//					s.getNo(),s.getName(),s.getKor(),s.getEng(),
//					s.getMath(),s.getTotal(),s.getAvg());
//		}//for
		System.out.println();
	}
	
	//성적입력
	void stu_input() {
		System.out.println((Stuscore.count+1)+"번 학생이름을 입력하세요.>> ");
		name = scan.next();
		System.out.println("국어점수를 입력하세요.>> ");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>> ");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>> ");
		math = scan.nextInt();
		// 추가적으로 번호,합계,평균 부여
		list.add(new Stuscore(name,kor,eng,math));
		System.out.println(name+" 학생성적이 추가되었습니다.");
		System.out.println();
	}
	
	//화면출력
	void screen_print() {
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.성적수정");
		System.out.println("4.성적삭제");
		System.out.println("5.성적검색");
		System.out.println("0.프로그램종료");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
	}

}
