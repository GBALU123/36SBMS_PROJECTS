package in.ashokit;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ReportDao {
	
public ReportDao() {
	System.out.println("ReportDao : : Constructor");
}
}
