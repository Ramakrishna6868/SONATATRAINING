package javaindebuggingmode;
import java.io.File;

public class FileRenameEx1 {

	public static void main(String[] args)
	{
		File file = new File("/home/mayur/Folder/GFG.java");

		File rename = new File("/home/mayur/Folder/HelloWorld.java");

		boolean flag = file.renameTo(rename);

		if (flag == true) {
			System.out.println("File Successfully Rename");
		}
		else {
			System.out.println("Operation Failed");
		}
	}
}

