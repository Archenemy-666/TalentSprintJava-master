package Collections;
import java.util.*;

public class StudentDetails {
	public static void main(String[] args) {
		
		Student S1 = new Student(12 , "sid" , 2 , 3, 4 , 5, 2 );
		S1.getPercentage();
		Student S2 = new Student(12 , "sid" , 2 , 3, 4 , 5, 2 );
		S2.getPercentage();
		Student S3 = new Student(12 , "sid" , 2 , 3, 4 , 5, 2 );
		S3.getPercentage();
		Student S4 = new Student(12 , "sid" , 2 , 3, 4 , 5, 2 );
		S4.getPercentage();
		Student S5 = new Student(12 , "sid" , 2 , 3, 4 , 5, 2 );
		S5.getPercentage();
		
		Student[] StudentObj = {S1 , S1 , S3 , S4 ,S5 };
		// GENERICS ARE ADDED 
		List<Student> Students = new ArrayList<Student>();
		for ( int i = 0 ; i < StudentObj.length ; i++) {
			Students.add(StudentObj[i]);
		}
		for ( int i = 0 ; i < Students.size() ; i++) {
			System.out.println(Students.get(i));
		}
		
	}
	

}
