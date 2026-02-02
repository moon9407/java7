package j0127;

import java.util.*;

public class C01 extends Object {

	public static void main(String[] args) {
		Deck d = new Deck();
//		d.pick(39);
//		d.pick(50);
//		d.pick(2);
//		d.pick(1);
//		d.pick(0);
//		d.c[1].number = 1;
		
		d.cardAllPrint(); //섞기전출력
		d.shuffle();  //카드섞기
		System.out.println("---------------");
		d.cardAllPrint(); //섞은 후 출력
//		d.card5Print();
//		d.cardAllPrint();
		
		Login 1 = new Login(1.pw);
		System.out.println(1.pw);
		
		System.out.println(d.c[0].number);
		
		
		
		
		}
		
		
		
//		Circle c1 = new Circle();
//		System.out.println(c1.color);
		
		
//		Scanner scanner = new Scanner(System.in);
//		Date today = new Date();
//		System.out.println(today);

	}

