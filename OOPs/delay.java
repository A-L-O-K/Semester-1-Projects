interface common {
  void run();
}

public class delay extends Thread implements common {
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

  }
}
