package j0122_01;

import java.util.Scanner;

public class C0122_07 {

//	static void change(int[] a) { 
//		a[0]= 1000;
//		System.out.println("change a: "+a[0]);
//	}
	
	static void change(int a,int b, int c,AA aObj) {
		aObj.result = a+b+c;
		aObj.result2 = a-b-c;
		aObj.result3 = a*b*c;
		aObj.result4 = a/b/c;
	}
	
	public static void main(String[] args) {
		
		AA aObj = new AA();
		int a = 10;
		int b = 3;
		int c = 2;
		
		// aObj -> result, result2, result3, result4에
		// 더하기값,빼기값,곱하기값,나누기값을 입력받아 출력하시오.
		
		System.out.println("초기값 : ");
		System.out.printf("%d,%d,%d,%.2f\n",aObj.result, aObj.result2, aObj.result3, aObj.result4);
		change(a,b,c,aObj);
		
		System.out.println("결과값 : ");
		System.out.println(aObj.result);
		
		
		
		
		
		
//		// 매개변수가 참조변수로 전달 될 때는 값이 변경 됨.
//		int[] a = {50};
//		System.out.println("1번째 : "+a[0]);
//		//함수호출
//		change(a); //참조형변수
////		System.out.println(a);
////		System.out.println(a[0]);
//		
//		//함수호출 후 결과값
//		System.out.println("함수호출 후 값 : "+a[0]);
		
//		// 매개변수가 기본형 변수로 전달 될 때는 값이 변경되지 않음.
//		int a = 50;
//		System.out.println("1번째 : "+a);
//		//함수호출
//		change(a);
//		
//		//함수호출 후 결과값
//		System.out.println("함수호출 후 값 : "+a);

	}

}
