package in.JdbcUtil;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
public static Connection getJdbcConnection() throws Exception {
	FileInputStream FIS=new FileInputStream("Application.properties");
	Properties p=new Properties();
	p.load(FIS);
	//
	String url=p.getProperty("url");
	String user=p.getProperty("user");
	String password=p.getProperty("password");
	
	Connection connection=DriverManager.getConnection(url,user,password);	
	
	return connection;
}
public static void closeResouces(Connection connection,Statement statement)throws Exception{
	if(connection!=null) {
		connection.close();
	}
	if(statement!=null) {
		statement.close();
	}
}
}
