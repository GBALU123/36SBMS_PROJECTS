package in.ashokit.response;



public class Product {

	private String pid;
	
	private String name;

	

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + "]";
	}

	
	
	
	
}
