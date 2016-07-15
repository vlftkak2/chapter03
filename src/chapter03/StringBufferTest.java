package chapter03;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		sb.append(" is penchil");

		sb.insert(7, "my");
		System.out.println(sb);

		sb.replace(8, 10, " your");
		System.out.println(sb);

		// method chain
		StringBuffer sb2 = new StringBuffer("This");
		sb.append("is penchil");
		sb.insert(7, "my");

		System.out.println(sb);

		// +연산자 대체
		String s = "Hello" + 100 + "World";
		String s2 = new StringBuffer("Hello").append(100).append("World").toString();


	}

}
