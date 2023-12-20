
public class TestCustomer {

	public static void main(String[] args) {

//first I will create the object of Product
		Product[] pArray=new Product[3];
		pArray[0]=new Product(1,"Laptop",45000.00);
		pArray[1]=new Product(2, "TV", 35000.00);
		pArray[2]=new Product(3, "Mobile", 10000.00);
		
		
		
		Customer customer=
				new Customer("Ravi",323323,"ravi@gmail.com",pArray);
		
	String name=	customer.getName();
	String email=	customer.getEmailId();
	long ph=	customer.getPhone();
	Product[] pObj=	customer.getProduct();
	for(int i=0; i<pObj.length; i++)
	{
		//System.out.println(pObj[i]);
long id=		pObj[i].getProductId();
	String pname=pObj[i].getProductName();	
		double price=pObj[i].getProductPrice();
		System.out.println(id+ " "+pname+ " "+price);
	}
   
   System.out.println(name+ " "+email+ " "+ph);
	}

}
