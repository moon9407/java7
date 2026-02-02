package j0130;

import java.util.ArrayList;
import java.util.Comparator;

public class C08 {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList(); // 리스트 생성
//		list.add(5);
//		list.add(1);
//		list.add(3);
//		list.add(2);
//		list.add(4);
//		list.sort(new Comparator<Integer>() { //리스트 정렬 및 비교
//			@Override
//			public int compare(Integer o1, Integer o2) { // 비교 메서드
//				return o1-o2; // 오름차순 정렬
//			}
//		});
//		
//		System.out.println(list);
		
		ArrayList<Card> list = new ArrayList<Card>();
		list.add(new Card("SPADE",1));
		list.add(new Card("SPADE",2));
		list.add(new Card("HEART",10));
		list.add(new Card("DIAMOND",5));
		list.add(new Card("CLOVER",7));
		list.sort(new Comparator<Card>() {
			@Override
			public int compare(Card o1, Card o2) {
				return o1.kind.compareTo(o2.kind); // 문자열 비교
			}
		});
		
		for (int i = 0; i < list.size(); i++) {
			Card c = list.get(i);
			System.out.printf("[%s,%d] \n",c.kind,c.number);
		}

	}

}
