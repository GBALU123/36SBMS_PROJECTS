package in.ashokit;

public class DebitCardPayment implements Ipayment {

	@Override
	public boolean pay() {
		
		System.out.println("debit card payment in progress....");
		return true;
	}

}
