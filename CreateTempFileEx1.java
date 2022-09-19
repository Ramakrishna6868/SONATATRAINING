package javaindebuggingmode;
import java.io.File;
import java.io.IOException;

public class CreateTempFileEx1 {


	public static void main(String[] args)
		throws IOException
	{
		String prefix = "exampleFile";

		String suffix = ".txt";

		File directoryPath = new File(
			"C:\\Users\\Ramakrishna.P\\Desktop\\BACKUP/");

		File tempFile = File.createTempFile(prefix, suffix,
											directoryPath);

		tempFile.delete();
	}
}

