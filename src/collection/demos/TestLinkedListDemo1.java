package collection.demos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
 * LinkedList is one of the implementation class of List interface
 * LinkedList class internally uses doubly linked list data structure
 * 
 * like in doubly linked list
 * 
 * [prev][data][next]<---->[prev][data][next]<--->[prev][data][next]<---->[][][]<---->
 * 
 * LinkedList provides a flexible way to fetch data
 * using methods like
 * i) addFirst(Object obj)
 * ii)addLast(Object obj)
 * iii)removeFirst(Object obj)
 * iv)removeLast()
 * v)getFirst()
 * vi)getLast()
 * 
 * Difference between ArrayList and LinkedList
 * i)ArrayList uses dynamic array data structure but LinkedList 
 * uses doubly linked list data structure
 * ii)ArrayList is efficient for storing bulk amount of data
 *  but ArrayList is NOT efficient to remove large amount of data
 *  because in ArrayList bit need to shifted once we remove any object
 *  but incase of LinkedList is more efficient for modification 
 *  or removal the objects ..because shifting of bits not required
 *  incase of LinkedList if we will delete any node then next pointer
 *  just point to next node or null value
 *  
 *  
 *  using LinkedList we can implement   Queue interface
 * 
 */
public class TestLinkedListDemo1 {

	public static void main(String[] args) {
 // How to create object of LinkedList
//way -1
		/*
		 * List
		 * --ArrayList
		 * ---LinkedList
		 * ---Stack
		 * ---Vector
		 * 
		 * 
		 */
		//Here we are creating the LinkedList object by invoking
		//LinkedList()
		//and initializing that object into list reference
	List list1=new LinkedList();
	list1=new Stack();
	
	//way-2 
	//Here we are craeting LinkedList object by invoking
	//LinkedList()
	//and initializing that object into LinkedList reference
	
	LinkedList list2 =new LinkedList();
	
	
	//way-3
	ArrayList al=new ArrayList();
	al.add(1);
	al.add(40);
   //way-3
	//we are creating object of LinkedList by invoking
	//LinkedList(Collection collection)
	//and initializing into LinkedList reference
	LinkedList list3=new LinkedList(al);

		
		
		
		
		

	}

}
