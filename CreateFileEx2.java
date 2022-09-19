package javaindebuggingmode;


import java.io.FileOutputStream;

import java.io.BufferedReader;

import java.io.InputStreamReader;
public class CreateFileEx2 {

	public static void main(String args[])
	{
		CreateFileEx2 gfg = new CreateFileEx2();
		gfg.newFile();
	}

	public void newFile()
	{
		String strFilePath = "", strFileName = "";

		try {

			BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
			System.out.println("Enter the file name:");

			strFileName = br.readLine();
			System.out.println("Enter the file path:");

			strFilePath = br.readLine();

			FileOutputStream fos = new FileOutputStream(
				strFilePath + "" + strFileName + ".txt");
		}

		catch (Exception ex1) {
		}
	}
}

