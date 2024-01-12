package collection.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSet1 {

	public static void main(String[] args) {

Set<Integer> set1=new HashSet();
set1.add(500);
set1.add(1);
set1.add(345);
set1.add(12);
set1.add(1);
set1.add(null);
set1.add(null);
System.out.println(set1);
List<String> listOfCandidates=new ArrayList();
listOfCandidates.add("D");
listOfCandidates.add("dsdsd");
listOfCandidates.add("A");
listOfCandidates.add("D");
listOfCandidates.add("Andvd");
HashSet set2=new HashSet(listOfCandidates);

System.out.println(set2);
HashSet set3=new HashSet(30);
HashSet set4=new HashSet(50,0.24f);




		
		
		
		
	}

}
