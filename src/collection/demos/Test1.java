package collection.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student 
{
	int rollNo;
	String name;
	String course;
	int age;
	public Student(int rollNo, String name, String course, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.age = age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public String getCourse() {
		return course;
	}
	public int getAge() {
		return age;
	}
	
	
}
class AgeSorter implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
	if(s1.age>s2.age)
	{
		return 1;
	}
		return -1;
	}

	
	
}
class RollSorter implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
	if(s1.rollNo>s2.rollNo)
	{
		return 1;
	}
		return -1;
	}

	
	
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list1=new ArrayList();
		list1.add(new Student(10, "A", "java", 21));
		list1.add(new Student(1, "T", "C", 20));
		list1.add(new Student(2, "C", "Python", 18));
		
		
		Comparator<Student> cmp=new AgeSorter();
		Collections.sort(list1,cmp);
		for(Student s:list1)
		{
			System.out.println(s.getAge() + " "+s.getName());
		}
		System.out.println("**********");
		Comparator<Student> cmp2=new RollSorter();
		Collections.sort(list1,cmp2);
		for(Student s:list1)
		{
			System.out.println(s.getRollNo() + " "+s.getName());
		}
			
	}

}
