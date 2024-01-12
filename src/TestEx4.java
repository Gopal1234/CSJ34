import java.util.LinkedList;
import java.util.Scanner;

class Player1
{
	int playerId;
	String playerName;
	String playerSkill;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerSkill() {
		return playerSkill;
	}
	public void setPlayerSkill(String playerSkill) {
		this.playerSkill = playerSkill;
	}
	
}
public class TestEx4 {

	public static void main(String[] args) {
LinkedList<Player1> list=new LinkedList();
Scanner sc=new Scanner(System.in);
for(int i=0; i<3; i++)
{
	System.out.println("enter player id");
	int id=sc.nextInt();
	System.out.println("enter player name");
	String pName=sc.next();
	System.out.println("enter player skill");
	String pSkill=sc.next();
	Player1 player =new Player1();
	player.setPlayerId(id);
	player.setPlayerName(pName);
	player.setPlayerSkill(pSkill);
	list.add(player);
			
	
}

//iterating list
for(int index=0; index<list.size(); index++)
{
	Player1 p=list.get(index);
	System.out.println(p.getPlayerId()+ " "+p.getPlayerName()+ " "+p.getPlayerSkill());
	
}



	}

}
