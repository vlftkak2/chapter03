package chapter03;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//String을 저장하는 벡터가 만들어졌다.
		//Collection FrameWork 이전(JDK 1.2 이전)
		Vector<String> vector=new Vector<String>();
		
		vector.addElement("둘리");
		vector.addElement("마이콜");
		vector.addElement("도우넛");
		vector.addElement("고길동");
		
		vector.removeElement("마이콜");
		
		//순회1
		int size=vector.size();
		for(int i=0; i<size; i++){
			
			String s=vector.elementAt(i);
			System.out.println(s);
		}
		
//		//순회2
//		Enumeration<String> e=vector.elements();
//		while(e.hasMoreElements()){
//			String s=e.nextElement();
//			System.out.println();
//		}
		
	}

}
