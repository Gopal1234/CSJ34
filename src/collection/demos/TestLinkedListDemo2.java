package collection.demos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedListDemo2 {

	public static void main(String[] args) {

LinkedList<Integer> list1=new LinkedList();

	list1.add(100);
	list1.add(40);
	list1.addFirst(1);
	list1.addLast(108);
	//priting first and last obeject
	System.out.println(list1.getFirst());
	System.out.println(list1.getLast());
	//remove first element
	list1.removeFirst();
	list1.removeLast();
	System.out.println(list1.getFirst());
	System.out.println(list1.getLast());
	
	
	
	
	
	
	
	
		
		

	}

}
