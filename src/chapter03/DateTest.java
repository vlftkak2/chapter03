package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now=new Date();
		printDate(now);
		
		//SimpleDateFormat
		SimpleDateFormat sd=new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss");
		System.out.println(sd.format(now));
		//메서드 사용(deprecated)
	
		
		Date d=new Date();
		printDate(d);
	}
	
	public static void printDate(Date date){
		System.out.print(( date.getYear()+1900)+"년 "); //1900
		System.out.print(( date.getMonth()+1)+"월 ");
		System.out.print(date.getDay()+"일 ");
		System.out.print(date.getHours() + ":");
		System.out.print(date.getMinutes()+":");
		System.out.print(date.getSeconds());
		System.out.println();

	}

}
