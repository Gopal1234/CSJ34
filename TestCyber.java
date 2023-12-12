import java.util.Arrays;
import java.util.Scanner;

public class TestCyber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] courses= {"java","python","Testing"};
		Trainer[] trainerArray=new Trainer[3];
	
		/*Trainer t1=new Trainer();
		t1.setName("A");
		t1.setSkill("java");
		
		Trainer t2=new Trainer();
		t2.setName("B");
		t2.setSkill("python");
		
		Trainer t3=new Trainer();
		t3.setName("C");
		t3.setSkill("ST");
		
		trainerArray[0]=t1;
		trainerArray[1]=t2;
		trainerArray[2]=t3;*/
		Scanner s=new Scanner(System.in);
		for(int i=0; i<trainerArray.length; i++)
		{
		System.out.println("enter name");
		String name=s.next();
		System.out.println("enter skill");
		String skill=s.next();
		Trainer t=new Trainer();
		t.setName(name);
		t.setSkill(skill);
		trainerArray[i]=t;
		}
		
CyberSuccess obj=new CyberSuccess("Cyber Success", "Ritesh Sir", courses, trainerArray);

 String cname= obj.getCompanyName();
 String dname=obj.getDirectorName();
   String[] cs= obj.getCourses();
   
   System.out.println(cname+ " "+dname);
   /*
    * Arrays is predefined utility class to manipulated 
    * array
    * The above class resides inside java.util package
    * This class provides lots of static methods
    * static String toString(Object[] array)
    * 
    * 
    * 
    * 
    * 
    */
   
   
   System.out.println(Arrays.toString(courses));
   Trainer[] trainers=  obj.getTrainer();
   for(int i=0; i<trainers.length; i++)
   {
	   String name=trainers[i].getName();
	   String skill=trainers[i].getSkill();
	   System.out.println(name+ " "+skill);
   }
   

	}

}
