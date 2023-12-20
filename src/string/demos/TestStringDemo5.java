package string.demos;

public class TestStringDemo5 {

	//1224-20-456
	
	
	
	public static void main(String[] args) {
 String ph="8147117572";
   String firstTwoCharFromPh=ph.substring(0,2);
   String name="Ravi";
   String lastTwoCharFromNameInUpperCase=
		   name.substring(name.length()-2).toUpperCase();
   String lastTwoCharFromPh=
		   ph.substring(ph.length()-2);
   String password=
		   firstTwoCharFromPh.
		   concat(lastTwoCharFromNameInUpperCase).
		   concat(lastTwoCharFromPh).concat("#");
    System.out.println(password);
		
	String str="ABC";
	byte[] b=str.getBytes();
	for(byte b1:b)
	{
		String s=" "+b1;
		System.out.print(s.trim());
	}
		
		
	}

}
