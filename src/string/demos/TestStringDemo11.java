package string.demos;

public class TestStringDemo11 {

	public static void main(String[] args) {

		String str1 = String.format("%s", "Gopal");  
        String str2 = String.format("[%10s]", "Gopal");  // Specifying length of integer  
        String str3 = String.format("{%-10s}", "Gopal"); // Left-justifying within the specified width  
       
System.out.println(str1);
System.out.println(str2);
System.out.println(str3);
	}

}
