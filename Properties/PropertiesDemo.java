import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class PropertiesDemo {
	public static void main(String args[]) throws IOException{
	Properties pp = new Properties();
	FileInputStream fis = new FileInputStream("abc.properties");
	pp.load(fis);
	System.out.println(pp);
	String name = pp.getProperty("name");
	String job = pp.getProperty("designation");
	System.out.println("Name is : "+name+"     Position is : "+job);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your Name");
	String s1 = br.readLine();
	System.out.println("Enter Your Position");
	String s2 = br.readLine();
	pp.setProperty("name","s1");
	pp.setProperty("designation","s2");
	FileOutputStream fos = new FileOutputStream("abc.properties");
	pp.store(fos,"I am in Java Technocart. ");
		}
	}