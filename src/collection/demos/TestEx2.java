package collection.demos;

import java.util.Arrays;
import java.util.*;

public class TestEx2 {
public static int countMaleCandidate(List<String> list)
{
	int maleCounter=0;
	for(String candidate:list)
	{
		if(candidate.startsWith("Mr."))
		{
			maleCounter++;
		}
	}
	return maleCounter;
}
public int countFemaleCandidate(List<String> list)
{
	int femaleCounter=0;
	for(String candidate:list)
	{
		if(candidate.startsWith("Mrs."))
		{
			femaleCounter++;
		}
	}
	return femaleCounter;
}
public static ArrayList<String> 
getOnlyFemaleCandidate(List<String> list)
{
	ArrayList<String> al=new ArrayList();
	for(int i=0; i<list.size(); i++)
	{
		String candidateName=list.get(i);
		if(candidateName.startsWith("Mrs."))
		{
			al.add(candidateName);
		}
	}
	return al;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[] names= {"Mr. A","Mr. B","Mrs. T", "Mr. D"};
		List<String> listOfName=
				Arrays.asList(names);*/
		List<String> listOfName=
				Arrays.asList("Mr. A","Mr. B","Mrs. T", "Mr. D");
		
		
	int maleCounter=	countMaleCandidate(listOfName);
System.out.println("male candidates are"+ " "+maleCounter);

	}

}
