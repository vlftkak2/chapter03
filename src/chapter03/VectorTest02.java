package chapter03;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		
		List<String> list=new Vector<String>();
		list.add("둘리");
		list.add("마이콜");
		list.add("고길동");
		
		list.remove(1);
		
		//순회1
		int size=list.size();
		for(int i=0; i<size; i++){
			String s=list.get(i);
			System.out.println(s);
		}
		
		//순회2
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
		
		for(String s: list){
			System.out.println(s);
		}

	}

}
