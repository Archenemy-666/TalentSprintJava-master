package stream.csv;

import java.util.Comparator;

public class SalarySort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalaryPerAnnum() < o2.getSalaryPerAnnum())
			return 1;
		return -1;
	}
	

}
