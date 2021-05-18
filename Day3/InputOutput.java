package Am;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//sao chep nd 1 tep sang tep khac
//C:\Users\PC\Desktop
public class InputOutput {
	public static void main(String[] args) throws IOException {
		FileReader inFileReader=null;
		FileWriter outFileWriter=null;
		//copy nd 1 file sang file khac
		try {
			inFileReader =new FileReader("C:\\Users\\PC\\Desktop\\story.txt");
			outFileWriter=new FileWriter("C:\\Users\\PC\\Desktop\\story_1.txt");
						
		         int c;
		         while ((c = inFileReader.read()) != -1) {
		            outFileWriter.write(c);
		         }
		}
			finally {
				if (inFileReader!=null)
					inFileReader.close();
				if (outFileWriter!=null) {
					outFileWriter.close();
				}
			}
			
		}
	}

