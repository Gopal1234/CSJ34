package inheritance.demos;
//demo Program on Multilevel inheritance
/*
 * incase of Multi-level inheritance the class relationship 
 * looks like
 * 
 * A---super class for B
 * |
 * B---super class for C and sub class for A
 * |
 * C---sub class for B 
  
 */
class Person
{
	String personName;
	long mobileNumber;
	String personAddress;
	public Person(String personName, long mobileNumber, String personAddress) {
		super();
		this.personName = personName;
		this.mobileNumber = mobileNumber;
		this.personAddress = personAddress;
	}
	public String getPersonName() {
		return personName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	}//close the Person class
class Developer extends Person
{
	String projectCode;
	String projectName;
	String skillSet;
	public Developer(String personName, long mobileNumber,
			String personAddress, String projectCode,
			String projectName,
			String skillSet) {
		super(personName, mobileNumber, personAddress);
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.skillSet = skillSet;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public String getProjectName() {
		return projectName;
	}
	public String getSkillSet() {
		return skillSet;
	}
	
	
	
}//close the Developer class
class Company extends Developer
{
	String companyName;
String officeLocation;
public Company(String personName, 
		long mobileNumber, String personAddress, 
		String projectCode, String projectName,
		String skillSet, String companyName, 
		String officeLocation) {
	super(personName, mobileNumber, personAddress, 
			projectCode, projectName, skillSet);
	this.companyName = companyName;
	this.officeLocation = officeLocation;
}
public String getCompanyName() {
	return companyName;
}
public String getOfficeLocation() {
	return officeLocation;
}

}//close of Company class
public class TestInheritanceDemo2 {

	public static void main(String[] args) {
		Company wipro=new 
				Company("A", 8147117572L, 
						"pune", "web008", 
						"web project", "spring and AWS", 
						"wipro limited", "Bangalore");
		//fetching person info
	String pName=	wipro.getPersonName();
	String pAddress=wipro.getPersonAddress();
	long ph=	wipro.getMobileNumber();
	System.out.println(pName+ " "+pAddress+ " "+ph);
		//fetching Developer Info
	 String PCode= wipro.getProjectCode();
    String projectName=wipro.getProjectName();
   String skillSets=   wipro.getSkillSet();
   System.out.println(PCode+ " "+projectName+ " "+skillSets);
   //fetching Company Info
    String cName= wipro.getCompanyName();
   String cLocation= wipro.getOfficeLocation();
   System.out.println(cName+ " "+cLocation);
	}

}
