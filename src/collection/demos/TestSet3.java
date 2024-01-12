package collection.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class Trainer
{
	private int trainerId;
	private String trainerName;
	private List<String> skills;
	private Set<Long> phones;
	private double salary;
	public Trainer(int trainerId, String trainerName,
			List<String> skills, Set<Long> phones,
			double salary) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.skills = skills;
		this.phones = phones;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", skills=" + skills + ", phones="
				+ phones + ", salary=" + salary + "]";
	}
	
	
	
}
public class TestSet3 {

	public static void main(String[] args) {
	
		Set<Trainer> setOfTrainer=new LinkedHashSet();
		//first trainer object
	List<String> listOfSkills=new ArrayList();
	listOfSkills.add("java");
	listOfSkills.add("c");
	
	Set<Long> setOfPhones=new HashSet();
	setOfPhones.add(1234556L);
	setOfPhones.add(456565757L);
	
	
	Trainer t1=new Trainer(108,"A",listOfSkills,setOfPhones,56000.00);
	
	//second trainer object
		
	List<String> listOfSkill1=new ArrayList();
	listOfSkill1.add("Python");
	listOfSkill1.add("DS");
	
	Set<Long> setOfContacts=new HashSet();
	setOfContacts.add(8234556L);
	setOfContacts.add(987565757L);
	
	
	Trainer t2=new Trainer(1,"B",listOfSkill1,setOfContacts,86000.00);
	
	setOfTrainer.add(t1);
	setOfTrainer.add(t2);
	
	
	for(Trainer t:setOfTrainer)
	{
		System.out.println(t);
	}
	
	
		
		

	}

}
