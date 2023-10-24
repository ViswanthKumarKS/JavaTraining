package G_Thread;

public class G_Thread extends Thread {

 public void run()
  {
    System.out.println("stop running");
  }

  public static void main(String[] args) {
    G_Thread g1=new G_Thread();
    g1.run();
  }

}
