package chapter03;

public class LangClassTest {

	public static void main(String[] args) {
		
		Point p1=new Point(10, 20);
		Point p2=new Point(50,100);
		Point p3=p1;
		
		//Object의 기본 메서드
		System.out.println(p1.getClass().getName()); 
		System.out.println(p1.hashCode()); //객체를 해시코드화 시킨다.
		System.out.println(p1.toString()); //객체안에있는 내용을 보여주고 싶으면 오버라이드 한다.
		System.out.println(p1);
		
//		String s=new String("Hello");
//		System.out.println(s.toString()); //오버라이드가 되어있다.
		// == 객체인 경우에는 동일한 객체 여부 확인 (동일성)
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		//equals는 객체의 내용 비교(동등성)
		Point p4=new Point(10,20);
		System.out.println(p1==p4); //참조하는 객체가 다르다.
		System.out.println(p1.equals(p4)); //안에 내용이 같냐 안같냐
	    // equals는 object메소드로 해쉬코드 값을 비교한다. 
		// 안에 내용을 비교하고 싶으면 equals를 오버라이드 해서 구현한다.
		
		
		String s1=new String("hello");
		String s2=new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//
		System.out.println(System.identityHashCode(p1)); //오버라이드 안된 상태의 해쉬코드값을 보여준다.
		
	}

}
