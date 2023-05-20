import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.PreparedStatement;

public class DBconnect {
	public static void main(String[] args) throws SQLException {
		
		String host = "localhost";
		String port = "3306";
		String user = "root";
		String pass = ":w9ai(@h";
		String conStr = 
				"jdbc:mysql://" +host+ ":" +port+ "/QADB";
		String selStr = 
				"select * from empInf;";
		Connection con =
		DriverManager.getConnection(conStr, user,pass);
		
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery(selStr);
		
		rs.next();
		System.out.println(rs.getString("empName"));
		System.out.println(rs.getString("empPos"));
		System.out.println(rs.getString("empJnDt"));
		
	}
}
