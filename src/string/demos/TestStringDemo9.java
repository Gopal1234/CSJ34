package string.demos;
//ravi kumar
//Ravi Kumar
public class TestStringDemo9 {

	public static void main(String[] args) {

String aboutJava="Java is a widely-used programming language .It has been a popular choice among developers. millions of Java applications in use today. Java is a multi-platform, object-oriented, and network-centric language that can be used as a platform in itself.";

String[] s2=	aboutJava.split("\\.");
	System.out.println(s2.length);
	for(String line:s2)
	{
		System.out.println(line);
	}
	
	}

}
