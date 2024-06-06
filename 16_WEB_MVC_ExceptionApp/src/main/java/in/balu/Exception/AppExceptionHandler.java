package in.balu.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e) {
		System.out.println(e.getMessage());
		return "errorview";
	}
}
