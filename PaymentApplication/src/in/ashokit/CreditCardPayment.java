package in.ashokit;

public class CreditCardPayment implements Ipayment {

	@Override
	public boolean pay() {

		System.out.println("credit card payment in progress");
		
		return true;
	}

}
