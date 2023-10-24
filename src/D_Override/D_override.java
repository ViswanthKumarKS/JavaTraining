package D_Override;

import java.sql.SQLOutput;

public class D_override {

  public static void main(String[] args) {
    Vehicle v1=new Vehicle();
    v1.getcolor();
    v1.getwheels();
    Car c1=new Car();
    c1.getcolor();
    c1.getwheels();



    float Num=10.2f;
    //casting
    int numInt=(int) Num;
    System.out.println(numInt);
    //upcasting
    Vehicle v2=new Car();
    v2.getcolor();
    //downcasting

    Car c2=(Car) new Vehicle();
    c2.getcolor();

  }


}
