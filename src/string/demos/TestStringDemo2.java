package string.demos;

public class TestStringDemo2 {
public static void main(String[] args) {
	
	String name="Cyber Success";
	//I want to length() of the String
	int size=name.length();
	System.out.println(size);
	//I want fetch first character from given string 
	char firstChar=name.charAt(0);
	System.out.println(firstChar);
	//I want to fetch last character from given string
	char lastCharacter=name.charAt(name.length()-1);
	System.out.println(lastCharacter);
	//I want to fetch index position of c
	//indexOf() returns the index position of first occurrence
	int idexOfc=name.indexOf('c');
	System.out.println(idexOfc);
	//lastIndexOf() returns the index position of last occurrence
	//incase character will not found then it returns negetive integer
	int lastIndexOfC=name.lastIndexOf('c');
	System.out.println(lastIndexOfC);
	
	//index of caharcter sequence
int indexOfCyber=	name.indexOf("Cyber");
	System.out.println(indexOfCyber);
	
	int indexOfSuccess=	name.indexOf("Success");
	System.out.println(indexOfSuccess);
	
	
	
	
}
}
