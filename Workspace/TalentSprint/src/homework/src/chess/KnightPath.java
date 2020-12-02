package chess;
import java.util.*;
public class KnightPath{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of board : ");
        int size = scan.nextInt();

        int[][] board = new int[size][size] ;


        for(int x = 0 ; x< board.length ; x++){
            for(int y = 0 ; y < board.length ; y++){
                steps(board , x , y);
                System.out.print(" " + board[x][y]);

            }
            System.out.println();
        }
        System.out.println("enter x and y coordinates ranging according to the size of board ");
        int l = scan.nextInt() ;
        int m  = scan.nextInt();
        System.out.println(steps(board , l , m));

    }

    public static int up( int x , int y ,int size ) {
        int count = 0 ;
        int newUpX1 = x+1 ;
        int newUpY1 = y-2 ;
        int newUpX2 = x-1 ;
        if(newUpX1 < size && newUpY1 >= 0){
            count = count + 2 ;
        }
        if(newUpX2 >= 0 && newUpY1  >= 0){
            count = count+2 ;
        }
        return count ;
    }
    public static int down( int x , int y ,int size){
        int count = 0 ;
        int newDownX1 = x+1 ;
        int newDownX2 = x-1 ;
        int newDownY1 = y+2 ;

        if(newDownX1 < size && newDownY1<size){
            count = count + 2 ;
        }
        if(newDownX2 >= 0 && newDownY1<size){
            count = count + 2 ;
        }
        return count ;
    }
    public static int right( int x , int y , int size){
        int count = 0 ;
        int newRX1 = x + 2;
        int newRY1 = y + 1;
        int newRY2 = y - 1;
        if(newRX1 < size && newRY1 < size){
            count = count + 2 ;
        }
        if(newRX1 < size && newRY2 >= 0 ){
            count = count + 2 ;
        }
        return  count ;
    }
    public static int left( int x , int y , int size){
        int count = 0 ;
        int newLX1 = x - 2 ;
        int newLY1 = y + 1 ;
        int newLY2 = y - 1 ;
        if(newLX1 >= 0 && newLY1 < size){
            count = count+2 ;
        }
        if(newLX1 >= 0 && newLY2 >= 0 ){
            count = count + 2;
        }
        return count ;
    }
    public static int steps(int[][] board , int x , int y){
        int count = 0 ;
        int countUp = up( x , y , board.length);
        int countDown = down( x , y, board.length);
        int countRight = right( x , y , board.length);
        int countLeft = left( x , y , board.length);

        count = countUp+countDown+countLeft+countRight ;
        board[x][y] = count ;
        /*
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j< board.length ; j++){
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
        */
        return count;
    }



}

