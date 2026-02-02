package j0130;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class C07 {

	public static void main(String[] args) {
		String filePath = "c:/aaa/a1.txt";
		try {
			// 설정이 되어 있지 않으면:덮어쓰기, true:이어쓰기
			FileWriter fw = new FileWriter(filePath,true);
			BufferedWriter bw = new BufferedWriter(fw);
			String txt = "다시 입력22222!!\r\n"; //\r:줄에 제일끝으로 이동,\n:enter키
			bw.write(txt);
			bw.close();
			fw.close();
			System.out.println("파일저장완료!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
