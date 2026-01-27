package j0122_01;

public class Tv {
	
	String color;  // 색상
	boolean power;  // 전원상태
	int channel;  // 채널
	void power() { power = !power; } // 전원이 켜져있으면 끄고, 꺼져있으면 켠다.
	void channelUp() { channel++; }// 채널올리기
	void channelDown() { channel--; } // 채널내리기

}
