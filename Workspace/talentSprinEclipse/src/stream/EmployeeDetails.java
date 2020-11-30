package stream;
import java.io.*;

public class EmployeeDetails {
	public static void main(String[]args)throws IOException{
		FileInputStream reader = new FileInputStream("employee.txt");
		int b = reader.read();
		String s = "";
		while(b != -1) {
			s += (char)b ;
			b = reader.read();
		}
		
		Employee e1 = new Employee();
		
		System.out.println(s);
		
		String[] line = s.split("\n");
		
		
		for(int i = 0 ; i < line.length ; i++) {
			
			String[] section = line[i].split(":") ;
			section[0] = section[0].trim() ;
			System.out.println(section.length);
			
			
			if(section[0].equalsIgnoreCase("name")) {
				e1.setName(section[1]);
			}
			else if(section[0].equalsIgnoreCase("dept")) {
				e1.setDept(section[1]);
			}
			else if(section[0].equalsIgnoreCase("address")) {
				e1.setAddress(section[1]);
			}
			
		}
		System.out.print(e1);
		
		
		
		
	}
}
