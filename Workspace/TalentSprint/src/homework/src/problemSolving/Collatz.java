package problemSolving;

import java.util.ArrayList;
import java.util.Scanner;

public class Collatz {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        ArrayList<Integer> list1 = collatz(input) ;
        System.out.println(collatz(input));
        System.out.println(powerOfTwo(list1));
        System.out.println(ifPowerOfTwo1(list1));


    }



    public static ArrayList<Integer> collatz(int input) {
        int temp = input ;
        ArrayList<Integer>listOfCollatz = new ArrayList<Integer>();
        while (temp != 1) {
            if(temp % 2 == 0 ) {
                listOfCollatz.add(temp);
                temp = temp / 2 ;


            }
            else {
                listOfCollatz.add(temp);
                temp = temp * 3 + 1 ;

            }

        }
        return listOfCollatz ;
    }





    public static boolean ifPowerOfTwo(int i) {
        if((int)(Math.ceil((Math.log(i) / Math.log(2)))) == (int)(Math.floor(((Math.log(i) / Math.log(2)))))) {
            return true;
        }
        return false ;
    }

    public static double ifPowerOfTwo1(ArrayList<Integer> listOfCollatz) {
        double k = 0 ;
        for(int i : listOfCollatz){
         if((int)(Math.ceil((Math.log(i) / Math.log(2)))) == (int)(Math.floor(((Math.log(i) / Math.log(2)))))) {
             double exp = Math.log10(i) / Math.log10(2);
             k = Math.pow(2,exp);
         }
        }

        return k ;
    }




    public static double powerOfTwo(ArrayList<Integer> listOfCollatz) {
        double max = 0;
        double num = 0 ;
        for(int i : listOfCollatz) {

            if(ifPowerOfTwo(i)) {

                double exp = Math.log10(i) / Math.log10(2);
                System.out.println("exp is"+ exp);
                if (max <  exp ) {
                    max = (exp) ;
                    num = Math.pow(2, max);

                }
            }

        }
        return num;
    }
}