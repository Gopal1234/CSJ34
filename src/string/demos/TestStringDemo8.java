package string.demos;

public class TestStringDemo8 {
public static void main(String[] args) {
	
	String str="welcome to cognizant a b c d ";
	//String[] split(String regex);
	  String[] s1= str.split(",");
	for(String s:s1)
	{
		System.out.println(s);
	}
	
	
	
	//String[] split(String regex, int limit)
	  String[] s2= str.split(" ",2);
	for(String token:s2)
	{
		System.out.println(token);
	}
	
	
}
}
