package j0122_01;

import java.util.Scanner;

public class C0122_09 {
	static Scanner scanner = new Scanner(System.in); // 인스턴스 변수 - 객체 선언 후 참조변수명.변수명
	
	
	static int[] stuInput() {
		// 국어,영어, 수학 점수를 입력받고 저장
		int[] score = new int[3];
		System.out.print("국어 점수를 입력하세요: ");
		score[0] = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		score[1] = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		score[2] = scanner.nextInt();
		return score;
		
	}

	public static void main(String[] args) {
		
		// 출력
		int[] score = stuInput();
		System.out.println("국어: " + score[0]);
		System.out.println("영어: " + score[1]);
		System.out.println("수학: " + score[2]);
		
		
		
		
		
//		// 1. 객체선언
//        MainMethod m = new MainMethod();		
//        
//        Stuscore[] stuArr = new Stuscore[3]; //주소값을 매개변수로 전달하면값이 변경됨.
//        m.stuInput(stuArr); 
//        m.stuOutput(stuArr); 
        

	}

}
