import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

import static java.util.Collections.*;

public class puzzle {
    public static void main(String[] args) throws IOException {


        //2. feed the arraylist to function and check
        //2.1 check if sorted
        // 2.2 locate hiphen
        // 2.3 moves algorithm .
        // 2.4 move check if correct ---  (if invalid quit)
        // 2.5 if correct move print the and store the arrayList .

       String[][] grid  =  storing();
       int[] coordinates = locate(grid);
       for(int i = 0 ; i < 2 ; i++){
           System.out.println(coordinates[i]);

       }

       // here the first coordinate displays the y coordinate and second one denotes x coordinate
       System.out.println(grid[2][1]);
       System.out.println(grid[1][2]);


      // checking the contents
        /*
        while(!checkIfNotInOrder(grid)){

            // add statements that help in movement of empty place
            printGrid(grid);
        }
        */

    }


    public static String[][] storing() throws IOException {
        FileReader read = new FileReader("D:\\TalentSprintJava-master\\Workspace\\Assignment\\alphaGame\\gameInput.txt");
        BufferedReader buffer = new BufferedReader(read);
        String line = buffer.readLine();
        int count = 0 ;
        //1. take input and store it in a Array
       // ArrayList<String[]> grid = new ArrayList<>();
        String[][] grid = new String[5][5] ;

        while (line != null) {
            String[] row = new String[5];
            row = line.split(" ");

            for(int i = 0 ; i < 5 ; i++ ){
                for(int j = 0 ; j< 5 ; j++){
                    grid[count][j] = row[j];
                    //System.out.print(grid[i][j]);
                }
                 //System.out.println();

            }
            line = buffer.readLine();
            count ++ ;
        }

        return grid ;
    }




    public static boolean checkIfNotInOrder (String[][] grid){
        ArrayList<String> check1 = new ArrayList<>();
        ArrayList<String> check2 = new ArrayList<>();
        int count = 0 ;
        //converting from array to arraylist
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                    check1.add(grid[i][j]);
                    check2.add(grid[i][j]);
                    Collections.sort(check2);
            }
        }
        if(check1.equals(check2)){
            return true ;
        }
        return false ;


        // trying to store value into a ArrayList
        /*
        for(String x : s) {
            while(count < 1) {
                {
                    final1.add(s);
                    System.out.println(s);
                    count++;
                }
            }
        }
        */
    }



    public static void printGrid(String [][] grid){
        for (int i = 0 ; i< 5 ; i++  ){
            for(int j = 0 ; j < 5 ; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
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

    public static void above(String[][] grid){
        String temp = null ;
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                temp = grid[i][j] ;
            }
        }

    }



}








