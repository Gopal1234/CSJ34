package exception.demos;
class InsuffsicientFundException extends Exception
{
	/*
	 * Exception(String msg)
	 * {
	 * }
	 */
	public InsuffsicientFundException(String msg) {
		
		super(msg);
	}
	public InsuffsicientFundException()
	{
		
	}
}

class Account
{
	static double totalAmt=10000.00;
	public static double getMoney(double amount)
			throws InsuffsicientFundException
	
	{
		if(amount>totalAmt)
		{
			throw new 
	InsuffsicientFundException("less amount check your balance...");
		}
		else
		{
			totalAmt=totalAmt-amount;
			return totalAmt;
		}
	}
	
}






public class TestExceptionDemo4 {

	public static void main(String[] args) throws InsuffsicientFundException {
//try
//{
Account.getMoney(12000.00);
/*}catch(InsuffsicientFundException e)
{
	System.out.println(e);
}*/
	}

}
