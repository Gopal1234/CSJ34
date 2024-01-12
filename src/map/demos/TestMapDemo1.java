package map.demos;

import java.util.HashMap;
import java.util.Map;
//Example of creating Map without using generic or without specifying
//type
public class TestMapDemo1 {

	public static void main(String[] args) {
/*Here we are creating HashMap object by invoking 
 * default constructor of HashMap() class
 * If we create the object of Map by initializing the object 
 * HashMap
 * by invoking defualt constrcutor then it allocate 16 buckets 
 * and default
 * load factor is 0.75
 * ii)HashMap(int capacity)
 *  --->The above constructor can initialize the capacity by 
 *  passing
 *  given integer value
 * 
 * iii)HashMap(Map m)
 * --->The above constructor can convert any valid type of Map
 *  object
 * into HashMap
 * 
 * iv)HashMap(int capacity, float loadFactor)
 * ---->Here we can pass our own capacity and load factor 
 * 
 */
Map map=new HashMap(50);
map.put(10, "ABC");
map.put("key1", 100);
map.put(true,3456.00);
System.out.println(map);


		
		
		

	}

}
