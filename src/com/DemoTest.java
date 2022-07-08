package com;
import java.sql.*;
public class DemoTest {

	public static void main(String[] args) {
		
try {
Class.forName("com.mysql.jdbc.Driver");//5.x
class.forName("com.mysql.cj.jdbc.Driver");//8.x
System.out.printIn("Driver Loaded successfully");
}catch(Exception e) {
System.out.printIn(e);
}
	}

}
