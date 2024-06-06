package in.ashokit.rest;

import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.UserEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class UserRestController {

	// register
	public String registerUser(UserEntity user) {
		return null;
		
	}
}
