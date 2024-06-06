package in.ashokit.rest;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ashokit.exception.AppExInfo;
import in.ashokit.exception.NoUserFoundException;

@RestControllerAdvice
public class AppExceptionHandler {
	
	
	
	
	@ExceptionHandler(NoUserFoundException.class)
	public ResponseEntity<AppExInfo> handleAE(NoUserFoundException e){
		
		AppExInfo info = new AppExInfo();
		
		info.setExCode("SBTEX007");
		info.setExMsg(e.getMessage());
		info.setExDate(LocalDateTime.now());
	
		return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
	}
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<AppExInfo> handleAE(Exception e){
		
		AppExInfo info = new AppExInfo();
		
		info.setExCode("SBTEX007");
		info.setExMsg(e.getMessage());
		info.setExDate(LocalDateTime.now());
	
		return new ResponseEntity<>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
