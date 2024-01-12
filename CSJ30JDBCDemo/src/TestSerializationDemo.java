import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
/*
 * Step1 : create one object of FileOutputStream and create one file
 * Step 2: create one object of ObjectOutputStream and pass the output stream object
 * in the constructor of ObejctOutputStream
 * Step 3: create object of Account class by initializing all properties or data or field
 * step 4: invoke writeObject() method of ObjectOutputStream and pass the account obejct 
 * into that writeObejct() method
 * 
 * 
 */
		
		FileOutputStream output=new FileOutputStream("D://account-details.txt");
		ObjectOutputStream objOutput=new ObjectOutputStream(output);
		Account acn=new Account(1234, "ABc",54544L, "savings");
		objOutput.writeObject(acn);
		output.close();
		objOutput.close();
		FileInputStream input=new FileInputStream("D://account-details.txt");
		ObjectInputStream objInput=new ObjectInputStream(input);
		//Object readObject()thorws ClassNotFoundException
		Account acn1=(Account)objInput.readObject();
				System.out.println(acn1.getAccountHolderName()+ " "+acn1.getPinCode());
				input.close();
				objInput.close();
		
		
		
		
		
		
		
		

	}

}
