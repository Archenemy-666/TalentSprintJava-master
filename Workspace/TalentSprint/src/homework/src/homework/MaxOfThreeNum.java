package homework;

import java.util.Scanner;

public class MaxOfThreeNum {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter num1");
		int num1 = scan.nextInt();

		System.out.println("enter num2");
		int num2 = scan.nextInt();

		System.out.println("enter num3");
		int num3 = scan.nextInt();

		if ((num1 > num2) && (num1 > num3)) {
			System.out.println("num1 is greatest " + num1);
		} 
		
		else if (num2 > num3)
		{
			System.out.println("num2 is the greatest " + num2);
		} 
		
		else 
		{
			System.out.println("num3 is the greatest " + num3);
		}

	}

}
