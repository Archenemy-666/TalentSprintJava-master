package stream.csv;

public class Point {
    private String name ;
    private double x ;
    private double y ;

    public Point(){}
    public Point(String name , double x , double y ){
        this.name = name ;
        this.x = x ;
        this.y = y ;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y + "\n";
    }
}


