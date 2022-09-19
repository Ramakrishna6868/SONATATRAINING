package javaindebuggingmode;

import java.nio.file.*;
import java.io.IOException;


public class FileRenameEx2 {

	public static void main(String[] args)
		throws IOException
	{

		Path oldFile
			= Paths.get("C:/Users/Ramakrishna.P/Desktop/BACKUP/x.java");

		try {
			Files.move(oldFile, oldFile.resolveSibling(
									"HelloWorld.java"));
			System.out.println("File Successfully Rename");
		}
		catch (IOException e) {
			System.out.println("operation failed");
		}
	}
}

