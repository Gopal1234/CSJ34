package exception.demos;

import java.util.ArrayList;
import java.util.List;

public class TestExceptionDemo3 {

	
	
	
	
	public static void main(String[] args) {
  List<String> list=new ArrayList();
  list.add(null);
  list.add("ABC");
  list.add("BAC");
  list.add("BCA");
    try
    {
    int index=	list.get(0).indexOf("A");
    	try
    	{
    		int res=120/index;
    		System.out.println(res);
    	}catch(ArithmeticException e)
    	{
    		System.out.println(" from inner try"+ " "+e.getMessage());
    	}
    }catch(ArithmeticException  e)
    {
    	System.out.println("from outer try"+ " "+e);
    }
		
		
		
		

	}

}
