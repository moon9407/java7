package j0127;

public class Tv {
	boolean power; // 전원상태
	int channel; // 채널
	
	void power() { // 전원 켜기/끄기
		power = !power;
	}

	void channelUp() { // 채널 올리기
		channel++;
	}

	void channelDown() { // 채널 내리기
		channel--;
	}
	

}
