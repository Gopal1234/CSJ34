import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestFile {

	public static void main(String[] args) throws IOException {

Reader reader=new FileReader("./src/Holiday.txt");
BufferedReader br=new BufferedReader(reader);
String line=br.readLine();
     String[] doh= line.split("-");
		String year=doh[0];
		String day=doh[1];
		String month=doh[2];
		System.out.println(year+ " "+day+ " "+month);
		
		
		

	}

}
