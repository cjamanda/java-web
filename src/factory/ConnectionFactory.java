package factory;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/mydb?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "amanda";
	private static final String PASSWORD = "amanda";

	    public static Connection obtemConexao() {
	        try {
	            Class.forName(DRIVER);
	            return DriverManager.getConnection(URL,USER,PASSWORD);
	
	        }catch(Exception e) {
	        	System.out.println(e);
	        	return null;
	        }
	    }
}        



