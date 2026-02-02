package j0129;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 10;
		Integer b = new Integer(10);
		BigInteger c = new BigInteger("12345678901234567890");
		
		//String, StringBuffer
//		StringBuffer sb = new StringBuffer("0123");
//		sb.append("4");
////		sb = sb+"4"; //에러
//		System.out.println(sb);
//		System.out.println(sb.charAt(0));
//		
//		String str = "0123";
//		str = str+4;
//		System.out.println(str);
//		System.out.println(str.charAt(0));
		
		
		
		
		
//		String str = "0"; // 10123456789
//		
//		int a = 0;
//		for(int i=1;i<=10;i++) {
//			 str += i;
//		}
//		System.out.println(str); // 1개
		
		
		
		//subString(0,5) - 문자열 잘라내기
//		10조12345번
		// 12345
//		String txt = "10조12345번";
//		System.out.println(txt.substring(3,8));
//		System.out.println(txt.substring(3));
//		System.out.println(txt.substring(0));
//		
//		
//		// charAt(); - 문자1개 잘라내기
//		System.out.println(txt.charAt(2));
		
		
		
		//split(",")-특정문자분리, valueOf-타입변경, parseInt-타입변경
//		String txt = "1,홍길동,100,100,100,300,100.0";
//		String[] arr = txt.split(",");
//		int no = Integer.parseInt(arr[0]);
//		String name = arr[1];
//		int kor = Integer.valueOf(arr[2]);
//		int eng = Integer.valueOf(arr[3]);
//		int math = Integer.valueOf(arr[4]);
//		int total = Integer.valueOf(arr[5]);
//		double avg = Double.parseDouble(arr[6]);
//		System.out.println(Arrays.toString(arr));
		
		
		//trim-빈공백제거, replace-문자대체
//		String txt = "     a    b   c     ";
//		String txt2 = "    abc    ";
//		System.out.println(txt);
//		System.out.println(txt2);
//		System.out.println(txt.trim()); // 앞뒤공백제거
//		System.out.println(txt2.trim());
//		System.out.println(txt.replace(" ","")); //문자대체, 빈공백을 공백없이 대체
		
		
		
		
//		String txt = "aaabbbcdeaaabcccceaeaeab";
//		String txt2 = txt.replace("a", "A");
//		System.out.println(txt2);
//		System.out.println(txt.length()-txt.replace("e", "").length());
		
		
		
		
		// indexOf();
//		String txt = "aaabbbcdeaaabcccceaeaeab";
//		System.out.println("문자길이 : "+txt.length());
//		int count = 0;
//		for(int i=0;i<txt.length();i++) {
//			if(txt.indexOf("a",i)!=-1) {
//				System.out.println("위치값 : "+txt.indexOf("a",i));
//				i=txt.indexOf("a",i); //8
//				count++;
//			}else break;
//		}
//		System.out.println("----------------");
//		System.out.println("e개수 : "+count);
		
		
		
//		System.out.println(txt.indexOf("e"));  //txt.indexOf("e") = 8
//		System.out.println(txt.indexOf("e",8+1));
//		System.out.println(txt.indexOf("e",17+1));
//		System.out.println(txt.indexOf("e",19+1));
//		System.out.println(txt.indexOf("e",21+1));
		
		
		// contains()
//		String[] name = {
//			"홍길동","유관순","이순신","강감찬","김구",	
//			"김유신","홍길자","홍길순","유관자","이순자",	
//		};
//		
//		// 홍이 들어가 있는 사람을 모두 출력하시오.
//		int temp = 0;
//		System.out.println("[ 검색 출력 ]");
//		for(int i=0;i<name.length;i++) {
//			
//			if(name[i].contains("순")) {
//				System.out.println(i+" : "+name[i]);
//				temp=1;
//			}
//		}
//		System.out.println("-------------");
//		if(temp==0) {
//			System.out.println("검색된 사람이 없습니다.");
//		}else {
//			System.out.println("변경하려는 사람 번호를 입력하세요.>> ");
//			int no = scan.nextInt();
//			// 변경이름을 입력받아, 수정을 시키고 전체출력하시오.
//			System.out.println(name[no]+" : 변경이름 입력하세요.>> ");
//			// 1. 변경이름 입력
//			// 2. 변경이름으로 변경
//			name[no] = scan.next();
//			// 3. 전체출력
//			for(int i=0;i<name.length;i++) {
//				System.out.println(i+" : "+name[i]);
//			}
//			
//		}

	}//main
}//class
