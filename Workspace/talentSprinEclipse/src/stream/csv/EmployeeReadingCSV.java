package stream.csv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException ;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;

public class EmployeeReadingCSV {


		public static void main (String[] args) throws IOException  {
			FileReader input = new FileReader ("D:\\TalentSprintJava-master\\Workspace\\talentSprinEclipse\\csvfiles\\EmployeeDetails.csv");
			BufferedReader reader = new BufferedReader(input);
		
		
			String line = reader.readLine();
			line = reader.readLine();
			
			
			List<Employee> employeeDatabase = new LinkedList<Employee>();  
			List<Employee> employeeAnnumDatabase = new LinkedList<Employee>();
			
			
			while (line != null) {
				line = line.concat("\n");

				Employee e = createEmp(line);
				Employee e1 = createEmpAnnum(line);
				employeeDatabase.add(e);
				employeeAnnumDatabase.add(e1);
				line = reader.readLine();
			}
			
			Collections.sort(employeeAnnumDatabase,new  SalarySort());
			
			writeCSV(employeeAnnumDatabase);
		
			input.close();
			reader.close();
		
			
			
			for(Employee e : employeeAnnumDatabase) {
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
		public static Employee createEmpAnnum(String line) {
			String [] data = line.split(",");
			Employee e = new Employee();
			e.setName(data[0]);
			e.setDept(data[1]);
			e.setSalary(Float.parseFloat(data[2]));
			return e ;
				
		}
		public static void writeCSV(List<Employee> employeeAnnumDatabase) throws IOException {
			FileWriter w = new FileWriter("databaseEmployee.csv");
			for(Employee e : employeeAnnumDatabase) {
				w.write(e.toString());
				
			}
			w.close();
		}

	}


