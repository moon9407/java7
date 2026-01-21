package j0121_01;

import java.util.Arrays;

public class C0121_05 {

	public static void main(String[] args) {
		
//		int[] num = new int[5];
		int[] num = {1,2,3,4,5};
		
		int[] num2 = new int[10];
		
		System.out.println(Arrays.toString(num));
		num[2] = 50;
		System.out.println(Arrays.toString(num));
		num[1] = 0; //수정만 가능 - 추가,삭제 불가능
		System.out.println(Arrays.toString(num));
		
		// 배열 생성 -> 배열 값을 복사
//		for (int i = 0; i < num.length; i++) {
//			num2[i] = num[i];
//		}
		
		//
		System.arraycopy(num, 0, num2, 0, num.length); // 원본배열, 원본시작위치, 복사배열, 복사배열시작위치, 복사길이
		
		System.out.println(Arrays.toString(num2));
		
		
	}

}
