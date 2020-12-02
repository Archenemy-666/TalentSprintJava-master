package stream.csv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException ;
import java.util.LinkedList;
import java.util.List;

public class ReadCsv {
	public static void main (String[] args) throws IOException  {
		FileReader input = new FileReader ("D:\\TalentSprintJava-master\\Workspace\\talentSprinEclipse\\csvfiles\\EmployeeDetails.csv");
		BufferedReader reader = new BufferedReader(input);
		
		FileWriter w = new FileWriter("copyEmployee_details.csv");
		String line = reader.readLine();
		line = reader.readLine();
		List<Employee> employeeDatabase = new LinkedList<Employee>();  
		
		while (line != null) {
			line = line.concat("\n");
			w.write(line);
			System.out.println(line);

			line = reader.readLine();
		}
		input.close();
		reader.close();
		w.close();

		}
	}


