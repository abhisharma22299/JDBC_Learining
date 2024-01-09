package InsertQuery;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import in.JDBCUtil.JDBCUtil;

public class InsertMySQLQuery {
	public static void main(String args []) throws SQLException {
		Scanner sc =new Scanner(System.in);
	Connection connection =null;
	Statement statement=null;
		try {
			connection=JDBCUtil.getJdbcConnection();
			if(connection!=null) {
				statement=connection.createStatement();
				
				String myinsertQuery="insert into student(name,rollnumber,result)values('Raman',2,'Pass')";
				int roweffected=statement.executeUpdate(myinsertQuery);
			if(roweffected>=1) {
				System.out.println("Row Inserted ");
			}
			else {
				System.out.println("Row Not Inserted");
			}
			}
			
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
			JDBCUtil.closeResources(connection, statement);
		}
	}
}
