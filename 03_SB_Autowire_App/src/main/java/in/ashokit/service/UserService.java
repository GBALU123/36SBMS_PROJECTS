package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ashokit.Dao.UserDao;

@Component
public class UserService {

	@Autowired
	private UserDao dao; // field injection(reflection)

	public void getUserName(Integer id) {
		String name = dao.findNameById(id);
		System.out.println(name);
	}
}
