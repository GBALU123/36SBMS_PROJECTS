package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.UserEntity;
import java.util.List;


public interface UserRepo  extends JpaRepository<UserEntity, Integer> {
	
	// select * from user_tabl where uname = !uname
	
	public UserEntity  findByUname(String uname);

}
