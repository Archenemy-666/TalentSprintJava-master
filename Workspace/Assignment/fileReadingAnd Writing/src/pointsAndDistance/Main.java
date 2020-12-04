package pointsAndDistance ;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.*;

public class  Main {
    public static  void main(String [] args) throws IOException {
        FileReader input = new FileReader("D:\\\\TalentSprintJava-master\\\\Workspace\\\\talentSprinEclipse\\\\csvfiles\\\\points.csv");
        BufferedReader read = new BufferedReader(input);

        String line = read.readLine();
        line = read.readLine();

        List<Point> DataSet1 = new LinkedList<>();


        // reading the csv line and adding to elements to Linked list
        while(line != null){
            line = line.concat("\n");
            Point p = createPoint(line);
            DataSet1.add(p);
            line = read.readLine();
        }
        input.close();
        read.close();
        // creating a csv file of the linked List
        writePointCSV(DataSet1);

        // adding distances to dataset2
        List<Distance> DataSet2 = distance(DataSet1) ;

        //sorting dataset2
        Collections.sort(DataSet2, new DistanceSort());
        //writing dataset2 into a csv file
        writeDistanceCSV(DataSet2);

        // printing values of dataset2 for verification
        for(Distance d : DataSet2){
            System.out.println(d);
        }


    }
    public static Point createPoint(String line){
        Point p = new Point();
        String[] data = line.split(",");
        p.setName(data[0]);
        p.setX(Double.parseDouble(data[1]));
        p.setY(Double.parseDouble(data[2]));

        return p ;
    }
    public static void writePointCSV(List<Point> DataSet1 )throws IOException{
        FileWriter writer = new FileWriter("DataSet1.csv");
        for(Point p : DataSet1){
            writer.write(p.toString());
        }
        writer.close();


    }
    public static List<Distance> distance (List<Point> Dataset1){
        List<Distance> DataSet2 = new LinkedList();
        for(Point p1 :  Dataset1){
            for(Point p2 : Dataset1){
                Distance dis = new Distance();
                double x1 = p1.getX() ;
                double x2 = p2.getX();
                double y1 = p1.getY();
                double y2 = p2.getY();

                double x = Math.pow((x2 - x1),2);
                double y = Math.pow((y2 - y1),2);

                double distance = Math.sqrt((x+y)) ;


                dis.setP1(p1.getName());
                dis.setP2(p2.getName());
                dis.setDistance(distance);

                DataSet2.add(dis);


            }
        }

        return DataSet2;
    }

    public static void writeDistanceCSV(List<Distance> DataSet2 )throws IOException{
        FileWriter writer = new FileWriter("DataSet2.csv");
        for(Distance d : DataSet2){
            writer.write(d.toString());
        }
        writer.close();


    }

}