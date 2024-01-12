package collection.demos;

import java.util.ArrayList;
import java.util.List;

public class TestEx1 {

	//method defination
	public static int sumOfEvenIndex(List<Integer> list)
	{
		int sum=0;
		for(int index=0; index<list.size(); index++)
		{
			if(index%2==0)
			{
				int n=list.get(index);
				sum=sum+n;
			}
		}
		return sum;
	}
	
	
	public static void main(String[] args) {

//calling method
		List<Integer> listOfNum=new ArrayList();
		listOfNum.add(50);
		listOfNum.add(40);
		listOfNum.add(30);
		listOfNum.add(20);
		listOfNum.add(10);
	int result=	sumOfEvenIndex(listOfNum);
System.out.println(result);
	}

}
