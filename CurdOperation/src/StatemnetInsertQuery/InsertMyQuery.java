package StatemnetInsertQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import JDBCUtilPreparedStatement.JDBCUtilPreparedStatement;
import in.JdbcUtil.JDBCUtil;

public class InsertMyQuery {

	
	public static void main(String args[]) throws Exception {
		Connection connection=null;
		PreparedStatement preparedStatement =null;
		ResultSet resultSet=null;
		try {
			connection=JDBCUtilPreparedStatement.getJdbcConnection();
		if(connection!=null) {
			String insertMyQuery="insert into student(name,rollnumber,result)values(?,?,?)";
			preparedStatement=connection.prepareStatement(insertMyQuery);
			if(preparedStatement!=null) {
				preparedStatement.setString(1, "Abha");
				preparedStatement.setInt(2, 124);
				preparedStatement.setString(3,"Pass");
				int rowEffected=preparedStatement.executeUpdate();
			if(rowEffected==1) {
				System.out.println("Row inserted");
			}
			else {
				System.out.println("Row not inserted");
			}
			}
		
		}
			}
		catch (Exception e ) {
			e.printStackTrace();
		}finally{
			JDBCUtilPreparedStatement.closeResouces(connection, preparedStatement,resultSet);
			
		}
	}
	
}
