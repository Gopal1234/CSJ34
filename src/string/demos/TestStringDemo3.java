package string.demos;

public class TestStringDemo3 {
public static void main(String[] args) {
	
	String firstName="Ranga Swamy dssdsdfdf";
	String city="Kolkata";
	String email="abc@gmail.com";
	String ph="8147117572";
//based on the customer details I want to generat OTP number
	
	int indexOfLastCharFromName=
			firstName.indexOf(firstName.charAt(firstName.length()-1));
	System.out.println(indexOfLastCharFromName);
	
	//How to convert primitive into String
	
	String s1=String.valueOf(indexOfLastCharFromName);
	
	int indexOfMidCharacterFromCity=city.
			indexOf(city.charAt(city.length()/2));
	System.out.println(indexOfMidCharacterFromCity);
	String s2=String.valueOf(indexOfMidCharacterFromCity);
	String lastTwoCharFromPhone=ph.substring(ph.length()-2);
	String finalOtp=s1.concat(s2).concat(lastTwoCharFromPhone);
	System.out.println("Hi... "+" "+firstName+ " "+"your otp is"+" "+finalOtp);
}

}
