package stream;
import java.io.*;

public class EmployeeBuffer1 {
	
	
	public static void main(String[] args) throws IOException  {
	FileReader read = new FileReader("employee.txt");
	BufferedReader buffer = new BufferedReader(read);
	String line =buffer.readLine();
	Employee e = new Employee();
	
	
	
	while (line != null) {
		e = LineProcessor(line , e);
		line = buffer.readLine();
		
	
	}
	System.out.println(e);
	
}

public static Employee LineProcessor(String line , Employee e ) {
	
	String[] sub = line.split(":");
	String heading = sub[0].trim();
	String data = sub[1].trim();
	
	//String data = sub[1] ;
	
	if(heading.equalsIgnoreCase("name"))
		e.setName(data);
	else if(heading.equalsIgnoreCase("dept"))
		e.setDept(data);
	else if(heading.equalsIgnoreCase("address"))
		e.setAddress(data);
	
	System.out.println(e);
	
	
	return e ;
	
}


}
