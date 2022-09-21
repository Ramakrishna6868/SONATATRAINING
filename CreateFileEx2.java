package javaindebuggingmode;


//import java.io.FileOutputStream;

//import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.InputStreamReader;
public class CreateFileEx2 {

	  public static void main(String[] args) {

	    char[] array = new char[100];
	    try {
	      // Creates a reader using the FileReader
	      FileReader input = new FileReader("C:\\Users\\Ramakrishna.P\\Desktop\\BACKUP\\input.txt");

	      // Reads characters
	      input.read(array);
	      System.out.println("Data in the file:");
	      System.out.println(array);

	      // Closes the reader
	      input.close();
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	  }
	}
