import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

FileInputStream input=new FileInputStream("D://account-details.txt");
ObjectInputStream objInput=new ObjectInputStream(input);
Account acn=(Account)objInput.readObject();
		System.out.println(acn.getAccountHolderName()+ " "+acn.getPinCode());
		input.close();
		objInput.close();
		

	}

}
