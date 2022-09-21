package javaindebuggingmode;
import java.io.FileWriter;

class Fileex11 {
  public static void main(String args[]) {

    String data = "This is the data in the output file";
    try {
      // Creates a Writer using FileWriter
      FileWriter output = new FileWriter("C:\\Users\\Ramakrishna.P\\Desktop\\BACKUP\\input.txt");

      // Writes string to the file
      output.write(data);
      System.out.println("Data is written to the file.");

      // Closes the writer
      output.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
 }
}