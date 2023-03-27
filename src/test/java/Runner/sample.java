package Runner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class sample {
public static void main(String[] args) throws IOException {
	String path=".\\src\\test\\resources\\propertyfile\\Config.properties";
	
	FileReader file=new FileReader(path);
	Properties pro=new Properties();
	pro.load(file);
	
	String property = pro.getProperty("UserName");
	System.out.println(property);
	
}
}
