package problemSolving;

public class CollatzPowerOfTwo {
	public static int Collatz(int num) {
	 
	        if (num == 1)  {
	        	return num ;
	        }
	        else if (num % 2 == 0) {
	        return Collatz(num / 2);
	        }
	        else {
	        	return Collatz(3*num + 1);
	        }
	    }
		
		
		
		
		
		
		
		
		
	public static void main(String [] args) {
		System.out.println(Collatz(6));
	}
}
