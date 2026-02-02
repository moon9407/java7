package j0130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	ArrayList<Stuscore> list = new ArrayList();
	int no,kor,eng,math,total,choice,temp;
	String name;
	double avg;
	String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	String filePath = "c:/aaa/stu.txt";

	// 1.성적입력
	void stu_input() {
		System.out.println((Stuscore.count+1)+"번 학생이름을 입력하세요.>>(0.이전페이지 이동) ");
		name = scan.next();
		if(name.equals("0")) return;
		System.out.println("국어점수를 입력하세요.>> ");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>> ");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>> ");
		math = scan.nextInt();
		list.add(new Stuscore(name,kor,eng,math));
		System.out.println(name+" 학생 성적저장완료!!");
		System.out.println();
	}//stu_input
	
	// 2.성적출력
	void stu_output() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],
				title[4],title[5],title[6]);
		System.out.println("-----------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Stuscore s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg());
		}//for
		System.out.println();
	}//stu_output
	
	// 2-2.성적출력 (매개변수가 있는 메소드)
		void stu_output(List<Stuscore> slist) {
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
					title[0],title[1],title[2],title[3],
					title[4],title[5],title[6]);
			System.out.println("-----------------------------------------------------");
			for(int i=0;i<list.size();i++) {
				Stuscore s = slist.get(i);
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
						s.getNo(),s.getName(),s.getKor(),s.getEng(),
						s.getMath(),s.getTotal(),s.getAvg());
			}//for
			System.out.println();
		}//stu_output
	
		
	// 3.성적수정
		void stu_update() {
			System.out.println("수정하려는 학생이름을 입력하세요.>>(0.이전페이지 이동) ");
			name = scan.next();
			if(name.equals("0")) return;
			temp = 0;
			for(int i=0;i<list.size();i++) {
				Stuscore s = list.get(i);
				String search = s.getName();
				if(s.getName().equals(name)) {
					temp = 1;
					System.out.println(name+"학생을 찾았습니다. ");
					System.out.println(" [점수수정] ");
					System.out.println("1. 국어점수 : "+s.getKor());
					System.out.println("2. 영어점수 : "+s.getEng());
					System.out.println("3. 수학점수 : "+s.getMath());
					System.out.println("0. 수정취소");
					System.out.println("-----------------------");
					System.out.print("수정할 번호를 입력하세요.>> ");
					choice = scan.nextInt();
					switch(choice) {
					case 1:
						System.out.println("현재국어점수 : "+s.getKor());
						System.out.print("수정할 국어점수를 입력하세요.>> ");
						int input = scan.nextInt();
						s.setKor(input); // 국어점수 수정
						s.calTotal(); // 합계 재계산
						s.calAvg();   // 평균 재계산
						System.out.println("국어점수 "+input+" 점으로 수정되었습니다.");
						System.out.println();
						break;
					default:
						System.out.println("수정이 취소되었습니다.");
						System.out.println();
						break;
					}
					break;
				}//if
			}//for
			if(temp == 0) {
				System.out.println("찾고자 하는 학생이 없습니다. 다시 입력하세요. ");
				System.out.println();
			}
		}
	// 4.성적삭제
	void stu_delete() {
		System.out.println("삭제하려는 학생이름을 입력하세요.>>(0.이전페이지 이동) ");
		name = scan.next();
		if(name.equals("0")) return;
		temp = 0;
		for(int i=0;i<list.size();i++) {
			String search = list.get(i).getName();
			if(search.equals(name)) {
				temp = 1;
				System.out.println(name+"학생을 찾았습니다. 삭제하시겠습니까?(1.예 2.아니오) ");
				choice = scan.nextInt();
				if(choice == 1) {
					list.remove(i);
					System.out.println(name+" 학생성적이 삭제되었습니다.");
					System.out.println();
				}
				break;
			}//if
		}//for
		if(temp == 0) {
			System.out.println("찾고자 하는 학생이 없습니다. 다시 입력하세요. ");
			System.out.println();
		}
		
	}//stu_delete
	
	// 5.성적검색
	void stu_search() {
		System.out.println("[ 학생검색 ]");
		System.out.println("1. 이름검색");
		System.out.println("2. 점수검색");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		choice = scan.nextInt();
		switch(choice) {
        case 1: // 이름검색
        	temp = 0;
        	System.out.println("검색할 이름을 입력하세요.>> ");
        	String search = scan.next();
        	List<Stuscore> slist = new ArrayList();
        	for(int i=0;i<list.size();i++) {
        		Stuscore s = list.get(i);
        		// equals : 문자열 비교 메서드, contains : 포함여부 확인 메서드
//				if (s.getTotal() >= 70) { //70점 이상 검색
				if (s.getName().contains(search)) {
					temp = 1;
					slist.add(s);
				}
        	}
        	
			if (temp == 0) { //검색된 학생이 없으면
				System.out.println("검색한 이름이 없습니다. 다시 입력하세요. ");
				System.out.println();
			}else { //검색된 학생이 있으면
				stu_output(slist);
			}
		}
	}
	
	// 6.성적정렬
	void stu_sort(int choice) {
		System.out.println("[ 성적정렬 ]");
		System.out.println("1. 합계순 역순정렬");
		System.out.println("2. 이름순 순차정렬");
		System.out.println("-----------------------");
		System.out.print("원하는 번호를 입력하세요.>> ");
		switch(choice) {
		case 1: // 합계순 역순정렬
			list.sort(new Comparator<Stuscore>() {
				@Override
				public int compare(Stuscore o1, Stuscore o2) {
					return o2.getTotal() - o1.getTotal();
				}
			});
			break;
		case 2: // 이름순 순차정렬
			list.sort(new Comparator<Stuscore>() {
				@Override
				public int compare(Stuscore o1, Stuscore o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			break;
		}
		
	}
	
	
	// 8.파일불러오기
	void fileOpen() {
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				String[] st = line.split(",");
				no = Integer.parseInt(st[0]);
				name = st[1];
				kor = Integer.parseInt(st[2]);
				eng = Integer.parseInt(st[3]);
				math = Integer.parseInt(st[4]);
				total = Integer.parseInt(st[5]);
				avg = Double.parseDouble(st[6]);
				list.add(new Stuscore(no,name,kor,eng,math,total,avg));
			}
			System.out.println("파일 불러오기 완료!!");
			System.out.println();
			
			
		} catch (Exception e) {e.printStackTrace();}
	}//fileOpen
	
	// 09.파일저장
	void fileSave() {
		//파일 저장하기
		filePath = "c:/aaa/stu.txt";
		try {
			FileWriter fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i =0;i<list.size();i++) {
				Stuscore s = list.get(i);
				String st = String.format("%d,%s,%d,%d,%d,%d,%.2f\n", 
						s.getNo(), s.getName(), s.getKor(), s.getEng(),
						s.getMath(), s.getTotal(), s.getAvg());
				bw.write(st);
			}
			bw.close();
			fw.close();
			
		} catch (IOException e) {e.printStackTrace();}
		
		System.out.println("파일이 저장되었습니다.");
		System.out.println();
	}
	
	// 00.화면출력
	void screen() {
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 성적검색");
		System.out.println("6. 성적정렬");
		System.out.println("8. 파일불러오기");
		System.out.println("9. 파일저장");
		System.out.println("0. 프로그램종료");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
	}//screen
	
	
}//class
