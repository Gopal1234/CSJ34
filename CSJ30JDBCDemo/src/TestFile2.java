import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestFile2 {

	public static void main(String[] args) throws IOException {

FileOutputStream fout=new FileOutputStream("./src/training-program.csv",true);
Scanner sc=new Scanner(System.in);
System.out.println("enter the schedule name");
String name=sc.next();
byte[] sName=name.getBytes();
fout.write(sName);
System.out.println("enter session start date");
String startDate1=sc.next();
LocalDate sd1=LocalDate.parse(startDate1);
DateTimeFormatter format=DateTimeFormatter.ofPattern("DD-MMM-YYYY");
String startDateInString=format.format(sd1);
byte[] sDate=startDateInString.getBytes();
fout.write(sDate);
System.out.println("enter session end date");
String endDate1=sc.next();
LocalDate ed1=LocalDate.parse(endDate1);
DateTimeFormatter format1=DateTimeFormatter.ofPattern("DD-MMM-YYYY");
String endDateInString=format.format(ed1);
byte[] eDate=startDateInString.getBytes();
fout.write(eDate);

fout.close();






		
		
		

	}

}
