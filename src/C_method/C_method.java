package C_method;

public class C_method {
  void method() {
    System.out.println("Hi this is addition");
  }

  void method(String msg)
  {
    System.out.println(msg);
  }


  public static void main(String[] args) {
    C_method o1=new C_method();
    o1.method();

    C_method O1=new C_method();
    o1.method("viswanth");
  }

}
