package chapter03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// list에 있는 메소드만 사용할 수 있다.
		List<String> list = new ArrayList<String>();
		list.add("둘리");
		list.add("마이콜");
		list.add("고길동");
		list.add(2, "도우넛");

		list.remove(1);

		int size = list.size();
		// 순회1 인덱스가지고 접근
		for (int i = 0; i < size; i++) {
			String s = list.get(i);
			System.out.println(s);
		}

		// 순회2
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		// 순회3
		for(String s: list){
			System.out.println(s);
		}

	}

}
