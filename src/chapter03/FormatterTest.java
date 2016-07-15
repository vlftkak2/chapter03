package chapter03;

import java.util.Formatter;

public class FormatterTest {

	public static void main(String[] args) {

		String name = "최형민";
		int score = 100;

		//String 클래스의 format static 메서드를 사용하는 경우
		System.out.println(name+","+score);
		System.out.println(String.format("학생 %s는(은) 자바시험을 %d점 받았습니다", name, score));
		
		//Formatter를 사용하는 경우
		StringBuffer sb=new StringBuffer();
		Formatter fm=new Formatter(sb);
		fm.format("학생 %s는(은) 자바시험을 %d점 받았습니다", name, score);
	}

}
