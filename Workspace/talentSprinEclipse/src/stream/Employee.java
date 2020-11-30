package stream;

public class Employee {
	private String name ;
	private String dept ;
	private String address ;
	public Employee() {};
	public Employee(String name, String dept, String address) {
		super();
		this.name = name;
		this.dept = dept;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", address=" + address + "]";
	} 
	

}
