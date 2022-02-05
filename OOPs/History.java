
import java.util.*;
import java.io.*;

public class History {

  public static void write(String Data){

    try{
      File file = new File("History.txt");
      FileOutputStream fileWriter = new FileOutputStream(file, true);

      PrintWriter writer = new PrintWriter(fileWriter);

      writer.println(Data);
      writer.close();
    }

    catch (FileNotFoundException e){
      System.out.println("File Not Found !");
    }

  }

  private static void read() {

    System.out.println("");
    System.out.println("");
    System.out.println("-".repeat(10) + " History " + "-".repeat(10));
    System.out.println("");

    try {
      File myObj = new File("History.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    System.out.println("-".repeat(30));
    System.out.println("");
    System.out.println("");

  }

  private static void clear() throws FileNotFoundException {

    File file = new File("History.txt");
    FileOutputStream fileWriter = new FileOutputStream(file, false);

    PrintWriter writer = new PrintWriter(fileWriter);

    writer.println("");
    writer.close();

    System.out.println("");
    System.out.println("History Cleared !");
    System.out.println("");

  }

  protected static void Inteface() throws FileNotFoundException {

    Scanner var = new Scanner(System.in);

    common c = new delay();

    boolean condition = true;

    while (condition) {
      System.out.println("");
      System.out.println("\t1 - Show History");
      System.out.println("\t2 - Clear History");
      System.out.println("\t3 - Main Menu");

      System.out.println("");

      System.out.print("(History)  >>>  ");
      String ch = var.nextLine();

      System.out.println("");

      switch (ch){

        case "1":
          read();
          c.run();
          break;

        case "2":
          clear();
          break;

        case "3":
          condition = false;
          break;


        default:
          System.out.println("Invalid Choice");
          System.out.println("");

      }

    }

  }
}
