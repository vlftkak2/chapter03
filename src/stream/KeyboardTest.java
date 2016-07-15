package stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		
		
		try {
			
			InputStreamReader isr=new InputStreamReader(System.in,"utf-8"); //byte기반 inputstream을 받아서 utf-8로 디코딩
			BufferedReader br=new BufferedReader(isr);
			
			String s=null;
			while((s=br.readLine())!=null){
				
				System.out.println(s);
			}
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}

}
