package chapter03;

public class StringTest {

	public static void main(String[] args) {
		//이스케이프 문자 사용
		char c='\'';
		
		String s="He\"llo\" \tWorld\n";
		System.out.println(s);
		
		//+연산
		System.out.println("Hello"+"World"+2);
		//내부 버퍼를 변하게 하고싶다.
		StringBuffer b=new StringBuffer("Hello");
		b.append("World");
		b.append(2);
			

	}

}
