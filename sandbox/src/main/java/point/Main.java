package point;

public class Main {

  public static void main(String[] args){
    Point a = new Point(0, 0);
    Point b = new Point(-3,-4);

    System.out.println("Distance is " + Point.distance(a, b) );

  }
}
