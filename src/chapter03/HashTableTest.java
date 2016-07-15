package chapter03;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new Hashtable();

		// map.put("둘리", new Integer(100));
		map.put("둘리", 100); // Auto boxing
		map.put("마이콜", 50);
		map.put("도우넛", 80);

		int score = map.get("둘리"); // auto Unboxing
		// System.out.println(map.get("둘리"));
		System.out.println(score);

		// 전체 순회
		Set<String> set = map.keySet(); // 키를 저장하고 있는 집합을 내놔라
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println("KEY" + key + ", value=" + value);
		}
	}

}
