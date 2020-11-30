package problemSolving;

import java.util.Scanner;

public class BooleanTrueFalseCheck {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in) ;
	boolean b1 = scan.nextBoolean();
	boolean b2 = scan.nextBoolean();
	boolean b3 = scan.nextBoolean();
	
	int value = check(b1,b2,b3);
	System.out.println(value);
	System.out.println(checknext(value));
	
	
}

public static int check(boolean b1, boolean b2 , boolean b3 ) {
	
	int trueCount = 0;
	if(b1)
		trueCount ++ ;
	if(b2)
		trueCount++;
	if(b3)
		trueCount++;
	return trueCount ;
}

public static boolean checknext(int num) {
	if(num == 2)
		return true ;
	return false ;
}
}
