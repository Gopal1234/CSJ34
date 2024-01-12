package collection.demos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Product
{
	private String pCode;
	private String name;
	private Date mfd;
	private double price;
	public Product(String pCode, String name, Date mfd, double price) {
		super();
		this.pCode = pCode;
		this.name = name;
		this.mfd = mfd;
		this.price = price;
	}
	
	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getMfd() {
		return mfd;
	}

	public void setMfd(Date mfd) {
		this.mfd = mfd;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pCode=" + pCode + ", name=" + name + ", mfd=" + mfd + ", price=" + price + "]";
	}
	
}
public class TestArrayList1 {

	public static void main(String[] args) {

List<Product> listOfProduct=new ArrayList();
listOfProduct.add(new Product("LAPTOP-008","HP LAPTOP",new Date("12/08/2023"),45000.00));
listOfProduct.add(new Product("MOBILE-008","APPLE",new Date("17/08/2023"),75000.00));


listOfProduct.add(new Product("SMARTWATCH-008","TITAN SW",new Date("12/08/2023"),35000.00));


listOfProduct.add(new Product("SMARTPHONE-008","REDMI",new Date("12/08/2023"),25000.00));

//we can use forEach loop
for(Product p:listOfProduct)
{
	System.out.println(p);
}
double sum=0;
//calculate the total price of all product;
Iterator itr=   listOfProduct.iterator();
while(itr.hasNext())
{
 Product p=(Product)itr.next();	
double price= p.getPrice();
sum=sum+price;
}
System.out.println(sum);
// based on the product code remove the product object
Scanner sc=new Scanner(System.in);
System.out.println("enter the product code");
String UserPCode=sc.next();
for(int index=0; index<listOfProduct.size(); index++)
{
	//fetch the product object
	Product pObj=listOfProduct.get(index);
	//fetch the product code
String pcode=	pObj.getpCode();
	//match the product code with user input
if(pcode.equals(UserPCode))
{
	//call remove() method collection	
	listOfProduct.remove(index);
}

}
for(Product p:listOfProduct)
{
	System.out.println(p);
}





	}

}
