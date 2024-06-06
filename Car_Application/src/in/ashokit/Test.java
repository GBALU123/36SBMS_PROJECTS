package in.ashokit;

public class Test {

	public static void main(String[] args) {
		
		// constructor injection
		Car c = new Car(new DieselEngine());
		/*
		 * Car c = new Car();
		 * c.setEng(new DieselEngine);
		 * 
		 */
		c.drive();
	}
}

