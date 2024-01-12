import java.time.LocalDate;

public class TestCheckWeekend {

	public static void main(String[] args) {

   String dateOfTraining="2023-08-20";
   LocalDate ld=LocalDate.parse(dateOfTraining);
   int dayOfWeek=ld.getDayOfWeek().ordinal();
	System.out.println(dayOfWeek);	
	if(dayOfWeek==5)
	{
		System.out.println("saturday");
	}
	else if(dayOfWeek==6)
	{
		System.out.println("sunday");
	}
		
		
		

	}

}
