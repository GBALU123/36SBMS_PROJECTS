package in.ashokit.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Motor {

	@PostConstruct
	public  void m1() {
		System.out.println(" motor :: m1() mwthod started...");
	}
	@PreDestroy
	public void m2(){
		System.out.println("motor is stoped...");
		}
}
