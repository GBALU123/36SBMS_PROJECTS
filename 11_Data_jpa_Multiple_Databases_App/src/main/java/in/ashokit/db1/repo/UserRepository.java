package in.ashokit.db1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.db1.entities.UserEntity;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity, Integer>{

}
