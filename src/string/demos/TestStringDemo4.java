package string.demos;

public class TestStringDemo4 {

	public static void main(String[] args) {
String s="ABC";
// char[] converting string into character array
char[] ch=s.toCharArray();
String s2=" ";
for(int i=ch.length-1; i>=0; i--)
{
	s2=s2+ch[i];
}
System.out.println(s2);
		
		
		
		
		

	}

}
