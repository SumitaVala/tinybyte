package commonUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertyfileutil {

	public static Properties proputil ;
	public static propertyfileutil prop ;
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println(proputil.getProperty("app.domain"));
		
	}
				
	public propertyfileutil() throws FileNotFoundException, IOException {
		String propath = System.getProperty("user.dir");
		proputil = new Properties();
		proputil.load(new FileReader(new File(propath+"/src/main/resources/tinybyte.properties")));
		
			
	}
	
	
	public static propertyfileutil getinstance() throws FileNotFoundException, IOException {
		
		if (proputil == null)
		{
			 prop =new propertyfileutil();
		}
		else {
			return prop;
		}
	return prop;
	}
	
	public String getproperty(String key) {
		
		return proputil.getProperty(key);
		
		
	}
	
}
