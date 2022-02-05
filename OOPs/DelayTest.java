import java.util.*;

class Task1 extends Thread {
  public void run() {
    System.out.println("");
    System.out.println("");

    char[] animationChars = new char[] { '|', '/', '-', '\\' };

    for (int i = 0; i <= 10; i++) {
      System.out.print((animationChars[i % 4] + "   ").repeat(10) + "\r");

      try {
        Thread.sleep(200);
      }

      catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("");
    System.out.println("");

    System.exit(0);
  }
}

class Task2 extends Thread {
  public void run() {
    Scanner var = new Scanner(System.in);
    String in = var.nextLine();
    if (in.equals("")) {
      System.exit(0);
    }
  }
}

public class DelayTest {
  public static void main(String[] args) {

    Task1 t1 = new Task1();
    Task2 t2 = new Task2();

    t1.start();
    t2.start();
  }
}
