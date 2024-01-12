package collection.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestListDemo2 {

	public static void main(String[] args) {

		
		//create one list of integer
		//which only store odd numbers
		//find out the sum of all odd numbers
		
		
		
List<Integer> listOfNum=new ArrayList();
Scanner s=new Scanner(System.in);
System.out.println("enter the number of elements");
int n=s.nextInt();//5
for(int i=0; i<n; i++ )
{
	System.out.println("enter"+ " "+(i+1)+ " "+"number");
	int num=s.nextInt();//10
	listOfNum.add(num);
}
System.out.println(listOfNum);
//converting list into static array
//Object[] toArray()
 Object[] objArray=  listOfNum.toArray();
for(int i=0; i<objArray.length; i++)
{
	System.out.println(objArray[i]);
}
//here is static array
Integer[] arr= {12,34,67,89,90};
//converting into list by invoking List Arrays.asList(arrayObject)
List<Integer> listOfNum2=  Arrays.asList(arr);
System.out.println(listOfNum2);

listOfNum.retainAll(listOfNum2);
System.out.println("after union list"+ " "+listOfNum);

	}

}
