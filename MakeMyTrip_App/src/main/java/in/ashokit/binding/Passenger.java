package in.ashokit.binding;

public class Passenger {

	private String name;
	
	private String email;
	
	private String gender;
	
	private String from;
	
	private String to;
	
	private Integer trainNum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Integer getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", email=" + email + ", gender=" + gender + ", from=" + from + ", to=" + to
				+ ", trainNum=" + trainNum + "]";
	}
	
	
	
	
	
}
