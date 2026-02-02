package j0129;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class C04 extends Object {

	public static void main(String[] args) {
		try {
			// 외부에서 파일을 읽어오기 때문에 try~catch 선언이 되어야 함.
			FileReader fr = new FileReader("c:/aaa/a2.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				// 1줄씩 읽어오기
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램을 잘 종료했습니다.");
		
		
//		TryClass t = new TryClass();
//			try {
//				t.method();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		System.out.println("프로그램을 종료합니다.");
		
		
		
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
////			System.out.println(0/0); //에러
//			System.out.println(4);
//			System.out.println(5);
//			throw new Exception("고의로 발생"); //강제에러발생
//		} catch (Exception e) {
//			System.out.println(6);
//			System.out.println(e.getMessage());
//			e.printStackTrace(); //에러정보 위치 메세지 출력
//		}
//		System.out.println(7);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("안녕"); // printl :오타 - 컴파일에러
//		
//		int[] a = new int[3];
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		System.out.println("값을 입력하세요.>> ");
//		int b = scan.nextInt();
//		System.out.println(b);
//		a[3] = b; //런타임에러
		
		
		
		
		
		
//		int[] arr = {1,2,3,4,5};
//		System.out.println(arr.length);
//		arr[2] = 0;
//		System.out.println(arr.length);
		
		
		
//		int[] arr = {1,2,3};
//		Stuscore s = new Stuscore("홍길동",100,100,99);
//		
//		String str = "aaa";
//		String str2 = "bbb";
////		if(str == str2)
//		if(str.equals(str2)) {
//			System.out.println("같음");
//		}else {
//			System.out.println("다름");
//		}
		
	}

}
