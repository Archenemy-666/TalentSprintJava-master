package stream;
import java.io.*;

public class EmployeeBuffer {

	
	public static void main(String[] args) throws IOException {
		FileReader input = new FileReader("employee.txt");
		BufferedReader buffer = new BufferedReader(input);
		String line = buffer.readLine();

		Employee e = new Employee();
		
		while (line != null) {
			// line = Address : Hyd
			 
			e = updateEmployee(line,e);
			
			line = buffer.readLine();// Address : Hyd
		}
		System.out.println("-----------------------------------------");
		System.out.println(e);
	}
//											Address : Hyd			e
	private static Employee updateEmployee(String line, Employee e) {
		String[] s = line.split(":");
		String heading = s[0].trim(); // Address
		String data = s[1].trim(); // Hyd
		
	
		
		if(heading.equalsIgnoreCase("name"))
			e.setName(data);
		if(heading.equalsIgnoreCase("dept"))
			e.setDept(data);
		if(heading.equalsIgnoreCase("address"))
			e.setAddress(data);
		
		
		// this problem System.out.println(e);
		return e;// [name=arun , dept = null, address = null]
			//[name=arun , dept = Admin, address = null]
		
		//[name=arun , dept = Admin, address = hyd]
	}
}



