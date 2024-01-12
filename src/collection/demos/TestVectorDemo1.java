package collection.demos;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;
class Emp
{
	int id;
	String name;
	Emp(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
}
public class TestVectorDemo1 {

	public static void main(String[] args) {
 
		//creating object of Vector
		/*
		 * Vector()--capacity 10
		 * Vector(Collection collection)
		 * Vector(int capacity)
		 * Vector(int capacity, int increment)
		 * MERN 
		 * 
		 * 
		 */
		Vector<Integer> v=new Vector(5,5);
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			System.out.println("enter"+ " "+(i+1)+ " "+"element");
			int element=sc.nextInt();
			v.add(element);
		}
		System.out.println(v.capacity());
		System.out.println(v.size());
		//Enumuration elements()
		Enumeration<Integer> e=   v.elements();
    while(e.hasMoreElements())
    {
    	System.out.println(e.nextElement());
    }
		
		
		
		
		
		
	}

}
