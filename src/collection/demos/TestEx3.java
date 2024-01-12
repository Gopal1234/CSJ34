package collection.demos;

import java.util.ArrayList;
import java.util.List;

public class TestEx3 {

	public static List<String> getNames(List<String> names)
	{
		for(int i=0; i<names.size(); i++)
		{
			String name=names.get(i);
			String s1=name.substring(0,1).toUpperCase();
			int  index=name.indexOf(" ");
			String s2=name.substring(index);
			String s3=s1.concat(" ").concat(s2);
			names.set(i, s3);
			
		}
		return names;
		
		
	}
	public static void main(String[] args) {

List<String> listOfCandidate=new ArrayList();
listOfCandidate.add("Gopal Upadhyay");
listOfCandidate.add("Ankit Kumar Upadhyay");
listOfCandidate.add("Ravi Kumar");
  List<String> n=   getNames(listOfCandidate);
for(String str:n)
{
	System.out.println(str);
}
	}

}
