interface Ticket
{
	Ticket geTicket();
}
class MovieTicket implements Ticket
{
	String showTime;
	String movieName;
	String screenNum;
	public MovieTicket(String showTime, String movieName,String screenNum)
	{
		this.showTime=showTime;
		this.screenNum=screenNum;
		this.showTime=showTime;
	}
	@Override
	public Ticket geTicket() {
		// TODO Auto-generated method stub
		return new MovieTicket(showTime, movieName, screenNum);
	}
	@Override
	public String toString() {
		return "MovieTicket [showTime=" + showTime + ", movieName=" + movieName + ", screenNum=" + screenNum + "]";
	}
	
	
	
}
public class TestProtoType {

	public static void main(String[] args) {

   MovieTicket m=new MovieTicket("12:30P.M", "Highway", "S7");
   
   System.out.println(m);
   
   MovieTicket m1=(MovieTicket)  m.geTicket();
   System.out.println(m1);

	}

}
