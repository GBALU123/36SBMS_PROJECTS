package in.ashokit.Dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {
		System.out.println("UserDaoImpl :: constructor");
	}
	@Override
	public String findNameById(Integer id) {
		
		if(id == 100) {
		return "Balu";
	}else if(id == 200) {
		return "Rani";
	}
		return null;
	}

}
