package stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("./src/stream/BufferedReaderTest.java");
			//BufferedReader br=new BufferedReader(fr);
			LineNumberReader lnr=new LineNumberReader(fr);
			
			String s=null;
			while((s=lnr.readLine())!=null){ //s가 객체이기 때문에
				String line=String.format("%3d %s", lnr.getLineNumber(), s); //줄맞추기
				System.out.println(s);
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
