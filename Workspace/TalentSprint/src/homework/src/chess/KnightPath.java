package chess;
import java.util.*;
public class KnightPath{
    public static void main(String[] args){
        int[][] board = new int[8][8] ;
        int x = 3 ;
        int y = 3 ;
        System.out.println(up(board , x , y));
        System.out.println(down(board , x , y));

    }

    public static int up(int[][] board , int x , int y) {
        int count = 0 ;
        int newUpX1 = x+1 ;
        int newUpY1 = y-2 ;
        int newUpX2 = x-1 ;
        if(newUpX1 < 8 && newUpY1 >= 0){
            count = count + 2 ;
        }
        if(newUpX2 >= 0 && newUpY1  >= 0){
            count = count+2 ;
        }
        return count ;
    }
    public static int down(int[][] board , int x , int y ){
        int count = 0 ;
        int newDownX1 = x+1 ;
        int newDownX2 = x-1 ;
        int newDownY1 = y+2 ;

        if(newDownX1 < 8 && newDownY1<8){
            count = count + 2 ;
        }
        if(newDownX2 >= 0 && newDownY1<8){
            count = count + 2 ;
        }
        return count ;
    }
    public static int right(int[][] board , int x , int y){
        int count = 0 ;
        int newRX1 = x + 2;
        int newRY1 = y + 1;
        int newRY2 = y - 2;
        if(newRX1 < 8 && newRX1 < 8){
            count = count + 2 ;
        }
        if(newRX1 < 8 && newRY2 >= 0 ){
            count = count + 2 ;
        }
        return  count ;
    }
    public static int left(int[][] board , int x , int y){
        int count = 0 ;
        int newLX1 = x - 2 ;
        int newLY1 = y + 1 ;
        int newLY2 = y - 1 ;
        if(newLX1 >= 0 && newLY1 < 8){
            count = count+2 ;
        }
        if(newLX1 >= 0 && newLY2 >= 0 ){
            count = count + 2;
        }
        return count ;
    }
    public static int[][] 



}

