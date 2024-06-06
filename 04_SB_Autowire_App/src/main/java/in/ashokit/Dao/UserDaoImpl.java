package in.ashokit.Dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

	@Override
	public boolean saveUser(String name, String email, String pwd) {
		
		// db logic 
		System.out.println("Recrd inserted into Db datable....");
		
		return true;
		
	}

}
