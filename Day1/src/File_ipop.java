import java.io.*;
import java.util.Scanner;
public class File_ipop 
{
	public static void main(String[] args) throws IOException 
	{
		/*
		File myfile = new File("f:\\abc.txt");
		myfile.createNewFile();
		*/
		
		/*
		FileWriter fw = new FileWriter("f:\\abc.txt");
		fw.write("First text written\nOk now byee");
		fw.close();
		*/
		
		File myfile = new File("f:\\abc.txt");
		Scanner sc = new Scanner(myfile);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
		
	}
	

}
