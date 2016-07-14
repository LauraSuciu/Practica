package task_manager;

import java.sql.Connection;
import java.sql.DriverManager;



public class ConnectionMySQL {
	public static void main(String [] arg){
		//Connection conn = null;
		try{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/task_manager","root","");
			System.out.println("Connection success!");
		}
		catch(Exception e){
			System.err.println(e);
		}
	}
}
