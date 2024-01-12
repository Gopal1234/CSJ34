package collection.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestListDemo4 {

	public static void main(String[] args) {

List<Integer> marks=new ArrayList();
Scanner sc=new Scanner(System.in);
System.out.println("enter the marks into list");
for(int i=0; i<5; i++)
{
	marks.add(sc.nextInt());
}
//I want iterate all marks from list
/*
 * Iterator is an interface
 * which is one of the cursor of collection
 * which provides several methods like
 * i)boolean hasNext()
 * ii) Object next()
 * iii)void remove();
 * 
 * we can invoke iterator method by any valid object of collection
 * using iterator we can NOT move backward direction
 * 
 */

Iterator<Integer> itr= marks.iterator();
while(itr.hasNext())
{
int m=	itr.next();
System.out.println(m);
	
}

System.out.println("before garce marks "+ " "+marks);
//if the marks >=30 && marks<34 add 5 more grace marks
for(int i=0; i<marks.size(); i++)
{
	if(marks.get(i)>=30 && marks.get(i)<34)
	{
		marks.set(i, marks.get(i)+5);
	}
}
System.out.println("after adding grace marks"+ " "+marks);
//calculate total marks
int sum=0;
for(int m:marks)
{
	sum+=m;
}
System.out.println("total marks is"+ " "+sum);
//sort the marks
Collections.sort(marks);
System.out.println("sorted marks is"+ " "+marks);

/* Collections.sort(marks);
/*if(marks>=90 && marks<=100) then print "GRADE O"
 * else if(marks>=80 && marks<90) then print "GRADE E"
 * else if(marks>=70 && marks<80) then print "GRADE A"
 * else if(marks>=60 && marks<69)then print "GRADE B"
 * else if(marks>=50 && marks<59)then print "GRADE C"
 * else "fail"
 * 
 * 
 * 
 */
int index=0;
while(index<marks.size())
{
	if(marks.get(index)>=90 && marks.get(index)<=100)
	{
		System.out.println("GRADE O");
	}else if(marks.get(index)>=80 && marks.get(index)<=89)
	{
		System.out.println("GRADE E");
	}else if(marks.get(index)>=70 && marks.get(index)<=79)
	{
		System.out.println("GRADE A");
	}else if(marks.get(index)>=60 && marks.get(index)<=69)
	{
		System.out.println("GRADE B");
	}else 
		System.out.println("fail");
	index++;
}

	}

}
