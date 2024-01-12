package collection.demos;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo3 {

	public static void main(String[] args) {

List<Integer> list1=new ArrayList();
list1.add(100);
list1.add(1);
list1.add(8);
list1.add(10);
System.out.println(list1);

List<Integer> list2=new ArrayList();
list2.add(100);
list2.add(11);
list2.add(81);
list2.add(10);
System.out.println(list2);
	/*
	 * boolean removeAll(Collection collection)
	 * Removes from this list all of its elements that are contained in 
	 * the specified collection 
	 * 
	 * This method is used for substract two collection
	 * 
	 * 	
	 */
list1.removeAll(list2);
System.out.println(list1);
		

	}

}
