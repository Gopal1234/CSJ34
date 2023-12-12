package inheritance.demos;
class Mobile
{
	public Mobile()
	{
		System.out.println("I am old age mobile");
	}
	void sms()
	{
		System.out.println("we can do sms....");
		
	}
	void call()
	{
		System.out.println("calling......");
	}
}
class SmartPhone extends Mobile
{
	public SmartPhone()
	{
		super();
		System.out.println("I am from new age mobile");
	}
	void wifi()
	{
		System.out.println("wifi accesss.....");
	}
	void bt() {
		System.out.println("bt....");
	}
	void camera()
	{
		System.out.println("camera...");
	}
}
public class TestInheritanceDemo1 {

	public static void main(String[] args) {

SmartPhone sm=new SmartPhone();
sm.call();//parent
sm.sms();//parent
sm.bt();//child
sm.camera();//child
sm.wifi();//child

	}

}
