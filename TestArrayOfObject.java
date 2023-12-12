import java.util.Scanner;

class Player
{
	String pName;
	String pSkill;
	public Player(String pName, String pSkill) {
		super();
		this.pName = pName;
		this.pSkill = pSkill;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpSkill() {
		return pSkill;
	}
	public void setpSkill(String pSkill) {
		this.pSkill = pSkill;
	}
	
}
public class TestArrayOfObject {

	public static void main(String[] args) {
Player[] playerArray=new Player[4];
playerArray[0]=new Player("Virat","bat");
playerArray[1]=new Player("Abc","ball");
playerArray[2]=new Player("xyz","bat");
playerArray[3]=new Player("pqr","ball");




for(int i =0; i<playerArray.length; i++)
{
String name=	playerArray[i].getpName();
String skill=playerArray[i].getpSkill();
System.out.println(name+ " "+skill);
	
}

	}

}
