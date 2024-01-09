package StatemnetInsertQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import JDBCUtilPreparedStatement.JDBCUtilPreparedStatement;


public class UpdateQueryPreparedStatement {
	public static void main(String args[]) throws Exception {
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet result=null;
	
try {
	
	connection=JDBCUtilPreparedStatement.getJdbcConnection();
	if(connection!=null) {
		String updateQuery="update student set name=? where id=?";
		statement=connection.prepareStatement(updateQuery);
	if(statement!=null) {
		statement.setString(1, "Shaaa");
		statement.setInt(2, 2);
		int res=statement.executeUpdate();
		if(res==1) {
			System.out.println("Updated");
		}
		else {
			System.out.println("Not Updated");
		}
	}
	}
}catch(Exception e ) {
	e.printStackTrace();
}finally {
	JDBCUtilPreparedStatement.closeResouces(connection, statement, null );	
}
	}
	
}
