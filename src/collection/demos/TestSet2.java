package collection.demos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TestSet2 {

	public static void main(String[] args) {

LinkedHashSet<Integer> setOfNumbers=new LinkedHashSet();
setOfNumbers.add(100);		
setOfNumbers.add(1);
setOfNumbers.add(8);
setOfNumbers.add(10);
setOfNumbers.add(90);

		System.out.println(setOfNumbers);
/*
 * using Set type of reference or any valid HashSet type,
 * LinkedHashSet type or TreeSet type we can not invoke the following 
 * methods of collections
 * get(int index)--Object
 * set(int index, Object obj)--void
 * indexOf(Object obj)--int
 * 
 * 
 */
		/*List<Integer> list=new ArrayList(setOfNumbers);
for(int i=0; i<list.size(); i++)
{
	int value=list.get(i);
	System.out.println(value);
	
}*/
		System.out.println("iterating using for each");
		for(int value:setOfNumbers)
		{
			System.out.println(value);
		}
		
		System.out.println("iterating using iterator");
Iterator<Integer> itr=		setOfNumbers.iterator();
while(itr.hasNext())
{
	int res=itr.next();
	
	System.out.println(res);
}




	}

}
