package commonUtilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHelper {

	/*
	 * public static void main(String[] args) throws Exception { //String filepath =
	 * System.getProperty("user.dir")+
	 * "/src/test/resources/artifacts/Activities.json"; String filepath =
	 * System.getProperty("user.dir")+"/src/test/resources/artifacts/Author.json";
	 * 
	 * 
	 * 
	 * String aaa= getFiledata_as_string(filepath); System.out.println(aaa);
	 * 
	 * 
	 * }
	 */
	
	/***
	 * 
	 * @param filepath filepath as input
	 * @return
	 * @throws Exception
	 */
	public static String getFiledata_as_string(String filepath) throws Exception {
		
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(filepath)));
		return data;
		
			
	}
	
}
