import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;


public class lexer {

	
	
	public static void main(String[] args){
		File inFile = new File("./testFile.txt");
		//File outFile = new File(".result.txt");
		Scanner in = null;
		
		try {
			in = new Scanner(inFile);
		} catch (FileNotFoundException e){
			System.out.println("File not found");
			System.exit(1);
		}
		
		
		//while(in.hasNext()){
		in.useDelimiter("\0");
		//System.out.println(in.next());
		base_lexer(in.next());
		//}
	}

	private static void base_lexer(String next) {
		// TODO Auto-generated method stub
		int state = 0;	
		int nextState = -1;
		int i = 0;
		String accu = "";
		while (i < next.length()){
			char val = next.charAt(i);
						
			if(val >= '0' && val <= '9'){
				nextState = 1;
				accu += val;
			} else if(val == '+'){
				nextState = 2;
			} else if(val == '-'){
				nextState = 3;
			} else if(val == ' '){
				nextState = 4;
			} else if(val == '\n'){
				nextState = 5;
			}
			switch (state) {
				case 0: 
					break;
				case 1:
					if (state != nextState){
						System.out.println(accu);
						accu = "";
					}
					break;
				case 2:
					System.out.println("plus");
					break;
				case 3:
					System.out.println("minus");
					break;
				case 4:
					System.out.println("space");
					break;
				case 5:
					System.out.println("newline");
					break;
				default: break;
			}
			state = nextState;
			i++;
		}
		System.out.println(accu);
		
	}
}
