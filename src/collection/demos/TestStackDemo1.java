package collection.demos;

import java.util.Stack;

public class TestStackDemo1 {

	public static void main(String[] args) {
		/*
		 * stack internally used by JVM to store method
		 * ,method's data, local variable,reference variable		 * 
		 * 
		 */
  Stack<Integer> stack=new Stack();
  
  
  //Object push(Object obj)
  
  //Object pop()--remeve the elements from top of the stack
 /*int value1= stack.pop();
  System.out.println(value1);
  int value2=stack.pop();
  System.out.println(value2);*/
 System.out.println(stack.size());
 System.out.println(stack.capacity());

		
		
		

	}

}
