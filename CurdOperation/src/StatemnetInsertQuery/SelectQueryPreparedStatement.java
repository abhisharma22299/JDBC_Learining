package StatemnetInsertQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import JDBCUtilPreparedStatement.JDBCUtilPreparedStatement;

public class SelectQueryPreparedStatement {
	public static void main(String args[]) throws Exception {
		Connection connection=null;
		PreparedStatement preparedStatement =null;
		ResultSet resultSet=null;
		try {
			connection=JDBCUtilPreparedStatement.getJdbcConnection();
	        if(connection!=null) {
	        	String selectString="select * from student where id=?";
	        	preparedStatement=connection.prepareStatement(selectString);
	        if(preparedStatement!=null) {
	        	preparedStatement.setInt(1,7);
	           
	        	resultSet=preparedStatement.executeQuery();
	        
	        	if(resultSet!=null) {
	        		if(resultSet.next()) {
	        			System.out.print("ID "+"\t");
	        			System.out.print("Name"+"\t\t");
	        			System.out.print("Rollnumber "+"\t");
	        			System.out.print(" Result "+"\t");
	        			System.out.println();
	        			System.out.print(resultSet.getInt(1)+"\t");
	        			
	        			System.out.print(resultSet.getString(2)+" ");
	        			
	        			System.out.print(resultSet.getInt(3)+"\t\t ");
	        			
	        			System.out.print(resultSet.getString(4)+"\t");
	        		}
	        	}
	        	
	        }
	        }
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
