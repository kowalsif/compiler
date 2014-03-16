import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class lexer {

	
	
	public static void main(String[] args){
		File inFile = new File("./testfile.txt");
		File outFile = new File(".result.txt");
		Scanner in = null;
		
		try {
			in = new Scanner(inFile);
		} catch (FileNotFoundException e){
			System.out.println("File not found");
			System.exit(1);
		}
		
		
		while(in.hasNext()){
			
		}
	}
}
