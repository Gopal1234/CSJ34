package inheritance.demos;
class Company1
{
	String msg="welcome everyone";
	public String setRecruitmentProcedure()
	{
		return "every company have to take strict evaluation to recruit employees";
	}
}
class Wipro extends Company1
{
	String msg="welcome to wipro limited";
public String setRecruitmentProcedure()
{
	return "minimum 55% in 10th and 12th"+"\n"+"Appti"+"GD"+"TD";
}
}
class Cognizant extends Company1
{
	String msg="welcome to Cognizant";
public String setRecruitmentProcedure()
{
	return "minimum 70% in 10th and 12th and graduation"+"GD" +"Technical discussion";
}
	
}
public class TestMethodOverridingDemo2 {

	public static void main(String[] args) {

//creating the reference of parent class
		Company1 cmp=null;
		cmp=new Wipro();
		System.out.println(cmp.msg);
		String msg=		cmp.setRecruitmentProcedure();
		System.out.println(msg);
		cmp=new Cognizant();
		System.out.println(cmp.msg);
	String msg1=	cmp.setRecruitmentProcedure();
		
		System.out.println(msg1);

	}

}
