package stream.csv;

import java.util.Comparator;

public class Employee  {
	
	private String name;
	private String dept ; 
	private float salary ;
	private float salaryPerAnnum ;
	
	public Employee() {}
	public Employee(String name, String dept, long salary) {
		
		this.name = name;
		this.dept = dept;
		this.salary = salary;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float f) {
		this.salary = f;
	}
	public void setSalaryPerAnnum(float perAnnumSalary) {
		this.salaryPerAnnum = perAnnumSalary ;
		
	}
	public float getSalaryPerAnnum() {
		this.salaryPerAnnum = this.salary * 12 ;
		return this.salaryPerAnnum ;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", perAnnumSalary=" + getSalaryPerAnnum()+"]" + "\n";
	}



	
	

}
