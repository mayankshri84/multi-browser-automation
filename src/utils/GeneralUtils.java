package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.google.gson.*;


public class GeneralUtils {
	
	
	public static void main(String[] args) {
		new GeneralUtils().jsonReader("./tests.json", "IE");
	}
	
	public void jsonReader(String filePath, String key){
		String json = readFile(filePath);
		JsonParser jsonParser = new JsonParser();
		JsonElement ele = jsonParser.parse(json);
		System.out.println(ele);
		System.out.println(ele.getAsJsonObject().getAsJsonArray(key));
		
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
