package collection.demos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class TestLinkedListDemo3 {
	
	/*
	 * 
	 * First five character upper case alphabet
	 * next four character should be digit
	 * last two character uppercase alphabets
	 * 
	 * 
	 */
public static ArrayList<String> 
getOnlyValidPan(LinkedList<String> panList)	
{
	String panCriteria="[A-Z]{5}[0-9]{4}[A-Z]{1}";
	ArrayList<String> al=new ArrayList();
	for(int index=0; index<panList.size(); index++)
	{
		//fetching one one string object from list
		String panNum=panList.get(index);
		if(panNum.matches(panCriteria))
		{
			al.add(panNum);
		}
	}
	
	
	return al;
}


	public static void main(String[] args) {

LinkedList<String> list=new LinkedList();
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter no of PAN cards");
	int nop=sc.nextInt();
	for(int i=0; i<nop; i++)
	{
		System.out.println("enter PAN number of"+" "+(i+1)+ "customer");
		String pNum=sc.next();
		list.add(pNum);
				
	}
	//calling method
ArrayList<String> res=	getOnlyValidPan(list);
System.out.println(res);
	/*
	 * In new version of collection(1.5) then added two more cursor
	 * in collection
	 * 
	 * i)Enumerator
	 * ii)Iterator
	 *  Iterator can apply with all type of collection(List, Set, Queue)
	 *  Iterator having only three methods 
	 *  like
	 *  a. boolean hasNext()
	 *  b. Object next()
	 *  c. void remove()
	 * 
	 *   Iterator can only iterate the list in forward position 
	 * iii)ListIterator
	 * 
	 * ListIterator can apply only with List type of Collection
	 * Using ListIterator we can iterate a list in both forward and 
	 * backward position
	 * 
	 *  Methods in ListIterator are:
	 *  i)boolean hasNext()
	 *  ii)Object next()
	 *  iii)void remove()
	 *  iv)boolean hasPrevious()
	 *  v)Object previous()
	 *  vi)int nextIndex()
	 *  vii)int previousIndex()
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	/*System.out.println("printing in foward direction");
	ListIterator<String> itr=   list.listIterator();
	while(itr.hasNext())
	{
		//Object next()
		//String nextObject=(String)itr.next();
		String nextObject=itr.next();
		System.out.println(nextObject);
		System.out.println(itr.nextIndex());
		
	}
	System.out.println("printing in backward direction");
	while(itr.hasPrevious())
	{
		//Object next()
		//String nextObject=(String)itr.next();
		String prevObject=itr.previous();
		System.out.println(itr.previousIndex());
		System.out.println(prevObject);
		}

	}*/
	}
}
