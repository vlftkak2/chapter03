package chapter03;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		
		//boxing
		Integer i=new Integer(10); //10이라는 숫자를 객체로 둘러쌌다 -> 박싱

		//unboxing
		int j=i.intValue();
		
		System.out.println(i+","+j);
		
		//Auto Boxing
		Integer i2=10;
		
		//Auto unboxing
		int j2=i2+10; //int j2=i.intValue()+10;
		
		System.out.println(j2);
	}

}
