package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class GeneralUtils {
	
	public void jsonReader(String filePath, String key){
		readFile(filePath);
	}
	
	
	@SuppressWarnings("resource")
	public String readFile(String filePath){
		BufferedReader br = null;
		StringBuilder strBuilder = new StringBuilder();
		try{
			br = new BufferedReader(new FileReader(new File(filePath)));
			String myLine = null;
			while((myLine = br.readLine())!=null){
				strBuilder.append(myLine);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return strBuilder.toString();
	}

}
