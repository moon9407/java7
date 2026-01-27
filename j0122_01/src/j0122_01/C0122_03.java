package j0122_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0122_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		Stuscore[] s = new Stuscore[10];
		int count = 0;
		while(true) {
			s[count] = new Stuscore();
			s[count].no = count + 1;
			System.out.printf("%d번째 이름을 입력하세요.>> (0.입력 시 모두 출력)", count + 1);
			s[count].name = scanner.next();
			if (s[count].name.equals("0")) {
				break;
			}
			System.out.print("국어점수를 입력하세요.>> ");
			s[count].kor = scanner.nextInt();
			System.out.print("영어점수를 입력하세요.>> ");
			s[count].eng = scanner.nextInt();
			System.out.print("수학점수를 입력하세요.>> ");
			s[count].math = scanner.nextInt();
			s[count].total = s[count].kor + s[count].eng + s[count].math;
			s[count].avg = s[count].total / 3.0;
			
			count++;
		}
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
		System.out.println("---------------------------------------------------------");
		for (int i=0; i<count; i++) {
//			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", s[i].no, s[i].name, s[i].kor, s[i].eng, s[i].math, s[i].total, s[i].avg);
			System.out.printf("%d\t", s[i].no);
			System.out.printf("%s\t", s[i].name);
			System.out.printf("%d\t", s[i].kor);
			System.out.printf("%d\t", s[i].eng);
			System.out.printf("%d\t", s[i].math);
			System.out.printf("%d\t", s[i].total);
			System.out.printf("%.2f\n", s[i].avg);
			
		}
		System.out.println();
		
		
		
//		s[0] = new Stuscore();
//		s[0].no = 1;
//		s[0].name = "홍길동";
//		s[0].kor = 100;
//		s[0].eng = 100;
//		s[0].math = 99;
//		s[0].total = s[0].kor + s[0].eng + s[0].math;
//		s[0].avg = s[0].total / 3.0;
		
		
//		// 홍길동
//		Stuscore s1= new Stuscore();
//		s1.no = 1;
//		s1.name = "홍길동";
//		s1.kor = 100;
//		s1.eng = 100;
//		s1.math = 99;
//		s1.total = s1.kor + s1.eng + s1.math;
//		s1.avg = s1.total / 3.0;
//		// 유관순 90,90,91
//		Stuscore s2= new Stuscore();
//		s2.no = 2;
//		s2.name = "유관순";
//		s2.kor = 90;
//		s2.eng = 90;
//		s2.math = 91;
//		s2.total = s2.kor + s2.eng + s2.math;
//		s2.avg = s2.total / 3.0;
		
		
		
		
		// 다른 클래스를 사용하는 방법 - 객체선언 후 사용 가능
		
//		int[] a = {1,2,3};
//		int[] b = {4,5,6};
//		System.out.println(Arrays.toString(a)); // [1, 2, 3]
//		System.out.println(Arrays.toString(b)); // [4, 5, 6]
//		
//		b = a;
//		System.out.println(Arrays.toString(a)); // [1, 2, 3]
//		System.out.println(Arrays.toString(b)); // [1, 2, 3]
//		
//		a[1] = 1000;
//		System.out.println(Arrays.toString(a)); // [1, 1000, 3]
//		System.out.println(Arrays.toString(b)); // [1, 1000, 3]
//		System.out.println(a);
//		
//		Tv t1 = new Tv();
//		System.out.println(t1);
//		
		
		
		
//		int a = 10;
//		int b = 0;
//		b= a;
//		System.out.println(a); //100
//		System.out.println(b); //10
//		a=100;
//		System.out.println(a); //100
//		System.out.println(b); //10
//		System.out.println("--------------");
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
//		System.out.println(t1.channel);
//		System.out.println(t2.channel);
//		t2 = t1; // t2가 t1의 주소값을 가지게 됨
//		t1.channel = 7;
//		System.out.println(t1.channel); //7
//		System.out.println(t2.channel); //7
		
//		Tv t1 = new Tv(); // Tv클래스의 객체 t1선언
//		t1.color = "white"; // Tv클래스의 멤버변수 color에 값 대입
//		System.out.println(t1.color); // t1의 color값 출력
//		
//		System.out.println(t1.power); // t1의 power값 출력 (기본값 false)
//		t1.power = true; // t1의 power값을 true로 변경
//		System.out.println(t1.power); // t1의 power값 출력 (변경 후)
//		t1.power(); // t1의 power()메서드 호출 //!true -> false
//		System.out.println(t1.power); // t1의 power값 출력
//		
//		System.out.println(t1.channel); // t1의 channel값 출력 (기본값 0)
//		t1.channel = 11; // t1의 channel값을 11로 변경
//		System.out.println(t1.channel); // t1의 channel값 출력 (변경 후)
		

	}

}
