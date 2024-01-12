package map.demos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapDemo3 {

	public static void main(String[] args) {

Map<String,Double> empDetails=new HashMap();
empDetails.put("EMP001", 34000.00);
empDetails.put("EMP081", 64000.00);
empDetails.put("EMP881", 14000.00);
empDetails.put("EMP008", 94000.00);
/*
 * Entry is an inner interface of Map
 * The Entry interface provides important methods called
 * Object getKey()
 * Object getValue()
 * 
 *interface Map
 *{
 *interface Entry
 *{
 *
 *
 *}
 *
 *}
 * Map.Entry
 * 
 */
//Set<Entry> entrySet()
     
Set<Entry<String,Double>> entries=  empDetails.entrySet();
for(Entry<String,Double> en:entries)
{
	System.out.println(en.getKey() + " "+en.getValue());
}







	}

}
