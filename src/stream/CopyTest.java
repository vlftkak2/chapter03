package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("lecture.png");
			fos = new FileOutputStream("lecture2.png");

			int data = -1;
			while (fis.read() != -1) {
				fos.write(data);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다." + e);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 자원정리(파일닫기)
			try{
				
			if (fis != null) {
				fis.close();
			}

			if (fos != null) {
				fos.close();
			}
			}catch(IOException e){
				
			}
		}

	}

}
