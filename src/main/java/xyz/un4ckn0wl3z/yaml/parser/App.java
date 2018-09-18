package xyz.un4ckn0wl3z.yaml.parser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
    	Yaml yaml = new Yaml();
    	InputStream inputstream = new FileInputStream("customer.yaml");
    	Map<String, Object> obj = yaml.load(inputstream);
    	System.out.println(obj);
    }
    
    
}
