package problemSolving;

public class FourDigitEvenPerfectNumber {
	public static void main(String[] args ) {
		perfectSquares(9898);
		
	}
	public static void  perfectSquares( int end ) {
		for(int i = 0 ; i <= end ; i++ ) {
			 
			while((i * i ) > 999 && (i*i)< 10000) {
				if((i*i) % 2 == 0) {
				System.out.println( i*i);
				}
				i++;
			}
			
		}
	}
}

