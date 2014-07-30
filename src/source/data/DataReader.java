package source.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
	private BufferedReader reader = null;
	private String fileContent = "",name;

	public DataReader(String path,String name) {
		this.name = name;
		try {
			reader = new BufferedReader(new FileReader(path+"/"+name+".txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String line = "";
		try {
			while ((line = reader.readLine()) != null) {
				fileContent += line+"\n";
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getFileContent() {
		return fileContent;
	}
	
	public String getFileName(){
		return name;
	}
	
	public void close(){
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
