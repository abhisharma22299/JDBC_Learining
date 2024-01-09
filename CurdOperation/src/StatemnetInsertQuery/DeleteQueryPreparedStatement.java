package StatemnetInsertQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import JDBCUtilPreparedStatement.JDBCUtilPreparedStatement;

public class DeleteQueryPreparedStatement {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet result=null;
	
try {
	
	connection=JDBCUtilPreparedStatement.getJdbcConnection();
	if(connection!=null) {
		String updateQuery="delete from student  where id=?";
		statement=connection.prepareStatement(updateQuery);
	if(statement!=null) {

		statement.setInt(1, 1);
		int res=statement.executeUpdate();
		if(res==1) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Not Deleted");
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
