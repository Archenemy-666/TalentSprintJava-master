import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class puzzle {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        //2. feed the arraylist to function and check

        String[][] grid = storing();
        printGrid(grid);



        // try catch , if the inout is out of bounds
        try {
            //2.1 check if sorted
            while (!checkIfNotInOrder(grid)) {

                // add statements that help in movement of empty place
                int[] coordinates = locate(grid);
                System.out.println("enter the command from Below \n a: above \n b: below \n l: left \n r: right");
                String command = scan.next();

                // 2.5 if correct move print the and store the arrayList .

                if (command.equalsIgnoreCase("a")) {
                    above(grid, coordinates);
                    printGrid(grid);
                } else if (command.equalsIgnoreCase("b")) {
                    below(grid, coordinates);
                    printGrid(grid);

                } else if (command.equalsIgnoreCase("l")) {
                    left(grid, coordinates);
                    printGrid(grid);
                } else if (command.equalsIgnoreCase("r")) {
                    right(grid, coordinates);
                    printGrid(grid);
                } else
                    System.out.println("enter the correct move");

            }


            // 2.4 move check if correct ---  (if invalid quit)
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("**** wrong move ***** :( ");
        }

        if(checkIfNotInOrder(grid)){
            System.out.println("You Won , Game Over :D ");
        }
    }


    public static String[][] storing() throws IOException {
        //FileReader read = new FileReader("D:\\TalentSprintJava-master\\Workspace\\Assignment\\alphaGame\\gameInput.txt");
        // TESTER FILE
       // FileReader read = new FileReader("D:\\TalentSprintJava-master\\Workspace\\Assignment\\alphaGame\\correctInputForGame.txt");
        FileReader read = new FileReader("D:\\TalentSprintJava-master\\Workspace\\Assignment\\alphaGame\\correctInput2.txt");

        BufferedReader buffer = new BufferedReader(read);
        String line = buffer.readLine();
        int count = 0 ;


        //1. take input and store it in a Array
        String[][] grid = new String[5][5] ;

        while (line != null) {
            String[] row = new String[5];
            row = line.split(" ");

            for(int i = 0 ; i < 5 ; i++ ){
                for(int j = 0 ; j< 5 ; j++){
                    grid[count][j] = row[j];
                }
            }
            line = buffer.readLine();
            count ++ ;
        }

        return grid ;
    }



    // method to check if it is sorted
    public static boolean checkIfNotInOrder (String[][] grid){
        ArrayList<String> check1 = new ArrayList<>();
        ArrayList<String> check2 = new ArrayList<>();
        String[] order2 = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","-"};
        int count = 0 ;
        ArrayList<String> check3 = new ArrayList<>();
        // introducing another condition to win !!
        for(int i = 0 ; i < order2.length ; i++){
            check3.add(order2[i]);
        }

        //converting from array to arraylist
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                    check1.add(grid[i][j]);
                    check2.add(grid[i][j]);
                    Collections.sort(check2);
            }
        }
        if(check1.equals(check2) || check1.equals(check3)){
            return true ;
        }
        return false ;

    }




    public static void printGrid(String [][] grid){
        for (int i = 0 ; i< 5 ; i++  ){
            for(int j = 0 ; j < 5 ; j++){
                System.out.print(grid[i][j]+"\t");
            }
            System.out.println();
        }
    }

    // 2.2 locate hyphen
    public static int[] locate(String[][] grid){
        int[] coordinates = new int[2];
        for(int i = 0 ; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                if(grid[i][j].equals("-")){
                    coordinates[0] = i ;
                    coordinates[1] = j ;
                }
            }
        }
        return coordinates;
    }


    // 2.3 moves algorithm .
    // NOTE : here the first coordinate is the y coordinate and second one denotes x coordinate LOOK OUT !!!
    public static String[][] above(String[][] grid , int [] coordinates ){
        String temp = null ;
        int i = coordinates[0] ;
        int j = coordinates[1] ;
        temp = grid[i][j] ;
        grid[i][j] = grid[i-1][j] ;
        grid[i-1][j] = temp ;
        return grid ;
    }
    public static String[][] below(String[][] grid , int [] coordinates ){
        String temp = null ;
        int i = coordinates[0] ;
        int j = coordinates[1] ;
        temp = grid[i][j] ;
        grid[i][j] = grid[i+1][j] ;
        grid[i+1][j] = temp ;
        return grid ;
    }
    public static String[][] right(String[][] grid , int [] coordinates ){
        String temp = null ;
        int i = coordinates[0] ;
        int j = coordinates[1] ;
        temp = grid[i][j] ;
        grid[i][j] = grid[i][j+1] ;
        grid[i][j+1] = temp ;
        return grid ;
    }
    public static String[][] left(String[][] grid , int [] coordinates ){
        String temp = null ;
        int i = coordinates[0] ;
        int j = coordinates[1] ;
        temp = grid[i][j] ;
        grid[i][j] = grid[i][j-1] ;
        grid[i][j-1] = temp ;
        return grid ;
    }



}








