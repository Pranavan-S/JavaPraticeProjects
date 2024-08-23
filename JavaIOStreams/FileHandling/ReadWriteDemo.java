package FileHandling;
import java.io.*;

public class ReadWriteDemo {
	public static void main(String args[]) {
		//reading from the file.
		try {
			File myFile = new File("C:\\Users\\Pranavan_S\\Desktop\\FHdemo.txt"); //java's representation of files.
			FileReader fr = new FileReader(myFile); //character oriented input stream.
			BufferedReader br = new BufferedReader(fr); //filter wrapper that provides buffering.
			//reading from the file using readLine() method.
//			String line = null;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
			
			//reading from file using read() method.
			int letters;
			while ((letters = br.read()) != -1) {
				System.out.print((char) letters);
			}
			br.close();
			
		}catch(IOException ex){
			System.out.println("OOPS Error occured.");
		}
		
		//writing to the file.
		try {
			File myFile = new File("C:\\Users\\Pranavan_S\\Desktop\\FHdemo.txt"); //java's representation of files.
			FileWriter fw = new FileWriter(myFile);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hello for file handling.");
			bw.write("\nHow is Going?");
			bw.close();
		}catch(IOException ex) {
			System.out.println("OOPS Error occured.");
		}
	}
}

