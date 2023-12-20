package inheritance.demos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate {

	public static void main(String[] args)  {

/*
 * Date in java is a predefined class ,which resides inside
 * java.util. package
 * 
 * using default constructor if we create date object then it 
 * return current system date
 * 
 * 
 * 
 * 
 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date in dd/MM/yyyy format");
      String d1=sc.next();//"Gopal"
	//	Date d=new Date();
		SimpleDateFormat sdf=new 
				SimpleDateFormat("dd/MM/yyyy");
		
		// java.util.Date parse(String str)thorws ParseException
		
		Date dob=null;
		try {
			dob = sdf.parse(d1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SimpleDateFormat sdf1=new
				SimpleDateFormat("dd/MM/yyyy");
		//String format(Date d)
		System.out.println(sdf1.format(dob));
		
	}

}
