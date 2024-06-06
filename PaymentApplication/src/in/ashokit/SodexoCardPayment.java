package in.ashokit;

public class SodexoCardPayment implements Ipayment {

	@Override
	public boolean pay() {
		
		System.out.println("sodexo payment inprogress...");
		return true;
	}

}
