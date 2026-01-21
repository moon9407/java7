package j0121_01;

import java.util.Scanner;

public class C0121_07 {

	public static void main(String[] args) {
		// 1~100사이 랜덤번호를 생성해서, 총 10번 기회에 번호를 맞추는 프로그램을 구현하시오,
		// 정답을 맞추면 프로그램을 종료하고, 틀리면 기회횟수를 1회 차감한다. 그리고 더 높은 번호인지, 더 낮은 번호인지 힌트를 제공한다.
		// 입력한 번호:
		// 도전횟수 : 
		// 정답번호 : 
		Scanner scanner = new Scanner(System.in);
		int num = (int)(Math.random()*100)+1;
		int Try = 10;
		System.out.println("1~100사이의 숫자를 맞추세요!");
		for (int i = 0; i < Try; i++) {
			System.out.print("입력한 번호: ");
			int Input = scanner.nextInt();
			if (Input == num) {
				System.out.println("정답입니다.");
				break;
			} else {
				if (Input < num) {
					System.out.println("더 높은 숫자를 입력하세요.");
				} else {
					System.out.println("더 낮은 숫자를 입력하세요.");
				}
				System.out.println("남은 도전횟수: " + (Try - i - 1));
				if (i == Try - 1) {
					System.out.println("기회를 모두 사용하셨습니다. 정답 :" + num );
				}
			}
		}
	}
}
