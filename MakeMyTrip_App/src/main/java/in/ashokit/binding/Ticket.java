package in.ashokit.binding;


public class Ticket {

	
	private Integer ticketId;
	
	private String name;
	
	private String email;
	
	private String gender;
	
	private String from;
	
	private String to;
	
	private String trainNum;
	
	private String status;

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

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

	public String getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", name=" + name + ", email=" + email + ", gender=" + gender + ", from="
				+ from + ", to=" + to + ", trainNum=" + trainNum + ", status=" + status + "]";
	}

	
	
	
}
