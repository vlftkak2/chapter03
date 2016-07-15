package chapter03;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		//list에 있는 메소드만 사용할 수 있다.
        //내부 구현체만 다르게 한다.
		List<String> list=new LinkedList<String>();
		list.add("둘리");
		list.add("마이콜");
		list.add("고길동");
		
		list.remove(1);
		
		int size=list.size();
		
		for(int i=0; i<size; i++){
			
			String s=list.get(i);
			System.out.println(s);
			
		}

	}

}
