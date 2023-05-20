import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PracDBcon {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host = "localhost";
		String port = "3306";
		String conStr = 
				"jdbc:mysql://" +host+ ":" +port+ "/QADB";
		String usr = "root";
		String pass = ":w9ai(@h";
		String myQuery = 
				"Select * from empInf";
				
		//con
		Connection con = DriverManager.getConnection(conStr, usr, pass);
		
		//statement
		Statement s = con.createStatement();
		//result set
		ResultSet rs = s.executeQuery(myQuery);
		
		while(rs.next()) {
			System.out.println(rs.getString("empId"));
		}
		con.close();
	}

}
