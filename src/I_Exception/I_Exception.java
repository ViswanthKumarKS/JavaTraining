package I_Exception;

public class I_Exception {
  public static void main(String[] args) {
    try {
      int a=12/0;

    }
    catch (Exception e)
    {
      if(e instanceof ArithmeticException)
      {
        System.out.println("error");
      }
      else
      {
        System.out.println(e);
      }
    }
  }
}
