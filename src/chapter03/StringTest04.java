package chapter03;

public class StringTest04 {

	public static void main(String[] args) {
		
		String str="aBcAbCabcABC";
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(2, 5));
		System.out.println(str.indexOf('A'));
		System.out.println(str.indexOf("abc"));
		System.out.println(str.length());
		System.out.println(str.replace('a', 'R'));
		System.out.println(str.replaceAll("a", "R"));
		System.out.println(str.substring(0,3));
		System.out.println(str.toUpperCase());
		System.out.println(str.indexOf("abc"));
		
	    String a=new String("  HyungMin");
	    String b=new String(",Solbin");
	    
	    a=a.concat(b);
	    System.out.println(a);
	    
	    a=a.trim(); //공백 제거
	    System.out.println("-----"+a+"-----");
	    
	    String[] as =a.split(",");
	    for(String s : as){
	    	System.out.println(s);
	    }
	}

}
