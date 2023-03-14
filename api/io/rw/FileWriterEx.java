package etc.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

/** 
230314 
 */
public class FileWriterEx {

	public static void main(String[] args) {

		/*
		 - 문자를 써서 저장할 때 사용하는 클래스 FileWriter 이다
		 - 기본적으로 2바이트 단위로 처리하기 때문에 문자 쓰기에 적합하다 
		 */
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:/morning glory/eclipse-jee-2022-12-R-win32-x86_64/file/what.txt");
		
			//\r: 캐리지 리턴 -> 커서를 맨 앞으로 당기는 동작
			//\n: 줄 개행(줄바꿈)
			//상황과 환경에 따라서 줄 개행시 커서를 맨 앞으로 안당겨주는 경우가 있다.
			String str = "오늘은 화이트데이입니다.\r\n화요일입니다\r\n아직?";
			
			fw.write(str);
			
			System.out.println("파일 정상 저장");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.getStackTrace();
			}
		}

	}

}
