package stream.csv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException ;
import java.util.LinkedList;
import java.util.List;

public class EmployeeReadingCSV {


		public static void main (String[] args) throws IOException  {
			FileReader input = new FileReader ("D:\\TalentSprintJava-master\\Workspace\\talentSprinEclipse\\csvfiles\\EmployeeDetails.csv");
			BufferedReader reader = new BufferedReader(input);
			
		
			String line = reader.readLine();
			line = reader.readLine();
			List<Employee> employeeDatabase = new LinkedList<Employee>();  
			
			while (line != null) {
				line = line.concat("\n");

				Employee e = createEmp(line);
				employeeDatabase.add(e);
				line = reader.readLine();
			}
			input.close();
			reader.close();
	
			for(Employee e : employeeDatabase) {
				System.out.println(e);
			}
		}
		public static Employee createEmp(String line) {
			String [] data = line.split(",");
			Employee e = new Employee();
			e.setName(data[0]);
			e.setDept(data[1]);
			e.setSalary(Float.parseFloat(data[2]));
			return e ;
				
		}

	}


