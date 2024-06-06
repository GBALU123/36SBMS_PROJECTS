package in.ashokit;

public class Car {

	private Engine eng = null;
	
	//constructor injection
	public Car(Engine eng) {
		this.eng = eng;
	}
	/*
	 * public void setEng(Engine eng){
	 * this.eng = eng;
	 * 
	 */
	public void drive() {
		int status = eng.start();
		
		if(status >= 1) {
			System.out.println("journey started.....");
		}else {
			System.out.println("failed to stat the engine....");
		}
	}
}

