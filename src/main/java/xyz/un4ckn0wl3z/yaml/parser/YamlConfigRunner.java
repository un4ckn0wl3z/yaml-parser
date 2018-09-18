package xyz.un4ckn0wl3z.yaml.parser;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.yaml.snakeyaml.Yaml;

import xyz.un4ckn0wl3z.yaml.parser.model.Configuration;

public class YamlConfigRunner {
    public static void main(String[] args) throws IOException {
//        if( args.length != 1 ) {
//            System.out.println( "Usage: <file.yml>" );
//            return;
//        }
    	
    	InputStream inputstream = new FileInputStream("sample.yml");
  
        Yaml yaml = new Yaml();  
    
        try {
        	  Configuration config = yaml.loadAs( inputstream, Configuration.class );
              System.out.println( config.toString() );
		} catch (Exception e) {
			System.out.println("Eror!");
		}
    }
}
