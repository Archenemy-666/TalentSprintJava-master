package stream.csv;

public class Distance  {
    private  String P1 ;
    private  String P2 ;
    private double distance ;

    public Distance(){}

    public Distance(String P1 , String P2 , double distance){
        this.P1 = P1 ;
        this.P2 = P2 ;
        this.distance = distance ;

    }

    public void setP1(String p1) {
        P1 = p1;
    }
    public String getP1() {
        return P1;
    }

    public void setP2(String p2) {
        P2 = p2;
    }
    public String getP2() {
        return P2;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return this.distance;
    }

    @Override
    public String toString() {
        return "P1='" + P1 + '\'' +
                ", P2='" + P2 + '\'' +
                ", distance=" + distance +"\n";
    }
}