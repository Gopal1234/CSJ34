package collection.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
//List<String> fruits=["Apple", bananna,"apple"]
public class TestHashSetDemo2 {

	public static void main(String[] args) {
  HashSet<Double> hs=new HashSet();
  Scanner sc=new Scanner(System.in);
  System.out.println("enter 5 elements into set");
  for(int i=0; i<5; i++)
  {
	  double salary=sc.nextDouble();
	  hs.add(salary);
  }
 System.out.println(hs);
 
 System.out.println("iterate HashSet using for each loop");
 for(double sal:hs)
 {
	 System.out.println(sal);
 }
 //I want to sort the element of HashSet
 //converting HashSet into List
 List<Double> list=new ArrayList(hs);
 Collections.sort(list);
 System.out.println(list);
 
 
	}

}
