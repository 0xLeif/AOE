package source.data;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DataWriter {
	PrintWriter writer;
	
	public DataWriter(String fileName){
		try {
			writer = new PrintWriter(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public DataWriter(DataReader dr){
		try {
			writer = new PrintWriter(dr.getFileName() + ".txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		writer.print(dr.getFileContent());
	}
	
	public void writeln(String s){
		writer.println(s);
	}
	
	public void write(String s){
		writer.print(s);
	}
	
	public void close(){
		writer.close();
	}

}
