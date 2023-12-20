package string.demos;

public class TestStringDemo1 {

	public static void main(String[] args) {

  String s1="Ravi";
  String s2=new String("Kavi");
  /*String s2="Ravi";
  String s3="Ravi";*/
  System.out.println(s1.hashCode()+ " "+s2.hashCode());
  if(s1==s2)
  {
	  System.out.println("both reference are same");
  }else
  {
	  System.out.println("not same");
  }
		
		
		

	}

}
