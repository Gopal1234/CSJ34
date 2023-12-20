package inheritance.demos;
interface SalaryCalculator
{
	double 
	calculateSalary
	(double basicPay, double hra,
			double ma,double pf, double tds);
}
class WiproUSA implements SalaryCalculator
{

	@Override
	public double calculateSalary
	(double basicPay, double hra, double ma, double pf, double tds) {
		// TODO Auto-generated method stub
		return ((basicPay+hra+ma)-(pf+tds))*83;
	}
	
}
class WiproIndia implements SalaryCalculator
{

	@Override
	public double calculateSalary(double basicPay, double hra, double ma, double pf, double tds) {
		// TODO Auto-generated method stub
		return (basicPay+ma+hra)-(pf+tds);
	}
	
}
public class TestInterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reference of SalaryCaluclator
SalaryCalculator salary=null;
salary=new WiproUSA();
double wiproUSAAmt=salary.
calculateSalary(5000.00, 3000.00, 2000.00, 1000.00, 500.00);
System.out.println("wipro USA"+ " got"+ " "+wiproUSAAmt+ " "+"in rupees");

salary=new WiproIndia();
 double wiproInd= salary.
calculateSalary(8000.00, 15000.00, 5000.00, 1000.00,500);
 System.out.println("wipro INDIA"+ " got"+ " "+wiproInd+ " "+"in rupees");


}

}
