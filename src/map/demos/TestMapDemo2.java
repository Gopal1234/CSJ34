package map.demos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestMapDemo2 {

	public static void main(String[] args) {

Map<Integer,String> studentDetails=new HashMap();
Scanner sc=new Scanner(System.in);
for(int i=0; i<5; i++)
{
	System.out.println("enter student roll number");
	int roll=sc.nextInt();
	System.out.println("enter student name");
	String name=sc.next();
	// V put(Object key, Object value)
	studentDetails.put(roll, name);
}
//Iterating map using iterator
      //  Set<K> keySet()
Set<Integer> setOfKeys=   studentDetails.keySet();
 Iterator<Integer> itr=setOfKeys.iterator();
while(itr.hasNext())
{
	int rno=itr.next();
	//V get(Object key)
	   String name=studentDetails.get(rno);
	
	System.out.println(rno+ "  ---->"+ " "+name);
}





	}

}
