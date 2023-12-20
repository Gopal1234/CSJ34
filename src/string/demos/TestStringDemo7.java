package string.demos;

public class TestStringDemo7 {

	public static void main(String[] args) {
//48  57
		//Character.isDigit(char ch)
String str="ABC234589XYZ";
int digitCounter=0;

int sum=0;
for(int i=0; i<str.length(); i++)
{
	/*if(str.charAt(i)>=48 && str.charAt(i)<=57)
	{
		digitCounter++;
	}*/
	if(Character.isDigit(str.charAt(i)))
	{
		//digitCounter++;
		char ch=str.charAt(i);
		String str1=String.valueOf(ch);
		int num=Integer.valueOf(str1);
		//int num=Integer.valueOf(String.valueOf(str.charAt(i)));
	  sum=sum+num;
	}
}
System.out.println(sum);



	}

}
