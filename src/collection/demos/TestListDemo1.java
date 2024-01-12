package collection.demos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class TestListDemo1 {

	public static void main(String[] args) {
/*
 * List is a collection type which allow duplicacy
 * List stored objects in insertion order or index order
 * 
 * ArrayList is class which uses dynamic array or growable array
 * that means the size of this array can be automaticaly reallocated
 *   
 */
List list1=new ArrayList();
//adding objects into list
list1.add("ABC");
list1.add(new Double(3546.00));
list1.add(100);
list1.add(true);
list1.add(new Integer(108));

//checking size of the list
 // int size()
int listSize=list1.size();
System.out.println(listSize);
//I want check whether my list conating a string object called ABC or not

for(int i=0; i<list1.size(); i++)
{
	//Object get(int index)
	Object obj=list1.get(i);
	System.out.println(obj);
	
	
}
//boolean contains(Object obj)
if(list1.contains("ABC"))
{
	System.out.println("yes it is present");
}


/*ArrayList list2=new ArrayList();

list2=new Vector();
list2=new Stack();
list2=new LinkedList();


Collection list3=new ArrayList();
list3=new HashSet();
list3=new LinkedHashSet();
list3=new TreeSet();*/

		

	}

}
