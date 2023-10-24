package H_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class H_Date {
  public static void main(String[] args) {
    Date d1=new Date();
    //24/10/2023
    SimpleDateFormat s1=new SimpleDateFormat("E dd/MMM/yyyy");
    System.out.println(s1.format(d1));
  }
}
