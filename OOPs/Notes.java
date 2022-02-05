

import java.io.*;
import java.util.*;

public class Notes extends History{

  // -----------------------------------------------------------------------------------
  private static void Writer(String fileName, String content, boolean wOra) { // method that writes data into files
                                                                             // wOra(true) -> Appends
                                                                             // wOra(false) -> Over Writes

    try {
      File file = new File("Notes.txt"); // opening file
      FileOutputStream fileWriter = new FileOutputStream(file, wOra); // creating writer

      PrintWriter appender = new PrintWriter(fileWriter);

      appender.println(content);
      appender.close(); // closing the writer
    }

    catch (IOException e) {
      e.printStackTrace();
    } // exception statement for the above try

    System.out.println("");
    System.out.println("");
    System.out.println("-".repeat(5) + " Changes Saved " + "-".repeat(5));
    System.out.println("");
    System.out.println("");

  }

  // -----------------------------------------------------------------------------------
  private static void Reader(String fileName) throws FileNotFoundException { // method that show all data in the note

    System.out.println("");
    System.out.println("");
    System.out.println("-".repeat(10) + " Notes " + "-".repeat(10));
    System.out.println("");

    File file = new File("Notes.txt"); // opening file
    Scanner reader = new Scanner(file);

    while (reader.hasNextLine()) {
      System.out.println(reader.nextLine());
    }
    reader.close();

    System.out.println("-".repeat(30));
    System.out.println("");
    System.out.println("");


  }

  protected static void IntefaceNotes() throws FileNotFoundException {

    Scanner inputNum = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    common c = new delay();

    boolean condition = true;
    while (condition) {

      System.out.println("");
      System.out.println("");
      System.out.println("\t1 - Clear and Write");
      System.out.println("\t2 - Add Notes");
      System.out.println("\t3 - Read Notes");
      System.out.println("\t4 - Clear Notes");
      System.out.println("\t5 - Main Menu");
      System.out.println("");

      System.out.print("(Notes) >>>  ");
      String choice = inputNum.nextLine();
      System.out.println("");
      System.out.println("");

      switch (choice){

        case "1":
          System.out.print("(Clear and Write) >>>  ");
          String content1 = inputString.nextLine();

          Writer("NotesFile", content1, false);
          write("Notes Modified");
          break;


        case "2":
          System.out.print("(Add Note) >>>  ");
          String content2 = inputString.nextLine();

          Writer("NotesFile", content2, true);
          write("Notes Modified");
          break;


        case "3":
          Reader("NotesFile");
          write("Notes read !");
          c.run();
          break;


        case "4":
          Writer("NotesFile", "", false);
          write("Notes Modified");
          break;


        case "5":
          write("-".repeat(10));
          condition = false;
          break;


        default:
          System.out.println("Invalid Choice !");
        }
    }

  }

}
