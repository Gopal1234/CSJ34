package string.demos;

import java.util.Scanner;

public class TestStringDemo6 {

	public static void main(String[] args) {
       //String --int--double
       //consumerId-unit-cost
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cosumer Id");
		//MH67AB-100-800
		String conId=sc.next();
		String consumerRegex="[MH]{2}[6-9]{2}[A-Z]{2}";
		//boolean matches(String regex)
		
		if(conId.matches(consumerRegex))
		{
			System.out.println("Enter total unit");
			int totalUnit=sc.nextInt();//100
			//String tu=totalUnit.toString();
			String tu=String.valueOf(totalUnit);
			double cost=totalUnit*8.00;
			String tc=String.valueOf(cost);
			String billFormat=conId.
					concat("-").concat(tu).concat("-").concat(tc);
			System.out.println(billFormat);
		}
		else
		{
			System.out.println("wrong consumer format");
		}
		
		
		
		

	}

}
