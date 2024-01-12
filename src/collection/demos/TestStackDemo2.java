package collection.demos;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class TestStackDemo2 {

	public static void main(String[] args) {
List<Integer> list1=Arrays.asList(10,45,70,80,32);
		
Stack<Integer> stack=new Stack();
Scanner sc=new Scanner(System.in);
for(int i=0; i<5; i++)
{
int value=sc.nextInt();
int temp=value;
int rev=0,rem=0;
while(value>0)
{
	rem=value%10;
 rev=rev*10+rem;
	value=value/10;
}
if(rev==temp)
{
	stack.push(temp);

}


}
 Enumeration<Integer>  e=stack.elements();
while(e.hasMoreElements())
{
	int obj=e.nextElement();
	System.out.println(obj);
}

	}

}
