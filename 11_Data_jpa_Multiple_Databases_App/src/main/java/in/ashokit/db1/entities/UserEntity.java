package in.ashokit.db1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="User_Table")
@NoArgsConstructor
@AllArgsConstructor
public  class UserEntity {

	@Id
	private int id;
	private String name;
	
	public UserEntity() {
		
	}

	public UserEntity(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
