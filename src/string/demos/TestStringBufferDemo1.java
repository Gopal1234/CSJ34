package string.demos;
/*
 * StringBuffer is class which provides mutable or editable string
 * StringBuffer maintains buffer memory and default capacity is 16
 * that means by deafault 16 characters we can store
 * 
 * 
 * If the number of the character increases from its 
 * current capacity, 
 * it increases the capacity by (oldcapacity*2)+2.
 * 
 * =>16*2+2
 * =>34
 
 * all the methods in StringBuffer is by default thread-safe or 
 * synchronized
 */
public class TestStringBufferDemo1 {
public static void main(String[] args) {
	String str="cyber success";
	StringBuilder sb=new StringBuilder(str);
	//int capacity()
	//void ensureCapacity(int capacity)
	sb.ensureCapacity(50);
	System.out.println(sb.capacity());
	sb.append(" ").append("is no").append(1);
	System.out.println(sb);
	sb.insert(5, "HIIIII");
	System.out.println(sb);
String s1=	sb.toString();
System.out.println(s1);

	
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	sb.delete(1, 5);
	System.out.println(sb);
	sb.deleteCharAt(0);
	System.out.println(sb);
	sb.replace(1, 7, "TTTTTTT");
	System.out.println(sb);
	
	
	
	
}
}
