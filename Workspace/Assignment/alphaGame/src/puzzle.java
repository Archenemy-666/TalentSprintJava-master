import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class puzzle {
    public static void main(String[] args) throws IOException {


        //2. feed the arraylist to function and check
        //2.1 check if sorted
        // 2.2 locate hiphen
        // 2.3 moves algorithm .
        // 2.4 move check if correct ---  (if invalid quit)
        // 2.5 if correct move print the and store the arrayList .

       String[][] grid  =  storing();
       for (int i = 0 ; i< 5 ; i++  ){
           for(int j = 0 ; j < 5 ; j++){
               System.out.print(grid[i][j]);
           }
           System.out.println();
       }

       check(grid);


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
    public static void check (String[][] grid){
        ArrayList<String> s = new ArrayList<>();
        for(int i = 0 ; i<5 ; i++){
            for(int j = 0 ; j< 5 ; j++){
                s.add(grid[i][j]);
            }
        }
        for(String x : s){
            System.out.println(s);
        }

    }
}








